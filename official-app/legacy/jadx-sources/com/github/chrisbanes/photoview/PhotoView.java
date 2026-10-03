package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.oplus.aiunit.vision.gid;
import com.oplus.aiunit.vision.hjd;
import com.oplus.aiunit.vision.ijd;
import com.oplus.aiunit.vision.jid;
import com.oplus.aiunit.vision.oie;
import com.oplus.aiunit.vision.sid;
import com.oplus.aiunit.vision.wid;
import com.oplus.aiunit.vision.zhd;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoView extends AppCompatImageView {
    public oie i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView.ScaleType f2303j;

    public PhotoView(Context context) {
        this(context, null);
    }

    public oie getAttacher() {
        return this.i;
    }

    public RectF getDisplayRect() {
        return this.i.B();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.i.E();
    }

    public float getMaximumScale() {
        return this.i.H();
    }

    public float getMediumScale() {
        return this.i.I();
    }

    public float getMinimumScale() {
        return this.i.J();
    }

    public float getScale() {
        return this.i.K();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.i.L();
    }

    public final void init() {
        this.i = new oie(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f2303j;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f2303j = null;
        }
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.i.O(z);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.i.b0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        oie oieVar = this.i;
        if (oieVar != null) {
            oieVar.b0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        oie oieVar = this.i;
        if (oieVar != null) {
            oieVar.b0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        oie oieVar = this.i;
        if (oieVar != null) {
            oieVar.b0();
        }
    }

    public void setMaximumScale(float f) {
        this.i.Q(f);
    }

    public void setMediumScale(float f) {
        this.i.R(f);
    }

    public void setMinimumScale(float f) {
        this.i.S(f);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.i.setOnClickListener(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.i.setOnLongClickListener(onLongClickListener);
    }

    public void setOnMatrixChangeListener(zhd zhdVar) {
        this.i.setOnMatrixChangeListener(zhdVar);
    }

    public void setOnOutsidePhotoTapListener(gid gidVar) {
        this.i.setOnOutsidePhotoTapListener(gidVar);
    }

    public void setOnPhotoTapListener(jid jidVar) {
        this.i.setOnPhotoTapListener(jidVar);
    }

    public void setOnScaleChangeListener(sid sidVar) {
        this.i.setOnScaleChangeListener(sidVar);
    }

    public void setOnSingleFlingListener(wid widVar) {
        this.i.setOnSingleFlingListener(widVar);
    }

    public void setOnViewDragListener(hjd hjdVar) {
        this.i.setOnViewDragListener(hjdVar);
    }

    public void setOnViewTapListener(ijd ijdVar) {
        this.i.setOnViewTapListener(ijdVar);
    }

    public void setRotationBy(float f) {
        this.i.T(f);
    }

    public void setRotationTo(float f) {
        this.i.U(f);
    }

    public void setScale(float f) {
        this.i.V(f);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        oie oieVar = this.i;
        if (oieVar == null) {
            this.f2303j = scaleType;
        } else {
            oieVar.Y(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.i.Z(i);
    }

    public void setZoomable(boolean z) {
        this.i.a0(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
