package com.heytap.health.devicelog.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.FieldAttributes;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.file.LogKitProto$LogKitActionReq;
import com.heytap.health.protocol.file.LogKitProto$LogKitStateRsp;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.LogGetParam;
import com.oplus.aiunit.vision.LogGetResult;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.rl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/devicelog/feedback/TellDeviceUploadLog;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/b6b;", "Lcom/oplus/aiunit/vision/c6b;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "", "b", "(Lcom/oplus/aiunit/vision/b6b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLogGetInterceptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogGetInterceptors.kt\ncom/heytap/health/devicelog/feedback/TellDeviceUploadLog\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,398:1\n314#2,11:399\n*S KotlinDebug\n*F\n+ 1 LogGetInterceptors.kt\ncom/heytap/health/devicelog/feedback/TellDeviceUploadLog\n*L\n354#1:399,11\n*E\n"})
public final class TellDeviceUploadLog implements gea<LogGetParam, LogGetResult> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/devicelog/feedback/TellDeviceUploadLog$a", "Lcom/oplus/aiunit/vision/rl4$b;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements rl4.b {
        public final /* synthetic */ CancellableContinuation<String> i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super String> cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.rl4.b
        public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            LogKitProto$LogKitStateRsp from = LogKitProto$LogKitStateRsp.parseFrom(event.getData());
            a7b.f(Feedback.INSTANCE.a(), "TellDeviceUploadLog@" + hashCode() + " onMessageReceived -> " + from);
            int action = from.getAction();
            if (action == 5) {
                gl4.devicePrimary.messageApi.t(28, 1, this);
                CancellableContinuation<String> cancellableContinuation = this.i;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(new JSONObject(from.getParam()).optString("msg")));
                return;
            }
            if (action != 6) {
                return;
            }
            gl4.devicePrimary.messageApi.t(28, 1, this);
            CancellableContinuation<String> cancellableContinuation2 = this.i;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException(new JSONObject(from.getParam()).optString("msg")))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<LogGetParam, LogGetResult> aVar, @NotNull Continuation<? super LogGetResult> continuation) {
        TellDeviceUploadLog$intercept$1 tellDeviceUploadLog$intercept$1;
        if (continuation instanceof TellDeviceUploadLog$intercept$1) {
            tellDeviceUploadLog$intercept$1 = (TellDeviceUploadLog$intercept$1) continuation;
            int i = tellDeviceUploadLog$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tellDeviceUploadLog$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                tellDeviceUploadLog$intercept$1 = new TellDeviceUploadLog$intercept$1(this, continuation);
            }
        } else {
            tellDeviceUploadLog$intercept$1 = new TellDeviceUploadLog$intercept$1(this, continuation);
        }
        Object objB = tellDeviceUploadLog$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = tellDeviceUploadLog$intercept$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            LogGetParam logGetParam = (LogGetParam) aVar.request();
            if (!logGetParam.getFbOption().getCollectLog()) {
                throw new IllegalStateException("流程异常");
            }
            tellDeviceUploadLog$intercept$1.label = 1;
            objB = b(logGetParam, tellDeviceUploadLog$intercept$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objB);
        }
        return new LogGetResult((String) objB);
    }

    public final Object b(LogGetParam logGetParam, Continuation<? super String> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.f(28, 1, new a(cancellableContinuationImpl));
        LogKitProto$LogKitActionReq.Builder action = LogKitProto$LogKitActionReq.newBuilder().setAction(4);
        FeedbackOption fbOption = logGetParam.getFbOption();
        LogKitProto$LogKitActionReq logKitProto$LogKitActionReqBuild = action.setParam(ExpandKt.e(fbOption.copy((3839 & 1) != 0 ? fbOption.bugDetail : null, (3839 & 2) != 0 ? fbOption.contact : null, (3839 & 4) != 0 ? fbOption.recentTime : null, (3839 & 8) != 0 ? fbOption.feedbackTime : 0L, (3839 & 16) != 0 ? fbOption.reproduceRate : null, (3839 & 32) != 0 ? fbOption.logNames : null, (3839 & 64) != 0 ? fbOption.medias : null, (3839 & 128) != 0 ? fbOption.fileKeys : logGetParam.d(), (3839 & 256) != 0 ? fbOption.uploadFailFiles : null, (3839 & 512) != 0 ? fbOption.collectLog : false, (3839 & 1024) != 0 ? fbOption.logType : null, (3839 & 2048) != 0 ? fbOption.fid : null), new Function1<FieldAttributes, Boolean>() { // from class: com.heytap.health.devicelog.feedback.TellDeviceUploadLog$awaitResult$2$tellDeviceUploadLog$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull FieldAttributes toJson) {
                Intrinsics.checkNotNullParameter(toJson, "$this$toJson");
                return Boolean.valueOf(Intrinsics.areEqual(toJson.getName(), "fid") || Intrinsics.areEqual(toJson.getName(), "uploadFailFiles"));
            }
        })).build();
        a7b.f(Feedback.INSTANCE.a(), "TellDeviceUploadLog@" + hashCode() + " tellDeviceUploadLog -> " + logKitProto$LogKitActionReqBuild);
        bm5Var.messageApi.b(new MessageEvent(28, 1, logKitProto$LogKitActionReqBuild.toByteArray()));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
