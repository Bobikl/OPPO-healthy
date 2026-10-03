package com.opos.process.bridge.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.interceptor.InterceptResult;
import com.opos.process.bridge.interceptor.ServerInterceptor;
import com.opos.process.bridge.interceptor.ServerInterceptorContext;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import java.util.HashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ProcessBridgeService extends Service {
    private static final String TAG = "ProcessBridgeService";

    public IBinder getBinder(Intent intent) {
        HashMap map = new HashMap();
        String stringExtra = intent.getStringExtra(BridgeConstant.KEY_CALLING_PACKAGE);
        ProcessBridgeLog.d("ProcessBridgeService", "callingPackage:" + stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        ServerInterceptorContext serverInterceptorContextBuild = new ServerInterceptorContext.Builder().context(getApplicationContext()).callingPackage(stringExtra).inBundle(intent.getExtras()).outData(map).build();
        for (ServerInterceptor serverInterceptor : ProcessBridgeServer.getInstance().getPreLinkInterceptors()) {
            InterceptResult interceptResultIntercept = serverInterceptor.intercept(serverInterceptorContextBuild);
            ProcessBridgeLog.d("ProcessBridgeService", "PreLinkServerInterceptor: " + serverInterceptor.getClass().getName() + ", result:" + interceptResultIntercept);
            if (interceptResultIntercept.isIntercepted()) {
                ProcessBridgeServer.getInstance().handleInterceptorResult(stringExtra, interceptResultIntercept);
                ProcessBridgeLog.d("ProcessBridgeService", "return NULL");
                return null;
            }
        }
        ProcessBridgeLog.d("ProcessBridgeService", "return ProcessBridgeBinder");
        return new ProcessBridgeBinder(getApplicationContext(), map);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ProcessBridgeLog.d("ProcessBridgeService", "onBind");
        return getBinder(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ProcessBridgeServiceManager.getInstance().add(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ProcessBridgeServiceManager.getInstance().remove(this);
    }
}
