package com.glyphix.mas.api;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.glyphix.mas.callback.GlyphixResolver;
import com.glyphix.mas.common.b;
import com.glyphix.mas.service.version.InterConnectManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class GxInterConnect {

    public static class a {
        private String a;
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f2310c;

        public a(Context context, String str, String str2) {
            this.a = context.getPackageName();
            this.b = str;
            this.f2310c = str2;
        }

        private void a() {
        }

        public void b(GlyphixResolver glyphixResolver) {
            GxApp.launch(this.b, glyphixResolver);
        }

        public void a(GlyphixResolver glyphixResolver) {
            GxApp.isWearAppInstalled(this.b, glyphixResolver);
        }

        public void b(String str, GlyphixResolver glyphixResolver) {
            GxMessage.send(this.b, str, InterConnectManager.DeviceWearEngineMsgTopic, glyphixResolver);
        }

        public void a(String str, GlyphixResolver glyphixResolver) {
            try {
                File file = new File(str);
                if (!file.exists()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 500);
                    jSONObject.put("msg", "local file is not exist");
                    jSONObject.put("values", "");
                    glyphixResolver.onFailed(jSONObject);
                    return;
                }
                if (!file.isFile()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", 501);
                    jSONObject2.put("msg", "local file is not file, only support send file");
                    jSONObject2.put("values", "");
                    glyphixResolver.onFailed(jSONObject2);
                    return;
                }
                String name = file.getName();
                int iDetachFd = ParcelFileDescriptor.open(file, 268435456).detachFd();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("local_fd", iDetachFd);
                jSONObject3.put("remote", "internal://files/" + name);
                jSONObject3.put("appId", this.b);
                b.a("we_push_file_svc", jSONObject3, "WearEnginePushFile", glyphixResolver);
            } catch (FileNotFoundException | JSONException e2) {
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("code", 1000);
                    jSONObject4.put("msg", "unknown error: " + e2);
                    jSONObject4.put("values", "");
                    glyphixResolver.onFailed(jSONObject4);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }

        public void b() {
            GxMessage.unsubscribe(this.b);
        }

        public void a(GxMessage.b bVar) {
            GxMessage.subscribe(this.b, bVar);
        }
    }

    public static a createConnection(Context context, String str, String str2) {
        Objects.requireNonNull(str, "appId must is not null");
        Objects.requireNonNull(str2);
        return new a(context, str, str2);
    }
}
