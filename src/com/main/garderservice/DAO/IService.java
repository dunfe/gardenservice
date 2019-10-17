package com.main.garderservice.DAO;

import com.main.garderservice.Model.Home;
import com.main.garderservice.Model.Service;

import java.util.List;

public interface IService {

    public List<Service> findService(int currentPage, int recordsPerPage);
    public int getNumberOfRows();

}
