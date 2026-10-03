package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.heytap.sports.move.treadmill.manager.RunData;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class rbk implements fy3 {
    public static final int CONNECTED = 1;
    public static final int CONNECT_FAIL = 0;
    public static final int DISCONNECTED = 2;
    public static final int STATUS_IDLE = 0;
    public static final int STATUS_PAUSE = 2;
    public static final int STATUS_START = 1;
    public static final int STATUS_STOP = 3;
    public static final String TAG = "TreadmillManager";
    public rg1 d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16160j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MutableLiveData<RunData> f16161l;
    public MutableLiveData<Integer> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MutableLiveData<Integer> f16162n;
    public MutableLiveData<BluetoothDevice> o;
    public e2g p;
    public gbk q;
    public RunData r;
    public ih1 s;
    public final int a = 4;
    public final int b = 20000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f16158c = {7, -102, 1, 0, 0, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f16159e = new Handler(Looper.getMainLooper());
    public int f = 0;
    public volatile boolean g = false;
    public volatile boolean h = false;
    public int i = 0;

    public class a implements ih1 {
        public volatile boolean a = false;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str) {
            rbk.this.B(str);
        }

        @Override // com.oplus.aiunit.vision.ih1
        public void a(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (bluetoothDevice == null || bluetoothDevice.getAddress() == null) {
                return;
            }
            if (rbk.this.z(nc1.c(bArr))) {
                e(bluetoothDevice.getAddress());
            }
        }

        @Override // com.oplus.aiunit.vision.ih1
        public void b() {
            if (this.a) {
                return;
            }
            rbk.this.J();
        }

        @Override // com.oplus.aiunit.vision.ih1
        public void c() {
            if (this.a) {
                return;
            }
            rbk.this.J();
        }

        public final void e(final String str) {
            rbk.this.h = false;
            this.a = true;
            rbk.this.U();
            rbk.this.f16159e.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.qbk
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.f(str);
                }
            }, 300L);
        }
    }

    public static class b {
        public static rbk a = new rbk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(boolean z, final String str, hh1 hh1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("resultCode:");
        sb.append(hh1Var.a());
        sb.append("   success:");
        sb.append(hh1Var.c());
        sb.append("   retryCount:");
        sb.append(this.f);
        sb.append("   retryConnect:");
        sb.append(z);
        if (hh1Var.c()) {
            T();
            K();
            return;
        }
        this.d.B(this);
        if (!z || this.f >= 4 || !BluetoothUtil.INSTANCE.j()) {
            J();
            T();
            return;
        }
        rg1 rg1Var = this.d;
        if (rg1Var != null) {
            rg1Var.h();
            this.f16159e.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.obk
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.B(str);
                }
            }, this.f * 2 * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(byte[] bArr) {
        L(new mh7(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(hh1 hh1Var) {
        if (hh1Var.c()) {
            this.d.j(iq0.FTMS, iq0.FITNESS_MACHINE_STATUS).a(new c83() { // from class: com.oplus.aiunit.vision.mbk
                @Override // com.oplus.aiunit.vision.c83
                public final void onCharacteristicChanged(byte[] bArr) {
                    this.a.D(bArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(byte[] bArr) {
        N(new ebk(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(hh1 hh1Var) {
        this.d.j(iq0.FTMS, iq0.TREADMILL_DATA).b(new fbk()).a(new c83() { // from class: com.oplus.aiunit.vision.pbk
            @Override // com.oplus.aiunit.vision.c83
            public final void onCharacteristicChanged(byte[] bArr) {
                this.a.F(bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(byte[] bArr) {
        O(new gbk(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(hh1 hh1Var) {
        this.d.j(iq0.FTMS, iq0.FTMS_EXT_NOTIFY_CHAR).a(new c83() { // from class: com.oplus.aiunit.vision.nbk
            @Override // com.oplus.aiunit.vision.c83
            public final void onCharacteristicChanged(byte[] bArr) {
                this.a.H(bArr);
            }
        });
    }

    public static rbk u() {
        return b.a;
    }

    public boolean A() {
        return this.p != null;
    }

    public final void J() {
        this.g = false;
        MutableLiveData<Integer> mutableLiveData = this.m;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(0);
        }
    }

    public final void K() {
        this.g = false;
        rg1 rg1Var = this.d;
        if (rg1Var != null) {
            this.k = rg1Var.m();
            P();
        }
        MutableLiveData<Integer> mutableLiveData = this.m;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(1);
        }
    }

    public final void L(mh7 mh7Var) {
        int iE = mh7Var.e();
        StringBuilder sb = new StringBuilder();
        sb.append("onMachineStatusChanged:");
        sb.append(iE);
        if (iE != 2) {
            if (iE == 3) {
                this.i = 3;
                M();
            } else if (iE == 4) {
                this.i = 1;
            }
        } else if (mh7Var.f() == 2) {
            this.i = 2;
        } else {
            this.i = 3;
            M();
        }
        if (w().getValue() == null || w().getValue().intValue() != this.i) {
            w().postValue(Integer.valueOf(this.i));
        }
    }

    public final void M() {
        e2g e2gVar = this.p;
        if (e2gVar != null) {
            e2gVar.a();
        }
    }

    public final synchronized void N(ebk ebkVar) {
        RunData runDataR;
        if (ebkVar.m()) {
            runDataR = r(ebkVar, false);
        } else {
            runDataR = this.r != null ? r(ebkVar, true) : null;
        }
        if (runDataR != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("data.isEffectiveData():");
            sb.append(ebkVar.m());
            sb.append("      ");
            sb.append(runDataR.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n                源数据:");
        sb2.append(new RunData(ebkVar.h().intValue(), ebkVar.g().intValue(), 0, ebkVar.i().intValue(), ebkVar.f().intValue(), ebkVar.e().intValue(), false).toString());
        if (runDataR == null) {
            return;
        }
        e2g e2gVar = this.p;
        if (e2gVar != null) {
            e2gVar.b(runDataR);
        }
        v().postValue(runDataR);
    }

    public final void O(gbk gbkVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("step:");
        if (gbkVar.e() != null) {
            str = gbkVar.e() + "";
        } else {
            str = "null";
        }
        sb.append(str);
        if (gbkVar.e() != null) {
            this.q = gbkVar;
        }
    }

    public void P() {
        rg1 rg1Var = this.d;
        UUID uuid = iq0.FTMS;
        rg1Var.C(uuid, iq0.FITNESS_MACHINE_STATUS, true).r(new qg1() { // from class: com.oplus.aiunit.vision.jbk
            @Override // com.oplus.aiunit.vision.qg1
            public final void a(hh1 hh1Var) {
                this.a.E(hh1Var);
            }
        });
        this.d.C(uuid, iq0.TREADMILL_DATA, true).r(new qg1() { // from class: com.oplus.aiunit.vision.kbk
            @Override // com.oplus.aiunit.vision.qg1
            public final void a(hh1 hh1Var) {
                this.a.G(hh1Var);
            }
        });
        rg1 rg1Var2 = this.d;
        UUID uuid2 = iq0.FTMS_EXT_NOTIFY_CHAR;
        if (rg1Var2.t(uuid, uuid2)) {
            this.d.C(uuid, uuid2, true).r(new qg1() { // from class: com.oplus.aiunit.vision.lbk
                @Override // com.oplus.aiunit.vision.qg1
                public final void a(hh1 hh1Var) {
                    this.a.I(hh1Var);
                }
            });
        }
    }

    public void Q() {
        this.i = 1;
        w().postValue(1);
    }

    public void R(qg1 qg1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("readTrainingStatus  mClient:");
        sb.append(this.d);
        rg1 rg1Var = this.d;
        if (rg1Var != null) {
            rg1Var.z(iq0.FTMS, iq0.TRAINING_STATUS).r(qg1Var);
        }
    }

    public void S() {
        T();
        this.p = null;
        rg1 rg1Var = this.d;
        if (rg1Var != null) {
            rg1Var.h();
            this.d.B(this);
            this.d = null;
        }
        if (this.m != null) {
            this.m = null;
        }
        if (this.o != null) {
            this.o = null;
        }
        if (this.s != null) {
            this.s = null;
        }
        if (this.f16161l != null) {
            this.f16161l = null;
        }
        if (this.f16162n != null) {
            this.f16162n = null;
        }
        if (this.r != null) {
            this.r = null;
        }
        this.i = 0;
    }

    public final void T() {
        this.f = 0;
    }

    public void U() {
        mh1.f().n();
    }

    @Override // com.oplus.aiunit.vision.fy3
    public void a(String str, boolean z) {
        T();
        if (z) {
            return;
        }
        MutableLiveData<Integer> mutableLiveData = this.m;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(2);
        }
        M();
    }

    public void n(e2g e2gVar) {
        this.p = e2gVar;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void B(String str) {
        p(str, true);
    }

    public void p(String str, final boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("connectByMac: mac = ");
        sb.append(str);
        if (str == null) {
            return;
        }
        final String upperCase = str.toUpperCase();
        if (this.g && (str2 = this.k) != null && str2.equals(upperCase)) {
            return;
        }
        if (x() && this.d.m().equals(upperCase)) {
            return;
        }
        rg1 rg1Var = this.d;
        if (rg1Var != null) {
            rg1Var.h();
            this.d = null;
        }
        this.r = null;
        this.q = null;
        this.k = upperCase;
        this.f++;
        rg1 rg1VarF = new rg1.b(b78.a(), upperCase).f();
        this.d = rg1VarF;
        rg1VarF.g(this);
        this.d.i().r(new qg1() { // from class: com.oplus.aiunit.vision.ibk
            @Override // com.oplus.aiunit.vision.qg1
            public final void a(hh1 hh1Var) {
                this.a.C(z, upperCase, hh1Var);
            }
        });
    }

    public void q(String str) {
        String str2;
        if (this.h && (str2 = this.f16160j) != null && str2.equals(str)) {
            return;
        }
        this.f16160j = str;
        keg.a aVar = new keg.a();
        aVar.j(str);
        aVar.l(iq0.FTMS);
        aVar.k(1946, new byte[]{1, 0, 0, 1});
        mh1.f().k(new keg.b().c(20000).a(aVar).b(), new a());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[PHI: r0 r1 r3 r4
  0x00c2: PHI (r0v4 java.lang.Integer) = (r0v2 java.lang.Integer), (r0v7 java.lang.Integer) binds: [B:35:0x00bf, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r1v5 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v7 java.lang.Integer) binds: [B:35:0x00bf, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r3v3 java.lang.Integer) = (r3v1 java.lang.Integer), (r3v6 java.lang.Integer) binds: [B:35:0x00bf, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]
  0x00c2: PHI (r4v3 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v6 java.lang.Integer) binds: [B:35:0x00bf, B:20:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    public final RunData r(ebk ebkVar, boolean z) {
        gbk gbkVar = this.q;
        Integer numValueOf = 0;
        int iIntValue = gbkVar != null ? gbkVar.e().intValue() : 0;
        Integer numH = ebkVar.h();
        Integer numG = ebkVar.g();
        Integer numI = ebkVar.i();
        Integer numF = ebkVar.f();
        Integer numE = ebkVar.e();
        StringBuilder sb = new StringBuilder();
        sb.append("convert: instantaneousSpeed:");
        sb.append(numG);
        sb.append("  totalDistance:");
        sb.append(numH);
        sb.append("  totalEnergy:");
        sb.append(numI);
        sb.append("  elapsedTime:");
        sb.append(numE);
        sb.append("  heartRate:");
        sb.append(numF);
        if (this.r != null) {
            if (numH.intValue() == -1) {
                numH = Integer.valueOf(this.r.totalDistance);
            }
            if (numG.intValue() == -1) {
                numG = Integer.valueOf(this.r.speed);
            }
            if (numI.intValue() == -1) {
                numI = Integer.valueOf(this.r.totalEnergy);
            }
            if (numF.intValue() == -1) {
                numF = Integer.valueOf(this.r.heartRate);
            }
            if (numE.intValue() == -1) {
                numValueOf = Integer.valueOf(this.r.elapsedTime);
            } else {
                numValueOf = numE;
            }
        } else {
            if (numH.intValue() == -1) {
                numH = numValueOf;
            }
            if (numG.intValue() == -1) {
                numG = numValueOf;
            }
            if (numI.intValue() == -1) {
                numI = numValueOf;
            }
            if (numF.intValue() == -1) {
                numF = numValueOf;
            }
            if (numE.intValue() != -1) {
                numValueOf = numE;
            }
        }
        RunData runData = new RunData(numH.intValue(), numG.intValue(), iIntValue, numI.intValue(), numF.intValue(), numValueOf.intValue(), z);
        this.r = runData;
        return runData;
    }

    public String s() {
        return this.k;
    }

    public MutableLiveData<Integer> t() {
        if (this.m == null) {
            this.m = new MutableLiveData<>();
        }
        return this.m;
    }

    public MutableLiveData<RunData> v() {
        if (this.f16161l == null) {
            this.f16161l = new MutableLiveData<>();
        }
        return this.f16161l;
    }

    public MutableLiveData<Integer> w() {
        if (this.f16162n == null) {
            this.f16162n = new MutableLiveData<>();
        }
        return this.f16162n;
    }

    public boolean x() {
        rg1 rg1Var = this.d;
        return rg1Var != null && rg1Var.v();
    }

    public boolean y(String str) {
        return x() && str != null && str.toUpperCase().equals(this.d.m());
    }

    public final boolean z(nc1 nc1Var) {
        List<nc1.a> list;
        if (nc1Var == null || (list = nc1Var.b) == null) {
            return false;
        }
        for (nc1.a aVar : list) {
            if (aVar.b == 255 && qd2.f(aVar.f14437c, this.f16158c)) {
                return true;
            }
        }
        return false;
    }
}
