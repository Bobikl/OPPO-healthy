package com.heytap.accessory.pair.connectivity.ble;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.heytap.accessory.pair.connectivity.PairConnection;
import com.heytap.accessory.pair.connectivity.ble.callback.BleServerListener;
import com.heytap.accessory.pair.connectivity.ble.constant.BleConstants;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionListener;
import com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener;
import com.heytap.accessory.pair.connectivity.param.connect.FPBleConParam;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;
import com.heytap.accessory.pair.connectivity.param.message.FPBleMessageParam;
import com.heytap.accessory.pair.connectivity.param.message.FPMessageParam;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.provider.bleserver.utils.ProviderThreadManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes14.dex */
public class BleConnection extends PairConnection implements IBleConnectionListener {
    public static final int DEFAULT_MTU_KEEP_SIZE = 3;
    public static final int DEFAULT_MTU_SIZE = 20;
    private static final Object OBTAIN_LOCK = new Object();
    public static final int REQUEST_MTU_SIZE = 243;
    private static final String TAG = "PairConnection";
    private long mAccessoryId;
    private IBleConnectionInterface mConnection;
    private IConnectionEventListener mConnectionEventListener;
    private int mCurrentMtuSize;
    private ReaderMessageHandler mReaderMessageHandler;
    private String mReaderThreadName;
    private Handler mWriteHandler;
    private String mWriteThreadName;

    public final class FrameDispatchTask implements Runnable {
        private FPBleMessageParam mFpMessageParam;
        final byte[] mMessage;

        @Override // java.lang.Runnable
        public void run() {
            BleConnection.this.writeProtocolFrame(this.mMessage, this.mFpMessageParam);
        }

        private FrameDispatchTask(byte[] bArr, FPMessageParam fPMessageParam) {
            this.mMessage = bArr;
            this.mFpMessageParam = (FPBleMessageParam) fPMessageParam;
        }
    }

    public static final class ReaderMessageHandler extends Handler {
        private final WeakReference<BleConnection> mBleConn;
        private int mBytesRead;
        private int mBytesReadCrc;
        private byte[] mCrc;
        private int mFrameLen;
        private byte[] mHolder;
        private boolean mIsStreamingAlive;
        private int mTotalBytesRead;
        private int mTotalPacketLen;

        private void handleDataReceived(BleConnection bleConnection, byte[] bArr) {
            if (1 == ((PairConnection) bleConnection).mStatus) {
                bleConnection.mConnectionEventListener.onMessageReceived(((PairConnection) bleConnection).mConnectionParam.mAddress, bArr);
                return;
            }
            PairLog.e(BleConnection.TAG, "CONNECTION_STATUS is not open, status = " + ((PairConnection) bleConnection).mStatus);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] byteArray;
            BleConnection bleConnection = this.mBleConn.get();
            if (bleConnection == null) {
                PairLog.e(BleConnection.TAG, "MessageHandler() : reference to AFBleDevice is null! returning...");
                return;
            }
            if (message.what != 5) {
                PairLog.e(BleConnection.TAG, "Unknown event rece4ived in data reader handler =" + message);
                return;
            }
            Bundle data = message.getData();
            if (data == null || (byteArray = data.getByteArray(BleConstants.DATA_RECEIVED)) == null) {
                return;
            }
            if (byteArray.length == 0) {
                PairLog.v(BleConnection.TAG, "Empty Message");
            } else {
                handleDataReceived(bleConnection, byteArray);
            }
        }

        private ReaderMessageHandler(Looper looper, BleConnection bleConnection) {
            super(looper);
            this.mIsStreamingAlive = false;
            this.mCrc = new byte[2];
            this.mBytesRead = 0;
            this.mBytesReadCrc = 0;
            this.mFrameLen = 0;
            this.mBleConn = new WeakReference<>(bleConnection);
        }
    }

    private BleConnection(FPConParam fPConParam) {
        super(fPConParam);
        this.mCurrentMtuSize = 20;
        this.mStatus = 0;
        this.mError = 0;
    }

    private boolean isConnectionProper() {
        IBleConnectionInterface iBleConnectionInterface = this.mConnection;
        if (iBleConnectionInterface != null) {
            return iBleConnectionInterface.isConnectionProper();
        }
        return false;
    }

    public static BleConnection obtain(FPConParam fPConParam) {
        BleConnection bleConnection;
        synchronized (OBTAIN_LOCK) {
            bleConnection = new BleConnection(fPConParam);
        }
        return bleConnection;
    }

    private void startDispatchHandlerThread() {
        IBleConnectionInterface iBleConnectionInterface = this.mConnection;
        this.mWriteThreadName = ProviderThreadManager.getInstance().getThreadNameForConnection(1, (iBleConnectionInterface == null || !(iBleConnectionInterface instanceof BleClientConnection)) ? "S" : "C", "WRITE", 0);
        Looper looper = ProviderThreadManager.getInstance().getLooper(this.mWriteThreadName);
        if (looper != null) {
            this.mWriteHandler = new Handler(looper);
            PairLog.d(TAG, "initialized Writer");
        } else {
            throw new IllegalStateException("not find looper named " + this.mWriteThreadName);
        }
    }

    private void startReaderHandlerThread() {
        IBleConnectionInterface iBleConnectionInterface = this.mConnection;
        this.mReaderThreadName = ProviderThreadManager.getInstance().getThreadNameForConnection(1, (iBleConnectionInterface == null || !(iBleConnectionInterface instanceof BleClientConnection)) ? "S" : "C", "READ", 0);
        Looper looper = ProviderThreadManager.getInstance().getLooper(this.mReaderThreadName);
        if (looper != null) {
            this.mReaderMessageHandler = new ReaderMessageHandler(looper, this);
            PairLog.d(TAG, "initialized Reader");
        } else {
            throw new IllegalStateException("not find read looper named " + this.mWriteThreadName);
        }
    }

    private void stopDispatchHandlerThread() {
        Handler handler = this.mWriteHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            ProviderThreadManager.getInstance().quitThread(this.mWriteThreadName);
            this.mWriteHandler = null;
        }
    }

    private void stopReaderHandlerThread() {
        ReaderMessageHandler readerMessageHandler = this.mReaderMessageHandler;
        if (readerMessageHandler != null) {
            readerMessageHandler.removeCallbacksAndMessages(null);
            ProviderThreadManager.getInstance().quitThread(this.mReaderThreadName);
            this.mReaderMessageHandler = null;
        }
    }

    private void writeBLEPacket(byte[] bArr, FPBleMessageParam fPBleMessageParam) {
        this.mConnection.write(bArr, fPBleMessageParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeProtocolFrame(byte[] bArr, FPBleMessageParam fPBleMessageParam) {
        if (1 != this.mStatus) {
            PairLog.w(TAG, "ConnectionStatus: " + this.mStatus);
        }
        if (!isConnectionProper()) {
            this.mStatus = 3;
            return;
        }
        try {
            writeBLEPacket(bArr, fPBleMessageParam);
        } catch (Exception e2) {
            PairLog.e(TAG, "Socket closed during write :" + e2.toString());
            this.mStatus = 3;
            if (this.mError != 2) {
                this.mError = -1106;
            }
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public int activateConnection() {
        return 0;
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void clearConnection() {
        IBleConnectionInterface iBleConnectionInterface = this.mConnection;
        if (iBleConnectionInterface != null) {
            iBleConnectionInterface.close();
        }
        stopReaderHandlerThread();
        stopDispatchHandlerThread();
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void close() {
        PairLog.v(TAG, "close enter");
        if (this.mStatus == 2) {
            PairLog.v(TAG, "Already Connection closed return");
            return;
        }
        this.mStatus = 2;
        this.mError = 0;
        clearConnection();
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void connect(IConnectionEventListener iConnectionEventListener) {
        this.mStatus = 0;
        this.mError = 0;
        this.mConnectionEventListener = iConnectionEventListener;
        BleClientConnection clientConnection = getClientConnection();
        this.mConnection = clientConnection;
        int iConnect = clientConnection.connect();
        this.mError = iConnect;
        if (iConnect == 0) {
            return;
        }
        this.mStatus = 3;
        this.mConnectionEventListener.onConnectionStateChanged(this.mConnectionParam.mAddress, 3, iConnect);
        PairLog.v(TAG, "Connection   (status: " + this.mStatus + ")");
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void forceClose() {
        if (this.mConnection instanceof BleServerConnection) {
            clearConnection();
        } else {
            PairLog.e(TAG, "mBtSocket is null");
        }
    }

    public BleClientConnection getClientConnection() {
        return new BleClientConnection((FPBleConParam) this.mConnectionParam, this);
    }

    public BleServerConnection getServerConnection() {
        return new BleServerConnection((FPBleConParam) this.mConnectionParam, this);
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void initializeReader() {
        startReaderHandlerThread();
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void initializeWriter() {
        startDispatchHandlerThread();
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionListener
    public void onConnectionStateChanged(int i, int i2) {
        this.mStatus = i;
        this.mError = i2;
        IConnectionEventListener iConnectionEventListener = this.mConnectionEventListener;
        if (iConnectionEventListener != null) {
            iConnectionEventListener.onConnectionStateChanged(this.mConnectionParam.mAddress, i, i2);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionListener
    public void onMessageReceived(byte[] bArr) {
        ReaderMessageHandler readerMessageHandler = this.mReaderMessageHandler;
        if (readerMessageHandler != null) {
            Message messageObtainMessage = readerMessageHandler.obtainMessage();
            messageObtainMessage.what = 5;
            Bundle bundle = new Bundle();
            bundle.putByteArray(BleConstants.DATA_RECEIVED, bArr);
            messageObtainMessage.setData(bundle);
            this.mReaderMessageHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionListener
    public void onMessageSent(String str, byte[] bArr) {
        IConnectionEventListener iConnectionEventListener = this.mConnectionEventListener;
        if (iConnectionEventListener != null) {
            iConnectionEventListener.onMessageDispatched(str, bArr);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionListener
    public void onMtuChanged(int i) {
        this.mCurrentMtuSize = i;
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public int openConnection(IConnectionEventListener iConnectionEventListener) {
        PairLog.d(TAG, "Server Mode");
        this.mStatus = 0;
        this.mError = 0;
        this.mConnectionEventListener = iConnectionEventListener;
        this.mConnection = getServerConnection();
        this.mCurrentMtuSize = BleServerListener.getInstance().getMtuSize();
        int iConnect = this.mConnection.connect();
        this.mStatus = iConnect;
        return iConnect;
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public int write(byte[] bArr, FPMessageParam fPMessageParam) {
        Handler handler = this.mWriteHandler;
        if (handler != null) {
            if (handler.post(new FrameDispatchTask(bArr, fPMessageParam))) {
                return 0;
            }
            PairLog.e(TAG, "Write handler post fail");
        }
        PairLog.e(TAG, "Message not posted");
        return 1;
    }
}
