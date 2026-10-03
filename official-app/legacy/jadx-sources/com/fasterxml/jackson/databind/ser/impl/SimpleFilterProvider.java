package com.fasterxml.jackson.databind.ser.impl;

import com.oplus.aiunit.vision.aze;
import com.oplus.aiunit.vision.ee7;
import com.oplus.aiunit.vision.sc1;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class SimpleFilterProvider extends ee7 implements Serializable {
    private static final long serialVersionUID = 1;
    protected boolean _cfgFailOnUnknownId;
    protected aze _defaultFilter;
    protected final Map<String, aze> _filtersById;

    public SimpleFilterProvider() {
        this(new HashMap());
    }

    private static final Map<String, aze> _convert(Map<String, ?> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof aze) {
                map2.put(entry.getKey(), (aze) value);
            } else {
                if (!(value instanceof sc1)) {
                    throw new IllegalArgumentException("Unrecognized filter type (" + value.getClass().getName() + ")");
                }
                map2.put(entry.getKey(), _convert((sc1) value));
            }
        }
        return map2;
    }

    @Deprecated
    public SimpleFilterProvider addFilter(String str, sc1 sc1Var) {
        this._filtersById.put(str, _convert(sc1Var));
        return this;
    }

    @Override // com.oplus.aiunit.vision.ee7
    @Deprecated
    public sc1 findFilter(Object obj) {
        throw new UnsupportedOperationException("Access to deprecated filters not supported");
    }

    @Override // com.oplus.aiunit.vision.ee7
    public aze findPropertyFilter(Object obj, Object obj2) {
        aze azeVar = this._filtersById.get(obj);
        if (azeVar != null || (azeVar = this._defaultFilter) != null || !this._cfgFailOnUnknownId) {
            return azeVar;
        }
        throw new IllegalArgumentException("No filter configured with id '" + obj + "' (type " + obj.getClass().getName() + ")");
    }

    public aze getDefaultFilter() {
        return this._defaultFilter;
    }

    public aze removeFilter(String str) {
        return this._filtersById.remove(str);
    }

    @Deprecated
    public SimpleFilterProvider setDefaultFilter(sc1 sc1Var) {
        this._defaultFilter = SimpleBeanPropertyFilter.from(sc1Var);
        return this;
    }

    public SimpleFilterProvider setFailOnUnknownId(boolean z) {
        this._cfgFailOnUnknownId = z;
        return this;
    }

    public boolean willFailOnUnknownId() {
        return this._cfgFailOnUnknownId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleFilterProvider(Map<String, ?> map) {
        this._cfgFailOnUnknownId = true;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof aze)) {
                this._filtersById = _convert(map);
                return;
            }
        }
        this._filtersById = map;
    }

    public SimpleFilterProvider addFilter(String str, aze azeVar) {
        this._filtersById.put(str, azeVar);
        return this;
    }

    public SimpleFilterProvider setDefaultFilter(aze azeVar) {
        this._defaultFilter = azeVar;
        return this;
    }

    public SimpleFilterProvider addFilter(String str, SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._filtersById.put(str, simpleBeanPropertyFilter);
        return this;
    }

    public SimpleFilterProvider setDefaultFilter(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._defaultFilter = simpleBeanPropertyFilter;
        return this;
    }

    private static final aze _convert(sc1 sc1Var) {
        return SimpleBeanPropertyFilter.from(sc1Var);
    }
}
