package com.heytap.sports.record.details.bean;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/record/details/bean/RunningAdvancedPage;", "", "index", "", "(Ljava/lang/String;II)V", "getIndex", "()I", "FIVE_KM_EVALUATION", "BURN_FAT_RATIO", "BURN_FAT_EFFICIENCY", "FAT_REDUCE", "NEW_FAT_REDUCE", "AEROBIC", "CARDIO_CAPACITY", "RECOVERY_TIME", "PHYSICAL_FITNESS", "PHYSICAL_POWER", "PACE_ANALYSIS", "MARATHON", "AVG_SWOLF", "LACTATE_THRESHOLDS", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum RunningAdvancedPage {
    FIVE_KM_EVALUATION(0),
    BURN_FAT_RATIO(1),
    BURN_FAT_EFFICIENCY(2),
    FAT_REDUCE(3),
    NEW_FAT_REDUCE(4),
    AEROBIC(5),
    CARDIO_CAPACITY(6),
    RECOVERY_TIME(7),
    PHYSICAL_FITNESS(8),
    PHYSICAL_POWER(9),
    PACE_ANALYSIS(10),
    MARATHON(11),
    AVG_SWOLF(12),
    LACTATE_THRESHOLDS(13);

    private final int index;

    RunningAdvancedPage(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }
}
