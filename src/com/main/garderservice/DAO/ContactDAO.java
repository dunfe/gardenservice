package com.main.garderservice.DAO;

import com.main.garderservice.Model.Contact;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContactDAO extends DBContext {

    public boolean addMessage(String name, String email, String message){
        boolean addSuccess = false;
        try {
            String sql = "INSERT INTO message(name, mail, message) values(?,?,?)";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, message);
            ps.executeUpdate();
            addSuccess = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addSuccess;
    }
    public Contact getContact(){
        Contact contact = new Contact();
        try {
            String sql = "select * from contact where id = 1";
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                contact.setAddress(rs.getString("address"));
                contact.setCity(rs.getString("city"));
                contact.setCountry(rs.getString("country"));
                contact.setPhone(rs.getString("phone"));
                contact.setEmail(rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contact;
    }

    public ContactDAO() throws Exception {
    }
}
