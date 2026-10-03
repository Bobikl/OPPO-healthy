package org.iccoa.android.digitalkey;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes11.dex */
public class DigitalKeyData implements Parcelable {
    public static final Parcelable.Creator<DigitalKeyData> CREATOR = new a();
    public static final int KEY_TYPE_OTHER = 3;
    public static final int KEY_TYPE_OWNER = 1;
    public static final int KEY_TYPE_SHARED = 2;
    public static final int STATUS_ACTIVATED = 3;
    public static final int STATUS_INACTIVE = 2;
    public static final int STATUS_SUSPENDED = 4;
    public static final int STATUS_TERMINATED = 5;
    private final LocalDateTime endDate;
    private final String friendlyName;
    private final String imageUrl;
    private final byte[] keyId;
    private final String keyPrivilege;
    private final int keyType;
    private final LocalDateTime startDate;
    private final int status;
    private final String vehicleBrandId;
    private final byte[] vehicleId;
    private final String vehicleModel;
    private final byte[] vehicleOemId;

    public class a implements Parcelable.Creator<DigitalKeyData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DigitalKeyData createFromParcel(Parcel parcel) {
            return new DigitalKeyData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DigitalKeyData[] newArray(int i) {
            return new DigitalKeyData[i];
        }
    }

    public DigitalKeyData(Parcel parcel) {
        this.vehicleId = parcel.createByteArray();
        this.keyId = parcel.createByteArray();
        this.friendlyName = parcel.readString();
        this.startDate = readLocalDateTime(parcel);
        this.endDate = readLocalDateTime(parcel);
        this.keyPrivilege = parcel.readString();
        this.keyType = parcel.readInt();
        this.status = parcel.readInt();
        this.vehicleOemId = parcel.createByteArray();
        this.vehicleModel = parcel.readString();
        this.vehicleBrandId = parcel.readString();
        this.imageUrl = parcel.readString();
    }

    private static LocalDateTime readLocalDateTime(Parcel parcel) {
        return Build.VERSION.SDK_INT >= 33 ? (LocalDateTime) parcel.readSerializable(parcel.getClass().getClassLoader(), LocalDateTime.class) : (LocalDateTime) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocalDateTime getEndDate() {
        return this.endDate;
    }

    public String getFriendlyName() {
        return this.friendlyName;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public byte[] getKeyId() {
        return this.keyId;
    }

    public String getKeyPrivilege() {
        return this.keyPrivilege;
    }

    public int getKeyType() {
        return this.keyType;
    }

    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    public int getStatus() {
        return this.status;
    }

    public String getVehicleBrandId() {
        return this.vehicleBrandId;
    }

    public byte[] getVehicleId() {
        return this.vehicleId;
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public byte[] getVehicleOemId() {
        return this.vehicleOemId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.vehicleId);
        parcel.writeByteArray(this.keyId);
        parcel.writeString(this.friendlyName);
        parcel.writeSerializable(this.startDate);
        parcel.writeSerializable(this.endDate);
        parcel.writeString(this.keyPrivilege);
        parcel.writeInt(this.keyType);
        parcel.writeInt(this.status);
        parcel.writeByteArray(this.vehicleOemId);
        parcel.writeString(this.vehicleModel);
        parcel.writeString(this.vehicleBrandId);
        parcel.writeString(this.imageUrl);
    }

    public DigitalKeyData(byte[] bArr, byte[] bArr2, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str2, int i, int i2, byte[] bArr3, String str3, String str4, String str5) {
        this.vehicleId = bArr;
        this.keyId = bArr2;
        this.friendlyName = str;
        this.startDate = localDateTime;
        this.endDate = localDateTime2;
        this.keyPrivilege = str2;
        this.keyType = i;
        this.status = i2;
        this.vehicleOemId = bArr3;
        this.vehicleModel = str3;
        this.vehicleBrandId = str4;
        this.imageUrl = str5;
    }
}
