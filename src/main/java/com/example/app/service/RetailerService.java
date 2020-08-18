package com.example.app.service;


import com.example.app.models.Retailers;
import com.example.app.repository.RetailersRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RetailerService  {
    @Autowired
    RetailersRepositary retailersRepositary;
    public List<Retailers> getAllRetailers(){
        return   retailersRepositary.findAll();
    }

    public Retailers getRetaileresById(int id){
        return retailersRepositary.findById(id).orElseThrow();
    }
    public void removeRetailersById(int id){
        retailersRepositary.deleteById(id);
    }
    public  void addRetailers(Retailers retailers){
        retailersRepositary.save(retailers);
    }
    public void updateRetailer(Retailers retailers, int id){
        retailersRepositary.save(retailers);
    }


}

