package com.heytap.health.device_app_store.install;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.rt9;
import com.oplus.aiunit.vision.vgd;

/* JADX INFO: loaded from: classes16.dex */
public interface IAppInstallStatusService extends IProvider {
    void D();

    void I3(@NonNull Activity activity, @NonNull rt9 rt9Var);

    boolean J(String str);

    void d8(String str, vgd vgdVar);

    void p3(@NonNull Activity activity);

    boolean p8(String str);
}
