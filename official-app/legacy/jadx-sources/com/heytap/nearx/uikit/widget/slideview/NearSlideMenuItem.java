package com.heytap.nearx.uikit.widget.slideview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.oplus.aiunit.vision.xhc;

/* JADX INFO: loaded from: classes18.dex */
public class NearSlideMenuItem {
    public static final int CUSTOM_TYPE = 0;
    public static final int DELETE_TYPE = 1;
    private Drawable mBackground;
    int[] mBackgroundStyleId;
    private Context mContext;
    private Drawable mIcon;
    private CharSequence mText;
    private int mType;
    private int mWidth;

    public NearSlideMenuItem(Context context, CharSequence charSequence, Drawable drawable) {
        this.mBackgroundStyleId = new int[]{R$drawable.nx_slide_delete_background, R$drawable.nx_slide_copy_background, R$drawable.nx_slide_rename_background};
        this.mWidth = 54;
        this.mContext = context;
        this.mBackground = drawable;
        this.mText = charSequence;
        this.mWidth = context.getResources().getDimensionPixelSize(R$dimen.nx_slideview_menuitem_width);
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

    public int getType() {
        return this.mType;
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

    public void setType(int i) {
        this.mType = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public void setBackground(int i) {
        xhc xhcVar = xhc.INSTANCE;
        setBackground(xhc.a(this.mContext, i));
    }

    public void setIcon(int i) {
        xhc xhcVar = xhc.INSTANCE;
        this.mIcon = xhc.a(this.mContext, i);
    }

    public void setText(int i) {
        setText(this.mContext.getText(i));
    }

    public NearSlideMenuItem(Context context, int i, int i2) {
        this(context, context.getResources().getString(i), xhc.a(context, i2));
    }

    public NearSlideMenuItem(Context context, int i, Drawable drawable) {
        this(context, context.getResources().getString(i), drawable);
    }

    public NearSlideMenuItem(Context context, CharSequence charSequence, int i) {
        this(context, charSequence, xhc.a(context, i));
    }

    public NearSlideMenuItem(Context context, int i) {
        this(context, i, R$drawable.nx_slide_copy_background);
    }

    public NearSlideMenuItem(Context context, CharSequence charSequence) {
        this(context, charSequence, R$drawable.nx_slide_copy_background);
    }

    public NearSlideMenuItem(Context context, Drawable drawable) {
        int i = R$drawable.nx_slide_delete_background;
        int i2 = R$drawable.nx_slide_copy_background;
        this.mBackgroundStyleId = new int[]{i, i2, R$drawable.nx_slide_rename_background};
        this.mWidth = 54;
        this.mContext = context;
        this.mIcon = drawable;
        this.mBackground = context.getResources().getDrawable(i2);
        this.mText = null;
        this.mWidth = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_slideview_menuitem_width);
    }
}
