package com.oplus.aiunit.vision;

import android.app.Activity;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/op;", "", "Landroid/app/Activity;", ParserTag.TAG_ACTIVITY, "", "b", "a", "Ljava/lang/ref/SoftReference;", "Ljava/lang/ref/SoftReference;", "currentActivityRef", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityReferenceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityReferenceManager.kt\ncom/oplus/pay/opensdk/taskwall/floatwindow/ActivityReferenceManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class op {

    @NotNull
    public static final op INSTANCE = new op();

    @Nullable
    public static SoftReference<Activity> a;

    @Nullable
    public final Activity a() {
        SoftReference<Activity> softReference = a;
        Activity activity = softReference != null ? softReference.get() : null;
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return activity;
        }
        a = null;
        return null;
    }

    public final void b(@Nullable Activity activity) {
        a = activity != null ? new SoftReference<>(activity) : null;
    }
}
