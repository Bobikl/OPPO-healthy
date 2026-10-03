package com.heytap.health.settings.watch.sporthealthsettings2;

import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.protocol.fitness.FitnessProto;
import com.oplus.aiunit.model.xmd;
import com.oplus.aiunit.vision.ap4;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pl4;
import com.oplus.aiunit.vision.tl4;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.SHSettingBTRepository$Companion$changeDeviceSetting$1", f = "SHSettingBTRepository.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
public final class SHSettingBTRepository$Companion$changeDeviceSetting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ln3<Integer> $callback;
    final /* synthetic */ String $deviceMac;
    final /* synthetic */ SportHealthSetting $item;
    final /* synthetic */ MessageEvent $msg;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHSettingBTRepository$Companion$changeDeviceSetting$1(String str, MessageEvent messageEvent, ln3<Integer> ln3Var, SportHealthSetting sportHealthSetting, Continuation<? super SHSettingBTRepository$Companion$changeDeviceSetting$1> continuation) {
        super(2, continuation);
        this.$deviceMac = str;
        this.$msg = messageEvent;
        this.$callback = ln3Var;
        this.$item = sportHealthSetting;
    }

    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SHSettingBTRepository$Companion$changeDeviceSetting$1(this.$deviceMac, this.$msg, this.$callback, this.$item, continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                pl4 pl4Var = wl4.devicePrimary.d;
                String str = this.$deviceMac;
                Intrinsics.checkNotNull(str);
                MessageEvent messageEvent = this.$msg;
                ap4.c cVar = ap4.c.INSTANCE;
                this.label = 1;
                obj = pl4.a.d(pl4Var, str, messageEvent, cVar, xmd.releaseJobTime, 0, this, 16, (Object) null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MessageEvent messageEvent2 = (MessageEvent) obj;
            if (messageEvent2 != null) {
                ln3<Integer> ln3Var = this.$callback;
                SportHealthSetting sportHealthSetting = this.$item;
                int value = FitnessProto.IntRequest.parseFrom(messageEvent2.getData()).getValue();
                if (ln3Var != null) {
                    ln3Var.onResult(Boxing.boxInt(value == 100000 ? 0 : 1));
                }
                m8b.f("SHS-SettingBTRepository", "Setting response code=" + value + " setting=" + sportHealthSetting.name());
            } else {
                ln3<Integer> ln3Var2 = this.$callback;
                if (ln3Var2 != null) {
                    ln3Var2.onResult(Boxing.boxInt(3));
                }
            }
        } catch (DMCallException e) {
            if (Intrinsics.areEqual(e.getErrorCode(), tl4.c.INSTANCE)) {
                ln3<Integer> ln3Var3 = this.$callback;
                if (ln3Var3 != null) {
                    ln3Var3.onResult(Boxing.boxInt(1));
                }
                m8b.f("SHS-SettingBTRepository", "send setting to device get reply time out setting = " + this.$item.name());
            } else {
                ln3<Integer> ln3Var4 = this.$callback;
                if (ln3Var4 != null) {
                    ln3Var4.onResult(Boxing.boxInt(1));
                }
            }
        } catch (Exception unused) {
            ln3<Integer> ln3Var5 = this.$callback;
            if (ln3Var5 != null) {
                ln3Var5.onResult(Boxing.boxInt(1));
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }
}