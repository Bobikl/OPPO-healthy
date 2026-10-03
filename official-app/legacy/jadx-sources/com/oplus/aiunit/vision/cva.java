package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.netty.util.internal.StringUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class cva implements fj8 {
    public final Map<String, List<bva>> a;
    public volatile Map<String, String> b;

    public static final class a {
        public static final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Map<String, List<bva>> f10255e;
        public boolean a = true;
        public Map<String, List<bva>> b = f10255e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10256c = true;

        static {
            String strB = b();
            d = strB;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strB)) {
                map.put("User-Agent", Collections.singletonList(new b(strB)));
            }
            f10255e = Collections.unmodifiableMap(map);
        }

        @VisibleForTesting
        public static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public cva a() {
            this.a = true;
            return new cva(this.b);
        }
    }

    public static final class b implements bva {

        @NonNull
        public final String a;

        public b(@NonNull String str) {
            this.a = str;
        }

        @Override // com.oplus.aiunit.vision.bva
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }
    }

    public cva(Map<String, List<bva>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    @Override // com.oplus.aiunit.vision.fj8
    public Map<String, String> a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.b;
    }

    @NonNull
    public final String b(@NonNull List<bva> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strA = list.get(i).a();
            if (!TextUtils.isEmpty(strA)) {
                sb.append(strA);
                if (i != list.size() - 1) {
                    sb.append(StringUtil.COMMA);
                }
            }
        }
        return sb.toString();
    }

    public final Map<String, String> c() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<bva>> entry : this.a.entrySet()) {
            String strB = b(entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put(entry.getKey(), strB);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof cva) {
            return this.a.equals(((cva) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.a + '}';
    }
}
