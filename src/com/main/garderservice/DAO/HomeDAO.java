package com.main.garderservice.DAO;

import com.main.garderservice.Model.Home;
import com.main.garderservice.Model.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class HomeDAO extends DBContext {

    public Home getData(){
        Home home = new Home();
        try {
            String sql = "select * from home";
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                home.setName(rs.getString("name"));
                home.setDescription(rs.getString("description"));
                home.setAbout(rs.getString("about"));
                home.setSignature(rs.getString("signature"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return home;

    }

    public HomeDAO() throws Exception {
    }
}
