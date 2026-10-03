package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintAnimationPathBean implements Parcelable {
    public static final Parcelable.Creator<HandPaintAnimationPathBean> CREATOR = new a();
    public int CanvasHeight;
    public int CanvasWidth;
    public String HandPaintedKaleidoscope;
    public int MaxAccelerate;
    public double Radius;
    public int SilkNum;
    public List<HandPaintSilk> Silks;
    public int TotalFrameCount;

    public class a implements Parcelable.Creator<HandPaintAnimationPathBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HandPaintAnimationPathBean createFromParcel(Parcel parcel) {
            return new HandPaintAnimationPathBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HandPaintAnimationPathBean[] newArray(int i) {
            return new HandPaintAnimationPathBean[i];
        }
    }

    public HandPaintAnimationPathBean(Parcel parcel) {
        this.HandPaintedKaleidoscope = parcel.readString();
        this.Radius = parcel.readDouble();
        this.SilkNum = parcel.readInt();
        this.MaxAccelerate = parcel.readInt();
        this.CanvasWidth = parcel.readInt();
        this.CanvasHeight = parcel.readInt();
        this.TotalFrameCount = parcel.readInt();
        this.Silks = parcel.createTypedArrayList(HandPaintSilk.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.HandPaintedKaleidoscope);
        parcel.writeDouble(this.Radius);
        parcel.writeInt(this.SilkNum);
        parcel.writeInt(this.MaxAccelerate);
        parcel.writeInt(this.CanvasWidth);
        parcel.writeInt(this.CanvasHeight);
        parcel.writeInt(this.TotalFrameCount);
        parcel.writeTypedList(this.Silks);
    }
}
