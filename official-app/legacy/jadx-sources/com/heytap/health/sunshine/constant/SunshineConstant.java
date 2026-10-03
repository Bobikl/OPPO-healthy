package com.heytap.health.sunshine.constant;

import androidx.compose.runtime.internal.StabilityInferred;
import java.time.LocalDate;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004¨\u0006 "}, d2 = {"Lcom/heytap/health/sunshine/constant/SunshineConstant;", "", "", "FRAG_POSITION", "Ljava/lang/String;", "", "RANK_ERROR", "I", "", "a", "Ljava/util/List;", "getBASE_LINES", "()Ljava/util/List;", "BASE_LINES", "EXCELLENT", "GOOD", "NORMAL", "POOR", "DEFAULT", "AGE_NOT_EXIST", SunshineConstant.SUNSHINE_NAME, "INVALID_DATA", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "DEFAULT_MIN_DATE", "SP_NAME", "SP_KEY_VITAMIN_D_INTAKE", "<init>", "()V", "AchievementLevel", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final class SunshineConstant {
    public static final int $stable;
    public static final int AGE_NOT_EXIST = 20113;
    public static final int DEFAULT = 0;
    public static final int EXCELLENT = 4;

    @NotNull
    public static final String FRAG_POSITION = "FRAG_POSITION";
    public static final int GOOD = 3;
    public static final int INVALID_DATA = 0;
    public static final int NORMAL = 2;
    public static final int POOR = 1;
    public static final int RANK_ERROR = -1;

    @NotNull
    public static final String SP_KEY_VITAMIN_D_INTAKE = "vitamin_d_intake";

    @NotNull
    public static final String SP_NAME = "sunshine_share_preference";

    @NotNull
    public static final String SUNSHINE_NAME = "SUNSHINE_NAME";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final LocalDate DEFAULT_MIN_DATE;

    @NotNull
    public static final SunshineConstant INSTANCE = new SunshineConstant();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<Integer> BASE_LINES = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{75, 50, 25});

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/health/sunshine/constant/SunshineConstant$AchievementLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "GOOD", "PERFECT", "sunshine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum AchievementLevel {
        NORMAL(0),
        GOOD(1),
        PERFECT(2);

        private final int value;

        AchievementLevel(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalDate localDateOf = LocalDate.of(2023, 1, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(2023, 1, 1)");
        DEFAULT_MIN_DATE = localDateOf;
        $stable = 8;
    }

    @NotNull
    public final LocalDate a() {
        return DEFAULT_MIN_DATE;
    }
}
