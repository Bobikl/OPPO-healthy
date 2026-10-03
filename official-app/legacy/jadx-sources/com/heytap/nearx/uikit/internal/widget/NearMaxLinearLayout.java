package com.heytap.nearx.uikit.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/NearMaxLinearLayout;", "Landroid/widget/LinearLayout;", "", "getMaxHeight", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", ParserTag.TAG_MAX_WIDTH, "setMaxWidth", "i", "I", "mMaxWidth", "j", "mPortraitMaxHeight", MapSchema.FIELD_NAME_KEY, "mLandscapeMaxHeight", "Landroid/content/Context;", LogFieldKey.LEVEL_KEY, "Landroid/content/Context;", "mContext", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class NearMaxLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mMaxWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int mPortraitMaxHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mLandscapeMaxHeight;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Context mContext;

    @NotNull
    public Map<Integer, View> m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearMaxLinearLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.m = new LinkedHashMap();
        this.mContext = context;
    }

    private final int getMaxHeight() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        return displayMetrics.widthPixels < displayMetrics.heightPixels ? this.mPortraitMaxHeight : this.mLandscapeMaxHeight;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i = this.mMaxWidth;
        boolean z2 = true;
        if (i == 0 || measuredWidth <= i) {
            z = false;
        } else {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            z = true;
        }
        int maxHeight = getMaxHeight();
        if (measuredHeight > maxHeight) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(maxHeight, 1073741824);
        } else {
            z2 = z;
        }
        if (z2) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setMaxWidth(int maxWidth) {
        this.mMaxWidth = maxWidth;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearMaxLinearLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.m = new LinkedHashMap();
        this.mContext = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.NearMaxLinearLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…able.NearMaxLinearLayout)");
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearMaxLinearLayout_nearMaxWidth, 0);
        this.mPortraitMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearMaxLinearLayout_nxPortraitMaxHeight, 0);
        this.mLandscapeMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearMaxLinearLayout_nxLandscapeMaxHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
