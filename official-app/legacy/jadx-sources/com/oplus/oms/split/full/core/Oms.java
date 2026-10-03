package com.oplus.oms.split.full.core;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.oplus.aiunit.vision.vbm;
import com.oplus.aiunit.vision.xhm;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class Oms {
    public static ClassLoader getSplitClassLoader(String str) {
        return xhm.a.a.a(str);
    }

    public static int getSplitVersionCode(Context context, String str) {
        return xhm.a.a.getSplitVersionCode(context, str);
    }

    public static void onApplicationCreate(Application application) {
        vbm.a.a.c(application);
    }

    public static void onApplicationGetResources(Resources resources) {
        vbm.a.a.b(resources);
    }

    public static void onAttachBaseContext(Context context, SplitConfiguration splitConfiguration) {
        vbm.a.a.a(context, splitConfiguration);
    }

    public static boolean scheduledDownload(Context context, List<String> list) {
        return xhm.a.a.b(context, list);
    }

    public static void setNetworkStrategy(int i) {
        xhm.a.a.a(i);
    }

    public static void unloadSplit(Context context, String str) {
        xhm.a.a.a(context, str);
    }
}
