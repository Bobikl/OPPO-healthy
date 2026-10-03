package com.heytap.store.platform.barcode;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewfinderView extends View {
    private static final int CURRENT_POINT_OPACITY = 160;
    private static final int MAX_RESULT_POINTS = 20;
    private static final int POINT_SIZE = 20;
    private int cornerColor;
    private int cornerRectHeight;
    private int cornerRectWidth;
    private Rect frame;
    private int frameColor;
    private int frameHeight;
    private int frameLineWidth;
    private float frameRatio;
    private int frameWidth;
    private int gridColumn;
    private int gridHeight;
    private boolean isShowResultPoint;
    private String labelText;
    private int labelTextColor;
    private TextLocation labelTextLocation;
    private float labelTextPadding;
    private float labelTextSize;
    private int laserColor;
    private LaserStyle laserStyle;
    private List<ResultPoint> lastPossibleResultPoints;
    private int maskColor;
    private Paint paint;
    private List<ResultPoint> possibleResultPoints;
    private int resultPointColor;
    private int scannerAnimationDelay;
    public int scannerEnd;
    private int scannerLineHeight;
    private int scannerLineMoveDistance;
    public int scannerStart;
    private int screenHeight;
    private int screenWidth;
    private TextPaint textPaint;

    public enum LaserStyle {
        NONE(0),
        LINE(1),
        GRID(2);

        private int mValue;

        LaserStyle(int i) {
            this.mValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static LaserStyle getFromInt(int i) {
            for (LaserStyle laserStyle : values()) {
                if (laserStyle.mValue == i) {
                    return laserStyle;
                }
            }
            return LINE;
        }
    }

    public enum TextLocation {
        TOP(0),
        BOTTOM(1);

        private int mValue;

        TextLocation(int i) {
            this.mValue = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static TextLocation getFromInt(int i) {
            for (TextLocation textLocation : values()) {
                if (textLocation.mValue == i) {
                    return textLocation;
                }
            }
            return TOP;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LaserStyle.values().length];
            a = iArr;
            try {
                iArr[LaserStyle.LINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LaserStyle.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }

    private void drawCorner(Canvas canvas, Rect rect) {
        this.paint.setColor(this.cornerColor);
        int i = rect.left;
        int i2 = rect.top;
        canvas.drawRect(i, i2, i + this.cornerRectWidth, i2 + this.cornerRectHeight, this.paint);
        int i3 = rect.left;
        int i4 = rect.top;
        canvas.drawRect(i3, i4, i3 + this.cornerRectHeight, i4 + this.cornerRectWidth, this.paint);
        int i5 = rect.right;
        float f = i5 - this.cornerRectWidth;
        int i6 = rect.top;
        canvas.drawRect(f, i6, i5, i6 + this.cornerRectHeight, this.paint);
        int i7 = rect.right;
        float f2 = i7 - this.cornerRectHeight;
        int i8 = rect.top;
        canvas.drawRect(f2, i8, i7, i8 + this.cornerRectWidth, this.paint);
        int i9 = rect.left;
        int i10 = rect.bottom;
        canvas.drawRect(i9, i10 - this.cornerRectWidth, i9 + this.cornerRectHeight, i10, this.paint);
        int i11 = rect.left;
        int i12 = rect.bottom;
        canvas.drawRect(i11, i12 - this.cornerRectHeight, i11 + this.cornerRectWidth, i12, this.paint);
        int i13 = rect.right;
        float f3 = i13 - this.cornerRectWidth;
        int i14 = rect.bottom;
        canvas.drawRect(f3, i14 - this.cornerRectHeight, i13, i14, this.paint);
        int i15 = rect.right;
        float f4 = i15 - this.cornerRectHeight;
        int i16 = rect.bottom;
        canvas.drawRect(f4, i16 - this.cornerRectWidth, i15, i16, this.paint);
    }

    private void drawExterior(Canvas canvas, Rect rect, int i, int i2) {
        this.paint.setColor(this.maskColor);
        float f = i;
        canvas.drawRect(0.0f, 0.0f, f, rect.top, this.paint);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom, this.paint);
        canvas.drawRect(rect.right, rect.top, f, rect.bottom, this.paint);
        canvas.drawRect(0.0f, rect.bottom, f, i2, this.paint);
    }

    private void drawFrame(Canvas canvas, Rect rect) {
        this.paint.setColor(this.frameColor);
        float f = rect.left;
        int i = rect.top;
        canvas.drawRect(f, i, rect.right, i + this.frameLineWidth, this.paint);
        int i2 = rect.left;
        canvas.drawRect(i2, rect.top, i2 + this.frameLineWidth, rect.bottom, this.paint);
        int i3 = rect.right;
        canvas.drawRect(i3 - this.frameLineWidth, rect.top, i3, rect.bottom, this.paint);
        float f2 = rect.left;
        int i4 = rect.bottom;
        canvas.drawRect(f2, i4 - this.frameLineWidth, rect.right, i4, this.paint);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    private void drawGridScanner(Canvas canvas, Rect rect) {
        int i;
        this.paint.setStrokeWidth(2);
        int i2 = this.gridHeight;
        if (i2 > 0) {
            int i3 = this.scannerStart;
            if (i3 - rect.top > i2) {
                i = i3 - i2;
            } else {
                i = rect.top;
            }
        } else {
            i = rect.top;
        }
        float f = i;
        this.paint.setShader(new LinearGradient(rect.left + (rect.width() / 2), f, rect.left + (rect.width() / 2), this.scannerStart, new int[]{shadeColor(this.laserColor), this.laserColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        float fWidth = (rect.width() * 1.0f) / this.gridColumn;
        for (int i4 = 1; i4 < this.gridColumn; i4++) {
            int i5 = rect.left;
            float f2 = i4 * fWidth;
            canvas.drawLine(i5 + f2, f, i5 + f2, this.scannerStart, this.paint);
        }
        int i6 = this.gridHeight;
        if (i6 <= 0 || this.scannerStart - rect.top <= i6) {
            i6 = this.scannerStart - rect.top;
        }
        int i7 = 0;
        while (true) {
            float f3 = i7;
            if (f3 > i6 / fWidth) {
                break;
            }
            float f4 = rect.left;
            int i8 = this.scannerStart;
            float f5 = f3 * fWidth;
            canvas.drawLine(f4, i8 - f5, rect.right, i8 - f5, this.paint);
            i7++;
        }
        int i9 = this.scannerStart;
        if (i9 < this.scannerEnd) {
            this.scannerStart = i9 + this.scannerLineMoveDistance;
        } else {
            this.scannerStart = rect.top;
        }
    }

    private void drawLaserScanner(Canvas canvas, Rect rect) {
        if (this.laserStyle != null) {
            this.paint.setColor(this.laserColor);
            int i = a.a[this.laserStyle.ordinal()];
            if (i == 1) {
                drawLineScanner(canvas, rect);
            } else if (i == 2) {
                drawGridScanner(canvas, rect);
            }
            this.paint.setShader(null);
        }
    }

    private void drawLineScanner(Canvas canvas, Rect rect) {
        int i = rect.left;
        int i2 = this.scannerStart;
        this.paint.setShader(new LinearGradient(i, i2, i, i2 + this.scannerLineHeight, shadeColor(this.laserColor), this.laserColor, Shader.TileMode.MIRROR));
        if (this.scannerStart > this.scannerEnd) {
            this.scannerStart = rect.top;
            return;
        }
        int i3 = rect.left;
        int i4 = this.scannerLineHeight;
        int i5 = this.scannerStart;
        canvas.drawOval(new RectF(i3 + (i4 * 2), i5, rect.right - (i4 * 2), i5 + i4), this.paint);
        this.scannerStart += this.scannerLineMoveDistance;
    }

    private void drawResultPoint(Canvas canvas, Rect rect) {
        if (this.isShowResultPoint) {
            List<ResultPoint> list = this.possibleResultPoints;
            List<ResultPoint> list2 = this.lastPossibleResultPoints;
            if (list.isEmpty()) {
                this.lastPossibleResultPoints = null;
            } else {
                this.possibleResultPoints = new ArrayList(5);
                this.lastPossibleResultPoints = list;
                this.paint.setAlpha(160);
                this.paint.setColor(this.resultPointColor);
                synchronized (list) {
                    for (ResultPoint resultPoint : list) {
                        canvas.drawCircle(resultPoint.getX(), resultPoint.getY(), 10.0f, this.paint);
                    }
                }
            }
            if (list2 != null) {
                this.paint.setAlpha(80);
                this.paint.setColor(this.resultPointColor);
                synchronized (list2) {
                    for (ResultPoint resultPoint2 : list2) {
                        canvas.drawCircle(resultPoint2.getX(), resultPoint2.getY(), 10.0f, this.paint);
                    }
                }
            }
        }
    }

    private void drawTextInfo(Canvas canvas, Rect rect) {
        if (TextUtils.isEmpty(this.labelText)) {
            return;
        }
        this.textPaint.setColor(this.labelTextColor);
        this.textPaint.setTextSize(this.labelTextSize);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        StaticLayout staticLayout = new StaticLayout(this.labelText, this.textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (this.labelTextLocation == TextLocation.BOTTOM) {
            canvas.translate(rect.left + (rect.width() / 2), rect.bottom + this.labelTextPadding);
            staticLayout.draw(canvas);
        } else {
            canvas.translate(rect.left + (rect.width() / 2), (rect.top - this.labelTextPadding) - staticLayout.getHeight());
            staticLayout.draw(canvas);
        }
    }

    private DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ViewfinderView);
        this.maskColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_maskColor, ContextCompat.getColor(context, R.color.viewfinder_mask));
        this.frameColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_frameColor, ContextCompat.getColor(context, R.color.viewfinder_frame));
        this.cornerColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_cornerColor, ContextCompat.getColor(context, R.color.viewfinder_corner));
        this.laserColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_laserColor, ContextCompat.getColor(context, R.color.viewfinder_laser));
        this.resultPointColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_resultPointColor, ContextCompat.getColor(context, R.color.viewfinder_result_point_color));
        this.labelText = typedArrayObtainStyledAttributes.getString(R.styleable.ViewfinderView_labelText);
        this.labelTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.ViewfinderView_labelTextColor, ContextCompat.getColor(context, R.color.viewfinder_text_color));
        this.labelTextSize = typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_labelTextSize, TypedValue.applyDimension(2, 14.0f, getResources().getDisplayMetrics()));
        this.labelTextPadding = typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_labelTextPadding, TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()));
        this.labelTextLocation = TextLocation.getFromInt(typedArrayObtainStyledAttributes.getInt(R.styleable.ViewfinderView_labelTextLocation, 0));
        this.isShowResultPoint = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ViewfinderView_showResultPoint, false);
        this.frameWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_frameWidth, 0);
        this.frameHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ViewfinderView_frameHeight, 0);
        this.laserStyle = LaserStyle.getFromInt(typedArrayObtainStyledAttributes.getInt(R.styleable.ViewfinderView_laserStyle, LaserStyle.LINE.mValue));
        this.gridColumn = typedArrayObtainStyledAttributes.getInt(R.styleable.ViewfinderView_gridColumn, 20);
        this.gridHeight = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_gridHeight, TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()));
        this.cornerRectWidth = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_cornerRectWidth, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        this.cornerRectHeight = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_cornerRectHeight, TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        this.scannerLineMoveDistance = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scannerLineMoveDistance, TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.scannerLineHeight = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_scannerLineHeight, TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()));
        this.frameLineWidth = (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.ViewfinderView_frameLineWidth, TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics()));
        this.scannerAnimationDelay = typedArrayObtainStyledAttributes.getInteger(R.styleable.ViewfinderView_scannerAnimationDelay, 15);
        this.frameRatio = typedArrayObtainStyledAttributes.getFloat(R.styleable.ViewfinderView_frameRatio, 0.625f);
        typedArrayObtainStyledAttributes.recycle();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.possibleResultPoints = new ArrayList(5);
        this.lastPossibleResultPoints = null;
        this.screenWidth = getDisplayMetrics().widthPixels;
        int i = getDisplayMetrics().heightPixels;
        this.screenHeight = i;
        int iMin = (int) (Math.min(this.screenWidth, i) * this.frameRatio);
        int i2 = this.frameWidth;
        if (i2 <= 0 || i2 > this.screenWidth) {
            this.frameWidth = iMin;
        }
        int i3 = this.frameHeight;
        if (i3 <= 0 || i3 > this.screenHeight) {
            this.frameHeight = iMin;
        }
    }

    public void addPossibleResultPoint(ResultPoint resultPoint) {
        if (this.isShowResultPoint) {
            List<ResultPoint> list = this.possibleResultPoints;
            synchronized (list) {
                list.add(resultPoint);
                int size = list.size();
                if (size > 20) {
                    list.subList(0, size - 10).clear();
                }
            }
        }
    }

    public void drawViewfinder() {
        invalidate();
    }

    public boolean isShowResultPoint() {
        return this.isShowResultPoint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect = this.frame;
        if (rect == null) {
            return;
        }
        if (this.scannerStart == 0 || this.scannerEnd == 0) {
            this.scannerStart = rect.top;
            this.scannerEnd = rect.bottom - this.scannerLineHeight;
        }
        drawExterior(canvas, this.frame, canvas.getWidth(), canvas.getHeight());
        drawLaserScanner(canvas, this.frame);
        drawFrame(canvas, this.frame);
        drawCorner(canvas, this.frame);
        drawTextInfo(canvas, this.frame);
        drawResultPoint(canvas, this.frame);
        long j2 = this.scannerAnimationDelay;
        Rect rect2 = this.frame;
        postInvalidateDelayed(j2, rect2.left - 20, rect2.top - 20, rect2.right + 20, rect2.bottom + 20);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingLeft = (((this.screenWidth - this.frameWidth) / 2) + getPaddingLeft()) - getPaddingRight();
        int paddingTop = (((this.screenHeight - this.frameHeight) / 2) + getPaddingTop()) - getPaddingBottom();
        this.frame = new Rect(paddingLeft, paddingTop, this.frameWidth + paddingLeft, this.frameHeight + paddingTop);
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelTextColor(@ColorInt int i) {
        this.labelTextColor = i;
    }

    public void setLabelTextColorResource(@ColorRes int i) {
        this.labelTextColor = ContextCompat.getColor(getContext(), i);
    }

    public void setLabelTextSize(float f) {
        this.labelTextSize = f;
    }

    public void setLaserStyle(LaserStyle laserStyle) {
        this.laserStyle = laserStyle;
    }

    public void setShowResultPoint(boolean z) {
        this.isShowResultPoint = z;
    }

    public int shadeColor(int i) {
        return Integer.valueOf("01" + Integer.toHexString(i).substring(2), 16).intValue();
    }

    public ViewfinderView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewfinderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scannerStart = 0;
        this.scannerEnd = 0;
        init(context, attributeSet);
    }
}
