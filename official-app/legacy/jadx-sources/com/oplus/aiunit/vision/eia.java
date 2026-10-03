package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.dia;

/* JADX INFO: loaded from: classes13.dex */
public final class eia<F extends dia> {
    public int a;

    public eia(int i) {
        this.a = i;
    }

    public static <F extends dia> eia<F> a(F[] fArr) {
        if (fArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
        }
        int mask = 0;
        for (F f : fArr) {
            if (f.enabledByDefault()) {
                mask |= f.getMask();
            }
        }
        return new eia<>(mask);
    }

    public boolean b(F f) {
        return (this.a & f.getMask()) != 0;
    }

    public eia<F> c(F f) {
        int mask = f.getMask() | this.a;
        return mask == this.a ? this : new eia<>(mask);
    }
}
