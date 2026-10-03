package com.heytap.nearx.cloudconfig.datasource;

import com.heytap.nearx.cloudconfig.api.ExceptionHandler;
import com.heytap.nearx.cloudconfig.api.StatHandler;
import com.heytap.nearx.cloudconfig.bean.UpdateConfigItem;
import com.heytap.nearx.cloudconfig.stat.TaskStat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/cloudconfig/datasource/ILogic;", "Lcom/heytap/nearx/cloudconfig/api/StatHandler;", "Lcom/heytap/nearx/cloudconfig/api/ExceptionHandler;", "newStat", "Lcom/heytap/nearx/cloudconfig/stat/TaskStat;", "config", "Lcom/heytap/nearx/cloudconfig/bean/UpdateConfigItem;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface ILogic extends StatHandler, ExceptionHandler {
    @NotNull
    TaskStat newStat(@NotNull UpdateConfigItem config);
}
