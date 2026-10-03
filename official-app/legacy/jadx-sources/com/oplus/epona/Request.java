package com.oplus.epona;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.ep6;
import com.oplus.aiunit.vision.h3e;
import com.oplus.aiunit.vision.uyf;

/* JADX INFO: loaded from: classes2.dex */
public class Request implements Parcelable {
    private static final String CALLER_PACKAGE_NAME = "com.oplus.appplatform.CALLING_PACKAGE_NAME_KEY";
    public static final Parcelable.Creator<Request> CREATOR = new a();
    private final String mActionName;
    private final Bundle mBundle;
    private String mCallerPackageName;
    private final String mComponentName;
    private uyf mRouteData;

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
        public final Bundle f19882c = new Bundle();

        public Request a() {
            return new Request(this.a, this.b, this.f19882c, null, null);
        }

        public b b(String str) {
            this.b = str;
            return this;
        }

        public b c(String str) {
            this.a = str;
            return this;
        }

        public b d(String str, int i) {
            this.f19882c.putInt(str, i);
            return this;
        }

        public b e(String str, long j2) {
            this.f19882c.putLong(str, j2);
            return this;
        }

        public b f(String str, Parcelable parcelable) {
            this.f19882c.putParcelable(str, parcelable);
            return this;
        }

        public b g(String str, String str2) {
            this.f19882c.putString(str, str2);
            return this;
        }
    }

    public /* synthetic */ Request(Parcel parcel, a aVar) {
        this(parcel);
    }

    private boolean checkCallerPackageNameEmpty() {
        return TextUtils.isEmpty(this.mCallerPackageName);
    }

    private void setCallerPackageName() {
        String packageName = ep6.g() == null ? "" : ep6.g().getPackageName();
        this.mCallerPackageName = packageName;
        this.mBundle.putString(CALLER_PACKAGE_NAME, packageName);
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

    public String getCallerPackageName() {
        if (checkCallerPackageNameEmpty()) {
            Bundle bundle = this.mBundle;
            if (bundle != null) {
                this.mCallerPackageName = bundle.getString(CALLER_PACKAGE_NAME);
            }
            if (checkCallerPackageNameEmpty()) {
                this.mCallerPackageName = h3e.b(Binder.getCallingUid(), Binder.getCallingPid());
            }
        }
        return this.mCallerPackageName;
    }

    public String getComponentName() {
        return this.mComponentName;
    }

    public uyf getRouteData() {
        return null;
    }

    public String toFullString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<QUERY> Calling package : [" + getCallerPackageName() + "]");
        sb.append("Component=");
        sb.append(this.mComponentName);
        sb.append(",Action=");
        sb.append(this.mActionName);
        for (String str : this.mBundle.keySet()) {
            sb.append(",key：");
            sb.append(str);
            sb.append(",value:");
            sb.append(this.mBundle.get(str));
        }
        return sb.toString();
    }

    @NonNull
    public String toString() {
        return "CallerPackage:" + getCallerPackageName() + " ,componentName:" + this.mComponentName + " ,actionName:" + this.mActionName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mComponentName);
        parcel.writeString(this.mActionName);
        parcel.writeBundle(this.mBundle);
    }

    public /* synthetic */ Request(String str, String str2, Bundle bundle, uyf uyfVar, a aVar) {
        this(str, str2, bundle, uyfVar);
    }

    private Request(String str, String str2, Bundle bundle, uyf uyfVar) {
        this.mComponentName = str;
        this.mActionName = str2;
        this.mBundle = bundle;
        setCallerPackageName();
    }

    private Request(Parcel parcel) {
        this.mComponentName = parcel.readString();
        this.mActionName = parcel.readString();
        this.mBundle = parcel.readBundle(getClass().getClassLoader());
    }
}
