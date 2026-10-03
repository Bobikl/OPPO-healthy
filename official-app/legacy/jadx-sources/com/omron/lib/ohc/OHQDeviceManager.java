package com.omron.lib.ohc;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.omron.Cdo;
import com.omron.ac;
import com.omron.ad;
import com.omron.af;
import com.omron.ag;
import com.omron.aj;
import com.omron.by;
import com.omron.cu;
import com.omron.cx;
import com.omron.cy;
import com.omron.dp;
import com.omron.dq;
import com.omron.dr;
import com.omron.ds;
import com.omron.dt;
import com.omron.du;
import com.omron.dx;
import com.omron.el;
import com.omron.en;
import com.omron.eo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class OHQDeviceManager {
    public static final int DEFAULT_CONSENT_CODE = 526;

    @Nullable
    private static OHQDeviceManager sInstance;

    @NonNull
    private final com.omron.r mCBCentralManager;

    @NonNull
    private final el mHandler;

    @Nullable
    private w mScanCompletionBlock;

    @Nullable
    private a0 mScanObserverBlock;

    @NonNull
    private final LinkedHashMap<ad, b0> mSessionInfoList = new LinkedHashMap<>();

    @Nullable
    private c0 mStateMonitor;

    public class a implements Runnable {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            OHQDeviceManager.this._cancelSessionWithDevice(this.a, Cdo.Canceled);
        }
    }

    public interface a0 {
        void a(@NonNull Map<dt, Object> map);
    }

    public class b implements com.omron.s {
        public b() {
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ac acVar) {
            OHQDeviceManager.this._didStateChanged(acVar);
        }

        @Override // com.omron.s
        public void b(@NonNull com.omron.r rVar, @NonNull ad adVar) {
            OHQDeviceManager.this._didDisconnectPeripheral(adVar);
        }

        @Override // com.omron.s
        public void c(@NonNull com.omron.r rVar, @NonNull ad adVar) {
            if (OHQDeviceManager.this.mSessionInfoList.get(adVar) != null) {
                ((b0) OHQDeviceManager.this.mSessionInfoList.get(adVar)).f.a();
            }
        }

        @Override // com.omron.s
        public void d(@NonNull com.omron.r rVar, @NonNull ad adVar) {
            OHQDeviceManager.this._didFailToConnect(adVar);
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ad adVar) {
            OHQDeviceManager.this._didConnect(adVar);
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ad adVar, @NonNull af afVar) {
            dr drVar_convertDetailedState;
            if (OHQDeviceManager.this.mSessionInfoList.get(adVar) == null || (drVar_convertDetailedState = OHQDeviceManager.this._convertDetailedState(afVar)) == null) {
                return;
            }
            ((b0) OHQDeviceManager.this.mSessionInfoList.get(adVar)).f.a(drVar_convertDetailedState);
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ad adVar, @NonNull ag agVar) {
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ad adVar, @NonNull com.omron.p.g gVar) {
            if (OHQDeviceManager.this.mSessionInfoList.get(adVar) != null) {
                ((b0) OHQDeviceManager.this.mSessionInfoList.get(adVar)).f.a(gVar);
            }
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ad adVar, @NonNull com.omron.p.h hVar) {
            if (OHQDeviceManager.this.mSessionInfoList.get(adVar) != null) {
                ((b0) OHQDeviceManager.this.mSessionInfoList.get(adVar)).f.a(hVar);
            }
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ad adVar, @NonNull com.omron.p.i iVar, int i) {
            if (OHQDeviceManager.this.mSessionInfoList.get(adVar) != null) {
                ((b0) OHQDeviceManager.this.mSessionInfoList.get(adVar)).f.a(iVar);
            }
        }

        @Override // com.omron.s
        public void a(@NonNull com.omron.r rVar, @NonNull ad adVar, @NonNull byte[] bArr, int i) {
            OHQDeviceManager.this._didDiscover(adVar, bArr, i);
        }
    }

    public static class b0 {
        Timer a;
        y b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        x f9021c;
        w d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<dx, Object> f9022e;
        z f;
        com.omron.lib.ohc.a g;

        private b0() {
        }

        public /* synthetic */ b0(k kVar) {
            this();
        }
    }

    public class c implements a0 {
        final /* synthetic */ List a;
        final /* synthetic */ a0 b;

        public c(List list, a0 a0Var) {
            this.a = list;
            this.b = a0Var;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.a0
        public void a(@NonNull Map<dt, Object> map) {
            ds dsVar = (ds) eo.a(map.get(dt.CategoryKey));
            if (this.a.isEmpty() || this.a.contains(dsVar)) {
                this.b.a(map);
            } else {
                com.omron.lib.ohc.b.e("Not covered device category.");
            }
        }
    }

    public interface c0 {
        void a(@NonNull du duVar);
    }

    public class d implements w {
        final /* synthetic */ w a;

        public d(w wVar) {
            this.a = wVar;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.w
        public void a(@NonNull Cdo cdo) {
            com.omron.lib.ohc.b.d(cdo.name());
            OHQDeviceManager.this.mScanObserverBlock = null;
            OHQDeviceManager.this.mScanCompletionBlock = null;
            OHQDeviceManager.this.mCBCentralManager.h();
            this.a.a(cdo);
        }
    }

    public class e extends TimerTask {
        final /* synthetic */ ad a;
        final /* synthetic */ String b;

        public e(ad adVar, String str) {
            this.a = adVar;
            this.b = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (ag.Connecting != this.a.x()) {
                return;
            }
            OHQDeviceManager.this._cancelSessionWithDevice(this.b, Cdo.ConnectionTimedOut);
        }
    }

    public class f implements y {
        final /* synthetic */ y a;

        public f(y yVar) {
            this.a = yVar;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.y
        public void a(@NonNull dq dqVar, @NonNull Object obj) {
            com.omron.lib.ohc.b.d(dqVar.name());
            this.a.a(dqVar, obj);
        }
    }

    public class g implements x {
        final /* synthetic */ x a;

        public g(x xVar) {
            this.a = xVar;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.x
        public void a(@NonNull dp dpVar) {
            com.omron.lib.ohc.b.d(dpVar.name());
            this.a.a(dpVar);
        }
    }

    public class h implements w {
        final /* synthetic */ b0 a;
        final /* synthetic */ ad b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f9025c;

        public h(b0 b0Var, ad adVar, w wVar) {
            this.a = b0Var;
            this.b = adVar;
            this.f9025c = wVar;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.w
        public void a(@NonNull Cdo cdo) {
            com.omron.lib.ohc.b.d(cdo.name());
            this.a.a.cancel();
            OHQDeviceManager.this.mSessionInfoList.remove(this.b);
            this.f9025c.a(cdo);
        }
    }

    public class i implements z {
        final /* synthetic */ z a;

        public i(z zVar) {
            this.a = zVar;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a() {
            z zVar = this.a;
            if (zVar != null) {
                zVar.a();
            }
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull dr drVar) {
            z zVar = this.a;
            if (zVar != null) {
                zVar.a(drVar);
            }
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.g gVar) {
            z zVar = this.a;
            if (zVar != null) {
                zVar.a(gVar);
            }
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.h hVar) {
            z zVar = this.a;
            if (zVar != null) {
                zVar.a(hVar);
            }
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.i iVar) {
            z zVar = this.a;
            if (zVar != null) {
                zVar.a(iVar);
            }
        }
    }

    public class j implements w {
        final /* synthetic */ w a;
        final /* synthetic */ Cdo b;

        public j(w wVar, Cdo cdo) {
            this.a = wVar;
            this.b = cdo;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.w
        public void a(@NonNull Cdo cdo) {
            this.a.a(this.b);
        }
    }

    public class k implements Runnable {
        final /* synthetic */ c0 a;

        public k(c0 c0Var) {
            this.a = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            OHQDeviceManager.this.mStateMonitor = this.a;
        }
    }

    public class l implements com.omron.lib.ohc.a.g {
        final /* synthetic */ b0 a;
        final /* synthetic */ ad b;

        public l(b0 b0Var, ad adVar) {
            this.a = b0Var;
            this.b = adVar;
        }

        @Override // com.omron.lib.ohc.a.g
        public void a(@NonNull Cdo cdo) {
            OHQDeviceManager.this._abortCommunicationForPeripheral(this.b, cdo);
        }

        @Override // com.omron.lib.ohc.a.g
        public void a(@NonNull dq dqVar, @NonNull Object obj) {
            this.a.b.a(dqVar, obj);
        }

        @Override // com.omron.lib.ohc.a.g
        public void a(@NonNull dr drVar) {
            this.a.f.a(drVar);
        }
    }

    public class m implements w {
        final /* synthetic */ w a;
        final /* synthetic */ Cdo b;

        public m(w wVar, Cdo cdo) {
            this.a = wVar;
            this.b = cdo;
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.w
        public void a(@NonNull Cdo cdo) {
            this.a.a(this.b);
        }
    }

    public static /* synthetic */ class n {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[af.values().length];
            a = iArr;
            try {
                iArr[af.Unconnected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[af.ConnectStarting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[af.PairRemoving.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[af.Pairing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[af.GattConnecting.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[af.ServiceDiscovering.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[af.ConnectCanceling.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[af.CleanupConnection.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[af.ConnectionRetryReady.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[af.ConnectCanceled.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[af.ConnectionFailed.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[af.Connected.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[af.Disconnecting.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[af.Disconnected.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public class o implements Runnable {
        final /* synthetic */ en a;

        public o(en enVar) {
            this.a = enVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(du.a(OHQDeviceManager.this.mCBCentralManager.d()));
            this.a.c();
        }
    }

    public class p implements Runnable {
        final /* synthetic */ en a;
        final /* synthetic */ List b;

        public p(en enVar, List list) {
            this.a = enVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(OHQDeviceManager.this.mCBCentralManager.c(this.b));
            this.a.c();
        }
    }

    public class q implements Runnable {
        final /* synthetic */ en a;
        final /* synthetic */ List b;

        public q(en enVar, List list) {
            this.a = enVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(OHQDeviceManager.this.mCBCentralManager.b(this.b));
            this.a.c();
        }
    }

    public class r implements Runnable {
        final /* synthetic */ Bundle a;

        public r(Bundle bundle) {
            this.a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            OHQDeviceManager.this.mCBCentralManager.b(this.a);
        }
    }

    public class s implements Runnable {
        final /* synthetic */ List a;
        final /* synthetic */ a0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f9031c;

        public s(List list, a0 a0Var, w wVar) {
            this.a = list;
            this.b = a0Var;
            this.f9031c = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            OHQDeviceManager.this._scanForDevicesWithCategories(this.a, this.b, this.f9031c);
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OHQDeviceManager.this._stopScan(Cdo.Canceled);
        }
    }

    public class u implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ y b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f9032c;
        final /* synthetic */ w d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f9033e;

        public u(String str, y yVar, x xVar, w wVar, Map map) {
            this.a = str;
            this.b = yVar;
            this.f9032c = xVar;
            this.d = wVar;
            this.f9033e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            OHQDeviceManager.this._startSessionWithDevice(this.a, this.b, this.f9032c, this.d, this.f9033e, null);
        }
    }

    public class v implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ y b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f9034c;
        final /* synthetic */ w d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f9035e;
        final /* synthetic */ z f;

        public v(String str, y yVar, x xVar, w wVar, Map map, z zVar) {
            this.a = str;
            this.b = yVar;
            this.f9034c = xVar;
            this.d = wVar;
            this.f9035e = map;
            this.f = zVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            OHQDeviceManager.this._startSessionWithDevice(this.a, this.b, this.f9034c, this.d, this.f9035e, this.f);
        }
    }

    public interface w {
        void a(@NonNull Cdo cdo);
    }

    public interface x {
        void a(@NonNull dp dpVar);
    }

    public interface y {
        void a(@NonNull dq dqVar, @NonNull Object obj);
    }

    public interface z {
        void a();

        void a(@NonNull dr drVar);

        void a(@NonNull com.omron.p.g gVar);

        void a(@NonNull com.omron.p.h hVar);

        void a(@NonNull com.omron.p.i iVar);
    }

    private OHQDeviceManager(@NonNull Context context) {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName());
        handlerThread.start();
        el elVar = new el(handlerThread.getLooper());
        this.mHandler = elVar;
        this.mCBCentralManager = _initCentralManager(context, elVar.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _abortCommunicationForPeripheral(@NonNull ad adVar, @NonNull Cdo cdo) {
        com.omron.lib.ohc.b.d(cdo.name());
        if (!this.mSessionInfoList.containsKey(adVar)) {
            com.omron.lib.ohc.b.b("Invalid peripheral.");
            return;
        }
        b0 b0Var = this.mSessionInfoList.get(adVar);
        if (ag.Connected != adVar.x()) {
            com.omron.lib.ohc.b.b("Bad state.");
            return;
        }
        b0Var.d = new m(b0Var.d, cdo);
        b0Var.f9021c.a(dp.Disconnecting);
        this.mCBCentralManager.c(adVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _cancelSessionWithDevice(@NonNull String str, @NonNull Cdo cdo) {
        com.omron.lib.ohc.b.d(cdo.name());
        ad adVar = null;
        for (ad adVar2 : this.mSessionInfoList.keySet()) {
            if (str.equals(adVar2.g())) {
                adVar = adVar2;
            }
        }
        if (adVar == null) {
            com.omron.lib.ohc.b.b("invalid address");
            return;
        }
        b0 b0Var = this.mSessionInfoList.get(adVar);
        b0Var.d = new j(this.mSessionInfoList.get(adVar).d, cdo);
        b0Var.f9021c.a(dp.Disconnecting);
        this.mCBCentralManager.c(adVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public dr _convertDetailedState(af afVar) {
        switch (n.a[afVar.ordinal()]) {
            case 1:
                return dr.Unconnected;
            case 2:
                return dr.ConnectStarting;
            case 3:
                return dr.PairRemoving;
            case 4:
                return dr.Pairing;
            case 5:
                return dr.GattConnecting;
            case 6:
                return dr.ServiceDiscovering;
            case 7:
                return dr.ConnectCanceling;
            case 8:
                return dr.CleanupConnection;
            case 9:
                return dr.ConnectionRetryReady;
            case 10:
                return dr.ConnectCanceled;
            case 11:
                return dr.ConnectionFailed;
            case 12:
                return dr.CommunicationReady;
            case 13:
                return dr.Disconnecting;
            case 14:
                return dr.Disconnected;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _didConnect(@NonNull ad adVar) {
        com.omron.lib.ohc.b.a();
        if (!this.mSessionInfoList.containsKey(adVar)) {
            com.omron.lib.ohc.b.b("Invalid peripheral.");
            return;
        }
        b0 b0Var = this.mSessionInfoList.get(adVar);
        b0Var.a.cancel();
        b0Var.f9021c.a(dp.Connected);
        com.omron.lib.ohc.a aVar = new com.omron.lib.ohc.a(this.mHandler.getLooper(), adVar, new l(b0Var, adVar), b0Var.f9022e);
        aVar.d();
        b0Var.g = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _didDisconnectPeripheral(@NonNull ad adVar) {
        com.omron.lib.ohc.b.a();
        if (!this.mSessionInfoList.containsKey(adVar)) {
            com.omron.lib.ohc.b.b("Invalid peripheral.");
            return;
        }
        b0 b0Var = this.mSessionInfoList.get(adVar);
        b0Var.b.a(dq.MeasurementRecords, b0Var.g.c());
        b0Var.f9021c.a(dp.Disconnected);
        b0Var.d.a(Cdo.Disconnected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _didDiscover(@NonNull ad adVar, @NonNull byte[] bArr, int i2) {
        by next;
        List<by> listA = cx.a().a(bArr);
        ds dsVar_verifyingDeviceCategoryFromData = _verifyingDeviceCategoryFromData(listA);
        if (ds.Unknown == dsVar_verifyingDeviceCategoryFromData) {
            com.omron.lib.ohc.b.e("OHQDeviceCategory.Unknown == deviceCategory");
            return;
        }
        if (ds.BloodPressureMonitor == dsVar_verifyingDeviceCategoryFromData) {
            Iterator<by> it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof cy));
            listA.remove(next);
        }
        HashMap map = new HashMap();
        map.put(dt.AddressKey, adVar.g());
        map.put(dt.AdvertisementDataKey, listA);
        map.put(dt.RSSIKey, Integer.valueOf(i2));
        map.put(dt.CategoryKey, dsVar_verifyingDeviceCategoryFromData);
        if (adVar.l() != null) {
            map.put(dt.LocalNameKey, adVar.l());
        } else {
            com.omron.lib.ohc.b.e("Local name is null.");
        }
        com.omron.lib.ohc.b.a(map.toString());
        a0 a0Var = this.mScanObserverBlock;
        if (a0Var != null) {
            a0Var.a(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _didFailToConnect(@NonNull ad adVar) {
        com.omron.lib.ohc.b.a();
        if (!this.mSessionInfoList.containsKey(adVar)) {
            com.omron.lib.ohc.b.b("Invalid peripheral.");
            return;
        }
        b0 b0Var = this.mSessionInfoList.get(adVar);
        b0Var.f9021c.a(dp.Disconnected);
        b0Var.d.a(Cdo.FailedToConnect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _didStateChanged(@NonNull ac acVar) {
        com.omron.lib.ohc.b.d(acVar.name());
        if (ac.PoweredOff == acVar) {
            _stopScan(Cdo.PoweredOff);
        }
        c0 c0Var = this.mStateMonitor;
        if (c0Var != null) {
            c0Var.a(du.a(acVar));
        }
    }

    private void _executeCompletionBlock(@NonNull w wVar, @NonNull Cdo cdo) {
        wVar.a(cdo);
    }

    private com.omron.r _initCentralManager(@NonNull Context context, @NonNull Looper looper) {
        return new com.omron.r(context, new b(), looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _scanForDevicesWithCategories(@NonNull List<ds> list, @NonNull a0 a0Var, @NonNull w wVar) {
        com.omron.lib.ohc.b.d(list.toString());
        if (ac.PoweredOn != this.mCBCentralManager.d()) {
            _executeCompletionBlock(wVar, Cdo.PoweredOff);
        } else {
            if (this.mScanCompletionBlock != null) {
                _executeCompletionBlock(wVar, Cdo.Busy);
                return;
            }
            this.mScanObserverBlock = new c(list, a0Var);
            this.mScanCompletionBlock = new d(wVar);
            this.mCBCentralManager.d(new ArrayList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _startSessionWithDevice(@NonNull String str, @NonNull y yVar, @NonNull x xVar, @NonNull w wVar, @NonNull Map<dx, Object> map, @Nullable z zVar) {
        com.omron.lib.ohc.b.a();
        if (ac.PoweredOn != this.mCBCentralManager.d()) {
            com.omron.lib.ohc.b.b("Bluetooth not available.");
            _executeCompletionBlock(wVar, Cdo.PoweredOff);
            return;
        }
        ad adVarB = this.mCBCentralManager.b(str);
        if (adVarB == null) {
            com.omron.lib.ohc.b.b("Peripheral not found.");
            _executeCompletionBlock(wVar, Cdo.InvalidDeviceIdentifier);
            return;
        }
        if (ag.Disconnected != adVarB.x()) {
            com.omron.lib.ohc.b.b("Bad state.");
            _executeCompletionBlock(wVar, Cdo.Busy);
            return;
        }
        if (this.mSessionInfoList.containsKey(adVarB)) {
            com.omron.lib.ohc.b.b("Bad state.");
            _executeCompletionBlock(wVar, Cdo.Busy);
            return;
        }
        b0 b0Var = new b0(null);
        b0Var.a = new Timer(this.mHandler.getLooper().getThread().getName(), true);
        dx dxVar = dx.ConnectionWaitTimeKey;
        if (map.containsKey(dxVar)) {
            long jLongValue = ((Long) eo.a(map.get(dxVar))).longValue();
            com.omron.lib.ohc.b.a("connectionWaitTime:" + jLongValue);
            b0Var.a.schedule(new e(adVarB, str), jLongValue);
        }
        b0Var.b = new f(yVar);
        b0Var.f9021c = new g(xVar);
        b0Var.d = new h(b0Var, adVarB, wVar);
        b0Var.f9022e = map;
        b0Var.f = new i(zVar);
        this.mSessionInfoList.put(adVarB, b0Var);
        this.mCBCentralManager.d(adVarB);
        b0Var.f9021c.a(dp.Connecting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _stopScan(@NonNull Cdo cdo) {
        com.omron.lib.ohc.b.a();
        w wVar = this.mScanCompletionBlock;
        if (wVar != null) {
            wVar.a(cdo);
        }
    }

    @NonNull
    private ds _verifyingDeviceCategoryFromData(@NonNull List<by> list) {
        ds dsVar = ds.Unknown;
        boolean z2 = false;
        for (by byVar : list) {
            if (byVar instanceof cu) {
                for (UUID uuid : ((cu) byVar).d()) {
                    aj ajVar = new aj(uuid);
                    com.omron.lib.ohc.b.a(ajVar.toString());
                    if (com.omron.lib.ohc.e.BodyComposition.a().equals(ajVar)) {
                        dsVar = ds.BodyCompositionMonitor;
                    } else if (com.omron.lib.ohc.e.BloodPressure.a().equals(ajVar) || com.omron.lib.ohc.e.AFBloodPressure.a().equals(ajVar)) {
                        dsVar = ds.BloodPressureMonitor;
                    } else if (com.omron.lib.ohc.e.WeightScale.a().equals(ajVar)) {
                        dsVar = ds.WeightScale;
                    } else if (com.omron.lib.ohc.e.OmronCustomPLXService.a().equals(ajVar)) {
                        dsVar = ds.PulseOximeter;
                    } else if (com.omron.lib.ohc.e.HealthThermometer.a().equals(ajVar)) {
                        dsVar = ds.HealthThermometer;
                    }
                }
            } else if (byVar instanceof cy) {
                z2 = true;
            }
        }
        return (ds.WeightScale == dsVar && z2) ? ds.BodyCompositionMonitor : dsVar;
    }

    @NonNull
    public static OHQDeviceManager init(@NonNull Context context) {
        OHQDeviceManager oHQDeviceManager = sInstance;
        if (oHQDeviceManager != null) {
            return oHQDeviceManager;
        }
        OHQDeviceManager oHQDeviceManager2 = new OHQDeviceManager(context);
        sInstance = oHQDeviceManager2;
        return oHQDeviceManager2;
    }

    @NonNull
    public static OHQDeviceManager sharedInstance() {
        OHQDeviceManager oHQDeviceManager = sInstance;
        if (oHQDeviceManager != null) {
            return oHQDeviceManager;
        }
        throw new IllegalStateException("Instance has not been created.");
    }

    public void cancelSessionWithDevice(@NonNull String str) {
        com.omron.lib.ohc.b.a();
        this.mHandler.post(new a(str));
    }

    public Bundle getConfig(@Nullable List<com.omron.w.b> list) {
        if (this.mHandler.a()) {
            return this.mCBCentralManager.b(list);
        }
        en enVar = new en();
        this.mHandler.post(new q(enVar, list));
        enVar.b();
        return (Bundle) eo.a(enVar.a());
    }

    public Bundle getDefaultConfig(@Nullable List<com.omron.w.b> list) {
        if (this.mHandler.a()) {
            return this.mCBCentralManager.c(list);
        }
        en enVar = new en();
        this.mHandler.post(new p(enVar, list));
        enVar.b();
        return (Bundle) eo.a(enVar.a());
    }

    public void scanForDevicesWithCategories(@NonNull List<ds> list, @NonNull a0 a0Var, @NonNull w wVar) {
        com.omron.lib.ohc.b.a();
        this.mHandler.post(new s(list, a0Var, wVar));
    }

    public void setConfig(@NonNull Bundle bundle) {
        if (this.mHandler.a()) {
            this.mCBCentralManager.b(bundle);
        } else {
            this.mHandler.post(new r(bundle));
        }
    }

    public void setStateMonitor(@Nullable c0 c0Var) {
        this.mHandler.post(new k(c0Var));
    }

    public void startSessionWithDevice(@NonNull String str, @NonNull y yVar, @NonNull x xVar, @NonNull w wVar, @NonNull Map<dx, Object> map) {
        com.omron.lib.ohc.b.a();
        this.mHandler.post(new u(str, yVar, xVar, wVar, map));
    }

    @NonNull
    public du state() {
        if (this.mHandler.a()) {
            return du.a(this.mCBCentralManager.d());
        }
        en enVar = new en();
        this.mHandler.post(new o(enVar));
        enVar.b();
        return (du) eo.a(enVar.a());
    }

    public void stopScan() {
        com.omron.lib.ohc.b.a();
        this.mHandler.post(new t());
    }

    public void startSessionWithDevice(@NonNull String str, @NonNull y yVar, @NonNull x xVar, @NonNull w wVar, @NonNull Map<dx, Object> map, @NonNull z zVar) {
        com.omron.lib.ohc.b.a();
        this.mHandler.post(new v(str, yVar, xVar, wVar, map, zVar));
    }
}
