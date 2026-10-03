package com.oplus.statistics.util;

import android.content.Context;
import com.oplus.statistics.storage.PreferenceHandler;

/* JADX INFO: loaded from: classes8.dex */
public class AccountUtil {
    public static final String SSOID_DEFAULT = "0";

    public static String getSsoId(Context context) {
        return PreferenceHandler.getSsoID(context);
    }
}
