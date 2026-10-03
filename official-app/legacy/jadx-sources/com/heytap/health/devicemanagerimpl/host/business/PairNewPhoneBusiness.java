package com.heytap.health.devicemanagerimpl.host.business;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.heytap.health.devicemanager.manager.IDeviceManager;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.health.protocol.dm.DMProto$CommonError;
import com.heytap.health.protocol.dm.DMProto$Package;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.t04;
import com.oplus.aiunit.vision.ul5;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Map;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002J\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/host/business/PairNewPhoneBusiness;", "Lcom/heytap/health/devicemanagerimpl/host/business/BaseBusiness;", "Landroid/content/Context;", "context", "Lcom/heytap/health/devicemanager/manager/IDeviceManager;", "manager", LogFieldKey.MESSAGE_KEY, "", "A", "", "pushMsg", "z", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushMsgId", "deviceMac", "C", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSuccess", c8l.KEY_B, "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"StaticFieldLeak"})
public final class PairNewPhoneBusiness extends BaseBusiness {

    @NotNull
    public static final PairNewPhoneBusiness INSTANCE = new PairNewPhoneBusiness();

    public PairNewPhoneBusiness() {
        super("Pair");
    }

    public final void A() {
        a7b.f(getTAG(), "Register push msg receiver for pair new phone");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_broadcast_spt_push_msg");
        rdf.a(b78.a(), new BroadcastReceiver() { // from class: com.heytap.health.devicemanagerimpl.host.business.PairNewPhoneBusiness$initPush$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                if (intent == null) {
                    return;
                }
                String stringExtra = intent.getStringExtra("content");
                if (TextUtils.isEmpty(stringExtra)) {
                    a7b.b(PairNewPhoneBusiness.INSTANCE.getTAG(), "Push msg content is null");
                } else {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new PairNewPhoneBusiness$initPush$1$onReceive$1(stringExtra, null), 3, null);
                }
            }
        }, intentFilter, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(String str, boolean z, Continuation<? super Unit> continuation) {
        PairNewPhoneBusiness$reportEnterPairNewStateToCloud$1 pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1;
        Map<String, Object> mapMapOf;
        if (continuation instanceof PairNewPhoneBusiness$reportEnterPairNewStateToCloud$1) {
            pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1 = (PairNewPhoneBusiness$reportEnterPairNewStateToCloud$1) continuation;
            int i = pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1.label = i - Integer.MIN_VALUE;
            } else {
                pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1 = new PairNewPhoneBusiness$reportEnterPairNewStateToCloud$1(this, continuation);
            }
        } else {
            pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1 = new PairNewPhoneBusiness$reportEnterPairNewStateToCloud$1(this, continuation);
        }
        Object objA = pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objA);
                ul5 ul5Var = (ul5) a.j(ul5.class);
                Pair[] pairArr = new Pair[2];
                pairArr[0] = TuplesKt.to("msgId", str);
                pairArr[1] = TuplesKt.to("status", Boxing.boxInt(z ? 1 : -1));
                mapMapOf = MapsKt__MapsKt.mapOf(pairArr);
                Result.Companion companion = Result.INSTANCE;
                pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1.L$0 = mapMapOf;
                pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1.label = 1;
                objA = ul5Var.a(mapMapOf, pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mapMapOf = (Map) pairNewPhoneBusiness$reportEnterPairNewStateToCloud$1.L$0;
                ResultKt.throwOnFailure(objA);
            }
            a7b.f(INSTANCE.getTAG(), "Report enter pair new phone page state=" + mapMapOf + " to cloud, isSuccess=" + ((BaseResponse) objA).isSuccess());
            Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:41:0x00e3, B:43:0x00e7, B:47:0x00f7, B:49:0x0105, B:48:0x00fa), top: B:72:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa A[Catch: all -> 0x010b, TryCatch #2 {all -> 0x010b, blocks: (B:41:0x00e3, B:43:0x00e7, B:47:0x00f7, B:49:0x0105, B:48:0x00fa), top: B:72:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object C(String str, String str2, Continuation<? super Unit> continuation) {
        PairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1 pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1;
        Ref.BooleanRef booleanRef;
        Object obj;
        Object objC;
        Ref.BooleanRef booleanRef2;
        boolean z;
        MessageEvent messageEvent;
        PairNewPhoneBusiness pairNewPhoneBusiness = this;
        String str3 = str;
        if (continuation instanceof PairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) {
            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1 = (PairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) continuation;
            int i = pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = i - Integer.MIN_VALUE;
            } else {
                pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1 = new PairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1(pairNewPhoneBusiness, continuation);
            }
        } else {
            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1 = new PairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1(pairNewPhoneBusiness, continuation);
        }
        Object obj2 = pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
            if (userDeviceInfoJ != null ? userDeviceInfoJ.isConnect() : false) {
                if (Intrinsics.areEqual(str2, userDeviceInfoJ != null ? userDeviceInfoJ.getMac() : null)) {
                    MessageEvent messageEvent2 = new MessageEvent(1, 31, DMProto$Package.newBuilder().setPackageName("com.heytap.wearable.oobe").setAction("com.heytap.wearable.oobe.MIGRATE_QRCODE").build().toByteArray());
                    Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        a7b.f(INSTANCE.getTAG(), "Send msg to device, open pair new phone page");
                        zk4 zk4Var = gl4.devicePrimary.callApi;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$0 = pairNewPhoneBusiness;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$1 = str3;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$2 = booleanRef3;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = 2;
                        booleanRef = booleanRef3;
                        obj = null;
                        try {
                            objC = zk4.a.c(zk4Var, messageEvent2, null, 0L, 0, pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1, 14, null);
                            if (objC == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            booleanRef2 = booleanRef;
                            messageEvent = (MessageEvent) objC;
                            if (messageEvent != null) {
                                if (DMProto$CommonError.parseFrom(messageEvent.getData()).getErrorCode() == 0) {
                                    z2 = false;
                                }
                                booleanRef2.element = z2;
                            } else {
                                a7b.b(INSTANCE.getTAG(), "Watch not response for enter pair new phone page");
                            }
                            Result.m5287constructorimpl(Unit.INSTANCE);
                            z = booleanRef2.element;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$0 = obj;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$1 = obj;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$2 = obj;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = 3;
                            if (pairNewPhoneBusiness.B(str3, z, pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion2 = Result.INSTANCE;
                            Result.m5287constructorimpl(ResultKt.createFailure(th));
                            booleanRef2 = booleanRef;
                            z = booleanRef2.element;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$0 = obj;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$1 = obj;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$2 = obj;
                            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = 3;
                            if (pairNewPhoneBusiness.B(str3, z, pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        booleanRef = booleanRef3;
                        obj = null;
                        Result.Companion companion3 = Result.INSTANCE;
                        Result.m5287constructorimpl(ResultKt.createFailure(th));
                        booleanRef2 = booleanRef;
                        z = booleanRef2.element;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$0 = obj;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$1 = obj;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$2 = obj;
                        pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = 3;
                        if (pairNewPhoneBusiness.B(str3, z, pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = 1;
            if (pairNewPhoneBusiness.B(str3, false, pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(obj2);
            return Unit.INSTANCE;
        }
        if (i2 == 2) {
            Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$2;
            str3 = (String) pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$1;
            PairNewPhoneBusiness pairNewPhoneBusiness2 = (PairNewPhoneBusiness) pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                booleanRef2 = booleanRef4;
                pairNewPhoneBusiness = pairNewPhoneBusiness2;
                obj = null;
                objC = obj2;
                try {
                    messageEvent = (MessageEvent) objC;
                    if (messageEvent != null) {
                        if (DMProto$CommonError.parseFrom(messageEvent.getData()).getErrorCode() == 0) {
                            z2 = false;
                        }
                        booleanRef2.element = z2;
                    } else {
                        a7b.b(INSTANCE.getTAG(), "Watch not response for enter pair new phone page");
                    }
                    Result.m5287constructorimpl(Unit.INSTANCE);
                } catch (Throwable th3) {
                    th = th3;
                    booleanRef = booleanRef2;
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m5287constructorimpl(ResultKt.createFailure(th));
                    booleanRef2 = booleanRef;
                }
            } catch (Throwable th4) {
                th = th4;
                booleanRef = booleanRef4;
                pairNewPhoneBusiness = pairNewPhoneBusiness2;
                obj = null;
                Result.Companion companion5 = Result.INSTANCE;
                Result.m5287constructorimpl(ResultKt.createFailure(th));
                booleanRef2 = booleanRef;
                z = booleanRef2.element;
                pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$0 = obj;
                pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$1 = obj;
                pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$2 = obj;
                pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = 3;
                if (pairNewPhoneBusiness.B(str3, z, pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            z = booleanRef2.element;
            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$0 = obj;
            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$1 = obj;
            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.L$2 = obj;
            pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1.label = 3;
            if (pairNewPhoneBusiness.B(str3, z, pairNewPhoneBusiness$sendEnterPairNewPhoneMsgToWatch$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }

    @Override // com.heytap.health.devicemanagerimpl.host.business.BaseBusiness
    @NotNull
    public BaseBusiness m(@NotNull Context context, @NotNull IDeviceManager manager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(manager, "manager");
        A();
        return super.m(context, manager);
    }

    public final Object z(String str, Continuation<? super Unit> continuation) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.optInt("messageType", -1) == 102) {
            a7b.f(getTAG(), "Pair new phone push msg=" + str);
            String messageJsonStr = jSONObject.optString("message", "");
            Intrinsics.checkNotNullExpressionValue(messageJsonStr, "messageJsonStr");
            if (messageJsonStr.length() == 0) {
                a7b.b(getTAG(), "Push message is empty");
                return Unit.INSTANCE;
            }
            JSONObject jSONObject2 = new JSONObject(messageJsonStr);
            long jOptLong = jSONObject2.optLong("timestamp", -1L);
            int iOptInt = jSONObject2.optInt("timeout", -1);
            String pushMsgId = jSONObject.optString("msgId", "");
            String deviceMac = jSONObject.optString(t04.DEVICE_UNIQUE_ID, "");
            getTAG();
            StringBuilder sb = new StringBuilder();
            sb.append("Pair new phone msg=");
            sb.append(str);
            if (jOptLong > 0 && iOptInt > 0) {
                Intrinsics.checkNotNullExpressionValue(pushMsgId, "pushMsgId");
                if (pushMsgId.length() > 0) {
                    Intrinsics.checkNotNullExpressionValue(deviceMac, "deviceMac");
                    if (deviceMac.length() > 0) {
                        if (System.currentTimeMillis() - jOptLong <= ((long) iOptInt) * 1000) {
                            Object objC = C(pushMsgId, deviceMac, continuation);
                            return objC == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
                        }
                        a7b.f(getTAG(), "Push msg delay, pushTime(ms)=" + jOptLong + "  timeout=" + iOptInt + "s");
                        Object objB = B(pushMsgId, false, continuation);
                        return objB == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Unit.INSTANCE;
                    }
                }
            }
            a7b.b(getTAG(), "Push msg content error");
        }
        return Unit.INSTANCE;
    }
}
