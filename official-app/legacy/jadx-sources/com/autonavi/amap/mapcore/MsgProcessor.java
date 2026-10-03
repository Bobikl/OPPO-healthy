package com.autonavi.amap.mapcore;

import android.content.Context;
import com.oplus.aiunit.vision.f2n;

/* JADX INFO: loaded from: classes12.dex */
public class MsgProcessor {
    private static f2n mDelegate = new f2n();

    public static native int nativeInit(Context context);

    public static void nativeInitInfo(Context context, boolean z, String str, String str2, String str3, String[] strArr) {
        mDelegate.a(context, z, str, str2, str3, strArr);
        nativeInit(context);
    }

    public static void nativeMsgProcessor(String str, String str2) {
        mDelegate.b(str, str2);
    }
}
