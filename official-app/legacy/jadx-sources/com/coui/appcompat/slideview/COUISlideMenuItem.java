package com.coui.appcompat.slideview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.support.slideview.R$dimen;
import com.support.slideview.R$drawable;

/* JADX INFO: loaded from: classes13.dex */
public class COUISlideMenuItem {
    private Drawable mBackground;
    int[] mBackgroundStyleId;
    private Context mContext;
    private Drawable mIcon;
    private CharSequence mText;
    private int mWidth;

    public COUISlideMenuItem(Context context, CharSequence charSequence, Drawable drawable) {
        this.mBackgroundStyleId = new int[]{R$drawable.coui_slide_delete_background, R$drawable.coui_slide_copy_background, R$drawable.coui_slide_rename_background};
        this.mWidth = 54;
        this.mContext = context;
        this.mBackground = drawable;
        this.mText = charSequence;
        this.mWidth = context.getResources().getDimensionPixelSize(R$dimen.coui_slideview_menuitem_width);
    }

    public Drawable getBackground() {
        return this.mBackground;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public CharSequence getText() {
        return this.mText;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setBackground(Drawable drawable) {
        this.mBackground = drawable;
    }

    public void setBackgroundStyle(int i) {
        setBackground(this.mContext.getResources().getDrawable(this.mBackgroundStyleId[i]));
    }

    public void setContentDescription(String str) {
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public void setBackground(int i) {
        setBackground(this.mContext.getResources().getDrawable(i));
    }

    public void setIcon(int i) {
        this.mIcon = this.mContext.getResources().getDrawable(i);
    }

    public void setText(int i) {
        setText(this.mContext.getText(i));
    }

    public COUISlideMenuItem(Context context, int i, int i2) {
        this(context, context.getResources().getString(i), context.getResources().getDrawable(i2));
    }

    public COUISlideMenuItem(Context context, int i, Drawable drawable) {
        this(context, context.getResources().getString(i), drawable);
    }

    public COUISlideMenuItem(Context context, CharSequence charSequence, int i) {
        this(context, charSequence, context.getResources().getDrawable(i));
    }

    public COUISlideMenuItem(Context context, int i) {
        this(context, i, R$drawable.coui_slide_copy_background);
    }

    public COUISlideMenuItem(Context context, CharSequence charSequence) {
        this(context, charSequence, R$drawable.coui_slide_copy_background);
    }

    public COUISlideMenuItem(Context context, Drawable drawable) {
        int i = R$drawable.coui_slide_delete_background;
        int i2 = R$drawable.coui_slide_copy_background;
        this.mBackgroundStyleId = new int[]{i, i2, R$drawable.coui_slide_rename_background};
        this.mWidth = 54;
        this.mContext = context;
        this.mIcon = drawable;
        this.mBackground = context.getResources().getDrawable(i2);
        this.mText = null;
        this.mWidth = this.mContext.getResources().getDimensionPixelSize(R$dimen.coui_slideview_menuitem_width);
    }
}
