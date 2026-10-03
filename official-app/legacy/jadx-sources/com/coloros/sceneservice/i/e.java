package com.coloros.sceneservice.i;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.coloros.sceneservice.aidl.IInvokeMethodCallBack;
import com.coloros.sceneservice.aidl.ISceneClientCallBack;
import com.coloros.sceneservice.aidl.ISceneCorrespondInterface;
import com.coloros.sceneservice.m.f;
import com.coloros.sceneservice.sceneprovider.api.CallResult;
import com.coloros.sceneservice.sceneprovider.listener.IMethodCallBack;
import com.coloros.sceneservice.sceneprovider.listener.SubscribeServiceListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class e {
    public static final String RESOURCE_ID = "resourceId";
    public static final int RESULT_FAILURE = 1;
    public static final int RESULT_NOT_FINISH_STATEMENT = 2;
    public static final int RESULT_SUCCESS = 0;
    public static final String TAG = "SceneManager";
    public static final int ac = 5000;
    public static final String cc = "com.coloros.sceneservice";
    public static final String ec = "coloros.intent.action.SCENE_MANAGER_SERVICE";
    public static final String fc = "sceneId";
    public static final String gc = "call_result";
    public static final String hc = "support_scene_list";
    public static final String ic = "subscribed_scene_list";
    public static final String jc = "method_subscribe_scene";
    public static final String kc = "method_unsubscribe_scene";
    public static final String lc = "method_get_support_scene_list";
    public static final String mc = "method_get_subscribed_scene_list";
    public static final String nc = "method_get_support_resource_id";
    public static final String oc = "com.coloros.sceneservice.lightprovider";
    public static final Uri pc = Uri.parse("content://com.coloros.sceneservice.lightprovider");
    public ISceneClientCallBack mCallback;
    public Context mContext;
    public final Object mLock;
    public ISceneCorrespondInterface mService;
    public volatile boolean qc;
    public volatile boolean rc;
    public volatile boolean sc;
    public Map tc;
    public ServiceConnection uc;

    public static abstract class a extends IInvokeMethodCallBack.Stub {
        public WeakReference G;

        public a(IMethodCallBack iMethodCallBack) {
            this.G = new WeakReference(iMethodCallBack);
        }

        public IMethodCallBack a() {
            return (IMethodCallBack) this.G.get();
        }
    }

    public static class b {
        public static e sInstance = new e(null);
    }

    public /* synthetic */ e(com.coloros.sceneservice.i.b bVar) {
        this();
    }

    public static e getInstance() {
        return b.sInstance;
    }

    private boolean subscribeService(String str, int i, String str2) {
        f.i(TAG, "subscribeService clientPkgName:" + str + " sceneId:" + i + " serviceId:" + str2);
        if (this.mService == null || !this.qc || !this.rc) {
            return false;
        }
        try {
            return this.mService.subscribeService(str, i, str2);
        } catch (RemoteException e2) {
            f.e(TAG, "subscibeService", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        synchronized (this.mLock) {
            if (this.sc) {
                try {
                    this.mLock.notifyAll();
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("notifyWait, error ");
                    sb.append(e2);
                    f.e(TAG, sb.toString());
                }
                this.sc = false;
            }
        }
    }

    private void waitForResult() {
        synchronized (this.mLock) {
            f.d(TAG, "waitForResult begin");
            try {
                this.mLock.wait(5000L);
            } catch (InterruptedException e2) {
                f.e(TAG, "waitForResult", e2);
            }
            f.d(TAG, "waitForResult End");
        }
    }

    public CallResult f(String str) {
        int i;
        f.i(TAG, "subscribeScene sceneIds:" + str);
        if (this.mContext == null) {
            f.e(TAG, "subscribeScene failure context is null");
            return CallResult.RESULT_FAILURE;
        }
        Bundle bundle = new Bundle();
        bundle.putString("sceneId", str);
        try {
            Bundle bundleCall = this.mContext.getContentResolver().call(pc, jc, "", bundle);
            i = bundleCall != null ? bundleCall.getInt("call_result") : 0;
        } catch (Exception e2) {
            f.e(TAG, "subscribeScene error " + e2.getMessage());
        }
        return c(i);
    }

    public CallResult g(String str) {
        int i;
        f.i(TAG, "unSubscribeScene: sceneIds:" + str);
        if (this.mContext == null) {
            f.e(TAG, "unSubscribeScene: failure context is null");
            return CallResult.RESULT_FAILURE;
        }
        Bundle bundle = new Bundle();
        bundle.putString("sceneId", str);
        try {
            Bundle bundleCall = this.mContext.getContentResolver().call(pc, kc, "", bundle);
            i = bundleCall != null ? bundleCall.getInt("call_result") : 0;
        } catch (Exception e2) {
            f.e(TAG, "unSubscribeScene: error " + e2.getMessage());
        }
        return c(i);
    }

    public List getSubscribedSceneList() {
        f.d(TAG, "getSubscribeSceneList: ");
        ArrayList arrayList = new ArrayList();
        Context context = this.mContext;
        if (context == null) {
            f.e(TAG, "getSubscribedSceneList: failure context is null");
            return arrayList;
        }
        try {
            Bundle bundleCall = context.getContentResolver().call(pc, mc, "", (Bundle) null);
            if (bundleCall != null) {
                String string = bundleCall.getString(ic);
                StringBuilder sb = new StringBuilder();
                sb.append("getSubscribedSceneList: result = ");
                sb.append(string);
                f.d(TAG, sb.toString());
                if (TextUtils.isEmpty(string)) {
                    return arrayList;
                }
                arrayList.addAll(Arrays.asList(string.split(",")));
            }
        } catch (Exception e2) {
            f.e(TAG, "getSubscribedSceneList: error " + e2.getMessage());
        }
        return arrayList;
    }

    public List getSupportResourceList() {
        ArrayList<Integer> integerArrayList;
        f.i(TAG, "getSupportResourceList: ");
        ArrayList arrayList = new ArrayList();
        Context context = this.mContext;
        if (context == null) {
            f.e(TAG, "getSupportResourceList: failure context is null");
            return arrayList;
        }
        try {
            Bundle bundleCall = context.getContentResolver().call(pc, nc, "", (Bundle) null);
            if (bundleCall != null && (integerArrayList = bundleCall.getIntegerArrayList(RESOURCE_ID)) != null) {
                arrayList.addAll(integerArrayList);
            }
        } catch (Exception e2) {
            f.e(TAG, "getSupportResourceList: exception " + e2);
        }
        f.d(TAG, "getSupportResourceList: resourceList = " + com.coloros.sceneservice.m.e.b(arrayList));
        return arrayList;
    }

    public List getSupportSceneList() {
        f.i(TAG, "getSupportSceneList:");
        ArrayList arrayList = new ArrayList();
        Context context = this.mContext;
        if (context == null) {
            f.e(TAG, "getSupportSceneList: failure context is null");
            return arrayList;
        }
        try {
            Bundle bundleCall = context.getContentResolver().call(pc, lc, "", (Bundle) null);
            if (bundleCall != null) {
                String string = bundleCall.getString(hc);
                if (TextUtils.isEmpty(string)) {
                    return arrayList;
                }
                arrayList.addAll(Arrays.asList(string.split(",")));
            }
        } catch (Exception e2) {
            f.e(TAG, "unRegisterScene error " + e2.getMessage());
        }
        return arrayList;
    }

    public void init(Context context) {
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
    }

    public boolean p() {
        f.d(TAG, "bindSceneManagerService, mIsBound=" + this.qc + ",mIsRegistered=" + this.rc);
        if (this.sc) {
            f.d(TAG, "bindSceneManagerService: wait connecting.");
            return false;
        }
        if (this.mContext == null) {
            f.d(TAG, "context is null, scene manager may not init");
            return false;
        }
        if (!this.qc) {
            try {
                Intent intent = new Intent(ec);
                intent.setPackage("com.coloros.sceneservice");
                this.mContext.bindService(intent, this.uc, 65);
                this.sc = true;
            } catch (Exception e2) {
                f.e(TAG, "bindSceneManagerService, error " + e2.getMessage());
            }
        } else if (!this.rc) {
            try {
                this.rc = this.mService.registerSceneClient(this.mCallback, this.mContext.getPackageName());
            } catch (Exception e3) {
                f.e(TAG, "bindSceneManagerService, error " + e3.getMessage());
            }
        }
        return this.qc;
    }

    public boolean tryBindSceneManagerService() {
        boolean z;
        synchronized (this.mLock) {
            if (!this.qc && !this.sc) {
                p();
            }
            if (this.sc) {
                waitForResult();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("tryBindSceneManagerService mIsBound=");
            sb.append(this.qc);
            sb.append(",mIsRegistered=");
            sb.append(this.rc);
            f.d(TAG, sb.toString());
            z = this.qc;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public void tryUnBindSceneManagerService() {
        synchronized (this.mLock) {
            String packageName = this.mContext.getPackageName();
            if (this.mService != null && this.qc && this.rc) {
                try {
                    if (this.tc.isEmpty()) {
                        f.d(TAG, "tryUnBindSceneManagerService, mSubscriberMap is empty so unbindService");
                        this.mService.unregisterSceneClient(packageName);
                        this.mContext.unbindService(this.uc);
                        this.qc = false;
                        this.rc = false;
                        StringBuilder sb = new StringBuilder();
                        sb.append("tryUnBindSceneManagerService mIsBound=");
                        sb.append(this.qc);
                        sb.append(",mIsRegistered=");
                        sb.append(this.rc);
                        f.d(TAG, sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("tryUnBindSceneManagerService mIsBound=");
                        sb2.append(this.qc);
                        sb2.append(",mIsRegistered=");
                        sb2.append(this.rc);
                        f.d(TAG, sb2.toString());
                    }
                } catch (Throwable th) {
                    f.e(TAG, "tryUnBindSceneManagerService exception", th);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("tryUnBindSceneManagerService mIsBound=");
                sb3.append(this.qc);
                sb3.append(",mIsRegistered=");
                sb3.append(this.rc);
                f.d(TAG, sb3.toString());
            }
            throw th;
        }
    }

    public e() {
        this.mLock = new Object();
        this.qc = false;
        this.rc = false;
        this.sc = false;
        this.mService = null;
        this.tc = new ConcurrentHashMap();
        this.mCallback = new com.coloros.sceneservice.i.b(this);
        this.uc = new c(this);
    }

    private CallResult c(int i) {
        if (i == 0) {
            return CallResult.RESULT_SUCCESS;
        }
        if (i != 2) {
            return CallResult.RESULT_FAILURE;
        }
        return CallResult.RESULT_NOT_FINISH_STATEMENT;
    }

    public void b(int i, String str) {
        synchronized (this.mLock) {
            StringBuilder sb = new StringBuilder();
            sb.append("unsubscribeServiceInWorkThread, start mSubscriberMap size is ");
            sb.append(this.tc.size());
            f.d(TAG, sb.toString());
            Map map = this.tc;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(":");
            sb2.append(str);
            if (map.remove(sb2.toString()) != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("unsubscribeServiceInWorkThread, sceneId=");
                sb3.append(i);
                sb3.append(",serviceId=");
                sb3.append(str);
                sb3.append(",mIsBound=");
                sb3.append(this.qc);
                sb3.append(",mIsRegistered=");
                sb3.append(this.rc);
                f.d(TAG, sb3.toString());
                String packageName = this.mContext.getPackageName();
                if (this.mService != null && this.qc && this.rc) {
                    try {
                        this.mService.unsubscribeService(packageName, i, str);
                        if (this.tc.isEmpty()) {
                            f.d(TAG, "unsubscribeServiceInWorkThread, mSubscriberMap is empty so unbindService");
                            this.mService.unregisterSceneClient(packageName);
                            this.mContext.unbindService(this.uc);
                            this.qc = false;
                            this.rc = false;
                        }
                    } catch (RemoteException e2) {
                        f.e(TAG, "unsubscribeServiceInWorkThread", e2);
                    }
                }
            }
        }
    }

    public void a(int i, String str, SubscribeServiceListener subscribeServiceListener) {
        f.d(TAG, "subscribeServiceInWorkThread, start");
        synchronized (this.mLock) {
            Map map = this.tc;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(":");
            sb.append(str);
            if (map.get(sb.toString()) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("subscribeServiceInWorkThread, sceneId=");
                sb2.append(i);
                sb2.append(",serviceId=");
                sb2.append(str);
                sb2.append(",mIsBound=");
                sb2.append(this.qc);
                sb2.append(",mIsRegistered=");
                sb2.append(this.rc);
                f.d(TAG, sb2.toString());
                String packageName = this.mContext.getPackageName();
                if (!this.qc && !this.sc) {
                    p();
                }
                if (this.sc) {
                    waitForResult();
                }
                if (this.qc) {
                    Map map2 = this.tc;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append(":");
                    sb3.append(str);
                    map2.put(sb3.toString(), subscribeServiceListener);
                    boolean zSubscribeService = subscribeService(packageName, i, str);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("subscribeServiceInWorkThread, result=");
                    sb4.append(zSubscribeService);
                    f.d(TAG, sb4.toString());
                    if (zSubscribeService) {
                        subscribeServiceListener.subscribeSuccess();
                    } else {
                        Map map3 = this.tc;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(i);
                        sb5.append(":");
                        sb5.append(str);
                        map3.remove(sb5.toString());
                        subscribeServiceListener.subscribeFailure();
                    }
                }
            }
        }
    }

    public void a(int i, String str, String str2, Bundle bundle, IMethodCallBack iMethodCallBack) {
        try {
            if (!this.qc) {
                f.d(TAG, "not bound, return");
                return;
            }
            if (this.qc) {
                StringBuilder sb = new StringBuilder();
                sb.append("invokeServiceMethod sceneId:");
                sb.append(i);
                sb.append(" serviceId:");
                sb.append(str);
                sb.append(" methodName:");
                sb.append(str2);
                f.d(TAG, sb.toString());
                this.mService.invokeServiceMethod(this.mContext.getPackageName(), i, str, str2, bundle, new d(this, iMethodCallBack));
            }
        } catch (Exception e2) {
            f.e(TAG, "invokeServiceMethod:" + str2, e2);
        }
    }
}
