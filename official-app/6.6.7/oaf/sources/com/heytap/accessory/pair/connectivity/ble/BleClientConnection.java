package com.heytap.accessory.pair.connectivity.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.ArrayMap;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.connectivity.ble.bean.FPBleDeviceInfo;
import com.heytap.accessory.pair.connectivity.ble.callback.GattCallback;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionListener;
import com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener;
import com.heytap.accessory.pair.connectivity.param.connect.FPBleConParam;
import com.heytap.accessory.pair.connectivity.param.message.FPBleMessageParam;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.provider.bleserver.utils.ProviderThreadManager;
import com.oplus.aiunit.vision.e88;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class BleClientConnection implements IBleConnectionInterface, IGattEventListener {
    private static final int ERROR_133_RETRY = 3;
    private static final String TAG = "BleClientConnection";
    private static final UUID[] UUIDS = {CoreConstants.UUID_CHARACTERISTIC_INITIALIZATION, CoreConstants.UUID_CHARACTERISTIC_KEY_BASED_PAIRING, CoreConstants.UUID_CHARACTERISTIC_AUTHENTICATION, CoreConstants.UUID_CHARACTERISTIC_BLUETOOTH_BOND, CoreConstants.UUID_CHARACTERISTIC_P2P_FOR_PC, CoreConstants.UUID_CHARACTERISTIC_WIFI_DIRECT_CONNECTING, CoreConstants.UUID_CHARACTERISTIC_KSC_GENERATING};
    private FPBleDeviceInfo mBleDevice;
    private volatile BluetoothGatt mBluetoothGatt;
    private BluetoothAdapter mBtAdapter;
    private ClientMessageHandler mClientMessageHandler;
    private Context mContext;
    private int mEnableNotifyUUIDIndex;
    private int mErrorCode;
    private FPBleConParam mFpBleConParam;
    private GattCallback mGattCallback;
    private volatile boolean mHasRequestMtu;
    private IBleConnectionListener mListener;
    private Map<UUID, byte[]> mMsgToSendList;
    private int mStatus;
    private String mThreadName;
    private Handler sSocketTimeoutHandler;
    private final SocketTimeoutRunnable mSocketTimeoutRunnable = new SocketTimeoutRunnable();
    private boolean mReDiscovered = false;
    private int mError133Retry = 0;
    private long mCallConnectTime = 0;

    public static final class ClientMessageHandler extends Handler {
        private final WeakReference<BleClientConnection> mClient;

        public ClientMessageHandler(Looper looper, BleClientConnection bleClientConnection) {
            super(looper);
            this.mClient = new WeakReference<>(bleClientConnection);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String name;
            BleClientConnection bleClientConnection = this.mClient.get();
            if (bleClientConnection == null) {
                PairLog.e(BleClientConnection.TAG, "MessageHandler() : reference to AFBleClientDevice is null! returning...");
                return;
            }
            int i = message.what;
            if (i == 1) {
                BluetoothGatt bluetoothGatt = (BluetoothGatt) message.obj;
                if (!bleClientConnection.handleEvtServiceEvt(bluetoothGatt)) {
                    PairLog.e(BleClientConnection.TAG, "EVT_SERVICES_FOUND Failed");
                    bleClientConnection.mErrorCode = -1106;
                    if (bleClientConnection.mListener != null) {
                        bleClientConnection.mListener.onConnectionStateChanged(bleClientConnection.mStatus, bleClientConnection.mErrorCode);
                    }
                }
                bleClientConnection.mBluetoothGatt = bluetoothGatt;
                return;
            }
            if (i == 2) {
                bleClientConnection.mStatus = 1;
                bleClientConnection.stopConnectTimer();
                PairLog.v(BleClientConnection.TAG, "BLE Connection OPEN");
                if (bleClientConnection.mListener != null) {
                    bleClientConnection.mListener.onConnectionStateChanged(bleClientConnection.mStatus, bleClientConnection.mErrorCode);
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    bleClientConnection.mListener.onMessageSent(bleClientConnection.mFpBleConParam.mAddress, (byte[]) message.obj);
                    return;
                }
                if (i == 6) {
                    bleClientConnection.mListener.onMtuChanged(message.arg1);
                    return;
                }
                if (i == 7) {
                    BluetoothGatt bluetoothGatt2 = (BluetoothGatt) message.obj;
                    bleClientConnection.setMtu(bluetoothGatt2, 243);
                    bleClientConnection.mBluetoothGatt = bluetoothGatt2;
                    return;
                } else {
                    PairLog.e(BleClientConnection.TAG, "unknown event received in mClient gatt callback handler" + message);
                    return;
                }
            }
            int i2 = message.arg1;
            int i3 = message.arg2;
            BleClientConnection bleClientConnection2 = this.mClient.get();
            if (bleClientConnection2 != null && bleClientConnection2.mBleDevice != null && bleClientConnection2.mBleDevice.getBLEDevice() != null) {
                String address = bleClientConnection2.mBleDevice.getBLEDevice().getAddress();
                if (bleClientConnection2.checkRetry(i3, i2)) {
                    if (bleClientConnection2.mBluetoothGatt != null) {
                        bleClientConnection2.mBluetoothGatt.close();
                    }
                    PairLog.v(BleClientConnection.TAG, "reconnect code=" + bleClientConnection2.readlConnect(address));
                    return;
                }
            }
            if (i2 != 2) {
                if (i2 == 0) {
                    if (!bleClientConnection.mBtAdapter.isEnabled()) {
                        PairLog.w(BleClientConnection.TAG, "BT is off so device disconnected ");
                    }
                    bleClientConnection.mStatus = 3;
                    bleClientConnection.mListener.onConnectionStateChanged(bleClientConnection.mStatus, bleClientConnection.mErrorCode);
                    return;
                }
                return;
            }
            bleClientConnection.mStatus = 5;
            if (i3 != 0) {
                PairLog.w(BleClientConnection.TAG, "Gatt connection doesnot exist.");
                return;
            }
            BluetoothGatt bluetoothGatt3 = bleClientConnection.mBluetoothGatt;
            if (bluetoothGatt3 != null) {
                BluetoothDevice device = bluetoothGatt3.getDevice();
                name = device != null ? device.getName() : "null device";
            } else {
                name = "null gatt";
            }
            PairLog.v(BleClientConnection.TAG, "BluetoothProfile.STATE_CONNECTED, device = " + name + ", status =" + i3 + " newState=" + i2);
            bleClientConnection.discoverServices();
        }
    }

    public final class SocketTimeoutRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            PairLog.v(BleClientConnection.TAG, "Timer expired - SocketTimeoutEventHandler ");
            try {
                PairLog.v(BleClientConnection.TAG, "gattSocket cleanup");
                if (BleClientConnection.this.mBluetoothGatt != null) {
                    BleClientConnection.this.mBluetoothGatt.disconnect();
                    BleClientConnection.this.mBluetoothGatt.close();
                    BleClientConnection.this.mBluetoothGatt = null;
                    BleClientConnection.this.mBleDevice = null;
                }
                BleClientConnection.this.deregisterListener();
                BleClientConnection.this.mListener.onConnectionStateChanged(0, -1106);
            } catch (Exception e) {
                BleClientConnection.this.mStatus = 3;
                BleClientConnection.this.mErrorCode = 1;
                PairLog.e(BleClientConnection.TAG, "Exception when closing stream: " + e.toString());
            }
        }

        private SocketTimeoutRunnable() {
        }
    }

    public BleClientConnection(FPBleConParam fPBleConParam, IBleConnectionListener iBleConnectionListener) {
        this.mFpBleConParam = fPBleConParam;
        this.mListener = iBleConnectionListener;
        Looper looper = ProviderThreadManager.getInstance().getLooper("daemon");
        if (looper != null) {
            this.sSocketTimeoutHandler = new Handler(looper);
        }
        PairLog.d(TAG, "create BleClientConnection:" + this + ",mSocketTimeoutEventHandler:" + this.sSocketTimeoutHandler);
    }

    private boolean connectGatt(BluetoothDevice bluetoothDevice) {
        PairLog.v(TAG, "start connectGatt:" + SensitiveLogUtils.toHiddenIfNeed(bluetoothDevice.getAddress()));
        try {
            this.mBluetoothGatt = bluetoothDevice.connectGatt(this.mContext, false, this.mGattCallback, 2);
        } catch (Exception e) {
            PairLog.v(TAG, "connectGatt error:" + e.toString());
        }
        if (this.mBluetoothGatt != null) {
            return true;
        }
        PairLog.e(TAG, "connectGatt failed! returning...");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void discoverServices() {
        if (this.mBluetoothGatt != null) {
            this.mBluetoothGatt.discoverServices();
        }
    }

    private boolean enableNotifyIndication(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        boolean z;
        boolean z2;
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        int properties = characteristic.getProperties();
        if ((properties & 16) != 0) {
            PairLog.v(TAG, "Set isNoti true");
            z = true;
        } else {
            z = false;
        }
        if (z || (properties & 32) == 0) {
            z2 = false;
        } else {
            PairLog.v(TAG, "Set isIndicate true");
            z2 = true;
        }
        if (!bluetoothGatt.setCharacteristicNotification(characteristic, true)) {
            PairLog.e(TAG, "setCharacteristicNotification failed");
            return false;
        }
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(CoreConstants.CLIENT_CHARACTERISTIC_CONFIG);
        if (descriptor == null) {
            PairLog.e(TAG, "onDescriptorRead  clientConfig == null");
            return false;
        }
        if (z2) {
            PairLog.v(TAG, "ENABLE_INDICATION_VALUE  ret=" + descriptor.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE));
            if (!bluetoothGatt.writeDescriptor(descriptor)) {
                PairLog.w(TAG, "write desc failed");
            }
            PairLog.v(TAG, "onDescriptorRead  mBTGatt.writeDescriptor ENABLE_INDICATION_VALUE");
        } else {
            if (!z) {
                PairLog.e(TAG, "Indicate or Noti is not set. So just return");
                return false;
            }
            PairLog.v(TAG, "ENABLE_NOTIFICATION_VALUE  ret=" + descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE));
            if (!bluetoothGatt.writeDescriptor(descriptor)) {
                PairLog.w(TAG, " write desc failed");
            }
        }
        PairLog.v(TAG, "enableNotifyIndication Done..");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleEvtServiceEvt(BluetoothGatt bluetoothGatt) {
        if (this.mStatus != 5) {
            PairLog.w(TAG, "Cannot handle event! Connection state is not open. returning...");
            return false;
        }
        FPBleDeviceInfo fPBleDeviceInfo = this.mBleDevice;
        if (fPBleDeviceInfo == null) {
            PairLog.w(TAG, "Cannot handle event! ble device not initialized. returning...");
            return false;
        }
        if (fPBleDeviceInfo.getBLEDevice() == null) {
            PairLog.w(TAG, "Cannot handle event! device is null. returning...");
            return false;
        }
        if (bluetoothGatt == null) {
            PairLog.w(TAG, "Cannot handle event! BluetoothGatt is null. returning...");
            return false;
        }
        if (startEnableNotifyIndication(bluetoothGatt, CoreConstants.UUID_CHARACTERISTIC_INITIALIZATION)) {
            ClientMessageHandler clientMessageHandler = this.mClientMessageHandler;
            if (clientMessageHandler != null) {
                Message messageObtainMessage = clientMessageHandler.obtainMessage();
                messageObtainMessage.what = 2;
                this.mClientMessageHandler.sendMessage(messageObtainMessage);
            }
            return true;
        }
        PairLog.w(TAG, "Cannot get initialization characteristic. returning...");
        if (!this.mReDiscovered) {
            PairLog.w(TAG, "refresh service");
            this.mReDiscovered = true;
            try {
                bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0]);
                PairLog.w(TAG, "refresh discoverServices");
                discoverServices();
                return true;
            } catch (Exception unused) {
                PairLog.w(TAG, "refresh call failed");
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public Integer readlConnect(String str) {
        PairLog.d(TAG, "Received BLE address is " + SensitiveLogUtils.toHiddenIfNeed(str));
        try {
            BluetoothDevice remoteDevice = this.mBtAdapter.getRemoteDevice(str);
            if (remoteDevice == null) {
                PairLog.e(TAG, "Connect device failed! Remote Device not exist, returing...");
                this.mErrorCode = -1125;
                return -1125;
            }
            this.mBleDevice.setBLEDevice(remoteDevice);
            startConnectTimer();
            if (startBleConnect(remoteDevice)) {
                return Integer.valueOf(this.mErrorCode);
            }
            PairLog.e(TAG, "Cannot connect to a null device! returning...");
            this.mErrorCode = -1106;
            stopConnectTimer();
            return Integer.valueOf(this.mErrorCode);
        } catch (IllegalArgumentException e) {
            PairLog.e(TAG, "Connect failed! Exception in gatt connection.." + e.getMessage());
            this.mStatus = 3;
            this.mErrorCode = -1111;
            return null;
        } catch (Throwable th) {
            if (this.mErrorCode == 0) {
                stopConnectTimer();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMtu(BluetoothGatt bluetoothGatt, int i) {
        if (bluetoothGatt != null) {
            PairLog.v(TAG, "requestMtu");
            bluetoothGatt.requestMtu(i + 3);
            this.mHasRequestMtu = true;
        }
    }

    private boolean startBleConnect(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            return connectGatt(bluetoothDevice);
        }
        return false;
    }

    private void startConnectTimer() {
        PairLog.v(TAG, "start connect timeout timer");
        Handler handler = this.sSocketTimeoutHandler;
        if (handler != null) {
            handler.postDelayed(this.mSocketTimeoutRunnable, 10000L);
        }
    }

    private boolean startEnableNotifyIndication(BluetoothGatt bluetoothGatt, UUID uuid) {
        PairLog.d(TAG, "start enable notification: " + uuid);
        BluetoothGattService service = bluetoothGatt.getService(CoreConstants.UUID_SERVICE_FAST_PAIR);
        if (service == null) {
            PairLog.w(TAG, "Cannot handle event! BluetoothGattService is null. returning...");
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid);
        if (characteristic == null) {
            PairLog.w(TAG, "Cannot handle event! BluetoothGattService characteristics is null[" + characteristic + "]. returning...");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SERVICE SERVICE_CHAR_DESC_UUID ");
        UUID uuid2 = CoreConstants.CLIENT_CHARACTERISTIC_CONFIG;
        sb.append(uuid2);
        PairLog.v(TAG, sb.toString());
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(uuid2);
        if (descriptor == null) {
            PairLog.w(TAG, "Cannot handle event! BluetoothGattDescriptor is null. returning...");
            return false;
        }
        boolean zEnableNotifyIndication = enableNotifyIndication(bluetoothGatt, descriptor);
        PairLog.v(TAG, "Set Char=>ReadChar=" + characteristic);
        if (!zEnableNotifyIndication) {
            return true;
        }
        this.mBleDevice.addCharac(uuid, characteristic);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopConnectTimer() {
        PairLog.v(TAG, "stop connect timeout timer");
        Handler handler = this.sSocketTimeoutHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mSocketTimeoutRunnable);
        }
    }

    public boolean checkRetry(int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.mCallConnectTime;
        boolean z = false;
        boolean z2 = i == 0 && (i2 == 133 || i2 == 62);
        if (z2) {
            this.mError133Retry++;
        }
        if (z2 && this.mError133Retry <= 3 && jCurrentTimeMillis < 30000) {
            z = true;
        }
        PairLog.i(TAG, "checkRetry: status=" + i + " newState=" + i2 + " errorCount=" + this.mError133Retry + " delay=" + jCurrentTimeMillis + " needRetry=" + z);
        return z;
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public void close() {
        if (this.mStatus == 2) {
            PairLog.v(TAG, "Already Connection closed return");
            return;
        }
        if (this.mBluetoothGatt != null) {
            PairLog.i(TAG, "close gattSocket cleanup");
            this.mBluetoothGatt.disconnect();
            this.mBluetoothGatt.close();
            this.mBluetoothGatt = null;
            this.mBleDevice = null;
        }
        deregisterListener();
        ClientMessageHandler clientMessageHandler = this.mClientMessageHandler;
        if (clientMessageHandler != null) {
            clientMessageHandler.removeCallbacksAndMessages(null);
            ProviderThreadManager.getInstance().quitThread(this.mThreadName);
            this.mClientMessageHandler = null;
        }
        Handler handler = this.sSocketTimeoutHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.mStatus = 2;
        this.mErrorCode = 0;
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public int connect() {
        PairLog.d(TAG, "Ble client start connect");
        this.mStatus = 0;
        this.mErrorCode = 0;
        this.mEnableNotifyUUIDIndex = 0;
        this.mMsgToSendList = new ArrayMap();
        this.mBleDevice = new FPBleDeviceInfo();
        this.mContext = e88.a();
        GattCallback gattCallback = new GattCallback();
        this.mGattCallback = gattCallback;
        gattCallback.registerListener(this);
        this.mThreadName = ProviderThreadManager.getInstance().getThreadNameForConnection(1, "C", "MESSAGE_HANDLER", 0);
        Looper looper = ProviderThreadManager.getInstance().getLooper(this.mThreadName);
        if (looper != null) {
            this.mClientMessageHandler = new ClientMessageHandler(looper, this);
        } else {
            PairLog.e(TAG, "connect: ClientMessageHandler == null ");
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.mBtAdapter = defaultAdapter;
        if (defaultAdapter == null) {
            PairLog.e(TAG, "Connect device failed! BTAdapter is null, returing...");
            this.mErrorCode = -1107;
            return -1107;
        }
        String str = this.mFpBleConParam.mAddress;
        this.mCallConnectTime = System.currentTimeMillis();
        Integer num = readlConnect(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public synchronized void deregisterListener() {
        if (this.mGattCallback != null) {
            PairLog.i(TAG, "Deregister the Gatt Callback");
            this.mGattCallback.deregisterListener();
            this.mGattCallback = null;
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public String getRemoteDeviceName() {
        FPBleDeviceInfo fPBleDeviceInfo = this.mBleDevice;
        if (fPBleDeviceInfo == null || fPBleDeviceInfo.getBLEDevice() == null) {
            return null;
        }
        return this.mBleDevice.getBLEDevice().getName();
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public boolean isConnectionProper() {
        if (this.mBluetoothGatt == null) {
            PairLog.e(TAG, "Device is disconnected");
            return false;
        }
        if (1 == this.mStatus) {
            return true;
        }
        PairLog.e(TAG, "Invalid connection state");
        return false;
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onCharacteristicChanged(byte[] bArr) {
        if (this.mListener != null) {
            PairLog.v(TAG, "Client: read length = " + bArr.length);
            this.mListener.onMessageReceived(bArr);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        PairLog.d(TAG, "onCharacteristicWrite: " + bluetoothGattCharacteristic.getUuid());
        ClientMessageHandler clientMessageHandler = this.mClientMessageHandler;
        if (clientMessageHandler != null) {
            Message messageObtainMessage = clientMessageHandler.obtainMessage();
            messageObtainMessage.what = 4;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.obj = this.mMsgToSendList.remove(bluetoothGattCharacteristic.getUuid());
            this.mClientMessageHandler.sendMessage(messageObtainMessage);
            PairLog.d(TAG, "remove message from queue: " + bluetoothGattCharacteristic.getUuid());
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onConnectionStateChanged(int i, int i2) {
        stopConnectTimer();
        ClientMessageHandler clientMessageHandler = this.mClientMessageHandler;
        if (clientMessageHandler == null) {
            PairLog.e(TAG, "onConnectionStateChanged: ClientMessageHandler == null ");
            this.mStatus = 0;
            this.mListener.onConnectionStateChanged(0, this.mErrorCode);
        } else {
            Message messageObtainMessage = clientMessageHandler.obtainMessage();
            messageObtainMessage.what = 3;
            messageObtainMessage.arg1 = i;
            messageObtainMessage.arg2 = i2;
            this.mClientMessageHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onDescriptorRead(BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        UUID uuid = characteristic.getUuid();
        PairLog.d(TAG, "onDescriptorWrite: " + uuid);
        if (this.mBleDevice.getCharac(uuid) == null) {
            this.mBleDevice.addCharac(uuid, characteristic);
        }
        byte[] bArr = this.mMsgToSendList.get(uuid);
        if (bArr != null) {
            characteristic.setValue(bArr);
            characteristic.setWriteType(1);
            if (this.mBluetoothGatt != null) {
                this.mBluetoothGatt.writeCharacteristic(characteristic);
            }
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        ClientMessageHandler clientMessageHandler;
        PairLog.d(TAG, "onMtuChanged: mtu = " + i + " status = " + i2 + " mHasRequestMtu = " + this.mHasRequestMtu);
        if (this.mHasRequestMtu) {
            if (i2 == 0 && (clientMessageHandler = this.mClientMessageHandler) != null) {
                Message messageObtainMessage = clientMessageHandler.obtainMessage();
                messageObtainMessage.what = 6;
                messageObtainMessage.arg1 = i - 3;
                this.mClientMessageHandler.sendMessage(messageObtainMessage);
            }
            ClientMessageHandler clientMessageHandler2 = this.mClientMessageHandler;
            if (clientMessageHandler2 != null) {
                Message messageObtainMessage2 = clientMessageHandler2.obtainMessage();
                messageObtainMessage2.obj = bluetoothGatt;
                messageObtainMessage2.what = 1;
                this.mClientMessageHandler.sendMessage(messageObtainMessage2);
            }
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IGattEventListener
    public void onServicesDiscovered(BluetoothGatt bluetoothGatt) {
        ClientMessageHandler clientMessageHandler = this.mClientMessageHandler;
        if (clientMessageHandler != null) {
            Message messageObtainMessage = clientMessageHandler.obtainMessage();
            messageObtainMessage.what = 7;
            messageObtainMessage.obj = bluetoothGatt;
            this.mClientMessageHandler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.heytap.accessory.pair.connectivity.ble.interfaces.IBleConnectionInterface
    public boolean write(byte[] bArr, FPBleMessageParam fPBleMessageParam) {
        if (this.mBleDevice == null) {
            return false;
        }
        PairLog.v(TAG, "Client: write length = " + bArr.length);
        BluetoothGattCharacteristic charac = this.mBleDevice.getCharac(fPBleMessageParam.mCharacter);
        if (charac == null) {
            PairLog.v(TAG, "charac not enable notification ,start notify..." + fPBleMessageParam.mCharacter);
            if (!startEnableNotifyIndication(this.mBluetoothGatt, fPBleMessageParam.mCharacter)) {
                return false;
            }
            PairLog.v(TAG, "Client: add message to queue = " + fPBleMessageParam.mCharacter);
            this.mMsgToSendList.put(fPBleMessageParam.mCharacter, bArr);
        } else {
            PairLog.v(TAG, "charac already enable notification ,start write..." + fPBleMessageParam.mCharacter);
            charac.setValue(bArr);
            charac.setWriteType(2);
            if (this.mBluetoothGatt != null) {
                PairLog.v(TAG, "Client: add message to queue = " + fPBleMessageParam.mCharacter);
                this.mMsgToSendList.put(fPBleMessageParam.mCharacter, bArr);
                return this.mBluetoothGatt.writeCharacteristic(charac);
            }
        }
        return false;
    }
}
