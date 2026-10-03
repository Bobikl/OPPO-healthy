package com.heytap.health.health_archives.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.xu5;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b \u0010!B3\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\"\u001a\u00020\u0013\u0012\u0006\u0010#\u001a\u00020\u0013\u0012\b\b\u0002\u0010$\u001a\u00020\u001a¢\u0006\u0004\b \u0010%J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006&"}, d2 = {"Lcom/heytap/health/health_archives/view/RecyclerViewDivider;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "getItemOffsets", "Landroid/graphics/Canvas;", "c", "onDraw", "recyclerView", "b", "a", "drawVertical", "", "I", "orientation", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", "mDividerHeight", "", "d", "Z", "mIsBottomDivider", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;I)V", "dividerHeight", "dividerColor", "isBottomDivider", "(Landroid/content/Context;IIIZ)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecyclerViewDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecyclerViewDivider.kt\ncom/heytap/health/health_archives/view/RecyclerViewDivider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
public final class RecyclerViewDivider extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int orientation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Paint mPaint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int mDividerHeight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean mIsBottomDivider;

    public RecyclerViewDivider(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.orientation = i;
        boolean z = true;
        Paint paint = new Paint(1);
        this.mPaint = paint;
        this.mDividerHeight = xu5.a(context, 1.0f);
        if (i != 1 && i != 0) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("请输入正确的参数！".toString());
        }
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(Canvas c2, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
            c2.drawRect(paddingLeft, bottom, measuredWidth, this.mDividerHeight + bottom, this.mPaint);
        }
    }

    public final void b(Canvas c2, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (i != 0) {
                View childAt = recyclerView.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).topMargin;
                int i2 = this.mDividerHeight;
                int i3 = top - i2;
                c2.drawRect(paddingLeft, i3, measuredWidth, i2 + i3, this.mPaint);
            }
        }
    }

    public final void drawVertical(Canvas c2, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).rightMargin;
            c2.drawRect(right, paddingTop, this.mDividerHeight + right, measuredHeight, this.mPaint);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (this.mIsBottomDivider) {
            outRect.bottom = this.mDividerHeight;
        } else if (childAdapterPosition == 0) {
            outRect.top = 0;
        } else {
            outRect.top = this.mDividerHeight;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull Canvas c2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c2, parent, state);
        if (this.orientation != 0) {
            drawVertical(c2, parent);
        } else if (this.mIsBottomDivider) {
            a(c2, parent);
        } else {
            b(c2, parent);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecyclerViewDivider(@NotNull Context context, int i, int i2, int i3, boolean z) {
        this(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDividerHeight = i2;
        this.mPaint.setColor(i3);
        this.mIsBottomDivider = z;
    }

    public /* synthetic */ RecyclerViewDivider(Context context, int i, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i, i2, i3, (i4 & 16) != 0 ? false : z);
    }
}
