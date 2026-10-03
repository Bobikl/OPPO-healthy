package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public abstract class zla {
    public static final int TYPE_ARRAY = 1;
    public static final int TYPE_OBJECT = 2;
    public static final int TYPE_ROOT = 0;
    public int a;
    public int b;

    public zla() {
    }

    public zla(zla zlaVar) {
        this.a = zlaVar.a;
        this.b = zlaVar.b;
    }

    public final int a() {
        int i = this.b;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract String b();

    public abstract Object c();

    public final int d() {
        return this.b + 1;
    }

    public abstract zla e();

    public final boolean f() {
        return this.a == 1;
    }

    public final boolean g() {
        return this.a == 2;
    }

    public final boolean h() {
        return this.a == 0;
    }

    public abstract void i(Object obj);

    public String j() {
        int i = this.a;
        if (i == 0) {
            return "root";
        }
        if (i != 1) {
            return i != 2 ? "?" : "Object";
        }
        return "Array";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.a;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append('{');
            String strB = b();
            if (strB != null) {
                sb.append('\"');
                a83.a(sb, strB);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(a());
            sb.append(']');
        }
        return sb.toString();
    }

    public zla(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
