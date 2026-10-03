package com.opos.process.bridge.dispatch;

import android.content.Context;
import android.os.Bundle;
import android.util.LruCache;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.provider.BundleUtil;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import com.opos.process.bridge.server.ProcessBridgeServer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class Dispatcher {
    private static final String TAG = "Dispatcher";
    private final LruCache<String, IDispatcher> dispatcherMap;
    private final AtomicBoolean hasInit;

    public static class DispatcherHolder {
        private static final Dispatcher INSTANCE = new Dispatcher();

        private DispatcherHolder() {
        }
    }

    public static Dispatcher getInstance() {
        return DispatcherHolder.INSTANCE;
    }

    public Bundle dispatch(Context context, String str, String str2, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object[] objArr) {
        ProcessBridgeLog.d(TAG, "dispatch:" + str + ", targetClassName:" + str2 + ", methodId:" + i);
        IDispatcher iDispatcher = this.dispatcherMap.get(str2);
        if (iDispatcher != null) {
            ProcessBridgeLog.e(TAG, "getDispathcer");
            try {
                return iDispatcher.dispatch(context, str, iBridgeTargetIdentify, i, objArr);
            } catch (Exception e2) {
                ProcessBridgeLog.e(TAG, "dispatcher:" + iDispatcher.getClass().getName(), e2);
                ProcessBridgeServer.getInstance().handleException(str2, str, BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, e2.getMessage());
                return BundleUtil.makeBundle(BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, "targetClassName:" + str2);
            }
        }
        ProcessBridgeLog.e(TAG, "dispatcher:" + str2 + " not found");
        String str3 = "com.opos.process.bridge.dispatch." + str2.substring(str2.lastIndexOf(".") + 1) + "$Dispatcher";
        try {
            Class<?> cls = Class.forName(str3);
            if (!IDispatcher.class.isAssignableFrom(cls)) {
                return BundleUtil.makeBundle(101007, BridgeConstant.PROVIDER_DISPATCH_METHOD);
            }
            IDispatcher iDispatcher2 = (IDispatcher) cls.newInstance();
            ProcessBridgeLog.e(TAG, "Reflect");
            this.dispatcherMap.put(str2, iDispatcher2);
            return iDispatcher2.dispatch(context, str, iBridgeTargetIdentify, i, objArr);
        } catch (ClassNotFoundException e3) {
            ProcessBridgeLog.e(TAG, "dispatcher:" + str3, e3);
            ProcessBridgeServer.getInstance().handleException(str2, str, 102001, e3.getMessage());
            return BundleUtil.makeBundle(102001, "targetClassName:" + str2);
        } catch (Exception e4) {
            ProcessBridgeLog.e(TAG, "dispatcher:" + str3, e4);
            ProcessBridgeServer.getInstance().handleException(str2, str, BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, e4.getMessage());
            return BundleUtil.makeBundle(BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, "targetClassName:" + str2);
        }
    }

    public void init() {
        if (this.hasInit.get()) {
            return;
        }
        this.hasInit.set(true);
    }

    public void register(String str, IDispatcher iDispatcher) {
        this.dispatcherMap.put(str, iDispatcher);
    }

    private Dispatcher() {
        this.dispatcherMap = new LruCache<>(1000);
        this.hasInit = new AtomicBoolean(false);
    }
}
