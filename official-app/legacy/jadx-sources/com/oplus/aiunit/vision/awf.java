package com.oplus.aiunit.vision;

import com.heytap.nearx.cloudconfig.observable.Observable;
import com.heytap.okhttp.extension.retry.RetryEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/awf;", "", "Lcom/heytap/nearx/cloudconfig/observable/Observable;", "", "Lcom/heytap/okhttp/extension/retry/RetryEntity;", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface awf {
    @NotNull
    Observable<List<RetryEntity>> a();
}
