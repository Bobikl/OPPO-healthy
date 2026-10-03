package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.instant.router.callback.Callback;

/* JADX INFO: loaded from: classes16.dex */
public class nrm extends ibm {

    public class a extends ws2 {
        public final /* synthetic */ Callback a;

        public a(nrm nrmVar, Callback callback) {
            this.a = callback;
        }

        @Override // com.oplus.aiunit.vision.ws2
        public void a(ws2.a aVar) {
            Callback.Response response = new Callback.Response();
            response.setCode(aVar.a());
            response.setMsg(aVar.b());
            this.a.onResponse(response);
        }
    }

    public nrm(nhm nhmVar) {
        super(nhmVar);
    }

    public final ws2 a(Callback callback) {
        if (callback != null) {
            return new a(this, callback);
        }
        return null;
    }

    @Override // com.oplus.instant.router.Instant.Req
    public void preload(Context context) {
        x7f.c cVarG = com.oplus.quickgame.sdk.engine.utils.a.g(context, this.f, this.a, this.b, this.f12469c, this.d, a(this.f12470e));
        if (cVarG != null) {
            cVarG.a(context);
        } else {
            mrm.i(context.getApplicationContext(), this.f, this.a, this.b, this.f12469c, this.d, this.f12470e);
        }
    }

    @Override // com.oplus.instant.router.Instant.Req
    public void request(Context context) {
        x7f.c cVarG = com.oplus.quickgame.sdk.engine.utils.a.g(context, this.f, this.a, this.b, this.f12469c, this.d, a(this.f12470e));
        if (cVarG == null) {
            mrm.s(context, this.f, this.a, this.b, this.f12469c, this.d, this.f12470e);
        } else {
            cVarG.b(context);
            epm.b("XGame_Router_TAG", "router newEngineRequest.request ");
        }
    }
}
