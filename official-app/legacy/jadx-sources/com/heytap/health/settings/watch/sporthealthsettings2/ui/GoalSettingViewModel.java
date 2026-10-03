package com.heytap.health.settings.watch.sporthealthsettings2.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.oplus.aiunit.vision.n8g;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.rpc;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0014J\u001b\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/GoalSettingViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "", "f0", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "q0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "stepGoal", "", "y0", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activityGoal", "w0", "goal", "x0", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public class GoalSettingViewModel extends SHSettingBaseViewModel<DeviceSettings> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalSettingViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
    }

    public static /* synthetic */ Object v0(GoalSettingViewModel goalSettingViewModel, SavedStateHandle savedStateHandle, Continuation<? super DeviceSettings> continuation) {
        return goalSettingViewModel.h0().B();
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super DeviceSettings> continuation) {
        return v0(this, savedStateHandle, continuation);
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean f0() {
        return false;
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    @NotNull
    public Set<SportHealthSetting> q0() {
        return SetsKt__SetsKt.linkedSetOf(SportHealthSetting.STEP_GOAL_VALUE, SportHealthSetting.ACTIVITY_GOAL_VALUE, SportHealthSetting.MEDITATION_BREATH_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w0(int i, @NotNull Continuation<? super Unit> continuation) {
        GoalSettingViewModel$saveActivityGoal$1 goalSettingViewModel$saveActivityGoal$1;
        if (continuation instanceof GoalSettingViewModel$saveActivityGoal$1) {
            goalSettingViewModel$saveActivityGoal$1 = (GoalSettingViewModel$saveActivityGoal$1) continuation;
            int i2 = goalSettingViewModel$saveActivityGoal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goalSettingViewModel$saveActivityGoal$1.label = i2 - Integer.MIN_VALUE;
            } else {
                goalSettingViewModel$saveActivityGoal$1 = new GoalSettingViewModel$saveActivityGoal$1(this, continuation);
            }
        } else {
            goalSettingViewModel$saveActivityGoal$1 = new GoalSettingViewModel$saveActivityGoal$1(this, continuation);
        }
        Object objC = goalSettingViewModel$saveActivityGoal$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = goalSettingViewModel$saveActivityGoal$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                this = (GoalSettingViewModel) goalSettingViewModel$saveActivityGoal$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objC);
        n8g.INSTANCE.f();
        if (!rpc.c()) {
            rg7.l(R$string.settings_device_network_disconnect);
            return Unit.INSTANCE;
        }
        MutableLiveData<Integer> mutableLiveDataV = h0().v(SportHealthSetting.ACTIVITY_GOAL_VALUE, i);
        goalSettingViewModel$saveActivityGoal$1.L$0 = this;
        goalSettingViewModel$saveActivityGoal$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataV, goalSettingViewModel$saveActivityGoal$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        GoalSettingViewModel$saveActivityGoal$2 goalSettingViewModel$saveActivityGoal$2 = new GoalSettingViewModel$saveActivityGoal$2(this, null);
        goalSettingViewModel$saveActivityGoal$1.L$0 = null;
        goalSettingViewModel$saveActivityGoal$1.label = 2;
        if (this.t0((Integer) objC, goalSettingViewModel$saveActivityGoal$2, goalSettingViewModel$saveActivityGoal$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x0(int i, @NotNull Continuation<? super Unit> continuation) {
        GoalSettingViewModel$saveMeditationBreathGoal$1 goalSettingViewModel$saveMeditationBreathGoal$1;
        if (continuation instanceof GoalSettingViewModel$saveMeditationBreathGoal$1) {
            goalSettingViewModel$saveMeditationBreathGoal$1 = (GoalSettingViewModel$saveMeditationBreathGoal$1) continuation;
            int i2 = goalSettingViewModel$saveMeditationBreathGoal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goalSettingViewModel$saveMeditationBreathGoal$1.label = i2 - Integer.MIN_VALUE;
            } else {
                goalSettingViewModel$saveMeditationBreathGoal$1 = new GoalSettingViewModel$saveMeditationBreathGoal$1(this, continuation);
            }
        } else {
            goalSettingViewModel$saveMeditationBreathGoal$1 = new GoalSettingViewModel$saveMeditationBreathGoal$1(this, continuation);
        }
        Object objC = goalSettingViewModel$saveMeditationBreathGoal$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = goalSettingViewModel$saveMeditationBreathGoal$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                this = (GoalSettingViewModel) goalSettingViewModel$saveMeditationBreathGoal$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objC);
        n8g.INSTANCE.o();
        if (!rpc.c()) {
            rg7.l(R$string.settings_device_network_disconnect);
            return Unit.INSTANCE;
        }
        MutableLiveData<Integer> mutableLiveDataV = h0().v(SportHealthSetting.MEDITATION_BREATH_VALUE, i);
        goalSettingViewModel$saveMeditationBreathGoal$1.L$0 = this;
        goalSettingViewModel$saveMeditationBreathGoal$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataV, goalSettingViewModel$saveMeditationBreathGoal$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        GoalSettingViewModel$saveMeditationBreathGoal$2 goalSettingViewModel$saveMeditationBreathGoal$2 = new GoalSettingViewModel$saveMeditationBreathGoal$2(this, null);
        goalSettingViewModel$saveMeditationBreathGoal$1.L$0 = null;
        goalSettingViewModel$saveMeditationBreathGoal$1.label = 2;
        if (this.t0((Integer) objC, goalSettingViewModel$saveMeditationBreathGoal$2, goalSettingViewModel$saveMeditationBreathGoal$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object y0(int i, @NotNull Continuation<? super Unit> continuation) {
        GoalSettingViewModel$saveStepGoal$1 goalSettingViewModel$saveStepGoal$1;
        if (continuation instanceof GoalSettingViewModel$saveStepGoal$1) {
            goalSettingViewModel$saveStepGoal$1 = (GoalSettingViewModel$saveStepGoal$1) continuation;
            int i2 = goalSettingViewModel$saveStepGoal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goalSettingViewModel$saveStepGoal$1.label = i2 - Integer.MIN_VALUE;
            } else {
                goalSettingViewModel$saveStepGoal$1 = new GoalSettingViewModel$saveStepGoal$1(this, continuation);
            }
        } else {
            goalSettingViewModel$saveStepGoal$1 = new GoalSettingViewModel$saveStepGoal$1(this, continuation);
        }
        Object objC = goalSettingViewModel$saveStepGoal$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = goalSettingViewModel$saveStepGoal$1.label;
        if (i3 != 0) {
            if (i3 == 1) {
                this = (GoalSettingViewModel) goalSettingViewModel$saveStepGoal$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objC);
        n8g.Companion companion = n8g.INSTANCE;
        companion.m0();
        if (!rpc.c()) {
            rg7.l(R$string.settings_device_network_disconnect);
            return Unit.INSTANCE;
        }
        companion.n0(i);
        MutableLiveData<Integer> mutableLiveDataV = h0().v(SportHealthSetting.STEP_GOAL_VALUE, i);
        goalSettingViewModel$saveStepGoal$1.L$0 = this;
        goalSettingViewModel$saveStepGoal$1.label = 1;
        objC = ExpandKt.c(mutableLiveDataV, goalSettingViewModel$saveStepGoal$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        Intrinsics.checkNotNull(objC);
        Integer numBoxInt = Boxing.boxInt(((Number) objC).intValue());
        GoalSettingViewModel$saveStepGoal$2 goalSettingViewModel$saveStepGoal$2 = new GoalSettingViewModel$saveStepGoal$2(this, null);
        goalSettingViewModel$saveStepGoal$1.L$0 = null;
        goalSettingViewModel$saveStepGoal$1.label = 2;
        if (this.t0(numBoxInt, goalSettingViewModel$saveStepGoal$2, goalSettingViewModel$saveStepGoal$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
