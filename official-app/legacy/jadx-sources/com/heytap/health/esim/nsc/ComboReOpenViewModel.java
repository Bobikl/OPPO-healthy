package com.heytap.health.esim.nsc;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.health.esim.nsc.dto.NetWorkServiceNetSource;
import com.heytap.health.esim.nsc.repo.DeviceRepo;
import com.heytap.health.esim.nsc.repo.RedteaSp;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.basic.BasicStateViewModel;
import com.oplus.aiunit.vision.Combo;
import com.oplus.aiunit.vision.dkf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/heytap/health/esim/nsc/ComboReOpenViewModel;", "Lcom/heytap/sporthealth/blib/basic/BasicStateViewModel;", "Lcom/oplus/aiunit/vision/zl3;", "", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Activity;", "context", "", "f0", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/zl3;", "userCombo", "", "q", "Ljava/lang/String;", "comboId", "r", "deviceEid", "s", "deviceImei", "t", "deviceIccid", "", "u", "g0", "()J", "expireTime", "Lcom/heytap/health/esim/nsc/repo/DeviceRepo;", "v", "Lcom/heytap/health/esim/nsc/repo/DeviceRepo;", "deviceRepo", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComboReOpenActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComboReOpenActivity.kt\ncom/heytap/health/esim/nsc/ComboReOpenViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
public final class ComboReOpenViewModel extends BasicStateViewModel<Combo> {
    public static final int $stable = 8;
    public final /* synthetic */ RedteaSp o;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Combo userCombo;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final String comboId;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final String deviceEid;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final String deviceImei;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final String deviceIccid;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final long expireTime;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final DeviceRepo deviceRepo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboReOpenViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        this.o = new RedteaSp();
        Object obj = stateHandle.get("combo_id");
        Intrinsics.checkNotNull(obj);
        this.comboId = (String) obj;
        Object obj2 = stateHandle.get("device_eid");
        Intrinsics.checkNotNull(obj2);
        this.deviceEid = (String) obj2;
        Object obj3 = stateHandle.get("device_imei");
        Intrinsics.checkNotNull(obj3);
        this.deviceImei = (String) obj3;
        Object obj4 = stateHandle.get("combo_iccid");
        Intrinsics.checkNotNull(obj4);
        this.deviceIccid = (String) obj4;
        Object obj5 = stateHandle.get("combo_expireTime");
        Intrinsics.checkNotNull(obj5);
        this.expireTime = ((Number) obj5).longValue();
        this.deviceRepo = new DeviceRepo();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super Combo> continuation) {
        ComboReOpenViewModel$loadData$1 comboReOpenViewModel$loadData$1;
        if (continuation instanceof ComboReOpenViewModel$loadData$1) {
            comboReOpenViewModel$loadData$1 = (ComboReOpenViewModel$loadData$1) continuation;
            int i = comboReOpenViewModel$loadData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                comboReOpenViewModel$loadData$1.label = i - Integer.MIN_VALUE;
            } else {
                comboReOpenViewModel$loadData$1 = new ComboReOpenViewModel$loadData$1(this, continuation);
            }
        } else {
            comboReOpenViewModel$loadData$1 = new ComboReOpenViewModel$loadData$1(this, continuation);
        }
        Object objJ = comboReOpenViewModel$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = comboReOpenViewModel$loadData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objJ);
            dkf.INSTANCE.a("ComboReOpenActivity -> comboId:" + this.comboId);
            NetWorkServiceNetSource netWorkServiceNetSource = NetWorkServiceNetSource.INSTANCE;
            String mac = getMac();
            Integer numBoxInt = Boxing.boxInt(2);
            comboReOpenViewModel$loadData$1.L$0 = this;
            comboReOpenViewModel$loadData$1.label = 1;
            objJ = netWorkServiceNetSource.j(mac, numBoxInt, comboReOpenViewModel$loadData$1);
            if (objJ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (ComboReOpenViewModel) comboReOpenViewModel$loadData$1.L$0;
            ResultKt.throwOnFailure(objJ);
        }
        for (Object obj : (Iterable) objJ) {
            if (Intrinsics.areEqual(((Combo) obj).getId(), this.comboId)) {
                Intrinsics.checkNotNull(obj);
                this.userCombo = (Combo) obj;
                return obj;
            }
        }
        obj = null;
        Intrinsics.checkNotNull(obj);
        this.userCombo = (Combo) obj;
        return obj;
    }

    public final void f0(@NotNull Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BasicStateViewModel.z(this, null, new ComboReOpenViewModel$buyCombo$1(this, context, null), 1, null);
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }
}
