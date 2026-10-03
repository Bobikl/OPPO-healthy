package com.opos.process.bridge.server;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.dispatch.IActivityDispatcher;
import com.opos.process.bridge.provider.BundleUtil;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessBridgeActivity extends Activity {
    private static final String TAG = "ProcessBridgeActivity";
    private static final LruCache<String, IActivityDispatcher> dispatcherMap;

    static {
        init();
        dispatcherMap = new LruCache<>(1000);
    }

    private static void dispatch(Activity activity, String str) {
        LruCache<String, IActivityDispatcher> lruCache = dispatcherMap;
        IActivityDispatcher iActivityDispatcher = lruCache.get(str);
        if (iActivityDispatcher != null) {
            iActivityDispatcher.dispatch(activity);
            return;
        }
        String str2 = "com.opos.process.bridge.dispatch." + str.substring(str.lastIndexOf(".") + 1) + "$Dispatcher";
        try {
            Class<?> cls = Class.forName(str2);
            if (IActivityDispatcher.class.isAssignableFrom(cls)) {
                IActivityDispatcher iActivityDispatcher2 = (IActivityDispatcher) cls.newInstance();
                lruCache.put(str, iActivityDispatcher2);
                iActivityDispatcher2.dispatch(activity);
            }
        } catch (ClassNotFoundException e2) {
            ProcessBridgeLog.e(TAG, "dispatcher:" + str2, e2);
            ProcessBridgeServer.getInstance().handleException(activity.getClass().getName(), activity.getCallingPackage(), 102001, e2.getMessage());
        } catch (Exception e3) {
            ProcessBridgeLog.e(TAG, "dispatcher:" + str2, e3);
            ProcessBridgeServer.getInstance().handleException(activity.getClass().getName(), activity.getCallingPackage(), BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR, e3.getMessage());
        }
    }

    public static void init() {
    }

    public static void register(String str, IActivityDispatcher iActivityDispatcher) {
        dispatcherMap.put(str, iActivityDispatcher);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null || getIntent().getExtras() == null) {
            finish();
        } else {
            dispatch(this, BundleUtil.decodeParamsGetTargetClass(getIntent().getExtras()));
        }
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }
}
