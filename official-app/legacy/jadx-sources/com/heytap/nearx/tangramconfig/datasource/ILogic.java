package com.heytap.nearx.tangramconfig.datasource;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.api.ExceptionHandler;
import com.heytap.nearx.tangramconfig.api.StatHandler;
import com.heytap.nearx.tangramconfig.bean.UpdateConfigItem;
import com.heytap.nearx.tangramconfig.stat.TaskStat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/tangramconfig/datasource/ILogic;", "Lcom/heytap/nearx/tangramconfig/api/StatHandler;", "Lcom/heytap/nearx/tangramconfig/api/ExceptionHandler;", "newStat", "Lcom/heytap/nearx/tangramconfig/stat/TaskStat;", "config", "Lcom/heytap/nearx/tangramconfig/bean/UpdateConfigItem;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ILogic extends StatHandler, ExceptionHandler {
    @NotNull
    TaskStat newStat(@NotNull UpdateConfigItem config);
}
