package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.hp6;
import com.oplus.aiunit.vision.t04;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AppUsageDetail {

    @SerializedName("date")
    int date;

    @SerializedName(hp6.DETAIL_ENTRY)
    List<PackageDetail> details;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    String deviceUniqueId;

    @SerializedName("startTimestamp")
    long startTimestamp;

    public int getDate() {
        return this.date;
    }

    public List<PackageDetail> getDetails() {
        return this.details;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDetails(List<PackageDetail> list) {
        this.details = list;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }
}
