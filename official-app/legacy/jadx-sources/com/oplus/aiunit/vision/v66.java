package com.oplus.aiunit.vision;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class v66 {
    public final Object a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17731c;
    public HashSet<String> d;

    public v66(Object obj) {
        this.a = obj;
    }

    public static v66 e(JsonGenerator jsonGenerator) {
        return new v66(jsonGenerator);
    }

    public static v66 f(JsonParser jsonParser) {
        return new v66(jsonParser);
    }

    public v66 a() {
        return new v66(this.a);
    }

    public Object b() {
        return this.a;
    }

    public boolean c(String str) throws JsonParseException {
        String str2 = this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f17731c;
        if (str3 == null) {
            this.f17731c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.d == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.d = hashSet;
            hashSet.add(this.b);
            this.d.add(this.f17731c);
        }
        return !this.d.add(str);
    }

    public void d() {
        this.b = null;
        this.f17731c = null;
        this.d = null;
    }
}
