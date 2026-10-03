package com.heytap.health.healthbase.view;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.health_base.R$color;
import com.heytap.health.health_base.R$drawable;
import com.heytap.health.health_base.R$styleable;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.c1f;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.m8b;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002KLB\u0013\b\u0016\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FB\u001d\b\u0016\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bE\u0010GB%\b\u0016\u0012\b\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010H\u001a\u00020\r¢\u0006\u0004\bE\u0010IJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0003J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0014J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rJ\u001c\u0010#\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!J\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020!J\u0006\u0010'\u001a\u00020!R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u00102\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u0010\u0017\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00100R\u0016\u00103\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010,R\u0016\u0010\u001c\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010.R\u0016\u00106\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00100R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00100R\u0016\u00108\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00100R\u0016\u0010\u000e\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00104R$\u0010=\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00100¨\u0006M"}, d2 = {"Lcom/heytap/health/healthbase/view/HealthProgressBarView3;", "Landroid/view/View;", "Landroid/util/AttributeSet;", "attrs", "", "initView", "calRenderer", "calBlockCursor", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "drawProgressImg", "onDraw", "", "radius", "setRadius", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "Landroid/graphics/Bitmap;", "drawableToBitmap", "Lcom/heytap/health/healthbase/view/HealthProgressBarView3$CurSorType;", "curSorType", "setCurSorType", "intervalPx", "setIntervalPx", "", "drawCursor", "setDrawCursor", "cursorColor", "setCursorColor", "", "Lcom/oplus/aiunit/vision/c1f;", "progressSegmentList", "", "cursorValue", "setData", "animateY", "phaseY", "setPhaseY", "getPhaseY", "Ljava/util/List;", "Lcom/heytap/health/healthbase/view/HealthProgressBarView3$CurSorType;", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", Fields.WIDTH_FIELD, "I", "bgHeight", UserInfo.SEX_FEMALE, "bgMarginTop", "bgBottom", "isDrawCursor", "Z", "cursorPaint", "cursorMarginTop", "cursorX", "cursorWidth", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "calChange", "cursorDrawable", "Landroid/graphics/drawable/Drawable;", "getCursorDrawable", "()Landroid/graphics/drawable/Drawable;", "setCursorDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "CurSorType", "health_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthProgressBarView3.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthProgressBarView3.kt\ncom/heytap/health/healthbase/view/HealthProgressBarView3\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,375:1\n95#2:376\n*S KotlinDebug\n*F\n+ 1 HealthProgressBarView3.kt\ncom/heytap/health/healthbase/view/HealthProgressBarView3\n*L\n320#1:376\n*E\n"})
public final class HealthProgressBarView3 extends View {

    @NotNull
    private static final String TAG = "HealthProgressBarView3";
    private float bgBottom;
    private float bgHeight;
    private float bgMarginTop;

    @Nullable
    private Paint bgPaint;
    private boolean calChange;

    @Nullable
    private CurSorType curSorType;
    private int cursorColor;

    @Nullable
    private Drawable cursorDrawable;
    private float cursorMarginTop;

    @Nullable
    private Paint cursorPaint;
    private float cursorValue;
    private float cursorWidth;
    private float cursorX;
    private float intervalPx;
    private boolean isDrawCursor;

    @NotNull
    private final Path path;
    private float phaseY;

    @NotNull
    private List<c1f> progressSegmentList;
    private float radius;
    private int width;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/healthbase/view/HealthProgressBarView3$CurSorType;", "", "(Ljava/lang/String;I)V", "CENTER", "TRULY", "health_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum CurSorType {
        CENTER,
        TRULY
    }

    public HealthProgressBarView3(@Nullable Context context) {
        super(context);
        this.progressSegmentList = new ArrayList();
        this.curSorType = CurSorType.CENTER;
        this.isDrawCursor = true;
        this.cursorValue = -1.0f;
        this.cursorX = -1.0f;
        this.path = new Path();
        this.phaseY = 1.0f;
        initView(null);
    }

    private final void calBlockCursor() {
        boolean z = false;
        float fH = this.progressSegmentList.get(0).h();
        List<c1f> list = this.progressSegmentList;
        float fC = list.get(list.size() - 1).c();
        float fAbs = (float) Math.abs(fC - fH);
        int i = this.width;
        float f = this.cursorWidth;
        float f2 = i - f;
        float f3 = 2;
        float f4 = f / f3;
        float f5 = i - (f / f3);
        float f6 = f2 / fAbs;
        StringBuilder sb = new StringBuilder();
        sb.append("drawBackground width:");
        sb.append(f2);
        sb.append(" minValue:");
        sb.append(fH);
        sb.append(", maxValue:");
        sb.append(fC);
        sb.append(", unit:");
        sb.append(f6);
        sb.append(", drawMinX:");
        sb.append(f4);
        sb.append(", drawMaxX:");
        sb.append(f5);
        this.cursorX = -1.0f;
        this.bgBottom = getHeight();
        int size = this.progressSegmentList.size();
        int i2 = 0;
        float fH2 = 0.0f;
        while (i2 < size) {
            c1f c1fVar = this.progressSegmentList.get(i2);
            if (fH2 <= 0.0f) {
                fH2 = ((c1fVar.h() - fH) * f6) + f4;
            }
            float fC2 = ((c1fVar.c() - fH) * f6) + f4;
            if (i2 != 0) {
                float f7 = this.intervalPx;
                if (!(f7 == 0.0f ? true : z)) {
                    fH2 += f7 / f3;
                }
            }
            if (i2 != this.progressSegmentList.size() - 1) {
                float f8 = this.intervalPx;
                if (!(f8 == 0.0f ? true : z)) {
                    fC2 -= f8 / f3;
                }
            }
            c1fVar.k(fH2);
            c1fVar.j(fC2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("startX:");
            sb2.append(fH2);
            sb2.append(" ,endX:");
            sb2.append(fC2);
            float f9 = fC2 - fH2;
            float fC3 = f9 / (c1fVar.c() - c1fVar.h());
            if (this.isDrawCursor && this.cursorValue >= c1fVar.h() && this.cursorValue <= c1fVar.c()) {
                if (this.curSorType == CurSorType.CENTER) {
                    this.cursorX = (f9 / f3) + fH2;
                } else {
                    this.cursorX = ((int) ((this.cursorValue - c1fVar.h()) * fC3)) + fH2;
                }
            }
            i2++;
            fH2 = fC2;
            z = false;
        }
    }

    private final void calRenderer() {
        if (this.progressSegmentList.isEmpty()) {
            m8b.b(TAG, "no data");
            return;
        }
        Paint paint = this.bgPaint;
        if (paint != null) {
            paint.setStyle(Paint.Style.FILL);
        }
        Paint paint2 = this.bgPaint;
        if (paint2 != null) {
            paint2.setAntiAlias(true);
        }
        Paint paint3 = this.bgPaint;
        if (paint3 != null) {
            paint3.setColor(SupportMenu.CATEGORY_MASK);
        }
        calBlockCursor();
    }

    private final void drawBackground(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int size = this.progressSegmentList.size();
        for (int i = 0; i < size; i++) {
            c1f c1fVar = this.progressSegmentList.get(i);
            float fI = c1fVar.i();
            float fD = c1fVar.d();
            StringBuilder sb = new StringBuilder();
            sb.append("startX1:");
            sb.append(fI);
            sb.append(" ,endX1:");
            sb.append(fD);
            Paint paint = this.bgPaint;
            if (paint != null) {
                paint.reset();
            }
            Paint paint2 = this.bgPaint;
            if (paint2 != null) {
                paint2.setColor(c1fVar.a());
            }
            RectF rectFG = AnimatorUtil.INSTANCE.g(this.phaseY, fI, this.bgMarginTop, fD, this.bgBottom);
            float f4 = 0.0f;
            if (i == 0) {
                float f5 = this.radius;
                f2 = this.progressSegmentList.size() == 1 ? this.radius : 0.0f;
                f3 = f5;
                f4 = f3;
                f = f2;
            } else if (i == this.progressSegmentList.size() - 1) {
                f = this.radius;
                f3 = 0.0f;
                f2 = f;
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
            }
            this.path.reset();
            this.path.addRoundRect(rectFG, new float[]{f4, f4, f, f, f2, f2, f3, f3}, Path.Direction.CW);
            Path path = this.path;
            Paint paint3 = this.bgPaint;
            Intrinsics.checkNotNull(paint3);
            canvas.drawPath(path, paint3);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private final void drawProgressImg(Canvas canvas) {
        Bitmap bitmapDrawableToBitmap;
        float f = this.cursorX;
        if (f < 0.0f) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("drawProgressImg cursorX:");
        sb.append(f);
        Paint paint = this.cursorPaint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.cursorPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.cursorPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setAntiAlias(true);
        Paint paint4 = this.cursorPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setStrokeWidth(0.0f);
        Paint paint5 = this.cursorPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setColor(this.cursorColor);
        Drawable drawable = this.cursorDrawable;
        if (drawable != null) {
            Intrinsics.checkNotNull(drawable);
            bitmapDrawableToBitmap = drawableToBitmap(drawable);
        } else {
            Drawable drawable2 = e88.a().getResources().getDrawable(R$drawable.health_base_icon_chart_cursor4, null);
            Intrinsics.checkNotNullExpressionValue(drawable2, "drawable");
            bitmapDrawableToBitmap = drawableToBitmap(drawable2);
        }
        float f2 = 2;
        canvas.drawBitmap(bitmapDrawableToBitmap, (Rect) null, AnimatorUtil.INSTANCE.g(this.phaseY, this.cursorX - (bitmapDrawableToBitmap.getWidth() / f2), 0.0f, this.cursorX + (bitmapDrawableToBitmap.getWidth() / f2), bitmapDrawableToBitmap.getHeight()), this.cursorPaint);
    }

    @SuppressLint({"CustomViewStyleable"})
    private final void initView(AttributeSet attrs) {
        this.bgPaint = new Paint(1);
        this.cursorPaint = new Paint();
        this.bgHeight = jjk.a(getContext(), 18.0f);
        this.bgMarginTop = jjk.a(getContext(), 9.0f);
        this.intervalPx = jjk.a(getContext(), 4.0f);
        this.radius = jjk.a(getContext(), 2.0f);
        this.cursorWidth = jjk.a(getContext(), 16.0f);
        this.isDrawCursor = true;
        this.cursorColor = ContextCompat.getColor(getContext(), R$color.health_FFEC3E50);
        this.cursorMarginTop = jjk.a(getContext(), 0.0f);
        TypedArray typedArrayObtainStyledAttributes = attrs == null ? null : getContext().obtainStyledAttributes(attrs, R$styleable.HealthProgressBarAttrs);
        if (typedArrayObtainStyledAttributes != null) {
            this.bgHeight = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_bgHeight, this.bgHeight);
            this.bgMarginTop = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_bgMarginTop, this.bgMarginTop);
            this.intervalPx = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_intervalPx, this.intervalPx);
            this.isDrawCursor = typedArrayObtainStyledAttributes.getBoolean(R$styleable.HealthProgressBarAttrs_isDrawCursor, this.isDrawCursor);
            this.cursorColor = typedArrayObtainStyledAttributes.getColor(R$styleable.HealthProgressBarAttrs_cursorColor, this.cursorColor);
            this.cursorMarginTop = typedArrayObtainStyledAttributes.getDimension(R$styleable.HealthProgressBarAttrs_cursorMarginTop, this.cursorMarginTop);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void animateY() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseY", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(466L);
        objectAnimatorOfFloat.start();
    }

    @NotNull
    public final Bitmap drawableToBitmap(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Nullable
    public final Drawable getCursorDrawable() {
        return this.cursorDrawable;
    }

    public final float getPhaseY() {
        return this.phaseY;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        this.width = measuredWidth;
        int measuredHeight = getMeasuredHeight();
        boolean z = this.calChange;
        StringBuilder sb = new StringBuilder();
        sb.append("onDraw width:");
        sb.append(measuredWidth);
        sb.append(", height:");
        sb.append(measuredHeight);
        sb.append(" ,calChange:");
        sb.append(z);
        if (this.calChange) {
            calRenderer();
            this.calChange = false;
        }
        drawBackground(canvas);
        drawProgressImg(canvas);
    }

    public final void setCurSorType(@Nullable CurSorType curSorType) {
        this.curSorType = curSorType;
    }

    public final void setCursorColor(int cursorColor) {
        this.cursorColor = cursorColor;
    }

    public final void setCursorDrawable(@Nullable Drawable drawable) {
        this.cursorDrawable = drawable;
    }

    public final void setData(@NotNull List<c1f> progressSegmentList, float cursorValue) {
        Intrinsics.checkNotNullParameter(progressSegmentList, "progressSegmentList");
        this.progressSegmentList = progressSegmentList;
        this.cursorValue = cursorValue;
        this.calChange = true;
        invalidate();
    }

    public final void setDrawCursor(boolean drawCursor) {
        this.isDrawCursor = drawCursor;
    }

    public final void setIntervalPx(int intervalPx) {
        this.intervalPx = intervalPx;
    }

    public final void setPhaseY(float phaseY) {
        this.phaseY = (float) Math.max(0.2d, phaseY);
        invalidate();
    }

    public final void setRadius(int radius) {
        this.radius = jjk.a(getContext(), radius);
        invalidate();
    }

    public HealthProgressBarView3(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.progressSegmentList = new ArrayList();
        this.curSorType = CurSorType.CENTER;
        this.isDrawCursor = true;
        this.cursorValue = -1.0f;
        this.cursorX = -1.0f;
        this.path = new Path();
        this.phaseY = 1.0f;
        initView(attributeSet);
    }

    public HealthProgressBarView3(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progressSegmentList = new ArrayList();
        this.curSorType = CurSorType.CENTER;
        this.isDrawCursor = true;
        this.cursorValue = -1.0f;
        this.cursorX = -1.0f;
        this.path = new Path();
        this.phaseY = 1.0f;
        initView(attributeSet);
    }
}