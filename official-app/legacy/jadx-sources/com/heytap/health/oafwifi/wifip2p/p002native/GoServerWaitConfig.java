package com.heytap.health.oafwifi.wifip2p.p002native;

import android.net.wifi.p2p.WifiP2pGroup;
import com.heytap.health.oafwifi.OafWifiP2p;
import com.heytap.health.watch.oaf.P2PDevAgent;
import com.heytap.wearable.proto.AFTransport;
import com.heytap.wearable.proto.P2PDevice;
import com.heytap.wearable.proto.WifiState;
import com.oplus.aiunit.vision.P2PReq;
import com.oplus.aiunit.vision.P2PRsp;
import com.oplus.aiunit.vision.g9d;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/oafwifi/wifip2p/native/GoServerWaitConfig;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/u0e;", "Lcom/oplus/aiunit/vision/v0e;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final class GoServerWaitConfig implements gea<P2PReq, P2PRsp> {
    /* JADX WARN: Code duplicated, block: B:53:0x0138 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:15:0x0038, B:22:0x0050, B:62:0x017a, B:25:0x005d, B:59:0x0169, B:28:0x0072, B:51:0x0118, B:53:0x0138, B:55:0x013e, B:47:0x0100), top: B:72:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0166 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x01bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<P2PReq, P2PRsp> aVar, @NotNull Continuation<? super P2PRsp> continuation) throws Exception {
        GoServerWaitConfig$intercept$1 goServerWaitConfig$intercept$1;
        int groupOperatingBand;
        gea.a<P2PReq, P2PRsp> aVar2;
        P2PReq p2PReq;
        P2PReq p2PReq2;
        WifiP2pGroup wifiP2pGroup;
        g9d g9dVar;
        gea.a<P2PReq, P2PRsp> aVar3;
        int frequency;
        P2PReq p2PReq3;
        gea.a aVar4;
        if (continuation instanceof GoServerWaitConfig$intercept$1) {
            goServerWaitConfig$intercept$1 = (GoServerWaitConfig$intercept$1) continuation;
            int i = goServerWaitConfig$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                goServerWaitConfig$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                goServerWaitConfig$intercept$1 = new GoServerWaitConfig$intercept$1(this, continuation);
            }
        } else {
            goServerWaitConfig$intercept$1 = new GoServerWaitConfig$intercept$1(this, continuation);
        }
        Object objB = goServerWaitConfig$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = goServerWaitConfig$intercept$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    p2PReq = (P2PReq) goServerWaitConfig$intercept$1.L$1;
                    gea.a<P2PReq, P2PRsp> aVar5 = (gea.a) goServerWaitConfig$intercept$1.L$0;
                    ResultKt.throwOnFailure(objB);
                    aVar2 = aVar5;
                } else if (i2 == 2) {
                    wifiP2pGroup = (WifiP2pGroup) goServerWaitConfig$intercept$1.L$3;
                    g9dVar = (g9d) goServerWaitConfig$intercept$1.L$2;
                    p2PReq2 = (P2PReq) goServerWaitConfig$intercept$1.L$1;
                    aVar3 = (gea.a) goServerWaitConfig$intercept$1.L$0;
                    ResultKt.throwOnFailure(objB);
                    P2PDevAgent p2PDevAgent = (P2PDevAgent) objB;
                    P2PDevice.Builder group = P2PDevice.newBuilder().setMac("").setPwd(g9dVar.getPwd()).setGroup(g9dVar.getNname());
                    if (wifiP2pGroup != null) {
                        frequency = wifiP2pGroup.getFrequency();
                    } else {
                        frequency = 0;
                    }
                    p2PDevAgent.t(new MessageEvent(103, 4, group.setGroupOperatingFrequency(frequency).build().toByteArray()));
                    P2PDevAgent.Companion companion = P2PDevAgent.INSTANCE;
                    goServerWaitConfig$intercept$1.L$0 = aVar3;
                    goServerWaitConfig$intercept$1.L$1 = p2PReq2;
                    goServerWaitConfig$intercept$1.L$2 = null;
                    goServerWaitConfig$intercept$1.L$3 = null;
                    goServerWaitConfig$intercept$1.label = 3;
                    objB = companion.b(goServerWaitConfig$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    p2PReq3 = p2PReq2;
                    aVar4 = aVar3;
                    goServerWaitConfig$intercept$1.L$0 = aVar4;
                    goServerWaitConfig$intercept$1.L$1 = p2PReq3;
                    goServerWaitConfig$intercept$1.label = 4;
                    objB = ((P2PDevAgent) objB).n(5, 12000L, goServerWaitConfig$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    AFTransport from = AFTransport.parseFrom((byte[]) objB);
                    wil.d(OafWifiP2p.INSTANCE.e(), "GoServerWaitConfig.intercept(wifiChannelParams = [" + from + "])");
                    P2PReq p2PReq4 = (P2PReq) aVar4.request();
                    String ip = from.getIp();
                    Intrinsics.checkNotNullExpressionValue(ip, "wifiChannelParams.ip");
                    p2PReq4.j(ip);
                    goServerWaitConfig$intercept$1.L$0 = null;
                    goServerWaitConfig$intercept$1.L$1 = null;
                    goServerWaitConfig$intercept$1.label = 5;
                    objB = aVar4.a(p2PReq3, goServerWaitConfig$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 3) {
                    p2PReq3 = (P2PReq) goServerWaitConfig$intercept$1.L$1;
                    aVar4 = (gea.a) goServerWaitConfig$intercept$1.L$0;
                    ResultKt.throwOnFailure(objB);
                    goServerWaitConfig$intercept$1.L$0 = aVar4;
                    goServerWaitConfig$intercept$1.L$1 = p2PReq3;
                    goServerWaitConfig$intercept$1.label = 4;
                    objB = ((P2PDevAgent) objB).n(5, 12000L, goServerWaitConfig$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    AFTransport from2 = AFTransport.parseFrom((byte[]) objB);
                    wil.d(OafWifiP2p.INSTANCE.e(), "GoServerWaitConfig.intercept(wifiChannelParams = [" + from2 + "])");
                    P2PReq p2PReq5 = (P2PReq) aVar4.request();
                    String ip2 = from2.getIp();
                    Intrinsics.checkNotNullExpressionValue(ip2, "wifiChannelParams.ip");
                    p2PReq5.j(ip2);
                    goServerWaitConfig$intercept$1.L$0 = null;
                    goServerWaitConfig$intercept$1.L$1 = null;
                    goServerWaitConfig$intercept$1.label = 5;
                    objB = aVar4.a(p2PReq3, goServerWaitConfig$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 4) {
                    p2PReq3 = (P2PReq) goServerWaitConfig$intercept$1.L$1;
                    aVar4 = (gea.a) goServerWaitConfig$intercept$1.L$0;
                    ResultKt.throwOnFailure(objB);
                    AFTransport from3 = AFTransport.parseFrom((byte[]) objB);
                    wil.d(OafWifiP2p.INSTANCE.e(), "GoServerWaitConfig.intercept(wifiChannelParams = [" + from3 + "])");
                    P2PReq p2PReq6 = (P2PReq) aVar4.request();
                    String ip3 = from3.getIp();
                    Intrinsics.checkNotNullExpressionValue(ip3, "wifiChannelParams.ip");
                    p2PReq6.j(ip3);
                    goServerWaitConfig$intercept$1.L$0 = null;
                    goServerWaitConfig$intercept$1.L$1 = null;
                    goServerWaitConfig$intercept$1.label = 5;
                    objB = aVar4.a(p2PReq3, goServerWaitConfig$intercept$1);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objB);
                }
                return objB;
            }
            ResultKt.throwOnFailure(objB);
            P2PReq p2PReq7 = (P2PReq) aVar.request();
            NativeP2pStrategy nativeP2pStrategy = NativeP2pStrategy.INSTANCE;
            WifiState wifiState = p2PReq7.getWifiState();
            if ((wifiState != null ? wifiState.getGroupOperatingBand() : 0) <= 0) {
                groupOperatingBand = 1;
            } else {
                WifiState wifiState2 = p2PReq7.getWifiState();
                Intrinsics.checkNotNull(wifiState2);
                groupOperatingBand = wifiState2.getGroupOperatingBand();
            }
            WifiState wifiState3 = p2PReq7.getWifiState();
            Intrinsics.checkNotNull(wifiState3);
            int groupOperatingFrequency = wifiState3.getGroupOperatingFrequency();
            aVar2 = aVar;
            goServerWaitConfig$intercept$1.L$0 = aVar2;
            goServerWaitConfig$intercept$1.L$1 = p2PReq7;
            goServerWaitConfig$intercept$1.label = 1;
            Object objV = nativeP2pStrategy.v(groupOperatingBand, groupOperatingFrequency, goServerWaitConfig$intercept$1);
            if (objV == coroutine_suspended) {
                return coroutine_suspended;
            }
            p2PReq = p2PReq7;
            objB = objV;
            Pair pair = (Pair) objB;
            g9d g9dVar2 = (g9d) pair.component1();
            WifiP2pGroup wifiP2pGroup2 = (WifiP2pGroup) pair.component2();
            wil.d(OafWifiP2p.INSTANCE.e(), "GoServerWaitConfig.intercept(createGroup = [" + g9dVar2 + "," + (wifiP2pGroup2 != null) + "])");
            P2PDevAgent.Companion companion2 = P2PDevAgent.INSTANCE;
            goServerWaitConfig$intercept$1.L$0 = aVar2;
            goServerWaitConfig$intercept$1.L$1 = p2PReq;
            goServerWaitConfig$intercept$1.L$2 = g9dVar2;
            goServerWaitConfig$intercept$1.L$3 = wifiP2pGroup2;
            goServerWaitConfig$intercept$1.label = 2;
            Object objB2 = companion2.b(goServerWaitConfig$intercept$1);
            if (objB2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            p2PReq2 = p2PReq;
            wifiP2pGroup = wifiP2pGroup2;
            objB = objB2;
            g9dVar = g9dVar2;
            aVar3 = aVar2;
            P2PDevAgent p2PDevAgent2 = (P2PDevAgent) objB;
            P2PDevice.Builder group2 = P2PDevice.newBuilder().setMac("").setPwd(g9dVar.getPwd()).setGroup(g9dVar.getNname());
            if (wifiP2pGroup != null) {
                frequency = wifiP2pGroup.getFrequency();
            } else {
                frequency = 0;
            }
            p2PDevAgent2.t(new MessageEvent(103, 4, group2.setGroupOperatingFrequency(frequency).build().toByteArray()));
            P2PDevAgent.Companion companion3 = P2PDevAgent.INSTANCE;
            goServerWaitConfig$intercept$1.L$0 = aVar3;
            goServerWaitConfig$intercept$1.L$1 = p2PReq2;
            goServerWaitConfig$intercept$1.L$2 = null;
            goServerWaitConfig$intercept$1.L$3 = null;
            goServerWaitConfig$intercept$1.label = 3;
            objB = companion3.b(goServerWaitConfig$intercept$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            p2PReq3 = p2PReq2;
            aVar4 = aVar3;
            goServerWaitConfig$intercept$1.L$0 = aVar4;
            goServerWaitConfig$intercept$1.L$1 = p2PReq3;
            goServerWaitConfig$intercept$1.label = 4;
            objB = ((P2PDevAgent) objB).n(5, 12000L, goServerWaitConfig$intercept$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            AFTransport from4 = AFTransport.parseFrom((byte[]) objB);
            wil.d(OafWifiP2p.INSTANCE.e(), "GoServerWaitConfig.intercept(wifiChannelParams = [" + from4 + "])");
            P2PReq p2PReq8 = (P2PReq) aVar4.request();
            String ip4 = from4.getIp();
            Intrinsics.checkNotNullExpressionValue(ip4, "wifiChannelParams.ip");
            p2PReq8.j(ip4);
            goServerWaitConfig$intercept$1.L$0 = null;
            goServerWaitConfig$intercept$1.L$1 = null;
            goServerWaitConfig$intercept$1.label = 5;
            objB = aVar4.a(p2PReq3, goServerWaitConfig$intercept$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objB;
        } catch (Exception e2) {
            if (e2 instanceof TimeoutCancellationException) {
                wil.b(OafWifiP2p.INSTANCE.e(), "GoServerWaitConfig.intercept await ip timeout, next removeGroup -> " + e2.getMessage());
            } else {
                wil.d(OafWifiP2p.INSTANCE.e(), "GoServerWaitConfig.intercept error, next removeGroup -> " + e2.getMessage());
            }
            NativeP2pStrategy.INSTANCE.G();
            throw e2;
        }
    }
}
