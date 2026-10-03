package com.heytap.health.esim.nsc.repo;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.esim.nsc.dto.EsimProfileState;
import com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource;
import com.heytap.health.esim.nsc.dto.UserCombo;
import com.heytap.health.esim.nsc.manager.LpaProfileManager;
import com.heytap.health.esim.nsc.utils.NSCHelper;
import com.heytap.sporthealth.blib.data.NetResult;
import com.heytap.sporthealth.blib.helper.DisconnectException;
import com.heytap.sporthealth.blib.helper.SilentUIStateException;
import com.heytap.wearable.lpa.proto.LPASyncProto;
import com.oplus.aiunit.vision.AcStatus;
import com.oplus.aiunit.vision.Profile;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.qe0;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0001J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u00020\u00078\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00078\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/esim/nsc/repo/NetworkSupportChecker;", "", "Lcom/heytap/health/esim/nsc/dto/EsimProfileState;", "d", "state", "", b2n.f, "", "mac", "Lcom/heytap/health/esim/nsc/repo/a;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "comboIccid", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/lang/String;", "setEid", "(Ljava/lang/String;)V", "eid", "f", "setImei", "imei", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetworkSupportChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkSupportChecker.kt\ncom/heytap/health/esim/nsc/repo/NetworkSupportChecker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1#2:238\n766#3:239\n857#3,2:240\n*S KotlinDebug\n*F\n+ 1 NetworkSupportChecker.kt\ncom/heytap/health/esim/nsc/repo/NetworkSupportChecker\n*L\n168#1:239\n168#1:240,2\n*E\n"})
public final class NetworkSupportChecker {
    public static final int $stable = 8;
    public final /* synthetic */ RedteaSp a = new RedteaSp();

    /* JADX WARN: Code duplicated, block: B:100:0x0223  */
    /* JADX WARN: Code duplicated, block: B:104:0x023f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0249  */
    /* JADX WARN: Code duplicated, block: B:108:0x0262 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:111:0x026b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0284  */
    /* JADX WARN: Code duplicated, block: B:115:0x0299 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:135:0x0309  */
    /* JADX WARN: Code duplicated, block: B:140:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[Catch: Exception -> 0x0082, TRY_LEAVE, TryCatch #0 {Exception -> 0x0082, blocks: (B:19:0x007e, B:28:0x009b, B:30:0x00a7, B:25:0x008d), top: B:137:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0217  */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x026b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02ce, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00a7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x010f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0149, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0192, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:92:0x01f7, please report this as an issue */
    @Nullable
    public final Object b(@NotNull String str, @NotNull Continuation<? super a> continuation) throws Exception {
        NetworkSupportChecker$check$1 networkSupportChecker$check$1;
        List<LPASyncProto.LPAProfile> profileDataList;
        Iterator it;
        Object next;
        UserCombo userCombo;
        ol4 ol4Var;
        NetworkSupportChecker networkSupportChecker;
        a aVar;
        EsimProfileState esimProfileStateD;
        AcStatus acStatus;
        NetResult netResult;
        Profile profile;
        LPASyncProto.LPAProfile lpaProfile;
        NetResult netResult2;
        ArrayList arrayList;
        UserCombo userCombo2;
        boolean z;
        if (continuation instanceof NetworkSupportChecker$check$1) {
            networkSupportChecker$check$1 = (NetworkSupportChecker$check$1) continuation;
            int i = networkSupportChecker$check$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                networkSupportChecker$check$1.label = i - Integer.MIN_VALUE;
            } else {
                networkSupportChecker$check$1 = new NetworkSupportChecker$check$1(this, continuation);
            }
        } else {
            networkSupportChecker$check$1 = new NetworkSupportChecker$check$1(this, continuation);
        }
        Object objM = networkSupportChecker$check$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (networkSupportChecker$check$1.label) {
                case 0:
                    ResultKt.throwOnFailure(objM);
                    if (!qe0.s()) {
                        DeviceRepo deviceRepo = new DeviceRepo();
                        networkSupportChecker$check$1.label = 1;
                        objM = deviceRepo.i(str, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        profileDataList = ((LPASyncProto.GetEsimInfo) objM).getProfileDataList();
                        if (profileDataList.size() < 1) {
                            return a.c.INSTANCE;
                        }
                        dkf.INSTANCE.a("LpaProfileObserver -> getProfile in device size 0: " + profileDataList);
                        return a.g.INSTANCE;
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.L$0 = this;
                    networkSupportChecker$check$1.L$1 = str;
                    networkSupportChecker$check$1.label = 2;
                    objM = netWorkServiceNetSource.m(str, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = ((Iterable) objM).iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        userCombo = (UserCombo) next;
                        if (userCombo != null) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo, status:" + userCombo.getStatus());
                            if (userCombo.isOrderFailed()) {
                                return a.f.INSTANCE;
                            }
                            String iccid = userCombo.getIccid();
                            networkSupportChecker$check$1.L$0 = this;
                            networkSupportChecker$check$1.L$1 = str;
                            networkSupportChecker$check$1.label = 3;
                            objM = this.c(str, iccid, networkSupportChecker$check$1);
                            if (objM == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar = (a) objM;
                            if (aVar != null) {
                                return aVar;
                            }
                            esimProfileStateD = this.d();
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo cachedStateOfCombo:" + esimProfileStateD);
                            if (esimProfileStateD == EsimProfileState.OK) {
                                return a.e.INSTANCE;
                            }
                            if (esimProfileStateD.compareTo(EsimProfileState.None) > 0) {
                                return a.f.INSTANCE;
                            }
                            NSCHelper nSCHelper = NSCHelper.INSTANCE;
                            NetworkSupportChecker$check$acStatus$1 networkSupportChecker$check$acStatus$1 = new NetworkSupportChecker$check$acStatus$1(str, null);
                            networkSupportChecker$check$1.L$0 = this;
                            networkSupportChecker$check$1.L$1 = null;
                            networkSupportChecker$check$1.label = 4;
                            objM = nSCHelper.e(1, networkSupportChecker$check$acStatus$1, networkSupportChecker$check$1);
                            if (objM == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            acStatus = (AcStatus) objM;
                            if (!acStatus.d()) {
                                this.g(EsimProfileState.OK);
                                return a.e.INSTANCE;
                            }
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo but not be active ->acStatus:" + acStatus);
                            return a.f.INSTANCE;
                        }
                        ol4Var = gl4.managerApi;
                        if (ol4Var.isCurrentConnected()) {
                            throw new DisconnectException(null, 1, null);
                        }
                        if (!ol4Var.isStubModule()) {
                            throw new SilentUIStateException((DevicePageType) lc5.c(ol4Var.getCurrActiveMac()).a(new Function1<DeviceInfo, DevicePageType>() { // from class: com.heytap.health.esim.nsc.repo.NetworkSupportChecker$check$2
                                @Override // p010kotlin.jvm.functions.Function1
                                @NotNull
                                public final DevicePageType invoke(@NotNull DeviceInfo applyInfo) {
                                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                                    return applyInfo.n9();
                                }
                            }), null, 2, null);
                        }
                        NetWorkServiceNetSource netWorkServiceNetSource2 = NetWorkServiceNetSource.INSTANCE;
                        networkSupportChecker$check$1.L$0 = this;
                        networkSupportChecker$check$1.L$1 = str;
                        networkSupportChecker$check$1.label = 5;
                        objM = netWorkServiceNetSource2.l(str, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        networkSupportChecker = this;
                        netResult = (NetResult) objM;
                        LpaProfileManager lpaProfileManager = LpaProfileManager.INSTANCE;
                        networkSupportChecker$check$1.L$0 = networkSupportChecker;
                        networkSupportChecker$check$1.L$1 = str;
                        networkSupportChecker$check$1.L$2 = netResult;
                        networkSupportChecker$check$1.label = 6;
                        objM = lpaProfileManager.a(str, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        profile = (Profile) objM;
                        if (profile != null && (lpaProfile = profile.getLpaProfile()) != null) {
                            if (profile.getESim()) {
                                dkf.INSTANCE.a("NetworkSupportChecker.check() fond esim business profile in device, support NetworkService:" + netResult.isSucceed());
                                return netResult.isSucceed() ? a.b.INSTANCE : a.c.INSTANCE;
                            }
                            if (!profile.getSelf()) {
                                dkf.INSTANCE.a("NetworkSupportChecker.check() fond network business profile in device but belong to other");
                                String profileIccid = lpaProfile.getProfileIccid();
                                Intrinsics.checkNotNullExpressionValue(profileIccid, "profileIccid");
                                return new a.OTHER(profileIccid);
                            }
                        }
                        if (!netResult.isSucceed()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device not support network");
                            return a.g.INSTANCE;
                        }
                        NetWorkServiceNetSource netWorkServiceNetSource3 = NetWorkServiceNetSource.INSTANCE;
                        String strF = networkSupportChecker.f();
                        String strE = networkSupportChecker.e();
                        networkSupportChecker$check$1.L$0 = null;
                        networkSupportChecker$check$1.L$1 = null;
                        networkSupportChecker$check$1.L$2 = null;
                        networkSupportChecker$check$1.label = 7;
                        objM = netWorkServiceNetSource3.d(str, strF, strE, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        netResult2 = (NetResult) objM;
                        if (netResult2.isSucceed()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() device import succeed");
                        } else {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() device import error " + netResult2.message);
                        }
                        NetWorkServiceNetSource netWorkServiceNetSource4 = NetWorkServiceNetSource.INSTANCE;
                        networkSupportChecker$check$1.label = 8;
                        objM = netWorkServiceNetSource4.m("", networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arrayList = new ArrayList();
                        for (Object obj : (Iterable) objM) {
                            userCombo2 = (UserCombo) obj;
                            if (userCombo2.isPackage() && userCombo2.isValid()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return a.h.INSTANCE;
                        }
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                        return a.d.INSTANCE;
                    } while (!(!((UserCombo) next).isPackage()));
                    userCombo = (UserCombo) next;
                    if (userCombo != null) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo, status:" + userCombo.getStatus());
                        if (userCombo.isOrderFailed()) {
                            return a.f.INSTANCE;
                        }
                        String iccid2 = userCombo.getIccid();
                        networkSupportChecker$check$1.L$0 = this;
                        networkSupportChecker$check$1.L$1 = str;
                        networkSupportChecker$check$1.label = 3;
                        objM = this.c(str, iccid2, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = (a) objM;
                        if (aVar != null) {
                            return aVar;
                        }
                        esimProfileStateD = this.d();
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo cachedStateOfCombo:" + esimProfileStateD);
                        if (esimProfileStateD == EsimProfileState.OK) {
                            return a.e.INSTANCE;
                        }
                        if (esimProfileStateD.compareTo(EsimProfileState.None) > 0) {
                            return a.f.INSTANCE;
                        }
                        NSCHelper nSCHelper2 = NSCHelper.INSTANCE;
                        NetworkSupportChecker$check$acStatus$1 networkSupportChecker$check$acStatus$2 = new NetworkSupportChecker$check$acStatus$1(str, null);
                        networkSupportChecker$check$1.L$0 = this;
                        networkSupportChecker$check$1.L$1 = null;
                        networkSupportChecker$check$1.label = 4;
                        objM = nSCHelper2.e(1, networkSupportChecker$check$acStatus$2, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        acStatus = (AcStatus) objM;
                        if (!acStatus.d()) {
                            this.g(EsimProfileState.OK);
                            return a.e.INSTANCE;
                        }
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo but not be active ->acStatus:" + acStatus);
                        return a.f.INSTANCE;
                    }
                    ol4Var = gl4.managerApi;
                    if (ol4Var.isCurrentConnected()) {
                        throw new DisconnectException(null, 1, null);
                    }
                    if (!ol4Var.isStubModule()) {
                        throw new SilentUIStateException((DevicePageType) lc5.c(ol4Var.getCurrActiveMac()).a(new Function1<DeviceInfo, DevicePageType>() { // from class: com.heytap.health.esim.nsc.repo.NetworkSupportChecker$check$2
                            @Override // p010kotlin.jvm.functions.Function1
                            @NotNull
                            public final DevicePageType invoke(@NotNull DeviceInfo applyInfo) {
                                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                                return applyInfo.n9();
                            }
                        }), null, 2, null);
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource5 = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.L$0 = this;
                    networkSupportChecker$check$1.L$1 = str;
                    networkSupportChecker$check$1.label = 5;
                    objM = netWorkServiceNetSource5.l(str, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    networkSupportChecker = this;
                    netResult = (NetResult) objM;
                    LpaProfileManager lpaProfileManager2 = LpaProfileManager.INSTANCE;
                    networkSupportChecker$check$1.L$0 = networkSupportChecker;
                    networkSupportChecker$check$1.L$1 = str;
                    networkSupportChecker$check$1.L$2 = netResult;
                    networkSupportChecker$check$1.label = 6;
                    objM = lpaProfileManager2.a(str, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    profile = (Profile) objM;
                    if (profile != null) {
                        if (profile.getESim()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond esim business profile in device, support NetworkService:" + netResult.isSucceed());
                            if (netResult.isSucceed()) {
                            }
                        }
                        if (!profile.getSelf()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond network business profile in device but belong to other");
                            String profileIccid2 = lpaProfile.getProfileIccid();
                            Intrinsics.checkNotNullExpressionValue(profileIccid2, "profileIccid");
                            return new a.OTHER(profileIccid2);
                        }
                    }
                    if (!netResult.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device not support network");
                        return a.g.INSTANCE;
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource6 = NetWorkServiceNetSource.INSTANCE;
                    String strF2 = networkSupportChecker.f();
                    String strE2 = networkSupportChecker.e();
                    networkSupportChecker$check$1.L$0 = null;
                    networkSupportChecker$check$1.L$1 = null;
                    networkSupportChecker$check$1.L$2 = null;
                    networkSupportChecker$check$1.label = 7;
                    objM = netWorkServiceNetSource6.d(str, strF2, strE2, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    netResult2 = (NetResult) objM;
                    if (netResult2.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import error " + netResult2.message);
                    } else {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import succeed");
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource7 = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.label = 8;
                    objM = netWorkServiceNetSource7.m("", networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        userCombo2 = (UserCombo) obj;
                        if (userCombo2.isPackage()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return a.h.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                    return a.d.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(objM);
                    profileDataList = ((LPASyncProto.GetEsimInfo) objM).getProfileDataList();
                    if (profileDataList.size() < 1) {
                        return a.c.INSTANCE;
                    }
                    dkf.INSTANCE.a("LpaProfileObserver -> getProfile in device size 0: " + profileDataList);
                    return a.g.INSTANCE;
                case 2:
                    str = (String) networkSupportChecker$check$1.L$1;
                    this = (NetworkSupportChecker) networkSupportChecker$check$1.L$0;
                    ResultKt.throwOnFailure(objM);
                    it = ((Iterable) objM).iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        userCombo = (UserCombo) next;
                        if (userCombo != null) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo, status:" + userCombo.getStatus());
                            if (userCombo.isOrderFailed()) {
                                return a.f.INSTANCE;
                            }
                            String iccid3 = userCombo.getIccid();
                            networkSupportChecker$check$1.L$0 = this;
                            networkSupportChecker$check$1.L$1 = str;
                            networkSupportChecker$check$1.label = 3;
                            objM = this.c(str, iccid3, networkSupportChecker$check$1);
                            if (objM == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            aVar = (a) objM;
                            if (aVar != null) {
                                return aVar;
                            }
                            esimProfileStateD = this.d();
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo cachedStateOfCombo:" + esimProfileStateD);
                            if (esimProfileStateD == EsimProfileState.OK) {
                                return a.e.INSTANCE;
                            }
                            if (esimProfileStateD.compareTo(EsimProfileState.None) > 0) {
                                return a.f.INSTANCE;
                            }
                            NSCHelper nSCHelper3 = NSCHelper.INSTANCE;
                            NetworkSupportChecker$check$acStatus$1 networkSupportChecker$check$acStatus$3 = new NetworkSupportChecker$check$acStatus$1(str, null);
                            networkSupportChecker$check$1.L$0 = this;
                            networkSupportChecker$check$1.L$1 = null;
                            networkSupportChecker$check$1.label = 4;
                            objM = nSCHelper3.e(1, networkSupportChecker$check$acStatus$3, networkSupportChecker$check$1);
                            if (objM == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            acStatus = (AcStatus) objM;
                            if (!acStatus.d()) {
                                this.g(EsimProfileState.OK);
                                return a.e.INSTANCE;
                            }
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo but not be active ->acStatus:" + acStatus);
                            return a.f.INSTANCE;
                        }
                        ol4Var = gl4.managerApi;
                        if (ol4Var.isCurrentConnected()) {
                            throw new DisconnectException(null, 1, null);
                        }
                        if (!ol4Var.isStubModule()) {
                            throw new SilentUIStateException((DevicePageType) lc5.c(ol4Var.getCurrActiveMac()).a(new Function1<DeviceInfo, DevicePageType>() { // from class: com.heytap.health.esim.nsc.repo.NetworkSupportChecker$check$2
                                @Override // p010kotlin.jvm.functions.Function1
                                @NotNull
                                public final DevicePageType invoke(@NotNull DeviceInfo applyInfo) {
                                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                                    return applyInfo.n9();
                                }
                            }), null, 2, null);
                        }
                        NetWorkServiceNetSource netWorkServiceNetSource8 = NetWorkServiceNetSource.INSTANCE;
                        networkSupportChecker$check$1.L$0 = this;
                        networkSupportChecker$check$1.L$1 = str;
                        networkSupportChecker$check$1.label = 5;
                        objM = netWorkServiceNetSource8.l(str, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        networkSupportChecker = this;
                        netResult = (NetResult) objM;
                        LpaProfileManager lpaProfileManager3 = LpaProfileManager.INSTANCE;
                        networkSupportChecker$check$1.L$0 = networkSupportChecker;
                        networkSupportChecker$check$1.L$1 = str;
                        networkSupportChecker$check$1.L$2 = netResult;
                        networkSupportChecker$check$1.label = 6;
                        objM = lpaProfileManager3.a(str, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        profile = (Profile) objM;
                        if (profile != null) {
                            if (profile.getESim()) {
                                dkf.INSTANCE.a("NetworkSupportChecker.check() fond esim business profile in device, support NetworkService:" + netResult.isSucceed());
                                if (netResult.isSucceed()) {
                                }
                            }
                            if (!profile.getSelf()) {
                                dkf.INSTANCE.a("NetworkSupportChecker.check() fond network business profile in device but belong to other");
                                String profileIccid3 = lpaProfile.getProfileIccid();
                                Intrinsics.checkNotNullExpressionValue(profileIccid3, "profileIccid");
                                return new a.OTHER(profileIccid3);
                            }
                        }
                        if (!netResult.isSucceed()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() current device not support network");
                            return a.g.INSTANCE;
                        }
                        NetWorkServiceNetSource netWorkServiceNetSource9 = NetWorkServiceNetSource.INSTANCE;
                        String strF3 = networkSupportChecker.f();
                        String strE3 = networkSupportChecker.e();
                        networkSupportChecker$check$1.L$0 = null;
                        networkSupportChecker$check$1.L$1 = null;
                        networkSupportChecker$check$1.L$2 = null;
                        networkSupportChecker$check$1.label = 7;
                        objM = netWorkServiceNetSource9.d(str, strF3, strE3, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        netResult2 = (NetResult) objM;
                        if (netResult2.isSucceed()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() device import error " + netResult2.message);
                        } else {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() device import succeed");
                        }
                        NetWorkServiceNetSource netWorkServiceNetSource10 = NetWorkServiceNetSource.INSTANCE;
                        networkSupportChecker$check$1.label = 8;
                        objM = netWorkServiceNetSource10.m("", networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arrayList = new ArrayList();
                        while (r10.hasNext()) {
                            userCombo2 = (UserCombo) obj;
                            if (userCombo2.isPackage()) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList.add(obj);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return a.h.INSTANCE;
                        }
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                        return a.d.INSTANCE;
                    } while (!(!((UserCombo) next).isPackage()));
                    userCombo = (UserCombo) next;
                    if (userCombo != null) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo, status:" + userCombo.getStatus());
                        if (userCombo.isOrderFailed()) {
                            return a.f.INSTANCE;
                        }
                        String iccid4 = userCombo.getIccid();
                        networkSupportChecker$check$1.L$0 = this;
                        networkSupportChecker$check$1.L$1 = str;
                        networkSupportChecker$check$1.label = 3;
                        objM = this.c(str, iccid4, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = (a) objM;
                        if (aVar != null) {
                            return aVar;
                        }
                        esimProfileStateD = this.d();
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo cachedStateOfCombo:" + esimProfileStateD);
                        if (esimProfileStateD == EsimProfileState.OK) {
                            return a.e.INSTANCE;
                        }
                        if (esimProfileStateD.compareTo(EsimProfileState.None) > 0) {
                            return a.f.INSTANCE;
                        }
                        NSCHelper nSCHelper4 = NSCHelper.INSTANCE;
                        NetworkSupportChecker$check$acStatus$1 networkSupportChecker$check$acStatus$4 = new NetworkSupportChecker$check$acStatus$1(str, null);
                        networkSupportChecker$check$1.L$0 = this;
                        networkSupportChecker$check$1.L$1 = null;
                        networkSupportChecker$check$1.label = 4;
                        objM = nSCHelper4.e(1, networkSupportChecker$check$acStatus$4, networkSupportChecker$check$1);
                        if (objM == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        acStatus = (AcStatus) objM;
                        if (!acStatus.d()) {
                            this.g(EsimProfileState.OK);
                            return a.e.INSTANCE;
                        }
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo but not be active ->acStatus:" + acStatus);
                        return a.f.INSTANCE;
                    }
                    ol4Var = gl4.managerApi;
                    if (ol4Var.isCurrentConnected()) {
                        throw new DisconnectException(null, 1, null);
                    }
                    if (!ol4Var.isStubModule()) {
                        throw new SilentUIStateException((DevicePageType) lc5.c(ol4Var.getCurrActiveMac()).a(new Function1<DeviceInfo, DevicePageType>() { // from class: com.heytap.health.esim.nsc.repo.NetworkSupportChecker$check$2
                            @Override // p010kotlin.jvm.functions.Function1
                            @NotNull
                            public final DevicePageType invoke(@NotNull DeviceInfo applyInfo) {
                                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                                return applyInfo.n9();
                            }
                        }), null, 2, null);
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource11 = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.L$0 = this;
                    networkSupportChecker$check$1.L$1 = str;
                    networkSupportChecker$check$1.label = 5;
                    objM = netWorkServiceNetSource11.l(str, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    networkSupportChecker = this;
                    netResult = (NetResult) objM;
                    LpaProfileManager lpaProfileManager4 = LpaProfileManager.INSTANCE;
                    networkSupportChecker$check$1.L$0 = networkSupportChecker;
                    networkSupportChecker$check$1.L$1 = str;
                    networkSupportChecker$check$1.L$2 = netResult;
                    networkSupportChecker$check$1.label = 6;
                    objM = lpaProfileManager4.a(str, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    profile = (Profile) objM;
                    if (profile != null) {
                        if (profile.getESim()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond esim business profile in device, support NetworkService:" + netResult.isSucceed());
                            if (netResult.isSucceed()) {
                            }
                        }
                        if (!profile.getSelf()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond network business profile in device but belong to other");
                            String profileIccid4 = lpaProfile.getProfileIccid();
                            Intrinsics.checkNotNullExpressionValue(profileIccid4, "profileIccid");
                            return new a.OTHER(profileIccid4);
                        }
                    }
                    if (!netResult.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device not support network");
                        return a.g.INSTANCE;
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource12 = NetWorkServiceNetSource.INSTANCE;
                    String strF4 = networkSupportChecker.f();
                    String strE4 = networkSupportChecker.e();
                    networkSupportChecker$check$1.L$0 = null;
                    networkSupportChecker$check$1.L$1 = null;
                    networkSupportChecker$check$1.L$2 = null;
                    networkSupportChecker$check$1.label = 7;
                    objM = netWorkServiceNetSource12.d(str, strF4, strE4, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    netResult2 = (NetResult) objM;
                    if (netResult2.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import error " + netResult2.message);
                    } else {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import succeed");
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource13 = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.label = 8;
                    objM = netWorkServiceNetSource13.m("", networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        userCombo2 = (UserCombo) obj;
                        if (userCombo2.isPackage()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return a.h.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                    return a.d.INSTANCE;
                case 3:
                    String str2 = (String) networkSupportChecker$check$1.L$1;
                    NetworkSupportChecker networkSupportChecker2 = (NetworkSupportChecker) networkSupportChecker$check$1.L$0;
                    ResultKt.throwOnFailure(objM);
                    str = str2;
                    this = networkSupportChecker2;
                    aVar = (a) objM;
                    if (aVar != null) {
                        return aVar;
                    }
                    esimProfileStateD = this.d();
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo cachedStateOfCombo:" + esimProfileStateD);
                    if (esimProfileStateD == EsimProfileState.OK) {
                        return a.e.INSTANCE;
                    }
                    if (esimProfileStateD.compareTo(EsimProfileState.None) > 0) {
                        return a.f.INSTANCE;
                    }
                    NSCHelper nSCHelper5 = NSCHelper.INSTANCE;
                    NetworkSupportChecker$check$acStatus$1 networkSupportChecker$check$acStatus$5 = new NetworkSupportChecker$check$acStatus$1(str, null);
                    networkSupportChecker$check$1.L$0 = this;
                    networkSupportChecker$check$1.L$1 = null;
                    networkSupportChecker$check$1.label = 4;
                    objM = nSCHelper5.e(1, networkSupportChecker$check$acStatus$5, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    acStatus = (AcStatus) objM;
                    if (!acStatus.d()) {
                        this.g(EsimProfileState.OK);
                        return a.e.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo but not be active ->acStatus:" + acStatus);
                    return a.f.INSTANCE;
                case 4:
                    this = (NetworkSupportChecker) networkSupportChecker$check$1.L$0;
                    ResultKt.throwOnFailure(objM);
                    acStatus = (AcStatus) objM;
                    if (!acStatus.d()) {
                        this.g(EsimProfileState.OK);
                        return a.e.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have combo but not be active ->acStatus:" + acStatus);
                    return a.f.INSTANCE;
                case 5:
                    String str3 = (String) networkSupportChecker$check$1.L$1;
                    NetworkSupportChecker networkSupportChecker3 = (NetworkSupportChecker) networkSupportChecker$check$1.L$0;
                    ResultKt.throwOnFailure(objM);
                    networkSupportChecker = networkSupportChecker3;
                    str = str3;
                    netResult = (NetResult) objM;
                    LpaProfileManager lpaProfileManager5 = LpaProfileManager.INSTANCE;
                    networkSupportChecker$check$1.L$0 = networkSupportChecker;
                    networkSupportChecker$check$1.L$1 = str;
                    networkSupportChecker$check$1.L$2 = netResult;
                    networkSupportChecker$check$1.label = 6;
                    objM = lpaProfileManager5.a(str, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    profile = (Profile) objM;
                    if (profile != null) {
                        if (profile.getESim()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond esim business profile in device, support NetworkService:" + netResult.isSucceed());
                            if (netResult.isSucceed()) {
                            }
                        }
                        if (!profile.getSelf()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond network business profile in device but belong to other");
                            String profileIccid5 = lpaProfile.getProfileIccid();
                            Intrinsics.checkNotNullExpressionValue(profileIccid5, "profileIccid");
                            return new a.OTHER(profileIccid5);
                        }
                    }
                    if (!netResult.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device not support network");
                        return a.g.INSTANCE;
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource14 = NetWorkServiceNetSource.INSTANCE;
                    String strF5 = networkSupportChecker.f();
                    String strE5 = networkSupportChecker.e();
                    networkSupportChecker$check$1.L$0 = null;
                    networkSupportChecker$check$1.L$1 = null;
                    networkSupportChecker$check$1.L$2 = null;
                    networkSupportChecker$check$1.label = 7;
                    objM = netWorkServiceNetSource14.d(str, strF5, strE5, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    netResult2 = (NetResult) objM;
                    if (netResult2.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import error " + netResult2.message);
                    } else {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import succeed");
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource15 = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.label = 8;
                    objM = netWorkServiceNetSource15.m("", networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        userCombo2 = (UserCombo) obj;
                        if (userCombo2.isPackage()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return a.h.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                    return a.d.INSTANCE;
                case 6:
                    netResult = (NetResult) networkSupportChecker$check$1.L$2;
                    str = (String) networkSupportChecker$check$1.L$1;
                    networkSupportChecker = (NetworkSupportChecker) networkSupportChecker$check$1.L$0;
                    ResultKt.throwOnFailure(objM);
                    profile = (Profile) objM;
                    if (profile != null) {
                        if (profile.getESim()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond esim business profile in device, support NetworkService:" + netResult.isSucceed());
                            if (netResult.isSucceed()) {
                            }
                        }
                        if (!profile.getSelf()) {
                            dkf.INSTANCE.a("NetworkSupportChecker.check() fond network business profile in device but belong to other");
                            String profileIccid6 = lpaProfile.getProfileIccid();
                            Intrinsics.checkNotNullExpressionValue(profileIccid6, "profileIccid");
                            return new a.OTHER(profileIccid6);
                        }
                    }
                    if (!netResult.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() current device not support network");
                        return a.g.INSTANCE;
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource16 = NetWorkServiceNetSource.INSTANCE;
                    String strF6 = networkSupportChecker.f();
                    String strE6 = networkSupportChecker.e();
                    networkSupportChecker$check$1.L$0 = null;
                    networkSupportChecker$check$1.L$1 = null;
                    networkSupportChecker$check$1.L$2 = null;
                    networkSupportChecker$check$1.label = 7;
                    objM = netWorkServiceNetSource16.d(str, strF6, strE6, networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    netResult2 = (NetResult) objM;
                    if (netResult2.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import error " + netResult2.message);
                    } else {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import succeed");
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource17 = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.label = 8;
                    objM = netWorkServiceNetSource17.m("", networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        userCombo2 = (UserCombo) obj;
                        if (userCombo2.isPackage()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return a.h.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                    return a.d.INSTANCE;
                case 7:
                    ResultKt.throwOnFailure(objM);
                    netResult2 = (NetResult) objM;
                    if (netResult2.isSucceed()) {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import error " + netResult2.message);
                    } else {
                        dkf.INSTANCE.a("NetworkSupportChecker.check() device import succeed");
                    }
                    NetWorkServiceNetSource netWorkServiceNetSource18 = NetWorkServiceNetSource.INSTANCE;
                    networkSupportChecker$check$1.label = 8;
                    objM = netWorkServiceNetSource18.m("", networkSupportChecker$check$1);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        userCombo2 = (UserCombo) obj;
                        if (userCombo2.isPackage()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return a.h.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                    return a.d.INSTANCE;
                case 8:
                    ResultKt.throwOnFailure(objM);
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        userCombo2 = (UserCombo) obj;
                        if (userCombo2.isPackage()) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return a.h.INSTANCE;
                    }
                    dkf.INSTANCE.a("NetworkSupportChecker.check() current device have no network service, but the user have combo(" + arrayList.size() + "), can migrate");
                    return a.d.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e2) {
            dkf.INSTANCE.a("NetworkSupportChecker.check() error:" + e2.getMessage());
            return a.g.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, Continuation<? super a> continuation) {
        NetworkSupportChecker$checkProfileWithDevice$1 networkSupportChecker$checkProfileWithDevice$1;
        if (continuation instanceof NetworkSupportChecker$checkProfileWithDevice$1) {
            networkSupportChecker$checkProfileWithDevice$1 = (NetworkSupportChecker$checkProfileWithDevice$1) continuation;
            int i = networkSupportChecker$checkProfileWithDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                networkSupportChecker$checkProfileWithDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                networkSupportChecker$checkProfileWithDevice$1 = new NetworkSupportChecker$checkProfileWithDevice$1(this, continuation);
            }
        } else {
            networkSupportChecker$checkProfileWithDevice$1 = new NetworkSupportChecker$checkProfileWithDevice$1(this, continuation);
        }
        Object objA = networkSupportChecker$checkProfileWithDevice$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = networkSupportChecker$checkProfileWithDevice$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            if (TextUtils.isEmpty(str2)) {
                dkf.INSTANCE.a("NetworkSupportChecker.check() checkProfileWithDevice, not find iccid in combo");
                return a.f.INSTANCE;
            }
            LpaProfileManager lpaProfileManager = LpaProfileManager.INSTANCE;
            networkSupportChecker$checkProfileWithDevice$1.L$0 = this;
            networkSupportChecker$checkProfileWithDevice$1.L$1 = str2;
            networkSupportChecker$checkProfileWithDevice$1.label = 1;
            objA = lpaProfileManager.a(str, networkSupportChecker$checkProfileWithDevice$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) networkSupportChecker$checkProfileWithDevice$1.L$1;
            this = (NetworkSupportChecker) networkSupportChecker$checkProfileWithDevice$1.L$0;
            ResultKt.throwOnFailure(objA);
        }
        Profile profile = (Profile) objA;
        if (profile == null) {
            return null;
        }
        if (profile.getLpaProfile() == null) {
            dkf.INSTANCE.a("NetworkSupportChecker.check() checkProfileWithDevice, but not fond profile in device");
            this.g(EsimProfileState.NotDownload);
            return a.f.INSTANCE;
        }
        if (Intrinsics.areEqual(profile.getLpaProfile().getProfileIccid(), str2)) {
            dkf.INSTANCE.a("NetworkSupportChecker.check() checkProfileWithDevice, iccid in device equals with combo");
            return null;
        }
        dkf.INSTANCE.a("NetworkSupportChecker.check() checkProfileWithDevice, iccid in device not equals with combo");
        String profileIccid = profile.getLpaProfile().getProfileIccid();
        Intrinsics.checkNotNullExpressionValue(profileIccid, "profile.lpaProfile.profileIccid");
        return new a.OTHER_NETWORK(profileIccid);
    }

    @NotNull
    public EsimProfileState d() {
        return this.a.b();
    }

    @NotNull
    public String e() {
        return this.a.d();
    }

    @NotNull
    public String f() {
        return this.a.i();
    }

    public void g(@NotNull EsimProfileState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.a.s(state);
    }
}
