package com.heytap.store.homemodule.utils;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.platform.tools.SizeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"com/heytap/store/homemodule/utils/ViewItemIntrusionHelper$scrollerListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "floatView", "Landroid/view/View;", "getFloatView", "()Landroid/view/View;", "setFloatView", "(Landroid/view/View;)V", "marginTop", "", "getMarginTop", "()I", TypedValues.CycleType.S_WAVE_OFFSET, "", "getOffset", "()F", "setOffset", "(F)V", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewItemIntrusionHelper$scrollerListener$1 extends RecyclerView.OnScrollListener {

    @Nullable
    private View floatView;
    private final int marginTop;
    private float offset;
    final /* synthetic */ ViewItemIntrusionHelper this$0;

    public ViewItemIntrusionHelper$scrollerListener$1(ViewItemIntrusionHelper viewItemIntrusionHelper) {
        this.this$0 = viewItemIntrusionHelper;
        this.marginTop = SizeUtils.INSTANCE.dp2px(viewItemIntrusionHelper.getMediaInfo().getAlphaAlignHigh());
    }

    @Nullable
    public final View getFloatView() {
        return this.floatView;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final float getOffset() {
        return this.offset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.offset == 0.0f) {
            ViewItemIntrusionHelper viewItemIntrusionHelper = this.this$0;
            this.offset = viewItemIntrusionHelper.getAllOffset(0, viewItemIntrusionHelper.getAlignViewParam(), recyclerView);
        }
        View view = this.floatView;
        if (view != null) {
            view.getTranslationY();
        }
        View view2 = this.floatView;
        if (view2 == null) {
            return;
        }
        view2.setTranslationY((this.this$0.getItemView().getTop() + this.offset) - this.marginTop);
    }

    public final void setFloatView(@Nullable View view) {
        this.floatView = view;
    }

    public final void setOffset(float f) {
        this.offset = f;
    }
}
