package com.heytap.health.operations.router.providers;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public interface UserInfoService extends IProvider {
    MutableLiveData<HashMap<String, Object>> s9(Context context);
}
