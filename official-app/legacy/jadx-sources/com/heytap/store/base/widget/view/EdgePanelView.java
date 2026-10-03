package com.heytap.store.base.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.nearx.uikit.widget.progress.NearCircleProgressBar;
import com.heytap.store.base.widget.R;
import com.heytap.store.platform.tools.SimpleNetworkInfo;
import com.heytap.store.platform.tools.SystemUIUtils;

/* JADX INFO: loaded from: classes3.dex */
public class EdgePanelView extends RelativeLayout {
    public static final int FOOTER_TYPE = 1;
    public static final int HEADER_TYPE = 0;
    private final String TAG;
    private final Context mContext;
    private final View mEmptyView;
    private String mFinishLabel;
    private boolean mIsRefreshMode;
    private String mNoDataLabel;
    private final NearCircleProgressBar mProgressBar;
    private String mPullLabel;
    private final TextView mRefreshSubTitle;
    private final TextView mRefreshTitle;
    private String mRefreshingLabel;
    private String mReleaseLabel;

    public EdgePanelView(Context context) {
        this(context, null);
    }

    private void initView() {
        if (this.mIsRefreshMode) {
            this.mProgressBar.setVisibility(0);
            this.mRefreshTitle.setVisibility(8);
            this.mRefreshSubTitle.setVisibility(8);
        } else {
            this.mProgressBar.setVisibility(8);
            this.mRefreshTitle.setVisibility(8);
            this.mRefreshSubTitle.setVisibility(0);
        }
    }

    public void finishToRefresh() {
        initView();
        if (this.mIsRefreshMode) {
            this.mRefreshTitle.setText(this.mFinishLabel);
        } else {
            this.mRefreshSubTitle.setText(this.mNoDataLabel);
        }
    }

    public NearCircleProgressBar getProgressBar() {
        return this.mProgressBar;
    }

    public void pullToRefresh() {
        initView();
        if (this.mIsRefreshMode) {
            this.mRefreshTitle.setText(this.mPullLabel);
        } else {
            this.mRefreshSubTitle.setText(this.mNoDataLabel);
        }
    }

    public void refreshing() {
        this.mRefreshTitle.setText(this.mRefreshingLabel);
    }

    public void releaseToRefresh() {
        initView();
        if (this.mIsRefreshMode) {
            this.mRefreshTitle.setText(this.mReleaseLabel);
        } else {
            this.mRefreshSubTitle.setText(this.mNoDataLabel);
        }
    }

    public void setEmptyViewVisibility(int i) {
        if (i == 0 || i == 4) {
            ViewGroup.LayoutParams layoutParams = this.mEmptyView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            }
            ((RelativeLayout.LayoutParams) layoutParams).setMargins(0, SystemUIUtils.INSTANCE.getStatusBarHeight(), 0, 0);
        }
        this.mEmptyView.setVisibility(i);
        invalidate();
    }

    public void setLoadingStatus(float f) {
    }

    public void setLoadingViewType(int i) {
        if (i != 0) {
            this.mPullLabel = this.mContext.getString(R.string.refresh_pull_up_label);
            this.mRefreshingLabel = this.mContext.getString(R.string.refresh_refreshing_label);
            this.mReleaseLabel = this.mContext.getString(R.string.refresh_release_label);
            this.mNoDataLabel = this.mContext.getString(R.string.refresh_no_data_label_footer);
            this.mFinishLabel = this.mContext.getString(R.string.refresh_finish_label_footer);
            return;
        }
        this.mPullLabel = this.mContext.getString(R.string.refresh_pull_down_label);
        this.mRefreshingLabel = this.mContext.getString(R.string.refresh_refreshing_label);
        this.mReleaseLabel = this.mContext.getString(R.string.refresh_release_label);
        this.mNoDataLabel = this.mContext.getString(R.string.refresh_no_data_label_header);
        this.mFinishLabel = this.mContext.getString(R.string.refresh_finish_label_header);
    }

    public void setNoDataLabel(String str) {
        this.mNoDataLabel = str;
    }

    public void setRefreshMode(boolean z) {
        this.mIsRefreshMode = z;
    }

    public void setRefreshingLabel(String str) {
        this.mRefreshingLabel = str;
    }

    public void showNetworkExceptionView(SimpleNetworkInfo simpleNetworkInfo) {
        this.mProgressBar.setVisibility(8);
        this.mRefreshSubTitle.setVisibility(8);
        this.mRefreshTitle.setVisibility(0);
        if (simpleNetworkInfo == null) {
            return;
        }
        if (simpleNetworkInfo.isAir().booleanValue()) {
            this.mRefreshTitle.setText(this.mContext.getResources().getString(R.string.refresh_tips_network_air));
        } else if (!simpleNetworkInfo.isAvailable().booleanValue()) {
            this.mRefreshTitle.setText(this.mContext.getResources().getString(R.string.refresh_tips_network_unconnect));
        } else if (simpleNetworkInfo.isPortal().booleanValue()) {
            this.mRefreshTitle.setText(this.mContext.getResources().getString(R.string.refresh_tips_network_portal));
        }
    }

    public EdgePanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EdgePanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = getClass().getSimpleName();
        this.mIsRefreshMode = true;
        this.mContext = context;
        LayoutInflater.from(context).inflate(R.layout.widget_refresh_view_header, this);
        this.mEmptyView = findViewById(R.id.empty_view);
        this.mRefreshTitle = (TextView) findViewById(R.id.pull_to_refresh_textveiw);
        this.mRefreshSubTitle = (TextView) findViewById(R.id.finish_refresh_textveiw);
        this.mProgressBar = (NearCircleProgressBar) findViewById(R.id.pull_to_refresh_progress);
    }
}
