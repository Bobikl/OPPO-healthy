package com.heytap.webview.extension;

import com.heytap.webview.extension.config.IConsoleMessager;
import com.heytap.webview.extension.config.IErrorHandler;
import com.heytap.webview.extension.config.IRouterInterceptor;
import com.heytap.webview.extension.config.IUrlInterceptor;
import com.oplus.aiunit.vision.jla;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0017B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/heytap/webview/extension/WebExtConfiguration;", "", "urlInterceptor", "Lcom/heytap/webview/extension/config/IUrlInterceptor;", "threadExecutor", "Ljava/util/concurrent/Executor;", "consoleMessager", "Lcom/heytap/webview/extension/config/IConsoleMessager;", "errorHandler", "Lcom/heytap/webview/extension/config/IErrorHandler;", "routerInterceptor", "Lcom/heytap/webview/extension/config/IRouterInterceptor;", "(Lcom/heytap/webview/extension/config/IUrlInterceptor;Ljava/util/concurrent/Executor;Lcom/heytap/webview/extension/config/IConsoleMessager;Lcom/heytap/webview/extension/config/IErrorHandler;Lcom/heytap/webview/extension/config/IRouterInterceptor;)V", "getConsoleMessager", "()Lcom/heytap/webview/extension/config/IConsoleMessager;", "getErrorHandler", "()Lcom/heytap/webview/extension/config/IErrorHandler;", "getRouterInterceptor", "()Lcom/heytap/webview/extension/config/IRouterInterceptor;", "getThreadExecutor", "()Ljava/util/concurrent/Executor;", "getUrlInterceptor", "()Lcom/heytap/webview/extension/config/IUrlInterceptor;", "Builder", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebExtConfiguration {

    @Nullable
    private final IConsoleMessager consoleMessager;

    @Nullable
    private final IErrorHandler errorHandler;

    @Nullable
    private final IRouterInterceptor routerInterceptor;

    @Nullable
    private final Executor threadExecutor;

    @Nullable
    private final IUrlInterceptor urlInterceptor;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/heytap/webview/extension/WebExtConfiguration$Builder;", "", "()V", "consoleMessager", "Lcom/heytap/webview/extension/config/IConsoleMessager;", "errorHandler", "Lcom/heytap/webview/extension/config/IErrorHandler;", "executor", "Ljava/util/concurrent/Executor;", "routerInterceptor", "Lcom/heytap/webview/extension/config/IRouterInterceptor;", "urlInterceptor", "Lcom/heytap/webview/extension/config/IUrlInterceptor;", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/webview/extension/WebExtConfiguration;", "setConsoleMessager", "setErrorHander", "errorHander", "setRouterInterceptor", "uriRouter", "setThreadExecutor", "setUrlInterceptor", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private IConsoleMessager consoleMessager;

        @Nullable
        private IErrorHandler errorHandler;

        @Nullable
        private Executor executor;

        @Nullable
        private IRouterInterceptor routerInterceptor;

        @Nullable
        private IUrlInterceptor urlInterceptor;

        @NotNull
        public final WebExtConfiguration build() {
            return new WebExtConfiguration(this.urlInterceptor, this.executor, this.consoleMessager, this.errorHandler, this.routerInterceptor);
        }

        @NotNull
        public final Builder setConsoleMessager(@NotNull IConsoleMessager consoleMessager) {
            Intrinsics.checkNotNullParameter(consoleMessager, "consoleMessager");
            this.consoleMessager = consoleMessager;
            return this;
        }

        @NotNull
        public final Builder setErrorHander(@NotNull IErrorHandler errorHander) {
            Intrinsics.checkNotNullParameter(errorHander, "errorHander");
            this.errorHandler = errorHander;
            return this;
        }

        @NotNull
        public final Builder setRouterInterceptor(@NotNull IRouterInterceptor uriRouter) {
            Intrinsics.checkNotNullParameter(uriRouter, "uriRouter");
            this.routerInterceptor = uriRouter;
            return this;
        }

        @NotNull
        public final Builder setThreadExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.executor = executor;
            return this;
        }

        @NotNull
        public final Builder setUrlInterceptor(@NotNull IUrlInterceptor urlInterceptor) {
            Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
            this.urlInterceptor = urlInterceptor;
            return this;
        }
    }

    public WebExtConfiguration(@Nullable IUrlInterceptor iUrlInterceptor, @Nullable Executor executor, @Nullable IConsoleMessager iConsoleMessager, @Nullable IErrorHandler iErrorHandler, @Nullable IRouterInterceptor iRouterInterceptor) {
        this.urlInterceptor = iUrlInterceptor;
        this.threadExecutor = executor;
        this.consoleMessager = iConsoleMessager;
        this.errorHandler = iErrorHandler;
        this.routerInterceptor = iRouterInterceptor;
    }

    @Nullable
    public final IConsoleMessager getConsoleMessager() {
        return this.consoleMessager;
    }

    @Nullable
    public final IErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    @Nullable
    public final IRouterInterceptor getRouterInterceptor() {
        return this.routerInterceptor;
    }

    @Nullable
    public final Executor getThreadExecutor() {
        return this.threadExecutor;
    }

    @Nullable
    public final IUrlInterceptor getUrlInterceptor() {
        return this.urlInterceptor;
    }
}
