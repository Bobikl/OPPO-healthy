package com.heytap.store.apm;

import android.view.View;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes19.dex */
public interface IProxyClickListener {

    public static class WrapClickListener implements View.OnClickListener {
        View.OnClickListener mBaseListener;
        IProxyClickListener mProxyListener;

        public WrapClickListener(View.OnClickListener onClickListener, IProxyClickListener iProxyClickListener) {
            this.mBaseListener = onClickListener;
            this.mProxyListener = iProxyClickListener;
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            View.OnClickListener onClickListener;
            IProxyClickListener iProxyClickListener = this.mProxyListener;
            if (!(iProxyClickListener == null ? false : iProxyClickListener.onProxyClick(this, view)) && (onClickListener = this.mBaseListener) != null) {
                onClickListener.onClick(view);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    boolean onProxyClick(WrapClickListener wrapClickListener, View view);
}
