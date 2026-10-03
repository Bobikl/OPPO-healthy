package com.heytap.health.esim.nsc;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.heytap.health.esim.nsc.dto.EsimProfileState;
import com.heytap.health.esim.nsc.repo.RedteaSp;
import com.heytap.health.esim.nsc.utils.DeleteProfileCase;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.heytap.sporthealth.blib.helper.NetDataErrorException;
import com.heytap.sporthealth.blib.helper.SilentUIStateException;
import com.heytap.sporthealth.blib.helper.UIStateException;
import com.oplus.aiunit.vision.dkf;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.wq8;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u001b\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0013\u0010\f\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H\u0002R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/esim/nsc/DeleteStateViewModel;", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "", "Lcom/heytap/health/esim/nsc/dto/EsimProfileState;", "state", "", "h0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e0", "d0", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g0", "Landroidx/lifecycle/MutableLiveData;", "", LogFieldKey.PROCESS_NAME_KEY, "Landroidx/lifecycle/MutableLiveData;", "f0", "()Landroidx/lifecycle/MutableLiveData;", "deviceDelLivedata", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DeleteStateViewModel extends BasicStateViewModel<Object> {
    public static final int $stable = 8;
    public final /* synthetic */ RedteaSp o;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> deviceDelLivedata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteStateViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        this.o = new RedteaSp();
        this.deviceDelLivedata = new MutableLiveData<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super Object> continuation) {
        DeleteStateViewModel$loadData$1 deleteStateViewModel$loadData$1;
        if (continuation instanceof DeleteStateViewModel$loadData$1) {
            deleteStateViewModel$loadData$1 = (DeleteStateViewModel$loadData$1) continuation;
            int i = deleteStateViewModel$loadData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteStateViewModel$loadData$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteStateViewModel$loadData$1 = new DeleteStateViewModel$loadData$1(this, continuation);
            }
        } else {
            deleteStateViewModel$loadData$1 = new DeleteStateViewModel$loadData$1(this, continuation);
        }
        Object obj = deleteStateViewModel$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = deleteStateViewModel$loadData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ol4 ol4Var = gl4.managerApi;
            if (ol4Var.isStubModule()) {
                throw new UIStateException(DevicePageType.ON_STUB_MODULE, null, 2, null);
            }
            Integer num = (Integer) savedStateHandle.get("profileState");
            dkf.INSTANCE.a("del profile page -> " + num);
            int index = com.heytap.health.esim.nsc.repo.a.C0433a.INSTANCE.getIndex();
            if (num != null && num.intValue() == index) {
                h0(EsimProfileState.None);
                g0();
            } else {
                if (!ol4Var.isCurrentConnected()) {
                    throw new SilentUIStateException(DevicePageType.DEVICE_CONNECT_ERROR, "");
                }
                deleteStateViewModel$loadData$1.label = 1;
                if (d0(deleteStateViewModel$loadData$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d0(Continuation<? super Unit> continuation) {
        DeleteStateViewModel$doDelProfile$1 deleteStateViewModel$doDelProfile$1;
        if (continuation instanceof DeleteStateViewModel$doDelProfile$1) {
            deleteStateViewModel$doDelProfile$1 = (DeleteStateViewModel$doDelProfile$1) continuation;
            int i = deleteStateViewModel$doDelProfile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteStateViewModel$doDelProfile$1.label = i - Integer.MIN_VALUE;
            } else {
                deleteStateViewModel$doDelProfile$1 = new DeleteStateViewModel$doDelProfile$1(this, continuation);
            }
        } else {
            deleteStateViewModel$doDelProfile$1 = new DeleteStateViewModel$doDelProfile$1(this, continuation);
        }
        Object obj = deleteStateViewModel$doDelProfile$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = deleteStateViewModel$doDelProfile$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                DeleteProfileCase deleteProfileCase = new DeleteProfileCase();
                String mac = getMac();
                String str = (String) getStateHandle().get("iccid");
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.heytap.health.esim.nsc.DeleteStateViewModel$doDelProfile$2
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.V();
                    }
                };
                deleteStateViewModel$doDelProfile$1.L$0 = this;
                deleteStateViewModel$doDelProfile$1.label = 1;
                if (deleteProfileCase.c(mac, str, function0, deleteStateViewModel$doDelProfile$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (DeleteStateViewModel) deleteStateViewModel$doDelProfile$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.deviceDelLivedata.postValue(Boxing.boxInt(1));
            dkf.INSTANCE.a("DeleteViewModel doDelProfile success");
        } catch (NetDataErrorException e2) {
            dkf.INSTANCE.a("DeleteViewModel doDelProfile error -> " + e2.getMessage());
            if (e2.getCode() != 24503) {
                throw e2;
            }
            rg7.m(e2.getMessage());
            Activity activityP = op.n().p();
            if (activityP != null) {
                activityP.finish();
            }
        }
        return Unit.INSTANCE;
    }

    public final void e0() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DeleteStateViewModel$doDelProfileWithLoading$1(this, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Integer> f0() {
        return this.deviceDelLivedata;
    }

    public final void g0() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), wq8.INSTANCE.b("CheckProfile"), null, new DeleteStateViewModel$loopCheckProfileState$1(this, null), 2, null);
    }

    public void h0(@NotNull EsimProfileState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.o.s(state);
    }
}
