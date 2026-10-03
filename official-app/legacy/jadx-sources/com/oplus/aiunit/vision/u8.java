package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.common.constants.AcBaseConstants;

/* JADX INFO: loaded from: classes6.dex */
public class u8 {
    public static String a(String str, AcBaseConstants.RequestApiType requestApiType) {
        return str + requestApiType.apiName + "_auth_api";
    }

    public static String b(String str) {
        return str + "_fail_count";
    }

    public static String c(String str) {
        return str + "_first_fail_time";
    }

    public static String d(String str) {
        return str + "_get_profile_api";
    }

    public static String e(String str) {
        return str + "_refresh_token_api";
    }

    public static String f(String str) {
        return str + "_refresh_v1_api";
    }

    public static String g(String str) {
        return str + "_success_count";
    }

    public static String h(String str) {
        return str + "_first_success_time";
    }
}
