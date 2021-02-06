package com.test.entity;

public class ProductDescript {
    private long id;
    private long product_info_id;
    private String descript;
    private long store_info_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduct_info_id() {
        return product_info_id;
    }

    public void setProduct_info_id(long product_info_id) {
        this.product_info_id = product_info_id;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public long getStore_info_id() {
        return store_info_id;
    }

    public void setStore_info_id(long store_info_id) {
        this.store_info_id = store_info_id;
    }
}
