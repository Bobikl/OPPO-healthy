package com.heytap.health.oafwifi.wifip2p.p002native;

import androidx.camera.core.RetryPolicy;
import androidx.core.util.Consumer;
import com.heytap.accessory.BaseSocket;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.accessory.bean.PeerAgent;
import com.heytap.health.oafwifi.OafWifiP2p;
import com.heytap.health.watch.oaf.wrapper.AbsFtAgent;
import com.oplus.aiunit.vision.P2PReq;
import com.oplus.aiunit.vision.P2PRsp;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.wil;
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
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/oafwifi/wifip2p/native/FileAgent;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/u0e;", "Lcom/oplus/aiunit/vision/v0e;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/watch/oaf/wrapper/AbsFtAgent;", "ftAgent", "", "c", "(Lcom/heytap/health/watch/oaf/wrapper/AbsFtAgent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWifiIntercepts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiIntercepts.kt\ncom/heytap/health/oafwifi/wifip2p/native/FileAgent\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,265:1\n314#2,11:266\n*S KotlinDebug\n*F\n+ 1 WifiIntercepts.kt\ncom/heytap/health/oafwifi/wifip2p/native/FileAgent\n*L\n254#1:266,11\n*E\n"})
public final class FileAgent implements gea<P2PReq, P2PRsp> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/accessory/BaseSocket;", "kotlin.jvm.PlatformType", "socket", "", "a", "(Lcom/heytap/accessory/BaseSocket;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements Consumer {
        public final /* synthetic */ AbsFtAgent i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Unit> f5098j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(AbsFtAgent absFtAgent, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.i = absFtAgent;
            this.f5098j = cancellableContinuation;
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(BaseSocket baseSocket) {
            PeerAgent connectedPeerAgent;
            PeerAccessory accessory;
            Integer numValueOf = (baseSocket == null || (connectedPeerAgent = baseSocket.getConnectedPeerAgent()) == null || (accessory = connectedPeerAgent.getAccessory()) == null) ? null : Integer.valueOf(accessory.getTransportType());
            wil.d(OafWifiP2p.INSTANCE.e(), "FileAgent.intercept(" + this.i + ") waitP2PSocket transportType = " + numValueOf);
            if (numValueOf != null && numValueOf.intValue() == 1) {
                this.i.P(null);
                CancellableContinuation<Unit> cancellableContinuation = this.f5098j;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(Unit.INSTANCE));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<P2PReq, P2PRsp> aVar, @NotNull Continuation<? super P2PRsp> continuation) {
        FileAgent$intercept$1 fileAgent$intercept$1;
        if (continuation instanceof FileAgent$intercept$1) {
            fileAgent$intercept$1 = (FileAgent$intercept$1) continuation;
            int i = fileAgent$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fileAgent$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                fileAgent$intercept$1 = new FileAgent$intercept$1(this, continuation);
            }
        } else {
            fileAgent$intercept$1 = new FileAgent$intercept$1(this, continuation);
        }
        Object obj = fileAgent$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = fileAgent$intercept$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            AbsFtAgent ftAgent = ((P2PReq) aVar.request()).getFtAgent();
            if (ftAgent == null) {
                return new P2PRsp(true, null, 2, null);
            }
            wil.d(OafWifiP2p.INSTANCE.e(), "FileAgent.intercept(" + ftAgent + ")");
            PeerAccessory peerAccessory = ((P2PReq) aVar.request()).getPeerAccessory();
            Intrinsics.checkNotNull(peerAccessory);
            ftAgent.s(peerAccessory.getAddress());
            FileAgent$intercept$2 fileAgent$intercept$2 = new FileAgent$intercept$2(this, ftAgent, null);
            fileAgent$intercept$1.label = 1;
            if (TimeoutKt.withTimeout(RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, fileAgent$intercept$2, fileAgent$intercept$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new P2PRsp(true, null, 2, null);
    }

    public final Object c(AbsFtAgent absFtAgent, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        absFtAgent.P(new a(absFtAgent, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
