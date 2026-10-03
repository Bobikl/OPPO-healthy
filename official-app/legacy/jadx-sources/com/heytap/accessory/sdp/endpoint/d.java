package com.heytap.accessory.sdp.endpoint;

import android.os.Build;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f2636c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f2637e;
    public byte f;
    public String g;
    public String h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f2638j;
    public List<Integer> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2639l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2640n;
    public int o;
    public int p;
    public byte q;
    public byte r;
    public int s;
    public byte t;
    public String u;

    public static class a {
        public String a;
        public int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public d() {
        this.d = -1;
        this.k = null;
        this.o = 0;
        this.t = (byte) 0;
        this.u = ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS;
    }

    public void a(String str) {
        if (str != null) {
            this.g = str.replace(";", ":");
        }
    }

    public void b(byte b) {
        com.heytap.accessory.base.logging.a.a("EndpointInfoParams", "setDevCategory: " + ((int) b));
        this.f2637e = b;
    }

    public void c(byte b) {
        this.f2638j = b;
    }

    public void d(int i) {
        this.f2640n = i;
    }

    public void e(String str) {
        this.h = str;
    }

    public void f(int i) {
        this.b = i;
    }

    public int g() {
        return this.i;
    }

    public void h(int i) {
        this.s = i;
    }

    public List<Integer> i() {
        return this.k;
    }

    public String j() {
        return this.f2639l;
    }

    public String k() {
        return this.m;
    }

    public int l() {
        return this.f2640n;
    }

    public int m() {
        return this.p;
    }

    public int n() {
        return this.b;
    }

    public int o() {
        return this.o;
    }

    public byte p() {
        return this.q;
    }

    public byte q() {
        return this.r;
    }

    public int r() {
        return this.s;
    }

    public String s() {
        return this.h;
    }

    public String toString() {
        return "EndpointInfoParams{mApduSize=" + this.a + ", mClMode=" + ((int) this.f2636c) + ", mCompressionBit=" + this.d + ", mDevCategory=" + ((int) this.f2637e) + ", mErrorCode=" + ((int) this.f) + ", mFriendlyName='" + this.g + "', mVendorId='" + this.h + "', mMaxSessions=" + this.i + ", mMessageType=" + ((int) this.f2638j) + ", mNegotiableParams=" + this.k + ", mPeerId='" + this.f2639l + "', mProductId='" + this.m + "', mProtocolVersion=" + this.f2640n + ", mServiceProfileCount=" + this.o + ", mSlTimeout=" + this.p + ", mSsduSize=" + this.b + ", mStatus=" + ((int) this.q) + ", mTlMode=" + ((int) this.r) + ", mTlWindowSize=" + this.s + ", mNegotiableConnectionMode=" + ((int) this.t) + ", mWifiAddress=" + SensitiveLogUtils.toHiddenIfNeed(this.u) + '}';
    }

    public void a(int i) {
        this.a = i;
    }

    public void c(String str) {
        this.f2639l = str;
    }

    public void d(String str) {
        this.m = str;
    }

    public String e() {
        String str = this.g;
        return str == null ? "" : str;
    }

    public void f(byte b) {
        this.r = b;
    }

    public void g(int i) {
        this.o = i;
    }

    public byte h() {
        return this.t;
    }

    public int a() {
        return this.a;
    }

    public byte b() {
        return this.f2636c;
    }

    public void c(int i) {
        this.i = i;
    }

    public byte d() {
        com.heytap.accessory.base.logging.a.a("EndpointInfoParams", "getDevCategory: " + ((int) this.f2637e));
        return this.f2637e;
    }

    public void e(int i) {
        this.p = i;
    }

    public String f() {
        return this.u;
    }

    public void a(byte b) {
        this.f2636c = b;
    }

    public void b(int i) {
        this.d = i;
    }

    public int c() {
        return this.d;
    }

    public void e(byte b) {
        this.q = b;
    }

    public void a(List<Integer> list) {
        this.k = list;
    }

    public void b(String str) {
        this.u = str;
    }

    public void d(byte b) {
        this.t = b;
    }

    public d(int i) {
        this.d = -1;
        this.k = null;
        this.o = 0;
        this.t = (byte) 0;
        String str = ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS;
        this.u = ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS;
        d(1);
        c(PlatformUtils.getMyUniqueId());
        a(i == 1 ? (byte) 0 : (byte) 1);
        f((byte) 2);
        a(f.a(i));
        f(f.b(i));
        c(1022);
        e(10000);
        h(10);
        d(Build.MODEL);
        e(Build.MANUFACTURER);
        a(b.a());
        b(1);
        b(PlatformUtils.getDevCategory());
        g(com.heytap.accessory.sdp.service.b.g().h());
        d(i == 4 ? (byte) 0 : (byte) 1);
        b(i == 1 ? i.b() : str);
        ArrayList arrayList = new ArrayList();
        for (int i2 : com.heytap.accessory.misc.config.a.a) {
            arrayList.add(Integer.valueOf(i2));
        }
        for (int i3 : com.heytap.accessory.misc.config.a.b) {
            arrayList.add(Integer.valueOf(i3));
        }
        for (int i4 : com.heytap.accessory.misc.config.a.f2604c) {
            arrayList.add(Integer.valueOf(i4));
        }
        Collections.sort(arrayList);
        if (i != 1) {
            arrayList.remove((Object) 14);
        }
        a(arrayList);
    }
}
