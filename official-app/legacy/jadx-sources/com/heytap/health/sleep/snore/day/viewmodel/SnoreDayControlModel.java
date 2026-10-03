package com.heytap.health.sleep.snore.day.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.sleep.snore.bean.SnoreDayBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.x05;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\""}, d2 = {"Lcom/heytap/health/sleep/snore/day/viewmodel/SnoreDayControlModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/heytap/health/sleep/snore/bean/SnoreDayBean;", "curSnoreDayBean", "", "startTimestamp", "endTimestamp", "", "y", "", "i", "Z", "w", "()Z", "setFirstDay", "(Z)V", "isFirstDay", "j", "x", "setLastDay", "isLastDay", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/sleep/snore/bean/SnoreDayBean;", "Lcom/heytap/health/base/livedata/OLiveData;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "u", "()Lcom/heytap/health/base/livedata/OLiveData;", "refreshViewOLive", LogFieldKey.MESSAGE_KEY, "v", "showRequestLoadingOLive", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SnoreDayControlModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isFirstDay;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isLastDay;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public SnoreDayBean curSnoreDayBean;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<SnoreDayBean> refreshViewOLive = new OLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<Boolean> showRequestLoadingOLive = new OLiveData<>();

    @NotNull
    public final OLiveData<SnoreDayBean> u() {
        return this.refreshViewOLive;
    }

    @NotNull
    public final OLiveData<Boolean> v() {
        return this.showRequestLoadingOLive;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsFirstDay() {
        return this.isFirstDay;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getIsLastDay() {
        return this.isLastDay;
    }

    public final void y(@NotNull SnoreDayBean curSnoreDayBean, long startTimestamp, long endTimestamp) {
        Intrinsics.checkNotNullParameter(curSnoreDayBean, "curSnoreDayBean");
        this.curSnoreDayBean = curSnoreDayBean;
        this.isFirstDay = curSnoreDayBean.getCurDayStartTime() <= startTimestamp || startTimestamp == 0;
        this.isLastDay = curSnoreDayBean.getCurDayEndTime() >= endTimestamp || endTimestamp == 0;
        String strA = x05.a(startTimestamp, "yyyy-MM-dd HH:mm:ss");
        String strA2 = x05.a(endTimestamp, "yyyy-MM-dd HH:mm:ss");
        String strA3 = x05.a(curSnoreDayBean.getCurDayStartTime(), "yyyy-MM-dd HH:mm:ss");
        String strA4 = x05.a(curSnoreDayBean.getCurDayEndTime() - ((long) 1000), "yyyy-MM-dd HH:mm:ss");
        boolean z = this.isFirstDay;
        boolean z2 = this.isLastDay;
        StringBuilder sb = new StringBuilder();
        sb.append("setCurSleepDayBean startTimestamp:");
        sb.append(strA);
        sb.append("/endTimestamp:");
        sb.append(strA2);
        sb.append("/sleepStart:");
        sb.append(strA3);
        sb.append("/sleepEnd:");
        sb.append(strA4);
        sb.append("/");
        sb.append(z);
        sb.append("/");
        sb.append(z2);
        this.refreshViewOLive.postValue(curSnoreDayBean);
    }
}
