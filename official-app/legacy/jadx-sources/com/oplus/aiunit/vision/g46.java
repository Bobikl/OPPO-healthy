package com.oplus.aiunit.vision;

import com.heytap.health.settings.watch.preferences.dragutils.DragItemBean;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class g46 {
    public int a;
    public List<DragItemBean> b;

    public g46() {
    }

    public List<DragItemBean> a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String toString() {
        return "DragItemListResult{mResultCode=" + this.a + ", mDragItemBeans=" + this.b + '}';
    }

    public g46(int i, List<DragItemBean> list) {
        this.a = i;
        this.b = list;
    }
}
