package com.heytap.health.devicepair.manager;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.zv8;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J \u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0004J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003J\b\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0013\u0010\n\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0006H\u0016J\"\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0004J\b\u0010\u0015\u001a\u00020\u0014H\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010&\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\u0014\u0010)\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/heytap/health/devicepair/manager/a;", "", "Lkotlinx/coroutines/CancellableContinuation;", "Lcom/heytap/health/devicepair/manager/ResultData;", "continuation", BridgeConstant.KEY_RESULT_DATA, "", LogFieldKey.LEVEL_KEY, "o", b2n.f, "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "", "code", "Lcom/heytap/health/devicepair/manager/ResultData$PairFailType;", "reasontype", "", "msg", "b", "", "i", "Lcom/heytap/health/devicepair/manager/PairContext;", "Lcom/heytap/health/devicepair/manager/PairContext;", "d", "()Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "Lcom/heytap/health/devicepair/manager/ResultData;", "taskResultData", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/devicepair/manager/a;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/devicepair/manager/a;", "n", "(Lcom/heytap/health/devicepair/manager/a;)V", "preTask", "getNextTask", LogFieldKey.MESSAGE_KEY, "nextTask", "f", "()Ljava/lang/String;", "TAG", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbsPairTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsPairTask.kt\ncom/heytap/health/devicepair/manager/AbsPairTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public abstract class a {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final PairContext pairContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ResultData taskResultData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public a preTask;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a nextTask;

    public a(@NotNull PairContext pairContext) {
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.pairContext = pairContext;
    }

    public static /* synthetic */ ResultData c(a aVar, int i, ResultData.PairFailType pairFailType, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFailResult");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return aVar.b(i, pairFailType, str);
    }

    @Nullable
    public abstract Object a(@NotNull Continuation<? super ResultData> continuation);

    @NotNull
    public final ResultData b(int code, @NotNull ResultData.PairFailType reasontype, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(reasontype, "reasontype");
        Intrinsics.checkNotNullParameter(msg, "msg");
        return ResultData.INSTANCE.a(code, new ResultData.PairExpandBean(reasontype, msg));
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final PairContext getPairContext() {
        return this.pairContext;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getPreTask() {
        return this.preTask;
    }

    @NotNull
    public abstract String f();

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final ResultData getTaskResultData() {
        return this.taskResultData;
    }

    public final boolean i() {
        return Intrinsics.areEqual(zv8.API_PATH, zv8.TEST_HOST);
    }

    public void j() {
        this.taskResultData = null;
    }

    public final void l(@Nullable CancellableContinuation<? super ResultData> continuation, @NotNull ResultData resultData) {
        Unit unit;
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        if (continuation != null) {
            if (continuation.isActive()) {
                continuation.resumeWith(Result.m5287constructorimpl(resultData));
            } else {
                ml4.c(f(), resultData.getPairExpandBean() + ",coroutine is not Active");
            }
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ml4.c(f(), resultData.getPairExpandBean() + ",coroutine is null");
        }
    }

    public final void m(@Nullable a aVar) {
        this.nextTask = aVar;
    }

    public final void n(@Nullable a aVar) {
        this.preTask = aVar;
    }

    @NotNull
    public final ResultData o(@NotNull ResultData resultData) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        this.taskResultData = resultData;
        return resultData;
    }
}
