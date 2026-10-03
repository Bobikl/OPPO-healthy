package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class ihb extends xj0 {
    public static int m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12538l;

    public ihb() {
        StringBuilder sb = new StringBuilder();
        sb.append("mtl");
        int i = m + 1;
        m = i;
        sb.append(i);
        this(sb.toString());
    }

    @Override // com.oplus.aiunit.vision.xj0, java.util.Comparator
    public boolean equals(Object obj) {
        return (obj instanceof ihb) && (obj == this || (((ihb) obj).f12538l.equals(this.f12538l) && super.equals(obj)));
    }

    @Override // com.oplus.aiunit.vision.xj0
    public int hashCode() {
        return super.hashCode() + (this.f12538l.hashCode() * 3);
    }

    public ihb(String str) {
        this.f12538l = str;
    }
}
