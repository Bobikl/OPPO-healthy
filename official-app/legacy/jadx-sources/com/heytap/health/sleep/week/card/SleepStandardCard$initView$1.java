package com.heytap.health.sleep.week.card;

import com.heytap.health.base.i18n.WeekStrUtils;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", ClickApiEntity.TIME, "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SleepStandardCard$initView$1 extends Lambda implements Function2<Integer, Long, String> {
    public static final SleepStandardCard$initView$1 INSTANCE = new SleepStandardCard$initView$1();

    public SleepStandardCard$initView$1() {
        super(2);
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ String invoke(Integer num, Long l2) {
        return invoke(num.intValue(), l2.longValue());
    }

    @Nullable
    public final String invoke(int i, long j2) {
        return WeekStrUtils.c(j2);
    }
}
