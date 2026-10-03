package com.heytap.accessory.platform;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.heytap.accessory.BaseAgent;
import com.heytap.accessory.BaseMessage;
import com.heytap.accessory.Config;
import com.heytap.accessory.api.IDeathCallback;
import com.heytap.accessory.api.IFrameworkManager;
import com.heytap.accessory.api.IMsgExpCallback;
import com.heytap.accessory.api.IPeerAgentAuthCallback;
import com.heytap.accessory.api.IPeerAgentCallback;
import com.heytap.accessory.api.IServiceChannelCallback;
import com.heytap.accessory.api.IServiceConnectionCallback;
import com.heytap.accessory.api.IServiceConnectionIndicationCallback;
import com.heytap.accessory.authcode.AuthenticationManager;
import com.heytap.accessory.base.FrameworkConnection;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.base.logging.a;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.sdk.SdkWrapper;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.SdkConfig;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class FrameworkManagerServiceNative extends IFrameworkManager.Stub {
    private static final String TAG = "FrameworkManagerServiceNative";
    private Context mContext;
    private SdkWrapper mSdkWrapper = new SdkWrapper();

    public FrameworkManagerServiceNative(Context context) {
        this.mContext = context;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public Bundle acceptServiceConnection(long j, String str, PeerAgent peerAgent, long j2, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) {
        AuthenticationManager.check(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), true);
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            return this.mSdkWrapper.a(clientele, str, peerAgent, j2, iServiceConnectionCallback, iServiceChannelCallback);
        }
        a.e(TAG, "trying to acceptServiceConnection without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int authenticatePeerAgent(long j, String str, PeerAgent peerAgent, IPeerAgentAuthCallback iPeerAgentAuthCallback, long j2) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            return this.mSdkWrapper.a(clientele, str, peerAgent, iPeerAgentAuthCallback, j2);
        }
        a.e(TAG, "trying to authenticatePeerAgent without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public void cleanupAgent(long j, String str) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            clientele.a(str);
            return;
        }
        a.e(TAG, "Failed cleanup agent for clientId: " + j);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public void cleanupChannelCache(long j, String str, long j2) throws RemoteException {
        if (AuthenticationManager.check(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), false) != 1001) {
            a.b(TAG, "cleanupChannelCache Uid error!");
            throw new RemoteException("pid(" + Binder.getCallingPid() + ") uid(" + Binder.getCallingUid() + ")not allow to invoke protected Method cleanupChannelCache.Make sure the calling pid is " + Process.myPid() + ", uid is " + Process.myUid());
        }
        if (FrameworkService.getClientele(j) != null) {
            this.mSdkWrapper.a(str, j2);
            return;
        }
        a.b(TAG, "Failed cleanup agent for clientId: " + j);
        throw new RemoteException("Failed cleanup agent for clientId: " + j);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int closeServiceConnection(long j, String str) {
        AuthenticationManager.check(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), true);
        if (FrameworkService.getClientele(j) != null) {
            a.c(TAG, "Local app closes SC connectionId:" + str);
            return this.mSdkWrapper.a(str);
        }
        a.e(TAG, "trying to close Service Connection without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int findPeerAgents(long j, long j2, String str, IPeerAgentCallback iPeerAgentCallback) {
        String str2 = TAG;
        a.c(str2, "findPeerAgents: localAgentId=" + str);
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            try {
                return clientele.a(j2, str, iPeerAgentCallback);
            } catch (Exception e) {
                a.e(TAG, "findPeerAgents unexpected error:" + e);
                return -1;
            }
        }
        a.e(str2, "trying to findpeer without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public Bundle getAgentDetails(long j, String str) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            return clientele.d(str);
        }
        a.e(TAG, "trying to close Service Connection without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public String getAgentId(long j, String str, String str2) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            FrameworkServiceDescription frameworkServiceDescriptionA = clientele.a(str, str2);
            if (frameworkServiceDescriptionA != null) {
                return frameworkServiceDescriptionA.a();
            }
            return null;
        }
        a.e(TAG, "getAgentId() Invalid clientId:" + j);
        return null;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public ResultReceiver getClientCallback(long j) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            return clientele.f();
        }
        a.e(TAG, "trying to set f/w callback without a valied conection: " + j);
        return null;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public Bundle getLocalAgentId(long j, String str) {
        Bundle bundle = new Bundle();
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele == null) {
            a.e(TAG, "trying to fetch localagent ID without a Frameworkconnection object by " + j);
            bundle.putInt("errorcode", 769);
        } else {
            FrameworkServiceDescription frameworkServiceDescriptionC = clientele.c(str);
            if (frameworkServiceDescriptionC == null) {
                bundle.putInt("errorcode", clientele.k());
            } else {
                bundle.putString("agentId", frameworkServiceDescriptionC.a());
            }
        }
        return bundle;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int getVersion() {
        return 1;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int handleAuthentication(int i) {
        return AuthenticationManager.check(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), false);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public boolean handleAuthenticationWithPermission(int i, String str) {
        return AuthenticationManager.checkPermission(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), str, false);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public boolean isSocketConnected(long j, String str) {
        return this.mSdkWrapper.b(str);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public Bundle makeFrameworkConnection(int i, String str, IDeathCallback iDeathCallback, int i2, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) {
        AuthenticationManager.check(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), true);
        long jMakeFrameworkConnection = FrameworkService.makeFrameworkConnection(str, null, i2, iServiceConnectionIndicationCallback);
        a.a(TAG, "makeFrameworkConnection packageName: " + str + " clientId: " + jMakeFrameworkConnection + " , sdkVersion " + i2);
        FrameworkService.registerIDeathCallback(jMakeFrameworkConnection, str, iDeathCallback);
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", jMakeFrameworkConnection);
        bundle.putInt("com.heytap.accessory.adapter.extra.PROCESS_ID", Process.myPid());
        bundle.putInt("com.heytap.accessory.adapter.extra.HEADER_LEN", 9);
        bundle.putInt("com.heytap.accessory.adapter.extra.FOOTER_LEN", 2);
        bundle.putInt("com.heytap.accessory.adapter.extra.MSG_HEADER_LEN", 15);
        bundle.putInt(SdkConfig.EXTRA_KEY_FRAMEWORK_COMPATIBLE_VERSION, 1);
        return bundle;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public void registerComponent(long j, byte[] bArr) throws RemoteException {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            try {
                clientele.a(bArr);
                return;
            } catch (ResourceParserException e) {
                a.a(TAG, "registerComponent Exception", e);
                throw new RemoteException(e.getMessage());
            }
        }
        a.e(TAG, "trying to register service without a Frameworkconnection object by " + j);
        throw new RemoteException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public void registerMexCallback(long j, String str, IMsgExpCallback iMsgExpCallback) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            clientele.a(str, iMsgExpCallback);
            return;
        }
        a.e(TAG, "Failed to register callback for MessageExchange - invalid clientId: " + j);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int rejectServiceConnection(long j, String str, PeerAgent peerAgent, long j2) {
        AuthenticationManager.check(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), true);
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            clientele.a(com.heytap.accessory.sdk.a.a(peerAgent.getAccessory()), peerAgent.getAgentId(), str, false, (List<String>) null, (List<?>) null, (Object) null, j2);
            return 0;
        }
        a.e(TAG, "trying to rejectServiceConnection without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int requestServiceConnection(long j, String str, PeerAgent peerAgent, IServiceConnectionCallback iServiceConnectionCallback, IServiceChannelCallback iServiceChannelCallback) {
        AuthenticationManager.check(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), true);
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            if (!com.heytap.accessory.base.a.a(2, peerAgent.getAccessoryId(), str, peerAgent.getAgentId())) {
                return BaseAgent.CONNECTION_FAILURE_ACC_DORMANT;
            }
            a.a(TAG + " - SLPTrack", "isAwakeable,continue requestServiceConnection");
            return this.mSdkWrapper.a(clientele, str, peerAgent, iServiceConnectionCallback, iServiceChannelCallback);
        }
        a.e(TAG, "trying to request Service Connection without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int send(long j, String str, long j2, byte[] bArr, boolean z, int i, int i2, int i3) {
        if (FrameworkService.getClientele(j) != null) {
            return this.mSdkWrapper.a(str, j2, bArr, z, i, i2, i3, false);
        }
        a.e(TAG, "trying to send data without a Frameworkconnection object by " + j);
        throw new IllegalArgumentException("Client connection with ID:" + j + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int sendMessage(long j, String str, String str2, long j2, byte[] bArr, boolean z, int i, int i2) {
        AuthenticationManager.checkPermission(this.mContext, Binder.getCallingUid(), Binder.getCallingPid(), Config.Permission.MESSAGE, true);
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            if (!com.heytap.accessory.base.a.a(3, j2, str, str2)) {
                return BaseAgent.CONNECTION_FAILURE_ACC_DORMANT;
            }
            a.a(TAG, "isAwakeable, continue sendMessage");
            return this.mSdkWrapper.a(str, clientele, j2, str2, bArr, i2, i, z);
        }
        a.e(TAG, "Failed to send data - invalid clientId: " + j);
        return BaseMessage.ERROR_TRANSACTION_FAILED;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    @Deprecated
    public void sendMessageDeliveryStatus(long j, long j2, int i, int i2) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            this.mSdkWrapper.a(clientele, j2, i, i2);
            return;
        }
        a.e(TAG, "Failed to send ack - invalid clientId: " + j);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public void sendMessageDeliveryStatusV2(long j, long j2, String str, int i, int i2) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            this.mSdkWrapper.a(clientele, j2, i, i2);
            return;
        }
        a.e(TAG, "Failed to send ack - invalid clientId: " + j);
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int sendV2(long j, String str, long j2, String str2, long j3, byte[] bArr, boolean z, int i, int i2, int i3, boolean z2) {
        if (FrameworkService.getClientele(j2) != null) {
            a.d(TAG, "clientId:" + j2 + ",channelId:" + j3 + " sendData:" + bArr.length);
            return this.mSdkWrapper.a(str2, j3, bArr, z, i, i2, i3, z2);
        }
        a.e(TAG, "trying to send data without a Frameworkconnection object by " + j2);
        throw new IllegalArgumentException("Client connection with ID:" + j2 + " does not exist");
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public int tearFrameworkConnection(long j) {
        FrameworkService.cleanUpFrameworkConnection(j);
        return 0;
    }

    @Override // com.heytap.accessory.api.IFrameworkManager
    public void unregisterMexCallback(long j, String str) {
        FrameworkConnection clientele = FrameworkService.getClientele(j);
        if (clientele != null) {
            clientele.j(str);
            return;
        }
        a.e(TAG, "Failed to unregister callback for MessageExchange - invalid clientId: " + j);
    }
}
