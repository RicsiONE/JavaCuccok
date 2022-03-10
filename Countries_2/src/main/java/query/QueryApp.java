/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ricsi
 */
public class QueryApp {
    public static List<Region> regionsList = new ArrayList();
    public static List<Country> countryList = new ArrayList();
    
    public static void main(String[] args) throws SQLException{
        RegionDao regionDao = new RegionDao();
        CountryDao countryDao = new CountryDao();
        
        try {
            regionsList = regionDao.getRegions();
            countryList = countryDao.getCountry();
        } catch (SQLException ex) {
            Logger.getLogger(QueryApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(regionsList);
        System.out.println(countryList);
        
        
    }
}
