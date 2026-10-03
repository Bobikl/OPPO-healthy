package com.oplus.aiunit.vision;

import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p6<T> {
    public final a6<T, ?> a;
    public final jfa<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15206c;
    public final String[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f15207e = Thread.currentThread();

    public p6(a6<T, ?> a6Var, String str, String[] strArr) {
        this.a = a6Var;
        this.b = new jfa<>(a6Var);
        this.f15206c = str;
        this.d = strArr;
    }

    public static String[] b(Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj != null) {
                strArr[i] = obj.toString();
            } else {
                strArr[i] = null;
            }
        }
        return strArr;
    }

    public void a() {
        if (Thread.currentThread() != this.f15207e) {
            throw new DaoException("Method may be called only in owner thread, use forCurrentThread to get an instance for this thread");
        }
    }
}
