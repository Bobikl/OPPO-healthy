package com.health.sleephrline;

import androidx.annotation.Keep;
import com.health.sleephrline.bean.HrPoint;
import com.health.sleephrline.bean.SleepHrResultBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/health/sleephrline/SDKProxy;", "", "()V", "calculate", "Lcom/health/sleephrline/bean/SleepHrResultBean;", "pointArray", "", "Lcom/health/sleephrline/bean/HrPoint;", "pointArrayLength", "", "sleepLength", "([Lcom/health/sleephrline/bean/HrPoint;II)Lcom/health/sleephrline/bean/SleepHrResultBean;", "initHealthLog", "", "healthLogProxy", "Lcom/health/sleephrline/HealthLogProxy;", "SleepHrLine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SDKProxy {
    @NotNull
    public final SleepHrResultBean calculate(@NotNull HrPoint[] pointArray, int pointArrayLength, int sleepLength) {
        Intrinsics.checkNotNullParameter(pointArray, "pointArray");
        SleepHrResultBean sleepHrResultBeanCalculate = SDKNative.calculate(pointArray, pointArrayLength, sleepLength);
        Intrinsics.checkNotNullExpressionValue(sleepHrResultBeanCalculate, "calculate(...)");
        return sleepHrResultBeanCalculate;
    }

    public final void initHealthLog(@NotNull HealthLogProxy healthLogProxy) {
        Intrinsics.checkNotNullParameter(healthLogProxy, "healthLogProxy");
        SDKNative.initHealthLog(healthLogProxy);
    }
}
