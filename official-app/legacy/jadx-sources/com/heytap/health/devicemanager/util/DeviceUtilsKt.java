package com.heytap.health.devicemanager.util;

import androidx.exifinterface.media.ExifInterface;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bl4;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jf0;
import com.oplus.aiunit.vision.ko4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a6\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\n\u001a\u00020\t*\u00020\b\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0001\u001a\u0010\u0010\u000e\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\f\u001a\u0010\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u001a[\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001ac\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0086@ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006#²\u0006\u0012\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010\u00128\nX\u008a\u0084\u0002²\u0006\u0012\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010\u00128\nX\u008a\u0084\u0002"}, d2 = {"R", "Lcom/oplus/aiunit/vision/if0;", "Lkotlin/Function1;", "Lcom/heytap/health/devicemanager/deviceability/DeviceInfo;", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lcom/oplus/aiunit/vision/if0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/jf0;", "Lcom/heytap/health/devicemanager/deviceability/DeviceModel;", MapSchema.FIELD_NAME_KEY, "j", "", "mac", "c", "versionStr", "", "b", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "parse", "Lcom/oplus/aiunit/vision/ko4;", "rspType", "", "timeOut", "retry", "d", "(Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lkotlin/jvm/functions/Function1;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/ra5;", "role", b2n.f, "(Lcom/oplus/aiunit/vision/ra5;Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lkotlin/jvm/functions/Function1;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "eventTag", "device_manager_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,139:1\n37#2,2:140\n*S KotlinDebug\n*F\n+ 1 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n73#1:140,2\n*E\n"})
public final class DeviceUtilsKt {
    public static final <R> R a(@NotNull if0 if0Var, @NotNull Function1<? super DeviceInfo, ? extends R> block) {
        Intrinsics.checkNotNullParameter(if0Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (if0Var instanceof DeviceInfo) {
            return block.invoke(if0Var);
        }
        throw new RuntimeException(if0Var + " not is " + DeviceInfo.class.getCanonicalName());
    }

    public static final int b(@Nullable String str) {
        List listSplit$default;
        StringBuilder sb = new StringBuilder();
        sb.append("getBandFirmwareVersionCode versionStr:");
        sb.append(str);
        boolean z = false;
        String[] strArr = (str == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null)) == null) ? null : (String[]) listSplit$default.toArray(new String[0]);
        if (strArr != null && strArr.length == 3) {
            z = true;
        }
        int i = -1;
        if (!z) {
            return -1;
        }
        try {
            i = Integer.parseInt(strArr[1]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getBandFirmwareVersionCode code:");
            sb2.append(i);
            return i;
        } catch (Throwable unused) {
            return i;
        }
    }

    @NotNull
    public static final String c(@Nullable String str) {
        if ((str == null || str.length() == 0) || str.length() < 5) {
            return "";
        }
        String strSubstring = str.substring(str.length() - 5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return StringsKt__StringsJVMKt.replace$default(strSubstring, ":", "", false, 4, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final <T> Object d(@NotNull String str, @NotNull final MessageEvent messageEvent, @NotNull Function1<? super byte[], ? extends T> function1, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super T> continuation) throws IllegalStateException {
        DeviceUtilsKt$sendMessageWithCoroutine$1 deviceUtilsKt$sendMessageWithCoroutine$1;
        Lazy lazy;
        Function1<? super byte[], ? extends T> function2;
        Object objJ;
        if (continuation instanceof DeviceUtilsKt$sendMessageWithCoroutine$1) {
            deviceUtilsKt$sendMessageWithCoroutine$1 = (DeviceUtilsKt$sendMessageWithCoroutine$1) continuation;
            int i2 = deviceUtilsKt$sendMessageWithCoroutine$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceUtilsKt$sendMessageWithCoroutine$1.label = i2 - Integer.MIN_VALUE;
            } else {
                deviceUtilsKt$sendMessageWithCoroutine$1 = new DeviceUtilsKt$sendMessageWithCoroutine$1(continuation);
            }
        } else {
            deviceUtilsKt$sendMessageWithCoroutine$1 = new DeviceUtilsKt$sendMessageWithCoroutine$1(continuation);
        }
        DeviceUtilsKt$sendMessageWithCoroutine$1 deviceUtilsKt$sendMessageWithCoroutine$2 = deviceUtilsKt$sendMessageWithCoroutine$1;
        Object obj = deviceUtilsKt$sendMessageWithCoroutine$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = deviceUtilsKt$sendMessageWithCoroutine$2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.devicemanager.util.DeviceUtilsKt$sendMessageWithCoroutine$eventTag$2
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "sid:" + messageEvent.getServiceId() + " cid:" + messageEvent.getCommandId();
                }
            });
            try {
                zk4 zk4Var = gl4.devicePrimary.callApi;
                function2 = function1;
                deviceUtilsKt$sendMessageWithCoroutine$2.L$0 = function2;
                deviceUtilsKt$sendMessageWithCoroutine$2.L$1 = lazy2;
                deviceUtilsKt$sendMessageWithCoroutine$2.label = 1;
                objJ = zk4Var.j(str, messageEvent, ko4Var, j2, i, deviceUtilsKt$sendMessageWithCoroutine$2);
                if (objJ == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lazy = lazy2;
            } catch (Exception e2) {
                e = e2;
                lazy = lazy2;
                throw new IllegalStateException(f(lazy) + " send message error:" + e.getMessage());
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lazy = (Lazy) deviceUtilsKt$sendMessageWithCoroutine$2.L$1;
            Function1<? super byte[], ? extends T> function3 = (Function1) deviceUtilsKt$sendMessageWithCoroutine$2.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objJ = obj;
                function2 = function3;
            } catch (Exception e3) {
                e = e3;
                throw new IllegalStateException(f(lazy) + " send message error:" + e.getMessage());
            }
        }
        MessageEvent messageEvent2 = (MessageEvent) objJ;
        if (messageEvent2 == null) {
            throw new IllegalStateException(f(lazy) + " rsp is null");
        }
        try {
            Object data = messageEvent2.getData();
            Intrinsics.checkNotNullExpressionValue(data, "messageRsp.data");
            T tInvoke = function2.invoke(data);
            if (tInvoke != null) {
                return tInvoke;
            }
            throw new IllegalStateException(f(lazy) + " parseFrom is null");
        } catch (InvalidProtocolBufferException e4) {
            throw new IllegalStateException(f(lazy) + " rsp parse error:" + e4.getMessage());
        }
    }

    public static final String f(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final <T> Object g(@NotNull ra5 ra5Var, @NotNull String str, @NotNull final MessageEvent messageEvent, @NotNull Function1<? super byte[], ? extends T> function1, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super T> continuation) throws IllegalStateException {
        DeviceUtilsKt$sendMessageWithCoroutineByRole$1 deviceUtilsKt$sendMessageWithCoroutineByRole$1;
        Lazy lazy;
        Function1<? super byte[], ? extends T> function2;
        Object objB;
        if (continuation instanceof DeviceUtilsKt$sendMessageWithCoroutineByRole$1) {
            deviceUtilsKt$sendMessageWithCoroutineByRole$1 = (DeviceUtilsKt$sendMessageWithCoroutineByRole$1) continuation;
            int i2 = deviceUtilsKt$sendMessageWithCoroutineByRole$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceUtilsKt$sendMessageWithCoroutineByRole$1.label = i2 - Integer.MIN_VALUE;
            } else {
                deviceUtilsKt$sendMessageWithCoroutineByRole$1 = new DeviceUtilsKt$sendMessageWithCoroutineByRole$1(continuation);
            }
        } else {
            deviceUtilsKt$sendMessageWithCoroutineByRole$1 = new DeviceUtilsKt$sendMessageWithCoroutineByRole$1(continuation);
        }
        DeviceUtilsKt$sendMessageWithCoroutineByRole$1 deviceUtilsKt$sendMessageWithCoroutineByRole$2 = deviceUtilsKt$sendMessageWithCoroutineByRole$1;
        Object obj = deviceUtilsKt$sendMessageWithCoroutineByRole$2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = deviceUtilsKt$sendMessageWithCoroutineByRole$2.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Lazy lazy2 = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.devicemanager.util.DeviceUtilsKt$sendMessageWithCoroutineByRole$eventTag$2
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "sid:" + messageEvent.getServiceId() + " cid:" + messageEvent.getCommandId();
                }
            });
            try {
                bl4 bl4Var = gl4.deviceMultiple.callApi;
                function2 = function1;
                deviceUtilsKt$sendMessageWithCoroutineByRole$2.L$0 = function2;
                deviceUtilsKt$sendMessageWithCoroutineByRole$2.L$1 = lazy2;
                deviceUtilsKt$sendMessageWithCoroutineByRole$2.label = 1;
                objB = bl4Var.b(ra5Var, str, messageEvent, ko4Var, j2, i, deviceUtilsKt$sendMessageWithCoroutineByRole$2);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lazy = lazy2;
            } catch (Exception e2) {
                e = e2;
                lazy = lazy2;
                throw new IllegalStateException(i(lazy) + " send message error:" + e.getMessage());
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lazy = (Lazy) deviceUtilsKt$sendMessageWithCoroutineByRole$2.L$1;
            Function1<? super byte[], ? extends T> function3 = (Function1) deviceUtilsKt$sendMessageWithCoroutineByRole$2.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objB = obj;
                function2 = function3;
            } catch (Exception e3) {
                e = e3;
                throw new IllegalStateException(i(lazy) + " send message error:" + e.getMessage());
            }
        }
        MessageEvent messageEvent2 = (MessageEvent) objB;
        if (messageEvent2 == null) {
            throw new IllegalStateException(i(lazy) + " rsp is null");
        }
        try {
            Object data = messageEvent2.getData();
            Intrinsics.checkNotNullExpressionValue(data, "messageRsp.data");
            T tInvoke = function2.invoke(data);
            if (tInvoke != null) {
                return tInvoke;
            }
            throw new IllegalStateException(i(lazy) + " parseFrom is null");
        } catch (InvalidProtocolBufferException e4) {
            throw new IllegalStateException(i(lazy) + " rsp parse error:" + e4.getMessage());
        }
    }

    public static final String i(Lazy<String> lazy) {
        return lazy.getValue();
    }

    @NotNull
    public static final DeviceInfo j(@NotNull if0 if0Var) {
        Intrinsics.checkNotNullParameter(if0Var, "<this>");
        if (if0Var instanceof DeviceInfo) {
            return (DeviceInfo) if0Var;
        }
        throw new RuntimeException(if0Var + " not is " + DeviceInfo.class.getCanonicalName());
    }

    @NotNull
    public static final DeviceModel k(@NotNull jf0 jf0Var) {
        Intrinsics.checkNotNullParameter(jf0Var, "<this>");
        if (jf0Var instanceof DeviceModel) {
            return (DeviceModel) jf0Var;
        }
        throw new RuntimeException(jf0Var + " not is " + DeviceModel.class.getCanonicalName());
    }
}
