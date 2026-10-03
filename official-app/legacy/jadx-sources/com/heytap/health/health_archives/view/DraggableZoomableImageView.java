package com.heytap.health.health_archives.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.health_archives.view.DraggableZoomableImageView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.HighlightArea;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.y04;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0085\u0001\u0086\u0001B\"\b\u0007\u0012\u0007\u0010\u0080\u0001\u001a\u00020\u007f\u0012\f\b\u0002\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J0\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002JL\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002JP\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0014J0\u0010&\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!H\u0014J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\rJ\u000e\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020-H\u0016J\u0010\u00102\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0014J\u0012\u00105\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u000103H\u0016R\u0016\u00108\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u0004R\u0014\u0010<\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010\u0004R\u0014\u0010>\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010\u0004R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010\u0004R\u0016\u0010J\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0004R\u0016\u0010L\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\u0004R\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010\u0004R\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u0004R\u0016\u0010S\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010\u0004R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010fR\u0016\u0010h\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010RR\u0016\u0010i\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0003R\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010kR\u0016\u0010m\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0016\u0010o\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0004R\u0016\u0010p\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010u\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010v\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010x\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010\u0004R\u0016\u0010z\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010\u0004R\u0016\u0010|\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010RR\u0014\u0010~\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010c¨\u0006\u0087\u0001"}, d2 = {"Lcom/heytap/health/health_archives/view/DraggableZoomableImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "I", UserInfo.SEX_FEMALE, "", "G", c8l.KEY_B, "Lcom/oplus/aiunit/vision/l99;", DebugModeEntity.KEY_AREA, "C", "A", "J", "", "viewWidth", "viewHeight", "transX", "transY", "currentScaleFactor", ExifInterface.LONGITUDE_EAST, "needCenterHorizontal", "needCenterVertical", "Lkotlin/Pair;", "z", "needLimitHorizontal", "needLimitVertical", "scaleWidth", "scaleHeight", "adjustedTransX", "adjustedTransY", "D", "onDetachedFromWindow", "changed", "", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "radius", "setCornerRadius", "Lcom/heytap/health/health_archives/view/InitialDisplayMode;", "mode", "setInitialDisplayMode", "setHighlightArea", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "setImageDrawable", "i", "Lcom/heytap/health/health_archives/view/InitialDisplayMode;", "initialDisplayMode", "j", "scaleFactor", MapSchema.FIELD_NAME_KEY, "maxScaleFactor", LogFieldKey.LEVEL_KEY, "targetScaleFactor", "Landroid/view/ScaleGestureDetector;", LogFieldKey.MESSAGE_KEY, "Landroid/view/ScaleGestureDetector;", "scaleGestureDetector", "Landroid/view/GestureDetector;", "n", "Landroid/view/GestureDetector;", "gestureDetector", "o", "lastScaleFactor", LogFieldKey.PROCESS_NAME_KEY, "startX", "q", "startY", "r", "drawableIntrinsicHeight", "s", "drawableIntrinsicWidth", "t", "Z", "isRoundCorner", "u", ParserTag.TAG_CORNER_RADIUS, "Landroid/graphics/Path;", "v", "Landroid/graphics/Path;", "path", "Landroid/graphics/RectF;", "w", "Landroid/graphics/RectF;", "rectF", "x", "Lcom/oplus/aiunit/vision/l99;", "highlightArea", "Ljava/lang/Runnable;", "y", "Ljava/lang/Runnable;", "highlightRunnable", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "highlightPaint", "mIsScaling", "mLastPointerCount", "", "[F", "matrixValues", "cachedMinScaleFactor", "isMinScaleCached", "minImageCenterX", "minImageCenterY", "Landroid/graphics/Matrix;", "H", "Landroid/graphics/Matrix;", "tempMatrix", "cachedViewWidth", "cachedViewHeight", "K", "cachedMinImageCenterInImageX", "L", "cachedMinImageCenterInImageY", "M", "pendingValidation", "N", "validationRunnable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDraggableZoomableImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DraggableZoomableImageView.kt\ncom/heytap/health/health_archives/view/DraggableZoomableImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,891:1\n1#2:892\n*E\n"})
public final class DraggableZoomableImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean mIsScaling;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public int mLastPointerCount;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final float[] matrixValues;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public float cachedMinScaleFactor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean isMinScaleCached;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public float minImageCenterX;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public float minImageCenterY;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Matrix tempMatrix;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public float cachedViewWidth;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public float cachedViewHeight;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public float cachedMinImageCenterInImageX;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public float cachedMinImageCenterInImageY;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean pendingValidation;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public final Runnable validationRunnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public InitialDisplayMode initialDisplayMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float scaleFactor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final float maxScaleFactor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final float targetScaleFactor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public ScaleGestureDetector scaleGestureDetector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float lastScaleFactor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float startY;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float drawableIntrinsicHeight;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float drawableIntrinsicWidth;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public boolean isRoundCorner;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float cornerRadius;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Path path;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final RectF rectF;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public HighlightArea highlightArea;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Runnable highlightRunnable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Paint highlightPaint;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/health_archives/view/DraggableZoomableImageView$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "event", "", "onDown", "e1", "e2", "", "distanceX", "distanceY", "onScroll", "<init>", "(Lcom/heytap/health/health_archives/view/DraggableZoomableImageView;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(@NotNull MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            DraggableZoomableImageView.this.startX = event.getX();
            DraggableZoomableImageView.this.startY = event.getY();
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:105:0x018e  */
        /* JADX WARN: Code duplicated, block: B:112:0x019c  */
        /* JADX WARN: Code duplicated, block: B:91:0x0172  */
        /* JADX WARN: Code duplicated, block: B:98:0x0180  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent e1, @NotNull MotionEvent e2, float distanceX, float distanceY) {
            Matrix imageMatrix;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(e2, "e2");
            if (DraggableZoomableImageView.this.G() || (imageMatrix = DraggableZoomableImageView.this.getImageMatrix()) == null) {
                return false;
            }
            DraggableZoomableImageView.this.tempMatrix.set(imageMatrix);
            DraggableZoomableImageView.this.tempMatrix.getValues(DraggableZoomableImageView.this.matrixValues);
            float f = DraggableZoomableImageView.this.matrixValues[0];
            float f2 = DraggableZoomableImageView.this.matrixValues[2];
            float f3 = DraggableZoomableImageView.this.matrixValues[5];
            float f4 = DraggableZoomableImageView.this.drawableIntrinsicWidth * f;
            float f5 = DraggableZoomableImageView.this.drawableIntrinsicHeight * f;
            float width = DraggableZoomableImageView.this.cachedViewWidth > 0.0f ? DraggableZoomableImageView.this.cachedViewWidth : DraggableZoomableImageView.this.getWidth();
            float height = DraggableZoomableImageView.this.cachedViewHeight > 0.0f ? DraggableZoomableImageView.this.cachedViewHeight : DraggableZoomableImageView.this.getHeight();
            boolean z5 = f4 > width;
            boolean z6 = f5 > height;
            if (!z5 && !z6) {
                return false;
            }
            float f6 = z5 ? distanceX : 0.0f;
            float f7 = z6 ? distanceY : 0.0f;
            if (f6 == 0.0f) {
                if (f7 == 0.0f) {
                    return false;
                }
            }
            DraggableZoomableImageView.this.F();
            if (DraggableZoomableImageView.this.cachedMinImageCenterInImageX <= 0.0f || DraggableZoomableImageView.this.cachedMinImageCenterInImageY <= 0.0f) {
                return false;
            }
            float f8 = DraggableZoomableImageView.this.cachedMinImageCenterInImageX * f;
            float f9 = DraggableZoomableImageView.this.cachedMinImageCenterInImageY * f;
            float f10 = ((f2 + f8) - f6) - f8;
            float f11 = width - f4;
            float fMax = Math.max(0.0f, f11);
            float fMin = Math.min(0.0f, f11);
            float f12 = height - f5;
            float fMax2 = Math.max(0.0f, f12);
            float fMin2 = Math.min(0.0f, f12);
            float fMin3 = Math.min(fMin, fMax);
            float fMax3 = Math.max(fMin, fMax);
            float fMin4 = Math.min(fMin2, fMax2);
            float fMax4 = Math.max(fMin2, fMax2);
            float fCoerceIn = RangesKt___RangesKt.coerceIn(f10, fMin3, fMax3);
            float fCoerceIn2 = RangesKt___RangesKt.coerceIn(((f3 + f9) - f7) - f9, fMin4, fMax4);
            float f13 = z5 ? fCoerceIn - f2 : 0.0f;
            float f14 = z6 ? fCoerceIn2 - f3 : 0.0f;
            boolean z7 = f6 < 0.0f;
            boolean z8 = f6 > 0.0f;
            boolean z9 = f7 < 0.0f;
            boolean z10 = f7 > 0.0f;
            float f15 = f14;
            if (f13 == 0.0f) {
                if (f15 == 0.0f) {
                    return false;
                }
            }
            if (z5) {
                float f16 = fMin3 + 0.5f;
                if (fCoerceIn <= f16 || f2 <= f16) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z5) {
                float f17 = fMax3 - 0.5f;
                if (fCoerceIn >= f17 || f2 >= f17) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (z6) {
                float f18 = fMin4 + 0.5f;
                if (fCoerceIn2 <= f18 || f3 <= f18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            if (z6) {
                float f19 = fMax4 - 0.5f;
                if (fCoerceIn2 >= f19 || f3 >= f19) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            boolean z11 = (z && z8) || (z2 && z7);
            boolean z12 = (z3 && z10) || (z4 && z9);
            if (!z11 && !z12) {
                boolean z13 = z5 && ((z && z7) || (z2 && z8));
                boolean z14 = z6 && ((z3 && z9) || (z4 && z10));
                if (Math.abs(f13) < 0.5f && Math.abs(f15) < 0.5f) {
                    if (z13 && z14) {
                        return false;
                    }
                    if (z13 && Math.abs(f15) < 0.5f) {
                        return false;
                    }
                    if (z14 && Math.abs(f13) < 0.5f) {
                        return false;
                    }
                }
            }
            DraggableZoomableImageView.this.tempMatrix.postTranslate(f13, f15);
            DraggableZoomableImageView draggableZoomableImageView = DraggableZoomableImageView.this;
            draggableZoomableImageView.setImageMatrix(draggableZoomableImageView.tempMatrix);
            DraggableZoomableImageView.this.invalidate();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0002¨\u0006\f"}, d2 = {"Lcom/heytap/health/health_archives/view/DraggableZoomableImageView$b;", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScale", "", "onScaleEnd", "", "a", "<init>", "(Lcom/heytap/health/health_archives/view/DraggableZoomableImageView;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public b() {
        }

        public final float a() {
            if (DraggableZoomableImageView.this.isMinScaleCached && DraggableZoomableImageView.this.getWidth() > 0 && DraggableZoomableImageView.this.getHeight() > 0 && DraggableZoomableImageView.this.drawableIntrinsicWidth > 0.0f && DraggableZoomableImageView.this.drawableIntrinsicHeight > 0.0f) {
                return DraggableZoomableImageView.this.cachedMinScaleFactor;
            }
            if (DraggableZoomableImageView.this.drawableIntrinsicWidth > 0.0f && DraggableZoomableImageView.this.drawableIntrinsicHeight > 0.0f) {
                float width = DraggableZoomableImageView.this.cachedViewWidth > 0.0f ? DraggableZoomableImageView.this.cachedViewWidth : DraggableZoomableImageView.this.getWidth();
                float height = DraggableZoomableImageView.this.cachedViewHeight > 0.0f ? DraggableZoomableImageView.this.cachedViewHeight : DraggableZoomableImageView.this.getHeight();
                if (width > 0.0f && height > 0.0f) {
                    float fMin = Math.min(width / DraggableZoomableImageView.this.drawableIntrinsicWidth, height / DraggableZoomableImageView.this.drawableIntrinsicHeight);
                    DraggableZoomableImageView.this.cachedMinScaleFactor = fMin;
                    DraggableZoomableImageView.this.isMinScaleCached = true;
                    return fMin;
                }
            }
            return 1.0f;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            float scaleFactor = DraggableZoomableImageView.this.scaleFactor * detector.getScaleFactor();
            float fA = a();
            DraggableZoomableImageView draggableZoomableImageView = DraggableZoomableImageView.this;
            if (scaleFactor < fA) {
                scaleFactor = fA;
            } else if (scaleFactor > draggableZoomableImageView.maxScaleFactor) {
                scaleFactor = DraggableZoomableImageView.this.maxScaleFactor;
            }
            draggableZoomableImageView.scaleFactor = scaleFactor;
            Matrix imageMatrix = DraggableZoomableImageView.this.getImageMatrix();
            if (imageMatrix == null) {
                return false;
            }
            DraggableZoomableImageView.this.tempMatrix.set(imageMatrix);
            DraggableZoomableImageView.this.tempMatrix.getValues(DraggableZoomableImageView.this.matrixValues);
            float f = DraggableZoomableImageView.this.matrixValues[0];
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float f2 = DraggableZoomableImageView.this.scaleFactor / f;
            DraggableZoomableImageView.this.tempMatrix.postScale(f2, f2, focusX, focusY);
            DraggableZoomableImageView draggableZoomableImageView2 = DraggableZoomableImageView.this;
            draggableZoomableImageView2.setImageMatrix(draggableZoomableImageView2.tempMatrix);
            DraggableZoomableImageView.this.invalidate();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(@NotNull ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            DraggableZoomableImageView.this.pendingValidation = true;
            DraggableZoomableImageView draggableZoomableImageView = DraggableZoomableImageView.this;
            draggableZoomableImageView.postDelayed(draggableZoomableImageView.validationRunnable, 16L);
            DraggableZoomableImageView.this.invalidate();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitialDisplayMode.values().length];
            try {
                iArr[InitialDisplayMode.FIT_WIDTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitialDisplayMode.FIT_HEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitialDisplayMode.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public DraggableZoomableImageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void H(DraggableZoomableImageView this$0, HighlightArea area) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(area, "$area");
        this$0.C(area);
    }

    public static final void K(DraggableZoomableImageView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.pendingValidation) {
            this$0.J();
            this$0.pendingValidation = false;
        }
    }

    public static final void d(DraggableZoomableImageView this$0, Context context) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.scaleGestureDetector = new ScaleGestureDetector(context, this$0.new b());
        this$0.gestureDetector = new GestureDetector(context, this$0.new a());
    }

    public final void A(HighlightArea area) {
        float f = this.matrixValues[0];
        float left = area.getLeft() * f;
        float top = area.getTop() * f;
        float right = area.getRight() * f;
        float bottom = area.getBottom() * f;
        float width = getWidth();
        float height = getHeight();
        float f2 = 2;
        float f3 = left + ((right - left) / f2);
        float[] fArr = this.matrixValues;
        float f4 = (width / f2) - (f3 + fArr[2]);
        float f5 = (height / f2) - ((top + ((bottom - top) / f2)) + fArr[5]);
        Matrix imageMatrix = getImageMatrix();
        imageMatrix.postTranslate(f4, f5);
        setImageMatrix(imageMatrix);
        J();
        invalidate();
    }

    public final void B() {
        if (getDrawable() != null && getWidth() > 0 && getHeight() > 0) {
            if (this.drawableIntrinsicWidth <= 0.0f || this.drawableIntrinsicHeight <= 0.0f) {
                return;
            }
            Matrix imageMatrix = getImageMatrix();
            if (imageMatrix == null) {
                imageMatrix = new Matrix();
                setImageMatrix(imageMatrix);
            }
            float width = this.cachedViewWidth;
            if (width <= 0.0f) {
                width = getWidth();
                this.cachedViewWidth = width;
            }
            float height = this.cachedViewHeight;
            if (height <= 0.0f) {
                height = getHeight();
                this.cachedViewHeight = height;
            }
            int i = c.$EnumSwitchMapping$0[this.initialDisplayMode.ordinal()];
            if (i == 1) {
                float f = width / this.drawableIntrinsicWidth;
                this.scaleFactor = f;
                imageMatrix.setScale(f, f);
                float f2 = this.drawableIntrinsicHeight * this.scaleFactor;
                float f3 = f2 < height ? (height - f2) / 2 : 0.0f;
                imageMatrix.postTranslate(0.0f, f3);
                this.minImageCenterX = width / 2.0f;
                this.minImageCenterY = f3 + (f2 / 2.0f);
            } else if (i == 2) {
                float f4 = height / this.drawableIntrinsicHeight;
                this.scaleFactor = f4;
                imageMatrix.setScale(f4, f4);
                float f5 = this.drawableIntrinsicWidth * this.scaleFactor;
                float f6 = f5 < width ? (width - f5) / 2 : 0.0f;
                imageMatrix.postTranslate(f6, 0.0f);
                this.minImageCenterX = f6 + (f5 / 2.0f);
                this.minImageCenterY = height / 2.0f;
            } else if (i == 3) {
                float fMin = Math.min(width / this.drawableIntrinsicWidth, height / this.drawableIntrinsicHeight);
                this.scaleFactor = fMin;
                imageMatrix.setScale(fMin, fMin);
                float f7 = this.drawableIntrinsicWidth;
                float f8 = this.scaleFactor;
                float f9 = f7 * f8;
                float f10 = this.drawableIntrinsicHeight * f8;
                float f11 = f9 < width ? (width - f9) / 2 : 0.0f;
                float f12 = f10 < height ? (height - f10) / 2 : 0.0f;
                imageMatrix.postTranslate(f11, f12);
                this.minImageCenterX = f11 + (f9 / 2.0f);
                this.minImageCenterY = f12 + (f10 / 2.0f);
            }
            setImageMatrix(imageMatrix);
            J();
        }
    }

    public final void C(HighlightArea area) {
        getImageMatrix().getValues(this.matrixValues);
        float f = this.matrixValues[0];
        if (!(f == this.targetScaleFactor)) {
            Matrix imageMatrix = getImageMatrix();
            float f2 = this.targetScaleFactor / f;
            imageMatrix.postScale(f2, f2, getWidth() / 2.0f, getHeight() / 2.0f);
            setImageMatrix(imageMatrix);
            J();
        }
        getImageMatrix().getValues(this.matrixValues);
        A(area);
    }

    public final void D(boolean needLimitHorizontal, boolean needLimitVertical, float viewWidth, float viewHeight, float scaleWidth, float scaleHeight, float adjustedTransX, float adjustedTransY, float currentScaleFactor) {
        float fCoerceIn;
        if (needLimitHorizontal || needLimitVertical) {
            float f = this.cachedMinImageCenterInImageX;
            float fCoerceIn2 = 0.0f;
            if (f <= 0.0f) {
                float f2 = this.drawableIntrinsicWidth;
                this.cachedMinImageCenterInImageX = 2.0f;
                Unit unit = Unit.INSTANCE;
                f = f2 / 2.0f;
            }
            float f3 = this.cachedMinImageCenterInImageY;
            if (f3 <= 0.0f) {
                float f4 = this.drawableIntrinsicHeight;
                this.cachedMinImageCenterInImageY = 2.0f;
                Unit unit2 = Unit.INSTANCE;
                f3 = f4 / 2.0f;
            }
            float f5 = viewWidth - scaleWidth;
            float f6 = viewHeight - scaleHeight;
            if (needLimitHorizontal) {
                float fMax = Math.max(0.0f, f5);
                float fMin = Math.min(0.0f, f5);
                fCoerceIn = RangesKt___RangesKt.coerceIn(adjustedTransX, Math.min(fMin, fMax), Math.max(fMin, fMax)) - adjustedTransX;
            } else {
                fCoerceIn = 0.0f;
            }
            if (needLimitVertical) {
                float fMax2 = Math.max(0.0f, f6);
                float fMin2 = Math.min(0.0f, f6);
                fCoerceIn2 = RangesKt___RangesKt.coerceIn(adjustedTransY, Math.min(fMin2, fMax2), Math.max(fMin2, fMax2)) - adjustedTransY;
            }
            if (Math.abs(fCoerceIn) > 1.0f || Math.abs(fCoerceIn2) > 1.0f) {
                this.tempMatrix.postTranslate(fCoerceIn, fCoerceIn2);
                setImageMatrix(this.tempMatrix);
                this.minImageCenterX = adjustedTransX + fCoerceIn + (f * currentScaleFactor);
                this.minImageCenterY = adjustedTransY + fCoerceIn2 + (f3 * currentScaleFactor);
                invalidate();
            }
        }
    }

    public final void E(float viewWidth, float viewHeight, float transX, float transY, float currentScaleFactor) {
        float f = viewWidth / 2.0f;
        float f2 = viewHeight / 2.0f;
        float f3 = f - (transX + ((this.drawableIntrinsicWidth / 2.0f) * currentScaleFactor));
        float f4 = f2 - (transY + ((this.drawableIntrinsicHeight / 2.0f) * currentScaleFactor));
        if (Math.abs(f3) > 0.5f || Math.abs(f4) > 0.5f) {
            this.tempMatrix.postTranslate(f3, f4);
            setImageMatrix(this.tempMatrix);
            invalidate();
        }
        this.minImageCenterX = f;
        this.minImageCenterY = f2;
    }

    public final void F() {
        if (this.cachedMinImageCenterInImageX <= 0.0f) {
            float f = this.drawableIntrinsicWidth;
            if (f > 0.0f) {
                this.cachedMinImageCenterInImageX = f / 2.0f;
            }
        }
        if (this.cachedMinImageCenterInImageY <= 0.0f) {
            float f2 = this.drawableIntrinsicHeight;
            if (f2 > 0.0f) {
                this.cachedMinImageCenterInImageY = f2 / 2.0f;
            }
        }
    }

    public final boolean G() {
        if (getDrawable() == null || getWidth() == 0 || getHeight() == 0) {
            return false;
        }
        getImageMatrix().getValues(this.matrixValues);
        float f = this.matrixValues[0];
        float f2 = this.drawableIntrinsicWidth * f;
        float f3 = this.drawableIntrinsicHeight * f;
        float width = this.cachedViewWidth;
        if (width <= 0.0f) {
            width = getWidth();
        }
        float height = this.cachedViewHeight;
        if (height <= 0.0f) {
            height = getHeight();
        }
        return f2 <= width && f3 <= height;
    }

    public final void I() {
        this.rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        this.path.reset();
        if (this.isRoundCorner) {
            Path path = this.path;
            RectF rectF = this.rectF;
            float f = this.cornerRadius;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else {
            this.path.addRect(this.rectF, Path.Direction.CW);
        }
        this.path.close();
    }

    public final void J() {
        Matrix imageMatrix = getImageMatrix();
        if (imageMatrix != null && getWidth() > 0 && getHeight() > 0 && this.drawableIntrinsicWidth > 0.0f && this.drawableIntrinsicHeight > 0.0f) {
            this.tempMatrix.set(imageMatrix);
            this.tempMatrix.getValues(this.matrixValues);
            float[] fArr = this.matrixValues;
            float f = fArr[2];
            float f2 = fArr[5];
            float f3 = fArr[0];
            float f4 = this.drawableIntrinsicWidth * f3;
            float f5 = this.drawableIntrinsicHeight * f3;
            float width = this.cachedViewWidth;
            if (width <= 0.0f) {
                width = getWidth();
                this.cachedViewWidth = width;
            }
            float f6 = width;
            float height = this.cachedViewHeight;
            if (height <= 0.0f) {
                height = getHeight();
                this.cachedViewHeight = height;
            }
            float f7 = height;
            boolean z = f4 <= f6;
            boolean z2 = f5 <= f7;
            if (z && z2) {
                E(f6, f7, f, f2, f3);
                return;
            }
            Pair<Float, Float> pairZ = z(z, z2, f6, f7, f, f2, f3);
            if (z && z2) {
                return;
            }
            D(!z, !z2, f6, f7, f4, f5, pairZ.getFirst().floatValue(), pairZ.getSecond().floatValue(), f3);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.validationRunnable);
        Runnable runnable = this.highlightRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.highlightRunnable = null;
        this.pendingValidation = false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isRoundCorner) {
            canvas.save();
            canvas.clipPath(this.path);
        }
        super.onDraw(canvas);
        if (this.isRoundCorner) {
            canvas.restore();
        }
        HighlightArea highlightArea = this.highlightArea;
        if (highlightArea != null) {
            getImageMatrix().getValues(this.matrixValues);
            float[] fArr = this.matrixValues;
            float f = fArr[0];
            float f2 = fArr[2];
            float f3 = fArr[5];
            float right = (highlightArea.getRight() - highlightArea.getLeft()) * f;
            float bottom = (highlightArea.getBottom() - highlightArea.getTop()) * f;
            float left = f2 + (highlightArea.getLeft() * f);
            float top = f3 + (highlightArea.getTop() * f);
            canvas.drawRect(left, top, left + right, top + bottom, this.highlightPaint);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed && getWidth() > 0 && getHeight() > 0) {
            this.isMinScaleCached = false;
            this.cachedViewWidth = getWidth();
            this.cachedViewHeight = getHeight();
            float f = this.drawableIntrinsicWidth;
            if (f > 0.0f) {
                float f2 = this.drawableIntrinsicHeight;
                if (f2 > 0.0f) {
                    this.cachedMinImageCenterInImageX = f / 2.0f;
                    this.cachedMinImageCenterInImageY = f2 / 2.0f;
                }
            }
        }
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        B();
        I();
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0139  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
        GestureDetector gestureDetector = null;
        if (scaleGestureDetector == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scaleGestureDetector");
            scaleGestureDetector = null;
        }
        scaleGestureDetector.onTouchEvent(event);
        int actionMasked = event.getActionMasked();
        boolean z = false;
        if (actionMasked != 5) {
            if (actionMasked == 6 && event.getPointerCount() == 2) {
                this.mIsScaling = false;
                this.mLastPointerCount = 1;
            }
        } else if (event.getPointerCount() == 2) {
            this.mIsScaling = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (!this.mIsScaling && event.getPointerCount() == 1) {
            int action = event.getAction();
            if (action != 0) {
                if (action == 1) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (action != 2) {
                    if (action == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else if (G()) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    float x = event.getX() - this.startX;
                    float y = event.getY() - this.startY;
                    getImageMatrix().getValues(this.matrixValues);
                    float[] fArr = this.matrixValues;
                    float f = fArr[2];
                    float f2 = fArr[5];
                    float f3 = fArr[0];
                    float f4 = this.drawableIntrinsicWidth * f3;
                    float f5 = this.drawableIntrinsicHeight * f3;
                    float width = this.cachedViewWidth;
                    if (width <= 0.0f) {
                        width = getWidth();
                    }
                    float height = this.cachedViewHeight;
                    if (height <= 0.0f) {
                        height = getHeight();
                    }
                    boolean z2 = f4 > width;
                    boolean z3 = f5 > height;
                    if (z2 || z3) {
                        boolean z4 = z2 && ((x > 0.0f && f >= 0.0f) || (x < 0.0f && f + f4 <= width));
                        boolean z5 = z3 && ((y > 0.0f && f2 >= 0.0f) || (y < 0.0f && f2 + f5 <= height));
                        if ((!z2 && Math.abs(x) > Math.abs(y)) || ((!z3 && Math.abs(y) > Math.abs(x)) || ((z2 && z4 && Math.abs(x) > Math.abs(y)) || (z3 && z5 && Math.abs(y) > Math.abs(x))))) {
                            z = true;
                        }
                        getParent().requestDisallowInterceptTouchEvent(!z);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            } else if (!G()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            GestureDetector gestureDetector2 = this.gestureDetector;
            if (gestureDetector2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gestureDetector");
            } else {
                gestureDetector = gestureDetector2;
            }
            gestureDetector.onTouchEvent(event);
        }
        return true;
    }

    public final void setCornerRadius(float radius) {
        this.isRoundCorner = true;
        this.cornerRadius = radius;
        I();
        invalidate();
    }

    public final void setHighlightArea(@NotNull final HighlightArea area) {
        Intrinsics.checkNotNullParameter(area, "area");
        this.highlightArea = area;
        Runnable runnable = this.highlightRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.oplus.aiunit.vision.o46
            @Override // java.lang.Runnable
            public final void run() {
                DraggableZoomableImageView.H(this.i, area);
            }
        };
        this.highlightRunnable = runnable2;
        post(runnable2);
        invalidate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.highlightArea = null;
        Runnable runnable = this.highlightRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.highlightRunnable = null;
        super.setImageDrawable(drawable);
        if (this.initialDisplayMode == null) {
            this.initialDisplayMode = InitialDisplayMode.FIT_WIDTH;
        }
        if (drawable != null) {
            this.drawableIntrinsicHeight = drawable.getIntrinsicHeight();
            float intrinsicWidth = drawable.getIntrinsicWidth();
            this.drawableIntrinsicWidth = intrinsicWidth;
            this.isMinScaleCached = false;
            this.cachedMinImageCenterInImageX = intrinsicWidth / 2.0f;
            this.cachedMinImageCenterInImageY = this.drawableIntrinsicHeight / 2.0f;
            B();
        }
    }

    public final void setInitialDisplayMode(@NotNull InitialDisplayMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.initialDisplayMode = mode;
        if (getDrawable() != null) {
            B();
        }
    }

    public final Pair<Float, Float> z(boolean needCenterHorizontal, boolean needCenterVertical, float viewWidth, float viewHeight, float transX, float transY, float currentScaleFactor) {
        float f;
        if (!needCenterHorizontal && !needCenterVertical) {
            return new Pair<>(Float.valueOf(transX), Float.valueOf(transY));
        }
        float f2 = ((this.drawableIntrinsicWidth / 2.0f) * currentScaleFactor) + transX;
        float f3 = ((this.drawableIntrinsicHeight / 2.0f) * currentScaleFactor) + transY;
        float f4 = viewWidth / 2.0f;
        float f5 = viewHeight / 2.0f;
        float f6 = 0.0f;
        if (needCenterHorizontal) {
            f = f4 - f2;
            this.minImageCenterX = f4;
        } else {
            f = 0.0f;
        }
        if (needCenterVertical) {
            f6 = f5 - f3;
            this.minImageCenterY = f5;
        }
        if (Math.abs(f) <= 0.5f && Math.abs(f6) <= 0.5f) {
            return new Pair<>(Float.valueOf(transX), Float.valueOf(transY));
        }
        this.tempMatrix.postTranslate(f, f6);
        setImageMatrix(this.tempMatrix);
        this.tempMatrix.getValues(this.matrixValues);
        invalidate();
        return new Pair<>(Float.valueOf(this.matrixValues[2]), Float.valueOf(this.matrixValues[5]));
    }

    public /* synthetic */ DraggableZoomableImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DraggableZoomableImageView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.initialDisplayMode = InitialDisplayMode.FIT_WIDTH;
        this.scaleFactor = 1.0f;
        this.maxScaleFactor = 10.0f;
        this.targetScaleFactor = 2.5f;
        this.lastScaleFactor = 1.0f;
        this.cornerRadius = 10.0f;
        this.path = new Path();
        this.rectF = new RectF();
        Paint paint = new Paint();
        paint.setColor(-256);
        paint.setAlpha(56);
        this.highlightPaint = paint;
        this.mLastPointerCount = 1;
        this.matrixValues = new float[9];
        this.cachedMinScaleFactor = 1.0f;
        this.tempMatrix = new Matrix();
        this.validationRunnable = new Runnable() { // from class: com.oplus.aiunit.vision.p46
            @Override // java.lang.Runnable
            public final void run() {
                DraggableZoomableImageView.K(this.i);
            }
        };
        setScaleType(ImageView.ScaleType.MATRIX);
        setLayerType(2, null);
        post(new Runnable() { // from class: com.oplus.aiunit.vision.q46
            @Override // java.lang.Runnable
            public final void run() {
                DraggableZoomableImageView.d(this.i, context);
            }
        });
    }
}
