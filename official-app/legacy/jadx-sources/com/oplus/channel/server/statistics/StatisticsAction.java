package com.oplus.channel.server.statistics;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/oplus/channel/server/statistics/StatisticsAction;", "", "()V", "LIFE_CIRCLE_KEY", "", "LIFE_CIRCLE_VALUE_DESTROY", "LIFE_CIRCLE_VALUE_PAUSE", "LIFE_CIRCLE_VALUE_SUBSCRIBED", "LIFE_CIRCLE_VALUE_UNSUBSCRIBED", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StatisticsAction {

    @NotNull
    public static final StatisticsAction INSTANCE = new StatisticsAction();

    @NotNull
    public static final String LIFE_CIRCLE_KEY = "life_circle";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_DESTROY = "destroy";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_PAUSE = "pause";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_SUBSCRIBED = "subscribed";

    @NotNull
    public static final String LIFE_CIRCLE_VALUE_UNSUBSCRIBED = "unsubscribed";

    private StatisticsAction() {
    }
}
