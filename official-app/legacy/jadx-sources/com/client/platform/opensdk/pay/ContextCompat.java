package com.client.platform.opensdk.pay;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class ContextCompat {
    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalCacheDirs();
    }
}
