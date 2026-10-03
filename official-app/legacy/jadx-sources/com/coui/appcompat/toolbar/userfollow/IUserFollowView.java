package com.coui.appcompat.toolbar.userfollow;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.coui.appcompat.imageview.COUIRoundImageView;

/* JADX INFO: loaded from: classes13.dex */
public interface IUserFollowView {

    public interface OnStateChangeListener {
        void onStateChanged(IUserFollowView iUserFollowView, boolean z);
    }

    COUIRoundImageView getImage();

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
