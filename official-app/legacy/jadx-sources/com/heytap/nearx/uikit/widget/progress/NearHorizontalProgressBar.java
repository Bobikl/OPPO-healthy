package com.heytap.nearx.uikit.widget.progress;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.fmc;
import com.oplus.aiunit.vision.i85;
import com.oplus.aiunit.vision.kic;
import com.oplus.aiunit.vision.lo9;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 +2\u00020\u0001:\u0001+B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\u0007H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0014J(\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/heytap/nearx/uikit/widget/progress/NearHorizontalProgressBar;", "Landroid/widget/ProgressBar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundRect", "Landroid/graphics/RectF;", "barColor", "getBarColor", "()I", "setBarColor", "(I)V", "mBackgroundColor", "Landroid/content/res/ColorStateList;", "mProgressColor", "needRadius", "", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "progressColor", "getProgressColor", "setProgressColor", "progressPath", "progressRect", "radius", "getStateColor", "colorStateList", "defaultValue", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", b2n.g, "oldw", "oldh", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearHorizontalProgressBar extends ProgressBar {
    private static final int DEFAULT_BACKGROUND_COLOR = Color.argb(12, 0, 0, 0);
    private static final int DEFAULT_PROGRESS_COLOR = Color.parseColor("#FF2AD181");

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final RectF backgroundRect;
    private int barColor;

    @Nullable
    private ColorStateList mBackgroundColor;

    @Nullable
    private ColorStateList mProgressColor;
    private final boolean needRadius;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;
    private int progressColor;

    @NotNull
    private final Path progressPath;

    @NotNull
    private final RectF progressRect;
    private int radius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearHorizontalProgressBar(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getStateColor(ColorStateList colorStateList, int defaultValue) {
        return colorStateList == null ? defaultValue : colorStateList.getColorForState(getDrawableState(), defaultValue);
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

    public final int getBarColor() {
        return this.barColor;
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.progressPath.reset();
        this.path.reset();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        Paint paint = this.paint;
        int stateColor = this.barColor;
        if (stateColor == -1) {
            stateColor = getStateColor(this.mBackgroundColor, DEFAULT_BACKGROUND_COLOR);
        }
        paint.setColor(stateColor);
        this.backgroundRect.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        RectF rectF = this.backgroundRect;
        int i = this.radius;
        canvas.drawRoundRect(rectF, i, i, this.paint);
        Path path = this.path;
        RectF rectF2 = this.backgroundRect;
        int i2 = this.radius;
        path.addRoundRect(rectF2, i2, i2, Path.Direction.CCW);
        float progress = getProgress() / getMax();
        if (fmc.a(this)) {
            int iRound = Math.round((getWidth() - getPaddingRight()) - (progress * width));
            this.progressRect.set(iRound, getPaddingTop(), iRound + width, getHeight() - getPaddingBottom());
        } else {
            int iRound2 = Math.round(getPaddingLeft() - ((1 - progress) * width));
            this.progressRect.set(iRound2, getPaddingTop(), iRound2 + width, getHeight() - getPaddingBottom());
        }
        Paint paint2 = this.paint;
        int stateColor2 = this.progressColor;
        if (stateColor2 == -1) {
            stateColor2 = getStateColor(this.mProgressColor, DEFAULT_PROGRESS_COLOR);
        }
        paint2.setColor(stateColor2);
        Path path2 = this.progressPath;
        RectF rectF3 = this.progressRect;
        int i3 = this.radius;
        path2.addRoundRect(rectF3, i3, i3, Path.Direction.CCW);
        this.progressPath.op(this.path, Path.Op.INTERSECT);
        canvas.drawPath(this.progressPath, this.paint);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        int iA;
        super.onSizeChanged(w, h, oldw, oldh);
        int paddingRight = (w - getPaddingRight()) - getPaddingLeft();
        int paddingTop = (h - getPaddingTop()) - getPaddingBottom();
        boolean z = this.needRadius;
        if (z) {
            iA = ((kic) i85.g()).a(paddingRight, paddingTop);
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            iA = 0;
        }
        this.radius = iA;
    }

    public final void setBarColor(int i) {
        this.barColor = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearHorizontalProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearHorizontalProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.paint = paint;
        this.backgroundRect = new RectF();
        this.progressRect = new RectF();
        this.radius = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearHorizontalProgressBar, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ressBar, defStyleAttr, 0)");
        typedArrayObtainStyledAttributes.getColor(0, 0);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearHorizontalProgressBar_nxBackground);
        this.mProgressColor = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearHorizontalProgressBar_nxProgressColor);
        this.needRadius = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearHorizontalProgressBar_nxNeedRadius, true);
        typedArrayObtainStyledAttributes.recycle();
        paint.setDither(true);
        paint.setAntiAlias(true);
        setLayerType(1, paint);
        this.path = new Path();
        this.progressPath = new Path();
        this.barColor = -1;
        this.progressColor = -1;
        this._$_findViewCache = new LinkedHashMap();
    }

    public /* synthetic */ NearHorizontalProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearHorizontalProgressBarStyle : i);
    }
}
