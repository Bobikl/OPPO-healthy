package com.oplus.aiunit.vision;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class zs3 {
    public final List<lck> a = new ArrayList();

    public void a(lck lckVar) {
        this.a.add(lckVar);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            prk.b(path, this.a.get(size));
        }
    }
}
