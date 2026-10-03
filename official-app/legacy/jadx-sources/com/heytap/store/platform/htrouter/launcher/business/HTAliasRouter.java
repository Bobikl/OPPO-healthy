package com.heytap.store.platform.htrouter.launcher.business;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.store.platform.htrouter.base.InternalGlobalLogger;
import com.heytap.store.platform.htrouter.base.UniqueKeyTreeMap;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.heytap.store.platform.htrouter.core.LogisticsCenter;
import com.heytap.store.platform.htrouter.exception.HandlerException;
import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback;
import com.heytap.store.platform.htrouter.facade.callback.NavigationCallback;
import com.heytap.store.platform.htrouter.facade.service.DegradeService;
import com.heytap.store.platform.htrouter.facade.service.InterceptorService;
import com.heytap.store.platform.htrouter.facade.template.IInterceptor;
import com.heytap.store.platform.htrouter.facade.template.ILogger;
import com.heytap.store.platform.htrouter.launcher.HTRouter;
import com.heytap.store.platform.htrouter.launcher.business.base.ILocalInterceptorCallback;
import com.heytap.store.platform.htrouter.launcher.business.base.NavCard;
import com.heytap.store.platform.htrouter.launcher.business.base.RouteMatchResult;
import com.heytap.store.platform.htrouter.launcher.business.base.RouteMatchType;
import com.heytap.store.platform.htrouter.thread.CancelableCountDownLatch;
import com.heytap.store.platform.htrouter.utils.PatternUtilKt;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.vc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 I2\u00020\u0001:\u0001IB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0014\u001a\u00020\u0007J6\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\bH\u0002J \u0010\"\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\nH\u0002J\u001a\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0018\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020)H\u0002J(\u0010*\u001a\u00020\u000b2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020.H\u0002J,\u0010/\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\n2\u0006\u00100\u001a\u0002012\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J.\u00102\u001a\u00020\u000b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u0002052\u0006\u0010(\u001a\u00020\u001aH\u0002J\u001c\u00106\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\nH\u0002J\u001c\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007092\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J!\u0010:\u001a\u0004\u0018\u0001H;\"\u0004\b\u0000\u0010;2\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H;0=¢\u0006\u0002\u0010>J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u000e\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u0001J\u0010\u0010B\u001a\u00020\b2\u0006\u0010C\u001a\u00020\u0007H\u0002J \u0010D\u001a\u00020\u000b2\u0006\u00104\u001a\u0002052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010E\u001a\u00020\u000b2\u0006\u00104\u001a\u0002052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010F\u001a\u00020\u000b2\u0006\u00104\u001a\u0002052\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002JV\u0010G\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010&2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u0010!\u001a\u00020\bH\u0007R@\u0010\u0003\u001a4\u00120\u0012.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\t0\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/heytap/store/platform/htrouter/launcher/business/HTAliasRouter;", "", "()V", "customRouteMap", "", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "", "Lkotlin/Function2;", "Landroid/os/Bundle;", "", "routeAliasMap", "", "routePatternMap", "addCustomRoutePair", "decision", "invokeMethod", "addRouteAliasPair", "alias", "routePath", "addRoutePatternPair", "pattern", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "buildNavCard", "Lcom/heytap/store/platform/htrouter/launcher/business/base/NavCard;", "matchResult", "Lcom/heytap/store/platform/htrouter/launcher/business/base/RouteMatchResult;", "jumpUrl", "context", "Landroid/content/Context;", "bundle", "isGreenChannel", "createPostcard", "degrade", "postcard", "callback", "Lcom/heytap/store/platform/htrouter/facade/callback/NavigationCallback;", "doGlobalInterceptors", "navCard", "Lcom/heytap/store/platform/htrouter/facade/callback/InterceptorCallback;", "doLocalInterceptors", "interceptors", "Ljava/util/ArrayList;", "Lcom/heytap/store/platform/htrouter/facade/template/IInterceptor;", "Lcom/heytap/store/platform/htrouter/launcher/business/base/ILocalInterceptorCallback;", "doRealNavigation", vc.KEY_REQUEST_CODE, "", "executeInterceptor", "index", "counter", "Lcom/heytap/store/platform/htrouter/thread/CancelableCountDownLatch;", "getBundleFromUrl", "extraBundle", "getParamFromUrl", "", "getService", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "gotoMatch", Consts.METHOD_INJECT, "instance", "isRoutePath", "path", "matchInAlias", "matchInCustom", "matchInPattern", NotificationCompat.CATEGORY_NAVIGATION, "navigationCallback", "Companion", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class HTAliasRouter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile HTAliasRouter INSTANCE = null;

    @NotNull
    public static final String ORIGIN_URL = "origin_url";
    private static Application context;
    private static volatile boolean hasInit;
    private final List<Pair<Function1<String, Boolean>, Function2<String, Bundle, Unit>>> customRouteMap;
    private final Map<String, String> routeAliasMap;
    private final List<Pair<String, String>> routePatternMap;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0007J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0007J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/platform/htrouter/launcher/business/HTAliasRouter$Companion;", "", "()V", "INSTANCE", "Lcom/heytap/store/platform/htrouter/launcher/business/HTAliasRouter;", "getINSTANCE", "()Lcom/heytap/store/platform/htrouter/launcher/business/HTAliasRouter;", "setINSTANCE", "(Lcom/heytap/store/platform/htrouter/launcher/business/HTAliasRouter;)V", "ORIGIN_URL", "", "context", "Landroid/app/Application;", "hasInit", "", "destroy", "", "getInstance", "init", "application", "isDebuggable", "setExecutor", "tpe", "Ljava/util/concurrent/ThreadPoolExecutor;", "setLogger", "logger", "Lcom/heytap/store/platform/htrouter/facade/template/ILogger;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HTAliasRouter getINSTANCE() {
            if (HTAliasRouter.INSTANCE == null) {
                synchronized (HTRouter.class) {
                    if (HTAliasRouter.INSTANCE == null) {
                        HTAliasRouter.INSTANCE = new HTAliasRouter(null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return HTAliasRouter.INSTANCE;
        }

        public static /* synthetic */ void init$default(Companion companion, Application application, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            companion.init(application, z);
        }

        private final void setINSTANCE(HTAliasRouter hTAliasRouter) {
            HTAliasRouter.INSTANCE = hTAliasRouter;
        }

        public final synchronized void destroy() {
            HTAliasRouter.hasInit = HTRouter.INSTANCE.destroy();
        }

        @JvmStatic
        @NotNull
        public final synchronized HTAliasRouter getInstance() {
            HTAliasRouter instance;
            if (!HTAliasRouter.hasInit) {
                init(ContextGetterUtils.INSTANCE.getApp(), false);
            }
            instance = getINSTANCE();
            Intrinsics.checkNotNull(instance);
            return instance;
        }

        @JvmOverloads
        public final void init(@NotNull Application application) {
            init$default(this, application, false, 2, null);
        }

        public final void setExecutor(@NotNull ThreadPoolExecutor tpe) {
            Intrinsics.checkNotNullParameter(tpe, "tpe");
            HTRouter.INSTANCE.setExecutor(tpe);
        }

        public final void setLogger(@NotNull ILogger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            HTRouter.INSTANCE.setLogger(logger);
        }

        @JvmOverloads
        public final void init(@NotNull Application application, boolean isDebuggable) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (HTAliasRouter.hasInit) {
                return;
            }
            HTAliasRouter.context = application;
            HTAliasRouter.hasInit = HTRouter.INSTANCE.init(application, isDebuggable);
            InternalGlobalLogger.INSTANCE.getINSTANCE().info("HTRouter::", "HTAliasRouter init over");
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RouteMatchType.values().length];
            $EnumSwitchMapping$0 = iArr;
            RouteMatchType routeMatchType = RouteMatchType.CUSTOM_METHOD;
            iArr[routeMatchType.ordinal()] = 1;
            RouteMatchType routeMatchType2 = RouteMatchType.ROUTE_PATH;
            iArr[routeMatchType2.ordinal()] = 2;
            int[] iArr2 = new int[RouteMatchType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[routeMatchType.ordinal()] = 1;
            iArr2[routeMatchType2.ordinal()] = 2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8271j;
        public final /* synthetic */ NavCard k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ILocalInterceptorCallback f8272l;

        public a(ArrayList arrayList, NavCard navCard, ILocalInterceptorCallback iLocalInterceptorCallback) {
            this.f8271j = arrayList;
            this.k = navCard;
            this.f8272l = iLocalInterceptorCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CancelableCountDownLatch cancelableCountDownLatch = new CancelableCountDownLatch(this.f8271j.size());
            try {
                HTAliasRouter.this.executeInterceptor(this.f8271j, 0, cancelableCountDownLatch, this.k);
                cancelableCountDownLatch.await(3L, TimeUnit.SECONDS);
                if (cancelableCountDownLatch.getCount() > 0) {
                    this.f8272l.onInterrupt(new HandlerException("The interceptor processing timed out! "));
                } else if (this.k.getNavError() != null) {
                    ILocalInterceptorCallback iLocalInterceptorCallback = this.f8272l;
                    Object navError = this.k.getNavError();
                    if (!(navError instanceof Throwable)) {
                        navError = null;
                    }
                    iLocalInterceptorCallback.onInterrupt((Throwable) navError);
                } else {
                    this.f8272l.onContinue(this.k);
                }
            } catch (Exception e2) {
                this.f8272l.onInterrupt(e2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8273j;
        public final /* synthetic */ RouteMatchResult k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CancelableCountDownLatch f8274l;

        public b(String str, RouteMatchResult routeMatchResult, CancelableCountDownLatch cancelableCountDownLatch) {
            this.f8273j = str;
            this.k = routeMatchResult;
            this.f8274l = cancelableCountDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : HTAliasRouter.this.routeAliasMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (StringsKt__StringsJVMKt.startsWith$default(this.f8273j, str, false, 2, null)) {
                    this.k.setRoutePathForAlias(str2);
                    this.f8274l.countDown();
                    return;
                }
            }
            this.f8274l.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class c implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8275j;
        public final /* synthetic */ RouteMatchResult k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CancelableCountDownLatch f8276l;

        public c(String str, RouteMatchResult routeMatchResult, CancelableCountDownLatch cancelableCountDownLatch) {
            this.f8275j = str;
            this.k = routeMatchResult;
            this.f8276l = cancelableCountDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Pair pair : HTAliasRouter.this.customRouteMap) {
                if (((Boolean) ((Function1) pair.getFirst()).invoke(this.f8275j)).booleanValue()) {
                    this.k.setCustomRoute((Function2) pair.getSecond());
                    this.f8276l.countDown();
                    return;
                }
            }
            this.f8276l.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8277j;
        public final /* synthetic */ RouteMatchResult k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ CancelableCountDownLatch f8278l;

        public d(String str, RouteMatchResult routeMatchResult, CancelableCountDownLatch cancelableCountDownLatch) {
            this.f8277j = str;
            this.k = routeMatchResult;
            this.f8278l = cancelableCountDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Pair pair : HTAliasRouter.this.routePatternMap) {
                if (PatternUtilKt.find(this.f8277j, (String) pair.getFirst())) {
                    this.k.setRoutePathForPattern((String) pair.getSecond());
                    this.f8278l.countDown();
                    return;
                }
            }
            this.f8278l.countDown();
        }
    }

    /* JADX INFO: renamed from: com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter$navigation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/heytap/store/platform/htrouter/launcher/business/HTAliasRouter$navigation$1", "Lcom/heytap/store/platform/htrouter/launcher/business/base/ILocalInterceptorCallback;", "onContinue", "", "navCard", "Lcom/heytap/store/platform/htrouter/launcher/business/base/NavCard;", "onInterrupt", "exception", "", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
    public static final class C16871 implements ILocalInterceptorCallback {
        final /* synthetic */ NavCard $navCard;
        final /* synthetic */ NavigationCallback $navigationCallback;
        final /* synthetic */ Bundle $params;
        final /* synthetic */ int $requestCode;

        public C16871(NavigationCallback navigationCallback, NavCard navCard, Bundle bundle, int i) {
            this.$navigationCallback = navigationCallback;
            this.$navCard = navCard;
            this.$params = bundle;
            this.$requestCode = i;
        }

        @Override // com.heytap.store.platform.htrouter.launcher.business.base.ILocalInterceptorCallback
        public void onContinue(@NotNull final NavCard navCard) {
            Intrinsics.checkNotNullParameter(navCard, "navCard");
            HTAliasRouter.this.doGlobalInterceptors(navCard, new InterceptorCallback() { // from class: com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter$navigation$1$onContinue$1
                @Override // com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback
                public void onContinue(@NotNull PostCard postcard) {
                    Intrinsics.checkNotNullParameter(postcard, "postcard");
                    HTAliasRouter.C16871 c16871 = this.this$0;
                    HTAliasRouter.this.doRealNavigation(navCard, c16871.$params, c16871.$requestCode, c16871.$navigationCallback);
                }

                @Override // com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback
                public void onInterrupt(@Nullable Throwable exception) {
                    NavigationCallback navigationCallback = this.this$0.$navigationCallback;
                    if (navigationCallback != null) {
                        navigationCallback.onInterrupt(navCard.getPostcard());
                    }
                }
            });
        }

        @Override // com.heytap.store.platform.htrouter.launcher.business.base.ILocalInterceptorCallback
        public void onInterrupt(@Nullable Throwable exception) {
            NavigationCallback navigationCallback = this.$navigationCallback;
            if (navigationCallback != null) {
                navigationCallback.onInterrupt(this.$navCard.getPostcard());
            }
        }
    }

    private HTAliasRouter() {
        this.routeAliasMap = new UniqueKeyTreeMap("more than 1 routes use same alias");
        this.routePatternMap = new LinkedList();
        this.customRouteMap = new LinkedList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NavCard buildNavCard(RouteMatchResult matchResult, String jumpUrl, Context context2, Bundle bundle, boolean isGreenChannel) {
        NavCard navCard;
        PostCard postCardBuild;
        int i = WhenMappings.$EnumSwitchMapping$0[matchResult.getType().ordinal()];
        if (i == 1) {
            String str = null;
            navCard = new NavCard(matchResult.getType(), new PostCard(null, str, null, null, 15, null), matchResult.getCustomRoute(), str, 8, 0 == true ? 1 : 0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                String routePath = matchResult.getRoutePath();
                if (routePath == null) {
                    routePath = jumpUrl;
                }
                postCardBuild = build(routePath);
            } catch (Exception unused) {
                postCardBuild = null;
            }
            if (postCardBuild == null) {
                return null;
            }
            navCard = new NavCard(matchResult.getType(), postCardBuild, matchResult.getCustomRoute(), null, 8, null);
        }
        navCard.getPostcard().setGreenChannel(isGreenChannel);
        navCard.getPostcard().setContext(context2);
        navCard.getPostcard().setBundle(bundle);
        HTAliasRouterKt.withOriginalUrl(navCard.getPostcard(), jumpUrl);
        return navCard;
    }

    public static /* synthetic */ NavCard buildNavCard$default(HTAliasRouter hTAliasRouter, RouteMatchResult routeMatchResult, String str, Context context2, Bundle bundle, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return hTAliasRouter.buildNavCard(routeMatchResult, str, context2, bundle, z);
    }

    private final PostCard createPostcard(String jumpUrl, Context context2, Bundle bundle) {
        PostCard postCard = new PostCard(null, null, null, null, 15, null);
        postCard.setContext(context2);
        postCard.setBundle(bundle);
        return HTAliasRouterKt.withOriginalUrl(postCard, jumpUrl);
    }

    private final void degrade(PostCard postcard, NavigationCallback callback) {
        if (callback != null) {
            callback.onLost(postcard);
            return;
        }
        DegradeService degradeService = (DegradeService) getService(DegradeService.class);
        if (degradeService != null) {
            degradeService.onLost(context, postcard);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doGlobalInterceptors(NavCard navCard, InterceptorCallback callback) {
        if (navCard.getPostcard().getGreenChannel()) {
            callback.onContinue(navCard.getPostcard());
            return;
        }
        InterceptorService interceptorService = (InterceptorService) getService(InterceptorService.class);
        if (interceptorService != null) {
            interceptorService.doInterceptions(navCard.getPostcard(), callback);
        }
    }

    private final void doLocalInterceptors(ArrayList<IInterceptor> interceptors, NavCard navCard, ILocalInterceptorCallback callback) {
        if (interceptors == null || !(!interceptors.isEmpty())) {
            callback.onContinue(navCard);
        } else {
            LogisticsCenter.INSTANCE.getExecutor().execute(new a(interceptors, navCard, callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doRealNavigation(NavCard navCard, Bundle bundle, int requestCode, NavigationCallback callback) {
        int i = WhenMappings.$EnumSwitchMapping$1[navCard.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            HTRouter.INSTANCE.getInstance().navigationToDest(navCard.getPostcard(), requestCode, callback);
            return;
        }
        Function2<String, Bundle, Unit> method = navCard.getMethod();
        if (method != null) {
            String originalUrl = HTAliasRouterKt.getOriginalUrl(navCard.getPostcard());
            if (originalUrl == null) {
                originalUrl = "";
            }
            method.invoke(originalUrl, bundle);
        }
        if (callback != null) {
            callback.onArrival(navCard.getPostcard());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeInterceptor(final ArrayList<IInterceptor> interceptors, final int index, final CancelableCountDownLatch counter, final NavCard navCard) {
        if (index < interceptors.size()) {
            interceptors.get(index).process(navCard.getPostcard(), new InterceptorCallback() { // from class: com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter.executeInterceptor.1
                @Override // com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback
                public void onContinue(@NotNull PostCard postcard) {
                    Intrinsics.checkNotNullParameter(postcard, "postcard");
                    counter.countDown();
                    HTAliasRouter.this.executeInterceptor(interceptors, index + 1, counter, navCard);
                }

                @Override // com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback
                public void onInterrupt(@Nullable Throwable exception) {
                    NavCard navCard2 = navCard;
                    if (exception == null) {
                        exception = new HandlerException("local interceptor: no message");
                    }
                    navCard2.setNavError(exception);
                    counter.cancel();
                }
            });
        }
    }

    private final Bundle getBundleFromUrl(String jumpUrl, Bundle extraBundle) {
        if (extraBundle == null) {
            extraBundle = new Bundle();
        }
        try {
            Uri uri = Uri.parse(Uri.decode(jumpUrl));
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            for (String str : uri.getQueryParameterNames()) {
                extraBundle.putString(str, uri.getQueryParameter(str));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return extraBundle;
    }

    public static /* synthetic */ Bundle getBundleFromUrl$default(HTAliasRouter hTAliasRouter, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return hTAliasRouter.getBundleFromUrl(str, bundle);
    }

    @JvmStatic
    @NotNull
    public static final synchronized HTAliasRouter getInstance() {
        return INSTANCE.getInstance();
    }

    private final Map<String, String> getParamFromUrl(String jumpUrl) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) jumpUrl, "?", 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            return linkedHashMap;
        }
        String strSubstring = jumpUrl.substring(iIndexOf$default + 1, jumpUrl.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        if (strSubstring.length() > 0) {
            Iterator it = StringsKt__StringsKt.split$default((CharSequence) strSubstring, new String[]{"&"}, false, 0, 6, (Object) null).iterator();
            while (it.hasNext()) {
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{HttpUtils.EQUAL_SIGN}, false, 0, 6, (Object) null);
                if (listSplit$default.size() == 2) {
                    linkedHashMap.put(listSplit$default.get(0), listSplit$default.get(1));
                }
            }
        }
        return linkedHashMap;
    }

    private final RouteMatchResult gotoMatch(String alias) throws InterruptedException {
        CancelableCountDownLatch cancelableCountDownLatch = new CancelableCountDownLatch(3);
        RouteMatchResult routeMatchResult = new RouteMatchResult(null, null, null, 7, null);
        matchInAlias(cancelableCountDownLatch, alias, routeMatchResult);
        matchInPattern(cancelableCountDownLatch, alias, routeMatchResult);
        matchInCustom(cancelableCountDownLatch, alias, routeMatchResult);
        cancelableCountDownLatch.await(300L, TimeUnit.SECONDS);
        return routeMatchResult;
    }

    private final boolean isRoutePath(String path) {
        return (path.length() > 0) && StringsKt__StringsJVMKt.startsWith$default(path, "/", false, 2, null) && StringsKt__StringsKt.indexOf$default((CharSequence) path, "/", 1, false, 4, (Object) null) > 2;
    }

    private final void matchInAlias(CancelableCountDownLatch counter, String alias, RouteMatchResult matchResult) {
        LogisticsCenter.INSTANCE.getExecutor().execute(new b(alias, matchResult, counter));
    }

    private final void matchInCustom(CancelableCountDownLatch counter, String alias, RouteMatchResult matchResult) {
        LogisticsCenter.INSTANCE.getExecutor().execute(new c(alias, matchResult, counter));
    }

    private final void matchInPattern(CancelableCountDownLatch counter, String alias, RouteMatchResult matchResult) {
        LogisticsCenter.INSTANCE.getExecutor().execute(new d(alias, matchResult, counter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void navigation$default(HTAliasRouter hTAliasRouter, String str, Context context2, ArrayList arrayList, Bundle bundle, NavigationCallback navigationCallback, int i, boolean z, int i2, Object obj) throws InterruptedException {
        hTAliasRouter.navigation(str, context2, (i2 & 4) != 0 ? null : arrayList, (i2 & 8) != 0 ? null : bundle, (i2 & 16) != 0 ? null : navigationCallback, (i2 & 32) != 0 ? -1 : i, (i2 & 64) != 0 ? false : z);
    }

    public final void addCustomRoutePair(@NotNull Function1<? super String, Boolean> decision, @NotNull Function2<? super String, ? super Bundle, Unit> invokeMethod) {
        Intrinsics.checkNotNullParameter(decision, "decision");
        Intrinsics.checkNotNullParameter(invokeMethod, "invokeMethod");
        this.customRouteMap.add(new Pair<>(decision, invokeMethod));
    }

    public final void addRouteAliasPair(@NotNull String alias, @NotNull String routePath) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(routePath, "routePath");
        if (alias.length() > 0) {
            if (routePath.length() > 0) {
                this.routeAliasMap.put(alias, routePath);
            }
        }
    }

    public final void addRoutePatternPair(@NotNull String pattern, @NotNull String routePath) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(routePath, "routePath");
        if (routePath.length() > 0) {
            this.routePatternMap.add(new Pair<>(pattern, routePath));
        }
    }

    @Nullable
    public final PostCard build(@NotNull String routePath) {
        Intrinsics.checkNotNullParameter(routePath, "routePath");
        if (isRoutePath(routePath)) {
            return HTRouter.INSTANCE.getInstance().build(routePath);
        }
        InternalGlobalLogger.INSTANCE.getINSTANCE().warning("HTRouter::", "cannot build Postcard, because the path don satisfy 'start with '/' and contain 2 '/''");
        return null;
    }

    @Nullable
    public final <T> T getService(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) HTRouter.INSTANCE.getInstance().navigation(clazz);
    }

    public final void inject(@NotNull Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HTRouter.INSTANCE.getInstance().inject(instance);
    }

    @JvmOverloads
    public final void navigation(@NotNull String str, @NotNull Context context2) throws InterruptedException {
        navigation$default(this, str, context2, null, null, null, 0, false, 124, null);
    }

    @JvmOverloads
    public final void navigation(@NotNull String str, @NotNull Context context2, @Nullable ArrayList<IInterceptor> arrayList) throws InterruptedException {
        navigation$default(this, str, context2, arrayList, null, null, 0, false, 120, null);
    }

    @JvmOverloads
    public final void navigation(@NotNull String str, @NotNull Context context2, @Nullable ArrayList<IInterceptor> arrayList, @Nullable Bundle bundle) throws InterruptedException {
        navigation$default(this, str, context2, arrayList, bundle, null, 0, false, 112, null);
    }

    @JvmOverloads
    public final void navigation(@NotNull String str, @NotNull Context context2, @Nullable ArrayList<IInterceptor> arrayList, @Nullable Bundle bundle, @Nullable NavigationCallback navigationCallback) throws InterruptedException {
        navigation$default(this, str, context2, arrayList, bundle, navigationCallback, 0, false, 96, null);
    }

    public /* synthetic */ HTAliasRouter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmOverloads
    public final void navigation(@NotNull String str, @NotNull Context context2, @Nullable ArrayList<IInterceptor> arrayList, @Nullable Bundle bundle, @Nullable NavigationCallback navigationCallback, int i) throws InterruptedException {
        navigation$default(this, str, context2, arrayList, bundle, navigationCallback, i, false, 64, null);
    }

    @JvmOverloads
    public final void navigation(@NotNull String jumpUrl, @NotNull Context context2, @Nullable ArrayList<IInterceptor> interceptors, @Nullable Bundle bundle, @Nullable NavigationCallback navigationCallback, int requestCode, boolean isGreenChannel) throws InterruptedException {
        Intrinsics.checkNotNullParameter(jumpUrl, "jumpUrl");
        Intrinsics.checkNotNullParameter(context2, "context");
        Bundle bundleFromUrl = getBundleFromUrl(jumpUrl, bundle);
        RouteMatchResult routeMatchResultGotoMatch = gotoMatch(jumpUrl);
        if (routeMatchResultGotoMatch.isEmptyMatch() && !isRoutePath(jumpUrl)) {
            degrade(createPostcard(jumpUrl, context2, bundleFromUrl), navigationCallback);
            return;
        }
        NavCard navCardBuildNavCard = buildNavCard(routeMatchResultGotoMatch, jumpUrl, context2, bundleFromUrl, isGreenChannel);
        if (navCardBuildNavCard == null) {
            degrade(createPostcard(jumpUrl, context2, bundleFromUrl), navigationCallback);
            return;
        }
        if (navCardBuildNavCard.getType() == RouteMatchType.ROUTE_PATH) {
            try {
                LogisticsCenter.INSTANCE.completion(navCardBuildNavCard.getPostcard());
            } catch (Exception unused) {
                degrade(navCardBuildNavCard.getPostcard(), navigationCallback);
                return;
            }
        }
        if (navigationCallback != null) {
            navigationCallback.onFound(navCardBuildNavCard.getPostcard());
        }
        doLocalInterceptors(interceptors, navCardBuildNavCard, new C16871(navigationCallback, navCardBuildNavCard, bundleFromUrl, requestCode));
    }
}
