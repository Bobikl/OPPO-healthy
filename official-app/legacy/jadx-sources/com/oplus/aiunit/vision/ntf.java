package com.oplus.aiunit.vision;

import com.heytap.health.base.R$string;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;

/* JADX INFO: loaded from: classes15.dex */
public final class ntf {
    public static final int DAILY_ACTIVITY = 10;
    public static final int HEART_RATE = 11;
    public static final int SLEEP = 12;

    public interface a {
        public static final String STEP = b78.a().getString(R$string.lib_base_code_stephistory);
        public static final String RANK = b78.a().getString(R$string.lib_base_code_rank);
        public static final String SPORT_SHARE = b78.a().getString(R$string.lib_base_code_sport_record_share);
        public static final String DAILY_DETAIL = b78.a().getString(R$string.lib_base_code_daily);
    }

    public static int a(int i, String str) {
        if (i == 7) {
            return 20006;
        }
        if (i == 12) {
            return op5.PHONE.equals(str) ? 20052 : 20005;
        }
        if (i == 14 || i == 16 || i == 127) {
            return 20001;
        }
        if (i == 610) {
            return 20100;
        }
        if (i == 809) {
            return 20006;
        }
        if (i != 9) {
            if (i == 10 || i == 18) {
                return 20001;
            }
            if (i == 19) {
                return 20002;
            }
            switch (i) {
                case 31:
                    return 20007;
                case 32:
                case 33:
                case 35:
                    break;
                case 34:
                    return 20003;
                case 36:
                case 37:
                    return 20008;
                default:
                    return 20028;
            }
        }
        return op5.PHONE.equals(str) ? 20051 : 20004;
    }

    public static int b(int i) {
        if (i == -2) {
            return 20027;
        }
        if (i == 7) {
            return 20019;
        }
        if (i == 12) {
            return SpeechErrorCode.ERROR_VERSION_LOWER;
        }
        if (i == 14 || i == 16 || i == 127) {
            return 20014;
        }
        if (i == 610) {
            return 20101;
        }
        if (i == 809) {
            return 20019;
        }
        if (i == 9) {
            return SpeechErrorCode.ERROR_INTERRUPT;
        }
        if (i == 10 || i == 18) {
            return 20014;
        }
        if (i == 19) {
            return SpeechErrorCode.ERROR_LOGIN;
        }
        switch (i) {
            case 31:
                return 20020;
            case 32:
            case 33:
            case 35:
                return SpeechErrorCode.ERROR_INTERRUPT;
            case 34:
                return SpeechErrorCode.ERROR_PERMISSION_DENIED;
            case 36:
            case 37:
                return 20021;
            default:
                return 20028;
        }
    }
}
