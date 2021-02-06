package com.test.entity;

public class Region {
    private int id;
    private String region_code;
    private String region_name;
    private int level;
    private String parent_region_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getParent_region_code() {
        return parent_region_code;
    }

    public void setParent_region_code(String parent_region_code) {
        this.parent_region_code = parent_region_code;
    }
}
