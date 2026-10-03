package com.heytap.health.hrv.constant;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/hrv/constant/HrvConstant;", "", "", "FRAG_POSITION", "Ljava/lang/String;", "", "RANK_ERROR", "I", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "BASE_LINES", "GOOD", "RELAX", "NORMAL", "STRESS_OVER", "DEFAULT", "AGE_NOT_EXIST", HrvConstant.PHYSICAL_MENTAL_NAME, HrvConstant.SHOW_MEDAL_DATE, HrvConstant.SHOW_HRV_TIPS, HrvConstant.ACHIEVEMENT_SWITCH, HrvConstant.SETTING_GUIDE_TIP, "<init>", "()V", "AchievementLevel", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class HrvConstant {

    @NotNull
    public static final String ACHIEVEMENT_SWITCH = "ACHIEVEMENT_SWITCH";
    public static final int AGE_NOT_EXIST = 20113;
    public static final int DEFAULT = 0;

    @NotNull
    public static final String FRAG_POSITION = "FRAG_POSITION";
    public static final int GOOD = 4;
    public static final int NORMAL = 2;

    @NotNull
    public static final String PHYSICAL_MENTAL_NAME = "PHYSICAL_MENTAL_NAME";
    public static final int RANK_ERROR = -1;
    public static final int RELAX = 3;

    @NotNull
    public static final String SETTING_GUIDE_TIP = "SETTING_GUIDE_TIP";

    @NotNull
    public static final String SHOW_HRV_TIPS = "SHOW_HRV_TIPS";

    @NotNull
    public static final String SHOW_MEDAL_DATE = "SHOW_MEDAL_DATE";
    public static final int STRESS_OVER = 1;

    @NotNull
    public static final HrvConstant INSTANCE = new HrvConstant();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<Integer> BASE_LINES = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{75, 50, 25});
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/health/hrv/constant/HrvConstant$AchievementLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "GOOD", "PERFECT", "hrv_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    @NotNull
    public final List<Integer> a() {
        return BASE_LINES;
    }
}
