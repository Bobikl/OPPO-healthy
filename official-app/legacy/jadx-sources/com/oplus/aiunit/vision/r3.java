package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r3 {
    public int a;
    public Object d;
    public volatile ccd<Object> g;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16032c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public xdd f16033e = new xdd() { // from class: com.oplus.aiunit.vision.m3
        @Override // com.oplus.aiunit.vision.xdd
        public final jdd a(lbd lbdVar) {
            return this.a.n(lbdVar);
        }
    };
    public xdd f = new xdd() { // from class: com.oplus.aiunit.vision.n3
        @Override // com.oplus.aiunit.vision.xdd
        public final jdd a(lbd lbdVar) {
            return this.a.o(lbdVar);
        }
    };
    public hji h = hji.c();
    public aed i = new a();

    public class a implements aed {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            zlj.a(r3.this + " --> Observer onComplete ");
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            zlj.c(r3.this + " --> Observer onError " + erk.a(th));
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(Object obj) {
            zlj.a(r3.this + " --> Observer onNext " + obj);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            zlj.a(r3.this + " --> Observer onSubscribe " + aVar);
        }
    }

    public static String j() {
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (TextUtils.isEmpty(currentConnectId)) {
            return null;
        }
        return currentConnectId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd l(Throwable th) throws Throwable {
        String strA = erk.a(th);
        if (strA.contains("WS_SYNC_ERROR_DISCONNECT") || TextUtils.equals(strA, "WS_SYNC_ERROR_DISCONNECT") || !gl4.managerApi.isCurrentConnected()) {
            zlj.c(this + " xxxxxxxxx -> retryWhen -> do not retry becase have not node connected :" + this.a);
            if (strA.contains("WS_SYNC_ERROR_DISCONNECT") || !TextUtils.equals(strA, "WS_SYNC_ERROR_DISCONNECT")) {
                th = new RuntimeException("WS_SYNC_ERROR_DISCONNECT");
            }
            return lbd.O(th);
        }
        if (strA.contains("a request is running") || "a request is running".equals(strA) || "ERROR_SPACE_NOT_AVAILABLE(存储空间不足)".equals(strA)) {
            return lbd.O(new Throwable(" -> retryWhen ->  do not retry resion ->" + strA));
        }
        int i = this.a + 1;
        this.a = i;
        if (i >= 1) {
            this.a = 0;
            return lbd.O(new Throwable(String.format(Locale.getDefault(), " -> retryWhen ->  retry %d times over ！！！%s ", 1, strA)));
        }
        zlj.c(this + " -->retry :" + this.a + " ->error:" + strA);
        return lbd.h0(" xxxxxxxxx -> retryWhen ->  retry :" + this.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() throws Throwable {
        p(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd n(lbd lbdVar) {
        return lbdVar.L0(su8.e()).F(new Cdo() { // from class: com.oplus.aiunit.vision.o3
            @Override // com.oplus.aiunit.vision.Cdo
            public final void run() throws Throwable {
                this.i.m();
            }
        }).v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ jdd o(lbd lbdVar) {
        return lbdVar.D0(new d08() { // from class: com.oplus.aiunit.vision.p3
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.h((lbd) obj);
            }
        });
    }

    public MessageEvent f(int i, byte[] bArr) {
        return new MessageEvent(i >> 8, i & 255, bArr);
    }

    public int g(MessageEvent messageEvent) {
        return (messageEvent.getServiceId() << 8) | messageEvent.getCommandId();
    }

    public final jdd<Object> h(lbd<Throwable> lbdVar) {
        return lbdVar.Q(new d08() { // from class: com.oplus.aiunit.vision.q3
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return this.i.l((Throwable) obj);
            }
        });
    }

    public abstract int[] i();

    public final <T> T k(T t) {
        this.d = t;
        return t;
    }

    public void p(Object obj) {
        zlj.a(this.g + " vvvvv  onComplete  -->" + this);
        if (this.g == null || this.g.isDisposed()) {
            zlj.c(this + " onComplete  error --> ", this.g);
        } else {
            if (obj != null) {
                this.g.onNext(obj);
            }
            this.g.onComplete();
        }
        t();
    }

    public synchronized void q(Throwable th) {
        if (this.g != null) {
            if (this.g.isDisposed()) {
                t();
            } else {
                this.h.g(this);
                this.g.onError(th);
            }
        }
        zlj.c(this + " onError --> ", this.g);
    }

    public abstract void r(MessageEvent messageEvent);

    public void s(Node node) {
        zlj.c(" xxxxx  onPeerDisconnected   -->" + this);
        this.h.g(this);
        q(new RuntimeException("WS_SYNC_ERROR_DISCONNECT"));
    }

    public void t() {
        if (i().length > 0) {
            r3 r3VarB = this.h.b(i()[0]);
            if (r3VarB != null) {
                zlj.a(" releaseEmitter  -->" + r3VarB);
                if (r3VarB.g != null) {
                    r3VarB.g.onComplete();
                }
                r3VarB.g = null;
            }
        }
        this.h.g(this);
        this.g = null;
    }

    public String toString() {
        int[] iArrI = i();
        if (iArrI == null || iArrI.length <= 0) {
            return "AbsCourier{} " + getClass().getName();
        }
        int i = iArrI[0];
        return "AbsCourier{} SID:" + (i >> 8) + " CID:" + (i & 255) + " TYPE:" + i + " = " + getClass().getName();
    }

    @SuppressLint({"DefaultLocale"})
    public final boolean u(MessageEvent messageEvent) {
        ol4 ol4Var = gl4.managerApi;
        if (!ol4Var.isCurrentConnected()) {
            zlj.c(this + "  --> ColorosApiClient connect error");
            q(new IllegalAccessError("WS_SYNC_ERROR_DISCONNECT"));
            return false;
        }
        if (TextUtils.isEmpty(ol4Var.getCurrentConnectId())) {
            zlj.c(this + "  --> sendMessage ColorConnectManager FromPhoneContactPair macAddress is empty! ");
            q(new IllegalAccessError("WS_SYNC_ERROR_DISCONNECT"));
            return false;
        }
        if (!TextUtils.isEmpty(this.f16032c) || !TextUtils.isEmpty(this.b)) {
            zlj.d(this + String.format("-->> 开始请求 - request --> %s -- %s  -->>", this.b, this.f16032c));
        }
        erk.g(this.d);
        zlj.a(String.format(" sendMsgByApi --> %s -->>>", this));
        gl4.devicePrimary.messageApi.b(messageEvent);
        return true;
    }
}
