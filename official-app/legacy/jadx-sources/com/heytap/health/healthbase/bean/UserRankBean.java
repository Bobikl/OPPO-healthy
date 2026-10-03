package com.heytap.health.healthbase.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class UserRankBean {

    @SerializedName("listResult")
    private boolean mListResult;
    private int mRankStep;

    @SerializedName("rank")
    private int mUserRank;

    public UserRankBean(boolean z, int i) {
        this.mListResult = z;
        this.mUserRank = i;
    }

    public int getRankStep() {
        return this.mRankStep;
    }

    public int getUserRank() {
        return this.mUserRank;
    }

    public boolean isListResult() {
        return this.mListResult;
    }

    public void setListResult(boolean z) {
        this.mListResult = z;
    }

    public void setRankStep(int i) {
        this.mRankStep = i;
    }

    public void setUserRank(int i) {
        this.mUserRank = i;
    }
}
