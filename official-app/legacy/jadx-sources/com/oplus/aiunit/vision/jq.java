package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ColorKt;
import com.heytap.sports.R$string;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/jq;", "", "", "aerobic", "", MapSchema.FIELD_NAME_ENTRY, "trainingEffect", "d", "level", "Landroidx/compose/ui/graphics/Color;", "a", "(I)J", "gScore", b2n.g, "LEVEL_1", "I", "LEVEL_2", "LEVEL_3", "LEVEL_4", "LEVEL_5", "LEVEL_6", "", "Ljava/util/List;", b2n.f, "()Ljava/util/List;", "levelStrArr", "b", "f", "levelDesStrArr", "c", "goMoreLevelStrArr", "goMoreLevelDescStrArr", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class jq {
    public static final int LEVEL_1 = 0;
    public static final int LEVEL_2 = 1;
    public static final int LEVEL_3 = 2;
    public static final int LEVEL_4 = 3;
    public static final int LEVEL_5 = 4;
    public static final int LEVEL_6 = 5;

    @NotNull
    public static final jq INSTANCE = new jq();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<Integer> levelStrArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.sports_record_aerobic_level1), Integer.valueOf(R$string.sports_record_aerobic_level2), Integer.valueOf(R$string.sports_record_aerobic_level3), Integer.valueOf(R$string.sports_record_aerobic_level4), Integer.valueOf(R$string.sports_record_aerobic_level5), Integer.valueOf(R$string.sports_record_aerobic_level6)});

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<Integer> levelDesStrArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.sports_record_aerobic_level_des1), Integer.valueOf(R$string.sports_record_aerobic_level_des2), Integer.valueOf(R$string.sports_record_aerobic_level_des3), Integer.valueOf(R$string.sports_record_aerobic_level_des4), Integer.valueOf(R$string.sports_record_aerobic_level_des5), Integer.valueOf(R$string.sports_record_aerobic_level_des6)});

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<Integer> goMoreLevelStrArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.sports_record_fat_reduce_instruction_level_content1), Integer.valueOf(R$string.sports_record_fat_reduce_instruction_level_content), Integer.valueOf(R$string.sports_record_fat_reduce_instruction_level_content2), Integer.valueOf(R$string.sports_record_fat_reduce_instruction_level_content3), Integer.valueOf(R$string.sports_record_fat_reduce_instruction_level_content4), Integer.valueOf(R$string.sports_health_record_exercise_evaluation_level6)});

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final List<Integer> goMoreLevelDescStrArr = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R$string.sports_health_record_exercise_evaluation_level1_content), Integer.valueOf(R$string.sports_health_record_exercise_evaluation_level2_content), Integer.valueOf(R$string.sports_health_record_exercise_evaluation_level3_content), Integer.valueOf(R$string.sports_health_record_exercise_evaluation_level4_content), Integer.valueOf(R$string.sports_health_record_exercise_evaluation_level5_content), Integer.valueOf(R$string.sports_health_record_exercise_evaluation_level6_content)});
    public static final int $stable = 8;

    public final long a(int level) {
        if (level == 0) {
            return ColorKt.Color(4293672510L);
        }
        if (level == 1) {
            return ColorKt.Color(4294804262L);
        }
        if (level == 2) {
            return ColorKt.Color(4294951694L);
        }
        if (level == 3) {
            return ColorKt.Color(4287027230L);
        }
        if (level != 4) {
            return level != 5 ? ColorKt.Color(4293672510L) : ColorKt.Color(4280708085L);
        }
        return ColorKt.Color(4280929640L);
    }

    @NotNull
    public final List<Integer> b() {
        return goMoreLevelDescStrArr;
    }

    @NotNull
    public final List<Integer> c() {
        return goMoreLevelStrArr;
    }

    public final int d(int trainingEffect) {
        if (trainingEffect > 45) {
            return 5;
        }
        if (trainingEffect > 39) {
            return 4;
        }
        if (trainingEffect > 29) {
            return 3;
        }
        if (trainingEffect > 19) {
            return 2;
        }
        return trainingEffect > 9 ? 1 : 0;
    }

    public final int e(float aerobic) {
        if (aerobic <= 0.9f) {
            return 0;
        }
        if (aerobic <= 1.9f) {
            return 1;
        }
        if (aerobic <= 2.9f) {
            return 2;
        }
        if (aerobic <= 3.9f) {
            return 3;
        }
        if (aerobic <= 4.9f) {
            return 4;
        }
        return aerobic <= 5.0f ? 5 : 0;
    }

    @NotNull
    public final List<Integer> f() {
        return levelDesStrArr;
    }

    @NotNull
    public final List<Integer> g() {
        return levelStrArr;
    }

    public final int h(int gScore) {
        StringBuilder sb = new StringBuilder();
        sb.append("gScore = ");
        sb.append(gScore);
        if (gScore <= 40) {
            return 50 + gScore;
        }
        if (gScore <= 45) {
            return ((gScore - 40) * 2) + 90;
        }
        if (gScore <= 60) {
            return 100 - (gScore - 45);
        }
        return 50;
    }
}
