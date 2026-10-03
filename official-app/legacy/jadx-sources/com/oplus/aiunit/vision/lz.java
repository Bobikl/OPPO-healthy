package com.oplus.aiunit.vision;

import com.health.heartrate.nativelibrary.NativeLib;
import com.health.heartrate.nativelibrary.paras.AlgoInputData;
import com.health.heartrate.nativelibrary.paras.AlgoOutputData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/lz;", "", "", "c", "Lcom/health/heartrate/nativelibrary/paras/AlgoInputData;", "input", "Lcom/health/heartrate/nativelibrary/paras/AlgoOutputData;", "b", "a", "Lcom/health/heartrate/nativelibrary/NativeLib;", "Lcom/health/heartrate/nativelibrary/NativeLib;", "nativeLib", "Ljava/lang/Object;", "algoLock", "", "Z", "mSessionActive", "d", "mFeedStarted", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class lz {

    @NotNull
    public static final lz INSTANCE = new lz();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final NativeLib nativeLib = new NativeLib();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Object algoLock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean mSessionActive;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean mFeedStarted;

    public final void a() {
        synchronized (algoLock) {
            if (mSessionActive || mFeedStarted) {
                mSessionActive = false;
                if (mFeedStarted) {
                    d6b.INSTANCE.a("AlgoDataUtil", "release");
                    nativeLib.heartRateReset();
                    mFeedStarted = false;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @NotNull
    public final AlgoOutputData b(@NotNull AlgoInputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        AlgoOutputData algoOutputData = new AlgoOutputData();
        synchronized (algoLock) {
            if (!mSessionActive) {
                d6b.INSTANCE.a("AlgoDataUtil", "feedAlgo ignored for inactive session");
                return algoOutputData;
            }
            nativeLib.heartRateCalculate(input, algoOutputData);
            mFeedStarted = true;
            Unit unit = Unit.INSTANCE;
            return algoOutputData;
        }
    }

    public final void c() {
        synchronized (algoLock) {
            mSessionActive = true;
            mFeedStarted = false;
            Unit unit = Unit.INSTANCE;
        }
    }
}
