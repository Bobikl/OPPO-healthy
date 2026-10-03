package com.oplus.aiunit.vision;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class e3g {
    public static volatile j08<Callable<zeg>, zeg> a;
    public static volatile j08<zeg, zeg> b;

    public static <T, R> R a(j08<T, R> j08Var, T t) {
        try {
            return j08Var.apply(t);
        } catch (Throwable th) {
            throw iu6.a(th);
        }
    }

    public static zeg b(j08<Callable<zeg>, zeg> j08Var, Callable<zeg> callable) {
        zeg zegVar = (zeg) a(j08Var, callable);
        if (zegVar != null) {
            return zegVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static zeg c(Callable<zeg> callable) {
        try {
            zeg zegVarCall = callable.call();
            if (zegVarCall != null) {
                return zegVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw iu6.a(th);
        }
    }

    public static zeg d(Callable<zeg> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        j08<Callable<zeg>, zeg> j08Var = a;
        return j08Var == null ? c(callable) : b(j08Var, callable);
    }

    public static zeg e(zeg zegVar) {
        if (zegVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        j08<zeg, zeg> j08Var = b;
        return j08Var == null ? zegVar : (zeg) a(j08Var, zegVar);
    }
}
