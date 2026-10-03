package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.t04;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AppUsageStat {

    @SerializedName("date")
    int date;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    String deviceUniqueId;

    @SerializedName("stats")
    List<PackageStat> stats;

    public int getDate() {
        return this.date;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public List<PackageStat> getStats() {
        return this.stats;
    }

    public void setDate(int i) {
        this.date = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setStats(List<PackageStat> list) {
        this.stats = list;
    }
}
