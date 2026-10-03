package com.oplus.aiunit.vision;

import com.heytap.health.base.cache.model.DataModel;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes15.dex */
public abstract class h3<REQUEST, RESPONSE> extends g3<REQUEST, RESPONSE> {
    protected static final long CACHE_DURATION_DAY = 86400;

    public long getCacheTime() {
        return CACHE_DURATION_DAY;
    }

    @Override // com.oplus.aiunit.vision.g3
    public t3<RESPONSE> getDataCache() {
        return new js4(getJsonToType(), getDataStorage());
    }

    public u3 getDataStorage() {
        return new bx4();
    }

    public abstract Type getJsonToType();

    @Override // com.oplus.aiunit.vision.g3
    public boolean isUseCache(String str, DataModel<RESPONSE> dataModel) {
        return dataModel != null && System.currentTimeMillis() - dataModel.getTimestamp() < getCacheTime() * 1000;
    }
}
