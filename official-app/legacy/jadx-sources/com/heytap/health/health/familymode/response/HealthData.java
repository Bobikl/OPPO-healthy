package com.heytap.health.health.familymode.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class HealthData {
    public AFibContent atrialFibrillationVO;
    public BloodGlucoseAlert bloodGlucoseAlert;
    public BloodGlucoseDeviceAlert bloodGlucoseDeviceAlert;
    public Spo2Notice bloodOxygenException;
    public Praise friendThumbUp;
    public DailyGoal goalComplete;
    public HeartRate heartRateException;
    public int messageType;
    public FallRecord tumbleVO;

    @Keep
    public static class AFibContent {
        public int reliability;
        public int state;
        public long timestamp;

        public String toString() {
            return "AFibContent{timestamp=" + this.timestamp + ", state=" + this.state + ", reliability=" + this.reliability + '}';
        }
    }

    @Keep
    public static class BloodGlucoseAlert {
        public long timestamp = 1;
        public float value = 2.0f;
        public float threshold = 3.0f;
        public int alertType = 4;

        public String toString() {
            return "BloodGlucoseAlert{timeStamp=" + this.timestamp + ", value=" + this.value + ", threshold=" + this.threshold + ", alertType=" + this.alertType + '}';
        }
    }

    @Keep
    public static class BloodGlucoseDeviceAlert {
        public long timestamp = 1;
        public int alertType = 2;

        public String toString() {
            return "BloodGlucoseDeviceAlert{timeStamp=" + this.timestamp + ", alertType=" + this.alertType + '}';
        }
    }

    @Keep
    public static class DailyGoal {
        public int activityTimes;
        public int consume;
        public long timestamp;
        public int totalSteps;
        public int workoutTime;

        public String toString() {
            return "DailyGoal{timestamp=" + this.timestamp + ", totalSteps=" + this.totalSteps + ", consume=" + this.consume + ", workoutTime=" + this.workoutTime + ", activityTimes=" + this.activityTimes + '}';
        }
    }

    @Keep
    public static class EcgReport {
        public String core;
        public String doctorAcademicTitle;
        public String doctorHospital;
        public String doctorName;
        public int ecgLevel;
        public String hospitalGrade;
        public String interpretationResults;
        public String suggestions;
    }

    @Keep
    public static class FallRecord {
        public int state;
        public long timestamp;

        public String toString() {
            return "FallRecord{timestamp=" + this.timestamp + ", state=" + this.state + '}';
        }
    }

    @Keep
    public static class HeartRate {
        public long endTimestamp;
        public int heartRateAlarmType;
        public int heartRateHighest;
        public int heartRateLowest;
        public int heartRateType;
        public int heartRateValueMax;
        public int heartRateValueMin;
        public long startTimestamp;

        public String toString() {
            return "HeartRate{startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", heartRateAlarmType=" + this.heartRateAlarmType + ", heartRateType=" + this.heartRateType + ", heartRateValueMin=" + this.heartRateValueMin + ", heartRateValueMax=" + this.heartRateValueMax + ", heartRateLowest=" + this.heartRateLowest + ", heartRateHighest=" + this.heartRateHighest + '}';
        }
    }

    @Keep
    public static class Praise {
        public String friendSsoid;
        public String thumbUpContent;
        public int thumbUpType;

        public String toString() {
            return "Praise{friendSsoid='" + this.friendSsoid + "', thumbUpType=" + this.thumbUpType + ", thumbUpContent='" + this.thumbUpContent + "'}";
        }
    }

    @Keep
    public static class Spo2Notice {
        public int altitude;
        public int altitudeValid;
        public long endTimestamp;
        public int maxBloodOxygenValue;
        public int minBloodOxygenValue;
        public long startTimestamp;

        public String toString() {
            return "Spo2Notice{startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", minBloodOxygenValue=" + this.minBloodOxygenValue + ", maxBloodOxygenValue=" + this.maxBloodOxygenValue + ", altitude=" + this.altitude + ", altitudeValid=" + this.altitudeValid + '}';
        }
    }

    public String toString() {
        return "HealthData{messageType=" + this.messageType + ", goalComplete=" + this.goalComplete + ", heartRateException=" + this.heartRateException + ", friendThumbUp=" + this.friendThumbUp + ", tumbleVO=" + this.tumbleVO + ", atrialFibrillationVO=" + this.atrialFibrillationVO + ", bloodOxygenException=" + this.bloodOxygenException + ", bloodGlucoseAlert=" + this.bloodGlucoseAlert + ", bloodGlucoseDeviceAlert=" + this.bloodGlucoseDeviceAlert + '}';
    }
}
