package com.glyphix.mas;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.os.RemoteException;
import com.glyphix.mas.Glyphix;
import com.glyphix.mas.api.GxApp;
import com.glyphix.mas.api.GxMessage;
import com.glyphix.mas.api.GxSys;
import com.glyphix.mas.callback.GlyphixResolver;
import com.glyphix.mas.common.GlyphixLocationProvider;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class Glyphix {
    private static String a = "com.glyphix.mas.Glyphix";
    private static String b = "com.glyphix.mas.Glyphix";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static com.glyphix.mas.service.c f2304c;
    private static com.glyphix.mas.common.c d;
    private static PowerManager.WakeLock f;
    private static com.glyphix.mas.common.d g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static GlyphixResolver f2305e = new a();
    private static boolean h = false;
    private static final List<g> i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ServiceConnection f2306j = new b();
    private static com.glyphix.mas.b k = new e();

    public enum MasLogLevel {
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    public class a implements GlyphixResolver {
        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            com.glyphix.mas.utils.b.c().e(Glyphix.a, "default linkStatusResolver " + jSONObject.toString());
            return 0;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            com.glyphix.mas.utils.b.c().c(Glyphix.a, "default linkStatusResolver " + jSONObject.toString());
            return 0;
        }
    }

    public class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                com.glyphix.mas.d.b.a(iBinder).a(Glyphix.k);
            } catch (RemoteException e2) {
                com.glyphix.mas.utils.b.c().b("set mas feature executor error");
                e2.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class c implements GlyphixResolver {
        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            return 0;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            return 0;
        }
    }

    public class d implements GlyphixResolver {
        final /* synthetic */ boolean a;
        final /* synthetic */ GlyphixResolver b;

        public d(boolean z, GlyphixResolver glyphixResolver) {
            this.a = z;
            this.b = glyphixResolver;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            this.b.onFailed(jSONObject);
            com.glyphix.mas.common.a.c();
            return 0;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            if (this.a) {
                Glyphix.enableNetwork(Glyphix.d.b());
            }
            Glyphix.d(this.a);
            this.b.onSuccess(jSONObject);
            return 0;
        }
    }

    public class e extends com.glyphix.mas.b.AbstractBinderC0218b {

        public class a implements GxMessage.b {
            final /* synthetic */ h a;

            public a(h hVar) {
                this.a = hVar;
            }

            @Override // com.glyphix.mas.api.GxMessage.b
            public void c(String str) {
                try {
                    this.a.c(str);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        }

        public class b implements g {
            final /* synthetic */ com.glyphix.mas.f a;

            public b(com.glyphix.mas.f fVar) {
                this.a = fVar;
            }

            @Override // com.glyphix.mas.Glyphix.g
            public void a(boolean z) {
                try {
                    this.a.a(z);
                } catch (RemoteException | NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
        }

        @Override // com.glyphix.mas.b
        public String a(String str, String str2, String str3, com.glyphix.mas.c cVar) {
            try {
                return com.glyphix.mas.common.b.a(str, new JSONObject(str2), str3, new f(cVar));
            } catch (JSONException e2) {
                e2.printStackTrace();
                return "";
            }
        }

        @Override // com.glyphix.mas.b
        public void b(String str, com.glyphix.mas.c cVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("remote", str);
                com.glyphix.mas.common.b.a("we_app_install_svc", jSONObject, "", new f(cVar));
            } catch (JSONException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.glyphix.mas.b
        public int c() {
            return GxMas.getRemoteMasVersion();
        }

        @Override // com.glyphix.mas.b
        public void f(String str) {
            GxMessage.unsubscribe(str);
        }

        @Override // com.glyphix.mas.b
        public void g(String str) {
            Glyphix.abortTask(str);
        }

        @Override // com.glyphix.mas.b
        public void a(com.glyphix.mas.c cVar) {
            GxSys.getDeviceInfo(new f(cVar));
        }

        @Override // com.glyphix.mas.b
        public void b(String str, String str2, String str3, com.glyphix.mas.c cVar) {
            GxMessage.send(str, str2, str3, new f(cVar));
        }

        @Override // com.glyphix.mas.b
        public void c(String str, com.glyphix.mas.c cVar) {
            GxApp.launch(str, new f(cVar));
        }

        @Override // com.glyphix.mas.b
        public boolean a() {
            return Glyphix.deviceConnectStatus();
        }

        @Override // com.glyphix.mas.b
        public void b(com.glyphix.mas.f fVar) {
            Glyphix.subscribeMasLinkStatus(new b(fVar));
        }

        @Override // com.glyphix.mas.b
        public void a(String str, com.glyphix.mas.c cVar) {
            GxApp.isWearAppInstalled(str, new f(cVar));
        }

        @Override // com.glyphix.mas.b
        public String a(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, String str3, com.glyphix.mas.c cVar) {
            try {
                int iDetachFd = parcelFileDescriptor.detachFd();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("local_fd", iDetachFd);
                jSONObject.put("remote", str2);
                jSONObject.put("appId", str3);
                return com.glyphix.mas.common.b.a("we_push_file_svc", jSONObject, "we_send_file", new f(cVar));
            } catch (JSONException unused) {
                return null;
            }
        }

        @Override // com.glyphix.mas.b
        public void a(String str, h hVar) {
            GxMessage.subscribe(str, new a(hVar));
        }
    }

    public static class f implements GlyphixResolver {
        private com.glyphix.mas.c a;

        public f(com.glyphix.mas.c cVar) {
            this.a = cVar;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            int i;
            com.glyphix.mas.c cVar = this.a;
            if (cVar == null) {
                i = 0;
            } else {
                try {
                    cVar.b(jSONObject.toString());
                } catch (RemoteException | NullPointerException e2) {
                    e2.printStackTrace();
                }
                i = 1;
            }
            return Integer.valueOf(i);
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onProgress(JSONObject jSONObject) {
            com.glyphix.mas.c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            try {
                cVar.d(jSONObject.toString());
            } catch (RemoteException | NullPointerException e2) {
                e2.printStackTrace();
            }
            return super.onProgress(jSONObject);
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            int i;
            com.glyphix.mas.c cVar = this.a;
            if (cVar == null) {
                i = 0;
            } else {
                try {
                    cVar.a(jSONObject.toString());
                } catch (RemoteException | NullPointerException e2) {
                    e2.printStackTrace();
                }
                i = 1;
            }
            return Integer.valueOf(i);
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer retry() {
            return super.retry();
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer timeout() {
            return super.timeout();
        }
    }

    public interface g {
        void a(boolean z);
    }

    private static int a(Context context, String str, Integer num, Integer num2) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), "com.glyphix.mas.service.WearEngineService"));
        context.bindService(intent, f2306j, 1);
        GxMas.a(context);
        f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "glyphix:bluetoothWakeLock");
        f2304c = new com.glyphix.mas.service.c(context);
        g = new com.glyphix.mas.common.d(num2.intValue());
        if (str.isEmpty()) {
            new Exception("log path is empty").printStackTrace();
            return -1;
        }
        File file = new File(str);
        try {
            com.glyphix.mas.utils.b.c().a(file.getPath());
            if (file.isFile()) {
                file.delete();
                file.mkdirs();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            d();
            String strA = com.glyphix.mas.utils.a.a(context, "glyphix");
            if (strA == null || strA.isEmpty()) {
                com.glyphix.mas.utils.b.c().b("GxMas", "not find meta 【glyphix】in AndroidManifest.xml");
                return -1;
            }
            String packageName = context.getPackageName();
            String strA2 = com.glyphix.mas.utils.a.a(context);
            byte[] byteArray = new BigInteger(strA, 32).toByteArray();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : byteArray) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            String str2 = context.getFilesDir().getAbsolutePath() + "/glyphix/app";
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            int iStartMas = GxMas.startMas(num.intValue(), str, sb.toString(), strA2, packageName, str2);
            a(context);
            com.glyphix.mas.common.a.a = context;
            if (iStartMas >= 0) {
                com.glyphix.mas.common.b.a(true);
            }
            return iStartMas;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static boolean abortTask(String str) {
        if (str == null) {
            return false;
        }
        return GxMas.abortTask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(boolean z) {
        synchronized (i) {
            int i2 = 0;
            while (true) {
                List<g> list = i;
                if (i2 < list.size()) {
                    list.get(i2).a(z);
                    i2++;
                }
            }
        }
    }

    public static synchronized boolean deviceConnectStatus() {
        return h;
    }

    public static void enableLogLevel(MasLogLevel masLogLevel, Boolean bool) {
        GxMas.enableLogNative(masLogLevel.ordinal(), bool.booleanValue() ? 1 : 0);
    }

    public static void enableNetwork(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", z ? 1 : 0);
            com.glyphix.mas.common.b.a("svc_update_net_status", jSONObject, b, new c());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static int init(Context context, String str) {
        return init(context, str, 20000);
    }

    public static void linkStatusChange(boolean z, GlyphixResolver glyphixResolver) {
        try {
            com.glyphix.mas.utils.b.c().c("link status change ", z + "");
            JSONObject jSONObject = new JSONObject();
            setDeviceConnectStatus(z);
            jSONObject.put("status", z ? 1 : 0);
            com.glyphix.mas.common.c cVar = d;
            if (cVar != null) {
                cVar.c();
                jSONObject.put("netStatus", d.b() ? 1 : 0);
            }
            if (!z) {
                d(z);
            }
            com.glyphix.mas.common.b.a("notice_link_change_svc", jSONObject, b, new d(z, glyphixResolver));
            if (z) {
                return;
            }
            com.glyphix.mas.common.a.c();
        } catch (JSONException unused) {
        }
    }

    @Deprecated
    public static synchronized void listenLinkStatus(GlyphixResolver glyphixResolver) {
        com.glyphix.mas.callback.a.b(b, f2305e);
        f2305e = glyphixResolver;
        com.glyphix.mas.callback.a.a(b, glyphixResolver);
    }

    public static void readData(byte[] bArr) {
        f.acquire(10000L);
        GxMas.readData(bArr);
    }

    public static synchronized void setDeviceConnectStatus(boolean z) {
        h = z;
    }

    public static void setExtraFeatureExecutor(GxMas.MasExtraFeatureExecutor masExtraFeatureExecutor) {
        Objects.requireNonNull(masExtraFeatureExecutor);
        GxMas.f2307c = masExtraFeatureExecutor;
    }

    public static void setLocationProvider(GlyphixLocationProvider glyphixLocationProvider) {
        com.glyphix.mas.common.a.a(glyphixLocationProvider);
    }

    public static void setLogHandler(com.glyphix.mas.utils.c cVar) {
        com.glyphix.mas.utils.b.c().a(cVar);
    }

    public static void setWriteCallback(GxMas.WriteCallback writeCallback) {
        GxMas.setWriteCallback(writeCallback);
    }

    public static synchronized void subscribeMasLinkStatus(g gVar) {
        i.add(gVar);
    }

    public static void uninit() {
        com.glyphix.mas.common.c cVar = d;
        if (cVar != null) {
            cVar.a();
        }
        GxMas.uninit();
        d = null;
        com.glyphix.mas.common.b.a(false);
        com.glyphix.mas.utils.b.c().a();
    }

    public static synchronized void unsubscribeMasLinkStatus(g gVar) {
        i.remove(gVar);
    }

    public static JSONObject version() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("BUILD_TIME", com.glyphix.mas.a.d);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(final boolean z) {
        com.glyphix.mas.utils.b.c().c("onNetStateChanged: " + z + " " + d.b());
        g.a(new Runnable() { // from class: com.oplus.aiunit.vision.y78
            @Override // java.lang.Runnable
            public final void run() {
                Glyphix.enableNetwork(z);
            }
        });
    }

    private static void d() {
        com.glyphix.mas.utils.b.c().c("************** Glyphix ******************");
        com.glyphix.mas.utils.b.c().c("*** Build Time 2026-01-22-19:22:51 ***");
        com.glyphix.mas.utils.b.c().c("*** Build Version 2.6.6 ***");
    }

    public static int init(Context context, String str, Integer num) {
        return init(context, str, num, 1000);
    }

    public static int init(Context context, String str, Integer num, Integer num2) {
        return a(context, str, num, num2);
    }

    private static void a(Context context) {
        com.glyphix.mas.common.c cVar = new com.glyphix.mas.common.c(context);
        d = cVar;
        cVar.a(new com.glyphix.mas.common.c.d() { // from class: com.oplus.aiunit.vision.x78
            @Override // com.glyphix.mas.common.c.d
            public final void a(boolean z) {
                Glyphix.c(z);
            }
        });
    }
}
