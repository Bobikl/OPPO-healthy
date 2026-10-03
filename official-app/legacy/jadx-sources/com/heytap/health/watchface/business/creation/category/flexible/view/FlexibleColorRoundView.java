package com.heytap.health.watchface.business.creation.category.flexible.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$styleable;
import com.heytap.health.watchface.business.legacy.main.bean.WatchFaceBean;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0014\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/view/FlexibleColorRoundView;", "Landroid/view/View;", "", "color", "", "setColor", "Landroid/graphics/Canvas;", "canvas", "onDraw", "", "alpha", "a", "i", "I", WatchFaceBean.TAG_M_COLOR, "j", UserInfo.SEX_FEMALE, "mBorderAlpha", MapSchema.FIELD_NAME_KEY, "mBorderColor", LogFieldKey.LEVEL_KEY, "mBorderSize", "Landroid/graphics/Paint;", LogFieldKey.MESSAGE_KEY, "Landroid/graphics/Paint;", "mPaint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FlexibleColorRoundView extends View {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float mBorderAlpha;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mBorderColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int mBorderSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Paint mPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleColorRoundView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @ColorInt
    public final int a(int i, float f) {
        return Color.argb(MathKt__MathJVMKt.roundToInt(f * 256), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.mPaint.setColor(this.mBorderColor);
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f, this.mPaint);
        this.mPaint.setColor(this.mColor);
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f) - this.mBorderSize, this.mPaint);
    }

    public final void setColor(@ColorInt int color) {
        this.mColor = color;
        this.mBorderColor = a(color, this.mBorderAlpha);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleColorRoundView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexibleColorRoundView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexibleColorRoundView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mColor = -16777216;
        this.mBorderAlpha = 0.88f;
        this.mBorderColor = -16777216;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.mPaint = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WatchFaceFlexibleRoundView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…leRoundView, defStyle, 0)");
        try {
            this.mColor = typedArrayObtainStyledAttributes.getColor(R$styleable.WatchFaceFlexibleRoundView_watch_face_color, -16777216);
            float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.WatchFaceFlexibleRoundView_watch_face_border_alpha, 0.88f);
            this.mBorderAlpha = f;
            this.mBorderColor = a(this.mColor, f);
            this.mBorderSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.WatchFaceFlexibleRoundView_watch_face_border_width, getResources().getDimensionPixelSize(R$dimen.watch_face_width_1));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
