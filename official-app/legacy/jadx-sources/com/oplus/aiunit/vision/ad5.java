package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/ad5;", "", "", "macAddress", "a", "SP_NAME_STAMINA_PARM_FILE_NAME", "Ljava/lang/String;", "SP_NAME_DATA_START_TIME", "SP_NAME_DATA_START_TIME_FOR_WATCH_1", "SP_KEY_SLEEP_MODE_ZEN_MODE", "SP_KEY_SLEEP_MODE_EYE_PROTECT", "SP_KEY_SLEEP_MODE_LINKED_PHONE_ZEN_MODE_TIME", "SP_KEY_SLEEP_REMIND_LAST_FORCE_CLOUD_QUERY_TIME", "SP_KEY_ECG_ACTIVE_STATE", "SP_KEY_BLOOD_SUGAR_DEVICE_STATE", "SP_KEY_WRIST_TEMPERATURE_COUNTDOWN", "SP_KEY_WRIST_TEMPERATURE_STATE", "SP_KEY_SNORE_ACTIVE_STATE", "SP_KEY_HOLIDAYS", "SP_KEY_IWATCH_LAST_SYNC_TIME", "<init>", "()V", "device_data_sync_release"}, k = 1, mv = {1, 8, 0})
public final class ad5 {

    @NotNull
    public static final ad5 INSTANCE = new ad5();

    @NotNull
    public static final String SP_KEY_BLOOD_SUGAR_DEVICE_STATE = "blood_sugar_device_state";

    @NotNull
    public static final String SP_KEY_ECG_ACTIVE_STATE = "ecg_active_state";

    @NotNull
    public static final String SP_KEY_HOLIDAYS = "statutory_holidays_sp_key";

    @NotNull
    public static final String SP_KEY_IWATCH_LAST_SYNC_TIME = "iwatch_last_sync_time";

    @NotNull
    public static final String SP_KEY_SLEEP_MODE_EYE_PROTECT = "sleep_mode_eye_protect";

    @NotNull
    public static final String SP_KEY_SLEEP_MODE_LINKED_PHONE_ZEN_MODE_TIME = "sleep_mode_linked_phone_zen_mode_time";

    @NotNull
    public static final String SP_KEY_SLEEP_MODE_ZEN_MODE = "sleep_mode_zen_mode";

    @NotNull
    public static final String SP_KEY_SLEEP_REMIND_LAST_FORCE_CLOUD_QUERY_TIME = "sleep_remind_last_force_cloud_query_time";

    @NotNull
    public static final String SP_KEY_SNORE_ACTIVE_STATE = "snore_active_state";

    @NotNull
    public static final String SP_KEY_WRIST_TEMPERATURE_COUNTDOWN = "wrist_temperature_countdown";

    @NotNull
    public static final String SP_KEY_WRIST_TEMPERATURE_STATE = "wrist_temperature_state";

    @NotNull
    public static final String SP_NAME_DATA_START_TIME = "band-sport-data";

    @NotNull
    public static final String SP_NAME_DATA_START_TIME_FOR_WATCH_1 = "AbsResponseCourier";

    @NotNull
    public static final String SP_NAME_STAMINA_PARM_FILE_NAME = "wsspss";

    @NotNull
    public final String a(@NotNull String macAddress) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        return "iwatch_last_sync_time_" + macAddress;
    }
}
