package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$string;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/v77;", "", "", ParserTag.TAG_PERCENT, "a", "VALUE_LEVEL_1", "I", "VALUE_LEVEL_2", "VALUE_LEVEL_3", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class v77 {
    public static final int $stable = 0;

    @NotNull
    public static final v77 INSTANCE = new v77();
    public static final int VALUE_LEVEL_1 = 50;
    public static final int VALUE_LEVEL_2 = 70;
    public static final int VALUE_LEVEL_3 = 90;

    public final int a(int percent) {
        if (percent < 50) {
            return R$string.sports_record_fat_reduce_instruction_level_content1;
        }
        if (percent < 70) {
            return R$string.sports_record_fat_reduce_instruction_level_content2;
        }
        return percent < 90 ? R$string.sports_record_fat_reduce_instruction_level_content3 : R$string.sports_record_fat_reduce_instruction_level_content4;
    }
}
