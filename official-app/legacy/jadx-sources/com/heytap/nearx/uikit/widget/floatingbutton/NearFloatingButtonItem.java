package com.heytap.nearx.uikit.widget.floatingbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;

/* JADX INFO: loaded from: classes18.dex */
public class NearFloatingButtonItem implements Parcelable {
    public static final Parcelable.Creator<NearFloatingButtonItem> CREATOR = new Parcelable.Creator<NearFloatingButtonItem>() { // from class: com.heytap.nearx.uikit.widget.floatingbutton.NearFloatingButtonItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NearFloatingButtonItem createFromParcel(Parcel parcel) {
            return new NearFloatingButtonItem(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NearFloatingButtonItem[] newArray(int i) {
            return new NearFloatingButtonItem[i];
        }
    };
    public static final int RESOURCE_NOT_SET = Integer.MIN_VALUE;
    private ColorStateList mFabBackgroundColor;

    @Nullable
    private final Drawable mFabImageDrawable;

    @DrawableRes
    private final int mFabImageResource;

    @Nullable
    private final String mLabel;
    private ColorStateList mLabelBackgroundColor;
    private ColorStateList mLabelColor;

    @StringRes
    private final int mLabelRes;
    private boolean mNearFloatingButtonExpandEnable;
    private final int mNearFloatingButtonItemLocation;

    public static class Builder {
        private ColorStateList mFabBackgroundColor;

        @Nullable
        private Drawable mFabImageDrawable;

        @DrawableRes
        private final int mFabImageResource;

        @Nullable
        private String mLabel;
        private ColorStateList mLabelBackgroundColor;
        private ColorStateList mLabelColor;

        @StringRes
        private int mLabelRes;
        private boolean mNearFloatingButtonExpandEnable;
        private final int mNearFloatingButtonItemLocation;

        public Builder(int i, @DrawableRes int i2) {
            this.mLabelRes = Integer.MIN_VALUE;
            this.mFabBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mLabelColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mLabelBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mNearFloatingButtonExpandEnable = true;
            this.mNearFloatingButtonItemLocation = i;
            this.mFabImageResource = i2;
            this.mFabImageDrawable = null;
        }

        public NearFloatingButtonItem create() {
            return new NearFloatingButtonItem(this);
        }

        public Builder setFabBackgroundColor(ColorStateList colorStateList) {
            this.mFabBackgroundColor = colorStateList;
            return this;
        }

        public Builder setLabel(@Nullable String str) {
            this.mLabel = str;
            return this;
        }

        public Builder setLabelBackgroundColor(ColorStateList colorStateList) {
            this.mLabelBackgroundColor = colorStateList;
            return this;
        }

        public Builder setLabelColor(ColorStateList colorStateList) {
            this.mLabelColor = colorStateList;
            return this;
        }

        public Builder setNearFloatingButtonExpandEnable(boolean z) {
            this.mNearFloatingButtonExpandEnable = z;
            return this;
        }

        public Builder setLabel(@StringRes int i) {
            this.mLabelRes = i;
            return this;
        }

        public Builder(int i, @Nullable Drawable drawable) {
            this.mLabelRes = Integer.MIN_VALUE;
            this.mFabBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mLabelColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mLabelBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mNearFloatingButtonExpandEnable = true;
            this.mNearFloatingButtonItemLocation = i;
            this.mFabImageDrawable = drawable;
            this.mFabImageResource = Integer.MIN_VALUE;
        }

        public Builder(NearFloatingButtonItem nearFloatingButtonItem) {
            this.mLabelRes = Integer.MIN_VALUE;
            this.mFabBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mLabelColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mLabelBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.mNearFloatingButtonExpandEnable = true;
            this.mLabel = nearFloatingButtonItem.mLabel;
            this.mLabelRes = nearFloatingButtonItem.mLabelRes;
            this.mFabImageResource = nearFloatingButtonItem.mFabImageResource;
            this.mFabImageDrawable = nearFloatingButtonItem.mFabImageDrawable;
            this.mFabBackgroundColor = nearFloatingButtonItem.mFabBackgroundColor;
            this.mLabelColor = nearFloatingButtonItem.mLabelColor;
            this.mLabelBackgroundColor = nearFloatingButtonItem.mLabelBackgroundColor;
            this.mNearFloatingButtonExpandEnable = nearFloatingButtonItem.mNearFloatingButtonExpandEnable;
            this.mNearFloatingButtonItemLocation = nearFloatingButtonItem.mNearFloatingButtonItemLocation;
        }
    }

    public NearFloatingButtonLabel createFabWithLabelView(Context context) {
        NearFloatingButtonLabel nearFloatingButtonLabel = new NearFloatingButtonLabel(context);
        nearFloatingButtonLabel.setFloatingButtonItem(this);
        return nearFloatingButtonLabel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ColorStateList getFabBackgroundColor() {
        return this.mFabBackgroundColor;
    }

    @Nullable
    public Drawable getFabImageDrawable(Context context) {
        Drawable drawable = this.mFabImageDrawable;
        if (drawable != null) {
            return drawable;
        }
        int i = this.mFabImageResource;
        if (i != Integer.MIN_VALUE) {
            return AppCompatResources.getDrawable(context, i);
        }
        return null;
    }

    public int getFloatingButtonItemLocation() {
        return this.mNearFloatingButtonItemLocation;
    }

    @Nullable
    public String getLabel(Context context) {
        String str = this.mLabel;
        if (str != null) {
            return str;
        }
        int i = this.mLabelRes;
        if (i != Integer.MIN_VALUE) {
            return context.getString(i);
        }
        return null;
    }

    public ColorStateList getLabelBackgroundColor() {
        return this.mLabelBackgroundColor;
    }

    public ColorStateList getLabelColor() {
        return this.mLabelColor;
    }

    public boolean isNearFloatingButtonExpandEnable() {
        return this.mNearFloatingButtonExpandEnable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mLabel);
        parcel.writeInt(this.mLabelRes);
        parcel.writeInt(this.mFabImageResource);
        parcel.writeInt(this.mNearFloatingButtonItemLocation);
    }

    private NearFloatingButtonItem(Builder builder) {
        this.mFabBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mNearFloatingButtonExpandEnable = true;
        this.mLabel = builder.mLabel;
        this.mLabelRes = builder.mLabelRes;
        this.mFabImageResource = builder.mFabImageResource;
        this.mFabImageDrawable = builder.mFabImageDrawable;
        this.mFabBackgroundColor = builder.mFabBackgroundColor;
        this.mLabelColor = builder.mLabelColor;
        this.mLabelBackgroundColor = builder.mLabelBackgroundColor;
        this.mNearFloatingButtonExpandEnable = builder.mNearFloatingButtonExpandEnable;
        this.mNearFloatingButtonItemLocation = builder.mNearFloatingButtonItemLocation;
    }

    public NearFloatingButtonItem(Parcel parcel) {
        this.mFabBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mNearFloatingButtonExpandEnable = true;
        this.mLabel = parcel.readString();
        this.mLabelRes = parcel.readInt();
        this.mFabImageResource = parcel.readInt();
        this.mFabImageDrawable = null;
        this.mNearFloatingButtonItemLocation = parcel.readInt();
    }
}
