package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/c0;", "", "", "a", "", "SPNAME", "Ljava/lang/String;", c0.QUESTION_STATE, c0.SPORT_ANALYZE_STATE, c0.SPORT_RECOMMEND_STATE, c0.HEALTH_60S_RECOMMEND_STATE, "SPORTS_AI_ANALYZE_CLOUD_SWITCH", c0.DIALOG_AI_SWITCH_IS_SHOW, c0.DIALOG_AI_SWITCH_IS_SHOW_V2, "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class c0 {

    @NotNull
    public static final String DIALOG_AI_SWITCH_IS_SHOW = "DIALOG_AI_SWITCH_IS_SHOW";

    @NotNull
    public static final String DIALOG_AI_SWITCH_IS_SHOW_V2 = "DIALOG_AI_SWITCH_IS_SHOW_V2";

    @NotNull
    public static final String HEALTH_60S_RECOMMEND_STATE = "HEALTH_60S_RECOMMEND_STATE";

    @NotNull
    public static final c0 INSTANCE = new c0();

    @NotNull
    public static final String QUESTION_STATE = "QUESTION_STATE";

    @NotNull
    public static final String SPNAME = "AI";

    @NotNull
    public static final String SPORTS_AI_ANALYZE_CLOUD_SWITCH = "sports_ai_analyze_cloud_switch";

    @NotNull
    public static final String SPORT_ANALYZE_STATE = "SPORT_ANALYZE_STATE";

    @NotNull
    public static final String SPORT_RECOMMEND_STATE = "SPORT_RECOMMEND_STATE";

    public final boolean a() {
        return v9g.x(SPNAME).r(SPORTS_AI_ANALYZE_CLOUD_SWITCH, false) || qe0.A();
    }
}
