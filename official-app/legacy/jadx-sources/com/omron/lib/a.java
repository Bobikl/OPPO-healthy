package com.omron.lib;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.text.TextUtils;
import com.heytap.log.collect.auto.SystemInfoCollect;
import com.heytap.store.base.core.http.HttpConst;
import com.omron.aq;
import com.omron.av;
import com.omron.ay;
import com.omron.j;
import com.omron.k;
import com.omron.l;
import com.omron.lib.bean.EkiKeyInfo;
import com.omron.lib.bean.IdentifierResponse;
import com.omron.lib.common.OMRONBLEErrMsg;
import com.omron.lib.utils.OmronLogVisibleUtil;
import com.omron.m;
import com.omron.n;
import com.omron.o;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements com.omron.a {
    protected Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9012c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9013e;

    @Nullable
    private com.omron.c f;
    protected aq g;
    protected BleScanDevice h;
    protected boolean b = false;
    protected List<aq> d = new ArrayList();
    private boolean i = false;

    /* JADX INFO: renamed from: com.omron.lib.a$a, reason: collision with other inner class name */
    public class C0849a implements av.b {
        final /* synthetic */ IdentifierCallback a;
        final /* synthetic */ String b;

        public C0849a(IdentifierCallback identifierCallback, String str) {
            this.a = identifierCallback;
            this.b = str;
        }

        @Override // com.omron.av.b
        public void a(int i, String str) {
            int i2;
            try {
                i2 = new JSONObject(str).getInt("code");
            } catch (Exception e2) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                ay.b("初始化服务器返回-异常:" + byteArrayOutputStream.toString(), new Object[0]);
                this.a.onFail(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                i2 = 0;
            }
            if (i2 == 200) {
                new IdentifierResponse();
                IdentifierResponse identifierResponse = (IdentifierResponse) l.a(str, IdentifierResponse.class);
                if (identifierResponse.a() != null) {
                    o.b(a.this.a, "uuid", identifierResponse.a().c());
                }
                String strB = identifierResponse.a().b();
                o.b(a.this.a, "ekiKey", strB);
                try {
                    EkiKeyInfo ekiKeyInfo = (EkiKeyInfo) l.a(com.omron.d.a(strB), EkiKeyInfo.class);
                    o.b(a.this.a, HttpConst.APP_KEY, ekiKeyInfo.a());
                    long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        jCurrentTimeMillis = simpleDateFormat.parse(identifierResponse.a().a()).getTime();
                        o.b(a.this.a, "last_usage_date", identifierResponse.a().a());
                    } catch (ParseException e3) {
                        e3.printStackTrace();
                    }
                    if (ekiKeyInfo.d() != null) {
                        for (EkiKeyInfo.Bp bp : ekiKeyInfo.d()) {
                            try {
                                if (jCurrentTimeMillis <= simpleDateFormat.parse(bp.c()).getTime()) {
                                    a.this.d.add(new aq(bp.b(), bp.d(), bp.a()));
                                }
                            } catch (ParseException e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (ekiKeyInfo.b() != null) {
                        for (EkiKeyInfo.Bg bg : ekiKeyInfo.b()) {
                            try {
                                if (jCurrentTimeMillis <= simpleDateFormat.parse(bg.c()).getTime()) {
                                    a.this.d.add(new aq(bg.b(), bg.d(), bg.a()));
                                }
                            } catch (ParseException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    if (ekiKeyInfo.e() != null) {
                        for (EkiKeyInfo.Fat fat : ekiKeyInfo.e()) {
                            try {
                                if (jCurrentTimeMillis <= simpleDateFormat.parse(fat.c()).getTime()) {
                                    a.this.d.add(new aq(fat.b(), fat.d(), fat.a()));
                                }
                            } catch (ParseException e6) {
                                e6.printStackTrace();
                            }
                        }
                    }
                    if (ekiKeyInfo.c() != null) {
                        for (EkiKeyInfo.Ox ox : ekiKeyInfo.c()) {
                            try {
                                if (jCurrentTimeMillis <= simpleDateFormat.parse(ox.c()).getTime()) {
                                    a.this.d.add(new aq(ox.b(), ox.d(), ox.a()));
                                }
                            } catch (ParseException e7) {
                                e7.printStackTrace();
                            }
                        }
                    }
                    if (o.a(a.this.a, HttpConst.APP_KEY, "").equals(this.b) && a.this.d.size() != 0) {
                        a.this.c();
                        this.a.onSuccess();
                        return;
                    }
                } catch (Exception e8) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    e8.printStackTrace(new PrintStream(byteArrayOutputStream2));
                    ay.b("ekikey解密-异常:" + byteArrayOutputStream2.toString(), new Object[0]);
                    this.a.onFail(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                    return;
                }
            }
            this.a.onFail(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
        }

        @Override // com.omron.av.b
        public void b(int i, String str) {
            long time;
            String str2 = (String) o.a(a.this.a, "ekiKey", "");
            if (!str2.equals("")) {
                String str3 = (String) o.a(a.this.a, "last_usage_date", "");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (str3.equals("")) {
                    o.b(a.this.a, "last_usage_date", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
                    time = jCurrentTimeMillis;
                } else {
                    try {
                        time = simpleDateFormat.parse(str3).getTime();
                    } catch (ParseException e2) {
                        e2.printStackTrace();
                        time = 0;
                    }
                }
                if (time > jCurrentTimeMillis) {
                    ay.b("requestIdentifier() error:local date error", new Object[0]);
                } else {
                    o.b(a.this.a, "last_usage_date", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
                    try {
                        EkiKeyInfo ekiKeyInfo = (EkiKeyInfo) l.a(com.omron.d.a(str2), EkiKeyInfo.class);
                        long j2 = jCurrentTimeMillis - 86400000;
                        if (ekiKeyInfo.d() != null) {
                            for (EkiKeyInfo.Bp bp : ekiKeyInfo.d()) {
                                try {
                                    if (j2 <= simpleDateFormat.parse(bp.c()).getTime()) {
                                        a.this.d.add(new aq(bp.b(), bp.d(), bp.a()));
                                    }
                                } catch (ParseException e3) {
                                    e3.printStackTrace();
                                }
                            }
                        }
                        if (ekiKeyInfo.b() != null) {
                            for (EkiKeyInfo.Bg bg : ekiKeyInfo.b()) {
                                try {
                                    if (j2 <= simpleDateFormat.parse(bg.c()).getTime()) {
                                        a.this.d.add(new aq(bg.b(), bg.d(), bg.a()));
                                    }
                                } catch (ParseException e4) {
                                    e4.printStackTrace();
                                }
                            }
                        }
                        if (ekiKeyInfo.e() != null) {
                            for (EkiKeyInfo.Fat fat : ekiKeyInfo.e()) {
                                try {
                                    if (j2 <= simpleDateFormat.parse(fat.c()).getTime()) {
                                        a.this.d.add(new aq(fat.b(), fat.d(), fat.a()));
                                    }
                                } catch (ParseException e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                        if (ekiKeyInfo.c() != null) {
                            for (EkiKeyInfo.Ox ox : ekiKeyInfo.c()) {
                                try {
                                    if (j2 <= simpleDateFormat.parse(ox.c()).getTime()) {
                                        a.this.d.add(new aq(ox.b(), ox.d(), ox.a()));
                                    }
                                } catch (ParseException e6) {
                                    e6.printStackTrace();
                                }
                            }
                        }
                        if (a.this.d.size() != 0) {
                            a.this.c();
                            this.a.onSuccess();
                            return;
                        }
                    } catch (Exception e7) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        e7.printStackTrace(new PrintStream(byteArrayOutputStream));
                        ay.b("ekikey解密-异常:" + byteArrayOutputStream.toString(), new Object[0]);
                    }
                }
                this.a.onFail(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
                return;
            }
            this.a.onFail(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
        }
    }

    public a(@NonNull Context context) {
        this.a = context.getApplicationContext();
        String str = this.a.getExternalFilesDir(null) + b.b;
        this.f9012c = str;
        ay.a(str, this.a);
        a(true, "");
        ay.a("OMRONLib", "mDefaultFileDir:" + str, new Object[0]);
    }

    public int a(BleScanDevice bleScanDevice) {
        List<aq> list = this.d;
        if (list != null && !list.isEmpty() && bleScanDevice != null && bleScanDevice.getDeviceType() != null) {
            for (aq aqVar : this.d) {
                if (aqVar.c().equalsIgnoreCase(bleScanDevice.getDeviceType())) {
                    return aqVar.b();
                }
            }
        }
        return 0;
    }

    public String b(@NonNull String str) {
        return this.f9012c + str;
    }

    public abstract void b(BleScanDevice bleScanDevice);

    public void c() {
        this.b = true;
    }

    public void cleanRegistration() {
        a(false, "");
        b();
    }

    public void d() {
        this.i = true;
    }

    public void e() {
        this.i = false;
    }

    public void f() {
        ay.a("OMRONLib", "cycleScan stop", new Object[0]);
        com.omron.c cVar = this.f;
        if (cVar != null) {
            cVar.f();
        }
    }

    public List<String> getDeviceTypeList(int i) {
        List<aq> list = this.d;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (aq aqVar : this.d) {
            if (i == 0 || i == aqVar.b()) {
                arrayList.add(aqVar.c());
            }
        }
        return arrayList;
    }

    public boolean isBluetoothOn() {
        if (this.f == null) {
            this.f = com.omron.c.a(this.a);
        }
        return this.f.c();
    }

    public boolean isMonitoring() {
        return this.i;
    }

    public boolean isRegistered() {
        return this.b;
    }

    @Override // com.omron.a
    public void onBleScan(BleScanDevice bleScanDevice, int i, byte[] bArr) {
        f();
        ay.a("OMRONLib", "on CycleScan get device name:%s; device address:%s", OmronLogVisibleUtil.getMessage(bleScanDevice.getName()), OmronLogVisibleUtil.getMessage(bleScanDevice.getAddress()));
        if (!isMonitoring()) {
            ay.a("OMRONLib", "on CycleScan is not inMonitoring", new Object[0]);
            return;
        }
        aq aqVarA = a(bleScanDevice.getDeviceType());
        this.g = aqVarA;
        if (aqVarA == null) {
            ay.a("OMRONLib", "on CycleScan error:mDeviceModel is null", new Object[0]);
        } else {
            b(bleScanDevice);
        }
    }

    @Override // com.omron.a
    public void onCycleEnd() {
        ay.a("OMRONLib", "周期扫描-结束一个周期", new Object[0]);
    }

    public void stopScan() {
        ay.a("OMRONLib", "stopScan", new Object[0]);
        com.omron.c cVar = this.f;
        if (cVar != null) {
            cVar.f();
        }
    }

    public void stopSyncScan() {
        ay.a("OMRONLib", "stopScan", new Object[0]);
        com.omron.c cVar = this.f;
        if (cVar != null) {
            cVar.g();
        }
    }

    public aq a(@NonNull String str) {
        List<aq> list;
        if (!TextUtils.isEmpty(str) && (list = this.d) != null && !list.isEmpty()) {
            for (aq aqVar : this.d) {
                if (str.equals(aqVar.c())) {
                    return aqVar;
                }
            }
        }
        return null;
    }

    public List<aq> b(int i) {
        List<aq> list = this.d;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        return i == 0 ? this.d : a(i);
    }

    public String a() {
        return this.f9013e;
    }

    public void b() {
        this.b = false;
    }

    public List<aq> a(int i) {
        List<aq> list = this.d;
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (aq aqVar : this.d) {
            if (i == aqVar.b()) {
                arrayList.add(aqVar);
            }
        }
        return arrayList;
    }

    public void b(@NonNull List<BleScanDevice> list) {
        if (this.f == null) {
            this.f = com.omron.c.a(this.a);
        }
        this.f.a(this);
        ay.a("OMRONLib", "cycleScan start", new Object[0]);
        com.omron.b bVar = new com.omron.b();
        bVar.a(a(list));
        this.f.a(bVar, 0L);
    }

    public List<aq> a(List<BleScanDevice> list) {
        List<aq> list2 = this.d;
        if (list2 == null || list2.isEmpty() || list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (aq aqVar : this.d) {
            for (BleScanDevice bleScanDevice : list) {
                ay.a("ModelName = ", aqVar.a(), new Object[0]);
                ay.a("scanDevice = ", bleScanDevice.getName(), new Object[0]);
                if (bleScanDevice.getName() != null && bleScanDevice.getName().toLowerCase().startsWith(aqVar.a().toLowerCase())) {
                    aq aqVar2 = new aq(aqVar.b(), aqVar.c(), bleScanDevice.getName());
                    if (!TextUtils.isEmpty(bleScanDevice.getUserIndex())) {
                        aqVar2.a(Integer.parseInt(bleScanDevice.getUserIndex()));
                    }
                    arrayList.add(aqVar2);
                }
            }
        }
        return arrayList;
    }

    public void b(List<aq> list, @Size(max = 300, min = 1) int i, @Nullable String str, @Nullable com.omron.a aVar) {
        com.omron.b bVar = new com.omron.b();
        if (!TextUtils.isEmpty(str) && BluetoothAdapter.checkBluetoothAddress(str)) {
            bVar.b(str);
        }
        bVar.a(list);
        if (this.f == null) {
            this.f = com.omron.c.a(this.a);
        }
        if (this.f.d()) {
            return;
        }
        ay.a("OMRONLib", "startScan", new Object[0]);
        this.f.a(aVar);
        this.f.a(bVar, ((long) i) * 1000);
    }

    public void a(String str, String str2, IdentifierCallback identifierCallback) {
        try {
            com.omron.e.a().a(this.a);
        } catch (Exception e2) {
            e2.printStackTrace();
            e2.printStackTrace(new PrintStream(new ByteArrayOutputStream()));
        }
        if (str == null || str.length() <= 9 || str2 == null || str2.length() <= 16) {
            identifierCallback.onFail(OMRONBLEErrMsg.OMRON_SDK_InValidKey);
            return;
        }
        if (((String) o.a(this.a, "ekiKey", "")).equals("")) {
            o.b(this.a, "ekiKey", str2);
            o.b(this.a, HttpConst.APP_KEY, str);
        }
        String strA = m.a(str.substring(0, 9) + "e2KaQnHVsp");
        String strA2 = j.a(n.a(this.a));
        HashMap map = new HashMap();
        map.put(SystemInfoCollect.IMEI, "");
        map.put("AndroidID", strA2);
        map.put("MAC", "");
        map.put("SerialNumber", "");
        String string = new JSONObject(map).toString();
        HashMap map2 = new HashMap();
        map2.put("equipmentIdentity", "0");
        map2.put("uuid", String.valueOf(o.a(this.a, "uuid", "")));
        map2.put("expansionInfo", string);
        av.a().a(200, new C0849a(identifierCallback, str), "https://sdkb.omronhealthcare.com.cn/api/v1/Sdk/Identifier", new JSONObject(map2).toString(), str, strA);
        ay.a(true);
    }

    public void a(List<aq> list, @Size(max = 300, min = 1) int i, @Nullable String str, @Nullable com.omron.a aVar) {
        com.omron.b bVar = new com.omron.b();
        if (!TextUtils.isEmpty(str) && BluetoothAdapter.checkBluetoothAddress(str)) {
            bVar.b(str);
        }
        bVar.a(list);
        bVar.a(true);
        if (this.f == null) {
            this.f = com.omron.c.a(this.a);
        }
        if (this.f.d()) {
            return;
        }
        ay.a("OMRONLib", "startScan", new Object[0]);
        this.f.a(aVar);
        this.f.a(bVar, ((long) i) * 1000);
    }

    private void a(boolean z, String str) {
        if (z) {
            this.f9013e = k.a(b("uuid.txt"), "utf-8");
        } else {
            this.f9013e = str;
            k.a(b("uuid.txt"), str, "utf-8", false);
        }
    }
}
