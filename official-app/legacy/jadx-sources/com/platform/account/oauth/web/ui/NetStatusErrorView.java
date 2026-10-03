package com.platform.account.oauth.web.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.platform.account.oauth.web.R$drawable;
import com.platform.account.oauth.web.R$id;
import com.platform.account.oauth.web.R$layout;
import com.platform.account.oauth.web.R$string;
import com.platform.account.oauth.web.util.AcOauthDarkUtil;
import com.platform.usercenter.oauth.util.AcOauthLogUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class NetStatusErrorView extends RelativeLayout {
    public static final int AIRPLANE_MODE_ON_STR = 0;
    public static final int MOBILE_AND_WLAN_NETWORK_NOT_CONNECT_STR = 1;
    public static final int MOBILE_SSL_DATE_INVALID = 4;
    public static final int NO_NETWORK_CONNECT_STR = 3;
    public static final int SERVER_ERROR_STR = 5;
    private static final String TAG = "NetStatusErrorView";
    public static final int WLAN_NEED_LOGIN_STR = 2;
    private Integer errorCode;
    private LinearLayout mErrorLayout;
    private TextView mErrorOperate;
    private ImageView mLoadingImgAnim;
    private LinearLayout mLoadingLayout;
    private ImageView mStatusImg;
    private TextView mTvLoadingTip;

    public NetStatusErrorView(Context context) {
        super(context);
        initView();
    }

    private void initView() {
        View.inflate(getContext(), R$layout.ac_oauth_web_layout_net_status_error_view, this);
    }

    private void showErrorImg(int i) {
        if (4 == i || 5 == i) {
            if (AcOauthDarkUtil.isNightMode(getContext())) {
                this.mStatusImg.setImageResource(R$drawable.ac_oauth_web_content_error_dark);
                return;
            } else {
                this.mStatusImg.setImageResource(R$drawable.ac_oauth_web_content_error_light);
                return;
            }
        }
        if (AcOauthDarkUtil.isNightMode(getContext())) {
            this.mStatusImg.setImageResource(R$drawable.ac_oauth_web_no_network_dark);
        } else {
            this.mStatusImg.setImageResource(R$drawable.ac_oauth_web_no_network_light);
        }
    }

    @Override // android.view.View
    public void clearAnimation() {
        this.mLoadingImgAnim.clearAnimation();
    }

    public void endLoading() {
        AcOauthLogUtil.i(TAG, "endLoading " + this.errorCode);
        if (this.errorCode == null) {
            setVisibility(8);
        } else {
            this.mLoadingLayout.setVisibility(8);
        }
        clearAnimation();
    }

    public String getNetStatusMessage(int i) {
        if (i == 0) {
            return getContext().getString(R$string.ac_cord_network_status_tips_air_plane);
        }
        if (1 == i) {
            return getContext().getString(R$string.network_status_tips_open_connect);
        }
        if (2 != i && 3 != i) {
            if (5 == i) {
                return getContext().getString(R$string.network_status_tips_server_error);
            }
            return 4 == i ? getContext().getString(R$string.ac_cord_network_status_ssl_date_invalid) : getContext().getString(R$string.dialog_net_error_title);
        }
        return getContext().getString(R$string.network_status_tips_no_connect);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mErrorOperate = (TextView) findViewById(R$id.error_operate);
        this.mErrorLayout = (LinearLayout) findViewById(R$id.empty_layout);
        this.mLoadingLayout = (LinearLayout) findViewById(R$id.error_loading_view);
        this.mStatusImg = (ImageView) this.mErrorLayout.findViewById(R$id.status_img);
        this.mLoadingImgAnim = (ImageView) this.mLoadingLayout.findViewById(R$id.error_loading_progress_anim);
        this.mTvLoadingTip = (TextView) this.mLoadingLayout.findViewById(R$id.error_loading_tip);
        this.mStatusImg.setVisibility(0);
        this.mLoadingImgAnim.setVisibility(0);
        if (AcOauthDarkUtil.isNightMode(getContext())) {
            this.mLoadingImgAnim.setImageResource(R$drawable.ac_oauth_web_loading_night);
        } else {
            this.mLoadingImgAnim.setImageResource(R$drawable.ac_oauth_web_loading);
        }
    }

    public void showErrorView(int i, String str) {
        AcOauthLogUtil.i(TAG, "showErrorView " + i);
        if (i == 3 || i == 1) {
            i = Settings.Global.getInt(getContext().getContentResolver(), "airplane_mode_on", 0) != 0 ? 0 : 3;
        }
        this.errorCode = Integer.valueOf(i);
        if (TextUtils.isEmpty(str)) {
            str = getNetStatusMessage(i);
        }
        if (TextUtils.isEmpty(str)) {
            this.mErrorOperate.setText(R$string.network_status_tips_no_connect);
        } else {
            this.mErrorOperate.setText(str);
        }
        setClickable(true);
        setVisibility(0);
        this.mErrorLayout.setVisibility(0);
        endLoading();
        showErrorImg(i);
    }

    public void startLoading() {
        if (this.mLoadingLayout.getVisibility() == 0) {
            return;
        }
        this.errorCode = null;
        setVisibility(0);
        setClickable(false);
        this.mErrorLayout.setVisibility(8);
        this.mLoadingLayout.setVisibility(0);
        TextView textView = this.mTvLoadingTip;
        textView.announceForAccessibility(textView.getText());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mLoadingImgAnim, "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
    }

    public NetStatusErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView();
    }
}
