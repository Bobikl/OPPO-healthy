package com.oplus.compat.app;

import android.annotation.SuppressLint;
import android.compat.annotation.UnsupportedAppUsage;
import android.content.ComponentName;
import android.content.res.Configuration;
import android.graphics.ColorSpace;
import android.graphics.GraphicBuffer;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class TaskSnapshotNative implements Parcelable {
    public static final Parcelable.Creator<TaskSnapshotNative> CREATOR = new a();
    private final ColorSpace mColorSpace;
    private final Rect mContentInsets;
    private final long mId;
    private final boolean mIsLowResolution;
    private final boolean mIsRealSnapshot;
    private final boolean mIsTranslucent;

    @Configuration.Orientation
    private final int mOrientation;
    private final int mRotation;
    private final GraphicBuffer mSnapshot;
    private final int mSystemUiVisibility;
    private final Point mTaskSize;
    private final ComponentName mTopActivityComponent;
    private final int mWindowingMode;

    public class a implements Parcelable.Creator<TaskSnapshotNative> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TaskSnapshotNative createFromParcel(Parcel parcel) {
            return new TaskSnapshotNative(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TaskSnapshotNative[] newArray(int i) {
            return new TaskSnapshotNative[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ColorSpace getColorSpace() {
        return this.mColorSpace;
    }

    @UnsupportedAppUsage
    public Rect getContentInsets() {
        return this.mContentInsets;
    }

    public long getId() {
        return this.mId;
    }

    @UnsupportedAppUsage
    public int getOrientation() {
        return this.mOrientation;
    }

    public int getRotation() {
        return this.mRotation;
    }

    @UnsupportedAppUsage
    public GraphicBuffer getSnapshot() {
        return this.mSnapshot;
    }

    public int getSystemUiVisibility() {
        return this.mSystemUiVisibility;
    }

    @UnsupportedAppUsage
    public Point getTaskSize() {
        return this.mTaskSize;
    }

    public ComponentName getTopActivityComponent() {
        return this.mTopActivityComponent;
    }

    public int getWindowingMode() {
        return this.mWindowingMode;
    }

    @UnsupportedAppUsage
    public boolean isLowResolution() {
        return this.mIsLowResolution;
    }

    @UnsupportedAppUsage
    public boolean isRealSnapshot() {
        return this.mIsRealSnapshot;
    }

    public boolean isTranslucent() {
        return this.mIsTranslucent;
    }

    public String toString() {
        GraphicBuffer graphicBuffer = this.mSnapshot;
        int width = graphicBuffer != null ? graphicBuffer.getWidth() : 0;
        GraphicBuffer graphicBuffer2 = this.mSnapshot;
        return "TaskSnapshot{ mId=" + this.mId + " mTopActivityComponent=" + this.mTopActivityComponent.flattenToShortString() + " mSnapshot=" + this.mSnapshot + " (" + width + "x" + (graphicBuffer2 != null ? graphicBuffer2.getHeight() : 0) + ") mColorSpace=" + this.mColorSpace.toString() + " mOrientation=" + this.mOrientation + " mRotation=" + this.mRotation + " mTaskSize=" + this.mTaskSize.toString() + " mContentInsets=" + this.mContentInsets.toShortString() + " mIsLowResolution=" + this.mIsLowResolution + " mIsRealSnapshot=" + this.mIsRealSnapshot + " mWindowingMode=" + this.mWindowingMode + " mSystemUiVisibility=" + this.mSystemUiVisibility + " mIsTranslucent=" + this.mIsTranslucent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mId);
        ComponentName.writeToParcel(this.mTopActivityComponent, parcel);
        GraphicBuffer graphicBuffer = this.mSnapshot;
        parcel.writeParcelable((graphicBuffer == null || graphicBuffer.isDestroyed()) ? null : this.mSnapshot, 0);
        parcel.writeInt(this.mColorSpace.getId());
        parcel.writeInt(this.mOrientation);
        parcel.writeInt(this.mRotation);
        parcel.writeParcelable(this.mTaskSize, 0);
        parcel.writeParcelable(this.mContentInsets, 0);
        parcel.writeBoolean(this.mIsLowResolution);
        parcel.writeBoolean(this.mIsRealSnapshot);
        parcel.writeInt(this.mWindowingMode);
        parcel.writeInt(this.mSystemUiVisibility);
        parcel.writeBoolean(this.mIsTranslucent);
    }

    public TaskSnapshotNative(long j2, ComponentName componentName, GraphicBuffer graphicBuffer, ColorSpace colorSpace, int i, int i2, Point point, Rect rect, boolean z, boolean z2, int i3, int i4, boolean z3) {
        this.mId = j2;
        this.mTopActivityComponent = componentName;
        this.mSnapshot = graphicBuffer;
        this.mColorSpace = colorSpace.getId() < 0 ? ColorSpace.get(ColorSpace.Named.SRGB) : colorSpace;
        this.mOrientation = i;
        this.mRotation = i2;
        this.mTaskSize = new Point(point);
        this.mContentInsets = new Rect(rect);
        this.mIsLowResolution = z;
        this.mIsRealSnapshot = z2;
        this.mWindowingMode = i3;
        this.mSystemUiVisibility = i4;
        this.mIsTranslucent = z3;
    }

    private TaskSnapshotNative(Parcel parcel) {
        ColorSpace colorSpace;
        this.mId = parcel.readLong();
        this.mTopActivityComponent = ComponentName.readFromParcel(parcel);
        this.mSnapshot = parcel.readParcelable(null);
        int i = parcel.readInt();
        if (i >= 0 && i < ColorSpace.Named.values().length) {
            colorSpace = ColorSpace.get(ColorSpace.Named.values()[i]);
        } else {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        this.mColorSpace = colorSpace;
        this.mOrientation = parcel.readInt();
        this.mRotation = parcel.readInt();
        this.mTaskSize = (Point) parcel.readParcelable(null);
        this.mContentInsets = (Rect) parcel.readParcelable(null);
        this.mIsLowResolution = parcel.readBoolean();
        this.mIsRealSnapshot = parcel.readBoolean();
        this.mWindowingMode = parcel.readInt();
        this.mSystemUiVisibility = parcel.readInt();
        this.mIsTranslucent = parcel.readBoolean();
    }
}
