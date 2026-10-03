package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/i72;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "", "a", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class i72 {

    @NotNull
    public static final i72 INSTANCE = new i72();

    @JvmStatic
    @SuppressLint({"WrongConstant"})
    public static final void a(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        if (!TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            intent.addFlags(16777216);
        }
        context.sendBroadcast(intent);
    }
}
