package com.lifesense.android.bluetooth.core.business.log;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.business.log.report.e;
import com.lifesense.android.bluetooth.core.business.sync.DeviceSyncCentre;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    public static d h;
    public Context a;
    public Map<String, e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, com.lifesense.android.bluetooth.core.business.log.report.b> f8582c;
    public com.lifesense.android.bluetooth.core.business.log.report.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.lifesense.android.bluetooth.core.business.log.report.d f8583e;
    public HandlerThread f;
    public Handler g;

    public class a implements Runnable {
        public final /* synthetic */ com.lifesense.android.bluetooth.core.business.log.report.a a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.lifesense.android.bluetooth.core.business.log.report.b f8584c;

        public a(com.lifesense.android.bluetooth.core.business.log.report.a aVar, String str, com.lifesense.android.bluetooth.core.business.log.report.b bVar) {
            this.a = aVar;
            this.b = str;
            this.f8584c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.a(this.a)) {
                d.this.a(this.b, this.f8584c);
            } else {
                d.this.b(this.b, this.f8584c);
            }
        }
    }

    public static synchronized d d() {
        d dVar = h;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        h = dVar2;
        return dVar2;
    }

    public void a() {
        Map<String, e> map = this.b;
        if (map == null || map.size() == 0) {
            return;
        }
        for (e eVar : this.b.values()) {
            if (eVar != null) {
                eVar.a();
            }
        }
        this.b.clear();
    }

    public e b(String str) {
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar == null || !dVar.e() || str == null || !this.b.containsKey(str)) {
            return null;
        }
        return this.b.get(str);
    }

    public void c() {
        Map<String, e> map;
        com.lifesense.android.bluetooth.core.business.log.report.b bVar;
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar == null || !dVar.e() || (map = this.b) == null || map.size() == 0) {
            return;
        }
        for (Map.Entry<String, e> entry : this.b.entrySet()) {
            e value = entry.getValue();
            value.c();
            if (!this.f8582c.containsKey(entry.getKey()) && (bVar = this.d) != null) {
                value.a(bVar);
                this.f8582c.put(entry.getKey(), this.d);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public synchronized void a(Context context, boolean z) {
        this.f8582c = new ConcurrentSkipListMap();
        this.b = new ConcurrentSkipListMap();
        this.d = null;
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("ReportCentreThread");
        this.f = handlerThread;
        handlerThread.start();
        this.g = new Handler(this.f.getLooper());
        if (this.f8583e == null) {
            com.lifesense.android.bluetooth.core.business.log.report.d dVar = new com.lifesense.android.bluetooth.core.business.log.report.d(z);
            this.f8583e = dVar;
            dVar.c("Test");
            this.f8583e.b(null);
            this.f8583e.a("0.0.O");
        }
    }

    public synchronized void b() {
        Map<String, e> map = this.b;
        if (map != null && map.size() > 0) {
            Iterator<Map.Entry<String, e>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().a();
            }
            this.b.clear();
        }
    }

    public synchronized void c(String str) {
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar != null && dVar.e()) {
            if (str != null && this.b.containsKey(str)) {
                this.b.get(str).a();
                this.b.remove(str);
            }
        }
    }

    public synchronized void a(String str) {
        com.lifesense.android.bluetooth.core.business.log.report.b bVar;
        if (b(str) != null) {
            return;
        }
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar != null && dVar.e()) {
            if (str != null && !this.b.containsKey(str)) {
                LsDeviceInfo lsDeviceInfo = new LsDeviceInfo();
                lsDeviceInfo.setMacAddress(str);
                lsDeviceInfo.setBroadcastID(str.replace(":", ""));
                e eVar = new e(this.a, lsDeviceInfo, this.f8583e);
                this.b.put(str, eVar);
                eVar.c();
                if (!this.f8582c.containsKey(str) && (bVar = this.d) != null) {
                    eVar.a(bVar);
                    this.f8582c.put(str, this.d);
                }
            }
        }
    }

    public final void b(String str, com.lifesense.android.bluetooth.core.business.log.report.b bVar) {
        com.lifesense.android.bluetooth.core.protocol.worker.a protocolHandler;
        try {
            Map<String, e> map = this.b;
            if (map != null && map.size() != 0 && bVar != null) {
                com.lifesense.android.bluetooth.core.business.log.report.a aVarC = bVar.c();
                if (str != null && this.b.get(str) != null && (this.b.get(str) instanceof e)) {
                    e eVar = this.b.get(str);
                    if ((com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Caching == aVarC || com.lifesense.android.bluetooth.core.business.log.report.a.Reset_Protocol == aVarC) && (protocolHandler = DeviceSyncCentre.getInstance().getProtocolHandler(str)) != null && protocolHandler.getDeviceConnectState() == DeviceConnectState.CONNECTED_SUCCESS) {
                        return;
                    }
                    eVar.a(bVar);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void a(String str, com.lifesense.android.bluetooth.core.business.log.report.a aVar, boolean z, String str2, String str3) {
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar != null && dVar.e() && this.f8583e.d()) {
            if (this.g == null) {
                return;
            }
            if (!TextUtils.isEmpty(str) && b(str) == null) {
                a(str);
            }
            if (b("FF:FF:FF:FF:FF:FF") == null) {
                a("FF:FF:FF:FF:FF:FF");
            }
            this.g.post(new a(aVar, str, new com.lifesense.android.bluetooth.core.business.log.report.b(aVar, z, str2, str3)));
        }
    }

    public final void a(String str, com.lifesense.android.bluetooth.core.business.log.report.b bVar) {
        if (bVar == null) {
            return;
        }
        try {
            com.lifesense.android.bluetooth.core.business.log.report.a aVarC = bVar.c();
            if (com.lifesense.android.bluetooth.core.business.log.report.a.Start_SDK == bVar.c()) {
                this.d = bVar;
            }
            if (str != null && this.b.get(str) != null && (this.b.get(str) instanceof e)) {
                this.b.get(str).a(bVar);
                return;
            }
            for (Map.Entry<String, e> entry : this.b.entrySet()) {
                e value = entry.getValue();
                if (value != null) {
                    if (DeviceSyncCentre.getInstance().getProtocolHandler(entry.getKey()) == null || (com.lifesense.android.bluetooth.core.business.log.report.a.Stop_Scan != aVarC && com.lifesense.android.bluetooth.core.business.log.report.a.Start_Scan != aVarC && com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message != aVarC && com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Results != aVarC && com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Timeout != aVarC)) {
                        value.a(bVar);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void a(String str, String str2, String str3) {
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar != null && dVar.e()) {
            if (str == null || str.length() == 0) {
                this.f8583e.b(null);
            } else {
                File file = new File(str);
                try {
                    if (!file.isDirectory()) {
                        file.mkdirs();
                    }
                    if (file.exists() && file.isDirectory()) {
                        this.f8583e.b(str);
                        com.lifesense.android.bluetooth.core.business.log.report.c.d(str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.f8583e.c(str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f8583e.a(str3);
            }
        }
    }

    public void a(Map<String, LsDeviceInfo> map) {
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar == null || !dVar.e() || map == null || map.size() == 0) {
            return;
        }
        for (LsDeviceInfo lsDeviceInfo : map.values()) {
            if (lsDeviceInfo.getMacAddress() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error,failed to create the statistic worker with mac:");
                sb.append(lsDeviceInfo.getMacAddress());
                return;
            } else {
                Map<String, e> map2 = this.b;
                if (map2 != null && !map2.containsKey(lsDeviceInfo.getMacAddress())) {
                    this.b.put(lsDeviceInfo.getMacAddress(), new e(this.a, lsDeviceInfo, this.f8583e));
                }
            }
        }
    }

    public synchronized void a(boolean z) {
        com.lifesense.android.bluetooth.core.business.log.report.d dVar = this.f8583e;
        if (dVar != null) {
            dVar.a(true);
            if (this.d == null) {
                com.lifesense.android.bluetooth.core.business.log.report.a aVar = com.lifesense.android.bluetooth.core.business.log.report.a.Start_SDK;
                com.lifesense.android.bluetooth.core.business.log.report.b bVar = new com.lifesense.android.bluetooth.core.business.log.report.b(aVar, true, null, null);
                this.d = bVar;
                bVar.a(aVar);
            }
        } else {
            com.lifesense.android.bluetooth.core.business.log.report.d dVar2 = new com.lifesense.android.bluetooth.core.business.log.report.d(z);
            this.f8583e = dVar2;
            dVar2.c("Test");
            this.f8583e.b(null);
            this.f8583e.a("0.0.O");
        }
    }

    public final boolean a(com.lifesense.android.bluetooth.core.business.log.report.a aVar) {
        com.lifesense.android.bluetooth.core.business.log.report.a aVar2;
        return com.lifesense.android.bluetooth.core.business.log.report.a.Start_Service == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Stop_Service == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Stop_Scan == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Start_Scan == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Close_Bluetooth == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Enable_Bluetooth == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Call_State_Changed == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.App_Message == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Stop_SDK == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Start_SDK == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Warning_Message == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Upgrade_Message == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Broadcast_Message == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Results == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Restart_Service == aVar || (aVar2 = com.lifesense.android.bluetooth.core.business.log.report.a.Bluetooth_Status) == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Message == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Restart_Bluetooth == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Ble_Event_Change == aVar || aVar2 == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Update_Event == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Set_Measure_Device == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Add_Device == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Program_Exception == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Add_Action == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Connect_Failure == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Message_Remind == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Check_Permission == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Scan_Timeout == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Release_Resources == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Update_Gps_Status == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Notification_Service == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Access_Service == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Device_Filter == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Operating_Msg == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Close_Gatt == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Close_Gatt_Request == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Cancel_Connection == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Callback_Message == aVar || com.lifesense.android.bluetooth.core.business.log.report.a.Check_Connected == aVar;
    }
}
