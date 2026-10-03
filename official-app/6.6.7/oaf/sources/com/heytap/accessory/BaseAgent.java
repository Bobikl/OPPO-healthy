package com.heytap.accessory;

import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.heytap.accessory.api.IPeerAgentAuthCallback;
import com.heytap.accessory.api.IPeerAgentCallback;
import com.heytap.accessory.bean.AuthenticationToken;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.SdkUnsupportedException;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.misc.constants.FrameworkServiceConstants;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.ConfigUtil;
import com.heytap.accessory.utils.SdkConfig;
import com.heytap.accessory.utils.ThreadManager;
import com.heytap.accessory.utils.buffer.BufferPool;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class BaseAgent extends Service {
    public static final int AUTHENTICATION_FAILURE_PEER_AGENT_NOT_SUPPORTED = 10015;
    public static final int AUTHENTICATION_FAILURE_TOKEN_NOT_GENERATED = 10014;
    public static final int AUTHENTICATION_SUCCESS = 0;
    public static final int CONNECTION_ALREADY_EXIST = 10005;
    public static final int CONNECTION_DUPLICATE_REQUEST = 10009;
    public static final int CONNECTION_FAILURE_ACC_DORMANT = 10018;
    public static final int CONNECTION_FAILURE_CHANNELID_MISMATCH = 10011;
    public static final int CONNECTION_FAILURE_DEVICE_UNREACHABLE = 10004;
    public static final int CONNECTION_FAILURE_INVALID_PEERAGENT = 10008;
    public static final int CONNECTION_FAILURE_LOCAL_AGENT_NOT_FOUND = 10017;
    public static final int CONNECTION_FAILURE_NETWORK = 10012;
    public static final int CONNECTION_FAILURE_PEERAGENT_NO_RESPONSE = 10006;
    public static final int CONNECTION_FAILURE_PEERAGENT_REJECTED = 10007;
    public static final int CONNECTION_FAILURE_SERVICE_LIMIT_REACHED = 10010;
    public static final int CONNECTION_SUCCESS = 0;
    private static final int DEFAULT_GET_AGENT_ID_RETRY_COUNT = 2;
    public static final int ERROR_CONNECTION_INVALID_PARAM = 10013;
    public static final int ERROR_FATAL = 20001;
    public static final int ERROR_PERMISSION_DENIED = 20003;
    public static final int ERROR_PERMISSION_FAILED = 20004;
    public static final int ERROR_SDK_NOT_INITIALIZED = 20002;
    public static final int FIND_PEER_DEVICE_NOT_CONNECTED = 10001;
    public static final int FIND_PEER_DUPLICATE_REQUEST = 10003;
    public static final int FIND_PEER_SERVICE_NOT_FOUND = 10002;
    public static final int FIND_PEER_TIMEOUT = 10010;
    public static final int ON_PEER_INSTALLED = 0;
    public static final int ON_PEER_UNINSTALLED = 1;
    public static final int PEER_AGENT_AVAILABLE = 1;
    public static final int PEER_AGENT_FOUND = 0;
    public static final int PEER_AGENT_UNAVAILABLE = 2;
    public static final int SERVICE_RECORD_NOT_FOUND = 10016;
    private static final String TAG = "BaseAgent";
    BaseAdapter mAdapter;
    private AgentCallbackImpl mAgentCallback;
    private String mAgentId;
    AgentHandler mBackgroundWorker;
    private ConnectionCallback mConnectionCallback;
    private BaseMessage mMessage;
    private String mName;
    private PeerAgentCallback mPeerAgentCallback;
    private AuthenticationCallback mPeerAuthCallback;
    private Set<PeerAgent> mPendingRequests;
    private Class<? extends BaseSocket> mSocketImpl;
    private List<BaseSocket> mSuccessfulConnections;
    private ServiceProfile mServiceProfile = null;
    private int mGetAgentIdRetryCount = 0;

    public static class AgentCallbackImpl implements BaseAdapter.AgentCallback {
        private BaseAgent mAgent;

        public AgentCallbackImpl(BaseAgent baseAgent) {
            this.mAgent = baseAgent;
        }

        @Override // com.heytap.accessory.BaseAdapter.AgentCallback
        public void onAgentRegistered() throws GeneralException {
            AgentHandler agentHandler = this.mAgent.mBackgroundWorker;
            if (agentHandler != null) {
                agentHandler.sendEmptyMessage(14);
            } else {
                SdkLog.w(BaseAgent.TAG, "onAgentRegistered: mBackgroundWorker is null!");
            }
        }

        @Override // com.heytap.accessory.BaseAdapter.AgentCallback
        public void onFrameworkConnected() {
            try {
                this.mAgent.registerMexAgent();
            } catch (GeneralException e) {
                SdkLog.e(BaseAgent.TAG, "onFrameworkConnected() - Failed to register agent with message! " + e.getMessage());
            }
        }

        @Override // com.heytap.accessory.BaseAdapter.AgentCallback
        public void onFrameworkDisconnected() {
            AgentHandler agentHandler = this.mAgent.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseAgent.TAG, "onFrameworkDisconnected: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(11);
            messageObtainMessage.arg1 = 20001;
            this.mAgent.mBackgroundWorker.sendMessage(messageObtainMessage);
        }
    }

    public static class AgentHandler extends Handler {
        static final int MESSAGE_ACCEPT_SERVICE_CONNECTION = 7;
        static final int MESSAGE_ACCESSORY_STATUS_CHANGED = 15;
        static final int MESSAGE_BIND_FRAMEWORK = 0;
        static final int MESSAGE_CLEANUP = 13;
        static final int MESSAGE_CONNECTION_INDICATION = 5;
        static final int MESSAGE_FIND_PEER = 2;
        static final int MESSAGE_FIND_PEER_RESPONSE = 3;
        static final int MESSAGE_FIND_PEER_UPDATE = 4;
        static final int MESSAGE_LOAD_AGENT_ID = 14;
        static final int MESSAGE_ON_CONNECTION_FAILURE = 12;
        static final int MESSAGE_ON_ERROR = 11;
        static final int MESSAGE_PEER_AUTH_REQUEST = 9;
        static final int MESSAGE_PEER_AUTH_RESPONSE = 10;
        static final int MESSAGE_REGISTER = 1;
        static final int MESSAGE_REJECT_SERVICE_CONNECTION = 8;
        static final int MESSAGE_REQUEST_SERVICE_CONNECTION = 6;
        BaseAgent mServiceAgent;

        public AgentHandler(BaseAgent baseAgent, Looper looper) {
            super(looper);
            this.mServiceAgent = baseAgent;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    try {
                        this.mServiceAgent.bindToFramework();
                    } catch (GeneralException e) {
                        SdkLog.e(BaseAgent.TAG, "Binding to Accessory Framework failed", e);
                        this.mServiceAgent.handleError(e.getErrorCode(), null);
                    }
                    break;
                case 1:
                    this.mServiceAgent.registerService();
                    break;
                case 2:
                    this.mServiceAgent.requestPeerAgents();
                    break;
                case 3:
                    int i = message.arg1;
                    if (i != 0) {
                        this.mServiceAgent.onFindPeerAgentsResponse(null, i);
                        this.mServiceAgent.handleFindPeerErrorCode(message.arg1);
                    } else {
                        this.mServiceAgent.onFindPeerAgentsResponse((PeerAgent[]) message.obj, 0);
                        this.mServiceAgent.handleFindPeerErrorCode(0);
                    }
                    break;
                case 4:
                    this.mServiceAgent.onPeerAgentsUpdated((PeerAgent[]) message.obj, message.arg1);
                    this.mServiceAgent.handlePeerAgentUpdateErrorCode(message.arg1);
                    break;
                case 5:
                    this.mServiceAgent.notifyConnectionRequest((Intent) message.obj);
                    break;
                case 6:
                    this.mServiceAgent.requestConnection((PeerAgent) message.obj);
                    break;
                case 7:
                    this.mServiceAgent.acceptServiceConnectionInternal((PeerAgent) message.obj);
                    break;
                case 8:
                    this.mServiceAgent.rejectServiceConnectionInternal((PeerAgent) message.obj);
                    break;
                case 9:
                    this.mServiceAgent.requestPeerAuthInternal((PeerAgent) message.obj);
                    break;
                case 10:
                    this.mServiceAgent.handleAuthResponse(message.getData());
                    break;
                case 11:
                    Object obj = message.obj;
                    this.mServiceAgent.handleError(message.arg1, obj instanceof PeerAgent ? (PeerAgent) obj : null);
                    break;
                case 12:
                    Object obj2 = message.obj;
                    this.mServiceAgent.onServiceConnectionResponse(obj2 instanceof PeerAgent ? (PeerAgent) obj2 : null, null, message.arg1);
                    this.mServiceAgent.handleServiceConnectionErrorCode(message.arg1);
                    break;
                case 13:
                    this.mServiceAgent.cleanup();
                    break;
                case 14:
                    try {
                        this.mServiceAgent.loadAgentId();
                    } catch (GeneralException e2) {
                        SdkLog.e(BaseAgent.TAG, "Retrieving agent id failed", e2);
                        this.mServiceAgent.handleError(e2.getErrorCode(), null);
                        return;
                    }
                    break;
                case 15:
                    this.mServiceAgent.handleAccessoryStatusChanged((Intent) message.obj);
                    break;
                default:
                    SdkLog.w(BaseAgent.TAG, "Invalid msg received: " + message.what);
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
            SdkLog.v(BaseAgent.TAG, "Received Authentication response");
            AgentHandler agentHandler = BaseAgent.this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseAgent.TAG, "onPeerAgentAuthenticated: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(10);
            messageObtainMessage.setData(bundle);
            BaseAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }

        private AuthenticationCallback() {
        }
    }

    public class ConnectionCallback implements BaseSocket.ConnectionStatusCallback {
        @Override // com.heytap.accessory.BaseSocket.ConnectionStatusCallback
        public void onConnectionClosed(BaseSocket baseSocket) {
            BaseAgent.this.mSuccessfulConnections.remove(baseSocket);
        }

        @Override // com.heytap.accessory.BaseSocket.ConnectionStatusCallback
        public void onConnectionFailure(PeerAgent peerAgent, int i) {
            if (i == 20001) {
                SdkLog.w(BaseAgent.TAG, "Framework disconnected during connection process!");
                BaseAgent.this.handleError(i, peerAgent);
                return;
            }
            AgentHandler agentHandler = BaseAgent.this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseAgent.TAG, "onConnectionFailure: mBackgroundWorker is null!");
                return;
            }
            if (i == 10017) {
                BaseAgent.this.mBackgroundWorker.sendMessage(agentHandler.obtainMessage(1));
                i = 10008;
            }
            SdkLog.e(BaseAgent.TAG, "Connection attempt failed wih peer:" + peerAgent.getAgentId() + " reason:" + i);
            Message messageObtainMessage = BaseAgent.this.mBackgroundWorker.obtainMessage(12);
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = peerAgent;
            BaseAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }

        @Override // com.heytap.accessory.BaseSocket.ConnectionStatusCallback
        public void onConnectionSuccess(PeerAgent peerAgent, BaseSocket baseSocket) {
            BaseAgent.this.mSuccessfulConnections.add(baseSocket);
            SdkLog.d(BaseAgent.TAG, "Connection success with peer:" + peerAgent.getAgentId());
            BaseAgent.this.onServiceConnectionResponse(peerAgent, baseSocket, 0);
            BaseAgent.this.handleServiceConnectionErrorCode(0);
        }

        private ConnectionCallback() {
        }
    }

    public class PeerAgentCallback extends IPeerAgentCallback.Stub {
        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentUpdated(Bundle bundle) {
            SdkLog.v(BaseAgent.TAG, "Received peer agent update");
            bundle.setClassLoader(PeerAgent.class.getClassLoader());
            if (!bundle.containsKey("peerAgents")) {
                SdkLog.e(BaseAgent.TAG, "No peer agents in PeerAgent update callback!");
                return;
            }
            ArrayList<PeerAgent> parcelableArrayList = bundle.getParcelableArrayList("peerAgents");
            int i = bundle.getInt("peerAgentStatus");
            if (parcelableArrayList == null) {
                SdkLog.e(BaseAgent.TAG, "Peer Update - invalid peer agent list from Accessory Framework");
                return;
            }
            if (i != 0 && i != 1) {
                SdkLog.e(BaseAgent.TAG, "Peer Update - invalid peer status from Accessory Framework:" + i);
                return;
            }
            SdkLog.i(BaseAgent.TAG, parcelableArrayList.size() + " Peer agent(s) updated for:" + getClass().getName());
            for (PeerAgent peerAgent : parcelableArrayList) {
                SdkLog.i(BaseAgent.TAG, "Peer ID:" + peerAgent.getAgentId() + "Container Id:" + peerAgent.getAppName() + " Accessory" + peerAgent.getAccessory().getAccessoryId());
            }
            AgentHandler agentHandler = BaseAgent.this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(BaseAgent.TAG, "onPeerAgentUpdated: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage();
            messageObtainMessage.what = 4;
            if (i == 0) {
                messageObtainMessage.arg1 = 1;
            } else {
                messageObtainMessage.arg1 = 2;
            }
            messageObtainMessage.obj = parcelableArrayList.toArray(new PeerAgent[parcelableArrayList.size()]);
            BaseAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }

        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentsFound(Bundle bundle) {
            SdkLog.v(BaseAgent.TAG, "FindPeer response received.");
            bundle.setClassLoader(PeerAgent.class.getClassLoader());
            if (bundle.containsKey("errorcode")) {
                int i = bundle.getInt("errorcode");
                SdkLog.e(BaseAgent.TAG, "Peer Not Found(" + i + ") for: " + getClass().getName());
                AgentHandler agentHandler = BaseAgent.this.mBackgroundWorker;
                if (agentHandler == null) {
                    SdkLog.w(BaseAgent.TAG, "onPeersAgentsFound: mBackgroundWorker is null!");
                    return;
                }
                Message messageObtainMessage = agentHandler.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.arg1 = i;
                BaseAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
                return;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("peerAgents");
            if (parcelableArrayList == null) {
                SdkLog.e(BaseAgent.TAG, "Find Peer - invalid response from Accessory Framework");
                return;
            }
            SdkLog.i(BaseAgent.TAG, parcelableArrayList.size() + " Peer agent(s) found for:" + getClass().getName());
            SdkLog.i(BaseAgent.TAG, "Peer agent(s) " + parcelableArrayList);
            AgentHandler agentHandler2 = BaseAgent.this.mBackgroundWorker;
            if (agentHandler2 == null) {
                SdkLog.w(BaseAgent.TAG, "onPeerAgentsFound: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage2 = agentHandler2.obtainMessage();
            messageObtainMessage2.what = 3;
            messageObtainMessage2.arg1 = 0;
            messageObtainMessage2.obj = parcelableArrayList.toArray(new PeerAgent[parcelableArrayList.size()]);
            BaseAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage2);
        }

        private PeerAgentCallback() {
        }
    }

    public BaseAgent(String str, Class<? extends BaseSocket> cls) {
        if (str == null || "".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException("Invalid parameter name:" + str);
        }
        validateSocketImplementation(cls);
        this.mName = str;
        this.mSocketImpl = cls;
        SdkLog.d(TAG, "Thread Name:" + this.mName + "BaseSocket Imple class:" + cls.getName());
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

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanup() {
        SdkLog.w(TAG, "Performing agent cleanup");
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

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleAccessoryStatusChanged(Intent intent) {
        intent.getIntExtra(FrameworkServiceConstants.EXTRA_ACC_STATUS, 0);
    }

    private void handleAuthErrorCode(int i) {
        if (i == 0) {
            SdkLog.i(TAG, "onAuthenticationResponse() -> AUTHENTICATION_SUCCESS");
            return;
        }
        if (i == 10014) {
            SdkLog.i(TAG, "onAuthenticationResponse() -> AUTHENTICATION_FAILURE_TOKEN_NOT_GENERATED");
            return;
        }
        if (i == 10015) {
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
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Authentication failed error:");
            i = 10014;
            sb.append(10014);
            sb.append(" Peer Id:");
            sb.append(peerAgent.getAgentId());
            SdkLog.e(str, sb.toString());
        } else {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Authentication success status: ");
            i = 0;
            sb2.append(0);
            sb2.append(" for peer: ");
            sb2.append(peerAgent.getAgentId());
            SdkLog.i(str2, sb2.toString());
        }
        onAuthenticationResponse(peerAgent, new AuthenticationToken(i2, byteArray), i);
        handleAuthErrorCode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFindPeerErrorCode(int i) {
        if (i == 0) {
            SdkLog.i(TAG, "onFindPeerAgentsResponse() -> PEER_AGENT_FOUND");
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
                Message messageObtainMessage = agentHandler.obtainMessage(11);
                messageObtainMessage.arg1 = 10008;
                messageObtainMessage.obj = peerAgent;
                this.mBackgroundWorker.sendMessage(messageObtainMessage);
            } else {
                SdkLog.w(TAG, "handle Invalid PeerAction: mBackgroundWorker is null!");
            }
        }
    }

    private void handleOnErrorCode(int i) {
        if (i == 10013) {
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
        if (i == 10018) {
            SdkLog.i(TAG, "onServiceConnectionResponse() -> CONNECTION_FAILURE_ACC_DORMANT");
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

    private BaseSocket instantiateSocket() {
        validateSocketImplementation(this.mSocketImpl);
        try {
            SdkLog.d(TAG, "Instantiating BaseSocket: " + this.mSocketImpl.getName());
            if (Modifier.toString(this.mSocketImpl.getModifiers()).contains("static") || this.mSocketImpl.getEnclosingClass() == null || !BaseAgent.class.isAssignableFrom(this.mSocketImpl.getEnclosingClass())) {
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
    public void loadAgentId() throws GeneralException {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, null);
            return;
        }
        SharedPreferences.Editor editorEdit = createDeviceProtectedStorageContext().getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).edit();
        editorEdit.putString(localAgentId, getClass().getName());
        editorEdit.putString(getClass().getName(), localAgentId);
        SdkLog.d(TAG, "save AgentId className:" + getClass().getName() + ",agentId: " + localAgentId);
        editorEdit.apply();
        this.mAgentId = localAgentId;
        registerMexAgent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyConnectionRequest(Intent intent) {
        if (intent == null) {
            SdkLog.e(TAG, "Invalid service connection indication.Intent:null.Ignoring reqeuset");
            return;
        }
        long longExtra = intent.getLongExtra("transactionId", 0L);
        PeerAgent peerAgent = (PeerAgent) intent.getParcelableExtra("peerAgent");
        String stringExtra = intent.getStringExtra("agentId");
        if (peerAgent == null) {
            SdkLog.e(TAG, "Invalid initiator peer agent:" + peerAgent + ". Ignoring connection request");
            return;
        }
        if (stringExtra == null) {
            SdkLog.e(TAG, "Invalid local agent Id:" + stringExtra + ".Ignoring connection request");
            return;
        }
        peerAgent.setTransactionId(longExtra);
        SdkLog.i(TAG, "Connection initiated by peer: " + peerAgent.getAgentId() + " on Accessory: " + peerAgent.getAccessory().getAccessoryId() + " Transaction: " + longExtra);
        this.mPendingRequests.add(peerAgent);
        onServiceConnectionRequested(peerAgent);
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
            if (!this.mPendingRequests.remove(peerAgent)) {
                SdkLog.w(TAG, "Accepting service connection with invalid peer agent:" + peerAgent.toString());
                handleInvalidPeerAction(peerAgent);
                return;
            }
            String str = TAG;
            SdkLog.i(str, "Trying to Accept service connection request from peer:" + peerAgent.getAgentId() + " Transaction:" + peerAgent.getTransactionId());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(str, "acceptServiceConnection: mBackgroundWorker is null!");
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

    public void authenticatePeerAgent(PeerAgent peerAgent) {
        if (peerAgent == null) {
            throw new IllegalArgumentException("Illegal argument peerAgent:" + peerAgent);
        }
        try {
            Initializer.initBufferPool(getApplicationContext());
            String str = TAG;
            SdkLog.i(str, "Authentication requested for peer:" + peerAgent.getAgentId());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(str, "authenticatePeerAgent: mBackgroundWorker is null!");
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

    public int checkAuthentication() {
        try {
            BaseAdapter baseAdapter = this.mAdapter;
            return baseAdapter != null ? baseAdapter.checkAuthentication() : CommonStatusCodes.INTERNAL_EXCEPTION;
        } catch (GeneralException e) {
            SdkLog.e(TAG, "check authentication error " + e);
            return CommonStatusCodes.INTERNAL_EXCEPTION;
        }
    }

    public final synchronized void findPeerAgents() {
        String str = TAG;
        SdkLog.d(str, "findPeer request received by:" + getClass().getName());
        try {
            Initializer.initBufferPool(getApplicationContext());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler != null) {
                Message messageObtainMessage = agentHandler.obtainMessage();
                messageObtainMessage.what = 2;
                this.mBackgroundWorker.sendMessage(messageObtainMessage);
            } else {
                SdkLog.w(str, "findPeerAgents: mBackgroundWorker is null!");
            }
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            handleError(20002, null);
        }
    }

    public Handler getAgentHandler() {
        return this.mBackgroundWorker;
    }

    public String getId() {
        String localAgentId = getLocalAgentId();
        if (localAgentId == null) {
            handleError(20001, null);
        }
        return localAgentId;
    }

    public String getLocalAgentId() {
        String str = TAG;
        SdkLog.d(str, "mGetAgentIdRetryCount = " + this.mGetAgentIdRetryCount);
        if (this.mGetAgentIdRetryCount >= 2) {
            this.mGetAgentIdRetryCount = 0;
            SdkLog.e(str, "Failed to retrieve service record, retry 2");
            return null;
        }
        try {
            String localAgentId = this.mAdapter.getLocalAgentId(getClass().getName());
            SdkLog.i(str, "Agent ID retrieved successfully for " + getClass().getName() + " Agent ID:" + localAgentId);
            return localAgentId;
        } catch (GeneralException e) {
            if (e.getErrorCode() != 10016) {
                SdkLog.e(TAG, "Failed to retrieve service record", e);
                return null;
            }
            String str2 = TAG;
            SdkLog.w(str2, "Service record was not found in Accessory Framework.Registering service again!");
            this.mGetAgentIdRetryCount++;
            try {
                registerService();
                SdkLog.i(str2, "Trying to fetch agent ID after re-registration");
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

    public int getVersion() {
        try {
            BaseAdapter baseAdapter = this.mAdapter;
            if (baseAdapter != null) {
                return baseAdapter.getVersion();
            }
            return 0;
        } catch (GeneralException e) {
            SdkLog.e(TAG, "getVersion error " + e);
            return 0;
        }
    }

    public void handleError(int i, PeerAgent peerAgent) {
        if (i == 10008) {
            onServiceConnectionResponse(peerAgent, null, 10008);
            handleServiceConnectionErrorCode(10008);
        }
        switch (i) {
            case 20001:
                cleanupConnections(true);
                onError(null, "Oppo Accessory Framework has died!!", i);
                handleOnErrorCode(i);
                break;
            case 20002:
                SdkLog.e(TAG, "Oppo Accessory SDK cannot be initialized");
                onError(null, "Oppo Accessory SDK cannot be initialized. Device or Build not compatible.", i);
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

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            new SdkConfig(getApplicationContext());
        } catch (GeneralException e) {
            e.printStackTrace();
        }
        String str = TAG;
        SdkLog.d(str, "BaseAgent - onCreate:" + getClass().getSimpleName());
        this.mSuccessfulConnections = Collections.synchronizedList(new ArrayList());
        this.mPendingRequests = Collections.synchronizedSet(new HashSet());
        Looper looper = ThreadManager.getInstance().getLooper(ThreadManager.TYPE_AGENT);
        if (looper == null) {
            SdkLog.e(str, "Unable to start Agent thread.");
            throw new RuntimeException("Unable to start Agent.Worker thread creation failed");
        }
        this.mBackgroundWorker = new AgentHandler(this, looper);
        try {
            Initializer.initBufferPool(getApplicationContext());
        } catch (SdkUnsupportedException e2) {
            SdkLog.e(TAG, "SDK initialization failed!", e2);
            Message messageObtainMessage = this.mBackgroundWorker.obtainMessage(11);
            messageObtainMessage.arg1 = 20002;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
        }
        this.mAdapter = BaseAdapter.getDefaultAdapter(getApplicationContext(), this.mBackgroundWorker);
        this.mPeerAuthCallback = new AuthenticationCallback();
        this.mPeerAgentCallback = new PeerAgentCallback();
        this.mConnectionCallback = new ConnectionCallback();
        this.mAgentCallback = new AgentCallbackImpl(this);
        this.mBackgroundWorker.sendEmptyMessage(0);
        fetchServiceProfile();
    }

    @Override // android.app.Service
    public void onDestroy() {
        SdkLog.d(TAG, "BaseAgent - onDestroy:" + getClass().getSimpleName());
        AgentHandler agentHandler = this.mBackgroundWorker;
        if (agentHandler != null) {
            agentHandler.obtainMessage(13).sendToTarget();
        }
        super.onDestroy();
    }

    public void onError(PeerAgent peerAgent, String str, int i) {
        if (peerAgent == null) {
            SdkLog.e(TAG, "ACCEPT_STATE_ERROR: " + i + ": " + str + " PeerAgent: null");
            return;
        }
        SdkLog.e(TAG, "ACCEPT_STATE_ERROR: " + i + ": " + str + " PeerAgent: " + peerAgent.getAgentId());
    }

    public void onFindPeerAgentsResponse(PeerAgent[] peerAgentArr, int i) {
        SdkLog.e(TAG, "Invalid implementation of BaseAgent.onFindPeerAgentsResponse(PeerAgent[], int) should be overrided!");
    }

    public void onPeerAgentsUpdated(PeerAgent[] peerAgentArr, int i) {
        SdkLog.e(TAG, "Invalid implementation of BaseAgent.onPeerAgentsUpdated(PeerAgent[], int) should be overrided!");
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        if (intent == null || (action = intent.getAction()) == null) {
            return 2;
        }
        if ("com.heytap.accessory.action.SERVICE_CONNECTION_REQUESTED".equalsIgnoreCase(action)) {
            String str = TAG;
            SdkLog.d(str, "Received incoming connection request");
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(str, "onStartCommand: mBackgroundWorker is null!");
                return 2;
            }
            Message messageObtainMessage = agentHandler.obtainMessage();
            messageObtainMessage.what = 5;
            messageObtainMessage.arg1 = i2;
            messageObtainMessage.obj = intent;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
            return 2;
        }
        if (!"com.heytap.accessory.action.ACCESSORY_STATUS_CHANGED".equalsIgnoreCase(action)) {
            if (!BaseMessage.ACTION_ACCESSORY_MESSAGE_RECEIVED.equalsIgnoreCase(action)) {
                return 2;
            }
            SdkLog.d(TAG, "Received incoming message ind");
            return 2;
        }
        String str2 = TAG;
        SdkLog.d(str2, "Received accessory status changed");
        AgentHandler agentHandler2 = this.mBackgroundWorker;
        if (agentHandler2 == null) {
            SdkLog.w(str2, "onStartCommand: mBackgroundWorker is null!");
            return 2;
        }
        Message messageObtainMessage2 = agentHandler2.obtainMessage();
        messageObtainMessage2.what = 15;
        messageObtainMessage2.arg1 = i2;
        messageObtainMessage2.obj = intent;
        this.mBackgroundWorker.sendMessage(messageObtainMessage2);
        return 2;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        BufferPool.clearCache(i);
        super.onTrimMemory(i);
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
            String str = TAG;
            SdkLog.i(str, "Trying to reject connection request from peer:" + peerAgent.getAgentId() + " Transaction:" + peerAgent.getTransactionId());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(str, "rejectServiceConnection: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(8);
            messageObtainMessage.obj = peerAgent;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            handleError(20002, peerAgent);
        }
    }

    public final void requestServiceConnection(PeerAgent peerAgent) {
        if (peerAgent == null) {
            throw new IllegalArgumentException("Illegal argument peerAgent:" + peerAgent);
        }
        try {
            Initializer.initBufferPool(getApplicationContext());
            String str = TAG;
            SdkLog.i(str, "Service connection requested for peer:" + peerAgent.getAgentId());
            AgentHandler agentHandler = this.mBackgroundWorker;
            if (agentHandler == null) {
                SdkLog.w(str, "requestServiceConection: mBackgroundWorker is null!");
                return;
            }
            Message messageObtainMessage = agentHandler.obtainMessage(6);
            messageObtainMessage.obj = peerAgent;
            this.mBackgroundWorker.sendMessage(messageObtainMessage);
        } catch (SdkUnsupportedException e) {
            SdkLog.e(TAG, "exception: " + e.getMessage());
            handleError(20002, peerAgent);
        }
    }

    public boolean runOnBackgroundThread(Runnable runnable) {
        AgentHandler agentHandler = this.mBackgroundWorker;
        if (agentHandler != null) {
            return agentHandler.post(runnable);
        }
        SdkLog.w(TAG, "runOnBackgroundThread: mBackgroundWorker is null!");
        return false;
    }

    public boolean checkAuthentication(String str) {
        try {
            return this.mAdapter.checkAuthentication(str);
        } catch (GeneralException e) {
            SdkLog.e(TAG, "check authentication method error " + e);
            return false;
        }
    }

    public BaseAgent(String str) {
        if (str != null && !"".equalsIgnoreCase(str)) {
            this.mName = str;
            return;
        }
        throw new IllegalArgumentException("Invalid parameter name:" + str);
    }
}
