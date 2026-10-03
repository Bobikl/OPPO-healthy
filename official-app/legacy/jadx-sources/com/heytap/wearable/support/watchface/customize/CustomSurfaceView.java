package com.heytap.wearable.support.watchface.customize;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;

/* JADX INFO: loaded from: classes2.dex */
public class CustomSurfaceView extends SurfaceView {
    private static final String TAG = "CustomSurfaceView";

    public CustomSurfaceView(Context context) {
        super(context);
    }

    public void windowStopped(boolean z) {
        SdkDebugLog.d(TAG, "[windowStopped] stopped=" + z);
    }

    public CustomSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomSurfaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
