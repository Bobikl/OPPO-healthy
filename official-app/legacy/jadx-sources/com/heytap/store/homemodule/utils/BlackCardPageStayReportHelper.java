package com.heytap.store.homemodule.utils;

import com.heytap.store.apm.PageTrackBean;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u00020\tH\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/homemodule/utils/BlackCardPageStayReportHelper;", "", "()V", SensorsBean.PAGE_TITLE, "", "startTime", "", PageTrackBean.TOTAL_TIME, "onDestory", "", "onPause", "onStart", "oncreate", "refreshTime", "reportPageLeave", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BlackCardPageStayReportHelper {

    @NotNull
    private final String page_title = "黑卡专区页";
    private long startTime;
    private long totalTime;

    private final void refreshTime() {
        if (this.startTime == 0) {
            return;
        }
        this.totalTime += System.currentTimeMillis() - this.startTime;
    }

    private final void reportPageLeave() {
        if (this.totalTime == 0) {
            return;
        }
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("view_duration", this.totalTime / ((long) 1000));
        sensorsBean.setValue(SensorsBean.MODULE_CODE, ConstantsKt.BLACK_CARD_OMS_ID);
        sensorsBean.setValue(SensorsBean.PAGE_TITLE, this.page_title);
        StatisticsUtil.sensorsStatistics("ActivityPageLeave", sensorsBean);
    }

    public final void onDestory() {
        refreshTime();
        reportPageLeave();
    }

    public final void onPause() {
        refreshTime();
    }

    public final void onStart() {
        this.startTime = System.currentTimeMillis();
    }

    public final void oncreate() {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.MODULE_CODE, ConstantsKt.BLACK_CARD_OMS_ID);
        sensorsBean.setValue(SensorsBean.PAGE_TITLE, this.page_title);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.ACTIVITY_PAGE_VIEW, sensorsBean);
    }
}
