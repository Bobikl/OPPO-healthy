package com.heytap.sports.home.bean;

import com.heytap.sports.R$drawable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/sports/home/bean/HomeIconColorType;", "", "improvementId", "", "noImprovementId", "(Ljava/lang/String;III)V", "getImprovementId", "()I", "getNoImprovementId", "ICON_COLOR_TYPE_YELLOW", "ICON_COLOR_TYPE_ORANGE", "ICON_COLOR_TYPE_BLUE", "ICON_COLOR_TYPE_GREEN", "ICON_COLOR_TYPE_LIGHT_GREEN", "ICON_COLOR_TYPE_PURPLE", "ICON_COLOR_TYPE_RED", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum HomeIconColorType {
    ICON_COLOR_TYPE_YELLOW(R$drawable.sports_ic_coach_tips_improvement_yellow, R$drawable.sports_ic_coach_tips_no_improvement_yellow),
    ICON_COLOR_TYPE_ORANGE(R$drawable.sports_ic_coach_tips_improvement_orange, R$drawable.sports_ic_coach_tips_no_improvement_orange),
    ICON_COLOR_TYPE_BLUE(R$drawable.sports_ic_coach_tips_improvement_blue, R$drawable.sports_ic_coach_tips_no_improvement_blue),
    ICON_COLOR_TYPE_GREEN(R$drawable.sports_ic_coach_tips_improvement_green, R$drawable.sports_ic_coach_tips_no_improvement_green),
    ICON_COLOR_TYPE_LIGHT_GREEN(R$drawable.sports_ic_coach_tips_improvement_light_green, R$drawable.sports_ic_coach_tips_no_improvement_light_green),
    ICON_COLOR_TYPE_PURPLE(R$drawable.sports_ic_coach_tips_improvement_purple, R$drawable.sports_ic_coach_tips_no_improvement_purple),
    ICON_COLOR_TYPE_RED(R$drawable.sports_ic_coach_tips_improvement_red, R$drawable.sports_ic_coach_tips_no_improvement_red);

    private final int improvementId;
    private final int noImprovementId;

    HomeIconColorType(int i, int i2) {
        this.improvementId = i;
        this.noImprovementId = i2;
    }

    public final int getImprovementId() {
        return this.improvementId;
    }

    public final int getNoImprovementId() {
        return this.noImprovementId;
    }
}
