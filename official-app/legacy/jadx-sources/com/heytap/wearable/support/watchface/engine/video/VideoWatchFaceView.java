package com.heytap.wearable.support.watchface.engine.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.VideoView;

/* JADX INFO: loaded from: classes2.dex */
public class VideoWatchFaceView extends VideoView {
    private static final float ASPECT_RATIO = 1.1840796f;

    public VideoWatchFaceView(Context context) {
        this(context, null);
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(0, i);
        int defaultSize2 = View.getDefaultSize(0, i2);
        int i3 = (int) (defaultSize * ASPECT_RATIO);
        setMeasuredDimension(defaultSize, i3);
        setTranslationY((defaultSize2 - i3) / 2.0f);
    }

    public void windowStopped(boolean z) {
    }

    public VideoWatchFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
