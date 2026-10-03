package com.heytap.sports.record.list.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.internal.FlowLayout;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014¨\u0006\u0013"}, d2 = {"Lcom/heytap/sports/record/list/widget/RecordHeadLayout;", "Lcom/google/android/material/internal/FlowLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onLayout", "", "sizeChanged", "", LogFieldKey.LEVEL_KEY, "t", "r", "b", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
public final class RecordHeadLayout extends FlowLayout {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordHeadLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.google.android.material.internal.FlowLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean sizeChanged, int l2, int t, int r, int b) {
        if (getChildCount() != 3) {
            return;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        View childAt3 = getChildAt(2);
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight2 > measuredHeight) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
            childAt2.layout(measuredWidth - childAt2.getMeasuredWidth(), getPaddingTop(), measuredWidth, getPaddingTop() + childAt2.getMeasuredHeight());
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + getLineSpacing();
            childAt3.layout(getPaddingLeft(), paddingTop, getPaddingLeft() + childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight() + paddingTop);
            return;
        }
        childAt.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingTop() + childAt.getMeasuredHeight());
        childAt3.layout(measuredWidth - childAt3.getMeasuredWidth(), getPaddingTop(), measuredWidth, getPaddingTop() + childAt3.getMeasuredHeight());
        int paddingLeft = getPaddingLeft() + childAt.getMeasuredWidth() + ((((measuredWidth - childAt.getMeasuredWidth()) - childAt3.getMeasuredWidth()) / 2) - (childAt2.getMeasuredWidth() / 2));
        childAt2.layout(paddingLeft, getPaddingTop(), childAt2.getMeasuredWidth() + paddingLeft, getPaddingTop() + childAt2.getMeasuredHeight());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordHeadLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordHeadLayout(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
