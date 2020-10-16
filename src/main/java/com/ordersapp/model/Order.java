package com.ordersapp.model;

public class Order {
    private Short id;
    private String comment;
    private String confirmed;
    private String client_name;
    private Integer order_number;
    private String date_of_order;
    private String shipment_date;
    private String shipped_date;
    private Short SHPPk_100;
    private Short SHPPk_100_white;
    private Short SHPPk_100_green;

    public Order(Short id, String comment, String confirmed, String client_name, Integer order_number, String date_of_order, String shipment_date, String shipped_date, Short SHPPk_100, Short SHPPk_100_white, Short SHPPk_100_green) {
        this.id = id;
        this.comment = comment;
        this.confirmed = confirmed;
        this.client_name = client_name;
        this.order_number = order_number;
        this.date_of_order = date_of_order;
        this.shipment_date = shipment_date;
        this.shipped_date = shipped_date;
        this.SHPPk_100 = SHPPk_100;
        this.SHPPk_100_white = SHPPk_100_white;
        this.SHPPk_100_green = SHPPk_100_green;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public Integer getOrder_number() {
        return order_number;
    }

    public void setOrder_number(Integer order_number) {
        this.order_number = order_number;
    }

    public String getDate_of_order() {
        return date_of_order;
    }

    public void setDate_of_order(String date_of_order) {
        this.date_of_order = date_of_order;
    }

    public String getShipment_date() {
        return shipment_date;
    }

    public void setShipment_date(String shipment_date) {
        this.shipment_date = shipment_date;
    }

    public String getShipped_date() {
        return shipped_date;
    }

    public void setShipped_date(String shipped_date) {
        this.shipped_date = shipped_date;
    }

    public Short getSHPPk_100() {
        return SHPPk_100;
    }

    public void setSHPPk_100(Short SHPPk_100) {
        this.SHPPk_100 = SHPPk_100;
    }

    public Short getSHPPk_100_white() {
        return SHPPk_100_white;
    }

    public void setSHPPk_100_white(Short SHPPk_100_white) {
        this.SHPPk_100_white = SHPPk_100_white;
    }

    public Short getSHPPk_100_green() {
        return SHPPk_100_green;
    }

    public void setSHPPk_100_green(Short SHPPk_100_green) {
        this.SHPPk_100_green = SHPPk_100_green;
    }
}
