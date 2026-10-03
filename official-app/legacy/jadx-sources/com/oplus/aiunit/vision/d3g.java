package com.oplus.aiunit.vision;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class d3g {
    public static volatile d08<Callable<cfg>, cfg> a;
    public static volatile d08<cfg, cfg> b;

    public static <T, R> R a(d08<T, R> d08Var, T t) {
        try {
            return d08Var.apply(t);
        } catch (Throwable th) {
            throw hu6.a(th);
        }
    }

    public static cfg b(d08<Callable<cfg>, cfg> d08Var, Callable<cfg> callable) {
        cfg cfgVar = (cfg) a(d08Var, callable);
        if (cfgVar != null) {
            return cfgVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static cfg c(Callable<cfg> callable) {
        try {
            cfg cfgVarCall = callable.call();
            if (cfgVarCall != null) {
                return cfgVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw hu6.a(th);
        }
    }

    public static cfg d(Callable<cfg> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        d08<Callable<cfg>, cfg> d08Var = a;
        return d08Var == null ? c(callable) : b(d08Var, callable);
    }

    public static cfg e(cfg cfgVar) {
        if (cfgVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        d08<cfg, cfg> d08Var = b;
        return d08Var == null ? cfgVar : (cfg) a(d08Var, cfgVar);
    }
}
