package com.heytap.health.bandface.widget.ucrop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.health.bandface.R$id;
import com.heytap.health.bandface.R$layout;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.CropBoundsChangeListener;
import com.yalantis.ucrop.callback.OverlayViewChangeListener;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class MinCropView extends FrameLayout {
    private MineCropImageView mGestureCropImageView;
    private final MinOverlayView mViewOverlay;

    public class a implements CropBoundsChangeListener {
        public a() {
        }

        @Override // com.yalantis.ucrop.callback.CropBoundsChangeListener
        public void onCropAspectRatioChanged(float f) {
            MinCropView.this.mViewOverlay.setTargetAspectRatio(f);
        }
    }

    public class b implements OverlayViewChangeListener {
        public b() {
        }

        @Override // com.yalantis.ucrop.callback.OverlayViewChangeListener
        public void onCropRectUpdated(RectF rectF) {
            MinCropView.this.mGestureCropImageView.setCropRect(rectF);
        }
    }

    public MinCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setListenersToViews() {
        this.mGestureCropImageView.setCropBoundsChangeListener(new a());
        this.mViewOverlay.setOverlayViewChangeListener(new b());
    }

    @NonNull
    public MineCropImageView getCropImageView() {
        return this.mGestureCropImageView;
    }

    @NonNull
    public MinOverlayView getOverlayView() {
        return this.mViewOverlay;
    }

    public void resetCropImageView() {
        removeView(this.mGestureCropImageView);
        this.mGestureCropImageView = new MineCropImageView(getContext());
        setListenersToViews();
        this.mGestureCropImageView.setCropRect(getOverlayView().getCropViewRect());
        addView(this.mGestureCropImageView, 0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public MinCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R$layout.band_photo_crop_view, (ViewGroup) this, true);
        this.mGestureCropImageView = (MineCropImageView) findViewById(R$id.image_view_crop);
        MinOverlayView minOverlayView = (MinOverlayView) findViewById(R$id.view_overlay);
        this.mViewOverlay = minOverlayView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ucrop_UCropView);
        minOverlayView.processStyledAttributes(typedArrayObtainStyledAttributes);
        this.mGestureCropImageView.processStyledAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        setListenersToViews();
    }
}
