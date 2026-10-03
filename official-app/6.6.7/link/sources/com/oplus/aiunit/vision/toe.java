package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0018\u00010\bR\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/toe;", "Landroid/view/ContextThemeWrapper;", "Landroid/content/Context;", "getApplicationContext", "a", "Landroid/content/Context;", "mHostContext", "base", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "<init>", "(Landroid/content/Context;Landroid/content/res/Resources$Theme;Landroid/content/Context;)V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
public class toe extends ContextThemeWrapper {

    @Nullable
    public final Context a;

    public toe(@Nullable Context context, @Nullable Resources.Theme theme, @Nullable Context context2) {
        super(context, theme);
        this.a = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @NotNull
    public Context getApplicationContext() {
        Context applicationContext;
        String str;
        Context context = this.a;
        if (context != null) {
            applicationContext = context.getApplicationContext();
            str = "mHostContext.applicationContext";
        } else {
            applicationContext = super.getApplicationContext();
            str = "super.getApplicationContext()";
        }
        Intrinsics.checkNotNullExpressionValue(applicationContext, str);
        return applicationContext;
    }
}
