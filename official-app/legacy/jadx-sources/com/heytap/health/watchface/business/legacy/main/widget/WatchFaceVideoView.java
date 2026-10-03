package com.heytap.health.watchface.business.legacy.main.widget;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.business.view.TextureVideoView;

/* JADX INFO: loaded from: classes19.dex */
public class WatchFaceVideoView extends TextureVideoView {

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), WatchFaceVideoView.this.getResources().getDimensionPixelSize(R$dimen.watch_face_margin_26));
        }
    }

    public WatchFaceVideoView(Context context) {
        this(context, null);
    }

    public final void A() {
        setOutlineProvider(new a());
        setClipToOutline(true);
    }

    public WatchFaceVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WatchFaceVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A();
    }
}
