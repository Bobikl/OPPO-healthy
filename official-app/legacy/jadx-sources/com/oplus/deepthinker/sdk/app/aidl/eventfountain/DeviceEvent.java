package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.g5g;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceEvent implements Parcelable {
    public static final Parcelable.Creator<DeviceEvent> CREATOR = new Parcelable.Creator<DeviceEvent>() { // from class: com.oplus.deepthinker.sdk.app.aidl.eventfountain.DeviceEvent.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceEvent createFromParcel(Parcel parcel) {
            return new DeviceEvent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DeviceEvent[] newArray(int i) {
            return new DeviceEvent[i];
        }
    };
    private static final String TAG = "DeviceEvent";
    private int mEventStateType;
    private int mEventType;

    public static class Builder {
        private int mEventType = -1;
        private int mEventStateType = -1;

        public DeviceEvent build() {
            if (this.mEventType == -1) {
                g5g.c(DeviceEvent.TAG, "EventType not yet configured.");
            } else if (this.mEventStateType == -1) {
                g5g.h(DeviceEvent.TAG, "use default state type.");
                this.mEventStateType = 0;
            }
            return new DeviceEvent(this.mEventType, this.mEventStateType);
        }

        public Builder setEventStateType(int i) {
            if (i != 0 && i != 1) {
                g5g.c(DeviceEvent.TAG, "Invalid stateType.");
            }
            this.mEventStateType = i;
            return this;
        }

        public Builder setEventType(int i) {
            this.mEventType = i;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceEvent)) {
            return false;
        }
        DeviceEvent deviceEvent = (DeviceEvent) obj;
        return this.mEventType == deviceEvent.getEventType() && this.mEventStateType == deviceEvent.getEventStateType();
    }

    public int getEventStateType() {
        return this.mEventStateType;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mEventType), Integer.valueOf(this.mEventStateType)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mEventType);
        parcel.writeInt(this.mEventStateType);
    }

    private DeviceEvent(int i, int i2) {
        this.mEventType = i;
        this.mEventStateType = i2;
    }

    public DeviceEvent(Parcel parcel) {
        this.mEventType = parcel.readInt();
        this.mEventStateType = parcel.readInt();
    }
}
