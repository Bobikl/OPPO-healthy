package com.heytap.store.homemodule.statistics;

import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;

/* JADX INFO: loaded from: classes5.dex */
public class HomeLiveRepoMgrCommon {
    public static void LiveReserveClick(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", "直播");
        sensorsBean.setValue(SensorsBean.RESERVE_TYPE, "直播预约");
        sensorsBean.setValue(SensorsBean.LIVE_TITLE, str2);
        sensorsBean.setValue(SensorsBean.LIVE_ID, str3);
        sensorsBean.setValue(SensorsBean.STREAM_ID, str4);
        sensorsBean.setValue(SensorsBean.RESERVE_PLACE, str5);
        sensorsBean.setValue(SensorsBean.AD_POSITION, str6);
        sensorsBean.setValue("attach", str7);
        sensorsBean.setValue(SensorsBean.ATTACH2, str8);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.RESERVE_CLICK, sensorsBean);
    }

    public static void LiveReserveSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("module", "直播");
        sensorsBean.setValue(SensorsBean.RESERVE_TYPE, "直播预约");
        sensorsBean.setValue(SensorsBean.LIVE_TITLE, str2);
        sensorsBean.setValue(SensorsBean.LIVE_ID, str3);
        sensorsBean.setValue(SensorsBean.STREAM_ID, str4);
        sensorsBean.setValue(SensorsBean.RESERVE_PLACE, str5);
        sensorsBean.setValue(SensorsBean.AD_POSITION, str6);
        sensorsBean.setValue("attach", str7);
        sensorsBean.setValue(SensorsBean.ATTACH2, str8);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.RESERVE_SUCCESS, sensorsBean);
    }

    public static void liveJumpClick(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i) {
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
}
