package com.heytap.nearx.tangramconfig.business;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/nearx/tangramconfig/business/IFileCallBack;", "", "onFile", "", "result", "Lcom/heytap/nearx/tangramconfig/business/ConfigResult;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IFileCallBack {
    void onFile(@NotNull ConfigResult result);
}
