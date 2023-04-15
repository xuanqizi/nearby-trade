package com.zxchen.nearby.order.domain.dto;

import com.zxchen.nearby.order.domain.body.OrderCreateBody;
import com.zxchen.nearby.order.enums.OrderType;

import java.util.Date;

/**
 * 用于建立订单的DTO
 */
public class OrderCreateDto {

    // 用户UID
    private Long uid;

    // 商品ID
    private Long cid;

    // 交易时间
    private Date tradeTime;

    // 交易地点-纬度
    private Double latitude;

    // 交易地点-经度
    private Double longitude;

    // 交易地点-名称
    private String location;

    // 交易地点-地址
    private String address;

    // 交易类型
    private OrderType type;

    // 成交价格
    private String price;

    // 交换物描述
    private String description;

    // 交换物图片
    private String image;

    public OrderCreateDto(OrderCreateBody body, Long uid) {
        this.uid = uid;
        this.cid = body.getCid();
        this.tradeTime = body.getTradeTime();
        this.latitude = body.getLatitude();
        this.longitude = body.getLongitude();
        this.location = body.getLocation();
        this.address = body.getAddress();
        this.type = body.getType();
        this.price = body.getPrice();
        this.description = body.getDescription();
        this.image = body.getImage();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
