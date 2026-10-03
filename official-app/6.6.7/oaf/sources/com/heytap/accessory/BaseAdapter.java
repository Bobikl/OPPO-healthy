package com.heytap.accessory;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.TransactionTooLargeException;
import androidx.annotation.NonNull;
import com.heytap.accessory.api.IDeathCallback;
import com.heytap.accessory.api.IFrameworkManager;
import com.heytap.accessory.api.IMsgExpCallback;
import com.heytap.accessory.api.IPeerAgentAuthCallback;
import com.heytap.accessory.api.IPeerAgentCallback;
import com.heytap.accessory.api.IServiceChannelCallback;
import com.heytap.accessory.api.IServiceConnectionCallback;
import com.heytap.accessory.api.IServiceConnectionIndicationCallback;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.ClassUtils;
import com.heytap.accessory.utils.ConfigUtil;
import com.heytap.accessory.utils.SdkConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class BaseAdapter {
    public static final String ACTION_ACCESSORY_STATUS_CHANGED = "com.heytap.accessory.action.ACCESSORY_STATUS_CHANGED";
    public static final String ACTION_SERVICE_CONNECTION_REQUESTED = "com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED";
    private static final int BIND_SERVICE_MAX_ATTEMPTS = 5;
    private static final int ERROR_FATAL = 20001;
    private static final int ERROR_PERMISSION_DENIED = 20003;
    private static final int ERROR_PERMISSION_FAILED = 20004;
    private static final String TAG = "BaseAdapter";
    private static BaseAdapter sAdapter;
    private Handler mBackgroundHandler;
    private final AccessoryConnection mConnection;
    private final Context mContext;
    private final IDeathCallback mDeathCallback;
    private ResultReceiver mProxyReceiver;
    private final ServiceConnectionIndicationCallback mScIndicationCallback;
    private IFrameworkManager mServiceProxy;
    private long mClientId = -1;
    private int mState = 0;
    private final Set<AgentCallback> mAgentCallbacks = new HashSet();

    public static class AccessoryConnection implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (BaseAdapter.sAdapter) {
                if (iBinder != null) {
                    SdkLog.d(BaseAdapter.TAG, "Accessory service connected");
                    BaseAdapter.sAdapter.mServiceProxy = IFrameworkManager.Stub.asInterface(iBinder);
                    try {
                        Bundle bundleMakeFrameworkConnection = BaseAdapter.sAdapter.mServiceProxy.makeFrameworkConnection(Process.myPid(), BaseAdapter.sAdapter.mContext.getPackageName(), BaseAdapter.sAdapter.mDeathCallback, Config.getSdkVersionCode(), BaseAdapter.sAdapter.mScIndicationCallback);
                        if (bundleMakeFrameworkConnection == null) {
                            SdkLog.e(BaseAdapter.TAG, "Unable to setup client Identity.Invalid response from Framework");
                            return;
                        }
                        BaseAdapter.sAdapter.mClientId = bundleMakeFrameworkConnection.getLong("clientId", -1L);
                        if (BaseAdapter.sAdapter.mClientId == -1) {
                            BaseAdapter.sAdapter.setState(-1);
                            SdkLog.e(BaseAdapter.TAG, "Unable to setup client Identity.Error:" + bundleMakeFrameworkConnection.getInt("errorcode"));
                            return;
                        }
                        SdkLog.i(BaseAdapter.TAG, "Received Client ID:" + BaseAdapter.sAdapter.mClientId);
                        BaseAdapter.sAdapter.setState(1);
                        int i = bundleMakeFrameworkConnection.getInt("com.heytap.accessory.adapter.extra.PROCESS_ID");
                        if (i == Process.myPid()) {
                            BaseAdapter.sAdapter.mProxyReceiver = BaseAdapter.sAdapter.mServiceProxy.getClientCallback(BaseAdapter.sAdapter.mClientId);
                            SdkLog.i(BaseAdapter.TAG, "Running in OAF process, Updated my proxy: " + BaseAdapter.sAdapter.mProxyReceiver);
                        }
                        SdkConfig.setFrameworkProcessId(i);
                        SdkConfig.setFrameworkMaxHeaderLength(bundleMakeFrameworkConnection.getInt("com.heytap.accessory.adapter.extra.HEADER_LEN"));
                        SdkConfig.setFrameworkMaxFooterLength(bundleMakeFrameworkConnection.getInt("com.heytap.accessory.adapter.extra.FOOTER_LEN"));
                        SdkConfig.setFrameworkMaxMsgHeaderLength(bundleMakeFrameworkConnection.getInt("com.heytap.accessory.adapter.extra.MSG_HEADER_LEN"));
                        SdkConfig.setCompatibleFrameworkVersion(bundleMakeFrameworkConnection.getInt(SdkConfig.EXTRA_KEY_FRAMEWORK_COMPATIBLE_VERSION));
                    } catch (RemoteException e) {
                        SdkLog.e(BaseAdapter.TAG, "Unable to setup client Identity.", e);
                        BaseAdapter.sAdapter.setState(-1);
                        BaseAdapter.sAdapter.notifyDisconnection(e);
                    }
                }
                BaseAdapter.sAdapter.notifyAll();
                BaseAdapter.sAdapter.notifyConnection();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (BaseAdapter.sAdapter) {
                SdkLog.w(BaseAdapter.TAG, "Accessory service disconnected");
                BaseAdapter.sAdapter.setState(0);
                BaseAdapter.sAdapter.cleanup(false);
            }
        }

        private AccessoryConnection() {
        }
    }

    public interface AgentCallback {
        void onAgentRegistered() throws GeneralException;

        void onFrameworkConnected();

        void onFrameworkDisconnected();
    }

    public static final class DeathCallbackStub extends IDeathCallback.Stub {
        private final String mPackageName;

        public DeathCallbackStub(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Invalid packageName:null");
            }
            this.mPackageName = str;
        }

        @Override // com.heytap.accessory.api.IDeathCallback
        public String getAppName() throws RemoteException {
            return this.mPackageName;
        }
    }

    public final class ServiceConnectionIndicationCallback extends IServiceConnectionIndicationCallback.Stub {
        private void handleConnectionRequest(Context context, Intent intent, String str) {
            SdkLog.d(BaseAdapter.TAG, "handleConnectionRequest ");
            BaseJobAgent.requestAgent(context, str, new AgentCallbackImpl(1, intent));
        }

        private synchronized boolean isValidImplClass(Context context, String str) {
            boolean z;
            ConfigUtil defaultInstance = ConfigUtil.getDefaultInstance(context);
            z = false;
            if (defaultInstance != null) {
                ServiceProfile serviceProfileFetchServicesDescription = defaultInstance.fetchServicesDescription(str);
                if (serviceProfileFetchServicesDescription == null) {
                    SdkLog.e(BaseAdapter.TAG, "fetch service profile description failed !!");
                } else if (str.equalsIgnoreCase(serviceProfileFetchServicesDescription.getServiceImpl())) {
                    z = true;
                }
            } else {
                SdkLog.e(BaseAdapter.TAG, "config  util default instance  creation failed !!");
            }
            return z;
        }

        @NonNull
        private Intent prepareIntent(PeerAgent peerAgent, long j, String str, String str2) {
            Intent intent = new Intent("com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED");
            intent.putExtra("transactionId", j);
            intent.putExtra("agentId", str);
            intent.putExtra("peerAgent", peerAgent);
            intent.putExtra("agentImplclass", str2);
            intent.setClassName(BaseAdapter.this.mContext, str2);
            return intent;
        }

        @Override // com.heytap.accessory.api.IServiceConnectionIndicationCallback
        @TargetApi(26)
        public void onServiceConnectionRequested(Bundle bundle) throws RemoteException {
            ComponentName componentNameStartService;
            SdkLog.i(BaseAdapter.TAG, "onServiceConnectionRequested: " + bundle);
            byte[] byteArray = bundle.getByteArray("peerAgent");
            if (byteArray == null) {
                SdkLog.e(BaseAdapter.TAG, "marshalled accessory byte[] is null!");
                return;
            }
            Parcel parcelObtain = Parcel.obtain();
            if (parcelObtain == null) {
                SdkLog.e(BaseAdapter.TAG, "Failed to obtain parcel");
                return;
            }
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            PeerAgent peerAgentCreateFromParcel = PeerAgent.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            long j = bundle.getLong("transactionId", 0L);
            String string = bundle.getString("agentId");
            String string2 = bundle.getString("agentImplclass");
            if (string2 == null) {
                SdkLog.e(BaseAdapter.TAG, "Implementation class not available in intent. Ignoring request");
                return;
            }
            try {
                Class<?> cls = Class.forName(string2);
                if (isValidImplClass(BaseAdapter.this.mContext, cls.getName())) {
                    boolean zIsChildClass = ClassUtils.isChildClass(BaseJobAgent.class, cls);
                    int i = BaseAdapter.this.mContext.getPackageManager().getPackageInfo(BaseAdapter.this.mContext.getPackageName(), 0).applicationInfo.targetSdkVersion;
                    String str = BaseAdapter.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("implClass.getSuperclass() :");
                    sb.append(cls.getSuperclass() == null ? "null" : cls.getSuperclass().getSimpleName());
                    sb.append(", isV2 = ");
                    sb.append(zIsChildClass);
                    sb.append(", sdkInt:");
                    sb.append(Build.VERSION.SDK_INT);
                    sb.append(", targetSdk:");
                    sb.append(i);
                    SdkLog.v(str, sb.toString());
                    Intent intentPrepareIntent = prepareIntent(peerAgentCreateFromParcel, j, string, string2);
                    boolean z = i >= 21;
                    if (zIsChildClass && z) {
                        SdkLog.d(BaseAdapter.TAG, "scheduleSCJob");
                        handleConnectionRequest(BaseAdapter.this.mContext, intentPrepareIntent, string2);
                        return;
                    }
                    SdkLog.i(BaseAdapter.TAG, " onServiceConnectionRequested: agentImplClass=" + string2);
                    if (z) {
                        SdkLog.d(BaseAdapter.TAG, "startForegroundService");
                        componentNameStartService = BaseAdapter.this.mContext.startForegroundService(intentPrepareIntent);
                    } else {
                        SdkLog.d(BaseAdapter.TAG, "startService");
                        componentNameStartService = BaseAdapter.this.mContext.startService(intentPrepareIntent);
                    }
                    if (componentNameStartService == null) {
                        SdkLog.e(BaseAdapter.TAG, "Agent " + string2 + " not found. Check Accessory Service XML for serviceImpl attribute");
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e2) {
                SdkLog.e(BaseAdapter.TAG, "Agent Impl class not found!" + e2);
            }
        }

        private ServiceConnectionIndicationCallback() {
        }
    }

    private BaseAdapter(Context context, Handler handler) {
        this.mContext = context;
        this.mConnection = new AccessoryConnection();
        this.mDeathCallback = new DeathCallbackStub(context.getPackageName());
        this.mScIndicationCallback = new ServiceConnectionIndicationCallback();
        this.mBackgroundHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002f A[Catch: all -> 0x003b, LOOP:0: B:9:0x0029->B:11:0x002f, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000d, B:8:0x0014, B:9:0x0029, B:11:0x002f), top: B:18:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x000d A[Catch: all -> 0x003b, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x0006, B:7:0x000d, B:8:0x0014, B:9:0x0029, B:11:0x002f), top: B:18:0x0003 }] */
    public synchronized void cleanup(boolean z) {
        Iterator<AgentCallback> it;
        if (z) {
            tearFrameworkconnection();
            if (sAdapter.mState == 1) {
                this.mContext.unbindService(this.mConnection);
            }
            sAdapter.mClientId = -1L;
            setState(0);
            BaseAdapter baseAdapter = sAdapter;
            baseAdapter.mServiceProxy = null;
            it = baseAdapter.mAgentCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onFrameworkDisconnected();
            }
        } else {
            if (sAdapter.mState == 1) {
                this.mContext.unbindService(this.mConnection);
            }
            sAdapter.mClientId = -1L;
            setState(0);
            BaseAdapter baseAdapter2 = sAdapter;
            baseAdapter2.mServiceProxy = null;
            it = baseAdapter2.mAgentCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onFrameworkDisconnected();
            }
        }
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void doBindFramework() throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            setState(0);
            try {
                Intent intent = new Intent(SdkConfig.INTENT_FRAMEWORK_SERVICE);
                String packageName = Initializer.useOAFApp(this.mContext) ? "com.heytap.accessory" : this.mContext.getPackageName();
                SdkLog.i(TAG, "Agent bind to packageName - " + packageName);
                intent.setPackage(packageName);
                intent.putExtra(SdkConfig.ACCESSORY_FRAMEWORK_REQUEST_PACKAGE, this.mContext.getPackageName());
                for (int i = 1; sAdapter.mClientId == -1 && getState() == 0 && i <= 5; i++) {
                    if (!this.mContext.bindService(intent, sAdapter.mConnection, 1)) {
                        SdkLog.e(TAG, "getDefaultAdapter: Binding to Accessory service failed!");
                        setState(-1);
                        throw new GeneralException(20001, "Is the Oppo Accessory Service Framework installed?!");
                    }
                    try {
                        SdkLog.i(TAG, "getDefaultAdapter: About start waiting");
                        sAdapter.wait(10000L);
                    } catch (InterruptedException e) {
                        setState(-1);
                        throw new GeneralException(20001, "Failed to Bind to Accessory Framework - Action interrupted!", e);
                    }
                }
                if (sAdapter.mServiceProxy == null) {
                    SdkLog.e(TAG, "getDefaultAdapter: Service Connection proxy is null!");
                    setState(-1);
                    throw new GeneralException(20001, "Unable to bind to Oppo Accessory Service!");
                }
                SdkLog.i(TAG, "Application is now connected to Accessory Framework!");
            } catch (SecurityException unused) {
                SdkLog.e(TAG, "getDefaultAdapter: Permission denied! Binding to Accessory service failed!");
                setState(-1);
                if (!SdkConfig.checkAccessoryPermission(this.mContext)) {
                    throw new GeneralException(20003, "Permission denied to bind to Oppo Accessory Service! Please add permission and try again.");
                }
                throw new GeneralException(20004, "Permission validation failed to bind to Oppo Accessory Service! Please re-install the application and try again.");
            }
        }
    }

    public static synchronized BaseAdapter getDefaultAdapter(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (sAdapter == null) {
            sAdapter = new BaseAdapter(applicationContext, null);
        }
        return sAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyConnection() {
        Iterator<AgentCallback> it = sAdapter.mAgentCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onFrameworkConnected();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyDisconnection(RemoteException remoteException) {
        if (remoteException instanceof TransactionTooLargeException) {
            SdkLog.w(TAG, "Remote call falied, binder transaction buffer low");
            cleanup(true);
        } else {
            SdkLog.w(TAG, "Remote call falied");
        }
    }

    private synchronized void tearFrameworkconnection() {
        IFrameworkManager iFrameworkManager = this.mServiceProxy;
        if (iFrameworkManager == null) {
            SdkLog.i(TAG, "Binding to framework does not exists");
        } else {
            try {
                try {
                    iFrameworkManager.tearFrameworkConnection(this.mClientId);
                } catch (RemoteException unused) {
                    SdkLog.w(TAG, "Failed to tear framework connection");
                }
                cleanup(false);
            } catch (Throwable th) {
                cleanup(false);
                throw th;
            }
        }
    }

    public Bundle acceptServiceConnection(String str, PeerAgent peerAgent, long j, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            Bundle bundleAcceptServiceConnection = this.mServiceProxy.acceptServiceConnection(this.mClientId, str, peerAgent, j, iServiceConnectionCallback, iServiceChannelCallback);
            if (bundleAcceptServiceConnection == null) {
                SdkLog.e(TAG, "acceptServiceConnection:Invalid response from Accessory Framework:" + bundleAcceptServiceConnection);
                throw new RuntimeException("acceptServiceConnection:Invalid response from Accessory Framework:" + bundleAcceptServiceConnection);
            }
            if (bundleAcceptServiceConnection.containsKey("errorcode")) {
                throw new GeneralException(bundleAcceptServiceConnection.getInt("errorcode"), "Failed to accept connection request!");
            }
            String string = bundleAcceptServiceConnection.getString("connectionId");
            if (string != null) {
                return bundleAcceptServiceConnection;
            }
            SdkLog.e(TAG, "acceptServiceConnection:Invalid response from Accessory Framework- connectionId:" + string);
            throw new RuntimeException("acceptServiceConnection:Invalid response from Accessory Framework- connectionId:" + string);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to accept service connection");
            notifyDisconnection(e);
            throw new GeneralException(20001, "acceptServiceConnection:Remote call failed");
        }
    }

    public int authenticatePeeragent(String str, PeerAgent peerAgent, IPeerAgentAuthCallback iPeerAgentAuthCallback, long j) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            return this.mServiceProxy.authenticatePeerAgent(this.mClientId, str, peerAgent, iPeerAgentAuthCallback, j);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to request peer authentication");
            notifyDisconnection(e);
            throw new GeneralException(20001, "authenticatePeeragent:Remote call failed");
        }
    }

    public void bindToFramework() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                doBindFramework();
                return;
            } catch (GeneralException e) {
                SdkLog.e(TAG, "bindToFramework failed!", e);
                return;
            }
        }
        String str = TAG;
        SdkLog.d(str, "It's in main thread,need to switch to sub thread!");
        Handler handler = this.mBackgroundHandler;
        if (handler == null) {
            SdkLog.d(str, "BackgroundHandler is null, so just return!");
        } else {
            handler.post(new Runnable() { // from class: com.heytap.accessory.BaseAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        BaseAdapter.this.doBindFramework();
                    } catch (GeneralException e2) {
                        SdkLog.e(BaseAdapter.TAG, "bindToFramework failed!", e2);
                    }
                }
            });
        }
    }

    public synchronized int checkAuthentication() throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager == null) {
                return CommonStatusCodes.INTERNAL_EXCEPTION;
            }
            return iFrameworkManager.handleAuthentication(Config.getSdkVersionCode());
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Service authenticate failed");
            notifyDisconnection(e);
            throw new GeneralException(20001, "authenticate:Remote call failed");
        }
    }

    public void cleanupAgent(String str) {
        if (sAdapter.mServiceProxy == null) {
            SdkLog.w(TAG, "Binding to framework does not exists");
            return;
        }
        try {
            this.mServiceProxy.cleanupAgent(this.mClientId, str);
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "Failed to cleanup agent details");
        }
    }

    public void cleanupChannel(String str, int i) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            SdkLog.w(TAG, "cleanupChannel failed, Binding to framework does not exists");
            return;
        }
        try {
            this.mServiceProxy.cleanupChannelCache(this.mClientId, str, i);
        } catch (RemoteException unused) {
            SdkLog.w(TAG, "Failed to cleanupChannelCache");
            throw new GeneralException(20001, "authenticatePeeragent:Remote call failed");
        }
    }

    public int closeServiceConnection(String str) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            return BaseSocket.ERROR_CONNECTION_ALREADY_CLOSED;
        }
        try {
            return this.mServiceProxy.closeServiceConnection(this.mClientId, str);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to close service connection");
            notifyDisconnection(e);
            throw new GeneralException(20001, "closeServiceConnection:Remote call failed");
        }
    }

    public int findPeerAgents(String str, IPeerAgentCallback iPeerAgentCallback) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager != null) {
                return iFrameworkManager.findPeerAgents(this.mClientId, -1L, str, iPeerAgentCallback);
            }
            throw new GeneralException(20001, "findPeerAgents:mServiceProxy is null");
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to initiate peer discovery");
            notifyDisconnection(e);
            throw new GeneralException(20001, "findPeerAgents:Remote call failed");
        }
    }

    public Bundle getAgentDetails(String str) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            return this.mServiceProxy.getAgentDetails(this.mClientId, str);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to get agent details");
            notifyDisconnection(e);
            throw new GeneralException(20001, "getAgentDetails: Remote call failed");
        }
    }

    public String getAgentId(String str, String str2) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager != null) {
                return iFrameworkManager.getAgentId(this.mClientId, str, str2);
            }
            throw new GeneralException(20001, "getAgentId:mServiceProxy is null");
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to fetch agent ID");
            notifyDisconnection(e);
            throw new GeneralException(20001, "getAgentId:Remote call failed");
        }
    }

    public synchronized String getLocalAgentId(String str) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            Bundle localAgentId = iFrameworkManager != null ? iFrameworkManager.getLocalAgentId(this.mClientId, str) : null;
            if (localAgentId == null) {
                SdkLog.e(TAG, "getLocalAgentId failed,Invalid response from accessory framework - null");
            } else if (localAgentId.containsKey("errorcode")) {
                int i = localAgentId.getInt("errorcode");
                SdkLog.e(TAG, "getLocalAgentId failed,errorCode:" + i);
            } else {
                String string = localAgentId.getString("agentId");
                if (string != null) {
                    return string;
                }
                SdkLog.e(TAG, "getLocalAgentId failed ,localAgentID:null");
            }
            return null;
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to fetch localAgent ID");
            notifyDisconnection(e);
            throw new GeneralException(20001, "getLocalAgentId:Remote call failed");
        }
    }

    public String getPackageName() {
        return this.mContext.getPackageName();
    }

    public synchronized int getState() {
        return this.mState;
    }

    public int getVersion() throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager != null) {
                return iFrameworkManager.getVersion();
            }
            throw new GeneralException(20001, "getVersion:mServiceProxy is null");
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to get version" + e);
            notifyDisconnection(e);
            throw new GeneralException(20001, "getVersion:Remote call failed");
        }
    }

    public boolean isSocketConnected(String str) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            return this.mServiceProxy.isSocketConnected(this.mClientId, str);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to fetch socket connection status");
            notifyDisconnection(e);
            throw new GeneralException(20001, "isSocketConnected:Remote call failed");
        }
    }

    public synchronized void recycle(byte[] bArr) {
        if (sAdapter.mProxyReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("com.heytap.accessory.adapter.extra.READ_BYTES", bArr);
            sAdapter.mProxyReceiver.send(0, bundle);
        }
    }

    public synchronized void registerAgentCallback(AgentCallback agentCallback) {
        this.mAgentCallbacks.add(agentCallback);
        SdkLog.d(TAG, "Agent callback added. Current size - " + this.mAgentCallbacks.size());
    }

    public void registerMexCallback(String str, IMsgExpCallback iMsgExpCallback) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager != null) {
                iFrameworkManager.registerMexCallback(this.mClientId, str, iMsgExpCallback);
            }
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to register mex callback");
            notifyDisconnection(e);
            throw new GeneralException(20001, "registerMexCallback: Remote call failed");
        }
    }

    public synchronized void registerServices(byte[] bArr) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager != null) {
                iFrameworkManager.registerComponent(this.mClientId, bArr);
            }
            Iterator<AgentCallback> it = this.mAgentCallbacks.iterator();
            while (it.hasNext()) {
                it.next().onAgentRegistered();
            }
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Service registration call failed");
            notifyDisconnection(e);
            throw new GeneralException(20001, "registerServices:Remote call failed");
        }
    }

    public int rejectServiceConnection(String str, PeerAgent peerAgent, long j) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            return this.mServiceProxy.rejectServiceConnection(this.mClientId, str, peerAgent, j);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to reject service connection");
            notifyDisconnection(e);
            throw new GeneralException(20001, "rejectServiceConnection:Remote call failed");
        }
    }

    public int requestServiceConnection(String str, PeerAgent peerAgent, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            return this.mServiceProxy.requestServiceConnection(this.mClientId, str, peerAgent, iServiceConnectionCallback, iServiceChannelCallback);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to request service connection");
            notifyDisconnection(e);
            throw new GeneralException(20001, "requestServiceConnection:Remote call failed");
        }
    }

    public int send(PeerAgent peerAgent, String str, int i, byte[] bArr, boolean z, int i2, int i3, int i4, boolean z2) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            SdkLog.v(TAG, "sendData,connectionId:" + str + ",channelId:" + i + ",dataLen:" + bArr.length + ",compatibleVersion:" + SdkConfig.getCompatibleFrameworkVersion());
            return SdkConfig.getCompatibleFrameworkVersion() >= 1 ? this.mServiceProxy.sendV2(peerAgent.getAccessoryId(), peerAgent.getAgentId(), this.mClientId, str, i, bArr, z, i2, i3, i4, z2) : this.mServiceProxy.send(this.mClientId, str, i, bArr, z, i2, i3, i4);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed send data for connection:" + str);
            notifyDisconnection(e);
            throw new GeneralException(20001, "send: Remote call failed");
        }
    }

    public int sendMessage(String str, String str2, long j, byte[] bArr, boolean z, int i, int i2) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        if (!SdkConfig.isMexSupported()) {
            return 10104;
        }
        try {
            return sAdapter.mServiceProxy.sendMessage(this.mClientId, str, str2, j, bArr, z, i, i2);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to send messages " + e);
            notifyDisconnection(e);
            throw new GeneralException(20001, "sendMessage: Remote call failed");
        }
    }

    public void sendMessageDeliveryStatus(long j, String str, int i, int i2) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager != null) {
                iFrameworkManager.sendMessageDeliveryStatusV2(this.mClientId, j, str, i, i2);
            }
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Failed to send message delivery status");
            notifyDisconnection(e);
            throw new GeneralException(20001, "sendMessageDeliveryStatus: Remote call failed");
        }
    }

    public synchronized void setState(int i) {
        this.mState = i;
    }

    public synchronized void unregisterAgentCallback(AgentCallback agentCallback) {
        this.mAgentCallbacks.remove(agentCallback);
        String str = TAG;
        SdkLog.d(str, "Agent callback removed. Current size - " + this.mAgentCallbacks.size());
        if (this.mAgentCallbacks.isEmpty()) {
            SdkLog.i(str, "All clients have unregistered.Disconnection from Accessory Framework.");
            cleanup(true);
        }
    }

    public void unregisterMexCallback(String str) throws GeneralException {
        IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
        if (iFrameworkManager != null) {
            try {
                iFrameworkManager.unregisterMexCallback(this.mClientId, str);
            } catch (RemoteException e) {
                SdkLog.w(TAG, "Failed to unregister mex callback");
                notifyDisconnection(e);
                throw new GeneralException(20001, "unregisterMexCallback: Remote call failed");
            }
        }
    }

    public static synchronized BaseAdapter getDefaultAdapter(Context context, Handler handler) {
        Context applicationContext = context.getApplicationContext();
        if (sAdapter == null) {
            sAdapter = new BaseAdapter(applicationContext, handler);
        }
        return sAdapter;
    }

    public synchronized boolean checkAuthentication(String str) throws GeneralException {
        if (sAdapter.mServiceProxy == null) {
            bindToFramework();
        }
        try {
            IFrameworkManager iFrameworkManager = sAdapter.mServiceProxy;
            if (iFrameworkManager == null) {
                return false;
            }
            return iFrameworkManager.handleAuthenticationWithPermission(Config.getSdkVersionCode(), str);
        } catch (RemoteException e) {
            SdkLog.w(TAG, "Service authenticate failed");
            notifyDisconnection(e);
            throw new GeneralException(20001, "authenticate:Remote call failed");
        }
    }
}
