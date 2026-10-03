package com.heytap.accessory.pair.connectivity.bt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import com.heytap.accessory.pair.connectivity.interfaces.IServerEventListener;
import com.heytap.accessory.pair.connectivity.interfaces.IServerInterface;
import com.heytap.accessory.pair.connectivity.param.FPParamFactory;
import com.heytap.accessory.pair.connectivity.utils.ThreadManager;
import com.heytap.accessory.pair.logging.PairLog;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public class BtServerListener implements IServerInterface {
    private static final String TAG = "BtServerListener";
    private static final String THREAD_BT_SERVER = "BT_SERVER";
    private static volatile BtServerListener sBtServerListener;
    private AcceptListenerThread mAcceptListenerThread;
    private IServerEventListener mIServerEventListener;
    private static final Object INSTANCE_LOCK = new Object();
    private static UUID sListeningUUID = BtConstants.FP_BT_UUID;
    private BluetoothAdapter mBtAdapter = BluetoothAdapter.getDefaultAdapter();
    private BluetoothSocket mBluetoothSocket = null;

    public class AcceptListenerThread implements Runnable {
        private boolean isActive;
        private BluetoothServerSocket mBTServerSocket;

        public AcceptListenerThread() {
            this.isActive = false;
            this.mBTServerSocket = null;
            try {
                if (BtServerListener.this.mBtAdapter != null) {
                    PairLog.i(BtServerListener.TAG, "start listening on UUID : " + BtServerListener.sListeningUUID);
                    this.mBTServerSocket = BtServerListener.this.mBtAdapter.listenUsingRfcommWithServiceRecord("FP_KSC", BtConstants.FP_BT_UUID);
                    this.isActive = true;
                    PairLog.i(BtServerListener.TAG, "start listening ok");
                }
            } catch (Exception unused) {
                this.isActive = false;
                if (BtServerListener.this.mIServerEventListener != null) {
                    BtServerListener.this.mIServerEventListener.onError(-1113, null);
                }
                PairLog.v(BtServerListener.TAG, "start listening exception");
            }
        }

        private void listenForIncomingConnections() {
            try {
                BluetoothServerSocket bluetoothServerSocket = this.mBTServerSocket;
                if (bluetoothServerSocket != null) {
                    BtServerListener.this.mBluetoothSocket = bluetoothServerSocket.accept();
                    PairLog.i(BtServerListener.TAG, "new connection accepted");
                }
                if (BtServerListener.this.mBluetoothSocket == null) {
                    PairLog.e(BtServerListener.TAG, "mBluetoothSocket == null, accept failed");
                }
                BtServerListener.this.mIServerEventListener.onConnectionAccepted(FPParamFactory.obtain(BtServerListener.this.mBluetoothSocket.getRemoteDevice().getAddress(), 2));
            } catch (IOException unused) {
                this.isActive = false;
                try {
                    if (BtServerListener.this.mIServerEventListener != null) {
                        BtServerListener.this.mIServerEventListener.onError(-1114, null);
                    }
                    BluetoothServerSocket bluetoothServerSocket2 = this.mBTServerSocket;
                    if (bluetoothServerSocket2 != null) {
                        bluetoothServerSocket2.close();
                        this.mBTServerSocket = null;
                    }
                } catch (IOException unused2) {
                    if (BtServerListener.this.mIServerEventListener != null) {
                        BtServerListener.this.mIServerEventListener.onError(-1110, null);
                    }
                } catch (Exception unused3) {
                    PairLog.e(BtServerListener.TAG, "cancel error.");
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.isActive) {
                listenForIncomingConnections();
            }
        }
    }

    private BtServerListener() {
        PairLog.d(TAG, "BtServerListener()");
    }

    public static BtServerListener getInstance() {
        if (sBtServerListener == null) {
            synchronized (INSTANCE_LOCK) {
                if (sBtServerListener == null) {
                    sBtServerListener = new BtServerListener();
                }
            }
        }
        return sBtServerListener;
    }

    private void startListening() {
        if (this.mAcceptListenerThread != null) {
            PairLog.i(TAG, "Already listening on socket");
            return;
        }
        this.mAcceptListenerThread = new AcceptListenerThread();
        PairLog.i(TAG, "Bt StartListening Result:" + ThreadManager.getInstance().post(THREAD_BT_SERVER, this.mAcceptListenerThread, 0L));
    }

    private void stopListening() {
        AcceptListenerThread acceptListenerThread = this.mAcceptListenerThread;
        if (acceptListenerThread != null) {
            try {
                acceptListenerThread.mBTServerSocket.close();
            } catch (Exception e2) {
                PairLog.d(TAG, "Bt ServerSocket close, close exception " + e2.toString());
            }
            ThreadManager.getInstance().quitThread(THREAD_BT_SERVER);
            this.mAcceptListenerThread = null;
        }
    }

    public BluetoothSocket getBluetoothSocket() {
        return this.mBluetoothSocket;
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public void registerCallback(IServerEventListener iServerEventListener) {
        PairLog.d(TAG, "registerCallback listener:" + iServerEventListener.hashCode());
        if (this.mIServerEventListener == null) {
            this.mIServerEventListener = iServerEventListener;
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public boolean start() {
        BluetoothAdapter bluetoothAdapter = this.mBtAdapter;
        if (bluetoothAdapter == null) {
            PairLog.e(TAG, "BT Adapter is null");
            IServerEventListener iServerEventListener = this.mIServerEventListener;
            if (iServerEventListener != null) {
                iServerEventListener.onError(-1107, null);
            }
            return false;
        }
        if (!bluetoothAdapter.isEnabled()) {
            PairLog.i(TAG, "BT Is OFF");
            return false;
        }
        PairLog.i(TAG, "BT Is ON");
        startListening();
        return true;
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public void stop() {
        stopListening();
    }

    @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerInterface
    public void unregisterCallback() {
        PairLog.d(TAG, "unregisterCallback listener");
        this.mIServerEventListener = null;
    }
}
