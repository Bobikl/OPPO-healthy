package com.heytap.nearx.tangramconfig.api;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\r\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/ICloudStepTask;", "In", "Out", "", "configId", "", "process", "()Ljava/lang/Object;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ICloudStepTask<In, Out> {
    @NotNull
    String configId();

    Out process();
}
