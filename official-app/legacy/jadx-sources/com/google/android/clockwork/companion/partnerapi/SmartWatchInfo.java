package com.google.android.clockwork.companion.partnerapi;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class SmartWatchInfo implements Parcelable {
    public static final Parcelable.Creator<SmartWatchInfo> CREATOR = new Parcelable.Creator<SmartWatchInfo>() { // from class: com.google.android.clockwork.companion.partnerapi.SmartWatchInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmartWatchInfo createFromParcel(Parcel parcel) {
            return SmartWatchInfo.builder().setBluetoothDevice((BluetoothDevice) parcel.readParcelable(BluetoothDevice.class.getClassLoader())).setRssiValue(parcel.readInt()).setDeviceModelImageResId(parcel.readInt()).setTimeStampMs(parcel.readLong()).build();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmartWatchInfo[] newArray(int i) {
            return new SmartWatchInfo[i];
        }
    };

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract SmartWatchInfo build();

        public abstract Builder setBluetoothDevice(BluetoothDevice bluetoothDevice);

        public abstract Builder setDeviceModelImageResId(@DrawableRes int i);

        public abstract Builder setRssiValue(int i);

        public abstract Builder setTimeStampMs(long j2);
    }

    public static Builder builder() {
        return new AutoValue_SmartWatchInfo.Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract BluetoothDevice getBluetoothDevice();

    @DrawableRes
    public abstract int getDeviceModelImageResId();

    public abstract int getRssiValue();

    public abstract long getTimeStampMs();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getBluetoothDevice(), i);
        parcel.writeInt(getRssiValue());
        parcel.writeInt(getDeviceModelImageResId());
        parcel.writeLong(getTimeStampMs());
    }
}
