package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public class t5i {
    public static final String ASSISTANT_STATUS_KEY = "assistant_status_key";
    public static final String CONVERSATION_SDK_VERSION_CODE = "speechassist_conversation_sdk_version_code";
    public static final String IS_SUPPORT_FULL_DUPLEX_CONVERSATION = "is_support_full_duplex_conversation";
    public static final String IS_SUPPORT_HALF_DUPLEX_CONVERSATION = "is_support_half_duplex_conversation";
    public static final String PKG_MELODY = "com.oplus.melody";
    public static final String PKG_SPEECH_ASSIST = "com.heytap.speechassist";

    public static int a(Context context, String str) {
        Integer numValueOf = null;
        if (context != null && str != null && !str.isEmpty()) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
                    numValueOf = Integer.valueOf((applicationInfo != null ? applicationInfo.metaData : null).getInt(CONVERSATION_SDK_VERSION_CODE, -1));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return -1;
    }
}
