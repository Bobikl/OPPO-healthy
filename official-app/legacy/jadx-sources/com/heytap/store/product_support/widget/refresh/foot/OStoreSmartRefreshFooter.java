package com.heytap.store.product_support.widget.refresh.foot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.widget.R;
import com.oplus.smartenginehelper.ParserTag;
import com.platform.account.webview.constant.Constants;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0016J \u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0016J0\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0016J \u0010'\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0016J \u0010(\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0014H\u0016J \u0010)\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0012H\u0016J\u0014\u0010/\u001a\u00020\u00192\n\u00100\u001a\u000201\"\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/heytap/store/product_support/widget/refresh/foot/OStoreSmartRefreshFooter;", "Lcom/scwang/smartrefresh/layout/api/RefreshFooter;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mFooter", "Landroid/view/View;", "mLoadTips", "Landroid/widget/LinearLayout;", "mLoading", "Landroid/widget/TextView;", "mNoMoreTips", "getSpinnerStyle", "Lcom/scwang/smartrefresh/layout/constant/SpinnerStyle;", "getView", "isSupportHorizontalDrag", "", Constants.JsbConstants.METHOD_FINISH, "", "refreshLayout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "success", "onHorizontalDrag", "", "percentX", "", "offsetX", "offsetMax", "onInitialized", "kernel", "Lcom/scwang/smartrefresh/layout/api/RefreshKernel;", Fields.HEIGHT_FIELD, "maxDragHeight", "onMoving", "isDragging", ParserTag.TAG_PERCENT, TypedValues.CycleType.S_WAVE_OFFSET, "onReleased", "onStartAnimator", "onStateChanged", "oldState", "Lcom/scwang/smartrefresh/layout/constant/RefreshState;", "newState", "setNoMoreData", "noMoreData", "setPrimaryColors", ParserTag.TAG_COLORS, "", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreSmartRefreshFooter implements RefreshFooter {

    @NotNull
    private final View mFooter;

    @NotNull
    private final LinearLayout mLoadTips;

    @NotNull
    private final TextView mLoading;

    @NotNull
    private final TextView mNoMoreTips;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public OStoreSmartRefreshFooter(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NotNull
    public SpinnerStyle getSpinnerStyle() {
        SpinnerStyle Translate = SpinnerStyle.Translate;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public View getMFooter() {
        return this.mFooter;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NotNull RefreshLayout refreshLayout, boolean success) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(@NotNull RefreshKernel kernel, int height, int maxDragHeight) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onReleased(@NotNull RefreshLayout refreshLayout, int height, int maxDragHeight) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(@NotNull RefreshLayout refreshLayout, int height, int maxDragHeight) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NotNull RefreshLayout refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setNoMoreData(boolean noMoreData) {
        if (noMoreData) {
            this.mLoadTips.setVisibility(8);
            this.mNoMoreTips.setVisibility(0);
            return true;
        }
        this.mNoMoreTips.setVisibility(8);
        this.mLoadTips.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (colors.length > 0) {
            this.mLoading.setTextColor(colors[0]);
            this.mNoMoreTips.setTextColor(colors[0]);
        }
    }

    @JvmOverloads
    public OStoreSmartRefreshFooter(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.footer_load_or_no_more_item, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(context).inflate(R.…ad_or_no_more_item, null)");
        this.mFooter = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.tv_load_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "mFooter.findViewById(R.id.tv_load_tips)");
        this.mLoadTips = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_loading_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "mFooter.findViewById(R.id.tv_loading_text)");
        this.mLoading = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_load_end_tips);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "mFooter.findViewById(R.id.tv_load_end_tips)");
        this.mNoMoreTips = (TextView) viewFindViewById3;
    }

    public /* synthetic */ OStoreSmartRefreshFooter(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
