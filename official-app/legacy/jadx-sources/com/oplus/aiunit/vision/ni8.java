package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.NonNull;
import com.oplus.nearx.track.internal.storage.db.common.entity.AppConfig;
import io.netty.util.internal.StringUtil;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ni8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<String> f14526c;
    public final bi8 a;
    public final LruCache<String, Long> b = new LruCache<>(10);

    public class a implements Callable<Long> {
        public final /* synthetic */ String i;

        public a(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            return Long.valueOf(ni8.this.a.c(this.i));
        }
    }

    static {
        HashSet hashSet = new HashSet(10);
        f14526c = hashSet;
        hashSet.add("access");
        hashSet.add("app_id");
        hashSet.add("app_version");
        hashSet.add("app_version_code");
        hashSet.add("client_id");
        hashSet.add("user_id");
        hashSet.add("custom_client_id");
        hashSet.add("event_access");
        hashSet.add(AppConfig.CUSTOM_HEAD);
        hashSet.add("usertoken");
    }

    public ni8(bi8 bi8Var) {
        this.a = bi8Var;
    }

    public static void b(StringBuilder sb, JSONArray jSONArray) {
        if (sb == null) {
            return;
        }
        if (jSONArray == null) {
            sb.append("null");
            return;
        }
        sb.append('[');
        for (int i = 0; i < jSONArray.length(); i++) {
            if (i > 0) {
                sb.append(StringUtil.COMMA);
            }
            d(sb, jSONArray.opt(i));
        }
        sb.append(']');
    }

    public static void c(StringBuilder sb, JSONObject jSONObject) {
        if (sb == null) {
            return;
        }
        if (jSONObject == null) {
            sb.append("null");
            return;
        }
        TreeSet<String> treeSet = new TreeSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            treeSet.add(itKeys.next());
        }
        sb.append('{');
        boolean z = true;
        for (String str : treeSet) {
            if (!z) {
                sb.append(StringUtil.COMMA);
            }
            sb.append(JSONObject.quote(str));
            sb.append(':');
            d(sb, jSONObject.opt(str));
            z = false;
        }
        sb.append('}');
    }

    public static void d(StringBuilder sb, Object obj) {
        if (sb == null) {
            return;
        }
        if (obj == null || obj == JSONObject.NULL) {
            sb.append("null");
            return;
        }
        if (obj instanceof JSONObject) {
            c(sb, (JSONObject) obj);
            return;
        }
        if (obj instanceof JSONArray) {
            b(sb, (JSONArray) obj);
            return;
        }
        if (obj instanceof String) {
            sb.append(JSONObject.quote((String) obj));
        } else if ((obj instanceof Number) || (obj instanceof Boolean)) {
            sb.append(String.valueOf(obj));
        } else {
            sb.append(JSONObject.quote(String.valueOf(obj)));
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (f14526c.contains(next)) {
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            String string = jSONObject2.toString();
            if (string.length() > 2) {
                return string;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> it = f14526c.iterator();
            while (it.hasNext()) {
                jSONObject.remove(it.next());
            }
            return i(jSONObject);
        } catch (Exception unused) {
            return str;
        }
    }

    public static <T> T h(Callable<T> callable) {
        try {
            return (T) u56.p(callable).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(256);
        c(sb, jSONObject);
        return sb.toString();
    }

    public void g(@NonNull co3 co3Var) {
        Long l2;
        if (this.a == null || TextUtils.isEmpty(co3Var.d)) {
            if (this.a != null || TextUtils.isEmpty(co3Var.d)) {
                return;
            }
            co3Var.f10170e = co3Var.d;
            return;
        }
        String strF = f(co3Var.d);
        synchronized (this.b) {
            l2 = this.b.get(strF);
        }
        if (l2 == null && (l2 = (Long) h(new a(strF))) != null && l2.longValue() > 0) {
            synchronized (this.b) {
                this.b.put(strF, l2);
            }
        }
        if (l2 == null || l2.longValue() <= 0) {
            co3Var.f10170e = co3Var.d;
        } else {
            co3Var.f10169c = l2.longValue();
            co3Var.f10170e = e(co3Var.d);
        }
    }
}
