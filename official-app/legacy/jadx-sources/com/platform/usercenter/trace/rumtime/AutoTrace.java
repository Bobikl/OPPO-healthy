package com.platform.usercenter.trace.rumtime;

import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated(level = DeprecationLevel.WARNING, message = "埋点信息是单例，当多个业务集成时，会有前后顺序的问题，该工具只是辅助上报信息使用,上报由业务自行决定，可以自行把该类拷贝出来使用", replaceWith = @ReplaceWith(expression = "替换方法，可以查看 [AutoTraceNew] 的使用", imports = {}))
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/platform/usercenter/trace/rumtime/AutoTrace;", "", "()V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor$delegate", "Lkotlin/Lazy;", "interceptors", "", "Lcom/platform/usercenter/trace/rumtime/ITraceInterceptor;", "traceList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "", "", "uploadExecutor", "uploadFactory", "Lcom/platform/usercenter/trace/rumtime/IUploadFactory;", "upload", "", "map", "Builder", "Companion", "trace-runtime_release"}, k = 1, mv = {1, 4, 0})
public final class AutoTrace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AutoTrace INSTANCE;
    private List<? extends ITraceInterceptor> interceptors;
    private Executor uploadExecutor;
    private IUploadFactory uploadFactory;

    /* JADX INFO: renamed from: executor$delegate, reason: from kotlin metadata */
    private final Lazy executor = LazyKt__LazyJVMKt.lazy(new Function0<ExecutorService>() { // from class: com.platform.usercenter.trace.rumtime.AutoTrace$executor$2
        @Override // p010kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });
    private final CopyOnWriteArrayList<Map<String, String>> traceList = new CopyOnWriteArrayList<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/platform/usercenter/trace/rumtime/AutoTrace$Builder;", "", "()V", "interceptors", "", "Lcom/platform/usercenter/trace/rumtime/ITraceInterceptor;", "mUploadExecutor", "Ljava/util/concurrent/Executor;", "uploadFactory", "Lcom/platform/usercenter/trace/rumtime/IUploadFactory;", "addTraceInterceptor", "interceptor", "create", "Lcom/platform/usercenter/trace/rumtime/AutoTrace;", "setUploadExecutor", "uploadExecutor", "factory", "trace-runtime_release"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {
        private final List<ITraceInterceptor> interceptors = new ArrayList();
        private Executor mUploadExecutor;
        private IUploadFactory uploadFactory;

        @NotNull
        public final Builder addTraceInterceptor(@NotNull ITraceInterceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        public final AutoTrace create() {
            if (this.uploadFactory == null) {
                throw new NullPointerException("please set uploadFactory");
            }
            AutoTrace autoTrace = AutoTrace.INSTANCE.get();
            if (autoTrace.uploadFactory != null) {
                return autoTrace;
            }
            Executor executor = this.mUploadExecutor;
            if (executor != null) {
                autoTrace.uploadExecutor = executor;
            }
            IUploadFactory iUploadFactory = this.uploadFactory;
            Intrinsics.checkNotNull(iUploadFactory);
            autoTrace.uploadFactory = iUploadFactory;
            autoTrace.interceptors = CollectionsKt___CollectionsKt.toList(this.interceptors);
            for (Map<String, String> it : autoTrace.traceList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                autoTrace.upload(it);
            }
            return autoTrace;
        }

        @NotNull
        public final Builder setUploadExecutor(@NotNull Executor uploadExecutor) {
            Intrinsics.checkNotNullParameter(uploadExecutor, "uploadExecutor");
            this.mUploadExecutor = uploadExecutor;
            return this;
        }

        @NotNull
        public final Builder uploadFactory(@NotNull IUploadFactory factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            this.uploadFactory = factory;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/platform/usercenter/trace/rumtime/AutoTrace$Companion;", "", "()V", "INSTANCE", "Lcom/platform/usercenter/trace/rumtime/AutoTrace;", ParserTag.TAG_GET, "trace-runtime_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AutoTrace get() {
            AutoTrace autoTrace;
            AutoTrace autoTrace2 = AutoTrace.INSTANCE;
            if (autoTrace2 != null) {
                return autoTrace2;
            }
            synchronized (this) {
                autoTrace = new AutoTrace();
                AutoTrace.INSTANCE = autoTrace;
            }
            return autoTrace;
        }
    }

    private final Executor getExecutor() {
        return (Executor) this.executor.getValue();
    }

    public final void upload(@NotNull final Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        if (this.uploadExecutor == null) {
            this.uploadExecutor = getExecutor();
        }
        Executor executor = this.uploadExecutor;
        Intrinsics.checkNotNull(executor);
        executor.execute(new Runnable() { // from class: com.platform.usercenter.trace.rumtime.AutoTrace.upload.1
            @Override // java.lang.Runnable
            public final void run() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(map);
                List list = AutoTrace.this.interceptors;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.putAll(((ITraceInterceptor) it.next()).intercept(linkedHashMap));
                    }
                }
                if (AutoTrace.this.uploadFactory == null) {
                    AutoTrace.this.traceList.add(linkedHashMap);
                    return;
                }
                for (Map it2 : AutoTrace.this.traceList) {
                    Intrinsics.checkNotNullExpressionValue(it2, "it");
                    linkedHashMap.putAll(it2);
                    IUploadFactory iUploadFactory = AutoTrace.this.uploadFactory;
                    Intrinsics.checkNotNull(iUploadFactory);
                    iUploadFactory.upload(linkedHashMap);
                }
                AutoTrace.this.traceList.clear();
                IUploadFactory iUploadFactory2 = AutoTrace.this.uploadFactory;
                Intrinsics.checkNotNull(iUploadFactory2);
                iUploadFactory2.upload(linkedHashMap);
            }
        });
    }
}
