package com.heytap.nearx.uikit.widget.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ProgressBar;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.fmc;
import com.oplus.aiunit.vision.xhc;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/heytap/nearx/uikit/widget/progress/NearTransferProgress;", "Lcom/heytap/nearx/uikit/widget/progress/NearLoadProgress;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDrawable", "Landroid/graphics/drawable/Drawable;", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "mStrokeWidth", "getAccessibilityClassName", "", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onInitializeAccessibilityEvent", "event", "Landroid/view/accessibility/AccessibilityEvent;", "onInitializeAccessibilityNodeInfo", UTraceSQLiteHelperKt.COL_INFO, "Landroid/view/accessibility/AccessibilityNodeInfo;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearTransferProgress extends NearLoadProgress {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private final Drawable mDrawable;

    @Nullable
    private Paint mPaint;

    @Nullable
    private Path mPath;
    private final int mStrokeWidth;

    @NotNull
    private static final String TAG = "ColorDownAndUp";
    private static final float INITANGLE = 270.0f;
    private static final float FULLANGLE = 360.0f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearTransferProgress(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void init() {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R$attr.nxDefaultTextColor, typedValue, true);
        int i = typedValue.data;
        Paint paint = new Paint();
        this.mPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.mPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setStrokeWidth(this.mStrokeWidth);
        Paint paint3 = this.mPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setAntiAlias(true);
        Paint paint4 = this.mPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setDither(true);
        Paint paint5 = this.mPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setColor(i);
        this.mPath = new Path();
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

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = ProgressBar.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ProgressBar::class.java.name");
        return name;
    }

    @Override // com.heytap.nearx.uikit.widget.progress.NearLoadProgress, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int height;
        int i;
        int intrinsicWidth;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = (this.mProgress * FULLANGLE) / this.mMax;
        Drawable drawable = this.mDrawable;
        int width = 0;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            Intrinsics.checkNotNull(drawable);
            int intrinsicHeight = drawable.getIntrinsicHeight();
            intrinsicWidth = drawable.getIntrinsicWidth();
            if (gravity != 16) {
                height = gravity != 80 ? 0 : getHeight() - intrinsicHeight;
            } else {
                height = (getHeight() - intrinsicHeight) / 2;
            }
            i = intrinsicHeight + height;
            width = fmc.a(this) ? getWidth() - intrinsicWidth : 0;
            if (fmc.a(this)) {
                intrinsicWidth = getWidth();
            }
            fjc.e(TAG, "onDraw left" + width + " top= " + height + " right= " + intrinsicWidth + " bottom= " + i);
            drawable.setBounds(width, height, intrinsicWidth, i);
            drawable.draw(canvas);
        } else {
            height = 0;
            i = 0;
            intrinsicWidth = 0;
        }
        int i2 = this.mStrokeWidth;
        Rect rect = new Rect(width + (i2 / 2), height + (i2 / 2), intrinsicWidth - (i2 / 2), i - (i2 / 2));
        Path path = this.mPath;
        Intrinsics.checkNotNull(path);
        path.reset();
        Path path2 = this.mPath;
        Intrinsics.checkNotNull(path2);
        path2.addArc(new RectF(rect), INITANGLE, f);
        Path path3 = this.mPath;
        Intrinsics.checkNotNull(path3);
        Paint paint = this.mPaint;
        Intrinsics.checkNotNull(paint);
        canvas.drawPath(path3, paint);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setItemCount(this.mMax);
        event.setCurrentItemIndex(this.mProgress);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = this.mDrawable;
        Intrinsics.checkNotNull(drawable);
        setMeasuredDimension(drawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearTransferProgress(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearTransferProgress(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mStrokeWidth = getResources().getDimensionPixelSize(R$dimen.nx_upload_or_download_stroke_width);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearLoadProgress, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…Style,\n                0)");
        this.mDrawable = xhc.b(context, typedArrayObtainStyledAttributes, R$styleable.NearLoadProgress_nxDefaultDrawable);
        typedArrayObtainStyledAttributes.recycle();
        init();
        this._$_findViewCache = new LinkedHashMap();
    }

    public /* synthetic */ NearTransferProgress(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.NearLoadProgressStyle : i);
    }
}
