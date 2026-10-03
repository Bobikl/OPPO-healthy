package com.heytap.store.homemodule.helper;

import android.os.Handler;
import com.heytap.store.base.core.http.GlobalParams;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.platform.tools.LogUtils;

/* JADX INFO: loaded from: classes5.dex */
public class TabExposeHelper {
    private static final long STATISTICS_DELAY = 3000;
    private static final String TAG = "TabExposeUtil";
    private boolean isInternalStart;
    private final Handler mHandler;
    private String mOmsIdOrUrl = "";
    private String mTabName = "";
    boolean isFirst = true;
    private final Runnable handleStatistics = new Runnable() { // from class: com.oplus.aiunit.vision.imj
        @Override // java.lang.Runnable
        public final void run() {
            this.i.lambda$new$0();
        }
    };

    public TabExposeHelper(Handler handler, Boolean bool) {
        this.isInternalStart = false;
        this.mHandler = handler;
        this.isInternalStart = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        LogUtils.INSTANCE.d(TAG, "handleStatistics mOmsID = " + this.mOmsIdOrUrl + ", mTabName = " + this.mTabName);
        SensorsBean sensorsBean = new SensorsBean();
        if (GlobalParams.isCommunityAPP()) {
            sensorsBean.setValue("module", "商城频道");
        } else {
            sensorsBean.setValue("module", "首页频道");
        }
        sensorsBean.setValue("attach", this.mTabName);
        if (!this.isFirst) {
            sensorsBean.setValue(SensorsBean.MODULE_SOURCE, "内部切换");
            StatisticsUtil.sensorsStatistics(StatisticsUtil.SENSORS_STOREAPP_PAGE, sensorsBean);
            return;
        }
        sensorsBean.setValue(SensorsBean.MODULE_SOURCE, "启动进入");
        this.isFirst = false;
        if (this.isInternalStart) {
            return;
        }
        StatisticsUtil.sensorsStatistics(StatisticsUtil.SENSORS_STOREAPP_PAGE, sensorsBean);
    }

    public void setIsInternalStart(Boolean bool) {
        this.isInternalStart = bool.booleanValue();
    }

    public void statisticsCancel() {
        LogUtils.INSTANCE.d(TAG, "statisticsCancel if Needed, mOmsID = " + this.mOmsIdOrUrl + ", mTabName = " + this.mTabName);
        this.mHandler.removeCallbacks(this.handleStatistics);
    }

    public void statisticsDelay(String str, String str2) {
        statisticsCancel();
        LogUtils.INSTANCE.d(TAG, "statisticsDelay, mOmsID = " + this.mOmsIdOrUrl + ", mTabName = " + this.mTabName);
        this.mTabName = str;
        this.mOmsIdOrUrl = str2;
        this.mHandler.postDelayed(this.handleStatistics, 3000L);
    }
}
