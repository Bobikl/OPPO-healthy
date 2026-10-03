package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class s4n implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s4n f16471c = new s4n();
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16472j;

    public static s4n a() {
        try {
            s4n s4nVar = f16471c;
            xum.i.h.getClass();
            s4nVar.i = "mobile";
            xum.i.h.getClass();
            s4nVar.f16472j = "";
            return (s4n) s4nVar.clone();
        } catch (CloneNotSupportedException unused) {
            return f16471c;
        }
    }

    public final String toString() {
        return "TrackerEventNetwork{networkType='" + this.i + "', ispName='" + this.f16472j + "'}";
    }
}
