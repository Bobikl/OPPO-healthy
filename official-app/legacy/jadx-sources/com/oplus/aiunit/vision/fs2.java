package com.oplus.aiunit.vision;

import com.heytap.epona.Request;
import com.heytap.epona.Response;

/* JADX INFO: loaded from: classes15.dex */
public class fs2 implements fea {
    public static /* synthetic */ void c(Request request, vr2 vr2Var, Response response) {
        s7b.b("CallComponentInterceptor", "Component(%s).Action(%s) response : %s", request.getComponentName(), request.getActionName(), response);
        vr2Var.onReceive(response);
    }

    @Override // com.oplus.aiunit.vision.fea
    public void a(fea.a aVar) {
        final Request request = aVar.request();
        t76 t76VarC = fp6.c(request.getComponentName());
        if (t76VarC == null) {
            aVar.a();
            return;
        }
        final vr2 vr2VarCallback = aVar.callback();
        if (aVar.b()) {
            t76VarC.b(request, new vr2() { // from class: com.oplus.aiunit.vision.ds2
                @Override // com.oplus.aiunit.vision.vr2
                public final void onReceive(Response response) {
                    fs2.c(request, vr2VarCallback, response);
                }
            });
            return;
        }
        Response responseA = t76VarC.a(request);
        s7b.b("CallComponentInterceptor", "Component(%s).Action(%s) response : %s", request.getComponentName(), request.getActionName(), responseA);
        vr2VarCallback.onReceive(responseA);
    }
}
