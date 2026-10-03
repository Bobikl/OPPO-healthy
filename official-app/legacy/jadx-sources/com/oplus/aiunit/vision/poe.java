package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.praise.PraiseModule;
import com.heytap.health.operation.praiseguide.PraiseH5Type;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/poe;", "", "Companion", "a", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public final class poe {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "PraiseH5ParamsCompat";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.poe$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/poe$a;", "", "", "type", "Lcom/heytap/health/base/praise/PraiseModule;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final PraiseModule a(int type) {
            if (type == PraiseH5Type.POINTS_LOTTERY.getValue()) {
                return PraiseModule.H5_POINTS_LOTTERY;
            }
            a7b.f(poe.TAG, "transTypeToPraiseModule unknow h5Type:" + type);
            return PraiseModule.INVALID_MODULE;
        }
    }

    @JvmStatic
    @NotNull
    public static final PraiseModule a(int i) {
        return INSTANCE.a(i);
    }
}
