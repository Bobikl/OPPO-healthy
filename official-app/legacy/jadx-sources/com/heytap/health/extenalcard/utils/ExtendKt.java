package com.heytap.health.extenalcard.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.iim;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\t"}, d2 = {"Landroid/content/Context;", "context", "", ParserTag.TAG_URI, "", "authorized", iim.a.f, "", "startActivity", "extenalcard_release"}, k = 2, mv = {1, 8, 0})
public final class ExtendKt {
    public static /* synthetic */ void a(Context context, String str, boolean z, String str2, int i, Object obj) throws IllegalAccessException, InvocationTargetException {
        if ((i & 8) != 0) {
            str2 = null;
        }
        startActivity(context, str, z, str2);
    }

    @Keep
    public static final void startActivity(@NotNull Context context, @NotNull String uri, boolean z, @Nullable String str) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.heytap.health");
        intent.setData(Uri.parse(uri));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(268435456);
        if (str != null) {
            intent.putExtra("oplus.intent.extra.DESCRIPTION", str);
        }
        Intent.class.getMethod("setOplusFlags", Integer.TYPE).invoke(intent, Integer.valueOf(z ? 805306368 : 268435456));
        context.startActivity(intent);
    }
}
