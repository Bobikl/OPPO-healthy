package com.heytap.health.base.view.recyclercard.sticky;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.xti;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u0003\u001a\u00020\bH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\fH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\u001a¨\u00061"}, d2 = {"Lcom/heytap/health/base/view/recyclercard/sticky/StickyItem;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "onDrawOver", "Landroid/view/View;", MapSchema.FIELD_NAME_ENTRY, "", "position", Fields.WIDTH_FIELD, "a", LogFieldKey.MESSAGE_KEY, "view", "b", "f", "parentWidth", b2n.f, "canvas", "d", "Landroid/view/View;", "mStickyItemView", "I", "mStickyItemViewMarginTop", "mStickyItemViewHeight", "Lcom/oplus/aiunit/vision/xti;", "Lcom/oplus/aiunit/vision/xti;", "mStickyUtil", "", "Z", "mCurrentUIFindStickView", "", "Ljava/util/List;", "mStickyPositionList", "", "Ljava/util/Map;", "mStickyPositionViewMap", "Landroidx/recyclerview/widget/LinearLayoutManager;", b2n.g, "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLayoutManager", "i", "mBindDataPosition", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStickyItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickyItem.kt\ncom/heytap/health/base/view/recyclercard/sticky/StickyItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1855#2,2:252\n*S KotlinDebug\n*F\n+ 1 StickyItem.kt\ncom/heytap/health/base/view/recyclercard/sticky/StickyItem\n*L\n125#1:252,2\n*E\n"})
public final class StickyItem extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public View mStickyItemView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int mStickyItemViewMarginTop;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int mStickyItemViewHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean mCurrentUIFindStickView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public LinearLayoutManager mLayoutManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public xti mStickyUtil = new xti();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<Integer> mStickyPositionList = new ArrayList();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, View> mStickyPositionViewMap = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int mBindDataPosition = -1;

    public final void a(int position, int width) {
        if (this.mBindDataPosition == position) {
            return;
        }
        this.mBindDataPosition = position;
        View view = this.mStickyPositionViewMap.get(Integer.valueOf(position));
        this.mStickyItemView = view;
        if (view == null) {
            return;
        }
        g(width);
        View view2 = this.mStickyItemView;
        Intrinsics.checkNotNull(view2);
        int bottom = view2.getBottom();
        View view3 = this.mStickyItemView;
        Intrinsics.checkNotNull(view3);
        this.mStickyItemViewHeight = bottom - view3.getTop();
    }

    public final void b(int m, View view) {
        int iF = f(m);
        if (!this.mStickyPositionList.contains(Integer.valueOf(iF))) {
            this.mStickyPositionList.add(Integer.valueOf(iF));
        }
        if (this.mStickyPositionViewMap.containsKey(Integer.valueOf(iF))) {
            return;
        }
        Map<Integer, View> map = this.mStickyPositionViewMap;
        Integer numValueOf = Integer.valueOf(iF);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        View childAt = ((ViewGroup) view).getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt, "view as ViewGroup).getChildAt(0)");
        map.put(numValueOf, childAt);
    }

    public final void c() {
        LinearLayoutManager linearLayoutManager = this.mLayoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        if (linearLayoutManager.findFirstVisibleItemPosition() == 0) {
            this.mStickyPositionList.clear();
        }
    }

    public final void d(Canvas canvas) {
        if (this.mStickyItemView == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.mLayoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        if (linearLayoutManager.findFirstVisibleItemPosition() < this.mBindDataPosition) {
            this.mStickyItemViewMarginTop = this.mStickyItemViewHeight;
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, -this.mStickyItemViewMarginTop);
        View view = this.mStickyItemView;
        Intrinsics.checkNotNull(view);
        view.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final View e(RecyclerView parent) {
        int childCount = parent.getChildCount();
        int i = 0;
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = parent.getChildAt(i2);
            if (this.mStickyUtil.a(childAt)) {
                i++;
                view = childAt;
            }
            if (i == 2) {
                break;
            }
        }
        if (i >= 2) {
            return view;
        }
        return null;
    }

    public final int f(int m) {
        LinearLayoutManager linearLayoutManager = this.mLayoutManager;
        Intrinsics.checkNotNull(linearLayoutManager);
        return linearLayoutManager.findFirstVisibleItemPosition() + m;
    }

    public final void g(int parentWidth) {
        int i;
        if (this.mStickyItemView == null) {
            return;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(parentWidth, 1073741824);
        View view = this.mStickyItemView;
        Intrinsics.checkNotNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iMakeMeasureSpec2 = (layoutParams == null || (i = layoutParams.height) <= 0) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        View view2 = this.mStickyItemView;
        Intrinsics.checkNotNull(view2);
        view2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        View view3 = this.mStickyItemView;
        Intrinsics.checkNotNull(view3);
        View view4 = this.mStickyItemView;
        Intrinsics.checkNotNull(view4);
        int measuredWidth = view4.getMeasuredWidth();
        View view5 = this.mStickyItemView;
        Intrinsics.checkNotNull(view5);
        view3.layout(0, 0, measuredWidth, view5.getMeasuredHeight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull Canvas c2, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c2, parent, state);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter);
        if (adapter.getItemCount() <= 0) {
            return;
        }
        this.mLayoutManager = (LinearLayoutManager) parent.getLayoutManager();
        this.mCurrentUIFindStickView = false;
        c();
        int childCount = parent.getChildCount();
        int i = 0;
        while (i < childCount) {
            View view = parent.getChildAt(i);
            if (this.mStickyUtil.a(view)) {
                this.mCurrentUIFindStickView = true;
                Intrinsics.checkNotNullExpressionValue(view, "view");
                b(i, view);
                if (view.getTop() <= 0) {
                    LinearLayoutManager linearLayoutManager = this.mLayoutManager;
                    Intrinsics.checkNotNull(linearLayoutManager);
                    a(linearLayoutManager.findFirstVisibleItemPosition(), parent.getMeasuredWidth());
                } else if (this.mStickyPositionList.size() > 0) {
                    if (this.mStickyPositionList.size() == 1) {
                        a(this.mStickyPositionList.get(0).intValue(), parent.getMeasuredWidth());
                    } else {
                        int iLastIndexOf = this.mStickyPositionList.lastIndexOf(Integer.valueOf(f(i)));
                        if (iLastIndexOf >= 1) {
                            a(this.mStickyPositionList.get(iLastIndexOf - 1).intValue(), parent.getMeasuredWidth());
                        }
                    }
                }
                int i2 = this.mStickyItemViewHeight;
                int top = view.getTop();
                if (1 <= top && top <= i2) {
                    this.mStickyItemViewMarginTop = this.mStickyItemViewHeight - view.getTop();
                } else {
                    this.mStickyItemViewMarginTop = 0;
                    View viewE = e(parent);
                    if (viewE != null) {
                        int top2 = viewE.getTop();
                        int i3 = this.mStickyItemViewHeight;
                        if (top2 <= i3) {
                            this.mStickyItemViewMarginTop = i3 - viewE.getTop();
                        }
                    }
                }
                d(c2);
                break;
            }
            i++;
        }
        if (this.mCurrentUIFindStickView) {
            return;
        }
        this.mStickyItemViewMarginTop = 0;
        Iterator<T> it = this.mStickyPositionList.iterator();
        int i4 = -1;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue <= f(i)) {
                i4 = iIntValue;
            }
        }
        if (i4 != -1 && this.mStickyPositionList.size() > 0) {
            a(i4, parent.getMeasuredWidth());
        }
        d(c2);
    }
}
