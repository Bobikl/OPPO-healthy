package com.coui.appcompat.toolbar.userfollow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.coui.appcompat.toolbar.COUICustomToolbar;

/* JADX INFO: loaded from: classes13.dex */
public class COUIUserInfoToolbar extends COUICustomToolbar implements IUserFollowView {
    public static final int FOLLOW_VIEW_ID = View.generateViewId();
    protected IUserFollowView followView;

    public COUIUserInfoToolbar(Context context) {
        this(context, null);
    }

    public IUserFollowView generateUserFollowView() {
        COUIUserFollowView cOUIUserFollowView = new COUIUserFollowView(getContext());
        cOUIUserFollowView.setId(FOLLOW_VIEW_ID);
        cOUIUserFollowView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setCustomView(cOUIUserFollowView);
        cOUIUserFollowView.setVisibility(4);
        return cOUIUserFollowView;
    }

    @Override // com.coui.appcompat.toolbar.COUICustomToolbar
    public int getCustomResId() {
        return 0;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public COUIRoundImageView getImage() {
        return this.followView.getImage();
    }

    @Override // com.coui.appcompat.toolbar.COUICustomToolbar
    public void init() {
        this.followView = generateUserFollowView();
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isAutoAnimate() {
        return this.followView.isAutoAnimate();
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isFill() {
        return this.followView.isFill();
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isFollowing() {
        return this.followView.isFollowing();
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isSubFollowTitleEnable() {
        return this.followView.isSubFollowTitleEnable();
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void release() {
        this.followView.release();
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setAnimate(boolean z) {
        this.followView.setAnimate(z);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setBtnBg(Drawable drawable) {
        this.followView.setBtnBg(drawable);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setBtnText(CharSequence charSequence) {
        this.followView.setBtnText(charSequence);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFill(boolean z) {
        this.followView.setFill(z);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowTitle(CharSequence charSequence) {
        this.followView.setFollowTitle(charSequence);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowTitleColor(int i) {
        this.followView.setFollowTitleColor(i);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowTitleTextSize(float f, int i) {
        this.followView.setFollowTitleTextSize(f, i);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowing(boolean z) {
        this.followView.setFollowing(z);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setImage(Drawable drawable) {
        this.followView.setImage(drawable);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setOnStateChangeListener(IUserFollowView.OnStateChangeListener onStateChangeListener) {
        this.followView.setOnStateChangeListener(onStateChangeListener);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitle(CharSequence charSequence) {
        this.followView.setSubFollowTitle(charSequence);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitleColor(int i) {
        this.followView.setSubFollowTitleColor(i);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitleEnable(boolean z) {
        this.followView.setSubFollowTitleEnable(z);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitleTextSize(float f, int i) {
        this.followView.setSubFollowTitleTextSize(f, i);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void startAnimation() {
        this.followView.startAnimation();
    }

    public COUIUserInfoToolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setImage(Bitmap bitmap) {
        this.followView.setImage(bitmap);
    }

    public COUIUserInfoToolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setImage(int i) {
        this.followView.setImage(i);
    }
}
