package com.heytap.epona;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public class Request implements Parcelable {
    public static final Parcelable.Creator<Request> CREATOR = new a();
    private final String mActionName;
    private Bundle mBundle;
    private final String mComponentName;

    public class a implements Parcelable.Creator<Request> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Request createFromParcel(Parcel parcel) {
            return new Request(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Request[] newArray(int i) {
            return new Request[i];
        }
    }

    public static class b {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bundle f3045c = new Bundle();

        public Request a() {
            return new Request(this.a, this.b, this.f3045c, null);
        }

        public b b(String str) {
            this.b = str;
            return this;
        }

        public b c(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ Request(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getActionName() {
        return this.mActionName;
    }

    public Bundle getBundle() {
        return this.mBundle;
    }

    public String getComponentName() {
        return this.mComponentName;
    }

    public void putBundle(Bundle bundle) {
        this.mBundle.putAll(bundle);
    }

    @NonNull
    public String toString() {
        return "Request{Component=" + this.mComponentName + ",Action=" + this.mActionName + ",Bundle=" + this.mBundle + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mComponentName);
        parcel.writeString(this.mActionName);
        parcel.writeBundle(this.mBundle);
    }

    public /* synthetic */ Request(String str, String str2, Bundle bundle, a aVar) {
        this(str, str2, bundle);
    }

    private Request(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.mBundle = bundle2;
        this.mComponentName = str;
        this.mActionName = str2;
        bundle2.putAll(bundle);
    }

    private Request(Parcel parcel) {
        this.mBundle = new Bundle();
        this.mComponentName = parcel.readString();
        this.mActionName = parcel.readString();
        this.mBundle = parcel.readBundle(getClass().getClassLoader());
    }
}
