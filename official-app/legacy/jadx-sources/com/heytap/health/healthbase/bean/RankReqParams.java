package com.heytap.health.healthbase.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class RankReqParams {

    @SerializedName("modifyTime")
    long mModifyTime;

    @SerializedName("region")
    String mRegion;

    @SerializedName("ssoid")
    String mSsoid;

    @SerializedName("totalSteps")
    int mTotalSteps;

    public RankReqParams(String str, String str2, int i, long j2) {
        this.mSsoid = str;
        this.mRegion = str2;
        this.mTotalSteps = i;
        this.mModifyTime = j2;
    }
}
