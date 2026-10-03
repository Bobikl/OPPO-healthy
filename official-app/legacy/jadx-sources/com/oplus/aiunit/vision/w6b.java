package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class w6b {
    public static String a(f2a f2aVar) {
        if (!(f2aVar instanceof v5n)) {
            return f2aVar.a();
        }
        v5n v5nVar = (v5n) f2aVar;
        String str = v5nVar.j().q() + "@" + v5nVar.h() + "@" + v5nVar.g() + "@" + v5nVar.e();
        if (v5nVar.b() == null) {
            return str;
        }
        v5n v5nVarB = v5nVar.b();
        return str + "@Def[" + v5nVarB.h() + "@" + v5nVarB.g() + "@" + v5nVarB.e() + "]";
    }

    public static String b(Collection<? extends f2a> collection) {
        if (collection == null || collection.isEmpty()) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder("[");
        Iterator<? extends f2a> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(a(it.next()));
            sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
