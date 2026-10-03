package com.glyphix.mas.service;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.glyphix.mas.api.GxMessage;
import com.glyphix.mas.callback.GlyphixResolver;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {
    protected Map<String, StatusBarNotification> a = new HashMap();
    protected boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f2334c;
    protected Context d;

    public class a implements GlyphixResolver {
        public a() {
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            return 0;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.glyphix.mas.service.b$b, reason: collision with other inner class name */
    public class C0220b implements GlyphixResolver {
        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onFailed(JSONObject jSONObject) {
            return 0;
        }

        @Override // com.glyphix.mas.callback.GlyphixResolver
        public Integer onSuccess(JSONObject jSONObject) {
            return 0;
        }
    }

    public b(Context context) {
        this.d = context;
    }

    public String a() {
        return this.f2334c;
    }

    public abstract void a(JSONObject jSONObject);

    public abstract boolean a(StatusBarNotification statusBarNotification);

    public static void a(com.glyphix.mas.service.a aVar, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", aVar.b());
            jSONObject.put("msg", str);
            GxMessage.send(str2, jSONObject.toString(), "", new C0220b());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 200);
            jSONObject.put("msg", str2);
            GxMessage.send(str, jSONObject.toString(), "", new a());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(boolean z, String str) {
        this.b = z;
        this.f2334c = str;
    }
}
