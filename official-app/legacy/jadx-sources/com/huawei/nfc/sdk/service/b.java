package com.huawei.nfc.sdk.service;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.oplus.aiunit.vision.dl9;
import com.oplus.aiunit.vision.el9;
import com.oplus.aiunit.vision.f1n;
import com.oplus.aiunit.vision.fl9;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public WeakReference b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ICUPOnlinePayService f8568c;
    public fl9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8569e;
    public final byte[] a = new byte[0];
    public ServiceConnection f = new a(this);
    public ICUPOnlinePayCallBackService g = new ICUPOnlinePayCallBackService.Stub() { // from class: com.huawei.nfc.sdk.service.HwOpenPayTask$1
        @Override // com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService
        public void onError(String str, String str2) {
            f1n.c("HwOpenPayTask", "getUnionOnlinePayStatus---onError--- errorCode is " + str + " and errorMsg is " + str2);
            b.a(this.this$0);
            if (this.this$0.f8569e) {
                this.this$0.i();
            }
        }

        @Override // com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService
        public void onResult(Bundle bundle) {
            f1n.c("HwOpenPayTask", "getUnionOnlinePayStatus---onResult---");
            b.a(this.this$0);
            if (this.this$0.f8569e) {
                this.this$0.i();
            }
        }
    };

    public b(Context context) {
        this.b = new WeakReference(context);
    }

    public static /* synthetic */ el9 a(b bVar) {
        bVar.getClass();
        return null;
    }

    public final void i() {
        if (this.f8569e) {
            this.f8569e = false;
            this.f8568c = null;
            if (this.b == null || this.f == null) {
                return;
            }
            f1n.c("HwOpenPayTask", "---unbindService---start");
            try {
                Context context = (Context) this.b.get();
                if (context != null) {
                    context.unbindService(this.f);
                }
            } catch (Exception unused) {
            }
            f1n.c("HwOpenPayTask", "---unbindService---end");
        }
    }

    public final void j() {
        f1n.c("HwOpenPayTask", "--failResult--:");
        fl9 fl9Var = this.d;
        if (fl9Var != null) {
            fl9Var.a(0, new Bundle());
        }
        i();
    }

    public final void k() {
        String str;
        String str2;
        Context context;
        synchronized (this.a) {
            if (this.f8568c == null) {
                Intent intent = new Intent("com.huawei.nfc.action.OPEN_AIDL_API_PAY");
                intent.setPackage("com.huawei.wallet");
                f1n.c("HwOpenPayTask", "---bindService---start");
                WeakReference weakReference = this.b;
                boolean zBindService = (weakReference == null || (context = (Context) weakReference.get()) == null) ? false : context.bindService(intent, this.f, 1);
                f1n.c("HwOpenPayTask", "---bindService---end:" + zBindService);
                if (zBindService) {
                    this.f8569e = true;
                    if (this.f8568c == null) {
                        try {
                            f1n.c("HwOpenPayTask", "--waiting--");
                            this.a.wait();
                        } catch (Exception unused) {
                            f1n.d("HwOpenPayTask", "---InterruptedException--");
                            j();
                        }
                    } else {
                        str = "HwOpenPayTask";
                        str2 = "---initNfcService---isConnection mOpenService not null";
                    }
                } else {
                    j();
                }
                throw th;
            }
            str = "HwOpenPayTask";
            str2 = "---initNfcService---mOpenService not null";
            f1n.c(str, str2);
        }
    }

    public void l(String str, fl9 fl9Var) {
        Executors.newCachedThreadPool().execute(new dl9(this, fl9Var, str));
    }
}
