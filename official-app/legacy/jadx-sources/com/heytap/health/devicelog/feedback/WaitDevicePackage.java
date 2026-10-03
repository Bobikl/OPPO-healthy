package com.heytap.health.devicelog.feedback;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.protocol.file.LogKitProto$LogKitActionReq;
import com.heytap.health.protocol.file.LogKitProto$LogKitStateRsp;
import com.oplus.aiunit.vision.LogGetParam;
import com.oplus.aiunit.vision.LogGetResult;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.bm5;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.mtj;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.ul4;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/devicelog/feedback/WaitDevicePackage;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/b6b;", "Lcom/oplus/aiunit/vision/c6b;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "", "deviceLogGetProgress", "", "c", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLogGetInterceptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogGetInterceptors.kt\ncom/heytap/health/devicelog/feedback/WaitDevicePackage\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,398:1\n314#2,11:399\n*S KotlinDebug\n*F\n+ 1 LogGetInterceptors.kt\ncom/heytap/health/devicelog/feedback/WaitDevicePackage\n*L\n63#1:399,11\n*E\n"})
public final class WaitDevicePackage implements gea<LogGetParam, LogGetResult> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/devicelog/feedback/WaitDevicePackage$a", "Lcom/oplus/aiunit/vision/rl4$b;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "onMessageReceived", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements rl4.b {
        public final /* synthetic */ CancellableContinuation<String> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Float> f4021j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super String> cancellableContinuation, MutableLiveData<Float> mutableLiveData) {
            this.i = cancellableContinuation;
            this.f4021j = mutableLiveData;
        }

        @Override // com.oplus.aiunit.vision.rl4.b
        public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            LogKitProto$LogKitStateRsp from = LogKitProto$LogKitStateRsp.parseFrom(event.getData());
            a7b.f(Feedback.INSTANCE.a(), "notifyDeviceFinishLog onMessageReceived " + from);
            if (from.getAction() != 3) {
                if (from.getAction() == 2) {
                    this.f4021j.postValue(Float.valueOf(from.getProgress() * 0.002f));
                    return;
                }
                return;
            }
            gl4.devicePrimary.messageApi.t(28, 1, this);
            if (mtj.b(from.getFileName())) {
                throw new RuntimeException("fileName is null when package finished");
            }
            if (this.i.isActive()) {
                CancellableContinuation<String> cancellableContinuation = this.i;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(from.getFileName()));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/devicelog/feedback/WaitDevicePackage$b", "Lcom/oplus/aiunit/vision/ul4$a;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "onPeerConnected", "onPeerDisconnected", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ul4.a {
        public final /* synthetic */ CancellableContinuation<String> i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(CancellableContinuation<? super String> cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerConnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            a7b.f(Feedback.INSTANCE.a(), "notifyDeviceFinishLog onPeerConnected");
        }

        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerDisconnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            a7b.f(Feedback.INSTANCE.a(), "notifyDeviceFinishLog onPeerDisconnected");
            CancellableContinuation<String> cancellableContinuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException("Disconnected"))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<LogGetParam, LogGetResult> aVar, @NotNull Continuation<? super LogGetResult> continuation) throws Exception {
        WaitDevicePackage$intercept$1 waitDevicePackage$intercept$1;
        LogGetParam logGetParam;
        LogGetParam logGetParam2;
        if (continuation instanceof WaitDevicePackage$intercept$1) {
            waitDevicePackage$intercept$1 = (WaitDevicePackage$intercept$1) continuation;
            int i = waitDevicePackage$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                waitDevicePackage$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                waitDevicePackage$intercept$1 = new WaitDevicePackage$intercept$1(this, continuation);
            }
        } else {
            waitDevicePackage$intercept$1 = new WaitDevicePackage$intercept$1(this, continuation);
        }
        Object objA = waitDevicePackage$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = waitDevicePackage$intercept$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(objA);
                }
                if (i2 == 2) {
                    logGetParam2 = (LogGetParam) waitDevicePackage$intercept$1.L$1;
                    aVar = (gea.a) waitDevicePackage$intercept$1.L$0;
                    ResultKt.throwOnFailure(objA);
                    logGetParam = logGetParam2;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objA);
                }
            }
            ResultKt.throwOnFailure(objA);
            logGetParam = (LogGetParam) aVar.request();
            FeedbackOption fbOption = logGetParam.getFbOption();
            List<String> uploadFailFiles = fbOption.getUploadFailFiles();
            if (uploadFailFiles == null || uploadFailFiles.isEmpty()) {
                Map<String, String> fileKeys = fbOption.getFileKeys();
                if (fileKeys == null || fileKeys.isEmpty()) {
                    if (fbOption.getCollectLog()) {
                        MutableLiveData<com.heytap.health.devicelog.feedback.a> mutableLiveDataC = logGetParam.c();
                        Intrinsics.checkNotNull(mutableLiveDataC);
                        mutableLiveDataC.postValue(com.heytap.health.devicelog.feedback.a.C0356a.INSTANCE);
                        WaitDevicePackage$intercept$2 waitDevicePackage$intercept$2 = new WaitDevicePackage$intercept$2(this, logGetParam, null);
                        waitDevicePackage$intercept$1.L$0 = aVar;
                        waitDevicePackage$intercept$1.L$1 = logGetParam;
                        waitDevicePackage$intercept$1.label = 2;
                        if (TimeoutKt.withTimeout(120000L, waitDevicePackage$intercept$2, waitDevicePackage$intercept$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        logGetParam2 = logGetParam;
                        logGetParam = logGetParam2;
                    }
                }
            }
            a7b.f(Feedback.INSTANCE.a(), "WaitDevicePackage skip, current is pre commit error now retry");
            waitDevicePackage$intercept$1.label = 1;
            objA = aVar.a(logGetParam, waitDevicePackage$intercept$1);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
            waitDevicePackage$intercept$1.L$0 = null;
            waitDevicePackage$intercept$1.L$1 = null;
            waitDevicePackage$intercept$1.label = 3;
            objA = aVar.a(logGetParam, waitDevicePackage$intercept$1);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        } catch (Exception unused) {
            throw new Exception("日志打包超时");
        }
    }

    public final Object c(MutableLiveData<Float> mutableLiveData, Continuation<? super String> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final a aVar = new a(cancellableContinuationImpl, mutableLiveData);
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.messageApi.f(28, 1, aVar);
        bm5Var.messageApi.b(new MessageEvent(28, 1, LogKitProto$LogKitActionReq.newBuilder().setAction(3).build().toByteArray()));
        final b bVar = new b(cancellableContinuationImpl);
        bm5Var.nodeApi.g(bVar);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.heytap.health.devicelog.feedback.WaitDevicePackage$notifyDeviceFinishWaitLog$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                bm5 bm5Var2 = gl4.devicePrimary;
                bm5Var2.nodeApi.d(bVar);
                bm5Var2.messageApi.t(28, 1, aVar);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
