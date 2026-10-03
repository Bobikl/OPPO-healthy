package com.heytap.store.business.component.utils;

import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\u001a|\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001a.\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u001a.\u0010\u0014\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¨\u0006\u0015"}, d2 = {"liveJumpClickReport", "", "module", "", SensorsBean.AD_POSITION, "adId", "adName", "adDetail", SensorsBean.AD_STATUS, "streamId", "attach", SensorsBean.ATTACH2, SensorsBean.MODULE_CODE, "omsId", "weight", "", "liveReserveClickReport", "title", "roomId", "reservePlace", "liveReserveSuccessReport", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OStoreComponentReportKtKt {
    public static final void liveJumpClickReport(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, int i) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", str);
        if (str10 != null) {
            sensorsBean.setValue(SensorsBean.MODULE_CODE, str10);
        }
        sensorsBean.setValue(SensorsBean.AD_POSITION, str2);
        sensorsBean.setValue("adId", str3);
        sensorsBean.setValue("adName", str4);
        sensorsBean.setValue(SensorsBean.AD_DETAIL, str5);
        sensorsBean.setValue(SensorsBean.AD_STATUS, str6);
        sensorsBean.setValue(SensorsBean.STREAM_ID, str7);
        sensorsBean.setValue("attach", str8);
        sensorsBean.setValue(SensorsBean.ATTACH2, str9);
        sensorsBean.setValue("code", str11);
        sensorsBean.setValue("weight", i);
        StatisticsUtil.sensorsStatistics("storeapp_ad_clk", sensorsBean);
    }

    public static final void liveReserveClickReport(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", "直播");
        sensorsBean.setValue(SensorsBean.RESERVE_TYPE, "直播预约");
        sensorsBean.setValue(SensorsBean.LIVE_TITLE, str);
        sensorsBean.setValue(SensorsBean.LIVE_ID, str2);
        sensorsBean.setValue(SensorsBean.STREAM_ID, str3);
        sensorsBean.setValue(SensorsBean.RESERVE_PLACE, str4);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.RESERVE_CLICK, sensorsBean);
    }

    public static final void liveReserveSuccessReport(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", "直播");
        sensorsBean.setValue(SensorsBean.RESERVE_TYPE, "直播预约");
        sensorsBean.setValue(SensorsBean.LIVE_TITLE, str);
        sensorsBean.setValue(SensorsBean.LIVE_ID, str2);
        sensorsBean.setValue(SensorsBean.STREAM_ID, str3);
        sensorsBean.setValue(SensorsBean.RESERVE_PLACE, str4);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.RESERVE_SUCCESS, sensorsBean);
    }
}
