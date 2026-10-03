package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/y20;", "Lcom/oplus/aiunit/vision/z2d;", "Companion", "a", "olive-decoder-android_release"}, k = 1, mv = {1, 6, 0})
public interface y20 extends z2d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.y20$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/y20$a;", "", "Landroid/content/Context;", "context", "", "a", "<init>", "()V", "olive-decoder-android_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        @JvmStatic
        public final boolean a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            return packageManager.hasSystemFeature("oplus.software.gallery.olive");
        }
    }
}
