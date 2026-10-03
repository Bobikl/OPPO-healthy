package com.heytap.nearx.uikit.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.chc;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.i85;
import com.oplus.aiunit.vision.mb3;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/heytap/nearx/uikit/widget/progress/NearCircleProgressBar;", "Landroid/widget/ProgressBar;", "", "init", "", "color", "setCircleColor", "setBgCircleColor", "getCircleColor", "getBgCircleColor", "", "TAG", "Ljava/lang/String;", "nearMax", "I", "nearProgress", "nearStrokeWidth", "nearProgressBarColor", "nearProgressBarBgCircleColor", "Lcom/oplus/aiunit/vision/chc;", "kotlin.jvm.PlatformType", "delegate", "Lcom/oplus/aiunit/vision/chc;", "Lcom/oplus/aiunit/vision/mb3;", "circleProgressDrawable", "Lcom/oplus/aiunit/vision/mb3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class NearCircleProgressBar extends ProgressBar {
    public static final int DEFAULT_TYPE = 0;
    public static final int LARGE_TYPE = 2;
    public static final int MEDIUM_TYPE = 1;

    @NotNull
    private final String TAG;

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final mb3 circleProgressDrawable;
    private final chc delegate;
    private int nearMax;
    private int nearProgress;
    private int nearProgressBarBgCircleColor;
    private int nearProgressBarColor;
    private int nearStrokeWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearCircleProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void init() {
        this.circleProgressDrawable.setStrokeWidth(this.nearStrokeWidth);
        setBgCircleColor(this.nearProgressBarBgCircleColor);
        setCircleColor(this.nearProgressBarColor);
        if (isIndeterminate()) {
            setIndeterminateDrawable((Drawable) this.circleProgressDrawable);
            return;
        }
        setProgressDrawable((Drawable) this.circleProgressDrawable);
        setProgress(this.nearProgress);
        setMax(this.nearMax);
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

    /* JADX INFO: renamed from: getBgCircleColor, reason: from getter */
    public final int getNearProgressBarBgCircleColor() {
        return this.nearProgressBarBgCircleColor;
    }

    /* JADX INFO: renamed from: getCircleColor, reason: from getter */
    public final int getNearProgressBarColor() {
        return this.nearProgressBarColor;
    }

    public final void setBgCircleColor(int color) {
        this.nearProgressBarBgCircleColor = color;
        this.circleProgressDrawable.a(color);
    }

    public final void setCircleColor(int color) {
        this.nearProgressBarColor = color;
        this.circleProgressDrawable.b(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearCircleProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NearCircleProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearCircleProgressBarStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearCircleProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "NearCircleProgressBar";
        this.nearMax = 100;
        chc chcVar = (chc) i85.d();
        this.delegate = chcVar;
        this.circleProgressDrawable = chcVar.a(context, isIndeterminate());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearCircleProgressBar, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…,\n            0\n        )");
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearCircleProgressBar_nxProgressMode, 0);
        this.nearProgressBarColor = ContextCompat.getColor(context, R$color.nx_loading_progress);
        this.nearProgressBarBgCircleColor = ContextCompat.getColor(context, R$color.nx_color_transparent);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.NXcolor_circle_loading_medium_strokewidth);
        this.nearStrokeWidth = context.getResources().getDimensionPixelSize(R$dimen.NXcolor_circle_loading_large_strokewidth);
        if (1 == integer) {
            this.nearStrokeWidth = dimensionPixelSize;
        }
        try {
            this.nearProgress = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearCircleProgressBar_nxProgress, this.nearProgress);
            this.nearStrokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearCircleProgressBar_nxStrokeWidth, this.nearStrokeWidth);
            this.nearMax = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearCircleProgressBar_nxMax, this.nearMax);
            this.nearProgressBarBgCircleColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearCircleProgressBar_nxProgressBackground, this.nearProgressBarBgCircleColor);
            this.nearProgressBarColor = typedArrayObtainStyledAttributes.getColor(R$styleable.NearCircleProgressBar_nxProgressColor, this.nearProgressBarColor);
        } catch (Exception e2) {
            fjc.b(this.TAG, Intrinsics.stringPlus("getAttr failed.Fail msg is ", e2.getMessage()));
        }
        typedArrayObtainStyledAttributes.recycle();
        init();
        this._$_findViewCache = new LinkedHashMap();
    }
}
