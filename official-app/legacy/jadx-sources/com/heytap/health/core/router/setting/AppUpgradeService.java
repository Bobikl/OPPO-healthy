package com.heytap.health.core.router.setting;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes16.dex */
public interface AppUpgradeService extends IProvider {
    void D7(Context context);

    boolean I4(Context context);

    void destroy();

    void h6(Context context, int i);

    boolean m2();
}
