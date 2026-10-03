package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.heytap.health.wallet.network.script.rsp.ScriptVo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public abstract class q21 {
    public static final int FAIL = 1;
    public static final int SUC = 0;
    public final String a = getClass().getSimpleName();
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15596c;

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f15597j;
        public final /* synthetic */ dld k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f15598l;
        public final /* synthetic */ Context m;

        public a(String str, String str2, dld dldVar, String str3, Context context) {
            this.i = str;
            this.f15597j = str2;
            this.k = dldVar;
            this.f15598l = str3;
            this.m = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            q21 q21Var = q21.this;
            ScriptVo scriptVoH = q21Var.h(q21Var.f15596c, this.i, this.f15597j);
            if (scriptVoH == null) {
                q21.this.i(1);
                return;
            }
            c cVarF = q21.this.f(this.k, scriptVoH, this.f15598l, this.f15597j);
            String str = cVarF.a;
            if (str == null) {
                q21.this.i(1);
            } else if ("success".equals(str)) {
                q21.this.i(0);
            } else {
                q21 q21Var2 = q21.this;
                q21Var2.e(this.m, this.k, this.f15598l, this.f15597j, q21Var2.f15596c, this.i, cVarF, scriptVoH);
            }
        }
    }

    public class b implements dld.e {
        public final /* synthetic */ c a;
        public final /* synthetic */ CountDownLatch b;

        public b(c cVar, CountDownLatch countDownLatch) {
            this.a = cVar;
            this.b = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void a(String str, String str2) {
            t6b.i(q21.this.a, "executeScrip onFailed,code=" + str + ",msg=" + str2);
            this.b.countDown();
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void b(String str, String str2) {
            t6b.i(q21.this.a, "executeScrip onSuccess");
            c cVar = this.a;
            cVar.a = str;
            cVar.b = str2;
            this.b.countDown();
        }
    }

    public class c {
        public String a;
        public String b;

        public c() {
        }
    }

    public q21(Handler handler, String str) {
        this.b = handler;
        this.f15596c = str;
    }

    public void d(Context context, dld dldVar, String str, String str2, String str3) {
        sr0.i(new a(str3, str2, dldVar, str, context));
    }

    public final void e(Context context, dld dldVar, String str, String str2, String str3, String str4, c cVar, ScriptVo scriptVo) {
        ScriptVo scriptVoG = g(str3, str4, str2, cVar, scriptVo);
        if (scriptVoG == null) {
            i(1);
            return;
        }
        c cVarF = f(dldVar, scriptVoG, str, str2);
        String str5 = cVarF.a;
        if (str5 == null) {
            i(1);
        } else if ("success".equals(str5)) {
            i(0);
        } else {
            e(context, dldVar, str, str2, str3, str4, cVarF, scriptVoG);
        }
    }

    public final c f(dld dldVar, ScriptVo scriptVo, String str, String str2) {
        t6b.i(this.a, "executeScrip start");
        c cVar = new c();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        dldVar.i(scriptVo, str, new b(cVar, countDownLatch), null, str2);
        try {
            countDownLatch.await(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            t6b.b(this.a, "InterruptedException e =" + e2.getMessage());
        }
        return cVar;
    }

    public abstract ScriptVo g(String str, String str2, String str3, c cVar, ScriptVo scriptVo);

    public abstract ScriptVo h(String str, String str2, String str3);

    public final void i(int i) {
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = i;
        this.b.sendMessage(messageObtainMessage);
    }
}
