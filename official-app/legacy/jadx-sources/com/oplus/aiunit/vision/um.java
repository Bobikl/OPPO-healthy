package com.oplus.aiunit.vision;

import com.heytap.health.account.internal.IAccountInfoChangeService;
import com.heytap.health.account.internal.IInternal;

/* JADX INFO: loaded from: classes15.dex */
public class um {
    public static IInternal a() {
        return (IInternal) x0.d().b(IInternal.ROUTER_PATH).navigation();
    }

    public static IAccountInfoChangeService b() {
        return (IAccountInfoChangeService) x0.d().b(IAccountInfoChangeService.ROUTER_ACCOUNT_CHANGE).navigation();
    }

    public static ul9 c() {
        return ((IInternal) x0.d().b(IInternal.ROUTER_PATH).navigation()).getAccount();
    }

    public static un9 d() {
        return ((IInternal) x0.d().b(IInternal.ROUTER_PATH).navigation()).c9();
    }
}
