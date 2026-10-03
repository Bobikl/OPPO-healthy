package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import com.heytap.health.settings.watch.preferences.dragutils.DragItemBean;

/* JADX INFO: loaded from: classes18.dex */
public class h46 {
    public int a;
    public DragItemBean b;

    public h46(int i) {
        this.a = i;
    }

    public DragItemBean a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof h46)) {
            return super.equals(obj);
        }
        h46 h46Var = (h46) obj;
        if (a() == null && h46Var.a() == null && h46Var.b() == b()) {
            return true;
        }
        return h46Var.b() == b() && a().equals(h46Var.a());
    }

    public String toString() {
        return "DragItemTypeBean{type=" + this.a + ", mDragItemBeans=" + this.b + '}';
    }

    public h46(int i, DragItemBean dragItemBean) {
        this.a = i;
        this.b = dragItemBean;
    }
}
