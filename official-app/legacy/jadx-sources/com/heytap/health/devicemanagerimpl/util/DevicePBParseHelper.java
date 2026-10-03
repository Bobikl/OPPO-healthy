package com.heytap.health.devicemanagerimpl.util;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.DeviceInfoRepository;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/heytap/health/devicemanagerimpl/util/DevicePBParseHelper;", "", "", "mac", "Lkotlin/Function1;", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "", "block", "Lcom/heytap/health/protocol/dm/DMProto$ConnectDeviceInfo;", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DevicePBParseHelper {

    @NotNull
    public static final DevicePBParseHelper INSTANCE = new DevicePBParseHelper();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object b(DevicePBParseHelper devicePBParseHelper, String str, Function1 function1, Continuation continuation, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return devicePBParseHelper.a(str, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[Catch: InvalidProtocolBufferException -> 0x0093, TryCatch #1 {InvalidProtocolBufferException -> 0x0093, blocks: (B:33:0x0080, B:36:0x008b, B:37:0x0092), top: B:50:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: Exception -> 0x002d, TRY_ENTER, TryCatch #0 {Exception -> 0x002d, blocks: (B:12:0x0029, B:31:0x007c, B:41:0x00af, B:42:0x00b6, B:28:0x0062), top: B:48:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull String str, @Nullable Function1<? super MessageEvent, Unit> function1, @NotNull Continuation<? super DMProto$ConnectDeviceInfo> continuation) throws IllegalStateException {
        DevicePBParseHelper$getDeviceInfoByDevice$1 devicePBParseHelper$getDeviceInfoByDevice$1;
        MessageEvent messageEvent;
        DMProto$ConnectDeviceInfo from;
        if (continuation instanceof DevicePBParseHelper$getDeviceInfoByDevice$1) {
            devicePBParseHelper$getDeviceInfoByDevice$1 = (DevicePBParseHelper$getDeviceInfoByDevice$1) continuation;
            int i = devicePBParseHelper$getDeviceInfoByDevice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                devicePBParseHelper$getDeviceInfoByDevice$1.label = i - Integer.MIN_VALUE;
            } else {
                devicePBParseHelper$getDeviceInfoByDevice$1 = new DevicePBParseHelper$getDeviceInfoByDevice$1(this, continuation);
            }
        } else {
            devicePBParseHelper$getDeviceInfoByDevice$1 = new DevicePBParseHelper$getDeviceInfoByDevice$1(this, continuation);
        }
        DevicePBParseHelper$getDeviceInfoByDevice$1 devicePBParseHelper$getDeviceInfoByDevice$2 = devicePBParseHelper$getDeviceInfoByDevice$1;
        Object objB = devicePBParseHelper$getDeviceInfoByDevice$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = devicePBParseHelper$getDeviceInfoByDevice$2.label;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        function1 = (Function1) devicePBParseHelper$getDeviceInfoByDevice$2.L$1;
                        str = (String) devicePBParseHelper$getDeviceInfoByDevice$2.L$0;
                        ResultKt.throwOnFailure(objB);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objB);
                    }
                    messageEvent = (MessageEvent) objB;
                    if (messageEvent != null) {
                        throw new IllegalStateException("reportDeviceInfo sendMessageWithCoroutine null");
                    }
                    try {
                        from = DMProto$ConnectDeviceInfo.parseFrom(messageEvent.getData());
                        if (from != null) {
                            return from;
                        }
                        throw new IllegalStateException("reportDeviceInfo parseFrom null");
                    } catch (InvalidProtocolBufferException e2) {
                        throw new IllegalStateException("reportDeviceInfo parseFrom error " + e2.getMessage());
                    }
                }
                ResultKt.throwOnFailure(objB);
                AsyncResult<MessageEvent> asyncResultA = DeviceInfoRepository.a(str);
                devicePBParseHelper$getDeviceInfoByDevice$2.L$0 = str;
                devicePBParseHelper$getDeviceInfoByDevice$2.L$1 = function1;
                devicePBParseHelper$getDeviceInfoByDevice$2.label = 1;
                objB = asyncResultA.b(devicePBParseHelper$getDeviceInfoByDevice$2);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str2 = str;
                MessageEvent messageEvent2 = (MessageEvent) objB;
                if (function1 != null) {
                    function1.invoke(messageEvent2);
                }
                zk4 zk4Var = gl4.devicePrimary.callApi;
                devicePBParseHelper$getDeviceInfoByDevice$2.L$0 = null;
                devicePBParseHelper$getDeviceInfoByDevice$2.L$1 = null;
                devicePBParseHelper$getDeviceInfoByDevice$2.label = 2;
                objB = zk4.a.d(zk4Var, str2, messageEvent2, null, 0L, 0, devicePBParseHelper$getDeviceInfoByDevice$2, 28, null);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                messageEvent = (MessageEvent) objB;
                if (messageEvent != null) {
                    throw new IllegalStateException("reportDeviceInfo sendMessageWithCoroutine null");
                }
                from = DMProto$ConnectDeviceInfo.parseFrom(messageEvent.getData());
                if (from != null) {
                    return from;
                }
                throw new IllegalStateException("reportDeviceInfo parseFrom null");
            } catch (Exception e3) {
                throw new IllegalStateException("reportDeviceInfo sendMessageWithCoroutine error " + e3.getMessage());
            }
        } catch (Exception e4) {
            throw new IllegalStateException("reportDeviceInfo makeRequestDeviceInfoEvent error " + e4.getMessage());
        }
    }
}
