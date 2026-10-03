package com.heytap.nearx.uikit.widget.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.oplus.aiunit.vision.xhc;

/* JADX INFO: loaded from: classes18.dex */
public class NearSupportMenuItem {
    public static final int ITEM_EIGHTH = 7;
    public static final int ITEM_FIFTH = 4;
    public static final int ITEM_FIRST = 0;
    public static final int ITEM_FOURTH = 3;
    public static final int ITEM_NINTH = 8;
    public static final int ITEM_SECOND = 1;
    public static final int ITEM_SEVENTH = 6;
    public static final int ITEM_SIXTH = 5;
    public static final int ITEM_TENTH = 9;
    public static final int ITEM_THIRD = 2;
    private Drawable mBackgroud;
    private Context mContext;
    private Drawable mIcon;
    private OnItemClickListener mOnItemClickListener;
    private String mText;

    public static class Builder {
        private NearSupportMenuItem mCi;

        public Builder(Context context) {
            NearSupportMenuItem nearSupportMenuItem = new NearSupportMenuItem();
            this.mCi = nearSupportMenuItem;
            nearSupportMenuItem.mContext = context;
        }

        public NearSupportMenuItem create() {
            return this.mCi;
        }

        public Builder setBackgroud(Drawable drawable) {
            this.mCi.mBackgroud = drawable;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.mCi.mIcon = drawable;
            return this;
        }

        public Builder setOnItemClickListener(OnItemClickListener onItemClickListener) {
            this.mCi.mOnItemClickListener = onItemClickListener;
            return this;
        }

        public Builder setText(String str) {
            this.mCi.mText = str;
            return this;
        }

        public Builder setBackgroud(int i) {
            NearSupportMenuItem nearSupportMenuItem = this.mCi;
            xhc xhcVar = xhc.INSTANCE;
            nearSupportMenuItem.mBackgroud = xhc.a(nearSupportMenuItem.getContext(), i);
            return this;
        }

        public Builder setIcon(int i) {
            NearSupportMenuItem nearSupportMenuItem = this.mCi;
            xhc xhcVar = xhc.INSTANCE;
            nearSupportMenuItem.mIcon = xhc.a(nearSupportMenuItem.getContext(), i);
            return this;
        }

        public Builder setText(int i) {
            NearSupportMenuItem nearSupportMenuItem = this.mCi;
            nearSupportMenuItem.mText = nearSupportMenuItem.getContext().getString(i);
            return this;
        }
    }

    public interface OnItemClickListener {
        void onColorMenuItemClick(int i);
    }

    public Drawable getBackgroud() {
        return this.mBackgroud;
    }

    public Context getContext() {
        return this.mContext;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public OnItemClickListener getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public String getText() {
        return this.mText;
    }

    public void setBackgroud(Drawable drawable) {
        this.mBackgroud = drawable;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public void setText(String str) {
        this.mText = str;
    }
}
