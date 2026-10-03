package com.coui.appcompat.banner;

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
import androidx.exifinterface.media.ExifInterface;
import com.coui.appcompat.banner.COUIPageIndicatorKit;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.indicator.R$attr;
import com.support.indicator.R$dimen;
import com.support.indicator.R$drawable;
import com.support.indicator.R$id;
import com.support.indicator.R$layout;
import com.support.indicator.R$styleable;
import io.protostuff.MapSchema;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ¸\u00012\u00020\u0001:\u0006¹\u0001º\u0001»\u0001B*\b\u0007\u0012\b\u0010²\u0001\u001a\u00030±\u0001\u0012\b\u0010´\u0001\u001a\u00030³\u0001\u0012\t\b\u0002\u0010µ\u0001\u001a\u00020\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J0\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0014J\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0014J\u000e\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010*\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010+\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,J\u001e\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0002J\u000e\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0002R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u0015R\u0016\u00108\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\u0015R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010\u0015R\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u0015R\u0016\u0010>\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u0015R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0015R\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010BR\u0016\u0010G\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\u0015R\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010\u0015R\u0016\u0010K\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0016\u0010L\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0005R\u0016\u0010M\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0005R\u0016\u0010N\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0005R\u0016\u0010P\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u0005R\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010BR\u0016\u0010R\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010BR\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010T\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010BR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010XR\u001c\u0010\\\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010^R\u0014\u0010b\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010aR\u0016\u0010e\u001a\u0004\u0018\u00010c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010dR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010gR\u0016\u0010i\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010k\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bj\u0010\u0015R\u0014\u0010m\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bl\u0010\u0015R\u0014\u0010o\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\bn\u0010\u0015R\u0014\u0010q\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\bp\u0010\u0005R\u0014\u0010s\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\br\u0010\u0005R\u0014\u0010u\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0005R\u0014\u0010w\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\bv\u0010\u0005R\u0014\u0010y\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\bx\u0010\u0005R\u0014\u0010{\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\bz\u0010\u0005R\u0014\u0010}\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b|\u0010\u0005R\u0014\u0010\u007f\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b~\u0010\u0005R\u0016\u0010\u0081\u0001\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0005R\u0016\u0010\u0083\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0005R\u0016\u0010\u0085\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0005R\u0016\u0010\u0087\u0001\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0005R\u0016\u0010\u0089\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0005R\u0016\u0010\u008b\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0005R\u0016\u0010\u008d\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0005R\u0016\u0010\u008f\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0005R\u0016\u0010\u0091\u0001\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u0005R\u0018\u0010\u0093\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010\u0015R\u0018\u0010\u0095\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u0015R\u0018\u0010\u0097\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u0005R\u0018\u0010\u0099\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010\u0005R\u0018\u0010\u009b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010\u0005R\u0018\u0010\u009d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010\u0005R\u0018\u0010\u009f\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010\u0005R\u0018\u0010¡\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010\u0005R\u0018\u0010£\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010\u0005R\u0018\u0010¥\u0001\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010aR\u0018\u0010§\u0001\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010aR\u0019\u0010ª\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010¬\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010©\u0001R\u001f\u0010°\u0001\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0005\bO\u0010¯\u0001¨\u0006¼\u0001"}, d2 = {"Lcom/coui/appcompat/banner/COUIPageIndicatorKit;", "Landroid/widget/FrameLayout;", "", "position", "", UserInfo.SEX_FEMALE, "", "stroke", "Landroid/widget/ImageView;", "dot", "color", ExifInterface.LONGITUDE_EAST, "Landroid/view/View;", "t", "count", "C", "r", "J", "G", c8l.KEY_B, "D", "I", "isPortStickyPath", "K", "", "controlX", "endX", "radius", "Landroid/graphics/Path;", "v", "distance", "u", "w", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "H", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "setDotsCount", "setCurrentPosition", "setTraceDotColor", "setPageIndicatorDotsColor", "Lcom/coui/appcompat/banner/COUIPageIndicatorKit$e;", "onDotClickListener", "setOnDotClickListener", "positionOffset", "positionOffsetPixels", "z", "A", "state", "y", "i", "dotSize", "j", "dotSpacing", MapSchema.FIELD_NAME_KEY, "dotColor", LogFieldKey.LEVEL_KEY, "dotStrokeWidth", LogFieldKey.MESSAGE_KEY, "dotCornerRadius", "n", "traceDotColor", "o", "Z", "dotIsClickable", LogFieldKey.PROCESS_NAME_KEY, "dotIsStrokeStyle", "q", "dotsCount", "currentPosition", "s", "lastPosition", "dotStepDistance", "traceLeft", "traceRight", "finalLeft", "x", "finalRight", "tranceCutTailRight", "isAnimated", "isAnimating", "isAnimatorCanceled", "isPaused", "needSettlePositionTemp", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "indicatorDotsParent", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "indicatorDots", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "tracePaint", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "traceRect", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "traceAnimator", "Landroid/os/Handler;", "Landroid/os/Handler;", "mHandler", "layoutWidth", "L", "MSG_START_TRACE_ANIMATION", "M", "MIS_POSITION", "N", "DURATION_TRACE_ANIMATION", "O", "FLOAT_HALF", SecureGcmConstants.MESSAGE_KEY, "FLOAT_ONE", "Q", "FLOAT_SQRT_2", "R", "STICKY_DISTANCE_FACTOR", "S", "BEZIER_OFFSET_SLOPE", ExifInterface.GPS_DIRECTION_TRUE, "BEZIER_OFFSET_INTERCEPT", "U", "BEZIER_OFFSET_MAX_FACTOR", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "BEZIER_OFFSET_MIN_FACTOR", ExifInterface.LONGITUDE_WEST, "DISTANCE_TURN_POINT", "a0", "BEZIER_OFFSET_X_SLOPE", "b0", "BEZIER_OFFSET_X_INTERCEPT", "c0", "BEZIER_OFFSET_X_MAX_FACTOR", "d0", "BEZIER_OFFSET_X_MIN_FACTOR", "e0", "BEZIER_OFFSET_X_SLOPE_2", "f0", "BEZIER_OFFSET_X_INTERCEPT_2", "g0", "BEZIER_OFFSET_X_MAX_FACTOR_2", "h0", "BEZIER_OFFSET_X_MIN_FACTOR_2", "i0", "mPortPosition", "j0", "mDepartPosition", "k0", "mPortControlX", "l0", "mPortEndX", "m0", "mDepartControlX", "n0", "mDepartEndX", "o0", "mOffset", "p0", "mOffsetX", "q0", "mOffsetY", "r0", "mPortRect", "s0", "mDepartRect", "t0", "Landroid/graphics/Path;", "mPortStickyPath", "u0", "mDepartStickyPath", "v0", "Lkotlin/Lazy;", "()Z", "isSelfLayoutRtl", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "c", "d", MapSchema.FIELD_NAME_ENTRY, "coui-support-nearx_release"}, k = 1, mv = {1, 8, 0})
public class COUIPageIndicatorKit extends FrameLayout {
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean isAnimating;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean isAnimatorCanceled;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean isPaused;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean needSettlePositionTemp;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final LinearLayout indicatorDotsParent;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public final ArrayList<ImageView> indicatorDots;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Paint tracePaint;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final RectF traceRect;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final ValueAnimator traceAnimator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final Handler mHandler;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int layoutWidth;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final int MSG_START_TRACE_ANIMATION;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public final int MIS_POSITION;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public final int DURATION_TRACE_ANIMATION;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public final float FLOAT_HALF;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public final float FLOAT_ONE;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public final float FLOAT_SQRT_2;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final float STICKY_DISTANCE_FACTOR;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_SLOPE;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_INTERCEPT;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_MAX_FACTOR;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_MIN_FACTOR;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public final float DISTANCE_TURN_POINT;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_SLOPE;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_INTERCEPT;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_MAX_FACTOR;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_MIN_FACTOR;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_SLOPE_2;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_INTERCEPT_2;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_MAX_FACTOR_2;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public final float BEZIER_OFFSET_X_MIN_FACTOR_2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int dotSize;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public int mPortPosition;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int dotSpacing;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public int mDepartPosition;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int dotColor;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public float mPortControlX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int dotStrokeWidth;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public float mPortEndX;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int dotCornerRadius;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    public float mDepartControlX;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int traceDotColor;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    public float mDepartEndX;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean dotIsClickable;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    public float mOffset;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean dotIsStrokeStyle;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public float mOffsetX;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int dotsCount;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public float mOffsetY;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    @NotNull
    public RectF mPortRect;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int lastPosition;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    @NotNull
    public RectF mDepartRect;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int dotStepDistance;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    @NotNull
    public Path mPortStickyPath;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float traceLeft;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    @NotNull
    public Path mDepartStickyPath;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float traceRight;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Lazy isSelfLayoutRtl;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float finalLeft;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public float finalRight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean tranceCutTailRight;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean isAnimated;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/coui/appcompat/banner/COUIPageIndicatorKit$a", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", ParserTag.TAG_ON_ANIMATION_END, ParserTag.TAG_ON_ANIMATION_START, "coui-support-nearx_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            if (!COUIPageIndicatorKit.this.isAnimatorCanceled) {
                COUIPageIndicatorKit.this.traceRect.right = COUIPageIndicatorKit.this.traceRect.left + COUIPageIndicatorKit.this.dotSize;
                COUIPageIndicatorKit.this.needSettlePositionTemp = false;
                COUIPageIndicatorKit.this.isAnimated = true;
                COUIPageIndicatorKit.this.invalidate();
            }
            COUIPageIndicatorKit.this.isAnimating = false;
            COUIPageIndicatorKit cOUIPageIndicatorKit = COUIPageIndicatorKit.this;
            cOUIPageIndicatorKit.currentPosition = cOUIPageIndicatorKit.lastPosition;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationStart(animation);
            COUIPageIndicatorKit.this.isAnimatorCanceled = false;
            COUIPageIndicatorKit cOUIPageIndicatorKit = COUIPageIndicatorKit.this;
            cOUIPageIndicatorKit.traceLeft = cOUIPageIndicatorKit.traceRect.left;
            COUIPageIndicatorKit cOUIPageIndicatorKit2 = COUIPageIndicatorKit.this;
            cOUIPageIndicatorKit2.traceRight = cOUIPageIndicatorKit2.traceRect.right;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/coui/appcompat/banner/COUIPageIndicatorKit$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "coui-support-nearx_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            COUIPageIndicatorKit.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            COUIPageIndicatorKit cOUIPageIndicatorKit = COUIPageIndicatorKit.this;
            cOUIPageIndicatorKit.F(cOUIPageIndicatorKit.currentPosition);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/coui/appcompat/banner/COUIPageIndicatorKit$e;", "", "coui-support-nearx_release"}, k = 1, mv = {1, 8, 0})
    public interface e {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIPageIndicatorKit(@NotNull Context context, @NotNull AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public static final void c(COUIPageIndicatorKit this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
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
        this$0.mDepartStickyPath = this$0.v(this$0.mDepartPosition, this$0.mDepartControlX, f10, i * f9, false);
        this$0.invalidate();
    }

    @SensorsDataInstrumented
    public static final void s(COUIPageIndicatorKit this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    public final void A(int position) {
        if (this.lastPosition != position) {
            if (this.isAnimated) {
                this.isAnimated = false;
            }
            this.tranceCutTailRight = !x() ? this.lastPosition <= position : this.lastPosition > position;
            I(position);
            this.mDepartPosition = position;
            K(position, false);
            if (this.lastPosition != position) {
                if (this.mHandler.hasMessages(this.MSG_START_TRACE_ANIMATION)) {
                    this.mHandler.removeMessages(this.MSG_START_TRACE_ANIMATION);
                }
                H();
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

    public final void B() {
        this.isPaused = true;
    }

    public final void C(int count) {
        for (int i = 0; i < count; i++) {
            LinearLayout linearLayout = this.indicatorDotsParent;
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            ArrayList<ImageView> arrayList = this.indicatorDots;
            Intrinsics.checkNotNull(arrayList);
            arrayList.remove(this.indicatorDots.size() - 1);
        }
    }

    public final void D() {
        this.isPaused = false;
    }

    public final void E(boolean stroke, ImageView dot, int color) {
        Drawable background = dot.getBackground();
        Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (stroke) {
            gradientDrawable.setStroke(this.dotStrokeWidth, color);
        } else {
            gradientDrawable.setColor(color);
        }
        gradientDrawable.setCornerRadius(this.dotCornerRadius);
    }

    public final void F(int position) {
        I(this.currentPosition);
        RectF rectF = this.traceRect;
        rectF.left = this.finalLeft;
        rectF.right = this.finalRight;
        invalidate();
    }

    public final void G() {
        if (this.traceAnimator == null) {
            return;
        }
        H();
        this.traceAnimator.start();
    }

    public final void H() {
        if (!this.isAnimatorCanceled) {
            this.isAnimatorCanceled = true;
        }
        ValueAnimator valueAnimator = this.traceAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.traceAnimator.end();
    }

    public final void I(int position) {
        if (x()) {
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

    public final void J() {
        int i = this.dotsCount;
        if (i < 1) {
            return;
        }
        this.layoutWidth = this.dotStepDistance * i;
        requestLayout();
    }

    public final void K(int position, boolean isPortStickyPath) {
        if (isPortStickyPath) {
            RectF rectF = this.mPortRect;
            rectF.top = 0.0f;
            rectF.bottom = this.dotSize;
            if (x()) {
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
        if (x()) {
            this.mDepartRect.right = this.layoutWidth - (this.dotSpacing + (position * this.dotStepDistance));
        } else {
            this.mDepartRect.right = this.dotSpacing + this.dotSize + (position * this.dotStepDistance);
        }
        RectF rectF4 = this.mDepartRect;
        rectF4.left = rectF4.right - this.dotSize;
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

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(this.layoutWidth, this.dotSize);
    }

    public final void r(int count) {
        for (final int i = 0; i < count; i++) {
            View viewT = t(this.dotIsStrokeStyle, this.dotColor);
            if (this.dotIsClickable) {
                viewT.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.pj2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        COUIPageIndicatorKit.s(this.i, i, view);
                    }
                });
            }
            ArrayList<ImageView> arrayList = this.indicatorDots;
            Intrinsics.checkNotNull(arrayList);
            arrayList.add((ImageView) viewT.findViewById(R$id.page_indicator_dot));
            this.indicatorDotsParent.addView(viewT);
        }
    }

    public final void setCurrentPosition(int position) {
        this.currentPosition = position;
        this.lastPosition = position;
        F(position);
    }

    public final void setDotsCount(int count) {
        int i = this.dotsCount;
        if (i > 0) {
            C(i);
        }
        this.dotsCount = count;
        J();
        r(count);
    }

    public final void setOnDotClickListener(@NotNull e onDotClickListener) {
        Intrinsics.checkNotNullParameter(onDotClickListener, "onDotClickListener");
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
            E(z, dot, color);
        }
    }

    public final void setTraceDotColor(int color) {
        this.traceDotColor = color;
        this.tracePaint.setColor(color);
    }

    public final View t(boolean stroke, int color) {
        View dot = LayoutInflater.from(getContext()).inflate(R$layout.coui_page_indicator_dot_layout, (ViewGroup) this, false);
        ImageView dotView = (ImageView) dot.findViewById(R$id.page_indicator_dot);
        dotView.setBackground(getContext().getResources().getDrawable(stroke ? R$drawable.coui_page_indicator_dot_stroke : R$drawable.coui_page_indicator_dot));
        ViewGroup.LayoutParams layoutParams = dotView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i = this.dotSize;
        layoutParams2.height = i;
        layoutParams2.width = i;
        dotView.setLayoutParams(layoutParams2);
        int i2 = this.dotSpacing;
        layoutParams2.setMargins(i2, 0, i2, 0);
        Intrinsics.checkNotNullExpressionValue(dotView, "dotView");
        E(stroke, dotView, color);
        Intrinsics.checkNotNullExpressionValue(dot, "dot");
        return dot;
    }

    public final void u(float distance, float radius) {
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

    public final Path v(int position, float controlX, float endX, float radius, boolean isPortStickyPath) {
        Path path = isPortStickyPath ? this.mPortStickyPath : this.mDepartStickyPath;
        path.reset();
        float fAbs = Math.abs(controlX - endX);
        if (fAbs >= this.STICKY_DISTANCE_FACTOR * radius || position == this.MIS_POSITION) {
            w(isPortStickyPath);
            return path;
        }
        u(fAbs, radius);
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

    public final void w(boolean isPortStickyPath) {
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

    public final boolean x() {
        return ((Boolean) this.isSelfLayoutRtl.getValue()).booleanValue();
    }

    public final void y(int state) {
        if (state != 1) {
            if (state != 2) {
                return;
            }
            D();
        } else {
            B();
            w(false);
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
    public final void z(int position, float positionOffset, int positionOffsetPixels) {
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
        boolean zX = x();
        boolean z = zX == (this.currentPosition > position);
        if (z) {
            if (position == this.indicatorDotsParent.getChildCount() - 1 && this.currentPosition == this.indicatorDotsParent.getChildCount() - 1 && !zX) {
                int i6 = this.dotSpacing;
                int i7 = this.dotSize;
                float f9 = i6 + i7 + (this.dotStepDistance * position);
                RectF rectF5 = this.traceRect;
                rectF5.right = f9;
                rectF5.left = f9 - i7;
            } else if (position == this.indicatorDotsParent.getChildCount() - 1 && (i5 = this.currentPosition) == 0) {
                if ((positionOffset == 0.0f) || zX) {
                    if (zX) {
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
                if (zX) {
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
        } else if (position == this.indicatorDotsParent.getChildCount() - 1 && this.currentPosition == this.indicatorDotsParent.getChildCount() - 1 && zX) {
            float width = getWidth() - (this.dotSpacing + (this.dotStepDistance * position));
            RectF rectF10 = this.traceRect;
            rectF10.right = width;
            rectF10.left = width - this.dotSize;
        } else if (position == this.indicatorDotsParent.getChildCount() - 1 && this.currentPosition == 0) {
            if ((positionOffset == 0.0f) || !zX) {
                if (zX) {
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
            if (zX) {
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
        K(this.mPortPosition, true);
        float f22 = this.mPortRect.left;
        int i14 = this.dotSize;
        float f23 = this.FLOAT_HALF;
        float f24 = f22 + (i14 * f23);
        this.mPortEndX = f24;
        this.mPortStickyPath = v(this.mPortPosition, this.mPortControlX, f24, i14 * f23, true);
        if (positionOffset == 0.0f) {
            this.currentPosition = position;
            w(true);
        }
        invalidate();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/coui/appcompat/banner/COUIPageIndicatorKit$d;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "Ljava/lang/ref/WeakReference;", "Lcom/coui/appcompat/banner/COUIPageIndicatorKit;", "a", "Ljava/lang/ref/WeakReference;", "ref", "obj", "Landroid/os/Looper;", "looper", "<init>", "(Lcom/coui/appcompat/banner/COUIPageIndicatorKit;Landroid/os/Looper;)V", "coui-support-nearx_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends Handler {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<COUIPageIndicatorKit> ref;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull COUIPageIndicatorKit obj, @NotNull Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(obj, "obj");
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.ref = new WeakReference<>(obj);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            COUIPageIndicatorKit cOUIPageIndicatorKit;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 17 && (cOUIPageIndicatorKit = this.ref.get()) != null) {
                cOUIPageIndicatorKit.G();
            }
            super.handleMessage(msg);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ d(COUIPageIndicatorKit cOUIPageIndicatorKit, Looper looper, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                looper = Looper.getMainLooper();
                Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper()");
            }
            this(cOUIPageIndicatorKit, looper);
        }
    }

    public /* synthetic */ COUIPageIndicatorKit(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? R$attr.couiPageIndicatorStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public COUIPageIndicatorKit(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
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
        this.isSelfLayoutRtl = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: com.coui.appcompat.banner.COUIPageIndicatorKit$isSelfLayoutRtl$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.getLayoutDirection() == 1);
            }
        });
        this.indicatorDots = new ArrayList<>();
        this.dotSize = context.getResources().getDimensionPixelSize(R$dimen.coui_page_indicator_dot_size);
        this.dotSpacing = context.getResources().getDimensionPixelSize(R$dimen.coui_page_indicator_dot_spacing);
        this.dotColor = 0;
        this.traceDotColor = 0;
        this.dotIsStrokeStyle = false;
        this.dotCornerRadius = this.dotSize / 2;
        this.dotIsClickable = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.COUIPageIndicator, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…Indicator,defStyleAttr,0)");
        this.traceDotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIPageIndicator_traceDotColor, this.traceDotColor);
        this.dotColor = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIPageIndicator_dotColor, this.dotColor);
        this.dotSize = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotSize, this.dotSize);
        this.dotSpacing = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotSpacing, this.dotSpacing);
        this.dotCornerRadius = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotCornerRadius, this.dotSize / 2);
        this.dotIsClickable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPageIndicator_dotClickable, this.dotIsClickable);
        this.dotIsStrokeStyle = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIPageIndicator_dotIsStrokeStyle, this.dotIsStrokeStyle);
        this.dotStrokeWidth = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.COUIPageIndicator_dotStrokeWidth, this.dotStrokeWidth);
        typedArrayObtainStyledAttributes.recycle();
        rectF.top = 0.0f;
        rectF.bottom = this.dotSize;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.traceAnimator = valueAnimatorOfFloat;
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.setDuration(240L);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.oj2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                COUIPageIndicatorKit.c(this.i, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        Paint paint = new Paint(1);
        this.tracePaint = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.traceDotColor);
        this.dotStepDistance = this.dotSize + (this.dotSpacing * 2);
        this.mHandler = new d(this, null, 2, 0 == true ? 1 : 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.indicatorDotsParent = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        addView(linearLayout);
        getViewTreeObserver().addOnGlobalLayoutListener(new b());
    }
}
