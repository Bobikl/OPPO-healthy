package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/xaf;", "", "Landroid/content/Context;", "context", "", "a", "", "RECONNECT_ACTION", "Ljava/lang/String;", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final class xaf {

    @NotNull
    public static final xaf INSTANCE = new xaf();

    @NotNull
    public static final String RECONNECT_ACTION = "com.heytap.health.iheytap_reconnect_api";

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(RECONNECT_ACTION);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, "com.heytap.wearable.linkservice.permission.WEARABLE");
    }
}
