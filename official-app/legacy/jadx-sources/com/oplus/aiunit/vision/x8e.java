package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.u8e;

/* JADX INFO: loaded from: classes13.dex */
public abstract class x8e<D, T extends u8e<D>> extends w8e {
    public T s;

    public abstract boolean n(u8e<?> u8eVar);

    /* JADX WARN: Multi-variable type inference failed */
    public boolean o(u8e<?> u8eVar) {
        if (!n(u8eVar)) {
            return false;
        }
        this.s = u8eVar;
        return true;
    }
}
