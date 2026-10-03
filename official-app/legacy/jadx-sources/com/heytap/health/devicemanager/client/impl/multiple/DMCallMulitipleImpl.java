package com.heytap.health.devicemanager.client.impl.multiple;

import com.heytap.health.connect.rawapi.call.CallException;
import com.heytap.health.connect.rawapi.call.b;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bl4;
import com.oplus.aiunit.vision.dl4;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.iuf;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.sl4;
import com.oplus.aiunit.vision.sxb;
import com.oplus.aiunit.vision.u89;
import com.oplus.aiunit.vision.wk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJE\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J8\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J:\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\f\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002R\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMCallMulitipleImpl;", "Lcom/oplus/aiunit/vision/bl4;", "Lcom/oplus/aiunit/vision/ra5;", "role", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "request", "Lcom/oplus/aiunit/vision/ko4;", "rspType", "", "timeOut", "", "retry", b2n.f, "(Lcom/oplus/aiunit/vision/ra5;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "mac", "b", "(Lcom/oplus/aiunit/vision/ra5;Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/sl4;", "rspCallback", "", "f", b2n.g, "c", "", "Lcom/heytap/health/devicemanager/client/call/DMCallException;", "d", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "MessageCallbackWrapper", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class DMCallMulitipleImpl implements bl4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "DMCallMulitipleImpl";

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMCallMulitipleImpl$MessageCallbackWrapper;", "Lcom/oplus/aiunit/vision/sxb;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "Lcom/heytap/health/connect/rawapi/call/CallException;", "throwable", "b", "", "other", "", "equals", "", "hashCode", "toString", "Lcom/oplus/aiunit/vision/sl4;", "Lcom/oplus/aiunit/vision/sl4;", "callback", "<init>", "(Lcom/heytap/health/devicemanager/client/impl/multiple/DMCallMulitipleImpl;Lcom/oplus/aiunit/vision/sl4;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public final class MessageCallbackWrapper implements sxb {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final sl4 callback;
        public final /* synthetic */ DMCallMulitipleImpl b;

        public MessageCallbackWrapper(@NotNull DMCallMulitipleImpl dMCallMulitipleImpl, sl4 callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.b = dMCallMulitipleImpl;
            this.callback = callback;
        }

        @Override // com.oplus.aiunit.vision.sxb
        public void a(@NotNull final String mac, @NotNull final MessageEvent response) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(response, "response");
            wk4.a("mess callbakc onSuccess", this.callback, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMCallMulitipleImpl$MessageCallbackWrapper$onSuccess$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.callback.a(mac, response);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.sxb
        public void b(@NotNull final CallException throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            sl4 sl4Var = this.callback;
            final DMCallMulitipleImpl dMCallMulitipleImpl = this.b;
            wk4.a("mess callbakc onError", sl4Var, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMCallMulitipleImpl$MessageCallbackWrapper$onError$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.callback.b(dMCallMulitipleImpl.d(throwable));
                }
            });
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(MessageCallbackWrapper.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.devicemanager.client.impl.multiple.DMCallMulitipleImpl.MessageCallbackWrapper");
            return Intrinsics.areEqual(this.callback, ((MessageCallbackWrapper) other).callback);
        }

        public int hashCode() {
            return this.callback.hashCode();
        }

        @NotNull
        public String toString() {
            return this.callback.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.oplus.aiunit.vision.bl4
    @Nullable
    public Object b(@NotNull ra5 ra5Var, @NotNull String str, @NotNull MessageEvent messageEvent, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super MessageEvent> continuation) throws Throwable {
        DMCallMulitipleImpl$sendMessageWithCoroutine$2 dMCallMulitipleImpl$sendMessageWithCoroutine$2;
        Object objM5287constructorimpl;
        DMCallMulitipleImpl dMCallMulitipleImpl = this;
        if (continuation instanceof DMCallMulitipleImpl$sendMessageWithCoroutine$2) {
            dMCallMulitipleImpl$sendMessageWithCoroutine$2 = (DMCallMulitipleImpl$sendMessageWithCoroutine$2) continuation;
            int i2 = dMCallMulitipleImpl$sendMessageWithCoroutine$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dMCallMulitipleImpl$sendMessageWithCoroutine$2.label = i2 - Integer.MIN_VALUE;
            } else {
                dMCallMulitipleImpl$sendMessageWithCoroutine$2 = new DMCallMulitipleImpl$sendMessageWithCoroutine$2(this, continuation);
            }
        } else {
            dMCallMulitipleImpl$sendMessageWithCoroutine$2 = new DMCallMulitipleImpl$sendMessageWithCoroutine$2(this, continuation);
        }
        DMCallMulitipleImpl$sendMessageWithCoroutine$2 dMCallMulitipleImpl$sendMessageWithCoroutine$3 = dMCallMulitipleImpl$sendMessageWithCoroutine$2;
        Object objD = dMCallMulitipleImpl$sendMessageWithCoroutine$3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dMCallMulitipleImpl$sendMessageWithCoroutine$3.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objD);
                ra5.c cVarF = gl4.managerApi.f(str);
                if (!ra5Var.b(cVarF)) {
                    ml4.c(dMCallMulitipleImpl.TAG, "sendMessageWithCoroutine fail,deviceRole:" + cVarF + ",sendRole:" + ra5Var + "(" + gdb.a(str) + "),message:" + messageEvent);
                    return null;
                }
                Result.Companion companion = Result.INSTANCE;
                com.heytap.health.connect.rawapi.a aVar = u89.CallApi;
                iuf iufVarA = ko4Var.a();
                dMCallMulitipleImpl$sendMessageWithCoroutine$3.L$0 = dMCallMulitipleImpl;
                dMCallMulitipleImpl$sendMessageWithCoroutine$3.label = 1;
                objD = aVar.d(str, messageEvent, iufVarA, j2, i, dMCallMulitipleImpl$sendMessageWithCoroutine$3);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dMCallMulitipleImpl = (DMCallMulitipleImpl) dMCallMulitipleImpl$sendMessageWithCoroutine$3.L$0;
                ResultKt.throwOnFailure(objD);
            }
            objM5287constructorimpl = Result.m5287constructorimpl((MessageEvent) objD);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return (MessageEvent) objM5287constructorimpl;
        }
        if (thM5290exceptionOrNullimpl instanceof CancellationException) {
            throw thM5290exceptionOrNullimpl;
        }
        throw dMCallMulitipleImpl.d(thM5290exceptionOrNullimpl);
    }

    @Override // com.oplus.aiunit.vision.bl4
    @Nullable
    public MessageEvent c(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent request, @NotNull ko4 rspType, long timeOut, int retry) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rspType, "rspType");
        ra5.c cVarF = gl4.managerApi.f(mac);
        if (role.b(cVarF)) {
            return u89.CallApi.a(mac, request, rspType.a(), timeOut, retry);
        }
        ml4.c(this.TAG, "sendMessageWithThreadBlock fail,deviceRole:" + cVarF + ",sendRole:" + role + "(" + gdb.a(mac) + "),message:" + request);
        return null;
    }

    public final DMCallException d(Throwable th) {
        dl4 dl4Var;
        if (!(th instanceof CallException)) {
            return new DMCallException(dl4.b.INSTANCE, th.getMessage());
        }
        b errorCode = ((CallException) th).getErrorCode();
        if (Intrinsics.areEqual(errorCode, b.a.INSTANCE)) {
            dl4Var = dl4.a.INSTANCE;
        } else if (Intrinsics.areEqual(errorCode, b.c.INSTANCE)) {
            dl4Var = dl4.c.INSTANCE;
        } else {
            if (!Intrinsics.areEqual(errorCode, b.C0326b.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            dl4Var = dl4.b.INSTANCE;
        }
        return new DMCallException(dl4Var, th.getMessage());
    }

    @Override // com.oplus.aiunit.vision.bl4
    public void f(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent request, @NotNull sl4 rspCallback, @NotNull ko4 rspType, long timeOut, int retry) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rspCallback, "rspCallback");
        Intrinsics.checkNotNullParameter(rspType, "rspType");
        ra5.c cVarF = gl4.managerApi.f(mac);
        if (role.b(cVarF)) {
            u89.CallApi.b(mac, request, new MessageCallbackWrapper(this, rspCallback), rspType.a(), timeOut, retry);
            return;
        }
        ml4.c(this.TAG, "sendMessageWithCallback fail,deviceRole:" + cVarF + ",sendRole:" + role + "(" + gdb.a(mac) + "),message:" + request);
    }

    @Override // com.oplus.aiunit.vision.bl4
    @Nullable
    public Object g(@NotNull ra5 ra5Var, @NotNull MessageEvent messageEvent, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super MessageEvent> continuation) {
        return b(ra5Var, gl4.managerApi.q(ra5.a.INSTANCE), messageEvent, ko4Var, j2, i, continuation);
    }

    @Override // com.oplus.aiunit.vision.bl4
    public void h(@NotNull ra5 role, @NotNull MessageEvent request, @NotNull sl4 rspCallback, @NotNull ko4 rspType, long timeOut, int retry) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rspCallback, "rspCallback");
        Intrinsics.checkNotNullParameter(rspType, "rspType");
        f(role, gl4.managerApi.q(ra5.a.INSTANCE), request, rspCallback, rspType, timeOut, retry);
    }
}
