package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class lc3 {
    public final lc3 a;
    public final Class<?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<ResolvedRecursiveType> f13626c;

    public lc3(Class<?> cls) {
        this(null, cls);
    }

    public void a(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.f13626c == null) {
            this.f13626c = new ArrayList<>();
        }
        this.f13626c.add(resolvedRecursiveType);
    }

    public lc3 b(Class<?> cls) {
        return new lc3(this, cls);
    }

    public lc3 c(Class<?> cls) {
        if (this.b == cls) {
            return this;
        }
        do {
            this = this.a;
            if (this == null) {
                return null;
            }
        } while (this.b != cls);
        return this;
    }

    public void d(JavaType javaType) {
        ArrayList<ResolvedRecursiveType> arrayList = this.f13626c;
        if (arrayList != null) {
            Iterator<ResolvedRecursiveType> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().setReference(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this.f13626c;
        sb.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb.append(')');
        while (this != null) {
            sb.append(StringUtil.SPACE);
            sb.append(this.b.getName());
            this = this.a;
        }
        sb.append(']');
        return sb.toString();
    }

    public lc3(lc3 lc3Var, Class<?> cls) {
        this.a = lc3Var;
        this.b = cls;
    }
}
