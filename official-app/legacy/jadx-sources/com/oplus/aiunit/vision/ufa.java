package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ufa implements xfa {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17448j;

    public ufa(int i, int i2) {
        this.i = i;
        this.f17448j = i2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof xfa)) {
            return -1;
        }
        xfa xfaVar = (xfa) obj;
        int start = this.i - xfaVar.getStart();
        return start != 0 ? start : this.f17448j - xfaVar.getEnd();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xfa)) {
            return false;
        }
        xfa xfaVar = (xfa) obj;
        return this.i == xfaVar.getStart() && this.f17448j == xfaVar.getEnd();
    }

    @Override // com.oplus.aiunit.vision.xfa
    public int getEnd() {
        return this.f17448j;
    }

    @Override // com.oplus.aiunit.vision.xfa
    public int getStart() {
        return this.i;
    }

    public int hashCode() {
        return (this.i % 100) + (this.f17448j % 100);
    }

    @Override // com.oplus.aiunit.vision.xfa
    public int size() {
        return (this.f17448j - this.i) + 1;
    }

    public String toString() {
        return this.i + ":" + this.f17448j;
    }
}
