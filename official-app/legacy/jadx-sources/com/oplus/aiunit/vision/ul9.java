package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.account.AccountUserInfo;
import com.heytap.health.account.VerifyBusinessType;

/* JADX INFO: loaded from: classes15.dex */
public interface ul9 {
    public static final String BROADCAST_LOGIN_SUCCESS = "com.heytap.health.login_success";

    @Deprecated
    public static final String BROADCAST_LOGOUT_AFTER = "com.heytap.usercenter.account_logout";

    @Deprecated
    public static final String BROADCAST_LOGOUT_BEFORE = "com.oppo.usercenter.account_logout";
    public static final String BROADCAST_LOGOUT_SAFE = "oppo.intent.action.usercenter.ACCOUNT_LOGOUT";

    public interface a<T> {
        void callback(T t);
    }

    MutableLiveData<Boolean> a();

    void b();

    String c();

    boolean d();

    void e(Activity activity, String str, a<rn> aVar);

    void f();

    void g();

    LiveData<AccountUserInfo> getAccountInfo();

    lbd<Integer> getAge();

    String getAppId();

    String getAppKey();

    String getDeviceId();

    String getSsoid();

    LiveData<String> getTicket();

    String getToken();

    String getV1Token();

    void h();

    String i();

    void j();

    void k(a<Boolean> aVar);

    void l(a<Integer> aVar);

    void login();

    void m();

    void n(rn9 rn9Var);

    void o(ms9 ms9Var);

    void p(String str);

    void q();

    void r(@NonNull Context context, String str, String str2, @NonNull Handler handler);

    String s();

    String t();

    void u(ms9 ms9Var);

    void v(Activity activity, VerifyBusinessType verifyBusinessType, a<VerifyResult> aVar);

    void w();

    boolean x();
}
