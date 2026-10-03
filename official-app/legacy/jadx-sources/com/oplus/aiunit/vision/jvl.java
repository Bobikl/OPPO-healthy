package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes11.dex */
public class jvl<T> {
    public final a6<T, ?> a;
    public final List<kvl> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13048c;

    public jvl(a6<T, ?> a6Var, String str) {
        this.a = a6Var;
        this.f13048c = str;
    }

    public void a(kvl kvlVar, kvl... kvlVarArr) {
        c(kvlVar);
        this.b.add(kvlVar);
        for (kvl kvlVar2 : kvlVarArr) {
            c(kvlVar2);
            this.b.add(kvlVar2);
        }
    }

    public void b(StringBuilder sb, String str, List<Object> list) {
        ListIterator<kvl> listIterator = this.b.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(" AND ");
            }
            kvl next = listIterator.next();
            next.a(sb, str);
            next.b(list);
        }
    }

    public void c(kvl kvlVar) {
        if (kvlVar instanceof kvl.b) {
            d(((kvl.b) kvlVar).d);
        }
    }

    public void d(yye yyeVar) {
        a6<T, ?> a6Var = this.a;
        if (a6Var != null) {
            boolean z = false;
            for (yye yyeVar2 : a6Var.getProperties()) {
                if (yyeVar == yyeVar2) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return;
            }
            throw new DaoException("Property '" + yyeVar.f19198c + "' is not part of " + this.a);
        }
    }

    public boolean e() {
        return this.b.isEmpty();
    }
}
