package com.heytap.store.platform.htrouter.launcher;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.platform.htrouter.base.InternalGlobalLogger;
import com.heytap.store.platform.htrouter.base.InternalGlobalStatus;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.facade.callback.NavigationCallback;
import com.heytap.store.platform.htrouter.facade.template.ILogger;
import com.heytap.store.platform.htrouter.facade.template.IRouteGroup;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.vc;
import com.oplus.smartenginehelper.ParserTag;
import java.util.concurrent.ThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001J,\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J!\u0010\u0010\u001a\u0004\u0018\u0001H\u0018\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a¢\u0006\u0002\u0010\u001bJ\"\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/platform/htrouter/launcher/HTRouter;", "", "()V", "addRouteGroup", "", "group", "Lcom/heytap/store/platform/htrouter/facade/template/IRouteGroup;", jla.DEFAULT_BUILD_METHOD, "Lcom/heytap/store/platform/htrouter/facade/Postcard;", ParserTag.TAG_URI, "Landroid/net/Uri;", "path", "", Consts.METHOD_INJECT, "", "instance", NotificationCompat.CATEGORY_NAVIGATION, "context", "Landroid/content/Context;", "postcard", vc.KEY_REQUEST_CODE, "", "callback", "Lcom/heytap/store/platform/htrouter/facade/callback/NavigationCallback;", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "navigationToDest", "Companion", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class HTRouter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile HTRouter INSTANCE;
    private static volatile boolean hasInit;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\u0004H\u0007J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/platform/htrouter/launcher/HTRouter$Companion;", "", "()V", "INSTANCE", "Lcom/heytap/store/platform/htrouter/launcher/HTRouter;", "getINSTANCE", "()Lcom/heytap/store/platform/htrouter/launcher/HTRouter;", "setINSTANCE", "(Lcom/heytap/store/platform/htrouter/launcher/HTRouter;)V", "hasInit", "", "destroy", "getInstance", "init", "application", "Landroid/app/Application;", "isDebuggable", "setExecutor", "", "tpe", "Ljava/util/concurrent/ThreadPoolExecutor;", "setLogger", "logger", "Lcom/heytap/store/platform/htrouter/facade/template/ILogger;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final HTRouter getINSTANCE() {
            if (HTRouter.INSTANCE == null) {
                synchronized (HTRouter.class) {
                    if (HTRouter.INSTANCE == null) {
                        HTRouter.INSTANCE = new HTRouter(null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return HTRouter.INSTANCE;
        }

        public static /* synthetic */ boolean init$default(Companion companion, Application application, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.init(application, z);
        }

        private final void setINSTANCE(HTRouter hTRouter) {
            HTRouter.INSTANCE = hTRouter;
        }

        public final synchronized boolean destroy() {
            HTRouter.hasInit = HTRouterHandler.INSTANCE.destroy();
            return HTRouter.hasInit;
        }

        @JvmStatic
        @NotNull
        public final synchronized HTRouter getInstance() {
            HTRouter instance;
            if (!HTRouter.hasInit) {
                init(ContextGetterUtils.INSTANCE.getApp(), false);
            }
            instance = getINSTANCE();
            Intrinsics.checkNotNull(instance);
            return instance;
        }

        @JvmOverloads
        public final boolean init(@NotNull Application application) {
            return init$default(this, application, false, 2, null);
        }

        public final void setExecutor(@NotNull ThreadPoolExecutor tpe) {
            Intrinsics.checkNotNullParameter(tpe, "tpe");
            HTRouterHandler.INSTANCE.setExecutor(tpe);
        }

        public final void setLogger(@NotNull ILogger logger) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            InternalGlobalLogger.INSTANCE.getINSTANCE().setLogger(logger);
        }

        @JvmOverloads
        public final boolean init(@NotNull Application application, boolean isDebuggable) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (!HTRouter.hasInit) {
                InternalGlobalLogger.Companion companion = InternalGlobalLogger.INSTANCE;
                InternalGlobalLogger instance = companion.getINSTANCE();
                instance.setLogSwitch(isDebuggable);
                instance.setStackTraceSwitch(isDebuggable);
                InternalGlobalStatus.INSTANCE.setDebuggable(isDebuggable);
                companion.getINSTANCE().info("HTRouter::", "HTRouter init start");
                HTRouterHandler.Companion companion2 = HTRouterHandler.INSTANCE;
                HTRouter.hasInit = companion2.init(application);
                if (HTRouter.hasInit) {
                    companion2.afterInit();
                }
                companion.getINSTANCE().info("HTRouter::", "HTRouter init over");
            }
            return HTRouter.hasInit;
        }
    }

    private HTRouter() {
    }

    public /* synthetic */ HTRouter(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final synchronized HTRouter getInstance() {
        return INSTANCE.getInstance();
    }

    public final boolean addRouteGroup(@NotNull IRouteGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        return HTRouterHandler.INSTANCE.getInstance().addRouteGroup(group);
    }

    @NotNull
    public final PostCard build(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return HTRouterHandler.INSTANCE.getInstance().build(path);
    }

    public final void inject(@NotNull Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HTRouterHandler.INSTANCE.inject(instance);
    }

    @Nullable
    public final <T> T navigation(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) HTRouterHandler.INSTANCE.getInstance().navigation(clazz);
    }

    @Nullable
    public final Object navigationToDest(@NotNull PostCard postcard, int requestCode, @Nullable NavigationCallback callback) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        return HTRouterHandler.INSTANCE.getInstance().navigationToDest(postcard, requestCode, callback);
    }

    @NotNull
    public final PostCard build(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return HTRouterHandler.INSTANCE.getInstance().build(uri);
    }

    @Nullable
    public final Object navigation(@Nullable Context context, @NotNull PostCard postcard, int requestCode, @Nullable NavigationCallback callback) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        return HTRouterHandler.INSTANCE.getInstance().navigation(context, postcard, requestCode, callback);
    }
}
