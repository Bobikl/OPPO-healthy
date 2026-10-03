package com.heytap.store.base.widget.blur;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import com.heytap.store.base.widget.R;

/* JADX INFO: loaded from: classes3.dex */
public class RealtimeBlurView extends View {
    private static int BLUR_IMPL;
    private static int RENDERING_COUNT;
    private static StopException STOP_EXCEPTION = new StopException();
    private Bitmap mBitmapToBlur;
    private final BlurImpl mBlurImpl;
    private float mBlurRadius;
    private Bitmap mBlurredBitmap;
    private Canvas mBlurringCanvas;
    private View mDecorView;
    private boolean mDifferentRoot;
    private boolean mDirty;
    private float mDownsampleFactor;
    private boolean mIsRendering;
    private int mOverlayColor;
    private Paint mPaint;
    private final Rect mRectDst;
    private final Rect mRectSrc;
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;

    public static class StopException extends RuntimeException {
        private StopException() {
        }
    }

    public RealtimeBlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRectSrc = new Rect();
        this.mRectDst = new Rect();
        this.preDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.heytap.store.base.widget.blur.RealtimeBlurView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                int[] iArr = new int[2];
                Bitmap bitmap = RealtimeBlurView.this.mBlurredBitmap;
                View view = RealtimeBlurView.this.mDecorView;
                if (view != null && RealtimeBlurView.this.isShown() && RealtimeBlurView.this.prepare() && !RealtimeBlurView.this.mBlurredBitmap.isRecycled() && !RealtimeBlurView.this.mBitmapToBlur.isRecycled()) {
                    boolean z = RealtimeBlurView.this.mBlurredBitmap != bitmap;
                    view.getLocationOnScreen(iArr);
                    int i = -iArr[0];
                    int i2 = -iArr[1];
                    RealtimeBlurView.this.getLocationOnScreen(iArr);
                    int i3 = i + iArr[0];
                    int i4 = i2 + iArr[1];
                    RealtimeBlurView.this.mBitmapToBlur.eraseColor(RealtimeBlurView.this.mOverlayColor & 16777215);
                    int iSave = RealtimeBlurView.this.mBlurringCanvas.save();
                    RealtimeBlurView.this.mIsRendering = true;
                    RealtimeBlurView.access$608();
                    try {
                        try {
                            RealtimeBlurView.this.mBlurringCanvas.scale((RealtimeBlurView.this.mBitmapToBlur.getWidth() * 1.0f) / RealtimeBlurView.this.getWidth(), (RealtimeBlurView.this.mBitmapToBlur.getHeight() * 1.0f) / RealtimeBlurView.this.getHeight());
                            RealtimeBlurView.this.mBlurringCanvas.translate(-i3, -i4);
                            if (view.getBackground() != null) {
                                view.getBackground().draw(RealtimeBlurView.this.mBlurringCanvas);
                            }
                            view.draw(RealtimeBlurView.this.mBlurringCanvas);
                        } catch (StopException e2) {
                            e2.printStackTrace();
                        }
                        RealtimeBlurView.this.mIsRendering = false;
                        RealtimeBlurView.access$610();
                        RealtimeBlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        RealtimeBlurView realtimeBlurView = RealtimeBlurView.this;
                        realtimeBlurView.blur(realtimeBlurView.mBitmapToBlur, RealtimeBlurView.this.mBlurredBitmap);
                        if (z || RealtimeBlurView.this.mDifferentRoot) {
                            RealtimeBlurView.this.invalidate();
                        }
                    } catch (Throwable th) {
                        RealtimeBlurView.this.mIsRendering = false;
                        RealtimeBlurView.access$610();
                        RealtimeBlurView.this.mBlurringCanvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                return true;
            }
        };
        this.mBlurImpl = getBlurImpl();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RealtimeBlurView);
        this.mBlurRadius = typedArrayObtainStyledAttributes.getDimension(R.styleable.RealtimeBlurView_realtimeBlurRadius, TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics()));
        this.mDownsampleFactor = typedArrayObtainStyledAttributes.getFloat(R.styleable.RealtimeBlurView_realtimeDownsampleFactor, 4.0f);
        this.mOverlayColor = typedArrayObtainStyledAttributes.getColor(R.styleable.RealtimeBlurView_realtimeOverlayColor, -1426063361);
        typedArrayObtainStyledAttributes.recycle();
        this.mPaint = new Paint();
    }

    public static /* synthetic */ int access$608() {
        int i = RENDERING_COUNT;
        RENDERING_COUNT = i + 1;
        return i;
    }

    public static /* synthetic */ int access$610() {
        int i = RENDERING_COUNT;
        RENDERING_COUNT = i - 1;
        return i;
    }

    private void releaseBitmap() {
        Bitmap bitmap = this.mBitmapToBlur;
        if (bitmap != null) {
            bitmap.recycle();
            this.mBitmapToBlur = null;
        }
        Bitmap bitmap2 = this.mBlurredBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.mBlurredBitmap = null;
        }
    }

    public void blur(Bitmap bitmap, Bitmap bitmap2) {
        this.mBlurImpl.blur(bitmap, bitmap2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.mIsRendering && RENDERING_COUNT <= 0) {
            super.draw(canvas);
        }
    }

    public void drawBlurredBitmap(Canvas canvas, Bitmap bitmap, int i) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.mRectSrc.right = bitmap.getWidth();
            this.mRectSrc.bottom = bitmap.getHeight();
            this.mRectDst.right = getWidth();
            this.mRectDst.bottom = getHeight();
            canvas.drawBitmap(bitmap, this.mRectSrc, this.mRectDst, (Paint) null);
        }
        this.mPaint.setColor(i);
        canvas.drawRect(this.mRectDst, this.mPaint);
    }

    public View getActivityDecorView() {
        Context context = getContext();
        for (int i = 0; i < 4 && context != null && !(context instanceof Activity) && (context instanceof ContextWrapper); i++) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView();
        }
        return null;
    }

    public BlurImpl getBlurImpl() {
        if (BLUR_IMPL == 0) {
            try {
                AndroidStockBlurImpl androidStockBlurImpl = new AndroidStockBlurImpl();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
                androidStockBlurImpl.prepare(getContext(), bitmapCreateBitmap, 4.0f);
                androidStockBlurImpl.release();
                bitmapCreateBitmap.recycle();
                BLUR_IMPL = 3;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (BLUR_IMPL == 0) {
            try {
                getClass().getClassLoader().loadClass("androidx.renderscript.RenderScript");
                AndroidXBlurImpl androidXBlurImpl = new AndroidXBlurImpl();
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(4, 4, Bitmap.Config.ARGB_8888);
                androidXBlurImpl.prepare(getContext(), bitmapCreateBitmap2, 4.0f);
                androidXBlurImpl.release();
                bitmapCreateBitmap2.recycle();
                BLUR_IMPL = 1;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        if (BLUR_IMPL == 0) {
            BLUR_IMPL = -1;
        }
        int i = BLUR_IMPL;
        if (i != 1) {
            return i != 3 ? new EmptyBlurImpl() : new AndroidStockBlurImpl();
        }
        return new AndroidXBlurImpl();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View activityDecorView = getActivityDecorView();
        this.mDecorView = activityDecorView;
        if (activityDecorView == null) {
            this.mDifferentRoot = false;
            return;
        }
        activityDecorView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
        boolean z = this.mDecorView.getRootView() != getRootView();
        this.mDifferentRoot = z;
        if (z) {
            this.mDecorView.postInvalidate();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        View view = this.mDecorView;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
        }
        release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBlurredBitmap(canvas, this.mBlurredBitmap, this.mOverlayColor);
    }

    public boolean prepare() {
        Bitmap bitmap;
        float f = this.mBlurRadius;
        if (f == 0.0f) {
            release();
            return false;
        }
        float f2 = this.mDownsampleFactor;
        float f3 = f / f2;
        if (f3 > 25.0f) {
            f2 = (f2 * f3) / 25.0f;
            f3 = 25.0f;
        }
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(1, (int) (width / f2));
        int iMax2 = Math.max(1, (int) (height / f2));
        boolean z = this.mDirty;
        if (this.mBlurringCanvas == null || (bitmap = this.mBlurredBitmap) == null || bitmap.getWidth() != iMax || this.mBlurredBitmap.getHeight() != iMax2) {
            releaseBitmap();
            try {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                    this.mBitmapToBlur = bitmapCreateBitmap;
                    if (bitmapCreateBitmap == null) {
                        release();
                        return false;
                    }
                    this.mBlurringCanvas = new Canvas(this.mBitmapToBlur);
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                    this.mBlurredBitmap = bitmapCreateBitmap2;
                    if (bitmapCreateBitmap2 == null) {
                        release();
                        return false;
                    }
                    z = true;
                } catch (OutOfMemoryError e2) {
                    e2.printStackTrace();
                    release();
                    return false;
                }
            } catch (Throwable unused) {
                release();
                return false;
            }
            release();
            return false;
        }
        if (z) {
            if (!this.mBlurImpl.prepare(getContext(), this.mBitmapToBlur, f3)) {
                return false;
            }
            this.mDirty = false;
        }
        return true;
    }

    public void release() {
        releaseBitmap();
        this.mBlurImpl.release();
    }

    public void setBlurRadius(float f) {
        if (this.mBlurRadius != f) {
            this.mBlurRadius = f;
            this.mDirty = true;
            invalidate();
        }
    }

    public void setDownsampleFactor(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Downsample factor must be greater than 0.");
        }
        if (this.mDownsampleFactor != f) {
            this.mDownsampleFactor = f;
            this.mDirty = true;
            releaseBitmap();
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.mOverlayColor != i) {
            this.mOverlayColor = i;
            invalidate();
        }
    }
}
