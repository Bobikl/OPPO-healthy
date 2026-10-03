package com.heytap.health.device.connect;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.devicemanager.api.TryConnectAutoService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.op.proto.SyncOOBEState;
import com.oplus.aiunit.vision.ald;
import com.oplus.aiunit.vision.ao0;
import com.oplus.aiunit.vision.bvf;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.jt9;
import com.oplus.aiunit.vision.kr0;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.mw0;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.uv0;
import com.oplus.aiunit.vision.v0j;
import com.oplus.aiunit.vision.xfl;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = TryConnectAutoService.SERVICE_CONNECT_AUTO)
public class TryConnectAutoServiceImpl implements TryConnectAutoService {
    public WeakReference<BaseActivity> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public kr0 f3908j;
    public jt9 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f3909l = 0;
    public final Object m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ald f3910n = new a();

    public class a implements ald {

        /* JADX INFO: renamed from: com.heytap.health.device.connect.TryConnectAutoServiceImpl$a$a, reason: collision with other inner class name */
        public class C0330a extends ao0<bvf<UserDeviceInfo>> {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ BaseActivity f3911j;
            public final /* synthetic */ int k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ int f3912l;

            public C0330a(BaseActivity baseActivity, int i, int i2) {
                this.f3911j = baseActivity;
                this.k = i;
                this.f3912l = i2;
            }

            @Override // com.oplus.aiunit.vision.ao0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(bvf<UserDeviceInfo> bvfVar) {
                UserDeviceInfo userDeviceInfoB = bvfVar.b();
                ml4.a("TryConnectAutoServiceImpl", "dbDeviceInfos: " + userDeviceInfoB);
                if (userDeviceInfoB != null) {
                    TryConnectAutoServiceImpl tryConnectAutoServiceImpl = TryConnectAutoServiceImpl.this;
                    tryConnectAutoServiceImpl.k = tryConnectAutoServiceImpl.q6(userDeviceInfoB.getMac());
                    TryConnectAutoServiceImpl.this.k.a(this.f3911j, this.k, userDeviceInfoB.getMac(), this.f3912l);
                }
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.ald
        public void a(@Nullable SyncOOBEState.SyncState syncState) {
            StringBuilder sb = new StringBuilder();
            sb.append("TryConnectAutoServiceImpl oobeStateNotifyListener, syncState is null: ");
            sb.append(syncState == null);
            ml4.a("TryConnectAutoServiceImpl", sb.toString());
            BaseActivity baseActivity = (BaseActivity) TryConnectAutoServiceImpl.this.i.get();
            if (TryConnectAutoServiceImpl.this.i == null || baseActivity == null) {
                ml4.d("TryConnectAutoServiceImpl", " onOobeStateNotifyL ,mWeak is null");
                return;
            }
            ol4 ol4Var = gl4.managerApi;
            String currentConnectId = ol4Var.getCurrentConnectId();
            if (TextUtils.isEmpty(currentConnectId)) {
                ml4.d("TryConnectAutoServiceImpl", " onOobeStateNotifyL ,connected devices is empty");
                return;
            }
            ml4.a("TryConnectAutoServiceImpl", "current connected device: " + v0j.b(currentConnectId));
            if (syncState == null) {
                ol4Var.m(currentConnectId).g().L0(su8.c()).n0(f30.c()).subscribe(new C0330a(baseActivity, 0, 0));
                return;
            }
            int result = syncState.getResult();
            int oobeFrom = syncState.getOobeFrom();
            ml4.a("TryConnectAutoServiceImpl", " onOobeStateNotifyL syncState: status == " + syncState.getResult() + ";productType == " + syncState.getDeviceType() + ";oobeFrom:" + oobeFrom);
            TryConnectAutoServiceImpl tryConnectAutoServiceImpl = TryConnectAutoServiceImpl.this;
            tryConnectAutoServiceImpl.k = tryConnectAutoServiceImpl.q6(currentConnectId);
            TryConnectAutoServiceImpl.this.k.a(baseActivity, result, currentConnectId, oobeFrom);
        }
    }

    @Override // com.heytap.health.devicemanager.api.TryConnectAutoService
    public void Y3(BaseActivity baseActivity) {
        synchronized (this.m) {
            this.f3909l++;
            this.i = new WeakReference<>(baseActivity);
            this.f3908j.a(this.f3910n);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ml4.a("TryConnectAutoServiceImpl", "TryConnectAutoServiceImpl init ");
        this.f3908j = kr0.e();
    }

    @Override // com.heytap.health.devicemanager.api.TryConnectAutoService
    public void onDestroy() {
        if (this.f3908j != null) {
            synchronized (this.m) {
                this.f3909l--;
                if (this.f3909l == 0) {
                    this.f3908j.h(this.f3910n);
                }
            }
        }
        jt9 jt9Var = this.k;
        if (jt9Var != null) {
            jt9Var.onDestroy();
        }
    }

    public final jt9 q6(String str) {
        return ((Boolean) lc5.c(str).a(new uv0())).booleanValue() ? mw0.r() : xfl.v(this.f3908j);
    }

    @Override // com.heytap.health.devicemanager.api.TryConnectAutoService
    public void y9() {
        BaseActivity baseActivity;
        ml4.d("TryConnectAutoServiceImpl", "dismissInitDialog()");
        jt9 jt9Var = this.k;
        if (jt9Var != null) {
            if (jt9Var instanceof mw0) {
                BaseActivity baseActivity2 = this.i.get();
                if (baseActivity2 == null || baseActivity2.isFinishing() || baseActivity2.isDestroyed()) {
                    return;
                }
                ((mw0) this.k).f();
                return;
            }
            if (!(jt9Var instanceof xfl) || (baseActivity = this.i.get()) == null || baseActivity.isFinishing() || baseActivity.isDestroyed()) {
                return;
            }
            ((xfl) this.k).f();
        }
    }
}
