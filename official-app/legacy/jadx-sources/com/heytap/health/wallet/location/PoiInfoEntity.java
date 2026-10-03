package com.heytap.health.wallet.location;

import androidx.annotation.Keep;
import com.amap.api.services.core.PoiItem;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PoiInfoEntity implements Serializable {
    private static final long serialVersionUID = 4457302322655943281L;
    public String address;
    public String area;
    public String city;
    public LatLngEntity location;
    public String name;
    public String postCode;
    public String province;
    public String street_id;

    public static PoiInfoEntity clonePoiInfo(PoiItem poiItem) {
        PoiInfoEntity poiInfoEntity = new PoiInfoEntity();
        poiInfoEntity.name = poiItem.getCityName();
        poiInfoEntity.address = poiItem.getAdName();
        poiInfoEntity.province = poiItem.getProvinceName();
        poiInfoEntity.city = poiItem.getCityName();
        poiInfoEntity.area = poiItem.getBusinessArea();
        poiInfoEntity.street_id = poiItem.getPoiId();
        poiInfoEntity.postCode = poiItem.getPostcode();
        if (poiItem.getLatLonPoint() != null) {
            poiInfoEntity.location = new LatLngEntity(poiItem.getLatLonPoint().getLatitude(), poiItem.getLatLonPoint().getLongitude());
        }
        return poiInfoEntity;
    }

    public String getAddress() {
        return this.address;
    }

    public String getArea() {
        return this.area;
    }

    public String getCity() {
        return this.city;
    }

    public LatLngEntity getLocation() {
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getProvince() {
        return this.province;
    }

    public String getStreet_id() {
        return this.street_id;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setArea(String str) {
        this.area = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setLocation(LatLngEntity latLngEntity) {
        this.location = latLngEntity;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPostCode(String str) {
        this.postCode = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setStreet_id(String str) {
        this.street_id = str;
    }

    public String toString() {
        return "PoiInfoEntity{name='" + this.name + "', address='" + this.address + "', province='" + this.province + "', city='" + this.city + "', area='" + this.area + "', street_id='" + this.street_id + "', postCode='" + this.postCode + "', location=" + this.location + '}';
    }
}
