package com.coloros.sceneservice.l;

import android.content.Context;
import android.content.Intent;
import com.coloros.sceneservice.m.f;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static final String Ac = "oppo.intent.action.sceneservice.CHECKUPDTE";
    public static final String Bc = "sceneservice_need_support_versioncode";
    public static final String Cc = "update_mode";
    public static final a INSTANCE = new a();
    public static final String TAG = "CheckUpdateHelper";
    public static final String UPDATE_TYPE = "update_type";

    public final void checkUpdate(int i, int i2, int i3, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        f.d(TAG, "checkUpdate() called with: minVersion = " + i + ", updateMode " + i2 + ", updateType = " + i3);
        Intent intent = new Intent(Ac);
        intent.putExtra(Bc, i);
        intent.putExtra(Cc, i2);
        intent.putExtra(UPDATE_TYPE, i3);
        intent.setPackage("com.coloros.sceneservice");
        try {
            context.sendBroadcast(intent);
        } catch (Exception e2) {
            f.e(TAG, "checkUpdate: sendBroadcast exception : " + e2);
        }
    }
}
