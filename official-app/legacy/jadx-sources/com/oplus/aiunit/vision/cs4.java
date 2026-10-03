package com.oplus.aiunit.vision;

import java.lang.reflect.Field;
import java.util.ArrayList;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes11.dex */
public final class cs4 implements Cloneable {
    public final wz4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10218j;
    public final yye[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f10219l;
    public final String[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String[] f10220n;
    public final yye o;
    public final boolean p;
    public final anj q;
    public l2a<?, ?> r;

    public cs4(wz4 wz4Var, Class<? extends a6<?, ?>> cls) {
        this.i = wz4Var;
        try {
            this.f10218j = (String) cls.getField("TABLENAME").get(null);
            yye[] yyeVarArrE = e(cls);
            this.k = yyeVarArrE;
            this.f10219l = new String[yyeVarArrE.length];
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            yye yyeVar = null;
            for (int i = 0; i < yyeVarArrE.length; i++) {
                yye yyeVar2 = yyeVarArrE[i];
                String str = yyeVar2.f19199e;
                this.f10219l[i] = str;
                if (yyeVar2.d) {
                    arrayList.add(str);
                    yyeVar = yyeVar2;
                } else {
                    arrayList2.add(str);
                }
            }
            this.f10220n = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            this.m = strArr;
            yye yyeVar3 = strArr.length == 1 ? yyeVar : null;
            this.o = yyeVar3;
            this.q = new anj(wz4Var, this.f10218j, this.f10219l, strArr);
            if (yyeVar3 == null) {
                this.p = false;
            } else {
                Class<?> cls2 = yyeVar3.b;
                this.p = cls2.equals(Long.TYPE) || cls2.equals(Long.class) || cls2.equals(Integer.TYPE) || cls2.equals(Integer.class) || cls2.equals(Short.TYPE) || cls2.equals(Short.class) || cls2.equals(Byte.TYPE) || cls2.equals(Byte.class);
            }
        } catch (Exception e2) {
            throw new DaoException("Could not init DAOConfig", e2);
        }
    }

    public static yye[] e(Class<? extends a6<?, ?>> cls) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException {
        Field[] declaredFields = Class.forName(cls.getName() + "$Properties").getDeclaredFields();
        ArrayList<yye> arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 9) == 9) {
                Object obj = field.get(null);
                if (obj instanceof yye) {
                    arrayList.add((yye) obj);
                }
            }
        }
        yye[] yyeVarArr = new yye[arrayList.size()];
        for (yye yyeVar : arrayList) {
            int i = yyeVar.a;
            if (yyeVarArr[i] != null) {
                throw new DaoException("Duplicate property ordinals");
            }
            yyeVarArr[i] = yyeVar;
        }
        return yyeVarArr;
    }

    public void a() {
        l2a<?, ?> l2aVar = this.r;
        if (l2aVar != null) {
            l2aVar.clear();
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cs4 clone() {
        return new cs4(this);
    }

    public l2a<?, ?> c() {
        return this.r;
    }

    public void d(IdentityScopeType identityScopeType) {
        if (identityScopeType == IdentityScopeType.None) {
            this.r = null;
            return;
        }
        if (identityScopeType != IdentityScopeType.Session) {
            throw new IllegalArgumentException("Unsupported type: " + identityScopeType);
        }
        if (this.p) {
            this.r = new m2a();
        } else {
            this.r = new n2a();
        }
    }

    public cs4(cs4 cs4Var) {
        this.i = cs4Var.i;
        this.f10218j = cs4Var.f10218j;
        this.k = cs4Var.k;
        this.f10219l = cs4Var.f10219l;
        this.m = cs4Var.m;
        this.f10220n = cs4Var.f10220n;
        this.o = cs4Var.o;
        this.q = cs4Var.q;
        this.p = cs4Var.p;
    }
}
