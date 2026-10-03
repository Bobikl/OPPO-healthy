package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/hvj;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "", "a", "<init>", "()V", "paysdk_release"}, k = 1, mv = {1, 8, 0})
public final class hvj {

    @NotNull
    public static final hvj INSTANCE = new hvj();

    public final void a(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        linkedHashMap.put(ParserTag.TAG_ACTION, action);
        String str = intent.getPackage();
        linkedHashMap.put("intentPackageName", str != null ? str : "");
        linkedHashMap.put("nearmeVersion", String.valueOf(vde.g(context, dde.N_PAY_PKG_NAME)));
        linkedHashMap.put("oplusVersion", String.valueOf(vde.g(context, dde.O_PAY_PKG_NAME)));
        fri.INSTANCE.a(context, "event_id_sdk_start_intent_info", linkedHashMap);
    }
}
