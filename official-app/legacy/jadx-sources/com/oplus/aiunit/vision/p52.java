package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes11.dex */
public final class p52 {

    public static class a {
        public int a;
        public af9 b;

        public a(int i, af9 af9Var) {
            this.a = i;
            this.b = af9Var;
        }
    }

    public static float a(Stack<a> stack, af9 af9Var, float f) {
        LinkedList<t22> linkedList = af9Var.i;
        float[] fArr = new float[linkedList.size() + 1];
        int i = 0;
        fArr[0] = 0.0f;
        while (i < linkedList.size()) {
            t22 t22Var = linkedList.get(i);
            int i2 = i + 1;
            float f2 = fArr[i] + t22Var.d;
            fArr[i2] = f2;
            if (f2 > f) {
                int iB = b(af9Var, i);
                if (t22Var instanceof af9) {
                    Stack stack2 = new Stack();
                    float fA = a(stack2, (af9) t22Var, f - fArr[i]);
                    if (fA != t22Var.d && (fArr[i] + fA <= f || iB == -1)) {
                        stack.push(new a(i - 1, af9Var));
                        stack.addAll(stack2);
                        return fArr[i] + fA;
                    }
                }
                if (iB != -1) {
                    stack.push(new a(iB, af9Var));
                    return fArr[iB];
                }
            }
            i = i2;
        }
        return af9Var.d;
    }

    public static int b(af9 af9Var, int i) {
        List<Integer> list = af9Var.f9335n;
        if (list == null) {
            return -1;
        }
        int i2 = 0;
        if (list.size() == 1 && af9Var.f9335n.get(0).intValue() <= i) {
            return af9Var.f9335n.get(0).intValue();
        }
        while (i2 < af9Var.f9335n.size()) {
            if (af9Var.f9335n.get(i2).intValue() > i) {
                if (i2 == 0) {
                    return -1;
                }
                return af9Var.f9335n.get(i2 - 1).intValue();
            }
            i2++;
        }
        return af9Var.f9335n.get(i2 - 1).intValue();
    }

    public static t22 c(t22 t22Var, float f, float f2) {
        if (t22Var instanceof af9) {
            return d((af9) t22Var, f, f2);
        }
        return t22Var instanceof tvk ? e((tvk) t22Var, f, f2) : t22Var;
    }

    public static t22 d(af9 af9Var, float f, float f2) {
        tvk tvkVar = new tvk();
        Stack stack = new Stack();
        t22 t22Var = null;
        af9 af9Var2 = af9Var;
        while (af9Var2.d > f && a(stack, af9Var2, f) != af9Var2.d) {
            a aVar = (a) stack.pop();
            af9[] af9VarArrU = aVar.b.u(aVar.a - 1);
            af9 af9Var3 = af9VarArrU[0];
            af9 af9Var4 = af9VarArrU[1];
            while (!stack.isEmpty()) {
                a aVar2 = (a) stack.pop();
                af9[] af9VarArrW = aVar2.b.w(aVar2.a);
                af9VarArrW[0].b(af9Var3);
                af9VarArrW[1].a(0, af9Var4);
                af9Var3 = af9VarArrW[0];
                af9Var4 = af9VarArrW[1];
            }
            tvkVar.r(af9Var3, f2);
            t22Var = af9Var4;
            af9Var2 = af9Var4;
        }
        if (t22Var == null) {
            return af9Var2;
        }
        tvkVar.r(t22Var, f2);
        return tvkVar;
    }

    public static t22 e(tvk tvkVar, float f, float f2) {
        tvk tvkVar2 = new tvk();
        Iterator<t22> it = tvkVar.i.iterator();
        while (it.hasNext()) {
            tvkVar2.b(c(it.next(), f, f2));
        }
        return tvkVar2;
    }
}
