package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class xrj implements Comparable<xrj> {
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f18737j;
    public final long k;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(xrj xrjVar) {
        long j2 = this.i;
        long j3 = xrjVar.i;
        return j2 == j3 ? Long.compare(this.k, xrjVar.k) : Long.compare(j2, j3);
    }

    public String toString() {
        return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.i), this.f18737j.toString());
    }
}
