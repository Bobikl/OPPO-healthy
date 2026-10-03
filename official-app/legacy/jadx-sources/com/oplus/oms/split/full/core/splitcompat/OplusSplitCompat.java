package com.oplus.oms.split.full.core.splitcompat;

import android.content.Context;
import com.oplus.aiunit.vision.c1n;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.i8i;
import com.oplus.aiunit.vision.sbm;
import com.oplus.aiunit.vision.xrm;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public class OplusSplitCompat {
    public static final AtomicReference<OplusSplitCompat> a = new AtomicReference<>(null);

    public static boolean a() {
        return a.get() != null;
    }

    public static boolean install(Context context) {
        AtomicReference<OplusSplitCompat> atomicReference = a;
        if (!fue.a(atomicReference, null, new OplusSplitCompat())) {
            return true;
        }
        OplusSplitCompat oplusSplitCompat = atomicReference.get();
        i8i.b(new a(c1n.a));
        xrm.b(new sbm(oplusSplitCompat));
        return true;
    }
}
