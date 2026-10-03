package com.oplus.channel.server.factory;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.channel.server.ClientConfig;
import com.oplus.channel.server.IClientPuller;
import com.oplus.channel.server.IUserContext;
import com.oplus.channel.server.data.CommandDataManager;
import com.oplus.channel.server.factory.AlwaysPuller;
import com.oplus.channel.server.utils.LogUtil;
import com.oplus.channel.server.utils.ServerDI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u000f\u0018\u0000 )2\u00020\u0001:\u0001)B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0016J\u001a\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'H\u0017J\b\u0010(\u001a\u00020\"H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/oplus/channel/server/factory/AlwaysPuller;", "Lcom/oplus/channel/server/IClientPuller;", "serverAuthority", "", "clientName", "clientConfig", "Lcom/oplus/channel/server/ClientConfig;", "(Ljava/lang/String;Ljava/lang/String;Lcom/oplus/channel/server/ClientConfig;)V", "checkRebindCount", "", "getClientConfig", "()Lcom/oplus/channel/server/ClientConfig;", "getClientName", "()Ljava/lang/String;", "connection", "com/oplus/channel/server/factory/AlwaysPuller$connection$1", "Lcom/oplus/channel/server/factory/AlwaysPuller$connection$1;", "contentUrl", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "handler", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "isDestroyed", "", "rebindCount", "userContext", "Lcom/oplus/channel/server/IUserContext;", "checkRebindClient", "", "destroy", "pullClient", "shouldForceFetch", "businessTag", "", "rebindClient", "Companion", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AlwaysPuller implements IClientPuller {
    public static final long INTERVAL_REBIND = 2000;
    public static final int MAX_REBIND_COUNT = 5;
    public static final int NOTIFY_NO_DELAY = 32768;

    @NotNull
    public static final String TAG = "AlwaysPuller";
    private volatile int checkRebindCount;

    @NotNull
    private final ClientConfig clientConfig;

    @NotNull
    private final String clientName;

    @NotNull
    private final AlwaysPuller$connection$1 connection;

    @NotNull
    private final String contentUrl;

    /* JADX INFO: renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy context;

    @Nullable
    private Handler handler;

    @NotNull
    private final HandlerThread handlerThread;
    private volatile boolean isDestroyed;
    private volatile int rebindCount;

    @NotNull
    private final String serverAuthority;

    @Nullable
    private final IUserContext userContext;

    public AlwaysPuller(@NotNull String serverAuthority, @NotNull String clientName, @NotNull ClientConfig clientConfig) {
        Object value;
        Intrinsics.checkNotNullParameter(serverAuthority, "serverAuthority");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(clientConfig, "clientConfig");
        this.serverAuthority = serverAuthority;
        this.clientName = clientName;
        this.clientConfig = clientConfig;
        ServerDI serverDI = ServerDI.INSTANCE;
        if (serverDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class)) == null) {
            throw new IllegalStateException("the class are not injected");
        }
        Lazy<?> lazy = serverDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class));
        if (lazy == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.server.utils.ServerDI.injectSingle>");
        }
        this.context = lazy;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (serverDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(IUserContext.class)) == null) {
                throw new IllegalStateException("the class are not injected");
            }
            Lazy<?> lazy2 = serverDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(IUserContext.class));
            if (lazy2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.server.utils.ServerDI.injectSingle>");
            }
            value = lazy2.getValue();
            this.userContext = (IUserContext) value;
            this.contentUrl = Intrinsics.stringPlus(NotificationApiService.CONTENT, this.serverAuthority);
            HandlerThread handlerThread = new HandlerThread() { // from class: com.oplus.channel.server.factory.AlwaysPuller$handlerThread$1
                {
                    super(AlwaysPuller.TAG);
                }

                @Override // android.os.HandlerThread
                public void onLooperPrepared() {
                    LogUtil.d(AlwaysPuller.TAG, "onLooperPrepared.");
                    super.onLooperPrepared();
                    this.this$0.handler = new Handler(getLooper());
                }
            };
            this.handlerThread = handlerThread;
            this.connection = new AlwaysPuller$connection$1(this);
            handlerThread.start();
            rebindClient();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                LogUtil.d(ServerDI.TAG, Intrinsics.stringPlus("injectNullable：iUserContext exception ", thM5290exceptionOrNullimpl.getMessage()));
            }
            value = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkRebindClient() {
        if (this.checkRebindCount > 5 || this.rebindCount == 0) {
            LogUtil.d(TAG, "checkRebindClient: reach the max rebind count, return");
            return;
        }
        Handler handler = this.handler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.f10
            @Override // java.lang.Runnable
            public final void run() {
                AlwaysPuller.m5169checkRebindClient$lambda0(this.i);
            }
        }, ((long) (this.checkRebindCount + 1)) * 2000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkRebindClient$lambda-0, reason: not valid java name */
    public static final void m5169checkRebindClient$lambda0(AlwaysPuller this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogUtil.d(TAG, Intrinsics.stringPlus("checkRebindClient, checkRebindCount=", Integer.valueOf(this$0.checkRebindCount)));
        if (this$0.isDestroyed || !this$0.getClientConfig().getNeedKeepAlive() || this$0.rebindCount <= 0) {
            return;
        }
        this$0.rebindClient();
        this$0.checkRebindCount++;
        this$0.checkRebindClient();
    }

    private final Context getContext() {
        return (Context) this.context.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rebindClient() {
        LogUtil.i(TAG, "rebindClient, clientName=" + getClientName() + ", aliveType=" + this.clientConfig.getAliveType() + ", needKeepAlive=" + this.clientConfig.getNeedKeepAlive());
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.clientConfig.getClientPackage(), this.clientConfig.getServiceComponent()));
        Unit unit = null;
        if (this.clientConfig.getAliveType() == 3) {
            IUserContext iUserContext = this.userContext;
            if (iUserContext != null) {
                iUserContext.bindService(intent, this.connection, 1);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                getContext().bindService(intent, this.connection, 1);
                return;
            }
            return;
        }
        IUserContext iUserContext2 = this.userContext;
        if (iUserContext2 != null) {
            iUserContext2.bindService(intent, this.connection, 33);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            getContext().bindService(intent, this.connection, 33);
        }
    }

    @Override // com.oplus.channel.server.IClientPuller
    public void destroy() {
        Object objM5287constructorimpl;
        Unit unit;
        LogUtil.i(TAG, "destroy");
        this.isDestroyed = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            AlwaysPuller$connection$1 alwaysPuller$connection$1 = this.connection;
            IUserContext iUserContext = this.userContext;
            if (iUserContext == null) {
                unit = null;
            } else {
                iUserContext.unbindService(alwaysPuller$connection$1);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                getContext().unbindService(alwaysPuller$connection$1);
            }
            objM5287constructorimpl = Result.m5287constructorimpl(alwaysPuller$connection$1);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            LogUtil.e(TAG, Intrinsics.stringPlus("destroy, unbindService error:", thM5290exceptionOrNullimpl.getMessage()));
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.handlerThread.quitSafely();
    }

    @NotNull
    public final ClientConfig getClientConfig() {
        return this.clientConfig;
    }

    @Override // com.oplus.channel.server.IClientPuller
    @NotNull
    public String getClientName() {
        return this.clientName;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:63:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.channel.server.IClientPuller
    @SuppressLint({"WrongConstant"})
    public boolean pullClient(boolean shouldForceFetch, @Nullable Object businessTag) throws Throwable {
        Throwable th;
        Exception e2;
        Unit unit;
        LogUtil.i(TAG, "pullClient, businessTag=" + businessTag + ", shouldForceFetch = [" + shouldForceFetch + "] clientName = [" + getClientName() + "], clientConfig=" + this.clientConfig);
        boolean z = true;
        ContentProviderClient contentProviderClient = null;
        contentProviderClient = null;
        if (!shouldForceFetch) {
            String str = this.contentUrl + "/pull/" + getClientName();
            IUserContext iUserContext = this.userContext;
            if (iUserContext == null) {
                unit = null;
            } else {
                Uri uri = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(uri)");
                iUserContext.notifyChange(uri, null, 32768);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                getContext().getContentResolver().notifyChange(Uri.parse(str), (ContentObserver) null, 32768);
            }
            return true;
        }
        CommandDataManager commandDataManager = CommandDataManager.INSTANCE;
        CommandDataManager.CacheCommandData cacheCommandDataQueryCacheCommandData = commandDataManager.queryCacheCommandData(getClientName());
        if (cacheCommandDataQueryCacheCommandData != null) {
            try {
                try {
                    cacheCommandDataQueryCacheCommandData.acquireLock();
                } catch (Exception e3) {
                    e2 = e3;
                    LogUtil.e(TAG, "pullClient, businessTag=" + businessTag + ", error e = [" + e2 + ']');
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    if (cacheCommandDataQueryCacheCommandData == null) {
                        return false;
                    }
                    cacheCommandDataQueryCacheCommandData.releaseLock();
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
                if (cacheCommandDataQueryCacheCommandData != null) {
                    cacheCommandDataQueryCacheCommandData.releaseLock();
                }
                throw th;
            }
        }
        IUserContext iUserContext2 = this.userContext;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = iUserContext2 == null ? null : iUserContext2.acquireUnstableContentProviderClient(this.clientConfig.getProviderAuthority());
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            contentProviderClientAcquireUnstableContentProviderClient = getContext().getContentResolver().acquireUnstableContentProviderClient(this.clientConfig.getProviderAuthority());
        }
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                LogUtil.e(TAG, "pullClient, businessTag=" + businessTag + ", " + getClientName() + " == null");
                if (cacheCommandDataQueryCacheCommandData != null) {
                    cacheCommandDataQueryCacheCommandData.releaseLock();
                }
                return false;
            }
            Bundle bundleEncodeCacheCommandData = cacheCommandDataQueryCacheCommandData != null ? cacheCommandDataQueryCacheCommandData.encodeCacheCommandData(getClientName(), businessTag) : null;
            if (bundleEncodeCacheCommandData != null) {
                bundleEncodeCacheCommandData.putBoolean("RESULT_BATCH_CALLBACK_SUPPORT", true);
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("pull", getClientName(), bundleEncodeCacheCommandData);
                if ((bundleCall != null && bundleCall.getBoolean("consumed")) != false) {
                    commandDataManager.removeCachedCommandData(getClientName(), businessTag);
                }
                LogUtil.i(TAG, "pullClient, businessTag=" + businessTag + ", clientName=[" + getClientName() + "] result=[" + bundleCall + ']');
                if (bundleCall != null) {
                }
                contentProviderClientAcquireUnstableContentProviderClient.close();
                if (cacheCommandDataQueryCacheCommandData != null) {
                    cacheCommandDataQueryCacheCommandData.releaseLock();
                }
                return z;
            }
            LogUtil.w(TAG, "pullClient, businessTag=" + businessTag + ", clientName=[" + getClientName() + "] encodeCommandData = null");
            z = false;
            contentProviderClientAcquireUnstableContentProviderClient.close();
            if (cacheCommandDataQueryCacheCommandData != null) {
                cacheCommandDataQueryCacheCommandData.releaseLock();
            }
            return z;
        } catch (Exception e4) {
            e2 = e4;
            contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            LogUtil.e(TAG, "pullClient, businessTag=" + businessTag + ", error e = [" + e2 + ']');
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
            if (cacheCommandDataQueryCacheCommandData == null) {
                return false;
            }
            cacheCommandDataQueryCacheCommandData.releaseLock();
            return false;
        } catch (Throwable th3) {
            th = th3;
            contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
            if (cacheCommandDataQueryCacheCommandData != null) {
                cacheCommandDataQueryCacheCommandData.releaseLock();
            }
            throw th;
        }
    }
}
