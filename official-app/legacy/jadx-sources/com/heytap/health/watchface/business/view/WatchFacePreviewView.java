package com.heytap.health.watchface.business.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public class WatchFacePreviewView extends FrameLayout {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final COUIRoundImageView f7125j;
    public final SimpleVideoView k;

    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        }
    }

    public class b extends SimpleVideoView.c {
        public b() {
        }

        @Override // com.heytap.health.watchface.business.view.SimpleVideoView.c
        public void a() {
            ltl.a("WatchFacePreviewView", "onVideoCompleted");
            WatchFacePreviewView.this.setVideoVisible(false);
        }
    }

    public WatchFacePreviewView(Context context) {
        this(context, null);
    }

    public void a(String str) {
        this.k.setVideoUrl(str);
        this.k.o();
    }

    public ImageView getIvWatchFaceImage() {
        return this.f7125j;
    }

    public int getLayout() {
        return R$layout.watch_face_general_preview_view;
    }

    public SimpleVideoView getVideoView() {
        return this.k;
    }

    public void setVideoVisible(boolean z) {
        this.f7125j.setVisibility(z ? 8 : 0);
        this.k.setVisibility(z ? 0 : 8);
    }

    public void setWatchFaceImage(Bitmap bitmap) {
        this.f7125j.setImageBitmap(bitmap);
    }

    public WatchFacePreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WatchFacePreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, getLayout(), this);
        this.i = context;
        this.f7125j = (COUIRoundImageView) findViewById(R$id.iv_preview_img);
        SimpleVideoView simpleVideoView = (SimpleVideoView) findViewById(R$id.vb_preview_video);
        this.k = simpleVideoView;
        simpleVideoView.setOutlineProvider(new a());
        simpleVideoView.setClipToOutline(true);
        simpleVideoView.setOnVideoListener(new b());
    }
}
