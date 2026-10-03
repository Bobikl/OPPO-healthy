package com.oplus.aiunit.vision;

import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/o45;", "Lcom/oplus/aiunit/vision/aq9;", "Ljava/util/concurrent/ExecutorService;", "c", "a", "b", "Ljava/util/concurrent/ExecutorService;", "commonExecutor", "uploadExecutor", "receiveExecutor", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class o45 implements aq9 {

    @NotNull
    public static final String TAG_AGENT_MESSAGE = "AGENT_MESSAGE";

    @NotNull
    public static final String TAG_COMMON = "CONNECT_COMMON";

    @NotNull
    public static final String TAG_ENGINE = "ENGINE";

    @NotNull
    public static final String TAG_OPERATION_DEFAULT = "OPERATION_DEFAULT";

    @NotNull
    public static final String TAG_RECEIVE = "CONNECT_RECEIVE";

    @NotNull
    public static final String TAG_UPLOAD = "CONNECT_UPLOAD";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public ExecutorService commonExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public ExecutorService uploadExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ExecutorService receiveExecutor;

    @Override // com.oplus.aiunit.vision.aq9
    @NotNull
    public ExecutorService a() {
        if (this.uploadExecutor == null) {
            this.uploadExecutor = new hg4(1, TAG_UPLOAD, 10);
        }
        ExecutorService executorService = this.uploadExecutor;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    @Override // com.oplus.aiunit.vision.aq9
    @NotNull
    public ExecutorService b() {
        if (this.receiveExecutor == null) {
            this.receiveExecutor = new hg4(1, TAG_RECEIVE, 10);
        }
        ExecutorService executorService = this.receiveExecutor;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    @Override // com.oplus.aiunit.vision.aq9
    @NotNull
    public ExecutorService c() {
        if (this.commonExecutor == null) {
            this.commonExecutor = new hg4(3, TAG_COMMON, 10);
        }
        ExecutorService executorService = this.commonExecutor;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }
}
