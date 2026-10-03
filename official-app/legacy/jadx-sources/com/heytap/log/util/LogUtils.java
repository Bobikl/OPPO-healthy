package com.heytap.log.util;

import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.Logger;

/* JADX INFO: loaded from: classes19.dex */
public class LogUtils {
    private static final String PREFIX = "HLog-";
    private static final String SPEC_INFIX = "http";
    private static final int TAG_MAX_LEN = 22;
    private String business;
    private boolean isLog = AppUtil.getLogEnable();
    private Logger logger;
    private String process;

    public LogUtils(Logger logger) {
        this.logger = logger;
        if (logger != null) {
            try {
                this.business = logger.getLogConfig().getBusiness();
                this.process = AppUtil.obtainProcessName(logger.getContext());
            } catch (Throwable unused) {
            }
        }
    }

    public void d(int i, String str, String str2) {
        Logger logger = this.logger;
        if ((logger == null || logger.sIsDebug || this.isLog) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (!TextUtils.isEmpty(str2) && str2.contains("http") && this.isLog && !this.logger.sIsDebug) {
                str2 = String2IntUtil.toEncrypted(str2);
            }
            if (str.contains("NearX-HLog_")) {
                str = str.replace("NearX-HLog_", "");
            }
            String strSubstring = PREFIX + str;
            if (strSubstring.length() > 22) {
                strSubstring = strSubstring.substring(0, 22);
            }
            String str3 = "[" + this.business + "]" + str2;
            if (i == 1) {
                Log.v(strSubstring, str3);
                return;
            }
            if (i == 2) {
                Log.d(strSubstring, str3);
                return;
            }
            if (i == 3) {
                Log.i(strSubstring, str3);
            } else if (i == 4) {
                Log.w(strSubstring, str3);
            } else {
                if (i != 5) {
                    return;
                }
                Log.e(strSubstring, str3);
            }
        }
    }

    public void debug(int i, String str, String str2) {
        Logger logger = this.logger;
        if ((logger == null || logger.sIsDebug) && !TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (!TextUtils.isEmpty(str2) && str2.contains("http") && this.isLog && !this.logger.sIsDebug) {
                str2 = String2IntUtil.toEncrypted(str2);
            }
            if (str.contains("NearX-HLog_")) {
                str = str.replace("NearX-HLog_", "");
            }
            String strSubstring = PREFIX + str;
            if (strSubstring.length() > 22) {
                strSubstring = strSubstring.substring(0, 22);
            }
            String str3 = "[" + this.business + "]" + str2;
            if (i == 1) {
                Log.v(strSubstring, str3);
                return;
            }
            if (i == 2) {
                Log.d(strSubstring, str3);
                return;
            }
            if (i == 3) {
                Log.i(strSubstring, str3);
            } else if (i == 4) {
                Log.w(strSubstring, str3);
            } else {
                if (i != 5) {
                    return;
                }
                Log.e(strSubstring, str3);
            }
        }
    }

    public boolean isLog() {
        return this.isLog;
    }
}
