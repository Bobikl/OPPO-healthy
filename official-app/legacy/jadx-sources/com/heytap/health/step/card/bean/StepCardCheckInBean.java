package com.heytap.health.step.card.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StepCardCheckInBean {
    private CheckInRewardBean checkInReward;
    private int continuousTimes;
    private int errorCode;

    @Keep
    public static class CheckInRewardBean {
        private String darkModeRewardImage;
        private String rewardDesc;
        private String rewardImage;

        public String getDarkModeRewardImage() {
            return this.darkModeRewardImage;
        }

        public String getRewardDesc() {
            return this.rewardDesc;
        }

        public String getRewardImage() {
            return this.rewardImage;
        }

        public void setDarkModeRewardImage(String str) {
            this.darkModeRewardImage = str;
        }

        public void setRewardDesc(String str) {
            this.rewardDesc = str;
        }

        public void setRewardImage(String str) {
            this.rewardImage = str;
        }

        @NonNull
        public String toString() {
            return super.toString();
        }
    }

    public int getContinuousTimes() {
        return this.continuousTimes;
    }

    public CheckInRewardBean getRewardBean() {
        return this.checkInReward;
    }

    public void setContinuousTimes(int i) {
        this.continuousTimes = i;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setRewardBean(CheckInRewardBean checkInRewardBean) {
        this.checkInReward = checkInRewardBean;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("continuousTimes:");
        sb.append(this.continuousTimes);
        sb.append("checkInReward:");
        Object obj = this.checkInReward;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        return sb.toString();
    }
}
