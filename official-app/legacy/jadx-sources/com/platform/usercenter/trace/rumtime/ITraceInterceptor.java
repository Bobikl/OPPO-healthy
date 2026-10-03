package com.platform.usercenter.trace.rumtime;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/platform/usercenter/trace/rumtime/ITraceInterceptor;", "", "intercept", "", "", "rawMap", "trace-runtime_release"}, k = 1, mv = {1, 4, 0})
public interface ITraceInterceptor {
    @NotNull
    Map<String, String> intercept(@NotNull Map<String, String> rawMap);
}
