package com.heytap.store.base.core.state;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/base/core/state/CommonConfig;", "", "()V", "errorBtnStr", "", "getErrorBtnStr", "()Ljava/lang/String;", "setErrorBtnStr", "(Ljava/lang/String;)V", "loadingStr", "getLoadingStr", "setLoadingStr", "pageEmptyStr", "getPageEmptyStr", "setPageEmptyStr", "pageErrorStr", "getPageErrorStr", "setPageErrorStr", "pageNetErrorStr", "getPageNetErrorStr", "setPageNetErrorStr", "toastErrorStr", "getToastErrorStr", "setToastErrorStr", "toastNoNetStr", "getToastNoNetStr", "setToastNoNetStr", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CommonConfig {

    @NotNull
    public static final CommonConfig INSTANCE = new CommonConfig();

    @NotNull
    private static String loadingStr = "正在加载...";

    @NotNull
    private static String pageNetErrorStr = "网络异常，请确保网络通畅后重试";

    @NotNull
    private static String pageErrorStr = "系统繁忙，请稍后重试";

    @NotNull
    private static String pageEmptyStr = "暂无数据";

    @NotNull
    private static String toastNoNetStr = "请检查网络后重试";

    @NotNull
    private static String toastErrorStr = "系统繁忙，请稍后重试";

    @NotNull
    private static String errorBtnStr = "重新加载";

    private CommonConfig() {
    }

    @NotNull
    public String getErrorBtnStr() {
        return errorBtnStr;
    }

    @NotNull
    public String getLoadingStr() {
        return loadingStr;
    }

    @NotNull
    public String getPageEmptyStr() {
        return pageEmptyStr;
    }

    @NotNull
    public String getPageErrorStr() {
        return pageErrorStr;
    }

    @NotNull
    public String getPageNetErrorStr() {
        return pageNetErrorStr;
    }

    @NotNull
    public String getToastErrorStr() {
        return toastErrorStr;
    }

    @NotNull
    public String getToastNoNetStr() {
        return toastNoNetStr;
    }

    public void setErrorBtnStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        errorBtnStr = str;
    }

    public void setLoadingStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        loadingStr = str;
    }

    public void setPageEmptyStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        pageEmptyStr = str;
    }

    public void setPageErrorStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        pageErrorStr = str;
    }

    public void setPageNetErrorStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        pageNetErrorStr = str;
    }

    public void setToastErrorStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        toastErrorStr = str;
    }

    public void setToastNoNetStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        toastNoNetStr = str;
    }
}
