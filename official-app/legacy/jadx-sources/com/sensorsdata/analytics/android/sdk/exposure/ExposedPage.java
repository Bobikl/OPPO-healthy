package com.sensorsdata.analytics.android.sdk.exposure;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureConfig;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class ExposedPage {
    private static final String TAG = "SA.ExposedPage";
    private final WeakHashMap<View, ExposureView> mViewWeakHashMap = new WeakHashMap<>();
    private final Map<String, ExposureView> mExposureViewMap = new HashMap();
    private final ExposureVisible mExposureVisible = new ExposureVisible();

    private boolean isExposed(ExposureView exposureView) {
        boolean zIsLastVisible = exposureView.isLastVisible();
        View view = exposureView.getView();
        if (view == null) {
            return false;
        }
        Rect rect = new Rect();
        if (this.mExposureVisible.isVisible(view, rect)) {
            return !zIsLastVisible && visibleRect(view, rect, exposureView.getExposureData().getExposureConfig().getAreaRate());
        }
        exposureView.setLastVisible(false);
        return false;
    }

    private boolean viewIsExposed(ExposureView exposureView) {
        SAExposureData exposureData;
        SAExposureConfig exposureConfig;
        if (exposureView != null && (exposureData = exposureView.getExposureData()) != null && (exposureConfig = exposureData.getExposureConfig()) != null && exposureView.isAddExposureView()) {
            boolean zIsRepeated = exposureConfig.isRepeated();
            boolean zIsExposed = isExposed(exposureView);
            SALog.i(TAG, "viewIsExposed:" + zIsExposed);
            if (zIsRepeated) {
                if (zIsExposed) {
                    return true;
                }
            } else if (zIsExposed && (!exposureView.isExposed() || exposureView.isActivityChange())) {
                return true;
            }
        }
        return false;
    }

    private boolean visibleRect(View view, Rect rect, float f) {
        if (view == null) {
            return false;
        }
        SALog.i(TAG, "width = " + rect.width() + ", height = " + rect.height() + ", MeasuredHeight = " + view.getMeasuredHeight() + ", MeasuredWidth = " + view.getMeasuredWidth());
        return ((float) (rect.width() * rect.height())) >= ((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * f;
    }

    public synchronized void addExposureView(View view, ExposureView exposureView) {
        if (view == null || exposureView == null) {
            return;
        }
        this.mViewWeakHashMap.put(view, exposureView);
    }

    public synchronized ExposureView getExposureView(View view) {
        if (view == null) {
            return null;
        }
        return this.mViewWeakHashMap.get(view);
    }

    public synchronized List<ExposureView> getExposureViewList(View view) {
        ArrayList arrayList;
        this.mExposureVisible.cleanVisible();
        arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(this.mViewWeakHashMap.get(view));
        } else {
            for (View view2 : this.mViewWeakHashMap.keySet()) {
                if (view2 != null) {
                    ExposureView exposureView = this.mViewWeakHashMap.get(view2);
                    SALog.i(TAG, "getExposureViewList->exposureview:" + exposureView);
                    if (viewIsExposed(exposureView)) {
                        arrayList.add(exposureView);
                    }
                }
            }
            this.mExposureVisible.cleanVisible();
            Collections.sort(arrayList, new Comparator<ExposureView>() { // from class: com.sensorsdata.analytics.android.sdk.exposure.ExposedPage.1
                @Override // java.util.Comparator
                public int compare(ExposureView exposureView2, ExposureView exposureView3) {
                    return (int) (exposureView2.getAddTime() - exposureView3.getAddTime());
                }
            });
        }
        return arrayList;
    }

    public int getExposureViewSize() {
        return this.mViewWeakHashMap.size();
    }

    public Collection<ExposureView> getExposureViews() {
        return this.mViewWeakHashMap.values();
    }

    public synchronized void invisibleElement() {
        ExposureView exposureView;
        for (View view : this.mViewWeakHashMap.keySet()) {
            if (view != null && (exposureView = this.mViewWeakHashMap.get(view)) != null) {
                exposureView.setLastVisible(false);
            }
        }
    }

    public synchronized void removeExposureView(View view, String str) {
        if (view == null) {
            return;
        }
        ExposureView exposureView = getExposureView(view);
        if (exposureView != null && exposureView.getExposureData() != null) {
            if (exposureView.getExposureData().getIdentifier() == null || str == null) {
                if (exposureView.getExposureData().getIdentifier() == null && str == null) {
                    this.mViewWeakHashMap.remove(view);
                }
            } else if (exposureView.getExposureData().getIdentifier().equals(str)) {
                this.mViewWeakHashMap.remove(view);
                this.mExposureViewMap.remove(str);
            }
        }
    }

    public synchronized ExposureView getExposureView(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mExposureViewMap.get(str);
    }

    public synchronized void addExposureView(String str, ExposureView exposureView) {
        if (!TextUtils.isEmpty(str) && exposureView != null) {
            this.mExposureViewMap.put(str, exposureView);
        }
    }
}
