package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/frj;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "a", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class frj {

    @NotNull
    public static final frj INSTANCE = new frj();

    public final void a(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        linkedHashMap.put("action", action);
        String str = intent.getPackage();
        linkedHashMap.put("intentPackageName", str != null ? str : "");
        linkedHashMap.put("nearmeVersion", String.valueOf(wbe.g(context, ebe.N_PAY_PKG_NAME)));
        linkedHashMap.put("oplusVersion", String.valueOf(wbe.g(context, ebe.O_PAY_PKG_NAME)));
        nni.INSTANCE.a(context, "event_id_sdk_start_intent_info", linkedHashMap);
    }
}
