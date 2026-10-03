package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class sde {
    public String a;
    public String b;

    public final int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public final boolean d(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sde)) {
            return false;
        }
        sde sdeVar = (sde) obj;
        return sdeVar == this || (d(this.a, sdeVar.a) && d(this.b, sdeVar.b));
    }

    public int hashCode() {
        return a(this.a) + (a(this.b) * 31);
    }
}
