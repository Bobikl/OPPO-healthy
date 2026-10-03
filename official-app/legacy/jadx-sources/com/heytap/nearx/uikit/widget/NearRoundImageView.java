package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.rkc;

/* JADX INFO: loaded from: classes18.dex */
public class NearRoundImageView extends AppCompatImageView {
    private static final int BORDER_CIRCLE_WIDTH = 5;
    private static final int BORDER_WIDTH = 2;
    private static final int CIRCLE = 0;
    private static final int DEFAULT_BORDER_RADIUS = 1;
    private static final int DEFAULT_STROKE_RADIUS = 1;
    public static final int ICON_LARGE = 3;
    public static final int ICON_LARGE_RADIUS = 16;
    public static final int ICON_MEDIUM = 2;
    private static final int ICON_SIZE_TYPE_DEFAULT = 0;
    public static final int ICON_SMALL = 1;
    public static final int ICON_SMALL_RADIUS = 14;
    private static final float ONE = 1.0f;
    private static final float POINT_FIVE = 0.5f;
    private static final int ROUND = 1;
    private static final int SHADOW = 2;
    private static final float TWO = 2.0f;
    private static final int ZERO = 0;
    private Bitmap mBitmap;
    private int mBitmapHeight;
    private Paint mBitmapPaint;
    private BitmapShader mBitmapShader;
    private int mBitmapSize;
    private int mBitmapWidth;
    private Paint mBorderPaint;
    private int mBorderRadius;
    private final RectF mBorderRect;
    private Context mContext;
    private Drawable mDefaultDrawable;
    private Drawable mDrawable;
    private boolean mHasBorder;
    private boolean mHasDefaultPic;
    private boolean mIsImageView;
    private Matrix mMatrix;
    private RectF mOutBorderRect;
    private Paint mOutCircle;
    private int mOutCircleColor;
    private float mRadius;
    private int mRefreshStyle;
    private RectF mRoundRect;
    private float mScale;
    private Bitmap mShadowBitmap;
    private BitmapShader mShadowBitmapShader;
    private int mShadowBorderWidth;
    private Drawable mShadowDrawable;
    private int mShadowDrawableHeight;
    private int mShadowDrawableWidth;
    private final RectF mShadowInsideRect;
    private int mSourceDrawableHeight;
    private int mSourceDrawableWidth;
    private RectF mSourceRect;
    private int mType;
    private int mWidth;

    public NearRoundImageView(Context context) {
        super(context);
        this.mShadowInsideRect = new RectF();
        this.mBorderRect = new RectF();
        this.mMatrix = new Matrix();
        this.mContext = context;
        Paint paint = new Paint();
        this.mBitmapPaint = paint;
        paint.setAntiAlias(true);
        initBorderPaint();
        Paint paint2 = new Paint();
        this.mOutCircle = paint2;
        paint2.setAntiAlias(true);
        this.mOutCircle.setColor(getResources().getColor(R$color.nx_roundimageview_outcircle_color));
        this.mOutCircle.setStrokeWidth(1.0f);
        this.mOutCircle.setStyle(Paint.Style.STROKE);
        this.mType = 0;
        this.mWidth = getResources().getDimensionPixelSize(R$dimen.nx_roundimageview_default_radius);
        setupShader(getDrawable());
    }

    private Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int iMax = Math.max(1, drawable.getIntrinsicHeight());
        int iMax2 = Math.max(1, drawable.getIntrinsicWidth());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax2, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, iMax2, iMax);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void initBorderPaint() {
        Paint paint = new Paint();
        this.mBorderPaint = paint;
        paint.setStrokeWidth(2.0f);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setAntiAlias(true);
        this.mBorderPaint.setColor(getResources().getColor(R$color.nx_border));
    }

    private void setupShader(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        this.mDrawable = drawable2;
        if (drawable2 == null || drawable == null) {
            return;
        }
        if (drawable2 != drawable) {
            this.mDrawable = drawable;
        }
        this.mBitmapWidth = this.mDrawable.getIntrinsicWidth();
        this.mBitmapHeight = this.mDrawable.getIntrinsicHeight();
        this.mBitmap = drawableToBitmap(this.mDrawable);
        if (this.mType == 2) {
            this.mShadowBitmap = createBitmapWithShadow();
            Bitmap bitmap = this.mShadowBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.mShadowBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        }
        if (this.mBitmap != null) {
            Bitmap bitmap2 = this.mBitmap;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            this.mBitmapShader = new BitmapShader(bitmap2, tileMode2, tileMode2);
        }
    }

    private void updateShaderMatrix() {
        this.mMatrix.reset();
        float f = (this.mSourceDrawableWidth * 1.0f) / this.mBitmapWidth;
        float f2 = (this.mSourceDrawableHeight * 1.0f) / this.mBitmapHeight;
        if (f <= 1.0f) {
            f = 1.0f;
        }
        float fMax = Math.max(f, f2 > 1.0f ? f2 : 1.0f);
        float f3 = (this.mSourceDrawableWidth - (this.mBitmapWidth * fMax)) * 0.5f;
        float f4 = (this.mSourceDrawableHeight - (this.mBitmapHeight * fMax)) * 0.5f;
        this.mMatrix.setScale(fMax, fMax);
        Matrix matrix = this.mMatrix;
        int i = this.mShadowBorderWidth;
        matrix.postTranslate(((int) (f3 + 0.5f)) + (i / 2.0f), ((int) (f4 + 0.5f)) + (i / 2.0f));
    }

    public Bitmap createBitmapWithShadow() {
        updateShaderMatrix();
        Bitmap bitmap = this.mBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.mShadowBitmapShader = bitmapShader;
        bitmapShader.setLocalMatrix(this.mMatrix);
        this.mBitmapPaint.setShader(this.mShadowBitmapShader);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.mShadowDrawableWidth, this.mShadowDrawableHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        this.mBorderRadius = this.mSourceDrawableWidth / 2;
        canvas.drawPath(rkc.a().d(this.mShadowInsideRect, this.mBorderRadius), this.mBitmapPaint);
        this.mShadowDrawable.setBounds(0, 0, this.mShadowDrawableWidth, this.mShadowDrawableHeight);
        this.mShadowDrawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mDrawable != null) {
            this.mDrawable.setState(getDrawableState());
            setupShader(this.mDrawable);
            invalidate();
        }
    }

    public void initShadow() {
        this.mBorderRect.set(0.0f, 0.0f, this.mShadowDrawableWidth, this.mShadowDrawableHeight);
        this.mShadowBorderWidth = this.mShadowDrawableWidth - this.mSourceDrawableWidth;
        this.mShadowInsideRect.set(this.mBorderRect);
        RectF rectF = this.mShadowInsideRect;
        int i = this.mShadowBorderWidth;
        rectF.inset(i / 2, i / 2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.mScale = 1.0f;
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            int i = this.mType;
            if (i == 0) {
                int iMin = Math.min(bitmap.getWidth(), this.mBitmap.getHeight());
                this.mBitmapSize = iMin;
                this.mScale = (this.mWidth * 1.0f) / iMin;
            } else if (i == 1) {
                this.mScale = Math.max((getWidth() * 1.0f) / this.mBitmap.getWidth(), (getHeight() * 1.0f) / this.mBitmap.getHeight());
            } else if (i == 2) {
                this.mScale = Math.max((getWidth() * 1.0f) / this.mShadowDrawableWidth, (getHeight() * 1.0f) / this.mShadowDrawableHeight);
                this.mMatrix.reset();
                Matrix matrix = this.mMatrix;
                float f = this.mScale;
                matrix.setScale(f, f);
                this.mShadowBitmapShader.setLocalMatrix(this.mMatrix);
                this.mBitmapPaint.setShader(this.mShadowBitmapShader);
                canvas.drawRect(this.mRoundRect, this.mBitmapPaint);
                return;
            }
            Matrix matrix2 = this.mMatrix;
            float f2 = this.mScale;
            matrix2.setScale(f2, f2);
            BitmapShader bitmapShader = this.mBitmapShader;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.mMatrix);
                this.mBitmapPaint.setShader(this.mBitmapShader);
            }
        }
        int i2 = this.mType;
        if (i2 == 0) {
            if (!this.mHasBorder) {
                float f3 = this.mRadius;
                canvas.drawCircle(f3, f3, f3, this.mBitmapPaint);
                return;
            } else {
                float f4 = this.mRadius;
                canvas.drawCircle(f4, f4, f4, this.mBitmapPaint);
                float f5 = this.mRadius;
                canvas.drawCircle(f5, f5, f5 - 0.5f, this.mOutCircle);
                return;
            }
        }
        if (i2 == 1) {
            if (this.mRoundRect == null) {
                this.mRoundRect = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            }
            if (this.mOutBorderRect == null) {
                this.mOutBorderRect = new RectF(1.0f, 1.0f, getWidth() - 1.0f, getHeight() - 1.0f);
            }
            if (!this.mHasBorder) {
                canvas.drawPath(rkc.a().d(this.mRoundRect, this.mBorderRadius), this.mBitmapPaint);
            } else {
                canvas.drawPath(rkc.a().d(this.mRoundRect, this.mBorderRadius), this.mBitmapPaint);
                canvas.drawPath(rkc.a().d(this.mOutBorderRect, this.mBorderRadius - 1.0f), this.mOutCircle);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mType == 0) {
            int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
            if (iMin == 0) {
                iMin = this.mWidth;
            }
            this.mWidth = iMin;
            this.mRadius = iMin / 2.0f;
            setMeasuredDimension(iMin, iMin);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.mType;
        if (i5 == 1 || i5 == 2) {
            this.mRoundRect = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            this.mOutBorderRect = new RectF(1.0f, 1.0f, getWidth() - 1.0f, getHeight() - 1.0f);
        }
    }

    public void refresh() {
        TypedArray typedArrayObtainStyledAttributes = null;
        if (this.mRefreshStyle == 0) {
            typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearRoundImageView, 0, 0);
        } else {
            String resourceTypeName = getResources().getResourceTypeName(this.mRefreshStyle);
            if ("attr".equals(resourceTypeName)) {
                typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearRoundImageView, this.mRefreshStyle, 0);
            } else if (Const.Arguments.Open.STYLE.equals(resourceTypeName)) {
                typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, R$styleable.NearRoundImageView, 0, this.mRefreshStyle);
            }
        }
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.NearRoundImageView_nxRoundImageViewOutCircleColor, 0);
        this.mOutCircleColor = color;
        this.mOutCircle.setColor(color);
        typedArrayObtainStyledAttributes.recycle();
        invalidate();
    }

    public void setBorderRectRadius(int i) {
        this.mBorderRadius = i;
        invalidate();
    }

    public void setHasBorder(boolean z) {
        this.mHasBorder = z;
    }

    public void setHasDefaultPic(boolean z) {
        this.mHasDefaultPic = z;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setupShader(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        setupShader(this.mContext.getResources().getDrawable(i));
    }

    public void setOutCircleColor(int i) {
        this.mOutCircleColor = i;
        this.mOutCircle.setColor(i);
        invalidate();
    }

    public void setType(int i) {
        if (this.mType != i) {
            this.mType = i;
            if (i == 0) {
                int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
                if (iMin == 0) {
                    iMin = this.mWidth;
                }
                this.mWidth = iMin;
                this.mRadius = iMin / 2.0f;
            }
            invalidate();
        }
    }

    public NearRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mShadowInsideRect = new RectF();
        this.mBorderRect = new RectF();
        if (attributeSet != null) {
            this.mRefreshStyle = attributeSet.getStyleAttribute();
        }
        this.mMatrix = new Matrix();
        this.mContext = context;
        Paint paint = new Paint();
        this.mBitmapPaint = paint;
        paint.setAntiAlias(true);
        this.mBitmapPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        initBorderPaint();
        Paint paint2 = new Paint();
        this.mOutCircle = paint2;
        paint2.setAntiAlias(true);
        this.mOutCircle.setStrokeWidth(2.0f);
        this.mOutCircle.setStyle(Paint.Style.STROKE);
        Drawable drawable = context.getResources().getDrawable(R$drawable.nx_round_image_view_shadow);
        this.mShadowDrawable = drawable;
        this.mShadowDrawableWidth = drawable.getIntrinsicWidth();
        this.mShadowDrawableHeight = this.mShadowDrawable.getIntrinsicHeight();
        int dimension = (int) context.getResources().getDimension(R$dimen.nx_roundimageView_src_width);
        this.mSourceDrawableWidth = dimension;
        this.mSourceDrawableHeight = dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearRoundImageView);
        this.mBorderRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearRoundImageView_nxBorderRadius, (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.mType = typedArrayObtainStyledAttributes.getInt(R$styleable.NearRoundImageView_nxType, 0);
        this.mHasBorder = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearRoundImageView_nxHasBorder, false);
        this.mHasDefaultPic = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearRoundImageView_nxHasDefaultPic, true);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.NearRoundImageView_nxRoundImageViewOutCircleColor, 0);
        this.mOutCircleColor = color;
        this.mOutCircle.setColor(color);
        initShadow();
        setupShader(getDrawable());
        typedArrayObtainStyledAttributes.recycle();
    }

    public NearRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShadowInsideRect = new RectF();
        this.mBorderRect = new RectF();
        initShadow();
    }
}
