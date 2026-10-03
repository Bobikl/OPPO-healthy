package com.sensorsdata.analytics.android.sdk.exposure;

import android.view.View;
import com.sensorsdata.analytics.android.sdk.core.business.exposure.SAExposureData;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class ExposureView implements Cloneable {
    private boolean exposed;
    private SAExposureData exposureData;
    private boolean isActivityChange;
    private boolean isViewLayoutChange;
    private boolean lastVisible;
    private WeakReference<View> viewWeakReference;
    private boolean isAddExposureView = false;
    private final long addTime = System.nanoTime();

    public ExposureView(SAExposureData sAExposureData, boolean z, boolean z2, View view) {
        this.exposureData = sAExposureData;
        this.lastVisible = z;
        this.exposed = z2;
        this.viewWeakReference = new WeakReference<>(view);
    }

    public long getAddTime() {
        return this.addTime;
    }

    public SAExposureData getExposureData() {
        return this.exposureData;
    }

    public View getView() {
        WeakReference<View> weakReference = this.viewWeakReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean isActivityChange() {
        return this.isActivityChange;
    }

    public boolean isAddExposureView() {
        return this.isAddExposureView;
    }

    public boolean isExposed() {
        return this.exposed;
    }

    public boolean isLastVisible() {
        return this.lastVisible;
    }

    public boolean isViewLayoutChange() {
        return this.isViewLayoutChange;
    }

    public void setActivityChange(boolean z) {
        this.isActivityChange = z;
    }

    public void setAddExposureView(boolean z) {
        this.isAddExposureView = z;
    }

    public void setExposed(boolean z) {
        this.exposed = z;
    }

    public void setExposureData(SAExposureData sAExposureData) {
        this.exposureData = sAExposureData;
    }

    public void setLastVisible(boolean z) {
        this.lastVisible = z;
    }

    public void setView(View view) {
        this.viewWeakReference = new WeakReference<>(view);
    }

    public void setViewLayoutChange(boolean z) {
        this.isViewLayoutChange = z;
    }

    public String toString() {
        return "ExposureView{exposureData=" + this.exposureData + ", lastVisible=" + this.lastVisible + ", exposed=" + this.exposed + ", viewWeakReference=" + this.viewWeakReference.get() + ",isAddExposureView=" + this.isAddExposureView + ",isViewLayoutChange=" + this.isViewLayoutChange + '}';
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ExposureView m5267clone() throws CloneNotSupportedException {
        return (ExposureView) super.clone();
    }
}
