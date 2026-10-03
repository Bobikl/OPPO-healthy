package com.amap.api.maps;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class SwipeDismissCallBack implements SwipeDismissTouchListener.DismissCallbacks {
    SwipeDismissView a;

    public SwipeDismissCallBack(SwipeDismissView swipeDismissView) {
        this.a = swipeDismissView;
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public boolean canDismiss(Object obj) {
        return true;
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onDismiss(View view, Object obj) {
        WearMapView.OnDismissCallback onDismissCallback = this.a.onDismissCallback;
        if (onDismissCallback != null) {
            onDismissCallback.onDismiss();
        }
    }

    @Override // com.amap.api.maps.SwipeDismissTouchListener.DismissCallbacks
    public void onNotifySwipe() {
        WearMapView.OnDismissCallback onDismissCallback = this.a.onDismissCallback;
        if (onDismissCallback != null) {
            onDismissCallback.onNotifySwipe();
        }
    }
}
