package com.glyphix.mas;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import com.glyphix.mas.api.GxMessage;
import com.glyphix.mas.callback.GlyphixResolver;
import com.oppo.store.web.jsbridge.jscalljava.JsCallJavaMessageHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxMas {
    private static String a = "GxMas";
    private static Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static MasExtraFeatureExecutor f2307c;
    private static ExecutorService d = Executors.newFixedThreadPool(1);

    public interface MasCallback {
        void call(String str, String str2, String str3);
    }

    public interface MasExtraFeatureExecutor {
        boolean exec(JSONObject jSONObject);
    }

    public interface RpcNativeCallnack {
        String call(String str);
    }

    public interface WriteCallback {
        int write(byte[] bArr);
    }

    public class a implements MasCallback {
        @Override // com.glyphix.mas.GxMas.MasCallback
        public void call(String str, String str2, String str3) {
            try {
                com.glyphix.mas.callback.a.a(str, str2, str3);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public class b implements RpcNativeCallnack {

        public class a implements Runnable {
            final /* synthetic */ JSONObject a;

            /* JADX INFO: renamed from: com.glyphix.mas.GxMas$b$a$a, reason: collision with other inner class name */
            public class C0216a implements GlyphixResolver {
                public C0216a() {
                }

                @Override // com.glyphix.mas.callback.GlyphixResolver
                public Integer onFailed(JSONObject jSONObject) {
                    return 1;
                }

                @Override // com.glyphix.mas.callback.GlyphixResolver
                public Integer onSuccess(JSONObject jSONObject) {
                    return 1;
                }
            }

            public a(JSONObject jSONObject) {
                this.a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    GxMessage.send(this.a.getString("taskId"), com.glyphix.mas.common.a.a(this.a), "", new C0216a());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }

        /* JADX INFO: renamed from: com.glyphix.mas.GxMas$b$b, reason: collision with other inner class name */
        public class RunnableC0217b implements Runnable {
            final /* synthetic */ JSONObject a;

            public RunnableC0217b(JSONObject jSONObject) {
                this.a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                GxMas.h(this.a);
            }
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        @Override // com.glyphix.mas.GxMas.RpcNativeCallnack
        public String call(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                switch (jSONObject.getString("module")) {
                    case "location":
                        if (!jSONObject.has("useAsync")) {
                            return com.glyphix.mas.common.a.a(jSONObject);
                        }
                        new Thread(new a(jSONObject)).start();
                        return "{\"code\": 200, \"msg\": \"\"}";
                    case "rpc.log":
                        GxMessage.execResolver("gx_rpc_log", str);
                        return "{\"code\": 200, \"msg\": \"\"}";
                    case "rpc.message":
                        int iExecResolver = GxMessage.execResolver(jSONObject.getString("topic"), jSONObject.getString("data"));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("code", 200);
                        jSONObject2.put("msg", "");
                        jSONObject2.put("data", iExecResolver);
                        return jSONObject2.toString();
                    case "sdk.info":
                        return GxMas.c();
                    case "nativeLog":
                        GxMas.d.submit(new RunnableC0217b(jSONObject));
                        return "{\"code\": 200, \"msg\": \"\"}";
                    case "queryNetwork":
                        com.glyphix.mas.common.c.h.c();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("code", 200);
                        jSONObject3.put("msg", "");
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("netStatus", com.glyphix.mas.common.c.h.b());
                        jSONObject3.put("data", jSONObject4.toString());
                        return jSONObject3.toString();
                    case "mas.extra":
                        return GxMas.f(jSONObject);
                    default:
                        return "{\"code\": 1101, \"msg\": \"unknown request type\"}";
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return "{\"code\": 1100, \"msg\": \"unknown error\"}";
            }
        }
    }

    public class c implements GxMessage.b {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:13:0x002f  */
        public static /* synthetic */ void a(String str) {
            byte b;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("module");
                int iHashCode = string.hashCode();
                if (iHashCode != -1109843021) {
                    if (iHashCode == 1207466352 && string.equals("isInstalled")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (string.equals("launch")) {
                    b = 1;
                } else {
                    b = -1;
                }
                if (b == 0) {
                    GxMas.e(jSONObject);
                } else {
                    if (b != 1) {
                        return;
                    }
                    GxMas.g(jSONObject);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.glyphix.mas.api.GxMessage.b
        public void c(final String str) {
            new Thread(new Runnable() { // from class: com.glyphix.mas.j
                @Override // java.lang.Runnable
                public final void run() {
                    GxMas.c.a(str);
                }
            }).start();
        }
    }

    public class d implements GlyphixResolver {
        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            return 1;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            return 1;
        }
    }

    static {
        System.loadLibrary("glyphix-mas-android");
        setLpcCallback(new a());
        setRpcNativeCallback(new b());
        GxMessage.subscribe("check.app", new c());
    }

    public static native boolean abortTask(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(JSONObject jSONObject) throws JSONException {
        boolean zA = a(jSONObject.getString("appId"));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(JsCallJavaMessageHandler.PARAM_PACKAGE_INSTALLED, zA);
        GxMessage.send(jSONObject.getString("receiver"), jSONObject2.toString(), "", new d());
    }

    public static native void enableLogNative(int i, int i2);

    public static native boolean execLpc(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(JSONObject jSONObject) {
        MasExtraFeatureExecutor masExtraFeatureExecutor = f2307c;
        return (masExtraFeatureExecutor != null && masExtraFeatureExecutor.exec(jSONObject)) ? "{\"code\": 200, \"msg\": \"unknown request type\"}" : "{\"code\": 500, \"msg\": \"unknown request type\"}";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(JSONObject jSONObject) {
        try {
            if (b == null) {
                return;
            }
            Intent launchIntentForPackage = b.getPackageManager().getLaunchIntentForPackage(jSONObject.getString("appId"));
            if (launchIntentForPackage != null) {
                launchIntentForPackage.addFlags(268435456);
                b.startActivity(launchIntentForPackage);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static native int getRemoteMasVersion();

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("level");
            String string = jSONObject.getString("buf");
            if (i == 0) {
                com.glyphix.mas.utils.b.c().a(string);
            } else if (i == 2) {
                com.glyphix.mas.utils.b.c().e(string);
            } else if (i != 3) {
                com.glyphix.mas.utils.b.c().c(string);
            } else {
                com.glyphix.mas.utils.b.c().b(string);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static native void readData(byte[] bArr);

    private static native void setLpcCallback(MasCallback masCallback);

    private static native void setRpcNativeCallback(RpcNativeCallnack rpcNativeCallnack);

    public static native void setWriteCallback(WriteCallback writeCallback);

    public static native int startMas(int i, String str, String str2, String str3, String str4, String str5);

    public static native void uninit();

    /* JADX INFO: Access modifiers changed from: private */
    public static String c() throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        Context context = b;
        if (context == null) {
            jSONObject.put("code", 500);
            str = "msg";
            str2 = "context is null";
        } else {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            jSONObject.put("code", 200);
            jSONObject.put("id", string);
            jSONObject.put("manu", Build.MANUFACTURER);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("sdkBuildTime", com.glyphix.mas.a.d);
            jSONObject.put("sdlVersion", com.glyphix.mas.a.f2309e);
            str = "sdkHash";
            str2 = com.glyphix.mas.a.g;
        }
        jSONObject.put(str, str2);
        return jSONObject.toString();
    }

    public static boolean a(String str) {
        try {
            Context context = b;
            if (context == null) {
                return false;
            }
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Context context) {
        b = context;
    }
}
