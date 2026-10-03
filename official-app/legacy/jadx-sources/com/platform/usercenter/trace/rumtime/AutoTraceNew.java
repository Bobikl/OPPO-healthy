package com.platform.usercenter.trace.rumtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u001a\u0010\u0011\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/platform/usercenter/trace/rumtime/AutoTraceNew;", "", "builder", "Lcom/platform/usercenter/trace/rumtime/AutoTraceNew$Builder;", "uploadExecutor", "Ljava/util/concurrent/Executor;", "(Lcom/platform/usercenter/trace/rumtime/AutoTraceNew$Builder;Ljava/util/concurrent/Executor;)V", "interceptors", "", "Lcom/platform/usercenter/trace/rumtime/ITraceInterceptor;", "uploadFactory", "Lcom/platform/usercenter/trace/rumtime/IUploadFactory;", "innerUpload", "", "map", "", "", "upload", "Builder", "trace-runtime_release"}, k = 1, mv = {1, 4, 0})
public final class AutoTraceNew {
    private final List<ITraceInterceptor> interceptors;
    private final Executor uploadExecutor;
    private final IUploadFactory uploadFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/platform/usercenter/trace/rumtime/AutoTraceNew$Builder;", "", "uploadFactory", "Lcom/platform/usercenter/trace/rumtime/IUploadFactory;", "(Lcom/platform/usercenter/trace/rumtime/IUploadFactory;)V", "interceptors", "", "Lcom/platform/usercenter/trace/rumtime/ITraceInterceptor;", "getInterceptors", "()Ljava/util/List;", "mUploadExecutor", "Ljava/util/concurrent/Executor;", "getMUploadExecutor", "()Ljava/util/concurrent/Executor;", "setMUploadExecutor", "(Ljava/util/concurrent/Executor;)V", "getUploadFactory", "()Lcom/platform/usercenter/trace/rumtime/IUploadFactory;", "addTraceInterceptor", "interceptor", "create", "Lcom/platform/usercenter/trace/rumtime/AutoTraceNew;", "uploadExecutor", "trace-runtime_release"}, k = 1, mv = {1, 4, 0})
    public static final class Builder {

        @NotNull
        private final List<ITraceInterceptor> interceptors;

        @Nullable
        private Executor mUploadExecutor;

        @NotNull
        private final IUploadFactory uploadFactory;

        public Builder(@NotNull IUploadFactory uploadFactory) {
            Intrinsics.checkNotNullParameter(uploadFactory, "uploadFactory");
            this.uploadFactory = uploadFactory;
            this.interceptors = new ArrayList();
        }

        @NotNull
        public final Builder addTraceInterceptor(@NotNull ITraceInterceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final AutoTraceNew create() {
            return new AutoTraceNew(this, null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final List<ITraceInterceptor> getInterceptors() {
            return this.interceptors;
        }

        @Nullable
        public final Executor getMUploadExecutor() {
            return this.mUploadExecutor;
        }

        @NotNull
        public final IUploadFactory getUploadFactory() {
            return this.uploadFactory;
        }

        public final void setMUploadExecutor(@Nullable Executor executor) {
            this.mUploadExecutor = executor;
        }

        @NotNull
        public final Builder uploadExecutor(@NotNull Executor uploadExecutor) {
            Intrinsics.checkNotNullParameter(uploadExecutor, "uploadExecutor");
            this.mUploadExecutor = uploadExecutor;
            return this;
        }
    }

    public AutoTraceNew(@NotNull Builder builder, @Nullable Executor executor) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.uploadExecutor = executor;
        this.uploadFactory = builder.getUploadFactory();
        this.interceptors = builder.getInterceptors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerUpload(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        Iterator<ITraceInterceptor> it = this.interceptors.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().intercept(linkedHashMap));
        }
        this.uploadFactory.upload(linkedHashMap);
    }

    public final void upload(@NotNull final Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Executor executor = this.uploadExecutor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: com.platform.usercenter.trace.rumtime.AutoTraceNew.upload.1
                @Override // java.lang.Runnable
                public final void run() {
                    AutoTraceNew.this.innerUpload(map);
                }
            });
        } else {
            innerUpload(map);
        }
    }

    public /* synthetic */ AutoTraceNew(Builder builder, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder, (i & 2) != 0 ? builder.getMUploadExecutor() : executor);
    }
}
