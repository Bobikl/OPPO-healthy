package com.heytap.health.watchface.business.legacy.main.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WatchFaceFindResponse {

    @SerializedName("dialDetailList")
    private List<WatchFaceGroupBean> mDialDetailList;

    @SerializedName("totalNum")
    private int mTotalNum;

    public List<WatchFaceGroupBean> getDialDetailList() {
        return this.mDialDetailList;
    }

    public int getTotalNum() {
        return this.mTotalNum;
    }

    public void setDialDetailList(List<WatchFaceGroupBean> list) {
        this.mDialDetailList = list;
    }

    public void setTotalNum(int i) {
        this.mTotalNum = i;
    }
}
