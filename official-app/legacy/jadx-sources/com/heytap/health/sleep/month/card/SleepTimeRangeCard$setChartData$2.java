package com.heytap.health.sleep.month.card;

import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.xqh;
import com.oplus.aiunit.vision.yqh;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "position", "", "size", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SleepTimeRangeCard$setChartData$2 extends Lambda implements Function2<Integer, Integer, String> {
    final /* synthetic */ xqh $sleepTimeMonthBean;
    final /* synthetic */ yqh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTimeRangeCard$setChartData$2(xqh xqhVar, yqh yqhVar) {
        super(2);
        this.$sleepTimeMonthBean = xqhVar;
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }

    @Nullable
    public final String invoke(int i, int i2) {
        if (i >= this.$sleepTimeMonthBean.a().size()) {
            return "";
        }
        mq8 mq8Var = mq8.INSTANCE;
        long jG = mq8Var.g(this.$sleepTimeMonthBean.a().get(i).getDate());
        if (yqh.r(null) == 2) {
            return i == 0 ? mq8Var.q(jG, "MMM") : String.valueOf(LocalDateTime.ofInstant(Instant.ofEpochMilli(jG), ZoneId.systemDefault()).toLocalDate().getMonthValue());
        }
        return i % 3 == 0 ? mq8Var.q(jG, "d") : "";
    }
}
