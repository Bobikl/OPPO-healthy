package com.oplus.aiunit.vision;

import android.app.Activity;
import java.lang.ref.SoftReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/gp;", "", "Landroid/app/Activity;", "activity", "", "b", "a", "Ljava/lang/ref/SoftReference;", "Ljava/lang/ref/SoftReference;", "currentActivityRef", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityReferenceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityReferenceManager.kt\ncom/oplus/pay/opensdk/taskwall/floatwindow/ActivityReferenceManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class gp {

    @NotNull
    public static final gp INSTANCE = new gp();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static SoftReference<Activity> currentActivityRef;

    @Nullable
    public final Activity a() {
        SoftReference<Activity> softReference = currentActivityRef;
        Activity activity = softReference != null ? softReference.get() : null;
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return activity;
        }
        currentActivityRef = null;
        return null;
    }

    public final void b(@Nullable Activity activity) {
        currentActivityRef = activity != null ? new SoftReference<>(activity) : null;
    }
}
