package com.heytap.accessory.pair.connectivity.bt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.pair.connectivity.PairConnection;
import com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener;
import com.heytap.accessory.pair.connectivity.param.connect.FPBtConParam;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;
import com.heytap.accessory.pair.connectivity.param.message.FPBtMessageParam;
import com.heytap.accessory.pair.connectivity.param.message.FPMessageParam;
import com.heytap.accessory.pair.connectivity.utils.ThreadManager;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.utils.HexUtils;
import com.oplus.aiunit.vision.yha;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class BtRfConnection extends PairConnection {
    private static final long BLUETOOTH_SOCKET_READ_WAIT = 5000;
    private static final int BT_READER_BREAK = -1;
    private static final int BT_READER_CONTINUE = -2;
    private static final int BT_READER_SUCCESS = 0;
    private static final long CONNECT_TIME_OUT = 30000;
    public static final int MAXIMUM_PAYLOAD_SIZE_IN_BYTES = 65535;
    private static final Object OBTAIN_LOCK = new Object();
    private static final String TAG = "BtRfConnection";
    private static Handler mSocketTimeoutHandler;
    private BluetoothDevice mBluetoothDevice;
    private BluetoothSocket mBtSocket;
    private IConnectionEventListener mConnectionEventListener;
    private String mDynamicBtWriter;
    private InputStream mInputStream;
    private boolean mIsReaderActive;
    private BtRfConnection mNext;
    private OutputStream mOutputStream;
    private ParcelUuid mParcelUuid;
    private final SocketTimeoutEventHandler mSocketTimeoutEventHandler;
    protected boolean mUseIpcBtSocket;
    private Handler mWriteHandler;

    public final class FrameDispatchTask implements Runnable {
        private FPBtMessageParam mFpMessageParam;
        final byte[] mMessage;

        @Override // java.lang.Runnable
        public void run() {
            BtRfConnection.this.writeProtocolFrame(this.mMessage);
        }

        private FrameDispatchTask(byte[] bArr, FPMessageParam fPMessageParam) {
            this.mMessage = bArr;
            this.mFpMessageParam = (FPBtMessageParam) fPMessageParam;
        }
    }

    public class ReaderThread implements Runnable {
        byte[] crc;
        byte[] header;
        byte[] payload;

        @Override // java.lang.Runnable
        public void run() {
            int iD;
            int iD2;
            int iD3;
            PairLog.d(BtRfConnection.TAG, "initialized BT Reader");
            while (BtRfConnection.this.mIsReaderActive) {
                try {
                    if (BtRfConnection.this.isConnectionActive()) {
                        BtRfConnection btRfConnection = BtRfConnection.this;
                        if (btRfConnection.mUseIpcBtSocket) {
                            Context context = PlatformUtils.getContext();
                            BluetoothDevice bluetoothDevice = BtRfConnection.this.mBluetoothDevice;
                            ParcelUuid parcelUuid = BtRfConnection.this.getParcelUuid();
                            byte[] bArr = this.header;
                            iD = yha.d(context, bluetoothDevice, parcelUuid, bArr, 0, bArr.length);
                        } else {
                            InputStream inputStream = btRfConnection.mInputStream;
                            byte[] bArr2 = this.header;
                            iD = inputStream.read(bArr2, 0, bArr2.length);
                        }
                        if (iD == -1) {
                            PairLog.e(BtRfConnection.TAG, "Error reading header in Bluetooth socket");
                        } else {
                            BtRfConnection btRfConnection2 = BtRfConnection.this;
                            if (btRfConnection2.mUseIpcBtSocket) {
                                this.payload = new byte[yha.c(PlatformUtils.getContext(), BtRfConnection.this.mBluetoothDevice, BtRfConnection.this.getParcelUuid()) - 1];
                            } else {
                                this.payload = new byte[btRfConnection2.mInputStream.available() - 1];
                            }
                            BtRfConnection btRfConnection3 = BtRfConnection.this;
                            if (btRfConnection3.mUseIpcBtSocket) {
                                Context context2 = PlatformUtils.getContext();
                                BluetoothDevice bluetoothDevice2 = BtRfConnection.this.mBluetoothDevice;
                                ParcelUuid parcelUuid2 = BtRfConnection.this.getParcelUuid();
                                byte[] bArr3 = this.payload;
                                iD2 = yha.d(context2, bluetoothDevice2, parcelUuid2, bArr3, 0, bArr3.length);
                            } else {
                                InputStream inputStream2 = btRfConnection3.mInputStream;
                                byte[] bArr4 = this.payload;
                                iD2 = inputStream2.read(bArr4, 0, bArr4.length);
                            }
                            if (iD2 == -1) {
                                PairLog.e(BtRfConnection.TAG, "Error reading payload in Bluetooth socket");
                            } else {
                                BtRfConnection btRfConnection4 = BtRfConnection.this;
                                if (btRfConnection4.mUseIpcBtSocket) {
                                    Context context3 = PlatformUtils.getContext();
                                    BluetoothDevice bluetoothDevice3 = BtRfConnection.this.mBluetoothDevice;
                                    ParcelUuid parcelUuid3 = BtRfConnection.this.getParcelUuid();
                                    byte[] bArr5 = this.crc;
                                    iD3 = yha.d(context3, bluetoothDevice3, parcelUuid3, bArr5, 0, bArr5.length);
                                } else {
                                    InputStream inputStream3 = btRfConnection4.mInputStream;
                                    byte[] bArr6 = this.crc;
                                    iD3 = inputStream3.read(bArr6, 0, bArr6.length);
                                }
                                if (iD3 == -1) {
                                    PairLog.e(BtRfConnection.TAG, "Error reading crc in Bluetooth socket");
                                } else {
                                    byte[] bArr7 = this.header;
                                    byte[] bArr8 = new byte[bArr7.length + this.crc.length + this.payload.length];
                                    System.arraycopy(bArr7, 0, bArr8, 0, bArr7.length);
                                    byte[] bArr9 = this.payload;
                                    System.arraycopy(bArr9, 0, bArr8, this.header.length, bArr9.length);
                                    byte[] bArr10 = this.crc;
                                    System.arraycopy(bArr10, 0, bArr8, this.header.length + this.payload.length, bArr10.length);
                                    if (BtRfConnection.this.mConnectionEventListener != null) {
                                        BtRfConnection.this.mConnectionEventListener.onMessageReceived(((PairConnection) BtRfConnection.this).mConnectionParam.mAddress, bArr8);
                                    } else {
                                        PairLog.e(BtRfConnection.TAG, "mConnectionEventListener is null");
                                    }
                                }
                            }
                        }
                    }
                    BtRfConnection.this.handleReaderThreadClosure();
                } catch (IOException e) {
                    BtRfConnection.this.mIsReaderActive = false;
                    ((PairConnection) BtRfConnection.this).mStatus = 3;
                    PairLog.i(BtRfConnection.TAG, "BTReaderThread: IOexception:" + e.getMessage());
                    try {
                        BtRfConnection.this.closeSocket();
                    } catch (IOException unused) {
                        PairLog.i(BtRfConnection.TAG, "closeSocket: error" + e);
                    }
                }
            }
            PairLog.e(BtRfConnection.TAG, "run: reader not active!");
            BtRfConnection.this.handleReaderThreadClosure();
        }

        private ReaderThread() {
            this.header = new byte[1];
            this.crc = new byte[1];
        }
    }

    public final class SocketTimeoutEventHandler implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            PairLog.w(BtRfConnection.TAG, "BT Socket Timer expired waiting to read a packet");
            if (BtRfConnection.this.mIsReaderActive) {
                PairLog.i(BtRfConnection.TAG, "Closing the BT streams ...");
                ((PairConnection) BtRfConnection.this).mStatus = 3;
                ((PairConnection) BtRfConnection.this).mError = 2;
                try {
                    if (BtRfConnection.this.mOutputStream != null) {
                        BtRfConnection.this.mOutputStream.close();
                    }
                    if (BtRfConnection.this.mInputStream != null) {
                        BtRfConnection.this.mInputStream.close();
                    }
                    if (BtRfConnection.this.mBtSocket != null) {
                        BtRfConnection.this.closeSocket();
                    }
                } catch (IOException unused) {
                    ((PairConnection) BtRfConnection.this).mStatus = 3;
                }
            }
        }

        private SocketTimeoutEventHandler() {
        }
    }

    static {
        Looper looper = ThreadManager.getInstance().getLooper("daemon");
        if (looper != null) {
            mSocketTimeoutHandler = new Handler(looper);
        }
    }

    public BtRfConnection(FPConParam fPConParam) {
        super(fPConParam);
        this.mDynamicBtWriter = "BT_WRITE_";
        this.mUseIpcBtSocket = false;
        this.mSocketTimeoutEventHandler = new SocketTimeoutEventHandler();
        this.mStatus = 0;
        this.mError = 0;
    }

    public static void clearCache() {
    }

    private boolean evaluateCrc(byte[] bArr, byte[] bArr2, int i, String str) {
        int iComputeCrc = HexUtils.computeCrc(bArr, 0, i);
        int i2 = (bArr2[1] & 255) | ((bArr2[0] & 255) << 8);
        if (iComputeCrc != i2) {
            PairLog.e(TAG, "CRC ERROR in " + str + ", received CRC >>>> = 0x" + Integer.toHexString(i2));
            StringBuilder sb = new StringBuilder();
            sb.append(".CRC ERROR PACKET : ");
            sb.append(HexUtils.byteArrayToHex(bArr, 0, i));
            PairLog.e(TAG, sb.toString());
        }
        return iComputeCrc == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ParcelUuid getParcelUuid() {
        if (this.mParcelUuid == null) {
            this.mParcelUuid = new ParcelUuid(getUuid());
        }
        return this.mParcelUuid;
    }

    private UUID getUuid() {
        return ((FPBtConParam) this.mConnectionParam).mUUID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleReaderThreadClosure() {
        if (this.mIsReaderActive || 2 == this.mError || 3 == this.mStatus) {
            this.mStatus = 3;
            if (this.mError != 2) {
                this.mError = -1106;
            }
            this.mIsReaderActive = false;
            IConnectionEventListener iConnectionEventListener = this.mConnectionEventListener;
            if (iConnectionEventListener != null) {
                iConnectionEventListener.onConnectionStateChanged(this.mConnectionParam.mAddress, 3, this.mError);
            }
            PairLog.v(TAG, "BT PairConnection status: " + this.mStatus + " !");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConnectionActive() {
        if (this.mStatus == 1) {
            return true;
        }
        PairLog.e(TAG, "BT Socket is not connected! Connection status: " + this.mStatus + ")");
        return false;
    }

    public static BtRfConnection obtain(FPConParam fPConParam) {
        BtRfConnection btRfConnection;
        synchronized (OBTAIN_LOCK) {
            btRfConnection = new BtRfConnection(fPConParam);
        }
        return btRfConnection;
    }

    private int readHeader(byte[] bArr, String str) throws IOException {
        int iD = this.mUseIpcBtSocket ? yha.d(PlatformUtils.getContext(), this.mBluetoothDevice, getParcelUuid(), bArr, 0, 2) : this.mInputStream.read(bArr, 0, 2);
        if (iD <= 0) {
            PairLog.e(TAG, "Error reading " + str);
            return -1;
        }
        if (iD != 1 || this.mInputStream.read(bArr, 1, 1) > 0) {
            return 0;
        }
        PairLog.e(TAG, "Error reading 2nd byte of " + str);
        return -1;
    }

    private int readPayload(int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i > 0) {
            int iD = this.mUseIpcBtSocket ? yha.d(PlatformUtils.getContext(), this.mBluetoothDevice, getParcelUuid(), bArr, i2, i) : this.mInputStream.read(bArr, i2, i);
            if (iD == -1) {
                PairLog.e(TAG, "Error reading in Bluetooth socket");
                return -1;
            }
            i -= iD;
            i2 += iD;
        }
        return 0;
    }

    private int readPayloadCrc(byte[] bArr, byte[] bArr2) throws IOException {
        if (!this.mIsCrcEnabled) {
            return 0;
        }
        if (readHeader(bArr2, "payload crc (BT)") != 0) {
            return -1;
        }
        return !evaluateCrc(bArr, bArr2, bArr.length, "payload, ignoring packet") ? -2 : 0;
    }

    private int readPayloadLenCrc(byte[] bArr, byte[] bArr2) throws IOException {
        if (!this.mIsCrcEnabled) {
            return 0;
        }
        if (readHeader(bArr2, "payload length crc (BT)") != 0) {
            return -1;
        }
        if (evaluateCrc(bArr, bArr2, 2, "payload length")) {
            return 0;
        }
        this.mError = 2;
        return -1;
    }

    private boolean startDispatchHandlerThread() {
        Looper looper = ThreadManager.getInstance().getLooper(this.mDynamicBtWriter + this.mChannelType);
        if (looper == null) {
            return false;
        }
        this.mWriteHandler = new Handler(looper);
        PairLog.d(TAG, "initialized BT Writer");
        return true;
    }

    private void startSocketTimer(long j) {
        if (mSocketTimeoutHandler != null) {
            PairLog.i(TAG, "Start socket timer");
            mSocketTimeoutHandler.postDelayed(this.mSocketTimeoutEventHandler, j);
        }
    }

    private void stopDispatchHandlerThread() {
        Handler handler = this.mWriteHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            if (ThreadManager.getInstance().quitThread(this.mDynamicBtWriter + this.mChannelType)) {
                return;
            }
            PairLog.w(TAG, "Error while closing BT writer Thread");
        }
    }

    private void stopSocketTimer() {
        if (mSocketTimeoutHandler != null) {
            PairLog.i(TAG, "Stop socket timer");
            mSocketTimeoutHandler.removeCallbacks(this.mSocketTimeoutEventHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int writeProtocolFrame(byte[] bArr) {
        if (1 != this.mStatus) {
            PairLog.w(TAG, "writeProtocolFrame() BT ConnectionStatus: " + this.mStatus);
        }
        int length = bArr.length;
        PairLog.d(TAG, "before writeProtocolFrame PayloadLength: " + length);
        int i = -1;
        try {
            if (this.mOutputStream != null) {
                PairLog.d(TAG, "writeProtocolFrame PayloadLength: " + length);
                PairLog.d(TAG, "write data:" + HexUtils.byteArrayToHexStr(bArr));
                if (this.mUseIpcBtSocket) {
                    yha.e(PlatformUtils.getContext(), this.mBluetoothDevice, getParcelUuid(), bArr, 0, length, true);
                } else {
                    this.mOutputStream.write(bArr, 0, length);
                }
                i = length;
            }
            PairLog.i(TAG, "BT WRITE Len:" + length);
        } catch (IOException e) {
            this.mStatus = 3;
            if (this.mError != 2) {
                this.mError = -1106;
            }
            PairLog.w(TAG, "BT Socket closed during write (status: " + this.mStatus + ")" + e);
        }
        return i;
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public int activateConnection() {
        return 0;
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void clearConnection() {
        try {
            OutputStream outputStream = this.mOutputStream;
            if (outputStream != null) {
                outputStream.close();
            }
            InputStream inputStream = this.mInputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            if (this.mBtSocket != null) {
                closeSocket();
            }
        } catch (IOException unused) {
            this.mStatus = 3;
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void close() {
        this.mIsReaderActive = false;
        this.mError = 0;
        this.mStatus = 2;
        stopDispatchHandlerThread();
        clearConnection();
        stopSocketTimer();
        PairLog.v(TAG, "BT PairConnection is now closed (status: " + this.mStatus + ")");
    }

    public void closeSocket() throws IOException {
        if (this.mUseIpcBtSocket) {
            yha.a(PlatformUtils.getContext(), this.mBluetoothDevice, getParcelUuid());
        } else {
            this.mBtSocket.close();
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void connect(IConnectionEventListener iConnectionEventListener) {
        StringBuilder sb;
        this.mStatus = 0;
        this.mError = 0;
        this.mConnectionEventListener = iConnectionEventListener;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.mBluetoothDevice = defaultAdapter.getRemoteDevice(this.mConnectionParam.mAddress);
        try {
            try {
                FPConParam fPConParam = this.mConnectionParam;
                if (fPConParam instanceof FPBtConParam) {
                    this.mIsReaderActive = false;
                    this.mBtSocket = defaultAdapter.getRemoteDevice(fPConParam.mAddress).createRfcommSocketToServiceRecord(((FPBtConParam) this.mConnectionParam).mUUID);
                    startSocketTimer(CONNECT_TIME_OUT);
                    PairLog.i(TAG, "Connect to " + SensitiveLogUtils.toHiddenIfNeed(this.mConnectionParam.mAddress) + ", uuid:" + ((FPBtConParam) this.mConnectionParam).mUUID);
                    if (!this.mUseIpcBtSocket) {
                        try {
                            connectSocket();
                        } catch (Exception e) {
                            if (!TextUtils.equals("Connect refused", e.getMessage())) {
                                throw e;
                            }
                            PairLog.w(TAG, "[Socket Connect] Connect refused try ipc bt");
                            this.mUseIpcBtSocket = true;
                        }
                    }
                    if (this.mUseIpcBtSocket) {
                        yha.b(PlatformUtils.getContext(), this.mBluetoothDevice, getParcelUuid());
                    }
                    this.mInputStream = getInputStream();
                    this.mOutputStream = getOutputStream();
                    this.mStatus = 1;
                    PairLog.v(TAG, "BT ReaderThread ready");
                    this.mIsReaderActive = true;
                }
                stopSocketTimer();
                this.mConnectionEventListener.onConnectionStateChanged(this.mConnectionParam.mAddress, this.mStatus, this.mError);
                sb = new StringBuilder();
            } catch (IOException e2) {
                PairLog.w(TAG, "Connect failed again!" + e2.toString());
                this.mStatus = 3;
                this.mError = -1111;
                if (this.mBtSocket != null) {
                    try {
                        closeSocket();
                    } catch (IOException unused) {
                        PairLog.e(TAG, "BT Socket closure failed! Exception occured, returning...");
                        this.mError = -1107;
                    }
                }
                stopSocketTimer();
                this.mConnectionEventListener.onConnectionStateChanged(this.mConnectionParam.mAddress, this.mStatus, this.mError);
                sb = new StringBuilder();
            }
            sb.append("BT PairConnection result - status:");
            sb.append(this.mStatus);
            sb.append(" _error:");
            sb.append(this.mError);
            PairLog.i(TAG, sb.toString());
        } catch (Throwable th) {
            stopSocketTimer();
            this.mConnectionEventListener.onConnectionStateChanged(this.mConnectionParam.mAddress, this.mStatus, this.mError);
            PairLog.i(TAG, "BT PairConnection result - status:" + this.mStatus + " _error:" + this.mError);
            throw th;
        }
    }

    public void connectSocket() throws IOException {
        this.mBtSocket.connect();
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void forceClose() {
        if (this.mBtSocket == null) {
            PairLog.e(TAG, "mBtSocket is null");
        } else {
            PairLog.w(TAG, "Force Closing BT socket PairConnection...");
            clearConnection();
        }
    }

    public InputStream getInputStream() throws IOException {
        return this.mBtSocket.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.mBtSocket.getOutputStream();
    }

    public String getRemoteDeviceName() {
        return this.mBtSocket.getRemoteDevice().getName();
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void initializeReader() {
        ThreadManager.getInstance().getExecutor().execute(new ReaderThread());
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public void initializeWriter() {
        startDispatchHandlerThread();
    }

    public boolean isConnected() {
        return this.mBtSocket.isConnected();
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public int openConnection(IConnectionEventListener iConnectionEventListener) {
        this.mStatus = 0;
        this.mError = 0;
        this.mIsReaderActive = false;
        this.mConnectionEventListener = iConnectionEventListener;
        PairLog.i(TAG, "Setting BT Socket for  address is : " + SensitiveLogUtils.toHiddenIfNeed(this.mConnectionParam.mAddress));
        BluetoothSocket bluetoothSocket = BtServerListener.getInstance().getBluetoothSocket();
        this.mBtSocket = bluetoothSocket;
        try {
            if (!bluetoothSocket.isConnected()) {
                PairLog.e(TAG, "Not Connected to BT Socket with  (status: " + this.mStatus + ")");
                this.mStatus = 3;
                return 3;
            }
            this.mInputStream = this.mBtSocket.getInputStream();
            this.mOutputStream = this.mBtSocket.getOutputStream();
            this.mStatus = 1;
            PairLog.v(TAG, "openConnection(): status = " + this.mStatus);
            this.mIsReaderActive = true;
            return this.mStatus;
        } catch (IOException unused) {
            PairLog.e(TAG, "IOException when getting BT IO Stream");
            try {
                closeSocket();
            } catch (IOException unused2) {
                this.mStatus = 3;
                this.mError = -1106;
                PairLog.e(TAG, "IOException when closing BT Socket (status: " + this.mStatus + ")");
            }
            return 0;
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.PairConnection
    public int write(byte[] bArr, FPMessageParam fPMessageParam) {
        Handler handler = this.mWriteHandler;
        if (handler != null && handler.post(new FrameDispatchTask(bArr, fPMessageParam))) {
            return 0;
        }
        PairLog.e(TAG, "BT Message not posted");
        return 1;
    }
}
