package com.oplus.aiunit.vision;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class wfe {
    public List<String> a;

    public wfe(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        copyOnWriteArrayList.clear();
        this.a.addAll(glj.c(str, ","));
    }

    public boolean a(String str) {
        if (this.a.size() != 0) {
            return this.a.contains(str);
        }
        return false;
    }
}
