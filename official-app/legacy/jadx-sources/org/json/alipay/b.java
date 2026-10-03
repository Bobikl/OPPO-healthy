package org.json.alipay;

import com.oplus.aiunit.vision.dj8;
import com.oplus.aiunit.vision.n04;
import io.netty.util.internal.StringUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class b {
    public static final Object a = new a(0);
    public Map b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return "null";
        }
    }

    public b() {
        this.b = new HashMap();
    }

    public static void b(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                if (d.isInfinite() || d.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
                return;
            }
            if (obj instanceof Float) {
                Float f = (Float) obj;
                if (f.isInfinite() || f.isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0034. Please report as an issue. */
    public static String c(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 4);
        stringBuffer.append('\"');
        int i = 0;
        char c2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\f') {
                str2 = "\\f";
            } else if (cCharAt != '\r') {
                if (cCharAt == '\"') {
                    stringBuffer.append('\\');
                } else if (cCharAt != '/') {
                    if (cCharAt != '\\') {
                        switch (cCharAt) {
                            case '\b':
                                str2 = "\\b";
                                break;
                            case '\t':
                                str2 = "\\t";
                                break;
                            case '\n':
                                str2 = "\\n";
                                break;
                            default:
                                if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                                    String str3 = dj8.PRODUCT_ID + Integer.toHexString(cCharAt);
                                    str2 = "\\u" + str3.substring(str3.length() - 4);
                                }
                                break;
                        }
                        i++;
                        c2 = cCharAt;
                    } else {
                        stringBuffer.append('\\');
                    }
                } else if (c2 == '<') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(cCharAt);
                i++;
                c2 = cCharAt;
            } else {
                str2 = "\\r";
            }
            stringBuffer.append(str2);
            i++;
            c2 = cCharAt;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    public final Object a(String str) throws JSONException {
        Object obj = str == null ? null : this.b.get(str);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONObject[" + c(str) + "] not found.");
    }

    public String toString() {
        try {
            Iterator itA = a();
            StringBuffer stringBuffer = new StringBuffer(n04.OPEN_BRACE_REGEX);
            while (itA.hasNext()) {
                if (stringBuffer.length() > 1) {
                    stringBuffer.append(StringUtil.COMMA);
                }
                Object next = itA.next();
                stringBuffer.append(c(next.toString()));
                stringBuffer.append(':');
                stringBuffer.append(a(this.b.get(next)));
            }
            stringBuffer.append('}');
            return stringBuffer.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public b(String str) {
        this(new c(str));
    }

    public static String a(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (!(obj instanceof Number)) {
            if ((obj instanceof Boolean) || (obj instanceof b) || (obj instanceof org.json.alipay.a)) {
                return obj.toString();
            }
            if (obj instanceof Map) {
                return new b((Map) obj).toString();
            }
            if (obj instanceof Collection) {
                return new org.json.alipay.a((Collection) obj).toString();
            }
            return obj.getClass().isArray() ? new org.json.alipay.a(obj).toString() : c(obj.toString());
        }
        Number number = (Number) obj;
        b(number);
        String string = number.toString();
        if (string.indexOf(46) <= 0 || string.indexOf(101) >= 0 || string.indexOf(69) >= 0) {
            return string;
        }
        while (string.endsWith("0")) {
            string = string.substring(0, string.length() - 1);
        }
        return string.endsWith(".") ? string.substring(0, string.length() - 1) : string;
    }

    public final boolean b(String str) {
        return this.b.containsKey(str);
    }

    public b(Map map) {
        this.b = map == null ? new HashMap() : map;
    }

    public final Iterator a() {
        return this.b.keySet().iterator();
    }

    public b(c cVar) throws JSONException {
        this();
        if (cVar.c() != '{') {
            throw cVar.a("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c2 = cVar.c();
            if (c2 == 0) {
                throw cVar.a("A JSONObject text must end with '}'");
            }
            if (c2 == '}') {
                return;
            }
            cVar.a();
            String string = cVar.d().toString();
            char c3 = cVar.c();
            if (c3 == '=') {
                if (cVar.b() != '>') {
                    cVar.a();
                }
            } else if (c3 != ':') {
                throw cVar.a("Expected a ':' after a key");
            }
            Object objD = cVar.d();
            if (string == null) {
                throw new JSONException("Null key.");
            }
            if (objD != null) {
                b(objD);
                this.b.put(string, objD);
            } else {
                this.b.remove(string);
            }
            char c4 = cVar.c();
            if (c4 != ',' && c4 != ';') {
                if (c4 != '}') {
                    throw cVar.a("Expected a ',' or '}'");
                }
                return;
            } else if (cVar.c() == '}') {
                return;
            } else {
                cVar.a();
            }
        }
    }
}
