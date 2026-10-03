package com.heytap.health.operation.business.api;

import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.fkj;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.t04;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class ConfigJsonReader {

    @SerializedName(fkj.PARAM_SWITCH_STATUS)
    public int a;

    @SerializedName("customConfig")
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(t04.DEVICE_UNIQUE_ID)
    public String f5157c;

    @SerializedName("switchType")
    public int d;

    public static class PlanRemindBean implements Serializable {

        @SerializedName("everyAlarmTime")
        public String everyAlarmTime = "08:00";

        @SerializedName("dietPlanState")
        public int dietPlanState = 1;

        @SerializedName("excitationState")
        public int excitationState = 1;

        @SerializedName("everyAlarmState")
        public int everyAlarmState = 1;

        @SerializedName("dietPlanBreakfastTime")
        public String dietPlanBreakfastTime = "08:00";

        @SerializedName("dietPlanLunchTime")
        public String dietPlanLunchTime = "12:00";

        @SerializedName("dietPlanDinnerTime")
        public String dietPlanDinnerTime = "18:00";

        public String toString() {
            return "PlanRemindBean{planRemaindTime='" + this.everyAlarmTime + "', dietPlanState=" + this.dietPlanState + ", excitationState=" + this.excitationState + ", everyAlarmState=" + this.everyAlarmState + ", dietPlanBreakfastTime='" + this.dietPlanBreakfastTime + "', dietPlanLunchTime='" + this.dietPlanLunchTime + "', dietPlanDinnerTime='" + this.dietPlanDinnerTime + "'}";
        }
    }

    public static class a {

        @SerializedName("signInNoticeTime")
        public String a;

        @SerializedName("getUpNoticeTime")
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("sleepNoticeTime")
        public String f5158c;
    }

    public ConfigJsonReader() {
        this.a = 1;
        this.f5157c = ilj.e();
        this.d = 55;
    }

    public boolean a() {
        return this.a == 0;
    }

    public ConfigJsonReader b(boolean z) {
        this.a = !z ? 1 : 0;
        return this;
    }

    public ConfigJsonReader(int i) {
        this.a = 1;
        this.f5157c = ilj.e();
        this.d = i;
    }
}
