package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.n8g;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rpc;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/AFibSettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/a;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enable", "w0", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "v0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AFibSettingViewModel extends SHSettingBaseViewModel<com.heytap.health.settings.watch.sporthealthsettings.bean.a> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFibSettingViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super com.heytap.health.settings.watch.sporthealthsettings.bean.a> continuation) {
        return v0();
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.AFIB_ENABLE);
    }

    public final com.heytap.health.settings.watch.sporthealthsettings.bean.a v0() {
        return h0().B().getAfib();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w0(boolean z, @NotNull Continuation<? super Boolean> continuation) {
        AFibSettingViewModel$setAfib$1 aFibSettingViewModel$setAfib$1;
        if (continuation instanceof AFibSettingViewModel$setAfib$1) {
            aFibSettingViewModel$setAfib$1 = (AFibSettingViewModel$setAfib$1) continuation;
            int i = aFibSettingViewModel$setAfib$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aFibSettingViewModel$setAfib$1.label = i - Integer.MIN_VALUE;
            } else {
                aFibSettingViewModel$setAfib$1 = new AFibSettingViewModel$setAfib$1(this, continuation);
            }
        } else {
            aFibSettingViewModel$setAfib$1 = new AFibSettingViewModel$setAfib$1(this, continuation);
        }
        Object objC = aFibSettingViewModel$setAfib$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = aFibSettingViewModel$setAfib$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (AFibSettingViewModel) aFibSettingViewModel$setAfib$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
        }
        ResultKt.throwOnFailure(objC);
        if (!rpc.c()) {
            rg7.l(R$string.settings_device_network_disconnect);
            return Boxing.boxBoolean(false);
        }
        n8g.INSTANCE.b(!z ? 1 : 0);
        MutableLiveData<Integer> mutableLiveDataX = h0().x(SportHealthSetting.AFIB_ENABLE, z);
        aFibSettingViewModel$setAfib$1.L$0 = this;
        aFibSettingViewModel$setAfib$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataX, aFibSettingViewModel$setAfib$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        aFibSettingViewModel$setAfib$1.L$0 = null;
        aFibSettingViewModel$setAfib$1.label = 2;
        objC = this.s0((Integer) objC, aFibSettingViewModel$setAfib$1);
        return objC == coroutine_suspended ? coroutine_suspended : objC;
    }
}
