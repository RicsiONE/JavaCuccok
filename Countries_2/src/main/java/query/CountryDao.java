package query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryDao extends AbstractDao {

    private static final String COUNTRY_QUERY = "SELECT country_id, country_name, region_id FROM countries";

    public List<Country> getCountry() throws SQLException {
        List<Country> countries = new ArrayList();
        this.connect();//kapcsolodas az adatbazishoz
        ResultSet rs = getResult(COUNTRY_QUERY); //adatbazisbolt lekerem a lekerdezesem eredmenyet
        //feldolgozom az eredmenyt, vegigmegyek rajta soronkent
        while (rs.next()) {
            int country_id = rs.getInt("country_id");//adott sor id ertekenek lekerese
            String country_name = rs.getString("country_name"); //adott sor name ertekenek lekerese
            int region_id = rs.getInt("region_id"); //adott sor teacher_id ertekenek lekerese

            Country ct = new Country(country_id, country_name, region_id); //uj entitas letrehozasa

            countries.add(ct);//hozzaadas a listahoz amivel visszaterunk
        }

        this.close();//adatbaziskapcsolat bezarasa

        return countries;
    }

    public void addCountry(int country_id, String country_name, int region_id) throws SQLException {
        // String sql = "INSERT INTO subjects(name, teacher_id) VALUES (\"" + name + "\", " + teacherId + " )";
        String sql = String.format("INSERT INTO countries(country_id, country_name, region_id) VALUES (%s, \"%s\", %s )", country_id, country_name, region_id);
        System.out.println("sql: " + sql);
        this.connect();
        this.execute(sql);
        this.close();
    }

    public void updateCountry(int country_id, String country_name) throws SQLException{
        //UPDATE teachers SET birth_date = 1981 WHERE id = 1
        String sql = String.format("UPDATE countries SET country_name = \"%s\" WHERE country_id = %s ", country_name, country_id);
        System.out.println("sql: " + sql);
        this.connect();
        this.execute(sql);
        this.close();
    }
   
    public void deleteCountry(int country_id) throws SQLException{
        //DELETE FROM teachers WHERE id = 4;
        String sql = String.format("DELETE FROM countries WHERE id = %s ", country_id);
        System.out.println("sql: " + sql);
        this.connect();
        this.execute(sql);
        this.close();
    }

}
