package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/v83;", "", "", "onSuccess", "", "tips", "a", "error", "onFail", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface v83 {
    void a(@NotNull String tips);

    void onFail(@NotNull String error);

    void onSuccess();
}
