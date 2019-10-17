package com.main.garderservice.DAO;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    private InitialContext initialContext;
    private Context context;
    private String dbName;
    private String serverName;
    private String port;
    private String username;
    private String password;
    private String imgFolder;

    public DBContext() throws Exception {
        initialContext = new InitialContext();
        context = (Context) initialContext.lookup("java:/comp/env");
        serverName = (String) context.lookup("serverName");
        port = (String) context.lookup("port");
        dbName = (String) context.lookup("dbName");
        username = (String) context.lookup("username");
        imgFolder = (String) context.lookup("imgFolder");
        password = (String) context.lookup("password");
    }

    public Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://" + serverName + ":" + port
                +"/"+ dbName, username, password);
    }

    public String getImgResource() throws Exception {
        return imgFolder;
    }
}
