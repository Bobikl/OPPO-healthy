package com.omron;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class r extends ab {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final w f9071e;

    @NonNull
    private final LinkedHashMap<String, ad> f;

    @NonNull
    private final s g;

    @NonNull
    private final ah h;

    public class a extends ah.i {

        /* JADX INFO: renamed from: com.omron.r$a$a, reason: collision with other inner class name */
        public class RunnableC0858a implements Runnable {
            final /* synthetic */ BluetoothDevice a;
            final /* synthetic */ int b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f9072c;

            public RunnableC0858a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                this.a = bluetoothDevice;
                this.b = i;
                this.f9072c = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.a(this.a, this.b, this.f9072c);
            }
        }

        public a() {
        }

        @Override // com.omron.ah.i
        public void a(@NonNull BluetoothDevice bluetoothDevice, int i, @NonNull byte[] bArr) {
            if (r.this.c().a()) {
                r.this.a(bluetoothDevice, i, bArr);
            } else {
                r.this.c().post(new RunnableC0858a(bluetoothDevice, i, bArr));
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ en a;
        final /* synthetic */ List b;

        public b(en enVar, List list) {
            this.a = enVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(r.this.f9071e.a(this.b));
            this.a.c();
        }
    }

    public class c implements Runnable {
        final /* synthetic */ Bundle a;

        public c(Bundle bundle) {
            this.a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.a(this.a);
        }
    }

    public class d implements ad.o {

        public class a implements Runnable {
            final /* synthetic */ ad a;

            public a(ad adVar) {
                this.a = adVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.a(r.this, this.a);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ ad a;

            public b(ad adVar) {
                this.a = adVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.d(r.this, this.a);
            }
        }

        public class c implements Runnable {
            final /* synthetic */ ad a;

            public c(ad adVar) {
                this.a = adVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.b(r.this, this.a);
            }
        }

        /* JADX INFO: renamed from: com.omron.r$d$d, reason: collision with other inner class name */
        public class RunnableC0859d implements Runnable {
            final /* synthetic */ ad a;
            final /* synthetic */ ag b;

            public RunnableC0859d(ad adVar, ag agVar) {
                this.a = adVar;
                this.b = agVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.a(r.this, this.a, this.b);
            }
        }

        public class e implements Runnable {
            final /* synthetic */ ad a;
            final /* synthetic */ af b;

            public e(ad adVar, af afVar) {
                this.a = adVar;
                this.b = afVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.a(r.this, this.a, this.b);
            }
        }

        public class f implements Runnable {
            final /* synthetic */ ad a;

            public f(ad adVar) {
                this.a = adVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.c(r.this, this.a);
            }
        }

        public class g implements Runnable {
            final /* synthetic */ ad a;
            final /* synthetic */ p.h b;

            public g(ad adVar, p.h hVar) {
                this.a = adVar;
                this.b = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.a(r.this, this.a, this.b);
            }
        }

        public class h implements Runnable {
            final /* synthetic */ ad a;
            final /* synthetic */ p.g b;

            public h(ad adVar, p.g gVar) {
                this.a = adVar;
                this.b = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.a(r.this, this.a, this.b);
            }
        }

        public class i implements Runnable {
            final /* synthetic */ ad a;
            final /* synthetic */ p.i b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f9078c;

            public i(ad adVar, p.i iVar, int i) {
                this.a = adVar;
                this.b = iVar;
                this.f9078c = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.g.a(r.this, this.a, this.b, this.f9078c);
            }
        }

        public d() {
        }

        @Override // com.omron.ad.o
        public void a(@NonNull ad adVar) {
            if (r.this.c().a()) {
                r.this.g.a(r.this, adVar);
            } else {
                r.this.c().post(new a(adVar));
            }
        }

        @Override // com.omron.ad.o
        public void b(@NonNull ad adVar) {
            if (r.this.c().a()) {
                r.this.g.b(r.this, adVar);
            } else {
                r.this.c().post(new c(adVar));
            }
        }

        @Override // com.omron.ad.o
        public void c(@NonNull ad adVar) {
            if (r.this.c().a()) {
                r.this.g.d(r.this, adVar);
            } else {
                r.this.c().post(new b(adVar));
            }
        }

        @Override // com.omron.ad.o
        public void a(@NonNull ad adVar, @NonNull af afVar) {
            if (r.this.c().a()) {
                r.this.g.a(r.this, adVar, afVar);
            } else {
                r.this.c().post(new e(adVar, afVar));
            }
        }

        @Override // com.omron.ad.o
        public void a(@NonNull ad adVar, @NonNull ag agVar) {
            if (r.this.c().a()) {
                r.this.g.a(r.this, adVar, agVar);
            } else {
                r.this.c().post(new RunnableC0859d(adVar, agVar));
            }
        }

        @Override // com.omron.ad.o
        public void a(@NonNull ad adVar, @NonNull p.g gVar) {
            if (r.this.c().a()) {
                r.this.g.a(r.this, adVar, gVar);
            } else {
                r.this.c().post(new h(adVar, gVar));
            }
        }

        @Override // com.omron.ad.o
        public void a(@NonNull ad adVar, @NonNull p.h hVar) {
            if (r.this.c().a()) {
                r.this.g.a(r.this, adVar, hVar);
            } else {
                r.this.c().post(new g(adVar, hVar));
            }
        }

        @Override // com.omron.ad.o
        public void a(@NonNull ad adVar, @NonNull p.i iVar, int i2) {
            if (r.this.c().a()) {
                r.this.g.a(r.this, adVar, iVar, i2);
            } else {
                r.this.c().post(new i(adVar, iVar, i2));
            }
        }

        @Override // com.omron.ad.o
        public void a(@NonNull ad adVar, @NonNull y.a aVar) {
            if (r.this.c().a()) {
                r.this.g.c(r.this, adVar);
            } else {
                r.this.c().post(new f(adVar));
            }
        }
    }

    public class e extends BroadcastReceiver {

        public class a implements Runnable {
            final /* synthetic */ Intent a;

            public a(Intent intent) {
                this.a = intent;
            }

            @Override // java.lang.Runnable
            public void run() {
                r.this.a(this.a);
            }
        }

        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context, @NonNull Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            aa.a();
            if (r.this.c().a()) {
                r.this.a(intent);
            } else {
                r.this.c().post(new a(intent));
            }
        }
    }

    public class f implements Runnable {
        final /* synthetic */ ad a;

        public f(ad adVar) {
            this.a = adVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.b(this.a);
        }
    }

    public class g implements Runnable {
        final /* synthetic */ ad a;

        public g(ad adVar) {
            this.a = adVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.a(this.a);
        }
    }

    public class h implements Runnable {
        final /* synthetic */ en a;
        final /* synthetic */ String b;

        public h(en enVar, String str) {
            this.a = enVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(r.this.a(this.b));
            this.a.c();
        }
    }

    public class i implements Runnable {
        final /* synthetic */ List a;

        public i(List list) {
            this.a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.a((List<aj>) this.a);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.g();
        }
    }

    public class k implements Runnable {
        final /* synthetic */ en a;
        final /* synthetic */ List b;

        public k(en enVar, List list) {
            this.a = enVar;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(r.this.f9071e.b(this.b));
            this.a.c();
        }
    }

    public r(@NonNull Context context, @NonNull s sVar, @Nullable Looper looper) {
        super(context, looper);
        this.f9071e = new w();
        this.f = new LinkedHashMap<>();
        this.g = sVar;
        this.h = new ah(context, new a(), looper);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(y.a);
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        b().registerReceiver(new e(), intentFilter);
        f();
    }

    @NonNull
    private ad a(@NonNull BluetoothDevice bluetoothDevice) {
        return new ad(b(), bluetoothDevice, new d(), c().getLooper());
    }

    private void e() {
        Iterator<Map.Entry<String, ad>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().u();
        }
    }

    private void f() {
        this.f.clear();
        Set<BluetoothDevice> bondedDevices = a().getBondedDevices();
        if (bondedDevices != null) {
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                this.f.put(bluetoothDevice.getAddress(), a(bluetoothDevice));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (ac.PoweredOn != d()) {
            aa.f("Bluetooth not work.");
        } else {
            this.h.b();
        }
    }

    public Bundle b(@Nullable List<w.b> list) {
        Bundle bundleA;
        if (c().a()) {
            bundleA = this.f9071e.a(list);
        } else {
            en enVar = new en();
            c().post(new b(enVar, list));
            enVar.b();
            bundleA = (Bundle) enVar.a();
        }
        aa.a(bundleA.toString());
        return bundleA;
    }

    public Bundle c(@Nullable List<w.b> list) {
        Bundle bundleB;
        if (c().a()) {
            bundleB = this.f9071e.b(list);
        } else {
            en enVar = new en();
            c().post(new k(enVar, list));
            enVar.b();
            bundleB = (Bundle) enVar.a();
        }
        aa.a(bundleB.toString());
        return bundleB;
    }

    @Override // com.omron.ab
    public /* bridge */ /* synthetic */ ac d() {
        return super.d();
    }

    public void h() {
        if (c().a()) {
            g();
        } else {
            c().post(new j());
        }
    }

    @Nullable
    public ad b(@NonNull String str) {
        if (c().a()) {
            return a(str);
        }
        en enVar = new en();
        c().post(new h(enVar, str));
        enVar.b();
        return (ad) enVar.a();
    }

    public void d(@NonNull ad adVar) {
        if (c().a()) {
            b(adVar);
        } else {
            c().post(new f(adVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public ad a(@NonNull String str) {
        if (this.f.containsKey(str)) {
            ad adVar = this.f.get(str);
            aa.a("From the cache.");
            return adVar;
        }
        try {
            ad adVarA = a(a().getRemoteDevice(str));
            this.f.put(str, adVarA);
            aa.a("From the OS.");
            return adVarA;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void b(@NonNull Bundle bundle) {
        aa.a(bundle.toString());
        if (c().a()) {
            a(bundle);
        } else {
            c().post(new c(bundle));
        }
    }

    public void c(@NonNull ad adVar) {
        if (c().a()) {
            a(adVar);
        } else {
            c().post(new g(adVar));
        }
    }

    public void d(@NonNull List<aj> list) {
        if (c().a()) {
            a(list);
        } else {
            c().post(new i(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull ad adVar) {
        if (ac.PoweredOn != d()) {
            aa.b("Bluetooth not work.");
        } else {
            adVar.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull BluetoothDevice bluetoothDevice, int i2, @NonNull byte[] bArr) {
        ad adVar;
        if (this.f.containsKey(bluetoothDevice.getAddress())) {
            adVar = this.f.get(bluetoothDevice.getAddress());
        } else {
            aa.c("New peripheral detected. addr:" + bluetoothDevice.getAddress());
            ad adVarA = a(bluetoothDevice);
            this.f.put(bluetoothDevice.getAddress(), adVarA);
            adVar = adVarA;
        }
        this.g.a(this, adVar, bArr, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull Intent intent) {
        p.g gVar;
        String address = ((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")).getAddress();
        String action = intent.getAction();
        if (!this.f.containsKey(address)) {
            aa.f("Ignore the " + action + " broadcast. target:" + address);
            return;
        }
        ad adVar = this.f.get(address);
        if (y.a.equals(action)) {
            y.a aVarA = y.a.a(intent.getIntExtra(y.b, -1));
            aa.d("Received ACTION_PAIRING_REQUEST of " + address + ". variant:" + aVarA.name());
            adVar.a(aVarA);
            return;
        }
        if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
            p.h hVarA = p.h.a(intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 10));
            p.h hVarA2 = p.h.a(intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10));
            aa.d("Received ACTION_BOND_STATE_CHANGED[" + hVarA.name() + " -> " + hVarA2.name() + "] of " + address + ".");
            adVar.b(hVarA2);
            return;
        }
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
            aa.d("Received ACTION_ACL_CONNECTED of " + address + ".");
            gVar = p.g.Connected;
        } else {
            if (!"android.bluetooth.device.action.ACL_DISCONNECTED".equals(action)) {
                return;
            }
            aa.d("Received ACTION_ACL_DISCONNECTED of " + address + ".");
            gVar = p.g.Disconnected;
        }
        adVar.b(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull Bundle bundle) {
        this.f9071e.a(bundle);
        Iterator<Map.Entry<String, ad>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().a(bundle);
        }
    }

    @Override // com.omron.ab
    public void a(@NonNull ac acVar) {
        if (ac.PoweredOff == acVar) {
            e();
        } else if (ac.PoweredOn == acVar) {
            f();
        }
        this.g.a(this, acVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull ad adVar) {
        if (ac.PoweredOn != d()) {
            aa.b("Bluetooth not work.");
        } else {
            adVar.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull List<aj> list) {
        if (ac.PoweredOn != d()) {
            aa.b("Bluetooth not work.");
        } else {
            this.h.b(list, 0);
        }
    }
}
