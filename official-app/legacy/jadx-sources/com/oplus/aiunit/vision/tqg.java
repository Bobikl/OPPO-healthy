package com.oplus.aiunit.vision;

import com.health.health_seedlingcard.R$string;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010!\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010#\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010%\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0015R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010'\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010)\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0015R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010,\u001a\u00020+8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u0004R\u0014\u00100\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0014\u00101\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\u0004R\u0014\u00102\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0014\u00103\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\u0004R\u0014\u00104\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\u0004R\u0014\u00105\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\u0004R\u0014\u00106\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u0004R#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R#\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013078\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b<\u0010:¨\u0006@"}, d2 = {"Lcom/oplus/aiunit/vision/tqg;", "", "", tqg.SLEEP_REMINDER_EVENT, "Ljava/lang/String;", tqg.STEP_GOAL_EVENT, "SLEEP_STAT_REFRESH", "SEEDLINGCARD_ACTION_REQUEST_DATA", "SEEDLINGCARD_ACTION_REQUEST_TYPE", "SEEDLINGCARD_ACTION_REQUEST_PARAMS", "SEEDLING_CARD_PROVIDER", "SP_KEY_STEP_GOAL", "SP_KEY_STEP_GOAL_KEY", "SP_KEY_MENSTRUAL", "SP_KEY_MENSTRUAL_KEY", "SP_KEY_MENSTRUAL_SEND_METIS", "SP_KEY_SLEEP_REMINDER_LIST", "SP_KEY_SLEEP_REMINDER_LIST1X2", "SP_KEY_SLEEP_REMINDER_LIST2X2", "", "SLEEP_DEEP", "I", "SLEEP_LIGHTLY", "SLEEP_RAPID_EYE_MOVEMENT", "WAKE", tqg.STEPS_ACHIEVEMENT_EVENT, tqg.SLEEP_STATE_EVENT, "STEP_GOAL_EVENT_CODE", "STEP_GOAL_EVENT", "STEPS_ACHIEVEMENT_EVENT_CODE", "STEPS_ACHIEVEMENT_EVENT", "SLEEP_STATE_EVENT_CODE", "SLEEP_STATE_EVENT", "SLEEP_REMINDER_EVENT_CODE", "SLEEP_REMINDER_EVENT", "PERMISSION_STATE_EVENT_CODE", "PERMISSION_STATE_EVENT", "SPORTS_RECORD_EVENT_CODE", "SPORTS_RECORD_EVENT", "CLOSE_CARD_EVENT_CODE", "CLOSE_CARD_EVENT", "MENSTRUAL_EVENT_CODE", "MENSTRUAL_EVENT", "", "MENSTRUAL_INTENT_ID", "J", "REACH_STEP_GOAL_SID", "CURRENT_STEP_SID", "SYNC_WERUN_STEPS_SID", "STEP_ACHIEVEMENTS_SID", "WEEKLY_STEP_REPORT_SID", "LATEST_SLEEP_DATA_SID", "SLEEP_REMINDER_SID", "SECONDARY_STEP_SID", "SPORTS_RECORD_SID", "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "reminder1x2tipsMap", "b", "reminder2x2tipsListMap", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class tqg {

    @NotNull
    public static final String CLOSE_CARD_EVENT = "CARD_CANCEL";
    public static final int CLOSE_CARD_EVENT_CODE = 50001;

    @NotNull
    public static final String CURRENT_STEP_SID = "268439593";

    @NotNull
    public static final String LATEST_SLEEP_DATA_SID = "268439594";

    @NotNull
    public static final String MENSTRUAL_EVENT = "INTENT";
    public static final int MENSTRUAL_EVENT_CODE = 20104;
    public static final long MENSTRUAL_INTENT_ID = 13121012;

    @NotNull
    public static final String PERMISSION_STATE_EVENT = "PERMISSION_STATE";
    public static final int PERMISSION_STATE_EVENT_CODE = 10105;

    @NotNull
    public static final String REACH_STEP_GOAL_SID = "268439589";

    @NotNull
    public static final String SECONDARY_STEP_SID = "268454152";

    @NotNull
    public static final String SEEDLINGCARD_ACTION_REQUEST_DATA = "com.oplus.intelligent.rulesengine.REQUEST_DATA";

    @NotNull
    public static final String SEEDLINGCARD_ACTION_REQUEST_PARAMS = "com.oplus.intelligent.rulesengine.request_data.params";

    @NotNull
    public static final String SEEDLINGCARD_ACTION_REQUEST_TYPE = "com.oplus.intelligent.rulesengine.request_data.type";

    @NotNull
    public static final String SEEDLING_CARD_PROVIDER = "com.heytap.health.SeedlingCardPictureProvider";
    public static final int SLEEP_DEEP = 15;
    public static final int SLEEP_LIGHTLY = 35;
    public static final int SLEEP_RAPID_EYE_MOVEMENT = 65;

    @NotNull
    public static final String SLEEP_REMINDER = "SLEEP_REMIND_ACTION";

    @NotNull
    public static final String SLEEP_REMINDER_EVENT = "SLEEP_REMINDER";
    public static final int SLEEP_REMINDER_EVENT_CODE = 10104;

    @NotNull
    public static final String SLEEP_REMINDER_SID = "268439606";

    @NotNull
    public static final String SLEEP_STATE = "sleepState";

    @NotNull
    public static final String SLEEP_STATE_EVENT = "SLEEP_STATE";
    public static final int SLEEP_STATE_EVENT_CODE = 10103;

    @NotNull
    public static final String SLEEP_STAT_REFRESH = "com.heytap.health.sleep.ACTION_SLEEP_STAT_REFRESH";

    @NotNull
    public static final String SPORTS_RECORD_EVENT = "RUNING_STATE";
    public static final int SPORTS_RECORD_EVENT_CODE = 10106;

    @NotNull
    public static final String SPORTS_RECORD_SID = "536873114";

    @NotNull
    public static final String SP_KEY_MENSTRUAL = "menstrual_card";

    @NotNull
    public static final String SP_KEY_MENSTRUAL_KEY = "menstrual_card_key";

    @NotNull
    public static final String SP_KEY_MENSTRUAL_SEND_METIS = "menstrual_send_metis_key";

    @NotNull
    public static final String SP_KEY_SLEEP_REMINDER_LIST = "sleep_reminder_list";

    @NotNull
    public static final String SP_KEY_SLEEP_REMINDER_LIST1X2 = "sleep_reminder_list1x2";

    @NotNull
    public static final String SP_KEY_SLEEP_REMINDER_LIST2X2 = "sleep_reminder_list2x2";

    @NotNull
    public static final String SP_KEY_STEP_GOAL = "step_goal";

    @NotNull
    public static final String SP_KEY_STEP_GOAL_KEY = "step_goal_key";

    @NotNull
    public static final String STEPS_ACHIEVEMENT_EVENT = "STEPS_ACHIEVEMENT_MEDAL";
    public static final int STEPS_ACHIEVEMENT_EVENT_CODE = 10102;

    @NotNull
    public static final String STEPS_ACHIEVEMENT_MEDAL = "stepsAchievementMedal";

    @NotNull
    public static final String STEP_ACHIEVEMENTS_SID = "268439590";

    @NotNull
    public static final String STEP_GOAL = "com.heytap.health.action_STEP_GOAL";

    @NotNull
    public static final String STEP_GOAL_EVENT = "STEP_GOAL";
    public static final int STEP_GOAL_EVENT_CODE = 10101;

    @NotNull
    public static final String SYNC_WERUN_STEPS_SID = "268439592";
    public static final int WAKE = 85;

    @NotNull
    public static final String WEEKLY_STEP_REPORT_SID = "268439591";

    @NotNull
    public static final tqg INSTANCE = new tqg();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<Integer, Integer> reminder1x2tipsMap = MapsKt__MapsKt.mapOf(TuplesKt.to(0, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips1)), TuplesKt.to(1, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips2)), TuplesKt.to(2, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips3)), TuplesKt.to(3, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips4)), TuplesKt.to(4, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips5)), TuplesKt.to(5, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips6)), TuplesKt.to(6, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips7)), TuplesKt.to(7, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips8)), TuplesKt.to(8, Integer.valueOf(R$string.seedling_card_sleep_reminder_1x2tips9)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Integer, Integer> reminder2x2tipsListMap = MapsKt__MapsKt.mapOf(TuplesKt.to(0, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips1)), TuplesKt.to(1, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips2)), TuplesKt.to(2, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips3)), TuplesKt.to(3, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips4)), TuplesKt.to(4, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips5)), TuplesKt.to(5, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips6)), TuplesKt.to(6, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips7)), TuplesKt.to(7, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips8)), TuplesKt.to(8, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips9)), TuplesKt.to(9, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips10)), TuplesKt.to(10, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips11)), TuplesKt.to(11, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips12)), TuplesKt.to(12, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips13)), TuplesKt.to(13, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips14)), TuplesKt.to(14, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips15)), TuplesKt.to(15, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips16)), TuplesKt.to(16, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips17)), TuplesKt.to(17, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips18)), TuplesKt.to(18, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips19)), TuplesKt.to(19, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips20)), TuplesKt.to(20, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips21)), TuplesKt.to(21, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips22)), TuplesKt.to(22, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips23)), TuplesKt.to(23, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips24)), TuplesKt.to(24, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips25)), TuplesKt.to(25, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips26)), TuplesKt.to(26, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips27)), TuplesKt.to(27, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips28)), TuplesKt.to(28, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips29)), TuplesKt.to(29, Integer.valueOf(R$string.seedling_card_sleep_reminder_2x2tips30)));

    @NotNull
    public final Map<Integer, Integer> a() {
        return reminder1x2tipsMap;
    }

    @NotNull
    public final Map<Integer, Integer> b() {
        return reminder2x2tipsListMap;
    }
}
