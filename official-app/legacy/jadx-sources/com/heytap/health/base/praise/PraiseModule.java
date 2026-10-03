package com.heytap.health.base.praise;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/base/praise/PraiseModule;", "", "", "value", "I", "getValue", "()I", "", "netModuleKey", "Ljava/lang/String;", "getNetModuleKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "a", "INVALID_MODULE", "H5_POINTS_LOTTERY", "APP_COURSE_SHARE", "APP_RECORD_SHARE", "H5_POINTS_FLOATING_WINDOW", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public enum PraiseModule {
    INVALID_MODULE(-1, "invalidModule"),
    H5_POINTS_LOTTERY(0, "androidIntIuckPopWin"),
    APP_COURSE_SHARE(1, "androidShareCurr"),
    APP_RECORD_SHARE(2, "androidShareSport"),
    H5_POINTS_FLOATING_WINDOW(3, "androidIntSusWin");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String netModuleKey;
    private final int value;

    /* JADX INFO: renamed from: com.heytap.health.base.praise.PraiseModule$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/base/praise/PraiseModule$a;", "", "", "value", "Lcom/heytap/health/base/praise/PraiseModule;", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final PraiseModule a(int value) {
            PraiseModule praiseModule = PraiseModule.H5_POINTS_LOTTERY;
            if (value == praiseModule.getValue()) {
                return praiseModule;
            }
            PraiseModule praiseModule2 = PraiseModule.APP_COURSE_SHARE;
            if (value == praiseModule2.getValue()) {
                return praiseModule2;
            }
            PraiseModule praiseModule3 = PraiseModule.APP_RECORD_SHARE;
            return value == praiseModule3.getValue() ? praiseModule3 : PraiseModule.INVALID_MODULE;
        }
    }

    PraiseModule(int i, String str) {
        this.value = i;
        this.netModuleKey = str;
    }

    @JvmStatic
    @NotNull
    public static final PraiseModule getModuleFromValue(int i) {
        return INSTANCE.a(i);
    }

    @NotNull
    public final String getNetModuleKey() {
        return this.netModuleKey;
    }

    public final int getValue() {
        return this.value;
    }
}
