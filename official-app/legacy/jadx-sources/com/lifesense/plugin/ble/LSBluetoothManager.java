package com.lifesense.plugin.ble;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Environment;
import android.text.TextUtils;
import com.lifesense.plugin.ble.a.e;
import com.lifesense.plugin.ble.a.g;
import com.lifesense.plugin.ble.a.h;
import com.lifesense.plugin.ble.data.IBManagerConfig;
import com.lifesense.plugin.ble.data.IDeviceSetting;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSConnectionConfig;
import com.lifesense.plugin.ble.data.LSDataQueryRequest;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDeviceMessage;
import com.lifesense.plugin.ble.data.LSDevicePairSetting;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSLoggerConfig;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.LSOtaProfilesConfig;
import com.lifesense.plugin.ble.data.LSPairCommand;
import com.lifesense.plugin.ble.data.LSProtocolType;
import com.lifesense.plugin.ble.data.LSScanIntervalConfig;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import com.lifesense.plugin.ble.data.other.BroadcastType;
import com.lifesense.plugin.ble.data.other.SdkPermission;
import com.lifesense.plugin.ble.data.tracker.ATBatteryInfo;
import com.lifesense.plugin.ble.data.tracker.ATImageMessage;
import com.lifesense.plugin.ble.data.tracker.ATPairConfirmInfo;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;
import com.lifesense.plugin.ble.data.tracker.setting.ATFileCancelSetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATFileSetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATGpsStatus;
import com.lifesense.plugin.ble.data.tracker.setting.ATRealtimeDataSetting;
import com.lifesense.plugin.ble.device.a.a.a.j;
import com.lifesense.plugin.ble.device.a.a.o;
import com.lifesense.plugin.ble.device.a.a.u;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import com.lifesense.plugin.ble.device.proto.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale", "NewApi"})
public final class LSBluetoothManager extends com.lifesense.plugin.ble.b.a implements IBluetoothManager {
    public static int currentBluetoothState;
    private static Context mAppContext;
    private static LSBluetoothManager mPlugin;
    protected boolean initFlag;
    private boolean isRegisterBleStateReceiver;
    private h mBleStateBroadcastReceiver;
    private LSConnectionConfig mConnectionConfig;
    private LSManagerStatus managerStatus;
    private com.lifesense.plugin.ble.device.a.b mCentreWorkingStateListener = new a(this);
    private g mBleBroadcastListener = new b(this);

    private LSBluetoothManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void analyseBluetoothStatus(int i) {
        if ((10 == i || 13 == i) && getManagerStatus() == LSManagerStatus.Pairing) {
            setManagerStatus(LSManagerStatus.Free, "on bluetooth status change:" + i);
            com.lifesense.plugin.ble.device.a.a.d.a().c();
        }
        if (i == 10) {
            int i2 = currentBluetoothState;
            if (i2 == 10) {
                return;
            }
            if (i2 != 13 && !e.a().g()) {
                currentBluetoothState = i;
            }
            currentBluetoothState = i;
            return;
        }
        if (i == 13) {
            currentBluetoothState = i;
            handleBluetoothStateOff(i);
        } else {
            if (i != 12 || currentBluetoothState == 12) {
                return;
            }
            e.a().a(false);
            handleBluetoothStateOn(i);
        }
    }

    private synchronized void destoryAllResources() {
        if (!this.initFlag || mAppContext == null) {
            return;
        }
        try {
            printLogMessage(getGeneralLogInfo(null, "destory all resources...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            this.initFlag = false;
            stopDeviceSync();
            unregisterBluetoothReceiver();
            o.a().f();
            com.lifesense.plugin.ble.device.a.a.g.a().f();
            com.lifesense.plugin.ble.device.a.a.d.a().d();
            u.a().g();
            com.lifesense.plugin.ble.device.a.a.a.a().c();
            com.lifesense.plugin.ble.b.d.a().d();
            e.a().h();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static synchronized LSBluetoothManager getInstance() {
        LSBluetoothManager lSBluetoothManager = mPlugin;
        if (lSBluetoothManager != null) {
            return lSBluetoothManager;
        }
        LSBluetoothManager lSBluetoothManager2 = new LSBluetoothManager();
        mPlugin = lSBluetoothManager2;
        return lSBluetoothManager2;
    }

    private void handleBluetoothStateOff(int i) {
        o.a().d();
        if (getManagerStatus() == LSManagerStatus.Syncing) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Close_Bluetooth, true, "Done", null);
        } else if (getManagerStatus() == LSManagerStatus.Upgrading) {
            com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Close_Bluetooth, true, "close all device upgrade process now.....", null);
            com.lifesense.plugin.ble.device.a.a.a.a().a(LSErrorCode.BluetoothUnavailable);
        }
    }

    private void handleBluetoothStateOn(int i) {
        com.lifesense.plugin.ble.b.d.a().a(null, com.lifesense.plugin.ble.b.a.a.Enable_Bluetooth, true, "Done", null);
        int i2 = currentBluetoothState;
        if (i2 == 10 || i2 == 13) {
            currentBluetoothState = i;
            LSManagerStatus lSManagerStatusB = u.a().b();
            LSManagerStatus managerStatus = getManagerStatus();
            if (lSManagerStatusB == LSManagerStatus.Syncing) {
                LSConnectionConfig lSConnectionConfig = this.mConnectionConfig;
                if (lSConnectionConfig == null || lSConnectionConfig.getDelayTime() <= 0) {
                    printLogMessage(getGeneralLogInfo(null, "restart device sync without delay; status=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                } else {
                    long delayTime = this.mConnectionConfig.getDelayTime();
                    printLogMessage(getGeneralLogInfo(null, "delay " + delayTime + " to restart device sync; status=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                    try {
                        Thread.sleep(delayTime);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
                u.a().e();
            } else {
                printLogMessage(getAdvancedLogInfo(null, "no permission to restart device sync,syncStatus=" + lSManagerStatusB + "; workingStatus=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, false));
            }
        }
        currentBluetoothState = i;
    }

    private void handleDeviceSetting(String str, IDeviceSetting iDeviceSetting, OnSettingListener onSettingListener) {
        LSErrorCode lSErrorCode;
        StringBuilder sb;
        String strD;
        if (onSettingListener == null) {
            return;
        }
        if (iDeviceSetting == null || iDeviceSetting.encodeCmdBytes() == null) {
            lSErrorCode = LSErrorCode.ParameterError;
        } else {
            String.format("%X", Integer.valueOf(iDeviceSetting.getCmd()));
            q qVarB = u.a().b(str);
            if (qVarB == null) {
                sb = new StringBuilder();
                sb.append("failed to push sync setting,no worker=[");
                sb.append(str);
                sb.append("]; cmd=");
                strD = com.lifesense.plugin.ble.c.a.d(iDeviceSetting.encodeCmdBytes());
            } else {
                if (qVarB.h() == LSConnectState.ConnectSuccess) {
                    if (qVarB.l() != null) {
                        iDeviceSetting.setDeviceModel(qVarB.l().getModelNumber());
                    }
                    printLogMessage(getGeneralLogInfo(str, "push setting =" + String.format("%X", Integer.valueOf(iDeviceSetting.getCmd())) + "; device[" + str + "]; cmd=" + com.lifesense.plugin.ble.c.a.d(iDeviceSetting.encodeCmdBytes()), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
                    com.lifesense.plugin.ble.device.a.a.a.e eVarA = com.lifesense.plugin.ble.device.a.a.a.a.a().a(str);
                    if (eVarA != null && (iDeviceSetting instanceof LSDataQueryRequest)) {
                        j jVar = new j();
                        jVar.a(str);
                        jVar.a(onSettingListener);
                        jVar.a(iDeviceSetting);
                        eVarA.a(jVar);
                        return;
                    }
                    com.lifesense.plugin.ble.device.a.a.a.b bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
                    bVar.a(iDeviceSetting.encodeCmdBytes());
                    bVar.a(str);
                    bVar.a(iDeviceSetting.getCmd());
                    if (iDeviceSetting instanceof ATFileSetting) {
                        bVar.a(((ATFileSetting) iDeviceSetting).getFile());
                    }
                    com.lifesense.plugin.ble.device.a.a.g.a().a(str, bVar, onSettingListener);
                    return;
                }
                sb = new StringBuilder();
                sb.append("failed to push sync setting,not connected. device=[");
                sb.append(str);
                sb.append("]; cmd=");
                strD = com.lifesense.plugin.ble.c.a.d(iDeviceSetting.encodeCmdBytes());
            }
            sb.append(strD);
            printLogMessage(getGeneralLogInfo(str, sb.toString(), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            lSErrorCode = LSErrorCode.DeviceNotConnected;
        }
        onSettingListener.onFailure(lSErrorCode.getCode());
    }

    private void initSdkDebugPermission() {
        try {
            Object objA = com.lifesense.plugin.ble.c.e.a(new File(Environment.getExternalStorageDirectory().getPath() + File.separator + "AndroidPermission.ser"));
            if (objA != null && (objA instanceof SdkPermission) && ((SdkPermission) objA).isEnablePrintln()) {
                enableFileLogging(true, null, null);
                openDebugMode("LifesenseBluetooth");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setManagerStatus(LSManagerStatus lSManagerStatus, String str) {
        printLogMessage(getGeneralLogInfo(null, "reset manager status=" + lSManagerStatus + "; oldStatus=" + this.managerStatus + "; " + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        this.managerStatus = lSManagerStatus;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean addDevice(LSDeviceInfo lSDeviceInfo) {
        if (this.initFlag) {
            return u.a().a(lSDeviceInfo);
        }
        printLogMessage(getPrintLogInfo("failed to add measure device,uninitialize..", 1));
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void appendDebugMessage(String str) {
        String str2;
        String str3;
        com.lifesense.plugin.ble.b.a.a aVar;
        if (this.initFlag) {
            str2 = "app message >>" + str;
            str3 = null;
            aVar = com.lifesense.plugin.ble.b.a.a.App_Message;
        } else {
            str2 = "failed to write app log message,no initManager..." + str;
            str3 = null;
            aVar = com.lifesense.plugin.ble.b.a.a.Operating_Msg;
        }
        printLogMessage(getGeneralLogInfo(str3, str2, aVar, null, true));
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean cancelDevicePairing(LSDeviceInfo lSDeviceInfo) {
        String str;
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (this.initFlag) {
            LSManagerStatus managerStatus = getManagerStatus();
            if (managerStatus != LSManagerStatus.Pairing) {
                str = "failed to cancel device's pairing,status=" + managerStatus;
            } else {
                if (lSDeviceInfo != null && !TextUtils.isEmpty(lSDeviceInfo.getMacAddress())) {
                    printLogMessage(getGeneralLogInfo(lSDeviceInfo.getMacAddress(), "cancel pairing now,device[" + lSDeviceInfo.getMacAddress() + "]", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
                    setManagerStatus(LSManagerStatus.Free, "cancel pairing with device");
                    com.lifesense.plugin.ble.device.a.a.d.a().a(com.lifesense.plugin.ble.c.b.b(lSDeviceInfo.getMacAddress()));
                    return true;
                }
                str = "failed to cancel device's pairing,no device...";
            }
            generalLogInfo = getGeneralLogInfo(null, str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true);
        } else {
            generalLogInfo = getPrintLogInfo("failed to cancel device's pairing,uninitialized...", 1);
        }
        printLogMessage(generalLogInfo);
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    @Deprecated
    public synchronized void cancelDeviceUpgrading(String str) {
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(null, "failed to cancel device's upgrading,uninitialize.." + str, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        LSManagerStatus managerStatus = getManagerStatus();
        if (managerStatus != LSManagerStatus.Upgrading) {
            printLogMessage(getGeneralLogInfo(null, "no permission to cancel device's upgrading,status=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return;
        }
        setManagerStatus(LSManagerStatus.Free, "cancel upgrade");
        printLogMessage(getGeneralLogInfo(str, "cancel device's upgrading..." + str, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        com.lifesense.plugin.ble.device.a.a.a.a().a(com.lifesense.plugin.ble.c.b.b(str));
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void cancelFileUpdating(String str, LSDeviceSyncSetting lSDeviceSyncSetting, OnSettingListener onSettingListener) {
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (onSettingListener == null) {
            return;
        }
        if (lSDeviceSyncSetting == null) {
            generalLogInfo = getGeneralLogInfo(str, "failed to cancel file updating,no setting." + str, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true);
        } else {
            boolean z = lSDeviceSyncSetting instanceof ATFileSetting;
            if (z) {
                LSConnectState lSConnectStateCheckConnectState = checkConnectState(str);
                printLogMessage(getGeneralLogInfo(str, "cancel file updating =" + str + "; state = " + lSConnectStateCheckConnectState, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
                if (lSConnectStateCheckConnectState != LSConnectState.ConnectSuccess) {
                    onSettingListener.onFailure(LSErrorCode.DeviceNotConnected.getCode());
                    return;
                }
                ATFileCancelSetting aTFileCancelSetting = new ATFileCancelSetting();
                com.lifesense.plugin.ble.device.a.a.a.b bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
                bVar.a(aTFileCancelSetting.encodeCmdBytes());
                bVar.a(str);
                bVar.a(aTFileCancelSetting.getCmd());
                if (z) {
                    bVar.a(((ATFileSetting) lSDeviceSyncSetting).getFile());
                }
                com.lifesense.plugin.ble.device.a.a.g.a().a(str, bVar, onSettingListener);
                return;
            }
            generalLogInfo = getGeneralLogInfo(str, "failed to cancel file updating,unsupported." + lSDeviceSyncSetting, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true);
        }
        printLogMessage(generalLogInfo);
        onSettingListener.onFailure(LSErrorCode.ParameterError.getCode());
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public LSConnectState checkConnectState(String str) {
        return (!this.initFlag || str == null || str.length() == 0) ? LSConnectState.Unknown : u.a().a(str);
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public byte[] computeCRC32(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return com.lifesense.plugin.ble.c.a.j(bArr);
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean deleteDevice(String str) {
        if (this.initFlag) {
            return u.a().c(str);
        }
        printLogMessage(getPrintLogInfo("failed to delete measure device,uninitialize..", 1));
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void enableFileLogging(boolean z, String str, String str2) {
        com.lifesense.plugin.ble.b.d.a().a(z);
        com.lifesense.plugin.ble.b.d.a().a(str, "", str2);
    }

    public String getConnectionConfig() {
        LSConnectionConfig lSConnectionConfig = this.mConnectionConfig;
        return lSConnectionConfig == null ? "LSConnectionConfig: default" : lSConnectionConfig.toString();
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public List getDevices() {
        Map mapC = u.a().c();
        if (mapC == null || mapC.isEmpty()) {
            return null;
        }
        return new ArrayList(mapC.values());
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public LSManagerStatus getManagerStatus() {
        LSManagerStatus lSManagerStatus;
        if (!this.initFlag || (lSManagerStatus = this.managerStatus) == null) {
            return null;
        }
        return lSManagerStatus;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public String getVersion() {
        return IBluetoothManager.VERSION;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean initManager(Context context) {
        if (this.initFlag) {
            return true;
        }
        if (context == null || com.lifesense.plugin.ble.c.b.b() < 18) {
            printLogMessage(getPrintLogInfo("failed to init LSBluetoothManager,unsupported:" + com.lifesense.plugin.ble.c.b.b(), 1));
            this.initFlag = false;
            return false;
        }
        setManagerStatus(LSManagerStatus.Free, null);
        mAppContext = context;
        currentBluetoothState = 255;
        this.isRegisterBleStateReceiver = false;
        this.mBleStateBroadcastReceiver = new h(this.mBleBroadcastListener);
        e.a().a(context);
        o.a().a(mAppContext, this.mCentreWorkingStateListener);
        u.a().a(mAppContext, this.mCentreWorkingStateListener);
        com.lifesense.plugin.ble.device.a.a.d.a().a(mAppContext, this.mCentreWorkingStateListener);
        com.lifesense.plugin.ble.b.d.a().a(mAppContext, false);
        com.lifesense.plugin.ble.device.a.a.g.a().a(mAppContext, this.mCentreWorkingStateListener);
        initSdkDebugPermission();
        com.lifesense.plugin.ble.device.proto.e.a().b();
        this.mConnectionConfig = new LSConnectionConfig(5000L);
        this.initFlag = true;
        return true;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean isBluetoothAvailable() {
        if (this.initFlag) {
            return e.a().c();
        }
        printLogMessage(getGeneralLogInfo(null, "bluetooth unavailable,uninitilaize...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean isSupportBLE() {
        if (this.initFlag) {
            return e.a().b();
        }
        printLogMessage(getGeneralLogInfo(null, "unsupported low energy,uninitilaize...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void openDebugMode(String str) {
        com.lifesense.plugin.ble.b.c.a(str);
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean pairDevice(LSDeviceInfo lSDeviceInfo, OnPairingListener onPairingListener) {
        if (onPairingListener == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,no callback...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return false;
        }
        if (lSDeviceInfo == null) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing with invalid device obj...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            onPairingListener.onStateChanged(lSDeviceInfo, 7);
            return false;
        }
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,no initManager...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            onPairingListener.onStateChanged(lSDeviceInfo, -1);
            return false;
        }
        LSManagerStatus managerStatus = getManagerStatus();
        LSManagerStatus lSManagerStatus = LSManagerStatus.Free;
        if (managerStatus != lSManagerStatus) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,status error=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            onPairingListener.onStateChanged(lSDeviceInfo, 6);
            return false;
        }
        if (!isBluetoothAvailable()) {
            printLogMessage(getGeneralLogInfo(null, "failed to pairing device,bluetooth unavailable...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            onPairingListener.onStateChanged(lSDeviceInfo, 5);
            return false;
        }
        setManagerStatus(LSManagerStatus.Pairing, "pairing device");
        String str = "pairing with device=[" + lSDeviceInfo.getMacAddress() + "]; userInfo=" + (lSDeviceInfo.getUserInfo() != null ? lSDeviceInfo.getUserInfo().formatUserInfo() : "null");
        String macAddress = lSDeviceInfo.getMacAddress();
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Operating_Msg;
        printLogMessage(getGeneralLogInfo(macAddress, str, aVar, null, true));
        lSDeviceInfo.setMacAddress(com.lifesense.plugin.ble.c.b.b(lSDeviceInfo.getMacAddress()));
        boolean zA = com.lifesense.plugin.ble.device.a.a.d.a().a(lSDeviceInfo, onPairingListener);
        if (!zA) {
            printLogMessage(getGeneralLogInfo(lSDeviceInfo.getMacAddress(), "failed to pairing, device=[" + lSDeviceInfo.getMacAddress() + "]", aVar, null, true));
            setManagerStatus(lSManagerStatus, "failed to pairing device");
        }
        return zA;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    @Deprecated
    public void pushDeviceMessage(String str, LSDeviceMessage lSDeviceMessage) {
        pushDeviceMessage(str, lSDeviceMessage, new c(this));
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public int pushPairSetting(String str, LSDevicePairSetting lSDevicePairSetting) {
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to input operation command,uninitialized..", 1));
            return 0;
        }
        LSPairCommand pairCmd = lSDevicePairSetting.getPairCmd();
        Object obj = lSDevicePairSetting.getObj();
        if (lSDevicePairSetting.getPairCmd() == null || lSDevicePairSetting.getPairCmd() == LSPairCommand.Unknown || lSDevicePairSetting.getObj() == null) {
            printLogMessage(getPrintLogInfo("operation command=" + pairCmd + "; invalid...", 1));
            return 0;
        }
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null) {
            generalLogInfo = getPrintLogInfo("failed to input operation command=" + pairCmd + "; no device...", 1);
        } else {
            if (LSPairCommand.RandomCodeConfirm == pairCmd && (obj instanceof String)) {
                String str2 = (String) obj;
                printLogMessage(getGeneralLogInfo(str, "operation command=" + pairCmd + "; data=" + str2, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
                return com.lifesense.plugin.ble.device.a.a.d.a().a(strA, str2);
            }
            if (LSPairCommand.PairConfirm == pairCmd && (obj instanceof ATPairConfirmInfo)) {
                ATPairConfirmInfo aTPairConfirmInfo = (ATPairConfirmInfo) obj;
                printLogMessage(getGeneralLogInfo(str, "operation command=" + pairCmd + "; data=" + aTPairConfirmInfo.toString(), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
                com.lifesense.plugin.ble.device.a.a.d.a().a(strA, aTPairConfirmInfo.getUserNumber(), aTPairConfirmInfo.getConfirmState());
                return 0;
            }
            if (LSPairCommand.PairRequest == pairCmd && (obj instanceof Boolean)) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                printLogMessage(getGeneralLogInfo(str, "operation command=" + pairCmd + "; data=" + lSDevicePairSetting.toString(), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
                com.lifesense.plugin.ble.device.a.a.d.a().a(strA, zBooleanValue);
                return 0;
            }
            generalLogInfo = getGeneralLogInfo(str, "operation command=" + pairCmd + "; unknown...", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true);
        }
        printLogMessage(generalLogInfo);
        return -1;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void pushSyncSetting(String str, LSDeviceSyncSetting lSDeviceSyncSetting, OnSettingListener onSettingListener) {
        if (lSDeviceSyncSetting == null || !(lSDeviceSyncSetting instanceof ATRealtimeDataSetting)) {
            handleDeviceSetting(str, lSDeviceSyncSetting, onSettingListener);
        } else {
            printLogMessage(getGeneralLogInfo(str, "failed to got realtime heart rate data,unsupported.", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void queryDeviceData(String str, LSDataQueryRequest lSDataQueryRequest, OnSettingListener onSettingListener) {
        handleDeviceSetting(str, lSDataQueryRequest, onSettingListener);
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void readDeviceBattery(String str, OnReadingListener onReadingListener) {
        if (onReadingListener == null) {
            printLogMessage(getPrintLogInfo("failed to read deice's voltage,no callback...", 1));
        } else if (this.initFlag) {
            u.a().a(str, onReadingListener);
        } else {
            printLogMessage(getGeneralLogInfo(str, "faield to read device voltage,uninitialized...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            onReadingListener.onDeviceBatteryInfoUpdate(str, new ATBatteryInfo(null));
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void readImageMessageAbility(String str, OnReadingListener onReadingListener) {
        if (onReadingListener == null) {
            printLogMessage(getPrintLogInfo("failed to read deice's voltage,no callback...", 1));
        } else if (this.initFlag) {
            u.a().b(str, onReadingListener);
        } else {
            printLogMessage(getGeneralLogInfo(str, "faield to read device voltage,uninitialized...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            onReadingListener.onDeviceImageInfoUpdate(str, null);
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void registerBluetoothReceiver(Context context) {
        if (!this.initFlag || context == null || this.isRegisterBleStateReceiver) {
            return;
        }
        this.isRegisterBleStateReceiver = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(this.mBleStateBroadcastReceiver, intentFilter);
    }

    public void registerMessageService() {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to register message service,uninitialize..", 1));
        } else {
            printLogMessage(getGeneralLogInfo(null, "register message service now... ", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            com.lifesense.plugin.ble.device.a.a.g.a().c();
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void resetSyncingListener(OnSyncingListener onSyncingListener) {
        if (this.initFlag) {
            u.a().b(onSyncingListener);
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean searchDevice(List list, OnSearchingListener onSearchingListener) {
        String str;
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (onSearchingListener == null) {
            str = "failed to search device,no callback...";
        } else {
            if (this.initFlag) {
                LSManagerStatus managerStatus = getManagerStatus();
                if (managerStatus != LSManagerStatus.Free) {
                    generalLogInfo = getGeneralLogInfo(null, "failed to search device,status error=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true);
                } else {
                    if (isBluetoothAvailable()) {
                        setManagerStatus(LSManagerStatus.Scanning, "search device");
                        o.a().a(BroadcastType.ALL, list, onSearchingListener);
                        return true;
                    }
                    str = "failed to search device,bluetooth unavailable...";
                }
                printLogMessage(generalLogInfo);
                return false;
            }
            str = "failed to search device,no initManager...";
        }
        generalLogInfo = getPrintLogInfo(str, 1);
        printLogMessage(generalLogInfo);
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean setDevices(List list) {
        if (this.initFlag) {
            return u.a().a(list);
        }
        printLogMessage(getPrintLogInfo("failed to set measure device,uninitialize..", 1));
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void setManagerConfig(IBManagerConfig iBManagerConfig) {
        if (iBManagerConfig == null) {
            return;
        }
        printLogMessage(getGeneralLogInfo(null, "update config info = " + iBManagerConfig.toString(), com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        if (iBManagerConfig instanceof LSConnectionConfig) {
            this.mConnectionConfig = (LSConnectionConfig) iBManagerConfig;
            return;
        }
        if (iBManagerConfig instanceof LSScanIntervalConfig) {
            o.a().a(iBManagerConfig);
            return;
        }
        if (iBManagerConfig instanceof LSOtaProfilesConfig) {
            LSOtaProfilesConfig lSOtaProfilesConfig = (LSOtaProfilesConfig) iBManagerConfig;
            com.lifesense.plugin.ble.device.a.a.a.LOG_ALL_UPGRADE_FILE_DATA_PERMISSION = lSOtaProfilesConfig.isFullDebugPermission();
            com.lifesense.plugin.ble.device.a.a.a.DISABLE_RECONNECT = lSOtaProfilesConfig.isDisableReconnect();
            com.lifesense.plugin.ble.device.a.a.a.RECONNECT_COUNT = lSOtaProfilesConfig.getReconnectCount();
            return;
        }
        if (iBManagerConfig instanceof LSLoggerConfig) {
            if (((LSLoggerConfig) iBManagerConfig).isEnable()) {
                com.lifesense.plugin.ble.b.c.b();
            } else {
                com.lifesense.plugin.ble.b.c.a();
            }
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public synchronized boolean startDeviceSync(OnSyncingListener onSyncingListener) {
        if (!this.initFlag) {
            printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,uninitialized...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
            return false;
        }
        LSManagerStatus managerStatus = getManagerStatus();
        if (managerStatus == LSManagerStatus.Free) {
            printLogMessage(getSupperLogInfo(null, "start data syncing service from app.", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            setManagerStatus(LSManagerStatus.Syncing, "start data receive service");
            return u.a().a(onSyncingListener);
        }
        printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,manager status=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public synchronized boolean stopDeviceSync() {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("no permission to stop data syncing service,uninitialize...", 1));
            return false;
        }
        LSManagerStatus managerStatus = getManagerStatus();
        if (getManagerStatus() == LSManagerStatus.Pairing) {
            printLogMessage(getPrintLogInfo("failed to stop data syncing service,manager status=" + managerStatus, 1));
            return false;
        }
        printLogMessage(getSupperLogInfo(null, "stop data syncing service from app.", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
        if (getManagerStatus() == LSManagerStatus.Scanning) {
            o.a().b();
        }
        setManagerStatus(LSManagerStatus.Free, "stop data receive service");
        return u.a().d();
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public boolean stopSearch() {
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (this.initFlag) {
            LSManagerStatus managerStatus = getManagerStatus();
            if (managerStatus == LSManagerStatus.Scanning) {
                setManagerStatus(LSManagerStatus.Free, "stop search device");
                o.a().b();
                return true;
            }
            generalLogInfo = getGeneralLogInfo(null, "failed to stop search,manager status error=" + managerStatus, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true);
        } else {
            generalLogInfo = getPrintLogInfo("failed to stop search device,no initManager...", 1);
        }
        printLogMessage(generalLogInfo);
        return false;
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void unregisterBluetoothReceiver() {
        Context context;
        h hVar;
        if (!this.initFlag || (context = mAppContext) == null || !this.isRegisterBleStateReceiver || (hVar = this.mBleStateBroadcastReceiver) == null) {
            return;
        }
        try {
            this.isRegisterBleStateReceiver = false;
            context.unregisterReceiver(hVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void unregisterMessageService() {
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to unregister message service,uninitialize..", 1));
        } else {
            printLogMessage(getGeneralLogInfo(null, "unregister message service now... ", com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            com.lifesense.plugin.ble.device.a.a.g.a().d();
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void updatePhoneGpsStatus(boolean z) {
        Collection<LSDeviceInfo> collectionValues;
        q qVarD;
        if (!this.initFlag) {
            printLogMessage(getPrintLogInfo("failed to update gps status,uninitialized..", 1));
            return;
        }
        com.lifesense.plugin.ble.device.a.a.g.a().a(z ? ATGpsStatus.PositioningFailure : ATGpsStatus.Unavailable);
        Map mapC = u.a().c();
        if (mapC == null || mapC.size() == 0 || (collectionValues = mapC.values()) == null || collectionValues.size() == 0) {
            return;
        }
        byte[] bArrA = f.a(z);
        for (LSDeviceInfo lSDeviceInfo : collectionValues) {
            if (lSDeviceInfo != null && "04".equalsIgnoreCase(lSDeviceInfo.getDeviceType()) && LSProtocolType.A5.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) && (qVarD = u.a().d(lSDeviceInfo.getMacAddress())) != null && (qVarD instanceof com.lifesense.plugin.ble.device.proto.A5.o)) {
                com.lifesense.plugin.ble.a.a.o oVarM = qVarD.m();
                if (com.lifesense.plugin.ble.a.a.o.EnableDone == oVarM || com.lifesense.plugin.ble.a.a.o.DisableDone == oVarM || com.lifesense.plugin.ble.a.a.o.ReadDone == oVarM) {
                    com.lifesense.plugin.ble.device.a.a.a.b bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
                    String macAddress = lSDeviceInfo.getMacAddress();
                    bVar.a(bArrA);
                    bVar.a(macAddress);
                    bVar.a(167);
                    com.lifesense.plugin.ble.device.a.a.g.a().a(macAddress, bVar, new d(this));
                } else {
                    printLogMessage(getGeneralLogInfo(lSDeviceInfo.getMacAddress(), "failed to send gps status to device,status=" + oVarM, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                }
            }
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    @Deprecated
    public synchronized void upgradeDevice(String str, File file, OnUpgradingListener onUpgradingListener) {
        try {
            if (onUpgradingListener == null) {
                printLogMessage(getPrintLogInfo("failed to upgrading device's firmware,no callback..", 1));
                return;
            }
            String strB = com.lifesense.plugin.ble.c.b.b(str);
            if (!this.initFlag) {
                printLogMessage(getGeneralLogInfo(strB, "failed to upgrading,uninitialized....", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                onUpgradingListener.onStateChanged(strB, LSUpgradeState.UpgradeFailure, LSErrorCode.Uninitialized.getCode());
                return;
            }
            if (TextUtils.isEmpty(strB)) {
                printLogMessage(getGeneralLogInfo(strB, "failed to upgrading with device[" + strB + "]", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                onUpgradingListener.onStateChanged(strB, LSUpgradeState.UpgradeFailure, LSErrorCode.ParameterError.getCode());
                return;
            }
            if (!isBluetoothAvailable()) {
                printLogMessage(getGeneralLogInfo(strB, "failed to upgrading,bluetooth unavailable...", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                onUpgradingListener.onStateChanged(strB, LSUpgradeState.UpgradeFailure, LSErrorCode.BluetoothUnavailable.getCode());
                return;
            }
            LSConnectState lSConnectStateCheckConnectState = checkConnectState(strB);
            LSManagerStatus managerStatus = getManagerStatus();
            LSConnectState lSConnectState = LSConnectState.ConnectSuccess;
            if (lSConnectState != lSConnectStateCheckConnectState && managerStatus != LSManagerStatus.Free && managerStatus != LSManagerStatus.Upgrading) {
                printLogMessage(getGeneralLogInfo(strB, "failed to upgrading,managerStatus=" + managerStatus + "; connectStatus=" + lSConnectStateCheckConnectState, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                onUpgradingListener.onStateChanged(strB, LSUpgradeState.UpgradeFailure, LSErrorCode.ManagerStateError.getCode());
                return;
            }
            setManagerStatus(LSManagerStatus.Upgrading, "upgrade Device Firmware");
            printLogMessage(getGeneralLogInfo(strB, "upgrading with device=[" + strB + "]; connectState=" + lSConnectStateCheckConnectState, com.lifesense.plugin.ble.b.a.a.Operating_Msg, null, true));
            if (!com.lifesense.plugin.ble.device.a.a.a.a().b()) {
                com.lifesense.plugin.ble.device.a.a.a.a().a(mAppContext, this.mCentreWorkingStateListener);
            }
            o.a().d();
            q qVarD = u.a().d(strB);
            if (lSConnectState == lSConnectStateCheckConnectState && qVarD != null && (qVarD instanceof com.lifesense.plugin.ble.device.proto.A5.o)) {
            } else {
                com.lifesense.plugin.ble.device.a.a.a.a().a(strB, file, onUpgradingListener);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.lifesense.plugin.ble.IBluetoothManager
    public void pushDeviceMessage(String str, LSDeviceMessage lSDeviceMessage, OnSettingListener onSettingListener) {
        com.lifesense.plugin.ble.device.ancs.a aVar;
        com.lifesense.plugin.ble.device.a.a.a.b bVar;
        if (onSettingListener == null) {
            return;
        }
        if (!this.initFlag) {
            onSettingListener.onFailure(LSErrorCode.Uninitialized.getCode());
            return;
        }
        if (com.lifesense.plugin.ble.c.b.a(str) == null || lSDeviceMessage == null) {
            onSettingListener.onFailure(LSErrorCode.ParameterError.getCode());
            return;
        }
        if (checkConnectState(str) != LSConnectState.ConnectSuccess) {
            onSettingListener.onFailure(LSErrorCode.DeviceNotConnected.getCode());
            return;
        }
        com.lifesense.plugin.ble.device.a.a.a.e eVarA = com.lifesense.plugin.ble.device.a.a.a.a.a().a(str);
        if (eVarA != null) {
            com.lifesense.plugin.ble.device.a.a.a.c cVar = new com.lifesense.plugin.ble.device.a.a.a.c();
            cVar.a(str);
            cVar.a(onSettingListener);
            cVar.a(lSDeviceMessage);
            eVarA.a(cVar);
            return;
        }
        if (!(lSDeviceMessage instanceof ATImageMessage)) {
            if (lSDeviceMessage instanceof ATTextMessage) {
                ATTextMessage aTTextMessage = (ATTextMessage) lSDeviceMessage;
                aVar = new com.lifesense.plugin.ble.device.ancs.a(aTTextMessage.getTitle(), aTTextMessage.getContent(), aTTextMessage.getMsgCategory().getValue());
                if (aTTextMessage.getMsgCategory() == LSAppCategory.IncomingCall) {
                    if (aTTextMessage.getPhoneState() != null) {
                        aVar.b(aTTextMessage.getPhoneState().getValue());
                    }
                    bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
                    bVar.a(aVar);
                    bVar.a(2);
                } else {
                    bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
                }
                com.lifesense.plugin.ble.device.a.a.g.a().a(str, bVar, onSettingListener);
            }
            return;
        }
        ATImageMessage aTImageMessage = (ATImageMessage) lSDeviceMessage;
        aVar = new com.lifesense.plugin.ble.device.ancs.a(aTImageMessage.getTitle(), aTImageMessage.getContent(), aTImageMessage.getMsgCategory().getValue());
        aVar.a(aTImageMessage);
        bVar = new com.lifesense.plugin.ble.device.a.a.a.b();
        bVar.a(aVar);
        bVar.a(3);
        com.lifesense.plugin.ble.device.a.a.g.a().a(str, bVar, onSettingListener);
    }
}
