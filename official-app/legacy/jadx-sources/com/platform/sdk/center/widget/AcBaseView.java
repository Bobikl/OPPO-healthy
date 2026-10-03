package com.platform.sdk.center.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.accountcenter.c;
import com.accountcenter.n;
import com.heytap.usercenter.accountsdk.AccountAgent;
import com.oplus.aiunit.vision.xr2;
import com.platform.sdk.center.R;
import com.platform.sdk.center.cons.AcConstants;
import com.platform.sdk.center.sdk.AcCenterAgent;
import com.platform.sdk.center.sdk.mvvm.model.data.AcAccount;
import com.platform.sdk.center.sdk.mvvm.model.data.AcCardOperationResult;
import com.platform.sdk.center.sdk.mvvm.model.data.AcInfo;
import com.platform.sdk.center.sdk.mvvm.model.data.PlateStyle;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.AcAccountResultCallback;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.IBaseResultCallBack;
import com.platform.sdk.center.statistic.AcStatisticMethod;
import com.platform.sdk.center.utils.AcAppUtils;
import com.platform.sdk.center.widget.bottomview.IPlateView;
import com.platform.usercenter.account.mba.OutsideApk;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import com.platform.usercenter.account.newcommon.router.LinkInfoHelp;
import com.platform.usercenter.account.proxy.entity.LinkDataAccount;
import com.platform.usercenter.tools.datastructure.Lists;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AcBaseView extends FrameLayout implements View.OnClickListener, IPlateView {
    private static final String TAG = "BaseVipView";
    private c buttonResult;
    private boolean isHideVipNameplate;
    protected HeyTapAccountInfoView mAccountInfoView;
    protected String mAppC;
    protected boolean mHasUnLoginRemindData;
    protected ViewGroup mInflatedView;
    protected boolean mIsLogin;
    private long mLastStatTime;
    private final List<AcCardOperationResult.OperationInfo.LoginRemindListBean> mLoginRemindDatas;
    AcAccountResultCallback mRefreshResultCallback;
    private AsyncTask<Context, Void, String> mRefreshTask;
    protected View.OnClickListener mThirdBtnListener;
    private String mThirdBtnText;
    public AcAccount mVipAccount;
    private final AcAccountResultCallback mVipAccountResultCallback;

    public class a implements AcAccountResultCallback {
        public a() {
        }

        @Override // com.platform.sdk.center.sdk.mvvm.model.net.callback.IBaseResultCallBack
        public final void onAccountResult(AcAccount acAccount) {
            AcAccountResultCallback acAccountResultCallback = AcBaseView.this.mRefreshResultCallback;
            if (acAccountResultCallback != null) {
                acAccountResultCallback.onAccountResult(acAccount);
            }
            AcBaseView.this.refreshVipAccountUI(acAccount);
        }

        @Override // com.platform.sdk.center.sdk.mvvm.model.net.callback.IBaseResultCallBack
        public final void onError(xr2 xr2Var, Throwable th, String str) {
            AcBaseView acBaseView = AcBaseView.this;
            if (acBaseView.mVipAccount == null) {
                acBaseView.refreshVipAccountUI(null);
            }
        }

        @Override // com.platform.sdk.center.sdk.mvvm.model.net.callback.AcAccountResultCallback
        public final void onOperationResult(AcCardOperationResult acCardOperationResult) {
            AcAccountResultCallback acAccountResultCallback = AcBaseView.this.mRefreshResultCallback;
            if (acAccountResultCallback != null) {
                acAccountResultCallback.onOperationResult(acCardOperationResult);
            }
            AcBaseView acBaseView = AcBaseView.this;
            if (acBaseView.homeShowStatisticEnable(acBaseView.mVipAccount)) {
                AcStatisticMethod.pageShow(AcBaseView.this.getContext(), AcBaseView.this.mIsLogin + "");
            }
            AcBaseView.this.setDefaultInfoDesc(null);
            boolean z = false;
            if (acCardOperationResult == null) {
                AcBaseView.this.mHasUnLoginRemindData = false;
                return;
            }
            AcBaseView acBaseView2 = AcBaseView.this;
            AcCardOperationResult.OperationInfo operationInfo = acCardOperationResult.info;
            if (operationInfo != null && !Lists.isNullOrEmpty(operationInfo.remindList)) {
                z = true;
            }
            acBaseView2.mHasUnLoginRemindData = z;
            AcBaseView acBaseView3 = AcBaseView.this;
            acBaseView3.setUnLoginRemindContent(acBaseView3.mHasUnLoginRemindData ? acCardOperationResult.info.remindList : null);
            if (acCardOperationResult.isSuccess) {
                return;
            }
            UCLogUtil.d(AcBaseView.TAG, "mysdk 获取卡片信息后台返回错误码:" + acCardOperationResult.code + ",result.msg:" + acCardOperationResult.msg);
        }
    }

    public AcBaseView(Context context) {
        super(context);
        this.mLoginRemindDatas = new ArrayList();
        this.mVipAccountResultCallback = new a();
        init(context);
    }

    private void configButton() {
        ImageTextButtonView imageTextButtonView = this.mAccountInfoView.mImageBtnSignIn;
        if (imageTextButtonView != null) {
            imageTextButtonView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.t7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.lambda$configButton$4(view);
                }
            });
        }
    }

    private void init(Context context) {
        this.mAppC = AcConstants.getAppC();
    }

    private void initView() {
        HeyTapAccountInfoView heyTapAccountInfoView = (HeyTapAccountInfoView) findViewById(R.id.header_layout);
        this.mAccountInfoView = heyTapAccountInfoView;
        heyTapAccountInfoView.mUserAvatar.setOnClickListener(this);
        this.mAccountInfoView.mUserName.setOnClickListener(this);
        this.mAccountInfoView.setOnClickListener(this);
        initOptionalView();
        if (AccountAgent.isGuest(getContext())) {
            this.mAccountInfoView.setGuestAccountInfo();
        } else {
            configButton();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$configButton$4(View view) {
        if (!openBtnConfigLink()) {
            if (this.mIsLogin) {
                userInfoButtonControl(view);
            } else {
                reqVipAccountTask();
            }
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOptionalView$5(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int displayedChild = this.mAccountInfoView.mVfUmloginRemind.getDisplayedChild();
        List<AcCardOperationResult.OperationInfo.LoginRemindListBean> list = this.mLoginRemindDatas;
        if (list == null || list.size() <= 1 || System.currentTimeMillis() - this.mLastStatTime <= 500 || displayedChild >= this.mLoginRemindDatas.size()) {
            return;
        }
        AcStatisticMethod.avatarShow(getContext(), this.mLoginRemindDatas.get(displayedChild).id + "");
        this.mLastStatTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAreaClickListener$0(View.OnClickListener onClickListener, View view) {
        AcStatisticMethod.clickAvatar(getContext());
        lambda$setAreaClickListener$2(view, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAreaClickListener$1(View.OnClickListener onClickListener, View view) {
        if (this.mIsLogin) {
            AcStatisticMethod.clickUserName(getContext());
        }
        lambda$setAreaClickListener$2(view, onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAvatarClickListener$3(View.OnClickListener onClickListener, View view) {
        AcStatisticMethod.clickAvatar(getContext());
        if (!this.mIsLogin) {
            reqVipAccountTask();
        } else if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            onClick(this.mAccountInfoView.mUserAvatar);
        }
    }

    private boolean openBtnConfigLink() {
        AcInfo acInfo;
        AcInfo.ButtonInfo buttonInfo;
        LinkDataAccount linkDataAccount;
        AcAccount acAccount = this.mVipAccount;
        if (acAccount == null || (acInfo = acAccount.vipInfo) == null || (buttonInfo = acInfo.button) == null) {
            UCLogUtil.w(TAG, "btn data is invalid");
            return false;
        }
        List<AcInfo.ButtonUrl> list = buttonInfo.buttonUrl;
        if (list == null || list.size() == 0) {
            UCLogUtil.w(TAG, "mButtonUrl size is 0");
            return false;
        }
        if (TextUtils.isEmpty(list.get(0).provider) || n.a(getContext(), list.get(0).provider)) {
            linkDataAccount = list.get(0).linkInfo;
        } else {
            linkDataAccount = list.size() > 1 ? list.get(1).linkInfo : null;
        }
        if (linkDataAccount == null) {
            UCLogUtil.w(TAG, "linkinfo is invalid");
            return false;
        }
        LinkInfo linkInfoFromAccount = LinkInfoHelp.getLinkInfoFromAccount(getContext(), linkDataAccount);
        if (linkInfoFromAccount != null) {
            linkInfoFromAccount.open(getContext());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setButtonOnClickListener, reason: merged with bridge method [inline-methods] */
    public void lambda$setAreaClickListener$2(View view, View.OnClickListener onClickListener) {
        if (!this.mIsLogin) {
            reqVipAccountTask();
        } else if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnLoginRemindContent(List<AcCardOperationResult.OperationInfo.LoginRemindListBean> list) {
        this.mLoginRemindDatas.clear();
        if (!this.mHasUnLoginRemindData) {
            this.mAccountInfoView.stopRemindFlipper();
            return;
        }
        this.mLoginRemindDatas.addAll(list);
        this.mAccountInfoView.startRemindFlipper();
        if (this.mLoginRemindDatas.size() == 1) {
            AcStatisticMethod.avatarShow(getContext(), this.mLoginRemindDatas.get(0).id + "");
        }
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void addFrontVipIcon(ImageView... imageViewArr) {
        this.mAccountInfoView.addMultipleFrontLogo(imageViewArr);
        if (this.mIsLogin) {
            this.mAccountInfoView.setShowLogoView(true);
        }
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void addVipIcon(ImageView... imageViewArr) {
        this.mAccountInfoView.addMultipleLogo(imageViewArr);
        if (this.mIsLogin) {
            this.mAccountInfoView.setShowLogoView(true);
        }
    }

    public void checkCallBackValid(IBaseResultCallBack iBaseResultCallBack) {
        if (iBaseResultCallBack == null) {
            UCLogUtil.w(AcConstants.TAG, " callback is null");
        } else if (iBaseResultCallBack instanceof AcAccountResultCallback) {
            this.mRefreshResultCallback = (AcAccountResultCallback) iBaseResultCallBack;
        }
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void destroy() {
        this.mRefreshResultCallback = null;
        AsyncTask<Context, Void, String> asyncTask = this.mRefreshTask;
        if (asyncTask != null && asyncTask.getStatus() == AsyncTask.Status.RUNNING) {
            this.mRefreshTask.cancel(true);
        }
        this.mRefreshTask = null;
    }

    public HeyTapAccountInfoView getAccountInfoView() {
        return this.mAccountInfoView;
    }

    public PlateStyle getPlateViewStyle() {
        return PlateStyle.NORMAL;
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void hideSignInBtn() {
        this.mAccountInfoView.setShowSignButton(false);
    }

    public boolean homeShowStatisticEnable(AcAccount acAccount) {
        return acAccount == null || "2001".equals(acAccount.resultCode) || "1000".equals(acAccount.resultCode);
    }

    public void initOptionalView() {
        this.mAccountInfoView.initRemindFlipper(this.mLoginRemindDatas, new View.OnLayoutChangeListener() { // from class: com.oplus.aiunit.vision.y7
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.i.lambda$initOptionalView$5(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public void jumpOrLoginTask() {
        if (!this.mIsLogin) {
            reqVipAccountTask();
            return;
        }
        Context context = getContext();
        String strUserCenterPackageName = OutsideApk.userCenterPackageName(context);
        if (AcAppUtils.checkEnable(context, strUserCenterPackageName)) {
            AccountAgent.startAccountSettingActivity(context, AcConstants.getAppC());
        } else {
            AcAppUtils.showMBADialog(context, strUserCenterPackageName);
        }
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public void onClick(View view) {
        AcAccountResultCallback acAccountResultCallback;
        if (AccountAgent.isGuest(getContext()) && (acAccountResultCallback = this.mRefreshResultCallback) != null) {
            acAccountResultCallback.onCTACallback();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
            return;
        }
        HeyTapAccountInfoView heyTapAccountInfoView = this.mAccountInfoView;
        if (view == heyTapAccountInfoView || view == heyTapAccountInfoView.mImageBtnSignIn) {
            jumpOrLoginTask();
        } else if (view == heyTapAccountInfoView.mUserAvatar) {
            AcStatisticMethod.clickAvatar(getContext());
            jumpOrLoginTask();
        } else if (view == heyTapAccountInfoView.mUserName) {
            if (this.mIsLogin) {
                AcStatisticMethod.clickUserName(getContext());
            }
            jumpOrLoginTask();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        initView();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            refreshVipAccountTask();
            AcStatisticMethod.showNamePlate(getContext());
        }
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    @SuppressLint({"StaticFieldLeak"})
    public void refresh() {
        refreshVipAccountTask();
    }

    public void refreshVipAccountTask() {
        if (AccountAgent.isGuest(getContext())) {
            this.mAccountInfoView.setGuestAccountInfo();
        } else {
            AcCenterAgent.getVipAccount(getContext(), true, this.mVipAccountResultCallback);
        }
    }

    public void refreshVipAccountUI(AcAccount acAccount) {
        this.mVipAccount = acAccount;
        this.mIsLogin = (acAccount == null || acAccount.vipInfo == null || !acAccount.isLogin) ? false : true;
        setDefaultInfoDesc(acAccount);
        if (acAccount == null) {
            setUnLoginUI(null);
            return;
        }
        if (!this.mIsLogin) {
            setUnLoginUI(acAccount.vipInfo);
            return;
        }
        c cVar = this.buttonResult;
        if (cVar != null) {
            this.mAccountInfoView.setSignBtnStyle(cVar.a, cVar.b, cVar.f480c);
        }
        setLoginUI(acAccount.vipInfo);
    }

    public void reqVipAccountTask() {
        if (AccountAgent.isGuest(getContext())) {
            return;
        }
        AcCenterAgent.reqSignInVipAccount(getContext(), true, this.mVipAccountResultCallback);
        AcStatisticMethod.clickLogin(getContext());
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setAreaClickListener(final View.OnClickListener onClickListener) {
        this.mAccountInfoView.mUserAvatar.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.u7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$setAreaClickListener$0(onClickListener, view);
            }
        });
        this.mAccountInfoView.mUserName.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.v7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$setAreaClickListener$1(onClickListener, view);
            }
        });
        this.mAccountInfoView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.w7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$setAreaClickListener$2(onClickListener, view);
            }
        });
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setAvatarClickListener(final View.OnClickListener onClickListener) {
        this.mAccountInfoView.mUserAvatar.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.x7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$setAvatarClickListener$3(onClickListener, view);
            }
        });
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setCardDataResultCallback(IBaseResultCallBack iBaseResultCallBack) {
        checkCallBackValid(iBaseResultCallBack);
    }

    public void setDefaultInfoDesc(AcAccount acAccount) {
        this.mAccountInfoView.setUnLoginRemind(false);
        boolean z = this.mHasUnLoginRemindData;
        if (z || this.mIsLogin) {
            this.mAccountInfoView.setLoginRemind(z);
        } else {
            this.mAccountInfoView.setUnLoginRemind(true);
        }
    }

    public void setLoginUI(AcInfo acInfo) {
        this.mAccountInfoView.setAccountInfo(getContext(), acInfo, true, this.mThirdBtnText);
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setMiddleView(View view) {
        if (view == null || this.mInflatedView != null) {
            return;
        }
        ViewStub viewStub = (ViewStub) findViewById(R.id.stub);
        ViewGroup viewGroup = (ViewGroup) viewStub.inflate();
        this.mInflatedView = viewGroup;
        viewGroup.addView(view);
        viewStub.setVisibility(0);
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setSignInBtn(float f, int i, int i2, String str) {
        this.mThirdBtnText = str;
        this.mAccountInfoView.setThirdSignBtn(f, i, i2, str);
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setSignInBtnClickListener(View.OnClickListener onClickListener) {
        this.mThirdBtnListener = onClickListener;
        this.mAccountInfoView.mBtnSignIn.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.userInfoButtonControl(view);
            }
        });
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setSignInBtnStyle(float f, int i, int i2) {
        this.mAccountInfoView.setSignBtnStyle(f, i, i2);
        if (i != 0) {
            c cVar = new c();
            this.buttonResult = cVar;
            cVar.a = f;
            cVar.b = i;
            cVar.f480c = i2;
        }
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setSignInBtnText(String str) {
        this.mThirdBtnText = str;
        this.mAccountInfoView.setSignBtnText(str, false);
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setThemeStyle(int i) {
        AcInfo acInfo;
        AcInfo acInfo2;
        AcAccount acAccount = this.mVipAccount;
        HeyTapAccountInfoView accountInfoView = getAccountInfoView();
        if (accountInfoView == null) {
            return;
        }
        accountInfoView.setThemeStyle(i);
        Context context = accountInfoView.getContext();
        ImageView imageView = (ImageView) accountInfoView.findViewById(R.id.user_avatar_img);
        TextView textView = (TextView) accountInfoView.findViewById(R.id.tv_user_name);
        TextView textView2 = (TextView) accountInfoView.findViewById(R.id.tv_un_login_default_text);
        TextView textView3 = (TextView) accountInfoView.findViewById(R.id.tv_account);
        if (i == 1) {
            UCLogUtil.i("ThemeUtils", "setVisualView is light");
            if (acAccount == null || !acAccount.isLogin || (acInfo2 = acAccount.vipInfo) == null || TextUtils.isEmpty(acInfo2.avatar)) {
                imageView.setImageResource(R.drawable.account_center_head_default_new);
            }
            int color = context.getResources().getColor(R.color.coui_color_primary_neutral_light);
            if (textView != null) {
                textView.setTextColor(color);
            }
            Resources resources = context.getResources();
            int i2 = R.color.coui_color_secondary_neutral_light;
            int color2 = resources.getColor(i2);
            if (textView3 != null) {
                textView3.setTextColor(color2);
            }
            int color3 = context.getResources().getColor(i2);
            if (textView2 != null) {
                textView2.setTextColor(color3);
                return;
            }
            return;
        }
        if (i == 2) {
            UCLogUtil.i("ThemeUtils", "setVisualView is night");
            if (acAccount == null || !acAccount.isLogin || (acInfo = acAccount.vipInfo) == null || TextUtils.isEmpty(acInfo.avatar)) {
                imageView.setImageResource(R.drawable.account_center_head_default_new);
            }
            int color4 = context.getResources().getColor(R.color.coui_color_primary_neutral_dark);
            if (textView != null) {
                textView.setTextColor(color4);
            }
            Resources resources2 = context.getResources();
            int i3 = R.color.coui_color_secondary_neutral_dark;
            int color5 = resources2.getColor(i3);
            if (textView3 != null) {
                textView3.setTextColor(color5);
            }
            int color6 = context.getResources().getColor(i3);
            if (textView2 != null) {
                textView2.setTextColor(color6);
            }
        }
    }

    public void setUnLoginUI(AcInfo acInfo) {
        this.mAccountInfoView.setAccountInfo(getContext(), acInfo, false, this.mThirdBtnText);
    }

    @Override // com.platform.sdk.center.widget.bottomview.IPlateView
    public void setVipNameplateView(boolean z) {
        this.isHideVipNameplate = z;
        this.mAccountInfoView.setHideVipNameplate(z);
    }

    public void userInfoButtonControl(View view) {
        View.OnClickListener onClickListener = this.mThirdBtnListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            onClick(view);
        }
        AcStatisticMethod.clickSignBtn(view.getContext());
    }

    public AcBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLoginRemindDatas = new ArrayList();
        this.mVipAccountResultCallback = new a();
        init(context);
    }
}
