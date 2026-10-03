package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/vhc;", "", "Landroid/content/Context;", "context", "", "a", "Landroid/view/View;", "view", "allow", "", "b", "", "KEY_DARK_MODE_STYLE", "Ljava/lang/String;", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class vhc {

    @NotNull
    public static final vhc INSTANCE = new vhc();

    @NotNull
    public static final String KEY_DARK_MODE_STYLE = "DarkMode_style_key";

    @JvmStatic
    public static final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AppCompatDelegate.getDefaultNightMode() != 1 && 32 == (context.getResources().getConfiguration().uiMode & 48);
    }

    @JvmStatic
    public static final void b(@NotNull View view, boolean allow) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setForceDarkAllowed(allow);
    }
}
