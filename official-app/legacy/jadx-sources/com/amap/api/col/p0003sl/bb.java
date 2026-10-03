package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.oplus.aiunit.vision.bom;
import com.oplus.aiunit.vision.com;
import com.oplus.aiunit.vision.dom;
import com.oplus.aiunit.vision.ekm;
import com.oplus.aiunit.vision.eom;
import com.oplus.aiunit.vision.fom;
import com.oplus.aiunit.vision.ljm;
import com.oplus.aiunit.vision.rjm;
import com.oplus.aiunit.vision.tjm;
import com.oplus.aiunit.vision.tnm;
import com.oplus.aiunit.vision.wnm;
import com.oplus.aiunit.vision.xnm;
import com.oplus.aiunit.vision.xsm;
import com.oplus.aiunit.vision.ynm;
import com.oplus.aiunit.vision.znm;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public final class bb extends OfflineMapCity implements rjm, tnm {
    public static final Parcelable.Creator<bb> CREATOR = new b();
    public final wnm a;
    public final wnm b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wnm f660c;
    public final wnm d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wnm f661e;
    public final wnm f;
    public final wnm g;
    public final wnm h;
    public final wnm i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wnm f662j;
    public final wnm k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    wnm f663l;
    Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f664n;
    private String o;
    private String p;
    private long q;

    public static class b implements Parcelable.Creator<bb> {
        public static bb a(Parcel parcel) {
            return new bb(parcel);
        }

        public static bb[] b(int i) {
            return new bb[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ bb createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ bb[] newArray(int i) {
            return b(i);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cc.a.values().length];
            a = iArr;
            try {
                iArr[cc.a.amap_exception.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cc.a.file_io_exception.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cc.a.network_exception.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bb(Context context, OfflineMapCity offlineMapCity) {
        this(context, offlineMapCity.getState());
        setCity(offlineMapCity.getCity());
        setUrl(offlineMapCity.getUrl());
        setState(offlineMapCity.getState());
        setCompleteCode(offlineMapCity.getcompleteCode());
        setAdcode(offlineMapCity.getAdcode());
        setVersion(offlineMapCity.getVersion());
        setSize(offlineMapCity.getSize());
        setCode(offlineMapCity.getCode());
        setJianpin(offlineMapCity.getJianpin());
        setPinyin(offlineMapCity.getPinyin());
        s();
    }

    private String A() {
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        String str = this.o;
        return str.substring(0, str.lastIndexOf("."));
    }

    private String B() {
        if (TextUtils.isEmpty(this.o)) {
            return null;
        }
        String strA = A();
        return strA.substring(0, strA.lastIndexOf(46));
    }

    private boolean C() {
        ekm.a();
        getSize();
        getcompleteCode();
        getSize();
        return false;
    }

    private void z() {
        ljm ljmVarB = ljm.b(this.m);
        if (ljmVarB != null) {
            ljmVarB.e(this);
        }
    }

    @Override // com.oplus.aiunit.vision.rjm
    public final String b() {
        return getUrl();
    }

    public final wnm c() {
        return this.f663l;
    }

    public final void d() {
        ljm ljmVarB = ljm.b(this.m);
        if (ljmVarB != null) {
            ljmVarB.q(this);
        }
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e() {
        ljm ljmVarB = ljm.b(this.m);
        if (ljmVarB != null) {
            ljmVarB.x(this);
            d();
        }
    }

    public final void f() {
        c().d();
        if (this.f663l.equals(this.d)) {
            this.f663l.g();
            return;
        }
        if (this.f663l.equals(this.f660c)) {
            this.f663l.i();
            return;
        }
        if (this.f663l.equals(this.g) || this.f663l.equals(this.h)) {
            z();
            this.f664n = true;
        } else if (this.f663l.equals(this.f662j) || this.f663l.equals(this.i) || this.f663l.c(this.k)) {
            this.f663l.f();
        } else {
            c().h();
        }
    }

    public final void g() {
        this.f663l.i();
    }

    public final void h() {
        this.f663l.b(this.k.d());
    }

    public final void i() {
        this.f663l.a();
        if (this.f664n) {
            this.f663l.h();
        }
        this.f664n = false;
    }

    public final void j() {
        this.f663l.equals(this.f);
        this.f663l.j();
    }

    public final void k() {
        ljm ljmVarB = ljm.b(this.m);
        if (ljmVarB != null) {
            ljmVarB.k(this);
        }
    }

    public final void l() {
        ljm ljmVarB = ljm.b(this.m);
        if (ljmVarB != null) {
            ljmVarB.u(this);
        }
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void m() {
        this.q = 0L;
        this.f663l.equals(this.b);
        this.f663l.f();
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void n() {
        this.f663l.equals(this.f660c);
        this.f663l.k();
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void o() {
        e();
    }

    @Override // com.oplus.aiunit.vision.akm
    public final void p() {
        this.q = 0L;
        setCompleteCode(0);
        this.f663l.equals(this.f661e);
        this.f663l.f();
    }

    @Override // com.oplus.aiunit.vision.akm
    public final void q() {
        this.f663l.equals(this.f661e);
        this.f663l.b(this.h.d());
    }

    @Override // com.oplus.aiunit.vision.akm
    public final void r() {
        e();
    }

    public final void s() {
        String str = ljm.a;
        String strI = ekm.i(getUrl());
        if (strI != null) {
            this.o = str + strI + ".zip.tmp";
            return;
        }
        this.o = str + getPinyin() + ".zip.tmp";
    }

    public final tjm t() {
        setState(this.f663l.d());
        tjm tjmVar = new tjm(this, this.m);
        tjmVar.m(a());
        a();
        return tjmVar;
    }

    @Override // com.oplus.aiunit.vision.tnm
    public final boolean u() {
        return C();
    }

    @Override // com.oplus.aiunit.vision.tnm
    public final String v() {
        StringBuffer stringBuffer = new StringBuffer();
        String strI = ekm.i(getUrl());
        if (strI != null) {
            stringBuffer.append(strI);
        } else {
            stringBuffer.append(getPinyin());
        }
        stringBuffer.append(".zip");
        return stringBuffer.toString();
    }

    @Override // com.oplus.aiunit.vision.tnm
    public final String w() {
        return getAdcode();
    }

    @Override // com.amap.api.maps.offlinemap.OfflineMapCity, com.amap.api.maps.offlinemap.City, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.p);
    }

    @Override // com.oplus.aiunit.vision.bkm
    public final String x() {
        return A();
    }

    @Override // com.oplus.aiunit.vision.bkm
    public final String y() {
        return B();
    }

    @Override // com.oplus.aiunit.vision.akm
    public final void b(String str) {
        this.f663l.equals(this.f661e);
        this.p = str;
        String strA = A();
        String strB = B();
        if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strB)) {
            q();
            return;
        }
        File file = new File(strB + "/");
        File file2 = new File(xsm.v(this.m) + File.separator + "map/");
        File file3 = new File(xsm.v(this.m));
        if (file3.exists() || file3.mkdir()) {
            if (file2.exists() || file2.mkdir()) {
                a(file, file2, strA);
            }
        }
    }

    public final void a(String str) {
        this.p = str;
    }

    public class a implements e.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ File b;

        public a(String str, File file) {
            this.a = str;
            this.b = file;
        }

        @Override // com.amap.api.col.3sl.e.a
        public final void a(float f) {
            int i = (int) ((((double) f) * 0.39d) + 60.0d);
            if (i - bb.this.getcompleteCode() <= 0 || System.currentTimeMillis() - bb.this.q <= 1000) {
                return;
            }
            bb.this.setCompleteCode(i);
            bb.this.q = System.currentTimeMillis();
        }

        @Override // com.amap.api.col.3sl.e.a
        public final void b() {
            bb bbVar = bb.this;
            bbVar.f663l.b(bbVar.k.d());
        }

        @Override // com.amap.api.col.3sl.e.a
        public final void a() {
            try {
                if (new File(this.a).delete()) {
                    ekm.l(this.b);
                    bb.this.setCompleteCode(100);
                    bb.this.f663l.k();
                }
            } catch (Exception unused) {
                bb bbVar = bb.this;
                bbVar.f663l.b(bbVar.k.d());
            }
        }
    }

    public final String a() {
        return this.p;
    }

    public final void a(int i) {
        if (i == -1) {
            this.f663l = this.h;
        } else if (i == 0) {
            this.f663l = this.f660c;
        } else if (i == 1) {
            this.f663l = this.f661e;
        } else if (i == 2) {
            this.f663l = this.b;
        } else if (i == 3) {
            this.f663l = this.d;
        } else if (i == 4) {
            this.f663l = this.f;
        } else if (i == 6) {
            this.f663l = this.a;
        } else if (i != 7) {
            switch (i) {
                case 101:
                    this.f663l = this.i;
                    break;
                case 102:
                    this.f663l = this.f662j;
                    break;
                case 103:
                    this.f663l = this.k;
                    break;
                default:
                    if (i < 0) {
                        this.f663l = this.h;
                    }
                    break;
            }
        } else {
            this.f663l = this.g;
        }
        setState(i);
    }

    private bb(Context context, int i) {
        this.a = new ynm(this);
        this.b = new fom(this);
        this.f660c = new bom(this);
        this.d = new dom(this);
        this.f661e = new eom(this);
        this.f = new xnm(this);
        this.g = new com(this);
        this.h = new znm(-1, this);
        this.i = new znm(101, this);
        this.f662j = new znm(102, this);
        this.k = new znm(103, this);
        this.o = null;
        this.p = "";
        this.f664n = false;
        this.q = 0L;
        this.m = context;
        a(i);
    }

    public final wnm b(int i) {
        switch (i) {
            case 101:
                return this.i;
            case 102:
                return this.f662j;
            case 103:
                return this.k;
            default:
                return this.h;
        }
    }

    public final void a(wnm wnmVar) {
        this.f663l = wnmVar;
        setState(wnmVar.d());
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void a(long j2, long j3) {
        int i = (int) ((j3 * 100) / j2);
        if (i != getcompleteCode()) {
            setCompleteCode(i);
            d();
        }
    }

    @Override // com.amap.api.col.p0003sl.cc
    public final void a(cc.a aVar) {
        int iD;
        int i = c.a[aVar.ordinal()];
        if (i == 1) {
            iD = this.f662j.d();
        } else if (i != 2) {
            iD = i != 3 ? 6 : this.i.d();
        } else {
            iD = this.k.d();
        }
        if (this.f663l.equals(this.f660c) || this.f663l.equals(this.b)) {
            this.f663l.b(iD);
        }
    }

    @Override // com.oplus.aiunit.vision.akm
    public final void a(long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.q > 500) {
            int i = (int) j2;
            if (i > getcompleteCode()) {
                setCompleteCode(i);
                d();
            }
            this.q = jCurrentTimeMillis;
        }
    }

    public bb(Parcel parcel) {
        super(parcel);
        this.a = new ynm(this);
        this.b = new fom(this);
        this.f660c = new bom(this);
        this.d = new dom(this);
        this.f661e = new eom(this);
        this.f = new xnm(this);
        this.g = new com(this);
        this.h = new znm(-1, this);
        this.i = new znm(101, this);
        this.f662j = new znm(102, this);
        this.k = new znm(103, this);
        this.o = null;
        this.p = "";
        this.f664n = false;
        this.q = 0L;
        this.p = parcel.readString();
    }

    private void a(File file, File file2, String str) {
        new e().b(file, file2, -1L, ekm.b(file), new a(str, file));
    }
}
