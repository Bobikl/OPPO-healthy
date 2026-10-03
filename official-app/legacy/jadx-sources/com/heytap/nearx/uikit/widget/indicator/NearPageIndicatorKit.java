package com.heytap.nearx.uikit.widget.indicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.indicator.NearPageIndicatorKit;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u0000 \u0087\u00012\u00020\u0001:\u0006\u0087\u0001\u0088\u0001\u0089\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010Y\u001a\u00020ZJ\u0010\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0007H\u0002J\u0018\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00172\u0006\u0010`\u001a\u00020\u0007H\u0002J\u0018\u0010a\u001a\u00020Z2\u0006\u0010b\u001a\u00020\n2\u0006\u0010c\u001a\u00020\nH\u0002J0\u0010d\u001a\u00020B2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\n2\u0006\u0010g\u001a\u00020\n2\u0006\u0010c\u001a\u00020\n2\u0006\u0010h\u001a\u00020\u0017H\u0002J\b\u0010i\u001a\u00020ZH\u0002J\u0010\u0010i\u001a\u00020Z2\u0006\u0010h\u001a\u00020\u0017H\u0002J\u0010\u0010j\u001a\u00020Z2\u0006\u0010k\u001a\u00020lH\u0014J\u0018\u0010m\u001a\u00020Z2\u0006\u0010n\u001a\u00020\u00072\u0006\u0010o\u001a\u00020\u0007H\u0014J\u000e\u0010p\u001a\u00020Z2\u0006\u0010q\u001a\u00020\u0007J\u001e\u0010r\u001a\u00020Z2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\u0007J\u000e\u0010u\u001a\u00020Z2\u0006\u0010e\u001a\u00020\u0007J\b\u0010v\u001a\u00020ZH\u0002J\u0006\u0010w\u001a\u00020ZJ\u0010\u0010x\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0007H\u0002J\b\u0010y\u001a\u00020ZH\u0002J\u000e\u0010z\u001a\u00020Z2\u0006\u0010e\u001a\u00020\u0007J\u000e\u0010{\u001a\u00020Z2\u0006\u0010\\\u001a\u00020\u0007J\u000e\u0010|\u001a\u00020Z2\u0006\u0010N\u001a\u00020OJ\u000e\u0010}\u001a\u00020Z2\u0006\u0010`\u001a\u00020\u0007J\u000e\u0010~\u001a\u00020Z2\u0006\u0010`\u001a\u00020\u0007J!\u0010\u007f\u001a\u00020Z2\u0006\u0010_\u001a\u00020\u00172\u0007\u0010\u0080\u0001\u001a\u0002012\u0006\u0010`\u001a\u00020\u0007H\u0002J\u0011\u0010\u0081\u0001\u001a\u00020Z2\u0006\u0010e\u001a\u00020\u0007H\u0002J\t\u0010\u0082\u0001\u001a\u00020ZH\u0002J\u0007\u0010\u0083\u0001\u001a\u00020ZJ\u0011\u0010\u0084\u0001\u001a\u00020Z2\u0006\u0010e\u001a\u00020\u0007H\u0002J\t\u0010\u0085\u0001\u001a\u00020ZH\u0002J\u0019\u0010\u0086\u0001\u001a\u00020Z2\u0006\u0010e\u001a\u00020\u00072\u0006\u0010h\u001a\u00020\u0017H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u00020\u0007X\u0082D¢\u0006\u0004\n\u0002\b!R\u000e\u0010\"\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u00107\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b7\u00108R\u000e\u00109\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010N\u001a\u0004\u0018\u00010OX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010QX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u008a\u0001"}, d2 = {"Lcom/heytap/nearx/uikit/widget/indicator/NearPageIndicatorKit;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "BEZIER_OFFSET_INTERCEPT", "", "BEZIER_OFFSET_MAX_FACTOR", "BEZIER_OFFSET_MIN_FACTOR", "BEZIER_OFFSET_SLOPE", "BEZIER_OFFSET_X_INTERCEPT", "BEZIER_OFFSET_X_INTERCEPT_2", "BEZIER_OFFSET_X_MAX_FACTOR", "BEZIER_OFFSET_X_MAX_FACTOR_2", "BEZIER_OFFSET_X_MIN_FACTOR", "BEZIER_OFFSET_X_MIN_FACTOR_2", "BEZIER_OFFSET_X_SLOPE", "BEZIER_OFFSET_X_SLOPE_2", "DEBUG", "", "DELAY_TRACE_ANIMATION", "DISTANCE_TURN_POINT", "DURATION_TRACE_ANIMATION", "FLOAT_HALF", "FLOAT_ONE", "FLOAT_SQRT_2", "FLOAT_ZERO", "MIS_POSITION", "MSG_START_TRACE_ANIMATION", "MSG_START_TRACE_ANIMATION$1", "STICKY_DISTANCE_FACTOR", "currentPosition", "dotColor", "dotCornerRadius", "dotIsClickable", "dotIsStrokeStyle", "dotSize", "dotSpacing", "dotStepDistance", "dotStrokeWidth", "dotsCount", "finalLeft", "finalRight", "indicatorDots", "Ljava/util/ArrayList;", "Landroid/widget/ImageView;", "indicatorDotsParent", "Landroid/widget/LinearLayout;", "isAnimated", "isAnimating", "isAnimatorCanceled", "isLayoutRtl", "()Z", "isPaused", "lastPosition", "layoutWidth", "mDepartControlX", "mDepartEndX", "mDepartPosition", "mDepartRect", "Landroid/graphics/RectF;", "mDepartStickyPath", "Landroid/graphics/Path;", "mHandler", "Landroid/os/Handler;", "mOffset", "mOffsetX", "mOffsetY", "mPortControlX", "mPortEndX", "mPortPosition", "mPortRect", "mPortStickyPath", "needSettlePositionTemp", "onDotClickListener", "Lcom/heytap/nearx/uikit/widget/indicator/NearPageIndicatorKit$OnIndicatorDotClickListener;", "traceAnimator", "Landroid/animation/ValueAnimator;", "traceDotColor", "traceLeft", "tracePaint", "Landroid/graphics/Paint;", "traceRect", "traceRight", "tranceCutTailRight", "addDot", "", "addIndicatorDots", "count", "buildDot", "Landroid/view/View;", "stroke", "color", "calculateControlPointOffset", "distance", "radius", "calculateTangentBezierPath", "position", "controlX", "endX", "isPortStickyPath", "clearStickyPath", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onPageScrollStateChanged", "state", "onPageScrolled", "positionOffset", "positionOffsetPixels", "onPageSelected", "pauseTrace", "removeDot", "removeIndicatorDots", "resumeTrace", "setCurrentPosition", "setDotsCount", "setOnDotClickListener", "setPageIndicatorDotsColor", "setTraceDotColor", "setupDotView", "dot", "snapToPosition", "startTraceAnimator", "stopTraceAnimator", "verifyFinalPosition", "verifyLayoutWidth", "verifyStickyPosition", "Companion", "IndicatorHandler", "OnIndicatorDotClickListener", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearPageIndicatorKit extends FrameLayout {
    private static final int MSG_START_TRACE_ANIMATION = 17;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private final float BEZIER_OFFSET_INTERCEPT;
    private final float BEZIER_OFFSET_MAX_FACTOR;
    private final float BEZIER_OFFSET_MIN_FACTOR;
    private final float BEZIER_OFFSET_SLOPE;
    private final float BEZIER_OFFSET_X_INTERCEPT;
    private final float BEZIER_OFFSET_X_INTERCEPT_2;
    private final float BEZIER_OFFSET_X_MAX_FACTOR;
    private final float BEZIER_OFFSET_X_MAX_FACTOR_2;
    private final float BEZIER_OFFSET_X_MIN_FACTOR;
    private final float BEZIER_OFFSET_X_MIN_FACTOR_2;
    private final float BEZIER_OFFSET_X_SLOPE;
    private final float BEZIER_OFFSET_X_SLOPE_2;
    private final boolean DEBUG;
    private final int DELAY_TRACE_ANIMATION;
    private final float DISTANCE_TURN_POINT;
    private final int DURATION_TRACE_ANIMATION;
    private final float FLOAT_HALF;
    private final float FLOAT_ONE;
    private final float FLOAT_SQRT_2;
    private final float FLOAT_ZERO;
    private final int MIS_POSITION;

    /* JADX INFO: renamed from: MSG_START_TRACE_ANIMATION$1, reason: from kotlin metadata */
    private final int MSG_START_TRACE_ANIMATION;
    private final float STICKY_DISTANCE_FACTOR;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int currentPosition;
    private int dotColor;
    private int dotCornerRadius;
    private boolean dotIsClickable;
    private boolean dotIsStrokeStyle;
    private int dotSize;
    private int dotSpacing;
    private int dotStepDistance;
    private int dotStrokeWidth;
    private int dotsCount;
    private float finalLeft;
    private float finalRight;

    @Nullable
    private final ArrayList<ImageView> indicatorDots;

    @NotNull
    private final LinearLayout indicatorDotsParent;
    private boolean isAnimated;
    private boolean isAnimating;
    private boolean isAnimatorCanceled;
    private boolean isPaused;
    private int lastPosition;
    private int layoutWidth;
    private float mDepartControlX;
    private float mDepartEndX;
    private int mDepartPosition;

    @NotNull
    private RectF mDepartRect;

    @NotNull
    private Path mDepartStickyPath;

    @NotNull
    private final Handler mHandler;
    private float mOffset;
    private float mOffsetX;
    private float mOffsetY;
    private float mPortControlX;
    private float mPortEndX;
    private int mPortPosition;

    @NotNull
    private RectF mPortRect;

    @NotNull
    private Path mPortStickyPath;
    private boolean needSettlePositionTemp;

    @Nullable
    private OnIndicatorDotClickListener onDotClickListener;

    @Nullable
    private final ValueAnimator traceAnimator;
    private int traceDotColor;
    private float traceLeft;

    @NotNull
    private final Paint tracePaint;

    @NotNull
    private final RectF traceRect;
    private float traceRight;
    private boolean tranceCutTailRight;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/nearx/uikit/widget/indicator/NearPageIndicatorKit$OnIndicatorDotClickListener;", "", ParserTag.TAG_ONCLICK, "", "position", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnIndicatorDotClickListener {
        void onClick(int position);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearPageIndicatorKit(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m4699_init_$lambda0(NearPageIndicatorKit this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (this$0.isAnimatorCanceled) {
            return;
        }
        float f = this$0.traceLeft;
        float f2 = f - this$0.finalLeft;
        float f3 = this$0.traceRight;
        float f4 = f3 - this$0.finalRight;
        float f5 = f - (f2 * fFloatValue);
        RectF rectF = this$0.traceRect;
        float f6 = rectF.right;
        int i = this$0.dotSize;
        if (f5 > f6 - i) {
            f5 = f6 - i;
        }
        float f7 = f3 - (f4 * fFloatValue);
        if (f7 < rectF.left + i) {
            f7 = f + i;
        }
        if (this$0.needSettlePositionTemp) {
            rectF.left = f5;
            rectF.right = f7;
        } else if (this$0.tranceCutTailRight) {
            rectF.right = f7;
        } else {
            rectF.left = f5;
        }
        if (this$0.tranceCutTailRight) {
            this$0.mDepartControlX = rectF.right - (i * this$0.FLOAT_HALF);
        } else {
            this$0.mDepartControlX = rectF.left + (i * this$0.FLOAT_HALF);
        }
        float f8 = this$0.mDepartRect.left;
        float f9 = this$0.FLOAT_HALF;
        float f10 = f8 + (i * f9);
        this$0.mDepartEndX = f10;
        this$0.mDepartStickyPath = this$0.calculateTangentBezierPath(this$0.mDepartPosition, this$0.mDepartControlX, f10, i * f9, false);
        this$0.invalidate();
    }

    private final void addIndicatorDots(int count) {
        final int i = 0;
        while (i < count) {
            int i2 = i + 1;
            View viewBuildDot = buildDot(this.dotIsStrokeStyle, this.dotColor);
            if (this.dotIsClickable) {
                viewBuildDot.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ojc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        NearPageIndicatorKit.m4700addIndicatorDots$lambda1(this.i, i, view);
                    }
                });
            }
            ArrayList<ImageView> arrayList = this.indicatorDots;
            Intrinsics.checkNotNull(arrayList);
            arrayList.add((ImageView) viewBuildDot.findViewById(R$id.nx_color_page_indicator_dot));
            this.indicatorDotsParent.addView(viewBuildDot);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: addIndicatorDots$lambda-1, reason: not valid java name */
    public static final void m4700addIndicatorDots$lambda1(NearPageIndicatorKit this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnIndicatorDotClickListener onIndicatorDotClickListener = this$0.onDotClickListener;
        if (onIndicatorDotClickListener != null && !this$0.isAnimating) {
            this$0.isAnimated = false;
            this$0.needSettlePositionTemp = true;
            Intrinsics.checkNotNull(onIndicatorDotClickListener);
            onIndicatorDotClickListener.onClick(i);
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final View buildDot(boolean stroke, int color) {
        View dot = LayoutInflater.from(getContext()).inflate(R$layout.nx_color_page_indicator_dot_layout, (ViewGroup) this, false);
        ImageView dotView = (ImageView) dot.findViewById(R$id.nx_color_page_indicator_dot);
        dotView.setBackground(getContext().getResources().getDrawable(stroke ? R$drawable.nx_page_indicator_dot_stroke : R$drawable.nx_page_indicator_dot));
        ViewGroup.LayoutParams layoutParams = dotView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i = this.dotSize;
        layoutParams2.height = i;
        layoutParams2.width = i;
        dotView.setLayoutParams(layoutParams2);
        int i2 = this.dotSpacing;
        layoutParams2.setMargins(i2, 0, i2, 0);
        Intrinsics.checkNotNullExpressionValue(dotView, "dotView");
        setupDotView(stroke, dotView, color);
        Intrinsics.checkNotNullExpressionValue(dot, "dot");
        return dot;
    }

    private final void calculateControlPointOffset(float distance, float radius) {
        this.mOffset = Math.max(Math.min((this.BEZIER_OFFSET_SLOPE * distance) + (this.BEZIER_OFFSET_INTERCEPT * radius), this.BEZIER_OFFSET_MAX_FACTOR * radius), this.BEZIER_OFFSET_MIN_FACTOR * radius);
        float f = this.BEZIER_OFFSET_X_MAX_FACTOR;
        this.mOffsetX = f * radius;
        this.mOffsetY = 0.0f;
        if (distance < this.DISTANCE_TURN_POINT * radius) {
            this.mOffsetX = Math.max(Math.min((this.BEZIER_OFFSET_X_SLOPE_2 * distance) + (this.BEZIER_OFFSET_X_INTERCEPT_2 * radius), this.BEZIER_OFFSET_X_MAX_FACTOR_2 * radius), this.BEZIER_OFFSET_X_MIN_FACTOR_2);
            this.mOffsetY = (float) Math.sqrt(Math.pow(radius, 2.0d) - Math.pow(this.mOffsetX, 2.0d));
        } else {
            float fMax = Math.max(Math.min((this.BEZIER_OFFSET_X_SLOPE * distance) + (this.BEZIER_OFFSET_X_INTERCEPT * radius), f * radius), this.BEZIER_OFFSET_X_MIN_FACTOR * radius);
            this.mOffsetX = fMax;
            float f2 = 2;
            this.mOffsetY = ((distance - (fMax * f2)) * radius) / ((this.FLOAT_SQRT_2 * distance) - (f2 * radius));
        }
    }

    private final Path calculateTangentBezierPath(int position, float controlX, float endX, float radius, boolean isPortStickyPath) {
        Path path = isPortStickyPath ? this.mPortStickyPath : this.mDepartStickyPath;
        path.reset();
        float fAbs = Math.abs(controlX - endX);
        if (fAbs >= this.STICKY_DISTANCE_FACTOR * radius || position == this.MIS_POSITION) {
            clearStickyPath(isPortStickyPath);
            return path;
        }
        calculateControlPointOffset(fAbs, radius);
        float f = this.FLOAT_HALF;
        float f2 = this.FLOAT_SQRT_2;
        float f3 = f * f2 * radius;
        float f4 = f * f2 * radius;
        if (controlX > endX) {
            this.mOffsetX = -this.mOffsetX;
            f3 = -f3;
        }
        if (fAbs >= this.DISTANCE_TURN_POINT * radius) {
            float f5 = controlX + f3;
            float f6 = radius + f4;
            path.moveTo(f5, f6);
            path.lineTo(this.mOffsetX + controlX, this.mOffsetY + radius);
            float f7 = controlX + endX;
            path.quadTo(this.FLOAT_HALF * f7, this.mOffset + radius, endX - this.mOffsetX, this.mOffsetY + radius);
            float f8 = endX - f3;
            path.lineTo(f8, f6);
            float f9 = radius - f4;
            path.lineTo(f8, f9);
            path.lineTo(endX - this.mOffsetX, radius - this.mOffsetY);
            path.quadTo(f7 * this.FLOAT_HALF, radius - this.mOffset, controlX + this.mOffsetX, radius - this.mOffsetY);
            path.lineTo(f5, f9);
            path.lineTo(f5, f6);
        } else {
            path.moveTo(this.mOffsetX + controlX, this.mOffsetY + radius);
            float f10 = controlX + endX;
            path.quadTo(this.FLOAT_HALF * f10, this.mOffset + radius, endX - this.mOffsetX, this.mOffsetY + radius);
            path.lineTo(endX - this.mOffsetX, radius - this.mOffsetY);
            path.quadTo(f10 * this.FLOAT_HALF, radius - this.mOffset, this.mOffsetX + controlX, radius - this.mOffsetY);
            path.lineTo(controlX + this.mOffsetX, radius + this.mOffsetY);
        }
        return path;
    }

    private final void clearStickyPath() {
        clearStickyPath(true);
        clearStickyPath(false);
    }

    private final void pauseTrace() {
        this.isPaused = true;
    }

    private final void removeIndicatorDots(int count) {
        int i = 0;
        while (i < count) {
            i++;
            LinearLayout linearLayout = this.indicatorDotsParent;
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            ArrayList<ImageView> arrayList = this.indicatorDots;
            Intrinsics.checkNotNull(arrayList);
            arrayList.remove(this.indicatorDots.size() - 1);
        }
    }

    private final void resumeTrace() {
        this.isPaused = false;
    }

    private final void setupDotView(boolean stroke, ImageView dot, int color) {
        Drawable background = dot.getBackground();
        if (background == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (stroke) {
            gradientDrawable.setStroke(this.dotStrokeWidth, color);
        } else {
            gradientDrawable.setColor(color);
        }
        gradientDrawable.setCornerRadius(this.dotCornerRadius);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void snapToPosition(int position) {
        verifyFinalPosition(this.currentPosition);
        RectF rectF = this.traceRect;
        rectF.left = this.finalLeft;
        rectF.right = this.finalRight;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTraceAnimator() {
        if (this.traceAnimator == null) {
            return;
        }
        stopTraceAnimator();
        this.traceAnimator.start();
    }

    private final void verifyFinalPosition(int position) {
        if (isLayoutRtl()) {
            float f = this.layoutWidth - (this.dotSpacing + (position * this.dotStepDistance));
            this.finalRight = f;
            this.finalLeft = f - this.dotSize;
        } else {
            int i = this.dotSpacing;
            int i2 = this.dotSize;
            float f2 = i + i2 + (position * this.dotStepDistance);
            this.finalRight = f2;
            this.finalLeft = f2 - i2;
        }
    }

    private final void verifyLayoutWidth() {
        int i = this.dotsCount;
        if (i < 1) {
            return;
        }
        this.layoutWidth = this.dotStepDistance * i;
        requestLayout();
    }

    private final void verifyStickyPosition(int position, boolean isPortStickyPath) {
        if (isPortStickyPath) {
            RectF rectF = this.mPortRect;
            rectF.top = 0.0f;
            rectF.bottom = this.dotSize;
            if (isLayoutRtl()) {
                this.mPortRect.right = this.layoutWidth - (this.dotSpacing + (position * this.dotStepDistance));
            } else {
                this.mPortRect.right = this.dotSpacing + this.dotSize + (position * this.dotStepDistance);
            }
            RectF rectF2 = this.mPortRect;
            rectF2.left = rectF2.right - this.dotSize;
            return;
        }
        RectF rectF3 = this.mDepartRect;
        rectF3.top = 0.0f;
        rectF3.bottom = this.dotSize;
        if (isLayoutRtl()) {
            this.mDepartRect.right = this.layoutWidth - (this.dotSpacing + (position * this.dotStepDistance));
        } else {
            this.mDepartRect.right = this.dotSpacing + this.dotSize + (position * this.dotStepDistance);
        }
        RectF rectF4 = this.mDepartRect;
        rectF4.left = rectF4.right - this.dotSize;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void addDot() {
        this.dotsCount++;
        verifyLayoutWidth();
        addIndicatorDots(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        RectF rectF = this.traceRect;
        int i = this.dotCornerRadius;
        canvas.drawRoundRect(rectF, i, i, this.tracePaint);
        RectF rectF2 = this.mPortRect;
        int i2 = this.dotCornerRadius;
        canvas.drawRoundRect(rectF2, i2, i2, this.tracePaint);
        canvas.drawPath(this.mPortStickyPath, this.tracePaint);
    }

    public final boolean isLayoutRtl() {
        return getLayoutDirection() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(this.layoutWidth, this.dotSize);
    }

    public final void onPageScrollStateChanged(int state) {
        if (state != 1) {
            if (state != 2) {
                return;
            }
            resumeTrace();
        } else {
            pauseTrace();
            clearStickyPath(false);
            if (this.isAnimated) {
                this.isAnimated = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c2  */
    public final void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        RectF rectF;
        float f;
        float f2;
        int i;
        RectF rectF2;
        float f3;
        float f4;
        int i2;
        RectF rectF3;
        float f5;
        float f6;
        int i3;
        RectF rectF4;
        float f7;
        float f8;
        int i4;
        int i5;
        boolean zIsLayoutRtl = isLayoutRtl();
        boolean z = zIsLayoutRtl == (this.currentPosition > position);
        if (z) {
            if (position == this.indicatorDotsParent.getChildCount() - 1 && this.currentPosition == this.indicatorDotsParent.getChildCount() - 1 && !zIsLayoutRtl) {
                int i6 = this.dotSpacing;
                int i7 = this.dotSize;
                float f9 = i6 + i7 + (this.dotStepDistance * position);
                RectF rectF5 = this.traceRect;
                rectF5.right = f9;
                rectF5.left = f9 - i7;
            } else if (position == this.indicatorDotsParent.getChildCount() - 1 && (i5 = this.currentPosition) == 0) {
                if ((positionOffset == 0.0f) || zIsLayoutRtl) {
                    if (zIsLayoutRtl) {
                        this.mPortPosition = position;
                        float f10 = this.layoutWidth;
                        float f11 = this.dotSpacing;
                        int i8 = this.dotStepDistance;
                        this.traceRect.right = f10 - ((f11 + (position * i8)) + (i8 * positionOffset));
                    } else {
                        this.mPortPosition = position + 1;
                        float f12 = this.dotSpacing + this.dotSize;
                        int i9 = this.dotStepDistance;
                        this.traceRect.right = f12 + (position * i9) + (i9 * positionOffset);
                    }
                    if (this.isPaused) {
                        if (this.isAnimating) {
                            rectF4 = this.traceRect;
                            f7 = rectF4.right;
                            f8 = f7 - rectF4.left;
                            i4 = this.dotSize;
                            if (f8 < i4) {
                                rectF4.left = f7 - i4;
                            }
                        } else {
                            rectF4 = this.traceRect;
                            f7 = rectF4.right;
                            f8 = f7 - rectF4.left;
                            i4 = this.dotSize;
                            if (f8 < i4) {
                                rectF4.left = f7 - i4;
                            }
                        }
                    } else if (this.isAnimated) {
                        RectF rectF6 = this.traceRect;
                        rectF6.left = rectF6.right - this.dotSize;
                    } else {
                        rectF3 = this.traceRect;
                        f5 = rectF3.right;
                        f6 = f5 - rectF3.left;
                        i3 = this.dotSize;
                        if (f6 < i3) {
                            rectF3.left = f5 - i3;
                        }
                    }
                } else {
                    int i10 = this.dotSpacing;
                    int i11 = this.dotSize;
                    float f13 = i10 + i11 + (i5 * this.dotStepDistance);
                    RectF rectF7 = this.traceRect;
                    rectF7.right = f13;
                    rectF7.left = f13 - i11;
                }
            } else {
                if (zIsLayoutRtl) {
                    this.mPortPosition = position;
                    float f14 = this.layoutWidth;
                    float f15 = this.dotSpacing;
                    int i12 = this.dotStepDistance;
                    this.traceRect.right = f14 - ((f15 + (position * i12)) + (i12 * positionOffset));
                } else {
                    this.mPortPosition = position + 1;
                    float f16 = this.dotSpacing + this.dotSize;
                    int i13 = this.dotStepDistance;
                    this.traceRect.right = f16 + (position * i13) + (i13 * positionOffset);
                }
                if (this.isPaused) {
                    if (this.isAnimating || !this.isAnimated) {
                        rectF4 = this.traceRect;
                        f7 = rectF4.right;
                        f8 = f7 - rectF4.left;
                        i4 = this.dotSize;
                        if (f8 < i4) {
                            rectF4.left = f7 - i4;
                        }
                    } else {
                        RectF rectF8 = this.traceRect;
                        rectF8.left = rectF8.right - this.dotSize;
                    }
                } else if (this.isAnimated) {
                    RectF rectF9 = this.traceRect;
                    rectF9.left = rectF9.right - this.dotSize;
                } else {
                    rectF3 = this.traceRect;
                    f5 = rectF3.right;
                    f6 = f5 - rectF3.left;
                    i3 = this.dotSize;
                    if (f6 < i3) {
                        rectF3.left = f5 - i3;
                    }
                }
            }
        } else if (position == this.indicatorDotsParent.getChildCount() - 1 && this.currentPosition == this.indicatorDotsParent.getChildCount() - 1 && zIsLayoutRtl) {
            float width = getWidth() - (this.dotSpacing + (this.dotStepDistance * position));
            RectF rectF10 = this.traceRect;
            rectF10.right = width;
            rectF10.left = width - this.dotSize;
        } else if (position == this.indicatorDotsParent.getChildCount() - 1 && this.currentPosition == 0) {
            if ((positionOffset == 0.0f) || !zIsLayoutRtl) {
                if (zIsLayoutRtl) {
                    this.mPortPosition = position + 1;
                    this.traceRect.left = ((this.layoutWidth - (this.dotStepDistance * (position + positionOffset))) - this.dotSpacing) - this.dotSize;
                } else {
                    this.mPortPosition = position;
                    this.traceRect.left = this.dotSpacing + (this.dotStepDistance * (position + positionOffset));
                }
                if (this.isPaused) {
                    if (this.isAnimating) {
                        rectF2 = this.traceRect;
                        float f17 = rectF2.right;
                        f3 = rectF2.left;
                        f4 = f17 - f3;
                        i2 = this.dotSize;
                        if (f4 < i2) {
                            rectF2.right = f3 + i2;
                        }
                    } else {
                        rectF2 = this.traceRect;
                        float f18 = rectF2.right;
                        f3 = rectF2.left;
                        f4 = f18 - f3;
                        i2 = this.dotSize;
                        if (f4 < i2) {
                            rectF2.right = f3 + i2;
                        }
                    }
                } else if (this.isAnimated) {
                    RectF rectF11 = this.traceRect;
                    rectF11.right = rectF11.left + this.dotSize;
                } else {
                    rectF = this.traceRect;
                    float f19 = rectF.right;
                    f = rectF.left;
                    f2 = f19 - f;
                    i = this.dotSize;
                    if (f2 < i) {
                        rectF.right = f + i;
                    }
                }
            } else {
                float width2 = getWidth() - (this.dotSpacing + (this.currentPosition * this.dotStepDistance));
                RectF rectF12 = this.traceRect;
                rectF12.right = width2;
                rectF12.left = width2 - this.dotSize;
            }
        } else {
            if (zIsLayoutRtl) {
                this.mPortPosition = position + 1;
                this.traceRect.left = ((this.layoutWidth - (this.dotStepDistance * (position + positionOffset))) - this.dotSpacing) - this.dotSize;
            } else {
                this.mPortPosition = position;
                this.traceRect.left = this.dotSpacing + (this.dotStepDistance * (position + positionOffset));
            }
            if (this.isPaused) {
                if (this.isAnimating || !this.isAnimated) {
                    rectF2 = this.traceRect;
                    float f110 = rectF2.right;
                    f3 = rectF2.left;
                    f4 = f110 - f3;
                    i2 = this.dotSize;
                    if (f4 < i2) {
                        rectF2.right = f3 + i2;
                    }
                } else {
                    RectF rectF13 = this.traceRect;
                    rectF13.right = rectF13.left + this.dotSize;
                }
            } else if (this.isAnimated) {
                RectF rectF14 = this.traceRect;
                rectF14.right = rectF14.left + this.dotSize;
            } else {
                rectF = this.traceRect;
                float f111 = rectF.right;
                f = rectF.left;
                f2 = f111 - f;
                i = this.dotSize;
                if (f2 < i) {
                    rectF.right = f + i;
                }
            }
        }
        if (this.traceRect.right > this.dotSpacing + this.dotSize + ((this.indicatorDotsParent.getChildCount() - 1) * this.dotStepDistance)) {
            this.traceRect.right = this.dotSpacing + this.dotSize + ((this.indicatorDotsParent.getChildCount() - 1) * this.dotStepDistance);
        }
        RectF rectF15 = this.traceRect;
        float f20 = rectF15.left;
        this.traceLeft = f20;
        float f21 = rectF15.right;
        this.traceRight = f21;
        this.mPortControlX = z ? f21 - (this.dotSize * this.FLOAT_HALF) : (this.dotSize * this.FLOAT_HALF) + f20;
        verifyStickyPosition(this.mPortPosition, true);
        float f22 = this.mPortRect.left;
        int i14 = this.dotSize;
        float f23 = this.FLOAT_HALF;
        float f24 = f22 + (i14 * f23);
        this.mPortEndX = f24;
        this.mPortStickyPath = calculateTangentBezierPath(this.mPortPosition, this.mPortControlX, f24, i14 * f23, true);
        if (positionOffset == 0.0f) {
            this.currentPosition = position;
            clearStickyPath(true);
        }
        invalidate();
    }

    public final void onPageSelected(int position) {
        if (this.lastPosition != position) {
            if (this.isAnimated) {
                this.isAnimated = false;
            }
            this.tranceCutTailRight = !isLayoutRtl() ? this.lastPosition <= position : this.lastPosition > position;
            verifyFinalPosition(position);
            this.mDepartPosition = position;
            verifyStickyPosition(position, false);
            if (this.lastPosition != position) {
                if (this.mHandler.hasMessages(this.MSG_START_TRACE_ANIMATION)) {
                    this.mHandler.removeMessages(this.MSG_START_TRACE_ANIMATION);
                }
                stopTraceAnimator();
                if ((position == this.indicatorDotsParent.getChildCount() - 1 && this.lastPosition == 0) || (position == 0 && this.lastPosition == this.indicatorDotsParent.getChildCount() - 1)) {
                    ValueAnimator valueAnimator = this.traceAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.setDuration(0L);
                    }
                } else {
                    ValueAnimator valueAnimator2 = this.traceAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setDuration(240L);
                    }
                }
                this.mHandler.sendEmptyMessageDelayed(this.MSG_START_TRACE_ANIMATION, 100L);
            }
            this.lastPosition = position;
        }
    }

    public final void removeDot() {
        this.dotsCount--;
        verifyLayoutWidth();
        removeIndicatorDots(1);
    }

    public final void setCurrentPosition(int position) {
        this.currentPosition = position;
        this.lastPosition = position;
        snapToPosition(position);
    }

    public final void setDotsCount(int count) {
        int i = this.dotsCount;
        if (i > 0) {
            removeIndicatorDots(i);
        }
        this.dotsCount = count;
        verifyLayoutWidth();
        addIndicatorDots(count);
    }

    public final void setOnDotClickListener(@NotNull OnIndicatorDotClickListener onDotClickListener) {
        Intrinsics.checkNotNullParameter(onDotClickListener, "onDotClickListener");
        this.onDotClickListener = onDotClickListener;
    }

    public final void setPageIndicatorDotsColor(int color) {
        this.dotColor = color;
        ArrayList<ImageView> arrayList = this.indicatorDots;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (ImageView dot : this.indicatorDots) {
            boolean z = this.dotIsStrokeStyle;
            Intrinsics.checkNotNullExpressionValue(dot, "dot");
            setupDotView(z, dot, color);
        }
    }

    public final void setTraceDotColor(int color) {
        this.traceDotColor = color;
        this.tracePaint.setColor(color);
    }

    public final void stopTraceAnimator() {
        if (!this.isAnimatorCanceled) {
            this.isAnimatorCanceled = true;
        }
        ValueAnimator valueAnimator = this.traceAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.traceAnimator.end();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/uikit/widget/indicator/NearPageIndicatorKit$IndicatorHandler;", "Landroid/os/Handler;", "obj", "Lcom/heytap/nearx/uikit/widget/indicator/NearPageIndicatorKit;", "looper", "Landroid/os/Looper;", "(Lcom/heytap/nearx/uikit/widget/indicator/NearPageIndicatorKit;Landroid/os/Looper;)V", "ref", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class IndicatorHandler extends Handler {

        @NotNull
        private final WeakReference<NearPageIndicatorKit> ref;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndicatorHandler(@NotNull NearPageIndicatorKit obj, @NotNull Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(obj, "obj");
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.ref = new WeakReference<>(obj);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            NearPageIndicatorKit nearPageIndicatorKit;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 17 && (nearPageIndicatorKit = this.ref.get()) != null) {
                nearPageIndicatorKit.startTraceAnimator();
            }
            super.handleMessage(msg);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IndicatorHandler(NearPageIndicatorKit nearPageIndicatorKit, Looper looper, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                looper = Looper.getMainLooper();
                Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper()");
            }
            this(nearPageIndicatorKit, looper);
        }
    }

    public /* synthetic */ NearPageIndicatorKit(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? R$attr.nearPageIndicatorStyle : i);
    }

    private final void clearStickyPath(boolean isPortStickyPath) {
        if (isPortStickyPath) {
            this.mPortPosition = this.MIS_POSITION;
            this.mPortRect.setEmpty();
            this.mPortStickyPath.reset();
        } else {
            this.mDepartPosition = this.MIS_POSITION;
            this.mDepartRect.setEmpty();
            this.mDepartStickyPath.reset();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public NearPageIndicatorKit(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        RectF rectF = new RectF();
        this.traceRect = rectF;
        this.MSG_START_TRACE_ANIMATION = 17;
        this.MIS_POSITION = -1;
        this.DURATION_TRACE_ANIMATION = 300;
        this.FLOAT_HALF = 0.5f;
        this.FLOAT_ONE = 1.0f;
        float fSqrt = (float) Math.sqrt(2.0d);
        this.FLOAT_SQRT_2 = fSqrt;
        this.STICKY_DISTANCE_FACTOR = 2.95f;
        this.BEZIER_OFFSET_SLOPE = -1.0f;
        this.BEZIER_OFFSET_INTERCEPT = 3.0f;
        this.BEZIER_OFFSET_MAX_FACTOR = 1.0f;
        this.DISTANCE_TURN_POINT = 2.8f;
        this.BEZIER_OFFSET_X_SLOPE = 7.5f - (2.5f * fSqrt);
        this.BEZIER_OFFSET_X_INTERCEPT = (7.5f * fSqrt) - 21;
        this.BEZIER_OFFSET_X_MAX_FACTOR = 1.5f;
        this.BEZIER_OFFSET_X_MIN_FACTOR = fSqrt * 0.5f;
        this.BEZIER_OFFSET_X_SLOPE_2 = 0.625f * fSqrt;
        this.BEZIER_OFFSET_X_INTERCEPT_2 = (-1.25f) * fSqrt;
        this.BEZIER_OFFSET_X_MAX_FACTOR_2 = fSqrt * 0.5f;
        this.mPortRect = new RectF();
        this.mDepartRect = new RectF();
        this.mPortStickyPath = new Path();
        this.mDepartStickyPath = new Path();
        this.indicatorDots = new ArrayList<>();
        this.dotSize = context.getResources().getDimensionPixelSize(R$dimen.nx_page_indicator_dot_size);
        this.dotSpacing = context.getResources().getDimensionPixelSize(R$dimen.nx_page_indicator_dot_spacing);
        this.dotColor = 0;
        this.traceDotColor = 0;
        this.dotIsStrokeStyle = false;
        this.dotCornerRadius = this.dotSize / 2;
        this.dotIsClickable = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.NearPageIndicator, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…Indicator,defStyleAttr,0)");
        this.traceDotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearPageIndicator_nxTraceDotColor, this.traceDotColor);
        this.dotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearPageIndicator_nxDotColor, this.dotColor);
        this.dotSize = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotSize, this.dotSize);
        this.dotSpacing = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotSpacing, this.dotSpacing);
        this.dotCornerRadius = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotCornerRadius, this.dotSize / 2);
        this.dotIsClickable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPageIndicator_nxDotClickable, this.dotIsClickable);
        this.dotIsStrokeStyle = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPageIndicator_nxDotIsStrokeStyle, this.dotIsStrokeStyle);
        this.dotStrokeWidth = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NearPageIndicator_nxDotStrokeWidth, this.dotStrokeWidth);
        typedArrayObtainStyledAttributes.recycle();
        rectF.top = 0.0f;
        rectF.bottom = this.dotSize;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.traceAnimator = valueAnimatorOfFloat;
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.setDuration(240L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.njc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearPageIndicatorKit.m4699_init_$lambda0(this.i, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.indicator.NearPageIndicatorKit.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationEnd(animation);
                if (!NearPageIndicatorKit.this.isAnimatorCanceled) {
                    NearPageIndicatorKit.this.traceRect.right = NearPageIndicatorKit.this.traceRect.left + NearPageIndicatorKit.this.dotSize;
                    NearPageIndicatorKit.this.needSettlePositionTemp = false;
                    NearPageIndicatorKit.this.isAnimated = true;
                    NearPageIndicatorKit.this.invalidate();
                }
                NearPageIndicatorKit.this.isAnimating = false;
                NearPageIndicatorKit nearPageIndicatorKit = NearPageIndicatorKit.this;
                nearPageIndicatorKit.currentPosition = nearPageIndicatorKit.lastPosition;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                NearPageIndicatorKit.this.isAnimatorCanceled = false;
                NearPageIndicatorKit nearPageIndicatorKit = NearPageIndicatorKit.this;
                nearPageIndicatorKit.traceLeft = nearPageIndicatorKit.traceRect.left;
                NearPageIndicatorKit nearPageIndicatorKit2 = NearPageIndicatorKit.this;
                nearPageIndicatorKit2.traceRight = nearPageIndicatorKit2.traceRect.right;
            }
        });
        Paint paint = new Paint(1);
        this.tracePaint = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.traceDotColor);
        this.dotStepDistance = this.dotSize + (this.dotSpacing * 2);
        this.mHandler = new IndicatorHandler(this, null, 2, 0 == true ? 1 : 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.indicatorDotsParent = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        addView(linearLayout);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.heytap.nearx.uikit.widget.indicator.NearPageIndicatorKit.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NearPageIndicatorKit.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                NearPageIndicatorKit nearPageIndicatorKit = NearPageIndicatorKit.this;
                nearPageIndicatorKit.snapToPosition(nearPageIndicatorKit.currentPosition);
            }
        });
        this._$_findViewCache = new LinkedHashMap();
    }
}
