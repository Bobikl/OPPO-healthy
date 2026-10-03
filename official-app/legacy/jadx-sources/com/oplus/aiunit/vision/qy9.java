package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.view.ViewGroup;
import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH&J(\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH&J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H&J\b\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001a\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\u0002H&¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/qy9;", "", "", "onPageStarted", "onPageFinished", "", "progress", "onProgressChanged", "errorCode", "", iim.a.f, "onReceivedError", "", "originUrl", "actualUrl", EngineConstant.REASON, "msg", "onFindCrossDomainIssue", "Landroid/view/ViewGroup;", "layer", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "onResume", "onPause", "onDestroy", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public interface qy9 {
    void onCreate(@NotNull ViewGroup layer, @Nullable Bundle savedInstanceState);

    void onDestroy();

    void onFindCrossDomainIssue(@NotNull String originUrl, @NotNull String actualUrl, @NotNull String reason, @NotNull String msg);

    void onPageFinished();

    void onPageStarted();

    void onPause();

    void onProgressChanged(int progress);

    void onReceivedError(int errorCode, @NotNull CharSequence description);

    void onResume();

    void onSaveInstanceState(@NotNull Bundle outState);
}
