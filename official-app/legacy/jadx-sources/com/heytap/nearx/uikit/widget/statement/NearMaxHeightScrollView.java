package com.heytap.nearx.uikit.widget.statement;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0014J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/heytap/nearx/uikit/widget/statement/NearMaxHeightScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isProtocolFixed", "", "()Z", "setProtocolFixed", "(Z)V", ParserTag.TAG_MAX_HEIGHT, "", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setMaxHeightAndRequestLayout", Fields.HEIGHT_FIELD, "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NearMaxHeightScrollView extends ScrollView {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean isProtocolFixed;
    private int maxHeight;

    public /* synthetic */ NearMaxHeightScrollView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
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

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    /* JADX INFO: renamed from: isProtocolFixed, reason: from getter */
    public final boolean getIsProtocolFixed() {
        return this.isProtocolFixed;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = this.maxHeight;
        if (i > 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(RangesKt___RangesKt.coerceAtMost(i, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE);
        }
        if (this.isProtocolFixed && getChildCount() > 0) {
            measureChild(getChildAt(0), widthMeasureSpec, heightMeasureSpec);
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getChildAt(0).getMeasuredHeight() > View.MeasureSpec.getSize(heightMeasureSpec) - getPaddingTop() ? getContext().getResources().getDimensionPixelOffset(R$dimen.nx_component_scrollview_padding_bottom) : 0);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final void setMaxHeightAndRequestLayout(int height) {
        this.maxHeight = height;
        requestLayout();
    }

    public final void setProtocolFixed(boolean z) {
        this.isProtocolFixed = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearMaxHeightScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearMaxHeightScrollView);
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.NearMaxHeightScrollView_nxScrollViewMaxHeight, 0));
        typedArrayObtainStyledAttributes.recycle();
        this._$_findViewCache = new LinkedHashMap();
    }
}
