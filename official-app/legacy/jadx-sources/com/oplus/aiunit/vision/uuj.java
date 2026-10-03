package com.oplus.aiunit.vision;

import com.heytap.health.core.provider.auth.AuthHandler;
import com.heytap.health.core.provider.auth.AuthorityScopeType;
import com.heytap.health.operations.R$string;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class uuj {
    public static final Set<AuthHandler.Scope> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(new AuthHandler.Scope(AuthorityScopeType.getReadDailyActivity(), "", b78.a().getString(R$string.lib_core_third_share_daily_activity_data)));
        hashSet.add(new AuthHandler.Scope(AuthorityScopeType.getReadHeartRate(), "", b78.a().getString(R$string.lib_core_third_share_heart_rate_data)));
        hashSet.add(new AuthHandler.Scope(AuthorityScopeType.getReadPressure(), "", "压力数据"));
        hashSet.add(new AuthHandler.Scope(AuthorityScopeType.getReadDeviceData(), "", "设备数据"));
        hashSet.add(new AuthHandler.Scope(AuthorityScopeType.getReadProfile(), "", b78.a().getString(R$string.lib_core_third_share_user_profile_data)));
    }

    public static Set<AuthHandler.Scope> a() {
        return a;
    }
}
