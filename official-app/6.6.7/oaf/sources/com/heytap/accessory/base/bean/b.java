package com.heytap.accessory.base.bean;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.sdp.service.protocol.ServiceDiscoveryUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String L = "b";
    public int A;
    public boolean B;
    public int C;
    public byte D;
    public int E;
    public String F;
    public int G;
    public byte H;
    public String I;
    public int J;
    public byte[] K;
    public boolean a;
    public int b;
    public String c;
    public boolean d;
    public byte e;
    public byte f;
    public boolean g;
    public int h;
    public int i;
    public byte j;
    public int k;
    public String l;
    public long m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public String r;
    public List<String> s;
    public String t;
    public String u;
    public int v;
    public boolean w;
    public List<FrameworkServiceDescription> x;
    public int y;
    public ConcurrentHashMap<Integer, Object> z;

    public b(String str, int i) {
        this(str, i, 0);
    }

    public int A() {
        return this.A;
    }

    public int B() {
        return this.C;
    }

    public byte C() {
        return this.D;
    }

    public int D() {
        return this.E;
    }

    @Deprecated
    public int E() {
        return 1;
    }

    public int F() {
        return this.J;
    }

    public String G() {
        return this.F;
    }

    public int H() {
        return this.G;
    }

    public boolean I() {
        return this.n;
    }

    public boolean J() {
        return this.d;
    }

    public boolean K() {
        return this.a;
    }

    public boolean L() {
        return this.g;
    }

    public boolean M() {
        return this.B;
    }

    public boolean N() {
        return this.o;
    }

    public boolean O() {
        return this.w;
    }

    public synchronized void P() {
        this.s = new ArrayList();
    }

    public void Q() {
        this.a = true;
    }

    public int a(int i) {
        return i;
    }

    public int b(int i) {
        return i;
    }

    public void c(String str) {
        this.c = str;
    }

    public void d(boolean z) {
        this.B = z;
    }

    public void e(String str) {
    }

    public boolean equals(Object obj) {
        if ((obj instanceof b) && this.l != null && this.c != null) {
            b bVar = (b) obj;
            if (this.m == bVar.l() && this.A == bVar.A() && this.h == bVar.u() && this.i == bVar.h() && this.l.equals(bVar.k()) && this.c.equals(bVar.d()) && this.J == bVar.F()) {
                return b(bVar.x());
            }
        }
        return false;
    }

    public void f(int i) {
        this.i = i;
    }

    public void g(String str) {
        this.r = str;
    }

    public int h() {
        return this.i;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public void i(int i) {
        this.v = i;
    }

    public void j(String str) {
        this.u = str;
    }

    public void k(String str) {
        this.F = str;
    }

    public long l() {
        return this.m;
    }

    public void m(int i) {
        this.C = i;
    }

    public void n(int i) {
        this.E = i;
    }

    public byte o() {
        return this.H;
    }

    public void p(int i) {
        com.heytap.accessory.base.logging.a.d("FrameworkAccessory", "Setting peer version : " + i + " accessoryId : " + this.m);
        this.G = i;
    }

    public synchronized List<String> q() {
        return new ArrayList(this.s);
    }

    public String r() {
        return this.t;
    }

    public String s() {
        return this.u;
    }

    public byte[] t() {
        return this.K;
    }

    public String toString() {
        return "Accessory ID: " + this.m + "; FriendlyName: = " + this.l + "; ServiceRecords = " + this.x.toString() + "; Role = " + this.h + "; ConnectivityFlags = " + this.i + "; state: = " + this.A + "; VendorId =:" + this.F + "; ProductId =:" + this.u + "; peerId =:" + this.r + "; UUID =:" + this.J;
    }

    public int u() {
        return this.h;
    }

    public int v() {
        return this.v;
    }

    public int w() {
        return this.p;
    }

    public List<FrameworkServiceDescription> x() {
        return this.x == null ? new ArrayList() : new ArrayList(this.x);
    }

    public int y() {
        return this.y;
    }

    public Object z() {
        return c(1);
    }

    public b(String str, int i, int i2) {
        this.z = new ConcurrentHashMap<>();
        this.I = ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS;
        this.m = -1L;
        this.t = "";
        this.x = new CopyOnWriteArrayList();
        this.s = new ArrayList();
        this.a = false;
        this.o = false;
        this.n = false;
        this.i = i;
        this.c = str;
        this.A = 0;
        this.k = 100;
        this.G = 1;
        this.J = i2;
    }

    public static b a(String str, int i, int i2) {
        if (i == 2) {
            return new com.heytap.accessory.connectivity.bt.a(str, i2);
        }
        if (i == 1) {
            return new com.heytap.accessory.connectivity.wifi.a(str);
        }
        if (i == 4) {
            return new com.heytap.accessory.connectivity.ble.a(str, i2);
        }
        com.heytap.accessory.base.logging.a.b(L, "Invalid connectivity type " + i);
        return null;
    }

    public void b(FrameworkServiceDescription frameworkServiceDescription) {
        FrameworkServiceDescription next;
        Iterator<FrameworkServiceDescription> it = x().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.d().equalsIgnoreCase(frameworkServiceDescription.d()) && next.m().equalsIgnoreCase(frameworkServiceDescription.m()) && next.o() == frameworkServiceDescription.o()) {
                break;
            }
        }
        if (next != null) {
            boolean zRemove = this.x.remove(next);
            com.heytap.accessory.base.logging.a.a(L, "mServices cache move result: " + zRemove);
        }
    }

    public void c(List<FrameworkServiceDescription> list) {
        this.x = new CopyOnWriteArrayList(list);
    }

    public final void d(int i) {
        switch (i) {
            case 0:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_UNKNOWN " + i);
                break;
            case 1:
                String str = L;
                com.heytap.accessory.base.logging.a.c(str, "setState: ACCESSORY_STATE_DISCONNECTED " + i);
                com.heytap.accessory.base.logging.a.e(str, "[test4Perform] Connect result: FAILED");
                break;
            case 2:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_DISCONNECTING " + i);
                break;
            case 3:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_CONNECTING_PD_IN_PROGRESS " + i);
                break;
            case 4:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_CONNECTING_AUTH_IN_PROGRESS " + i);
                break;
            case 5:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_CONNECTED " + i);
                break;
            case 6:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_QUERYING " + i);
                break;
            case 7:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_WAITING_FOR_QUERY " + i);
                break;
            case 8:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_CONNECTED_QUERYING " + i);
                break;
            case 9:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_CONNECTED_WAITING_FOR_QUERY " + i);
                break;
            case 10:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_AVAILABLE " + i);
                break;
            case 11:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_LOCKED " + i);
                break;
            case 12:
                com.heytap.accessory.base.logging.a.c(L, "setState: ACCESSORY_STATE_INVALID " + i);
                break;
            default:
                com.heytap.accessory.base.logging.a.c(L, "setState: Unknow  " + i);
                break;
        }
    }

    public ConcurrentHashMap<Integer, Object> e() {
        return this.z;
    }

    public byte f() {
        return this.e;
    }

    public byte g() {
        return this.f;
    }

    public void h(int i) {
        this.h = i;
    }

    public void i(String str) {
        this.t = str;
    }

    public int j() {
        return this.k;
    }

    public String k() {
        return this.l;
    }

    public void l(int i) {
        this.A = i;
        d(i);
    }

    public int m() {
        return this.q;
    }

    public String n() {
        return this.I;
    }

    public void o(int i) {
        this.J = i;
    }

    public Object c(int i) {
        return this.z.get(Integer.valueOf(i));
    }

    public void e(int i) {
        this.b = i;
    }

    public void f(boolean z) {
        this.w = z;
    }

    public void g(int i) {
        this.q = i;
    }

    public synchronized void h(String str) {
        if (!this.s.contains(str)) {
            this.s.add(str);
        }
    }

    public byte i() {
        return this.j;
    }

    public void j(int i) {
        com.heytap.accessory.base.logging.a.a(L, "settrack, setServiceCount:" + i + ", " + hashCode());
        this.p = i;
    }

    public void k(int i) {
        this.y = i;
    }

    public String p() {
        return this.r;
    }

    public int c() {
        return this.b;
    }

    public void e(byte b) {
        this.D = b;
    }

    public void f(String str) {
        this.I = str;
    }

    public void c(byte b) {
        com.heytap.accessory.base.logging.a.a(L, "settrack, setDevCategory: " + ((int) b));
        this.j = b;
    }

    public void e(boolean z) {
        this.o = z;
    }

    public synchronized void a(FrameworkServiceDescription frameworkServiceDescription) {
        FrameworkServiceDescription next;
        Iterator<FrameworkServiceDescription> it = x().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.m().equalsIgnoreCase(frameworkServiceDescription.m()) && (Integer.parseInt(next.a()) > ServiceDiscoveryUtils.AF_SERVICE_COMPONENT_ID_USABLE_LIMIT || (next.d().equalsIgnoreCase(frameworkServiceDescription.d()) && next.o() == frameworkServiceDescription.o()))) {
                break;
                break;
            }
        }
        if (next != null) {
            this.x.remove(next);
        }
        this.x.add(frameworkServiceDescription);
    }

    public void c(boolean z) {
        this.g = z;
    }

    public void b() {
        this.x.clear();
    }

    public final boolean b(List<FrameworkServiceDescription> list) {
        if (list.size() != this.x.size()) {
            return false;
        }
        Iterator<FrameworkServiceDescription> it = list.iterator();
        while (it.hasNext()) {
            if (!this.x.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public List<String> a(List<String> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator<FrameworkServiceDescription> it = x().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (str.equals(it.next().m())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @Nullable
    public FrameworkServiceDescription b(String str) {
        if (this.x != null && !TextUtils.isEmpty(str)) {
            for (FrameworkServiceDescription frameworkServiceDescription : x()) {
                if (str.equals(frameworkServiceDescription.a())) {
                    return frameworkServiceDescription;
                }
            }
        }
        return null;
    }

    public void d(String str) {
        this.l = str;
    }

    public b(b bVar) {
        this(bVar.l(), bVar.k(), bVar.d(), bVar.x(), bVar.u(), bVar.h(), bVar.A(), bVar.G(), bVar.s(), bVar.q(), bVar.r(), bVar.j(), bVar.v(), bVar.c(), bVar.y(), bVar.B(), bVar.C(), bVar.D(), bVar.g(), bVar.p(), bVar.i(), bVar.H(), bVar.N(), bVar.L(), bVar.F(), bVar.t());
        if (bVar.h() == 1) {
            f(bVar.n());
        }
    }

    public void b(byte b) {
        this.f = b;
    }

    public String d() {
        return this.c;
    }

    public void a(long j) {
        this.m = j;
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void d(byte b) {
        this.H = b;
    }

    public boolean a(String str) {
        StringBuilder sb = new StringBuilder();
        for (FrameworkServiceDescription frameworkServiceDescription : x()) {
            sb.append(frameworkServiceDescription.m());
            sb.append("; ");
            if (frameworkServiceDescription.m().equalsIgnoreCase(str)) {
                if (!String.valueOf(65280).equals(frameworkServiceDescription.a())) {
                    return true;
                }
                com.heytap.accessory.base.logging.a.a(L, "check profile, find a dummy record:" + str);
                return true;
            }
        }
        com.heytap.accessory.base.logging.a.a(L, "checkIfProfileIsPresent failed. requestedProfileId = " + str + ",current Services = " + sb.toString());
        return false;
    }

    public b(long j, String str, String str2, List<FrameworkServiceDescription> list, int i, int i2, int i3, String str3, String str4, List<String> list2, String str5, int i4, int i5, int i6, int i7, int i8, byte b, int i9, byte b2, String str6, byte b3, int i10, boolean z, boolean z2, int i11, byte[] bArr) {
        this.z = new ConcurrentHashMap<>();
        this.I = ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS;
        this.a = false;
        this.o = z;
        this.g = z2;
        this.n = false;
        this.m = j;
        this.l = str;
        this.c = str2;
        if (list == null) {
            this.x = new CopyOnWriteArrayList();
        } else {
            this.x = new CopyOnWriteArrayList(list);
        }
        this.h = i;
        this.i = i2;
        this.A = i3;
        this.F = str3;
        this.u = str4;
        this.s = list2;
        this.t = str5;
        this.v = i5;
        this.b = i6;
        this.k = i4;
        this.y = i7;
        this.C = i8;
        this.D = b;
        this.E = i9;
        this.f = b2;
        this.r = PlatformUtils.getPeerId(str6, i2, i11);
        this.j = b3;
        this.G = i10;
        this.J = i11;
        this.K = bArr;
    }

    public void a() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (FrameworkServiceDescription frameworkServiceDescription : x()) {
            if (frameworkServiceDescription != null) {
                sb.append(", profileId: ");
                sb.append(frameworkServiceDescription.m());
                sb.append(", componentId: ");
                sb.append(frameworkServiceDescription.a());
                if (Integer.parseInt(frameworkServiceDescription.a()) <= ServiceDiscoveryUtils.AF_SERVICE_COMPONENT_ID_USABLE_LIMIT) {
                    arrayList.add(frameworkServiceDescription);
                }
            }
        }
        com.heytap.accessory.base.logging.a.a(L, "cleanUpServices" + ((Object) sb));
        this.x = arrayList;
    }

    public void a(ConcurrentHashMap<Integer, Object> concurrentHashMap) {
        this.z = concurrentHashMap;
    }

    public void a(Object obj) {
        a(obj, 1);
    }

    public void a(Object obj, int i) {
        this.z.put(Integer.valueOf(i), obj);
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void a(byte b) {
        this.e = b;
    }

    public void a(byte[] bArr) {
        this.K = bArr;
    }
}
