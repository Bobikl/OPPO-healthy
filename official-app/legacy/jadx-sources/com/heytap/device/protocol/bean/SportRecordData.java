package com.heytap.device.protocol.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SportRecordData {
    public int achievePercent;
    public int avgFrequency;
    public int avgHeartRate;
    public int avgSpeed;
    public List<DetailData> detailData;
    public String detailDataFilePath;
    public long endTime;
    public String extra;
    public List<GpsData> gpsData;
    public String gpsDataFilePath;
    public int maxSpeed;
    public String sportId;
    public String sportName;
    public int sportType;
    public long startTime;
    public String timeZone;
    public int totalCalories;
    public int totalDistance;
    public int totalHeight;
    public int totalSteps;
    public int totalTime;

    @Keep
    public static class DetailData {
        public Integer distance;
        public Integer elevation;
        public Integer frequency;
        public Integer heartRate;
        public Integer pace;
        public Integer stamina;
        public Integer state;
        public Integer stride;
        public long timeStamp;
    }

    @Keep
    public static class ExtraRun {
        public int fiveKmPlans;
        public int hrZone;
        public int kmPace;
        public int recoveryTime;
        public int trainingEffect;
    }

    @Keep
    public static class ExtraSwim {
        public int lap;
        public String lapDetail;
        public int poolLength;
        public int stroke;
        public int swimType;
    }

    @Keep
    public static class GpsData {
        public int cog;
        public double latitude;
        public double longitude;
        public int speed;
        public int state;
        public long timeStamp;

        public String toString() {
            return "GpsData{timeStamp=" + this.timeStamp + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", speed=" + this.speed + ", state=" + this.state + ", cog=" + this.cog + '}';
        }
    }

    public String toString() {
        return "SportRecordData{sportType=" + this.sportType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalSteps=" + this.totalSteps + ", totalDistance=" + this.totalDistance + ", totalTime=" + this.totalTime + ", totalCalories=" + this.totalCalories + ", totalHeight=" + this.totalHeight + ", avgHeartRate=" + this.avgHeartRate + ", avgSpeed=" + this.avgSpeed + ", maxSpeed=" + this.maxSpeed + ", avgFrequency=" + this.avgFrequency + ", extra='" + this.extra + "'}";
    }
}
