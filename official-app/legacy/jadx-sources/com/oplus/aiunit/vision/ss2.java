package com.oplus.aiunit.vision;

import com.heytap.epona.Request;
import com.heytap.epona.Response;

/* JADX INFO: loaded from: classes15.dex */
public class ss2 implements fea {
    public static /* synthetic */ void c(Request request, vr2 vr2Var, Response response) {
        s7b.b("CallProviderInterceptor", "Component(%s).Action(%s) response : %s", request.getComponentName(), request.getActionName(), response);
        vr2Var.onReceive(response);
    }

    @Override // com.oplus.aiunit.vision.fea
    public void a(fea.a aVar) {
        final Request request = aVar.request();
        String componentName = request.getComponentName();
        p2f p2fVarD = fp6.d(componentName);
        if (p2fVarD == null) {
            aVar.a();
            return;
        }
        final vr2 vr2VarCallback = aVar.callback();
        try {
            String actionName = request.getActionName();
            if (aVar.b()) {
                p2fVarD.a(actionName).invoke(null, request, new vr2() { // from class: com.oplus.aiunit.vision.qs2
                    @Override // com.oplus.aiunit.vision.vr2
                    public final void onReceive(Response response) {
                        ss2.c(request, vr2VarCallback, response);
                    }
                });
            } else {
                Response response = (Response) p2fVarD.a(actionName).invoke(null, request);
                s7b.b("CallProviderInterceptor", "Component(%s).Action(%s) response : %s", request.getComponentName(), request.getActionName(), response);
                vr2VarCallback.onReceive(response);
            }
        } catch (Exception e2) {
            s7b.c("CallProviderInterceptor", "fail to run static provider with componentName = %s and exception is %s", componentName, e2.toString());
            vr2VarCallback.onReceive(Response.defaultErrorResponse());
        }
    }
}
