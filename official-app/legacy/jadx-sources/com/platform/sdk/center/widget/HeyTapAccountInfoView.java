package com.platform.sdk.center.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.accountcenter.t;
import com.coui.appcompat.button.COUIButton;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.oplus.aiunit.vision.lh2;
import com.platform.sdk.center.R;
import com.platform.sdk.center.sdk.image.ImageLoadManager;
import com.platform.sdk.center.sdk.mvvm.model.data.AcCardOperationResult;
import com.platform.sdk.center.sdk.mvvm.model.data.AcInfo;
import com.platform.sdk.center.statistic.AcStatisticMethod;
import com.platform.sdk.center.widget.multiicon.MultiIconView;
import com.platform.usercenter.account.newcommon.router.LinkInfo;
import com.platform.usercenter.account.newcommon.router.LinkInfoHelp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.datastructure.Lists;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.ui.DisplayUtil;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class HeyTapAccountInfoView extends LinearLayout {
    private static final String TAG = "HeyTapAccountInfoView";
    private List<ImageView> internalFrontLogo;
    private List<ImageView> internalLogo;
    private boolean isHideVipNameplate;
    private View.OnClickListener listener;
    private List<ImageView> logoList;
    public TextView mAccount;
    public t mAdapter;
    public ImageView mArrow;
    public LinearLayout mBlankArea;
    public COUIButton mBtnSignIn;
    public ViewGroup mHayTapPlateAndIcon;
    public ImageTextButtonView mImageBtnSignIn;
    private boolean mIsAnimationAdd;
    public MultiIconView mMultiIconView;
    public int mRoundValue;
    private int mThemeStyle;
    public TextView mUnLoginDefaultText;
    public COUIRoundImageView mUserAvatar;
    public ImageView mUserAvatarStyle;
    public TextView mUserName;
    public AdapterViewFlipper mVfUmloginRemind;
    private List<ImageView> multiLogoList;

    public class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ View.OnLayoutChangeListener a;

        public a(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.a = onLayoutChangeListener;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            View.OnLayoutChangeListener onLayoutChangeListener = this.a;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
            if (HeyTapAccountInfoView.this.mIsAnimationAdd) {
                return;
            }
            HeyTapAccountInfoView heyTapAccountInfoView = HeyTapAccountInfoView.this;
            heyTapAccountInfoView.setRemindFlipperAnimation(heyTapAccountInfoView.getContext());
        }
    }

    public HeyTapAccountInfoView(Context context) {
        super(context);
        this.mIsAnimationAdd = false;
        this.mRoundValue = 100;
        this.logoList = new ArrayList();
        this.multiLogoList = new ArrayList();
        this.mThemeStyle = -1;
    }

    private int getUserDefaultIcon() {
        return R.drawable.account_center_head_default_new;
    }

    private void imgAddClickListener(final Context context, final AcInfo.VipType vipType, ImageView imageView) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.d89
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$imgAddClickListener$0(vipType, context, view);
            }
        });
    }

    private void initView() {
        this.mImageBtnSignIn = (ImageTextButtonView) findViewById(R.id.button_login_sign);
        this.mBtnSignIn = (COUIButton) findViewById(R.id.nearx_btn_sign_in);
        this.mUserName = (TextView) findViewById(R.id.tv_user_name);
        this.mMultiIconView = (MultiIconView) findViewById(R.id.multiIconView);
        this.mHayTapPlateAndIcon = (ViewGroup) findViewById(R.id.heytap_plate_and_icon);
        this.mUnLoginDefaultText = (TextView) findViewById(R.id.tv_un_login_default_text);
        this.mUserAvatar = (COUIRoundImageView) findViewById(R.id.user_avatar_img);
        this.mUserAvatarStyle = (ImageView) findViewById(R.id.user_avatar_img_style);
        this.mArrow = (ImageView) findViewById(R.id.iv_arrow);
        this.mVfUmloginRemind = (AdapterViewFlipper) findViewById(R.id.vf_un_login_remind);
        this.mAccount = (TextView) findViewById(R.id.tv_account);
        this.mBlankArea = (LinearLayout) findViewById(R.id.blank_area);
    }

    private boolean isDestroy(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$imgAddClickListener$0(AcInfo.VipType vipType, Context context, View view) {
        try {
            LinkInfo linkInfoFromAccount = LinkInfoHelp.getLinkInfoFromAccount(getContext(), vipType.url);
            if (linkInfoFromAccount != null) {
                linkInfoFromAccount.open(getContext());
            }
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
        }
        AcStatisticMethod.clickNamePlate(context, vipType.vipCode);
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private void loadView(Context context, ImageView imageView, String str, int i) {
        if (!(context instanceof Activity) || isDestroy((Activity) context)) {
            ImageLoadManager.getInstance().loadView(context.getApplicationContext(), str, i, imageView);
        } else {
            ImageLoadManager.getInstance().loadView(context, str, i, imageView);
        }
    }

    private void logoListAddImg(List<AcInfo.VipType> list) {
        if (this.logoList.size() == list.size()) {
            if (this.logoList.size() > 0) {
                setShowLogoView(true);
                return;
            }
            return;
        }
        this.logoList.clear();
        for (int i = 0; i < list.size(); i++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, DisplayUtil.dp2px(getContext(), 19)));
            this.logoList.add(imageView);
        }
        notifyLogoView();
    }

    private void notifyLogoView() {
        this.multiLogoList.clear();
        if (!Lists.isNullOrEmpty(this.internalFrontLogo)) {
            this.multiLogoList.addAll(this.internalFrontLogo);
        }
        this.multiLogoList.addAll(this.logoList);
        if (!Lists.isNullOrEmpty(this.internalLogo)) {
            this.multiLogoList.addAll(this.internalLogo);
        }
        this.mMultiIconView.a(DisplayUtil.dp2px(getContext(), 5), this.multiLogoList);
        setShowLogoView(!this.logoList.isEmpty());
    }

    private void setAccountInfoView(boolean z, String str) {
        TextView textView = this.mAccount;
        if (textView != null) {
            if (!z) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(str);
            this.mAccount.setContentDescription(str.replaceAll("\\d", "$0 "));
            this.mAccount.setVisibility(0);
        }
    }

    private void setAccountView(String str) {
        this.logoList.clear();
        notifyLogoView();
        if (TextUtils.isEmpty(str)) {
            setAccountInfoView(false, "");
        } else {
            setAccountInfoView(true, str);
        }
    }

    private void setButton(Context context, AcInfo.ButtonInfo buttonInfo, boolean z, String str) {
        ImageTextButtonView imageTextButtonView = this.mImageBtnSignIn;
        if (imageTextButtonView == null) {
            return;
        }
        imageTextButtonView.setTag(Boolean.FALSE);
        if (buttonInfo != null && !TextUtils.isEmpty(buttonInfo.buttonText)) {
            setSignBtnImage(context, buttonInfo.buttonIcon);
            setSignBtnText(buttonInfo.buttonText, true);
            this.mImageBtnSignIn.setTag(Boolean.TRUE);
        } else {
            if (!z && TextUtils.isEmpty(str)) {
                str = getResources().getString(R.string.vip_login);
            }
            setSignBtnText(str, false);
        }
    }

    private void setImgLayoutParams(AcInfo.VipType vipType, ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (vipType.iconWidth > 0) {
            layoutParams.width = DisplayUtil.dp2px(getContext(), vipType.iconWidth);
        }
        if (vipType.iconHeight > 0) {
            layoutParams.height = DisplayUtil.dp2px(getContext(), vipType.iconHeight);
        }
        imageView.setLayoutParams(layoutParams);
    }

    private void setImgLoadView(Context context, List<AcInfo.VipType> list) {
        for (int i = 0; i < list.size(); i++) {
            AcInfo.VipType vipType = list.get(i);
            ImageView imageView = this.logoList.get(i);
            setImgLayoutParams(vipType, imageView);
            if (TextUtils.isEmpty(vipType.vipIcon)) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                loadView(context, imageView, vipType.vipIcon, 0);
                imgAddClickListener(context, vipType, imageView);
            }
        }
    }

    private void setMultiLogoList(Context context, List<AcInfo.VipType> list, String str) {
        if (list == null || list.isEmpty()) {
            setAccountView(str);
            return;
        }
        if (!isHideVipNameplate()) {
            setAccountInfoView(false, "");
            logoListAddImg(list);
            setImgLoadView(context, list);
        } else {
            this.logoList.clear();
            notifyLogoView();
            TextView textView = this.mAccount;
            if (textView != null) {
                textView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemindFlipperAnimation(Context context) {
        this.mVfUmloginRemind.setInAnimation(context, R.animator.account_center_vf_in);
        this.mVfUmloginRemind.setOutAnimation(context, R.animator.account_center_vf_out);
        this.mIsAnimationAdd = true;
    }

    private void setSignBtnImage(Context context, String str) {
        if (this.mImageBtnSignIn == null) {
            return;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            this.mImageBtnSignIn.setTextSize(context.getResources().getDimension(R.dimen.account_center_13sp));
            this.mImageBtnSignIn.b.setPadding(0, 0, 0, 0);
            this.mImageBtnSignIn.getImageView().setVisibility(8);
            return;
        }
        if (!(context instanceof Activity) || isDestroy((Activity) context)) {
            ImageLoadManager.getInstance().loadView(context.getApplicationContext(), str, 0, this.mImageBtnSignIn.getImageView());
        } else {
            ImageLoadManager.getInstance().loadView(context, str, 0, this.mImageBtnSignIn.getImageView());
        }
        this.mImageBtnSignIn.setTextSize(context.getResources().getDimension(R.dimen.account_center_14sp));
        ImageTextButtonView imageTextButtonView = this.mImageBtnSignIn;
        imageTextButtonView.b.setPadding(DisplayUtil.dip2px(getContext(), 2.6f), 0, 0, 0);
        this.mImageBtnSignIn.getImageView().setVisibility(0);
    }

    private void setUserAvatar(Context context, AcInfo acInfo) {
        if (TextUtils.isEmpty(acInfo.avatar)) {
            this.mUserAvatar.setImageResource(getUserDefaultIcon());
        } else {
            loadView(context, this.mUserAvatar, acInfo.avatar, getUserDefaultIcon());
        }
        if (!acInfo.isVip) {
            this.mUserAvatarStyle.setVisibility(8);
        } else if (TextUtils.isEmpty(acInfo.avatarStyle)) {
            this.mUserAvatarStyle.setVisibility(8);
        } else {
            this.mUserAvatarStyle.setVisibility(0);
            loadView(context, this.mUserAvatarStyle, acInfo.avatarStyle, 0);
        }
    }

    private void setUserTextColor(TextView textView, int i) {
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    private void setVipNameplateView(boolean z) {
        ViewGroup viewGroup;
        if (z && (viewGroup = this.mHayTapPlateAndIcon) != null && viewGroup.getVisibility() == 0) {
            this.mHayTapPlateAndIcon.setVisibility(8);
        }
    }

    private void updateMultipleLogo(ImageView[] imageViewArr, List<ImageView> list) {
        setAccountInfoView(false, "");
        if (imageViewArr == null || imageViewArr.length <= 0) {
            return;
        }
        for (ImageView imageView : imageViewArr) {
            if (imageView.getLayoutParams() == null) {
                imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, DisplayUtil.dp2px(getContext(), 19)));
            }
            list.add(imageView);
        }
    }

    public void addMultipleFrontLogo(ImageView... imageViewArr) {
        List<ImageView> list = this.internalFrontLogo;
        if (list == null) {
            this.internalFrontLogo = new ArrayList();
        } else {
            list.clear();
        }
        updateMultipleLogo(imageViewArr, this.internalFrontLogo);
        notifyLogoView();
    }

    public void addMultipleLogo(ImageView... imageViewArr) {
        List<ImageView> list = this.internalLogo;
        if (list == null) {
            this.internalLogo = new ArrayList();
        } else {
            list.clear();
        }
        updateMultipleLogo(imageViewArr, this.internalLogo);
        notifyLogoView();
    }

    public void inflateView(Context context) {
        View.inflate(context, R.layout.account_center_header_heytap_account_info, this);
        setOrientation(1);
    }

    public void initRemindFlipper(List<AcCardOperationResult.OperationInfo.LoginRemindListBean> list, View.OnLayoutChangeListener onLayoutChangeListener) {
        t tVar = new t(getContext(), list);
        this.mAdapter = tVar;
        this.mVfUmloginRemind.setAdapter(tVar);
        this.mVfUmloginRemind.setFlipInterval(4000);
        this.mVfUmloginRemind.addOnLayoutChangeListener(new a(onLayoutChangeListener));
    }

    public boolean isHideVipNameplate() {
        return this.isHideVipNameplate;
    }

    public void setAccountInfo(Context context, AcInfo acInfo, boolean z, String str) {
        if (acInfo == null || !z) {
            setUnLoginAccountInfo(context, acInfo, str);
            return;
        }
        setUserAvatar(context, acInfo);
        setUserNameText(acInfo.userName);
        setButton(context, acInfo.button, true, str);
        setMultiLogoList(context, acInfo.vipTypes, acInfo.account);
    }

    public void setGuestAccountInfo() {
        this.mUserAvatar.setImageResource(getUserDefaultIcon());
        this.mUserAvatarStyle.setVisibility(8);
        this.mUserName.setText(getResources().getString(R.string.login_account));
        setShowSignButton(false);
        if (this.mUnLoginDefaultText.getVisibility() == 8) {
            setAccountInfoView(true, getResources().getString(R.string.get_enjoy_more_quality_services));
        }
        setShowLogoView(false);
    }

    public void setHideVipNameplate(boolean z) {
        this.isHideVipNameplate = z;
        setVipNameplateView(z);
    }

    public void setLoginRemind(boolean z) {
        if (z) {
            this.mVfUmloginRemind.setVisibility(0);
        } else {
            this.mVfUmloginRemind.setVisibility(8);
        }
    }

    public void setNearPopTipViewClickListener(View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    public void setShowLogoView(boolean z) {
        if (!z) {
            this.mHayTapPlateAndIcon.setVisibility(8);
        } else {
            this.mHayTapPlateAndIcon.setVisibility(0);
            this.mMultiIconView.setVisibility(0);
        }
    }

    public void setShowSignButton(boolean z) {
        ImageTextButtonView imageTextButtonView = this.mImageBtnSignIn;
        if (imageTextButtonView != null) {
            if (z) {
                imageTextButtonView.setVisibility(0);
                return;
            } else {
                imageTextButtonView.setVisibility(8);
                return;
            }
        }
        if (z) {
            this.mBtnSignIn.setVisibility(0);
        } else {
            this.mBtnSignIn.setVisibility(8);
        }
    }

    public void setSignBtnStyle(float f, int i, int i2) {
        if (this.mImageBtnSignIn == null) {
            this.mBtnSignIn.setDrawableColor(i);
            this.mBtnSignIn.setTextColor(i2);
            if (f >= 0.0f) {
                this.mBtnSignIn.setDrawableRadius((int) f);
                return;
            }
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (f >= 0.0f) {
            gradientDrawable.setCornerRadius(f);
        }
        gradientDrawable.setColor(i);
        this.mImageBtnSignIn.setBackground(gradientDrawable);
        this.mImageBtnSignIn.setTextColor(i2);
    }

    public void setSignBtnText(String str, boolean z) {
        ImageTextButtonView imageTextButtonView = this.mImageBtnSignIn;
        if (imageTextButtonView == null) {
            if (TextUtils.isEmpty(str)) {
                this.mBtnSignIn.setVisibility(8);
                UCLogUtil.w(TAG, "remote mBtnSignIn text is null");
                return;
            } else {
                this.mBtnSignIn.setText(str);
                this.mBtnSignIn.setVisibility(0);
                return;
            }
        }
        if (!z && imageTextButtonView.getTag() != null && ((Boolean) this.mImageBtnSignIn.getTag()).booleanValue()) {
            UCLogUtil.i(TAG, "prior remote button text");
        } else if (TextUtils.isEmpty(str)) {
            UCLogUtil.i(TAG, "remote mImageBtnSignIn text is null");
            this.mImageBtnSignIn.setVisibility(8);
        } else {
            this.mImageBtnSignIn.setText(str);
            this.mImageBtnSignIn.setVisibility(0);
        }
    }

    public void setThemeStyle(int i) {
        this.mThemeStyle = i;
    }

    public void setThirdSignBtn(float f, int i, int i2, String str) {
        setSignBtnStyle(f, i, i2);
        setSignBtnText(str, false);
    }

    public void setUnLoginAccountInfo(Context context, AcInfo acInfo, String str) {
        this.mUserAvatar.setImageResource(getUserDefaultIcon());
        this.mUserAvatarStyle.setVisibility(8);
        TextView textView = this.mUserName;
        int i = R.string.login_account;
        textView.setText(i);
        TextView textView2 = this.mUnLoginDefaultText;
        int i2 = R.string.get_enjoy_more_quality_services;
        textView2.setText(i2);
        this.mUnLoginDefaultText.setVisibility(0);
        if (acInfo != null) {
            if (!TextUtils.isEmpty(acInfo.notLogInTitle)) {
                this.mUserName.setText(acInfo.notLogInTitle);
            }
            if (!TextUtils.isEmpty(acInfo.loginGuide)) {
                this.mUnLoginDefaultText.setText(acInfo.loginGuide);
            }
            setSignBtnStyle(DisplayUtil.dip2px(getContext(), this.mRoundValue), lh2.a(context, R.attr.couiColorPrimary), getResources().getColor(R.color.coui_color_on_primary));
            setButton(context, acInfo.button, false, str);
        } else {
            this.mUserName.setText(i);
            this.mUnLoginDefaultText.setText(i2);
            setSignBtnStyle(DisplayUtil.dip2px(getContext(), this.mRoundValue), lh2.a(context, R.attr.couiColorPrimary), getResources().getColor(R.color.coui_color_on_primary));
            setButton(context, null, false, str);
        }
        setAccountInfoView(false, "");
        this.logoList.clear();
        notifyLogoView();
    }

    public void setUnLoginRemind(boolean z) {
        if (z) {
            this.mUnLoginDefaultText.setVisibility(0);
        } else {
            this.mUnLoginDefaultText.setVisibility(8);
        }
    }

    public void setUserNameText(String str) {
        this.mUserName.setText(str);
    }

    public void startRemindFlipper() {
        this.mAdapter.notifyDataSetChanged();
        if (this.mVfUmloginRemind.isFlipping()) {
            return;
        }
        this.mVfUmloginRemind.startFlipping();
    }

    public void stopRemindFlipper() {
        this.mAdapter.notifyDataSetChanged();
        if (this.mVfUmloginRemind.isFlipping()) {
            this.mVfUmloginRemind.stopFlipping();
        }
    }

    public HeyTapAccountInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsAnimationAdd = false;
        this.mRoundValue = 100;
        this.logoList = new ArrayList();
        this.multiLogoList = new ArrayList();
        this.mThemeStyle = -1;
        inflateView(context);
        initView();
    }
}
