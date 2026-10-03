package com.heytap.health.base.view.circleprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.core.os.BundleCompat;
import com.heytap.health.base.R$styleable;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.oplus.aiunit.vision.a7b;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class CircularSeekBar extends View {
    protected static final int DEFAULT_CIRCLE_COLOR = -12303292;
    protected static final int DEFAULT_CIRCLE_FILL_COLOR = 0;
    protected static final float DEFAULT_CIRCLE_STROKE_WIDTH = 5.0f;
    protected static final float DEFAULT_CIRCLE_X_RADIUS = 30.0f;
    protected static final float DEFAULT_CIRCLE_Y_RADIUS = 30.0f;
    protected static final float DEFAULT_END_ANGLE = 270.0f;
    protected static final boolean DEFAULT_LOCK_ENABLED = true;
    protected static final boolean DEFAULT_MAINTAIN_EQUAL_CIRCLE = true;
    protected static final int DEFAULT_MAX = 29;
    protected static final boolean DEFAULT_MOVE_OUTSIDE_CIRCLE = false;
    protected static final int DEFAULT_POINTER_ALPHA = 135;
    protected static final int DEFAULT_POINTER_ALPHA_ONTOUCH = 100;
    protected static final float DEFAULT_POINTER_HALO_BORDER_WIDTH = 2.0f;
    protected static final float DEFAULT_POINTER_HALO_WIDTH = 6.0f;
    protected static final float DEFAULT_POINTER_RADIUS = 7.0f;
    protected static final int DEFAULT_PROGRESS = 0;
    protected static final float DEFAULT_START_ANGLE = 270.0f;
    protected static final boolean DEFAULT_USE_CUSTOM_RADII = false;
    private static final int MSG_DECREASE_PROGRESS = -1;
    private static final int MSG_INCREASE_PROGRESS = 1;
    protected final float DPTOPX_SCALE;
    protected final float MIN_TOUCH_TARGET_DP;
    protected float ccwDistanceFromEnd;
    protected float ccwDistanceFromPointer;
    protected float ccwDistanceFromStart;
    protected float cwDistanceFromEnd;
    protected float cwDistanceFromPointer;
    protected float cwDistanceFromStart;
    protected boolean isTouchEnabled;
    protected float lastCWDistanceFromStart;
    protected boolean lockAtEnd;
    protected boolean lockAtStart;
    protected boolean lockEnabled;
    protected int mCircleColor;
    protected int mCircleFillColor;
    protected Paint mCircleFillPaint;
    protected float mCircleHeight;
    protected Paint mCirclePaint;
    protected Path mCirclePath;
    protected int mCircleProgressColor;
    protected Paint mCircleProgressGlowPaint;
    protected Paint mCircleProgressPaint;
    protected Path mCircleProgressPath;
    protected RectF mCircleRectF;
    protected float mCircleStrokeWidth;
    protected float mCircleWidth;
    protected float mCircleXRadius;
    protected float mCircleYRadius;
    protected boolean mCustomRadii;
    protected float mEndAngle;
    private Handler mHandler;
    private View.OnTouchListener mInnerViewTouchListener;
    protected boolean mIsMovingCW;
    protected boolean mMaintainEqualCircle;
    protected int mMax;
    protected boolean mMoveOutsideCircle;
    protected b mOnCircularSeekBarChangeListener;
    protected int mPointerAlpha;
    protected int mPointerAlphaOnTouch;
    protected int mPointerColor;
    protected Paint mPointerHaloBorderPaint;
    protected float mPointerHaloBorderWidth;
    protected int mPointerHaloColor;
    protected int mPointerHaloColorOnTouch;
    protected Paint mPointerHaloPaint;
    protected float mPointerHaloWidth;
    protected Paint mPointerPaint;
    protected float mPointerPosition;
    protected float[] mPointerPositionXY;
    protected float mPointerRadius;
    protected int mProgress;
    protected float mProgressDegrees;
    protected float mStartAngle;
    protected float mTotalCircleDegrees;
    protected boolean mUserIsMovingPointer;
    protected static final int DEFAULT_CIRCLE_PROGRESS_COLOR = Color.argb(235, 74, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 255);
    protected static final int DEFAULT_POINTER_COLOR = Color.argb(235, 74, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 255);
    protected static final int DEFAULT_POINTER_HALO_COLOR = Color.argb(135, 74, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 255);
    protected static final int DEFAULT_POINTER_HALO_COLOR_ONTOUCH = Color.argb(135, 74, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 255);

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                CircularSeekBar circularSeekBar = CircularSeekBar.this;
                b bVar = circularSeekBar.mOnCircularSeekBarChangeListener;
                if (bVar != null) {
                    bVar.a(circularSeekBar);
                }
                CircularSeekBar.this.mHandler.removeMessages(-1);
                CircularSeekBar.this.mHandler.sendEmptyMessage(1);
                return false;
            }
            if (motionEvent.getAction() != 1) {
                return false;
            }
            CircularSeekBar circularSeekBar2 = CircularSeekBar.this;
            b bVar2 = circularSeekBar2.mOnCircularSeekBarChangeListener;
            if (bVar2 != null) {
                bVar2.b(circularSeekBar2);
            }
            CircularSeekBar.this.mHandler.removeMessages(1);
            CircularSeekBar.this.mHandler.sendEmptyMessage(-1);
            return false;
        }
    }

    public interface b {
        void a(CircularSeekBar circularSeekBar);

        void b(CircularSeekBar circularSeekBar);

        void c(CircularSeekBar circularSeekBar, int i, boolean z);
    }

    public static final class c extends Handler {
        public final SoftReference<CircularSeekBar> a;

        public c(CircularSeekBar circularSeekBar) {
            this.a = new SoftReference<>(circularSeekBar);
        }

        @Override // android.os.Handler
        public void dispatchMessage(@NonNull Message message) {
            CircularSeekBar circularSeekBar = this.a.get();
            if (circularSeekBar == null) {
                return;
            }
            int i = message.what;
            if (i == -1) {
                a7b.f("CircularSeekBar", "MSG_DECREASE_PROGRESS");
                circularSeekBar.setProgress(circularSeekBar.getProgress() - 1);
                if (circularSeekBar.getProgress() != 0) {
                    sendEmptyMessageDelayed(-1, 14L);
                    return;
                }
                return;
            }
            if (i != 1) {
                return;
            }
            a7b.f("CircularSeekBar", "MSG_INCREASE_PROGRESS :" + circularSeekBar.getProgress());
            sendEmptyMessageDelayed(1, 14L);
            if (circularSeekBar.getProgress() <= circularSeekBar.getMax()) {
                circularSeekBar.setProgress(circularSeekBar.getProgress() + 1);
            }
        }
    }

    public CircularSeekBar(Context context) {
        super(context);
        this.DPTOPX_SCALE = getResources().getDisplayMetrics().density;
        this.MIN_TOUCH_TARGET_DP = 48.0f;
        this.mCircleRectF = new RectF();
        this.mPointerColor = DEFAULT_POINTER_COLOR;
        this.mPointerHaloColor = DEFAULT_POINTER_HALO_COLOR;
        this.mPointerHaloColorOnTouch = DEFAULT_POINTER_HALO_COLOR_ONTOUCH;
        this.mCircleColor = DEFAULT_CIRCLE_COLOR;
        this.mCircleFillColor = 0;
        this.mCircleProgressColor = DEFAULT_CIRCLE_PROGRESS_COLOR;
        this.mPointerAlpha = 135;
        this.mPointerAlphaOnTouch = 100;
        this.lockEnabled = true;
        this.lockAtStart = true;
        this.lockAtEnd = false;
        this.mUserIsMovingPointer = false;
        this.mPointerPositionXY = new float[2];
        this.isTouchEnabled = true;
        this.mInnerViewTouchListener = null;
        this.mHandler = null;
        init(null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("");
        if (i >= 0 && this.mProgress != i) {
            this.mProgress = i;
            b bVar = this.mOnCircularSeekBarChangeListener;
            if (bVar != null) {
                bVar.c(this, i, false);
            }
            recalculateAll();
            invalidate();
            if (i == 0) {
                setVisibility(4);
                this.mHandler.removeCallbacksAndMessages(null);
            } else if (i == getMax() + 1) {
                this.mHandler.removeCallbacksAndMessages(null);
                this.mProgress = 0;
                setVisibility(4);
            } else if (getVisibility() != 0) {
                setVisibility(0);
            }
        }
    }

    public void calculatePointerAngle() {
        this.mPointerPosition = (((this.mProgress / this.mMax) * this.mTotalCircleDegrees) + this.mStartAngle) % 360.0f;
    }

    public void calculatePointerXYPosition() {
        PathMeasure pathMeasure = new PathMeasure(this.mCircleProgressPath, false);
        if (pathMeasure.getPosTan(pathMeasure.getLength(), this.mPointerPositionXY, null)) {
            return;
        }
        new PathMeasure(this.mCirclePath, false).getPosTan(0.0f, this.mPointerPositionXY, null);
    }

    public void calculateProgressDegrees() {
        float f = this.mPointerPosition - this.mStartAngle;
        this.mProgressDegrees = f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        this.mProgressDegrees = f;
    }

    public void calculateTotalDegrees() {
        float f = (360.0f - (this.mStartAngle - this.mEndAngle)) % 360.0f;
        this.mTotalCircleDegrees = f;
        if (f <= 0.0f) {
            this.mTotalCircleDegrees = 360.0f;
        }
    }

    public void clearProgress() {
        a7b.f("CircularSeekBar", "clearProgress");
        this.mHandler.removeCallbacksAndMessages(null);
        this.mProgress = 0;
        recalculateAll();
        invalidate();
        clearAnimation();
        setVisibility(4);
    }

    public int getCircleColor() {
        return this.mCircleColor;
    }

    public int getCircleFillColor() {
        return this.mCircleFillColor;
    }

    public int getCircleProgressColor() {
        return this.mCircleProgressColor;
    }

    public View.OnTouchListener getInnerViewTouchListener() {
        return this.mInnerViewTouchListener;
    }

    public boolean getIsTouchEnabled() {
        return this.isTouchEnabled;
    }

    public synchronized int getMax() {
        return this.mMax;
    }

    public int getPointerAlpha() {
        return this.mPointerAlpha;
    }

    public int getPointerAlphaOnTouch() {
        return this.mPointerAlphaOnTouch;
    }

    public int getPointerColor() {
        return this.mPointerColor;
    }

    public int getPointerHaloColor() {
        return this.mPointerHaloColor;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public void init(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.lib_base_CircularSeekBar, i, 0);
        initAttributes(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        initPaints();
        this.mHandler = new c(this);
        this.mInnerViewTouchListener = new a();
    }

    public void initAttributes(TypedArray typedArray) {
        this.mCircleXRadius = typedArray.getDimension(R$styleable.lib_base_CircularSeekBar_lib_base_circle_x_radius, this.DPTOPX_SCALE * 30.0f);
        this.mCircleYRadius = typedArray.getDimension(R$styleable.lib_base_CircularSeekBar_lib_base_circle_y_radius, this.DPTOPX_SCALE * 30.0f);
        this.mPointerRadius = typedArray.getDimension(R$styleable.lib_base_CircularSeekBar_lib_base_pointer_radius, this.DPTOPX_SCALE * DEFAULT_POINTER_RADIUS);
        this.mPointerHaloWidth = typedArray.getDimension(R$styleable.lib_base_CircularSeekBar_lib_base_pointer_halo_width, this.DPTOPX_SCALE * 6.0f);
        this.mPointerHaloBorderWidth = typedArray.getDimension(R$styleable.lib_base_CircularSeekBar_lib_base_pointer_halo_border_width, this.DPTOPX_SCALE * 2.0f);
        this.mCircleStrokeWidth = typedArray.getDimension(R$styleable.lib_base_CircularSeekBar_lib_base_circle_stroke_width, this.DPTOPX_SCALE * 5.0f);
        this.mPointerColor = typedArray.getColor(R$styleable.lib_base_CircularSeekBar_lib_base_pointer_color, DEFAULT_POINTER_COLOR);
        this.mPointerHaloColor = typedArray.getColor(R$styleable.lib_base_CircularSeekBar_lib_base_pointer_halo_color, DEFAULT_POINTER_HALO_COLOR);
        this.mPointerHaloColorOnTouch = typedArray.getColor(R$styleable.lib_base_CircularSeekBar_lib_base_pointer_halo_color_ontouch, DEFAULT_POINTER_HALO_COLOR_ONTOUCH);
        this.mCircleColor = typedArray.getColor(R$styleable.lib_base_CircularSeekBar_lib_base_circle_color, DEFAULT_CIRCLE_COLOR);
        this.mCircleProgressColor = typedArray.getColor(R$styleable.lib_base_CircularSeekBar_lib_base_circle_progress_color, DEFAULT_CIRCLE_PROGRESS_COLOR);
        this.mCircleFillColor = typedArray.getColor(R$styleable.lib_base_CircularSeekBar_lib_base_circle_fill, 0);
        this.mPointerAlpha = Color.alpha(this.mPointerHaloColor);
        int i = typedArray.getInt(R$styleable.lib_base_CircularSeekBar_lib_base_pointer_alpha_ontouch, 100);
        this.mPointerAlphaOnTouch = i;
        if (i > 255 || i < 0) {
            this.mPointerAlphaOnTouch = 100;
        }
        this.mMax = typedArray.getInt(R$styleable.lib_base_CircularSeekBar_lib_base_max, 29);
        this.mProgress = typedArray.getInt(R$styleable.lib_base_CircularSeekBar_lib_base_progress, 0);
        this.mCustomRadii = typedArray.getBoolean(R$styleable.lib_base_CircularSeekBar_lib_base_use_custom_radii, false);
        this.mMaintainEqualCircle = typedArray.getBoolean(R$styleable.lib_base_CircularSeekBar_lib_base_maintain_equal_circle, true);
        this.mMoveOutsideCircle = typedArray.getBoolean(R$styleable.lib_base_CircularSeekBar_lib_base_move_outside_circle, false);
        this.lockEnabled = typedArray.getBoolean(R$styleable.lib_base_CircularSeekBar_lib_base_lock_enabled, true);
        this.mStartAngle = ((typedArray.getFloat(R$styleable.lib_base_CircularSeekBar_lib_base_start_angle, 270.0f) % 360.0f) + 360.0f) % 360.0f;
        float f = ((typedArray.getFloat(R$styleable.lib_base_CircularSeekBar_lib_base_end_angle, 270.0f) % 360.0f) + 360.0f) % 360.0f;
        this.mEndAngle = f;
        if (this.mStartAngle == f) {
            this.mEndAngle = f - 0.1f;
        }
    }

    public void initPaints() {
        Paint paint = new Paint();
        this.mCirclePaint = paint;
        paint.setAntiAlias(true);
        this.mCirclePaint.setDither(true);
        this.mCirclePaint.setColor(this.mCircleColor);
        this.mCirclePaint.setStrokeWidth(this.mCircleStrokeWidth);
        this.mCirclePaint.setStyle(Paint.Style.STROKE);
        this.mCirclePaint.setStrokeJoin(Paint.Join.ROUND);
        this.mCirclePaint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.mCircleFillPaint = paint2;
        paint2.setAntiAlias(true);
        this.mCircleFillPaint.setDither(true);
        this.mCircleFillPaint.setColor(this.mCircleFillColor);
        this.mCircleFillPaint.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.mCircleProgressPaint = paint3;
        paint3.setAntiAlias(true);
        this.mCircleProgressPaint.setDither(true);
        this.mCircleProgressPaint.setColor(this.mCircleProgressColor);
        this.mCircleProgressPaint.setStrokeWidth(this.mCircleStrokeWidth);
        this.mCircleProgressPaint.setStyle(Paint.Style.STROKE);
        this.mCircleProgressPaint.setStrokeJoin(Paint.Join.ROUND);
        this.mCircleProgressPaint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint();
        this.mCircleProgressGlowPaint = paint4;
        paint4.set(this.mCircleProgressPaint);
        this.mCircleProgressGlowPaint.setMaskFilter(new BlurMaskFilter(this.DPTOPX_SCALE * 5.0f, BlurMaskFilter.Blur.NORMAL));
        Paint paint5 = new Paint();
        this.mPointerPaint = paint5;
        paint5.setAntiAlias(true);
        this.mPointerPaint.setDither(true);
        this.mPointerPaint.setStyle(Paint.Style.FILL);
        this.mPointerPaint.setColor(this.mPointerColor);
        this.mPointerPaint.setStrokeWidth(this.mPointerRadius);
        Paint paint6 = new Paint();
        this.mPointerHaloPaint = paint6;
        paint6.set(this.mPointerPaint);
        this.mPointerHaloPaint.setColor(this.mPointerHaloColor);
        this.mPointerHaloPaint.setAlpha(this.mPointerAlpha);
        this.mPointerHaloPaint.setStrokeWidth(this.mPointerRadius + this.mPointerHaloWidth);
        Paint paint7 = new Paint();
        this.mPointerHaloBorderPaint = paint7;
        paint7.set(this.mPointerPaint);
        this.mPointerHaloBorderPaint.setStrokeWidth(this.mPointerHaloBorderWidth);
        this.mPointerHaloBorderPaint.setStyle(Paint.Style.STROKE);
    }

    public void initPaths() {
        Path path = new Path();
        this.mCirclePath = path;
        path.addArc(this.mCircleRectF, this.mStartAngle, this.mTotalCircleDegrees);
        Path path2 = new Path();
        this.mCircleProgressPath = path2;
        path2.addArc(this.mCircleRectF, this.mStartAngle, this.mProgressDegrees);
    }

    public void initRects() {
        RectF rectF = this.mCircleRectF;
        float f = this.mCircleWidth;
        float f2 = this.mCircleHeight;
        rectF.set(-f, -f2, f, f2);
    }

    public boolean isLockEnabled() {
        return this.lockEnabled;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getWidth() / 2, getHeight() / 2);
        canvas.drawPath(this.mCirclePath, this.mCirclePaint);
        canvas.drawPath(this.mCircleProgressPath, this.mCircleProgressPaint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        if (this.mMaintainEqualCircle) {
            int iMin = Math.min(defaultSize2, defaultSize);
            setMeasuredDimension(iMin, iMin);
        } else {
            setMeasuredDimension(defaultSize2, defaultSize);
        }
        float f = this.mCircleStrokeWidth;
        float f2 = this.mPointerRadius;
        float f3 = this.mPointerHaloBorderWidth;
        float f4 = (((defaultSize / 2.0f) - f) - f2) - (f3 * 1.5f);
        this.mCircleHeight = f4;
        float f5 = (((defaultSize2 / 2.0f) - f) - f2) - (f3 * 1.5f);
        this.mCircleWidth = f5;
        if (this.mCustomRadii) {
            float f6 = this.mCircleYRadius;
            if (((f6 - f) - f2) - f3 < f4) {
                this.mCircleHeight = ((f6 - f) - f2) - (f3 * 1.5f);
            }
            float f7 = this.mCircleXRadius;
            if (((f7 - f) - f2) - f3 < f5) {
                this.mCircleWidth = ((f7 - f) - f2) - (f3 * 1.5f);
            }
        }
        if (this.mMaintainEqualCircle) {
            float fMin = Math.min(this.mCircleHeight, this.mCircleWidth);
            this.mCircleHeight = fMin;
            this.mCircleWidth = fMin;
        }
        recalculateAll();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState((Parcelable) BundleCompat.getParcelable(bundle, "PARENT", Parcelable.class));
        this.mMax = bundle.getInt("MAX");
        this.mProgress = bundle.getInt("PROGRESS");
        this.mCircleColor = bundle.getInt("mCircleColor");
        this.mCircleProgressColor = bundle.getInt("mCircleProgressColor");
        this.mPointerColor = bundle.getInt("mPointerColor");
        this.mPointerHaloColor = bundle.getInt("mPointerHaloColor");
        this.mPointerHaloColorOnTouch = bundle.getInt("mPointerHaloColorOnTouch");
        this.mPointerAlpha = bundle.getInt("mPointerAlpha");
        this.mPointerAlphaOnTouch = bundle.getInt("mPointerAlphaOnTouch");
        this.lockEnabled = bundle.getBoolean("lockEnabled");
        this.isTouchEnabled = bundle.getBoolean("isTouchEnabled");
        initPaints();
        recalculateAll();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("PARENT", parcelableOnSaveInstanceState);
        bundle.putInt("MAX", this.mMax);
        bundle.putInt("PROGRESS", this.mProgress);
        bundle.putInt("mCircleColor", this.mCircleColor);
        bundle.putInt("mCircleProgressColor", this.mCircleProgressColor);
        bundle.putInt("mPointerColor", this.mPointerColor);
        bundle.putInt("mPointerHaloColor", this.mPointerHaloColor);
        bundle.putInt("mPointerHaloColorOnTouch", this.mPointerHaloColorOnTouch);
        bundle.putInt("mPointerAlpha", this.mPointerAlpha);
        bundle.putInt("mPointerAlphaOnTouch", this.mPointerAlphaOnTouch);
        bundle.putBoolean("lockEnabled", this.lockEnabled);
        bundle.putBoolean("isTouchEnabled", this.isTouchEnabled);
        return bundle;
    }

    public void recalculateAll() {
        calculateTotalDegrees();
        calculatePointerAngle();
        calculateProgressDegrees();
        initRects();
        initPaths();
        calculatePointerXYPosition();
    }

    public void setCircleColor(int i) {
        this.mCircleColor = i;
        this.mCirclePaint.setColor(i);
        invalidate();
    }

    public void setCircleFillColor(int i) {
        this.mCircleFillColor = i;
        this.mCircleFillPaint.setColor(i);
        invalidate();
    }

    public void setCircleProgressColor(int i) {
        this.mCircleProgressColor = i;
        this.mCircleProgressPaint.setColor(i);
        invalidate();
    }

    public void setIsTouchEnabled(boolean z) {
        this.isTouchEnabled = z;
    }

    public void setLockEnabled(boolean z) {
        this.lockEnabled = z;
    }

    public void setMax(int i) {
        if (i > 0) {
            if (i <= this.mProgress) {
                this.mProgress = 0;
                b bVar = this.mOnCircularSeekBarChangeListener;
                if (bVar != null) {
                    bVar.c(this, 0, false);
                }
            }
            this.mMax = i;
            recalculateAll();
            invalidate();
        }
    }

    public void setOnSeekBarChangeListener(b bVar) {
        this.mOnCircularSeekBarChangeListener = bVar;
    }

    public void setPointerAlpha(int i) {
        if (i < 0 || i > 255) {
            return;
        }
        this.mPointerAlpha = i;
        this.mPointerHaloPaint.setAlpha(i);
        invalidate();
    }

    public void setPointerAlphaOnTouch(int i) {
        if (i < 0 || i > 255) {
            return;
        }
        this.mPointerAlphaOnTouch = i;
    }

    public void setPointerColor(int i) {
        this.mPointerColor = i;
        this.mPointerPaint.setColor(i);
        invalidate();
    }

    public void setPointerHaloColor(int i) {
        this.mPointerHaloColor = i;
        this.mPointerHaloPaint.setColor(i);
        invalidate();
    }

    public void setProgressBasedOnAngle(float f) {
        this.mPointerPosition = f;
        calculateProgressDegrees();
        this.mProgress = Math.round((this.mMax * this.mProgressDegrees) / this.mTotalCircleDegrees);
    }

    public CircularSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.DPTOPX_SCALE = getResources().getDisplayMetrics().density;
        this.MIN_TOUCH_TARGET_DP = 48.0f;
        this.mCircleRectF = new RectF();
        this.mPointerColor = DEFAULT_POINTER_COLOR;
        this.mPointerHaloColor = DEFAULT_POINTER_HALO_COLOR;
        this.mPointerHaloColorOnTouch = DEFAULT_POINTER_HALO_COLOR_ONTOUCH;
        this.mCircleColor = DEFAULT_CIRCLE_COLOR;
        this.mCircleFillColor = 0;
        this.mCircleProgressColor = DEFAULT_CIRCLE_PROGRESS_COLOR;
        this.mPointerAlpha = 135;
        this.mPointerAlphaOnTouch = 100;
        this.lockEnabled = true;
        this.lockAtStart = true;
        this.lockAtEnd = false;
        this.mUserIsMovingPointer = false;
        this.mPointerPositionXY = new float[2];
        this.isTouchEnabled = true;
        this.mInnerViewTouchListener = null;
        this.mHandler = null;
        init(attributeSet, 0);
    }

    public CircularSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.DPTOPX_SCALE = getResources().getDisplayMetrics().density;
        this.MIN_TOUCH_TARGET_DP = 48.0f;
        this.mCircleRectF = new RectF();
        this.mPointerColor = DEFAULT_POINTER_COLOR;
        this.mPointerHaloColor = DEFAULT_POINTER_HALO_COLOR;
        this.mPointerHaloColorOnTouch = DEFAULT_POINTER_HALO_COLOR_ONTOUCH;
        this.mCircleColor = DEFAULT_CIRCLE_COLOR;
        this.mCircleFillColor = 0;
        this.mCircleProgressColor = DEFAULT_CIRCLE_PROGRESS_COLOR;
        this.mPointerAlpha = 135;
        this.mPointerAlphaOnTouch = 100;
        this.lockEnabled = true;
        this.lockAtStart = true;
        this.lockAtEnd = false;
        this.mUserIsMovingPointer = false;
        this.mPointerPositionXY = new float[2];
        this.isTouchEnabled = true;
        this.mInnerViewTouchListener = null;
        this.mHandler = null;
        init(attributeSet, i);
    }
}
