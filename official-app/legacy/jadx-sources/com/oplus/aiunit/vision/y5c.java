package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class y5c {
    public final List<Integer> a;

    public y5c(Iterable<Integer> iterable) {
        Integer next;
        if (iterable == null) {
            throw new NullPointerException("grantedQoSLevels");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            arrayList.add(next);
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public List<Integer> a() {
        return this.a;
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "[grantedQoSLevels=" + this.a + ']';
    }
}
