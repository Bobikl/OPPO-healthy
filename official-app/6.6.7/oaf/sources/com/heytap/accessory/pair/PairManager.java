package com.heytap.accessory.pair;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.provider.EventID;
import com.heytap.accessory.pair.provider.PairServer;
import com.heytap.accessory.pair.provider.ProtocolEventListener;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.heytap.accessory.pair.seeker.IDeviceEvent;
import com.heytap.accessory.pair.seeker.device.BaseDevice;
import com.heytap.accessory.pair.seeker.device.DeviceFactory;
import com.heytap.accessory.pair.seeker.pairing.workers.AbsWorker;
import com.heytap.accessory.security.deviceId.DeviceIdFactory;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.veb;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PairManager implements IDeviceEvent, IPairManager {
    private static final String TAG = "PairManager";
    private static final int TEST_TIMEOUT = 60;
    private static volatile PairManager sManager;
    private IPairManager.IPairEventListener mPairEventListener;
    private PairServer mPairServer;
    private ProtocolEventListener mEventListener = new ProtocolEventListener() { // from class: com.heytap.accessory.pair.PairManager.1
        @Override // com.heytap.accessory.pair.provider.ProtocolEventListener
        public void onNotifyEvent(int i, ProtocolEventManager.Device device, ProtocolEventManager.Event event) {
        }

        @Override // com.heytap.accessory.pair.provider.ProtocolEventListener
        public void onReceived(ProtocolEventManager.Device device, ProtocolEventManager.Event event) {
            ProtocolEventManager protocolEventManager = PairServer.getInstance().getProtocolEventManager(device.getBluetoothDevice().getAddress());
            if (protocolEventManager == null) {
                PairLog.e(PairManager.TAG, "protocolEventManager is null!");
                return;
            }
            PairLog.i(PairManager.TAG, "onReceived:" + event.id());
            int iId = event.id();
            EventID eventID = EventID.CHOOSE_KEY_TYPE;
            if (iId == eventID.ordinal()) {
                Bundle bundle = new Bundle();
                bundle.putInt(ProtocolEventManager.Event.KEY_TYPE, 2);
                bundle.putInt(ProtocolEventManager.Event.CONFIRM_NAX_TIME, 60);
                protocolEventManager.send(device, new ProtocolEventManager.Event(eventID.ordinal(), bundle));
                return;
            }
            int iId2 = event.id();
            EventID eventID2 = EventID.SEEKER_REQUEST_CONNECT;
            if (iId2 == eventID2.ordinal()) {
                PairLog.d(PairManager.TAG, "SEEKER_REQUEST_CONNECT, deviceId:" + SensitiveLogUtils.toHiddenIfNeed(device.getRemoteDeviceId()));
                Bundle bundle2 = new Bundle();
                bundle2.putInt(ProtocolEventManager.Event.CONNECT_TYPE, 16384);
                bundle2.putByte(ProtocolEventManager.Event.CONNECT_RESULT, (byte) 1);
                protocolEventManager.send(device, new ProtocolEventManager.Event(eventID2.ordinal(), bundle2));
                return;
            }
            int iId3 = event.id();
            EventID eventID3 = EventID.SEEKER_SEND_AUTH_DATA;
            if (iId3 != eventID3.ordinal()) {
                if (event.id() == EventID.SEEKER_CONNECTED.ordinal()) {
                    PairLog.i(PairManager.TAG, "pair success!");
                    return;
                } else {
                    if (event.id() == EventID.SEEKER_CONNECT_FAILED.ordinal()) {
                        PairLog.e(PairManager.TAG, "pair failed | errorcode:" + event.bundle().getInt("error_code"));
                        return;
                    }
                    return;
                }
            }
            byte[] byteArray = event.bundle().getByteArray(ProtocolEventManager.Event.AUTH_DATA);
            if (Arrays.equals("1234".getBytes(), byteArray)) {
                Bundle bundle3 = new Bundle();
                bundle3.putInt(ProtocolEventManager.Event.AUTH_CODE, 1);
                bundle3.putInt("error_code", 0);
                protocolEventManager.send(device, new ProtocolEventManager.Event(eventID3.ordinal(), bundle3));
                return;
            }
            if (byteArray == null) {
                byteArray = new byte[0];
            }
            PairLog.e(PairManager.TAG, "AUTH DATA ERROR :" + new String(byteArray));
            Bundle bundle4 = new Bundle();
            bundle4.putInt(ProtocolEventManager.Event.AUTH_CODE, 0);
            bundle4.putInt("error_code", 2);
            protocolEventManager.send(device, new ProtocolEventManager.Event(eventID3.ordinal(), bundle4));
        }

        @Override // com.heytap.accessory.pair.provider.ProtocolEventListener
        public void onSentResult(ProtocolEventManager.Device device, ProtocolEventManager.Event event) {
            int i = event.bundle().getInt("error_code");
            if (event.id() == EventID.SEEKER_REQUEST_CONNECT.ordinal()) {
                if (i != 0) {
                    PairLog.e(PairManager.TAG, "send SEEKER_REQUEST_CONNECT result error");
                }
            } else {
                if (event.id() != EventID.SEEKER_SEND_AUTH_DATA.ordinal() || i == 0) {
                    return;
                }
                PairLog.e(PairManager.TAG, "send SEEKER_SEND_AUTH_DATA result error");
            }
        }
    };
    private BluetoothAdapter mAdapter = BluetoothAdapter.getDefaultAdapter();
    private final Set<BaseDevice> mPairingDeviceSet = new HashSet();

    private PairManager() {
    }

    private boolean addPairingDevice(BaseDevice baseDevice) {
        boolean z;
        IPairManager.IPairEventListener iPairEventListener;
        synchronized (this.mPairingDeviceSet) {
            PairLog.i(TAG, "addPairingDevice, device: " + baseDevice);
            if (this.mPairingDeviceSet.contains(baseDevice)) {
                PairLog.e(TAG, "addPairingDevice failed, the same device is pairing, device: " + baseDevice);
            } else if (this.mPairingDeviceSet.isEmpty()) {
                this.mPairingDeviceSet.add(baseDevice);
                z = true;
            } else {
                PairLog.e(TAG, "addPairingDevice failed, one device already is pairing, device: " + ((BaseDevice) this.mPairingDeviceSet.toArray()[0]));
            }
            z = false;
        }
        if (z && (iPairEventListener = this.mPairEventListener) != null) {
            iPairEventListener.onEvent(2, baseDevice, 0);
        }
        return z;
    }

    private void createBond(BaseDevice baseDevice, IDeviceEvent iDeviceEvent) {
        PairLog.i(TAG, "startRunning, deviceEvent: " + iDeviceEvent + ", device: " + baseDevice);
        if (baseDevice == null) {
            return;
        }
        baseDevice.setDeviceEvent(iDeviceEvent);
        baseDevice.startRunning();
    }

    private BaseDevice getDeviceByTag(String str) {
        HashSet<BaseDevice> hashSet;
        synchronized (this.mPairingDeviceSet) {
            hashSet = new HashSet(this.mPairingDeviceSet);
        }
        PairLog.d(TAG, "mPairingDeviceSet size:" + hashSet.size() + ",tag:" + str);
        BaseDevice baseDevice = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (BaseDevice baseDevice2 : hashSet) {
            PairLog.d(TAG, "baseDevice.getTag():" + baseDevice2.getTag());
            if (baseDevice2.getTag().equals(str)) {
                baseDevice = baseDevice2;
            }
        }
        return baseDevice;
    }

    public static PairManager getInstance() {
        if (sManager == null) {
            synchronized (PairManager.class) {
                if (sManager == null) {
                    sManager = new PairManager();
                }
            }
        }
        return sManager;
    }

    private void removeBond(BaseDevice baseDevice) {
        PairLog.i(TAG, "cancelBond, deviceEvent:");
        if (baseDevice == null) {
            return;
        }
        baseDevice.cancel(2018);
    }

    private BaseDevice removePairingDevice(String str) {
        synchronized (this.mPairingDeviceSet) {
            PairLog.i(TAG, "removePairingDevice, device: " + veb.a(str));
            Iterator<BaseDevice> it = this.mPairingDeviceSet.iterator();
            while (it.hasNext()) {
                BaseDevice next = it.next();
                if (TextUtils.equals(next.getMac(), str)) {
                    it.remove();
                    return next;
                }
            }
            return null;
        }
    }

    @Override // com.heytap.accessory.pair.IPairManager
    public boolean cancelBond(String str) {
        PairLog.funcIn();
        BaseDevice baseDeviceRemovePairingDevice = removePairingDevice(str);
        if (baseDeviceRemovePairingDevice != null) {
            removeBond(baseDeviceRemovePairingDevice);
            return true;
        }
        PairLog.i(TAG, "cancelBond this device not bond:");
        PairLog.funcOut();
        return false;
    }

    @Override // com.heytap.accessory.pair.IPairManager
    public void closeServer() {
        PairServer pairServer = this.mPairServer;
        if (pairServer == null) {
            PairLog.e(TAG, "not open");
        } else {
            pairServer.stopServer();
        }
    }

    @Override // com.heytap.accessory.pair.IPairManager
    public void openServer() {
        if (this.mPairServer == null) {
            this.mPairServer = PairServer.getInstance();
        }
        this.mPairServer.registerListener(this.mEventListener);
        this.mPairServer.setLocalDeviceId(DeviceIdFactory.getIDeviceIdFetcher().loadDeviceId(e88.a()));
        this.mPairServer.startServer();
    }

    @Override // com.heytap.accessory.pair.IPairManager
    public void registerEventListener(IPairManager.IPairEventListener iPairEventListener) {
        this.mPairEventListener = iPairEventListener;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x009b  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0076, please report this as an issue */
    @Override // com.heytap.accessory.pair.seeker.IDeviceEvent
    public int send(int i, @Nullable Bundle bundle) {
        int i2;
        IPairManager.IPairEventListener iPairEventListener;
        if (bundle == null) {
            PairLog.e(TAG, "send failed, baseViewData is null, state: " + i);
            return 0;
        }
        BaseDevice deviceByTag = getDeviceByTag(bundle.getString(IDeviceEvent.FLAG_MAC));
        if (deviceByTag == null) {
            PairLog.e(TAG, "send failed, BaseDevice is null, state: " + i);
            return 0;
        }
        PairLog.i(TAG, "send state: " + i + ", device: " + deviceByTag);
        if (i == -1) {
            i2 = bundle.getInt(AbsWorker.CANCEL_CODE, 0);
            PairLog.i(TAG, "trace-onSend(sdk), DEVICE_PAIR_CONNECTED_FAILED " + i2);
            removePairingDevice(deviceByTag.getMac());
            iPairEventListener = this.mPairEventListener;
            if (iPairEventListener != null) {
                iPairEventListener.onEvent(1, deviceByTag, i2);
            }
        } else if (i == 2) {
            PairLog.i(TAG, "trace-onSend(sdk), DEVICE_PAIR_CONNECTED_SUCCESS");
            removePairingDevice(deviceByTag.getMac());
            IPairManager.IPairEventListener iPairEventListener2 = this.mPairEventListener;
            if (iPairEventListener2 != null) {
                iPairEventListener2.onEvent(0, deviceByTag, 0);
            }
        } else if (i == 3) {
            i2 = bundle.getInt(AbsWorker.CANCEL_CODE, 0);
            PairLog.i(TAG, "trace-onSend(sdk), DEVICE_PAIR_CONNECTED_FAILED " + i2);
            removePairingDevice(deviceByTag.getMac());
            iPairEventListener = this.mPairEventListener;
            if (iPairEventListener != null) {
                iPairEventListener.onEvent(1, deviceByTag, i2);
            }
        }
        return 1;
    }

    @Override // com.heytap.accessory.pair.IPairManager
    public void startBond(String str, int i) {
        PairLog.funcIn();
        BaseDevice baseDeviceCreateDevice = DeviceFactory.createDevice(this.mAdapter.getRemoteDevice(str), i);
        if (addPairingDevice(baseDeviceCreateDevice)) {
            createBond(baseDeviceCreateDevice, this);
        } else {
            PairLog.e(TAG, "startBond failed");
        }
        PairLog.funcOut();
    }

    @Override // com.heytap.accessory.pair.IPairManager
    public void unregisterEventListener() {
        this.mPairEventListener = null;
    }
}
