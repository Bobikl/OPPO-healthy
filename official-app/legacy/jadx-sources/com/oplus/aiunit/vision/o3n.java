package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class o3n implements Cloneable {
    public static final o3n d = new o3n();
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f14761j;
    public int k;

    public static o3n a() {
        try {
            o3n o3nVar = d;
            xum.i.h.getClass();
            o3nVar.i = "";
            xum.i.h.getClass();
            o3nVar.f14761j = "";
            xum.i.h.getClass();
            o3nVar.k = 1;
            return (o3n) o3nVar.clone();
        } catch (CloneNotSupportedException unused) {
            return d;
        }
    }

    public final String toString() {
        return "TrackerEventEnv{sessionId='" + this.i + "', launchId='" + this.f14761j + "', appMode=" + oim.b(this.k) + '}';
    }
}
