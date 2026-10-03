package com.lifesense.plugin.ble.device.a.a;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.util.Log;
import com.lifesense.plugin.ble.OnUpgradingListener;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSManagerStatus;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import com.lifesense.plugin.ble.data.other.BleScanResults;
import com.lifesense.plugin.ble.data.other.ScanMode;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale"})
public final class a extends com.lifesense.plugin.ble.device.a.a {
    public static boolean DISABLE_RECONNECT = false;
    public static boolean LOG_ALL_UPGRADE_FILE_DATA_PERMISSION = false;
    public static int RECONNECT_COUNT = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f8703e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.lifesense.plugin.ble.device.a.b f8704c;
    private Map f;
    private Map g;
    private List h;
    private com.lifesense.plugin.ble.device.a.b i = new b(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.lifesense.plugin.ble.device.a.b f8705j = new c(this);
    private boolean d = false;

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OnUpgradingListener e(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.g) == null || !map.containsKey(strA)) {
            return null;
        }
        return (OnUpgradingListener) this.g.remove(strA);
    }

    private String f(String str) {
        Map map = this.f;
        if (map != null && map.size() > 0) {
            for (String str2 : this.f.keySet()) {
                if (str2.equalsIgnoreCase(str)) {
                    return str;
                }
                String strReplace = str.toUpperCase().replace(":", "");
                if (new String(str2).toUpperCase().replace(":", "").contains(strReplace.substring(0, strReplace.length() - 2))) {
                    return str2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OnUpgradingListener c(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.g) == null || map.size() == 0 || !this.g.containsKey(strA)) {
            return null;
        }
        return (OnUpgradingListener) this.g.get(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Map map;
        if (this.f8704c == null || (map = this.g) == null || map.size() != 0) {
            return;
        }
        this.f8704c.a(this, LSManagerStatus.Free);
    }

    public com.lifesense.plugin.ble.device.proto.q b(String str) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.f) == null || map.size() == 0 || !this.f.containsKey(strA)) {
            return null;
        }
        return (com.lifesense.plugin.ble.device.proto.q) this.f.get(strA);
    }

    public static synchronized a a() {
        a aVar = f8703e;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        f8703e = aVar2;
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        Map map;
        com.lifesense.plugin.ble.device.proto.q qVar;
        try {
            String strA = com.lifesense.plugin.ble.c.b.a(str);
            if (strA == null || (map = this.f) == null || !map.containsKey(strA) || (qVar = (com.lifesense.plugin.ble.device.proto.q) this.f.remove(strA)) == null) {
                return;
            }
            qVar.b();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void c() {
        a(LSErrorCode.UserCancel);
    }

    @Override // com.lifesense.plugin.ble.device.a.a
    @SuppressLint({"NewApi"})
    public void a(Context context, com.lifesense.plugin.ble.device.a.b bVar) {
        super.a(context, bVar);
        this.f8704c = bVar;
        this.d = true;
        this.f = new ConcurrentSkipListMap();
        this.g = new ConcurrentSkipListMap();
        this.h = new ArrayList();
    }

    public boolean b() {
        if (this.f == null || this.g == null) {
            return false;
        }
        return this.d;
    }

    public void a(LSErrorCode lSErrorCode) {
        o.a().e();
        o.a().c();
        Map map = this.f;
        if (map == null || map.size() <= 0) {
            return;
        }
        Iterator it = this.f.keySet().iterator();
        while (it.hasNext()) {
            com.lifesense.plugin.ble.device.proto.q qVar = (com.lifesense.plugin.ble.device.proto.q) this.f.get((String) it.next());
            if (qVar != null) {
                this.f8705j.a(qVar, qVar.a(), LSUpgradeState.UpgradeFailure.getValue(), lSErrorCode.getCode());
            }
        }
        this.f.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BleScanResults bleScanResults) {
        String address;
        LSUpgradeState lSUpgradeState;
        String strF = f(bleScanResults.getAddress());
        byte[] scanRecord = bleScanResults.getScanRecord();
        if (strF == null || scanRecord == null || scanRecord.length == 0) {
            return;
        }
        String strB = com.lifesense.plugin.ble.c.c.b(scanRecord);
        if (strF.equalsIgnoreCase(bleScanResults.getAddress())) {
            com.lifesense.plugin.ble.device.proto.q qVarB = b(strF);
            if (qVarB != null && qVarB.d() == LSUpgradeState.EnterUpgradeMode) {
                printLogMessage(getGeneralLogInfo(strF, "no permissio to upgrade device,status error:" + qVarB.d(), com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
                return;
            }
            o.a().e();
            printLogMessage(getAdvancedLogInfo(strF, "normal model mac=" + strF, com.lifesense.plugin.ble.b.a.a.Scan_Results, null, true));
            o.a().c();
            address = bleScanResults.getAddress();
            lSUpgradeState = LSUpgradeState.Connect;
        } else {
            if (!a(strF, bleScanResults.getAddress(), strB)) {
                return;
            }
            o.a().e();
            printLogMessage(getAdvancedLogInfo(strF, "sourceMac=(" + strF + "),upgrade mode mac=(" + bleScanResults.getAddress() + ")", com.lifesense.plugin.ble.b.a.a.Scan_Results, null, true));
            o.a().c();
            address = bleScanResults.getAddress();
            lSUpgradeState = LSUpgradeState.ConnectOfUpgradeMode;
        }
        a(strF, address, lSUpgradeState);
    }

    public void a(String str) {
        com.lifesense.plugin.ble.device.proto.q qVarB = b(str);
        if (qVarB != null) {
            this.f8705j.a(qVarB, str, LSUpgradeState.UpgradeFailure.getValue(), LSErrorCode.UserCancel.getCode());
        }
        Map map = this.f;
        if (map == null || map.size() == 0) {
            o.a().e();
            o.a().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, OnUpgradingListener onUpgradingListener, LSUpgradeState lSUpgradeState, int i) {
        if (onUpgradingListener != null) {
            String str2 = "";
            if (LSUpgradeState.UpgradeFailure == lSUpgradeState) {
                str2 = "; code:" + i + "(" + LSErrorCode.toErrorCode(i) + ")";
            }
            String str3 = "#OnUpgradeStatedChanged=" + lSUpgradeState + str2;
            Log.e("LS-BLE", str3 + "; forDevice=" + str);
            printLogMessage(getGeneralLogInfo(str, str3, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            onUpgradingListener.onStateChanged(str, lSUpgradeState, i);
        }
    }

    private void a(String str, com.lifesense.plugin.ble.device.proto.q qVar, OnUpgradingListener onUpgradingListener) {
        Map map;
        String strA = com.lifesense.plugin.ble.c.b.a(str);
        if (strA == null || (map = this.f) == null || this.g == null) {
            return;
        }
        if (map.containsKey(strA)) {
            this.f.remove(strA);
        }
        this.f.put(strA, qVar);
        if (this.g.containsKey(strA)) {
            this.g.remove(strA);
        }
        printLogMessage(getGeneralLogInfo(str, "add upgrade listener=" + onUpgradingListener + "; for device=" + strA, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        this.g.put(strA, onUpgradingListener);
    }

    public synchronized void a(String str, File file, OnUpgradingListener onUpgradingListener) {
        if (com.lifesense.plugin.ble.device.proto.e.a().a(str, file, onUpgradingListener)) {
            if (b(str) != null) {
                printLogMessage(getSupperLogInfo(null, "no permission to send upgrade request,repeatedly...", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
                return;
            }
            com.lifesense.plugin.ble.device.proto.q qVarA = com.lifesense.plugin.ble.device.proto.b.a().a(this.a, str, file);
            if (qVarA == null) {
                onUpgradingListener.onStateChanged(str, LSUpgradeState.UpgradeFailure, LSErrorCode.FileFormatError.getCode());
                return;
            }
            qVarA.a(this.f8705j);
            BluetoothDevice bluetoothDeviceA = com.lifesense.plugin.ble.a.e.a().a(str);
            if (bluetoothDeviceA != null) {
                printLogMessage(getSupperLogInfo(str, "success to get the device from system...." + str, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, true));
            } else {
                Set<BluetoothDevice> setJ = com.lifesense.plugin.ble.a.e.a().j();
                if (setJ != null && setJ.size() > 0) {
                    for (BluetoothDevice bluetoothDevice : setJ) {
                        if (bluetoothDevice.getAddress() != null && bluetoothDevice.getAddress().equalsIgnoreCase(str)) {
                            bluetoothDeviceA = bluetoothDevice;
                        }
                    }
                }
            }
            a(str, qVarA, onUpgradingListener);
            if (bluetoothDeviceA != null) {
                onUpgradingListener.onStateChanged(str, LSUpgradeState.Connect, 0);
                qVarA.a(bluetoothDeviceA, qVarA.o(), true, com.lifesense.plugin.ble.device.a.c.ENTER_UPGRADE_MODE);
            } else {
                o.a().c();
                o.a().a(120000, com.lifesense.plugin.ble.device.a.c.UPGRADING);
                o.a().a(ScanMode.SCAN_FOR_UPGRADE, this.i);
                onUpgradingListener.onStateChanged(str, LSUpgradeState.Search, 0);
            }
        }
    }

    private void a(String str, String str2, LSUpgradeState lSUpgradeState) {
        com.lifesense.plugin.ble.device.proto.q qVarB = b(str);
        if (qVarB == null) {
            printLogMessage(getPrintLogInfo("faield to connect upgrade device,program exception...", 1));
        } else if (LSUpgradeState.Connect == lSUpgradeState) {
            qVarB.a(str, qVarB.o(), com.lifesense.plugin.ble.device.a.c.ENTER_UPGRADE_MODE);
        } else if (LSUpgradeState.ConnectOfUpgradeMode == lSUpgradeState) {
            qVarB.a(str2, com.lifesense.plugin.ble.device.proto.c.a(), com.lifesense.plugin.ble.device.a.c.UPGRADING);
        }
    }

    private boolean a(String str, String str2, String str3) {
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            return false;
        }
        String strReplace = str.replace(":", "");
        String strReplace2 = str2.replace(":", "");
        int i = (int) (Long.parseLong(strReplace2, 16) - Long.parseLong(strReplace, 16));
        int i2 = (int) (Long.parseLong(strReplace, 16) - Long.parseLong(strReplace2, 16));
        if (i == 2 || i2 == 254 || i2 == 255) {
            return true;
        }
        return i == 0 && str3 != null && (str3.startsWith("LsDfu") || str3.startsWith("LsD"));
    }
}
