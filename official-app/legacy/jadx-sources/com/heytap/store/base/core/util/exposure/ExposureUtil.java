package com.heytap.store.base.core.util.exposure;

import android.annotation.SuppressLint;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.util.NullObjectUtil;
import com.heytap.store.base.core.util.statistics.PagePathMap;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.product_support.util.RecommendProductDataReportKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ExposureUtil {
    private static final String TAG = "ExposureUtil";
    private WeakHandler<View> mViewWeakHandler;
    public static final int EXPOSURE_DATA_KEY = R.string.pf_core_base_exposure_data_key;
    public static final int COMMON_PROPERTIES_KEY = R.string.common_properties_key;
    private static ExposureUtil instance = new ExposureUtil();
    private ExposureVisibilityPercentsCondition visibilityPercentsCondition = new ExposureVisibilityPercentsCondition();
    private ExposureScrolledPercentsCondition scrolledPercentsCondition = new ExposureScrolledPercentsCondition(0);
    private List<Exposure> hasExposureSet = new ArrayList();

    private ExposureUtil() {
    }

    public static void attachCommonProperties(View view, Exposure exposure) {
        if (view == null) {
            return;
        }
        view.setTag(COMMON_PROPERTIES_KEY, exposure);
    }

    public static void attachExposure(View view, Exposure exposure) {
        if (view == null) {
            return;
        }
        PagePathMap.PathInfo pathInfo = PagePathMap.getPathInfo(exposure.getExposureProperties().optString("module"));
        if (pathInfo != null) {
            try {
                exposure.getExposureProperties().put(RecommendProductDataReportKt.FIRST_LVL_PATH, pathInfo.fistPath);
                exposure.getExposureProperties().put(RecommendProductDataReportKt.SECOND_LVL_PATH, pathInfo.secondPath);
            } catch (Exception unused) {
            }
        }
        view.setTag(EXPOSURE_DATA_KEY, exposure);
    }

    public static Exposure getAttachedCommonProperties(View view) {
        if (view == null) {
            return null;
        }
        try {
            Object tag = view.getTag(COMMON_PROPERTIES_KEY);
            if (tag instanceof Exposure) {
                return (Exposure) tag;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Exposure getAttachedExposure(View view) {
        Exposure exposure = null;
        if (view == null) {
            return null;
        }
        try {
            Object tag = view.getTag(EXPOSURE_DATA_KEY);
            if (!(tag instanceof Exposure)) {
                return null;
            }
            Exposure exposure2 = (Exposure) tag;
            try {
                JSONObject exposureProperties = exposure2.getExposureProperties();
                if (exposureProperties.has(SensorsBean.EXPOSURE_TIME)) {
                    Object obj = exposureProperties.get(SensorsBean.EXPOSURE_TIME);
                    if (obj instanceof Long) {
                        exposureProperties.put(SensorsBean.EXPOSURE_TIME, System.currentTimeMillis() - ((Long) obj).longValue());
                    }
                }
                return exposure2;
            } catch (Exception e2) {
                e = e2;
                exposure = exposure2;
            }
        } catch (Exception e3) {
            e = e3;
        }
        e.printStackTrace();
        return exposure;
    }

    public static ExposureUtil getInstance() {
        return instance;
    }

    private synchronized void handleHasExposureSet(List<Exposure> list) {
        this.hasExposureSet.addAll(list);
    }

    private void statisticsCommonProperties(List<Exposure> list) {
        if (NullObjectUtil.notNullNotEmpty(list)) {
            Iterator<Exposure> it = list.iterator();
            while (it.hasNext()) {
                StatisticsUtil.exposureCommonProperties(it.next().getExposureProperties());
            }
        }
    }

    private void statisticsExposure(List<Exposure> list) {
        if (NullObjectUtil.notNullNotEmpty(list)) {
            for (Exposure exposure : list) {
                StatisticsUtil.exposure(exposure.getExposureEvent(), exposure.getExposureProperties());
            }
        }
    }

    private void traverseViewAndCollectExposure(View view, List<Exposure> list, List<Exposure> list2) {
        ViewGroup viewGroup;
        int childCount;
        ExposureVisibilityPercentsCondition exposureVisibilityPercentsCondition = this.visibilityPercentsCondition;
        if (exposureVisibilityPercentsCondition != null && exposureVisibilityPercentsCondition.accept(view)) {
            try {
                Exposure attachedExposure = getAttachedExposure(view);
                if (NullObjectUtil.notNull(attachedExposure) && !list.contains(attachedExposure)) {
                    list.add(attachedExposure);
                }
                Exposure attachedCommonProperties = getAttachedCommonProperties(view);
                if (NullObjectUtil.notNull(attachedCommonProperties) && !list.contains(attachedCommonProperties)) {
                    list2.add(attachedCommonProperties);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) <= 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            traverseViewAndCollectExposure(viewGroup.getChildAt(i), list, list2);
        }
    }

    public synchronized void clearHasExposureSet() {
        LogUtils.INSTANCE.d(TAG, "clearHasExposureSet");
        List<Exposure> list = this.hasExposureSet;
        if (list != null) {
            list.clear();
        }
    }

    public void delayExposure(final View view) {
        if (view == null) {
            return;
        }
        view.postDelayed(new Runnable() { // from class: com.heytap.store.base.core.util.exposure.ExposureUtil.1
            @Override // java.lang.Runnable
            public void run() {
                ExposureUtil.this.doExposure(view);
            }
        }, 1000L);
    }

    @SuppressLint({"HandlerLeak"})
    public void doExposure(View view) {
        ExposureScrolledPercentsCondition exposureScrolledPercentsCondition;
        ExposureVisibilityPercentsCondition exposureVisibilityPercentsCondition;
        if (view == null || (exposureScrolledPercentsCondition = this.scrolledPercentsCondition) == null || !exposureScrolledPercentsCondition.accept((Integer) null) || (exposureVisibilityPercentsCondition = this.visibilityPercentsCondition) == null || !exposureVisibilityPercentsCondition.accept(view)) {
            return;
        }
        WeakHandler<View> weakHandler = this.mViewWeakHandler;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(null);
            this.mViewWeakHandler.sendEmptyMessage(0);
        } else {
            WeakHandler<View> weakHandler2 = new WeakHandler<View>(view) { // from class: com.heytap.store.base.core.util.exposure.ExposureUtil.2
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    super.handleMessage(message);
                    if (ExposureUtil.this.mViewWeakHandler != null) {
                        ExposureUtil.this.mViewWeakHandler.removeCallbacks(null);
                        if (ExposureUtil.this.mViewWeakHandler.getReference() != null) {
                            ExposureUtil exposureUtil = ExposureUtil.this;
                            exposureUtil.exposure((View) exposureUtil.mViewWeakHandler.getReference());
                        }
                        ExposureUtil.this.mViewWeakHandler = null;
                    }
                }
            };
            this.mViewWeakHandler = weakHandler2;
            weakHandler2.sendEmptyMessage(0);
        }
    }

    public void exposure(View view) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            traverseViewAndCollectExposure(view, arrayList, arrayList2);
            arrayList.removeAll(this.hasExposureSet);
            statisticsCommonProperties(arrayList2);
            statisticsExposure(arrayList);
            handleHasExposureSet(arrayList);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setScrolledPercentsCondition(ExposureScrolledPercentsCondition exposureScrolledPercentsCondition) {
        this.scrolledPercentsCondition = exposureScrolledPercentsCondition;
    }

    public void statisticsExposure(Exposure exposure) {
        try {
            PagePathMap.PathInfo pathInfo = PagePathMap.getPathInfo(exposure.getExposureProperties().optString("module"));
            if (pathInfo != null) {
                try {
                    exposure.getExposureProperties().put(RecommendProductDataReportKt.FIRST_LVL_PATH, pathInfo.fistPath);
                    exposure.getExposureProperties().put(RecommendProductDataReportKt.SECOND_LVL_PATH, pathInfo.secondPath);
                } catch (Exception unused) {
                }
            }
            StatisticsUtil.exposure(exposure.getExposureEvent(), exposure.getExposureProperties());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
