/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package query;

import java.util.Objects;

/**
 *
 * @author ricsi
 */
public class Country {
    private int country_id;
    private String country_name;
    private int regio;

    public Country(int country_id, String country_name, int regio) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.regio = regio;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public int getRegio() {
        return regio;
    }

    public void setRegio(int regio) {
        this.regio = regio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.country_id;
        hash = 17 * hash + Objects.hashCode(this.country_name);
        hash = 17 * hash + this.regio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        if (this.country_id != other.country_id) {
            return false;
        }
        if (this.regio != other.regio) {
            return false;
        }
        if (!Objects.equals(this.country_name, other.country_name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Country{" + "country_id=" + country_id + ", country_name=" + country_name + ", regio=" + regio + '}';
    }

    
}
