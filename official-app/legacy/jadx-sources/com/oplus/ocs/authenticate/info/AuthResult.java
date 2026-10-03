package com.oplus.ocs.authenticate.info;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new a();
    public int a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19983c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19984e;

    public static class a implements Parcelable.Creator<AuthResult> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AuthResult createFromParcel(Parcel parcel) {
            return new AuthResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AuthResult[] newArray(int i) {
            return new AuthResult[i];
        }
    }

    public AuthResult(String str, int i, int i2, byte[] bArr) {
        this.f19983c = str;
        this.d = i;
        this.f19984e = 0;
        this.a = i2;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19983c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f19984e);
        parcel.writeInt(this.a);
        parcel.writeByteArray(this.b);
    }

    public AuthResult(Parcel parcel) {
        this.f19983c = parcel.readString();
        this.d = parcel.readInt();
        this.f19984e = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.createByteArray();
    }
}
