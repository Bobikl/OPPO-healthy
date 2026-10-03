package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001f\u0010\u0012\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/spa;", "", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "c", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "mDispatch", "<init>", "(Landroid/content/Context;)V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
public class spa {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ExecutorService mDispatch;

    public spa(@NotNull Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.TAG = "CbManager";
        this.mDispatch = zq8.e("host_comm");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ExecutorService getMDispatch() {
        return this.mDispatch;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }
}
