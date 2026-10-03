package com.heytap.accessory;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.heytap.accessory.api.IServiceChannelCallback;
import com.heytap.accessory.api.IServiceConnectionCallback;
import com.heytap.accessory.bean.GeneralException;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.accessory.bean.TrafficReport;
import com.heytap.accessory.bean.UnSupportException;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.AFArraysUtils;
import com.heytap.accessory.utils.SdkConfig;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.accessory.utils.buffer.BufferException;
import com.heytap.accessory.utils.buffer.BufferPool;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public abstract class BaseSocket {
    public static final int CONNECTION_LOST_DEVICE_DETACHED = 1;
    public static final int CONNECTION_LOST_PEER_DISCONNECTED = 0;
    public static final int CONNECTION_LOST_RETRANSMISSION_FAILED = 2;
    public static final int CONNECTION_LOST_UNKNOWN_REASON = 3;
    private static final String DATA_KEY = "_";
    public static final int ERROR_CANCELLED = 20008;
    public static final int ERROR_CONNECTION_ALREADY_CLOSED = 20005;
    public static final int ERROR_FATAL = 20001;
    public static final int ERROR_INVALID_CHANNEL = 20006;
    public static final int ERROR_WRITE_TIMEDOUT = 20007;
    private static final int SOCKET_CONNECTED = 1;
    private static final int SOCKET_DISCONNECTED = 2;
    private static final int SOCKET_FORCE_CLOSED = 3;
    private static final String TAG = "BaseSocket";
    private BaseAdapter mAdapter;
    private List<Long> mAvailableChannelIdList;
    private PeerAgent mConnectedPeer;
    private String mConnectionId;
    private ConnectionStatusCallback mConnectionStatusCallback;
    private int mIsConnected = 2;
    private SocketHandler mSocketHandler;
    private Map<String, TrafficReport> mTrafficReportMap;

    public interface ConnectionStatusCallback {
        void onConnectionClosed(BaseSocket baseSocket);

        void onConnectionFailure(PeerAgent peerAgent, int i);

        void onConnectionSuccess(PeerAgent peerAgent, BaseSocket baseSocket);
    }

    public final class ServiceChannelCallback extends IServiceChannelCallback.Stub {
        @Override // com.heytap.accessory.api.IServiceChannelCallback
        public void onError(Bundle bundle) throws RemoteException {
            if (!bundle.containsKey("errorcode")) {
                SdkLog.w(BaseSocket.TAG, "onChannelError with no error code!");
                return;
            }
            Message messageObtainMessage = BaseSocket.this.mSocketHandler.obtainMessage(3);
            messageObtainMessage.arg1 = bundle.getInt("errorcode");
            BaseSocket.this.mSocketHandler.sendMessage(messageObtainMessage);
        }

        @Override // com.heytap.accessory.api.IServiceChannelCallback
        public void onRead(Bundle bundle) throws RemoteException {
            long j2 = bundle.getLong("channelId");
            Message messageObtainMessage = BaseSocket.this.mSocketHandler.obtainMessage(2);
            messageObtainMessage.arg1 = (int) j2;
            messageObtainMessage.obj = bundle;
            BaseSocket.this.mSocketHandler.sendMessage(messageObtainMessage);
        }

        private ServiceChannelCallback() {
        }
    }

    public final class ServiceConnectionCallback extends IServiceConnectionCallback.Stub {
        @Override // com.heytap.accessory.api.IServiceConnectionCallback
        public void onConnectionLost(Bundle bundle) throws RemoteException {
            if (!bundle.containsKey("errorcode")) {
                SdkLog.e(BaseSocket.TAG, "onConnectionLost with no error code!");
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putLong("connectionId", bundle.getLong("connectionId"));
            Message messageObtainMessage = BaseSocket.this.mSocketHandler.obtainMessage(1);
            messageObtainMessage.arg1 = bundle.getInt("errorcode");
            messageObtainMessage.obj = bundle2;
            BaseSocket.this.mSocketHandler.sendMessage(messageObtainMessage);
        }

        @Override // com.heytap.accessory.api.IServiceConnectionCallback
        public void onConnectionResponse(Bundle bundle) throws RemoteException {
            Message messageObtainMessage = BaseSocket.this.mSocketHandler.obtainMessage(4);
            messageObtainMessage.arg1 = bundle.getInt("errorcode", 10012);
            messageObtainMessage.obj = bundle.getString("connectionId", null);
            messageObtainMessage.setData(bundle);
            BaseSocket.this.mSocketHandler.sendMessage(messageObtainMessage);
        }

        private ServiceConnectionCallback() {
            SdkLog.d(BaseSocket.TAG, "ServiceConnectionCallback new");
        }
    }

    public static final class SocketHandler extends Handler {
        static final int MESSAGE_CHANNEL_ERROR = 3;
        static final int MESSAGE_CHANNEL_READ = 2;
        static final int MESSAGE_SERVICE_CONNECTION_LOSS = 1;
        static final int MESSAGE_SERVICE_CONNECTION_RESPONSE = 4;
        BaseSocket mSocket;

        public SocketHandler(BaseSocket baseSocket, Looper looper) {
            super(looper);
            this.mSocket = baseSocket;
        }

        @Override // android.os.Handler
        public synchronized void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Bundle bundle = (Bundle) message.obj;
                if (bundle != null) {
                    this.mSocket.handleConnectionLoss(bundle.getLong("connectionId"), message.arg1);
                } else {
                    SdkLog.e(BaseSocket.TAG, "MESSAGE_SERVICE_CONNECTION_LOSS: (bundle==null)");
                    this.mSocket.handleConnectionLoss(0L, message.arg1);
                }
            } else if (i == 2) {
                this.mSocket.handleIncomingData(message.arg1, (Bundle) message.obj);
            } else if (i != 4) {
                SdkLog.e(BaseSocket.TAG, "Invalid message: " + message.what);
            } else {
                Bundle data = message.getData();
                this.mSocket.handleConnectionResponse((String) message.obj, data != null ? data.getLongArray("channelId") : null, message.arg1);
            }
        }

        public synchronized void quit() {
            super.getLooper().quit();
            this.mSocket = null;
        }
    }

    public BaseSocket(String str) {
    }

    private void cacheTrafficReport(String str, int i, TrafficReport trafficReport) {
        if (this.mTrafficReportMap == null) {
            this.mTrafficReportMap = new HashMap();
        }
        this.mTrafficReportMap.put(getDataKey(str, i), trafficReport);
    }

    private boolean checkCompressedUnSupport(PeerAgent peerAgent) {
        return peerAgent == null || peerAgent.getAccessory() == null || !peerAgent.getAccessory().supportCompression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanupSocket() {
        this.mSocketHandler.removeCallbacksAndMessages(null);
        this.mSocketHandler.quit();
        SdkLog.d(TAG, "SocketHandler quit");
    }

    private static String getDataKey(String str, int i) {
        return str + "_" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectionLoss(long j2, int i) {
        if (i == 20001) {
            this.mIsConnected = 3;
        } else {
            this.mIsConnected = 2;
        }
        onServiceConnectionLost(j2, i);
        handleServiceConnectionLostErrorCode(i);
        cleanupSocket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectionResponse(@Nullable String str, @Nullable long[] jArr, int i) {
        if (this.mConnectionStatusCallback == null) {
            SdkLog.w(TAG, "Connection status callback not found! Ignoring response");
            return;
        }
        if (str == null) {
            SdkLog.w(TAG, "connectionId is null so cleaning up");
            this.mConnectionStatusCallback.onConnectionFailure(this.mConnectedPeer, i);
            cleanupSocket();
            return;
        }
        this.mConnectionId = str;
        this.mIsConnected = 1;
        SdkLog.i(TAG, "onServiceConnectionResponse:" + this.mConnectedPeer);
        this.mAvailableChannelIdList = AFArraysUtils.toList(jArr);
        this.mConnectionStatusCallback.onConnectionSuccess(this.mConnectedPeer, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleIncomingData(int i, Bundle bundle) {
        if (this.mIsConnected != 1) {
            SdkLog.w(TAG, "Ignoring data, socket is not yet established");
            return;
        }
        byte[] byteArray = bundle.getByteArray("com.heytap.accessory.adapter.extra.READ_BYTES");
        if (byteArray == null) {
            SdkLog.e(TAG, "Failed to reassemble! - null data received!");
            return;
        }
        int i2 = bundle.getInt("com.heytap.accessory.adapter.extra.READ_LENGHT");
        int i3 = bundle.getInt("com.heytap.accessory.adapter.extra.READ_OFFSET");
        cacheTrafficReport(this.mConnectionId, i, TrafficReport.createFromBundle(bundle));
        SdkLog.d(TAG, "handleIncomingData: " + byteArray.length + " [" + i3 + ", " + i2 + "]");
        try {
            try {
                byte[] bArr = new byte[i2];
                SystemUtils.arraycopy(byteArray, i3, bArr, 0, i2);
                onReceive(Long.parseLong(this.mConnectionId), i, bArr);
            } catch (Exception unused) {
                SdkLog.w(TAG, "handleIncomingData Exception");
            }
        } finally {
            this.mAdapter.recycle(byteArray);
        }
    }

    private void handleServiceConnectionLostErrorCode(int i) {
        if (i == 0) {
            SdkLog.i(TAG, "onServiceConnectionLost() -> CONNECTION_LOST_PEER_DISCONNECTED");
            return;
        }
        if (i == 1) {
            SdkLog.i(TAG, "onServiceConnectionLost() -> CONNECTION_LOST_DEVICE_DETACHED");
            return;
        }
        if (i == 2) {
            SdkLog.i(TAG, "onServiceConnectionLost() -> CONNECTION_LOST_RETRANSMISSION_FAILED");
            return;
        }
        if (i == 3) {
            SdkLog.i(TAG, "onServiceConnectionLost() -> CONNECTION_LOST_UNKNOWN_REASON");
            return;
        }
        if (i == 20001) {
            SdkLog.i(TAG, "onServiceConnectionLost() -> ERROR_FATAL");
            return;
        }
        SdkLog.w(TAG, "onServiceConnectionLost() error_code: " + i);
    }

    private void requestClose() {
        try {
            int iCloseServiceConnection = this.mAdapter.closeServiceConnection(this.mConnectionId);
            if (iCloseServiceConnection == 20005) {
                SdkLog.i(TAG, "Connection is already closed");
            } else if (iCloseServiceConnection == 0) {
                SdkLog.i(TAG, "Connection " + this.mConnectionId + " close requested successfully");
            }
        } catch (GeneralException e2) {
            SdkLog.e(TAG, "Failed to close connection!", e2);
        }
    }

    private synchronized void sendData(int i, byte[] bArr, int i2, boolean z) throws IOException {
        try {
            if (i < 0) {
                SdkLog.e(TAG, "Send Failed : there is no service channel at the index");
                throw new IOException("end Failed : there is no service channel at the index");
            }
            if (this.mIsConnected != 1) {
                SdkLog.e(TAG, "Send failed. Socket already closed");
                throw new IOException("Send failed. Socket already closed");
            }
            if (bArr == null) {
                SdkLog.e(TAG, "sendData: data is null");
                throw new IllegalArgumentException("Invalid data to send:NULL");
            }
            if (bArr.length == 0) {
                SdkLog.e(TAG, "sendData: data length is 0");
                throw new IllegalArgumentException("Invalaid data length 0");
            }
            if (bArr.length > this.mConnectedPeer.getMaxAllowedDataSize()) {
                SdkLog.e(TAG, "Data too long:" + bArr.length + " , " + this.mConnectedPeer.getMaxAllowedDataSize());
                throw new IllegalArgumentException("Data Too long! size:" + bArr.length + " Max allowed Size:" + this.mConnectedPeer.getMaxAllowedDataSize() + ". check PeerAgent.getMaxAllowedDataSize()");
            }
            sendDataNonFragment(i, bArr, 0, false, i2, z);
        } catch (Throwable th) {
            throw th;
        }
    }

    private void sendDataNonFragment(int i, byte[] bArr, int i2, boolean z, int i3, boolean z2) throws IOException {
        try {
            if (this.mIsConnected != 1) {
                SdkLog.w(TAG, "Data send failed, connection closed!");
                throw new IOException("Failed to send, connection closed!");
            }
            Buffer bufferObtain = BufferPool.obtain(SdkConfig.getFrameworkMaxHeaderLength() + bArr.length + i2 + SdkConfig.getFrameworkMaxFooterLength());
            bufferObtain.setOffset(SdkConfig.getFrameworkMaxHeaderLength());
            bufferObtain.extractFrom(bArr, 0, bArr.length);
            int iSend = this.mAdapter.send(this.mConnectedPeer, this.mConnectionId, i, bufferObtain.getBuffer(), z, bufferObtain.getPayloadLength(), bufferObtain.getOffset(), i3, z2);
            if (iSend != 0) {
                if (iSend == 20005) {
                    this.mIsConnected = 2;
                    SdkLog.e(TAG, "Write failed: Connection closed");
                    throw new IOException("Write failed:Connection already closed");
                }
                if (iSend == 20008) {
                    SdkLog.e(TAG, "write failed: user cancelled");
                    return;
                }
                if (iSend != 20006) {
                    if (iSend != 20007) {
                        return;
                    }
                    SdkLog.e(TAG, "Write failed: Timed out!");
                    close();
                    throw new IOException("Write failed: Timed out!");
                }
                SdkLog.e(TAG, "Write failed. Attempt to write on invalid channel:" + i);
                throw new IllegalArgumentException("Write failed. Attempt to write on invalid channel:" + i);
            }
        } catch (GeneralException e2) {
            SdkLog.e(TAG, "Send failed!", e2);
            throw new IOException("Send Failed", e2);
        } catch (BufferException e3) {
            SdkLog.e(TAG, "BufferException: " + e3.getLocalizedMessage());
        }
    }

    private boolean startSocketHandler(String str, String str2) {
        HandlerThread handlerThread = new HandlerThread("Socket:" + str + "_" + str2);
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.heytap.accessory.BaseSocket.3
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                SdkLog.e(BaseSocket.TAG, "Exception in Socket background thread:" + thread.getName() + "exception: " + th);
            }
        });
        String str3 = TAG;
        SdkLog.d(str3, "socketHandlerThread start");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            this.mSocketHandler = new SocketHandler(this, looper);
            return true;
        }
        SdkLog.e(str3, "Failed get Looper for Socket: initiator:" + str + " Peer Id:" + str2);
        return false;
    }

    public void acceptServiceConnection(final String str, final PeerAgent peerAgent, final BaseAdapter baseAdapter, ConnectionStatusCallback connectionStatusCallback) {
        this.mConnectedPeer = peerAgent;
        this.mAdapter = baseAdapter;
        this.mConnectionStatusCallback = connectionStatusCallback;
        startSocketHandler(str, peerAgent.getAgentId());
        this.mSocketHandler.post(new Runnable() { // from class: com.heytap.accessory.BaseSocket.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    BaseAdapter baseAdapter2 = baseAdapter;
                    String str2 = str;
                    PeerAgent peerAgent2 = peerAgent;
                    Bundle bundleAcceptServiceConnection = baseAdapter2.acceptServiceConnection(str2, peerAgent2, peerAgent2.getTransactionId(), new ServiceConnectionCallback(), new ServiceChannelCallback());
                    String string = bundleAcceptServiceConnection.getString("connectionId");
                    long[] longArray = bundleAcceptServiceConnection.getLongArray("channelId");
                    String str3 = BaseSocket.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Connection accepted successfully. connection Id:");
                    sb.append(string);
                    sb.append(" channel Id count:");
                    sb.append(longArray == null ? 0 : longArray.length);
                    SdkLog.d(str3, sb.toString());
                    BaseSocket.this.handleConnectionResponse(string, longArray, 0);
                } catch (GeneralException e2) {
                    SdkLog.e(BaseSocket.TAG, "Failed to accept service connection: " + e2.getMessage());
                    BaseSocket.this.handleConnectionResponse(null, null, e2.getErrorCode());
                }
            }
        });
    }

    public void cleanupChannel(String str, int i) {
        try {
            this.mAdapter.cleanupChannel(str, i);
        } catch (GeneralException e2) {
            SdkLog.e(TAG, "cleanupChannel failed." + i, e2);
        }
    }

    public void close() {
        if (this.mIsConnected != 1) {
            SdkLog.i(TAG, "Connection is already closed");
            return;
        }
        this.mIsConnected = 2;
        SdkLog.i(TAG, this.mAdapter.getPackageName() + " requested to close socket for Peer:" + this.mConnectedPeer.getAgentId());
        requestClose();
    }

    public void forceClose() {
        if (this.mIsConnected == 1) {
            this.mIsConnected = 3;
            Message messageObtainMessage = this.mSocketHandler.obtainMessage(1);
            messageObtainMessage.arg1 = 20001;
            Bundle bundle = new Bundle();
            try {
                bundle.putLong("connectionId", Long.parseLong(this.mConnectionId));
            } catch (NumberFormatException e2) {
                SdkLog.w(TAG, e2);
            }
            messageObtainMessage.obj = bundle;
            this.mSocketHandler.sendMessage(messageObtainMessage);
            SdkLog.i(TAG, "Socket:" + this.mConnectionId + " has been force closed!");
        }
    }

    public PeerAgent getConnectedPeerAgent() {
        return this.mConnectedPeer;
    }

    public String getConnectionId() {
        return this.mConnectionId;
    }

    public int getServiceChannelId(int i) {
        if (this.mAvailableChannelIdList == null) {
            SdkLog.e(TAG, "Failed because Service Profile is null");
            return -1;
        }
        if (i >= 0 && i < getServiceChannelSize()) {
            return this.mAvailableChannelIdList.get(i).intValue();
        }
        SdkLog.e(TAG, "Failed because of wrong index");
        return -1;
    }

    public int getServiceChannelSize() {
        List<Long> list = this.mAvailableChannelIdList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Nullable
    public TrafficReport getTrafficReport(String str, int i) {
        if (this.mTrafficReportMap == null) {
            return null;
        }
        return this.mTrafficReportMap.get(getDataKey(str, i));
    }

    public void initiateServiceconnection(final String str, final PeerAgent peerAgent, BaseAdapter baseAdapter, ConnectionStatusCallback connectionStatusCallback) {
        this.mConnectedPeer = peerAgent;
        this.mConnectionStatusCallback = connectionStatusCallback;
        this.mAdapter = baseAdapter;
        startSocketHandler(str, peerAgent.getAgentId());
        this.mSocketHandler.post(new Runnable() { // from class: com.heytap.accessory.BaseSocket.1
            @Override // java.lang.Runnable
            public void run() {
                int errorCode;
                try {
                    errorCode = BaseSocket.this.mAdapter.requestServiceConnection(str, peerAgent, new ServiceConnectionCallback(), new ServiceChannelCallback());
                } catch (GeneralException e2) {
                    SdkLog.e(BaseSocket.TAG, "Failed to initiate connection!", e2);
                    errorCode = e2.getErrorCode();
                }
                if (errorCode == 0) {
                    SdkLog.i(BaseSocket.TAG, "Connection request enqued successfully for peer:" + peerAgent.getAgentId());
                    return;
                }
                SdkLog.i(BaseSocket.TAG, "Connection request failed for peer:" + peerAgent.getAgentId() + " Reason:" + errorCode + " Cleaning up now");
                if (BaseSocket.this.mConnectionStatusCallback != null) {
                    BaseSocket.this.mConnectionStatusCallback.onConnectionFailure(peerAgent, errorCode);
                }
                BaseSocket.this.cleanupSocket();
            }
        });
    }

    public boolean isConnected() {
        return this.mIsConnected == 1;
    }

    public abstract void onError(int i, String str, int i2);

    public abstract void onReceive(long j2, int i, byte[] bArr);

    public abstract void onServiceConnectionLost(long j2, int i);

    public synchronized void secureSend(int i, byte[] bArr) throws IOException {
        try {
            if (i < 0) {
                SdkLog.e(TAG, "Send Failed : there is no service channel at the index");
            } else {
                if (this.mIsConnected != 1) {
                    throw new IOException("Secure Send failed. Socket already closed");
                }
                if (bArr == null) {
                    SdkLog.e(TAG, "secureSend: data is null");
                    throw new IllegalArgumentException("Invalid data to send:NULL");
                }
                if (bArr.length == 0) {
                    SdkLog.e(TAG, "SecureSend: data length is 0");
                    throw new IllegalArgumentException("Invalaid data length 0");
                }
                if (bArr.length > this.mConnectedPeer.getMaxAllowedDataSize()) {
                    SdkLog.e(TAG, "SecureSend:Data too long:" + bArr.length);
                    throw new IllegalArgumentException("Secure send:Data Too long! size:" + bArr.length + " Max allowed Size:" + this.mConnectedPeer.getMaxAllowedDataSize() + ". check PeerAgent.getMaxAllowedDataSize()");
                }
                SdkLog.d(TAG, "Sending data:" + bArr.length + " bytes");
                sendDataNonFragment(i, bArr, getConnectedPeerAgent().getAccessory().getEncryptionPaddingLength(), true, 3, false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void send(int i, byte[] bArr) throws IOException {
        sendData(i, bArr, 3, false);
    }

    public void sendAlign(int i, byte[] bArr) throws IOException {
        sendData(i, bArr, 1, true);
    }

    public void sendCompressed(int i, byte[] bArr) throws UnSupportException, IOException {
        if (checkCompressedUnSupport(getConnectedPeerAgent())) {
            SdkLog.i(TAG, "current peer is note supported compression");
            throw new UnSupportException("the peer agent doesn't support the compression feature, please check");
        }
        sendData(i, bArr, 1, false);
    }

    public void sendUncompressed(int i, byte[] bArr) throws IOException {
        sendData(i, bArr, 2, false);
    }

    public void send(int i, Buffer buffer) throws IOException {
        sendData(i, buffer, 3, false);
    }

    public void sendAlign(int i, Buffer buffer) throws IOException {
        sendData(i, buffer, 3, true);
    }

    public void sendUncompressed(int i, Buffer buffer) throws IOException {
        sendData(i, buffer, 2, false);
    }

    public void sendCompressed(int i, Buffer buffer) throws IOException {
        sendData(i, buffer, 1, false);
    }

    private void sendData(int i, Buffer buffer, int i2, boolean z) throws IOException {
        if (i < 0) {
            SdkLog.e(TAG, "Send Failed : there is no service channel at the index");
            return;
        }
        if (this.mIsConnected != 1) {
            throw new IOException("Send failed. Socket already closed");
        }
        if (buffer != null) {
            if (buffer.getBuffer().length != 0) {
                if (buffer.getBuffer().length <= this.mConnectedPeer.getMaxAllowedDataSize()) {
                    try {
                        if (this.mIsConnected == 1) {
                            int iSend = this.mAdapter.send(this.mConnectedPeer, this.mConnectionId, i, buffer.getBuffer(), false, buffer.getPayloadLength(), buffer.getOffset(), i2, z);
                            if (iSend != 0) {
                                if (iSend == 20005) {
                                    this.mIsConnected = 2;
                                    SdkLog.e(TAG, "Write failed: Connection closed");
                                    throw new IOException("Write failed:Connection already closed");
                                }
                                if (iSend == 20006) {
                                    SdkLog.e(TAG, "Write failed. Attempt to write on invalid channel:" + i);
                                    throw new IllegalArgumentException("Write failed. Attempt to write on invalid channel:" + i);
                                }
                                if (iSend != 20007) {
                                    SdkLog.e(TAG, "Write failed. status:" + iSend);
                                    return;
                                }
                                SdkLog.e(TAG, "Write failed: Timed out!");
                                close();
                                throw new IOException("Write failed: Timed out!");
                            }
                            return;
                        }
                        SdkLog.w(TAG, "Data send failed, connection closed!");
                        throw new IOException("Failed to send, connection closed!");
                    } catch (GeneralException e2) {
                        SdkLog.e(TAG, "Send failed!", e2);
                        throw new IOException("Send Failed", e2);
                    }
                }
                SdkLog.e(TAG, "Data too long:" + buffer.getBuffer().length);
                throw new IllegalArgumentException("Data Too long! size:" + buffer.getBuffer().length + " Max allowed Size:" + this.mConnectedPeer.getMaxAllowedDataSize() + ". check PeerAgent.getMaxAllowedDataSize()");
            }
            SdkLog.e(TAG, "sendData: data length is 0");
            throw new IllegalArgumentException("Invalaid data length 0");
        }
        SdkLog.e(TAG, "sendData: data is null");
        throw new IllegalArgumentException("Invalid data to send:NULL");
    }
}
