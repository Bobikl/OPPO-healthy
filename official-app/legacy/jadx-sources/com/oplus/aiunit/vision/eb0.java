package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.device_app_store.impl.R$string;

/* JADX INFO: loaded from: classes16.dex */
public class eb0 {
    public static final int END_BY_USER = 101;
    public static final int END_INSTALL_CONFLICT = 203;
    public static final int END_INSTALL_DOWNGRADE = 206;
    public static final int END_INSTALL_FAIL = 202;
    public static final int END_INSTALL_INCOMPATIBLE = 205;
    public static final int END_INSTALL_INVALID = 204;
    public static final int END_INSTALL_SUCCESS = 201;
    public static final int END_NOT_STORAGE = 207;
    public static final int END_RES_NOT_FOUNT = 103;
    public static final int END_SERVER_ERROR = 104;
    public static final int END_SERVICE_UNAVAILABLE = 208;
    public static final int END_TASK_NOT_FOUNT = 102;
    public static final int ERROR_INVALID_PARAMETER = 6;
    public static final int ERROR_PACKAGE_EXISTS = 2;
    public static final int ERROR_PRIVACY = 1;
    public static final int ERROR_SCHOOL_MODE = 7;
    public static final int ERROR_TASK_EXISTS = 3;
    public static final int ERROR_TASK_INSTALLING = 5;
    public static final int ERROR_TASK_NOT_FOUNT = 4;
    public static final int PAUSE_CALLBACK_NOT_FOUNT = 107;
    public static final int PAUSE_NO_NETWORK = 105;
    public static final int PAUSE_NO_STORAGE = 106;
    public static final int PAUSE_OTHER = 108;
    public static final int PAUSE_SCHOOL_MODE = 110;
    public static final int SUCCESS = 0;
    public static final String TAG = "AppInstallError";

    public static String a(int i) {
        Context contextA = b78.a();
        if (contextA == null) {
            s5l.g(TAG, "[getTips] appContext = null,and return");
            return "";
        }
        switch (i) {
            case 102:
                return contextA.getString(R$string.watch_app_error_download_exp_and_try);
            case 103:
                return contextA.getString(R$string.watch_app_error_app_off);
            case 104:
                return contextA.getString(R$string.watch_app_error_download_exp);
            case 105:
                return contextA.getString(R$string.watch_app_store_device_no_network_tips);
            case 106:
                break;
            default:
                switch (i) {
                    case 202:
                    case 203:
                        return contextA.getString(R$string.watch_app_error_install_failed_no_tip);
                    case 204:
                        return contextA.getString(R$string.watch_app_error_install_failed);
                    case 205:
                        return contextA.getString(R$string.watch_app_error_end_package_need_uninstall);
                    case 206:
                        return contextA.getString(R$string.watch_app_error_end_package_version_error);
                    case 207:
                        break;
                    case 208:
                        return contextA.getString(R$string.watch_app_error_device_busy);
                    default:
                        return "";
                }
                break;
        }
        return contextA.getString(R$string.watch_app_error_end_space_is_full);
    }

    public static String b(int i) {
        Context contextA = b78.a();
        if (contextA == null) {
            s5l.g(TAG, "[getTips] appContext = null,and return");
            return "";
        }
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return contextA.getString(R$string.watch_app_error_had_installed);
        }
        if (i != 3) {
            if (i == 4) {
                return contextA.getString(R$string.watch_app_error_not_in_list);
            }
            if (i != 5) {
                return i != 7 ? contextA.getString(R$string.watch_app_error_install_failed) : contextA.getString(R$string.watch_app_error_school_mode);
            }
        }
        return contextA.getString(R$string.watch_app_error_installing_wait);
    }
}
