package com.heytap.device.data.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/heytap/device/data/utils/ScreenBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScreenBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action == null || !Intrinsics.areEqual(action, "android.intent.action.USER_PRESENT")) {
            return;
        }
        a7b.f(a.TAG, "get phone user unlock broadcast receiver");
        a.Companion c0278a = a.INSTANCE;
        c0278a.g(2);
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        c0278a.j(contextA);
    }
}
