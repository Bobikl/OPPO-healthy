package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/dvk;", "", "", "time_second", "b", "a", "D", "mStartTime", "mPauseStartTime", "c", "mAllPauseTime", "<init>", "()V", "Companion", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public final class dvk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "COE_LOGGER";
    public static boolean d;
    public double a = -1.0d;
    public double b = -1.0d;
    public double c;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.dvk$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/dvk$a;", "", "", "debugLog", "Z", "a", "()Z", "setDebugLog", "(Z)V", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return dvk.d;
        }
    }

    public final double b(double time_second) {
        if (this.a < 0.0d) {
            this.a = time_second;
            this.b = time_second;
            this.c = 0.0d;
        }
        double d2 = this.b;
        if (time_second - d2 > 0.5d) {
            this.c += time_second - d2;
        }
        this.b = time_second;
        return (time_second - this.a) - this.c;
    }
}
