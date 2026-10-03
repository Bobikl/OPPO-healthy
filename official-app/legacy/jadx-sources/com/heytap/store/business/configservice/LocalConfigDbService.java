package com.heytap.store.business.configservice;

import com.oplus.aiunit.vision.kbd;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¨\u0006\t"}, d2 = {"Lcom/heytap/store/business/configservice/LocalConfigDbService;", "", "", "tabName", "Lcom/oplus/aiunit/vision/kbd;", "getLocalConfig", "data", "", "onSaveToDb", "config-service_release"}, k = 1, mv = {1, 6, 0})
public interface LocalConfigDbService {
    @NotNull
    kbd<String> getLocalConfig(@NotNull String tabName);

    void onSaveToDb(@NotNull String tabName, @Nullable String data);
}
