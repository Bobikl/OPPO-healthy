package com.google.android.clockwork.companion.partnerapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class AppNotificationConfig implements Parcelable {
    static final Parcelable.Creator<AppNotificationConfig> CREATOR = new Parcelable.Creator<AppNotificationConfig>() { // from class: com.google.android.clockwork.companion.partnerapi.AppNotificationConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppNotificationConfig createFromParcel(Parcel parcel) {
            return AppNotificationConfig.newBuilder().setPackageName(parcel.readString()).setAppName(parcel.readString()).setCanChangeMuteSetting(parcel.readInt() == 1).setNotificationStatus(parcel.readInt()).build();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppNotificationConfig[] newArray(int i) {
            return new AppNotificationConfig[i];
        }
    };

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AppNotificationConfig build();

        public abstract Builder setAppName(String str);

        public abstract Builder setCanChangeMuteSetting(boolean z);

        public abstract Builder setNotificationStatus(@AppNotificationStatus int i);

        public abstract Builder setPackageName(String str);
    }

    public static Builder newBuilder() {
        return new AutoValue_AppNotificationConfig.Builder().setCanChangeMuteSetting(false).setAppName("");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getAppName();

    public abstract boolean getCanChangeMuteSetting();

    @AppNotificationStatus
    public abstract int getNotificationStatus();

    public abstract String getPackageName();

    public abstract Builder toBuilder();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPackageName());
        parcel.writeString(getAppName());
        parcel.writeInt(getCanChangeMuteSetting() ? 1 : 0);
        parcel.writeInt(getNotificationStatus());
    }
}
