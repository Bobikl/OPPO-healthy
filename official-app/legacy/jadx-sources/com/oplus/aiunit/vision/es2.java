package com.oplus.aiunit.vision;

import com.oplus.epona.Call$Callback;
import com.oplus.epona.Request;
import com.oplus.epona.Response;

/* JADX INFO: loaded from: classes2.dex */
public class es2 implements iea {
    public static /* synthetic */ void c(String str, String str2, String str3, Call$Callback call$Callback, Response response) {
        l7b.c("Epona->CallComponentInterceptor", "Caller(%s) call component(%s) action(%s) response:(%s)", str, str2, str3, response);
        call$Callback.onReceive(response);
    }

    @Override // com.oplus.aiunit.vision.iea
    public void a(iea.a aVar) {
        Request request = aVar.request();
        final String componentName = request.getComponentName();
        final String actionName = request.getActionName();
        s76 s76VarE = ep6.e(componentName);
        if (s76VarE == null) {
            aVar.a();
            return;
        }
        final String callerPackageName = request.getCallerPackageName();
        final Call$Callback call$CallbackCallback = aVar.callback();
        if (aVar.b()) {
            s76VarE.b(request, new Call$Callback() { // from class: com.oplus.aiunit.vision.cs2
                @Override // com.oplus.epona.Call$Callback
                public final void onReceive(Response response) {
                    es2.c(callerPackageName, componentName, actionName, call$CallbackCallback, response);
                }
            });
            return;
        }
        Response responseA = s76VarE.a(request);
        l7b.c("Epona->CallComponentInterceptor", "Caller(%s) call component(%s) action(%s) response:(%s)", callerPackageName, componentName, actionName, responseA);
        call$CallbackCallback.onReceive(responseA);
    }
}
