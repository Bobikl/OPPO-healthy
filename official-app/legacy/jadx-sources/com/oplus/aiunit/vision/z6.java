package com.oplus.aiunit.vision;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z6 implements y4m {
    public static Hashtable e(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Object objNextElement = enumerationKeys.nextElement();
            hashtable2.put(objNextElement, hashtable.get(objNextElement));
        }
        return hashtable2;
    }

    @Override // com.oplus.aiunit.vision.y4m
    public boolean b(x4m x4mVar, x4m x4mVar2) {
        u8f[] u8fVarArrI = x4mVar.i();
        u8f[] u8fVarArrI2 = x4mVar2.i();
        if (u8fVarArrI.length != u8fVarArrI2.length) {
            return false;
        }
        boolean z = (u8fVarArrI[0].f() == null || u8fVarArrI2[0].f() == null) ? false : !u8fVarArrI[0].f().g().equals(u8fVarArrI2[0].f().g());
        for (int i = 0; i != u8fVarArrI.length; i++) {
            if (!f(z, u8fVarArrI[i], u8fVarArrI2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.oplus.aiunit.vision.y4m
    public int c(x4m x4mVar) {
        u8f[] u8fVarArrI = x4mVar.i();
        int iHashCode = 0;
        for (int i = 0; i != u8fVarArrI.length; i++) {
            if (u8fVarArrI[i].i()) {
                wj0[] wj0VarArrH = u8fVarArrI[i].h();
                for (int i2 = 0; i2 != wj0VarArrH.length; i2++) {
                    iHashCode = (iHashCode ^ wj0VarArrH[i2].g().hashCode()) ^ d(wj0VarArrH[i2].h());
                }
            } else {
                iHashCode = (iHashCode ^ u8fVarArrI[i].f().g().hashCode()) ^ d(u8fVarArrI[i].f().h());
            }
        }
        return iHashCode;
    }

    public final int d(f1 f1Var) {
        return up9.e(up9.i(f1Var)).hashCode();
    }

    public final boolean f(boolean z, u8f u8fVar, u8f[] u8fVarArr) {
        if (z) {
            for (int length = u8fVarArr.length - 1; length >= 0; length--) {
                u8f u8fVar2 = u8fVarArr[length];
                if (u8fVar2 != null && g(u8fVar, u8fVar2)) {
                    u8fVarArr[length] = null;
                    return true;
                }
            }
        } else {
            for (int i = 0; i != u8fVarArr.length; i++) {
                u8f u8fVar3 = u8fVarArr[i];
                if (u8fVar3 != null && g(u8fVar, u8fVar3)) {
                    u8fVarArr[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean g(u8f u8fVar, u8f u8fVar2) {
        return up9.g(u8fVar, u8fVar2);
    }
}
