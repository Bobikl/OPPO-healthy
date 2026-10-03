package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import androidx.window.embedding.ActivityEmbeddingController;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/t8;", "", "Landroid/content/Context;", "context", "", "a", "b", "Landroid/app/Activity;", "activity", "c", "<init>", "()V", "account-app-sdk-webview_release"}, k = 1, mv = {1, 8, 0})
public final class t8 {

    @NotNull
    public static final t8 INSTANCE = new t8();

    @JvmStatic
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getResources().getConfiguration().toString();
        Intrinsics.checkNotNullExpressionValue(string, "context.resources.configuration.toString()");
        return StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) "oplus-magic-windows", false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c((Activity) context) || a(context);
    }

    @JvmStatic
    public static final boolean c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return ActivityEmbeddingController.INSTANCE.getInstance(activity).isActivityEmbedded(activity);
    }
}
