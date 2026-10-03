package com.heytap.health.annotation;

import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.gxe;

/* JADX INFO: loaded from: classes15.dex */
public enum ProcessName {
    MAIN("", true, "PM"),
    TRANSPORT(":transport", true, "PT"),
    SPORT_DAEMON_SERVICE(":SportDaemonService", true, alf.PS),
    ACCOUNT(":account", false, "PA"),
    PUSH_SERVICE(":pushservice", false, "PP"),
    REMOTE(":remote", false, "PR"),
    ONCE(gxe.ONCE_PROCESS_NAME, true, "PO"),
    UNKNOWN("^unknown", false, "PU"),
    ALL("^all", false, "PALL");

    public final String mPName;
    public final boolean mSupportProviderApi;
    public final String mTag;

    ProcessName(String str, boolean z, String str2) {
        this.mPName = str;
        this.mSupportProviderApi = z;
        this.mTag = str2;
    }

    public static ProcessName getProcessNameByName(String str) {
        ProcessName processName = MAIN;
        if (processName.mPName.equals(str)) {
            return processName;
        }
        ProcessName processName2 = TRANSPORT;
        if (processName2.mPName.equals(str)) {
            return processName2;
        }
        ProcessName processName3 = SPORT_DAEMON_SERVICE;
        if (processName3.mPName.equals(str)) {
            return processName3;
        }
        ProcessName processName4 = ACCOUNT;
        if (processName4.mPName.equals(str)) {
            return processName4;
        }
        ProcessName processName5 = PUSH_SERVICE;
        if (processName5.mPName.equals(str)) {
            return processName5;
        }
        ProcessName processName6 = REMOTE;
        if (processName6.mPName.equals(str)) {
            return processName6;
        }
        ProcessName processName7 = ONCE;
        return processName7.mPName.equals(str) ? processName7 : UNKNOWN;
    }
}
