package com.heytap.webview.extension;

import android.app.Application;
import com.heytap.webview.extension.cache.CacheConstants;
import com.heytap.webview.extension.config.DefaultConsoleMessager;
import com.heytap.webview.extension.config.DefaultErrorHandler;
import com.heytap.webview.extension.config.DefaultRouterInterceptor;
import com.heytap.webview.extension.config.DefaultUrlInterceptor;
import com.heytap.webview.extension.config.IConsoleMessager;
import com.heytap.webview.extension.config.IErrorHandler;
import com.heytap.webview.extension.config.IRouterInterceptor;
import com.heytap.webview.extension.config.IUrlInterceptor;
import com.heytap.webview.extension.data.DataReportHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020'H\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010&\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0007J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0007R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/heytap/webview/extension/WebExtManager;", "", "()V", "<set-?>", "Landroid/app/Application;", "application", "getApplication", "()Landroid/app/Application;", "consoleMessager", "Lcom/heytap/webview/extension/config/IConsoleMessager;", "getConsoleMessager", "()Lcom/heytap/webview/extension/config/IConsoleMessager;", "consoleMessagerGroup", "Lcom/heytap/webview/extension/ConsoleMessagerGroup;", "errorHandler", "Lcom/heytap/webview/extension/config/IErrorHandler;", "getErrorHandler", "()Lcom/heytap/webview/extension/config/IErrorHandler;", "errorHandlerGroup", "Lcom/heytap/webview/extension/ErrorHandlerGroup;", "initiated", "", "routerInterceptor", "Lcom/heytap/webview/extension/config/IRouterInterceptor;", "getRouterInterceptor", "()Lcom/heytap/webview/extension/config/IRouterInterceptor;", "routerInterceptorGroup", "Lcom/heytap/webview/extension/RouterInterceptorGroup;", "Ljava/util/concurrent/Executor;", "threadExecutor", "getThreadExecutor", "()Ljava/util/concurrent/Executor;", "urlInterceptor", "Lcom/heytap/webview/extension/config/IUrlInterceptor;", "getUrlInterceptor", "()Lcom/heytap/webview/extension/config/IUrlInterceptor;", "urlInterceptorGroup", "Lcom/heytap/webview/extension/UrlInterceptorGroup;", "init", "", CacheConstants.Word.CONFIGURATION, "Lcom/heytap/webview/extension/WebExtConfiguration;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebExtManager {

    @Nullable
    private static Application application;
    private static boolean initiated;

    @Nullable
    private static Executor threadExecutor;

    @NotNull
    public static final WebExtManager INSTANCE = new WebExtManager();

    @NotNull
    private static final ConsoleMessagerGroup consoleMessagerGroup = new ConsoleMessagerGroup();

    @NotNull
    private static final ErrorHandlerGroup errorHandlerGroup = new ErrorHandlerGroup();

    @NotNull
    private static final UrlInterceptorGroup urlInterceptorGroup = new UrlInterceptorGroup();

    @NotNull
    private static final RouterInterceptorGroup routerInterceptorGroup = new RouterInterceptorGroup();

    private WebExtManager() {
    }

    @JvmStatic
    public static final void init(@NotNull Application application2) {
        Intrinsics.checkNotNullParameter(application2, "application");
        application = application2;
        init();
    }

    @Nullable
    public final Application getApplication() {
        return application;
    }

    @NotNull
    public final IConsoleMessager getConsoleMessager() {
        return consoleMessagerGroup;
    }

    @NotNull
    public final IErrorHandler getErrorHandler() {
        return errorHandlerGroup;
    }

    @NotNull
    public final IRouterInterceptor getRouterInterceptor() {
        return routerInterceptorGroup;
    }

    @Nullable
    public final Executor getThreadExecutor() {
        return threadExecutor;
    }

    @NotNull
    public final IUrlInterceptor getUrlInterceptor() {
        return urlInterceptorGroup;
    }

    @JvmStatic
    public static final void init(@NotNull Application application2, @NotNull WebExtConfiguration configuration) {
        Intrinsics.checkNotNullParameter(application2, "application");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        application = application2;
        init(configuration);
    }

    @JvmStatic
    public static final void init() {
        init(new WebExtConfiguration.Builder().build());
    }

    @JvmStatic
    public static final void init(@NotNull WebExtConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (!initiated) {
            GeneratedRegister.init();
            urlInterceptorGroup.add(new DefaultUrlInterceptor());
            consoleMessagerGroup.add(new DefaultConsoleMessager());
            errorHandlerGroup.add(new DefaultErrorHandler());
            routerInterceptorGroup.add(new DefaultRouterInterceptor());
            Executor threadExecutor2 = configuration.getThreadExecutor();
            if (threadExecutor2 == null) {
                threadExecutor2 = Executors.newCachedThreadPool();
            }
            threadExecutor = threadExecutor2;
            DataReportHandler.INSTANCE.initDataReportHandler();
            initiated = true;
        }
        IConsoleMessager consoleMessager = configuration.getConsoleMessager();
        if (consoleMessager != null) {
            consoleMessagerGroup.add(consoleMessager);
        }
        IErrorHandler errorHandler = configuration.getErrorHandler();
        if (errorHandler != null) {
            errorHandlerGroup.add(errorHandler);
        }
        IUrlInterceptor urlInterceptor = configuration.getUrlInterceptor();
        if (urlInterceptor != null) {
            urlInterceptorGroup.add(urlInterceptor);
        }
        IRouterInterceptor routerInterceptor = configuration.getRouterInterceptor();
        if (routerInterceptor != null) {
            routerInterceptorGroup.add(routerInterceptor);
        }
    }
}
