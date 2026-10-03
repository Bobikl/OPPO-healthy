package com.heytap.store.homemodule.statistics;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.heytap.store.base.core.http.GlobalParams;
import com.heytap.store.base.core.util.exposure.Exposure;
import com.heytap.store.base.core.util.exposure.ExposureUtil;
import com.heytap.store.base.core.util.statistics.IStatisticsInfo;
import com.heytap.store.base.core.util.statistics.bean.SensorCommonPropertyJson;
import com.heytap.store.homemodule.data.HomeItemDetail;

/* JADX INFO: loaded from: classes5.dex */
public class StoreExposureUtils {
    private static final String COMMON_PROPERTIES = "common_properties";
    private static final String HOME_PAGE_EXPOSURE = "storeapp_ad_exp";
    private static final String TAG = "StoreStatisticsUtils";

    public static void attachHomePageExposure(View view, HomeExposureJson homeExposureJson, SensorCommonPropertyJson sensorCommonPropertyJson) {
        ExposureUtil.attachExposure(view, new Exposure("storeapp_ad_exp", homeExposureJson.getHomeExposureJson()));
        ExposureUtil.attachCommonProperties(view, new Exposure(COMMON_PROPERTIES, new SensorCommonPropertyJson().getSensorCommonProperty()));
    }

    public static String getAdDetail(HomeItemDetail homeItemDetail) {
        String name = (homeItemDetail == null || homeItemDetail.getLabelDetailsInfo() == null || homeItemDetail.getLabelDetailsInfo().getName() == null) ? "" : homeItemDetail.getLabelDetailsInfo().getName();
        if (homeItemDetail == null || homeItemDetail.getGoodsForm() == null || homeItemDetail.getGoodsForm().getNoStockType() == null || homeItemDetail.getGoodsForm().getNoStockType().intValue() != 20 || homeItemDetail.getGoodsForm().getNoStockStr() == null) {
            return name;
        }
        if (name.isEmpty()) {
            return homeItemDetail.getGoodsForm().getNoStockStr();
        }
        return name + "," + homeItemDetail.getGoodsForm().getNoStockStr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getModuleName(Context context, String... strArr) {
        String moduleName = context instanceof IStatisticsInfo ? ((IStatisticsInfo) context).getModuleName() : GlobalParams.isCommunityAPP() ? "商城" : "首页";
        if (strArr == null) {
            return moduleName;
        }
        StringBuilder sb = new StringBuilder(moduleName);
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                sb.append("-");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
