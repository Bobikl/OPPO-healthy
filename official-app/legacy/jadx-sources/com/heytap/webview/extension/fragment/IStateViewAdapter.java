package com.heytap.webview.extension.fragment;

import android.os.Bundle;
import android.view.ViewGroup;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H&¨\u0006\u0016"}, d2 = {"Lcom/heytap/webview/extension/fragment/IStateViewAdapter;", "", "onCreate", "", "layer", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPageFinished", "onPageStarted", "onPause", "onProgressChanged", "progress", "", "onReceivedError", "errorCode", iim.a.f, "", "onResume", "onSaveInstanceState", "outState", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IStateViewAdapter {
    void onCreate(@NotNull ViewGroup layer, @Nullable Bundle savedInstanceState);

    void onDestroy();

    void onPageFinished();

    void onPageStarted();

    void onPause();

    void onProgressChanged(int progress);

    void onReceivedError(int errorCode, @NotNull CharSequence description);

    void onResume();

    void onSaveInstanceState(@NotNull Bundle outState);
}
