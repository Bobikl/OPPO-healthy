package com.oplus.statistics.util;

import android.content.Context;
import com.oplus.statistics.storage.PreferenceHandler;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AccountUtil {
    public static final String SSOID_DEFAULT = "0";

    public static String getSsoId(Context context) {
        return PreferenceHandler.getSsoID(context);
    }
}
