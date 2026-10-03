package com.oplus.aiunit.vision;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class at3 {
    public final List<mck> a = new ArrayList();

    public void a(mck mckVar) {
        this.a.add(mckVar);
    }

    public void b(Path path) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            frk.b(path, this.a.get(size));
        }
    }
}
