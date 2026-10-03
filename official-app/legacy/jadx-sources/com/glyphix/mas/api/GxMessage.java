package com.glyphix.mas.api;

import com.glyphix.mas.callback.GlyphixResolver;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxMessage {
    private static String moduleName = "GxMessage";
    private static ConcurrentHashMap<String, b> resolverMap = new ConcurrentHashMap<>();

    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((b) GxMessage.resolverMap.get(this.a)).c(this.b);
        }
    }

    public interface b {
        void c(String str);
    }

    public static int execResolver(String str, String str2) {
        com.glyphix.mas.utils.b.c().c("TAG", "exec message Resolver: " + str);
        if (resolverMap.containsKey(str)) {
            new Thread(new a(str, str2)).start();
            return 1;
        }
        com.glyphix.mas.utils.b.c().e("not find receiver", str);
        return 0;
    }

    public static void send(String str, String str2, String str3, GlyphixResolver glyphixResolver) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("receiver", str);
            jSONObject.put("msg", str2);
            jSONObject.put("topic", str3);
            com.glyphix.mas.common.b.a("send_message", jSONObject, moduleName, glyphixResolver);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void subscribe(String str, b bVar) {
        resolverMap.put(str, bVar);
    }

    public static void unsubscribe(String str) {
        resolverMap.remove(str);
    }
}
