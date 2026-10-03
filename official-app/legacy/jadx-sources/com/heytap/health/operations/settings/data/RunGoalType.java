package com.heytap.health.operations.settings.data;

import com.heytap.health.operations.R$string;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/operations/settings/data/RunGoalType;", "", "type", "", "descId", "(Ljava/lang/String;III)V", "getDescId", "()I", "getType", "OTHER", "FAT_LOSS_AND_WEIGHT_LOSS", "IMPROVE_ENDURANCE", "HALF_MARATHON", "MARATHON", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum RunGoalType {
    OTHER(0, R$string.settings_run_goal_other),
    FAT_LOSS_AND_WEIGHT_LOSS(1, R$string.settings_fat_loss_and_weight_loss),
    IMPROVE_ENDURANCE(2, R$string.settings_improve_endurance),
    HALF_MARATHON(3, R$string.settings_prepare_for_half_marathon),
    MARATHON(4, R$string.settings_prepare_for_marathon);

    private final int descId;
    private final int type;

    RunGoalType(int i, int i2) {
        this.type = i;
        this.descId = i2;
    }

    public final int getDescId() {
        return this.descId;
    }

    public final int getType() {
        return this.type;
    }
}
