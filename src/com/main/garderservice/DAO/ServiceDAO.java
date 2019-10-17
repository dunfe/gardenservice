package com.main.garderservice.DAO;

import com.main.garderservice.Model.Home;
import com.main.garderservice.Model.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAO extends DBContext implements IService {

    public ServiceDAO() throws Exception {
    }

    public ArrayList<Service> getAll(){
        ArrayList<Service> serviceArrayList = new ArrayList<>();
        try {
            String sql = "select a.id,a.name,a.short_detail,a.full_detail,a.date, b.link " +
                    "from service a, gallery b " +
                    "where a.image_id = b.service_id ";
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                Service service = new Service();
                service.setId(rs.getInt("id"));
                service.setName(rs.getString("name"));
                service.setShortDetail(rs.getString("short_detail"));
                service.setFullDetail(rs.getString("full_detail"));
                service.setImage(getImgResource()+ rs.getString("link"));
                service.setDate(rs.getDate("date"));
                serviceArrayList.add(service);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return serviceArrayList;
    }

    @Override
    public List<Service> findService(int currentPage, int recordsPerPage) {
        List<Service> services = new ArrayList<>();

        int start = currentPage * recordsPerPage - recordsPerPage;

        try {
            String sql = "select a.id,a.name,a.short_detail,a.full_detail,a.date, b.link from service a, gallery b where a.image_id = b.service_id limit ?, ?";
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, currentPage);
            ps.setInt(2, 1);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Service service = new Service();
                service.setName(rs.getString("name"));
                service.setShortDetail(rs.getString("short_detail"));
                service.setFullDetail(rs.getString("full_detail"));
                service.setImage(getImgResource() + rs.getString("link"));
                service.setDate(rs.getDate("date"));
                services.add(service);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return services;
    }

    @Override
    public int getNumberOfRows() {
        int numOfRows = 0;

        try {
            String sql = "SELECT COUNT(Id) FROM Service";

            PreparedStatement ps = getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                numOfRows = rs.getInt("count(id)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return numOfRows;
    }
}
