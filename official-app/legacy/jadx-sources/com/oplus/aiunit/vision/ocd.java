package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class ocd<T> extends kbd<T> {
    public final kdd<T> i;

    public ocd(kdd<T> kddVar) {
        this.i = kddVar;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.subscribe(bedVar);
    }
}
