package com.heytap.health.oafwifi.wifip2p.p002native;

import com.heytap.health.oafwifi.OafWifiP2p;
import com.heytap.health.watch.oaf.P2PDevAgent;
import com.heytap.wearable.proto.WifiState;
import com.oplus.aiunit.vision.P2PEnv;
import com.oplus.aiunit.vision.P2PReq;
import com.oplus.aiunit.vision.P2PRsp;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/oafwifi/wifip2p/native/EnvCheckTalk;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/u0e;", "Lcom/oplus/aiunit/vision/v0e;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final class EnvCheckTalk implements gea<P2PReq, P2PRsp> {
    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<P2PReq, P2PRsp> aVar, @NotNull Continuation<? super P2PRsp> continuation) throws IOException {
        EnvCheckTalk$intercept$1 envCheckTalk$intercept$1;
        gea.a<P2PReq, P2PRsp> aVar2;
        P2PReq p2PReq;
        P2PEnv p2PEnv;
        int i;
        Object objB;
        P2PEnv p2PEnv2;
        gea.a<P2PReq, P2PRsp> aVar3;
        gea.a<P2PReq, P2PRsp> aVar4;
        P2PReq p2PReq2;
        P2PReq p2PReq3;
        gea.a<P2PReq, P2PRsp> aVar5;
        WifiState from;
        if (continuation instanceof EnvCheckTalk$intercept$1) {
            envCheckTalk$intercept$1 = (EnvCheckTalk$intercept$1) continuation;
            int i2 = envCheckTalk$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                envCheckTalk$intercept$1.label = i2 - Integer.MIN_VALUE;
            } else {
                envCheckTalk$intercept$1 = new EnvCheckTalk$intercept$1(this, continuation);
            }
        } else {
            envCheckTalk$intercept$1 = new EnvCheckTalk$intercept$1(this, continuation);
        }
        Object objB2 = envCheckTalk$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (envCheckTalk$intercept$1.label) {
            case 0:
                ResultKt.throwOnFailure(objB2);
                P2PReq p2PReq4 = (P2PReq) aVar.request();
                wil.a(OafWifiP2p.INSTANCE.e(), "EnvCheckTalk.intercept(" + p2PReq4 + ")");
                NativeP2pStrategy nativeP2pStrategy = NativeP2pStrategy.INSTANCE;
                aVar2 = aVar;
                envCheckTalk$intercept$1.L$0 = aVar2;
                envCheckTalk$intercept$1.L$1 = p2PReq4;
                envCheckTalk$intercept$1.label = 1;
                Object objW = nativeP2pStrategy.w(envCheckTalk$intercept$1);
                if (objW == coroutine_suspended) {
                    return coroutine_suspended;
                }
                p2PReq = p2PReq4;
                objB2 = objW;
                p2PEnv = (P2PEnv) objB2;
                if (p2PReq.getWifiState() != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    wil.d(OafWifiP2p.INSTANCE.e(), "EnvCheckTalk.intercept(DEVICE OK REQ from DEVICE)");
                    P2PDevAgent.Companion companion = P2PDevAgent.INSTANCE;
                    envCheckTalk$intercept$1.L$0 = aVar2;
                    envCheckTalk$intercept$1.L$1 = p2PReq;
                    envCheckTalk$intercept$1.L$2 = p2PEnv;
                    envCheckTalk$intercept$1.I$0 = i;
                    envCheckTalk$intercept$1.label = 2;
                    objB = companion.b(envCheckTalk$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gea.a<P2PReq, P2PRsp> aVar6 = aVar2;
                    p2PEnv2 = p2PEnv;
                    objB2 = objB;
                    aVar3 = aVar6;
                    ((P2PDevAgent) objB2).t(new MessageEvent(103, 1, WifiState.newBuilder().setWifiState(p2PEnv2.getWifiState()).setP2PState(p2PEnv2.getP2pState()).setErrorMsg(p2PEnv2.getMsg()).setErrorCode(p2PEnv2.getCode()).build().toByteArray()));
                    p2PEnv = p2PEnv2;
                    aVar2 = aVar3;
                }
                if (p2PEnv.getWifiState() || !p2PEnv.getP2pState()) {
                    return new P2PRsp(false, String.valueOf(p2PEnv));
                }
                OafWifiP2p oafWifiP2p = OafWifiP2p.INSTANCE;
                wil.d(oafWifiP2p.e(), "EnvCheckTalk.intercept(PHONE OK " + p2PEnv + ")");
                if (i != 0) {
                    envCheckTalk$intercept$1.L$0 = null;
                    envCheckTalk$intercept$1.L$1 = null;
                    envCheckTalk$intercept$1.L$2 = null;
                    envCheckTalk$intercept$1.label = 3;
                    objB2 = gea.a.C0878a.a(aVar2, null, envCheckTalk$intercept$1, 1, null);
                    return objB2 == coroutine_suspended ? coroutine_suspended : objB2;
                }
                wil.d(oafWifiP2p.e(), "EnvCheckTalk.intercept to check device state");
                P2PDevAgent.Companion companion2 = P2PDevAgent.INSTANCE;
                envCheckTalk$intercept$1.L$0 = aVar2;
                envCheckTalk$intercept$1.L$1 = p2PReq;
                envCheckTalk$intercept$1.L$2 = null;
                envCheckTalk$intercept$1.label = 4;
                objB2 = companion2.b(envCheckTalk$intercept$1);
                if (objB2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar4 = aVar2;
                p2PReq2 = p2PReq;
                P2PDevAgent p2PDevAgent = (P2PDevAgent) objB2;
                MessageEvent messageEvent = new MessageEvent(103, 2, WifiState.newBuilder().setP2PState(true).setWifiState(true).build().toByteArray());
                envCheckTalk$intercept$1.L$0 = aVar4;
                envCheckTalk$intercept$1.L$1 = p2PReq2;
                envCheckTalk$intercept$1.label = 5;
                objB2 = P2PDevAgent.r(p2PDevAgent, messageEvent, 0L, envCheckTalk$intercept$1, 2, null);
                if (objB2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                p2PReq3 = p2PReq2;
                aVar5 = aVar4;
                from = WifiState.parseFrom((byte[]) objB2);
                p2PReq3.m(from);
                if (from.getWifiState() || !from.getP2PState()) {
                    return new P2PRsp(false, String.valueOf(from));
                }
                wil.d(OafWifiP2p.INSTANCE.e(), "EnvCheckTalk.intercept(DEVICE OK " + from + ")");
                envCheckTalk$intercept$1.L$0 = null;
                envCheckTalk$intercept$1.L$1 = null;
                envCheckTalk$intercept$1.label = 6;
                objB2 = gea.a.C0878a.a(aVar5, null, envCheckTalk$intercept$1, 1, null);
                return objB2 == coroutine_suspended ? coroutine_suspended : objB2;
            case 1:
                P2PReq p2PReq5 = (P2PReq) envCheckTalk$intercept$1.L$1;
                aVar2 = (gea.a) envCheckTalk$intercept$1.L$0;
                ResultKt.throwOnFailure(objB2);
                p2PReq = p2PReq5;
                p2PEnv = (P2PEnv) objB2;
                if (p2PReq.getWifiState() != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    wil.d(OafWifiP2p.INSTANCE.e(), "EnvCheckTalk.intercept(DEVICE OK REQ from DEVICE)");
                    P2PDevAgent.Companion companion3 = P2PDevAgent.INSTANCE;
                    envCheckTalk$intercept$1.L$0 = aVar2;
                    envCheckTalk$intercept$1.L$1 = p2PReq;
                    envCheckTalk$intercept$1.L$2 = p2PEnv;
                    envCheckTalk$intercept$1.I$0 = i;
                    envCheckTalk$intercept$1.label = 2;
                    objB = companion3.b(envCheckTalk$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gea.a<P2PReq, P2PRsp> aVar7 = aVar2;
                    p2PEnv2 = p2PEnv;
                    objB2 = objB;
                    aVar3 = aVar7;
                    ((P2PDevAgent) objB2).t(new MessageEvent(103, 1, WifiState.newBuilder().setWifiState(p2PEnv2.getWifiState()).setP2PState(p2PEnv2.getP2pState()).setErrorMsg(p2PEnv2.getMsg()).setErrorCode(p2PEnv2.getCode()).build().toByteArray()));
                    p2PEnv = p2PEnv2;
                    aVar2 = aVar3;
                }
                if (p2PEnv.getWifiState()) {
                    break;
                }
                return new P2PRsp(false, String.valueOf(p2PEnv));
            case 2:
                i = envCheckTalk$intercept$1.I$0;
                p2PEnv2 = (P2PEnv) envCheckTalk$intercept$1.L$2;
                p2PReq = (P2PReq) envCheckTalk$intercept$1.L$1;
                aVar3 = (gea.a) envCheckTalk$intercept$1.L$0;
                ResultKt.throwOnFailure(objB2);
                ((P2PDevAgent) objB2).t(new MessageEvent(103, 1, WifiState.newBuilder().setWifiState(p2PEnv2.getWifiState()).setP2PState(p2PEnv2.getP2pState()).setErrorMsg(p2PEnv2.getMsg()).setErrorCode(p2PEnv2.getCode()).build().toByteArray()));
                p2PEnv = p2PEnv2;
                aVar2 = aVar3;
                if (p2PEnv.getWifiState()) {
                    break;
                }
                return new P2PRsp(false, String.valueOf(p2PEnv));
            case 3:
                ResultKt.throwOnFailure(objB2);
            case 4:
                P2PReq p2PReq6 = (P2PReq) envCheckTalk$intercept$1.L$1;
                gea.a<P2PReq, P2PRsp> aVar8 = (gea.a) envCheckTalk$intercept$1.L$0;
                ResultKt.throwOnFailure(objB2);
                p2PReq2 = p2PReq6;
                aVar4 = aVar8;
                P2PDevAgent p2PDevAgent2 = (P2PDevAgent) objB2;
                MessageEvent messageEvent2 = new MessageEvent(103, 2, WifiState.newBuilder().setP2PState(true).setWifiState(true).build().toByteArray());
                envCheckTalk$intercept$1.L$0 = aVar4;
                envCheckTalk$intercept$1.L$1 = p2PReq2;
                envCheckTalk$intercept$1.label = 5;
                objB2 = P2PDevAgent.r(p2PDevAgent2, messageEvent2, 0L, envCheckTalk$intercept$1, 2, null);
                if (objB2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                p2PReq3 = p2PReq2;
                aVar5 = aVar4;
                from = WifiState.parseFrom((byte[]) objB2);
                p2PReq3.m(from);
                if (from.getWifiState()) {
                    break;
                }
                return new P2PRsp(false, String.valueOf(from));
            case 5:
                p2PReq3 = (P2PReq) envCheckTalk$intercept$1.L$1;
                aVar5 = (gea.a) envCheckTalk$intercept$1.L$0;
                ResultKt.throwOnFailure(objB2);
                from = WifiState.parseFrom((byte[]) objB2);
                p2PReq3.m(from);
                if (from.getWifiState()) {
                    break;
                }
                return new P2PRsp(false, String.valueOf(from));
            case 6:
                ResultKt.throwOnFailure(objB2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
