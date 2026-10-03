package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ee7 {
    @Deprecated
    public abstract sc1 findFilter(Object obj);

    public aze findPropertyFilter(Object obj, Object obj2) {
        sc1 sc1VarFindFilter = findFilter(obj);
        if (sc1VarFindFilter == null) {
            return null;
        }
        return SimpleBeanPropertyFilter.from(sc1VarFindFilter);
    }
}
