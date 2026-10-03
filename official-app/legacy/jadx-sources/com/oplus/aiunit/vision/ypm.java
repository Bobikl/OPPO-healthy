package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class ypm implements Iterator {
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19103j;
    public final /* synthetic */ com.xingin.xhssharesdk.a.e k;

    public ypm(com.xingin.xhssharesdk.a.e eVar) {
        this.k = eVar;
        this.f19103j = eVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.f19103j;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            com.xingin.xhssharesdk.a.e eVar = this.k;
            int i = this.i;
            this.i = i + 1;
            return Byte.valueOf(eVar.a(i));
        } catch (IndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
