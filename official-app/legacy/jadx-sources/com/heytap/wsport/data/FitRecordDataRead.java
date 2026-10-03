package com.heytap.wsport.data;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportMetaData;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class FitRecordDataRead {

    @Keep
    public static class VoocFitDetail {
        private int avgHeartRate;
        private int duration;
        private int energy;
        private String extra;
        private String fitName;
        private String heartRateDetail;
        private String listActions;
        private String subType;
        private String subTypeName;
        private long timeBegin;
        private long timeEnd;
        private int trainTimes;

        public int getAvgHeartRate() {
            return this.avgHeartRate;
        }

        public int getDuration() {
            return this.duration;
        }

        public int getEnergy() {
            return this.energy;
        }

        public String getExtra() {
            return this.extra;
        }

        public String getFitName() {
            return this.fitName;
        }

        public String getHeartRateDetail() {
            return this.heartRateDetail;
        }

        public String getListActions() {
            return this.listActions;
        }

        public String getSubType() {
            return this.subType;
        }

        public String getSubTypeName() {
            return this.subTypeName;
        }

        public long getTimeBegin() {
            return this.timeBegin;
        }

        public long getTimeEnd() {
            return this.timeEnd;
        }

        public int getTrainTimes() {
            return this.trainTimes;
        }

        public void setDuration(int i) {
            this.duration = i;
        }
    }

    public static SportMetaData a(VoocFitDetail voocFitDetail) {
        SportMetaData sportMetaData = new SportMetaData();
        sportMetaData.setFitSourceType(2);
        sportMetaData.setAvgHeartRate(voocFitDetail.getAvgHeartRate());
        sportMetaData.setTrainedDuration(voocFitDetail.getDuration() * 1000);
        sportMetaData.setTrainedCalorie(voocFitDetail.getEnergy() * 1000);
        sportMetaData.setFinishNumber(voocFitDetail.getTrainTimes());
        sportMetaData.setSubType(voocFitDetail.getSubType());
        sportMetaData.setSubTypeName(voocFitDetail.getSubTypeName());
        sportMetaData.setLstActions(Objects.toString(voocFitDetail.getListActions(), ""));
        sportMetaData.setCourseName(Objects.toString(voocFitDetail.getFitName(), ""));
        sportMetaData.setPlanId(null);
        return sportMetaData;
    }
}
