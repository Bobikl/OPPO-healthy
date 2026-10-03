package com.heytap.webview.extension.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.heytap.webview.extension.R;
import com.heytap.webview.extension.utils.ThreadUtil;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes4.dex */
class DefaultStateViewAdapter implements IStateViewAdapter {
    private static final int STATUS_ERROR = 3;
    private static final int STATUS_FINISHED = 2;
    private static final int STATUS_STARTED = 1;
    private static final int STATUS_TIMEOUT = 4;
    private static final long TIMEOUT = 30000;
    private Runnable mDelayShowErrorRunnable = new Runnable() { // from class: com.heytap.webview.extension.fragment.DefaultStateViewAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            DefaultStateViewAdapter.this.mStatus = 4;
            DefaultStateViewAdapter.this.mErrorView.setVisibility(0);
            DefaultStateViewAdapter.this.mLoadingView.setVisibility(8);
        }
    };
    private View mErrorView;
    private WebExtFragment mFragment;
    private ViewGroup mLayer;
    private View mLoadingView;
    private int mStatus;

    public DefaultStateViewAdapter(WebExtFragment webExtFragment) {
        this.mFragment = webExtFragment;
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onCreate(ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.default_status_layout, viewGroup);
        this.mLayer = viewGroup;
        this.mLoadingView = viewInflate.findViewById(R.id.default_status_loading);
        View viewFindViewById = viewInflate.findViewById(R.id.default_status_error);
        this.mErrorView = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.webview.extension.fragment.DefaultStateViewAdapter.2
            @Override // android.view.View.OnClickListener
            @SensorsDataInstrumented
            public void onClick(View view) {
                DefaultStateViewAdapter.this.mFragment.getWebView(WebView.class).reload();
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        });
        ((TextView) viewInflate.findViewById(R.id.default_error_title)).setText(R.string.default_error_title);
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onDestroy() {
        ThreadUtil.INSTANCE.removeFromUI(this.mDelayShowErrorRunnable);
        this.mLayer.removeAllViews();
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onPageFinished() {
        if (this.mStatus == 3) {
            return;
        }
        this.mStatus = 2;
        ThreadUtil.INSTANCE.removeFromUI(this.mDelayShowErrorRunnable);
        this.mErrorView.setVisibility(8);
        this.mLoadingView.setVisibility(8);
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onPageStarted() {
        this.mStatus = 1;
        ThreadUtil threadUtil = ThreadUtil.INSTANCE;
        threadUtil.removeFromUI(this.mDelayShowErrorRunnable);
        threadUtil.postToUIThread(30000L, this.mDelayShowErrorRunnable);
        this.mErrorView.setVisibility(8);
        this.mLoadingView.setVisibility(0);
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onPause() {
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onProgressChanged(int i) {
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onReceivedError(int i, CharSequence charSequence) {
        this.mStatus = 3;
        ThreadUtil.INSTANCE.removeFromUI(this.mDelayShowErrorRunnable);
        this.mErrorView.setVisibility(0);
        this.mLoadingView.setVisibility(8);
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onResume() {
    }

    @Override // com.heytap.webview.extension.fragment.IStateViewAdapter
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }
}
