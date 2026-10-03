package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.wallet.bean.Content;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.network.script.params.ScriptRltVo;
import com.heytap.health.wallet.network.script.rsp.ScriptVo;
import com.heytap.wallet.business.common.constant.ReturnCode;

/* JADX INFO: loaded from: classes18.dex */
public class dld {
    public static final String CONTINUE = "continue";
    public static final String RETRY_EXECUTE = "retryExecute";
    public static final String SUCCESS = "success";
    public static final String TRANSACTION_ID = "transactionID";
    public static final long releaseJobTime = 20000;
    public Context a;
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f10614c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f10615e = new c();

    public class a extends w60<TaskResult> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            if (dld.this.b != null) {
                dld.this.b.a(String.valueOf(ReturnCode.OPEN_CARD_COMMAND_FAILED), String.valueOf(obj));
            }
            if (obj == null) {
                t6b.i("Wallet_MainActivity", "onFailedUI:null");
                return;
            }
            t6b.i("Wallet_MainActivity", "onFailedUI:" + obj.toString());
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(TaskResult taskResult) {
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ScriptVo f10616j;
        public final /* synthetic */ String k;

        public b(String str, ScriptVo scriptVo, String str2) {
            this.i = str;
            this.f10616j = scriptVo;
            this.k = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.i;
            if (str == null) {
                if (dld.this.b != null) {
                    dld.this.b.a(String.valueOf(ReturnCode.OPEN_CARD_COMMAND_FAILED), "transactionId is null");
                }
            } else if (str.equals(dld.this.d)) {
                dld.this.f10614c.l(this.f10616j, this.k);
            } else if (dld.this.b != null) {
                dld.this.b.a(String.valueOf(ReturnCode.OPEN_CARD_COMMAND_FAILED), "transactionId is invalid");
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (dld.this.f10614c != null) {
                dld.this.f10614c.j();
            } else {
                dld.this.d = null;
            }
        }
    }

    public class d extends d70<TaskResult> {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(5000L);
                } catch (InterruptedException e2) {
                    t6b.b("Wallet_MainActivity", "InterruptedException e =" + e2.getMessage());
                }
                if (dld.this.b != null) {
                    dld.this.b.a(String.valueOf(ReturnCode.OPEN_CARD_RETRY_CURRENT), dld.RETRY_EXECUTE);
                }
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ Content i;

            public b(Content content) {
                this.i = content;
            }

            @Override // java.lang.Runnable
            public void run() {
                TaskResult taskResultExecCommand = d.this.execCommand(this.i, false);
                t6b.i("Wallet_MainActivity", "[__result__]--->" + taskResultExecCommand.toString());
                ScriptRltVo scriptRltVoA = h74.a(taskResultExecCommand.getContent());
                String strE = scriptRltVoA != null ? GsonUtil.e(scriptRltVoA) : "";
                if (dld.this.b != null) {
                    dld.this.b.b(dld.CONTINUE, strE);
                }
            }
        }

        public final void j() {
            t6b.i("Wallet_MainActivity", "dispose");
            g();
            dld.this.f10614c = null;
            dld.this.d = null;
        }

        public boolean k(String str) {
            if (str == null || !str.equals(dld.this.d)) {
                return false;
            }
            t6b.i("Wallet_MainActivity", "dispose");
            g();
            dld.this.f10614c = null;
            dld.this.d = null;
            return true;
        }

        public void l(ScriptVo scriptVo, String str) {
            if (scriptVo == null || TextUtils.isEmpty(scriptVo.getNextStep())) {
                t6b.i("Wallet_MainActivity", "onSuccess,data is null");
                if (dld.this.b != null) {
                    dld.this.b.a(String.valueOf(ReturnCode.OPEN_CARD_COMMAND_FAILED), "result or nextStep is null");
                }
                j();
                return;
            }
            if (scriptVo.getNextStep().equals("EOF")) {
                t6b.i("Wallet_MainActivity", "commandType=" + str + "->FollowScriptListener onSuccess,executer command success");
                if (dld.this.b != null) {
                    dld.this.b.b("success", "");
                }
                dld.this.g(100, str);
                return;
            }
            dld.this.g(0, str);
            Content contentC = h74.c(scriptVo);
            t6b.i("Wallet_MainActivity", "[__command__]--->" + contentC);
            if (contentC.isEmpty()) {
                c(new a());
            } else {
                m(contentC);
            }
        }

        public final void m(Content content) {
            c(new b(content));
        }

        @Override // com.oplus.aiunit.vision.c70
        public void onStart() {
            t6b.i("Wallet_MainActivity", "ApduOpenCardJob onStart");
            dld.this.d = String.valueOf(System.currentTimeMillis()) + ((int) ((Math.random() * 99.0d) + 10.0d));
            dld.this.b.b(dld.TRANSACTION_ID, dld.this.d);
            b();
        }

        public d() {
        }
    }

    public interface e {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public interface f {
    }

    public dld(Context context) {
        this.a = context;
    }

    public final void g(int i, String str) {
    }

    public boolean h(String str) {
        d dVar = this.f10614c;
        if (dVar != null) {
            return dVar.k(str);
        }
        return true;
    }

    public void i(ScriptVo scriptVo, String str, e eVar, f fVar, String str2) {
        t6b.i("Wallet_MainActivity", "executeNextCommand start");
        if (eVar == null) {
            Context context = this.a;
            if (context instanceof Activity) {
                z0k.f(context).s(this.a, R$string.param_error);
                return;
            }
            return;
        }
        this.b = eVar;
        if (this.f10614c == null) {
            eVar.a(String.valueOf(ReturnCode.OPEN_CARD_COMMAND_FAILED), "inner error,job is null");
        } else {
            sr0.e(new b(str, scriptVo, str2));
        }
    }

    public void j(e eVar) {
        if (eVar == null) {
            Context context = this.a;
            if (context instanceof Activity) {
                z0k.f(context).s(this.a, R$string.param_error);
                return;
            }
            return;
        }
        this.b = eVar;
        d dVar = new d();
        d dVar2 = this.f10614c;
        if (dVar2 != null) {
            dVar2.j();
        }
        this.f10614c = dVar;
        tpc.b().g(dVar, new a());
    }

    public dld() {
    }
}
