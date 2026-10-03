package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UpdateSportGoalParams {

    @SerializedName("endTime")
    private long endTime;

    @SerializedName("goalStr")
    private String goalStr;

    @SerializedName("goalType")
    private int goalType;

    @SerializedName("modifiedTime")
    private long modifiedTime;

    @SerializedName("startTime")
    private long startTime;

    public UpdateSportGoalParams(int i, String str, long j2, long j3, long j4) {
        this.goalType = i;
        this.goalStr = str;
        this.startTime = j2;
        this.endTime = j3;
        this.modifiedTime = j4;
    }
}
