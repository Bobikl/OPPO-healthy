package com.omron;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.omron.lib.ohc.OHQDeviceManager;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class am implements OHQDeviceManager.w, OHQDeviceManager.x, OHQDeviceManager.y, OHQDeviceManager.z {

    @NonNull
    private final bp a = new bp();

    @NonNull
    private final el b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final n f8810c;

    @Nullable
    private final OHQDeviceManager.z d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final OHQDeviceManager f8811e;

    @Nullable
    private String f;

    public class a implements Runnable {
        final /* synthetic */ p.h a;

        public a(p.h hVar) {
            this.a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.d != null) {
                am.this.d.a(this.a);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ p.g a;

        public b(p.g gVar) {
            this.a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.d != null) {
                am.this.d.a(this.a);
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ p.i a;

        public c(p.i iVar) {
            this.a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.d != null) {
                am.this.d.a(this.a);
            }
        }
    }

    public static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[dq.values().length];
            a = iArr;
            try {
                iArr[dq.DeviceCategory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[dq.SystemId.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[dq.ModelName.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[dq.SerialNumber.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[dq.FirmwareRevision.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[dq.HardwareRevision.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[dq.SoftwareRevision.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[dq.ManufacturerName.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[dq.CurrentTime.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[dq.BatteryLevel.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[dq.RegisteredUserIndex.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[dq.AuthenticatedUserIndex.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[dq.DeletedUserIndex.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[dq.UserData.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[dq.DatabaseChangeIncrement.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[dq.SequenceNumberOfLatestRecord.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[dq.MeasurementRecords.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ en a;

        public e(en enVar) {
            this.a = enVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(Boolean.valueOf(am.this.f != null));
            this.a.c();
        }
    }

    public class f implements Runnable {
        final /* synthetic */ Bundle a;

        public f(Bundle bundle) {
            this.a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            am.this.f8811e.setConfig(this.a);
        }
    }

    public class g implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Map b;

        public g(String str, Map map) {
            this.a = str;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            am.this.a(this.a, (Map<dx, Object>) this.b);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            am.this.b();
        }
    }

    public class i implements Runnable {
        final /* synthetic */ dq a;
        final /* synthetic */ Object b;

        public i(dq dqVar, Object obj) {
            this.a = dqVar;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            am.this.b(this.a, this.b);
        }
    }

    public class j implements Runnable {
        final /* synthetic */ dp a;

        public j(dp dpVar) {
            this.a = dpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            am.this.b(this.a);
        }
    }

    public class k implements Runnable {
        final /* synthetic */ Cdo a;

        public k(Cdo cdo) {
            this.a = cdo;
        }

        @Override // java.lang.Runnable
        public void run() {
            am.this.b(this.a);
        }
    }

    public class l implements Runnable {
        final /* synthetic */ dr a;

        public l(dr drVar) {
            this.a = drVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.d != null) {
                am.this.d.a(this.a);
            }
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (am.this.d != null) {
                am.this.d.a();
            }
        }
    }

    public interface n {
        void a(@NonNull bp bpVar);

        void a(@NonNull dp dpVar);
    }

    public am(@NonNull n nVar, @Nullable OHQDeviceManager.z zVar) {
        an.a();
        this.b = new el();
        this.f8810c = nVar;
        this.d = zVar;
        this.f8811e = OHQDeviceManager.sharedInstance();
    }

    public void c() {
        this.b.post(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        an.a();
        String str = this.f;
        if (str == null) {
            an.a("null == mSessionAddress");
        } else {
            this.f8811e.cancelSessionWithDevice(str);
            this.f = null;
        }
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.z
    public void a() {
        an.a();
        this.b.post(new m());
    }

    public boolean d() {
        if (this.b.a()) {
            return this.f != null;
        }
        en enVar = new en();
        this.b.post(new e(enVar));
        enVar.b();
        return ((Boolean) eo.a(enVar.a())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull Cdo cdo) {
        an.c(cdo.name());
        this.f = null;
        this.a.a(cdo);
        this.f8810c.a(this.a);
    }

    public void a(@NonNull Bundle bundle) {
        this.b.post(new f(bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull dp dpVar) {
        an.c(dpVar.name());
        this.f8810c.a(dpVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull dq dqVar, @NonNull Object obj) {
        int iIntValue;
        StringBuilder sb;
        switch (d.a[dqVar.ordinal()]) {
            case 1:
                ds dsVar = (ds) eo.a(obj);
                ay.a(dqVar.name() + " " + dsVar.name());
                this.a.a(dsVar);
                return;
            case 2:
                ay.a(dqVar.name() + " " + ((String) eo.a(obj)));
                return;
            case 3:
                String str = (String) eo.a(obj);
                ay.a(dqVar.name() + " " + str);
                this.a.e(str);
                return;
            case 4:
                String str2 = (String) eo.a(obj);
                ay.a(dqVar.name() + " " + str2);
                this.a.f(str2);
                return;
            case 5:
                String str3 = (String) eo.a(obj);
                ay.a(dqVar.name() + " " + str3);
                this.a.b(str3);
                return;
            case 6:
                String str4 = (String) eo.a(obj);
                ay.a(dqVar.name() + " " + str4);
                this.a.c(str4);
                return;
            case 7:
                String str5 = (String) eo.a(obj);
                ay.a(dqVar.name() + " " + str5);
                this.a.g(str5);
                return;
            case 8:
                String str6 = (String) eo.a(obj);
                ay.a(dqVar.name() + " " + str6);
                this.a.d(str6);
                return;
            case 9:
                String str7 = (String) eo.a(obj);
                ay.a(dqVar.name() + " " + str7);
                this.a.a(str7);
                return;
            case 10:
                ay.a(dqVar.name() + " " + ((Integer) eo.a(obj)).intValue());
                this.a.a((Integer) obj);
                return;
            case 11:
                iIntValue = ((Integer) eo.a(obj)).intValue();
                sb = new StringBuilder();
                break;
            case 12:
                iIntValue = ((Integer) eo.a(obj)).intValue();
                sb = new StringBuilder();
                break;
            case 13:
                iIntValue = ((Integer) eo.a(obj)).intValue();
                sb = new StringBuilder();
                break;
            case 14:
                Map<dy, Object> map = (Map) eo.a(obj);
                ay.a(dqVar.name() + " " + map);
                this.a.b(map);
                return;
            case 15:
                long jLongValue = ((Long) eo.a(obj)).longValue();
                ay.a(dqVar.name() + " " + jLongValue);
                this.a.a(Long.valueOf(jLongValue));
                return;
            case 16:
                int iIntValue2 = ((Integer) eo.a(obj)).intValue();
                ay.a(dqVar.name() + " " + iIntValue2);
                this.a.b(Integer.valueOf(iIntValue2));
                return;
            case 17:
                LinkedList linkedList = (LinkedList) eo.a(obj);
                ay.a(dqVar.name() + " " + linkedList);
                this.a.a(linkedList);
                return;
            default:
                return;
        }
        sb.append(dqVar.name());
        sb.append(" ");
        sb.append(iIntValue);
        ay.a(sb.toString());
        this.a.c(Integer.valueOf(iIntValue));
    }

    public void b(@NonNull String str, @NonNull Map<dx, Object> map) {
        this.b.post(new g(str, map));
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.w
    public void a(@NonNull Cdo cdo) {
        this.b.post(new k(cdo));
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.x
    public void a(@NonNull dp dpVar) {
        this.b.post(new j(dpVar));
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.y
    public void a(@NonNull dq dqVar, @NonNull Object obj) {
        this.b.post(new i(dqVar, obj));
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.z
    public void a(@NonNull dr drVar) {
        an.c(drVar.name());
        this.b.post(new l(drVar));
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.z
    public void a(@NonNull p.g gVar) {
        an.c(gVar.name());
        this.b.post(new b(gVar));
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.z
    public void a(@NonNull p.h hVar) {
        an.c(hVar.name());
        this.b.post(new a(hVar));
    }

    @Override // com.omron.lib.ohc.OHQDeviceManager.z
    public void a(@NonNull p.i iVar) {
        an.c(iVar.name());
        this.b.post(new c(iVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull String str, @NonNull Map<dx, Object> map) {
        an.c(str + " " + map.toString());
        if (this.f != null) {
            an.a("null != mSessionAddress");
            return;
        }
        this.a.a(map);
        this.f8811e.startSessionWithDevice(str, this, this, this, map, this);
        this.f = str;
    }
}
