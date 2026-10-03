package com.lifesense.plugin.ble.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.lifesense.plugin.ble.b.a.h;
import com.lifesense.plugin.ble.b.a.i;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.device.a.a.u;
import com.lifesense.plugin.ble.device.proto.q;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    private static d d;
    final String a = "Debug";
    final String b = "0.0.O";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8699c = "FF:FF:FF:FF:FF:FF";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f8700e;
    private Map f;
    private Map g;
    private com.lifesense.plugin.ble.b.a.b h;
    private h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HandlerThread f8701j;
    private Handler k;

    private d() {
    }

    public static synchronized d a() {
        d dVar = d;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        d = dVar2;
        return dVar2;
    }

    private String d(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.toUpperCase().replace(":", "");
    }

    public i b(String str) {
        String strD;
        h hVar = this.i;
        if (hVar == null || !hVar.e() || (strD = d(str)) == null || !this.f.containsKey(strD)) {
            return null;
        }
        return (i) this.f.get(strD);
    }

    public void c() {
        Map map = this.f;
        if (map == null || map.size() == 0) {
            return;
        }
        for (i iVar : this.f.values()) {
            if (iVar != null) {
                iVar.b();
            }
        }
        this.f.clear();
    }

    @SuppressLint({"NewApi"})
    public synchronized void a(Context context, boolean z) {
        this.g = new ConcurrentSkipListMap();
        this.f = new ConcurrentSkipListMap();
        com.lifesense.plugin.ble.b.a.a aVar = com.lifesense.plugin.ble.b.a.a.Start_SDK;
        com.lifesense.plugin.ble.b.a.b bVar = new com.lifesense.plugin.ble.b.a.b(aVar, true, null, null);
        this.h = bVar;
        bVar.a(aVar);
        this.f8700e = context;
        HandlerThread handlerThread = new HandlerThread("ReportCentreThread");
        this.f8701j = handlerThread;
        handlerThread.start();
        this.k = new Handler(this.f8701j.getLooper());
        if (this.i == null) {
            h hVar = new h(z);
            this.i = hVar;
            hVar.b("Debug");
            this.i.a((String) null);
            this.i.c("0.0.O");
        }
    }

    public void b() {
        Map map;
        com.lifesense.plugin.ble.b.a.b bVar;
        h hVar = this.i;
        if (hVar == null || !hVar.e() || (map = this.f) == null || map.size() == 0) {
            return;
        }
        for (Map.Entry entry : this.f.entrySet()) {
            i iVar = (i) entry.getValue();
            iVar.a();
            if (!this.g.containsKey(entry.getKey()) && (bVar = this.h) != null) {
                iVar.a(bVar);
                this.g.put(entry.getKey(), this.h);
            }
        }
    }

    public synchronized void c(String str) {
        com.lifesense.plugin.ble.b.a.b bVar;
        if (b(str) != null) {
            return;
        }
        h hVar = this.i;
        if (hVar != null && hVar.e()) {
            String strD = d(str);
            if (strD != null && !this.f.containsKey(strD)) {
                LSDeviceInfo lSDeviceInfo = new LSDeviceInfo();
                lSDeviceInfo.setMacAddress(str);
                lSDeviceInfo.setBroadcastID(str.replace(":", ""));
                i iVar = new i(this.f8700e, lSDeviceInfo, this.i);
                this.f.put(strD, iVar);
                iVar.a();
                if (!this.g.containsKey(strD) && (bVar = this.h) != null) {
                    iVar.a(bVar);
                    this.g.put(strD, this.h);
                }
            }
        }
    }

    public synchronized void d() {
        Map map = this.f;
        if (map != null && map.size() > 0) {
            Iterator it = this.f.entrySet().iterator();
            while (it.hasNext()) {
                ((i) ((Map.Entry) it.next()).getValue()).b();
            }
            this.f.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.lifesense.plugin.ble.b.a.b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            com.lifesense.plugin.ble.b.a.a aVarA = bVar.a();
            if (com.lifesense.plugin.ble.b.a.a.Start_SDK == bVar.a()) {
                this.h = bVar;
            }
            String strD = d(str);
            if (strD != null && this.f.get(strD) != null && (this.f.get(strD) instanceof i)) {
                ((i) this.f.get(strD)).a(bVar);
                return;
            }
            for (Map.Entry entry : this.f.entrySet()) {
                i iVar = (i) entry.getValue();
                if (iVar != null) {
                    if (u.a().d((String) entry.getKey()) == null || (com.lifesense.plugin.ble.b.a.a.Stop_Scan != aVarA && com.lifesense.plugin.ble.b.a.a.Start_Scan != aVarA && com.lifesense.plugin.ble.b.a.a.Scan_Message != aVarA && com.lifesense.plugin.ble.b.a.a.Scan_Results != aVarA && com.lifesense.plugin.ble.b.a.a.Scan_Timeout != aVarA)) {
                        iVar.a(bVar);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void a(String str) {
        h hVar = this.i;
        if (hVar != null && hVar.e()) {
            String strD = d(str);
            if (strD != null && this.f.containsKey(strD)) {
                ((i) this.f.get(strD)).b();
                this.f.remove(strD);
            }
        }
    }

    public synchronized void a(String str, com.lifesense.plugin.ble.b.a.a aVar, boolean z, String str2, String str3) {
        h hVar = this.i;
        if (hVar != null && hVar.e() && this.i.d()) {
            if (this.k == null) {
                return;
            }
            if (!TextUtils.isEmpty(str) && b(str) == null) {
                c(str);
            }
            if (b("FF:FF:FF:FF:FF:FF") == null) {
                c("FF:FF:FF:FF:FF:FF");
            }
            this.k.post(new e(this, aVar, str, new com.lifesense.plugin.ble.b.a.b(aVar, z, str2, str3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.lifesense.plugin.ble.b.a.b bVar) {
        try {
            Map map = this.f;
            if (map != null && map.size() != 0 && bVar != null) {
                com.lifesense.plugin.ble.b.a.a aVarA = bVar.a();
                String strD = d(str);
                if (strD != null && this.f.get(strD) != null && (this.f.get(strD) instanceof i)) {
                    i iVar = (i) this.f.get(strD);
                    if (com.lifesense.plugin.ble.b.a.a.Scan_Caching == aVarA || com.lifesense.plugin.ble.b.a.a.Reset_Protocol == aVarA) {
                        q qVarD = u.a().d(str);
                        if (qVarD != null && qVarD.h() == LSConnectState.ConnectSuccess) {
                            return;
                        }
                    }
                    iVar.a(bVar);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void a(String str, String str2, String str3) {
        h hVar = this.i;
        if (hVar == null) {
            return;
        }
        if (hVar.e()) {
            if (str == null || str.length() == 0) {
                this.i.a((String) null);
            } else {
                File file = new File(str);
                try {
                    if (!file.isDirectory()) {
                        file.mkdirs();
                    }
                    if (file.exists() && file.isDirectory()) {
                        this.i.a(str);
                        com.lifesense.plugin.ble.b.a.c.c(str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.i.b(str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.i.c(str3);
            }
        }
    }

    public void a(Map map) {
        h hVar = this.i;
        if (hVar == null || !hVar.e() || map == null || map.size() == 0) {
            return;
        }
        for (LSDeviceInfo lSDeviceInfo : map.values()) {
            String strD = d(lSDeviceInfo.getMacAddress());
            if (strD == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error,failed to create the statistic worker with mac:");
                sb.append(strD);
                return;
            } else {
                Map map2 = this.f;
                if (map2 != null && !map2.containsKey(strD)) {
                    this.f.put(strD, new i(this.f8700e, lSDeviceInfo, this.i));
                }
            }
        }
    }

    public synchronized void a(boolean z) {
        h hVar = this.i;
        if (hVar != null) {
            hVar.a(true);
        } else {
            h hVar2 = new h(z);
            this.i = hVar2;
            hVar2.b("Debug");
            this.i.a((String) null);
            this.i.c("0.0.O");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.lifesense.plugin.ble.b.a.a aVar) {
        com.lifesense.plugin.ble.b.a.a aVar2;
        return com.lifesense.plugin.ble.b.a.a.Start_Service == aVar || com.lifesense.plugin.ble.b.a.a.Stop_Service == aVar || com.lifesense.plugin.ble.b.a.a.Stop_Scan == aVar || com.lifesense.plugin.ble.b.a.a.Start_Scan == aVar || com.lifesense.plugin.ble.b.a.a.Close_Bluetooth == aVar || com.lifesense.plugin.ble.b.a.a.Enable_Bluetooth == aVar || com.lifesense.plugin.ble.b.a.a.Call_State_Changed == aVar || com.lifesense.plugin.ble.b.a.a.App_Message == aVar || com.lifesense.plugin.ble.b.a.a.Stop_SDK == aVar || com.lifesense.plugin.ble.b.a.a.Start_SDK == aVar || com.lifesense.plugin.ble.b.a.a.Warning_Message == aVar || com.lifesense.plugin.ble.b.a.a.Upgrade_Message == aVar || com.lifesense.plugin.ble.b.a.a.Broadcast_Message == aVar || com.lifesense.plugin.ble.b.a.a.Scan_Results == aVar || com.lifesense.plugin.ble.b.a.a.Restart_Service == aVar || (aVar2 = com.lifesense.plugin.ble.b.a.a.Bluetooth_Status) == aVar || com.lifesense.plugin.ble.b.a.a.Scan_Message == aVar || com.lifesense.plugin.ble.b.a.a.Restart_Bluetooth == aVar || com.lifesense.plugin.ble.b.a.a.Ble_Event_Change == aVar || aVar2 == aVar || com.lifesense.plugin.ble.b.a.a.Update_Event == aVar || com.lifesense.plugin.ble.b.a.a.Set_Measure_Device == aVar || com.lifesense.plugin.ble.b.a.a.Add_Device == aVar || com.lifesense.plugin.ble.b.a.a.Program_Exception == aVar || com.lifesense.plugin.ble.b.a.a.Add_Action == aVar || com.lifesense.plugin.ble.b.a.a.Connect_Failure == aVar || com.lifesense.plugin.ble.b.a.a.Message_Remind == aVar || com.lifesense.plugin.ble.b.a.a.Check_Permission == aVar || com.lifesense.plugin.ble.b.a.a.Scan_Timeout == aVar || com.lifesense.plugin.ble.b.a.a.Release_Resources == aVar || com.lifesense.plugin.ble.b.a.a.Update_Gps_Status == aVar || com.lifesense.plugin.ble.b.a.a.Notification_Service == aVar || com.lifesense.plugin.ble.b.a.a.Access_Service == aVar || com.lifesense.plugin.ble.b.a.a.Device_Filter == aVar || com.lifesense.plugin.ble.b.a.a.Operating_Msg == aVar || com.lifesense.plugin.ble.b.a.a.Close_Gatt == aVar || com.lifesense.plugin.ble.b.a.a.Close_Gatt_Request == aVar || com.lifesense.plugin.ble.b.a.a.Cancel_Connection == aVar || com.lifesense.plugin.ble.b.a.a.Callback_Message == aVar || com.lifesense.plugin.ble.b.a.a.Check_Connected == aVar || com.lifesense.plugin.ble.b.a.a.Player_Service == aVar;
    }
}
