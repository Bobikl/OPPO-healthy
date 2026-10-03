package com.lifesense.android.bluetooth.core;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.NetstrapPacket;
import com.lifesense.android.bluetooth.core.bean.PairedConfirmInfo;
import com.lifesense.android.bluetooth.core.bean.constant.BluetoothStatus;
import com.lifesense.android.bluetooth.core.bean.constant.BroadcastType;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConfigInfoType;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceRegisterState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceUpgradeStatus;
import com.lifesense.android.bluetooth.core.bean.constant.ErrorCode;
import com.lifesense.android.bluetooth.core.bean.constant.GattServiceType;
import com.lifesense.android.bluetooth.core.bean.constant.ManagerStatus;
import com.lifesense.android.bluetooth.core.bean.constant.OperationCommand;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.bean.constant.SdkPermission;
import com.lifesense.android.bluetooth.core.business.d;
import com.lifesense.android.bluetooth.core.business.j;
import com.lifesense.android.bluetooth.core.business.ota.c;
import com.lifesense.android.bluetooth.core.business.sync.DeviceSyncCentre;
import com.lifesense.android.bluetooth.core.enums.ProtocolType;
import com.lifesense.android.bluetooth.core.enums.WifiState;
import com.lifesense.android.bluetooth.core.protocol.e;
import com.lifesense.android.bluetooth.core.protocol.worker.BaseDeviceWorker;
import com.lifesense.android.bluetooth.core.tools.g;
import com.oplus.aiunit.vision.b78;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale", "NewApi"})
public final class LsBleManager extends com.lifesense.android.bluetooth.core.b {
    public static int currentBluetoothState;
    public static Context mAppContext;
    public static LsBleManager mLsBleManager;
    public boolean isRegisterBleStateReceiver;
    public com.lifesense.android.bluetooth.core.system.broadcast.b mBleStateBroadcastReceiver;
    public ManagerStatus managerStatus;
    public j mCentreWorkingStateListener = new a();
    public com.lifesense.android.bluetooth.core.system.broadcast.a mBleBroadcastListener = new b();

    public class a implements j {
        public a() {
        }

        @Override // com.lifesense.android.bluetooth.core.business.j
        public void a(d dVar, ManagerStatus managerStatus) {
            if (dVar == null) {
                return;
            }
            if (dVar instanceof com.lifesense.android.bluetooth.core.business.pair.a) {
                LsBleManager.this.setManagerStatus(managerStatus, "on status change from pair centre");
                com.lifesense.android.bluetooth.core.business.scan.a.getInstance().c();
            } else if (dVar instanceof c) {
                LsBleManager.this.setManagerStatus(managerStatus, "on status change from upgrade centre");
            }
        }
    }

    public class b implements com.lifesense.android.bluetooth.core.system.broadcast.a {
        public b() {
        }

        @Override // com.lifesense.android.bluetooth.core.system.broadcast.a
        public void a(int i) {
            LsBleManager.this.analyseBluetoothStatus(i);
        }

        @Override // com.lifesense.android.bluetooth.core.system.broadcast.a
        public void a(BluetoothDevice bluetoothDevice, DeviceConnectState deviceConnectState) {
            com.lifesense.android.bluetooth.core.business.push.c.getInstance().a(bluetoothDevice, deviceConnectState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void analyseBluetoothStatus(int i) {
        com.lifesense.android.bluetooth.core.system.b bVar;
        BluetoothStatus bluetoothStatus;
        if ((10 == i || 13 == i) && getLsBleManagerStatus() == ManagerStatus.DEVICE_PAIR) {
            setManagerStatus(ManagerStatus.FREE, "on bluetooth status change:" + i);
            com.lifesense.android.bluetooth.core.business.pair.a.getInstance().a();
        }
        if (getLsBleManagerStatus() == ManagerStatus.DATA_RECEIVE && i != 11) {
            Log.i("BLUETOOTH", "stopDataSyscService");
            DeviceSyncCentre.getInstance().stopDataSyncService();
        }
        if (i != 10) {
            if (i == 13) {
                currentBluetoothState = i;
                handleBluetoothStateOffBroadcast(i);
                return;
            } else {
                if (i != 12 || currentBluetoothState == 12) {
                    return;
                }
                com.lifesense.android.bluetooth.core.system.b.getInstance().b(false);
                handleBluetoothStateOnBroadcast(i);
                return;
            }
        }
        int i2 = currentBluetoothState;
        if (i2 == 10) {
            return;
        }
        if (i2 != 13 && !com.lifesense.android.bluetooth.core.system.b.getInstance().g()) {
            currentBluetoothState = i;
        }
        currentBluetoothState = i;
        if (com.lifesense.android.bluetooth.core.system.b.getInstance().j()) {
            bVar = com.lifesense.android.bluetooth.core.system.b.getInstance();
            bluetoothStatus = BluetoothStatus.BLUETOOTH_STATE_OFF_WITH_CODE;
        } else {
            bVar = com.lifesense.android.bluetooth.core.system.b.getInstance();
            bluetoothStatus = BluetoothStatus.BLUETOOTH_STATE_OFF;
        }
        bVar.a(bluetoothStatus);
    }

    public static Context getAppContext() {
        return mAppContext;
    }

    public static synchronized LsBleManager getInstance() {
        LsBleManager lsBleManager = mLsBleManager;
        if (lsBleManager != null) {
            return lsBleManager;
        }
        LsBleManager lsBleManager2 = new LsBleManager();
        mLsBleManager = lsBleManager2;
        return lsBleManager2;
    }

    private void handleBluetoothStateOffBroadcast(int i) {
        if (getLsBleManagerStatus() == ManagerStatus.DATA_RECEIVE) {
            com.lifesense.android.bluetooth.core.business.log.d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Close_Bluetooth, true, "Done", null);
        }
    }

    private void handleBluetoothStateOnBroadcast(int i) {
        com.lifesense.android.bluetooth.core.system.b bVar;
        BluetoothStatus bluetoothStatus;
        if (com.lifesense.android.bluetooth.core.system.b.getInstance().k()) {
            bVar = com.lifesense.android.bluetooth.core.system.b.getInstance();
            bluetoothStatus = BluetoothStatus.BLUETOOTH_STATE_ON_WITH_CODE;
        } else {
            bVar = com.lifesense.android.bluetooth.core.system.b.getInstance();
            bluetoothStatus = BluetoothStatus.BLUETOOTH_STATE_ON;
        }
        bVar.a(bluetoothStatus);
        com.lifesense.android.bluetooth.core.business.log.d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Enable_Bluetooth, true, "Done", null);
        int i2 = currentBluetoothState;
        if (i2 == 10 || i2 == 13 || i2 == 255) {
            currentBluetoothState = i;
            ManagerStatus devicesCentreStatus = DeviceSyncCentre.getInstance().getDevicesCentreStatus();
            ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
            if (lsBleManagerStatus == ManagerStatus.DATA_RECEIVE) {
                Log.i("BLUETOOTH", "restart data sync service");
                DeviceSyncCentre.getInstance().restartDataSyncService();
            } else {
                printLogMessage(getAdvancedLogInfo(null, "no permission to restart data sync service,syncStatus=" + devicesCentreStatus + "; workingStatus=" + lsBleManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Restart_Service, null, false));
            }
        }
        currentBluetoothState = i;
    }

    private void initSdkDebugPermission() {
        try {
            Object objA = g.a(new File(b78.a().getExternalCacheDir().getPath() + File.separator + "AndroidPermission.ser"));
            if (objA != null && (objA instanceof SdkPermission) && ((SdkPermission) objA).isEnablePrintln()) {
                enableWriteDebugMessageToFiles(true, LsBleInterface.PERMISSION_WRITE_LOG_FILE);
                setDebugMode("LifesenseBluetooth");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setManagerStatus(ManagerStatus managerStatus, String str) {
        if (managerStatus != null && str != null) {
            if (str.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("set manager status: ");
                sb.append(managerStatus.toString());
                sb.append(", current working mode is :");
                sb.append(str);
            }
        }
        this.managerStatus = managerStatus;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean addMeasureDevice(LsDeviceInfo lsDeviceInfo) {
        if (this.initFlag) {
            return DeviceSyncCentre.getInstance().addDevice(lsDeviceInfo);
        }
        printLogMessage(getPrintLogInfo("failed to add measure device,uninitialize..", 1));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean cancelDevicePairing(LsDeviceInfo lsDeviceInfo) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar;
        String str;
        String str2;
        com.lifesense.android.bluetooth.core.business.log.b generalLogInfo;
        if (this.initFlag) {
            ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
            if (lsBleManagerStatus != ManagerStatus.DEVICE_PAIR) {
                str2 = "failed to cancel device's pairing,status=" + lsBleManagerStatus;
                aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message;
                str = null;
            } else {
                if (lsDeviceInfo != null && !TextUtils.isEmpty(lsDeviceInfo.getMacAddress())) {
                    printLogMessage(getGeneralLogInfo(lsDeviceInfo.getMacAddress(), "cancel pairing now,device[" + lsDeviceInfo.getMacAddress() + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
                    setManagerStatus(ManagerStatus.FREE, "cancel pairing with device");
                    com.lifesense.android.bluetooth.core.business.pair.a.getInstance().d(lsDeviceInfo.getMacAddress());
                    return true;
                }
                aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message;
                str = null;
                str2 = "failed to cancel device's pairing,no device...";
            }
            generalLogInfo = getGeneralLogInfo(str, str2, aVar, null, true);
        } else {
            generalLogInfo = getPrintLogInfo("failed to cancel device's pairing,uninitialized...", 1);
        }
        printLogMessage(generalLogInfo);
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean checkBluetoothScanFunction() {
        if (this.initFlag) {
            return com.lifesense.android.bluetooth.core.business.scan.a.getInstance().b();
        }
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public DeviceConnectState checkDeviceConnectState(String str) {
        return (!this.initFlag || str == null || str.length() == 0) ? DeviceConnectState.UNKNOWN : DeviceSyncCentre.getInstance().checkConnectState(str);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void connectDeviceWithAddress(LsDeviceInfo lsDeviceInfo, ReceiveDataCallback receiveDataCallback) {
        if (!this.initFlag || lsDeviceInfo == null || receiveDataCallback == null) {
            return;
        }
        DeviceSyncCentre.getInstance().connectDevice(lsDeviceInfo, receiveDataCallback);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean deleteMeasureDevice(String str) {
        if (this.initFlag) {
            return DeviceSyncCentre.getInstance().deleteDevice(str);
        }
        printLogMessage(getPrintLogInfo("failed to delete measure device,uninitialize..", 1));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public synchronized void destroyAllResources() {
        if (this.initFlag && mAppContext != null) {
            try {
                printLogMessage(getGeneralLogInfo(null, "destory all resources...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                stopDataReceiveService();
                setMeasureDevice(null);
                unregisterBluetoothBroadcastReceiver();
                com.lifesense.android.bluetooth.core.business.scan.a.getInstance().d();
                com.lifesense.android.bluetooth.core.business.detect.a.getInstance().destoryInstance();
                com.lifesense.android.bluetooth.core.business.pair.a.getInstance().b();
                DeviceSyncCentre.getInstance().destoryInstance();
                com.lifesense.android.bluetooth.core.business.log.d.d().b();
                com.lifesense.android.bluetooth.core.system.b.getInstance().destoryInstance();
                this.initFlag = false;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void disableDeviceDataSync(List<String> list) {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to disable device's data syncing,uninitialize..", 1));
            return;
        }
        if (list == null || list.size() == 0) {
            printLogMessage(getPrintLogInfo("failed to disable device's data syncing,no devices..", 1));
            return;
        }
        printLogMessage(getGeneralLogInfo(null, "disable device's data syncing " + list.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        DeviceSyncCentre.getInstance().updateDeviceConnectionMode(list, GattServiceType.CALL_SERVICE);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void enableDeviceDataSync(List<String> list) {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to enable device's data syncing,uninitialize..", 1));
            return;
        }
        printLogMessage(getGeneralLogInfo(null, "enable device's data syncing " + list.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        DeviceSyncCentre.getInstance().updateDeviceConnectionMode(list, GattServiceType.ALL);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void enableWriteDebugMessageToFiles(boolean z, String str) {
        com.lifesense.android.bluetooth.core.business.log.d.d().a(false);
        if (str == null || str.length() <= 0 || !z || !LsBleInterface.PERMISSION_WRITE_LOG_FILE.equals(str)) {
            return;
        }
        com.lifesense.android.bluetooth.core.business.log.d.d().a(true);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void getDeviceConfigInfo(String str, DeviceConfigInfoType deviceConfigInfoType, OnConfigInfoListener onConfigInfoListener) {
        if (onConfigInfoListener == null) {
            printLogMessage(getPrintLogInfo("failed to get device's config info,no callback...", 1));
            return;
        }
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(str, "failed to get device's config info,uninitialize...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            onConfigInfoListener.onFailure(ErrorCode.UNINITIALIZED.getCode());
            return;
        }
        byte[] bArrA = e.a(deviceConfigInfoType);
        if (str == null || bArrA == null) {
            printLogMessage(getGeneralLogInfo(str, "failed to get device's config info,no device...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            onConfigInfoListener.onFailure(ErrorCode.PARAMETER_ERROR_CODE.getCode());
            return;
        }
        printLogMessage(getGeneralLogInfo(str, "get device's config info:" + deviceConfigInfoType, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        com.lifesense.android.bluetooth.core.business.push.msg.a aVar = new com.lifesense.android.bluetooth.core.business.push.msg.a();
        aVar.a(bArrA);
        aVar.a(str);
        aVar.a(PacketProfile.QUERY_DEVICE_CONFIG_INFO);
        com.lifesense.android.bluetooth.core.business.push.c.getInstance().a(str, aVar, onConfigInfoListener);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public synchronized ManagerStatus getLsBleManagerStatus() {
        ManagerStatus managerStatus;
        if (!this.initFlag || (managerStatus = this.managerStatus) == null) {
            return null;
        }
        return managerStatus;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void getWifiConnectStatus(String str) {
        if (DeviceSyncCentre.getInstance().checkConnectState(str) != DeviceConnectState.CONNECTED_SUCCESS) {
            if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
                DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
                return;
            }
            return;
        }
        com.lifesense.android.bluetooth.core.protocol.worker.a protocolHandler = DeviceSyncCentre.getInstance().getProtocolHandler(str);
        if (protocolHandler != null) {
            protocolHandler.writeCommandToDevice(NetstrapPacket.createReadDeviceWiFiInfoPacket().getBytes(), com.lifesense.android.bluetooth.core.protocol.c.DEVICE_WIFI_SERVICE_UUID, com.lifesense.android.bluetooth.core.protocol.c.CHARACTERISTIC_TX_UUID);
        } else if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
            DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean hasInitialized() {
        return this.initFlag;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean initialize(Context context) {
        if (this.initFlag) {
            return true;
        }
        if (context == null) {
            printLogMessage(getPrintLogInfo("faield to init LSBluetoothManager,unsupported:" + Build.VERSION.SDK_INT, 1));
            this.initFlag = false;
            return false;
        }
        setManagerStatus(ManagerStatus.FREE, null);
        mAppContext = context;
        currentBluetoothState = 255;
        this.isRegisterBleStateReceiver = false;
        this.mBleStateBroadcastReceiver = new com.lifesense.android.bluetooth.core.system.broadcast.b(this.mBleBroadcastListener);
        com.lifesense.android.bluetooth.core.system.b.getInstance().a(context);
        com.lifesense.android.bluetooth.core.business.scan.a.getInstance().initBusinessCentre(mAppContext, this.mCentreWorkingStateListener);
        DeviceSyncCentre.getInstance().initBusinessCentre(mAppContext, this.mCentreWorkingStateListener);
        com.lifesense.android.bluetooth.core.business.pair.a.getInstance().initBusinessCentre(mAppContext, this.mCentreWorkingStateListener);
        com.lifesense.android.bluetooth.core.business.log.d.d().a(mAppContext, false);
        com.lifesense.android.bluetooth.core.business.log.d.d().a(null, com.lifesense.android.bluetooth.core.business.log.report.a.Start_SDK, true, null, null);
        com.lifesense.android.bluetooth.core.business.push.c.getInstance().initBusinessCentre(mAppContext, this.mCentreWorkingStateListener);
        initSdkDebugPermission();
        this.initFlag = true;
        return true;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public int inputOperationCommand(String str, OperationCommand operationCommand, Object obj) {
        com.lifesense.android.bluetooth.core.business.log.b generalLogInfo;
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to input operation command,uninitialized..", 1));
            return 0;
        }
        if (operationCommand == null || operationCommand == OperationCommand.UNKNOWN || obj == null) {
            printLogMessage(getPrintLogInfo("operation command=" + operationCommand + "; invalid...", 1));
            return 0;
        }
        if (str == null) {
            generalLogInfo = getPrintLogInfo("failed to input operation command=" + operationCommand + "; no device...", 1);
        } else {
            if (OperationCommand.CMD_RANDOM_NUMBER == operationCommand && (obj instanceof String)) {
                String str2 = (String) obj;
                printLogMessage(getGeneralLogInfo(str, "operation command=" + operationCommand + "; data=" + str2, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
                return com.lifesense.android.bluetooth.core.business.pair.a.getInstance().a(str, str2);
            }
            if (OperationCommand.CMD_PAIRED_CONFIRM == operationCommand && (obj instanceof PairedConfirmInfo)) {
                PairedConfirmInfo pairedConfirmInfo = (PairedConfirmInfo) obj;
                printLogMessage(getGeneralLogInfo(str, "operation command=" + operationCommand + "; data=" + pairedConfirmInfo.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
                com.lifesense.android.bluetooth.core.business.pair.a.getInstance().a(str, pairedConfirmInfo.getUserNumber(), pairedConfirmInfo.getConfirmState());
                return 0;
            }
            if (OperationCommand.CMD_UNBIND_CONFIRM == operationCommand && (obj instanceof Boolean)) {
                printLogMessage(getGeneralLogInfo(str, "operation command=" + operationCommand + "; data=" + obj, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
                com.lifesense.android.bluetooth.core.business.pair.a.getInstance().b(str, ((Boolean) obj).booleanValue());
                return 0;
            }
            generalLogInfo = getGeneralLogInfo(str, "operation command=" + operationCommand + "; unknown...", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true);
        }
        printLogMessage(generalLogInfo);
        return -1;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public synchronized void interruptUpgradeProcess(String str) {
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(null, "failed to cancel device's upgrading,uninitialize.." + str, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return;
        }
        ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
        if (lsBleManagerStatus != ManagerStatus.UPGRADE_FIRMWARE_VERSION) {
            printLogMessage(getGeneralLogInfo(null, "no permission to cancel device's upgrading,status=" + lsBleManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return;
        }
        setManagerStatus(ManagerStatus.FREE, "interrupt upgrade");
        printLogMessage(getGeneralLogInfo(str, "cancel device's upgrading..." + str, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        c.getInstance().d(str);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void isConfigWifi(String str) {
        if (DeviceSyncCentre.getInstance().checkConnectState(str) != DeviceConnectState.CONNECTED_SUCCESS) {
            if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
                DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
            }
        } else if (DeviceSyncCentre.getInstance().getProtocolHandler(str) != null) {
            DeviceSyncCentre.getInstance().getProtocolHandler(str.replaceAll(":", "").toUpperCase()).writeCommandToDevice(NetstrapPacket.createReadDeviceWiFiInfoPacket().getBytes(), com.lifesense.android.bluetooth.core.protocol.c.DEVICE_WIFI_SERVICE_UUID, com.lifesense.android.bluetooth.core.protocol.c.CHARACTERISTIC_TX_UUID);
        } else if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
            DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean isOpenBluetooth() {
        if (this.initFlag) {
            return com.lifesense.android.bluetooth.core.system.b.getInstance().i();
        }
        printLogMessage(getGeneralLogInfo(null, "bluetooth unavailable,uninitilaize...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean isSupportLowEnergy() {
        if (this.initFlag) {
            return com.lifesense.android.bluetooth.core.system.b.getInstance().l();
        }
        printLogMessage(getGeneralLogInfo(null, "unsupported low energy,uninitilaize...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean pairingWithDevice(LsDeviceInfo lsDeviceInfo, PairCallback pairCallback) {
        if (pairCallback == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,no callback...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return false;
        }
        if (lsDeviceInfo == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing with invalid device obj...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            pairCallback.onPairResults(lsDeviceInfo, 7);
            return false;
        }
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,no initialize...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            pairCallback.onPairResults(lsDeviceInfo, -1);
            return false;
        }
        ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
        ManagerStatus managerStatus = ManagerStatus.FREE;
        if (lsBleManagerStatus != managerStatus) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,status error=" + lsBleManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            pairCallback.onPairResults(lsDeviceInfo, 6);
            return false;
        }
        if (!isBluetoothAvailable()) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,bluetooth unavailable...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            pairCallback.onPairResults(lsDeviceInfo, 5);
            return false;
        }
        setManagerStatus(ManagerStatus.DEVICE_PAIR, "pairing device");
        String str = "pairing with device=[" + lsDeviceInfo.getMacAddress() + "]";
        String macAddress = lsDeviceInfo.getMacAddress();
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg;
        printLogMessage(getGeneralLogInfo(macAddress, str, aVar, null, true));
        lsDeviceInfo.setMacAddress(lsDeviceInfo.getMacAddress());
        boolean zA = com.lifesense.android.bluetooth.core.business.pair.a.getInstance().a(lsDeviceInfo, pairCallback);
        if (!zA) {
            printLogMessage(getGeneralLogInfo(lsDeviceInfo.getMacAddress(), "failed to pairing, device=[" + lsDeviceInfo.getMacAddress() + "]", aVar, null, true));
            setManagerStatus(managerStatus, "failed to pairing device");
        }
        return zA;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void readDeviceVoltage(String str, OnDeviceReadListener onDeviceReadListener) {
        if (onDeviceReadListener == null) {
            printLogMessage(getPrintLogInfo("failed to read deice's voltage,no callback...", 1));
        } else {
            if (this.initFlag) {
                DeviceSyncCentre.getInstance().readDeviceVoltage(str, onDeviceReadListener);
                return;
            }
            printLogMessage(getGeneralLogInfo(str, "faield to read device voltage,uninitialized...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            ErrorCode errorCode = ErrorCode.UNKNOWN_ERROR;
            onDeviceReadListener.onDeviceVoltageValue(null, errorCode.getCode(), errorCode.getCode());
        }
    }

    public void refreshBleState() {
        currentBluetoothState = 10;
        handleBluetoothStateOffBroadcast(10);
        handleBluetoothStateOnBroadcast(12);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void registerBluetoothBroadcastReceiver(Context context) {
        if (!this.initFlag || context == null || this.isRegisterBleStateReceiver) {
            return;
        }
        this.isRegisterBleStateReceiver = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(this.mBleStateBroadcastReceiver, intentFilter);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void registerConnectExceptionListener(OnConnectExceptionListener onConnectExceptionListener) {
        if (this.initFlag && onConnectExceptionListener != null) {
            com.lifesense.android.bluetooth.core.business.detect.a.getInstance().a(onConnectExceptionListener);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void registerDataSyncCallback(ReceiveDataCallback receiveDataCallback) {
        if (this.initFlag) {
            DeviceSyncCentre.getInstance().registerDataSyncListener(receiveDataCallback);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void registeringDeviceID(String str, String str2, DeviceRegisterState deviceRegisterState) {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to register device's id,uninitialized..", 1));
            return;
        }
        printLogMessage(getGeneralLogInfo(str, "register id=" + str2 + "; state=" + deviceRegisterState + " ; device[" + str + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        com.lifesense.android.bluetooth.core.business.pair.a.getInstance().a(str, str2, deviceRegisterState);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void resetWifi(String str) {
        if (DeviceSyncCentre.getInstance().checkConnectState(str) != DeviceConnectState.CONNECTED_SUCCESS) {
            if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
                DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
            }
        } else if (DeviceSyncCentre.getInstance().getProtocolHandler(str) != null) {
            DeviceSyncCentre.getInstance().getProtocolHandler(str.replaceAll(":", "").toUpperCase()).writeCommandToDevice(NetstrapPacket.createResetPacket().getBytes(), com.lifesense.android.bluetooth.core.protocol.c.DEVICE_WIFI_SERVICE_UUID, com.lifesense.android.bluetooth.core.protocol.c.CHARACTERISTIC_TX_UUID);
        } else if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
            DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean searchLsDevice(SearchCallback searchCallback, List<DeviceType> list, BroadcastType broadcastType) {
        String str;
        com.lifesense.android.bluetooth.core.business.log.b generalLogInfo;
        if (searchCallback == null) {
            str = "failed to search device,no callback...";
        } else {
            if (this.initFlag) {
                ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
                if (lsBleManagerStatus != ManagerStatus.FREE) {
                    generalLogInfo = getGeneralLogInfo(null, "failed to search device,status error=" + lsBleManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true);
                } else {
                    if (isBluetoothAvailable()) {
                        setManagerStatus(ManagerStatus.DEVICE_SEARCH, "search device");
                        com.lifesense.android.bluetooth.core.business.scan.a.getInstance().a(broadcastType, list, searchCallback);
                        return true;
                    }
                    str = "failed to search device,bluetooth unavailable...";
                }
                printLogMessage(generalLogInfo);
                return false;
            }
            str = "failed to search device,no initialize...";
        }
        generalLogInfo = getPrintLogInfo(str, 1);
        printLogMessage(generalLogInfo);
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void setBlelogFilePath(String str, String str2, String str3) {
        com.lifesense.android.bluetooth.core.tools.j.c(str);
        com.lifesense.android.bluetooth.core.business.log.d.d().a(str, str2, str3);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void setDebugMode(String str) {
        com.lifesense.android.bluetooth.core.business.log.c.a(str);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void setEnableGattServiceType(String str, GattServiceType gattServiceType) {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to set device's gatt service type,uninitialize...", 1));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            printLogMessage(getPrintLogInfo("failed to set device's gatt service type,no device.", 1));
            return;
        }
        printLogMessage(getGeneralLogInfo(str, "set enable gatt service type:" + gattServiceType + "; device[" + str + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        com.lifesense.android.bluetooth.core.business.push.c.getInstance().a(str, gattServiceType);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void setLogMessage(String str) {
        String str2;
        com.lifesense.android.bluetooth.core.business.log.report.a aVar;
        if (this.initFlag) {
            str2 = "app message >>" + str;
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.App_Message;
        } else {
            str2 = "failed to write app log message,no initialize..." + str;
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg;
        }
        printLogMessage(getGeneralLogInfo(null, str2, aVar, null, true));
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean setMeasureDevice(List<LsDeviceInfo> list) {
        if (this.initFlag) {
            return DeviceSyncCentre.getInstance().setDevicelist(list);
        }
        printLogMessage(getPrintLogInfo("failed to set measure device,uninitialize..", 1));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void setReceiveDataCallback(ReceiveDataCallback receiveDataCallback) {
        DeviceSyncCentre.getInstance().setReceiveDataCallback(receiveDataCallback);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void startConfigWifi(String str, String str2, byte[] bArr, int i) {
        com.lifesense.android.bluetooth.core.protocol.worker.a protocolHandler = DeviceSyncCentre.getInstance().getProtocolHandler(str);
        if (protocolHandler == null) {
            if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
                DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
            }
        } else {
            if (str2 == null) {
                str2 = "";
            }
            protocolHandler.writeCommandToDevice(NetstrapPacket.createConnectReqPacket(bArr, str2, i).getBytes(), com.lifesense.android.bluetooth.core.protocol.c.DEVICE_WIFI_SERVICE_UUID, com.lifesense.android.bluetooth.core.protocol.c.CHARACTERISTIC_TX_UUID);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public synchronized boolean startDataReceiveService(ReceiveDataCallback receiveDataCallback) {
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,uninitialized...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return false;
        }
        ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
        if (lsBleManagerStatus != ManagerStatus.FREE) {
            printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,manager status=" + lsBleManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return false;
        }
        printLogMessage(getSupperLogInfo(null, "start data syncing service from app.", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        com.lifesense.android.bluetooth.core.business.pair.a.getInstance().b();
        setManagerStatus(ManagerStatus.DATA_RECEIVE, "start data receive service");
        return DeviceSyncCentre.getInstance().startDataSyncService(receiveDataCallback);
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void startScanWifi(String str) {
        if (DeviceSyncCentre.getInstance().checkConnectState(str) != DeviceConnectState.CONNECTED_SUCCESS) {
            if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
                DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
                return;
            }
            return;
        }
        BaseDeviceWorker baseDeviceWorker = (BaseDeviceWorker) DeviceSyncCentre.getInstance().getProtocolHandler(str);
        if (baseDeviceWorker != null) {
            baseDeviceWorker.writeCommandToDevice(NetstrapPacket.createScanReqPacket(true, 2).getBytes(), com.lifesense.android.bluetooth.core.protocol.c.DEVICE_WIFI_SERVICE_UUID, com.lifesense.android.bluetooth.core.protocol.c.CHARACTERISTIC_TX_UUID);
        } else if (DeviceSyncCentre.getInstance().getmReceiveDataCallback() != null) {
            DeviceSyncCentre.getInstance().getmReceiveDataCallback().onReceiveWifiConnectState(str, WifiState.BLE_NOTCONNECTED);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public synchronized boolean stopDataReceiveService() {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("no permission to stop data syncing service,uninitialize...", 1));
            return false;
        }
        ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
        if (getLsBleManagerStatus() == ManagerStatus.DEVICE_PAIR) {
            printLogMessage(getPrintLogInfo("failed to stop data syncing service,manager status=" + lsBleManagerStatus, 1));
            return false;
        }
        printLogMessage(getSupperLogInfo(null, "stop data syncing service from app.", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        if (getLsBleManagerStatus() == ManagerStatus.DEVICE_SEARCH) {
            com.lifesense.android.bluetooth.core.business.scan.a.getInstance().i();
        }
        setManagerStatus(ManagerStatus.FREE, "stop data receive service");
        return DeviceSyncCentre.getInstance().stopDataSyncService();
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean stopSearch() {
        com.lifesense.android.bluetooth.core.business.log.b generalLogInfo;
        if (this.initFlag) {
            ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
            if (lsBleManagerStatus == ManagerStatus.DEVICE_SEARCH) {
                setManagerStatus(ManagerStatus.FREE, "stop search device");
                com.lifesense.android.bluetooth.core.business.scan.a.getInstance().i();
                return true;
            }
            generalLogInfo = getGeneralLogInfo(null, "failed to stop search,manager status error=" + lsBleManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true);
        } else {
            generalLogInfo = getPrintLogInfo("failed to stop search device,no initialize...", 1);
        }
        printLogMessage(generalLogInfo);
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public boolean unbindWithDevice(LsDeviceInfo lsDeviceInfo, PairCallback pairCallback) {
        if (pairCallback == null) {
            printLogMessage(getPrintLogInfo("failed to unbind device,no callback...", 1));
            return false;
        }
        if (lsDeviceInfo == null) {
            printLogMessage(getPrintLogInfo("failed to unbind device,is null...", 1));
            pairCallback.onUnbindResults(lsDeviceInfo, 7);
            return false;
        }
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to unbind device,no initialize...", 1));
            pairCallback.onUnbindResults(lsDeviceInfo, -1);
            return false;
        }
        ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
        ManagerStatus managerStatus = ManagerStatus.FREE;
        if (lsBleManagerStatus != managerStatus) {
            printLogMessage(getGeneralLogInfo(null, "failed to unbind device,status=" + lsBleManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            pairCallback.onUnbindResults(lsDeviceInfo, 6);
            return false;
        }
        if (!isBluetoothAvailable()) {
            printLogMessage(getGeneralLogInfo(null, "failed to unbind device,bluetooth unavailable..", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            pairCallback.onUnbindResults(lsDeviceInfo, 5);
            return false;
        }
        if (!ProtocolType.A6.toString().equalsIgnoreCase(lsDeviceInfo.getProtocolType())) {
            printLogMessage(getGeneralLogInfo(null, "failed to unbind device,unsupported...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            pairCallback.onUnbindResults(lsDeviceInfo, 9);
            return false;
        }
        printLogMessage(getGeneralLogInfo(null, "unbinding device[" + lsDeviceInfo.getMacAddress() + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        setManagerStatus(ManagerStatus.DEVICE_UNBIND, "pairing device");
        lsDeviceInfo.setMacAddress(lsDeviceInfo.getMacAddress());
        boolean zB = com.lifesense.android.bluetooth.core.business.pair.a.getInstance().b(lsDeviceInfo, pairCallback);
        if (!zB) {
            setManagerStatus(managerStatus, "failed to pairing device");
        }
        return zB;
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void unregisterBluetoothBroadcastReceiver() {
        Context context;
        com.lifesense.android.bluetooth.core.system.broadcast.b bVar;
        if (!this.initFlag || (context = mAppContext) == null || !this.isRegisterBleStateReceiver || (bVar = this.mBleStateBroadcastReceiver) == null) {
            return;
        }
        try {
            this.isRegisterBleStateReceiver = false;
            context.unregisterReceiver(bVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public void unregisterConnectExceptionListener() {
        if (this.initFlag) {
            com.lifesense.android.bluetooth.core.business.detect.a.getInstance().a((OnConnectExceptionListener) null);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.LsBleInterface
    public synchronized void upgradeDeviceFirmware(LsDeviceInfo lsDeviceInfo, File file, OnDeviceUpgradeListener onDeviceUpgradeListener) {
        String macAddress = lsDeviceInfo.getMacAddress();
        if (onDeviceUpgradeListener == null) {
            printLogMessage(getPrintLogInfo("failed to upgrading device's firmware,no callback..", 1));
            return;
        }
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(macAddress, "failed to upgrading,uninitialized....", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            onDeviceUpgradeListener.onDeviceUpgradeStateChange(macAddress, DeviceUpgradeStatus.UPGRADE_FAILURE, ErrorCode.UNINITIALIZED.getCode());
            return;
        }
        if (TextUtils.isEmpty(macAddress)) {
            printLogMessage(getGeneralLogInfo(macAddress, "failed to upgrading with device[" + macAddress + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            onDeviceUpgradeListener.onDeviceUpgradeStateChange(macAddress, DeviceUpgradeStatus.UPGRADE_FAILURE, ErrorCode.PARAMETER_ERROR_CODE.getCode());
            return;
        }
        if (!isBluetoothAvailable()) {
            printLogMessage(getGeneralLogInfo(macAddress, "failed to upgrading,bluetooth unavailable...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            onDeviceUpgradeListener.onDeviceUpgradeStateChange(macAddress, DeviceUpgradeStatus.UPGRADE_FAILURE, ErrorCode.BlLUETOOTH_DISABLE.getCode());
            return;
        }
        DeviceConnectState deviceConnectStateCheckDeviceConnectState = checkDeviceConnectState(macAddress);
        ManagerStatus lsBleManagerStatus = getLsBleManagerStatus();
        if (DeviceConnectState.CONNECTED_SUCCESS != deviceConnectStateCheckDeviceConnectState && lsBleManagerStatus != ManagerStatus.FREE && lsBleManagerStatus != ManagerStatus.UPGRADE_FIRMWARE_VERSION) {
            printLogMessage(getGeneralLogInfo(macAddress, "failed to upgrading,managerStatus=" + lsBleManagerStatus + "; connectStatus=" + deviceConnectStateCheckDeviceConnectState, com.lifesense.android.bluetooth.core.business.log.report.a.Upgrade_Message, null, true));
            onDeviceUpgradeListener.onDeviceUpgradeStateChange(macAddress, DeviceUpgradeStatus.UPGRADE_FAILURE, ErrorCode.BLE_MANAGER_STATE_ERROR_CODE.getCode());
            return;
        }
        setManagerStatus(ManagerStatus.UPGRADE_FIRMWARE_VERSION, "upgrade Device Firmware");
        printLogMessage(getGeneralLogInfo(macAddress, "upgrading with device=[" + macAddress + "]; connectState=" + deviceConnectStateCheckDeviceConnectState, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        if (!c.getInstance().b()) {
            c.getInstance().initBusinessCentre(mAppContext, this.mCentreWorkingStateListener);
        }
        c.getInstance().a(lsDeviceInfo, file, onDeviceUpgradeListener);
    }
}
