package com.heytap.health.devicemanagerimpl.host;

import android.content.Context;
import android.os.IBinder;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.devicemanager.connect.IDeviceRefreshListener;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceinfo.IOobeStateEventListener;
import com.heytap.health.devicemanager.deviceinfo.IOobeStatusListener;
import com.heytap.health.devicemanager.listener.IDeviceAppListChangeListener;
import com.heytap.health.devicemanager.processor.bean.AppListBean;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.heytap.health.devicemanagerimpl.host.business.BaseBusiness;
import com.heytap.health.devicemanagerimpl.host.business.BatteryBusiness;
import com.heytap.health.devicemanagerimpl.host.business.DeviceAppListBusiness;
import com.heytap.health.devicemanagerimpl.host.business.OobeBusiness;
import com.heytap.health.devicemanagerimpl.host.business.PairNewPhoneBusiness;
import com.heytap.health.devicemanagerimpl.host.business.PairSecondBusiness;
import com.heytap.health.devicemanagerimpl.host.business.PushBusiness;
import com.heytap.health.devicemanagerimpl.host.business.ReportDeviceInfoBusiness;
import com.heytap.health.protocol.familydevice.FamilyDeviceProto$FamilyDevicePairInfo;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b6e;
import com.oplus.aiunit.vision.cl4;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ka5;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.tl4;
import com.oplus.aiunit.vision.uhe;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.uzb;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.xk4;
import com.oplus.aiunit.vision.xxb;
import com.oplus.aiunit.vision.y0f;
import com.oplus.aiunit.vision.yxb;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bS\u0010TJ.\u0010\n\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002JS\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\b\u00162\u0006\u0010\u0018\u001a\u00028\u00012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010$\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010&\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0010H\u0016J \u00101\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00103\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020\b2\u0006\u0010)\u001a\u000204H\u0016J\u0010\u00106\u001a\u00020\b2\u0006\u0010)\u001a\u000204H\u0016J\u0010\u00108\u001a\u00020\b2\u0006\u0010)\u001a\u000207H\u0016J\u0010\u00109\u001a\u00020\b2\u0006\u0010)\u001a\u000207H\u0016J\u0018\u0010=\u001a\u00020<2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:H\u0016J\u0012\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010A\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0010H\u0016J \u0010E\u001a\u00020\b2\u0006\u0010C\u001a\u00020B2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000bH\u0016J$\u0010F\u001a\u00020\b2\u0006\u0010C\u001a\u00020B2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010G\u001a\u00020\u0010H\u0016J\u0010\u0010H\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J+\u0010M\u001a\u00020\b2\b\u0010J\u001a\u0004\u0018\u00010I2\u0010\u0010L\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010KH\u0014¢\u0006\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006U"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/host/HDM3Business;", "Lcom/heytap/health/devicemanagerimpl/host/HDM2Connect;", "Lcom/oplus/aiunit/vision/tl4$a;", "", "Lcom/heytap/health/devicemanagerimpl/host/business/BaseBusiness;", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "Lkotlin/Function1;", "", "action", "forEachByRole", "", "mac", "sendAccountFlag", "sendAppVersionCode", "fixFamilyFlag", "", "isFixFamilyFlagDone", "markFixFamilyFlagDone", "clearFixFamilyFlag", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlin/ExtensionFunctionType;", "block", "defRtn", "callback", "businessConvert", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "init0", "release", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "onDevicePreConnected", "onDeviceConnected", "onDeviceBondConnected", "onDeviceUnBond", "onDeviceDisconnected", "requestDeviceBattery", "Lcom/heytap/health/devicemanager/deviceinfo/IOobeStatusListener;", "listener", "addOobeStatusListener", "Lcom/heytap/health/devicemanager/deviceinfo/IOobeStateEventListener;", "addOobeStateEventListener", "oobeFinish", "setOobeStatue", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "onMessageReceived", EngineConstant.REASON, "notifyUnbindStart", "Lcom/heytap/health/devicemanager/connect/IDeviceRefreshListener;", "addRefreshDeviceListener", "removeRefreshDeviceListener", "Lcom/heytap/health/devicemanager/listener/IDeviceAppListChangeListener;", "addDeviceAppListChangeListener", "removeDeviceAppListChangeListener", "", "appIds", "", "findDeviceAppStatusByMacAndAppIds", "Lcom/heytap/health/devicemanager/processor/bean/AppListBean;", "findDeviceAppListByMac", "refreshCloud", "notifyPushResult", "Landroid/os/IBinder;", "token", "model", "addPairMonitor", "removePairMonitor", "isPairing", "getDeviceBindPhoneMac", "Ljava/io/PrintWriter;", "writer", "", RnConstant.KEY_INIT_OPTIONS, "doDump", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "businessList", "Ljava/util/List;", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHDM3Business.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HDM3Business.kt\ncom/heytap/health/devicemanagerimpl/host/HDM3Business\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,349:1\n277#1,7:354\n277#1,7:361\n277#1,7:368\n277#1,7:375\n277#1,7:382\n277#1,7:389\n277#1,7:396\n277#1,7:403\n277#1,7:410\n277#1,7:417\n277#1,7:424\n277#1,7:431\n277#1,7:438\n277#1,7:445\n277#1,7:452\n277#1,7:459\n1855#2,2:350\n1855#2,2:352\n1855#2,2:466\n*S KotlinDebug\n*F\n+ 1 HDM3Business.kt\ncom/heytap/health/devicemanagerimpl/host/HDM3Business\n*L\n209#1:354,7\n215#1:361,7\n221#1:368,7\n227#1:375,7\n248#1:382,7\n254#1:389,7\n260#1:396,7\n287#1:403,7\n293#1:410,7\n299#1:417,7\n308#1:424,7\n314#1:431,7\n320#1:438,7\n326#1:445,7\n332#1:452,7\n338#1:459,7\n78#1:350,2\n104#1:352,2\n345#1:466,2\n*E\n"})
public abstract class HDM3Business extends HDM2Connect implements tl4.a {

    @NotNull
    private final String TAG = "HDM3Business";

    @NotNull
    private final List<BaseBusiness> businessList = new ArrayList();

    /* JADX INFO: renamed from: com.heytap.health.devicemanagerimpl.host.HDM3Business$fixFamilyFlag$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.heytap.health.devicemanagerimpl.host.HDM3Business$fixFamilyFlag$1", f = "HDM3Business.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $mac;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ HDM3Business this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HDM3Business hDM3Business, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$mac = str;
            this.this$0 = hDM3Business;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$mac, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HDM3Business hDM3Business;
            String str;
            String ssoid;
            Object objM5287constructorimpl;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserDeviceInfo boundDeviceInfoByMac = gl4.managerApi.getBoundDeviceInfoByMac(this.$mac);
                if (boundDeviceInfoByMac != null) {
                    hDM3Business = this.this$0;
                    String str2 = this.$mac;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        ml4.d(hDM3Business.TAG, "fixFamilyFlag " + gdb.a(str2));
                        int i2 = boundDeviceInfoByMac.getVirtualAccountData() == null ? 0 : 1;
                        VirtualAccountData virtualAccountData = boundDeviceInfoByMac.getVirtualAccountData();
                        if (virtualAccountData == null || (ssoid = virtualAccountData.getVirtualSsoid()) == null) {
                            ssoid = um.c().getSsoid();
                        }
                        MessageEvent request = xxb.V(i2, ssoid);
                        zk4 zk4Var = gl4.devicePrimary.callApi;
                        Intrinsics.checkNotNullExpressionValue(request, "request");
                        ko4.b bVar = new ko4.b(266, 1);
                        this.L$0 = boundDeviceInfoByMac;
                        this.L$1 = hDM3Business;
                        this.L$2 = str2;
                        this.label = 1;
                        obj = zk4.a.d(zk4Var, str2, request, bVar, 0L, 0, this, 24, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        str = str2;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$2;
            hDM3Business = (HDM3Business) this.L$1;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Intrinsics.checkNotNull(obj);
            objM5287constructorimpl = Result.m5287constructorimpl(FamilyDeviceProto$FamilyDevicePairInfo.parseFrom(((MessageEvent) obj).getData()));
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                ml4.d(hDM3Business.TAG, "fixFamilyFlag fail," + thM5290exceptionOrNullimpl.getMessage());
            }
            if (Result.m5294isSuccessimpl(objM5287constructorimpl)) {
                hDM3Business.markFixFamilyFlagDone(str);
                ml4.d(hDM3Business.TAG, "fixFamilyFlag success," + ((FamilyDeviceProto$FamilyDevicePairInfo) objM5287constructorimpl).getType());
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final <T, R> R businessConvert(Function1<? super BaseBusiness, ? extends T> block, R defRtn, Function1<? super T, ? extends R> callback) {
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            T tInvoke = block.invoke(it.next());
            if (tInvoke != null) {
                return callback.invoke(tInvoke);
            }
        }
        return defRtn;
    }

    private final void clearFixFamilyFlag(String mac) {
        v9g.x("sp_fix_family_flag_new").a0(mac);
    }

    private final void fixFamilyFlag(String mac) {
        if (isFixFamilyFlagDone(mac)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(cl4.INSTANCE, null, null, new AnonymousClass1(mac, this, null), 3, null);
    }

    private final void forEachByRole(List<BaseBusiness> list, ra5.c cVar, Function1<? super BaseBusiness, Unit> function1) {
        for (BaseBusiness baseBusiness : list) {
            if (baseBusiness.g().b(cVar)) {
                function1.invoke(baseBusiness);
            }
        }
    }

    private final boolean isFixFamilyFlagDone(String mac) {
        return v9g.x("sp_fix_family_flag_new").r(mac, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markFixFamilyFlagDone(String mac) {
        v9g.x("sp_fix_family_flag_new").W(mac, true);
    }

    private final void sendAccountFlag(String mac) {
        rl4 rl4Var = gl4.devicePrimary.messageApi;
        MessageEvent messageEventA = y0f.a();
        Intrinsics.checkNotNullExpressionValue(messageEventA, "accountFlag()");
        rl4Var.h(mac, messageEventA, null);
    }

    private final void sendAppVersionCode(String mac) {
        if (((Boolean) lc5.c(mac).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.health.devicemanagerimpl.host.HDM3Business.sendAppVersionCode.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.k0());
            }
        })).booleanValue()) {
            a7b.f("DMLog", "IWatch not send app version code");
            return;
        }
        int iM = qe0.m();
        tl4 tl4Var = gl4.deviceMultiple.messageApi;
        ra5.a aVar = ra5.a.INSTANCE;
        MessageEvent messageEventA = xxb.A(iM, 1);
        Intrinsics.checkNotNullExpressionValue(messageEventA, "getHealthVersionCode(curVerCode, 1)");
        tl4Var.g(aVar, mac, messageEventA, null);
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void addDeviceAppListChangeListener(@NotNull IDeviceAppListChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            DeviceAppListBusiness deviceAppListBusinessB = it.next().b();
            if (deviceAppListBusinessB != null) {
                deviceAppListBusinessB.z(listener);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void addOobeStateEventListener(@NotNull IOobeStateEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            OobeBusiness oobeBusinessC = it.next().c();
            if (oobeBusinessC != null) {
                oobeBusinessC.D(listener);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void addOobeStatusListener(@NotNull IOobeStatusListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            OobeBusiness oobeBusinessC = it.next().c();
            if (oobeBusinessC != null) {
                oobeBusinessC.E(listener);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void addPairMonitor(@NotNull IBinder token, @NotNull String mac, @NotNull String model) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(model, "model");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            b6e b6eVarD = it.next().d();
            if (b6eVarD != null) {
                b6eVarD.w(token, mac, model);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void addRefreshDeviceListener(@NotNull IDeviceRefreshListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            PushBusiness pushBusinessF = it.next().f();
            if (pushBusinessF != null) {
                pushBusinessF.x(listener);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect, com.heytap.health.devicemanagerimpl.host.HDM1DeviceManager, com.heytap.health.devicemanagerimpl.host.HDM0Heytap
    public void doDump(@Nullable PrintWriter writer, @Nullable String[] param) {
        super.doDump(writer, param);
        Iterator<T> it = this.businessList.iterator();
        while (it.hasNext()) {
            ((BaseBusiness) it.next()).h(writer, param);
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    @Nullable
    public AppListBean findDeviceAppListByMac(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            DeviceAppListBusiness deviceAppListBusinessB = it.next().b();
            if (deviceAppListBusinessB != null) {
                return deviceAppListBusinessB.A(mac);
            }
        }
        return null;
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public int findDeviceAppStatusByMacAndAppIds(@NotNull String mac, @NotNull int[] appIds) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(appIds, "appIds");
        int status = ka5.b.INSTANCE.getStatus();
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            DeviceAppListBusiness deviceAppListBusinessB = it.next().b();
            if (deviceAppListBusinessB != null) {
                return deviceAppListBusinessB.B(mac, Arrays.copyOf(appIds, appIds.length)).getStatus();
            }
        }
        return status;
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    @NotNull
    public String getDeviceBindPhoneMac(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            uhe uheVarE = it.next().e();
            if (uheVarE != null) {
                return uheVarE.w(mac);
            }
        }
        return "";
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect
    public void init0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.init0(context);
        gl4.deviceMultiple.messageApi.r(ra5.a.INSTANCE, this);
        this.businessList.add(BatteryBusiness.INSTANCE.m(context, this));
        this.businessList.add(uzb.INSTANCE.m(context, this));
        this.businessList.add(OobeBusiness.INSTANCE.m(context, this));
        this.businessList.add(b6e.INSTANCE.m(context, this));
        this.businessList.add(PushBusiness.INSTANCE.m(context, this));
        this.businessList.add(ReportDeviceInfoBusiness.INSTANCE.m(context, this));
        this.businessList.add(DeviceAppListBusiness.INSTANCE.m(context, this));
        this.businessList.add(uhe.INSTANCE.m(context, this));
        this.businessList.add(PairSecondBusiness.INSTANCE.m(context, this));
        this.businessList.add(PairNewPhoneBusiness.INSTANCE.m(context, this));
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public boolean isPairing() {
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            b6e b6eVarD = it.next().d();
            if (b6eVarD != null) {
                return b6eVarD.y();
            }
        }
        return false;
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void notifyPushResult(boolean refreshCloud) {
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            PushBusiness pushBusinessF = it.next().f();
            if (pushBusinessF != null) {
                pushBusinessF.y(refreshCloud);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void notifyUnbindStart(@NotNull String mac, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            PushBusiness pushBusinessF = it.next().f();
            if (pushBusinessF != null) {
                pushBusinessF.A(mac, reason);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect
    public void onDeviceBondConnected(@NotNull ra5.c role, @NotNull final Node node) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(node, "node");
        super.onDeviceBondConnected(role, node);
        forEachByRole(this.businessList, role, new Function1<BaseBusiness, Unit>() { // from class: com.heytap.health.devicemanagerimpl.host.HDM3Business.onDeviceBondConnected.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseBusiness baseBusiness) {
                invoke2(baseBusiness);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull BaseBusiness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.n(node);
            }
        });
        String nodeId = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
        sendAccountFlag(nodeId);
        String nodeId2 = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId2, "node.nodeId");
        fixFamilyFlag(nodeId2);
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect
    public void onDeviceConnected(@NotNull ra5.c role, @NotNull final Node node) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(node, "node");
        super.onDeviceConnected(role, node);
        forEachByRole(this.businessList, role, new Function1<BaseBusiness, Unit>() { // from class: com.heytap.health.devicemanagerimpl.host.HDM3Business.onDeviceConnected.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseBusiness baseBusiness) {
                invoke2(baseBusiness);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull BaseBusiness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.o(node);
            }
        });
        String nodeId = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
        sendAppVersionCode(nodeId);
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect
    public void onDeviceDisconnected(@NotNull ra5.c role, @NotNull final Node node) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(node, "node");
        super.onDeviceDisconnected(role, node);
        forEachByRole(this.businessList, role, new Function1<BaseBusiness, Unit>() { // from class: com.heytap.health.devicemanagerimpl.host.HDM3Business.onDeviceDisconnected.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseBusiness baseBusiness) {
                invoke2(baseBusiness);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull BaseBusiness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.p(node);
            }
        });
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect
    public void onDevicePreConnected(@NotNull ra5.c role, @NotNull final Node node) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(node, "node");
        super.onDevicePreConnected(role, node);
        forEachByRole(this.businessList, role, new Function1<BaseBusiness, Unit>() { // from class: com.heytap.health.devicemanagerimpl.host.HDM3Business.onDevicePreConnected.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseBusiness baseBusiness) {
                invoke2(baseBusiness);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull BaseBusiness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.q(node);
            }
        });
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect
    public void onDeviceUnBond(@NotNull ra5.c role, @NotNull final Node node) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(node, "node");
        super.onDeviceUnBond(role, node);
        forEachByRole(this.businessList, role, new Function1<BaseBusiness, Unit>() { // from class: com.heytap.health.devicemanagerimpl.host.HDM3Business.onDeviceUnBond.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseBusiness baseBusiness) {
                invoke2(baseBusiness);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull BaseBusiness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.r(node);
            }
        });
        xk4 xk4Var = gl4.businessApi;
        String nodeId = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId, "node.nodeId");
        xk4Var.j(nodeId);
        String nodeId2 = node.getNodeId();
        Intrinsics.checkNotNullExpressionValue(nodeId2, "node.nodeId");
        clearFixFamilyFlag(nodeId2);
    }

    @Override // com.oplus.aiunit.vision.tl4.a
    public void onMessageReceived(@NotNull ra5.c role, @NotNull final String mac, @NotNull final MessageEvent event) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        forEachByRole(this.businessList, role, new Function1<BaseBusiness, Unit>() { // from class: com.heytap.health.devicemanagerimpl.host.HDM3Business.onMessageReceived.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BaseBusiness baseBusiness) {
                invoke2(baseBusiness);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull BaseBusiness it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.s(mac, event);
            }
        });
        if (yxb.b(event)) {
            sendAccountFlag(mac);
        }
    }

    @Override // com.heytap.health.devicemanagerimpl.host.HDM2Connect
    public void release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.release(context);
        Iterator<T> it = this.businessList.iterator();
        while (it.hasNext()) {
            ((BaseBusiness) it.next()).t(context);
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void removeDeviceAppListChangeListener(@NotNull IDeviceAppListChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            DeviceAppListBusiness deviceAppListBusinessB = it.next().b();
            if (deviceAppListBusinessB != null) {
                deviceAppListBusinessB.L(listener);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void removePairMonitor(@NotNull IBinder token, @Nullable String mac, @Nullable String model) {
        Intrinsics.checkNotNullParameter(token, "token");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            b6e b6eVarD = it.next().d();
            if (b6eVarD != null) {
                b6eVarD.z(token, mac, model);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void removeRefreshDeviceListener(@NotNull IDeviceRefreshListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            PushBusiness pushBusinessF = it.next().f();
            if (pushBusinessF != null) {
                pushBusinessF.B(listener);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void requestDeviceBattery(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            BatteryBusiness batteryBusinessA = it.next().a();
            if (batteryBusinessA != null) {
                batteryBusinessA.C(mac);
                return;
            }
        }
    }

    @Override // com.heytap.health.devicemanager.manager.IDeviceManager
    public void setOobeStatue(@NotNull String mac, boolean oobeFinish) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Unit unit = Unit.INSTANCE;
        Iterator<BaseBusiness> it = this.businessList.iterator();
        while (it.hasNext()) {
            OobeBusiness oobeBusinessC = it.next().c();
            if (oobeBusinessC != null) {
                oobeBusinessC.O(mac, oobeFinish);
                return;
            }
        }
    }
}
