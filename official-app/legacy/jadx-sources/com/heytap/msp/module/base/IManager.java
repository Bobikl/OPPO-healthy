package com.heytap.msp.module.base;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/heytap/msp/module/base/IManager;", "", "getInfo", "", "Lcom/heytap/msp/module/base/ModuleAgentInfo;", "annotation-proxy"}, k = 1, mv = {1, 4, 2})
public interface IManager {
    @NotNull
    List<ModuleAgentInfo> getInfo();
}
