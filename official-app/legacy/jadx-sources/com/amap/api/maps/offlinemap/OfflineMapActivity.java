package com.amap.api.maps.offlinemap;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.amap.api.offlineservice.AMapPermissionActivity;
import com.oplus.aiunit.vision.kvm;
import com.oplus.aiunit.vision.kxm;
import com.oplus.aiunit.vision.lvm;
import com.oplus.aiunit.vision.xam;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes12.dex */
public class OfflineMapActivity extends AMapPermissionActivity implements View.OnClickListener {
    private static int a;
    private xam b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kvm f918c;
    private kvm[] d = new kvm[32];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f919e = -1;
    private lvm f;

    private void a(kvm kvmVar) {
        try {
            xam xamVar = this.b;
            if (xamVar != null) {
                xamVar.h();
                this.b = null;
            }
            xam xamVarC = c(kvmVar);
            this.b = xamVarC;
            if (xamVarC != null) {
                this.f918c = kvmVar;
                xamVarC.d(this);
                this.b.b();
                this.b.e();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void b(kvm kvmVar) {
        try {
            a++;
            a(kvmVar);
            int i = (this.f919e + 1) % 32;
            this.f919e = i;
            this.d[i] = kvmVar;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private xam c(kvm kvmVar) {
        try {
            if (kvmVar.a != 1) {
                return null;
            }
            if (this.f == null) {
                this.f = new lvm();
            }
            return this.f;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void closeScr() {
        try {
            if (a((Bundle) null)) {
                return;
            }
            xam xamVar = this.b;
            if (xamVar != null) {
                xamVar.h();
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    @SensorsDataInstrumented
    public void onClick(View view) {
        try {
            xam xamVar = this.b;
            if (xamVar != null) {
                xamVar.c(view);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        } catch (Throwable th) {
            th.printStackTrace();
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            getWindow().setSoftInputMode(32);
            getWindow().setFormat(-3);
            requestWindowFeature(1);
            kxm.f(getApplicationContext());
            this.f919e = -1;
            a = 0;
            b(new kvm());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
            xam xamVar = this.b;
            if (xamVar != null) {
                xamVar.h();
                this.b = null;
            }
            this.f918c = null;
            this.d = null;
            lvm lvmVar = this.f;
            if (lvmVar != null) {
                lvmVar.h();
                this.f = null;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            try {
                xam xamVar = this.b;
                if (xamVar != null && !xamVar.f()) {
                    return true;
                }
                if (a((Bundle) null)) {
                    return false;
                }
                if (keyEvent == null) {
                    if (a == 1) {
                        finish();
                    }
                    return false;
                }
                this.f919e = -1;
                a = 0;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        try {
            super.onPause();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.offlineservice.AMapPermissionActivity, android.app.Activity
    public void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        try {
            super.onStart();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        try {
            super.onStop();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void showScr() {
        try {
            setContentView(this.b.g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void closeScr(Bundle bundle) {
        try {
            if (a(bundle)) {
                return;
            }
            xam xamVar = this.b;
            if (xamVar != null) {
                xamVar.h();
            }
            finish();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(Bundle bundle) {
        try {
            int i = a;
            if ((i != 1 || this.b == null) && i > 1) {
                a = i - 1;
                int i2 = ((this.f919e - 1) + 32) % 32;
                this.f919e = i2;
                kvm kvmVar = this.d[i2];
                kvmVar.b = bundle;
                a(kvmVar);
                return true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }
}
