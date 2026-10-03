package com.heytap.health.health.hrv;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.alipay.sdk.m.x.c;
import com.oplus.aiunit.vision.HrvDateRangeStat;
import com.oplus.aiunit.vision.RelativeDateRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/health/hrv/HrvService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/oplus/aiunit/vision/dlf;", "dateRange", "Lcom/oplus/aiunit/vision/kg9;", "C8", "(Lcom/oplus/aiunit/vision/dlf;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "", c.d, "", "skipToday", "d5", "health_release"}, k = 1, mv = {1, 8, 0})
public interface HrvService extends IProvider {
    @Nullable
    Object C8(@NotNull RelativeDateRange relativeDateRange, @NotNull Continuation<? super HrvDateRangeStat> continuation);

    void d5(@NotNull Object skipToday);

    void v2(@NotNull Context context);
}
