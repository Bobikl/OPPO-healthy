package com.lifesense.plugin.ble.b.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.lifesense.plugin.ble.LSBluetoothManager;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.device.a.a.o;
import com.lifesense.plugin.ble.device.a.a.u;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"SimpleDateFormat", "NewApi"})
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f8692e;
    private HandlerThread f;
    private Handler g;
    private h h;
    private LSDeviceInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f8693j;
    private File k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f8694l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8695n;
    private String o;
    private final int a = 7;
    private final String b = "lifesense/log";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8691c = 1;
    private final int d = 8;
    private int p = 0;

    /* JADX WARN: Code duplicated, block: B:4:0x0022  */
    public i(Context context, LSDeviceInfo lSDeviceInfo, h hVar) {
        String absolutePath;
        this.h = hVar;
        this.o = hVar.b();
        if (hVar.a() == null) {
            absolutePath = com.lifesense.plugin.ble.c.e.a(this.f8692e, "lifesense/log");
        } else {
            File file = new File(hVar.a());
            try {
                file.mkdirs();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (file.exists() && file.isDirectory()) {
                absolutePath = file.getAbsolutePath();
            } else {
                absolutePath = com.lifesense.plugin.ble.c.e.a(this.f8692e, "lifesense/log");
            }
        }
        this.f8694l = absolutePath;
        this.m = false;
        this.i = lSDeviceInfo;
        this.f8692e = context;
        this.f8693j = 0L;
        HandlerThread handlerThread = new HandlerThread("BleReportHandler");
        this.f = handlerThread;
        handlerThread.start();
        this.g = new j(this, this.f.getLooper());
    }

    public static /* synthetic */ int b(i iVar) {
        int i = iVar.p;
        iVar.p = i + 1;
        return i;
    }

    @SuppressLint({"DefaultLocale"})
    private String a(LSDeviceInfo lSDeviceInfo) {
        if (lSDeviceInfo == null || lSDeviceInfo.getBroadcastID() == null || lSDeviceInfo.getMacAddress() == null) {
            return "unknown";
        }
        String broadcastID = lSDeviceInfo.getBroadcastID();
        String string = new String(lSDeviceInfo.getMacAddress()).replace(":", "").toUpperCase().toString();
        return broadcastID.equalsIgnoreCase(string) ? broadcastID : string;
    }

    private String c() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Time");
        stringBuffer.append("\t\t\t");
        stringBuffer.append("Event");
        stringBuffer.append("\t\t\t");
        stringBuffer.append("Status");
        stringBuffer.append("\t\t");
        stringBuffer.append("DataType");
        stringBuffer.append("\t");
        stringBuffer.append("Remark");
        stringBuffer.append("\t\t");
        stringBuffer.append("SourceData");
        return stringBuffer.toString();
    }

    @SuppressLint({"NewApi"})
    public void b() {
        try {
            Handler handler = this.g;
            if (handler != null) {
                handler.getLooper().quitSafely();
                this.g = null;
            }
            HandlerThread handlerThread = this.f;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.f = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(b bVar) {
        this.m = true;
        this.f8693j = System.currentTimeMillis();
        a(this.k, "\r\n\r\n");
        a(this.k, "Start Time:" + com.lifesense.plugin.ble.c.d.defaultDateFormat.format(new Date(this.f8693j)));
        a(this.k, "------------------------------------");
        a(this.k, c());
        a(this.k, new b(a.Measure_Devices, true, com.lifesense.plugin.ble.c.b.a(u.a().c()), null).a(this.f8695n));
        a(this.k, new b(a.Check_Permission, true, com.lifesense.plugin.ble.c.f.a(this.f8692e).getLogogramValue(), null).a(this.f8695n));
        String strB = com.lifesense.plugin.ble.c.b.b(o.a().g());
        if (!TextUtils.isEmpty(strB)) {
            a(this.k, new b(a.Device_Filter, true, strB, null).a(this.f8695n));
        }
        a(this.k, new b(a.Scan_Message, true, o.a().i(), null).a(this.f8695n));
        a(this.k, new b(a.App_Message, true, LSBluetoothManager.getInstance().getConnectionConfig(), null).a(this.f8695n));
        a(this.k, bVar.a(this.f8695n));
    }

    public void a() {
        Handler handler = this.g;
        if (handler == null || this.f == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.arg1 = 1;
        this.g.sendMessage(messageObtainMessage);
    }

    public synchronized void a(b bVar) {
        Handler handler = this.g;
        if (handler != null && this.f != null) {
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.arg1 = 8;
            messageObtainMessage.obj = bVar;
            this.g.sendMessage(messageObtainMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(File file, String str) {
        if (file != null) {
            try {
                if (file.isFile() && file.exists()) {
                    String str2 = str + "\r\n";
                    if (this.k == file && c.a(file.length(), str2.getBytes().length)) {
                        File file2 = new File(file.getParent(), c.a(file.getName()));
                        this.k = file2;
                        file2.createNewFile();
                        file = file2;
                    }
                    FileWriter fileWriter = new FileWriter(file, true);
                    fileWriter.write(str2);
                    fileWriter.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        try {
            String strA = a(this.i);
            String strA2 = c.a(this.f8694l, str, strA, this.h.c());
            g gVarA = c.a(new File(this.f8694l), 7, str, strA);
            File file = gVarA.b;
            if (file != null) {
                strA2 = file.getPath();
            }
            File[] fileArr = gVarA.a;
            if (fileArr != null && fileArr.length > 0) {
                for (File file2 : fileArr) {
                    file2.delete();
                }
            }
            File file3 = new File(strA2);
            this.k = file3;
            if (file3.exists()) {
                return;
            }
            this.k.createNewFile();
            a(this.k, "Debug Environment:");
            a(this.k, "SDK Version:v2.2.4 build8-OTA 20210129");
            a(this.k, com.lifesense.plugin.ble.c.b.c().toString());
        } catch (IOException e2) {
            e2.printStackTrace();
            System.err.println("sky failed to create log report file with path=" + this.k.getAbsolutePath());
        }
    }
}
