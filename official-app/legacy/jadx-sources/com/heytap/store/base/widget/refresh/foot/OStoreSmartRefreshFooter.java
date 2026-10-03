package com.heytap.store.base.widget.refresh.foot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.heytap.store.base.widget.R;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;

/* JADX INFO: loaded from: classes3.dex */
public class OStoreSmartRefreshFooter implements RefreshFooter {
    private View mFooter;
    private LinearLayout mLoadTips;
    private TextView mLoading;
    private TextView mNoMoreTips;

    public OStoreSmartRefreshFooter(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public SpinnerStyle getSpinnerStyle() {
        return SpinnerStyle.Translate;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public View getView() {
        return this.mFooter;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public int onFinish(@NonNull RefreshLayout refreshLayout, boolean z) {
        return 0;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onHorizontalDrag(float f, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(@NonNull RefreshKernel refreshKernel, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onMoving(boolean z, float f, int i, int i2, int i3) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onReleased(@NonNull RefreshLayout refreshLayout, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onStartAnimator(@NonNull RefreshLayout refreshLayout, int i, int i2) {
    }

    @Override // com.scwang.smartrefresh.layout.listener.OnStateChangedListener
    public void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState refreshState, @NonNull RefreshState refreshState2) {
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setNoMoreData(boolean z) {
        if (z) {
            this.mLoadTips.setVisibility(8);
            this.mNoMoreTips.setVisibility(0);
            return true;
        }
        this.mNoMoreTips.setVisibility(8);
        this.mLoadTips.setVisibility(0);
        return true;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void setPrimaryColors(int... iArr) {
        if (iArr.length > 0) {
            this.mLoading.setTextColor(iArr[0]);
            this.mNoMoreTips.setTextColor(iArr[0]);
        }
    }

    public OStoreSmartRefreshFooter(Context context, AttributeSet attributeSet) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.footer_load_or_no_more_item, (ViewGroup) null);
        this.mFooter = viewInflate;
        this.mLoadTips = (LinearLayout) viewInflate.findViewById(R.id.tv_load_tips);
        this.mLoading = (TextView) this.mFooter.findViewById(R.id.tv_loading_text);
        this.mNoMoreTips = (TextView) this.mFooter.findViewById(R.id.tv_load_end_tips);
    }
}
