package com.heytap.health.base.switchManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.network.core.BaseResponse;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.q6j;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wq8;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J%\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/base/switchManager/SwitchStateUtil;", "", "", "c", "", "useCache", "", "Lcom/heytap/health/base/switchManager/CKV;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "", "TAG", "Ljava/lang/String;", "SP_NAME", "SP_KEY_HUGE_RES", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitchStateUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchStateUtil.kt\ncom/heytap/health/base/switchManager/SwitchStateUtil\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,70:1\n48#2,4:71\n*S KotlinDebug\n*F\n+ 1 SwitchStateUtil.kt\ncom/heytap/health/base/switchManager/SwitchStateUtil\n*L\n26#1:71,4\n*E\n"})
public final class SwitchStateUtil {

    @NotNull
    public static final SwitchStateUtil INSTANCE = new SwitchStateUtil();

    @NotNull
    public static final String SP_KEY_HUGE_RES = "sp_key_huge_res";

    @NotNull
    public static final String SP_NAME = "switch_state_util";

    @NotNull
    public static final String TAG = "SSU";

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SwitchStateUtil.kt\ncom/heytap/health/base/switchManager/SwitchStateUtil\n*L\n1#1,110:1\n27#2,2:111\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            a7b.b(SwitchStateUtil.TAG, "getHugeResUrlOnStart error:" + exception.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @JvmStatic
    @Nullable
    public static final Object a(boolean z, @NotNull Continuation<? super List<CKV>> continuation) {
        SwitchStateUtil$getHugeResUrl$1 switchStateUtil$getHugeResUrl$1;
        if (continuation instanceof SwitchStateUtil$getHugeResUrl$1) {
            switchStateUtil$getHugeResUrl$1 = (SwitchStateUtil$getHugeResUrl$1) continuation;
            int i = switchStateUtil$getHugeResUrl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                switchStateUtil$getHugeResUrl$1.label = i - Integer.MIN_VALUE;
            } else {
                switchStateUtil$getHugeResUrl$1 = new SwitchStateUtil$getHugeResUrl$1(continuation);
            }
        } else {
            switchStateUtil$getHugeResUrl$1 = new SwitchStateUtil$getHugeResUrl$1(continuation);
        }
        Object objA = switchStateUtil$getHugeResUrl$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = switchStateUtil$getHugeResUrl$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            if (z) {
                List list = (List) new Gson().fromJson(v9g.x(SP_NAME).E(SP_KEY_HUGE_RES, ""), new TypeToken<List<? extends CKV>>() { // from class: com.heytap.health.base.switchManager.SwitchStateUtil$getHugeResUrl$list$1
                }.getType());
                List list2 = list;
                if (!(list2 == null || list2.isEmpty())) {
                    return list;
                }
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put("switchType", Boxing.boxInt(108));
            q6j q6jVar = (q6j) com.heytap.health.network.core.a.j(q6j.class);
            switchStateUtil$getHugeResUrl$1.label = 1;
            objA = q6jVar.a(map, switchStateUtil$getHugeResUrl$1);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        BaseResponse baseResponse = (BaseResponse) objA;
        v9g.x(SP_NAME).U(SP_KEY_HUGE_RES, ((SwitchBean) baseResponse.getBody()).getConfig());
        return (List) new Gson().fromJson(((SwitchBean) baseResponse.getBody()).getConfig(), new TypeToken<List<? extends CKV>>() { // from class: com.heytap.health.base.switchManager.SwitchStateUtil$getHugeResUrl$list$2
        }.getType());
    }

    @JvmStatic
    @Nullable
    public static final List<CKV> b() {
        return (List) new Gson().fromJson(v9g.x(SP_NAME).E(SP_KEY_HUGE_RES, ""), new TypeToken<List<? extends CKV>>() { // from class: com.heytap.health.base.switchManager.SwitchStateUtil$getHugeResUrlFromCache$list$1
        }.getType());
    }

    @JvmStatic
    public static final void c() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.b(TAG)), new a(CoroutineExceptionHandler.INSTANCE), null, new SwitchStateUtil$getHugeResUrlOnStart$2(null), 2, null);
    }
}
