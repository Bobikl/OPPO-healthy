package com.xingin.xhssharesdk.a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends p<Object, Object> {
    public o(int i) {
        super(i, 0);
    }

    @Override // com.xingin.xhssharesdk.a.p
    public final void e() {
        if (!this.f20432l) {
            for (int i = 0; i < this.f20431j.size(); i++) {
                ((d.a) this.f20431j.get(i).getKey()).a();
            }
            Iterator it = (this.k.isEmpty() ? p.a.b : this.k.entrySet()).iterator();
            while (it.hasNext()) {
                ((d.a) ((Map.Entry) it.next()).getKey()).a();
            }
        }
        super.e();
    }

    @Override // com.xingin.xhssharesdk.a.p, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((d.a) obj, obj2);
    }
}
