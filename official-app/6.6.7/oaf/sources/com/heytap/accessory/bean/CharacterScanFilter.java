package com.heytap.accessory.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.accessory.discovery.IScanFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CharacterScanFilter implements IScanFilter {
    public static final Parcelable.Creator<CharacterScanFilter> CREATOR = new Parcelable.Creator<CharacterScanFilter>() { // from class: com.heytap.accessory.bean.CharacterScanFilter.1
        @Override // android.os.Parcelable.Creator
        public CharacterScanFilter createFromParcel(Parcel parcel) {
            return new CharacterScanFilter(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CharacterScanFilter[] newArray(int i) {
            return new CharacterScanFilter[i];
        }
    };
    public static final String KEY = "CharaScanFilter";
    private static final int LIMITED_DEVICEID_LENGTH = 6;
    private Set<byte[]> mDeviceIdSet = new HashSet();

    private CharacterScanFilter() {
    }

    public static CharacterScanFilter create() {
        return new CharacterScanFilter();
    }

    public CharacterScanFilter addDeviceId(byte[] bArr) {
        if (bArr == null || bArr.length != 6) {
            throw new IllegalArgumentException("device id invalid (length must be 6 byte)");
        }
        this.mDeviceIdSet.add(bArr);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Set<byte[]> getDeviceIdSet() {
        return this.mDeviceIdSet;
    }

    @Override // com.heytap.accessory.discovery.IScanFilter
    public String getKey() {
        return KEY;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mDeviceIdSet.size());
        Iterator<byte[]> it = this.mDeviceIdSet.iterator();
        while (it.hasNext()) {
            parcel.writeByteArray(it.next());
        }
    }

    public CharacterScanFilter(Parcel parcel) {
        int i = parcel.readInt();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                this.mDeviceIdSet.add(parcel.createByteArray());
            }
        }
    }
}
