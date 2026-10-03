package com.heytap.health.daily.viewmodel;

import com.heytap.health.core.widget.charts.data.TimeStampedData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "o2", "invoke", "(Lcom/heytap/health/core/widget/charts/data/TimeStampedData;Lcom/heytap/health/core/widget/charts/data/TimeStampedData;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DailyActivityDetailViewModel$getMax$1 extends Lambda implements Function2<TimeStampedData, TimeStampedData, Integer> {
    public static final DailyActivityDetailViewModel$getMax$1 INSTANCE = new DailyActivityDetailViewModel$getMax$1();

    public DailyActivityDetailViewModel$getMax$1() {
        super(2);
    }

    @Override // p010kotlin.jvm.functions.Function2
    @NotNull
    public final Integer invoke(@NotNull TimeStampedData o1, @NotNull TimeStampedData o2) {
        Intrinsics.checkNotNullParameter(o1, "o1");
        Intrinsics.checkNotNullParameter(o2, "o2");
        return Integer.valueOf(Float.compare(o1.getY(), o2.getY()));
    }
}
