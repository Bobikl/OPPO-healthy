package com.heytap.health.sunshine.constant;

import com.heytap.health.sunshine.R$string;
import com.oplus.aiunit.vision.qtf;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/health/sunshine/constant/VitaminLevel;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "NONE", "LOW", "MIDDLE", "ENOUGH", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public enum VitaminLevel {
    NONE,
    LOW,
    MIDDLE,
    ENOUGH;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.health.sunshine.constant.VitaminLevel$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/health/sunshine/constant/VitaminLevel$a;", "", "Lcom/heytap/health/sunshine/constant/VitaminLevel;", "level", "", "a", "<init>", "()V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: com.heytap.health.sunshine.constant.VitaminLevel$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0653a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VitaminLevel.values().length];
                try {
                    iArr[VitaminLevel.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VitaminLevel.LOW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VitaminLevel.MIDDLE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VitaminLevel.ENOUGH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull VitaminLevel level) {
            Intrinsics.checkNotNullParameter(level, "level");
            int i = C0653a.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 1) {
                return "--";
            }
            if (i == 2) {
                return qtf.l(R$string.health_sunshine_stat_vitamin_low);
            }
            if (i == 3) {
                return qtf.l(R$string.health_sunshine_stat_vitamin_middle);
            }
            if (i == 4) {
                return qtf.l(R$string.health_sunshine_stat_vitamin_enough);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
