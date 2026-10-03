package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b6 {
    protected final Map<Class<? extends a6<?, ?>>, cs4> daoConfigMap = new HashMap();
    protected final wz4 db;
    protected final int schemaVersion;

    public b6(wz4 wz4Var, int i) {
        this.db = wz4Var;
        this.schemaVersion = i;
    }

    public wz4 getDatabase() {
        return this.db;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public abstract c6 newSession();

    public abstract c6 newSession(IdentityScopeType identityScopeType);

    public void registerDaoClass(Class<? extends a6<?, ?>> cls) {
        this.daoConfigMap.put(cls, new cs4(this.db, cls));
    }
}
