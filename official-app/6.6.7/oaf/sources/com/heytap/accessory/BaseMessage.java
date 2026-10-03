package com.heytap.accessory;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.heytap.accessory.api.IMsgExpCallback;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.UnSupportException;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.SdkConfig;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferException;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class BaseMessage {
    public static final String ACTION_ACCESSORY_MESSAGE_DISABLED = "com.heytap.accessory.action.MESSAGE_DISABLED";
    public static final String ACTION_ACCESSORY_MESSAGE_ENABLED = "com.heytap.accessory.action.MESSAGE_ENABLED";
    public static final String ACTION_ACCESSORY_MESSAGE_RECEIVED = "com.heytap.accessory.action.MESSAGE_RECEIVED";
    public static final int ERROR_LOCAL_PEER_AGENT_NOT_SUPPORTED = 10104;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_PEER_AGENT_INVALID = 10109;
    public static final int ERROR_PEER_AGENT_NOT_SUPPORTED = 10105;
    public static final int ERROR_PEER_AGENT_NO_RESPONSE = 10103;
    public static final int ERROR_PEER_AGENT_UNREACHABLE = 10102;
    public static final int ERROR_PEER_SERVICE_NOT_SUPPORTED = 10106;
    public static final int ERROR_SERVICE_NOT_SUPPORTED = 10107;
    public static final int ERROR_TIMED_OUT = 10108;
    public static final int ERROR_TRANSACTION_FAILED = 10110;
    public static final int ERROR_UNKNOWN = 10101;
    public static final String EXTRA_PEER_ACCESSORY = "com.heytap.accessory.device.extra.PeerAccessory";
    private static final int INVALID_ID = -1;
    private static final String MESSAGE_KEY = "_";
    private static final String TAG = "BaseMessage";
    private BaseAdapter mAdapter;
    private String mAgentId;
    private Handler mHandler;
    private MexCallback mMexCallback;

    public static class MessageCallbackRunnable implements Runnable {
        private Bundle mBundle;
        private boolean mIsMessage;
        private WeakReference<BaseMessage> mMessageRef;

        public MessageCallbackRunnable(BaseMessage baseMessage, Bundle bundle, boolean z) {
            this.mMessageRef = new WeakReference<>(baseMessage);
            this.mBundle = bundle;
            this.mIsMessage = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMessage baseMessage = this.mMessageRef.get();
            if (baseMessage == null) {
                SdkLog.e(BaseMessage.TAG, "run(): BaseMessage referecnce is null!");
            } else if (this.mIsMessage) {
                baseMessage.onMessageReceived(this.mBundle);
            } else {
                baseMessage.onStatusReceived(this.mBundle);
            }
        }
    }

    public static class MexCallback extends IMsgExpCallback.Stub {
        private WeakReference<BaseMessage> mMessageRef;

        public MexCallback(BaseMessage baseMessage) {
            this.mMessageRef = new WeakReference<>(baseMessage);
        }

        @Override // com.heytap.accessory.api.IMsgExpCallback
        public void onReceived(Bundle bundle) throws RemoteException {
            BaseMessage baseMessage = this.mMessageRef.get();
            if (baseMessage == null) {
                SdkLog.e(BaseMessage.TAG, "onMessageReceived(): BaseMessage referecnce is null!");
            } else {
                baseMessage.postAsynch(bundle);
            }
        }

        @Override // com.heytap.accessory.api.IMsgExpCallback
        public void onSent(Bundle bundle) throws RemoteException {
            BaseMessage baseMessage = this.mMessageRef.get();
            if (baseMessage == null) {
                SdkLog.e(BaseMessage.TAG, "onMessageReceived(): BaseMessage referecnce is null!");
            } else {
                baseMessage.postStatusAsynch(bundle);
            }
        }
    }

    public BaseMessage(BaseAgent baseAgent) {
        if (baseAgent != null) {
            init(baseAgent.getApplicationContext(), baseAgent.getAgentHandler(), baseAgent.registerMessageInstance(this));
        } else {
            SdkLog.e(TAG, "BaseMessage() - empty agent instance!");
            throw new IllegalArgumentException("Message creation failed! - invalid agent instance supplied");
        }
    }

    private boolean checkMessageUnSupport(PeerAgent peerAgent) {
        return peerAgent == null || peerAgent.getAccessory() == null || !peerAgent.getAccessory().supportMessage();
    }

    private static String getMessageKey(String str, long j, String str2) {
        return str + MESSAGE_KEY + j + MESSAGE_KEY + str2;
    }

    private void init(Context context, Handler handler, String str) {
        this.mAdapter = BaseAdapter.getDefaultAdapter(context);
        this.mMexCallback = new MexCallback(this);
        this.mHandler = handler;
        if (str != null) {
            try {
                registerAgent(str);
            } catch (GeneralException e) {
                SdkLog.e(TAG, "Failed to create BaseMessage instance: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMessageReceived(Bundle bundle) {
        int i;
        if (this.mAgentId == null) {
            SdkLog.e(TAG, "onMessageReceived(): Agent info empty!");
            return;
        }
        bundle.setClassLoader(PeerAgent.class.getClassLoader());
        byte[] byteArray = bundle.getByteArray("com.heytap.accessory.adapter.extra.READ_BYTES");
        int i2 = bundle.getInt("com.heytap.accessory.adapter.extra.READ_LENGHT");
        int i3 = bundle.getInt("com.heytap.accessory.adapter.extra.READ_OFFSET");
        PeerAgent peerAgent = (PeerAgent) bundle.getParcelable("peerAgent");
        int i4 = bundle.getInt("transactionId");
        if (peerAgent == null || peerAgent.getAccessory() == null) {
            SdkLog.e(TAG, "onMessageReceived(): PeerAgent is null!");
            return;
        }
        long id = peerAgent.getAccessory().getId();
        try {
            if (byteArray == null) {
                i = 10101;
            } else {
                try {
                    SdkLog.d(TAG, "onMessageReceived data:" + i2 + " bytes length:" + byteArray.length + " bytes: " + new String(byteArray));
                    byte[] bArr = new byte[i2];
                    SystemUtils.arraycopy(byteArray, i3, bArr, 0, i2);
                    onReceive(peerAgent, bArr);
                    i = 0;
                } catch (Exception unused) {
                    SdkLog.w(TAG, "onMessageReceived Exception");
                    this.mAdapter.recycle(byteArray);
                    return;
                }
            }
            this.mAdapter.recycle(byteArray);
            if (i != -1) {
                try {
                    SdkLog.d(TAG, "onMessageReceived, sendMessageDeliveryStatus");
                    sendMessageDeliveryStatus(id, peerAgent.getAgentId(), i4, i);
                } catch (IOException e) {
                    SdkLog.e(TAG, "Failed to send message status! " + e.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            this.mAdapter.recycle(byteArray);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStatusReceived(Bundle bundle) {
        bundle.setClassLoader(PeerAgent.class.getClassLoader());
        PeerAgent peerAgent = (PeerAgent) bundle.getParcelable("peerAgent");
        int i = bundle.getInt("transactionId");
        int i2 = bundle.getInt("errorcode");
        if (i2 == 0) {
            onSent(peerAgent, i);
        } else {
            onError(peerAgent, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStatusAsynch(Bundle bundle) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new MessageCallbackRunnable(this, bundle, false));
        }
    }

    private int sendMessage(PeerAgent peerAgent, byte[] bArr, boolean z) throws UnSupportException, IOException {
        int encryptionPaddingLength;
        String str;
        if (peerAgent == null) {
            SdkLog.e(TAG, "Send: peerAgent null");
            throw new IllegalArgumentException("Send Message Failed! - Peer Agent is invalid!");
        }
        if (bArr == null) {
            SdkLog.e(TAG, "Send: data null");
            throw new IllegalArgumentException("Invalid data to send!");
        }
        if (bArr.length == 0) {
            SdkLog.e(TAG, "Send: invalid data length 0");
            throw new IllegalArgumentException("Invalid data length 0");
        }
        if (bArr.length > peerAgent.getMaxAllowedDataSize()) {
            SdkLog.e(TAG, "Send: Data too big:" + bArr.length);
            throw new IllegalArgumentException("Data Too long..! Data size:" + bArr.length + "Max allowed Size:" + peerAgent.getMaxAllowedDataSize() + " .Please check PeerAgent.getMaxAllowedDataSize()");
        }
        if (this.mAgentId == null) {
            SdkLog.e(TAG, "Send: agentId not retrieved!");
            throw new IOException("Failed to send message - Agent info empty!");
        }
        int iCheckMexFeature = checkMexFeature(peerAgent);
        String str2 = TAG;
        SdkLog.d(str2, "checkMexFeature " + iCheckMexFeature);
        if (iCheckMexFeature != 0) {
            onError(peerAgent, -1, iCheckMexFeature);
            return -1;
        }
        if (checkMessageUnSupport(peerAgent)) {
            throw new UnSupportException("the peer agent doesn't support the message feature, please check");
        }
        int iSendMessage = ERROR_TRANSACTION_FAILED;
        Buffer bufferObtain = null;
        try {
            if (z) {
                try {
                    try {
                        encryptionPaddingLength = peerAgent.getAccessory().getEncryptionPaddingLength();
                    } catch (IOException e) {
                        SdkLog.e(TAG, "Send Message Failed! <" + ERROR_TRANSACTION_FAILED + " " + e.getLocalizedMessage());
                        throw e;
                    }
                } catch (BufferException e2) {
                    String str3 = TAG;
                    SdkLog.e(str3, "BufferException: " + e2.getLocalizedMessage());
                    if (0 != 0) {
                        SdkLog.d(str3, "messageBuffer: recycle");
                    }
                    return iSendMessage;
                }
            } else {
                encryptionPaddingLength = 0;
            }
            bufferObtain = BufferPool.obtain(SdkConfig.getFrameworkMaxMsgHeaderLength() + bArr.length + encryptionPaddingLength + SdkConfig.getFrameworkMaxFooterLength());
            bufferObtain.setOffset(SdkConfig.getFrameworkMaxMsgHeaderLength());
            bufferObtain.extractFrom(bArr, 0, bArr.length);
            try {
                iSendMessage = this.mAdapter.sendMessage(this.mAgentId, peerAgent.getAgentId(), peerAgent.getAccessory().getId(), bufferObtain.getBuffer(), z, bArr.length, bufferObtain.getOffset());
                if (iSendMessage > 0) {
                    SdkLog.d(str2, "msg<" + iSendMessage + "> sent: " + bArr.length);
                    SdkLog.d(str2, "messageBuffer: recycle");
                    bufferObtain.recycle();
                    return iSendMessage;
                }
                if (iSendMessage == 10108) {
                    str = "Send Message Failed - Message timed out!";
                } else if (iSendMessage != 10109) {
                    str = "Send Message Failed - internal error! transId " + iSendMessage;
                    SdkLog.d(str2, "transId : " + iSendMessage);
                } else {
                    str = "Send Message Failed - Peer Agent is invalid!";
                }
                throw new IOException(str);
            } catch (GeneralException e3) {
                throw new IOException("Send Message Failed", e3);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                SdkLog.d(TAG, "messageBuffer: recycle");
                bufferObtain.recycle();
            }
            throw th;
        }
    }

    private void sendMessageDeliveryStatus(long j, String str, int i, int i2) throws IOException {
        try {
            this.mAdapter.sendMessageDeliveryStatus(j, str, i, i2);
        } catch (GeneralException e) {
            SdkLog.e(TAG, "Ack failed! " + e);
            throw new IOException("Send Failed", e);
        }
    }

    public int checkMexFeature(PeerAgent peerAgent) {
        return 0;
    }

    public abstract void onError(PeerAgent peerAgent, int i, int i2);

    public abstract void onReceive(PeerAgent peerAgent, byte[] bArr);

    public abstract void onSent(PeerAgent peerAgent, int i);

    public void postAsynch(Bundle bundle) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new MessageCallbackRunnable(this, bundle, true));
        }
    }

    public void registerAgent(String str) throws GeneralException {
        String str2 = this.mAgentId;
        if (str2 != null && !str.equalsIgnoreCase(str2)) {
            this.mAdapter.unregisterMexCallback(this.mAgentId);
        }
        this.mAgentId = str;
        this.mAdapter.registerMexCallback(str, this.mMexCallback);
    }

    public int secureSend(PeerAgent peerAgent, byte[] bArr) throws UnSupportException, IOException {
        return sendMessage(peerAgent, bArr, true);
    }

    public int send(PeerAgent peerAgent, byte[] bArr) throws UnSupportException, IOException {
        return sendMessage(peerAgent, bArr, false);
    }

    public void unregisterAgent() {
        try {
            String str = this.mAgentId;
            if (str != null) {
                this.mAdapter.unregisterMexCallback(str);
            }
        } catch (GeneralException e) {
            SdkLog.e(TAG, "Failed to un-register Mex callback! " + e.getLocalizedMessage());
        }
    }

    public BaseMessage(BaseJobAgent baseJobAgent) {
        if (baseJobAgent != null) {
            init(baseJobAgent.getApplicationContext(), baseJobAgent.getAgentHandler(), baseJobAgent.registerMessageInstance(this));
        } else {
            SdkLog.e(TAG, "BaseMessage() - empty agent instance!");
            throw new IllegalArgumentException("Message creation failed! - invalid agent instance supplied");
        }
    }
}
