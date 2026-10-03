package com.oplus.aiunit.vision;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class uhe {
    public List<String> a;

    public uhe(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = copyOnWriteArrayList;
        copyOnWriteArrayList.clear();
        this.a.addAll(fpj.c(str, d14.COMMA_REGEX));
    }

    public boolean a(String str) {
        if (this.a.size() != 0) {
            return this.a.contains(str);
        }
        return false;
    }
}
