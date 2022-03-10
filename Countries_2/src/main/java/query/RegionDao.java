package query;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegionDao  extends AbstractDao {
 
    private static final String REGION_QUERY = "SELECT region_id, region_name FROM regions";

    public List<Region> getRegions() throws SQLException {
        List<Region> regionsList = new ArrayList();
        this.connect();//kapcsolodas az adatbazishoz
        ResultSet rs = getResult(REGION_QUERY); //adatbazisbolt lekerem a lekerdezesem eredmenyet
        //feldolgozom az eredmenyt, vegigmegyek rajta soronkent
        while (rs.next()) {
            int region_id = rs.getInt("region_id");//adott sor id ertekenek lekerese
            String region_name = rs.getString("region_name"); //adott sor name ertekenek lekerese
            
            Region rg = new Region(region_id, region_name); //uj entitas letrehozasa

            regionsList.add(rg);//hozzaadas a listahoz amivel visszaterunk
        }

        this.close();//adatbaziskapcsolat bezarasa

        return regionsList;
    }
    public void addRegion(int region_id, String region_name) throws SQLException {
        // String sql = "INSERT INTO subjects(name, teacher_id) VALUES (\"" + name + "\", " + teacherId + " )";
        String sql = String.format("INSERT INTO regions(region_id, region_name) VALUES (%s, \"%s\")", region_id, region_name);
        System.out.println("sql: " + sql);
        this.connect();
        this.execute(sql);
        this.close();
    }
    public void updateRegion(int region_id, String region_name) throws SQLException{
        //UPDATE teachers SET birth_date = 1981 WHERE id = 1
        String sql = String.format("UPDATE regions SET region_name = \"%s\" WHERE region_id = %s ", region_name, region_id);
        System.out.println("sql: " + sql);
        this.connect();
        this.execute(sql);
        this.close();
    }
    
    public void deleteRegion(int region_id) throws SQLException{
        //DELETE FROM teachers WHERE id = 4;
        String sql = String.format("DELETE FROM regions WHERE id = %s ", region_id);
        System.out.println("sql: " + sql);
        this.connect();
        this.execute(sql);
        this.close();
    }
}
