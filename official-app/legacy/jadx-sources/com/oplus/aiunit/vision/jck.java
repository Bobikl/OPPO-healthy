package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes11.dex */
public class jck {
    public kck a;
    public qmi b;

    public static class b {
        public kck a;
        public jck b;

        public b a(String str) {
            this.b.c(str);
            return this;
        }

        public jck b() {
            this.b.e();
            return this.b;
        }

        public b() {
            kck kckVar = new kck();
            this.a = kckVar;
            this.b = new jck(kckVar);
        }
    }

    public static b d() {
        return new b();
    }

    public final void c(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        qmi qmiVarC = this.b;
        for (char c2 : str.toCharArray()) {
            Character chValueOf = Character.valueOf(c2);
            if (this.a.b()) {
                chValueOf = Character.valueOf(Character.toLowerCase(chValueOf.charValue()));
            }
            qmiVarC = qmiVarC.c(chValueOf);
        }
        if (this.a.b()) {
            str = str.toLowerCase();
        }
        qmiVarC.a(str);
    }

    public final void e() {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        for (qmi qmiVar : this.b.f()) {
            qmiVar.k(this.b);
            linkedBlockingDeque.add(qmiVar);
        }
        while (!linkedBlockingDeque.isEmpty()) {
            qmi qmiVar2 = (qmi) linkedBlockingDeque.remove();
            for (Character ch : qmiVar2.g()) {
                qmi qmiVarH = qmiVar2.h(ch);
                linkedBlockingDeque.add(qmiVarH);
                qmi qmiVarE = qmiVar2.e();
                while (qmiVarE.h(ch) == null) {
                    qmiVarE = qmiVarE.e();
                }
                qmi qmiVarH2 = qmiVarE.h(ch);
                qmiVarH.k(qmiVarH2);
                qmiVarH.b(qmiVarH2.d());
            }
        }
    }

    public final qmi f(qmi qmiVar, Character ch) {
        qmi qmiVarH = qmiVar.h(ch);
        while (qmiVarH == null) {
            qmiVar = qmiVar.e();
            qmiVarH = qmiVar.h(ch);
        }
        return qmiVarH;
    }

    public final boolean g(CharSequence charSequence, jl6 jl6Var) {
        if (jl6Var.getStart() == 0 || !Character.isAlphabetic(charSequence.charAt(jl6Var.getStart() - 1))) {
            return jl6Var.getEnd() + 1 != charSequence.length() && Character.isAlphabetic(charSequence.charAt(jl6Var.getEnd() + 1));
        }
        return true;
    }

    public Collection<jl6> h(CharSequence charSequence) {
        m45 m45Var = new m45();
        i(charSequence, m45Var);
        List<jl6> listB = m45Var.b();
        if (this.a.c()) {
            j(charSequence, listB);
        }
        if (this.a.d()) {
            k(charSequence, listB);
        }
        if (!this.a.a()) {
            new wfa(listB).b(listB);
        }
        return listB;
    }

    public void i(CharSequence charSequence, kl6 kl6Var) {
        qmi qmiVarF = this.b;
        for (int i = 0; i < charSequence.length(); i++) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i));
            if (this.a.b()) {
                chValueOf = Character.valueOf(Character.toLowerCase(chValueOf.charValue()));
            }
            qmiVarF = f(qmiVarF, chValueOf);
            if (l(i, qmiVarF, kl6Var) && this.a.e()) {
                return;
            }
        }
    }

    public final void j(CharSequence charSequence, List<jl6> list) {
        ArrayList arrayList = new ArrayList();
        for (jl6 jl6Var : list) {
            if (g(charSequence, jl6Var)) {
                arrayList.add(jl6Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((jl6) it.next());
        }
    }

    public final void k(CharSequence charSequence, List<jl6> list) {
        long length = charSequence.length();
        ArrayList arrayList = new ArrayList();
        for (jl6 jl6Var : list) {
            if ((jl6Var.getStart() != 0 && !Character.isWhitespace(charSequence.charAt(jl6Var.getStart() - 1))) || (jl6Var.getEnd() + 1 != length && !Character.isWhitespace(charSequence.charAt(jl6Var.getEnd() + 1)))) {
                arrayList.add(jl6Var);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((jl6) it.next());
        }
    }

    public final boolean l(int i, qmi qmiVar, kl6 kl6Var) {
        Collection<String> collectionD = qmiVar.d();
        boolean z = false;
        if (collectionD != null && !collectionD.isEmpty()) {
            for (String str : collectionD) {
                kl6Var.a(new jl6((i - str.length()) + 1, i, str));
                z = true;
            }
        }
        return z;
    }

    public jck(kck kckVar) {
        this.a = kckVar;
        this.b = new qmi();
    }
}
