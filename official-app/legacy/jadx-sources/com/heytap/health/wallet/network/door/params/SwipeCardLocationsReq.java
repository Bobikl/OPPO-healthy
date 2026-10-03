package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SwipeCardLocationsReq {

    @Tag(2)
    private String appCode;

    @Tag(1)
    private String cplc;

    @Tag(3)
    private List<SwipeCardLocationVO> swipeCardLocations;

    public String getAppCode() {
        return this.appCode;
    }

    public String getCplc() {
        return this.cplc;
    }

    public List<SwipeCardLocationVO> getSwipeCardLocations() {
        return this.swipeCardLocations;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public void setSwipeCardLocations(List<SwipeCardLocationVO> list) {
        this.swipeCardLocations = list;
    }
}
