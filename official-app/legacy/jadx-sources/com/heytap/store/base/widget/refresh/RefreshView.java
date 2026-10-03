package com.heytap.store.base.widget.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.store.base.widget.R;
import com.heytap.store.platform.tools.NetworkUtils;
import com.heytap.store.platform.tools.OnNetworkStatusChangedListener;
import com.heytap.store.platform.tools.SimpleNetworkInfo;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class RefreshView extends RelativeLayout implements IRefreshStatus {
    private final OnNetworkStatusChangedListener mObserver;
    private final View progressView;
    private SimpleNetworkInfo simpleNetworkInfo;
    private final TextView tvLabel;

    public RefreshView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshTxt(int i) {
        setViewVisibility(this.progressView, 8);
        setViewVisibility(this.tvLabel, 0);
        this.tvLabel.setText(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewVisibility(View view, int i) {
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    @Override // com.heytap.store.base.widget.refresh.IRefreshStatus
    public boolean isNetAvailable() {
        SimpleNetworkInfo simpleNetworkInfo = this.simpleNetworkInfo;
        return (simpleNetworkInfo == null || !simpleNetworkInfo.isAvailable().booleanValue() || this.simpleNetworkInfo.isAir().booleanValue()) ? false : true;
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

    @Override // com.heytap.store.base.widget.refresh.IRefreshStatus
    public void pullProgress(float f, float f2) {
    }

    @Override // com.heytap.store.base.widget.refresh.IRefreshStatus
    public void pullToRefresh() {
        SimpleNetworkInfo simpleNetworkInfo = this.simpleNetworkInfo;
        if (simpleNetworkInfo == null || !simpleNetworkInfo.isAvailable().booleanValue() || this.simpleNetworkInfo.isAir().booleanValue()) {
            return;
        }
        setRefreshTxt(R.string.pull_to_refresh);
    }

    @Override // com.heytap.store.base.widget.refresh.IRefreshStatus
    public void refreshComplete() {
        SimpleNetworkInfo simpleNetworkInfo = this.simpleNetworkInfo;
        if (simpleNetworkInfo == null || !simpleNetworkInfo.isAvailable().booleanValue() || this.simpleNetworkInfo.isAir().booleanValue()) {
            return;
        }
        setRefreshTxt(R.string.continue_pull_down);
    }

    @Override // com.heytap.store.base.widget.refresh.IRefreshStatus
    public void refreshing() {
        SimpleNetworkInfo simpleNetworkInfo = this.simpleNetworkInfo;
        if (simpleNetworkInfo == null || !simpleNetworkInfo.isAvailable().booleanValue() || this.simpleNetworkInfo.isAir().booleanValue()) {
            return;
        }
        setViewVisibility(this.progressView, 0);
        setViewVisibility(this.tvLabel, 8);
    }

    @Override // com.heytap.store.base.widget.refresh.IRefreshStatus
    public void releaseToRefresh() {
        SimpleNetworkInfo simpleNetworkInfo = this.simpleNetworkInfo;
        if (simpleNetworkInfo == null || !simpleNetworkInfo.isAvailable().booleanValue() || this.simpleNetworkInfo.isAir().booleanValue()) {
            return;
        }
        setRefreshTxt(R.string.continue_pull_down);
    }

    @Override // com.heytap.store.base.widget.refresh.IRefreshStatus
    public void reset() {
    }

    public RefreshView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RefreshView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new OnNetworkStatusChangedListener() { // from class: com.heytap.store.base.widget.refresh.RefreshView.1
            @Override // com.heytap.store.platform.tools.OnNetworkStatusChangedListener
            public void onConnected(@Nullable SimpleNetworkInfo simpleNetworkInfo) {
                RefreshView.this.simpleNetworkInfo = simpleNetworkInfo;
                if (RefreshView.this.simpleNetworkInfo != null && RefreshView.this.simpleNetworkInfo.isAvailable().booleanValue() && !RefreshView.this.simpleNetworkInfo.isAir().booleanValue()) {
                    RefreshView.this.setRefreshTxt(R.string.continue_pull_down);
                    return;
                }
                RefreshView refreshView = RefreshView.this;
                refreshView.setViewVisibility(refreshView.progressView, 8);
                RefreshView refreshView2 = RefreshView.this;
                refreshView2.setViewVisibility(refreshView2.tvLabel, 0);
                RefreshView.this.tvLabel.setText(RefreshView.this.getResources().getString(R.string.refresh_tips_network_unconnect));
            }

            @Override // com.heytap.store.platform.tools.OnNetworkStatusChangedListener
            public void onDisconnected() {
            }
        };
        LayoutInflater.from(context).inflate(R.layout.widget_refresh_view_layout, this);
        this.progressView = findViewById(R.id.refresh_progress);
        this.tvLabel = (TextView) findViewById(R.id.refresh_txt);
    }
}
