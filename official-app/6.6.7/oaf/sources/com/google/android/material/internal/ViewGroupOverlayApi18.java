package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RequiresApi(18)
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {
    private final ViewGroupOverlay viewGroupOverlay;

    public ViewGroupOverlayApi18(@NonNull ViewGroup viewGroup) {
        this.viewGroupOverlay = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@NonNull Drawable drawable) {
        this.viewGroupOverlay.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@NonNull Drawable drawable) {
        this.viewGroupOverlay.remove(drawable);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@NonNull View view) {
        this.viewGroupOverlay.add(view);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@NonNull View view) {
        this.viewGroupOverlay.remove(view);
    }
}
