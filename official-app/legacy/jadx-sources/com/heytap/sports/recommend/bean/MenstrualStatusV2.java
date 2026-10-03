package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/heytap/sports/recommend/bean/MenstrualStatusV2;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "MENSTRUAL_OTHER", "MENSTRUAL_PERIOD", "PROLIFERAT_PHASE", "OVULATION_PERIOD", "LUTEAL_PHASE", "PRE_MENSTRUAL_PERIOD", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum MenstrualStatusV2 {
    MENSTRUAL_OTHER(0),
    MENSTRUAL_PERIOD(1),
    PROLIFERAT_PHASE(2),
    OVULATION_PERIOD(3),
    LUTEAL_PHASE(4),
    PRE_MENSTRUAL_PERIOD(5);

    private final int value;

    MenstrualStatusV2(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
