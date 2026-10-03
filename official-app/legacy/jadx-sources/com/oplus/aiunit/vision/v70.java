package com.oplus.aiunit.vision;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/v70;", "", "", "a", "b", "c", "<init>", "()V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public final class v70 {

    @NotNull
    public static final v70 INSTANCE = new v70();

    @JvmStatic
    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean a() {
        return true;
    }

    @JvmStatic
    @ChecksSdkIntAtLeast(api = 29)
    public static final boolean b() {
        return true;
    }

    @JvmStatic
    @ChecksSdkIntAtLeast(api = 34)
    public static final boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }
}
