package com.heytap.health.oafwifi.wifip2p.p002native;

import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pGroup;
import com.heytap.accessory.accessorymanager.AccessoryManager;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.bean.PeerAccessory;
import com.heytap.health.oaf.LinkReasonBean;
import com.heytap.health.oaf.OafHost;
import com.heytap.health.oafwifi.OafWifiP2p;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.oplus.aiunit.vision.P2PReq;
import com.oplus.aiunit.vision.P2PRsp;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.q9d;
import com.oplus.aiunit.vision.wil;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/oafwifi/wifip2p/native/OAFConnect;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/u0e;", "Lcom/oplus/aiunit/vision/v0e;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "req", "Lcom/heytap/accessory/bean/PeerAccessory;", "c", "(Lcom/oplus/aiunit/vision/u0e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWifiIntercepts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WifiIntercepts.kt\ncom/heytap/health/oafwifi/wifip2p/native/OAFConnect\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,265:1\n314#2,11:266\n*S KotlinDebug\n*F\n+ 1 WifiIntercepts.kt\ncom/heytap/health/oafwifi/wifip2p/native/OAFConnect\n*L\n198#1:266,11\n*E\n"})
public final class OAFConnect implements gea<P2PReq, P2PRsp> {

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¨\u0006\u000f"}, d2 = {"com/heytap/health/oafwifi/wifip2p/native/OAFConnect$a", "Lcom/oplus/aiunit/vision/q9d$c;", "", "b", "Lcom/heytap/accessory/bean/PeerAccessory;", AccessoryManager.EXTRA_ACCESSORY, "", "c", "Lcom/heytap/health/oaf/LinkReasonBean;", "reasonBean", "f", MapSchema.FIELD_NAME_ENTRY, "", "connectedAccessories", b2n.g, "oafhost_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements q9d.c {
        public final /* synthetic */ q9d i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<PeerAccessory> f5101j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q9d q9dVar, CancellableContinuation<? super PeerAccessory> cancellableContinuation) {
            this.i = q9dVar;
            this.f5101j = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.q9d.c
        public int b() {
            return 1;
        }

        @Override // com.oplus.aiunit.vision.q9d.c
        public void c(@Nullable PeerAccessory accessory) {
            wil.d(OafWifiP2p.INSTANCE.e(), "OAFConnect.onAccessoryConnect=" + accessory);
            try {
                this.i.z(this);
            } catch (Exception e2) {
                wil.d(OafWifiP2p.INSTANCE.e(), "OAFConnect.onAccessoryConnect->Exception=" + e2);
            }
            this.f5101j.resumeWith(Result.m5287constructorimpl(accessory));
        }

        @Override // com.oplus.aiunit.vision.q9d.c
        public void e(@Nullable PeerAccessory accessory) {
            this.i.z(this);
            CancellableContinuation<PeerAccessory> cancellableContinuation = this.f5101j;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new KSCException())));
        }

        @Override // com.oplus.aiunit.vision.q9d.c
        public void f(@Nullable PeerAccessory accessory, @NotNull LinkReasonBean reasonBean) {
            Intrinsics.checkNotNullParameter(reasonBean, "reasonBean");
            wil.d(OafWifiP2p.INSTANCE.e(), "OAFConnect.onAccessoryDisconnect=" + reasonBean);
            this.i.z(this);
            CancellableContinuation<PeerAccessory> cancellableContinuation = this.f5101j;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException("onAccessoryDisconnect(" + reasonBean.getOafCode() + "->" + reasonBean.getReason() + ")"))));
        }

        @Override // com.oplus.aiunit.vision.q9d.c
        public void h(@NotNull List<PeerAccessory> connectedAccessories) {
            Intrinsics.checkNotNullParameter(connectedAccessories, "connectedAccessories");
            wil.d(OafWifiP2p.INSTANCE.e(), "OAFConnect.onAccessoryCrash=" + connectedAccessories);
            this.i.z(this);
            CancellableContinuation<PeerAccessory> cancellableContinuation = this.f5101j;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException("onAccessoryCrash"))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<P2PReq, P2PRsp> aVar, @NotNull Continuation<? super P2PRsp> continuation) {
        OAFConnect$intercept$1 oAFConnect$intercept$1;
        OAFConnect oAFConnect;
        P2PReq p2PReq;
        gea.a aVar2;
        P2PReq p2PReq2;
        if (continuation instanceof OAFConnect$intercept$1) {
            oAFConnect$intercept$1 = (OAFConnect$intercept$1) continuation;
            int i = oAFConnect$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oAFConnect$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                oAFConnect$intercept$1 = new OAFConnect$intercept$1(this, continuation);
            }
        } else {
            oAFConnect$intercept$1 = new OAFConnect$intercept$1(this, continuation);
        }
        Object objWithTimeout = oAFConnect$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oAFConnect$intercept$1.label;
        boolean z = true;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    p2PReq = (P2PReq) oAFConnect$intercept$1.L$2;
                    aVar = (gea.a) oAFConnect$intercept$1.L$1;
                    oAFConnect = (OAFConnect) oAFConnect$intercept$1.L$0;
                    ResultKt.throwOnFailure(objWithTimeout);
                } else if (i2 == 2) {
                    p2PReq = (P2PReq) oAFConnect$intercept$1.L$2;
                    p2PReq2 = (P2PReq) oAFConnect$intercept$1.L$1;
                    aVar2 = (gea.a) oAFConnect$intercept$1.L$0;
                    ResultKt.throwOnFailure(objWithTimeout);
                    p2PReq.l((PeerAccessory) objWithTimeout);
                    if (p2PReq2.getPeerAccessory() == null) {
                        return new P2PRsp(false, WeightData_A3.IMPEDANCE_STATUS_ERROR);
                    }
                    oAFConnect$intercept$1.L$0 = null;
                    oAFConnect$intercept$1.L$1 = null;
                    oAFConnect$intercept$1.L$2 = null;
                    oAFConnect$intercept$1.label = 3;
                    objWithTimeout = aVar2.a(p2PReq2, oAFConnect$intercept$1);
                    if (objWithTimeout == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objWithTimeout);
                }
                return objWithTimeout;
            }
            ResultKt.throwOnFailure(objWithTimeout);
            P2PReq p2PReq3 = (P2PReq) aVar.request();
            NativeP2pStrategy nativeP2pStrategy = NativeP2pStrategy.INSTANCE;
            oAFConnect$intercept$1.L$0 = this;
            oAFConnect$intercept$1.L$1 = aVar;
            oAFConnect$intercept$1.L$2 = p2PReq3;
            oAFConnect$intercept$1.label = 1;
            Object objR = nativeP2pStrategy.r(oAFConnect$intercept$1);
            if (objR == coroutine_suspended) {
                return coroutine_suspended;
            }
            oAFConnect = this;
            p2PReq = p2PReq3;
            objWithTimeout = objR;
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) objWithTimeout;
            Collection<WifiP2pDevice> clientList = wifiP2pGroup != null ? wifiP2pGroup.getClientList() : null;
            if (clientList != null && !clientList.isEmpty()) {
                z = false;
            }
            if (z) {
                return new P2PRsp(false, "No Clint connected");
            }
            wil.a(OafWifiP2p.INSTANCE.e(), "OAFConnect.intercept(clientList = [" + clientList + "])");
            OAFConnect$intercept$2 oAFConnect$intercept$2 = new OAFConnect$intercept$2(oAFConnect, aVar, null);
            oAFConnect$intercept$1.L$0 = aVar;
            oAFConnect$intercept$1.L$1 = p2PReq;
            oAFConnect$intercept$1.L$2 = p2PReq;
            oAFConnect$intercept$1.label = 2;
            objWithTimeout = TimeoutKt.withTimeout(8000L, oAFConnect$intercept$2, oAFConnect$intercept$1);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar2 = aVar;
            p2PReq2 = p2PReq;
            p2PReq.l((PeerAccessory) objWithTimeout);
            if (p2PReq2.getPeerAccessory() == null) {
                return new P2PRsp(false, WeightData_A3.IMPEDANCE_STATUS_ERROR);
            }
            oAFConnect$intercept$1.L$0 = null;
            oAFConnect$intercept$1.L$1 = null;
            oAFConnect$intercept$1.L$2 = null;
            oAFConnect$intercept$1.label = 3;
            objWithTimeout = aVar2.a(p2PReq2, oAFConnect$intercept$1);
            if (objWithTimeout == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objWithTimeout;
        } catch (Exception unused) {
            throw new RuntimeException("oaf connect wifi 8s timeout");
        }
    }

    public final Object c(P2PReq p2PReq, Continuation<? super PeerAccessory> continuation) throws IOException {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        q9d oafController = OafHost.i().h().getOafController();
        AccessoryManager accessoryManagerL = oafController.l();
        ConnectConfig connectConfig = new ConnectConfig(p2PReq.getIp(), 1, p2PReq.getDeviceId(), p2PReq.getAlias());
        accessoryManagerL.setKsc(p2PReq.getDeviceId(), p2PReq.getAlias(), p2PReq.getKsc());
        wil.d(OafWifiP2p.INSTANCE.e(), "OAFConnect.intercept(param = [" + p2PReq + "][" + connectConfig + "])");
        oafController.i(new a(oafController, cancellableContinuationImpl));
        accessoryManagerL.connect(connectConfig);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
