package com.omron.lib;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.text.TextUtils;
import android.util.Pair;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.store.base.core.http.HttpConst;
import com.omron.Cdo;
import com.omron.al;
import com.omron.am;
import com.omron.an;
import com.omron.ao;
import com.omron.aq;
import com.omron.at;
import com.omron.au;
import com.omron.av;
import com.omron.ay;
import com.omron.bn;
import com.omron.bo;
import com.omron.bp;
import com.omron.bq;
import com.omron.br;
import com.omron.dp;
import com.omron.dr;
import com.omron.dv;
import com.omron.dx;
import com.omron.dy;
import com.omron.ei;
import com.omron.ej;
import com.omron.el;
import com.omron.eo;
import com.omron.lib.common.OMRONBLEErrMsg;
import com.omron.lib.device.DeviceInfo;
import com.omron.lib.device.bf.OmronBfBleCallBack;
import com.omron.lib.device.bf.OmronBfDeviceCallback;
import com.omron.lib.device.bg.OmronBgBleCallBack;
import com.omron.lib.device.bg.OmronBgDeviceCallback;
import com.omron.lib.device.bo.OmronBoBleCallBack;
import com.omron.lib.device.bo.OmronBoDeviceCallback;
import com.omron.lib.device.bp.OmronBpBleCallBack;
import com.omron.lib.device.bp.OmronBpDeviceCallback;
import com.omron.lib.model.BPData;
import com.omron.lib.model.BoData;
import com.omron.lib.model.BodyfatData;
import com.omron.lib.model.bg.BGData;
import com.omron.lib.ohc.OHQDeviceManager;
import com.omron.lib.utils.OmronLogVisibleUtil;
import com.omron.w;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class OMRONLib extends com.omron.lib.a implements OmronCallback, OmronBfDeviceCallback, OmronBgDeviceCallback, OmronBoDeviceCallback, OmronBpDeviceCallback {
    public static boolean C0 = true;

    @Nullable
    private static OMRONLib D0;
    DeviceInfo A;
    public am.n A0;
    List<BPData> B;
    public OHQDeviceManager.z B0;
    public am.n C;
    public OHQDeviceManager.z D;

    @NonNull
    private final Map<dx, Object> E;

    @NonNull
    private final ei F;
    private al G;
    private am H;
    private final bn I;
    private final bq J;
    private String K;
    private int L;
    private List<BleScanDevice> M;
    private br N;
    private String O;
    private String P;
    private String Q;
    private final Map<dy, Object> R;
    private OmronBfBleCallBack S;
    private boolean T;
    private String U;
    private bo V;
    private boolean W;
    private boolean X;
    public al.b Y;
    private String Z;
    private String a0;
    private String b0;
    private String c0;
    public am.n d0;
    public OHQDeviceManager.z e0;
    private boolean f0;
    private boolean g0;

    @NonNull
    private final at h0;
    private List<BleScanDevice> i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private OmronBpBleCallBack f9003j;
    private OmronBgBleCallBack j0;
    private String k;
    private OmronBoBleCallBack k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9004l;
    final Map<dx, Object> l0;
    private final int m;
    private al m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f9005n;
    private am n0;
    private boolean o;
    private boolean o0;
    private al p;
    private boolean p0;
    private am q;
    private String q0;
    private final ei r;
    private String r0;
    private br s;
    private br s0;
    private String t;
    private List<BleScanDevice> t0;
    private boolean u;
    private final ei u0;
    private List<BleScanDevice> v;
    public al.b v0;

    @NonNull
    private final Map<dx, Object> w;
    private DeviceInfo w0;
    private boolean x;
    private List<BoData> x0;
    private boolean y;
    private boolean y0;
    public al.b z;
    private boolean z0;

    public class a implements av.b {
        public a() {
        }

        @Override // com.omron.av.b
        public void a(int i, String str) {
            ay.a("UpdateBFPersonInfo()    请求返回res " + str, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = jSONObject.getInt("code");
                String string = jSONObject.getString("message");
                if (i2 < 506 || i2 > 509) {
                    ay.a("UpdateBFPersonInfo()    上传体脂个人信息数据成功", new Object[0]);
                } else {
                    OMRONLib.this.g0 = true;
                    OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                    ay.a("UpdateBFPersonInfo()    上传体脂个人信息数据  code : " + i2 + "  message : " + string, new Object[0]);
                    OMRONLib.this.T = true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                ay.b(" UpdateBFPersonInfo    " + byteArrayOutputStream.toString(), new Object[0]);
            }
        }

        @Override // com.omron.av.b
        public void b(int i, String str) {
        }
    }

    public class b implements av.b {
        public b() {
        }

        @Override // com.omron.av.b
        public void a(int i, String str) {
            ay.a("UpdateBodyfatInfo()    请求返回res " + str, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = jSONObject.getInt("code");
                jSONObject.getString("message");
                if (i2 < 506 || i2 > 509) {
                    int i3 = jSONObject.getJSONObject("data").getInt("flag");
                    ay.a("UpdateBodyfatInfo()    上传体脂数据成功", new Object[0]);
                    if (OMRONLib.this.f0) {
                        ay.a("UpdateBodyfatInfo()    清除本地体脂数据", new Object[0]);
                        com.omron.k.a(OMRONLib.this.b("bodyfatdata.txt"), "", "utf-8", false);
                        if (i3 == 1) {
                            ay.a(" UpdateBodyfatInfo()  上传日志", new Object[0]);
                            Thread.sleep(1000L);
                            ay.a(false);
                        }
                    }
                } else {
                    OMRONLib.this.g0 = true;
                }
                Thread.sleep(500L);
            } catch (Exception e2) {
                e2.printStackTrace();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                ay.b(" UpdateBodyfatInfo " + byteArrayOutputStream.toString(), new Object[0]);
            }
        }

        @Override // com.omron.av.b
        public void b(int i, String str) {
        }
    }

    public class c implements OmronBgBleCallBack {
        public c() {
        }

        @Override // com.omron.lib.device.bg.OmronBgBleCallBack
        public void onBindComplete(String str, String str2, String str3, List<BGData> list) {
        }

        @Override // com.omron.lib.device.bg.OmronBgBleCallBack
        public void onDataReadComplete(String str, String str2, String str3, List<BGData> list) {
            ay.a("OMRONLib", "onBgBleSuccess", new Object[0]);
            if (OMRONLib.this.j0 != null) {
                OMRONLib.this.j0.onDataReadComplete(str, str2, str3, list);
            }
            if (OMRONLib.this.isMonitoring()) {
                ay.a("OMRONLib", "onBgBleSuccess, is on monitoring, restart cycle scan", new Object[0]);
                OMRONLib oMRONLib = OMRONLib.this;
                oMRONLib.b(oMRONLib.i0);
            }
        }

        @Override // com.omron.lib.common.OMRONBLECallbackBase
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            ay.a("OMRONLib", "onBgBleFailure, msg:%s, code:%s", oMRONBLEErrMsg.getErrMsg(), Integer.valueOf(oMRONBLEErrMsg.getErrCode()));
            if (OMRONLib.this.j0 != null) {
                OMRONLib.this.j0.onFailure(oMRONBLEErrMsg);
            }
            if (OMRONLib.this.isMonitoring()) {
                ay.a("OMRONLib", "onBgBleFailure, is on monitoring", new Object[0]);
                if (oMRONBLEErrMsg != OMRONBLEErrMsg.OMRON_SDK_NoDevice && oMRONBLEErrMsg != OMRONBLEErrMsg.OMRON_SDK_ConnectFail && oMRONBLEErrMsg != OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL) {
                    ay.a("OMRONLib", "onBgBleFailure, to stopBpMonitoring", new Object[0]);
                    OMRONLib.this.stopBgMonitoring();
                } else {
                    ay.a("OMRONLib", "onBgBleFailure, restart cycle scan", new Object[0]);
                    OMRONLib oMRONLib = OMRONLib.this;
                    oMRONLib.b(oMRONLib.i0);
                }
            }
        }
    }

    public class d implements ei.d {
        final /* synthetic */ el a;
        final /* synthetic */ Context b;

        public d(el elVar, Context context) {
            this.a = elVar;
            this.b = context;
        }

        private void b() {
            el elVar = this.a;
            final Context context = this.b;
            elVar.post(new Runnable() { // from class: com.omron.lib.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.a(context);
                }
            });
        }

        @Override // com.omron.ei.d
        public void onSuccess() {
            b();
        }

        @Override // com.omron.ei.d
        public void a() {
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Context context) {
            ay.a("OMRONLib", "startBoSession startSession, mBoAddress:%s", OmronLogVisibleUtil.getMessage(OMRONLib.this.q0));
            OMRONLib.this.n0.a(OMRONLib.this.a(context));
            OMRONLib.this.l0.put(dx.ConnectionWaitTimeKey, 60000L);
            OMRONLib.this.n0.b(OMRONLib.this.q0, OMRONLib.this.l0);
        }
    }

    public class e implements al.b {

        public class a implements ei.d {
            final /* synthetic */ el a;
            final /* synthetic */ Context b;

            public a(el elVar, Context context) {
                this.a = elVar;
                this.b = context;
            }

            private void b() {
                el elVar = this.a;
                final Context context = this.b;
                elVar.post(new Runnable() { // from class: com.omron.lib.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.a(context);
                    }
                });
            }

            @Override // com.omron.ei.d
            public void onSuccess() {
                b();
            }

            @Override // com.omron.ei.d
            public void a() {
                b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void a(Context context) {
                ay.a("OMRONLib", "startBoSession startSession, mBoAddress:%s", OmronLogVisibleUtil.getMessage(OMRONLib.this.q0));
                OMRONLib.this.n0.a(OMRONLib.this.a(context));
                OMRONLib.this.l0.put(dx.ConnectionWaitTimeKey, 60000L);
                OMRONLib.this.n0.b(OMRONLib.this.q0, OMRONLib.this.l0);
            }
        }

        public e() {
        }

        private void a(Context context) {
            ay.a("OMRONLib", "startBoSession", new Object[0]);
            if (OMRONLib.this.n0.d()) {
                ay.a("OMRONLib", "startBoSession Already started session.", new Object[0]);
            } else {
                OMRONLib.this.u0.a(new a(new el(), context));
            }
        }

        @Override // com.omron.al.b
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            OMRONLib.this.b(oMRONBLEErrMsg);
        }

        @Override // com.omron.al.b
        public void a(@NonNull bo boVar) {
            ay.a("OMRONLib", "onBfoScan: discoveredDevice: %s", boVar);
            OMRONLib.this.q0 = boVar.a();
            OMRONLib.this.r0 = boVar.b();
            OMRONLib.this.V = boVar;
            OMRONLib.this.l0.clear();
            OMRONLib.this.l0.put(dx.ReadMeasurementRecordsKey, Boolean.TRUE);
            if (OMRONLib.this.m0 != null) {
                OMRONLib.this.m0.e();
            }
            a(OMRONLib.this.a);
            OMRONLib.this.x = false;
        }

        @Override // com.omron.al.b
        public void a(@NonNull Cdo cdo) {
            if (cdo == Cdo.PoweredOff) {
                OMRONLib.this.b(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            }
        }
    }

    public class f implements am.n {

        public class a implements av.b {
            public a() {
            }

            @Override // com.omron.av.b
            public void a(int i, String str) {
                if (au.a(str).b()) {
                    OMRONLib.this.k0.onFailure(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                } else {
                    OMRONLib.this.k0.onBoComplete(OMRONLib.this.g.c(), OMRONLib.this.r0, OMRONLib.this.q0, OMRONLib.this.w0, OMRONLib.this.x0);
                }
            }

            @Override // com.omron.av.b
            public void b(int i, String str) {
                OMRONLib.this.k0.onBoComplete(OMRONLib.this.g.c(), OMRONLib.this.r0, OMRONLib.this.q0, OMRONLib.this.w0, OMRONLib.this.x0);
            }
        }

        public f() {
        }

        @Override // com.omron.am.n
        public void a(@NonNull bp bpVar) {
            bpVar.f(OmronLogVisibleUtil.getMessage(bpVar.k()));
            ay.a("OMRONLib", "sessionData:" + bpVar, new Object[0]);
            ay.a("OMRONLib", "onSessionComplete:" + bpVar.b(), new Object[0]);
            if (bpVar.b() == Cdo.FailedToConnect) {
                OMRONLib.this.b(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
            if (bpVar.b() == Cdo.ConnectionTimedOut) {
                OMRONLib.this.b(OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL);
            }
            if (bpVar.b() == Cdo.FailedToTransfer) {
                OMRONLib.this.b(OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL);
            }
            if (bpVar.b() == Cdo.PoweredOff) {
                OMRONLib.this.b(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            }
            if (bpVar.b() == Cdo.Canceled) {
                OMRONLib.this.b(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
            if (bpVar.b() == Cdo.Disconnected) {
                if (OMRONLib.this.s0 == br.Register) {
                    OMRONLib.this.x0 = com.omron.f.b(bpVar.h());
                    OMRONLib.this.w0 = new DeviceInfo();
                    OMRONLib.this.w0.setSerialNumber(bpVar.k());
                    OMRONLib.this.w0.setModelName(bpVar.i());
                    OMRONLib.this.w0.setHardwareVersion(bpVar.f());
                    OMRONLib.this.w0.setSoftwareVersion(bpVar.l());
                    OMRONLib.this.w0.setFirmwareVersion(bpVar.e());
                    OMRONLib.this.w0.setManufacturerName(bpVar.g());
                    OMRONLib.this.w0.setBatteryLevel(bpVar.a());
                    try {
                        HashMap map = new HashMap();
                        map.put("uuid", (String) com.omron.o.a(OMRONLib.this.a, "uuid", ""));
                        map.put("deviceCategory", "4");
                        map.put("deviceDigitalId", OMRONLib.this.r0);
                        aq aqVar = OMRONLib.this.g;
                        if (aqVar != null) {
                            map.put("deviceType", aqVar.c());
                        }
                        String strValueOf = String.valueOf(com.omron.o.a(OMRONLib.this.a, HttpConst.APP_KEY, ""));
                        av.a().a(210, new a(), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/DeviceInfo", new JSONObject(map).toString(), strValueOf, com.omron.m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                        ay.b("OMRONLib", "requestUpdateDeviceInfo fail:%s", byteArrayOutputStream.toString());
                        OMRONLib.this.k0.onBoComplete(OMRONLib.this.g.c(), OMRONLib.this.r0, OMRONLib.this.q0, OMRONLib.this.w0, OMRONLib.this.x0);
                        return;
                    }
                }
                if (OMRONLib.this.s0 == br.Transfer) {
                    OMRONLib.this.x0 = com.omron.f.b(bpVar.h());
                    if (OMRONLib.this.x0.isEmpty()) {
                        OMRONLib.this.k0.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_SYNC_EMPTY);
                    } else {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < OMRONLib.this.x0.size(); i++) {
                                BoData boData = (BoData) OMRONLib.this.x0.get(i);
                                HashMap map2 = new HashMap();
                                map2.put("sao2", boData.getOxygen());
                                map2.put("pulse", boData.getPulse());
                                map2.put("measureAt", "" + com.omron.i.a(new Date()));
                                aq aqVar2 = OMRONLib.this.g;
                                if (aqVar2 != null) {
                                    map2.put("deviceType", aqVar2.c());
                                }
                                map2.put("deviceDigitalId", "" + OMRONLib.this.k);
                                map2.put("uuid", (String) com.omron.o.a(OMRONLib.this.a, "uuid", ""));
                                jSONArray.put(new JSONObject(map2));
                            }
                            if (jSONArray.length() > 0) {
                                ay.a("mOMRONBLEReadBODataCB  保存血氧数据到本地", new Object[0]);
                                com.omron.k.a(OMRONLib.this.b("bo_data.txt"), jSONArray.toString(), "utf-8", true);
                            }
                            OMRONLib.this.g();
                            if (OMRONLib.this.y0) {
                                OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                                return;
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            e3.printStackTrace(new PrintStream(byteArrayOutputStream2));
                            ay.b("onDataReadComplete:" + byteArrayOutputStream2.toString(), new Object[0]);
                        }
                        OMRONLib.this.k0.onBoDataReadComplete(OMRONLib.this.g.c(), OMRONLib.this.r0, OMRONLib.this.q0, OMRONLib.this.x0);
                    }
                    if (OMRONLib.this.isMonitoring()) {
                        ay.a("OMRONLib", "onBgBleSuccess, is on monitoring, restart cycle scan", new Object[0]);
                        OMRONLib oMRONLib = OMRONLib.this;
                        oMRONLib.b(oMRONLib.t0);
                    }
                }
            }
        }

        @Override // com.omron.am.n
        public void a(@NonNull dp dpVar) {
            ay.a("OMRONLib", "onConnectionStateChanged:" + dpVar.name());
            if (dp.Connected == dpVar) {
                OMRONLib.this.p0 = true;
            }
        }
    }

    public class g implements OHQDeviceManager.z {
        public g() {
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a() {
            ay.a("OMRONLib", "onPairingRequest:");
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull dr drVar) {
            ay.a("OMRONLib", "onDetailedStateChanged:" + drVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.g gVar) {
            ay.a("OMRONLib", "onAclConnectionStateChanged:" + gVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.h hVar) {
            ay.a("OMRONLib", "onBondStateChanged:" + hVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.i iVar) {
            ay.a("OMRONLib", "onGattConnectionStateChanged:" + iVar.name());
        }
    }

    public class h implements av.b {
        public h() {
        }

        @Override // com.omron.av.b
        public void a(int i, String str) {
            ay.a(" UpLoadBoData()    请求返回res " + str, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = jSONObject.getInt("code");
                String string = jSONObject.getString("message");
                if (i2 < 506 || i2 > 509) {
                    int i3 = jSONObject.getJSONObject("data").getInt("flag");
                    ay.a("UpLoadBoData()    上传血氧数据成功", new Object[0]);
                    if (OMRONLib.this.z0) {
                        ay.a("UpLoadBoData()    清除本地血氧数据", new Object[0]);
                        com.omron.k.a(OMRONLib.this.b("bo_data.txt"), "", "utf-8", false);
                        if (i3 == 1) {
                            ay.a("UpLoadBoData()    上传日志", new Object[0]);
                            Thread.sleep(1000L);
                            ay.a(false);
                        }
                    }
                } else {
                    OMRONLib.this.y0 = true;
                    ay.a("UpLoadBoData()    上传血氧数据  code : " + i2 + "  message : " + string, new Object[0]);
                }
                Thread.sleep(500L);
            } catch (Exception e2) {
                e2.printStackTrace();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                ay.b(" UpLoadBoData    " + byteArrayOutputStream.toString(), new Object[0]);
            }
        }

        @Override // com.omron.av.b
        public void b(int i, String str) {
        }
    }

    public class i implements al.b {
        String a = "";
        String b = "";

        public i() {
        }

        @Override // com.omron.al.b
        public void a(@NonNull bo boVar) {
            bo boVar2 = new bo(boVar.a());
            ArrayList arrayList = new ArrayList();
            this.a = OmronLogVisibleUtil.getMessage(boVar2.c());
            this.b = OmronLogVisibleUtil.getMessage(boVar2.a());
            boVar2.b(this.a);
            boVar2.a(arrayList);
            boVar2.a(this.b);
            ay.a("OMRONLib", "onBpScan:discoveredDevice: %s", boVar2);
            if (TextUtils.isEmpty(OMRONLib.this.t) || OMRONLib.this.t.equals(boVar.a())) {
                OMRONLib.this.t = boVar.a();
                OMRONLib.this.k = boVar.b();
                OMRONLib.this.o();
                OMRONLib oMRONLib = OMRONLib.this;
                oMRONLib.c(oMRONLib.a);
                if (OMRONLib.this.p != null) {
                    OMRONLib.this.p.e();
                }
                OMRONLib.this.x = false;
            }
        }

        @Override // com.omron.al.b
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            OMRONLib.this.c(oMRONBLEErrMsg);
        }

        @Override // com.omron.al.b
        public void a(@NonNull Cdo cdo) {
            if (cdo == Cdo.PoweredOff) {
                OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            }
        }
    }

    public class j implements am.n {

        public class a implements av.b {
            final /* synthetic */ bp a;

            public a(bp bpVar) {
                this.a = bpVar;
            }

            @Override // com.omron.av.b
            public void a(int i, String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("message");
                    if (i2 >= 506 && i2 <= 509) {
                        OMRONLib.this.o = true;
                        ay.a("上传设备ID-上传设备信息  code : " + i2 + "  message : " + string, new Object[0]);
                        OMRONLib.this.f9005n = true;
                        OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_BindFail);
                        return;
                    }
                    ay.a("mOMRONBLEReadBPDataCB onBindComplete()", new Object[0]);
                    if (OMRONLib.this.o) {
                        OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                        return;
                    }
                    OMRONLib.this.B = com.omron.f.c(this.a.h());
                    OMRONLib.this.A = new DeviceInfo();
                    OMRONLib.this.A.setSerialNumber(this.a.k());
                    OMRONLib.this.A.setModelName(this.a.i());
                    OMRONLib.this.A.setHardwareVersion(this.a.f());
                    OMRONLib.this.A.setSoftwareVersion(this.a.l());
                    OMRONLib.this.A.setFirmwareVersion(this.a.e());
                    OMRONLib.this.A.setManufacturerName(this.a.g());
                    OMRONLib.this.A.setBatteryLevel(this.a.a());
                    ay.a("OMRONLib", "onBindBpComplete bindBpDeviceInfo:" + OMRONLib.this.A, new Object[0]);
                    ay.a("OMRONLib", "onBindBpComplete bpDataList:" + OMRONLib.this.B.size(), new Object[0]);
                    OmronBpBleCallBack omronBpBleCallBack = OMRONLib.this.f9003j;
                    String strC = OMRONLib.this.g.c();
                    String str2 = OMRONLib.this.k;
                    String str3 = OMRONLib.this.t;
                    OMRONLib oMRONLib = OMRONLib.this;
                    omronBpBleCallBack.onBindComplete(strC, str2, str3, oMRONLib.A, oMRONLib.B);
                    OMRONLib.this.k = "";
                    ay.a("上传设备ID-上传设备信息成功", new Object[0]);
                } catch (Exception e2) {
                    OMRONLib.this.f9005n = true;
                    e2.printStackTrace();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                    ay.b("上传设备ID-异常1:" + byteArrayOutputStream.toString(), new Object[0]);
                    OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_BindFail);
                }
            }

            @Override // com.omron.av.b
            public void b(int i, String str) {
                OMRONLib.this.B = com.omron.f.c(this.a.h());
                OMRONLib.this.A = new DeviceInfo();
                OMRONLib.this.A.setSerialNumber(this.a.k());
                OMRONLib.this.A.setModelName(this.a.i());
                OMRONLib.this.A.setHardwareVersion(this.a.f());
                OMRONLib.this.A.setSoftwareVersion(this.a.l());
                OMRONLib.this.A.setFirmwareVersion(this.a.e());
                OMRONLib.this.A.setManufacturerName(this.a.g());
                OMRONLib.this.A.setBatteryLevel(this.a.a());
                ay.a("OMRONLib", "onBindBpComplete bindBpDeviceInfo:" + OMRONLib.this.A, new Object[0]);
                ay.a("OMRONLib", "onBindBpComplete bpDataList:" + OMRONLib.this.B.size(), new Object[0]);
                OmronBpBleCallBack omronBpBleCallBack = OMRONLib.this.f9003j;
                String strC = OMRONLib.this.g.c();
                String str2 = OMRONLib.this.k;
                String str3 = OMRONLib.this.t;
                OMRONLib oMRONLib = OMRONLib.this;
                omronBpBleCallBack.onBindComplete(strC, str2, str3, oMRONLib.A, oMRONLib.B);
                OMRONLib.this.k = "";
            }
        }

        public j() {
        }

        @Override // com.omron.am.n
        public void a(@NonNull bp bpVar) {
            bpVar.f(OmronLogVisibleUtil.getMessage(bpVar.k()));
            ay.a("OMRONLib", "sessionData:" + bpVar, new Object[0]);
            ay.a("OMRONLib", "onSessionComplete:" + bpVar.b(), new Object[0]);
            if (bpVar.b() == Cdo.FailedToConnect) {
                OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
            if (bpVar.b() == Cdo.ConnectionTimedOut) {
                OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL);
            }
            if (bpVar.b() == Cdo.FailedToTransfer) {
                OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL);
            }
            if (bpVar.b() == Cdo.PoweredOff) {
                OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            }
            if (bpVar.b() == Cdo.Canceled) {
                OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
            if (bpVar.b() == Cdo.Disconnected) {
                if (OMRONLib.this.s == br.Register) {
                    if (bpVar.c() == null) {
                        ay.b("OMRONLib", "设备getCurrentTime为空，继续绑定成功。");
                    }
                    ay.a("上传设备ID mUpdateDeviceId: " + OMRONLib.this.f9005n, new Object[0]);
                    try {
                        OMRONLib.this.o = false;
                        HashMap map = new HashMap();
                        map.put("uuid", (String) com.omron.o.a(OMRONLib.this.a, "uuid", ""));
                        map.put("deviceDigitalId", OMRONLib.this.k);
                        map.put("deviceCategory", "1");
                        aq aqVar = OMRONLib.this.g;
                        if (aqVar != null) {
                            String strC = aqVar.c();
                            map.put("deviceType", strC);
                            if ("HBF-229T".equals(strC) || "HBF-219T".equals(strC)) {
                                map.put("device_user_type_id", OMRONLib.this.L + "");
                            }
                        }
                        OMRONLib.this.f9005n = false;
                        String strValueOf = String.valueOf(com.omron.o.a(OMRONLib.this.a, HttpConst.APP_KEY, ""));
                        av.a().a(201, new a(bpVar), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/DeviceInfo", new JSONObject(map).toString(), strValueOf, com.omron.m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                        ay.b("上传设备ID-异常2:" + byteArrayOutputStream.toString(), new Object[0]);
                    }
                    ay.a("上传设备ID 结束; mUpdateDeviceId: " + OMRONLib.this.f9005n, new Object[0]);
                    return;
                }
                if (OMRONLib.this.s == br.Transfer) {
                    List<BPData> listC = com.omron.f.c(bpVar.h());
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < listC.size(); i++) {
                            BPData bPData = listC.get(i);
                            HashMap map2 = new HashMap();
                            map2.put("sbp", "" + bPData.getSystolic());
                            map2.put("dbp", "" + bPData.getDiastolic());
                            map2.put("pulse", "" + bPData.getPulse());
                            map2.put("bmFlg", "" + bPData.getBmFlg());
                            map2.put("ihbFlg", "" + bPData.getArrhythmiaFlg());
                            map2.put("cwsFlg", "" + bPData.getCwsFlg());
                            map2.put("measureAt", "" + com.omron.i.a(com.omron.i.a(bPData.getMeasureTime())));
                            aq aqVar2 = OMRONLib.this.g;
                            if (aqVar2 != null) {
                                map2.put("deviceType", aqVar2.c());
                            }
                            map2.put("deviceDigitalId", "" + OMRONLib.this.k);
                            map2.put("measureId", String.valueOf(bPData.getMeasureUser()));
                            map2.put("uuid", (String) com.omron.o.a(OMRONLib.this.a, "uuid", ""));
                            jSONArray.put(new JSONObject(map2));
                        }
                        if (jSONArray.length() > 0) {
                            ay.a("mOMRONBLEReadBPDataCB  保存血压数据到本地", new Object[0]);
                            com.omron.k.a(OMRONLib.this.b("bpdata.txt"), jSONArray.toString(), "utf-8", true);
                        }
                        OMRONLib.this.i();
                        if (OMRONLib.this.o) {
                            OMRONLib.this.c(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                            return;
                        }
                        ay.a("OMRONLib", "onDataReadComplete:" + listC.size());
                        OMRONLib.this.c(listC);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        e3.printStackTrace(new PrintStream(byteArrayOutputStream2));
                        ay.b("onDataReadComplete:" + byteArrayOutputStream2.toString(), new Object[0]);
                    }
                }
            }
        }

        @Override // com.omron.am.n
        public void a(@NonNull dp dpVar) {
            ay.a("OMRONLib", "onConnectionStateChanged:" + dpVar.name());
            if (dp.Connected == dpVar) {
                OMRONLib.this.y = true;
            }
        }
    }

    public class k implements OHQDeviceManager.z {
        public k() {
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a() {
            ay.a("OMRONLib", "onPairingRequest:");
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull dr drVar) {
            ay.a("OMRONLib", "onDetailedStateChanged:" + drVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.g gVar) {
            ay.a("OMRONLib", "onAclConnectionStateChanged:" + gVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.h hVar) {
            ay.a("OMRONLib", "onBondStateChanged:" + hVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.i iVar) {
            ay.a("OMRONLib", "onGattConnectionStateChanged:" + iVar.name());
        }
    }

    public class l implements ei.d {
        final /* synthetic */ el a;
        final /* synthetic */ Context b;

        public l(el elVar, Context context) {
            this.a = elVar;
            this.b = context;
        }

        private void b() {
            el elVar = this.a;
            final Context context = this.b;
            elVar.post(new Runnable() { // from class: com.omron.lib.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.a(context);
                }
            });
        }

        @Override // com.omron.ei.d
        public void onSuccess() {
            b();
        }

        @Override // com.omron.ei.d
        public void a() {
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Context context) {
            ay.a("OMRONLib", "startBpSession startSession, mBpAddress:%s", OmronLogVisibleUtil.getMessage(OMRONLib.this.t));
            OMRONLib.this.q.a(OMRONLib.this.a(context));
            OMRONLib.this.w.put(dx.ConnectionWaitTimeKey, 60000L);
            OMRONLib.this.q.b(OMRONLib.this.t, OMRONLib.this.w);
        }
    }

    public class m implements av.b {
        public m() {
        }

        @Override // com.omron.av.b
        public void a(int i, String str) {
            ay.a(" UpdateBpInfo()    请求返回res " + str, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = jSONObject.getInt("code");
                String string = jSONObject.getString("message");
                if (i2 < 506 || i2 > 509) {
                    int i3 = jSONObject.getJSONObject("data").getInt("flag");
                    ay.a("UpdateBpInfo()    上传血压数据成功", new Object[0]);
                    if (OMRONLib.this.f9004l) {
                        ay.a("UpdateBpInfo()    清除本地血压数据", new Object[0]);
                        com.omron.k.a(OMRONLib.this.b("bpdata.txt"), "", "utf-8", false);
                        if (i3 == 1) {
                            ay.a("UpdateBpInfo()    上传日志", new Object[0]);
                            Thread.sleep(1000L);
                            ay.a(false);
                        }
                    }
                } else {
                    OMRONLib.this.o = true;
                    ay.a("UpdateBpInfo()    上传血压数据  code : " + i2 + "  message : " + string, new Object[0]);
                }
                Thread.sleep(500L);
            } catch (Exception e2) {
                e2.printStackTrace();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                ay.b(" UpdateBpInfo    " + byteArrayOutputStream.toString(), new Object[0]);
            }
        }

        @Override // com.omron.av.b
        public void b(int i, String str) {
        }
    }

    public class n implements al.b {
        public n() {
        }

        @Override // com.omron.al.b
        public void a(@NonNull bo boVar) {
            ay.a("OMRONLib", "onBfScan: discoveredDevice: %s", boVar);
            OMRONLib.this.K = boVar.a();
            OMRONLib.this.V = boVar;
            OMRONLib.this.S.onScanBodyFatComplete();
            if (OMRONLib.this.G != null) {
                OMRONLib.this.G.e();
            }
        }

        @Override // com.omron.al.b
        public void onFailure(OMRONBLEErrMsg oMRONBLEErrMsg) {
            OMRONLib.this.a(oMRONBLEErrMsg);
        }

        @Override // com.omron.al.b
        public void a(@NonNull Cdo cdo) {
            if (cdo == Cdo.PoweredOff) {
                OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            }
        }
    }

    public class o implements am.n {

        public class a implements av.b {
            final /* synthetic */ bp a;
            final /* synthetic */ String b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f9010c;

            public a(bp bpVar, String str, String str2) {
                this.a = bpVar;
                this.b = str;
                this.f9010c = str2;
            }

            @Override // com.omron.av.b
            public void a(int i, String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i2 = jSONObject.getInt("code");
                    String string = jSONObject.getString("message");
                    if (i2 < 506 || i2 > 509) {
                        OMRONLib.this.f9005n = false;
                        ay.a("上传设备ID-上传设备信息成功", new Object[0]);
                        List<BodyfatData> listA = com.omron.f.a(this.a.h());
                        OMRONLib oMRONLib = OMRONLib.this;
                        com.omron.o.b(oMRONLib.a, "lastSex", oMRONLib.b0);
                        OMRONLib oMRONLib2 = OMRONLib.this;
                        com.omron.o.b(oMRONLib2.a, "lastHeight", oMRONLib2.c0);
                        OMRONLib oMRONLib3 = OMRONLib.this;
                        com.omron.o.b(oMRONLib3.a, "lastBirth", oMRONLib3.Z);
                        DeviceInfo deviceInfo = new DeviceInfo();
                        deviceInfo.setSerialNumber(this.a.k());
                        deviceInfo.setModelName(this.a.i());
                        deviceInfo.setHardwareVersion(this.a.f());
                        deviceInfo.setSoftwareVersion(this.a.l());
                        deviceInfo.setFirmwareVersion(this.a.e());
                        deviceInfo.setManufacturerName(this.a.g());
                        deviceInfo.setBatteryLevel(this.a.a());
                        ay.a("OMRONLib", "onBindBodyFatComplete bindBfDeviceInfo:" + deviceInfo, new Object[0]);
                        ay.a("OMRONLib", "onBindBodyFatComplete bfDataList:" + listA.size(), new Object[0]);
                        OMRONLib.this.S.onBindBodyFatComplete(this.b, this.f9010c, OMRONLib.this.a0, OMRONLib.this.K, OMRONLib.this.b0, OMRONLib.this.c0, OMRONLib.this.Z, deviceInfo, listA);
                    } else {
                        OMRONLib.this.o = true;
                        if (OMRONLib.this.g0) {
                            OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                        }
                        ay.a("上传设备ID-上传设备信息  code : " + i2 + "  message : " + string, new Object[0]);
                        OMRONLib.this.f9005n = true;
                        if (OMRONLib.this.T || OMRONLib.this.f9005n) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("onSessionComplete： ");
                            OMRONBLEErrMsg oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_SDK_BindFail;
                            sb.append(oMRONBLEErrMsg.getErrMsg());
                            ay.a("OMRONLib", sb.toString(), new Object[0]);
                            OMRONLib.this.a(oMRONBLEErrMsg);
                        }
                    }
                } catch (Exception e2) {
                    OMRONLib.this.f9005n = true;
                    e2.printStackTrace();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                    ay.b("上传设备ID-异常1:" + byteArrayOutputStream.toString(), new Object[0]);
                }
                OMRONLib oMRONLib4 = OMRONLib.this;
                oMRONLib4.a(oMRONLib4.a0, OMRONLib.this.b0, OMRONLib.this.c0, OMRONLib.this.Z);
            }

            @Override // com.omron.av.b
            public void b(int i, String str) {
                List<BodyfatData> listA = com.omron.f.a(this.a.h());
                OMRONLib oMRONLib = OMRONLib.this;
                com.omron.o.b(oMRONLib.a, "lastSex", oMRONLib.b0);
                OMRONLib oMRONLib2 = OMRONLib.this;
                com.omron.o.b(oMRONLib2.a, "lastHeight", oMRONLib2.c0);
                OMRONLib oMRONLib3 = OMRONLib.this;
                com.omron.o.b(oMRONLib3.a, "lastBirth", oMRONLib3.Z);
                DeviceInfo deviceInfo = new DeviceInfo();
                deviceInfo.setSerialNumber(this.a.k());
                deviceInfo.setModelName(this.a.i());
                deviceInfo.setHardwareVersion(this.a.f());
                deviceInfo.setSoftwareVersion(this.a.l());
                deviceInfo.setFirmwareVersion(this.a.e());
                deviceInfo.setManufacturerName(this.a.g());
                deviceInfo.setBatteryLevel(this.a.a());
                ay.a("OMRONLib", "onBindBodyFatComplete bindBfDeviceInfo:" + deviceInfo, new Object[0]);
                ay.a("OMRONLib", "onBindBodyFatComplete bfDataList:" + listA.size(), new Object[0]);
                OMRONLib.this.S.onBindBodyFatComplete(this.b, this.f9010c, OMRONLib.this.a0, OMRONLib.this.K, OMRONLib.this.b0, OMRONLib.this.c0, OMRONLib.this.Z, deviceInfo, listA);
            }
        }

        public o() {
        }

        @Override // com.omron.am.n
        public void a(@NonNull bp bpVar) {
            String str;
            ay.a("OMRONLib", "mBfSessionListener sessionData:" + bpVar, new Object[0]);
            if (bpVar.b() == Cdo.Canceled) {
                OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
            if (bpVar.b() == Cdo.FailedToConnect) {
                OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
            if (bpVar.b() == Cdo.ConnectionTimedOut) {
                OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL);
            }
            if (bpVar.b() == Cdo.FailedToTransfer) {
                OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL);
            }
            if (bpVar.b() == Cdo.PoweredOff) {
                OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            }
            if (bpVar.b() == Cdo.Disconnected) {
                if (bpVar.m() == null) {
                    OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
                    return;
                }
                if (bpVar.j() == null) {
                    com.omron.o.b(OMRONLib.this.a, OMRONLib.this.U + OMRONLib.this.L, 0);
                    ay.a("OMRONLib", "onSessionComplete:" + OMRONLib.this.U + OMRONLib.this.L + " : 0", new Object[0]);
                } else {
                    com.omron.o.b(OMRONLib.this.a, OMRONLib.this.U + OMRONLib.this.L, bpVar.j());
                    ay.a("OMRONLib", "onSessionComplete:" + OMRONLib.this.U + OMRONLib.this.L + " : " + bpVar.j(), new Object[0]);
                }
                if (bpVar.d() == null) {
                    com.omron.o.b(OMRONLib.this.a, OMRONLib.this.U + OMRONLib.this.L + "DatabaseChange", 0);
                    ay.a("OMRONLib", "onSessionComplete:DatabaseChange : 0", new Object[0]);
                } else {
                    com.omron.o.b(OMRONLib.this.a, OMRONLib.this.U + OMRONLib.this.L + "DatabaseChange", bpVar.d());
                    StringBuilder sb = new StringBuilder();
                    sb.append("onSessionComplete:DatabaseChange : ");
                    sb.append(bpVar.d());
                    ay.a("OMRONLib", sb.toString(), new Object[0]);
                }
                String str2 = "deviceDigitalId";
                if (OMRONLib.this.N == br.Register) {
                    Map<dy, Object> mapM = bpVar.m();
                    OMRONLib.this.Z = (String) eo.a(mapM.get(dy.DateOfBirthKey));
                    BigDecimal bigDecimal = (BigDecimal) eo.a(mapM.get(dy.HeightKey));
                    dv dvVar = (dv) eo.a(mapM.get(dy.GenderKey));
                    String strI = bpVar.i();
                    String strA = OMRONLib.this.I.a();
                    OMRONLib.this.a0 = "" + OMRONLib.this.L;
                    OMRONLib.this.b0 = dvVar.name();
                    OMRONLib.this.c0 = bigDecimal.setScale(1, 5).toString();
                    ay.a("上传设备ID mUpdateDeviceId: " + OMRONLib.this.f9005n, new Object[0]);
                    try {
                        OMRONLib.this.o = false;
                        HashMap map = new HashMap();
                        map.put("uuid", (String) com.omron.o.a(OMRONLib.this.a, "uuid", ""));
                        map.put("deviceCategory", "3");
                        map.put("deviceDigitalId", strA);
                        aq aqVar = OMRONLib.this.g;
                        if (aqVar != null) {
                            String strC = aqVar.c();
                            map.put("deviceType", strC);
                            if ("HBF-229T".equals(strC) || "HBF-219T".equals(strC)) {
                                map.put("device_user_type_id", OMRONLib.this.L + "");
                            }
                        }
                        OMRONLib.this.f9005n = false;
                        String strValueOf = String.valueOf(com.omron.o.a(OMRONLib.this.a, HttpConst.APP_KEY, ""));
                        av.a().a(208, new a(bpVar, strI, strA), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/DeviceInfo", new JSONObject(map).toString(), strValueOf, com.omron.m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                        ay.b("上传设备ID-异常2:" + byteArrayOutputStream.toString(), new Object[0]);
                    }
                    ay.a("上传设备ID 结束; mUpdateDeviceId: " + OMRONLib.this.f9005n, new Object[0]);
                    return;
                }
                if (OMRONLib.this.N == br.Transfer) {
                    List<BodyfatData> listA = com.omron.f.a(bpVar.h());
                    Map<dy, Object> mapM2 = bpVar.m();
                    String str3 = (String) eo.a(mapM2.get(dy.DateOfBirthKey));
                    BigDecimal bigDecimal2 = (BigDecimal) eo.a(mapM2.get(dy.HeightKey));
                    dv dvVar2 = (dv) eo.a(mapM2.get(dy.GenderKey));
                    String strName = dvVar2.name();
                    String string = bigDecimal2.setScale(1, 5).toString();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        int i = 0;
                        while (i < listA.size()) {
                            BodyfatData bodyfatData = listA.get(i);
                            HashMap map2 = new HashMap();
                            map2.put(str2, OMRONLib.this.U);
                            String str4 = str2;
                            map2.put("device_ble_cmn_id", OMRONLib.this.U);
                            aq aqVar2 = OMRONLib.this.g;
                            if (aqVar2 != null) {
                                map2.put("deviceType", aqVar2.c());
                            }
                            map2.put("weight", bodyfatData.getmWeight());
                            map2.put("fatRate", bodyfatData.getmPercentage());
                            map2.put("skeletalMusclesRate", bodyfatData.getmSkeletal());
                            map2.put("basalMetabolism", bodyfatData.getmBasal());
                            map2.put(Element.ELEMENT_NAME_BMI, bodyfatData.getmBmi());
                            map2.put("bodyAge", bodyfatData.getmAge());
                            map2.put("visceralFat", bodyfatData.getmVisceral());
                            map2.put("measureAt", bodyfatData.getmMeasureTime());
                            if (dvVar2 == dv.Male) {
                                str = "0";
                            } else {
                                if (dvVar2 == dv.Female) {
                                    str = "1";
                                }
                                map2.put("birthday", str3);
                                map2.put(Fields.HEIGHT_FIELD, string);
                                map2.put("uuid", String.valueOf(com.omron.o.a(OMRONLib.this.a, "uuid", "")));
                                jSONArray.put(new JSONObject(map2));
                                i++;
                                str2 = str4;
                            }
                            map2.put("gender", str);
                            map2.put("birthday", str3);
                            map2.put(Fields.HEIGHT_FIELD, string);
                            map2.put("uuid", String.valueOf(com.omron.o.a(OMRONLib.this.a, "uuid", "")));
                            jSONArray.put(new JSONObject(map2));
                            i++;
                            str2 = str4;
                        }
                        ay.a("onSessionComplete    获取到体脂数据 " + jSONArray, new Object[0]);
                        if (jSONArray.length() > 0) {
                            ay.a("onSessionComplete    保存体脂数据到本地", new Object[0]);
                            com.omron.k.a(OMRONLib.this.b("bodyfatdata.txt"), jSONArray.toString(), "utf-8", true);
                            OMRONLib.this.h();
                        }
                        if (OMRONLib.this.g0) {
                            OMRONLib.this.a(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                            return;
                        }
                        com.omron.o.b(OMRONLib.this.a, "lastSex", strName);
                        com.omron.o.b(OMRONLib.this.a, "lastHeight", string);
                        com.omron.o.b(OMRONLib.this.a, "lastBirth", str3);
                        OMRONLib oMRONLib = OMRONLib.this;
                        oMRONLib.a(oMRONLib.g.c(), OMRONLib.this.U, OMRONLib.this.a0, OMRONLib.this.K, listA, strName, string, str3);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        e3.printStackTrace(new PrintStream(byteArrayOutputStream2));
                        ay.a(" onSessionComplete    " + byteArrayOutputStream2.toString(), new Object[0]);
                    }
                }
            }
        }

        @Override // com.omron.am.n
        public void a(@NonNull dp dpVar) {
            ay.a("OMRONLib", " mBfSessionListener onConnectionStateChanged:" + dpVar.name());
            if (dp.Connected == dpVar) {
                OMRONLib.this.X = true;
            }
        }
    }

    public class p implements OHQDeviceManager.z {
        public p() {
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a() {
            ay.a("OMRONLib", "mBfOHQlistener onPairingRequest:");
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull dr drVar) {
            ay.a("OMRONLib", "mBfOHQlistener onDetailedStateChanged:" + drVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.g gVar) {
            ay.a("OMRONLib", "mBfOHQlistener onAclConnectionStateChanged:" + gVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.h hVar) {
            ay.a("OMRONLib", "mBfOHQlistener onBondStateChanged:" + hVar.name());
        }

        @Override // com.omron.lib.ohc.OHQDeviceManager.z
        public void a(@NonNull com.omron.p.i iVar) {
            ay.a("OMRONLib", "mBfOHQlistener onGattConnectionStateChanged:" + iVar.name());
        }
    }

    public class q implements ei.d {
        final /* synthetic */ el a;
        final /* synthetic */ Context b;

        public q(el elVar, Context context) {
            this.a = elVar;
            this.b = context;
        }

        private void b() {
            el elVar = this.a;
            final Context context = this.b;
            elVar.post(new Runnable() { // from class: com.omron.lib.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.a(context);
                }
            });
        }

        @Override // com.omron.ei.d
        public void onSuccess() {
            b();
        }

        @Override // com.omron.ei.d
        public void a() {
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Context context) {
            OMRONLib.this.H.a(OMRONLib.this.a(context));
            OMRONLib.this.E.put(dx.ConnectionWaitTimeKey, 60000L);
            OMRONLib.this.H.b(OMRONLib.this.K, OMRONLib.this.E);
        }
    }

    public OMRONLib(@NonNull Context context) {
        super(context);
        this.k = "";
        this.f9004l = false;
        this.m = 1000;
        this.f9005n = false;
        this.o = false;
        this.r = new ei();
        this.t = "";
        this.u = false;
        this.v = new ArrayList();
        this.w = new HashMap();
        this.x = true;
        this.y = false;
        this.z = new i();
        this.C = new j();
        this.D = new k();
        this.E = new HashMap();
        this.F = new ei();
        this.I = new bn();
        this.J = new bq();
        this.K = "";
        this.R = new HashMap();
        this.T = false;
        this.U = "";
        this.V = null;
        this.W = true;
        this.X = false;
        this.Y = new n();
        this.Z = "";
        this.a0 = "";
        this.b0 = "";
        this.c0 = "";
        this.d0 = new o();
        this.e0 = new p();
        this.f0 = false;
        this.g0 = false;
        this.l0 = new HashMap();
        this.o0 = true;
        this.p0 = false;
        this.q0 = "";
        this.r0 = "";
        this.u0 = new ei();
        this.v0 = new e();
        this.A0 = new f();
        this.B0 = new g();
        at atVarA = at.a(context);
        this.h0 = atVarA;
        atVarA.a(b("bg_data.txt"));
    }

    @NonNull
    public static OMRONLib getInstance() {
        OMRONLib oMRONLib = D0;
        if (oMRONLib != null) {
            return oMRONLib;
        }
        throw new IllegalStateException("instance has not been created.");
    }

    @NonNull
    public static OMRONLib init(@NonNull Context context) {
        if (D0 != null) {
            throw new IllegalStateException("An instance has already been created.");
        }
        OMRONLib oMRONLib = new OMRONLib(context);
        D0 = oMRONLib;
        return oMRONLib;
    }

    @Override // com.omron.lib.a
    public int a(BleScanDevice bleScanDevice) {
        return super.a(bleScanDevice);
    }

    @Override // com.omron.lib.device.bf.OmronBfDeviceCallback
    public void bindBfDevice(@NonNull String str, OmronBfBleCallBack omronBfBleCallBack, String str2, String str3, String str4) {
        if (!isRegistered()) {
            omronBfBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 4);
        Object obj = pairA.first;
        if (obj != null) {
            omronBfBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        this.N = br.Register;
        this.g = (aq) pairA.second;
        this.X = false;
        this.W = true;
        this.S = omronBfBleCallBack;
        this.L = -1;
        this.R.put(dy.DateOfBirthKey, str2);
        this.R.put(dy.HeightKey, str4);
        this.R.put(dy.GenderKey, str3);
        this.G = new al(this.g, this.Y);
        this.H = new am(this.d0, this.e0);
        this.G.a(4);
    }

    @Override // com.omron.lib.device.bf.OmronBfDeviceCallback
    public void bindBfUserIndex(int i2) {
        this.X = false;
        this.L = i2;
        bo boVar = this.V;
        if (boVar == null) {
            a(OMRONBLEErrMsg.OMRON_SDK_BindFail);
            return;
        }
        a(boVar);
        d(this.a);
        this.W = false;
        ay.a("OMRONLib", "bindUserIndex 绑定体脂设备: " + this.L, new Object[0]);
    }

    @Override // com.omron.lib.device.bg.OmronBgDeviceCallback
    public void bindBgDevice(@NonNull String str, @NonNull BluetoothDevice bluetoothDevice, @NonNull OmronBgBleCallBack omronBgBleCallBack) {
        if (!isRegistered()) {
            omronBgBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 2, bluetoothDevice.getAddress());
        Object obj = pairA.first;
        if (obj != null) {
            omronBgBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        ay.a("OMRONLib", "bg:bindBgDevice", new Object[0]);
        aq aqVar = (aq) pairA.second;
        this.g = aqVar;
        this.h0.a(aqVar, bluetoothDevice, omronBgBleCallBack);
    }

    @Override // com.omron.lib.device.bo.OmronBoDeviceCallback
    public void bindBoDevice(@NonNull String str, OmronBoBleCallBack omronBoBleCallBack) {
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 5);
        Object obj = pairA.first;
        if (obj != null) {
            omronBoBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        this.s0 = br.Register;
        aq aqVar = (aq) pairA.second;
        this.g = aqVar;
        this.p0 = false;
        this.o0 = true;
        this.k0 = omronBoBleCallBack;
        this.m0 = new al(aqVar, this.v0);
        this.n0 = new am(this.A0, this.B0);
        this.m0.a(5);
    }

    @Override // com.omron.lib.device.bp.OmronBpDeviceCallback
    public void bindBpDevice(@NonNull String str, @NonNull OmronBpBleCallBack omronBpBleCallBack, String str2) {
        if (!isRegistered()) {
            omronBpBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 1);
        Object obj = pairA.first;
        if (obj != null) {
            omronBpBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        ay.a("开始绑定" + str + "--id：" + str2);
        this.s = br.Register;
        aq aqVar = (aq) pairA.second;
        this.g = aqVar;
        this.y = false;
        this.x = true;
        this.f9003j = omronBpBleCallBack;
        this.t = str2;
        al alVar = new al(aqVar, this.z);
        this.p = alVar;
        alVar.a(1);
        this.q = new am(this.C, this.D);
    }

    @Override // com.omron.lib.a, com.omron.lib.OmronCallback
    public void cleanRegistration() {
        super.cleanRegistration();
    }

    @Override // com.omron.lib.device.bf.OmronBfDeviceCallback
    public void getBfDeviceData(@NonNull String str, @NonNull String str2, @NonNull OmronBfBleCallBack omronBfBleCallBack, int i2, String str3, String str4, String str5, String str6) {
        if (!isRegistered()) {
            omronBfBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 4, str2);
        Object obj = pairA.first;
        if (obj != null) {
            omronBfBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        this.N = br.Transfer;
        this.g = (aq) pairA.second;
        this.X = false;
        this.S = omronBfBleCallBack;
        this.L = i2;
        this.K = str2;
        this.U = str6;
        BleScanDevice bleScanDevice = new BleScanDevice(str, str6, str2);
        this.h = bleScanDevice;
        bleScanDevice.setUserIndex(this.a0);
        this.H = new am(this.d0, this.e0);
        a(str3, str4, str5);
        d(this.a);
        ay.a(" 获取体脂数据 " + this.L + " , " + this.K + " , " + this.U, new Object[0]);
    }

    @Override // com.omron.lib.device.bg.OmronBgDeviceCallback
    public void getBgDeviceData(@NonNull String str, @NonNull BluetoothDevice bluetoothDevice, @NonNull OmronBgBleCallBack omronBgBleCallBack) {
        if (isMonitoring()) {
            return;
        }
        if (!isRegistered()) {
            omronBgBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 2, bluetoothDevice.getAddress());
        Object obj = pairA.first;
        if (obj != null) {
            omronBgBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        ay.a("OMRONLib", "bg:getBgDeviceData", new Object[0]);
        this.g = (aq) pairA.second;
        this.h = new BleScanDevice(str, bluetoothDevice.getName(), bluetoothDevice.getAddress());
        this.h0.b(this.g, bluetoothDevice, omronBgBleCallBack);
    }

    @Override // com.omron.lib.device.bo.OmronBoDeviceCallback
    public void getBoDeviceData(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull OmronBoBleCallBack omronBoBleCallBack) {
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 5);
        Object obj = pairA.first;
        if (obj != null) {
            omronBoBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        ay.a("OMRONLib", "获取设备血氧数据 deviceAddress:%s", str3);
        this.s0 = br.Transfer;
        this.g = (aq) pairA.second;
        this.p0 = false;
        this.o0 = true;
        this.k0 = omronBoBleCallBack;
        this.r0 = str2;
        this.q0 = str3;
        this.h = new BleScanDevice(str, str2, str3);
        this.m0 = new al(this.g, this.v0);
        this.n0 = new am(this.A0, this.B0);
        this.l0.clear();
        this.l0.put(dx.ReadMeasurementRecordsKey, Boolean.TRUE);
        b(this.a);
    }

    @Override // com.omron.lib.device.bp.OmronBpDeviceCallback
    public void getBpDeviceData(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull OmronBpBleCallBack omronBpBleCallBack) {
        if (!isRegistered()) {
            omronBpBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        Pair<OMRONBLEErrMsg, aq> pairA = ao.a(this.a, a(str), 1, str3);
        Object obj = pairA.first;
        if (obj != null) {
            omronBpBleCallBack.onFailure((OMRONBLEErrMsg) obj);
            return;
        }
        ay.a("OMRONLib", "获取设备血压数据 deviceAddress:%s", str3);
        this.s = br.Transfer;
        this.g = (aq) pairA.second;
        this.y = false;
        C0 = true;
        this.q = new am(this.C, this.D);
        this.f9003j = omronBpBleCallBack;
        this.k = str2;
        this.t = str3;
        this.h = new BleScanDevice(str, str2, str3);
        o();
        c(this.a);
    }

    @Override // com.omron.lib.a, com.omron.lib.OmronCallback
    public List<String> getDeviceTypeList(int i2) {
        return super.getDeviceTypeList(i2);
    }

    @Override // com.omron.lib.a, com.omron.lib.OmronCallback
    public boolean isBluetoothOn() {
        return super.isBluetoothOn();
    }

    @Override // com.omron.lib.a, com.omron.lib.OmronCallback
    public boolean isMonitoring() {
        return super.isMonitoring();
    }

    @Override // com.omron.lib.a, com.omron.lib.OmronCallback
    public boolean isRegistered() {
        return super.isRegistered();
    }

    public String m() {
        return this.t;
    }

    @Override // com.omron.lib.OmronCallback
    public void requestIdentifier(String str, String str2, Context context, IdentifierCallback identifierCallback) {
        super.a(str, str2, identifierCallback);
    }

    public void setIsBinding(boolean z) {
        this.u = z;
    }

    @Override // com.omron.lib.device.bf.OmronBfDeviceCallback
    public void startBfMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBfBleCallBack omronBfBleCallBack, String str, String str2, String str3) {
        if (isMonitoring()) {
            return;
        }
        if (!isRegistered()) {
            omronBfBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        if (!isBluetoothOn()) {
            omronBfBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            return;
        }
        if (list.isEmpty()) {
            omronBfBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnBind);
            return;
        }
        if (a(list).isEmpty()) {
            omronBfBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_EXPIRATION);
            return;
        }
        ay.a("OMRONLib", "体脂仪:数据监听-开启", new Object[0]);
        d();
        this.N = br.Transfer;
        this.S = omronBfBleCallBack;
        this.M = list;
        this.X = false;
        this.O = str2;
        this.Q = str;
        this.P = str3;
        b(list);
    }

    @Override // com.omron.lib.device.bg.OmronBgDeviceCallback
    public void startBgMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBgBleCallBack omronBgBleCallBack) {
        if (isMonitoring()) {
            return;
        }
        if (!isRegistered()) {
            omronBgBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        if (!isBluetoothOn()) {
            omronBgBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            return;
        }
        if (list.isEmpty()) {
            omronBgBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnBind);
            return;
        }
        if (a(list).isEmpty()) {
            omronBgBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_EXPIRATION);
            return;
        }
        ay.a("OMRONLib", "bg:Monitoring opening", new Object[0]);
        d();
        this.i0 = list;
        this.j0 = omronBgBleCallBack;
        b(list);
    }

    @Override // com.omron.lib.OmronCallback
    public void startBindScan(int i2, @Size(max = 300, min = 1) int i3, @NonNull BleScanDeviceCallback bleScanDeviceCallback) {
        if (!isRegistered()) {
            bleScanDeviceCallback.onBleScanFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        if (!isBluetoothOn()) {
            bleScanDeviceCallback.onBleScanFailure(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            return;
        }
        List<aq> listB = b(i2);
        if (listB.isEmpty()) {
            bleScanDeviceCallback.onBleScanFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_NOT_SUPPORT);
        } else {
            super.a(listB, i3, (String) null, bleScanDeviceCallback);
        }
    }

    @Override // com.omron.lib.device.bo.OmronBoDeviceCallback
    public void startBoMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBoBleCallBack omronBoBleCallBack) {
        if (isMonitoring()) {
            return;
        }
        if (!isRegistered()) {
            omronBoBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        if (!isBluetoothOn()) {
            omronBoBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            return;
        }
        if (list.isEmpty()) {
            omronBoBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnBind);
            return;
        }
        if (a(list).isEmpty()) {
            omronBoBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_EXPIRATION);
            return;
        }
        d();
        this.s0 = br.Transfer;
        this.k0 = omronBoBleCallBack;
        this.t0 = list;
        b(list);
    }

    @Override // com.omron.lib.device.bp.OmronBpDeviceCallback
    public void startBpMonitoring(@NonNull List<BleScanDevice> list, @NonNull OmronBpBleCallBack omronBpBleCallBack) {
        if (isMonitoring()) {
            return;
        }
        if (!isRegistered()) {
            omronBpBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnRegister);
            return;
        }
        if (!isBluetoothOn()) {
            omronBpBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            return;
        }
        if (list.isEmpty()) {
            omronBpBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_SDK_UnBind);
            return;
        }
        if (a(list).isEmpty()) {
            omronBpBleCallBack.onFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_EXPIRATION);
            return;
        }
        ay.a("OMRONLib", "血压计:数据监听-开启", new Object[0]);
        d();
        this.s = br.Transfer;
        this.v = list;
        this.f9003j = omronBpBleCallBack;
        b(list);
    }

    @Override // com.omron.lib.OmronCallback
    public void startScan(int i2, @Size(max = 300, min = 1) int i3, @Nullable String str, @NonNull BleScanDeviceCallback bleScanDeviceCallback) {
        OMRONBLEErrMsg oMRONBLEErrMsg;
        if (!isRegistered()) {
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_SDK_UnRegister;
        } else if (isBluetoothOn()) {
            List<aq> listA = a(i2);
            if (!listA.isEmpty()) {
                super.a(listA, i3, str, bleScanDeviceCallback);
                return;
            }
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_NOT_SUPPORT;
        } else {
            oMRONBLEErrMsg = OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth;
        }
        bleScanDeviceCallback.onBleScanFailure(oMRONBLEErrMsg);
    }

    @Override // com.omron.lib.OmronCallback
    public void startSyncScan(List<BleScanDevice> list, @Size(max = 300, min = 1) int i2, @NonNull BleScanDeviceCallback bleScanDeviceCallback) {
        if (!isBluetoothOn()) {
            bleScanDeviceCallback.onBleScanFailure(OMRONBLEErrMsg.OMRON_SDK_UnOpenBlueTooth);
            return;
        }
        List<aq> listA = a(list);
        if (listA.isEmpty()) {
            bleScanDeviceCallback.onBleScanFailure(OMRONBLEErrMsg.OMRON_BLE_ERROR_DEVICE_TYPE_EXPIRATION);
            return;
        }
        ay.a("扫描的设备数量：" + list.size(), new Object[0]);
        super.b(listA, i2, null, bleScanDeviceCallback);
    }

    @Override // com.omron.lib.device.bf.OmronBfDeviceCallback
    public void stopBfConnect() {
        al alVar;
        if (!isMonitoring() && (alVar = this.G) != null) {
            alVar.e();
            if (this.W) {
                ay.a("OMRONLib", "cancelFatConnect :" + this.x, new Object[0]);
                a(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
        }
        j();
    }

    @Override // com.omron.lib.device.bf.OmronBfDeviceCallback
    public void stopBfMonitoring() {
        if (isMonitoring()) {
            e();
            f();
            j();
            ay.a("OMRONLib", "体脂仪监听-关闭", new Object[0]);
            this.g = null;
            this.K = "";
            this.S = null;
        }
    }

    @Override // com.omron.lib.device.bg.OmronBgDeviceCallback
    public void stopBgConnect() {
        this.h0.d();
    }

    @Override // com.omron.lib.device.bg.OmronBgDeviceCallback
    public void stopBgMonitoring() {
        if (isMonitoring()) {
            ay.a("OMRONLib", "bg:Monitoring closed", new Object[0]);
            e();
            f();
            stopBgConnect();
            this.i0 = null;
            this.g = null;
            this.j0 = null;
        }
    }

    @Override // com.omron.lib.device.bo.OmronBoDeviceCallback
    public void stopBoConnect() {
        al alVar;
        if (!isMonitoring() && (alVar = this.m0) != null) {
            alVar.e();
            if (this.x) {
                ay.a("OMRONLib", "stopBoConnect", new Object[0]);
                b(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
        }
        k();
    }

    @Override // com.omron.lib.device.bo.OmronBoDeviceCallback
    public void stopBoMonitoring() {
        if (isMonitoring()) {
            e();
            f();
            l();
            ay.a("OMRONLib", "血氧监听-关闭", new Object[0]);
            this.g = null;
            this.k0 = null;
            this.t0 = null;
        }
    }

    @Override // com.omron.lib.device.bp.OmronBpDeviceCallback
    public void stopBpConnect() {
        al alVar;
        if (!isMonitoring() && (alVar = this.p) != null) {
            alVar.e();
            if (this.x) {
                ay.a("OMRONLib", "stopBpConnect", new Object[0]);
                c(OMRONBLEErrMsg.OMRON_SDK_ConnectFail);
            }
        }
        l();
    }

    @Override // com.omron.lib.device.bp.OmronBpDeviceCallback
    public void stopBpMonitoring() {
        if (isMonitoring()) {
            e();
            f();
            l();
            ay.a("OMRONLib", "血压计监听-关闭", new Object[0]);
            this.g = null;
            this.t = "";
            this.f9003j = null;
        }
    }

    @Override // com.omron.lib.a, com.omron.lib.OmronCallback
    public void stopScan() {
        super.stopScan();
    }

    @Override // com.omron.lib.a
    public void stopSyncScan() {
        super.stopSyncScan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Bundle a(@NonNull Context context) {
        w.a aVar = w.a.UsedBeforeGattConnection;
        w.c cVar = w.c.NotUse;
        String strName = w.b.CreateBondOption.name();
        String strName2 = w.b.RemoveBondOption.name();
        String strName3 = w.b.AssistPairingDialogEnabled.name();
        Boolean bool = Boolean.TRUE;
        String strName4 = w.b.AutoPairingEnabled.name();
        Boolean bool2 = Boolean.FALSE;
        return ej.a(strName, aVar, strName2, cVar, strName3, bool, strName4, bool2, w.b.AutoEnterThePinCodeEnabled.name(), bool2, w.b.PinCode.name(), "000000", w.b.StableConnectionEnabled.name(), bool, w.b.StableConnectionWaitTime.name(), 1500L, w.b.ConnectionRetryEnabled.name(), bool, w.b.ConnectionRetryDelayTime.name(), 1000L, w.b.ConnectionRetryCount.name(), 0, w.b.UseRefreshWhenDisconnect.name(), bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.g0 = false;
        String strA = com.omron.k.a(b("bodyfatdata.txt"), "utf-8");
        if (strA.contains("][")) {
            strA = strA.replace("][", ",");
        }
        try {
            this.f0 = false;
            JSONArray jSONArray = new JSONArray(strA);
            int i2 = 0;
            while (true) {
                double d2 = i2;
                if (d2 >= Math.ceil(((double) jSONArray.length()) / 1000.0d)) {
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                if (d2 == Math.ceil(((double) jSONArray.length()) / 1000.0d) - 1.0d) {
                    for (int i3 = i2 * 1000; i3 < jSONArray.length(); i3++) {
                        jSONArray2.put(jSONArray.get(i3));
                    }
                    this.f0 = true;
                } else {
                    for (int i4 = i2 * 1000; i4 < (i2 + 1) * 1000; i4++) {
                        jSONArray2.put(jSONArray.get(i4));
                    }
                }
                HashMap map = new HashMap();
                map.put("uuid", a());
                map.put("data", jSONArray2.toString());
                String strValueOf = String.valueOf(com.omron.o.a(this.a, HttpConst.APP_KEY, ""));
                av.a().a(207, new b(), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/FatInfo", strA, strValueOf, com.omron.m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
                i2++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e2.printStackTrace(new PrintStream(byteArrayOutputStream));
            ay.b(" UpdateBodyfatInfo error", byteArrayOutputStream.toString());
        }
    }

    private void j() {
        if (this.H == null || this.X) {
            return;
        }
        ay.a("OMRONLib", "mSessionController 取消通信", new Object[0]);
        this.H.c();
    }

    private void k() {
        if (this.n0 == null || this.p0) {
            return;
        }
        ay.a("OMRONLib", "mBoSessionController 血氧取消通信", new Object[0]);
        this.n0.c();
    }

    private void l() {
        if (this.q == null || this.y) {
            return;
        }
        ay.a("OMRONLib", "bpStopSession", new Object[0]);
        this.q.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.w.clear();
        this.w.put(dx.ReadMeasurementRecordsKey, Boolean.TRUE);
    }

    public boolean n() {
        return this.u;
    }

    private void b(Context context) {
        ay.a("OMRONLib", "startBoSession", new Object[0]);
        if (this.n0.d()) {
            ay.a("OMRONLib", "startBoSession Already started session.", new Object[0]);
        } else {
            this.u0.a(new d(new el(), context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context) {
        ay.a("OMRONLib", "startBpSession", new Object[0]);
        if (this.q.d()) {
            ay.a("OMRONLib", "startBpSession Already started session.", new Object[0]);
        } else {
            this.r.a(new l(new el(), context));
        }
    }

    private void d(Context context) {
        if (this.H.d()) {
            an.b("Already started session.");
        } else {
            this.F.a(new q(new el(), context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.y0 = false;
        ay.a("UpdateBpInfo() ", new Object[0]);
        String strA = com.omron.k.a(b("bo_data.txt"), "utf-8");
        if (strA.contains("][")) {
            strA = strA.replace("][", ",");
        }
        try {
            this.z0 = false;
            JSONArray jSONArray = new JSONArray(strA);
            int i2 = 0;
            while (true) {
                double d2 = i2;
                if (d2 >= Math.ceil(((double) jSONArray.length()) / 1000.0d)) {
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                if (d2 == Math.ceil(((double) jSONArray.length()) / 1000.0d) - 1.0d) {
                    for (int i3 = i2 * 1000; i3 < jSONArray.length(); i3++) {
                        jSONArray2.put(jSONArray.get(i3));
                    }
                    this.z0 = true;
                } else {
                    for (int i4 = i2 * 1000; i4 < (i2 + 1) * 1000; i4++) {
                        jSONArray2.put(jSONArray.get(i4));
                    }
                }
                new HashMap();
                String strValueOf = String.valueOf(com.omron.o.a(this.a, HttpConst.APP_KEY, ""));
                av.a().a(211, new h(), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/BoInfo", strA, strValueOf, com.omron.m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
                i2++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e2.printStackTrace(new PrintStream(byteArrayOutputStream));
            ay.a("UpLoadBoData  " + byteArrayOutputStream.toString(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.o = false;
        ay.a("UpdateBpInfo() ", new Object[0]);
        String strA = com.omron.k.a(b("bpdata.txt"), "utf-8");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        if (strA.contains("][")) {
            strA = strA.replace("][", ",");
        }
        try {
            this.f9004l = false;
            JSONArray jSONArray = new JSONArray(strA);
            int i2 = 0;
            while (true) {
                double d2 = i2;
                if (d2 >= Math.ceil(((double) jSONArray.length()) / 1000.0d)) {
                    return;
                }
                JSONArray jSONArray2 = new JSONArray();
                if (d2 == Math.ceil(((double) jSONArray.length()) / 1000.0d) - 1.0d) {
                    for (int i3 = i2 * 1000; i3 < jSONArray.length(); i3++) {
                        jSONArray2.put(jSONArray.get(i3));
                    }
                    this.f9004l = true;
                } else {
                    for (int i4 = i2 * 1000; i4 < (i2 + 1) * 1000; i4++) {
                        jSONArray2.put(jSONArray.get(i4));
                    }
                }
                new HashMap();
                String strValueOf = String.valueOf(com.omron.o.a(this.a, HttpConst.APP_KEY, ""));
                av.a().a(202, new m(), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/BpInfo", strA, strValueOf, com.omron.m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
                i2++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e2.printStackTrace(new PrintStream(byteArrayOutputStream));
            ay.a("UpdateBpInfo  " + byteArrayOutputStream.toString(), new Object[0]);
        }
    }

    @Override // com.omron.lib.a
    public void b(BleScanDevice bleScanDevice) {
        aq aqVarA = a(bleScanDevice.getDeviceType());
        this.g = aqVarA;
        this.h = bleScanDevice;
        if (aqVarA == null) {
            return;
        }
        int iB = aqVarA.b();
        if (iB == 1) {
            getBpDeviceData(this.g.c(), bleScanDevice.getName(), bleScanDevice.getAddress(), this.f9003j);
            return;
        }
        if (iB == 2) {
            a(this.g, bleScanDevice.getBleDevice());
            return;
        }
        if (iB != 4) {
            if (iB != 5) {
                return;
            }
            getBoDeviceData(this.g.c(), bleScanDevice.getName(), bleScanDevice.getAddress(), this.k0);
            return;
        }
        this.U = bleScanDevice.getName();
        for (BleScanDevice bleScanDevice2 : this.M) {
            if (bleScanDevice2.getName().equals(this.U)) {
                this.L = Integer.parseInt(bleScanDevice2.getUserIndex());
                break;
            }
        }
        getBfDeviceData(this.g.c(), bleScanDevice.getAddress(), this.S, this.L, this.Q, this.O, this.P, this.U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(OMRONBLEErrMsg oMRONBLEErrMsg) {
        ay.a("OMRONLib", "onBpBleFailure, msg:%s, code:%s", oMRONBLEErrMsg.getErrMsg(), Integer.valueOf(oMRONBLEErrMsg.getErrCode()));
        OmronBpBleCallBack omronBpBleCallBack = this.f9003j;
        if (omronBpBleCallBack != null) {
            omronBpBleCallBack.onFailure(oMRONBLEErrMsg);
        }
        if (isMonitoring()) {
            ay.a("OMRONLib", "onBpBleFailure, is on monitoring", new Object[0]);
            if (oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_NoDevice || oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_ConnectFail || oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL) {
                ay.a("OMRONLib", "onBpBleFailure, restart cycle scan", new Object[0]);
                b(this.v);
            } else {
                ay.a("OMRONLib", "onBpBleFailure, to stopBpMonitoring", new Object[0]);
                stopBpMonitoring();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<BPData> list) {
        BleScanDevice bleScanDevice;
        ay.a("OMRONLib", "onBpBleSuccess bpDataList:" + list.size(), new Object[0]);
        OmronBpBleCallBack omronBpBleCallBack = this.f9003j;
        if (omronBpBleCallBack != null && (bleScanDevice = this.h) != null) {
            omronBpBleCallBack.onDataReadComplete(bleScanDevice.getDeviceType(), this.h.getName(), this.h.getAddress(), list);
        }
        if (isMonitoring()) {
            ay.a("OMRONLib", "onBpBleSuccess, is on monitoring, restart cycle scan", new Object[0]);
            b(this.v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(OMRONBLEErrMsg oMRONBLEErrMsg) {
        ay.a("OMRONLib", "onBoBleFailure, msg:%s, code:%s", oMRONBLEErrMsg.getErrMsg(), Integer.valueOf(oMRONBLEErrMsg.getErrCode()));
        OmronBoBleCallBack omronBoBleCallBack = this.k0;
        if (omronBoBleCallBack != null) {
            omronBoBleCallBack.onFailure(oMRONBLEErrMsg);
        }
        if (isMonitoring()) {
            ay.a("OMRONLib", "onBoBleFailure, is on monitoring", new Object[0]);
            if (oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_NoDevice || oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_ConnectFail || oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL) {
                ay.a("OMRONLib", "onBoBleFailure, restart cycle scan", new Object[0]);
                b(this.t0);
            } else {
                ay.a("OMRONLib", "onBoBleFailure, to stopBoMonitoring", new Object[0]);
                stopBoMonitoring();
            }
        }
    }

    private void a(@NonNull aq aqVar, @NonNull BluetoothDevice bluetoothDevice) {
        this.h0.b(aqVar, bluetoothDevice, new c());
    }

    private void a(bo boVar) {
        dv dvVar;
        this.E.clear();
        this.I.a(boVar.a());
        this.U = boVar.b();
        this.I.b(boVar.b());
        this.I.d(boVar.c());
        this.I.e(boVar.d());
        this.I.c("BodyCompositionMonitor");
        this.I.f("OmronExtension");
        this.I.b(Integer.valueOf(this.L));
        bn bnVar = this.I;
        Integer numValueOf = Integer.valueOf(OHQDeviceManager.DEFAULT_CONSENT_CODE);
        bnVar.a(numValueOf);
        Map<dx, Object> map = this.E;
        dx dxVar = dx.RegisterNewUserKey;
        Boolean bool = Boolean.TRUE;
        map.put(dxVar, bool);
        this.E.put(dx.ConsentCodeKey, numValueOf);
        this.E.put(dx.UserIndexKey, Integer.valueOf(this.L));
        HashMap map2 = new HashMap();
        dy dyVar = dy.DateOfBirthKey;
        map2.put(dyVar, this.R.get(dyVar));
        Map<dy, Object> map3 = this.R;
        dy dyVar2 = dy.GenderKey;
        if (!"Male".equals(map3.get(dyVar2))) {
            if ("Female".equals(this.R.get(dyVar2))) {
                dvVar = dv.Female;
            }
            Map<dy, Object> map4 = this.R;
            dy dyVar3 = dy.HeightKey;
            map2.put(dyVar3, new BigDecimal(map4.get(dyVar3).toString()));
            this.E.put(dx.UserDataKey, map2);
            this.E.put(dx.DatabaseChangeIncrementValueKey, Long.valueOf(((Long) com.omron.o.a(this.a, this.U + this.L + "DatabaseChange", 0L)).longValue()));
            this.E.put(dx.UserDataUpdateFlagKey, bool);
            this.E.put(dx.AllowAccessToOmronExtendedMeasurementRecordsKey, bool);
            this.E.put(dx.AllowControlOfReadingPositionToMeasurementRecordsKey, bool);
            this.E.put(dx.ReadMeasurementRecordsKey, bool);
        }
        dvVar = dv.Male;
        map2.put(dyVar2, dvVar);
        Map<dy, Object> map5 = this.R;
        dy dyVar4 = dy.HeightKey;
        map2.put(dyVar4, new BigDecimal(map5.get(dyVar4).toString()));
        this.E.put(dx.UserDataKey, map2);
        this.E.put(dx.DatabaseChangeIncrementValueKey, Long.valueOf(((Long) com.omron.o.a(this.a, this.U + this.L + "DatabaseChange", 0L)).longValue()));
        this.E.put(dx.UserDataUpdateFlagKey, bool);
        this.E.put(dx.AllowAccessToOmronExtendedMeasurementRecordsKey, bool);
        this.E.put(dx.AllowControlOfReadingPositionToMeasurementRecordsKey, bool);
        this.E.put(dx.ReadMeasurementRecordsKey, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(OMRONBLEErrMsg oMRONBLEErrMsg) {
        ay.a("OMRONLib", "onBfBleFailure, msg:%s, code:%s", oMRONBLEErrMsg.getErrMsg(), Integer.valueOf(oMRONBLEErrMsg.getErrCode()));
        OmronBfBleCallBack omronBfBleCallBack = this.S;
        if (omronBfBleCallBack != null) {
            omronBfBleCallBack.onFailure(oMRONBLEErrMsg);
        }
        if (isMonitoring()) {
            ay.a("OMRONLib", "onBfBleFailure, is on monitoring", new Object[0]);
            if (oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_NoDevice || oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_ConnectFail || oMRONBLEErrMsg == OMRONBLEErrMsg.OMRON_SDK_TRANSFERFAIL) {
                ay.a("OMRONLib", "onBfBleFailure, restart cycle scan", new Object[0]);
                b(this.M);
            } else {
                ay.a("OMRONLib", "onBfBleFailure, to stopBpMonitoring", new Object[0]);
                stopBfMonitoring();
            }
        }
    }

    private void a(String str, String str2, String str3) {
        dy dyVar;
        dv dvVar;
        this.E.clear();
        int iIntValue = ((Integer) com.omron.o.a(this.a, this.U + this.L, 0)).intValue();
        long jLongValue = ((Long) com.omron.o.a(this.a, this.U + this.L + "DatabaseChange", 0L)).longValue();
        String str4 = (String) com.omron.o.a(this.a, "lastSex", "");
        String str5 = (String) com.omron.o.a(this.a, "lastHeight", "0");
        String str6 = (String) com.omron.o.a(this.a, "lastBirth", "");
        double dDoubleValue = Double.valueOf(str5).doubleValue();
        double dDoubleValue2 = Double.valueOf(str3).doubleValue();
        if (!str4.equals(str2) || !str6.equals(str) || dDoubleValue != dDoubleValue2) {
            jLongValue++;
        }
        ay.a("manageTransferInfo: SequenceNumber " + iIntValue + " : " + jLongValue, new Object[0]);
        HashMap map = new HashMap();
        map.put(dy.DateOfBirthKey, str);
        if (!"Male".equals(str2)) {
            if ("Female".equals(str2)) {
                dyVar = dy.GenderKey;
                dvVar = dv.Female;
            }
            map.put(dy.HeightKey, new BigDecimal(str3));
            this.E.put(dx.UserIndexKey, Integer.valueOf(this.L));
            this.E.put(dx.ConsentCodeKey, Integer.valueOf(OHQDeviceManager.DEFAULT_CONSENT_CODE));
            this.E.put(dx.DatabaseChangeIncrementValueKey, Long.valueOf(jLongValue));
            this.E.put(dx.UserDataKey, map);
            this.E.put(dx.UserDataUpdateFlagKey, Boolean.FALSE);
            Map<dx, Object> map2 = this.E;
            dx dxVar = dx.AllowAccessToOmronExtendedMeasurementRecordsKey;
            Boolean bool = Boolean.TRUE;
            map2.put(dxVar, bool);
            this.E.put(dx.AllowControlOfReadingPositionToMeasurementRecordsKey, bool);
            this.E.put(dx.SequenceNumberOfFirstRecordToReadKey, Integer.valueOf(iIntValue + 1));
            this.E.put(dx.ReadMeasurementRecordsKey, bool);
        }
        dyVar = dy.GenderKey;
        dvVar = dv.Male;
        map.put(dyVar, dvVar);
        map.put(dy.HeightKey, new BigDecimal(str3));
        this.E.put(dx.UserIndexKey, Integer.valueOf(this.L));
        this.E.put(dx.ConsentCodeKey, Integer.valueOf(OHQDeviceManager.DEFAULT_CONSENT_CODE));
        this.E.put(dx.DatabaseChangeIncrementValueKey, Long.valueOf(jLongValue));
        this.E.put(dx.UserDataKey, map);
        this.E.put(dx.UserDataUpdateFlagKey, Boolean.FALSE);
        Map<dx, Object> map3 = this.E;
        dx dxVar2 = dx.AllowAccessToOmronExtendedMeasurementRecordsKey;
        Boolean bool2 = Boolean.TRUE;
        map3.put(dxVar2, bool2);
        this.E.put(dx.AllowControlOfReadingPositionToMeasurementRecordsKey, bool2);
        this.E.put(dx.SequenceNumberOfFirstRecordToReadKey, Integer.valueOf(iIntValue + 1));
        this.E.put(dx.ReadMeasurementRecordsKey, bool2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4) {
        String str5;
        try {
            this.g0 = false;
            HashMap map = new HashMap();
            map.put("uuid", String.valueOf(com.omron.o.a(this.a, "uuid", "")));
            map.put("birthday", str4);
            map.put(Fields.HEIGHT_FIELD, str3);
            if (!"Male".equals(str2)) {
                str5 = "Female".equals(str2) ? "1" : "0";
                String strValueOf = String.valueOf(com.omron.o.a(this.a, HttpConst.APP_KEY, ""));
                String strA = com.omron.m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp");
                String string = new JSONObject(map).toString();
                this.T = false;
                av.a().a(207, new a(), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/PersonInfo", string, strValueOf, strA);
            }
            map.put("gender", str5);
            String strValueOf2 = String.valueOf(com.omron.o.a(this.a, HttpConst.APP_KEY, ""));
            String strA2 = com.omron.m.a(strValueOf2.substring(0, 9) + "e2KaQnHVsp");
            String string2 = new JSONObject(map).toString();
            this.T = false;
            av.a().a(207, new a(), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/PersonInfo", string2, strValueOf2, strA2);
        } catch (Exception e2) {
            e2.printStackTrace();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e2.printStackTrace(new PrintStream(byteArrayOutputStream));
            ay.b("UpdateBFPersonInfo    " + byteArrayOutputStream.toString(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, String str4, List<BodyfatData> list, String str5, String str6, String str7) {
        ay.a("OMRONLib", "onBfBleSuccess bfDataList:" + list.size(), new Object[0]);
        OmronBfBleCallBack omronBfBleCallBack = this.S;
        if (omronBfBleCallBack != null) {
            omronBfBleCallBack.onBodyFatDataReadComplete(str, str2, str3, str4, list, str5, str6, str7);
        }
        if (isMonitoring()) {
            ay.a("OMRONLib", "onBfBleSuccess, is on monitoring, restart cycle scan", new Object[0]);
            b(this.M);
        }
    }
}
