package com.heytap.health.homecard.constant;

import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.heytap.health.bloodpressure.util.ResearchAppHelper;
import com.heytap.health.health.impl.R$string;
import com.oplus.aiunit.vision.hdj;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NOT_VALID_DATA' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes16.dex */
public final class HomeCardDataEnum$DataType {
    private static final /* synthetic */ HomeCardDataEnum$DataType[] $VALUES;

    @SerializedName("HEALTH_ASSISTANT")
    public static final HomeCardDataEnum$DataType AI_HEALTH_ASSISTANT;

    @SerializedName("BLOOD_OX")
    public static final HomeCardDataEnum$DataType BLOOD_OX;

    @SerializedName("BLOOD_PRESSURE")
    public static final HomeCardDataEnum$DataType BLOOD_PRESSURE;

    @SerializedName(hdj.BLOOD_SUGAR)
    public static final HomeCardDataEnum$DataType BLOOD_SUGAR;

    @SerializedName("CALORIE")
    public static final HomeCardDataEnum$DataType CALORIE;

    @SerializedName("CARDIOVASCULAR")
    public static final HomeCardDataEnum$DataType CARDIOVASCULAR;

    @SerializedName(hdj.CERVICAL_SPINE)
    public static final HomeCardDataEnum$DataType CERVICAL_SPINE;

    @SerializedName(HeytapHealthParams.DAILY_ACTIVITY)
    public static final HomeCardDataEnum$DataType DAILY_ACTIVITY;

    @SerializedName("ECG")
    public static final HomeCardDataEnum$DataType ECG;

    @SerializedName("FAMILY")
    public static final HomeCardDataEnum$DataType FAMILY;

    @SerializedName("GOAL")
    public static final HomeCardDataEnum$DataType GOAL;

    @SerializedName("HEALTH_ARCHIVES")
    public static final HomeCardDataEnum$DataType HEALTH_ARCHIVES;

    @SerializedName("HEALTH_TREND")
    public static final HomeCardDataEnum$DataType HEALTH_TREND;

    @SerializedName("HEARING_HEALTH")
    public static final HomeCardDataEnum$DataType HEARING_HEALTH;

    @SerializedName(HeytapHealthParams.HEART_RATE)
    public static final HomeCardDataEnum$DataType HEART_RATE;

    @SerializedName("HRV")
    public static final HomeCardDataEnum$DataType HRV;

    @SerializedName("MENSTRUAL_PERIOD")
    public static final HomeCardDataEnum$DataType MENSTRUAL_PERIOD;

    @SerializedName("NOT_VALID_DATA")
    public static final HomeCardDataEnum$DataType NOT_VALID_DATA;

    @SerializedName("PWV")
    public static final HomeCardDataEnum$DataType PWV;

    @SerializedName("RANK")
    public static final HomeCardDataEnum$DataType RANK;

    @SerializedName("RELAX")
    public static final HomeCardDataEnum$DataType RELAX;

    @SerializedName(HeytapHealthParams.SLEEP)
    public static final HomeCardDataEnum$DataType SLEEP;

    @SerializedName("SLEEP_BREATH_RATE")
    public static final HomeCardDataEnum$DataType SLEEP_BREATH_RATE;

    @SerializedName("SNORE")
    public static final HomeCardDataEnum$DataType SNORE;

    @SerializedName("STEP")
    public static final HomeCardDataEnum$DataType STEP;

    @SerializedName("STRESS")
    public static final HomeCardDataEnum$DataType STRESS;

    @SerializedName("SUNSHINE")
    public static final HomeCardDataEnum$DataType SUNSHINE;

    @SerializedName("TIMELINE")
    public static final HomeCardDataEnum$DataType TIMELINE;

    @SerializedName("WEIGHT")
    public static final HomeCardDataEnum$DataType WEIGHT;

    @SerializedName(hdj.WRIST_TEMPERATURE)
    public static final HomeCardDataEnum$DataType WRIST_TEMPERATURE;
    public int bindSort;
    public String netCardCode;
    public int netCardType;
    public boolean noDeviceFollowed;
    public HomeCardDataEnum$SpanNum spanNum;
    public int titleStrId;
    public int unbindSort;

    private static /* synthetic */ HomeCardDataEnum$DataType[] $values() {
        return new HomeCardDataEnum$DataType[]{NOT_VALID_DATA, DAILY_ACTIVITY, RANK, HEART_RATE, BLOOD_OX, SLEEP, SNORE, HRV, MENSTRUAL_PERIOD, BLOOD_SUGAR, CARDIOVASCULAR, ECG, HEALTH_ARCHIVES, GOAL, FAMILY, WRIST_TEMPERATURE, STEP, WEIGHT, BLOOD_PRESSURE, STRESS, SLEEP_BREATH_RATE, RELAX, CALORIE, HEARING_HEALTH, CERVICAL_SPINE, PWV, SUNSHINE, HEALTH_TREND, TIMELINE, AI_HEALTH_ASSISTANT};
    }

    static {
        int i = R$string.health_home_card_name_not_valid;
        HomeCardDataEnum$SpanNum homeCardDataEnum$SpanNum = HomeCardDataEnum$SpanNum.ONE_LINE;
        NOT_VALID_DATA = new HomeCardDataEnum$DataType("NOT_VALID_DATA", 0, -1, -1, false, i, 0, "", homeCardDataEnum$SpanNum);
        DAILY_ACTIVITY = new HomeCardDataEnum$DataType(HeytapHealthParams.DAILY_ACTIVITY, 1, 0, 0, true, com.heytap.health.daily.R$string.health_daily_activity, 15, "daily_act", homeCardDataEnum$SpanNum);
        int i2 = R$string.health_step_rank_title;
        HomeCardDataEnum$SpanNum homeCardDataEnum$SpanNum2 = HomeCardDataEnum$SpanNum.HALF_LINE;
        RANK = new HomeCardDataEnum$DataType("RANK", 2, 14, 14, true, i2, 2, "steps_rank", homeCardDataEnum$SpanNum2);
        HEART_RATE = new HomeCardDataEnum$DataType(HeytapHealthParams.HEART_RATE, 3, 11, 11, true, com.heytap.health.heartrate.R$string.health_heart_rate, 5, "heart_rate", homeCardDataEnum$SpanNum2);
        BLOOD_OX = new HomeCardDataEnum$DataType("BLOOD_OX", 4, 16, 16, false, com.heytap.health.bloodoxygen.R$string.health_blood_oxygen, 9, Element.ELEMENT_NAME_BLOOD_OXYGEN, homeCardDataEnum$SpanNum2);
        SLEEP = new HomeCardDataEnum$DataType(HeytapHealthParams.SLEEP, 5, 10, 10, true, R$string.health_sleep, 6, Element.ELEMENT_NAME_SLEEP, homeCardDataEnum$SpanNum2);
        SNORE = new HomeCardDataEnum$DataType("SNORE", 6, 22, 22, false, R$string.health_card_snore, 30, "snore", homeCardDataEnum$SpanNum2);
        HRV = new HomeCardDataEnum$DataType("HRV", 7, 17, 17, false, com.heytap.health.hrv.R$string.health_hrv_title, 31, "hrv_status", homeCardDataEnum$SpanNum2);
        MENSTRUAL_PERIOD = new HomeCardDataEnum$DataType("MENSTRUAL_PERIOD", 8, 8, 8, true, R$string.health_home_card_menstrual_title, 24, "menstrual_period", homeCardDataEnum$SpanNum2);
        BLOOD_SUGAR = new HomeCardDataEnum$DataType(hdj.BLOOD_SUGAR, 9, 7, 7, true, com.heytap.health.blood.glucose.R$string.health_blood_glucose, 25, "blood_sugar", homeCardDataEnum$SpanNum2);
        CARDIOVASCULAR = new HomeCardDataEnum$DataType("CARDIOVASCULAR", 10, 18, 18, false, com.heytap.health.cardiovascular.R$string.health_cardiovascular_card_title_no_define, 18, "cardiovascular", homeCardDataEnum$SpanNum2);
        ECG = new HomeCardDataEnum$DataType("ECG", 11, 20, 20, false, com.heytap.health.health.R$string.health_ecg_title, 10, "ecg", homeCardDataEnum$SpanNum2);
        HEALTH_ARCHIVES = new HomeCardDataEnum$DataType("HEALTH_ARCHIVES", 12, 3, 3, true, com.heytap.health.health_archives.R$string.health_home_archives_title, 42, "health_archives", homeCardDataEnum$SpanNum);
        GOAL = new HomeCardDataEnum$DataType("GOAL", 13, 9, 9, true, R$string.health_target_title, 3, "target_check", homeCardDataEnum$SpanNum2);
        FAMILY = new HomeCardDataEnum$DataType("FAMILY", 14, 13, 13, true, R$string.health_family_health, 4, "family_health", homeCardDataEnum$SpanNum2);
        WRIST_TEMPERATURE = new HomeCardDataEnum$DataType(hdj.WRIST_TEMPERATURE, 15, 19, 19, false, com.heytap.health.wrist_temperature.R$string.health_wrist_temperature, 26, "wrist_temperature", homeCardDataEnum$SpanNum2);
        STEP = new HomeCardDataEnum$DataType("STEP", 16, 4, 4, true, com.heytap.health.daily.R$string.health_daily_step_count, 1, "steps", homeCardDataEnum$SpanNum2);
        WEIGHT = new HomeCardDataEnum$DataType("WEIGHT", 17, 12, 12, true, com.heytap.health.bodyfat.R$string.health_body_fat_weight, 7, "weight", homeCardDataEnum$SpanNum2);
        BLOOD_PRESSURE = new HomeCardDataEnum$DataType("BLOOD_PRESSURE", 18, 6, 6, true, com.heytap.health.bloodpressure.R$string.health_blood_pressure, 11, ResearchAppHelper.SP_KEY_BLOOD_PRESSURE, homeCardDataEnum$SpanNum2);
        STRESS = new HomeCardDataEnum$DataType("STRESS", 19, 24, 24, false, com.heytap.health.stress.R$string.health_stress, 8, "stress", homeCardDataEnum$SpanNum2);
        SLEEP_BREATH_RATE = new HomeCardDataEnum$DataType("SLEEP_BREATH_RATE", 20, 27, 27, false, com.health.sleep_breath_rate.R$string.health_sleep_br_title, 28, "sleep_breath_rate", homeCardDataEnum$SpanNum2);
        RELAX = new HomeCardDataEnum$DataType("RELAX", 21, 23, 23, false, com.heytap.health.relax.R$string.health_relax, 13, "relax", homeCardDataEnum$SpanNum2);
        CALORIE = new HomeCardDataEnum$DataType("CALORIE", 22, 5, 5, true, com.heytap.health.daily.R$string.health_daily_consumption, 14, "act_consume", homeCardDataEnum$SpanNum2);
        HEARING_HEALTH = new HomeCardDataEnum$DataType("HEARING_HEALTH", 23, 25, 25, false, com.heytap.health.hearing.R$string.health_hearing, 16, Element.ELEMENT_NAME_HEARING_HEALTH, homeCardDataEnum$SpanNum2);
        CERVICAL_SPINE = new HomeCardDataEnum$DataType(hdj.CERVICAL_SPINE, 24, 26, 26, false, com.heytap.health.cervical_vertebra.R$string.health_cs_title, 19, "cervical_spine", homeCardDataEnum$SpanNum2);
        PWV = new HomeCardDataEnum$DataType("PWV", 25, 28, 28, false, com.heytap.health.daily.R$string.health_pwv, 17, "vascular_health", homeCardDataEnum$SpanNum2);
        SUNSHINE = new HomeCardDataEnum$DataType("SUNSHINE", 26, 21, 21, false, com.heytap.health.sunshine.R$string.health_sunshine_title, 43, DBPhysicalMentalAchievement.SUNSHINE, homeCardDataEnum$SpanNum2);
        HEALTH_TREND = new HomeCardDataEnum$DataType("HEALTH_TREND", 27, 1, 1, true, R$string.health_insight_health_trend, 44, "healthinsights", homeCardDataEnum$SpanNum2);
        TIMELINE = new HomeCardDataEnum$DataType("TIMELINE", 28, 15, 15, true, R$string.health_timeline_card_title, 45, "healthjourney", homeCardDataEnum$SpanNum2);
        AI_HEALTH_ASSISTANT = new HomeCardDataEnum$DataType("AI_HEALTH_ASSISTANT", 29, 2, 2, true, R$string.health_ai_assistant_card_title, 46, "healthassistant", homeCardDataEnum$SpanNum2);
        $VALUES = $values();
    }

    private HomeCardDataEnum$DataType(String str, int i, int i2, int i3, boolean z, int i4, int i5, String str2, HomeCardDataEnum$SpanNum homeCardDataEnum$SpanNum) {
        super(str, i);
        this.unbindSort = i2;
        this.bindSort = i3;
        this.noDeviceFollowed = z;
        this.titleStrId = i4;
        this.netCardType = i5;
        this.netCardCode = str2;
        this.spanNum = homeCardDataEnum$SpanNum;
    }

    public static HomeCardDataEnum$DataType valueOf(String str) {
        return (HomeCardDataEnum$DataType) Enum.valueOf(HomeCardDataEnum$DataType.class, str);
    }

    public static HomeCardDataEnum$DataType[] values() {
        return (HomeCardDataEnum$DataType[]) $VALUES.clone();
    }
}