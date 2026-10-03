package com.heytap.store.base.core.util.exposure;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class ExposureScrollListener extends RecyclerView.OnScrollListener {
    private int mDelta;
    private int mOrientation;

    public ExposureScrollListener() {
        this(1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            ExposureUtil.getInstance().setScrolledPercentsCondition(new ExposureScrolledPercentsCondition(this.mDelta));
            ExposureUtil.getInstance().delayExposure(recyclerView);
            this.mDelta = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int i3 = this.mDelta;
        if (this.mOrientation == 1) {
            i = i2;
        }
        this.mDelta = i3 + i;
    }

    public ExposureScrollListener(int i) {
        this.mDelta = 0;
        this.mOrientation = i;
    }
}
