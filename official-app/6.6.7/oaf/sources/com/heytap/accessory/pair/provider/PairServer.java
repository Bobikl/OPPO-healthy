package com.heytap.accessory.pair.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import com.heytap.accessory.pair.connectivity.ConnectionManager;
import com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener;
import com.heytap.accessory.pair.connectivity.interfaces.IServerEventListener;
import com.heytap.accessory.pair.connectivity.interfaces.IServerInterface;
import com.heytap.accessory.pair.connectivity.message.FPMessageUtil;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.provider.bleserver.utils.ProviderThreadManager;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.health.base.bluetooth.OplusBTCloseBroadcastReceiver;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.vgf;
import com.oplus.aiunit.vision.xda;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PairServer {
    private static final int MAX_ALLOW_CONNECTION_NUM = 5;
    private static final int MSG_BT_OFF = 101;
    private static final int MSG_BT_ON = 100;
    private static final String TAG = "PairServer";
    private static volatile PairServer sPairServer;
    private byte[] mLocalDeviceId;
    private ProtocolEventListener mProtocolEventListener;
    private volatile State mState = State.CLOSED;
    private Map<String, ProtocolEventManager> mEventManagerMap = new HashMap(5);
    private BTStateChangeReceiver mBTStateReceiver = null;
    private H mH = new H();
    private final IConnectionEventListener mIConnectionEventListener = new IConnectionEventListener() { // from class: com.heytap.accessory.pair.provider.PairServer.1
        @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
        public void onConnectionStateChanged(String str, int i, int i2) {
            if (i == 2) {
                ProtocolEventManager protocolEventManager = (ProtocolEventManager) PairServer.this.mEventManagerMap.get(str);
                if (protocolEventManager != null) {
                    protocolEventManager.clientDisconnect(str);
                }
                PairServer.this.mEventManagerMap.remove(str);
                ProviderThreadManager.getInstance().quitThread(str);
            }
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
        public void onMessageDispatched(String str, byte[] bArr) {
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener
        public void onMessageReceived(String str, byte[] bArr) {
            ProtocolEventManager protocolEventManager = (ProtocolEventManager) PairServer.this.mEventManagerMap.get(str);
            PairLog.d(PairServer.TAG, "manager==" + protocolEventManager);
            if (protocolEventManager != null) {
                PairLog.d(PairServer.TAG, String.format("onMessageReceived:%s", HexUtils.byteArrayToHexStr(bArr)));
                protocolEventManager.handleMessageReceived(str, FPMessageUtil.FPMessage.parseMessage(FPMessageUtil.decryptProvider(bArr, protocolEventManager)));
            } else {
                PairLog.w(PairServer.TAG, "current device not in the map");
                ConnectionManager.getInstance().closeConnection(str);
            }
        }
    };
    private final IServerEventListener mIServerEventListener = new 2();
    private Adapter mAdapter = new Adapter();

    public class 2 implements IServerEventListener {
        public 2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConnectionAccepted$0(FPConParam fPConParam) {
            if (PairServer.this.mEventManagerMap.size() >= 5) {
                PairLog.w(PairServer.TAG, "current connections exceed 5,this device connection will be rejected!");
                ConnectionManager.getInstance().closeConnection(fPConParam.mAddress);
            } else {
                PairServer.this.mEventManagerMap.put(fPConParam.mAddress, new ProtocolEventManager(fPConParam.mConnectivityType, PairServer.this.mLocalDeviceId, PairServer.this.mProtocolEventListener));
                ConnectionManager.getInstance().openConnection(fPConParam, PairServer.this.mIConnectionEventListener);
            }
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerEventListener
        public void onConnectionAccepted(final FPConParam fPConParam) {
            PairLog.i(PairServer.TAG, "onConnectionAccepted");
            ProviderThreadManager.getInstance().post(fPConParam.mAddress, new Runnable() { // from class: com.heytap.accessory.pair.provider.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onConnectionAccepted$0(fPConParam);
                }
            }, 0L);
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerEventListener
        public void onConnectionRequested() {
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerEventListener
        public void onError(int i, FPConParam fPConParam) {
            PairLog.i(PairServer.TAG, "onConnection error:" + i);
        }

        @Override // com.heytap.accessory.pair.connectivity.interfaces.IServerEventListener
        public void onServicePrepared() {
            PairLog.i(PairServer.TAG, "onServicePrepared");
        }
    }

    public final class Adapter {
        public Adapter() {
        }

        public boolean disable() {
            IServerInterface serverListener = ConnectionManager.getInstance().getServerListener(1);
            if (serverListener != null) {
                serverListener.stop();
                serverListener.unregisterCallback();
            }
            IServerInterface serverListener2 = ConnectionManager.getInstance().getServerListener(2);
            if (serverListener2 != null) {
                serverListener2.stop();
                serverListener2.unregisterCallback();
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0036  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        public boolean enable(IServerEventListener iServerEventListener) {
            boolean z;
            boolean z2;
            IServerInterface serverListener = ConnectionManager.getInstance().getServerListener(1);
            if (serverListener != null) {
                serverListener.registerCallback(iServerEventListener);
                if (serverListener.start()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!z) {
                if (serverListener != null) {
                    serverListener.unregisterCallback();
                }
                return false;
            }
            IServerInterface serverListener2 = ConnectionManager.getInstance().getServerListener(2);
            if (serverListener2 != null) {
                serverListener2.registerCallback(iServerEventListener);
                if (serverListener2.start()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            serverListener.stop();
            if (serverListener2 != null) {
                serverListener2.unregisterCallback();
            }
            serverListener.unregisterCallback();
            return false;
        }
    }

    public final class BTStateChangeReceiver extends OplusBTCloseBroadcastReceiver {
        public BTStateChangeReceiver() {
        }

        public void onRealReceive(Context context, Intent intent) {
            String action = intent.getAction();
            PairLog.i(PairServer.TAG, action);
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                Message message = new Message();
                if (intExtra == 10) {
                    message.what = 101;
                } else if (intExtra == 12) {
                    message.what = 100;
                }
                if (PairServer.this.mH != null) {
                    PairServer.this.mH.sendMessage(message);
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class H extends Handler {
        public H() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 100) {
                PairServer.this.handleBTChange(true);
            } else {
                if (i != 101) {
                    return;
                }
                PairServer.this.handleBTChange(false);
            }
        }
    }

    public enum State {
        CLOSED,
        OPENED_FAIL,
        OPENED_SUCCESS
    }

    private PairServer() {
        registerBTReceiver();
    }

    public static PairServer getInstance() {
        if (sPairServer == null) {
            synchronized (PairServer.class) {
                if (sPairServer == null) {
                    sPairServer = new PairServer();
                }
            }
        }
        return sPairServer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBTChange(boolean z) {
        Adapter adapter;
        Adapter adapter2;
        if (!z) {
            if (!this.mState.equals(State.OPENED_SUCCESS) || (adapter = this.mAdapter) == null) {
                return;
            }
            adapter.disable();
            this.mState = State.OPENED_FAIL;
            return;
        }
        State state = this.mState;
        State state2 = State.OPENED_FAIL;
        if (!state.equals(state2) || (adapter2 = this.mAdapter) == null) {
            return;
        }
        if (adapter2.enable(this.mIServerEventListener)) {
            this.mState = State.OPENED_SUCCESS;
        } else {
            this.mState = state2;
        }
    }

    private void registerBTReceiver() {
        if (this.mBTStateReceiver == null) {
            this.mBTStateReceiver = new BTStateChangeReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        xda.a(intentFilter, "android.bluetooth.adapter.action.STATE_CHANGED");
        vgf.a(e88.a(), this.mBTStateReceiver, intentFilter, 2);
    }

    private void unregisterBTStateReceiver() {
        if (this.mBTStateReceiver != null) {
            e88.a().unregisterReceiver(this.mBTStateReceiver);
        }
    }

    public ProtocolEventManager getProtocolEventManager(String str) {
        return this.mEventManagerMap.get(str);
    }

    public void registerListener(ProtocolEventListener protocolEventListener) {
        this.mProtocolEventListener = protocolEventListener;
    }

    public void release() {
        stopServer();
        unregisterBTStateReceiver();
        sPairServer = null;
    }

    public void setLocalDeviceId(byte[] bArr) {
        this.mLocalDeviceId = bArr;
    }

    public void startServer() {
        State state = this.mState;
        State state2 = State.OPENED_FAIL;
        if (!state.equals(state2)) {
            State state3 = this.mState;
            State state4 = State.OPENED_SUCCESS;
            if (!state3.equals(state4)) {
                Adapter adapter = this.mAdapter;
                if (adapter == null) {
                    PairLog.i("start server adapter null");
                    return;
                } else if (adapter.enable(this.mIServerEventListener)) {
                    this.mState = state4;
                    return;
                } else {
                    this.mState = state2;
                    return;
                }
            }
        }
        PairLog.i("duplicate start server");
    }

    public void stopServer() {
        State state = this.mState;
        State state2 = State.CLOSED;
        if (state.equals(state2)) {
            PairLog.i("already stop server");
            return;
        }
        if (this.mAdapter == null) {
            PairLog.i("start server adapter null");
            return;
        }
        this.mState = state2;
        this.mAdapter.disable();
        for (ProtocolEventManager protocolEventManager : this.mEventManagerMap.values()) {
            if (protocolEventManager.getBluetoothDevice() != null) {
                protocolEventManager.reset();
            }
        }
    }
}
