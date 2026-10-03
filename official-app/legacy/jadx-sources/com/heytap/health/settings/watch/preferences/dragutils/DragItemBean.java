package com.heytap.health.settings.watch.preferences.dragutils;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class DragItemBean implements Parcelable {
    public static final Parcelable.Creator<DragItemBean> CREATOR = new a();
    private boolean cancelable;
    private int id;
    private boolean isHided;
    private boolean isMoved;
    private String name;
    private int state;

    public class a implements Parcelable.Creator<DragItemBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DragItemBean createFromParcel(Parcel parcel) {
            return new DragItemBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DragItemBean[] newArray(int i) {
            return new DragItemBean[i];
        }
    }

    public DragItemBean() {
        this.cancelable = true;
        this.isMoved = true;
        this.isHided = false;
    }

    @NonNull
    public Object clone() {
        DragItemBean dragItemBean = new DragItemBean();
        dragItemBean.id = this.id;
        dragItemBean.name = this.name;
        dragItemBean.state = this.state;
        dragItemBean.cancelable = this.cancelable;
        dragItemBean.isMoved = this.isMoved;
        dragItemBean.isHided = this.isHided;
        return dragItemBean;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DragItemBean)) {
            return super.equals(obj);
        }
        DragItemBean dragItemBean = (DragItemBean) obj;
        return dragItemBean.id == this.id && TextUtils.equals(dragItemBean.name, this.name) && dragItemBean.state == this.state && dragItemBean.cancelable == this.cancelable && dragItemBean.isMoved == this.isMoved && dragItemBean.isHided == this.isHided;
    }

    public boolean getBooleanState() {
        return this.state == 1;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getState() {
        return this.state;
    }

    public boolean isCancelable() {
        return this.cancelable;
    }

    public boolean isHided() {
        return this.isHided;
    }

    public boolean isMoved() {
        return this.isMoved;
    }

    public void setBooleanState(boolean z) {
        this.state = z ? 1 : 2;
    }

    public void setCancelable(boolean z) {
        this.cancelable = z;
    }

    public void setHided(boolean z) {
        this.isHided = z;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setMoved(boolean z) {
        this.isMoved = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setState(int i) {
        this.state = i;
    }

    public String toString() {
        return "DragItemBean{id=" + this.id + ", name='" + this.name + "', state=" + this.state + ", cancelable=" + this.cancelable + ", isMoved=" + this.isMoved + ", isHided=" + this.isHided + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.state);
        parcel.writeBoolean(this.cancelable);
        parcel.writeBoolean(this.isMoved);
        parcel.writeBoolean(this.isHided);
    }

    public DragItemBean(Parcel parcel) {
        this.id = parcel.readInt();
        this.name = parcel.readString();
        this.state = parcel.readInt();
        this.cancelable = parcel.readBoolean();
        this.isMoved = parcel.readBoolean();
        this.isHided = parcel.readBoolean();
    }
}
