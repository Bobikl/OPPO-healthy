package com.oppo.store.web.listener;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¨\u0006\n"}, d2 = {"Lcom/oppo/store/web/listener/IOnLineCustomServiceListener;", "", "onFaile", "", "errorCode", "", "error", "", "onSuccess", "url", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IOnLineCustomServiceListener {
    void onFaile(int errorCode, @Nullable String error);

    void onSuccess(@Nullable String url);
}
