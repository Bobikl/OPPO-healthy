package com.heytap.usercenter.accountsdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.platform.usercenter.basic.provider.MspOpenIdProvider;
import com.platform.usercenter.basic.provider.OpenIdBean;
import com.platform.usercenter.basic.provider.OpenIdFactory;
import com.platform.usercenter.tools.log.UCLogUtil;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"StaticFieldLeak"})
class b implements Application.ActivityLifecycleCallbacks {
    public static final String d = "com.heytap.usercenter.accountsdk.b";
    private final AccountSDKConfig a;
    private final OpenIdFactory b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<String> f8355c = new SparseArray<>();

    public b(AccountSDKConfig accountSDKConfig) {
        this.a = accountSDKConfig;
        this.b = OpenIdFactory.getInstance(accountSDKConfig.mContext);
    }

    private boolean c() {
        return (TextUtils.isEmpty(this.a.guid) && TextUtils.isEmpty(this.a.ouid) && TextUtils.isEmpty(this.a.duid) && TextUtils.isEmpty(this.a.auid) && TextUtils.isEmpty(this.a.apid)) ? false : true;
    }

    public void a() {
        if (c()) {
            OpenIdFactory openIdFactory = this.b;
            AccountSDKConfig accountSDKConfig = this.a;
            openIdFactory.addProvider(MspOpenIdProvider.inject(new OpenIdBean(accountSDKConfig.guid, accountSDKConfig.ouid, accountSDKConfig.duid, accountSDKConfig.auid, accountSDKConfig.apid)));
        }
        Context context = this.a.mContext;
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public boolean b() {
        return this.f8355c.size() > 0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        this.f8355c.append(activity.hashCode(), activity.getComponentName().getClassName());
        UCLogUtil.e("add activity = " + this.f8355c.size());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        this.f8355c.remove(activity.hashCode());
        UCLogUtil.e("remove activity = " + this.f8355c.size());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        UCLogUtil.i(d, "onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
    }
}
