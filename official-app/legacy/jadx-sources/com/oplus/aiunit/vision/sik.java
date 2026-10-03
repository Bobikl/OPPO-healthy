package com.oplus.aiunit.vision;

import com.oplus.aiunit.core.protocol.common.ErrorCode;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0007¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/sik;", "", "", "state", "Lcom/oplus/aiunit/core/protocol/common/ErrorCode;", "a", "STATE_UNAVAILABLE", "I", "STATE_AVAILABLE", "STATE_AVAILABLE_LOCAL", "STATE_AVAILABLE_INTERNET", "STATE_AVAILABLE_AND_NEW_DOWNLOAD", "STATE_UNAVAILABLE_NO_INTERNET", "STATE_UNAVAILABLE_NEED_DOWNLOAD", "STATE_UNAVAILABLE_USER_SWITCH_CLOSE", "STATE_UNAVAILABLE_USER_NO_APPLY", "STATE_UNAVAILABLE_USER_APPLYING", "STATE_UNAVAILABLE_USER_APPLY_FAILED", "STATE_UNAVAILABLE_USER_NO_AUTHORIZE", "STATE_UNAVAILABLE_OFFLINE", "STATE_UNAVAILABLE_DISABLE", "STATE_UNAVAILABLE_USER_SWITCH_CLOSE_LOCAL_LLM", "STATE_UNAVAILABLE_LOW_MEMORY", "STATE_UNAVAILABLE_LOW_BATTERY", "STATE_UNAVAILABLE_POWER_SAVE_MODEL", "STATE_UNAVAILABLE_OVERLOAD", "STATE_UNAVAILABLE_HIGH_TEMPERATURE", "STATE_UNAVAILABLE_WITH_INTERNET_BY_FORCE_LOCAL", "STATE_UNAVAILABLE_PRIVACY_REJECT", "STATE_UNAVAILABLE_URL_EMPTY", "STATE_UNAVAILABLE_EXCEPTION", "STATE_UNAVAILABLE_SCREEN", "STATE_UNAVAILABLE_CHARGING", "<init>", "()V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class sik {

    @NotNull
    public static final sik INSTANCE = new sik();
    public static final int STATE_AVAILABLE = 1;
    public static final int STATE_AVAILABLE_AND_NEW_DOWNLOAD = 4;
    public static final int STATE_AVAILABLE_INTERNET = 3;
    public static final int STATE_AVAILABLE_LOCAL = 2;
    public static final int STATE_UNAVAILABLE = 0;
    public static final int STATE_UNAVAILABLE_CHARGING = 912;
    public static final int STATE_UNAVAILABLE_DISABLE = 13;
    public static final int STATE_UNAVAILABLE_EXCEPTION = 910;
    public static final int STATE_UNAVAILABLE_HIGH_TEMPERATURE = 904;
    public static final int STATE_UNAVAILABLE_LOW_BATTERY = 901;
    public static final int STATE_UNAVAILABLE_LOW_MEMORY = 900;
    public static final int STATE_UNAVAILABLE_NEED_DOWNLOAD = 6;
    public static final int STATE_UNAVAILABLE_NO_INTERNET = 5;
    public static final int STATE_UNAVAILABLE_OFFLINE = 12;
    public static final int STATE_UNAVAILABLE_OVERLOAD = 903;
    public static final int STATE_UNAVAILABLE_POWER_SAVE_MODEL = 902;
    public static final int STATE_UNAVAILABLE_PRIVACY_REJECT = 906;
    public static final int STATE_UNAVAILABLE_SCREEN = 911;
    public static final int STATE_UNAVAILABLE_URL_EMPTY = 907;
    public static final int STATE_UNAVAILABLE_USER_APPLYING = 9;
    public static final int STATE_UNAVAILABLE_USER_APPLY_FAILED = 10;
    public static final int STATE_UNAVAILABLE_USER_NO_APPLY = 8;
    public static final int STATE_UNAVAILABLE_USER_NO_AUTHORIZE = 11;
    public static final int STATE_UNAVAILABLE_USER_SWITCH_CLOSE = 7;
    public static final int STATE_UNAVAILABLE_USER_SWITCH_CLOSE_LOCAL_LLM = 14;
    public static final int STATE_UNAVAILABLE_WITH_INTERNET_BY_FORCE_LOCAL = 905;

    @JvmStatic
    @NotNull
    public static final ErrorCode a(int state) {
        if (state == 911) {
            return ErrorCode.kErrorScreenState;
        }
        if (state == 912) {
            return ErrorCode.kErrorChargeState;
        }
        switch (state) {
            case 0:
                return ErrorCode.kErrorRouterFail;
            case 1:
            case 2:
            case 3:
            case 4:
                return ErrorCode.kErrorNone;
            case 5:
                return ErrorCode.kErrorNoInternet;
            case 6:
                return ErrorCode.kErrorNoDownload;
            case 7:
            case 14:
                return ErrorCode.kErrorSwitchClose;
            case 8:
                return ErrorCode.kErrorNoApply;
            case 9:
                return ErrorCode.kErrorApplying;
            case 10:
                return ErrorCode.kErrorApplyFail;
            case 11:
                return ErrorCode.kErrorNoAccount;
            case 12:
                return ErrorCode.kErrorOffline;
            case 13:
                return ErrorCode.kErrorRouteDisabled;
            default:
                switch (state) {
                    case 900:
                        return ErrorCode.kErrorLowMemory;
                    case 901:
                        return ErrorCode.kErrorLowBattery;
                    case 902:
                        return ErrorCode.kErrorLowPowerSaveModel;
                    case 903:
                        return ErrorCode.kErrorOverload;
                    case 904:
                        return ErrorCode.kErrorHighTemperature;
                    case 905:
                        return ErrorCode.kErrorUserForceLocal;
                    case 906:
                        return ErrorCode.kErrorPrivacyReject;
                    case 907:
                        return ErrorCode.kErrorUrlEmpty;
                    default:
                        return ErrorCode.UNKNOWN;
                }
        }
    }
}
