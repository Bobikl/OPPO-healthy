package com.lifesense.plugin.ble.c;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Build;
import android.text.TextUtils;
import com.lifesense.plugin.ble.a.a.o;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSProtocolType;
import com.lifesense.plugin.ble.data.other.BroadcastNameMatchWay;
import com.lifesense.plugin.ble.data.other.DeviceFilterInfo;
import com.lifesense.plugin.ble.data.other.PhoneBrand;
import com.lifesense.plugin.ble.data.other.PhoneMessage;
import com.lifesense.plugin.ble.data.other.ScanMode;
import com.lifesense.plugin.ble.data.other.TimePeriod;
import com.lifesense.plugin.ble.data.tracker.ATGattServiceType;
import com.lifesense.plugin.ble.device.proto.j;
import com.oplus.aiunit.vision.n04;
import com.oplus.aiunit.vision.v05;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale", "SimpleDateFormat", "NewApi"})
public class b {
    public static final PhoneBrand CURRENT_PHONE_BRAND = a();
    public static final SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    private b() {
    }

    public static PhoneBrand a() {
        try {
            String str = Build.BRAND;
            for (PhoneBrand phoneBrand : PhoneBrand.values()) {
                if (phoneBrand.toString().equalsIgnoreCase(str)) {
                    return phoneBrand;
                }
            }
            return PhoneBrand.UNKNOWN;
        } catch (Exception e2) {
            e2.printStackTrace();
            return PhoneBrand.UNKNOWN;
        }
    }

    public static int b() {
        return Build.VERSION.SDK_INT;
    }

    private static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (ScanMode.SCAN_FOR_SYNC.toString().equalsIgnoreCase(str)) {
            return 1;
        }
        return ScanMode.SCAN_FOR_NORMAL.toString().equalsIgnoreCase(str) ? 2 : 0;
    }

    public static String d() {
        int iE = e();
        String str = String.format("%02d:%02d", Integer.valueOf(Math.abs(iE / 3600000)), Integer.valueOf(Math.abs((iE / 60000) % 60)));
        StringBuilder sb = new StringBuilder();
        sb.append(v05.TIME_ZONE_0);
        sb.append(iE >= 0 ? "+" : "-");
        sb.append(str);
        return sb.toString();
    }

    public static int e() {
        TimeZone timeZone = TimeZone.getDefault();
        return timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis());
    }

    public static String a(long j2) {
        if (j2 <= 0) {
            return "null";
        }
        try {
            return DEFAULT_DATE_FORMAT.format(new Date(j2));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "exception";
        }
    }

    public static String b(long j2) {
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - j2) / 1000);
        int i = iCurrentTimeMillis / 3600;
        int i2 = (iCurrentTimeMillis / 60) % 60;
        int i3 = iCurrentTimeMillis % 60;
        StringBuffer stringBuffer = new StringBuffer();
        if (i > 0) {
            stringBuffer.append(i + " h ");
        }
        if (i2 > 0) {
            stringBuffer.append(i2 + " m ");
        }
        stringBuffer.append(i3 + " s");
        return stringBuffer.toString();
    }

    public static PhoneMessage c() {
        PhoneMessage phoneMessage = new PhoneMessage();
        phoneMessage.setBrand(Build.BRAND);
        phoneMessage.setOsVersion(Build.VERSION.RELEASE);
        phoneMessage.setSdkVersion(Build.VERSION.SDK_INT);
        phoneMessage.setModel(Build.MODEL);
        phoneMessage.setProduct(Build.PRODUCT);
        return phoneMessage;
    }

    private static String d(List list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            size--;
            stringBuffer.append(((DeviceFilterInfo) it.next()).logString());
            if (size > 0) {
                stringBuffer.append(",");
            }
        }
        return stringBuffer.toString();
    }

    public static String a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        try {
            return bluetoothDevice.getName() + "[" + bluetoothDevice.getAddress() + "]";
        } catch (Exception e2) {
            e2.printStackTrace();
            return bluetoothDevice.getAddress();
        }
    }

    public static String b(String str) {
        return (str == null || str.length() == 0) ? str : new String(str).toUpperCase();
    }

    public static TimePeriod c(long j2) {
        TimePeriod timePeriod = TimePeriod.UNKNOWN;
        if (j2 == 0) {
            return timePeriod;
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - j2) / 1000);
        if (iCurrentTimeMillis >= 0 && iCurrentTimeMillis <= 5) {
            return TimePeriod.PERIOD_5;
        }
        if (iCurrentTimeMillis > 5 && iCurrentTimeMillis <= 60) {
            return TimePeriod.PERIOD_60;
        }
        if (iCurrentTimeMillis > 60 && iCurrentTimeMillis <= 120) {
            return TimePeriod.PERIOD_120;
        }
        if (iCurrentTimeMillis > 120 && iCurrentTimeMillis <= 300) {
            return TimePeriod.PERIOD_300;
        }
        if (iCurrentTimeMillis <= 300 || iCurrentTimeMillis >= 600) {
            return iCurrentTimeMillis >= 600 ? TimePeriod.PERIOD_MAX : timePeriod;
        }
        return TimePeriod.PERIOD_600;
    }

    public static String a(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            return "null";
        }
        try {
            return bluetoothGatt.toString().replace("android.bluetooth.BluetoothGatt", "gatt");
        } catch (Exception unused) {
            return "null";
        }
    }

    public static String b(List list) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ ");
        if (list == null || list.size() <= 0) {
            stringBuffer.append("null");
        } else {
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                String strA = a((UUID) it.next());
                if (!z || !"A500".equalsIgnoreCase(strA)) {
                    stringBuffer.append(strA);
                    stringBuffer.append(",");
                }
                if ("A500".equalsIgnoreCase(strA)) {
                    z = true;
                }
            }
        }
        stringBuffer.append(" ]");
        return stringBuffer.toString().toUpperCase();
    }

    public static List c(List list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((UUID) it.next()).toUpperCase());
        }
        return arrayList;
    }

    public static String a(BluetoothGatt bluetoothGatt, int i, int i2, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("gattStatus=" + i + "(" + i2 + "),");
        StringBuilder sb = new StringBuilder();
        sb.append("bleStatus=");
        sb.append(com.lifesense.plugin.ble.a.e.a().i());
        sb.append(",");
        stringBuffer.append(sb.toString());
        stringBuffer.append("isBond:" + (com.lifesense.plugin.ble.a.e.a().b(str) != null) + ",");
        stringBuffer.append("isConnected:" + (com.lifesense.plugin.ble.a.e.a().a(str) != null) + "; ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("obj=");
        sb2.append(a(bluetoothGatt));
        stringBuffer.append(sb2.toString());
        return stringBuffer.toString();
    }

    public static String b(Map map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(n04.OPEN_BRACE_REGEX);
            Set<String> setKeySet = map.keySet();
            int size = setKeySet.size();
            for (String str : setKeySet) {
                size--;
                stringBuffer.append(c(str) + ":");
                stringBuffer.append(d((List) map.get(str)));
                if (size > 0) {
                    stringBuffer.append("; ");
                }
            }
            stringBuffer.append("}");
            return stringBuffer.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "Exception";
        }
    }

    public static String a(o oVar) {
        if (oVar == null) {
            return "null";
        }
        if (o.EnableCharacteristic == oVar) {
            return "Enable";
        }
        if (o.DisableCharacteristic == oVar) {
            return "Disable";
        }
        return o.ReadCharacteristic == oVar ? "Reading" : oVar.toString();
    }

    public static String b(Queue queue) {
        if (queue == null || queue.size() == 0) {
            return "null";
        }
        int size = queue.size();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            size--;
            stringBuffer.append(a(((BluetoothGattCharacteristic) it.next()).getUuid()));
            if (size > 0) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.toUpperCase();
    }

    public static String a(List list) {
        if (list == null || list.size() == 0) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("size = " + list.size());
        stringBuffer.append(n04.OPEN_BRACE_REGEX);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            LSDeviceInfo lSDeviceInfo = (LSDeviceInfo) it.next();
            stringBuffer.append(i);
            stringBuffer.append(" >>");
            stringBuffer.append(lSDeviceInfo.getDeviceSimplifyInfo());
            if (i < list.size()) {
                stringBuffer.append(",");
            }
            i++;
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public static String a(Map map) {
        if (map == null || map.size() == 0) {
            return "null";
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(map.get((String) it.next()));
            }
            return a(arrayList);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "Exception";
        }
    }

    public static String a(Queue queue) {
        if (queue == null || queue.isEmpty()) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("size = " + queue.size());
        stringBuffer.append(n04.OPEN_BRACE_REGEX);
        Iterator it = queue.iterator();
        int i = 1;
        while (it.hasNext()) {
            com.lifesense.plugin.ble.a.a.b bVar = (com.lifesense.plugin.ble.a.a.b) it.next();
            stringBuffer.append(i);
            stringBuffer.append(" >>");
            stringBuffer.append("[ mac = " + bVar.d() + "]");
            if (i < queue.size()) {
                stringBuffer.append(",");
            }
            i++;
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public static String a(UUID uuid) {
        if (uuid == null) {
            return "null";
        }
        String string = uuid.toString();
        if (!TextUtils.isEmpty(string) && string.length() > 8) {
            string = string.substring(4, 8);
        }
        return string.toUpperCase();
    }

    @SuppressLint({"NewApi"})
    public static Queue a(Queue queue, LSProtocolType lSProtocolType) {
        if (queue != null && queue.size() != 0) {
            if (LSProtocolType.A5 == lSProtocolType) {
                LinkedList linkedList = new LinkedList(queue);
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) it.next();
                    if (bluetoothGattCharacteristic.getService().getUuid().equals(j.PEDOMETER_SERVICE_UUID_WECHAT)) {
                        linkedList.remove(bluetoothGattCharacteristic);
                    }
                    if (bluetoothGattCharacteristic.getService().getUuid().equals(j.APOLLO_DEVICE_DFU_SERVICE_UUID)) {
                        linkedList.remove(bluetoothGattCharacteristic);
                    }
                    if (bluetoothGattCharacteristic.getService().getUuid().equals(j.STANDARD_HEART_RATE_SERVICE_UUID)) {
                        linkedList.remove(bluetoothGattCharacteristic);
                    }
                }
                return linkedList;
            }
            if (LSProtocolType.UpgradeOfApollo == lSProtocolType) {
                LinkedList linkedList2 = new LinkedList(queue);
                Iterator it2 = queue.iterator();
                while (it2.hasNext()) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) it2.next();
                    if (bluetoothGattCharacteristic2.getService().getUuid().equals(j.APOLLO_DEVICE_DFU_SERVICE_UUID)) {
                        linkedList2.remove(bluetoothGattCharacteristic2);
                    }
                }
                return linkedList2;
            }
        }
        return queue;
    }

    @SuppressLint({"NewApi"})
    public static Queue a(Queue queue, ATGattServiceType aTGattServiceType) {
        if (queue != null && queue.size() != 0) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = null;
            if (ATGattServiceType.AncsService == aTGattServiceType) {
                LinkedList linkedList = new LinkedList(queue);
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic2 = (BluetoothGattCharacteristic) it.next();
                    if (bluetoothGattCharacteristic2.getService().getUuid().equals(j.SERVICE_UUID_ANCS)) {
                        bluetoothGattCharacteristic = bluetoothGattCharacteristic2;
                        break;
                    }
                }
                linkedList.clear();
                linkedList.add(bluetoothGattCharacteristic);
                return linkedList;
            }
            if (ATGattServiceType.DataService == aTGattServiceType) {
                LinkedList linkedList2 = new LinkedList(queue);
                Iterator it2 = queue.iterator();
                while (it2.hasNext()) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic3 = (BluetoothGattCharacteristic) it2.next();
                    if (bluetoothGattCharacteristic3.getService().getUuid().equals(j.SERVICE_UUID_ANCS)) {
                        bluetoothGattCharacteristic = bluetoothGattCharacteristic3;
                        break;
                    }
                }
                linkedList2.remove(bluetoothGattCharacteristic);
                return linkedList2;
            }
        }
        return queue;
    }

    public static boolean a(String str, DeviceFilterInfo deviceFilterInfo) {
        if (!TextUtils.isEmpty(str) && deviceFilterInfo != null && !TextUtils.isEmpty(deviceFilterInfo.getBroadcastName())) {
            if (deviceFilterInfo.getMatchWay() == BroadcastNameMatchWay.PREFIX) {
                return str.startsWith(deviceFilterInfo.getBroadcastName());
            }
            if (deviceFilterInfo.getMatchWay() == BroadcastNameMatchWay.SUFFIX) {
                return str.endsWith(deviceFilterInfo.getBroadcastName());
            }
            if (deviceFilterInfo.getMatchWay() == BroadcastNameMatchWay.EQUALS) {
                return str.equals(deviceFilterInfo.getBroadcastName());
            }
            if (deviceFilterInfo.getMatchWay() == BroadcastNameMatchWay.EQUALS_IGNORE_CASE) {
                return str.equalsIgnoreCase(deviceFilterInfo.getBroadcastName());
            }
            if (deviceFilterInfo.getMatchWay() == BroadcastNameMatchWay.PREFIX_IGNORE_CASE) {
                return str.toLowerCase().startsWith(deviceFilterInfo.getBroadcastName().toLowerCase());
            }
            if (deviceFilterInfo.getMatchWay() == BroadcastNameMatchWay.SUFFIX_IGNORE_CASE) {
                return str.toLowerCase().endsWith(deviceFilterInfo.getBroadcastName().toLowerCase());
            }
        }
        return false;
    }
}
