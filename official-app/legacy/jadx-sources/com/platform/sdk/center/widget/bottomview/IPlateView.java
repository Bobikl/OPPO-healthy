package com.platform.sdk.center.widget.bottomview;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorRes;
import com.platform.sdk.center.sdk.mvvm.model.data.PlateStyle;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.IBaseResultCallBack;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public interface IPlateView {
    void addFrontVipIcon(ImageView... imageViewArr);

    void addVipIcon(ImageView... imageViewArr);

    void destroy();

    PlateStyle getPlateViewStyle();

    void hideSignInBtn();

    void refresh();

    void setAreaClickListener(View.OnClickListener onClickListener);

    void setAvatarClickListener(View.OnClickListener onClickListener);

    void setCardDataResultCallback(IBaseResultCallBack iBaseResultCallBack);

    void setMiddleView(View view);

    @Deprecated
    void setSignInBtn(float f, @ColorRes int i, int i2, String str);

    void setSignInBtnClickListener(View.OnClickListener onClickListener);

    void setSignInBtnStyle(float f, int i, int i2);

    void setSignInBtnText(String str);

    void setThemeStyle(int i);

    void setVipNameplateView(boolean z);
}
