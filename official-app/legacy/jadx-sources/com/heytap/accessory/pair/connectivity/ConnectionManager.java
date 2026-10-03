package com.heytap.accessory.pair.connectivity;

import android.util.ArrayMap;
import com.heytap.accessory.pair.connectivity.ble.callback.BleServerListener;
import com.heytap.accessory.pair.connectivity.bt.BtServerListener;
import com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener;
import com.heytap.accessory.pair.connectivity.interfaces.IServerInterface;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;
import com.heytap.accessory.pair.connectivity.param.message.FPMessageParam;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.provider.bleserver.utils.ProviderThreadManager;
import com.heytap.accessory.pair.utils.HexUtils;
import com.oplus.aiunit.vision.qe0;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class ConnectionManager {
    private static final Object CONNECTION_LOCK = new Object();
    private static final String TAG = "ConnectionManager";
    private static volatile ConnectionManager sInstance;
    private final IConnectionEventListener mConnectionEventListener = new IConnectionEventListener() { // from class: com.heytap.accessory.pair.connectivity.ConnectionManager.1
        @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
        public void onConnectionStateChanged(String str, int i, int i2) {
            ConnectionManager.this.handleConnectionStateChanged(str, i, i2);
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
        public void onMessageDispatched(String str, byte[] bArr) {
            ConnectionManager.this.handleMessageDispatched(str, bArr);
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
        public void onMessageReceived(String str, byte[] bArr) {
            ConnectionManager.this.handleMessageReceived(str, bArr);
        }
    };
    private final Map<String, ConnectionDetails> mConnectionDetailsMap = new ArrayMap();

    public static class ConnectionDetails {
        PairConnection mConnection;
        IConnectionEventListener mListener;

        private ConnectionDetails(IConnectionEventListener iConnectionEventListener, PairConnection pairConnection) {
            this.mConnection = pairConnection;
            this.mListener = iConnectionEventListener;
        }
    }

    private ConnectionManager() {
    }

    private void close(PairConnection pairConnection) {
        pairConnection.close();
    }

    public static ConnectionManager getInstance() {
        if (sInstance == null) {
            synchronized (ConnectionManager.class) {
                if (sInstance == null) {
                    sInstance = new ConnectionManager();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectionStateChanged(String str, int i, int i2) {
        ConnectionDetails connectionDetails;
        ConnectionDetails connectionDetails2;
        PairLog.i(TAG, "Connection state changed. address:" + SensitiveLogUtils.toHiddenIfNeed(str) + " status:" + i);
        Object obj = CONNECTION_LOCK;
        synchronized (obj) {
            connectionDetails = this.mConnectionDetailsMap.get(str);
        }
        if (connectionDetails == null) {
            PairLog.w(TAG, "No Connection details found!");
            return;
        }
        if (i == 1) {
            connectionDetails.mConnection.initializeWriter();
            connectionDetails.mListener.onConnectionStateChanged(str, i, i2);
            connectionDetails.mConnection.initializeReader();
        } else {
            if (i == 4) {
                connectionDetails.mListener.onConnectionStateChanged(str, i, i2);
                return;
            }
            synchronized (obj) {
                connectionDetails2 = this.mConnectionDetailsMap.get(str);
            }
            if (connectionDetails2 != null) {
                close(connectionDetails2.mConnection);
                connectionDetails2.mListener.onConnectionStateChanged(str, 2, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessageDispatched(String str, byte[] bArr) {
        ConnectionDetails connectionDetails;
        synchronized (CONNECTION_LOCK) {
            connectionDetails = this.mConnectionDetailsMap.get(str);
        }
        if (connectionDetails != null) {
            connectionDetails.mListener.onMessageDispatched(str, bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMessageReceived(String str, byte[] bArr) {
        ConnectionDetails connectionDetails;
        if (qe0.w()) {
            PairLog.e("KSC_MSG", "handleMessageReceived -> " + HexUtils.byteArrayToHexStr(bArr));
        }
        synchronized (CONNECTION_LOCK) {
            connectionDetails = this.mConnectionDetailsMap.get(str);
        }
        if (connectionDetails != null) {
            connectionDetails.mListener.onMessageReceived(str, bArr);
        }
    }

    public void closeConnection(String str) {
        ConnectionDetails connectionDetailsRemove;
        synchronized (CONNECTION_LOCK) {
            connectionDetailsRemove = this.mConnectionDetailsMap.remove(str);
        }
        if (connectionDetailsRemove == null) {
            PairLog.d(TAG, "closeConnection: connection is null");
        } else {
            close(connectionDetailsRemove.mConnection);
        }
    }

    public void connect(FPConParam fPConParam, IConnectionEventListener iConnectionEventListener) {
        final PairConnection connection = PairConnectionFactory.getConnection(fPConParam);
        if (connection == null) {
            PairLog.w(TAG, "connect: connection null");
            return;
        }
        synchronized (CONNECTION_LOCK) {
            this.mConnectionDetailsMap.put(fPConParam.mAddress, new ConnectionDetails(iConnectionEventListener, connection));
        }
        ProviderThreadManager.getInstance().post("daemon", new Runnable() { // from class: com.heytap.accessory.pair.connectivity.ConnectionManager.2
            @Override // java.lang.Runnable
            public void run() {
                connection.connect(ConnectionManager.this.mConnectionEventListener);
            }
        }, 0L);
    }

    public IServerInterface getServerListener(int i) {
        if (i == 1) {
            return BleServerListener.getInstance();
        }
        if (i == 2) {
            return BtServerListener.getInstance();
        }
        return null;
    }

    public void openConnection(FPConParam fPConParam, IConnectionEventListener iConnectionEventListener) {
        PairConnection connection = PairConnectionFactory.getConnection(fPConParam);
        if (connection == null) {
            return;
        }
        if (connection.openConnection(this.mConnectionEventListener) != 1) {
            connection.clearConnection();
            return;
        }
        connection.initializeWriter();
        ConnectionDetails connectionDetails = new ConnectionDetails(iConnectionEventListener, connection);
        synchronized (CONNECTION_LOCK) {
            this.mConnectionDetailsMap.put(fPConParam.mAddress, connectionDetails);
        }
        connection.initializeReader();
    }

    public void sendMessage(byte[] bArr, FPMessageParam fPMessageParam) {
        ConnectionDetails connectionDetails;
        if (qe0.w()) {
            PairLog.i("KSC_MSG", "sendMessage -> " + HexUtils.byteArrayToHexStr(bArr));
        }
        synchronized (CONNECTION_LOCK) {
            connectionDetails = this.mConnectionDetailsMap.get(fPMessageParam.mAddress);
        }
        if (connectionDetails != null) {
            connectionDetails.mConnection.write(bArr, fPMessageParam);
        }
    }
}
