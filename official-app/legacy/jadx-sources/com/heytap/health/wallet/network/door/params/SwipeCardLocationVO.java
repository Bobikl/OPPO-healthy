package com.heytap.health.wallet.network.door.params;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class SwipeCardLocationVO implements Serializable {

    @Tag(1)
    private String location;

    @Tag(4)
    private String locationId;

    @Tag(3)
    private Integer nearInfo;

    @Tag(2)
    private String tags;

    public SwipeCardLocationVO copy(SwipeCardLocationVO swipeCardLocationVO) {
        if (swipeCardLocationVO == null) {
            return null;
        }
        this.location = swipeCardLocationVO.location;
        this.tags = swipeCardLocationVO.tags;
        this.nearInfo = swipeCardLocationVO.nearInfo;
        this.locationId = swipeCardLocationVO.locationId;
        return this;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLocationId() {
        return this.locationId;
    }

    public Integer getNearInfo() {
        return this.nearInfo;
    }

    public String getTags() {
        return this.tags;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLocationId(String str) {
        this.locationId = str;
    }

    public void setNearInfo(Integer num) {
        this.nearInfo = num;
    }

    public void setTags(String str) {
        this.tags = str;
    }

    public String toString() {
        return "SwipeCardLocationVO{location='" + this.location + "', tags='" + this.tags + "', nearInfo='" + this.nearInfo + "', locationId='" + this.locationId + '}';
    }
}
