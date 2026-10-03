package com.heytap.store.platform.htrouter.core;

import android.content.Context;
import com.heytap.store.platform.htrouter.base.InternalGlobalLogger;
import com.heytap.store.platform.htrouter.exception.HandlerException;
import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback;
import com.heytap.store.platform.htrouter.facade.service.InterceptorService;
import com.heytap.store.platform.htrouter.facade.template.IInterceptor;
import com.heytap.store.platform.htrouter.thread.CancelableCountDownLatch;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Route(path = "/htrouter/service/interceptor")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/store/platform/htrouter/core/InterceptorServiceImpl;", "Lcom/heytap/store/platform/htrouter/facade/service/InterceptorService;", "()V", "doInterceptions", "", "postcard", "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "callback", "Lcom/heytap/store/platform/htrouter/facade/callback/InterceptorCallback;", "init", "context", "Landroid/content/Context;", "Companion", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public final class InterceptorServiceImpl implements InterceptorService {
    private static boolean interceptorHasInit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object interceptorInitLock = new Object();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/platform/htrouter/core/InterceptorServiceImpl$Companion;", "", "()V", "interceptorHasInit", "", "interceptorInitLock", "Ljava/lang/Object;", "checkInterceptorsInitStatus", "", "executeInterceptor", "index", "", "counter", "Lcom/heytap/store/platform/htrouter/thread/CancelableCountDownLatch;", "postcard", "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkInterceptorsInitStatus() {
            synchronized (InterceptorServiceImpl.interceptorInitLock) {
                while (!InterceptorServiceImpl.interceptorHasInit) {
                    try {
                        InterceptorServiceImpl.interceptorInitLock.wait(10000L);
                    } catch (InterruptedException e2) {
                        throw new HandlerException("HTRouter::Interceptor init cost too much time error! reason = [" + e2.getMessage());
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void executeInterceptor(final int index, final CancelableCountDownLatch counter, final PostCard postcard) {
            WareHouse wareHouse = WareHouse.INSTANCE;
            if (index < wareHouse.getInterceptors().size()) {
                IInterceptor iInterceptor = wareHouse.getInterceptors().get(index);
                Intrinsics.checkNotNullExpressionValue(iInterceptor, "WareHouse.interceptors[index]");
                iInterceptor.process(postcard, new InterceptorCallback() { // from class: com.heytap.store.platform.htrouter.core.InterceptorServiceImpl$Companion$executeInterceptor$1
                    @Override // com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback
                    public void onContinue(@NotNull PostCard postcard2) {
                        Intrinsics.checkNotNullParameter(postcard2, "postcard");
                        counter.countDown();
                        InterceptorServiceImpl.INSTANCE.executeInterceptor(index + 1, counter, postcard2);
                    }

                    @Override // com.heytap.store.platform.htrouter.facade.callback.InterceptorCallback
                    public void onInterrupt(@Nullable Throwable exception) {
                        PostCard postCard = postcard;
                        if (exception == null) {
                            exception = new HandlerException(JsonResponse.DEFAULT_ERROR_MSG);
                        }
                        postCard.setTag(exception);
                        counter.cancel();
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class a implements Runnable {
        public final /* synthetic */ PostCard i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ InterceptorCallback f8267j;

        public a(PostCard postCard, InterceptorCallback interceptorCallback) {
            this.i = postCard;
            this.f8267j = interceptorCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CancelableCountDownLatch cancelableCountDownLatch = new CancelableCountDownLatch(WareHouse.INSTANCE.getInterceptors().size());
            try {
                InterceptorServiceImpl.INSTANCE.executeInterceptor(0, cancelableCountDownLatch, this.i);
                cancelableCountDownLatch.await(this.i.getTimeout(), TimeUnit.SECONDS);
                if (cancelableCountDownLatch.getCount() > 0) {
                    this.f8267j.onInterrupt(new HandlerException("The interceptor processing timed out!"));
                } else if (this.i.getTag() != null) {
                    InterceptorCallback interceptorCallback = this.f8267j;
                    Object tag = this.i.getTag();
                    if (!(tag instanceof Throwable)) {
                        tag = null;
                    }
                    interceptorCallback.onInterrupt((Throwable) tag);
                } else {
                    this.f8267j.onContinue(this.i);
                }
            } catch (Exception e2) {
                this.f8267j.onInterrupt(e2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
    public static final class b implements Runnable {
        public final /* synthetic */ Context i;

        public b(Context context) {
            this.i = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WareHouse wareHouse = WareHouse.INSTANCE;
            if (!wareHouse.getInterceptorsIndex().isEmpty()) {
                for (Map.Entry<Integer, Class<? extends IInterceptor>> entry : wareHouse.getInterceptorsIndex().entrySet()) {
                    entry.getKey().intValue();
                    Class<? extends IInterceptor> value = entry.getValue();
                    try {
                        IInterceptor iInterceptorNewInstance = value.getConstructor(new Class[0]).newInstance(new Object[0]);
                        iInterceptorNewInstance.init(this.i);
                        WareHouse.INSTANCE.getInterceptors().add(iInterceptorNewInstance);
                    } catch (Exception e2) {
                        throw new HandlerException("HTRouter:: HTRouter init interceptor error! name = [" + value.getName() + "], reason = [" + e2.getMessage() + ']');
                    }
                }
                InterceptorServiceImpl.interceptorHasInit = true;
                InternalGlobalLogger.INSTANCE.getINSTANCE().info("HTRouter::", "HTRouter interceptors init over. ");
                synchronized (InterceptorServiceImpl.interceptorInitLock) {
                    InterceptorServiceImpl.interceptorInitLock.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    @Override // com.heytap.store.platform.htrouter.facade.service.InterceptorService
    public void doInterceptions(@NotNull PostCard postcard, @NotNull InterceptorCallback callback) {
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(!WareHouse.INSTANCE.getInterceptorsIndex().isEmpty())) {
            callback.onContinue(postcard);
            return;
        }
        INSTANCE.checkInterceptorsInitStatus();
        if (!interceptorHasInit) {
            callback.onInterrupt(new HandlerException("Interceptors initialization takes too much time"));
        }
        LogisticsCenter.INSTANCE.getExecutor().execute(new a(postcard, callback));
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        LogisticsCenter.INSTANCE.getExecutor().execute(new b(context));
    }
}
