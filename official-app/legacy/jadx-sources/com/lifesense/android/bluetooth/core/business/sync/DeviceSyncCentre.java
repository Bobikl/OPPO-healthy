package com.lifesense.android.bluetooth.core.business.sync;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.lifesense.android.bluetooth.core.OnDeviceReadListener;
import com.lifesense.android.bluetooth.core.ReceiveDataCallback;
import com.lifesense.android.bluetooth.core.bean.BaseDeviceData;
import com.lifesense.android.bluetooth.core.bean.BleScanResults;
import com.lifesense.android.bluetooth.core.bean.HandlerMessage;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.BroadcastType;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;
import com.lifesense.android.bluetooth.core.bean.constant.ErrorCode;
import com.lifesense.android.bluetooth.core.bean.constant.GattServiceType;
import com.lifesense.android.bluetooth.core.bean.constant.ManagerStatus;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.bean.constant.ScanMode;
import com.lifesense.android.bluetooth.core.business.h;
import com.lifesense.android.bluetooth.core.business.j;
import com.lifesense.android.bluetooth.core.business.log.d;
import com.lifesense.android.bluetooth.core.enums.ProtocolType;
import com.lifesense.android.bluetooth.core.protocol.parser.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale"})
public class DeviceSyncCentre extends com.lifesense.android.bluetooth.core.business.sync.b implements h {
    public static DeviceSyncCentre mDeviceCentre;
    public ManagerStatus currentManagerStatus;
    public Handler deviceCentreHandler;
    public HandlerThread deviceCentreThread;
    public List<DeviceType> enableConnectDeviceTypes;
    public boolean isStopDataReceived;
    public Map<String, com.lifesense.android.bluetooth.core.protocol.worker.a> longConnectedDeviceMap;
    public List<String> mDisableDataSyncDevices;
    public ReceiveDataCallback mReceiveDataCallback;
    public Map<String, LsDeviceInfo> measuredDeviceMap;

    public class a implements Runnable {
        public final /* synthetic */ GattServiceType a;
        public final /* synthetic */ List b;

        public a(GattServiceType gattServiceType, List list) {
            this.a = gattServiceType;
            this.b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (GattServiceType.CALL_SERVICE != this.a) {
                if (DeviceSyncCentre.this.mDisableDataSyncDevices.size() <= 0 || GattServiceType.ALL != this.a) {
                    return;
                }
                DeviceSyncCentre.this.mDisableDataSyncDevices.clear();
                return;
            }
            for (String str : this.b) {
                if (str != null && !DeviceSyncCentre.this.mDisableDataSyncDevices.contains(str)) {
                    DeviceSyncCentre.this.mDisableDataSyncDevices.add(str);
                }
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message == null || (obj = message.obj) == null) {
                String str = "faield to callback measure data,obj is null...; msg=" + message + "; data callback=" + DeviceSyncCentre.this.mReceiveDataCallback;
                DeviceSyncCentre deviceSyncCentre = DeviceSyncCentre.this;
                deviceSyncCentre.printLogMessage(deviceSyncCentre.getGeneralLogInfo(null, str, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
                return;
            }
            int i = message.arg1;
            if (1 == i) {
                DeviceSyncCentre.this.handleScanResults((LsDeviceInfo) obj);
                return;
            }
            if (2 == i) {
                DeviceSyncCentre.this.parsingMultiProtocolMeasureData((HandlerMessage) obj);
                return;
            }
            if (5 == i) {
                HandlerMessage handlerMessage = (HandlerMessage) obj;
                DeviceSyncCentre.this.callbackDeviceConnectState(handlerMessage.getMacAddress(), handlerMessage.getConnectState(), handlerMessage.getProtocolHandler());
                if (handlerMessage.getProtocolHandler() == null) {
                    return;
                }
                DeviceSyncCentre.this.restartDataSync(false);
                return;
            }
            if (7 == i && DeviceSyncCentre.this.mReceiveDataCallback != null) {
                DeviceSyncCentre.this.mReceiveDataCallback.onReceiveDeviceInfo((LsDeviceInfo) message.obj);
                return;
            }
            if (16 == message.arg1 && DeviceSyncCentre.this.mReceiveDataCallback != null) {
                HandlerMessage handlerMessage2 = (HandlerMessage) message.obj;
                DeviceSyncCentre.this.mReceiveDataCallback.onWeightScaleInfoUpdate(handlerMessage2.getData(), handlerMessage2.getPacketType(), handlerMessage2.getSrcData());
                return;
            }
            int i2 = message.arg1;
            if (17 == i2) {
                DeviceSyncCentre.this.callbackDeviceMeasureData(message.obj);
            } else if (3 == i2) {
                DeviceSyncCentre.this.parsingDeviceInfoData((HandlerMessage) message.obj);
            }
        }
    }

    private synchronized boolean addScanDeviceType(DeviceType deviceType) {
        List<DeviceType> list;
        if (deviceType != null) {
            if (deviceType != DeviceType.UNKNOWN && (list = this.enableConnectDeviceTypes) != null) {
                if (!list.contains(deviceType)) {
                    this.enableConnectDeviceTypes.add(deviceType);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void callbackDeviceConnectState(String str, DeviceConnectState deviceConnectState, com.lifesense.android.bluetooth.core.protocol.worker.a aVar) {
        if (str == null) {
            return;
        }
        if (this.mReceiveDataCallback != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("callback connect sate=");
            sb.append(deviceConnectState);
            sb.append("; device=");
            sb.append(str);
            this.mReceiveDataCallback.onDeviceConnectStateChange(deviceConnectState, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackDeviceMeasureData(Object obj) {
        StringBuilder sb;
        String str;
        if (obj == null) {
            return;
        }
        if (this.mReceiveDataCallback == null) {
            sb = new StringBuilder();
            str = "failed to callback device's measure data,no listener >> ";
        } else {
            sb = new StringBuilder();
            str = "failed to callback undefine measure data >> ";
        }
        sb.append(str);
        sb.append(obj.toString());
        printLogMessage(getGeneralLogInfo(null, sb.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
    }

    private synchronized LsDeviceInfo findTargetDeviceFromMap(LsDeviceInfo lsDeviceInfo) {
        LsDeviceInfo lsDeviceInfo2;
        Map<String, LsDeviceInfo> map = this.measuredDeviceMap;
        if (map == null || map.size() <= 0) {
            lsDeviceInfo2 = null;
        } else {
            Iterator<String> it = this.measuredDeviceMap.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String next = it.next();
                    String str = lsDeviceInfo.getDeviceType() + lsDeviceInfo.getBroadcastID();
                    if (lsDeviceInfo.getBroadcastID() != null && (next.contains(lsDeviceInfo.getBroadcastID()) || next.contains(str))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("success to get device from map with key=");
                        sb.append(next);
                        lsDeviceInfo2 = this.measuredDeviceMap.get(next);
                    }
                } else {
                    lsDeviceInfo2 = null;
                }
            }
        }
        if (lsDeviceInfo2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("find device by broacast name(");
            sb2.append(lsDeviceInfo.getBroadcastID());
            sb2.append(") has device ? no");
        }
        return lsDeviceInfo2;
    }

    public static synchronized DeviceSyncCentre getInstance() {
        DeviceSyncCentre deviceSyncCentre = mDeviceCentre;
        if (deviceSyncCentre != null) {
            return deviceSyncCentre;
        }
        DeviceSyncCentre deviceSyncCentre2 = new DeviceSyncCentre();
        mDeviceCentre = deviceSyncCentre2;
        return deviceSyncCentre2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handleScanResults(LsDeviceInfo lsDeviceInfo) {
        if (getDevicesCentreStatus() == ManagerStatus.DATA_RECEIVE) {
            if (isDisableConnectDevice(lsDeviceInfo.getBroadcastID())) {
                printLogMessage(getGeneralLogInfo(lsDeviceInfo.getMacAddress(), "no permission to connect again with scan results,mac=" + lsDeviceInfo.getBroadcastID() + ";protocol=" + lsDeviceInfo.getProtocolType(), com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, null, true));
                return;
            }
            LsDeviceInfo lsDeviceInfoFindTargetDeviceFromMap = findTargetDeviceFromMap(lsDeviceInfo);
            if (lsDeviceInfoFindTargetDeviceFromMap != null) {
                lsDeviceInfoFindTargetDeviceFromMap.setMacAddress(lsDeviceInfo.getMacAddress());
                if (lsDeviceInfo.getProtocolType() != null && lsDeviceInfo.getProtocolType().length() > 0) {
                    d.d().a(lsDeviceInfo.getMacAddress(), com.lifesense.android.bluetooth.core.business.log.report.a.Reset_Protocol, true, "source protocol=" + lsDeviceInfoFindTargetDeviceFromMap.getProtocolType() + ";target protcol=" + lsDeviceInfo.getProtocolType(), null);
                    lsDeviceInfoFindTargetDeviceFromMap.setProtocolType(lsDeviceInfo.getProtocolType());
                }
                com.lifesense.android.bluetooth.core.business.scan.a.getInstance().f("9");
                SystemClock.sleep(500L);
                setupConnection(lsDeviceInfoFindTargetDeviceFromMap);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parsingDeviceInfoData(HandlerMessage handlerMessage) {
        if (this.mReceiveDataCallback != null && handlerMessage != null) {
            this.mReceiveDataCallback.onReceiveDeviceInfo(handlerMessage.getLsDevice());
        } else {
            printLogMessage(getGeneralLogInfo(null, "faield to callback measure data, data callback is null..." + this.mReceiveDataCallback, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void parsingMultiProtocolMeasureData(HandlerMessage handlerMessage) {
        if (this.mReceiveDataCallback == null || handlerMessage == null) {
            printLogMessage(getGeneralLogInfo(null, "faield to callback measure data, data callback is null..." + this.mReceiveDataCallback, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
            return;
        }
        try {
            PacketProfile packetType = handlerMessage.getPacketType();
            c.a aVarA = c.a(packetType);
            if (aVarA == null) {
                printLogMessage(getGeneralLogInfo(null, "unrecognized package", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
                return;
            }
            if (aVarA.b().equals("list")) {
                List<BaseDeviceData> listDecodePackages = packetType.decodePackages(handlerMessage);
                if (CollectionUtils.isEmpty(listDecodePackages)) {
                    return;
                }
                Iterator<BaseDeviceData> it = listDecodePackages.iterator();
                while (it.hasNext()) {
                    this.mReceiveDataCallback.onReceiveDeviceMeasureData(it.next());
                }
            } else {
                BaseDeviceData baseDeviceDataDecodePackage = packetType.decodePackage(handlerMessage);
                if (baseDeviceDataDecodePackage == null) {
                } else {
                    this.mReceiveDataCallback.onReceiveDeviceMeasureData(baseDeviceDataDecodePackage);
                }
            }
        } catch (Exception e2) {
            printLogMessage(getGeneralLogInfo(null, "failed to parse measure data,has exception...data obj >> {" + handlerMessage.toString() + "}; exception obj >> { " + e2.toString() + " }", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            e2.printStackTrace();
        }
    }

    private synchronized void setDeviceManagerStatus(ManagerStatus managerStatus, String str) {
        printLogMessage(getPrintLogInfo("set manager status in device centre >> " + str, 3));
        this.currentManagerStatus = managerStatus;
    }

    private synchronized void setupConnection(LsDeviceInfo lsDeviceInfo) {
        com.lifesense.android.bluetooth.core.protocol.worker.a aVarCreateSyncWorker;
        try {
            if (lsDeviceInfo == null) {
                printLogMessage(getPrintLogInfo("faield to create connection,is null...", 1));
                return;
            }
            if (TextUtils.isEmpty(lsDeviceInfo.getBroadcastID())) {
                printLogMessage(getPrintLogInfo("faield to create connection with device=" + lsDeviceInfo.getBroadcastID(), 1));
                return;
            }
            printLogMessage(getPrintLogInfo("setupConnect:" + lsDeviceInfo.getMacAddress(), 1));
            String macAddress = lsDeviceInfo.getMacAddress();
            ProtocolType protocolByName = ProtocolType.getProtocolByName(lsDeviceInfo.getProtocolType());
            Queue<com.lifesense.android.bluetooth.core.protocol.stack.a> dataSyncProtocolStack = protocolByName.getDataSyncProtocolStack();
            if (dataSyncProtocolStack != null && (aVarCreateSyncWorker = protocolByName.createSyncWorker(this.mAppContext, lsDeviceInfo)) != null) {
                com.lifesense.android.bluetooth.core.business.sync.a aVarA = com.lifesense.android.bluetooth.core.protocol.worker.c.a(DeviceType.getDeviceTypeById(lsDeviceInfo.getDeviceType()));
                aVarA.a(this.deviceCentreHandler);
                aVarA.a(this.measuredDeviceMap);
                aVarCreateSyncWorker.registerDeviceCentreCallback(aVarA);
                this.longConnectedDeviceMap.put(lsDeviceInfo.getBroadcastID().toUpperCase(), aVarCreateSyncWorker);
                aVarCreateSyncWorker.connectDevice(macAddress, dataSyncProtocolStack, com.lifesense.android.bluetooth.core.business.b.SYNCING);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized boolean addDevice(LsDeviceInfo lsDeviceInfo) {
        if (lsDeviceInfo != null) {
            if (this.measuredDeviceMap != null) {
                if (!com.lifesense.android.bluetooth.core.protocol.b.a(lsDeviceInfo)) {
                    printLogMessage(getPrintLogInfo("failed to add measure device,info error >>" + lsDeviceInfo.toString(), 1));
                    return false;
                }
                printLogMessage(getSupperLogInfo(null, "add measure device" + lsDeviceInfo.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Add_Device, null, true));
                lsDeviceInfo.setMacAddress(lsDeviceInfo.getMacAddress().toUpperCase());
                String str = lsDeviceInfo.getDeviceType() + lsDeviceInfo.getBroadcastID();
                this.measuredDeviceMap.remove(str);
                this.measuredDeviceMap.put(str, lsDeviceInfo);
                boolean zAddScanDeviceType = addScanDeviceType(DeviceType.getDeviceTypeById(lsDeviceInfo.getDeviceType()));
                if (!isDisableConnectDevice(lsDeviceInfo.getBroadcastID())) {
                    startupDataSync();
                }
                return zAddScanDeviceType;
            }
        }
        printLogMessage(getPrintLogInfo("failed to add measure device,is null..", 1));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized void cancelAllLongConnection() {
        Map<String, com.lifesense.android.bluetooth.core.protocol.worker.a> map = this.longConnectedDeviceMap;
        if (map != null && !map.isEmpty()) {
            Iterator<Map.Entry<String, com.lifesense.android.bluetooth.core.protocol.worker.a>> it = this.longConnectedDeviceMap.entrySet().iterator();
            while (it.hasNext()) {
                com.lifesense.android.bluetooth.core.protocol.worker.a value = it.next().getValue();
                if (value != null) {
                    value.disconnect();
                }
            }
            this.longConnectedDeviceMap.clear();
        }
    }

    public synchronized void cancelLongConnectionWithBroadcastId(String str) {
        Map<String, com.lifesense.android.bluetooth.core.protocol.worker.a> map = this.longConnectedDeviceMap;
        if (map != null && !map.isEmpty()) {
            if (str != null && str.length() > 0) {
                String upperCase = str.toUpperCase();
                if (this.longConnectedDeviceMap.containsKey(upperCase)) {
                    printLogMessage(getPrintLogInfo("cancel protocol handler with broadcastID=" + upperCase, 1));
                    com.lifesense.android.bluetooth.core.protocol.worker.a aVar = this.longConnectedDeviceMap.get(upperCase);
                    if (aVar != null) {
                        aVar.disconnect();
                    }
                    this.longConnectedDeviceMap.remove(upperCase);
                }
            }
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized void cancelStartMeasuring(String str) {
        if (isDisableConnectDevice(str)) {
            com.lifesense.android.bluetooth.core.protocol.worker.a aVar = this.longConnectedDeviceMap.get(str);
            if (aVar != null) {
                aVar.disconnect();
            }
            this.longConnectedDeviceMap.remove(str);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public DeviceConnectState checkConnectState(String str) {
        if (TextUtils.isEmpty(str)) {
            return DeviceConnectState.UNKNOWN;
        }
        Map<String, com.lifesense.android.bluetooth.core.protocol.worker.a> map = this.longConnectedDeviceMap;
        if (map != null && map.size() > 0) {
            String upperCase = str.toUpperCase();
            if (str.lastIndexOf(":") != -1) {
                upperCase = str.replace(":", "").toUpperCase();
            }
            if (this.longConnectedDeviceMap.containsKey(upperCase)) {
                com.lifesense.android.bluetooth.core.protocol.worker.a aVar = this.longConnectedDeviceMap.get(upperCase);
                DeviceConnectState deviceConnectState = DeviceConnectState.UNKNOWN;
                if (aVar != null) {
                    deviceConnectState = aVar.getDeviceConnectState();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("check device connect status with mac:[");
                sb.append(str);
                sb.append("] >> state=");
                sb.append(deviceConnectState);
                return deviceConnectState;
            }
        }
        return DeviceConnectState.UNKNOWN;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public boolean checkHandlePermission() {
        String str;
        if (getDevicesCentreStatus() == ManagerStatus.FREE && this.isStopDataReceived) {
            str = "no permission to handle gatt action change,working status error...";
        } else if (getDevicesCentreStatus() != ManagerStatus.DATA_RECEIVE) {
            str = "no permission to handle gatt action change..." + getDevicesCentreStatus();
        } else {
            Map<String, LsDeviceInfo> map = this.measuredDeviceMap;
            if (map != null && map.size() != 0) {
                return true;
            }
            str = "no permission to handle gatt action change,no device...";
        }
        printLogMessage(getPrintLogInfo(str, 3));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized void connectDevice(LsDeviceInfo lsDeviceInfo, ReceiveDataCallback receiveDataCallback) {
        if (lsDeviceInfo != null) {
            if (lsDeviceInfo.getProtocolType() != null && lsDeviceInfo.getMacAddress() != null) {
                this.mReceiveDataCallback = receiveDataCallback;
                if (isDisableConnectDevice(lsDeviceInfo.getBroadcastID())) {
                    com.lifesense.android.bluetooth.core.protocol.worker.a protocolHandler = getProtocolHandler(lsDeviceInfo.getMacAddress());
                    if (protocolHandler != null && protocolHandler.getDeviceConnectState() == DeviceConnectState.CONNECTED_SUCCESS) {
                        printLogMessage(getGeneralLogInfo(lsDeviceInfo.getMacAddress(), "no permission to connect again on scan failure,mac =" + lsDeviceInfo.getBroadcastID(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                        return;
                    }
                    if (protocolHandler != null) {
                        protocolHandler.disconnect();
                    }
                }
                printLogMessage(getGeneralLogInfo(lsDeviceInfo.getMacAddress(), "connect device without scan process,mac=" + lsDeviceInfo.getMacAddress() + "; protocol=" + lsDeviceInfo.getProtocolType(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                setupConnection(lsDeviceInfo);
                return;
            }
        }
        printLogMessage(getGeneralLogInfo(null, "no permission to connect device,info invalid...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized boolean deleteDevice(String str) {
        Map<String, LsDeviceInfo> map;
        if (str != null) {
            if (str.length() != 0 && (map = this.measuredDeviceMap) != null) {
                if (map.size() == 0) {
                    printLogMessage(getPrintLogInfo("failed to delete device,no devices...", 1));
                    cancelAllLongConnection();
                    return false;
                }
                String upperCase = str.toUpperCase();
                for (String str2 : this.measuredDeviceMap.keySet()) {
                    if (str2.contains(upperCase) || str2.equalsIgnoreCase(upperCase)) {
                        upperCase = str2;
                        break;
                    }
                }
                if (!this.measuredDeviceMap.containsKey(upperCase)) {
                    printLogMessage(getGeneralLogInfo(null, "failed to delete device with mac=" + str, com.lifesense.android.bluetooth.core.business.log.report.a.Delete_Device, null, false));
                    return false;
                }
                LsDeviceInfo lsDeviceInfo = this.measuredDeviceMap.get(upperCase);
                if (lsDeviceInfo == null) {
                    return false;
                }
                this.measuredDeviceMap.remove(upperCase);
                printLogMessage(getSupperLogInfo(lsDeviceInfo.getMacAddress(), "deleted device with mac=" + lsDeviceInfo.getMacAddress(), com.lifesense.android.bluetooth.core.business.log.report.a.Delete_Device, null, true));
                cancelLongConnectionWithBroadcastId(str);
                d.d().c(lsDeviceInfo.getMacAddress());
                return true;
            }
        }
        printLogMessage(getPrintLogInfo("failed to delete device,is null..." + str, 1));
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    @SuppressLint({"NewApi"})
    public synchronized void destoryInstance() {
        try {
            HandlerThread handlerThread = this.deviceCentreThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.deviceCentreThread = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized Handler getDeviceCentreHandler() {
        return this.deviceCentreHandler;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized ManagerStatus getDevicesCentreStatus() {
        return this.currentManagerStatus;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized Map<String, LsDeviceInfo> getMeasuredDeviceMap() {
        return this.measuredDeviceMap;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public com.lifesense.android.bluetooth.core.protocol.worker.a getProtocolHandler(String str) {
        Map<String, com.lifesense.android.bluetooth.core.protocol.worker.a> map;
        if (str == null || (map = this.longConnectedDeviceMap) == null || map.size() == 0) {
            return null;
        }
        return this.longConnectedDeviceMap.get(str.replace(":", "").toUpperCase());
    }

    public ReceiveDataCallback getmReceiveDataCallback() {
        return this.mReceiveDataCallback;
    }

    @Override // com.lifesense.android.bluetooth.core.business.d
    @SuppressLint({"NewApi"})
    public synchronized void initBusinessCentre(Context context, j jVar) {
        super.initBusinessCentre(context, jVar);
        setDeviceManagerStatus(ManagerStatus.FREE, "init device centre");
        printLogMessage(getGeneralLogInfo(null, "init device sync centre", com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message, null, false));
        this.mDisableDataSyncDevices = new ArrayList();
        this.longConnectedDeviceMap = new ConcurrentSkipListMap();
        this.measuredDeviceMap = new ConcurrentSkipListMap();
        HandlerThread handlerThread = new HandlerThread("DataSyncCentreHandler");
        this.deviceCentreThread = handlerThread;
        handlerThread.start();
        this.deviceCentreHandler = new b(this.deviceCentreThread.getLooper());
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public boolean isDisableConnectDevice(String str) {
        if (MapUtils.isEmpty(this.longConnectedDeviceMap) || TextUtils.isEmpty(str)) {
            return false;
        }
        String upperCase = str.toUpperCase();
        return this.longConnectedDeviceMap.containsKey(upperCase) && this.longConnectedDeviceMap.get(upperCase).getDeviceConnectState() == DeviceConnectState.CONNECTED_SUCCESS;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized boolean isDisableDataSyncDevice(String str) {
        if (str != null) {
            List<String> list = this.mDisableDataSyncDevices;
            if (list != null && list.size() != 0) {
                return this.mDisableDataSyncDevices.contains(str);
            }
        }
        return false;
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public void onBleScanResults(BleScanResults bleScanResults) {
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public synchronized void onDeviceScanResults(String str, LsDeviceInfo lsDeviceInfo) {
        if (lsDeviceInfo == null || str == null) {
            return;
        }
        Message messageObtainMessage = this.deviceCentreHandler.obtainMessage();
        messageObtainMessage.arg1 = 1;
        messageObtainMessage.obj = lsDeviceInfo;
        this.deviceCentreHandler.sendMessage(messageObtainMessage);
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public synchronized void onScanFailure() {
        if (MapUtils.isEmpty(this.measuredDeviceMap)) {
            Objects.toString(this.measuredDeviceMap);
            com.lifesense.android.bluetooth.core.business.scan.a.getInstance().f("12");
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.h
    public void onScanTimeout() {
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized void readDeviceVoltage(String str, OnDeviceReadListener onDeviceReadListener) {
        int code;
        int code2;
        try {
            if (str == null) {
                printLogMessage(getGeneralLogInfo(null, "faield to read device voltage,mac is null...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
                ErrorCode errorCode = ErrorCode.UNKNOWN_ERROR;
                onDeviceReadListener.onDeviceVoltageValue(null, errorCode.getCode(), errorCode.getCode());
                return;
            }
            String upperCase = str.replace(":", "").toUpperCase();
            if (MapUtils.isEmpty(this.longConnectedDeviceMap)) {
                return;
            }
            if (this.longConnectedDeviceMap.containsKey(upperCase)) {
                com.lifesense.android.bluetooth.core.protocol.worker.a aVar = this.longConnectedDeviceMap.get(upperCase);
                if (aVar != null) {
                    aVar.readDeviceVoltage(onDeviceReadListener);
                } else {
                    printLogMessage(getGeneralLogInfo(upperCase, "faield to read device voltage,code error >> ", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
                    ErrorCode errorCode2 = ErrorCode.UNKNOWN_ERROR;
                    code = errorCode2.getCode();
                    code2 = errorCode2.getCode();
                }
            }
            printLogMessage(getGeneralLogInfo(upperCase, "faield to read device voltage,not connected. mac >> " + upperCase + "; map >> " + this.longConnectedDeviceMap.keySet().toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, false));
            ErrorCode errorCode3 = ErrorCode.UNKNOWN_ERROR;
            code = errorCode3.getCode();
            code2 = errorCode3.getCode();
            onDeviceReadListener.onDeviceVoltageValue(null, code, code2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized void registerDataSyncListener(ReceiveDataCallback receiveDataCallback) {
        this.mReceiveDataCallback = receiveDataCallback;
    }

    public synchronized void restartDataSync(boolean z) {
        if (!this.isStopDataReceived) {
            ManagerStatus devicesCentreStatus = getDevicesCentreStatus();
            ManagerStatus managerStatus = ManagerStatus.DATA_RECEIVE;
            if (devicesCentreStatus == managerStatus) {
                if (this.longConnectedDeviceMap.size() == this.measuredDeviceMap.size()) {
                    printLogMessage(getPrintLogInfo("there is no other deivce,size=" + this.longConnectedDeviceMap.size(), 1));
                    return;
                }
                if (this.measuredDeviceMap.size() > 1) {
                    printLogMessage(getPrintLogInfo("start scan again,there has other deivce,connection device size=" + this.longConnectedDeviceMap.size() + "; devices size=" + this.measuredDeviceMap.size(), 1));
                    startupDataSync();
                } else if (z && this.measuredDeviceMap.size() == 1 && !this.isStopDataReceived && getDevicesCentreStatus() == managerStatus) {
                    printLogMessage(getPrintLogInfo("start scan again,connection device size=" + this.longConnectedDeviceMap.size() + "; devices size=" + this.measuredDeviceMap.size(), 1));
                    startupDataSync();
                    return;
                }
            }
        }
        printLogMessage(getPrintLogInfo("no permission to start up data sync service again,status=" + getDevicesCentreStatus() + "; isStop=" + this.isStopDataReceived, 1));
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized void restartDataSyncService() {
        if (this.mReceiveDataCallback == null) {
            printLogMessage(getGeneralLogInfo(null, "faield to restart data sync service,call back obj is null...", com.lifesense.android.bluetooth.core.business.log.report.a.Restart_Service, null, false));
            stopDataSyncService();
        } else {
            stopDataSyncService();
            startDataSyncService(this.mReceiveDataCallback);
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized boolean setDevicelist(List<LsDeviceInfo> list) {
        printLogMessage(getSupperLogInfo(null, "reset measure device list," + StringUtils.join(list, "，"), com.lifesense.android.bluetooth.core.business.log.report.a.Set_Measure_Device, null, true));
        Map<String, LsDeviceInfo> map = this.measuredDeviceMap;
        if (map != null && map.size() > 0) {
            cancelAllLongConnection();
            this.measuredDeviceMap.clear();
        }
        if (list != null && list.size() != 0) {
            this.enableConnectDeviceTypes = new ArrayList();
            for (LsDeviceInfo lsDeviceInfo : list) {
                if (com.lifesense.android.bluetooth.core.protocol.b.a(lsDeviceInfo)) {
                    if (lsDeviceInfo.getMacAddress() != null && lsDeviceInfo.getMacAddress().length() > 0) {
                        lsDeviceInfo.setMacAddress(lsDeviceInfo.getMacAddress().toUpperCase());
                    }
                    String upperCase = lsDeviceInfo.getDeviceType() + lsDeviceInfo.getBroadcastID();
                    if (lsDeviceInfo.getMacAddress() != null && lsDeviceInfo.getMacAddress().length() > 0 && ProtocolType.A6.name().equalsIgnoreCase(lsDeviceInfo.getProtocolType())) {
                        upperCase = lsDeviceInfo.getMacAddress().replace(":", "").toUpperCase();
                        lsDeviceInfo.setBroadcastID(upperCase);
                    }
                    this.measuredDeviceMap.remove(upperCase);
                    this.measuredDeviceMap.put(upperCase, lsDeviceInfo);
                    addScanDeviceType(DeviceType.getDeviceTypeById(lsDeviceInfo.getDeviceType()));
                } else {
                    printLogMessage(getGeneralLogInfo(null, "faield to set measure devices,info error >>" + lsDeviceInfo.toString(), com.lifesense.android.bluetooth.core.business.log.report.a.Add_Device, null, false));
                }
            }
            return true;
        }
        return false;
    }

    public void setReceiveDataCallback(ReceiveDataCallback receiveDataCallback) {
        this.mReceiveDataCallback = receiveDataCallback;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized boolean startDataSyncService(ReceiveDataCallback receiveDataCallback) {
        try {
            if (receiveDataCallback == null) {
                printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,no callback...", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                return false;
            }
            if (getDevicesCentreStatus() != ManagerStatus.FREE) {
                printLogMessage(getGeneralLogInfo(null, "failed to start data syncing service,working status=" + this.currentManagerStatus, com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
                return false;
            }
            setDeviceManagerStatus(ManagerStatus.DATA_RECEIVE, "start data sync service");
            this.mReceiveDataCallback = receiveDataCallback;
            this.isStopDataReceived = false;
            d.d().a();
            d.d().a(this.measuredDeviceMap);
            d.d().c();
            printLogMessage(getGeneralLogInfo(null, "start data syncing service now...", com.lifesense.android.bluetooth.core.business.log.report.a.Start_Service, null, true));
            return startupDataSync();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean startupDataSync() {
        if (!com.lifesense.android.bluetooth.core.system.b.getInstance().i()) {
            printLogMessage(getGeneralLogInfo(null, "faield to startup syncing service,bluetooth unavailiable..", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return false;
        }
        ManagerStatus devicesCentreStatus = getDevicesCentreStatus();
        ManagerStatus managerStatus = ManagerStatus.DATA_RECEIVE;
        if (devicesCentreStatus == managerStatus && com.lifesense.android.bluetooth.core.business.scan.a.getInstance().f()) {
            printLogMessage(getGeneralLogInfo(null, "try to startup syncing service again,isScanning.....", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return true;
        }
        setDeviceManagerStatus(managerStatus, "start up data sync");
        com.lifesense.android.bluetooth.core.business.scan.a.getInstance().a(BroadcastType.ALL, this.enableConnectDeviceTypes);
        com.lifesense.android.bluetooth.core.business.scan.a.getInstance().a(this.measuredDeviceMap);
        String str = "startup syncing service:" + this.measuredDeviceMap.size();
        if (MapUtils.isEmpty(this.measuredDeviceMap)) {
            printLogMessage(getGeneralLogInfo(null, "faield to startup syncing service,measuredDeviceMap is null..", com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message, null, true));
            return false;
        }
        printLogMessage(getGeneralLogInfo(null, str, com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg, null, true));
        com.lifesense.android.bluetooth.core.business.scan.a.getInstance().a(ScanMode.SCAN_FOR_SYNC, this);
        return true;
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public synchronized boolean stopDataSyncService() {
        try {
            ManagerStatus devicesCentreStatus = getDevicesCentreStatus();
            ManagerStatus managerStatus = ManagerStatus.FREE;
            if (devicesCentreStatus == managerStatus && this.isStopDataReceived) {
                return true;
            }
            printLogMessage(getGeneralLogInfo(null, "stop data syncing service now...", com.lifesense.android.bluetooth.core.business.log.report.a.Stop_Service, null, true));
            setDeviceManagerStatus(managerStatus, "stop data sync service");
            this.isStopDataReceived = true;
            com.lifesense.android.bluetooth.core.system.b.getInstance().g("106");
            cancelAllLongConnection();
            com.lifesense.android.bluetooth.core.business.scan.a.getInstance().f("11");
            com.lifesense.android.bluetooth.core.system.connect.a.getInstance().b();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.android.bluetooth.core.business.sync.b
    public void updateDeviceConnectionMode(List<String> list, GattServiceType gattServiceType) {
        if (this.mDisableDataSyncDevices == null || this.deviceCentreHandler == null) {
            return;
        }
        if (list == null || list.size() == 0) {
            this.mDisableDataSyncDevices.clear();
        } else {
            this.deviceCentreHandler.post(new a(gattServiceType, list));
        }
    }
}
