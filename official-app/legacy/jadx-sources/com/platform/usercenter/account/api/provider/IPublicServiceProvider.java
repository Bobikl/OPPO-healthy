package com.platform.usercenter.account.api.provider;

import android.app.Activity;
import android.util.SparseArray;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.platform.usercenter.mcnetwork.NetworkModule;
import java.lang.ref.Reference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface IPublicServiceProvider extends IProvider {
    boolean existActivity();

    Map<String, String> getApkBizHeaderMap();

    String getBaseUrl();

    String getCloudConfig(String str);

    SparseArray<List<Reference<Activity>>> getCreateActivity();

    NetworkModule.Builder getNetworkBuilder(String str);

    NetworkModule.Builder getNetworkBuilder(String str, boolean z);

    boolean isForeground();
}
