package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class y5n implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y5n f18883c = new y5n();
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18884j;

    public static y5n a() {
        try {
            y5n y5nVar = f18883c;
            y5nVar.i = ((rzm) xum.i.h).a();
            xum.i.h.getClass();
            y5nVar.f18884j = "";
            return (y5n) y5nVar.clone();
        } catch (CloneNotSupportedException unused) {
            return f18883c;
        }
    }

    public final String toString() {
        return "TrackerEventUser{userId='" + this.i + "', userGroupId='" + this.f18884j + "'}";
    }
}
