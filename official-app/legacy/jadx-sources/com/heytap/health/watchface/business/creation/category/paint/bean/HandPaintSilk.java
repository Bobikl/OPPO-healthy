package com.heytap.health.watchface.business.creation.category.paint.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HandPaintSilk implements Parcelable {
    public static final Parcelable.Creator<HandPaintSilk> CREATOR = new a();
    public int Accelerate;
    public int BrushLineWidth;
    public double CentralPointX;
    public double CentralPointY;
    public boolean Enable;
    public List<HandPaintFrame> Frames;
    public boolean Mirror;
    public int Rotates;
    public int SilkID;
    public int Spirals;
    public int StepsPerFrame;
    public int TotalFrames;
    public boolean WithSpark;

    public class a implements Parcelable.Creator<HandPaintSilk> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HandPaintSilk createFromParcel(Parcel parcel) {
            return new HandPaintSilk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HandPaintSilk[] newArray(int i) {
            return new HandPaintSilk[i];
        }
    }

    public HandPaintSilk(Parcel parcel) {
        this.SilkID = parcel.readInt();
        this.Enable = parcel.readByte() != 0;
        this.Mirror = parcel.readByte() != 0;
        this.Rotates = parcel.readInt();
        this.Spirals = parcel.readInt();
        this.StepsPerFrame = parcel.readInt();
        this.BrushLineWidth = parcel.readInt();
        this.Accelerate = parcel.readInt();
        this.TotalFrames = parcel.readInt();
        this.WithSpark = parcel.readByte() != 0;
        this.CentralPointX = parcel.readDouble();
        this.CentralPointY = parcel.readDouble();
        this.Frames = parcel.createTypedArrayList(HandPaintFrame.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.SilkID);
        parcel.writeByte(this.Enable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Mirror ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.Rotates);
        parcel.writeInt(this.Spirals);
        parcel.writeInt(this.StepsPerFrame);
        parcel.writeInt(this.BrushLineWidth);
        parcel.writeInt(this.Accelerate);
        parcel.writeInt(this.TotalFrames);
        parcel.writeByte(this.WithSpark ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.CentralPointX);
        parcel.writeDouble(this.CentralPointY);
        parcel.writeTypedList(this.Frames);
    }
}
