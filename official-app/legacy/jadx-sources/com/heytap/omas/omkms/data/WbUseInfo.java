package com.heytap.omas.omkms.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class WbUseInfo implements Parcelable {
    public static final Parcelable.Creator<WbUseInfo> CREATOR = new a();
    public static final int DECRYPT_MODE = 1;
    public static final int ENCRYPT_MODE = 0;
    private static final String TAG = "WbUseInfo";
    private byte[] appName;
    private int appNameLen;
    private volatile int decryptCount;
    private volatile int encryptCount;
    private byte[] wbId;
    private int wbIdLen;
    private byte[] wbKeyId;
    private int wbKeyIdLen;
    private int wbKeyTableVersion;

    public static class a implements Parcelable.Creator<WbUseInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WbUseInfo createFromParcel(Parcel parcel) {
            return new WbUseInfo(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WbUseInfo[] newArray(int i) {
            return new WbUseInfo[i];
        }
    }

    public static final class b {
        private byte[] a;
        private byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f7601c;
        private int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f7602e;
        private int f;

        private b() {
            this.d = 0;
            this.f7602e = 0;
        }

        public b a(int i) {
            this.f = i;
            return this;
        }

        public b b(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        public b c(byte[] bArr) {
            this.f7601c = bArr;
            return this;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public b a(byte[] bArr) {
            this.a = bArr;
            return this;
        }

        public WbUseInfo a() {
            return new WbUseInfo(this, (a) null);
        }
    }

    private WbUseInfo(Parcel parcel) {
        this.encryptCount = -1;
        this.decryptCount = -1;
        readFromParcel(parcel);
    }

    public static b newBuilder() {
        return new b(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getAppName() {
        return this.appName;
    }

    public long getDecryptCount() {
        return this.decryptCount;
    }

    public long getEncryptCount() {
        return this.encryptCount;
    }

    public byte[] getWbId() {
        return this.wbId;
    }

    public byte[] getWbKeyId() {
        return this.wbKeyId;
    }

    public void readFromParcel(Parcel parcel) {
        this.appNameLen = parcel.readInt();
        byte[] bArr = new byte[this.appNameLen];
        this.appName = bArr;
        parcel.readByteArray(bArr);
        this.wbIdLen = parcel.readInt();
        byte[] bArr2 = new byte[this.wbIdLen];
        this.wbId = bArr2;
        parcel.readByteArray(bArr2);
        this.wbKeyIdLen = parcel.readInt();
        byte[] bArr3 = new byte[this.wbKeyIdLen];
        this.wbKeyId = bArr3;
        parcel.readByteArray(bArr3);
        this.encryptCount = parcel.readInt();
        this.decryptCount = parcel.readInt();
        this.wbKeyTableVersion = parcel.readInt();
    }

    public WbUseInfo resetCount(h hVar) {
        String string;
        StringBuilder sb;
        String string2;
        if (this.appName == null || this.wbId == null || this.wbKeyId == null || this.encryptCount == -1 || this.decryptCount == -1) {
            string = "resetCount: not init yet? this always should not take place!";
        } else {
            if (Arrays.equals(this.appName, hVar.getAppName())) {
                if (!Arrays.equals(this.wbId, hVar.getWbId())) {
                    sb = new StringBuilder();
                    sb.append("resetCount: wbId auth fail,not match older,older'wbId=");
                    sb.append(Arrays.toString(this.wbId));
                    sb.append(",newer'wbId=");
                    string2 = Arrays.toString(hVar.getWbId());
                } else {
                    if (this.wbKeyTableVersion == hVar.getWbVersion()) {
                        this.encryptCount = 0;
                        this.decryptCount = 0;
                        toString();
                        return this;
                    }
                    sb = new StringBuilder();
                    sb.append("resetCount: wbKeyTableVersion auth fail,not match older,older'wbKeyTableVersion=");
                    sb.append(this.wbKeyTableVersion);
                    sb.append("newer'wbKeyTableVersion=");
                    sb.append(hVar.getWbVersion());
                }
                string = sb.toString();
            } else {
                sb = new StringBuilder();
                sb.append("resetCount: appName auth fail,not match older,older'appName=");
                sb.append(Arrays.toString(this.appName));
                sb.append(",newer'appName=");
                string2 = Arrays.toString(hVar.getAppName());
            }
            sb.append(string2);
            string = sb.toString();
        }
        com.heytap.omas.a.e.i.c(TAG, string);
        return null;
    }

    public String toString() {
        return "WbUseInfo{appNameLen=" + this.appNameLen + ", appName=" + new String(this.appName) + ", wbIdLen=" + this.wbIdLen + ", wbId=" + new String(this.wbId) + ", wbKeyIdLen=" + this.wbKeyIdLen + ", wbKeyId=" + new String(this.wbKeyId) + ", encryptCount=" + this.encryptCount + ", decryptCount=" + this.decryptCount + ", wbKeyTableVersion=" + this.wbKeyTableVersion + '}';
    }

    public WbUseInfo updateCount(h hVar, int i) {
        String string;
        StringBuilder sb;
        String str;
        if (this.appName == null || this.wbId == null || this.wbKeyId == null || this.encryptCount == -1 || this.decryptCount == -1) {
            string = "updateCount: not init yet? this always should not take place!";
        } else {
            if (!Arrays.equals(this.appName, hVar.getAppName())) {
                sb = new StringBuilder();
                sb.append("updateCount: appName auth fail,not match older,older'appName=");
                sb.append(new String(this.appName));
                sb.append(",newer'appName=");
                str = new String(hVar.getAppName());
            } else if (Arrays.equals(this.wbId, hVar.getWbId())) {
                if (!Arrays.equals(this.wbKeyId, hVar.getWbKeyId())) {
                    sb = new StringBuilder();
                    sb.append("updateCount: wbKeyId auth fail,not match older,older'wbKeyId=");
                    sb.append(new String(this.wbKeyId));
                    sb.append(",newer'wbKeyId=");
                    str = new String(hVar.getWbKeyId());
                } else {
                    if (this.wbKeyTableVersion == hVar.getWbVersion()) {
                        if (i == 0) {
                            this.encryptCount++;
                        } else if (i != 1) {
                            com.heytap.omas.a.e.i.c(TAG, "updateCount,This always should not take place,Unexpected mode value: " + i);
                        } else {
                            this.decryptCount++;
                        }
                        return this;
                    }
                    sb = new StringBuilder();
                    sb.append("updateCount: wbKeyTableVersion auth fail,not match older,older'wbKeyTableVersion:");
                    sb.append(this.wbKeyTableVersion);
                    sb.append(",newer'wbKeyTableVersion:");
                    sb.append(hVar.getWbVersion());
                }
                string = sb.toString();
            } else {
                sb = new StringBuilder();
                sb.append("updateCount: wbId auth fail,not match older,older'wbId=");
                sb.append(new String(this.wbId));
                sb.append(",newer'wbId=");
                str = new String(hVar.getWbId());
            }
            sb.append(str);
            string = sb.toString();
        }
        com.heytap.omas.a.e.i.c(TAG, string);
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.appNameLen);
        parcel.writeByteArray(this.appName);
        parcel.writeInt(this.wbIdLen);
        parcel.writeByteArray(this.wbId);
        parcel.writeInt(this.wbKeyIdLen);
        parcel.writeByteArray(this.wbKeyId);
        parcel.writeInt(this.encryptCount);
        parcel.writeInt(this.decryptCount);
        parcel.writeInt(this.wbKeyTableVersion);
    }

    public /* synthetic */ WbUseInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    private WbUseInfo(b bVar) {
        this.encryptCount = -1;
        this.decryptCount = -1;
        byte[] bArr = bVar.a;
        this.appName = bArr;
        this.appNameLen = bArr.length;
        byte[] bArr2 = bVar.b;
        this.wbId = bArr2;
        this.wbIdLen = bArr2.length;
        byte[] bArr3 = bVar.f7601c;
        this.wbKeyId = bArr3;
        this.wbKeyIdLen = bArr3.length;
        this.encryptCount = bVar.d;
        this.decryptCount = bVar.f7602e;
        this.wbKeyTableVersion = bVar.f;
    }

    public /* synthetic */ WbUseInfo(b bVar, a aVar) {
        this(bVar);
    }
}
