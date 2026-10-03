package org.json.alipay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes11.dex */
public class a {
    public ArrayList a;

    public a() {
        this.a = new ArrayList();
    }

    public final int a() {
        return this.a.size();
    }

    public String toString() {
        try {
            return "[" + a(",") + ']';
        } catch (Exception unused) {
            return null;
        }
    }

    public a(Object obj) throws JSONException {
        this();
        if (!obj.getClass().isArray()) {
            throw new JSONException("JSONArray initial value should be a string or collection or array.");
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.a.add(Array.get(obj, i));
        }
    }

    public final Object a(int i) throws JSONException {
        Object obj = (i < 0 || i >= this.a.size()) ? null : this.a.get(i);
        if (obj != null) {
            return obj;
        }
        throw new JSONException("JSONArray[" + i + "] not found.");
    }

    public a(String str) {
        this(new c(str));
    }

    private String a(String str) {
        int size = this.a.size();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuffer.append(str);
            }
            stringBuffer.append(b.a(this.a.get(i)));
        }
        return stringBuffer.toString();
    }

    public a(Collection collection) {
        this.a = collection == null ? new ArrayList() : new ArrayList(collection);
    }

    public a(c cVar) throws JSONException {
        char c2;
        ArrayList arrayList;
        Object objD;
        this();
        char c3 = cVar.c();
        if (c3 == '[') {
            c2 = ']';
        } else {
            if (c3 != '(') {
                throw cVar.a("A JSONArray text must start with '['");
            }
            c2 = ')';
        }
        if (cVar.c() == ']') {
            return;
        }
        do {
            cVar.a();
            char c4 = cVar.c();
            cVar.a();
            if (c4 == ',') {
                arrayList = this.a;
                objD = null;
            } else {
                arrayList = this.a;
                objD = cVar.d();
            }
            arrayList.add(objD);
            char c5 = cVar.c();
            if (c5 != ')') {
                if (c5 != ',' && c5 != ';') {
                    if (c5 != ']') {
                        throw cVar.a("Expected a ',' or ']'");
                    }
                }
            }
            if (c2 == c5) {
                return;
            }
            throw cVar.a("Expected a '" + new Character(c2) + "'");
        } while (cVar.c() != ']');
    }
}
