package com.heytap.health.rpc.host;

import com.heytap.health.rpc.RpcMsg;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.t6c;
import io.protostuff.MapSchema;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\n\u0005\u000eB'\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\u000e\u001a\u00020\u00042\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/health/rpc/host/e;", "", "Lcom/oplus/aiunit/vision/t6c;", "sendCallback", "", "b", "Lcom/heytap/health/rpc/host/RpcMsgAPI$a;", "callback", "", "timeout", "a", "Ljava/lang/Exception;", "Lkotlin/Exception;", MapSchema.FIELD_NAME_ENTRY, "c", "Lcom/heytap/health/rpc/host/IRpcMsgApi;", "Lcom/heytap/health/rpc/host/IRpcMsgApi;", oea.FEATURE_API_REQUEST, "I", "getAppId", "()I", "appId", "Lcom/heytap/health/rpc/RpcMsg;", "Lcom/heytap/health/rpc/RpcMsg;", "getMsg", "()Lcom/heytap/health/rpc/RpcMsg;", "msg", "Lcom/heytap/health/rpc/host/a;", "d", "Lcom/heytap/health/rpc/host/a;", EngineConstant.TIPS_TYPE_PROCESSOR, "<init>", "(Lcom/heytap/health/rpc/host/IRpcMsgApi;ILcom/heytap/health/rpc/RpcMsg;Lcom/heytap/health/rpc/host/a;)V", "Companion", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public final class e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final IRpcMsgApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int appId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RpcMsg msg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final a processor;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/rpc/host/e$b;", "Lcom/heytap/health/rpc/host/RpcMsgAPI$a;", "", "msgId", "", "isSuccess", "", "b", "Lcom/heytap/health/rpc/host/b;", "result", "a", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancellableContinuation;", "mCoroutine", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRpcMsgRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RpcMsgRequest.kt\ncom/heytap/health/rpc/host/RpcMsgRequest$CoroutineCallbackTask\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,122:1\n314#2,11:123\n*S KotlinDebug\n*F\n+ 1 RpcMsgRequest.kt\ncom/heytap/health/rpc/host/RpcMsgRequest$CoroutineCallbackTask\n*L\n83#1:123,11\n*E\n"})
    public static final class b implements RpcMsgAPI.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public CancellableContinuation<? super RespMsgResult> mCoroutine;

        @Override // com.heytap.health.rpc.host.RpcMsgAPI.b
        public void a(@NotNull RespMsgResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            CancellableContinuation<? super RespMsgResult> cancellableContinuation = this.mCoroutine;
            if (cancellableContinuation != null) {
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(result));
            }
        }

        @Override // com.oplus.aiunit.vision.t6c
        public void b(int msgId, boolean isSuccess) {
            CancellableContinuation<? super RespMsgResult> cancellableContinuation;
            if (isSuccess || (cancellableContinuation = this.mCoroutine) == null) {
                return;
            }
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(RespMsgResult.INSTANCE.a()));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/rpc/host/e$c;", "Lcom/oplus/aiunit/vision/t6c;", "", "msgId", "", "isSuccess", "", "b", "Lkotlinx/coroutines/CancellableContinuation;", "a", "Lkotlinx/coroutines/CancellableContinuation;", "mCoroutine", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRpcMsgRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RpcMsgRequest.kt\ncom/heytap/health/rpc/host/RpcMsgRequest$CoroutineSendCallbackTask\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,122:1\n314#2,11:123\n*S KotlinDebug\n*F\n+ 1 RpcMsgRequest.kt\ncom/heytap/health/rpc/host/RpcMsgRequest$CoroutineSendCallbackTask\n*L\n108#1:123,11\n*E\n"})
    public static final class c implements t6c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public CancellableContinuation<? super Boolean> mCoroutine;

        @Override // com.oplus.aiunit.vision.t6c
        public void b(int msgId, boolean isSuccess) {
            CancellableContinuation<? super Boolean> cancellableContinuation = this.mCoroutine;
            if (cancellableContinuation != null) {
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(Boolean.valueOf(isSuccess)));
            }
        }
    }

    public e(@NotNull IRpcMsgApi api, int i, @NotNull RpcMsg msg, @NotNull a processor) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(processor, "processor");
        this.api = api;
        this.appId = i;
        this.msg = msg;
        this.processor = processor;
    }

    public final void a(@NotNull RpcMsgAPI.a callback, int timeout) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.processor.g(new a.C0541a(new a.MsgTag(this.appId, this.msg.getMsgId()), callback, callback, Integer.valueOf(timeout)));
        try {
            this.api.sendMsg(this.appId, this.msg);
        } catch (Exception e2) {
            c(e2);
            this.processor.e(this.msg.getMsgId(), false);
        }
    }

    public final void b(@NotNull t6c sendCallback) {
        Intrinsics.checkNotNullParameter(sendCallback, "sendCallback");
        this.processor.g(new a.C0541a(new a.MsgTag(this.appId, this.msg.getMsgId()), sendCallback, null, null, 12, null));
        try {
            this.api.sendMsg(this.appId, this.msg);
        } catch (Exception e2) {
            c(e2);
            this.processor.e(this.msg.getMsgId(), false);
        }
    }

    public final void c(Exception e2) {
        a7b.b("RpcLog-RpcRequest", "Send msg exception, e=" + e2);
    }
}
