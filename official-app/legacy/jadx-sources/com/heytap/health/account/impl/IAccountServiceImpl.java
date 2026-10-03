package com.heytap.health.account.impl;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.account.IAccountService;
import com.oplus.aiunit.vision.um;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = IAccountService.ROUTER_PATH)
@Deprecated
public class IAccountServiceImpl implements IAccountService {
    @Override // com.heytap.health.base.account.IAccountService
    public void R4() {
        um.c().h();
    }

    @Override // com.heytap.health.base.account.IAccountService
    public String getDeviceId() {
        return um.c().getDeviceId();
    }

    @Override // com.heytap.health.base.account.IAccountService
    public String getToken() {
        return um.c().getToken();
    }

    @Override // com.heytap.health.base.account.IAccountService
    public String i() {
        return um.c().i();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.heytap.health.base.account.IAccountService
    public boolean isLogin() {
        return um.c().x();
    }

    @Override // com.heytap.health.base.account.IAccountService
    public void login() {
        um.c().login();
    }

    @Override // com.heytap.health.base.account.IAccountService
    public void p(String str) {
        um.c().p(str);
    }

    @Override // com.heytap.health.base.account.IAccountService
    public MutableLiveData<Boolean> t6() {
        return um.c().a();
    }

    @Override // com.heytap.health.base.account.IAccountService
    public void w() {
        um.c().w();
    }
}
