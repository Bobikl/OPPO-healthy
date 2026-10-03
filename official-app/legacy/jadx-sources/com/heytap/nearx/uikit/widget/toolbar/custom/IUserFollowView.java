package com.heytap.nearx.uikit.widget.toolbar.custom;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.heytap.nearx.uikit.widget.NearRoundImageView;

/* JADX INFO: loaded from: classes18.dex */
public interface IUserFollowView {

    public interface OnStateChangeListener {
        void onStateChanged(IUserFollowView iUserFollowView, boolean z);
    }

    NearRoundImageView getImage();

    boolean isAutoAnimate();

    boolean isFill();

    boolean isFollowing();

    boolean isSubFollowTitleEnable();

    void release();

    void setAnimate(boolean z);

    void setBtnBg(Drawable drawable);

    void setBtnText(CharSequence charSequence);

    void setFill(boolean z);

    void setFollowTitle(CharSequence charSequence);

    void setFollowTitleColor(int i);

    void setFollowTitleTextSize(float f, int i);

    void setFollowing(boolean z);

    void setImage(int i);

    void setImage(Bitmap bitmap);

    void setImage(Drawable drawable);

    void setOnStateChangeListener(OnStateChangeListener onStateChangeListener);

    void setSubFollowTitle(CharSequence charSequence);

    void setSubFollowTitleColor(int i);

    void setSubFollowTitleEnable(boolean z);

    void setSubFollowTitleTextSize(float f, int i);

    void startAnimation();
}
