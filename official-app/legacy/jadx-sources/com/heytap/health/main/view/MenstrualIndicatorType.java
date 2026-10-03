package com.heytap.health.main.view;

import com.heytap.health.health.impl.R$drawable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/health/main/view/MenstrualIndicatorType;", "", "resId", "", "(Ljava/lang/String;II)V", "getResId", "()I", "setResId", "(I)V", "EMPTY", "PINK", "BLUE", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum MenstrualIndicatorType {
    EMPTY(R$drawable.health_menstrual_chart_indicator_empty),
    PINK(R$drawable.health_menstrual_chart_indicator),
    BLUE(R$drawable.health_menstrual_chart_indicator_blue);

    private int resId;

    MenstrualIndicatorType(int i) {
        this.resId = i;
    }

    public final int getResId() {
        return this.resId;
    }

    public final void setResId(int i) {
        this.resId = i;
    }
}
