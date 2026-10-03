package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/on9;", "", "Landroid/content/Context;", "appContext", "", "initSdk", "releaseSdk", "", sbe.PAY_SDK_VERSION_NAME, sbe.PAY_SDK_VERSION_CODE, "", "exchangeVersion", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public interface on9 {
    @NotNull
    List<String> exchangeVersion(@NotNull String sdkVersionName, @NotNull String sdkVersionCode);

    void initSdk(@NotNull Context appContext);

    void releaseSdk();
}
