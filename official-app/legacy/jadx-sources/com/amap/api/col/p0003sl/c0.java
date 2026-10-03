package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.help.Tip;
import com.oplus.aiunit.vision.br9;
import com.oplus.aiunit.vision.hym;
import com.oplus.aiunit.vision.j9a;
import com.oplus.aiunit.vision.jzm;
import com.oplus.aiunit.vision.k9a;
import com.oplus.aiunit.vision.qxm;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements br9 {
    public Context a;
    public j9a.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f669c = v.a();
    public k9a d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = v.a().obtainMessage();
            messageObtainMessage.obj = c0.this.b;
            messageObtainMessage.arg1 = 5;
            try {
                try {
                    c0 c0Var = c0.this;
                    ArrayList<? extends Parcelable> arrayListE = c0Var.e(c0Var.d);
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("result", arrayListE);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.what = 1000;
                } catch (AMapException e2) {
                    messageObtainMessage.what = e2.getErrorCode();
                }
            } finally {
                c0.this.f669c.sendMessage(messageObtainMessage);
            }
        }
    }

    public c0(Context context, k9a k9aVar) {
        this.a = context.getApplicationContext();
        this.d = k9aVar;
    }

    @Override // com.oplus.aiunit.vision.br9
    public final void a(j9a.a aVar) {
        this.b = aVar;
    }

    @Override // com.oplus.aiunit.vision.br9
    public final void b() {
        try {
            jzm.a().b(new a());
        } catch (Throwable th) {
            qxm.g(th, "Inputtips", "requestInputtipsAsynThrowable");
        }
    }

    public final ArrayList<Tip> e(k9a k9aVar) throws AMapException {
        try {
            u.c(this.a);
            if (k9aVar == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (k9aVar.c() == null || k9aVar.c().equals("")) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new hym(this.a, k9aVar).m();
        } catch (Throwable th) {
            qxm.g(th, "Inputtips", "requestInputtips");
            if (th instanceof AMapException) {
                throw th;
            }
            return null;
        }
    }
}
