package com.oplus.onet.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.wpg;
import com.oplus.aiunit.vision.zqm;

/* JADX INFO: loaded from: classes8.dex */
public class DirectConnectOption implements Parcelable {
    public static final Parcelable.Creator<DirectConnectOption> CREATOR = new b();
    public static final String DIRECT_CONNECT_KEY_ADV_FREQ = "onet_direct_connect_key_adv_freq";
    public static final String DIRECT_CONNECT_KEY_DEVICE_ID = "onet_direct_connect_key_device_id";
    public static final String DIRECT_CONNECT_KEY_DEVICE_KSC = "onet_direct_connect_key_device_ksc";
    public static final String DIRECT_CONNECT_KEY_FLAG_KEEP_ALIVE = "onet_direct_connect_key_flag_keep_alive";
    public static final String DIRECT_CONNECT_KEY_KSC_ALIAS = "onet_direct_connect_key_ksc_alias";
    public static final String DIRECT_CONNECT_KEY_MAC_ADDR = "onet_direct_connect_key_mac_addr";
    public static final String DIRECT_CONNECT_KEY_NAME = "onet_direct_connect_key_device_name";
    public static final String DIRECT_CONNECT_KEY_PASSWORD = "onet_direct_connect_key_device_password";
    public static final String DIRECT_CONNECT_KEY_REMOTE_IP = "onet_direct_connect_key_remote_ip";
    public static final String DIRECT_CONNECT_KEY_SSID = "onet_direct_connect_key_ssid";
    public static final String DIRECT_CONNECT_KEY_TAG = "onet_direct_connect_key_tag";
    public static final String TAG = "ONetDevice";
    private final String mAdvFreq;
    private final String mDeviceId;
    private final String mDeviceKsc;
    private final boolean mFlagKeepAlive;
    private final String mKscAlias;
    private final String mMacAddress;
    private final String mName;
    private final String mPassWord;
    private final String mRemoteIp;
    private final String mSsid;
    private final String mTag;

    public static final class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20041c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20042e;
        public String f;
        public String g;
        public String h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f20043j;
        public boolean k;

        public final DirectConnectOption a() {
            return new DirectConnectOption(this);
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.h;
        }

        public String d() {
            return this.f;
        }

        public String e() {
            return this.g;
        }

        public String f() {
            return this.a;
        }

        public String g() {
            return this.i;
        }

        public String h() {
            return this.f20043j;
        }

        public String i() {
            return this.f20041c;
        }

        public String j() {
            return this.d;
        }

        public String k() {
            return this.f20042e;
        }

        public boolean l() {
            return this.k;
        }

        public a m(String str) {
            this.b = str;
            return this;
        }

        public a n(String str) {
            this.f = str;
            return this;
        }

        public a o(String str) {
            this.h = str;
            return this;
        }

        public a p(boolean z) {
            this.k = z;
            return this;
        }

        public a q(String str) {
            this.g = str;
            return this;
        }

        public a r(String str) {
            this.a = str;
            return this;
        }

        public a s(String str) {
            this.i = str;
            return this;
        }

        public a t(String str) {
            this.f20043j = str;
            return this;
        }

        public a u(String str) {
            this.f20041c = str;
            return this;
        }

        public a v(String str) {
            this.d = str;
            return this;
        }

        public a w(String str) {
            this.f20042e = str;
            return this;
        }
    }

    public class b implements Parcelable.Creator<DirectConnectOption> {
        @Override // android.os.Parcelable.Creator
        public final DirectConnectOption createFromParcel(Parcel parcel) {
            return new DirectConnectOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DirectConnectOption[] newArray(int i) {
            return new DirectConnectOption[i];
        }
    }

    public DirectConnectOption(a aVar) {
        this.mMacAddress = aVar.f();
        this.mAdvFreq = aVar.b();
        this.mRemoteIp = aVar.i();
        this.mSsid = aVar.j();
        this.mTag = aVar.k();
        this.mDeviceId = aVar.d();
        this.mKscAlias = aVar.e();
        this.mDeviceKsc = aVar.c();
        this.mName = aVar.g();
        this.mPassWord = aVar.h();
        this.mFlagKeepAlive = aVar.l();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdvFreq() {
        return this.mAdvFreq;
    }

    public String getDeviceKsc() {
        return this.mDeviceKsc;
    }

    public String getDvd() {
        return this.mDeviceId;
    }

    public String getKscAlias() {
        return this.mKscAlias;
    }

    public String getMacAddress() {
        return this.mMacAddress;
    }

    public String getName() {
        return this.mName;
    }

    public String getPassWord() {
        return this.mPassWord;
    }

    public String getRemoteIp() {
        return this.mRemoteIp;
    }

    public String getSsid() {
        return this.mSsid;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isFlagKeepAlive() {
        return this.mFlagKeepAlive;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("DirectConnectOption{mMcAddress='");
        sbA.append(wpg.e(this.mMacAddress));
        sbA.append('\'');
        sbA.append(", mAdvFreq='");
        sbA.append(this.mAdvFreq);
        sbA.append('\'');
        sbA.append(", mRemoteIp='");
        sbA.append(wpg.e(this.mRemoteIp));
        sbA.append('\'');
        sbA.append(", mSsd='");
        sbA.append(this.mSsid);
        sbA.append('\'');
        sbA.append(", mTag='");
        sbA.append(wpg.e(this.mTag));
        sbA.append('\'');
        sbA.append(", mDvd='");
        sbA.append(wpg.e(this.mDeviceId));
        sbA.append('\'');
        sbA.append(", mKscAlias='");
        sbA.append(wpg.e(this.mKscAlias));
        sbA.append('\'');
        sbA.append(", mDeviceKsc='");
        sbA.append(wpg.e(this.mDeviceKsc));
        sbA.append('\'');
        sbA.append(", mName='");
        sbA.append(this.mName);
        sbA.append('\'');
        sbA.append(", mPSW='");
        sbA.append(wpg.e(this.mPassWord));
        sbA.append('\'');
        sbA.append(", mFlagKeepAlive='");
        sbA.append(this.mFlagKeepAlive);
        sbA.append('\'');
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMacAddress);
        parcel.writeString(this.mAdvFreq);
        parcel.writeString(this.mRemoteIp);
        parcel.writeString(this.mSsid);
        parcel.writeString(this.mTag);
        parcel.writeString(this.mDeviceId);
        parcel.writeString(this.mKscAlias);
        parcel.writeString(this.mDeviceKsc);
        parcel.writeString(this.mName);
        parcel.writeString(this.mPassWord);
        parcel.writeByte(this.mFlagKeepAlive ? (byte) 1 : (byte) 0);
    }

    public DirectConnectOption(Parcel parcel) {
        this.mMacAddress = parcel.readString();
        this.mAdvFreq = parcel.readString();
        this.mRemoteIp = parcel.readString();
        this.mSsid = parcel.readString();
        this.mTag = parcel.readString();
        this.mDeviceId = parcel.readString();
        this.mKscAlias = parcel.readString();
        this.mDeviceKsc = parcel.readString();
        this.mName = parcel.readString();
        this.mPassWord = parcel.readString();
        this.mFlagKeepAlive = parcel.readByte() != 0;
    }
}
