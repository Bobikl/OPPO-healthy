package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.offlinemap.OfflineMapCity;
import com.amap.api.maps.offlinemap.OfflineMapProvince;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class ljm {
    public static String a = "";
    public static boolean b = false;
    public static String d = "";
    public static volatile ljm r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f13730c;
    public d g;
    public sjm h;
    public yjm i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ojm f13734n;
    public qjm o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13731e = true;
    public List<com.amap.api.col.p0003sl.bb> f = new Vector();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.amap.api.col.p0003sl.q0 f13732j = null;
    public com.amap.api.col.p0003sl.q0 k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.amap.api.col.p0003sl.q0 f13733l = null;
    public e m = null;
    public njm p = null;
    public boolean q = true;

    public class a extends u4n {
        public final /* synthetic */ String i;

        public a(String str) {
            this.i = str;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            com.amap.api.col.p0003sl.bb bbVarI = ljm.this.I(this.i);
            if (bbVarI != null) {
                try {
                    if (!bbVarI.c().equals(bbVarI.f660c) && !bbVarI.c().equals(bbVarI.f661e)) {
                        String pinyin = bbVarI.getPinyin();
                        if (pinyin.length() > 0) {
                            String strN = ljm.this.i.n(pinyin);
                            if (strN == null) {
                                strN = bbVarI.getVersion();
                            }
                            if (ljm.d.length() > 0 && strN != null && ljm.n(ljm.d, strN)) {
                                bbVarI.j();
                            }
                        }
                    }
                    if (ljm.this.g != null) {
                        synchronized (ljm.this) {
                            try {
                                ljm.this.g.b(bbVarI);
                            } catch (Throwable th) {
                                c2n.r(th, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    if (ljm.this.g != null) {
                        synchronized (ljm.this) {
                            try {
                                ljm.this.g.b(bbVarI);
                            } catch (Throwable th2) {
                                c2n.r(th2, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (ljm.this.g != null) {
                        synchronized (ljm.this) {
                            try {
                                ljm.this.g.b(bbVarI);
                            } catch (Throwable th4) {
                                c2n.r(th4, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                    }
                    throw th3;
                }
            }
            ljm.this.L();
            mjm mjmVarF = new com.amap.api.col.p0003sl.b(ljm.this.f13730c, ljm.d).f();
            if (ljm.this.g != null) {
                if (mjmVarF == null) {
                    if (ljm.this.g != null) {
                        synchronized (ljm.this) {
                            try {
                                ljm.this.g.b(bbVarI);
                            } catch (Throwable th5) {
                                c2n.r(th5, "OfflineDownloadManager", "checkUpdatefinally");
                            }
                        }
                        return;
                    }
                    return;
                }
                if (mjmVarF.c()) {
                    ljm.this.p();
                }
            }
            if (ljm.this.g != null) {
                synchronized (ljm.this) {
                    try {
                        ljm.this.g.b(bbVarI);
                    } catch (Throwable th6) {
                        c2n.r(th6, "OfflineDownloadManager", "checkUpdatefinally");
                    }
                }
            }
        }
    }

    public class b extends u4n {
        public final /* synthetic */ com.amap.api.col.p0003sl.bb i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f13736j;

        public b(com.amap.api.col.p0003sl.bb bbVar, boolean z) {
            this.i = bbVar;
            this.f13736j = z;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            try {
                if (this.i.c().equals(this.i.a)) {
                    if (ljm.this.g != null) {
                        ljm.this.g.c(this.i);
                        return;
                    }
                    return;
                }
                if (this.i.getState() != 7 && this.i.getState() != -1) {
                    ljm.this.o.a(this.i);
                    if (ljm.this.g != null) {
                        ljm.this.g.c(this.i);
                        return;
                    }
                    return;
                }
                ljm.this.o.a(this.i);
                if (!this.f13736j || ljm.this.g == null) {
                    return;
                }
                ljm.this.g.c(this.i);
            } catch (Throwable th) {
                c2n.r(th, "requestDelete", "removeExcecRunnable");
            }
        }
    }

    public class c extends u4n {
        public final /* synthetic */ com.amap.api.col.p0003sl.bb i;

        public c(com.amap.api.col.p0003sl.bb bbVar) {
            this.i = bbVar;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            try {
                if (ljm.this.f13731e) {
                    ljm.this.L();
                    mjm mjmVarF = new com.amap.api.col.p0003sl.b(ljm.this.f13730c, ljm.d).f();
                    if (mjmVarF != null) {
                        ljm.D(ljm.this);
                        if (mjmVarF.c()) {
                            ljm.this.p();
                        }
                    }
                }
                this.i.setVersion(ljm.d);
                this.i.f();
            } catch (AMapException e2) {
                e2.printStackTrace();
            } catch (Throwable th) {
                c2n.r(th, "OfflineDownloadManager", "startDownloadRunnable");
            }
        }
    }

    public interface d {
        void a();

        void a(com.amap.api.col.p0003sl.bb bbVar);

        void b(com.amap.api.col.p0003sl.bb bbVar);

        void c(com.amap.api.col.p0003sl.bb bbVar);
    }

    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                message.getData();
                Object obj = message.obj;
                if (obj instanceof com.amap.api.col.p0003sl.bb) {
                    com.amap.api.col.p0003sl.bb bbVar = (com.amap.api.col.p0003sl.bb) obj;
                    bbVar.getCity();
                    bbVar.getcompleteCode();
                    bbVar.getState();
                    if (ljm.this.g != null) {
                        ljm.this.g.a(bbVar);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public ljm(Context context) {
        this.f13730c = context;
    }

    public static /* synthetic */ boolean D(ljm ljmVar) {
        ljmVar.f13731e = false;
        return false;
    }

    public static void M() {
        r = null;
        b = true;
    }

    public static void N(String str) {
        a = str;
    }

    public static ljm b(Context context) {
        if (r == null) {
            synchronized (ljm.class) {
                if (r == null && !b) {
                    r = new ljm(context.getApplicationContext());
                }
            }
        }
        return r;
    }

    public static boolean n(String str, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            try {
                if (str.charAt(i) > str2.charAt(i)) {
                    return true;
                }
                if (str.charAt(i) < str2.charAt(i)) {
                    return false;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public final void A() {
        com.amap.api.col.p0003sl.q0 q0Var = this.f13732j;
        if (q0Var != null) {
            q0Var.g();
        }
        com.amap.api.col.p0003sl.q0 q0Var2 = this.f13733l;
        if (q0Var2 != null) {
            q0Var2.g();
            this.f13733l = null;
        }
        njm njmVar = this.p;
        if (njmVar != null) {
            if (njmVar.isAlive()) {
                this.p.interrupt();
            }
            this.p = null;
        }
        e eVar = this.m;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages(null);
            this.m = null;
        }
        sjm sjmVar = this.h;
        if (sjmVar != null) {
            sjmVar.d();
            this.h = null;
        }
        ojm ojmVar = this.f13734n;
        if (ojmVar != null) {
            ojmVar.w();
        }
        M();
        this.f13731e = true;
        O();
    }

    public final void B(com.amap.api.col.p0003sl.bb bbVar) throws AMapException {
        L();
        if (bbVar == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        if (this.f13733l == null) {
            this.f13733l = com.amap.api.col.p0003sl.r.b("AMapOfflineDownload");
        }
        try {
            this.f13733l.b(new c(bbVar));
        } catch (Throwable th) {
            c2n.r(th, "startDownload", "downloadExcecRunnable");
        }
    }

    public final void C(String str) throws AMapException {
        com.amap.api.col.p0003sl.bb bbVarK = K(str);
        if (bbVarK == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        B(bbVarK);
    }

    public final String E(String str) {
        com.amap.api.col.p0003sl.bb bbVarI;
        return (str == null || (bbVarI = I(str)) == null) ? "" : bbVarI.getAdcode();
    }

    public final void F() {
        try {
            tjm tjmVarA = this.i.a("000001");
            if (tjmVarA != null) {
                this.i.m("000001");
                tjmVarA.b(UserGoalInfo.DEVICE_CONSUMPTION_GOAL_DEFAULT);
                this.i.e(tjmVarA);
            }
        } catch (Throwable th) {
            c2n.r(th, "OfflineDownloadManager", "changeBadCase");
        }
    }

    public final void G() {
        if ("".equals(xsm.h0(this.f13730c))) {
            return;
        }
        File file = new File(xsm.h0(this.f13730c) + "offlinemapv4.png");
        String strD = !file.exists() ? ekm.d(this.f13730c, "offlinemapv4.png") : ekm.n(file);
        if (strD != null) {
            try {
                H(strD);
            } catch (JSONException e2) {
                if (file.exists()) {
                    file.delete();
                }
                c2n.r(e2, "MapDownloadManager", "paseJson io");
                e2.printStackTrace();
            }
        }
    }

    public final void H(String str) throws JSONException {
        ojm ojmVar;
        List<OfflineMapProvince> listF = ekm.f(str, this.f13730c.getApplicationContext());
        if (listF == null || listF.size() == 0 || (ojmVar = this.f13734n) == null) {
            return;
        }
        ojmVar.i(listF);
    }

    public final com.amap.api.col.p0003sl.bb I(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.f) {
            for (com.amap.api.col.p0003sl.bb bbVar : this.f) {
                if (str.equals(bbVar.getCity()) || str.equals(bbVar.getPinyin())) {
                    return bbVar;
                }
            }
            return null;
        }
    }

    public final void J() {
        for (tjm tjmVar : this.i.c()) {
            if (tjmVar != null && tjmVar.a() != null && tjmVar.e().length() > 0) {
                int i = tjmVar.f18306l;
                if (i != 4 && i != 7 && i >= 0) {
                    tjmVar.f18306l = 3;
                }
                com.amap.api.col.p0003sl.bb bbVarI = I(tjmVar.a());
                if (bbVarI != null) {
                    String strC = tjmVar.c();
                    if (strC == null || !n(d, strC)) {
                        bbVarI.a(tjmVar.f18306l);
                        bbVarI.setCompleteCode(tjmVar.i());
                    } else {
                        bbVarI.a(7);
                    }
                    if (tjmVar.c().length() > 0) {
                        bbVarI.setVersion(tjmVar.c());
                    }
                    List<String> listJ = this.i.j(tjmVar.e());
                    StringBuffer stringBuffer = new StringBuffer();
                    Iterator<String> it = listJ.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(it.next());
                        stringBuffer.append(";");
                    }
                    bbVarI.a(stringBuffer.toString());
                    ojm ojmVar = this.f13734n;
                    if (ojmVar != null) {
                        ojmVar.c(bbVarI);
                    }
                }
            }
        }
    }

    public final com.amap.api.col.p0003sl.bb K(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        synchronized (this.f) {
            for (com.amap.api.col.p0003sl.bb bbVar : this.f) {
                if (str.equals(bbVar.getCode())) {
                    return bbVar;
                }
            }
            return null;
        }
    }

    public final void L() throws AMapException {
        if (!xsm.j0(this.f13730c)) {
            throw new AMapException(AMapException.ERROR_CONNECTION);
        }
    }

    public final void O() {
        synchronized (this) {
            this.g = null;
        }
    }

    public final void d() {
        this.i = yjm.b(this.f13730c.getApplicationContext());
        F();
        this.m = new e(this.f13730c.getMainLooper());
        this.f13734n = new ojm(this.f13730c);
        this.h = sjm.a();
        N(xsm.h0(this.f13730c));
        try {
            G();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        synchronized (this.f) {
            Iterator<OfflineMapProvince> it = this.f13734n.b().iterator();
            while (it.hasNext()) {
                for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                    if (offlineMapCity != null) {
                        this.f.add(new com.amap.api.col.p0003sl.bb(this.f13730c, offlineMapCity));
                    }
                }
            }
        }
        njm njmVar = new njm(this.f13730c);
        this.p = njmVar;
        njmVar.start();
    }

    public final void e(com.amap.api.col.p0003sl.bb bbVar) {
        f(bbVar, false);
    }

    public final void f(com.amap.api.col.p0003sl.bb bbVar, boolean z) {
        if (this.o == null) {
            this.o = new qjm(this.f13730c);
        }
        if (this.k == null) {
            this.k = com.amap.api.col.p0003sl.r.b("AMapOfflineRemove");
        }
        try {
            this.k.b(new b(bbVar, z));
        } catch (Throwable th) {
            c2n.r(th, "requestDelete", "removeExcecRunnable");
        }
    }

    public final void g(d dVar) {
        this.g = dVar;
    }

    public final void h(String str) {
        try {
            if (str != null) {
                if (this.f13732j == null) {
                    this.f13732j = com.amap.api.col.p0003sl.r.b("AMapOfflineCheckUpdate");
                }
                this.f13732j.b(new a(str));
            } else {
                d dVar = this.g;
                if (dVar != null) {
                    dVar.b(null);
                }
            }
        } catch (Throwable th) {
            c2n.r(th, "OfflineDownloadManager", "checkUpdate");
        }
    }

    public final void j() {
        J();
        d dVar = this.g;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (Throwable th) {
                c2n.r(th, "OfflineDownloadManager", "verifyCallBack");
            }
        }
    }

    public final void k(com.amap.api.col.p0003sl.bb bbVar) {
        try {
            sjm sjmVar = this.h;
            if (sjmVar != null) {
                sjmVar.c(bbVar, this.f13730c);
            }
        } catch (com.amap.api.col.p0003sl.ik e2) {
            e2.printStackTrace();
        }
    }

    public final boolean m(String str) {
        return I(str) != null;
    }

    public final void p() throws AMapException {
        if (this.f13734n == null) {
            return;
        }
        com.amap.api.col.p0003sl.d dVar = new com.amap.api.col.p0003sl.d(this.f13730c, "");
        dVar.h(this.f13730c);
        List<OfflineMapProvince> listF = dVar.f();
        if (this.f != null) {
            this.f13734n.i(listF);
        }
        List<com.amap.api.col.p0003sl.bb> list = this.f;
        if (list != null) {
            synchronized (list) {
                Iterator<OfflineMapProvince> it = this.f13734n.b().iterator();
                while (it.hasNext()) {
                    for (OfflineMapCity offlineMapCity : it.next().getCityList()) {
                        for (com.amap.api.col.p0003sl.bb bbVar : this.f) {
                            if (offlineMapCity.getPinyin().equals(bbVar.getPinyin())) {
                                String version = bbVar.getVersion();
                                if (bbVar.getState() == 4 && d.length() > 0 && n(d, version)) {
                                    bbVar.j();
                                    bbVar.setUrl(offlineMapCity.getUrl());
                                    bbVar.s();
                                } else {
                                    bbVar.setCity(offlineMapCity.getCity());
                                    bbVar.setUrl(offlineMapCity.getUrl());
                                    bbVar.s();
                                    bbVar.setAdcode(offlineMapCity.getAdcode());
                                    bbVar.setVersion(offlineMapCity.getVersion());
                                    bbVar.setSize(offlineMapCity.getSize());
                                    bbVar.setCode(offlineMapCity.getCode());
                                    bbVar.setJianpin(offlineMapCity.getJianpin());
                                    bbVar.setPinyin(offlineMapCity.getPinyin());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void q(com.amap.api.col.p0003sl.bb bbVar) {
        ojm ojmVar = this.f13734n;
        if (ojmVar != null) {
            ojmVar.c(bbVar);
        }
        e eVar = this.m;
        if (eVar != null) {
            Message messageObtainMessage = eVar.obtainMessage();
            messageObtainMessage.obj = bbVar;
            this.m.sendMessage(messageObtainMessage);
        }
    }

    public final void r(String str) {
        com.amap.api.col.p0003sl.bb bbVarI = I(str);
        if (bbVarI != null) {
            u(bbVarI);
            f(bbVarI, true);
            return;
        }
        d dVar = this.g;
        if (dVar != null) {
            try {
                dVar.c(bbVarI);
            } catch (Throwable th) {
                c2n.r(th, "OfflineDownloadManager", EventType.STATE_PACKAGE_CHANGED_REMOVE);
            }
        }
    }

    public final void t() {
        synchronized (this.f) {
            for (com.amap.api.col.p0003sl.bb bbVar : this.f) {
                if (bbVar.c().equals(bbVar.f660c) || bbVar.c().equals(bbVar.b)) {
                    u(bbVar);
                    bbVar.g();
                }
            }
        }
    }

    public final void u(com.amap.api.col.p0003sl.bb bbVar) {
        sjm sjmVar = this.h;
        if (sjmVar != null) {
            sjmVar.b(bbVar);
        }
    }

    public final void v(String str) {
        com.amap.api.col.p0003sl.bb bbVarI = I(str);
        if (bbVarI != null) {
            bbVarI.f();
        }
    }

    public final void w() {
        synchronized (this.f) {
            for (com.amap.api.col.p0003sl.bb bbVar : this.f) {
                if (bbVar.c().equals(bbVar.f660c)) {
                    bbVar.g();
                    break;
                }
            }
        }
    }

    public final void x(com.amap.api.col.p0003sl.bb bbVar) {
        sjm sjmVar = this.h;
        if (sjmVar != null) {
            sjmVar.e(bbVar);
        }
    }

    public final void y(String str) throws AMapException {
        com.amap.api.col.p0003sl.bb bbVarI = I(str);
        if (str == null || str.length() <= 0 || bbVarI == null) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        B(bbVarI);
    }
}
