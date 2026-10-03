package com.heytap.health.insight.ui.view;

import com.heytap.health.health.impl.R$string;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/insight/ui/view/IntroCard;", "", "cardTitleId", "", "cardMsgId", "cardDesc", "(Ljava/lang/String;IIILjava/lang/Integer;)V", "getCardDesc", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCardMsgId", "()I", "getCardTitleId", "SleepLaw", "DataTrend", "DataRelative", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum IntroCard {
    SleepLaw(R$string.home_insight_chart_type_1, R$string.home_insight_sleep_need_wear, Integer.valueOf(R$string.home_insight_sleep_percent)),
    DataTrend(R$string.home_insight_chart_type_2, R$string.home_insight_wear_need_wear, Integer.valueOf(R$string.home_insight_wear_days_percent)),
    DataRelative(R$string.health_insight_chart_type_3_v2, R$string.health_insight_cloud_sync_desc, null);


    @Nullable
    private final Integer cardDesc;
    private final int cardMsgId;
    private final int cardTitleId;

    IntroCard(int i, int i2, Integer num) {
        this.cardTitleId = i;
        this.cardMsgId = i2;
        this.cardDesc = num;
    }

    @Nullable
    public final Integer getCardDesc() {
        return this.cardDesc;
    }

    public final int getCardMsgId() {
        return this.cardMsgId;
    }

    public final int getCardTitleId() {
        return this.cardTitleId;
    }
}
