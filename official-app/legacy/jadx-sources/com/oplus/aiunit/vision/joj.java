package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class joj implements bwa {
    public final Set<boj<?>> i = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.i.clear();
    }

    @NonNull
    public List<boj<?>> b() {
        return uqk.k(this.i);
    }

    public void c(@NonNull boj<?> bojVar) {
        this.i.add(bojVar);
    }

    public void d(@NonNull boj<?> bojVar) {
        this.i.remove(bojVar);
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onDestroy() {
        Iterator it = uqk.k(this.i).iterator();
        while (it.hasNext()) {
            ((boj) it.next()).onDestroy();
        }
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStart() {
        Iterator it = uqk.k(this.i).iterator();
        while (it.hasNext()) {
            ((boj) it.next()).onStart();
        }
    }

    @Override // com.oplus.aiunit.vision.bwa
    public void onStop() {
        Iterator it = uqk.k(this.i).iterator();
        while (it.hasNext()) {
            ((boj) it.next()).onStop();
        }
    }
}
