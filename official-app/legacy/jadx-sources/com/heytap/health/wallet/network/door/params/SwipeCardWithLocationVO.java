package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import io.protostuff.Tag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SwipeCardWithLocationVO {

    @Tag(2)
    private String aid;

    @Tag(1)
    private String appCode;

    @Tag(3)
    private ArrayList<SwipeCardLocationVO> swipeCardLocations = new ArrayList<>();

    public String getAid() {
        return this.aid;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public ArrayList<SwipeCardLocationVO> getSwipeCardLocations() {
        return this.swipeCardLocations;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setSwipeCardLocations(ArrayList<SwipeCardLocationVO> arrayList) {
        this.swipeCardLocations = arrayList;
    }
}
