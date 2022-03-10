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
public class Region {
    private int region_id;
    private String region_name;

    public Region(int region_id, String region_name) {
        this.region_id = region_id;
        this.region_name = region_name;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.region_id;
        hash = 73 * hash + Objects.hashCode(this.region_name);
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
        final Region other = (Region) obj;
        if (this.region_id != other.region_id) {
            return false;
        }
        if (!Objects.equals(this.region_name, other.region_name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Region{" + "region_id=" + region_id + ", region_name=" + region_name + '}';
    }
    
    
}
