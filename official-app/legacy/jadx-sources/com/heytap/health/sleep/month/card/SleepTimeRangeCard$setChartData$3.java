package com.heytap.health.sleep.month.card;

import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepTimeRangeCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTimeRangeCard.kt\ncom/heytap/health/sleep/month/card/SleepTimeRangeCard$setChartData$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
final class SleepTimeRangeCard$setChartData$3 extends Lambda implements Function1<Integer, String> {
    public static final SleepTimeRangeCard$setChartData$3 INSTANCE = new SleepTimeRangeCard$setChartData$3();

    public SleepTimeRangeCard$setChartData$3() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    @Nullable
    public final String invoke(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[2];
        int i2 = i / 60;
        if (i2 >= 24) {
            i2 -= 24;
        }
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i % 60);
        String str = String.format("%02d:%02d", Arrays.copyOf(objArr, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
