package com.heytap.health.network.api.p001switch;

import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c6j;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/network/api/switch/SwitchNetManager;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "switchType", "Ljava/lang/Class;", "classType", "a", "(ILjava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "Companion", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class SwitchNetManager {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final <T> Object a(int i, @NotNull Class<T> cls, @NotNull Continuation<? super T> continuation) {
        SwitchNetManager$queryGlobalConfig$1 switchNetManager$queryGlobalConfig$1;
        if (continuation instanceof SwitchNetManager$queryGlobalConfig$1) {
            switchNetManager$queryGlobalConfig$1 = (SwitchNetManager$queryGlobalConfig$1) continuation;
            int i2 = switchNetManager$queryGlobalConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                switchNetManager$queryGlobalConfig$1.label = i2 - Integer.MIN_VALUE;
            } else {
                switchNetManager$queryGlobalConfig$1 = new SwitchNetManager$queryGlobalConfig$1(this, continuation);
            }
        } else {
            switchNetManager$queryGlobalConfig$1 = new SwitchNetManager$queryGlobalConfig$1(this, continuation);
        }
        Object objA = switchNetManager$queryGlobalConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = switchNetManager$queryGlobalConfig$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objA);
            a7b.f("SwitchNetManager", "queryGlobalConfig:" + i);
            HashMap map = new HashMap();
            map.put("switchType", Boxing.boxInt(i));
            c6j c6jVar = (c6j) a.j(c6j.class);
            switchNetManager$queryGlobalConfig$1.L$0 = cls;
            switchNetManager$queryGlobalConfig$1.label = 1;
            objA = c6jVar.a(map, switchNetManager$queryGlobalConfig$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = (Class) switchNetManager$queryGlobalConfig$1.L$0;
            ResultKt.throwOnFailure(objA);
        }
        BaseResponse baseResponse = (BaseResponse) objA;
        if (baseResponse.isSuccess() && baseResponse.getBody() != null) {
            Object body = baseResponse.getBody();
            Intrinsics.checkNotNull(body, "null cannot be cast to non-null type com.heytap.health.network.api.switch.SwitchGlobalResult");
            SwitchGlobalResult switchGlobalResult = (SwitchGlobalResult) body;
            a7b.f("SwitchNetManager", "queryGlobalConfig config:" + switchGlobalResult + "}");
            if (switchGlobalResult.getConfig() != null) {
                try {
                    return new Gson().fromJson(switchGlobalResult.getConfig(), (Class) cls);
                } catch (JsonSyntaxException e2) {
                    a7b.b("SwitchNetManager", "queryGlobalConfig json parse error:" + e2);
                }
            }
        }
        a7b.b("SwitchNetManager", "queryGlobalConfig response error:" + baseResponse.getErrorCode() + ",body:" + baseResponse.getBody() + ",msg:" + baseResponse.getMessage());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(int i, @NotNull Continuation<? super String> continuation) {
        SwitchNetManager$queryGlobalConfig$3 switchNetManager$queryGlobalConfig$3;
        if (continuation instanceof SwitchNetManager$queryGlobalConfig$3) {
            switchNetManager$queryGlobalConfig$3 = (SwitchNetManager$queryGlobalConfig$3) continuation;
            int i2 = switchNetManager$queryGlobalConfig$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                switchNetManager$queryGlobalConfig$3.label = i2 - Integer.MIN_VALUE;
            } else {
                switchNetManager$queryGlobalConfig$3 = new SwitchNetManager$queryGlobalConfig$3(this, continuation);
            }
        } else {
            switchNetManager$queryGlobalConfig$3 = new SwitchNetManager$queryGlobalConfig$3(this, continuation);
        }
        Object objA = switchNetManager$queryGlobalConfig$3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = switchNetManager$queryGlobalConfig$3.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objA);
            a7b.f("SwitchNetManager", "queryGlobalConfig:" + i);
            HashMap map = new HashMap();
            map.put("switchType", Boxing.boxInt(i));
            c6j c6jVar = (c6j) a.j(c6j.class);
            switchNetManager$queryGlobalConfig$3.label = 1;
            objA = c6jVar.a(map, switchNetManager$queryGlobalConfig$3);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        BaseResponse baseResponse = (BaseResponse) objA;
        if (baseResponse.isSuccess() && baseResponse.getBody() != null) {
            Object body = baseResponse.getBody();
            Intrinsics.checkNotNull(body, "null cannot be cast to non-null type com.heytap.health.network.api.switch.SwitchGlobalResult");
            SwitchGlobalResult switchGlobalResult = (SwitchGlobalResult) body;
            a7b.f("SwitchNetManager", "queryGlobalConfig config:" + switchGlobalResult + "}");
            return switchGlobalResult.getConfig();
        }
        a7b.b("SwitchNetManager", "queryGlobalConfig response error:" + baseResponse.getErrorCode() + ",body:" + baseResponse.getBody() + ",msg:" + baseResponse.getMessage());
        return null;
    }
}
