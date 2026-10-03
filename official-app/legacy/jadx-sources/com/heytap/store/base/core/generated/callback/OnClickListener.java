package com.heytap.store.base.core.generated.callback;

import android.view.View;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    final Listener mListener;
    final int mSourceId;

    public interface Listener {
        void _internalCallbackOnClick(int i, View view);
    }

    public OnClickListener(Listener listener, int i) {
        this.mListener = listener;
        this.mSourceId = i;
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public void onClick(View view) {
        this.mListener._internalCallbackOnClick(this.mSourceId, view);
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }
}
