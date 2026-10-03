package com.heytap.health.oobe.setups;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.dto.FailOOBEKt;
import com.heytap.health.oobe.repo.OOBEDevice;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.WatchFaceRecom;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.bqi;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.ra2;
import com.oplus.aiunit.vision.vrf;
import io.protostuff.MapSchema;
import java.io.File;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B&\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030:0\u001aø\u0001\u0000¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R\u001a\u0010,\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001b\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/heytap/health/oobe/setups/WatchFaceStep;", "Lcom/heytap/health/oobe/setups/UISetupStep;", "Lcom/oplus/aiunit/vision/vrf;", "", "d", "Lcom/oplus/aiunit/vision/bqi;", "stepCompletionProvider", "", "a", "x", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/base/base/BaseActivity;", "activity", "", "faceKey", "w", "(Lcom/heytap/health/base/base/BaseActivity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "index", "C", "Lcom/heytap/health/oobe/OOBEPairingData;", "q", "Lcom/heytap/health/oobe/OOBEPairingData;", "z", "()Lcom/heytap/health/oobe/OOBEPairingData;", "pairingData", "Landroidx/lifecycle/MutableLiveData;", "r", "Landroidx/lifecycle/MutableLiveData;", "_applyed", "Landroidx/lifecycle/LiveData;", "s", "Landroidx/lifecycle/LiveData;", "y", "()Landroidx/lifecycle/LiveData;", "applyed", "t", "_selectedIndex", "u", "A", "selectedIndex", "v", "Z", "()Z", "isPointOfNoReturn", LogFieldKey.LEVEL_KEY, "()I", "", MapSchema.FIELD_NAME_KEY, "()Ljava/lang/Object;", "iconRes", c8l.KEY_B, "()Ljava/lang/String;", "titleRes", "Landroidx/fragment/app/Fragment;", "j", "()Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Result;", "setupStepOnError", "<init>", "(Lcom/heytap/health/oobe/OOBEPairingData;Landroidx/lifecycle/MutableLiveData;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WatchFaceStep extends UISetupStep implements vrf {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Variants pairingData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<String> _applyed;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final LiveData<String> applyed;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> _selectedIndex;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final LiveData<Integer> selectedIndex;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final boolean isPointOfNoReturn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchFaceStep(@NotNull Variants pairingData, @NotNull MutableLiveData<Result<Boolean>> setupStepOnError) {
        super(pairingData, setupStepOnError);
        Intrinsics.checkNotNullParameter(pairingData, "pairingData");
        Intrinsics.checkNotNullParameter(setupStepOnError, "setupStepOnError");
        this.pairingData = pairingData;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this._applyed = mutableLiveData;
        this.applyed = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>(1);
        this._selectedIndex = mutableLiveData2;
        this.selectedIndex = mutableLiveData2;
        this.isPointOfNoReturn = true;
    }

    @NotNull
    public final LiveData<Integer> A() {
        return this.selectedIndex;
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    @NotNull
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public String p() {
        WatchFaceRecom recommendWatchDial = m().getRecommendWatchDial();
        Intrinsics.checkNotNull(recommendWatchDial);
        return recommendWatchDial.getTitle();
    }

    public final void C(int index) {
        this._selectedIndex.postValue(Integer.valueOf(index));
    }

    @NotNull
    public File D(@NotNull String str) {
        return vrf.a.a(this, str);
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep, com.heytap.setup.libraries.wear.companion.setup.SetupStep
    public void a(@NotNull bqi stepCompletionProvider) {
        Intrinsics.checkNotNullParameter(stepCompletionProvider, "stepCompletionProvider");
        super.a(stepCompletionProvider);
        BuildersKt__Builders_commonKt.launch$default(getScope(), getExceptionHandler(), null, new WatchFaceStep$onStepStarted$1(this, null), 2, null);
    }

    @Override // com.heytap.setup.libraries.wear.companion.setup.SetupStep
    public boolean d() {
        return this.pairingData.isPairNormal() && m().getRecommendWatchDial() != null;
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    @NotNull
    public Fragment j() {
        return new WatchFaceFragment();
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    @NotNull
    public Object k() {
        WatchFaceRecom recommendWatchDial = m().getRecommendWatchDial();
        Intrinsics.checkNotNull(recommendWatchDial);
        return D(recommendWatchDial.getLottieFile());
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    /* JADX INFO: renamed from: l */
    public int getIndex() {
        return e() - 1;
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    /* JADX INFO: renamed from: r, reason: from getter */
    public boolean getIsPointOfNoReturn() {
        return this.isPointOfNoReturn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w(@NotNull BaseActivity baseActivity, @NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        WatchFaceStep$applyWatchFace$1 watchFaceStep$applyWatchFace$1;
        if (continuation instanceof WatchFaceStep$applyWatchFace$1) {
            watchFaceStep$applyWatchFace$1 = (WatchFaceStep$applyWatchFace$1) continuation;
            int i = watchFaceStep$applyWatchFace$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchFaceStep$applyWatchFace$1.label = i - Integer.MIN_VALUE;
            } else {
                watchFaceStep$applyWatchFace$1 = new WatchFaceStep$applyWatchFace$1(this, continuation);
            }
        } else {
            watchFaceStep$applyWatchFace$1 = new WatchFaceStep$applyWatchFace$1(this, continuation);
        }
        Object obj = watchFaceStep$applyWatchFace$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = watchFaceStep$applyWatchFace$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                OOBEDevice oOBEDevice = OOBEDevice.INSTANCE;
                Variants variants = this.pairingData;
                watchFaceStep$applyWatchFace$1.L$0 = this;
                watchFaceStep$applyWatchFace$1.L$1 = str;
                watchFaceStep$applyWatchFace$1.label = 1;
                if (oOBEDevice.a(variants, str, watchFaceStep$applyWatchFace$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) watchFaceStep$applyWatchFace$1.L$1;
                this = (WatchFaceStep) watchFaceStep$applyWatchFace$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this._applyed.postValue(str);
        } catch (Throwable th) {
            ra2.a(th);
            this.s("applyWatchFace error -> " + th.getMessage() + " " + a7b.e(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object x(@NotNull Continuation<? super Boolean> continuation) {
        WatchFaceStep$finishOOBE$1 watchFaceStep$finishOOBE$1;
        if (continuation instanceof WatchFaceStep$finishOOBE$1) {
            watchFaceStep$finishOOBE$1 = (WatchFaceStep$finishOOBE$1) continuation;
            int i = watchFaceStep$finishOOBE$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchFaceStep$finishOOBE$1.label = i - Integer.MIN_VALUE;
            } else {
                watchFaceStep$finishOOBE$1 = new WatchFaceStep$finishOOBE$1(this, continuation);
            }
        } else {
            watchFaceStep$finishOOBE$1 = new WatchFaceStep$finishOOBE$1(this, continuation);
        }
        Object obj = watchFaceStep$finishOOBE$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = watchFaceStep$finishOOBE$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                OOBEDevice oOBEDevice = OOBEDevice.INSTANCE;
                Variants variants = this.pairingData;
                watchFaceStep$finishOOBE$1.L$0 = this;
                watchFaceStep$finishOOBE$1.label = 1;
                if (oOBEDevice.n(variants, watchFaceStep$finishOOBE$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = (WatchFaceStep) watchFaceStep$finishOOBE$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.g();
            return Boxing.boxBoolean(true);
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = th.toString();
            }
            this.s("oobeFinish error -> " + message + " " + a7b.e(th));
            this.u(FailOOBEKt.f(this.pairingData, null, message, 2, null));
            return Boxing.boxBoolean(false);
        }
    }

    @NotNull
    public final LiveData<String> y() {
        return this.applyed;
    }

    @NotNull
    /* JADX INFO: renamed from: z, reason: from getter */
    public final Variants getPairingData() {
        return this.pairingData;
    }
}
