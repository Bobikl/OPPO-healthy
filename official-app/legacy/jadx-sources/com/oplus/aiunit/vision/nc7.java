package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/nc7;", "", "Lcom/oplus/aiunit/vision/pc7;", "fileTaskProcess", "", "a", "", "errorCode", "", "taskId", "onError", "onSuccess", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public interface nc7 {
    void a(@NotNull pc7 fileTaskProcess);

    void onError(int errorCode, @NotNull String taskId);

    void onSuccess(@NotNull String taskId);
}
