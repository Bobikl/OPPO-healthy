package com.heytap.nearx.uikit.internal.widget.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.rkc;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u000f¢\u0006\u0004\b0\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0014J(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0014J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u00062"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/dialog/AutoImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "radius", "", "setRadius", "", "topLeftRadius", "setTopLeftRadius", "topRightRadius", "setTopRightRadius", "bottomLeftRadius", "setBottomLeftRadius", "bottomRightRadius", "setBottomRightRadius", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "w", b2n.g, "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Path;", "i", "Landroid/graphics/Path;", "mPath", "j", "Z", "mTopLeftRadius", MapSchema.FIELD_NAME_KEY, "mTopRightRadius", LogFieldKey.LEVEL_KEY, "mBottomLeftRadius", LogFieldKey.MESSAGE_KEY, "mBottomRightRadius", "n", UserInfo.SEX_FEMALE, "mRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class AutoImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Path mPath;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mTopLeftRadius;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mTopRightRadius;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean mBottomLeftRadius;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean mBottomRightRadius;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float mRadius;

    @NotNull
    public Map<Integer, View> o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        Path path = this.mPath;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int size = (int) (View.MeasureSpec.getSize(widthMeasureSpec) * (drawable.getMinimumHeight() / drawable.getMinimumWidth()));
            int maxHeight = getMaxHeight();
            boolean z = false;
            if (1 <= maxHeight && maxHeight < size) {
                z = true;
            }
            if (z) {
                size = getMaxHeight();
            }
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mPath = rkc.a().b(0.0f, 0.0f, w, h, this.mRadius, this.mTopLeftRadius, this.mTopRightRadius, this.mBottomLeftRadius, this.mBottomRightRadius);
    }

    public final void setBottomLeftRadius(boolean bottomLeftRadius) {
        this.mBottomLeftRadius = bottomLeftRadius;
    }

    public final void setBottomRightRadius(boolean bottomRightRadius) {
        this.mBottomRightRadius = bottomRightRadius;
    }

    public final void setRadius(float radius) {
        this.mRadius = radius;
    }

    public final void setTopLeftRadius(boolean topLeftRadius) {
        this.mTopLeftRadius = topLeftRadius;
    }

    public final void setTopRightRadius(boolean topRightRadius) {
        this.mTopRightRadius = topRightRadius;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AutoImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AutoImageView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ageView, defStyleAttr, 0)");
        this.mTopLeftRadius = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoImageView_nxRadiusLeftTop, false);
        this.mTopRightRadius = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoImageView_nxRadiusRightTop, false);
        this.mBottomLeftRadius = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoImageView_nxRadiusLeftBottom, false);
        this.mBottomRightRadius = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AutoImageView_nxRadiusRightBottom, false);
        this.mRadius = typedArrayObtainStyledAttributes.getDimension(R$styleable.AutoImageView_nxRadiusSize, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        this.o = new LinkedHashMap();
    }

    public /* synthetic */ AutoImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
