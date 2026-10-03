package com.heytap.health.core.router.setting;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.utils.AsyncResult;

/* JADX INFO: loaded from: classes16.dex */
public interface IWechatStepService extends IProvider {
    AsyncResult<Boolean> R9(String str);

    LiveData<Integer> U8();

    LiveData<Boolean> aa();

    Intent f6();

    void onLogout();
}
