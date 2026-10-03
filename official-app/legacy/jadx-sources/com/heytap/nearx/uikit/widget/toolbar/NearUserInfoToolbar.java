package com.heytap.nearx.uikit.widget.toolbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.widget.NearRoundImageView;
import com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView;
import com.heytap.nearx.uikit.widget.toolbar.custom.NearUserFollowView;

/* JADX INFO: loaded from: classes18.dex */
public class NearUserInfoToolbar extends NearCustomToolbar implements IUserFollowView {
    public static final int FOLLOW_VIEW_ID = View.generateViewId();
    protected IUserFollowView followView;

    public NearUserInfoToolbar(Context context) {
        this(context, null);
    }

    public IUserFollowView generateUserFollowView() {
        NearUserFollowView nearUserFollowView = new NearUserFollowView(getContext());
        nearUserFollowView.setId(FOLLOW_VIEW_ID);
        nearUserFollowView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setCustomView(nearUserFollowView);
        nearUserFollowView.setVisibility(4);
        return nearUserFollowView;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.NearCustomToolbar
    public int getCustomResId() {
        return 0;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public NearRoundImageView getImage() {
        return this.followView.getImage();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.NearCustomToolbar
    public void init() {
        this.followView = generateUserFollowView();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isAutoAnimate() {
        return this.followView.isAutoAnimate();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isFill() {
        return this.followView.isFill();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isFollowing() {
        return this.followView.isFollowing();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isSubFollowTitleEnable() {
        return this.followView.isSubFollowTitleEnable();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void release() {
        this.followView.release();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setAnimate(boolean z) {
        this.followView.setAnimate(z);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setBtnBg(Drawable drawable) {
        this.followView.setBtnBg(drawable);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setBtnText(CharSequence charSequence) {
        this.followView.setBtnText(charSequence);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFill(boolean z) {
        this.followView.setFill(z);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowTitle(CharSequence charSequence) {
        this.followView.setFollowTitle(charSequence);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowTitleColor(int i) {
        this.followView.setFollowTitleColor(i);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowTitleTextSize(float f, int i) {
        this.followView.setFollowTitleTextSize(f, i);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowing(boolean z) {
        this.followView.setFollowing(z);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setImage(Drawable drawable) {
        this.followView.setImage(drawable);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setOnStateChangeListener(IUserFollowView.OnStateChangeListener onStateChangeListener) {
        this.followView.setOnStateChangeListener(onStateChangeListener);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitle(CharSequence charSequence) {
        this.followView.setSubFollowTitle(charSequence);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitleColor(int i) {
        this.followView.setSubFollowTitleColor(i);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitleEnable(boolean z) {
        this.followView.setSubFollowTitleEnable(z);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitleTextSize(float f, int i) {
        this.followView.setSubFollowTitleTextSize(f, i);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void startAnimation() {
        this.followView.startAnimation();
    }

    public NearUserInfoToolbar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.toolbarStyle);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setImage(Bitmap bitmap) {
        this.followView.setImage(bitmap);
    }

    public NearUserInfoToolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setImage(int i) {
        this.followView.setImage(i);
    }
}
