package com.oplus.aiunit.vision;

import com.oplus.epona.Call$Callback;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import com.oplus.epona.provider.ProviderInfo;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class rs2 implements iea {
    public static /* synthetic */ void c(String str, String str2, String str3, Call$Callback call$Callback, Response response) {
        l7b.c("Epona->CallProviderInterceptor", "Caller(%s) call component(%s) action(%s) response:(%s)", str, str2, str3, response);
        call$Callback.onReceive(response);
    }

    @Override // com.oplus.aiunit.vision.iea
    public void a(iea.a aVar) {
        Response responseErrorResponse;
        Request request = aVar.request();
        final String componentName = request.getComponentName();
        final String callerPackageName = request.getCallerPackageName();
        ProviderInfo providerInfoF = ep6.f(componentName);
        if (providerInfoF == null) {
            aVar.a();
            return;
        }
        final Call$Callback call$CallbackCallback = aVar.callback();
        try {
            final String actionName = request.getActionName();
            if (aVar.b()) {
                providerInfoF.getMethod(actionName).invoke(null, request, new Call$Callback() { // from class: com.oplus.aiunit.vision.ps2
                    @Override // com.oplus.epona.Call$Callback
                    public final void onReceive(Response response) {
                        rs2.c(callerPackageName, componentName, actionName, call$CallbackCallback, response);
                    }
                });
            } else {
                Response response = (Response) providerInfoF.getMethod(actionName).invoke(null, request);
                l7b.c("Epona->CallProviderInterceptor", "Caller(%s) call component(%s) action(%s) response:(%s)", callerPackageName, componentName, actionName, response);
                call$CallbackCallback.onReceive(response);
            }
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                InvocationTargetException invocationTargetException = (InvocationTargetException) e2;
                l7b.d("Epona->CallProviderInterceptor", "InvocationTargetException happened with component(%s) Exception: %s", componentName, invocationTargetException.getTargetException());
                responseErrorResponse = Response.errorResponse(String.format("InvocationTargetException happened with component(%s) Exception: %s", componentName, invocationTargetException.getTargetException()));
            } else {
                l7b.d("Epona->CallProviderInterceptor", "fail to run static provider with componentName(%s) cause: %s ", componentName, e2.toString());
                responseErrorResponse = Response.errorResponse(String.format("fail to run static provider with componentName(%s) cause: %s ", componentName, e2));
            }
            call$CallbackCallback.onReceive(responseErrorResponse);
        }
    }
}
