package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class bcd<T> extends n6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p14<? super cv5> f9675j;
    public final eo k;

    public bcd(kbd<T> kbdVar, p14<? super cv5> p14Var, eo eoVar) {
        super(kbdVar);
        this.f9675j = p14Var;
        this.k = eoVar;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.subscribe(new iv5(bedVar, this.f9675j, this.k));
    }
}
