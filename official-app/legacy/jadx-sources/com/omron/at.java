package com.omron;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.heytap.store.base.core.http.HttpConst;
import com.omron.lib.common.OMRONBLEErrMsg;
import com.omron.lib.device.bg.OmronBgBleCallBack;
import com.omron.lib.model.bg.BGData;
import com.omron.lib.model.bg.Unit;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class at {
    private static final String o = "c";

    @Nullable
    protected static volatile at p;
    private static final Object q = new Object();

    @NonNull
    private final Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private aq f8824c;
    private ar d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8825e;
    private OmronBgBleCallBack f;
    private OmronBgBleCallBack k;
    private String b = "";
    private final as.g g = new a();
    private final ar.b h = new b();
    private boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8826j = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final as.g f8827l = new c();
    private final ar.b m = new d();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8828n = false;

    public class a implements as.g {
        public a() {
        }

        @Override // com.omron.as.g
        public void a(ap apVar) {
            ay.a(at.o, "bindDevice onConnectionStateChange status:" + apVar);
            if (f.a[apVar.ordinal()] != 4) {
                return;
            }
            at.this.d.a(-1, at.this.h);
        }

        @Override // com.omron.lib.common.OMRONBLECallbackBase
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            at.this.a("connectionCB", oMRONBLEErrMsg);
        }
    }

    public class b implements ar.b {

        public class a implements av.b {
            final /* synthetic */ List a;

            public a(List list) {
                this.a = list;
            }

            @Override // com.omron.av.b
            public void a(int i, String str) {
                ax<Void> axVarA = au.a(str);
                if (axVarA.b()) {
                    at.this.f8826j = true;
                } else if (axVarA.a() < 506 || axVarA.a() > 509) {
                    at.this.i = true;
                }
                if (at.this.f8826j) {
                    at.this.a("requestUpdateDeviceInfo", OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                } else if (!at.this.i) {
                    at.this.a("requestUpdateDeviceInfo", OMRONBLEErrMsg.OMRON_SDK_BindFail);
                } else {
                    at atVar = at.this;
                    atVar.a(atVar.d.c().getName(), at.this.d.c().getAddress(), (List<BGData>) this.a);
                }
            }

            @Override // com.omron.av.b
            public void b(int i, String str) {
                at atVar = at.this;
                atVar.a(atVar.d.c().getName(), at.this.d.c().getAddress(), (List<BGData>) this.a);
            }
        }

        public b() {
        }

        @Override // com.omron.ar.b
        public void a(int i, int i2) {
        }

        @Override // com.omron.lib.common.OMRONBLECallbackBase
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            at.this.a("readBGDataCB", oMRONBLEErrMsg);
        }

        @Override // com.omron.ar.b
        public void a(List<BGData> list) {
            ay.a(at.o, "bindDevice onDataReadComplete:" + list.size());
            if (!at.this.f8825e) {
                ay.a(at.o, "bindDevice onDataReadComplete device is not connecting", new Object[0]);
                return;
            }
            if (list.size() > 0) {
                int sequenceNumber = list.get(list.size() - 1).getSequenceNumber() + 1;
                o.b(at.this.a, at.this.d.c().getAddress(), Integer.valueOf(sequenceNumber));
                ay.a(at.o, "bindDevice onDataReadComplete sequenceNum:" + sequenceNumber);
            }
            for (int i = 0; i < list.size(); i++) {
                ay.a(at.o, "bindDevice get device Glucose:" + list.get(i).getGlucoseConcentration());
                list.get(i).setGlucoseConcentration(list.get(i).getGlucoseConcentration() / 100.0f);
                list.get(i).setUnit(Unit.UNIT_MMOLPL);
            }
            at.this.i = false;
            at.this.f8826j = false;
            ay.a(at.o, "requestUpdateDeviceInfo start deviceName:%s", at.this.d.c().getName());
            try {
                HashMap map = new HashMap();
                map.put("uuid", (String) o.a(at.this.a, "uuid", ""));
                map.put("deviceCategory", "2");
                map.put("deviceDigitalId", at.this.d.c().getName());
                if (at.this.f8824c != null) {
                    map.put("deviceType", at.this.f8824c.c());
                }
                String strValueOf = String.valueOf(o.a(at.this.a, HttpConst.APP_KEY, ""));
                av.a().a(205, new a(list), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/DeviceInfo", new JSONObject(map).toString(), strValueOf, m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
            } catch (Exception e2) {
                e2.printStackTrace();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                ay.b(at.o, "requestUpdateDeviceInfo fail:%s", byteArrayOutputStream.toString());
            }
            ay.a(at.o, "requestUpdateDeviceInfo end mUpdateDeviceInfoSuccess:%s", Boolean.valueOf(at.this.i));
        }
    }

    public class c implements as.g {
        public c() {
        }

        @Override // com.omron.as.g
        public void a(ap apVar) {
            ay.a(at.o, "getData onConnectionStateChange status:" + apVar);
            if (f.a[apVar.ordinal()] != 4) {
                return;
            }
            int iIntValue = ((Integer) o.a(at.this.a, at.this.d.c().getAddress(), 1)).intValue();
            ay.a(at.o, "getData onConnectionStateChange bgSequenceNum is:" + iIntValue);
            at.this.d.a(iIntValue, at.this.m);
        }

        @Override // com.omron.lib.common.OMRONBLECallbackBase
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            at.this.b("readBGDataCB", oMRONBLEErrMsg);
        }
    }

    public class d implements ar.b {
        public d() {
        }

        @Override // com.omron.ar.b
        public void a(int i, int i2) {
        }

        @Override // com.omron.lib.common.OMRONBLECallbackBase
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            at.this.b("readBGDataCB", oMRONBLEErrMsg);
        }

        @Override // com.omron.ar.b
        public void a(List<BGData> list) {
            ay.a(at.o, "getData onDataReadComplete:" + list.size());
            if (!at.this.f8825e) {
                ay.a(at.o, "getData onDataReadComplete device is not connecting", new Object[0]);
                return;
            }
            int iIntValue = ((Integer) o.a(at.this.a, at.this.d.c().getAddress(), 1)).intValue();
            if (list.size() > 0) {
                int sequenceNumber = list.get(list.size() - 1).getSequenceNumber() + 1;
                o.b(at.this.a, at.this.d.c().getAddress(), Integer.valueOf(sequenceNumber));
                ay.a(at.o, "getData onDataReadComplete sequenceNum:" + sequenceNumber, new Object[0]);
            }
            for (int i = 0; i < list.size(); i++) {
                ay.a(at.o, "getData get device Glucose:" + list.get(i).getGlucoseConcentration(), new Object[0]);
                list.get(i).setGlucoseConcentration(list.get(i).getGlucoseConcentration() / 100.0f);
                list.get(i).setUnit(Unit.UNIT_MMOLPL);
            }
            if (list.isEmpty()) {
                at.this.b("dataRead", OMRONBLEErrMsg.OMRON_BLE_ERROR_SYNC_EMPTY);
                return;
            }
            String strA = l.a(au.a(at.this.f8824c.c(), at.this.d.c().getName(), list, at.this.a));
            ay.a(at.o, "local bp data string save:" + strA, new Object[0]);
            k.a(at.this.b, strA, "utf-8", true);
            ay.a(at.o, "getData onDataReadComplete success,sequenceNum:" + iIntValue);
            at.this.c();
            boolean z = at.this.f8826j;
            at atVar = at.this;
            if (z) {
                atVar.a("requestUploadBgDataList", OMRONBLEErrMsg.OMRON_SDK_InValidKey);
            } else {
                atVar.a(list);
            }
        }
    }

    public class e implements av.b {
        public e() {
        }

        @Override // com.omron.av.b
        public void a(int i, String str) {
            ax<Void> axVarA = au.a(str);
            if (at.this.f8828n) {
                if (axVarA.b()) {
                    at.this.f8826j = true;
                } else if (axVarA.c()) {
                    ay.a("requestUploadBgDataList end, clean local bp data list", new Object[0]);
                    k.a(at.this.b, "", "utf-8", false);
                    try {
                        if (new JSONObject(str).getJSONObject("data").getInt("flag") == 1) {
                            ay.a("requestUploadBgDataList, need upload file", new Object[0]);
                            try {
                                Thread.sleep(1000L);
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                            ay.a(false);
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        e3.printStackTrace(new PrintStream(byteArrayOutputStream));
                        ay.b(" requestUploadBgDataList    " + byteArrayOutputStream.toString(), new Object[0]);
                    }
                }
            }
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e4) {
                e4.printStackTrace();
            }
        }

        @Override // com.omron.av.b
        public void b(int i, String str) {
        }
    }

    public static /* synthetic */ class f {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ap.values().length];
            a = iArr;
            try {
                iArr[ap.STATE_CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ap.STATE_DISCONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ap.STATE_DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ap.STATE_CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public at(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String strA = k.a(this.b, "utf-8");
        String str = o;
        ay.a(str, "local bp data string get:" + strA, new Object[0]);
        if (strA.contains("][")) {
            strA = strA.replace("][", ",");
        }
        ay.a(str, "requestUploadBgDataList start, local data list:%s", strA);
        try {
            this.f8826j = false;
            this.f8828n = false;
            JSONArray jSONArray = new JSONArray(strA);
            int i = 0;
            while (true) {
                double d2 = i;
                if (d2 >= Math.ceil(((double) jSONArray.length()) / 1000.0d)) {
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                if (d2 == Math.ceil(((double) jSONArray.length()) / 1000.0d) - 1.0d) {
                    for (int i2 = i * 1000; i2 < jSONArray.length(); i2++) {
                        jSONArray2.put(jSONArray.get(i2));
                    }
                    this.f8828n = true;
                } else {
                    for (int i3 = i * 1000; i3 < (i + 1) * 1000; i3++) {
                        jSONArray2.put(jSONArray.get(i3));
                    }
                }
                String strValueOf = String.valueOf(o.a(this.a, HttpConst.APP_KEY, ""));
                av.a().a(206, new e(), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/BgInfo", strA, strValueOf, m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
                i++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e2.printStackTrace(new PrintStream(byteArrayOutputStream));
            ay.b(o, "requestUploadBgDataList fail2:%s", byteArrayOutputStream.toString());
        }
    }

    public void d() {
        ar arVar = this.d;
        if (arVar != null) {
            arVar.h();
        }
        b();
    }

    @NonNull
    public static at a(@NonNull Context context) {
        at atVar = p;
        if (atVar == null) {
            synchronized (q) {
                atVar = p;
                if (atVar == null) {
                    atVar = new at(context);
                    p = atVar;
                    ay.a("BleBgHelper init");
                }
            }
        }
        return atVar;
    }

    private void b() {
        this.f8825e = false;
    }

    public void a(@NonNull aq aqVar, @NonNull BluetoothDevice bluetoothDevice, @NonNull OmronBgBleCallBack omronBgBleCallBack) {
        if (this.f8825e) {
            ay.a(o, "bindBgDevice isDeviceConnecting", new Object[0]);
            return;
        }
        this.f8825e = true;
        this.f = omronBgBleCallBack;
        String str = o;
        ay.a(str, "bindBgDevice init", new Object[0]);
        this.f8824c = aqVar;
        ay.a(str, "onScanComplete device:" + bluetoothDevice.getAddress(), new Object[0]);
        if (bluetoothDevice.getBondState() == 10) {
            ay.a(str, "onScanComplete  BluetoothDevice.BOND_NONE ", new Object[0]);
            try {
                g.c(bluetoothDevice.getClass(), bluetoothDevice);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        ar arVar = new ar(bluetoothDevice, this.a, br.Register);
        this.d = arVar;
        arVar.a(this.g, false);
    }

    @SuppressLint({"MissingPermission"})
    public void b(@NonNull aq aqVar, @NonNull BluetoothDevice bluetoothDevice, final OmronBgBleCallBack omronBgBleCallBack) {
        if (this.f8825e) {
            ay.a(o, "getDeviceData1 isDeviceConnecting", new Object[0]);
            return;
        }
        if (bluetoothDevice.getBondState() == 10) {
            Log.i(o, "BluetoothDevice.BOND_NONE");
            if (omronBgBleCallBack != null) {
                new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.sem
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.omron.at.a(omronBgBleCallBack);
                    }
                }).start();
                return;
            }
            return;
        }
        this.f8825e = true;
        this.k = omronBgBleCallBack;
        this.f8824c = aqVar;
        ay.a(o, "getDeviceData init", new Object[0]);
        ar arVar = new ar(bluetoothDevice, this.a, br.Transfer);
        this.d = arVar;
        arVar.a(this.f8827l, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, @NonNull OMRONBLEErrMsg oMRONBLEErrMsg) {
        a(false, str, oMRONBLEErrMsg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(OmronBgBleCallBack omronBgBleCallBack) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        omronBgBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_BOND_STATE_ERROR);
    }

    public void a(String str) {
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, @NonNull OMRONBLEErrMsg oMRONBLEErrMsg) {
        a(true, str, oMRONBLEErrMsg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, List<BGData> list) {
        String str3 = o;
        ay.a(str3, "onBindSuccess bgDataList:" + list.size(), new Object[0]);
        if (!this.f8825e) {
            ay.a(str3, "onBindSuccess device is not connecting", new Object[0]);
            return;
        }
        b();
        OmronBgBleCallBack omronBgBleCallBack = this.f;
        if (omronBgBleCallBack != null) {
            omronBgBleCallBack.onBindComplete(this.f8824c.c(), str, str2, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<BGData> list) {
        String str = o;
        ay.a(str, "onGetDataSuccess bgDataList:" + list.size(), new Object[0]);
        if (!this.f8825e) {
            ay.a(str, "onGetDataSuccess device is not connecting", new Object[0]);
            return;
        }
        b();
        OmronBgBleCallBack omronBgBleCallBack = this.k;
        if (omronBgBleCallBack != null) {
            omronBgBleCallBack.onDataReadComplete(this.f8824c.c(), this.d.c().getName(), this.d.c().getAddress(), list);
        }
    }

    private void a(boolean z, String str, @NonNull OMRONBLEErrMsg oMRONBLEErrMsg) {
        String str2 = o;
        Object[] objArr = new Object[3];
        objArr[0] = z ? "bindDevice" : "getDeviceData";
        objArr[1] = str;
        objArr[2] = oMRONBLEErrMsg;
        ay.a(str2, String.format("%s:%s onFail, errMgs:%s", objArr), new Object[0]);
        if (!this.f8825e) {
            ay.a(str2, "onCommonFailure device is not connecting", new Object[0]);
            return;
        }
        b();
        if (z) {
            OmronBgBleCallBack omronBgBleCallBack = this.f;
            if (omronBgBleCallBack != null) {
                omronBgBleCallBack.onFailure(oMRONBLEErrMsg);
                return;
            }
            return;
        }
        OmronBgBleCallBack omronBgBleCallBack2 = this.k;
        if (omronBgBleCallBack2 != null) {
            omronBgBleCallBack2.onFailure(oMRONBLEErrMsg);
        }
    }
}
