package com.heytap.databaseengineservice;

import android.os.IBinder;
import com.heytap.databaseengine.IBinderPool;
import com.oplus.aiunit.vision.cj4;
import com.oplus.aiunit.vision.me8;
import java.util.HashMap;

/* JADX INFO: loaded from: classes15.dex */
public class OIBinderPool extends IBinderPool.Stub {
    private static final String TAG = "OIBinderPool";
    private final HashMap<String, IBinder> binderPool = new HashMap<>();

    private synchronized IBinder getOrDefault(String str, Class<? extends IBinder> cls) {
        try {
            if (!this.binderPool.containsKey(str)) {
                this.binderPool.put(str, cls.newInstance());
            }
        } catch (IllegalAccessException | InstantiationException e2) {
            me8.b(TAG, e2.toString());
            return null;
        }
        return this.binderPool.get(str);
    }

    @Override // com.heytap.databaseengine.IBinderPool
    public IBinder queryBinder(String str) {
        cj4.c(TAG, "queryBinder enter..");
        str.hashCode();
        switch (str) {
            case "IDeviceInfoManager":
                return getOrDefault(str, OIDeviceInfoManager.class);
            case "IUserInfoManager":
                return getOrDefault(str, OIUserInfoManager.class);
            case "IAuthorityManager":
                return getOrDefault(str, OIAuthorityManager.class);
            case "ISportHealthManager":
                return getOrDefault(str, OISportHealthManager.class);
            default:
                return getOrDefault(str, OIHealthManager.class);
        }
    }
}
