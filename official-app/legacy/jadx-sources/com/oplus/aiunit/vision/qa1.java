package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.oplus.aiunit.vision.mm9;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes19.dex */
public abstract class qa1<V extends mm9> extends q11<V> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public os4 f15695n;
    public String p;
    public i11 q;
    public ExecutorService t;
    public boolean m = false;
    public long o = 0;
    public boolean r = false;
    public boolean s = false;

    public class a implements os4 {
        public final /* synthetic */ Bundle i;

        public a(Bundle bundle) {
            this.i = bundle;
        }

        @Override // com.oplus.aiunit.vision.os4
        public String getDeviceMac() {
            return qa1.this.p;
        }

        @Override // com.oplus.aiunit.vision.os4
        public void i6(String str, int i, int i2) {
            long jCurrentTimeMillis = System.currentTimeMillis() - qa1.this.o;
            ltl.a(qa1.this.k, "status: " + i + "commandId" + i2 + " syncTime " + jCurrentTimeMillis);
            if (qa1.this.s) {
                qa1.this.s = false;
                qa1.this.N(this.i, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        V vJ = j();
        if (vJ != null) {
            vJ.K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(int i) {
        V vJ = j();
        if (vJ != null) {
            if (i == 1) {
                vJ.x();
                return;
            }
            if (i == 3) {
                vJ.t();
                return;
            }
            if (i == 2) {
                vJ.B0();
            } else if (i == 4) {
                vJ.G0();
            } else if (i == 0) {
                vJ.v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(int i, Bundle bundle) {
        ltl.d(this.k, "[onStatusChanged] start load page.status " + i);
        if (i == -1) {
            B();
            P(bundle);
            if (this.f15695n != null) {
                ntl.m().t(this.f15695n);
            }
            this.m = true;
            return;
        }
        if (i != 6) {
            M(i);
            if (this.f15695n != null) {
                ntl.m().t(this.f15695n);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Bundle bundle) {
        V vJ = j();
        if (vJ != null) {
            E(bundle);
            vJ.O(bundle);
            D(bundle);
        }
    }

    public final void B() {
        Context contextI = i();
        if (contextI != null) {
            ((AppCompatActivity) contextI).runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.pa1
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.H();
                }
            });
        }
    }

    public i11 C() {
        return this.q;
    }

    public abstract void D(Bundle bundle);

    public void E(Bundle bundle) {
    }

    public final boolean F() {
        Proto$DeviceInfo proto$DeviceInfo = this.f15580l;
        if (proto$DeviceInfo == null) {
            return true;
        }
        this.p = proto$DeviceInfo.getDeviceMac();
        i11 i11VarJ = ntl.m().j(this.p);
        return i11VarJ == null || !i11VarJ.q();
    }

    public boolean G() {
        return this.m;
    }

    public void L() {
        if (this.f15695n != null) {
            this.f15695n = null;
        }
    }

    public final void M(final int i) {
        Context contextI = i();
        if (contextI != null) {
            ((AppCompatActivity) contextI).runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.oa1
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.I(i);
                }
            });
        }
    }

    public final void N(final Bundle bundle, final int i) {
        if (this.t == null) {
            this.t = zq8.e(this.k);
        }
        this.t.submit(new Runnable() { // from class: com.oplus.aiunit.vision.na1
            @Override // java.lang.Runnable
            public final void run() {
                this.i.J(i, bundle);
            }
        });
    }

    public void O(boolean z) {
        this.m = z;
    }

    public void P(final Bundle bundle) {
        i11 i11VarJ = ntl.m().j(this.p);
        this.q = i11VarJ;
        if (i11VarJ == null) {
            ltl.i(this.k, "[loadNormalView] mCurrentDataManager==null.");
            return;
        }
        if (this.f15580l == null) {
            this.f15580l = i11VarJ.h();
        }
        Context contextI = i();
        if (contextI != null) {
            ((AppCompatActivity) contextI).runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ma1
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.K(bundle);
                }
            });
        }
    }

    public void Q(Bundle bundle) {
        String str = this.p;
        if (str == null) {
            ltl.i(this.k, "[startSyncDeviceData] mDeviceMac==null");
            return;
        }
        if (str != null && gl4.managerApi.isStubModule()) {
            ltl.b(this.k, "[syncWatchFaceData] --> current operate watch  is in stub module");
            j().t();
            return;
        }
        String str2 = this.p;
        if (str2 != null && !gl4.managerApi.isConnected(str2)) {
            ltl.b(this.k, "[syncWatchFaceData] --> current operate watch  is not connected");
            j().B0();
            return;
        }
        if (!rpc.c()) {
            ltl.i(this.k, "[startSyncDeviceData] --> not network and sync failed. ");
            j().x();
            return;
        }
        j().A();
        this.m = false;
        if (this.f15695n == null) {
            this.f15695n = new a(bundle);
        }
        ntl.m().q(this.f15695n);
        this.s = true;
        jej.f().l(this.p);
    }

    public String getDeviceMac() {
        return this.p;
    }

    @Override // com.oplus.aiunit.vision.q11, com.oplus.aiunit.vision.ja1
    public void k(Intent intent) {
        super.k(intent);
        this.p = vda.k(intent, "currentMac");
        ltl.a(this.k, "[initArguments]  mDeviceMac " + this.p);
        this.r = F();
        if (this.f15580l == null && TextUtils.isEmpty(this.p)) {
            r();
            ltl.i(this.k, "[initArguments]  mDeviceInfo == null &&  mDeviceMac =null.and return.");
        }
    }

    @Override // com.oplus.aiunit.vision.ja1
    public void l(Bundle bundle) {
        ltl.d(this.k, "initData mIsNeedSync = " + this.r);
        if (this.r) {
            this.o = System.currentTimeMillis();
            Q(bundle);
        } else {
            this.p = this.f15580l.getDeviceMac();
            this.m = true;
            P(bundle);
        }
    }

    @Override // com.oplus.aiunit.vision.q11
    public void q() {
    }

    @Override // com.oplus.aiunit.vision.q11
    public Proto$DeviceInfo s() {
        return this.f15580l;
    }
}
