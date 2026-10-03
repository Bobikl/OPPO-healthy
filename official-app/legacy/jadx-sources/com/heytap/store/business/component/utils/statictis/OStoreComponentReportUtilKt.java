package com.heytap.store.business.component.utils.statictis;

import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.platform.tools.LogUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a@\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003¨\u0006\f"}, d2 = {"reportLoadPageData", "", SensorsBean.PAGE_NAME, "", SensorsBean.PAGE_FIRST_RENDER_TIME, "", SensorsBean.PAGE_CACHE_RENDER_TIME, SensorsBean.PAGE_DATA_RENDER_TIME, SensorsBean.API_LOAD_TIME, SensorsBean.API_LOAD_STATUS, "", SensorsBean.API_NAME, "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class OStoreComponentReportUtilKt {
    public static final void reportLoadPageData(@NotNull String page_name, long j2, long j3, long j4, long j5, boolean z, @NotNull String apiName) {
        Intrinsics.checkNotNullParameter(page_name, "page_name");
        Intrinsics.checkNotNullParameter(apiName, "apiName");
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue(SensorsBean.PAGE_NAME, page_name);
        sensorsBean.setValue(SensorsBean.PAGE_FIRST_RENDER_TIME, j2);
        sensorsBean.setValue(SensorsBean.PAGE_CACHE_RENDER_TIME, j3);
        sensorsBean.setValue(SensorsBean.PAGE_DATA_RENDER_TIME, j4);
        sensorsBean.setValue(SensorsBean.API_LOAD_TIME, j5);
        sensorsBean.setValue(SensorsBean.API_LOAD_STATUS, z);
        sensorsBean.setValue(SensorsBean.API_NAME, apiName);
        LogUtils.INSTANCE.i("reportLoadPageData", "page_name:" + page_name + ",firstRenderTime:" + j2 + ",cacheRenderTime:" + j3 + ",dataRenderTime:" + j4 + ",apiLoadTime:" + j5 + ",apiStatus:" + z + ",apiName:" + apiName);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.PAGE_LOAD, sensorsBean);
    }
}
