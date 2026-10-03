package com.omron;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AndroidRuntimeException;
import com.omron.Cdo;
import com.omron.lib.common.OMRONBLEErrMsg;
import com.omron.lib.ohc.OHQDeviceManager;
import com.omron.lib.utils.OmronLogVisibleUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class al {

    @NonNull
    private final b b;
    private boolean d;
    private final aq f;
    private boolean h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8809e = "";

    @NonNull
    private final Runnable g = new a();

    @NonNull
    private final el a = new el();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final OHQDeviceManager f8808c = OHQDeviceManager.sharedInstance();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            al.this.e();
            al.this.b.onFailure(OMRONBLEErrMsg.OMRON_SDK_NoDevice);
        }
    }

    public interface b {
        void a(@NonNull bo boVar);

        void a(@NonNull Cdo cdo);

        void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg);
    }

    public al(@NonNull aq aqVar, @NonNull b bVar) {
        this.f = aqVar;
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        an.a();
        if (this.d) {
            this.a.removeCallbacks(this.g);
            this.d = false;
            this.f8808c.stopScan();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        a(ds.BloodPressureMonitor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a(ds.BodyCompositionMonitor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        a(ds.PulseOximeter);
    }

    public void e() {
        ay.a("ScanController", "结束扫描", new Object[0]);
        this.a.post(new Runnable() { // from class: com.oplus.aiunit.vision.zdm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final Cdo cdo) {
        this.a.post(new Runnable() { // from class: com.oplus.aiunit.vision.ydm
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b(cdo);
            }
        });
    }

    public void a(int i) {
        ay.a("ScanController", "开始扫描", new Object[0]);
        if (i == 1) {
            this.a.post(new Runnable() { // from class: com.oplus.aiunit.vision.aem
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.b();
                }
            });
        }
        if (i == 4) {
            this.a.post(new Runnable() { // from class: com.oplus.aiunit.vision.bem
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.c();
                }
            });
        }
        if (i == 5) {
            this.a.post(new Runnable() { // from class: com.oplus.aiunit.vision.cem
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.d();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(@NonNull Cdo cdo) {
        an.c(cdo.name());
        this.a.removeCallbacks(this.g);
        this.d = false;
        if (!this.h) {
            this.b.a(cdo);
        } else {
            this.h = false;
            a(ds.BodyCompositionMonitor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map) {
        a((Map<dt, Object>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final Map map) {
        this.a.post(new Runnable() { // from class: com.oplus.aiunit.vision.fem
            @Override // java.lang.Runnable
            public final void run() {
                this.i.b(map);
            }
        });
    }

    private void a(@Nullable ds dsVar) {
        an.a();
        if (this.d) {
            ay.a("ScanController", "已经正在扫描中", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (dsVar != null) {
            ay.a("filteringDeviceCategory:" + dsVar, new Object[0]);
            arrayList.add(dsVar);
        }
        this.f8808c.scanForDevicesWithCategories(arrayList, new OHQDeviceManager.a0() { // from class: com.oplus.aiunit.vision.dem
            @Override // com.omron.lib.ohc.OHQDeviceManager.a0
            public final void a(Map map) {
                this.a.c(map);
            }
        }, new OHQDeviceManager.w() { // from class: com.oplus.aiunit.vision.eem
            @Override // com.omron.lib.ohc.OHQDeviceManager.w
            public final void a(Cdo cdo) {
                this.a.c(cdo);
            }
        });
        this.d = true;
        this.a.postDelayed(this.g, 30000L);
    }

    private void a(@NonNull Map<dt, Object> map) {
        ay.a("扫描到的目标设备：" + map.toString(), new Object[0]);
        if (!this.d) {
            ay.b("scan is stopped", new Object[0]);
            return;
        }
        dt dtVar = dt.AddressKey;
        if (!map.containsKey(dtVar)) {
            throw new AndroidRuntimeException("The address must be present.");
        }
        String str = (String) eo.a(map.get(dtVar));
        if (str == null) {
            throw new AndroidRuntimeException("The address must be present.");
        }
        bo boVar = new bo(str);
        dt dtVar2 = dt.AdvertisementDataKey;
        if (map.containsKey(dtVar2)) {
            boVar.a((List<by>) eo.a(map.get(dtVar2)));
        }
        dt dtVar3 = dt.CategoryKey;
        if (map.containsKey(dtVar3)) {
            boVar.a((ds) eo.a(map.get(dtVar3)));
        }
        dt dtVar4 = dt.RSSIKey;
        if (map.containsKey(dtVar4)) {
            boVar.a(((Integer) eo.a(map.get(dtVar4))).intValue());
        }
        dt dtVar5 = dt.ModelNameKey;
        if (map.containsKey(dtVar5)) {
            boVar.c((String) eo.a(map.get(dtVar5)));
        }
        dt dtVar6 = dt.LocalNameKey;
        if (map.containsKey(dtVar6)) {
            boVar.b((String) eo.a(map.get(dtVar6)));
        }
        if (boVar.b() == null || this.f8809e.equals(boVar.b())) {
            return;
        }
        String strB = boVar.b();
        this.f8809e = strB;
        ay.a("ScanController", "onScan device: %s", OmronLogVisibleUtil.getMessage(strB));
        String str2 = this.f8809e;
        Objects.requireNonNull(str2);
        if (str2.toLowerCase().startsWith(this.f.a().toLowerCase())) {
            this.b.a(boVar);
        }
    }
}
