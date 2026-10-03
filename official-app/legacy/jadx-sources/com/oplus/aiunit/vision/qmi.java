package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public class qmi {
    public final int a;
    public final qmi b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Character, qmi> f15851c;
    public qmi d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<String> f15852e;

    public qmi() {
        this(0);
    }

    public void a(String str) {
        if (this.f15852e == null) {
            this.f15852e = new TreeSet();
        }
        this.f15852e.add(str);
    }

    public void b(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public qmi c(Character ch) {
        qmi qmiVarJ = j(ch);
        if (qmiVarJ != null) {
            return qmiVarJ;
        }
        qmi qmiVar = new qmi(this.a + 1);
        this.f15851c.put(ch, qmiVar);
        return qmiVar;
    }

    public Collection<String> d() {
        Set<String> set = this.f15852e;
        return set == null ? Collections.emptyList() : set;
    }

    public qmi e() {
        return this.d;
    }

    public Collection<qmi> f() {
        return this.f15851c.values();
    }

    public Collection<Character> g() {
        return this.f15851c.keySet();
    }

    public qmi h(Character ch) {
        return i(ch, false);
    }

    public final qmi i(Character ch, boolean z) {
        qmi qmiVar;
        qmi qmiVar2 = this.f15851c.get(ch);
        return (z || qmiVar2 != null || (qmiVar = this.b) == null) ? qmiVar2 : qmiVar;
    }

    public qmi j(Character ch) {
        return i(ch, true);
    }

    public void k(qmi qmiVar) {
        this.d = qmiVar;
    }

    public qmi(int i) {
        this.f15851c = new HashMap();
        this.d = null;
        this.f15852e = null;
        this.a = i;
        this.b = i == 0 ? this : null;
    }
}
