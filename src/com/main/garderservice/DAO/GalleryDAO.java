package com.main.garderservice.DAO;

import com.main.garderservice.Model.Gallery;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GalleryDAO extends DBContext {
    public GalleryDAO() throws Exception {
    }

    public ArrayList<Gallery> getAll(){
        ArrayList<Gallery> galleries = new ArrayList<>();
        try {
            String sql = "SELECT id,link FROM gallery";
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                Gallery gallery = new Gallery();
                gallery.setId(rs.getInt("id"));
                gallery.setLink(getImgResource() + rs.getString("link"));
                galleries.add(gallery);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return galleries;
    }
}
