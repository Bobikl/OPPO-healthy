package com.lifesense.plugin.ble.device.proto;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.lifesense.plugin.ble.OnUpgradingListener;
import com.lifesense.plugin.ble.data.IDeviceProtocol;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDeviceType;
import com.lifesense.plugin.ble.data.LSErrorCode;
import com.lifesense.plugin.ble.data.LSProtocolType;
import com.lifesense.plugin.ble.data.LSUpgradeState;
import com.lifesense.plugin.ble.data.other.MultiProtocolDevice;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"UseSparseArrays"})
public final class e extends j implements d {
    private static e a;

    private e() {
    }

    public LSProtocolType a(List list) {
        if (list == null || list.size() == 0) {
            return LSProtocolType.Unknown;
        }
        Set<String> setKeySet = j.protocolServiceMap.keySet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UUID uuid = (UUID) it.next();
            for (String str : setKeySet) {
                if (str.equalsIgnoreCase(uuid.toString())) {
                    return (LSProtocolType) j.protocolServiceMap.get(str);
                }
            }
        }
        return LSProtocolType.Unknown;
    }

    public String b(String str) {
        if (str == null || !j.marshalModelNumber.containsKey(str)) {
            return null;
        }
        return (String) j.marshalModelNumber.get(str);
    }

    public List c(Map map) {
        Map map2;
        if (map == null || map.size() == 0 || (map2 = j.protocolServiceMap) == null || map2.values() == null) {
            return null;
        }
        ArrayList<LSProtocolType> arrayList = new ArrayList(j.protocolServiceMap.values());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) ((Map.Entry) it.next()).getValue();
            for (LSProtocolType lSProtocolType : arrayList) {
                if (lSDeviceInfo != null && lSProtocolType.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType())) {
                    arrayList2.add(lSDeviceInfo);
                }
            }
        }
        return arrayList2;
    }

    public String d(String str) {
        return (str == null || !j.unmarshalServiceUuid.containsKey(str)) ? "00" : (String) j.unmarshalServiceUuid.get(str);
    }

    public List e(String str) {
        if (str == null || !j.marshalServiceUuid.containsKey(str)) {
            return null;
        }
        return (List) j.marshalServiceUuid.get(str);
    }

    public LSDeviceType f(String str) {
        return LSDeviceType.getDeviceType(str);
    }

    public static e a() {
        e eVar = a;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        a = eVar2;
        return eVar2;
    }

    public void b() {
        IDeviceProtocol iDeviceProtocol = new IDeviceProtocol();
        LSDeviceType lSDeviceType = LSDeviceType.ActivityTracker;
        iDeviceProtocol.setDeviceType(lSDeviceType);
        iDeviceProtocol.setProtocol(LSProtocolType.A5);
        iDeviceProtocol.setService(j.PEDOMETER_SERVICE_UUID_A5);
        a(iDeviceProtocol);
        IDeviceProtocol iDeviceProtocol2 = new IDeviceProtocol();
        iDeviceProtocol2.setDeviceType(lSDeviceType);
        LSProtocolType lSProtocolType = LSProtocolType.OP;
        iDeviceProtocol2.setProtocol(lSProtocolType);
        iDeviceProtocol2.setService(j.OPPO_AT_SERVICE_UUID);
        IDeviceProtocol iDeviceProtocol3 = new IDeviceProtocol();
        iDeviceProtocol3.setDeviceType(lSDeviceType);
        iDeviceProtocol3.setProtocol(lSProtocolType);
        iDeviceProtocol3.setService(j.OPPO_AT_SERVICE_UUID_16);
    }

    public boolean c(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return j.deviceServiceMap.containsKey(str);
    }

    public static boolean b(LSDeviceInfo lSDeviceInfo) {
        if (lSDeviceInfo == null || lSDeviceInfo.getDeviceType() == null || lSDeviceInfo.getDeviceType().length() == 0) {
            return false;
        }
        if (lSDeviceInfo.getMacAddress() != null && lSDeviceInfo.getMacAddress().length() != 0) {
            return true;
        }
        String protocolType = lSDeviceInfo.getProtocolType();
        return LSProtocolType.A2.toString().equalsIgnoreCase(protocolType) || LSProtocolType.A3.toString().equalsIgnoreCase(protocolType);
    }

    public String a(LSDeviceType lSDeviceType) {
        return lSDeviceType.getValue();
    }

    public static boolean b(Map map) {
        if (map != null && map.size() != 0) {
            try {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (!a().a((LSDeviceInfo) ((Map.Entry) it.next()).getValue())) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public List a(List list, Set set) {
        com.lifesense.plugin.ble.b.b generalLogInfo;
        if (list == null || list.size() == 0) {
            generalLogInfo = getGeneralLogInfo(null, "failed to check connected devices,no devices", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true);
        } else {
            List<BluetoothDevice> listF = com.lifesense.plugin.ble.a.e.a().f();
            if (listF == null || listF.size() == 0) {
                printLogMessage(getGeneralLogInfo(null, "no connected gatt devices.", com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
                if (set != null && set.size() > 0) {
                    listF = new ArrayList(set);
                }
            }
            if (listF != null && listF.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (BluetoothDevice bluetoothDevice : listF) {
                    if (bluetoothDevice != null && !TextUtils.isEmpty(bluetoothDevice.getAddress())) {
                        String address = bluetoothDevice.getAddress();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) it.next();
                            if (lSDeviceInfo.getMacAddress() != null && address.equalsIgnoreCase(lSDeviceInfo.getMacAddress())) {
                                MultiProtocolDevice multiProtocolDevice = new MultiProtocolDevice();
                                multiProtocolDevice.setBleDevice(bluetoothDevice);
                                multiProtocolDevice.setLsDevcie(lSDeviceInfo);
                                arrayList.add(multiProtocolDevice);
                            }
                        }
                    }
                }
                return arrayList;
            }
            generalLogInfo = getGeneralLogInfo(null, "failed to check connected devices,no bond devices." + set, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true);
        }
        printLogMessage(generalLogInfo);
        return null;
    }

    public static List a(Map map) {
        if (map != null && map.size() != 0) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) ((Map.Entry) it.next()).getValue();
                    if (lSDeviceInfo != null) {
                        String protocolType = lSDeviceInfo.getProtocolType();
                        if (!TextUtils.isEmpty(protocolType) && (LSProtocolType.A5.toString().equalsIgnoreCase(protocolType) || LSProtocolType.WechatCallAT.toString().equalsIgnoreCase(protocolType) || LSProtocolType.WechatActivityTracker.toString().equalsIgnoreCase(protocolType))) {
                            arrayList.add(lSDeviceInfo);
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public boolean a(IDeviceProtocol iDeviceProtocol) {
        if (iDeviceProtocol == null || iDeviceProtocol.getService() == null || iDeviceProtocol.getService().toString() == null || iDeviceProtocol.getProtocol() == null || iDeviceProtocol.getProtocol() == LSProtocolType.Unknown || iDeviceProtocol.getDeviceType() == null || iDeviceProtocol.getDeviceType() == LSDeviceType.Unknown) {
            return false;
        }
        j.deviceServiceMap.put(iDeviceProtocol.getService().toString(), iDeviceProtocol.getDeviceType());
        j.protocolServiceMap.put(iDeviceProtocol.getService().toString(), iDeviceProtocol.getProtocol());
        String value = iDeviceProtocol.getDeviceType().getValue();
        List arrayList = (List) j.marshalServiceUuid.get(value);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(iDeviceProtocol.getService().toString());
        j.unmarshalServiceUuid.put(iDeviceProtocol.getService().toString(), value);
        j.marshalServiceUuid.put(value, arrayList);
        return true;
    }

    public boolean a(LSDeviceInfo lSDeviceInfo) {
        return (lSDeviceInfo == null || TextUtils.isEmpty(lSDeviceInfo.getProtocolType()) || (!LSProtocolType.A5.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) && !LSProtocolType.WechatCallAT.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) && !LSProtocolType.WechatActivityTracker.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) && !LSProtocolType.WechatScale.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) && !LSProtocolType.A6.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()) && !LSProtocolType.Standard.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType()))) ? false : true;
    }

    @SuppressLint({"DefaultLocale"})
    public boolean a(File file) {
        return (file == null || file.getName() == null || file.getName().length() == 0 || !file.getName().toUpperCase().endsWith(".LSF")) ? false : true;
    }

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return str.equals(LSProtocolType.A4.toString()) || str.equals(LSProtocolType.WechatActivityTracker.toString()) || str.equals(LSProtocolType.A5.toString()) || str.equals(LSProtocolType.WechatCallAT.toString()) || str.equals(LSProtocolType.WechatScale.toString()) || str.equals(LSProtocolType.UpgradeOfApollo.toString()) || str.equals(LSProtocolType.Upgrade.toString()) || str.equals(LSProtocolType.A6.toString()) || str.equals(LSProtocolType.OP.toString()) || str.equals(LSProtocolType.WechatGlucoseMeter.toString()) || str.equalsIgnoreCase(LSProtocolType.Standard.toString());
    }

    @SuppressLint({"DefaultLocale"})
    public boolean a(String str, File file, OnUpgradingListener onUpgradingListener) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            printLogMessage(getGeneralLogInfo(null, "failed to send upgrade request,mac address is invalid..." + str, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
            if (onUpgradingListener != null) {
                onUpgradingListener.onStateChanged(str, LSUpgradeState.UpgradeFailure, LSErrorCode.ParameterError.getCode());
            }
            return false;
        }
        if (file == null || !file.isFile() || !file.exists()) {
            printLogMessage(getGeneralLogInfo(null, "failed to send upgrade request,upgrade file is invalid...", com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
            if (onUpgradingListener != null) {
                onUpgradingListener.onStateChanged(str, LSUpgradeState.UpgradeFailure, LSErrorCode.FileFormatError.getCode());
            }
            return false;
        }
        String upperCase = file.getName().toUpperCase();
        for (String str2 : d.UPGRADE_FILE_NAME_SUFFIXS) {
            if (upperCase.endsWith(str2)) {
                return true;
            }
        }
        printLogMessage(getGeneralLogInfo(null, "failed to send upgrade request,file name is invalid..." + upperCase, com.lifesense.plugin.ble.b.a.a.Upgrade_Message, null, false));
        if (onUpgradingListener != null) {
            onUpgradingListener.onStateChanged(str, LSUpgradeState.UpgradeFailure, LSErrorCode.FileFormatError.getCode());
        }
        return false;
    }

    public boolean a(UUID uuid) {
        if (uuid != null) {
            return a().c(uuid.toString());
        }
        return false;
    }
}
