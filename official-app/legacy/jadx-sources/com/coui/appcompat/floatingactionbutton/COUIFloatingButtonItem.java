package com.coui.appcompat.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;

/* JADX INFO: loaded from: classes13.dex */
public class COUIFloatingButtonItem implements Parcelable {
    public static final Parcelable.Creator<COUIFloatingButtonItem> CREATOR = new a();
    public static final int RESOURCE_NOT_SET = Integer.MIN_VALUE;
    private boolean mCOUIFloatingButtonExpandEnable;
    private final int mCOUIFloatingButtonItemLocation;
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

    public class a implements Parcelable.Creator<COUIFloatingButtonItem> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public COUIFloatingButtonItem createFromParcel(Parcel parcel) {
            return new COUIFloatingButtonItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public COUIFloatingButtonItem[] newArray(int i) {
            return new COUIFloatingButtonItem[i];
        }
    }

    public /* synthetic */ COUIFloatingButtonItem(b bVar, a aVar) {
        this(bVar);
    }

    public COUIFloatingButtonLabel createFabWithLabelView(Context context) {
        COUIFloatingButtonLabel cOUIFloatingButtonLabel = new COUIFloatingButtonLabel(context);
        cOUIFloatingButtonLabel.setFloatingButtonItem(this);
        return cOUIFloatingButtonLabel;
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
        return this.mCOUIFloatingButtonItemLocation;
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

    public boolean isCOUIFloatingButtonExpandEnable() {
        return this.mCOUIFloatingButtonExpandEnable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mLabel);
        parcel.writeInt(this.mLabelRes);
        parcel.writeInt(this.mFabImageResource);
        parcel.writeInt(this.mCOUIFloatingButtonItemLocation);
    }

    private COUIFloatingButtonItem(b bVar) {
        this.mFabBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mCOUIFloatingButtonExpandEnable = true;
        this.mLabel = bVar.d;
        this.mLabelRes = bVar.f1778e;
        this.mFabImageResource = bVar.b;
        this.mFabImageDrawable = bVar.f1777c;
        this.mFabBackgroundColor = bVar.f;
        this.mLabelColor = bVar.g;
        this.mLabelBackgroundColor = bVar.h;
        this.mCOUIFloatingButtonExpandEnable = bVar.i;
        this.mCOUIFloatingButtonItemLocation = bVar.a;
    }

    public static class b {
        public final int a;

        @DrawableRes
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Drawable f1777c;

        @Nullable
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @StringRes
        public int f1778e;
        public ColorStateList f;
        public ColorStateList g;
        public ColorStateList h;
        public boolean i;

        public b(int i, @DrawableRes int i2) {
            this.f1778e = Integer.MIN_VALUE;
            this.f = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.g = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.h = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.i = true;
            this.a = i;
            this.b = i2;
            this.f1777c = null;
        }

        public COUIFloatingButtonItem j() {
            return new COUIFloatingButtonItem(this, null);
        }

        public b k(ColorStateList colorStateList) {
            this.f = colorStateList;
            return this;
        }

        public b l(@Nullable String str) {
            this.d = str;
            return this;
        }

        public b m(ColorStateList colorStateList) {
            this.h = colorStateList;
            return this;
        }

        public b n(ColorStateList colorStateList) {
            this.g = colorStateList;
            return this;
        }

        public b(COUIFloatingButtonItem cOUIFloatingButtonItem) {
            this.f1778e = Integer.MIN_VALUE;
            this.f = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.g = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.h = ColorStateList.valueOf(Integer.MIN_VALUE);
            this.i = true;
            this.d = cOUIFloatingButtonItem.mLabel;
            this.f1778e = cOUIFloatingButtonItem.mLabelRes;
            this.b = cOUIFloatingButtonItem.mFabImageResource;
            this.f1777c = cOUIFloatingButtonItem.mFabImageDrawable;
            this.f = cOUIFloatingButtonItem.mFabBackgroundColor;
            this.g = cOUIFloatingButtonItem.mLabelColor;
            this.h = cOUIFloatingButtonItem.mLabelBackgroundColor;
            this.i = cOUIFloatingButtonItem.mCOUIFloatingButtonExpandEnable;
            this.a = cOUIFloatingButtonItem.mCOUIFloatingButtonItemLocation;
        }
    }

    public COUIFloatingButtonItem(Parcel parcel) {
        this.mFabBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mLabelBackgroundColor = ColorStateList.valueOf(Integer.MIN_VALUE);
        this.mCOUIFloatingButtonExpandEnable = true;
        this.mLabel = parcel.readString();
        this.mLabelRes = parcel.readInt();
        this.mFabImageResource = parcel.readInt();
        this.mFabImageDrawable = null;
        this.mCOUIFloatingButtonItemLocation = parcel.readInt();
    }
}
