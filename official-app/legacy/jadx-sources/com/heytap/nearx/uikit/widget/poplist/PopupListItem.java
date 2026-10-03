package com.heytap.nearx.uikit.widget.poplist;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes18.dex */
public class PopupListItem {
    private Drawable mIcon;
    private int mIconId;
    private boolean mIsCheckable;
    private boolean mIsChecked;
    private boolean mIsEnable;
    private int mRedDotAmount;
    private String mTitle;

    @ColorInt
    private int mTitleColorInt;
    private ColorStateList mTitleColorList;

    public PopupListItem(int i, String str, boolean z) {
        this.mRedDotAmount = -1;
        this.mTitleColorInt = -1;
        this.mIconId = i;
        this.mTitle = str;
        this.mIsEnable = z;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public int getIconId() {
        return this.mIconId;
    }

    public int getRedDotAmount() {
        return this.mRedDotAmount;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public int getTitleColorInt() {
        return this.mTitleColorInt;
    }

    public ColorStateList getTitleColorList() {
        return this.mTitleColorList;
    }

    public boolean isCheckable() {
        return this.mIsCheckable;
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnable() {
        return this.mIsEnable;
    }

    public void setCheckable(boolean z) {
        this.mIsCheckable = z;
    }

    public void setChecked(boolean z) {
        this.mIsChecked = z;
    }

    public void setEnable(boolean z) {
        this.mIsEnable = z;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setIconId(int i) {
        this.mIconId = i;
    }

    public void setRedDotAmount(int i) {
        this.mRedDotAmount = i;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setTitleColorInt(int i) {
        this.mTitleColorInt = i;
    }

    public void setTitleColorList(ColorStateList colorStateList) {
        this.mTitleColorList = colorStateList;
    }

    public PopupListItem(String str, boolean z) {
        this((Drawable) null, str, z);
    }

    public PopupListItem(Drawable drawable, String str, boolean z) {
        this(drawable, str, z, -1);
    }

    public PopupListItem(Drawable drawable, String str, boolean z, int i) {
        this(drawable, str, false, false, i, z);
    }

    public PopupListItem(Drawable drawable, String str, boolean z, boolean z2) {
        this(drawable, str, z, false, z2);
    }

    public PopupListItem(Drawable drawable, String str, boolean z, boolean z2, boolean z3) {
        this(drawable, str, z, z2, -1, z3);
    }

    public PopupListItem(Drawable drawable, String str, boolean z, boolean z2, int i, boolean z3) {
        this.mTitleColorInt = -1;
        this.mIcon = drawable;
        this.mTitle = str;
        this.mIsCheckable = z;
        this.mIsChecked = z2;
        this.mIsEnable = z3;
        this.mRedDotAmount = i;
    }
}
