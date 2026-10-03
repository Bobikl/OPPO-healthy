package com.heytap.health.base.account;

import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public interface IAccountService extends IProvider {
    public static final String ROUTER_PATH = "/account_impl/IAccountService";

    void R4();

    String getDeviceId();

    String getToken();

    String i();

    boolean isLogin();

    void login();

    void p(String str);

    MutableLiveData<Boolean> t6();

    void w();
}
