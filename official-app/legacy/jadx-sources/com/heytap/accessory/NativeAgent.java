package com.heytap.accessory;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.heytap.accessory.api.IPeerAgentCallback;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.logging.SdkLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes14.dex */
public abstract class NativeAgent extends BaseJobAgent {
    public static final String EXTRA_AGENT_IMPL_CLASS = "agentImplclass";
    public static final String EXTRA_PACKAGE_NAME = "packageName";
    private static final String TAG = "NativeAgent";
    private PeerAgentCallback mPeerAgentCallback;

    public static final class FindPeerRunnable implements Runnable {
        private NativeAgent mNativeAgent;

        public FindPeerRunnable(NativeAgent nativeAgent) {
            this.mNativeAgent = nativeAgent;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    String localAgentId = this.mNativeAgent.getLocalAgentId();
                    if (localAgentId == null) {
                        this.mNativeAgent.handleError(20001, null);
                        return;
                    }
                    NativeAgent nativeAgent = this.mNativeAgent;
                    int iFindPeerAgents = nativeAgent.mAdapter.findPeerAgents(localAgentId, nativeAgent.mPeerAgentCallback);
                    if (iFindPeerAgents == 0) {
                        SdkLog.d(NativeAgent.TAG, "Find peer request enqueued successfully.");
                    } else {
                        SdkLog.w(NativeAgent.TAG, "Find peer failed:" + iFindPeerAgents + " for service " + FindPeerRunnable.class.getName());
                        this.mNativeAgent.onFindPeerAgentsResponse(null, iFindPeerAgents);
                    }
                } catch (GeneralException unused) {
                    SdkLog.e(NativeAgent.TAG, "Find Peer request failed!");
                }
            } finally {
                this.mNativeAgent = null;
            }
        }
    }

    public class PeerAgentCallback extends IPeerAgentCallback.Stub {
        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentUpdated(Bundle bundle) throws RemoteException {
        }

        @Override // com.heytap.accessory.api.IPeerAgentCallback
        public void onPeerAgentsFound(Bundle bundle) throws RemoteException {
            SdkLog.v(NativeAgent.TAG, "FindPeer response received.");
            bundle.setClassLoader(PeerAgent.class.getClassLoader());
            if (bundle.containsKey("errorcode")) {
                int i = bundle.getInt("errorcode");
                SdkLog.e(NativeAgent.TAG, "Peer Not Found:Error - " + i);
                Message messageObtainMessage = NativeAgent.this.mBackgroundWorker.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.arg1 = i;
                NativeAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage);
                return;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("peerAgents");
            if (parcelableArrayList == null) {
                SdkLog.e(NativeAgent.TAG, "Find Peer - invalid response from Accessory Framework");
                return;
            }
            SdkLog.i(NativeAgent.TAG, parcelableArrayList.size() + " Peer agent(s) found");
            Message messageObtainMessage2 = NativeAgent.this.mBackgroundWorker.obtainMessage();
            messageObtainMessage2.what = 3;
            messageObtainMessage2.arg1 = 0;
            messageObtainMessage2.obj = parcelableArrayList.toArray(new PeerAgent[parcelableArrayList.size()]);
            NativeAgent.this.mBackgroundWorker.sendMessage(messageObtainMessage2);
        }

        private PeerAgentCallback() {
        }
    }

    public NativeAgent(String str, Context context, Class<? extends BaseSocket> cls) {
        super(str, context, cls);
        this.mPeerAgentCallback = new PeerAgentCallback();
    }

    public Bundle getAgentDetails(final String str) {
        FutureTask futureTask = new FutureTask(new Callable<Bundle>() { // from class: com.heytap.accessory.NativeAgent.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Bundle call() throws Exception {
                SdkLog.v(NativeAgent.TAG, "Fetching agent details from Framework");
                try {
                    return NativeAgent.this.mAdapter.getAgentDetails(str);
                } catch (GeneralException e2) {
                    SdkLog.e(NativeAgent.TAG, "Failed to fetch agent details.", e2);
                    NativeAgent.this.onError(null, "Accessory Framework has died!", e2.getErrorCode());
                    return null;
                }
            }
        });
        runOnBackgroundThread(futureTask);
        try {
            return (Bundle) futureTask.get();
        } catch (InterruptedException | ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String getAgentId(final String str, final String str2) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.heytap.accessory.NativeAgent.2
            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                SdkLog.v(NativeAgent.TAG, "Fetching agent id from Framework");
                try {
                    return NativeAgent.this.mAdapter.getAgentId(str, str2);
                } catch (GeneralException e2) {
                    SdkLog.e(NativeAgent.TAG, "Failed to fetch agent ID.", e2);
                    NativeAgent.this.onError(null, "Accessory Framework has died!", e2.getErrorCode());
                    return null;
                }
            }
        });
        runOnBackgroundThread(futureTask);
        try {
            return (String) futureTask.get();
        } catch (InterruptedException | ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String getAgentImplClassName(String str) {
        Bundle agentDetails = getAgentDetails(str);
        return agentDetails == null ? "" : agentDetails.getString("agentImplclass");
    }

    public String getAgentPackagename(String str) {
        Bundle agentDetails = getAgentDetails(str);
        return agentDetails == null ? "" : agentDetails.getString("packageName");
    }

    public void onPeerFound(int i, @NonNull List<PeerAgent> list) {
    }

    public void requestPeerAgents() {
        runOnBackgroundThread(new FindPeerRunnable(this));
    }
}
