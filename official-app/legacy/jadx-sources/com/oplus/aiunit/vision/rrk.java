package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/rrk;", "", "", "time_second", "b", "a", "D", "mStartTime", "mPauseStartTime", "c", "mAllPauseTime", "<init>", "()V", "Companion", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class rrk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "COE_LOGGER";
    public static boolean d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public double mStartTime = -1.0d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public double mPauseStartTime = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public double mAllPauseTime;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.rrk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/rrk$a;", "", "", "debugLog", "Z", "a", "()Z", "setDebugLog", "(Z)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return rrk.d;
        }
    }

    public final double b(double time_second) {
        if (this.mStartTime < 0.0d) {
            this.mStartTime = time_second;
            this.mPauseStartTime = time_second;
            this.mAllPauseTime = 0.0d;
        }
        double d2 = this.mPauseStartTime;
        if (time_second - d2 > 0.5d) {
            this.mAllPauseTime += time_second - d2;
        }
        this.mPauseStartTime = time_second;
        return (time_second - this.mStartTime) - this.mAllPauseTime;
    }
}
