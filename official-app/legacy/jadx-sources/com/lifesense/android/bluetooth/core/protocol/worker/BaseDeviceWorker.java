package com.lifesense.android.bluetooth.core.protocol.worker;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import androidx.camera.core.RetryPolicy;
import com.lifesense.android.bluetooth.core.OnDeviceReadListener;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.CharacteristicStatus;
import com.lifesense.android.bluetooth.core.bean.constant.ConnectionStableStatus;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceRegisterState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceUpgradeStatus;
import com.lifesense.android.bluetooth.core.bean.constant.DisconnectStatus;
import com.lifesense.android.bluetooth.core.bean.constant.GattServiceType;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.bean.constant.PairedConfirmState;
import com.lifesense.android.bluetooth.core.business.g;
import com.lifesense.android.bluetooth.core.tools.e;
import com.oplus.aiunit.vision.mla;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.LinkedList;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale", "NewApi"})
public abstract class BaseDeviceWorker extends com.lifesense.android.bluetooth.core.system.gatt.a implements com.lifesense.android.bluetooth.core.business.push.b, com.lifesense.android.bluetooth.core.protocol.worker.a {
    public Context appContext;
    public Runnable connectionTimeoutRunnable;
    public String currentCmdVersion;
    public com.lifesense.android.bluetooth.core.protocol.stack.a currentProtocolMessage;
    public Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> currentProtocolMessageQueue;
    public com.lifesense.android.bluetooth.core.protocol.stack.b currentWorkingflow;
    public int deviceBondState;
    public Runnable discoverServiceTimeoutRunnable;
    public GattServiceType enableGattService;
    public boolean isBondSuccess;
    public boolean isRemoveReconnectTask;
    public boolean isSetNotifyDone;
    public boolean isSleepingBeforeDiscoverService;
    public com.lifesense.android.bluetooth.core.protocol.worker.b mBaseGattHandlerListener;
    public com.lifesense.android.bluetooth.core.business.a mDeviceProcessListener;
    public DisconnectStatus mDisconnectStatus;
    public Handler mWorkerHandler;
    public HandlerThread mWorkerHandlerThread;
    public String mWorkerName;
    public com.lifesense.android.bluetooth.core.business.b mWorkingStatus;
    public int reconnectCount;
    public Runnable reconnectRunnable;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "reconnect message >> " + BaseDeviceWorker.this.mDeviceAddress;
            BaseDeviceWorker baseDeviceWorker = BaseDeviceWorker.this;
            baseDeviceWorker.printLogMessage(baseDeviceWorker.getSupperLogInfo(baseDeviceWorker.sourceMacAddress, str, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
            Log.i("BLUETOOTH", "POST_RECONNECT_MESSAGE_TIMER");
            BaseDeviceWorker.this.postDeviceReconnectMessage();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.lifesense.android.bluetooth.core.business.detect.a.getInstance().a(ConnectionStableStatus.CONNECTION_UNSTABLE_2);
            String str = "connection timeout message >> " + BaseDeviceWorker.this.mDeviceAddress;
            BaseDeviceWorker baseDeviceWorker = BaseDeviceWorker.this;
            baseDeviceWorker.printLogMessage(baseDeviceWorker.getSupperLogInfo(baseDeviceWorker.sourceMacAddress, str, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
            BaseDeviceWorker.this.postConnectionTimeoutMessage();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DeviceConnectState.CONNECTED_SUCCESS == BaseDeviceWorker.this.mDeviceConnectState) {
                BaseDeviceWorker baseDeviceWorker = BaseDeviceWorker.this;
                baseDeviceWorker.printLogMessage(baseDeviceWorker.getSupperLogInfo(baseDeviceWorker.mDeviceAddress, "unhandle discover services timeout...", com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
                return;
            }
            String str = "discover services timeout message >> " + BaseDeviceWorker.this.mDeviceAddress;
            BaseDeviceWorker baseDeviceWorker2 = BaseDeviceWorker.this;
            baseDeviceWorker2.printLogMessage(baseDeviceWorker2.getSupperLogInfo(baseDeviceWorker2.sourceMacAddress, str, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
            BaseDeviceWorker.this.isNeedRefershGattService = true;
            BaseDeviceWorker.this.postConnectionTimeoutMessage();
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BaseDeviceWorker.this.parseHandlerMessage(message);
        }
    }

    public BaseDeviceWorker(String str) {
        super(str);
        this.reconnectRunnable = new a();
        this.connectionTimeoutRunnable = new b();
        this.discoverServiceTimeoutRunnable = new c();
        this.isSleepingBeforeDiscoverService = false;
        this.mWorkerName = str;
        if (!TextUtils.isEmpty(str)) {
            this.mWorkerName = str.replace(":", "").toUpperCase();
        }
        HandlerThread handlerThread = new HandlerThread("WorkerHandler[" + this.mWorkerName + "]");
        this.mWorkerHandlerThread = handlerThread;
        handlerThread.start();
        this.mWorkerHandler = new d(this.mWorkerHandlerThread.getLooper());
        this.mWorkerHandlerThread.setPriority(10);
        super.init(this);
    }

    public synchronized void addResponsePacket(String str, UUID uuid, UUID uuid2, int i, PacketProfile packetProfile, com.lifesense.android.bluetooth.core.protocol.frame.c cVar) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Write_Response;
        if (1 == i) {
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Write_No_Response;
        }
        com.lifesense.android.bluetooth.core.business.log.report.a aVar2 = aVar;
        String strA = com.lifesense.android.bluetooth.core.tools.a.a(uuid2);
        if (str != null && str.length() != 0) {
            if (uuid != null && uuid2 != null) {
                DeviceConnectState deviceConnectState = DeviceConnectState.CONNECTED_SUCCESS;
                DeviceConnectState deviceConnectState2 = this.mDeviceConnectState;
                if (deviceConnectState == deviceConnectState2 || DeviceConnectState.CONNECTED_GATT == deviceConnectState2) {
                    writeResponsePackage(str, uuid, uuid2, i, packetProfile, cVar, null);
                    return;
                }
                printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to write response packet,device is not connected..." + this.mDeviceConnectState + " ,status >>" + getCurrentStatus(), aVar2, strA, false));
                return;
            }
            printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to write response packet with error service or characteristic,status >>" + getCurrentStatus(), aVar2, strA, false));
            return;
        }
        printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to write response packet with null,status >>" + getCurrentStatus(), aVar2, strA, false));
    }

    public synchronized void addResponsePacketWithBytes(byte[] bArr, UUID uuid, UUID uuid2, int i, int i2, int i3, com.lifesense.android.bluetooth.core.protocol.frame.c cVar) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Write_Response;
        if (1 == i) {
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Write_No_Response;
        }
        String strA = com.lifesense.android.bluetooth.core.tools.a.a(uuid2);
        if (bArr != null && bArr.length != 0) {
            if (uuid != null && uuid2 != null) {
                DeviceConnectState deviceConnectState = DeviceConnectState.CONNECTED_SUCCESS;
                DeviceConnectState deviceConnectState2 = this.mDeviceConnectState;
                if (deviceConnectState != deviceConnectState2 && DeviceConnectState.CONNECTED_GATT != deviceConnectState2) {
                    printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to add response packet,device is not connected..." + this.mDeviceConnectState + " ,status >>" + getCurrentStatus(), aVar, strA, false));
                    return;
                }
                String strC = e.c(bArr);
                com.lifesense.android.bluetooth.core.system.gatt.common.b lastGattMsg = getLastGattMsg();
                if (lastGattMsg == null || strC == null || lastGattMsg.e() == null || !strC.equalsIgnoreCase(lastGattMsg.e().b())) {
                    writeResponsePackage(strC, uuid, uuid2, i, i2, i3, cVar, bArr);
                    return;
                }
                return;
            }
            printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to write response packet with error service or characteristic,status >>" + getCurrentStatus(), aVar, strA, false));
            return;
        }
        printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to write response packet with null,status >>" + getCurrentStatus(), aVar, strA, false));
    }

    public void cancelConnectionTimeout() {
        Handler handler = this.mWorkerHandler;
        if (handler != null) {
            handler.removeCallbacks(this.connectionTimeoutRunnable);
            this.mWorkerHandler.removeCallbacks(this.reconnectRunnable);
            this.mWorkerHandler.removeCallbacks(this.discoverServiceTimeoutRunnable);
        }
    }

    public void cancelReconnectTask() {
        this.isRemoveReconnectTask = true;
        Handler handler = this.mWorkerHandler;
        if (handler != null) {
            handler.removeCallbacks(this.reconnectRunnable);
        }
    }

    public boolean checkReconnectPermission(int i, int i2) {
        return this.reconnectCount < i2;
    }

    public void clearAllHandlerRunnable() {
        try {
            this.isRemoveReconnectTask = true;
            Handler handler = this.mWorkerHandler;
            if (handler != null) {
                handler.removeCallbacks(this.connectionTimeoutRunnable);
                this.mWorkerHandler.removeCallbacks(this.reconnectRunnable);
                this.mWorkerHandler.removeCallbacks(this.discoverServiceTimeoutRunnable);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public synchronized void clearWorkerHandler() {
        String simpleName = getClass().getSimpleName();
        try {
            this.isRemoveReconnectTask = true;
            clearAllHandlerRunnable();
            if (this.mWorkerHandlerThread != null) {
                this.mWorkerHandler.removeCallbacksAndMessages(null);
                printLogMessage(getSupperLogInfo(this.sourceMacAddress, "clear worker:" + simpleName + "[" + this.mWorkerName + "]", com.lifesense.android.bluetooth.core.business.log.report.a.Release_Resources, null, true));
                this.mWorkerHandlerThread.quitSafely();
                this.mWorkerHandlerThread = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getSupperLogInfo(this.sourceMacAddress, "failed to clear handler,has exception:" + simpleName, com.lifesense.android.bluetooth.core.business.log.report.a.Release_Resources, null, true));
        }
    }

    public synchronized void connectWithAddress(String str, Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> queue, com.lifesense.android.bluetooth.core.protocol.worker.b bVar, com.lifesense.android.bluetooth.core.business.b bVar2) {
        initObjectParameters();
        this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.SYNCING;
        if (bVar2 != null) {
            this.mWorkingStatus = bVar2;
        }
        this.isBondSuccess = false;
        this.isGattClose = false;
        this.mDeviceConnectState = DeviceConnectState.CONNECTING;
        this.mDeviceAddress = str.toUpperCase();
        this.mBaseGattHandlerListener = bVar;
        LinkedList linkedList = new LinkedList(queue);
        this.currentProtocolMessageQueue = linkedList;
        this.enableGattService = GattServiceType.ALL;
        com.lifesense.android.bluetooth.core.protocol.stack.a aVar = (com.lifesense.android.bluetooth.core.protocol.stack.a) linkedList.remove();
        this.currentProtocolMessage = aVar;
        this.currentWorkingflow = aVar.a();
        com.lifesense.android.bluetooth.core.system.connect.a.getInstance().a(this.mDeviceAddress, this.mDeviceInfo, com.lifesense.android.bluetooth.core.system.b.getInstance().e(this.mDeviceAddress), this.mBluetoothGattCallback);
    }

    public synchronized void disconnectGatt(DisconnectStatus disconnectStatus) {
        Thread.currentThread().getStackTrace();
        if (!this.isGattClose) {
            this.mCreateBluetoothGatt = null;
            printLogMessage(getPrintLogInfo("cancel gatt connection with status =" + disconnectStatus + "; current flow=" + getCurrentStatus(), 3));
            this.isGattClose = true;
            com.lifesense.android.bluetooth.core.system.connect.a.getInstance().a(this.mBluetoothGatt, this.mDeviceAddress, false);
        }
        if (DisconnectStatus.CLOSE == disconnectStatus) {
            this.mCreateBluetoothGatt = null;
            com.lifesense.android.bluetooth.core.system.connect.a.getInstance().b(this.mDeviceAddress, this.mBluetoothGatt, false);
        }
    }

    public synchronized void disconnectGattWithBlocking() {
        com.lifesense.android.bluetooth.core.system.connect.a aVar;
        BluetoothGatt bluetoothGatt;
        String str;
        printLogMessage(getSupperLogInfo(this.mDeviceAddress, "connection timeout!device=" + this.mDeviceAddress, com.lifesense.android.bluetooth.core.business.log.report.a.Connect_Timeout, null, true));
        if (this.mBluetoothGatt == null) {
            this.isGattClose = true;
            this.mDisconnectStatus = DisconnectStatus.UNKNOWN;
            this.currentWorkingflow = com.lifesense.android.bluetooth.core.protocol.stack.b.FREE;
            this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.FREE;
            aVar = com.lifesense.android.bluetooth.core.system.connect.a.getInstance();
            bluetoothGatt = this.mBluetoothGatt;
            str = this.mDeviceAddress;
        } else {
            DisconnectStatus disconnectStatus = DisconnectStatus.CANCEL;
            if (!this.isGattClose) {
                printLogMessage(getPrintLogInfo("cancel gatt connection with status =" + disconnectStatus + "; current flow=" + getCurrentStatus(), 3));
                this.isGattClose = true;
                aVar = com.lifesense.android.bluetooth.core.system.connect.a.getInstance();
                bluetoothGatt = this.mBluetoothGatt;
                str = this.mDeviceAddress;
            }
        }
        aVar.a(bluetoothGatt, str, true);
    }

    public CharacteristicStatus getCharacteristicStatus() {
        return this.mCharacteristicStatus;
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public LsDeviceInfo getCurrentDevice() {
        return this.mDeviceInfo;
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public String getCurrentStatus() {
        try {
            com.lifesense.android.bluetooth.core.protocol.stack.b bVar = this.currentWorkingflow;
            return (bVar == null || TextUtils.isEmpty(bVar.toString())) ? "null" : this.currentWorkingflow.toString().replace('_', mla.SEPARATOR).replace("XOR", "default").toLowerCase();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception";
        }
    }

    public String getDeviceBroadcastId() {
        String str = this.mDeviceAddress;
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.mDeviceAddress.replace(":", "").toUpperCase();
    }

    public int getDeviceConnectCount() {
        return this.reconnectCount;
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public DeviceConnectState getDeviceConnectState() {
        return this.mDeviceConnectState;
    }

    public com.lifesense.android.bluetooth.core.business.a getDeviceProcessListener() {
        return this.mDeviceProcessListener;
    }

    public synchronized com.lifesense.android.bluetooth.core.protocol.stack.b getNextWorkingflow() {
        Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> queue = this.currentProtocolMessageQueue;
        if (queue == null) {
            this.currentProtocolMessage = null;
            this.currentWorkingflow = null;
            return null;
        }
        queue.remove(this.currentProtocolMessage);
        com.lifesense.android.bluetooth.core.protocol.stack.a aVarPeek = this.currentProtocolMessageQueue.peek();
        this.currentProtocolMessage = aVarPeek;
        if (aVarPeek == null || aVarPeek.a() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to get next protocol message from queue >> ");
            sb.append(this.currentProtocolMessage);
            return null;
        }
        this.currentWorkingflow = this.currentProtocolMessage.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("next step is :");
        sb2.append(this.currentWorkingflow);
        return this.currentWorkingflow;
    }

    public g getPushCentreCallback() {
        return com.lifesense.android.bluetooth.core.business.push.c.getInstance().getPushCentreCallback();
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public String getSourceMacAddress() {
        return this.sourceMacAddress;
    }

    public int getUpgradeProgressValue() {
        return 0;
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> getUpgradeProtocolStack() {
        return null;
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public DeviceUpgradeStatus getUpgradeStatus() {
        return null;
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public Handler getWorkerHandler() {
        return this.mWorkerHandler;
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public String getWriteCharacteristicStatus() {
        return null;
    }

    public void initConnectionTimeout() {
        Handler handler;
        if (this.mWorkerHandlerThread == null || (handler = this.mWorkerHandler) == null) {
            return;
        }
        handler.removeCallbacks(this.connectionTimeoutRunnable);
        this.mWorkerHandler.postDelayed(this.connectionTimeoutRunnable, SauAarConstants.f);
    }

    public void initDiscoverServiceTimeout() {
        Handler handler;
        if (this.mWorkerHandlerThread == null || (handler = this.mWorkerHandler) == null) {
            return;
        }
        handler.removeCallbacks(this.discoverServiceTimeoutRunnable);
        this.mWorkerHandler.postDelayed(this.discoverServiceTimeoutRunnable, 60000L);
    }

    public void initObjectParameters() {
        this.mDisconnectStatus = null;
        this.mCharacteristicStatus = CharacteristicStatus.UNKNOWN;
        this.mDeviceConnectState = DeviceConnectState.UNKNOWN;
        this.isServiceDiscovered = false;
        this.isCancelConnection = false;
        this.mBluetoothGatt = null;
        this.mConnectedStartTime = 0L;
        super.init(this);
    }

    public synchronized void initWithMacAddress(Context context, LsDeviceInfo lsDeviceInfo, Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> queue) {
        this.appContext = context;
        this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.FREE;
        this.currentWorkingflow = com.lifesense.android.bluetooth.core.protocol.stack.b.FREE;
        this.mDeviceConnectState = DeviceConnectState.UNKNOWN;
        this.isCancelConnection = false;
        this.sourceMacAddress = lsDeviceInfo.getMacAddress().toUpperCase();
        this.mDeviceInfo = lsDeviceInfo;
    }

    public synchronized void initialize(String str, LsDeviceInfo lsDeviceInfo, Context context) {
        this.appContext = context;
        this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.FREE;
        this.currentWorkingflow = com.lifesense.android.bluetooth.core.protocol.stack.b.FREE;
        this.mDeviceConnectState = DeviceConnectState.UNKNOWN;
        this.isCancelConnection = false;
        this.isBondSuccess = false;
        this.mConnectedStartTime = 0L;
        if (context != null) {
            new IntentFilter().addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        }
        if (str == null || str.length() <= 0 || lsDeviceInfo == null) {
            this.mDeviceInfo = null;
            this.sourceMacAddress = null;
        } else {
            this.mDeviceInfo = lsDeviceInfo;
            this.mDeviceAddress = str.toUpperCase();
            this.sourceMacAddress = str.toUpperCase();
            com.lifesense.android.bluetooth.core.business.push.c.getInstance().a(this.sourceMacAddress, this);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public synchronized void interrupt() {
        this.isCancelConnection = true;
        if (this.mBluetoothGatt == null) {
            this.isGattClose = true;
        }
        this.mDisconnectStatus = DisconnectStatus.UNKNOWN;
        this.currentWorkingflow = com.lifesense.android.bluetooth.core.protocol.stack.b.FREE;
        this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.FREE;
    }

    public boolean isAbnormalDisconnect() {
        return this.abnormalDisconnectStatus;
    }

    public boolean isDeviceInfoReadable() {
        com.lifesense.android.bluetooth.core.system.gatt.common.e eVar = this.mDeviceGattService;
        return eVar != null && eVar.j();
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public boolean isEnableLogUpgradeFileAllData(UUID uuid, int i, byte[] bArr) {
        return true;
    }

    public synchronized boolean isProactiveDisconnect() {
        return this.isCancelConnection && this.isGattClose;
    }

    public boolean isServiceDiscoveredSuccess() {
        com.lifesense.android.bluetooth.core.system.gatt.common.e eVar;
        if (this.isServiceDiscovered && (eVar = this.mDeviceGattService) != null) {
            return eVar.h();
        }
        return false;
    }

    public void parseCharacteristicReadResults(UUID uuid, UUID uuid2, byte[] bArr) {
        com.lifesense.android.bluetooth.core.protocol.a aVarA;
        if (this.mDeviceInfo == null || (aVarA = com.lifesense.android.bluetooth.core.protocol.a.a(uuid2)) == null) {
            return;
        }
        aVarA.a(this.mDeviceInfo, bArr);
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postBluetoothGattCreated(BluetoothGatt bluetoothGatt) {
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postCancelConnectionRequest(DisconnectStatus disconnectStatus) {
        disconnectGatt(disconnectStatus);
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postCharacteristicActionStateChange(CharacteristicStatus characteristicStatus, UUID uuid, UUID uuid2) {
        if (CharacteristicStatus.ENABLE_DONE == characteristicStatus) {
            cancelConnectionTimeout();
        }
        com.lifesense.android.bluetooth.core.protocol.worker.b bVar = this.mBaseGattHandlerListener;
        if (bVar != null) {
            bVar.onCharacteristicStatusChange(characteristicStatus, true, uuid, uuid2);
            return;
        }
        printLogMessage(getPrintLogInfo("faield to callback characteristic status change >>" + characteristicStatus, 1));
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postCharacteristicChange(UUID uuid, UUID uuid2, byte[] bArr) {
        com.lifesense.android.bluetooth.core.protocol.worker.b bVar = this.mBaseGattHandlerListener;
        if (bVar != null) {
            bVar.onCharacteristicChange(uuid, uuid2, bArr);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postCharacteristicRead(UUID uuid, UUID uuid2, byte[] bArr) {
        com.lifesense.android.bluetooth.core.protocol.worker.b bVar = this.mBaseGattHandlerListener;
        if (bVar != null) {
            bVar.onCharacteristicRead(uuid, uuid2, bArr);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postCharacteristicWrite(UUID uuid, UUID uuid2, byte[] bArr, com.lifesense.android.bluetooth.core.protocol.frame.c cVar) {
        com.lifesense.android.bluetooth.core.protocol.worker.b bVar = this.mBaseGattHandlerListener;
        if (bVar != null) {
            bVar.onCharacteristicWrite(uuid, uuid2, bArr, cVar);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postConnectionRequest(String str) {
        com.lifesense.android.bluetooth.core.protocol.worker.b bVar = this.mBaseGattHandlerListener;
        if (bVar != null) {
            bVar.onConnectionRequestNotify(str);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postDeviceConnectStateChange(BluetoothGatt bluetoothGatt, DeviceConnectState deviceConnectState, int i, int i2) {
        if (DeviceConnectState.CONNECTED_GATT == deviceConnectState) {
            try {
                Thread.sleep(RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS);
            } catch (Exception unused) {
            }
            if (isProactiveDisconnect()) {
                printLogMessage(getAdvancedLogInfo(this.sourceMacAddress, "no permission to sent discover service request,devcie is disconnect...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                return;
            }
            cancelConnectionTimeout();
            initDiscoverServiceTimeout();
            this.mDeviceGattService = null;
            com.lifesense.android.bluetooth.core.system.b.getInstance().b(bluetoothGatt, bluetoothGatt.getDevice().getAddress());
            com.lifesense.android.bluetooth.core.business.c.a().a(this.mDeviceAddress, this);
        } else if (DeviceConnectState.DISCONNECTED == deviceConnectState) {
            cancelConnectionTimeout();
            com.lifesense.android.bluetooth.core.business.c.a().b(this.mDeviceAddress);
        }
        com.lifesense.android.bluetooth.core.protocol.worker.b bVar = this.mBaseGattHandlerListener;
        if (bVar != null) {
            bVar.onConnectionStateChange(getDeviceBroadcastId(), deviceConnectState);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postDeviceReconnectRequest(String str) {
        if (isProactiveDisconnect()) {
            printLogMessage(getGeneralLogInfo(str, "no permission to handle reconnect request,has stop!" + str, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return;
        }
        Log.i("BLUETOOTH", "POST_RECONNECT_MESSAGE");
        if (this.mWorkerHandlerThread == null) {
            printLogMessage(getGeneralLogInfo(this.mDeviceAddress, "failed to post device reconnect message,has stop", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return;
        }
        cancelReconnectTask();
        this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.FREE;
        postDeviceReconnectMessage();
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postGattServiceDiscovered(BluetoothGatt bluetoothGatt, int i, com.lifesense.android.bluetooth.core.system.gatt.common.e eVar) {
        String str;
        com.lifesense.android.bluetooth.core.business.log.report.a aVar;
        String str2;
        if (eVar == null) {
            str2 = "failed to discover gatt service,gattStatus=" + i + "; obj=" + bluetoothGatt;
            str = this.sourceMacAddress;
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Discover_Service;
        } else {
            if (eVar.h()) {
                com.lifesense.android.bluetooth.core.protocol.worker.b bVar = this.mBaseGattHandlerListener;
                if (bVar != null) {
                    bVar.onServicesDiscover(eVar);
                    return;
                }
                return;
            }
            str = this.sourceMacAddress;
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Discover_Service;
            str2 = "failed to discover gatt service,incomplete...";
        }
        printLogMessage(getGeneralLogInfo(str, str2, aVar, null, false));
        disconnectGatt(DisconnectStatus.CANCEL);
    }

    @Override // com.lifesense.android.bluetooth.core.system.gatt.d
    public void postWriteCharacteristicTimeout(com.lifesense.android.bluetooth.core.system.gatt.common.b bVar) {
        if (bVar == null || bVar.e() == null) {
            return;
        }
        printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "write timeout >> " + bVar.e().b(), com.lifesense.android.bluetooth.core.business.log.report.a.Write_Timeout, com.lifesense.android.bluetooth.core.tools.a.a(bVar.e().d()), true));
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public void readDeviceVoltage(OnDeviceReadListener onDeviceReadListener) {
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public void registerDeviceCentreCallback(com.lifesense.android.bluetooth.core.business.a aVar) {
        this.mDeviceProcessListener = aVar;
    }

    public synchronized void requestCancelConnection() {
        printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "send disconnect request from app now...." + this.mBluetoothGattCallback, com.lifesense.android.bluetooth.core.business.log.report.a.Request_Disconnect, null, true));
        this.isCancelConnection = true;
        if (this.mBluetoothGatt == null) {
            this.isGattClose = true;
            this.mDisconnectStatus = DisconnectStatus.UNKNOWN;
            this.currentWorkingflow = com.lifesense.android.bluetooth.core.protocol.stack.b.FREE;
            this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.FREE;
            com.lifesense.android.bluetooth.core.system.connect.a.getInstance().a(this.mBluetoothGatt, this.mDeviceAddress, true);
        } else {
            disconnectGatt(DisconnectStatus.REQUEST);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public void setDeviceConnect(DeviceConnectState deviceConnectState) {
        this.mDeviceConnectState = deviceConnectState;
        this.mBaseGattHandlerListener.onConnectionStateChange(getDeviceBroadcastId(), deviceConnectState);
    }

    public void setDeviceConnectState(DeviceConnectState deviceConnectState) {
        this.mDeviceConnectState = deviceConnectState;
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public void setPairingConfirm(int i, PairedConfirmState pairedConfirmState) {
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public void setPairingDeviceId(String str, DeviceRegisterState deviceRegisterState) {
    }

    public int setPairingRandom(String str) {
        return 0;
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public void setUnbindState(boolean z) {
    }

    @Override // com.lifesense.android.bluetooth.core.protocol.worker.a
    public void writeCommandToDevice(byte[] bArr, UUID uuid, UUID uuid2) {
        addResponsePacketWithBytes(bArr, uuid, uuid2, 1, PacketProfile.UNKNOWN, com.lifesense.android.bluetooth.core.protocol.frame.c.UNKNOWN);
        handleNextBluetoothGattEvent();
    }

    public synchronized void addResponsePacketWithBytes(byte[] bArr, UUID uuid, UUID uuid2, int i, PacketProfile packetProfile, com.lifesense.android.bluetooth.core.protocol.frame.c cVar) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Write_Response;
        if (1 == i) {
            aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Write_No_Response;
        }
        com.lifesense.android.bluetooth.core.business.log.report.a aVar2 = aVar;
        String strA = com.lifesense.android.bluetooth.core.tools.a.a(uuid2);
        if (bArr != null && bArr.length != 0) {
            if (uuid != null && uuid2 != null) {
                DeviceConnectState deviceConnectState = DeviceConnectState.CONNECTED_SUCCESS;
                DeviceConnectState deviceConnectState2 = this.mDeviceConnectState;
                if (deviceConnectState == deviceConnectState2 || DeviceConnectState.CONNECTED_GATT == deviceConnectState2) {
                    writeResponsePackage(e.c(bArr), uuid, uuid2, i, packetProfile, cVar, bArr);
                    return;
                }
                printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to add response packet,device is not connected..." + this.mDeviceConnectState + " ,status >>" + getCurrentStatus(), aVar2, strA, false));
                return;
            }
            printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to write response packet with error service or characteristic,status >>" + getCurrentStatus(), aVar2, strA, false));
            return;
        }
        printLogMessage(getGeneralLogInfo(this.sourceMacAddress, "failed to write response packet with null,status >>" + getCurrentStatus(), aVar2, strA, false));
    }

    public synchronized void initWithMacAddress(Context context, String str, Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> queue) {
        this.appContext = context;
        this.mWorkingStatus = com.lifesense.android.bluetooth.core.business.b.FREE;
        this.currentWorkingflow = com.lifesense.android.bluetooth.core.protocol.stack.b.FREE;
        this.mDeviceConnectState = DeviceConnectState.UNKNOWN;
        this.isCancelConnection = false;
        this.sourceMacAddress = str.toUpperCase();
    }
}
