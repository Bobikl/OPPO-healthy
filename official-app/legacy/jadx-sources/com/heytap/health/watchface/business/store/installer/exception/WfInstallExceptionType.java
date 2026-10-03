package com.heytap.health.watchface.business.store.installer.exception;

import android.content.Context;
import com.heytap.health.watchface.R$string;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public enum WfInstallExceptionType {
    NORMAL(0),
    EXCEPTION_UNKNOWN(-1),
    EXCEPTION_LOW_POWER(-2),
    EXCEPTION_LOW_MEMORY(-3),
    EXCEPTION_CHECK_FAILED(-4),
    EXCEPTION_INSTALL_FAILED(-5),
    EXCEPTION_SEND_FILE_FAILED(-6),
    EXCEPTION_SEND_MSG_FAILED(-7),
    EXCEPTION_NET_FAILED(-8),
    EXCEPTION_INSTALL_STACK_MAX_LIMIT(-9),
    EXCEPTION_PACKAGE_PARSE_ERROR(-10),
    EXCEPTION_WATCH_NO_CONNECT(-11),
    EXCEPTION_WATCH_SUB_MODE(-12),
    EXCEPTION_SEND_FAILED_FBE(-13),
    EXCEPTION_WATCH_KEY_ERROR(-14),
    EXCEPTION_ECDH_KEY_ERROR(-15);

    private static final String TAG = "WfInstallExceptionType";
    private final int mValue;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WfInstallExceptionType.values().length];
            a = iArr;
            try {
                iArr[WfInstallExceptionType.EXCEPTION_INSTALL_STACK_MAX_LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WfInstallExceptionType.EXCEPTION_LOW_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WfInstallExceptionType.EXCEPTION_LOW_MEMORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WfInstallExceptionType.EXCEPTION_NET_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WfInstallExceptionType.EXCEPTION_PACKAGE_PARSE_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WfInstallExceptionType.EXCEPTION_WATCH_KEY_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WfInstallExceptionType.EXCEPTION_SEND_FAILED_FBE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WfInstallExceptionType.EXCEPTION_SEND_MSG_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    WfInstallExceptionType(int i) {
        this.mValue = i;
    }

    public static WfInstallExceptionType forNumber(int i) {
        WfInstallExceptionType wfInstallExceptionType = NORMAL;
        for (WfInstallExceptionType wfInstallExceptionType2 : values()) {
            if (wfInstallExceptionType2.mValue == i) {
                return wfInstallExceptionType2;
            }
        }
        return wfInstallExceptionType;
    }

    public static String getTips(WfInstallExceptionType wfInstallExceptionType, String str) {
        Context contextA = b78.a();
        if (contextA != null) {
            return a.a[wfInstallExceptionType.ordinal()] != 1 ? contextA.getString(R$string.watch_face_store_install_install_failed_error_tips) : String.format(contextA.getString(R$string.watch_face_store_install_max_limit_tips), str);
        }
        ltl.i(TAG, "[getTips] appContext = null,and return");
        return "";
    }

    public int getValue() {
        return this.mValue;
    }

    public static String getTips(WfInstallExceptionType wfInstallExceptionType) {
        Context contextA = b78.a();
        ltl.i(TAG, "[getTips] appContext " + contextA + ",type " + wfInstallExceptionType);
        if (contextA == null) {
            return "";
        }
        switch (a.a[wfInstallExceptionType.ordinal()]) {
            case 2:
                return contextA.getString(R$string.watch_face_store_install_low_power_error_tips);
            case 3:
                return contextA.getString(R$string.watch_face_store_install_low_memory_error_tips);
            case 4:
                return contextA.getString(R$string.watch_face_store_install_network_error_tips);
            case 5:
                return contextA.getString(R$string.watch_face_store_pkg_parse_error_tips);
            case 6:
                return contextA.getString(R$string.watch_face_store_watch_key_error_tips);
            case 7:
                return contextA.getString(R$string.watch_face_disconnect_error_fbe);
            case 8:
                return contextA.getString(R$string.watch_face_connect_tip);
            default:
                return contextA.getString(R$string.watch_face_store_install_install_failed_error_tips);
        }
    }

    public static String getTips(int i) {
        return getTips(forNumber(i));
    }
}
