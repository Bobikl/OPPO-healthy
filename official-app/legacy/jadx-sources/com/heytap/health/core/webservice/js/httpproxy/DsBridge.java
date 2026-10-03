package com.heytap.health.core.webservice.js.httpproxy;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.fs3;
import com.oplus.aiunit.vision.pja;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@pja(namespace = "_dsbridge")
@Keep
public class DsBridge {
    private final String TAG = "DsBridge";
    private Map<String, Object> mDSBridgeObjectMap = new HashMap();
    private WebView webView;

    public class a implements fs3<JSONObject> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        public final void c(JSONObject jSONObject, boolean z) {
            try {
                if (this.a != null) {
                    DsBridge.this.webView.evaluateJavascript(String.format("javascript:%s('%s')", this.a, jSONObject == null ? "" : jSONObject.toString()), null);
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.oplus.aiunit.vision.fs3
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(JSONObject jSONObject) {
            c(jSONObject, true);
        }

        @Override // com.oplus.aiunit.vision.fs3
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(JSONObject jSONObject) {
            c(jSONObject, false);
        }
    }

    public DsBridge(WebView webView) {
        this.webView = webView;
    }

    private String[] parseNamespace(String str) {
        String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = str.substring(0, iLastIndexOf);
            str = str.substring(iLastIndexOf + 1);
        } else {
            strSubstring = "";
        }
        return new String[]{strSubstring, str};
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b3 A[Catch: Exception -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d9, blocks: (B:29:0x00b3, B:32:0x00c6), top: B:41:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6 A[Catch: Exception -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d9, blocks: (B:29:0x00b3, B:32:0x00c6), top: B:41:0x00b1 }] */
    @JavascriptInterface
    public String call(String str, String str2) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("call---methodName: ");
        sb.append(str);
        sb.append(",argStr: ");
        sb.append(str2);
        String[] namespace = parseNamespace(str.trim());
        String str3 = namespace[1];
        Object obj = this.mDSBridgeObjectMap.get(namespace[0]);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", -1);
        } catch (JSONException unused) {
        }
        if (obj == null) {
            return jSONObject.toString();
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str2);
            Method method = null;
            String string = jSONObject2.has("_dscbstub") ? jSONObject2.getString("_dscbstub") : null;
            Object obj2 = jSONObject2.has("data") ? jSONObject2.get("data") : null;
            Class<?> cls = obj.getClass();
            try {
                try {
                    method = cls.getMethod(str3, JSONObject.class, fs3.class);
                    z = true;
                } catch (Exception e2) {
                    a7b.b("DsBridge", "call e:" + e2);
                    z = false;
                }
            } catch (Exception unused2) {
                method = cls.getMethod(str3, Object.class);
                z = false;
                if (method == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Not find method \"");
                    sb2.append(str3);
                    sb2.append("\" implementation! please check if the  signature or namespace of the method is right ");
                    return jSONObject.toString();
                }
                method.setAccessible(true);
                try {
                    if (z) {
                        method.invoke(obj, obj2, new a(string));
                        return jSONObject.toString();
                    }
                    Object objInvoke = method.invoke(obj, obj2);
                    jSONObject.put("code", 0);
                    jSONObject.put("data", objInvoke);
                    return jSONObject.toString();
                } catch (Exception unused3) {
                    String.format("Call failed：The parameter of \"%s\" in Java is invalid.", str3);
                    return jSONObject.toString();
                }
            }
            if (method == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Not find method \"");
                sb3.append(str3);
                sb3.append("\" implementation! please check if the  signature or namespace of the method is right ");
                return jSONObject.toString();
            }
            method.setAccessible(true);
            if (z) {
                method.invoke(obj, obj2, new a(string));
                return jSONObject.toString();
            }
            Object objInvoke2 = method.invoke(obj, obj2);
            jSONObject.put("code", 0);
            jSONObject.put("data", objInvoke2);
            return jSONObject.toString();
        } catch (JSONException unused4) {
            String.format("The argument of \"%s\" must be a JSON object string!", str3);
            return jSONObject.toString();
        }
    }

    public Map<String, Object> getDSBridgeObjectMap() {
        return this.mDSBridgeObjectMap;
    }
}
