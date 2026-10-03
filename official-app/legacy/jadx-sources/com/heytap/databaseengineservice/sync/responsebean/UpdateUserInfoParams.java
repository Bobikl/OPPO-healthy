package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.nearx.tangramconfig.strategy.Fields;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UpdateUserInfoParams {

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("bloodPressureType")
    private Integer bloodPressureType;

    @SerializedName(Fields.HEIGHT_FIELD)
    private String height;

    @SerializedName("modifiedTime")
    private long modifiedTime;

    @SerializedName("sex")
    private String sex;

    @SerializedName("userName")
    private String userName;

    @SerializedName("weight")
    private String weight;

    public UpdateUserInfoParams(String str, String str2, String str3, String str4, long j2) {
        this.height = str;
        this.weight = str2;
        this.birthday = str3;
        this.sex = str4;
        this.modifiedTime = j2;
    }

    public int getBloodPressureType() {
        return this.bloodPressureType.intValue();
    }

    public void setBloodPressureType(int i) {
        this.bloodPressureType = Integer.valueOf(i);
    }

    public String toString() {
        return "UpdateUserInfoParams{height='" + this.height + "', weight='" + this.weight + "', birthday='" + this.birthday + "', sex='" + this.sex + "', bloodPressureType='" + this.bloodPressureType + "', modifiedTime=" + this.modifiedTime + '}';
    }

    public UpdateUserInfoParams(String str, String str2, String str3, String str4, String str5, long j2, int i) {
        this(str2, str3, str4, str5, j2);
        this.userName = str;
        this.bloodPressureType = Integer.valueOf(i);
    }

    public UpdateUserInfoParams(String str, String str2, String str3, String str4, int i, long j2) {
        this.height = str;
        this.weight = str2;
        this.birthday = str3;
        this.sex = str4;
        this.bloodPressureType = Integer.valueOf(i);
        this.modifiedTime = j2;
    }
}
