package com.alipay.sdk.m.u;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.app.IAlixPay;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.sdk.app.APayEntranceActivity;
import com.oplus.aiunit.vision.gam;
import com.oplus.aiunit.vision.h9m;
import com.oplus.aiunit.vision.ham;
import com.oplus.aiunit.vision.j3n;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.qrm;
import com.oplus.aiunit.vision.sgm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class h {
    public static final String i = "failed";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f617j = "scheme_failed";
    public Activity a;
    public volatile IAlixPay b;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f619e;
    public final qam f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f618c = IAlixPay.class;
    public boolean g = false;
    public String h = null;

    public class a implements APayEntranceActivity.a {
        public final /* synthetic */ Object a;

        public a(Object obj) {
            this.a = obj;
        }

        @Override // com.alipay.sdk.app.APayEntranceActivity.a
        public void a(String str) {
            h.this.h = str;
            synchronized (this.a) {
                try {
                    this.a.notify();
                } catch (Throwable th) {
                    l9m.d(h.this.f, sgm.f16581l, "BSAResultEx", th);
                }
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ APayEntranceActivity.a i;

        public b(APayEntranceActivity.a aVar) {
            this.i = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f == null || h.this.f.q()) {
                return;
            }
            l9m.h(h.this.f, sgm.f16581l, sgm.e0, "");
            if (h9m.I().C()) {
                h.this.f.l(true);
                this.i.a(qgm.a());
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Intent i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Object f621j;

        public c(Intent intent, Object obj) {
            this.i = intent;
            this.f621j = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (h.this.a != null) {
                    h.this.a.startActivity(this.i);
                } else {
                    l9m.h(h.this.f, sgm.f16581l, sgm.c0, "");
                    Context contextA = h.this.f.a();
                    if (contextA != null) {
                        contextA.startActivity(this.i);
                    }
                }
            } catch (Throwable th) {
                l9m.d(h.this.f, sgm.f16581l, sgm.d0, th);
                com.alipay.sdk.m.u.a.t("alipaySdk", "startActivityEx", h.this.a, h.this.f);
                synchronized (this.f621j) {
                    try {
                        h.this.h = h.f617j;
                        this.f621j.notify();
                    } catch (Throwable th2) {
                        l9m.d(h.this.f, sgm.f16581l, "BSAResultEx", th2);
                    }
                }
            }
        }
    }

    public class d extends IRemoteServiceCallback.Stub {
        public d() {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public int getVersion() throws RemoteException {
            return 4;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public boolean isHideLoadingScreen() throws RemoteException {
            return false;
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void payEnd(boolean z, String str) throws RemoteException {
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void r03(String str, String str2, Map map) throws RemoteException {
            l9m.c(h.this.f, sgm.p, str, str2);
            if (TextUtils.equals(str2, "ActivityStartSuccess")) {
                if (h.this.f619e != null) {
                    h.this.f619e.a();
                }
                if (h.this.f != null) {
                    h.this.f.o(true);
                }
            }
        }

        @Override // com.alipay.android.app.IRemoteServiceCallback
        public void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            try {
                bundle.putInt("CallingPid", i);
                intent.putExtras(bundle);
            } catch (Exception e2) {
                l9m.d(h.this.f, sgm.f16581l, sgm.Z, e2);
            }
            intent.setClassName(str, str2);
            try {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                l9m.c(h.this.f, sgm.f16581l, "isFg", runningAppProcessInfo.processName + "|" + runningAppProcessInfo.importance + "|");
            } catch (Throwable unused) {
            }
            try {
                if (h.this.a == null) {
                    l9m.h(h.this.f, sgm.f16581l, sgm.a0, "");
                    Context contextA = h.this.f.a();
                    if (contextA != null) {
                        contextA.startActivity(intent);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                h.this.a.startActivity(intent);
                l9m.c(h.this.f, sgm.f16581l, "stAct2", "" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            } catch (Throwable th) {
                l9m.d(h.this.f, sgm.f16581l, sgm.b0, th);
                throw th;
            }
        }

        public /* synthetic */ d(h hVar, a aVar) {
            this();
        }
    }

    public class e implements ServiceConnection {
        public e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l9m.b(h.this.f, sgm.f16581l, "srvCon");
            synchronized (h.this.f618c) {
                h.this.b = IAlixPay.Stub.asInterface(iBinder);
                h.this.f618c.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            l9m.b(h.this.f, sgm.f16581l, "srvDis");
            h.this.b = null;
        }

        public /* synthetic */ e(h hVar, a aVar) {
            this();
        }
    }

    public interface f {
        void a();

        void b();
    }

    public h(Activity activity, qam qamVar, f fVar) {
        this.a = activity;
        this.f = qamVar;
        this.f619e = fVar;
        qrm.h(ham.A, "alipaySdk");
    }

    public static boolean k(String str, Context context, qam qamVar) {
        try {
            Intent intent = new Intent();
            intent.setClassName(str, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return true;
            }
            l9m.b(qamVar, sgm.f16581l, "BSADetectFail");
            return false;
        } catch (Throwable th) {
            l9m.d(qamVar, sgm.f16581l, "BSADetectFail", th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String, Boolean> a(String str, String str2, qam qamVar) {
        int i2;
        e eVar;
        IRemoteServiceCallback dVar;
        Activity activity;
        int version;
        String strA;
        Activity activity2;
        Activity activity3;
        String strPay;
        Activity activity4;
        Intent intent = new Intent();
        intent.setPackage(str2);
        intent.setAction(com.alipay.sdk.m.u.a.I(str2));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(jElapsedRealtime);
        sb.append("|");
        sb.append(str != null ? str.length() : 0);
        l9m.c(qamVar, sgm.f16581l, sgm.R, sb.toString());
        l9m.a(this.a, qamVar, str, qamVar.d);
        try {
            try {
                if (h9m.I().o()) {
                    l9m.c(qamVar, sgm.f16581l, "stSrv", "skipped");
                } else {
                    ComponentName componentNameStartService = this.a.getApplication().startService(intent);
                    l9m.c(qamVar, sgm.f16581l, "stSrv", componentNameStartService != null ? componentNameStartService.getPackageName() : "null");
                }
            } catch (Throwable th) {
                l9m.d(qamVar, sgm.f16581l, sgm.J, th);
                com.alipay.sdk.m.u.a.t("alipaySdk", "bindServiceFail", this.a, this.f);
                return new Pair<>(i, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            l9m.d(qamVar, sgm.f16581l, sgm.K, th2);
        }
        if (h9m.I().k()) {
            l9m.c(qamVar, sgm.f16581l, "bindFlg", "imp");
            i2 = 65;
        } else {
            i2 = 1;
        }
        a aVar = null;
        e eVar2 = new e(this, aVar);
        if (!this.a.getApplicationContext().bindService(intent, eVar2, i2)) {
            throw new Throwable("bindService fail");
        }
        synchronized (this.f618c) {
            if (this.b == null) {
                try {
                    this.f618c.wait(h9m.I().r());
                } catch (InterruptedException e2) {
                    l9m.d(qamVar, sgm.f16581l, sgm.L, e2);
                }
            }
        }
        IAlixPay iAlixPay = this.b;
        try {
            if (iAlixPay == null) {
                l9m.h(qamVar, sgm.f16581l, sgm.E, "");
                com.alipay.sdk.m.u.a.t("alipaySdk", "bindServiceTimeout", this.a, this.f);
                Pair<String, Boolean> pair = new Pair<>(i, Boolean.TRUE);
                try {
                    this.a.getApplicationContext().unbindService(eVar2);
                } catch (Throwable th3) {
                    qrm.d(th3);
                }
                l9m.c(qamVar, sgm.f16581l, sgm.T, "" + SystemClock.elapsedRealtime());
                l9m.a(this.a, qamVar, str, qamVar.d);
                this.b = null;
                if (this.d && (activity4 = this.a) != null) {
                    activity4.setRequestedOrientation(0);
                    this.d = false;
                }
                return pair;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            l9m.c(qamVar, sgm.f16581l, sgm.S, "" + jElapsedRealtime2);
            f fVar = this.f619e;
            if (fVar != null) {
                fVar.b();
            }
            if (this.a.getRequestedOrientation() == 0) {
                this.a.setRequestedOrientation(1);
                this.d = true;
            }
            try {
                version = iAlixPay.getVersion();
            } catch (Throwable th4) {
                qrm.d(th4);
                version = 0;
            }
            dVar = new d(this, aVar);
            try {
                if (version >= 3) {
                    iAlixPay.registerCallback03(dVar, str, null);
                } else {
                    iAlixPay.registerCallback(dVar);
                }
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                StringBuilder sb2 = new StringBuilder();
                try {
                    sb2.append("");
                    sb2.append(jElapsedRealtime3);
                    l9m.c(qamVar, sgm.f16581l, sgm.U, sb2.toString());
                    if (version >= 3) {
                        iAlixPay.r03(sgm.f16581l, "bind_pay", null);
                    }
                    try {
                        if (version >= 2) {
                            Map mapF = qam.f(qamVar);
                            mapF.put("ts_bind", String.valueOf(jElapsedRealtime));
                            mapF.put("ts_bend", String.valueOf(jElapsedRealtime2));
                            mapF.put("ts_pay", String.valueOf(jElapsedRealtime3));
                            strPay = iAlixPay.pay02(str, mapF);
                        } else {
                            strPay = iAlixPay.Pay(str);
                        }
                        strA = strPay;
                        eVar = eVar2;
                    } catch (Throwable th5) {
                        qam qamVar2 = this.f;
                        if (qamVar2 != null && !qamVar2.t()) {
                            l9m.d(qamVar, sgm.f16581l, sgm.H, th5);
                            com.alipay.sdk.m.u.a.t("alipaySdk", "bindServiceEx", this.a, this.f);
                            if (h9m.I().A()) {
                                Pair<String, Boolean> pair2 = new Pair<>(i, Boolean.FALSE);
                                try {
                                    iAlixPay.unregisterCallback(dVar);
                                } catch (Throwable th6) {
                                    qrm.d(th6);
                                }
                                try {
                                    this.a.getApplicationContext().unbindService(eVar2);
                                } catch (Throwable th7) {
                                    qrm.d(th7);
                                }
                                l9m.c(qamVar, sgm.f16581l, sgm.T, "" + SystemClock.elapsedRealtime());
                                l9m.a(this.a, qamVar, str, qamVar.d);
                                this.b = null;
                                if (this.d && (activity2 = this.a) != null) {
                                    activity2.setRequestedOrientation(0);
                                    this.d = false;
                                }
                                return pair2;
                            }
                        }
                        eVar = eVar2;
                        try {
                            strA = qgm.a();
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                    try {
                        iAlixPay.unregisterCallback(dVar);
                    } catch (Throwable th9) {
                        qrm.d(th9);
                    }
                    try {
                        this.a.getApplicationContext().unbindService(eVar);
                    } catch (Throwable th10) {
                        qrm.d(th10);
                    }
                    l9m.c(qamVar, sgm.f16581l, sgm.T, "" + SystemClock.elapsedRealtime());
                    l9m.a(this.a, qamVar, str, qamVar.d);
                    this.b = null;
                    if (this.d && (activity3 = this.a) != null) {
                        activity3.setRequestedOrientation(0);
                        this.d = false;
                    }
                    return new Pair<>(strA, Boolean.FALSE);
                } catch (Throwable th11) {
                    th = th11;
                    eVar = eVar2;
                }
            } catch (Throwable th12) {
                th = th12;
                eVar = eVar2;
            }
        } catch (Throwable th13) {
            th = th13;
            eVar = eVar2;
            dVar = null;
        }
        try {
            l9m.e(qamVar, sgm.f16581l, sgm.E, th, "in_bind");
            return new Pair<>(i, Boolean.TRUE);
        } finally {
            if (dVar != null) {
                try {
                    iAlixPay.unregisterCallback(dVar);
                } catch (Throwable th14) {
                    qrm.d(th14);
                }
            }
            try {
                this.a.getApplicationContext().unbindService(eVar);
            } catch (Throwable th15) {
                qrm.d(th15);
            }
            l9m.c(qamVar, sgm.f16581l, sgm.T, "" + SystemClock.elapsedRealtime());
            l9m.a(this.a, qamVar, str, qamVar.d);
            this.b = null;
            if (this.d && (activity = this.a) != null) {
                activity.setRequestedOrientation(0);
                this.d = 0 == true ? 1 : 0;
            }
        }
    }

    public final String e(String str, String str2) {
        JSONObject jSONObject;
        Object obj = new Object();
        String strJ = com.alipay.sdk.m.u.a.j(32);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        l9m.c(this.f, sgm.f16581l, "BSAStart", strJ + "|" + jElapsedRealtime);
        qam.a.d(this.f, strJ);
        a aVar = new a(obj);
        APayEntranceActivity.h.put(strJ, aVar);
        try {
            HashMap<String, String> mapF = qam.f(this.f);
            mapF.put("ts_intent", String.valueOf(jElapsedRealtime));
            jSONObject = new JSONObject(mapF);
        } catch (Throwable th) {
            try {
                l9m.d(this.f, sgm.f16581l, "BSALocEx", th);
                jSONObject = null;
            } catch (InterruptedException e2) {
                l9m.d(this.f, sgm.f16581l, "BSAWaiting", e2);
                com.alipay.sdk.m.j.c cVar = com.alipay.sdk.m.j.c.PAY_WAITTING;
                return qgm.b(cVar.b(), cVar.a(), "");
            } catch (Throwable th2) {
                l9m.d(this.f, sgm.f16581l, "BSAEx", th2);
                com.alipay.sdk.m.u.a.t("alipaySdk", "startActivityEx", this.a, this.f);
                return f617j;
            }
        }
        Intent intent = new Intent(this.a, (Class<?>) APayEntranceActivity.class);
        intent.putExtra(APayEntranceActivity.d, str);
        intent.putExtra(APayEntranceActivity.f579e, str2);
        intent.putExtra(APayEntranceActivity.f, strJ);
        if (jSONObject != null) {
            intent.putExtra(APayEntranceActivity.g, jSONObject.toString());
        }
        new Handler(Looper.getMainLooper()).postDelayed(new b(aVar), h9m.I().r());
        Activity activity = this.a;
        qam qamVar = this.f;
        l9m.a(activity, qamVar, str, qamVar.d);
        if (h9m.I().F()) {
            new Handler(Looper.getMainLooper()).post(new c(intent, obj));
        } else {
            try {
                Activity activity2 = this.a;
                if (activity2 != null) {
                    activity2.startActivity(intent);
                } else {
                    l9m.h(this.f, sgm.f16581l, sgm.a0, "");
                    Context contextA = this.f.a();
                    if (contextA != null) {
                        contextA.startActivity(intent);
                    }
                }
            } catch (Throwable th3) {
                l9m.d(this.f, sgm.f16581l, sgm.b0, th3);
                throw th3;
            }
        }
        synchronized (obj) {
            obj.wait();
        }
        String str3 = this.h;
        String str4 = "unknown";
        try {
            String str5 = j3n.c(this.f, str3).get(j3n.a);
            str4 = str5 == null ? "null" : str5;
        } catch (Throwable th4) {
            l9m.d(this.f, sgm.f16581l, "BSAStatEx", th4);
        }
        l9m.b(this.f, sgm.f16581l, "BSADone-" + str4);
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        l9m.b(this.f, sgm.f16581l, "BSAEmpty");
        return f617j;
    }

    public final String f(String str, String str2, PackageInfo packageInfo) {
        String str3 = packageInfo != null ? packageInfo.versionName : "";
        qrm.h(ham.A, "pay payInvokeAct");
        l9m.c(this.f, sgm.f16581l, sgm.X, str2 + "|" + str3);
        Activity activity = this.a;
        qam qamVar = this.f;
        l9m.a(activity, qamVar, str, qamVar.d);
        return e(str, str2);
    }

    public final String g(String str, String str2, PackageInfo packageInfo, com.alipay.sdk.m.u.a.c cVar) {
        String str3;
        Activity activity;
        boolean zContains = false;
        int i2 = packageInfo != null ? packageInfo.versionCode : 0;
        qrm.h(ham.A, "pay bind or scheme");
        qam qamVar = this.f;
        if (qamVar != null && !TextUtils.isEmpty(qamVar.g)) {
            zContains = this.f.g.toLowerCase().contains(sgm.f16582n);
        }
        if (zContains || !com.alipay.sdk.m.u.a.M(this.f, str2)) {
            if (cVar != null) {
                try {
                    if (!h9m.I().w()) {
                        j(cVar);
                    }
                } catch (Throwable unused) {
                }
            }
            Pair<String, Boolean> pairA = a(str, str2, this.f);
            str3 = (String) pairA.first;
            try {
                if (i.equals(str3) && ((Boolean) pairA.second).booleanValue() && h9m.I().u()) {
                    l9m.b(this.f, sgm.f16581l, "BindRetry");
                    str3 = (String) a(str, str2, this.f).first;
                }
            } catch (Throwable th) {
                l9m.d(this.f, sgm.f16581l, "BindRetryEx", th);
            }
        } else {
            if (cVar != null) {
                try {
                    if (h9m.I().G()) {
                        j(cVar);
                    }
                } catch (Throwable unused2) {
                }
            }
            l9m.b(this.f, sgm.f16581l, "BindSkipByL");
            str3 = i;
        }
        qrm.h(ham.A, "pay bind result: " + str3);
        Activity activity2 = this.a;
        qam qamVar2 = this.f;
        l9m.a(activity2, qamVar2, str, qamVar2.d);
        if (i.equals(str3)) {
            if (!com.alipay.sdk.m.u.a.b.equals(str2)) {
                l9m.c(this.f, sgm.f16581l, "BSPNotStartByAlipay", str2 + "|" + i2);
                return str3;
            }
            if (i2 >= 460 && !zContains && (activity = this.a) != null && k(str2, activity, this.f)) {
                return f(str, str2, packageInfo);
            }
        }
        return str3;
    }

    public String h(String str, boolean z) {
        com.alipay.sdk.m.u.a.c cVarH;
        String strA = "";
        PackageInfo packageInfo = null;
        try {
            List<h9m.b> listS = h9m.I().s();
            if (!h9m.I().g || listS == null) {
                listS = gam.d;
            }
            cVarH = com.alipay.sdk.m.u.a.h(this.f, this.a, listS);
            if (cVarH != null) {
                try {
                    if (cVarH.b(this.f) || cVarH.a() || com.alipay.sdk.m.u.a.v(cVarH.a)) {
                        return i;
                    }
                    PackageInfo packageInfo2 = cVarH.a;
                    strA = (packageInfo2 == null || com.alipay.sdk.m.u.a.b.equals(packageInfo2.packageName)) ? com.alipay.sdk.m.u.a.A() : cVarH.a.packageName;
                    PackageInfo packageInfo3 = cVarH.a;
                    packageInfo = packageInfo3 != null ? packageInfo3 : null;
                    String strL = h9m.I().l();
                    if (strL != null && strL.length() > 0) {
                        try {
                            JSONObject jSONObjectOptJSONObject = new JSONObject(strL).optJSONObject(strA);
                            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    int i2 = Integer.parseInt(next);
                                    if (packageInfo != null && packageInfo.versionCode >= i2) {
                                        try {
                                            boolean zJ = h9m.I().j(this.a, Integer.parseInt(jSONObjectOptJSONObject.getString(next)));
                                            this.g = zJ;
                                            if (zJ) {
                                                break;
                                            }
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    l9m.d(this.f, sgm.f16581l, sgm.N, th);
                }
                return ((z || this.g) && !com.alipay.sdk.m.u.a.F(this.f) && k(strA, this.a, this.f)) ? f(str, strA, packageInfo) : g(str, strA, packageInfo, cVarH);
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            cVarH = null;
        }
    }

    public void i() {
        this.a = null;
        this.f619e = null;
    }

    public final void j(com.alipay.sdk.m.u.a.c cVar) throws InterruptedException {
        PackageInfo packageInfo;
        if (cVar == null || (packageInfo = cVar.a) == null) {
            return;
        }
        String str = packageInfo.packageName;
        Intent intent = new Intent();
        intent.setClassName(str, "com.alipay.android.app.TransProcessPayActivity");
        try {
            this.a.startActivity(intent);
        } catch (Throwable th) {
            l9m.d(this.f, sgm.f16581l, sgm.g0, th);
        }
        Thread.sleep(200L);
    }
}
