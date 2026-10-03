package com.heytap.health.oobe.setups;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.oobe.Variants;
import com.heytap.health.oobe.repo.OOBEDevice;
import com.heytap.health.watchpair.R$raw;
import com.heytap.health.watchpair.R$string;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.jlj;
import com.oplus.aiunit.vision.ra2;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020-0\u001eø\u0001\u0000¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u001b\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/heytap/health/oobe/setups/WearStep;", "Lcom/heytap/health/oobe/setups/UISetupStep;", "", "d", "", "A", c8l.KEY_B, "Lcom/heytap/health/base/base/BaseActivity;", "activity", "w", "(Lcom/heytap/health/base/base/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/oobe/OOBEPairingData;", "q", "Lcom/heytap/health/oobe/OOBEPairingData;", "getPairingData", "()Lcom/heytap/health/oobe/OOBEPairingData;", "pairingData", "", "r", "I", LogFieldKey.LEVEL_KEY, "()I", "index", "s", "x", "()Ljava/lang/Integer;", "iconRes", "t", "z", "titleRes", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "u", "Landroidx/lifecycle/MutableLiveData;", "_leftHand", "Landroidx/lifecycle/LiveData;", "v", "Landroidx/lifecycle/LiveData;", "y", "()Landroidx/lifecycle/LiveData;", "leftHand", "Landroidx/fragment/app/Fragment;", "j", "()Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Result;", "setupStepOnError", "<init>", "(Lcom/heytap/health/oobe/OOBEPairingData;Landroidx/lifecycle/MutableLiveData;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WearStep extends UISetupStep {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Variants pairingData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final int iconRes;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int titleRes;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Boolean> _leftHand;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final LiveData<Boolean> leftHand;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearStep(@NotNull Variants pairingData, @NotNull MutableLiveData<Result<Boolean>> setupStepOnError) {
        super(pairingData, setupStepOnError);
        Intrinsics.checkNotNullParameter(pairingData, "pairingData");
        Intrinsics.checkNotNullParameter(setupStepOnError, "setupStepOnError");
        this.pairingData = pairingData;
        this.index = 6;
        this.iconRes = R$raw.oobe_wear;
        this.titleRes = R$string.oobe_wear_step;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.TRUE);
        this._leftHand = mutableLiveData;
        this.leftHand = mutableLiveData;
    }

    public final void A() {
        this._leftHand.postValue(Boolean.TRUE);
    }

    public final void B() {
        this._leftHand.postValue(Boolean.FALSE);
    }

    @Override // com.heytap.setup.libraries.wear.companion.setup.SetupStep
    public boolean d() {
        return (this.pairingData.isPairIWatch() || this.pairingData.isPairSecond()) ? false : true;
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    @NotNull
    public Fragment j() {
        return new WearFragment();
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    /* JADX INFO: renamed from: l, reason: from getter */
    public int getIndex() {
        return this.index;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object w(@NotNull BaseActivity baseActivity, @NotNull Continuation<? super Unit> continuation) {
        WearStep$doContinue$1 wearStep$doContinue$1;
        if (continuation instanceof WearStep$doContinue$1) {
            wearStep$doContinue$1 = (WearStep$doContinue$1) continuation;
            int i = wearStep$doContinue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wearStep$doContinue$1.label = i - Integer.MIN_VALUE;
            } else {
                wearStep$doContinue$1 = new WearStep$doContinue$1(this, continuation);
            }
        } else {
            wearStep$doContinue$1 = new WearStep$doContinue$1(this, continuation);
        }
        Object obj = wearStep$doContinue$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = wearStep$doContinue$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                baseActivity.i7();
                OOBEDevice oOBEDevice = OOBEDevice.INSTANCE;
                String address = this.pairingData.getAddress();
                int i3 = Intrinsics.areEqual(this._leftHand.getValue(), Boxing.boxBoolean(true)) ? 0 : 1;
                wearStep$doContinue$1.L$0 = this;
                wearStep$doContinue$1.L$1 = baseActivity;
                wearStep$doContinue$1.label = 1;
                if (oOBEDevice.s(address, i3, wearStep$doContinue$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseActivity = (BaseActivity) wearStep$doContinue$1.L$1;
                this = (WearStep) wearStep$doContinue$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            jlj.c().i();
        } catch (Throwable th) {
            try {
                this.s("error -> " + th.getMessage());
                ra2.a(th);
            } finally {
                baseActivity.d7();
                this.g();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer k() {
        return Integer.valueOf(this.iconRes);
    }

    @NotNull
    public final LiveData<Boolean> y() {
        return this.leftHand;
    }

    @Override // com.heytap.health.oobe.setups.UISetupStep
    @NotNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Integer p() {
        return Integer.valueOf(this.titleRes);
    }
}
