package com.oplus.drs.core.monitor;

/* JADX INFO: loaded from: classes6.dex */
public interface IMonitor {

    public enum RestrictionLevel {
        LOW,
        MID,
        HIGH
    }

    public interface a {
        void a(RestrictionLevel restrictionLevel);
    }

    default RestrictionLevel a() {
        return b();
    }

    RestrictionLevel b();

    default String c() {
        return "level=" + b();
    }
}
