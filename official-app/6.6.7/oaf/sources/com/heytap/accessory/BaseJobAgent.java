package com.heytap.accessory;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PersistableBundle;
import android.os.RemoteException;
import com.heytap.accessory.api.IPeerAgentAuthCallback;
import com.heytap.accessory.api.IPeerAgentCallback;
import com.heytap.accessory.bean.AuthenticationToken;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.ConfigUtil;
import com.heytap.accessory.utils.SdkConfig;
import com.heytap.accessory.utils.ThreadManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class BaseJobAgent {
    public static final String ACTION_REGISTRATION_REQUIRED = "com.heytap.accessory.action.REGISTER_AGENT";
    public static final String ACTION_SERVICE_CONNECTION_REQUESTED = "com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED";
    public static final int AUTHENTICATION_FAILURE_PEER_AGENT_NOT_SUPPORTED = 1546;
    public static final int AUTHENTICATION_FAILURE_TOKEN_NOT_GENERATED = 1545;
    public static final int AUTHENTICATION_SUCCESS = 0;
    private static final int CLEANUP_WAIT_MAX_RETRY = 4;
    private static final long CLEANUP_WAIT_TIME = 500;
    public static final int CONNECTION_ALREADY_EXIST = 10005;
    public static final int CONNECTION_DUPLICATE_REQUEST = 10009;
    public static final int CONNECTION_FAILURE_ACC_DORMANT = 10014;
    public static final int CONNECTION_FAILURE_DEVICE_UNREACHABLE = 10004;
    public static final int CONNECTION_FAILURE_INVALID_PEER_AGENT = 10008;
    private static final int CONNECTION_FAILURE_LOCAL_AGENT_NOT_FOUND = 1034;
    public static final int CONNECTION_FAILURE_NETWORK = 10012;
    public static final int CONNECTION_FAILURE_PEERAGENT_NO_RESPONSE = 10006;
    public static final int CONNECTION_FAILURE_PEERAGENT_REJECTED = 10007;
    public static final int CONNECTION_FAILURE_SERVICE_LIMIT_REACHED = 10010;
    public static final int CONNECTION_SUCCESS = 0;
    private static final int DEFAULT_GET_AGENT_ID_RETRY_COUNT = 2;
    public static final int ERROR_AGENT_REQUEST_IN_PROGRESS = 2564;
    public static final int ERROR_CLASS_NOT_FOUND = 2561;
    public static final int ERROR_CONNECTION_INVALID_PARAM = 1025;
    public static final int ERROR_CONSTRUCTOR_EXCEPTION = 2563;
    public static final int ERROR_CONSTRUCTOR_NOT_FOUND = 2562;
    public static final int ERROR_FATAL = 20001;
    public static final int ERROR_PERMISSION_DENIED = 20003;
    public static final int ERROR_PERMISSION_FAILED = 20004;
    public static final int ERROR_SDK_NOT_INITIALIZED = 20002;
    public static final int FIND_PEER_DEVICE_NOT_CONNECTED = 10001;
    public static final int FIND_PEER_DUPLICATE_REQUEST = 10003;
    public static final int FIND_PEER_SERVICE_NOT_FOUND = 10002;
    public static final int FIND_PEER_TIMEOUT = 10010;
    public static final int PEER_AGENT_AVAILABLE = 1;
    private static final int PEER_AGENT_AVAILABLE_THIN = 105;
    public static final int PEER_AGENT_FOUND = 0;
    public static final int PEER_AGENT_UNAVAILABLE = 2;
    private static final int PEER_AGENT_UNAVAILABLE_THIN = 106;
    private static final int SERVICE_RECORD_NOT_FOUND = 10016;
    private static final String TAG = "BaseJobAgent";
    private static InstanceHandler sInstanceHandler;
    BaseAdapter mAdapter;
    private AgentCallbackImpl mAgentCallback;
    private String mAgentId;
    AgentHandler mBackgroundWorker;
    private ConnectionCallback mConnectionCallback;
    private Context mContext;
    private BaseMessage mMessage;
    private String mName;
    private PeerAgentCallback mPeerAgentCallback;
    private AuthenticationCallback mPeerAuthCallback;
    private Set<PeerAgent> mPendingRequests;
    private volatile boolean mProcessingCleanup;
    private Class<? extends BaseSocket> mSocketImpl;
    private List<BaseSocket> mSuccessfulConnections;
    private static final ReentrantLock INSTANCE_LOCK = new ReentrantLock();
    private static Map<String, BaseJobAgent> sAgentsMap = new ConcurrentHashMap();
    private Object mLock = new Object();
    private ServiceProfile mServiceProfile = null;
    private int mGetAgentIdRetryCount = 0;

    public static class AgentCallbackImpl implements BaseAdapter.AgentCallback {
        private BaseJobAgent mAgent;

        public AgentCallbackImpl(BaseJobAgent baseJobAgent) {
            this.mAgent = baseJobAgent;
        }

        @Override // com.heytap.accessory.BaseAdapter.AgentCallback
        public void onAgentRegistered() throws GeneralException {
            this.mAgent.mBackgroundWorker.sendEmptyMessage(15);
        }

        @Override // com.heytap.accessory.BaseAdapter.AgentCallback
        public void onFrameworkConnected() {
            try {
                this.mAgent.registerMexAgent();
            } catch (GeneralException e) {
                SdkLog.e(BaseJobAgent.TAG, "onFrameworkConnected() - Failed to register agent with message! " + e.getMessage());
            }
        }

        @Override // com.heytap.accessory.BaseAdapter.AgentCallback
        public void onFrameworkDisconnected() {
            AgentHandler agentHandler = this.mAgent.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseJobAgent.TAG, "onFrameworkDisconnected: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(12);
            messageObtainMessage.arg1 = 20001;
            this.mAgent.mBackgroundWorker.sendMessage(messageObtainMessage);
        }
    }

    public static class AgentHandler extends Handler {
        static final int MESSAGE_ACCEPT_SERVICE_CONNECTION = 8;
        static final int MESSAGE_BIND_FRAMEWORK = 0;
        static final int MESSAGE_CLEANUP = 14;
        static final int MESSAGE_CONNECTION_INDICATION = 5;
        static final int MESSAGE_CONNECTION_INDICATION_JOB = 6;
        static final int MESSAGE_FIND_PEER = 2;
        static final int MESSAGE_FIND_PEER_RESPONSE = 3;
        static final int MESSAGE_FIND_PEER_UPDATE = 4;
        static final int MESSAGE_LOAD_AGENT_ID = 15;
        static final int MESSAGE_LOW_MEMORY = 18;
        static final int MESSAGE_ON_CONNECTION_FAILURE = 13;
        static final int MESSAGE_ON_ERROR = 12;
        static final int MESSAGE_PEER_AUTH_REQUEST = 10;
        static final int MESSAGE_PEER_AUTH_RESPONSE = 11;
        static final int MESSAGE_REGISTER = 1;
        static final int MESSAGE_REJECT_SERVICE_CONNECTION = 9;
        static final int MESSAGE_REQUEST_SERVICE_CONNECTION = 7;
        private BaseJobAgent mServiceAgent;

        public AgentHandler(BaseJobAgent baseJobAgent, Looper looper) {
            super(looper);
            this.mServiceAgent = baseJobAgent;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseJobAgent baseJobAgent = this.mServiceAgent;
            if (baseJobAgent.mAdapter == null) {
                SdkLog.w(BaseJobAgent.TAG, "BaseApdater is null, return!");
            }
            switch (message.what) {
                case 0:
                    try {
                        baseJobAgent.bindToFramework();
                    } catch (GeneralException e) {
                        SdkLog.e(BaseJobAgent.TAG, "Binding to Accessory Framework failed", e);
                        this.mServiceAgent.handleError(e.getErrorCode(), null);
                        return;
                    }
                    break;
                case 1:
                    baseJobAgent.registerService();
                    break;
                case 2:
                    baseJobAgent.requestPeerAgents();
                    break;
                case 3:
                    int i = message.arg1;
                    if (i != 0) {
                        baseJobAgent.handleFindPeerErrorCode(i);
                        this.mServiceAgent.onFindPeerAgentsResponse(null, message.arg1);
                    } else if (!(baseJobAgent instanceof NativeAgent)) {
                        baseJobAgent.handleFindPeerErrorCode(0);
                        this.mServiceAgent.onFindPeerAgentsResponse((PeerAgent[]) message.obj, 0);
                    } else {
                        ((NativeAgent) baseJobAgent).onPeerFound(i, Arrays.asList((PeerAgent[]) message.obj));
                    }
                    break;
                case 4:
                    baseJobAgent.onPeerAgentsUpdated((PeerAgent[]) message.obj, message.arg1);
                    this.mServiceAgent.handlePeerAgentUpdateErrorCode(message.arg1);
                    break;
                case 5:
                    baseJobAgent.notifyConnectionRequest((Intent) message.obj);
                    break;
                case 6:
                    SdkLog.d(BaseJobAgent.TAG, "MESSAGE_CONNECTION_INDICATION_JOB");
                    IJobListener iJobListener = (IJobListener) message.obj;
                    JobParameters jobParameters = (JobParameters) message.getData().get(Constants.EXTRA_PARAMS);
                    this.mServiceAgent.notifyConnectionRequest(jobParameters.getExtras());
                    iJobListener.onJobFinished(jobParameters);
                    break;
                case 7:
                    baseJobAgent.requestConnection((PeerAgent) message.obj);
                    break;
                case 8:
                    baseJobAgent.acceptServiceConnectionInternal((PeerAgent) message.obj);
                    break;
                case 9:
                    baseJobAgent.rejectServiceConnectionInternal((PeerAgent) message.obj);
                    break;
                case 10:
                    baseJobAgent.requestPeerAuthInternal((PeerAgent) message.obj);
                    break;
                case 11:
                    baseJobAgent.handleAuthResponse(message.getData());
                    break;
                case 12:
                    Object obj = message.obj;
                    baseJobAgent.handleError(message.arg1, obj instanceof PeerAgent ? (PeerAgent) obj : null);
                    break;
                case 13:
                    Object obj2 = message.obj;
                    baseJobAgent.onServiceConnectionResponse(obj2 instanceof PeerAgent ? (PeerAgent) obj2 : null, null, message.arg1);
                    this.mServiceAgent.handleServiceConnectionErrorCode(message.arg1);
                    break;
                case 14:
                    baseJobAgent.cleanup();
                    break;
                case 15:
                    try {
                        baseJobAgent.loadAgentId();
                    } catch (GeneralException e2) {
                        SdkLog.e(BaseJobAgent.TAG, "Retrieving agent id failed", e2);
                        this.mServiceAgent.handleError(e2.getErrorCode(), null);
                        return;
                    }
                    break;
                default:
                    SdkLog.w(BaseJobAgent.TAG, "Invalid msg received: " + message.what);
                    break;
            }
        }

        public void quit() {
            getLooper().quit();
            this.mServiceAgent = null;
        }
    }

    public class AuthenticationCallback extends IPeerAgentAuthCallback.Stub {
        @Override // com.heytap.accessory.api.IPeerAgentAuthCallback
        public void onPeerAgentAuthenticated(Bundle bundle) throws RemoteException {
            SdkLog.v(BaseJobAgent.TAG, "Received Authentication response");
            AgentHandler agentHandler = BaseJobAgent.this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseJobAgent.TAG, "onPeerAgentAuthenticated: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(11);
            messageObtainMessage.setData(bundle);
            BaseJobAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }

        private AuthenticationCallback() {
        }
    }

    public class ConnectionCallback implements BaseSocket.ConnectionStatusCallback {
        @Override // com.heytap.accessory.BaseSocket.ConnectionStatusCallback
        public void onConnectionClosed(BaseSocket baseSocket) {
            BaseJobAgent.this.mSuccessfulConnections.remove(baseSocket);
        }

        @Override // com.heytap.accessory.BaseSocket.ConnectionStatusCallback
        public void onConnectionFailure(PeerAgent peerAgent, int i) {
            if (i == 20001) {
                SdkLog.w(BaseJobAgent.TAG, "Framework disconnected during connection process!");
                BaseJobAgent.this.handleError(i, peerAgent);
                return;
            }
            AgentHandler agentHandler = BaseJobAgent.this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseJobAgent.TAG, "onConnectionFailure: mBackgroundWorker is null!");
                return;
            }
            if (i == BaseJobAgent.CONNECTION_FAILURE_LOCAL_AGENT_NOT_FOUND) {
                BaseJobAgent.this.mBackgroundWorker.sendMessage(agentHandler.obtainMessage(1));
                i = 10008;
            }
            SdkLog.e(BaseJobAgent.TAG, "Connection attempt failed wih peer:" + peerAgent.getAgentId() + " reason:" + i);
            Message messageObtainMessage = BaseJobAgent.this.mBackgroundWorker.obtainMessage(13);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = peerAgent;
            BaseJobAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }

        @Override // com.heytap.accessory.BaseSocket.ConnectionStatusCallback
        public void onConnectionSuccess(PeerAgent peerAgent, BaseSocket baseSocket) {
            BaseJobAgent.this.mSuccessfulConnections.add(baseSocket);
            SdkLog.i(BaseJobAgent.TAG, "Connection success with peer:" + peerAgent.getAgentId());
            BaseJobAgent.this.onServiceConnectionResponse(peerAgent, baseSocket, 0);
            BaseJobAgent.this.handleServiceConnectionErrorCode(0);
        }

        private ConnectionCallback() {
        }
    }

    public static class InstanceCreator {
        private String mAgentImplClass;
        private RequestAgentCallback mCallback;
        private Context mContext;

        public InstanceCreator(Context context, String str, RequestAgentCallback requestAgentCallback) {
            this.mContext = context;
            this.mAgentImplClass = str;
            this.mCallback = requestAgentCallback;
        }

        public void createInstance() {
            if (BaseJobAgent.sInstanceHandler == null) {
                HandlerThread handlerThread = new HandlerThread("instance");
                handlerThread.start();
                InstanceHandler unused = BaseJobAgent.sInstanceHandler = new InstanceHandler(handlerThread.getLooper());
            }
            Message messageObtainMessage = BaseJobAgent.sInstanceHandler.obtainMessage(1);
            messageObtainMessage.obj = this;
            messageObtainMessage.sendToTarget();
        }
    }

    public static class InstanceHandler extends Handler {
        static final int CREATE_AGENT = 1;
        static final int DESTROY_AGENT = 2;

        public InstanceHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                BaseJobAgent baseJobAgent = (BaseJobAgent) message.obj;
                if (BaseJobAgent.sAgentsMap.get(baseJobAgent.getClass().getName()) == baseJobAgent) {
                    baseJobAgent.destroy();
                    return;
                } else {
                    SdkLog.w(BaseJobAgent.TAG, "Stale agent entry. Agent already destroyed. Ignoring...");
                    return;
                }
            }
            InstanceCreator instanceCreator = (InstanceCreator) message.obj;
            Context context = instanceCreator.mContext;
            String str = instanceCreator.mAgentImplClass;
            RequestAgentCallback requestAgentCallback = instanceCreator.mCallback;
            SdkLog.d(BaseJobAgent.TAG, "CREATE_AGENT: " + str);
            int i2 = message.arg1;
            BaseJobAgent baseJobAgent2 = (BaseJobAgent) BaseJobAgent.sAgentsMap.get(str);
            if (baseJobAgent2 != null) {
                SdkLog.d(BaseJobAgent.TAG, "CREATE_AGENT, but sAgentMap already exist");
                if (!baseJobAgent2.isProcessingCleanup()) {
                    if (requestAgentCallback != null) {
                        requestAgentCallback.onAgentAvailable(baseJobAgent2);
                        return;
                    }
                    return;
                } else {
                    if (i2 != 4) {
                        Message messageObtainMessage = obtainMessage(1);
                        messageObtainMessage.arg1 = i2 + 1;
                        messageObtainMessage.obj = instanceCreator;
                        sendMessageDelayed(messageObtainMessage, BaseJobAgent.CLEANUP_WAIT_TIME);
                        return;
                    }
                    requestAgentCallback.onError(BaseJobAgent.ERROR_AGENT_REQUEST_IN_PROGRESS, "Class could not be initialized: " + str + ". Error occurred while releasing agent.");
                    return;
                }
            }
            BaseJobAgent.INSTANCE_LOCK.lock();
            SdkLog.d(BaseJobAgent.TAG, "CREATE_AGENT, create it by reflection: " + str);
            try {
                try {
                    try {
                        try {
                            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(Context.class);
                            declaredConstructor.setAccessible(true);
                            declaredConstructor.newInstance(context);
                            BaseJobAgent.INSTANCE_LOCK.unlock();
                            BaseJobAgent baseJobAgent3 = (BaseJobAgent) BaseJobAgent.sAgentsMap.get(str);
                            if (baseJobAgent3 != null) {
                                if (requestAgentCallback != null) {
                                    requestAgentCallback.onAgentAvailable(baseJobAgent3);
                                }
                            } else {
                                requestAgentCallback.onError(BaseJobAgent.ERROR_CONSTRUCTOR_EXCEPTION, "Class could not be initialized: " + str + ". Call super inside constructor.");
                            }
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            requestAgentCallback.onError(BaseJobAgent.ERROR_CONSTRUCTOR_EXCEPTION, "Class constructor not accessible: " + str);
                            BaseJobAgent.INSTANCE_LOCK.unlock();
                        } catch (InstantiationException e2) {
                            e2.printStackTrace();
                            requestAgentCallback.onError(BaseJobAgent.ERROR_CONSTRUCTOR_EXCEPTION, "Class instantiation error: " + str);
                            BaseJobAgent.INSTANCE_LOCK.unlock();
                        }
                    } catch (ClassNotFoundException e3) {
                        e3.printStackTrace();
                        requestAgentCallback.onError(BaseJobAgent.ERROR_CLASS_NOT_FOUND, "Class not found: " + str);
                        BaseJobAgent.INSTANCE_LOCK.unlock();
                    } catch (NoSuchMethodException e4) {
                        e4.printStackTrace();
                        requestAgentCallback.onError(BaseJobAgent.ERROR_CONSTRUCTOR_NOT_FOUND, "Constructor with Context argument not found: " + str);
                        BaseJobAgent.INSTANCE_LOCK.unlock();
                    }
                } catch (IllegalArgumentException e5) {
                    e5.printStackTrace();
                    requestAgentCallback.onError(BaseJobAgent.ERROR_CONSTRUCTOR_EXCEPTION, "Class instantiation error: " + str + ". Invalid context passed.");
                    BaseJobAgent.INSTANCE_LOCK.unlock();
                } catch (InvocationTargetException e6) {
                    e6.printStackTrace();
                    requestAgentCallback.onError(BaseJobAgent.ERROR_CONSTRUCTOR_EXCEPTION, "Exception occurred while calling constructor of class: " + str);
                    BaseJobAgent.INSTANCE_LOCK.unlock();
                }
            } catch (Throwable th) {
                BaseJobAgent.INSTANCE_LOCK.unlock();
                throw th;
            }
        }

        public void quit() {
            getLooper().quit();
        }
    }

    public class PeerAgentCallback extends IPeerAgentCallback.Stub {
        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentUpdated(Bundle bundle) throws RemoteException {
            SdkLog.v(BaseJobAgent.TAG, "Received peer agent update");
            bundle.setClassLoader(PeerAgent.class.getClassLoader());
            if (!bundle.containsKey("peerAgents")) {
                SdkLog.e(BaseJobAgent.TAG, "No peer agents in PeerAgent update callback!");
                return;
            }
            ArrayList<PeerAgent> parcelableArrayList = bundle.getParcelableArrayList("peerAgents");
            int i = bundle.getInt("peerAgentStatus");
            if (parcelableArrayList == null) {
                SdkLog.e(BaseJobAgent.TAG, "Peer Update - invalid peer agent list from Accessory Framework");
                return;
            }
            if (i != 105 && i != 106) {
                SdkLog.e(BaseJobAgent.TAG, "Peer Update - invalid peer status from Accessory Framework:" + i);
                return;
            }
            SdkLog.i(BaseJobAgent.TAG, parcelableArrayList.size() + " Peer agent(s) updated for:" + getClass().getName());
            for (PeerAgent peerAgent : parcelableArrayList) {
                SdkLog.i(BaseJobAgent.TAG, "Peer ID:" + peerAgent.getAgentId() + "Container Id:" + peerAgent.getAppName() + " Accessory" + peerAgent.getAccessory().getAccessoryId());
            }
            AgentHandler agentHandler = BaseJobAgent.this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseJobAgent.TAG, "onPeerAgentUpdated: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage();
            messageObtainMessage.what = 4;
            if (i == 105) {
                messageObtainMessage.arg1 = 1;
            } else {
                messageObtainMessage.arg1 = 2;
            }
            messageObtainMessage.obj = parcelableArrayList.toArray(new PeerAgent[parcelableArrayList.size()]);
            BaseJobAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }

        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentsFound(Bundle bundle) throws RemoteException {
            SdkLog.v(BaseJobAgent.TAG, "FindPeer response received.");
            bundle.setClassLoader(PeerAgent.class.getClassLoader());
            if (bundle.containsKey("errorcode")) {
                int i = bundle.getInt("errorcode");
                SdkLog.e(BaseJobAgent.TAG, "Peer Not Found(" + i + ") for: " + getClass().getName());
                AgentHandler agentHandler = BaseJobAgent.this.mBackgroundWorker;
                if (agentHandler == null) {
                    SdkLog.w(BaseJobAgent.TAG, "onPeersAgentsFound: mBackgroundWorker is null!");
                    return;
                }
                Message messageObtainMessage = agentHandler.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.arg1 = i;
                BaseJobAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
                return;
            }
            ArrayList<PeerAgent> parcelableArrayList = bundle.getParcelableArrayList("peerAgents");
            if (parcelableArrayList == null) {
                SdkLog.e(BaseJobAgent.TAG, "Find Peer - invalid response from Accessory Framework");
                return;
            }
            SdkLog.i(BaseJobAgent.TAG, parcelableArrayList.size() + " Peer agent(s) found for:" + getClass().getName());
            for (PeerAgent peerAgent : parcelableArrayList) {
                SdkLog.i(BaseJobAgent.TAG, "Peer ID:" + peerAgent.getAgentId() + "Container Id:" + peerAgent.getAppName() + " Accessory" + peerAgent.getAccessory().getAccessoryId() + " Transport:" + peerAgent.getAccessory().getTransportType());
            }
            AgentHandler agentHandler2 = BaseJobAgent.this.mBackgroundWorker;
            if (agentHandler2 == null) {
                SdkLog.w(BaseJobAgent.TAG, "onPeerAgentsFound: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage2 = agentHandler2.obtainMessage();
            messageObtainMessage2.what = 3;
            messageObtainMessage2.arg1 = 0;
            messageObtainMessage2.obj = parcelableArrayList.toArray(new PeerAgent[parcelableArrayList.size()]);
            BaseJobAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage2);
        }

        private PeerAgentCallback() {
        }
    }

    public interface RequestAgentCallback {
        void onAgentAvailable(BaseJobAgent baseJobAgent);

        void onError(int i, String str);
    }

    public BaseJobAgent(String str, Context context) {
        if (str == null || "".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException("Invalid parameter name:" + str);
        }
        if (INSTANCE_LOCK.isHeldByCurrentThread()) {
            this.mName = str;
            this.mContext = context;
            initializeAgent();
        } else {
            throw new IllegalArgumentException("Constructor should not be called for initializing " + str + ". Call requestAgent API instead");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acceptServiceConnectionInternal(PeerAgent peerAgent) {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, peerAgent);
        } else {
            instantiateSocket().acceptServiceConnection(localAgentId, peerAgent, this.mAdapter, this.mConnectionCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindToFramework() throws GeneralException {
        this.mAdapter.registerAgentCallback(this.mAgentCallback);
        this.mAdapter.bindToFramework();
        loadAgentId();
    }

    private void cleanupConnections(boolean z) {
        synchronized (this.mSuccessfulConnections) {
            for (BaseSocket baseSocket : this.mSuccessfulConnections) {
                if (z) {
                    baseSocket.forceClose();
                } else {
                    baseSocket.close();
                }
            }
        }
        this.mSuccessfulConnections.clear();
        Initializer.clearSdkConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        SdkLog.d(TAG, "BaseJobAgent - onDestroy:" + getClass().getSimpleName());
        synchronized (this.mLock) {
            this.mProcessingCleanup = true;
        }
        AgentHandler agentHandler = this.mBackgroundWorker;
        if (agentHandler != null) {
            agentHandler.obtainMessage(14).sendToTarget();
        }
    }

    private synchronized void fetchServiceProfile() {
        ConfigUtil defaultInstance = ConfigUtil.getDefaultInstance(getApplicationContext());
        if (defaultInstance != null) {
            ServiceProfile serviceProfileFetchServicesDescription = defaultInstance.fetchServicesDescription(getClass().getName());
            this.mServiceProfile = serviceProfileFetchServicesDescription;
            if (serviceProfileFetchServicesDescription == null) {
                SdkLog.e(TAG, "fetch service profile description failed !!");
            }
        } else {
            SdkLog.e(TAG, "config  util defualt instance  creation failed !!");
        }
    }

    private void handleAuthErrorCode(int i) {
        if (i == 0) {
            SdkLog.i(TAG, "onAuthenticationResponse() -> AUTHENTICATION_SUCCESS");
            return;
        }
        if (i == 1545) {
            SdkLog.i(TAG, "onAuthenticationResponse() -> AUTHENTICATION_FAILURE_TOKEN_NOT_GENERATED");
            return;
        }
        if (i == 1546) {
            SdkLog.i(TAG, "onAuthenticationResponse() -> AUTHENTICATION_FAILURE_PEER_AGENT_NOT_SUPPORTED");
            return;
        }
        SdkLog.w(TAG, "onAuthenticationResponse() errorCode: " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAuthResponse(Bundle bundle) {
        int i;
        bundle.setClassLoader(PeerAgent.class.getClassLoader());
        byte[] byteArray = bundle.getByteArray("PEER_AGENT_KEY");
        int i2 = bundle.getInt("CERT_TYPE");
        PeerAgent peerAgent = (PeerAgent) bundle.getParcelable("peerAgent");
        long j = bundle.getLong("transactionId");
        if (peerAgent == null) {
            SdkLog.e(TAG, "Invalid response from framework! No peer agent in auth response.Ignoring response");
            return;
        }
        peerAgent.setTransactionId(j);
        if (byteArray == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Authentication failed error:");
            i = AUTHENTICATION_FAILURE_TOKEN_NOT_GENERATED;
            sb.append(AUTHENTICATION_FAILURE_TOKEN_NOT_GENERATED);
            sb.append(" Peer Id:");
            sb.append(peerAgent.getAgentId());
            SdkLog.e(TAG, sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Authentication success status: ");
            i = 0;
            sb2.append(0);
            sb2.append(" for peer: ");
            sb2.append(peerAgent.getAgentId());
            SdkLog.i(TAG, sb2.toString());
        }
        onAuthenticationResponse(peerAgent, new AuthenticationToken(i2, byteArray), i);
        handleAuthErrorCode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFindPeerErrorCode(int i) {
        if (i == 0) {
            SdkLog.i(TAG, "onFindPeerAgentsResponse() -> PEER_AGENT_FOUND");
        }
        if (i == 10010) {
            SdkLog.i(TAG, "onFindPeerAgentsResponse() -> FIND_PEER_TIMEOUT");
            return;
        }
        switch (i) {
            case 10001:
                SdkLog.i(TAG, "onFindPeerAgentsResponse() -> FIND_PEER_DEVICE_NOT_CONNECTED");
                break;
            case 10002:
                SdkLog.i(TAG, "onFindPeerAgentsResponse() -> FIND_PEER_SERVICE_NOT_FOUND");
                break;
            case 10003:
                SdkLog.i(TAG, "onFindPeerAgentsResponse() -> FIND_PEER_DUPLICATE_REQUEST");
                break;
            default:
                SdkLog.w(TAG, "onFindPeerAgentsResponse() errorCode: " + i);
                break;
        }
    }

    private void handleInvalidPeerAction(PeerAgent peerAgent) {
        synchronized (this.mPendingRequests) {
            Iterator<PeerAgent> it = this.mPendingRequests.iterator();
            while (it.hasNext()) {
                rejectServiceConnectionInternal(it.next());
            }
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler != null) {
                Message messageObtainMessage = agentHandler.obtainMessage(12);
                messageObtainMessage.arg1 = 10008;
                messageObtainMessage.obj = peerAgent;
                this.mBackgroundWorker.sendMessage(messageObtainMessage);
            } else {
                SdkLog.w(TAG, "handle Invalid PeerAction: mBackgroundWorker is null!");
            }
        }
    }

    public static void handleLowMemory() {
        synchronized (sAgentsMap) {
            Iterator<BaseJobAgent> it = sAgentsMap.values().iterator();
            while (it.hasNext()) {
                it.next().handleAgentLowMemory();
            }
        }
    }

    private void handleOnErrorCode(int i) {
        if (i == 1025) {
            SdkLog.i(TAG, "onError() -> ERROR_CONNECTION_INVALID_PARAM");
        }
        switch (i) {
            case 20001:
                SdkLog.i(TAG, "onError() -> ERROR_FATAL");
                break;
            case 20002:
                SdkLog.i(TAG, "onError() -> ERROR_SDK_NOT_INITIALIZED");
                break;
            case 20003:
                SdkLog.i(TAG, "onError() -> ERROR_PERMISSION_DENIED");
                break;
            case 20004:
                SdkLog.i(TAG, "onError() -> ERROR_PERMISSION_FAILED");
                break;
            default:
                SdkLog.w(TAG, "onError() errorCode: " + i);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePeerAgentUpdateErrorCode(int i) {
        if (i == 1) {
            SdkLog.i(TAG, "onPeerAgentUpdated() -> PEER_AGENT_AVAILABLE");
            return;
        }
        if (i == 2) {
            SdkLog.i(TAG, "onPeerAgentUpdated() -> PEER_AGENT_UNAVAILABLE");
            return;
        }
        SdkLog.w(TAG, "onPeerAgentUpdated() errorCode: " + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleServiceConnectionErrorCode(int i) {
        if (i == 0) {
            SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_SUCCESS");
        }
        if (i == 10012) {
            SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_FAILURE_NETWORK");
            return;
        }
        switch (i) {
            case 10004:
                SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_FAILURE_DEVICE_UNREACHABLE");
                break;
            case 10005:
                SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_ALREADY_EXIST");
                break;
            case 10006:
                SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_FAILURE_PEERAGENT_NO_RESPONSE");
                break;
            case 10007:
                SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_FAILURE_PEERAGENT_REJECTED");
                break;
            case 10008:
                SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_FAILURE_INVALID_PEER_AGENT");
                break;
            case 10009:
                SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_DUPLICATE_REQUEST");
                break;
            case 10010:
                SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_FAILURE_SERVICE_LIMIT_REACHED");
                break;
            default:
                SdkLog.w(TAG, "onServiceConnectionResponse() errorCode: " + i);
                break;
        }
    }

    private void initializeAgent() {
        try {
            new SdkConfig(getApplicationContext());
        } catch (GeneralException e) {
            e.printStackTrace();
        }
        SdkLog.d(TAG, "BaseJobAgent - initialize:" + getClass().getSimpleName());
        this.mSuccessfulConnections = Collections.synchronizedList(new ArrayList());
        this.mPendingRequests = Collections.synchronizedSet(new HashSet());
        Looper looper = ThreadManager.getInstance().getLooper(ThreadManager.TYPE_AGENT);
        if (looper == null) {
            SdkLog.e(TAG, "Unable to start Agent thread.");
            throw new RuntimeException("Unable to start Agent.Worker thread creation failed");
        }
        this.mBackgroundWorker = new AgentHandler(this, looper);
        try {
            Initializer.initBufferPool(getApplicationContext());
        } catch (SdkUnsupportedException e2) {
            SdkLog.e(TAG, "SDK initialization failed!", e2);
            Message messageObtainMessage = this.mBackgroundWorker.obtainMessage(12);
            messageObtainMessage.arg1 = 20002;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }
        putAgent(getClass().getName(), this);
        this.mAdapter = BaseAdapter.getDefaultAdapter(getApplicationContext(), this.mBackgroundWorker);
        this.mPeerAuthCallback = new AuthenticationCallback();
        this.mPeerAgentCallback = new PeerAgentCallback();
        this.mConnectionCallback = new ConnectionCallback();
        this.mAgentCallback = new AgentCallbackImpl(this);
        this.mBackgroundWorker.sendEmptyMessage(0);
        fetchServiceProfile();
    }

    private BaseSocket instantiateSocket() {
        validateSocketImplementation(this.mSocketImpl);
        try {
            SdkLog.d(TAG, "Instantiating BaseSocket: " + this.mSocketImpl.getName());
            if (Modifier.toString(this.mSocketImpl.getModifiers()).contains("static") || this.mSocketImpl.getEnclosingClass() == null || !BaseJobAgent.class.isAssignableFrom(this.mSocketImpl.getEnclosingClass())) {
                Constructor<? extends BaseSocket> declaredConstructor = this.mSocketImpl.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            }
            Class<? extends BaseSocket> cls = this.mSocketImpl;
            Constructor<? extends BaseSocket> declaredConstructor2 = cls.getDeclaredConstructor(cls.getEnclosingClass());
            declaredConstructor2.setAccessible(true);
            return declaredConstructor2.newInstance(this);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            SdkLog.e(TAG, "Invalid implementation of BaseSocket. Provider a public default constructor." + e.getClass().getSimpleName() + " " + e.getMessage());
            throw new RuntimeException("Invalid implementation of BaseSocket. Provider a public default constructor.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isProcessingCleanup() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mProcessingCleanup;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAgentId() throws GeneralException {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, null);
            return;
        }
        SharedPreferences.Editor editorEdit = this.mContext.createDeviceProtectedStorageContext().getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).edit();
        editorEdit.putString(localAgentId, getClass().getName());
        editorEdit.putString(getClass().getName(), localAgentId);
        editorEdit.apply();
        SdkLog.d(TAG, "save AgentId className:" + getClass().getName() + ",agentId: " + localAgentId);
        this.mAgentId = localAgentId;
        registerMexAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyConnectionRequest(Intent intent) {
        if (intent == null) {
            SdkLog.e(TAG, "Invalid service connection indication.Intent:null.Ignoring reqeuset");
            return;
        }
        notifyConnectionRequest(intent.getLongExtra("transactionId", 0L), intent.getStringExtra("agentId"), (PeerAgent) intent.getParcelableExtra("peerAgent"));
    }

    private static void putAgent(String str, BaseJobAgent baseJobAgent) {
        if (sAgentsMap.containsKey(str)) {
            return;
        }
        sAgentsMap.put(str, baseJobAgent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerMexAgent() throws GeneralException {
        String str;
        BaseMessage baseMessage = this.mMessage;
        if (baseMessage == null || (str = this.mAgentId) == null) {
            return;
        }
        baseMessage.registerAgent(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerService() {
        RegistrationTask registrationTask = new RegistrationTask(getApplicationContext());
        Future<Void> futurePrepare = registrationTask.prepare();
        registrationTask.start();
        try {
            futurePrepare.get();
        } catch (InterruptedException unused) {
            SdkLog.e(TAG, "Regisration failed! : InterruptedException");
        } catch (ExecutionException unused2) {
            SdkLog.e(TAG, "Registration failed! : ExecutionException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rejectServiceConnectionInternal(PeerAgent peerAgent) {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, peerAgent);
            return;
        }
        try {
            this.mAdapter.rejectServiceConnection(localAgentId, peerAgent, peerAgent.getTransactionId());
        } catch (GeneralException e) {
            SdkLog.e(TAG, "Failed to reject Service connection!", e);
            handleError(e.getErrorCode(), peerAgent);
        }
    }

    public static void requestAgent(Context context, String str, RequestAgentCallback requestAgentCallback) {
        SdkLog.d(TAG, "requestAgent");
        new InstanceCreator(context, str, requestAgentCallback).createInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestConnection(PeerAgent peerAgent) {
        String localAgentId = getLocalAgentId();
        if (localAgentId != null) {
            instantiateSocket().initiateServiceconnection(localAgentId, peerAgent, this.mAdapter, this.mConnectionCallback);
        } else {
            SdkLog.e(TAG, "Failed to retrieve service description.Ignoring service connection request");
            handleError(20001, peerAgent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestPeerAgents() {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, null);
            return;
        }
        try {
            int iFindPeerAgents = this.mAdapter.findPeerAgents(localAgentId, this.mPeerAgentCallback);
            if (iFindPeerAgents == 0) {
                SdkLog.d(TAG, "Find peer request successfully enqueued.");
            } else {
                SdkLog.w(TAG, "Find peer request failed:" + iFindPeerAgents + " for service " + getClass().getName());
                onFindPeerAgentsResponse(null, iFindPeerAgents);
                handleFindPeerErrorCode(iFindPeerAgents);
            }
        } catch (GeneralException e) {
            SdkLog.e(TAG, "Find Peer request failed!");
            handleError(e.getErrorCode(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestPeerAuthInternal(PeerAgent peerAgent) {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, peerAgent);
            return;
        }
        try {
            int iAuthenticatePeeragent = this.mAdapter.authenticatePeeragent(localAgentId, peerAgent, this.mPeerAuthCallback, peerAgent.getTransactionId());
            if (iAuthenticatePeeragent == 0) {
                SdkLog.i(TAG, "Auth. request for peer: " + peerAgent.getAgentId() + " done successfully");
            } else {
                SdkLog.e(TAG, "Auth. request for peer: " + peerAgent.getAgentId() + " failed as reason: " + iAuthenticatePeeragent);
                onAuthenticationResponse(peerAgent, null, iAuthenticatePeeragent);
                handleAuthErrorCode(iAuthenticatePeeragent);
            }
        } catch (GeneralException e) {
            SdkLog.e(TAG, "Failed to request peer authentication!", e);
            handleError(e.getErrorCode(), peerAgent);
        }
    }

    private void validateSocketImplementation(Class<? extends BaseSocket> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("Invalid socketClass param:" + cls);
        }
        try {
            if (Modifier.toString(cls.getModifiers()).contains("static") || cls.getEnclosingClass() == null) {
                cls.getDeclaredConstructor(new Class[0]);
            } else {
                cls.getDeclaredConstructor(cls.getEnclosingClass());
            }
        } catch (NoSuchMethodException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage(), e);
            throw new RuntimeException("Invalid implemetation of BaseSocket. Provider a public default constructor in the implementation class.");
        }
    }

    public void acceptServiceConnectionRequest(PeerAgent peerAgent) {
        if (peerAgent == null) {
            throw new IllegalArgumentException("Illegal argument peerAgent:" + peerAgent);
        }
        try {
            Initializer.initBufferPool(getApplicationContext());
            if (this.mPendingRequests.remove(peerAgent)) {
                SdkLog.i(TAG, "Trying to Accept service connection request from peer:" + peerAgent.getAgentId() + " Transaction:" + peerAgent.getTransactionId());
                AgentHandler agentHandler = this.mBackgroundWorker;
                if (agentHandler == null) {
                    SdkLog.w(TAG, "acceptServiceConnection: mBackgroundWorker is null!");
                    return;
                }
                Message messageObtainMessage = agentHandler.obtainMessage(8);
                messageObtainMessage.obj = peerAgent;
                this.mBackgroundWorker.sendMessage(messageObtainMessage);
            }
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            handleError(20002, peerAgent);
        }
    }

    public void authenticatePeerAgent(PeerAgent peerAgent) {
        if (peerAgent == null) {
            throw new IllegalArgumentException("Illegal argument peerAgent:" + peerAgent);
        }
        try {
            Initializer.initBufferPool(getApplicationContext());
            SdkLog.i(TAG, "Authentication requested for peer:" + peerAgent.getAgentId());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(TAG, "authenticatePeerAgent: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(10);
            messageObtainMessage.obj = peerAgent;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            handleError(20002, peerAgent);
        }
    }

    public void cleanup() {
        SdkLog.w(TAG, "Performing agent cleanup");
        if (this.mAdapter != null) {
            cleanupConnections(false);
            String localAgentId = getLocalAgentId();
            if (localAgentId != null) {
                this.mAdapter.cleanupAgent(localAgentId);
            }
            this.mAdapter.unregisterAgentCallback(this.mAgentCallback);
            BaseMessage baseMessage = this.mMessage;
            if (baseMessage != null) {
                baseMessage.unregisterAgent();
            }
        }
        sAgentsMap.remove(getClass().getName());
        synchronized (this.mLock) {
            this.mProcessingCleanup = false;
        }
    }

    public final synchronized void findPeerAgents() {
        SdkLog.d(TAG, "findPeer request received by:" + getClass().getName());
        try {
            Initializer.initBufferPool(getApplicationContext());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler != null) {
                Message messageObtainMessage = agentHandler.obtainMessage();
                messageObtainMessage.what = 2;
                this.mBackgroundWorker.sendMessage(messageObtainMessage);
            } else {
                SdkLog.w(TAG, "findPeerAgents: mBackgroundWorker is null!");
            }
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: ", e);
            handleError(20002, null);
        }
    }

    public Handler getAgentHandler() {
        return this.mBackgroundWorker;
    }

    public Context getApplicationContext() {
        return this.mContext.getApplicationContext();
    }

    public String getId() {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, null);
        }
        return localAgentId;
    }

    public String getLocalAgentId() {
        if (this.mAdapter == null) {
            SdkLog.w(TAG, "BaseAdapter is null,just return!");
            return null;
        }
        SdkLog.d(TAG, "mGetAgentIdRetryCount = " + this.mGetAgentIdRetryCount);
        if (this.mGetAgentIdRetryCount >= 2) {
            this.mGetAgentIdRetryCount = 0;
            SdkLog.e(TAG, "Failed to retrieve service record, retry 2");
            return null;
        }
        try {
            String localAgentId = this.mAdapter.getLocalAgentId(getClass().getName());
            SdkLog.i(TAG, "Agent ID retrieved successfully for " + getClass().getName() + " Agent ID:" + localAgentId);
            return localAgentId;
        } catch (GeneralException e) {
            if (e.getErrorCode() != 10016) {
                SdkLog.e(TAG, "Failed to retrieve service record", e);
                return null;
            }
            this.mGetAgentIdRetryCount++;
            SdkLog.w(TAG, "Service record was not found in Accessory Framework.Registering service again!");
            try {
                registerService();
                SdkLog.i(TAG, "Trying to fetch agent ID after re-registration");
                return this.mAdapter.getLocalAgentId(getClass().getName());
            } catch (GeneralException unused) {
                SdkLog.e(TAG, "Failed to retrieve service record after re-registration", e);
                return null;
            }
        }
    }

    public int getServiceChannelId(int i) {
        if (this.mServiceProfile == null) {
            SdkLog.e(TAG, "Failed because Service Profile is null");
            return -1;
        }
        if (i >= 0 && i < getServiceChannelSize()) {
            return this.mServiceProfile.getServiceChannelList().get(i).getChannelId();
        }
        SdkLog.e(TAG, "Failed because of wrong index");
        return -1;
    }

    public int getServiceChannelSize() {
        ServiceProfile serviceProfile = this.mServiceProfile;
        if (serviceProfile != null) {
            return serviceProfile.getServiceChannelList().size();
        }
        SdkLog.e(TAG, "Failed because Service Profile is null");
        return -1;
    }

    public String getServiceProfileId() {
        ServiceProfile serviceProfile = this.mServiceProfile;
        if (serviceProfile != null) {
            return serviceProfile.getId();
        }
        SdkLog.e(TAG, "Failed because Service Profile is null");
        return null;
    }

    public String getServiceProfileName() {
        ServiceProfile serviceProfile = this.mServiceProfile;
        if (serviceProfile != null) {
            return serviceProfile.getName();
        }
        SdkLog.e(TAG, "Failed because Service Profile is null");
        return null;
    }

    public List<BaseSocket> getSuccessfulConnections() {
        return this.mSuccessfulConnections;
    }

    public void handleAgentLowMemory() {
        this.mBackgroundWorker.sendEmptyMessage(18);
    }

    public void handleConnectionRequest(Intent intent) {
        Message messageObtainMessage = this.mBackgroundWorker.obtainMessage();
        messageObtainMessage.what = 5;
        messageObtainMessage.obj = intent;
        this.mBackgroundWorker.sendMessage(messageObtainMessage);
    }

    public void handleError(int i, PeerAgent peerAgent) {
        if (i == 10008) {
            onServiceConnectionResponse(peerAgent, null, 10008);
            handleServiceConnectionErrorCode(10008);
        }
        switch (i) {
            case 20001:
                cleanupConnections(true);
                onError(null, "Oplus Accessory Framework has died!!", i);
                handleOnErrorCode(i);
                break;
            case 20002:
                SdkLog.e(TAG, "Oplus Accessory SDK cannot be initialized");
                onError(null, "Oplus Accessory SDK cannot be initialized. Device or Build not compatible.", i);
                handleOnErrorCode(i);
                break;
            case 20003:
            case 20004:
                onError(null, "Permission error!", i);
                handleOnErrorCode(i);
                break;
            default:
                SdkLog.w(TAG, "Unknown error: " + i);
                break;
        }
    }

    public void onAuthenticationResponse(PeerAgent peerAgent, AuthenticationToken authenticationToken, int i) {
        SdkLog.d(TAG, "Peer authentication response received:" + i);
    }

    public void onError(PeerAgent peerAgent, String str, int i) {
        if (peerAgent == null) {
            SdkLog.e(TAG, "ACCEPT_STATE_ERROR: " + i + ": " + str + " PeerAgent: null");
            return;
        }
        SdkLog.e(TAG, "ACCEPT_STATE_ERROR: " + i + ": " + str + " PeerAgent: " + peerAgent.getAgentId());
    }

    public void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
        SdkLog.e(TAG, "Invalid implementation of BaseJobAgent.onFindPeerAgentsResponse(PeerAgent[], int) should be overrided!");
    }

    public void onLowMemory() {
        SdkLog.d(TAG, "Service Low Memory");
    }

    public void onPeerAgentsUpdated(PeerAgent[] peerAgentArr, int i) {
        SdkLog.e(TAG, "Invalid implementation of BaseJobAgent.onPeerAgentsUpdated(PeerAgent[], int) should be overrided!");
    }

    public void onServiceConnectionRequested(PeerAgent peerAgent) {
        if (peerAgent != null) {
            SdkLog.v(TAG, "Accepting connection request by default from Peer:" + peerAgent.getAgentId() + " Transaction:" + peerAgent.getTransactionId());
        }
        acceptServiceConnectionRequest(peerAgent);
    }

    public void onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket baseSocket, int i) {
        SdkLog.w(TAG, "No Implementaion for onServiceConnectionResponse(PeerAgent peerAgent, BaseSocket socket, int result)!");
    }

    public String registerMessageInstance(BaseMessage baseMessage) {
        this.mMessage = baseMessage;
        return this.mAgentId;
    }

    public void rejectServiceConnectionRequest(PeerAgent peerAgent) {
        if (peerAgent == null) {
            throw new IllegalArgumentException("Illegal argument peerAgent:" + peerAgent);
        }
        try {
            Initializer.initBufferPool(getApplicationContext());
            if (!this.mPendingRequests.remove(peerAgent)) {
                SdkLog.w(TAG, "Rejecting service connection with invalid peer agent:" + peerAgent.toString());
                handleInvalidPeerAction(peerAgent);
                return;
            }
            SdkLog.i(TAG, "Trying to reject connection request from peer:" + peerAgent.getAgentId() + " Transaction:" + peerAgent.getTransactionId());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(TAG, "rejectServiceConnection: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(9);
            messageObtainMessage.obj = peerAgent;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            handleError(20002, peerAgent);
        }
    }

    public void releaseAgent() {
        Message messageObtainMessage = sInstanceHandler.obtainMessage(2);
        messageObtainMessage.obj = this;
        messageObtainMessage.sendToTarget();
    }

    public final void requestServiceConnection(PeerAgent peerAgent) {
        if (peerAgent == null) {
            throw new IllegalArgumentException("Illegal argument peerAgent:" + peerAgent);
        }
        try {
            Initializer.initBufferPool(getApplicationContext());
            SdkLog.i(TAG, "Service connection requested for peer:" + peerAgent.getAgentId());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(TAG, "requestServiceConection: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(7);
            messageObtainMessage.obj = peerAgent;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            handleError(20002, peerAgent);
        }
    }

    public boolean runOnBackgroundThread(Runnable runnable) {
        return this.mBackgroundWorker.post(runnable);
    }

    @TargetApi(21)
    public void handleConnectionRequest(JobParameters jobParameters, IJobListener iJobListener) {
        Message messageObtainMessage = this.mBackgroundWorker.obtainMessage();
        messageObtainMessage.what = 6;
        messageObtainMessage.obj = iJobListener;
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.EXTRA_PARAMS, jobParameters);
        messageObtainMessage.setData(bundle);
        this.mBackgroundWorker.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    public void notifyConnectionRequest(PersistableBundle persistableBundle) {
        if (persistableBundle == null) {
            SdkLog.e(TAG, "Invalid service connection indication.Intent:null.Ignoring reqeuset");
            return;
        }
        long j = persistableBundle.getLong("transactionId", 0L);
        String[] stringArray = persistableBundle.getStringArray("peerAgent");
        if (stringArray == null) {
            SdkLog.e(TAG, "Invalid initiator peer agent. Ignoring connection request");
        } else {
            notifyConnectionRequest(j, persistableBundle.getString("agentId"), new PeerAgent((List<String>) Arrays.asList(stringArray)));
        }
    }

    public BaseJobAgent(String str, Context context, Class<? extends BaseSocket> cls) {
        if (str != null && !"".equalsIgnoreCase(str)) {
            if (INSTANCE_LOCK.isHeldByCurrentThread()) {
                this.mName = str;
                this.mContext = context;
                validateSocketImplementation(cls);
                this.mSocketImpl = cls;
                SdkLog.d(TAG, "Thread Name:" + this.mName + "BaseSocket Imple class:" + cls.getName());
                initializeAgent();
                return;
            }
            throw new IllegalArgumentException("Constructor should not be called for initializing " + str + ". Call requestAgent API instead");
        }
        throw new IllegalArgumentException("Invalid parameter name:" + str);
    }

    private void notifyConnectionRequest(long j, String str, PeerAgent peerAgent) {
        if (peerAgent == null) {
            SdkLog.e(TAG, "Invalid initiator peer agent:" + peerAgent + ". Ignoring connection request");
            return;
        }
        if (str == null) {
            SdkLog.e(TAG, "Invalid local agent Id:" + str + ".Ignoring connection request");
            return;
        }
        peerAgent.setTransactionId(j);
        SdkLog.i(TAG, "Connection initiated by peer: " + peerAgent.getAgentId() + " on Accessory: " + peerAgent.getAccessory().getAccessoryId() + " Transaction: " + j);
        this.mPendingRequests.add(peerAgent);
        onServiceConnectionRequested(peerAgent);
    }
}
