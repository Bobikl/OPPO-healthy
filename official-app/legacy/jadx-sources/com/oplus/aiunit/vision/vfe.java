package com.oplus.aiunit.vision;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class vfe {
    public List<String> a;

    public vfe(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        copyOnWriteArrayList.clear();
        this.a.addAll(hlj.c(str, ","));
    }

    public boolean a(String str) {
        if (this.a.size() != 0) {
            return this.a.contains(str);
        }
        return false;
    }
}
