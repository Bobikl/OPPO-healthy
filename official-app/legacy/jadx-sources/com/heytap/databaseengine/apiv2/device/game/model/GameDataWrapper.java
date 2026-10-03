package com.heytap.databaseengine.apiv2.device.game.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class GameDataWrapper implements Parcelable {
    public static final Parcelable.Creator<GameDataWrapper> CREATOR = new a();
    private int countDown;
    private int killType;

    public class a implements Parcelable.Creator<GameDataWrapper> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameDataWrapper createFromParcel(Parcel parcel) {
            return new GameDataWrapper(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameDataWrapper[] newArray(int i) {
            return new GameDataWrapper[i];
        }
    }

    public GameDataWrapper() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCountDown() {
        return this.countDown;
    }

    public int getKillType() {
        return this.killType;
    }

    public void setCountDown(int i) {
        this.countDown = i;
    }

    public void setKillType(int i) {
        this.killType = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.killType);
        parcel.writeInt(this.countDown);
    }

    public GameDataWrapper(Parcel parcel) {
        this.killType = parcel.readInt();
        this.countDown = parcel.readInt();
    }
}
