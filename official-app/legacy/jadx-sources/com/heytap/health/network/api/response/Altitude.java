package com.heytap.health.network.api.response;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class Altitude {
    private List<LevelItem> seaLevelPressureHourlyList;
    private float seaLevelPressure = 0.0f;
    private float altitude = 0.0f;

    @Keep
    public static class LevelItem {
        public int hourth;
        public float mslp;
        public float temp;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public float getSeaLevelPressure() {
        return this.seaLevelPressure;
    }

    public List<LevelItem> getSeaLevelPressureHourlyList() {
        return this.seaLevelPressureHourlyList;
    }

    public void setAltitude(float f) {
        this.altitude = f;
    }

    public void setSeaLevelPressure(float f) {
        this.seaLevelPressure = f;
    }

    public void setSeaLevelPressureHourlyList(List<LevelItem> list) {
        this.seaLevelPressureHourlyList = list;
    }

    @NonNull
    public String toString() {
        return " altitude = " + this.altitude + ";  seaLevelPressure = " + this.seaLevelPressure;
    }
}
