package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R*\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR(\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0012\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u0012\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/d97;", "", "Landroid/content/Context;", "context", "", "b", "", "region", "", "c", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setRegionMark", "(Ljava/lang/String;)V", "getRegionMark$annotations", "()V", "regionMark", "Z", "e", "()Z", "setVersionCN", "(Z)V", "isVersionCN$annotations", "isVersionCN", "d", "setUnsupportAttribution", "isUnsupportAttribution$annotations", "isUnsupportAttribution", "<init>", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class d97 {

    @NotNull
    public static final d97 INSTANCE = new d97();

    @Deprecated
    @Nullable
    public static String a;
    public static boolean b;
    public static boolean c;

    @Nullable
    public static final String a() {
        return a;
    }

    @JvmStatic
    public static final void b(@Nullable Context context) {
        if (context == null) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        b = INSTANCE.c("domestic");
        bb0.Companion companion = bb0.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(contentResolver, "cr");
        boolean zB = companion.b(contentResolver, "com.oplus.phonenoareainquire.unsupport_attribution");
        c = zB;
        if (zB) {
            return;
        }
        a = companion.a(contentResolver, "com.oplus.phonenoareainquire.region_mark", gqe.DEFAULT_LANGUAGE);
    }

    public static final boolean d() {
        return c;
    }

    public static final boolean e() {
        return b;
    }

    public final boolean c(String region) {
        return StringsKt.equals("domestic", region, true);
    }
}
