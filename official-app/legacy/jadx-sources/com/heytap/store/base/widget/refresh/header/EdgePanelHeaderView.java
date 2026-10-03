package com.heytap.store.base.widget.refresh.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.heytap.store.base.widget.view.EdgePanelView;
import com.heytap.store.platform.tools.NetworkUtils;
import com.heytap.store.platform.tools.OnNetworkStatusChangedListener;
import com.heytap.store.platform.tools.SimpleNetworkInfo;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class EdgePanelHeaderView extends EdgePanelView implements RefreshHeader {
    private final OnNetworkStatusChangedListener mObserver;
    protected final SpinnerStyle mSpinnerStyle;
    private SimpleNetworkInfo simpleNetworkInfo;

    public EdgePanelHeaderView(Context context) {
        this(context, null);
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    public SpinnerStyle getSpinnerStyle() {
        return this.mSpinnerStyle;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    @NonNull
    /* JADX INFO: renamed from: getView */
    public View getMFooter() {
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnNetworkStatusChangedListener onNetworkStatusChangedListener = this.mObserver;
        if (onNetworkStatusChangedListener != null) {
            NetworkUtils.INSTANCE.registerNetworkStatusChangedListener(onNetworkStatusChangedListener);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnNetworkStatusChangedListener onNetworkStatusChangedListener = this.mObserver;
        if (onNetworkStatusChangedListener != null) {
            NetworkUtils.INSTANCE.unregisterNetworkStatusChangedListener(onNetworkStatusChangedListener);
        }
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
        if (refreshState2 == RefreshState.Refreshing) {
            SimpleNetworkInfo simpleNetworkInfo = this.simpleNetworkInfo;
            if (simpleNetworkInfo == null || !simpleNetworkInfo.isAvailable().booleanValue() || this.simpleNetworkInfo.isAir().booleanValue()) {
                showNetworkExceptionView(this.simpleNetworkInfo);
            } else {
                setRefreshMode(true);
                pullToRefresh();
            }
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshInternal
    public void setPrimaryColors(int... iArr) {
    }

    public EdgePanelHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EdgePanelHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSpinnerStyle = SpinnerStyle.Translate;
        this.mObserver = new OnNetworkStatusChangedListener() { // from class: com.heytap.store.base.widget.refresh.header.EdgePanelHeaderView.1
            @Override // com.heytap.store.platform.tools.OnNetworkStatusChangedListener
            public void onConnected(@Nullable SimpleNetworkInfo simpleNetworkInfo) {
            }

            @Override // com.heytap.store.platform.tools.OnNetworkStatusChangedListener
            public void onDisconnected() {
            }
        };
    }
}
