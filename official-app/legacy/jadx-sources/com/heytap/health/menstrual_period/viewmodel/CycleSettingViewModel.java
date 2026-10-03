package com.heytap.health.menstrual_period.viewmodel;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.menstrual.inter.MenstrualService;
import com.heytap.health.menstrual_period.device.CycleDeviceApi;
import com.heytap.health.menstrual_period.net.CycleNetRepository;
import com.heytap.health.menstrual_period.viewhelper.CycleSettingHelper;
import com.heytap.health.menstrual_period.viewhelper.MenstrualDialogHelper;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.gub;
import com.oplus.aiunit.vision.um;
import com.oplus.aiunit.vision.x0;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 <2\u00020\u0001:\u0002=>B\u0007¢\u0006\u0004\b:\u0010;J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010,R!\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010,R!\u00103\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010,R\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u0013048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006?"}, d2 = {"Lcom/heytap/health/menstrual_period/viewmodel/CycleSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "", "v", "", "days", "I", "K", "", ClickApiEntity.TIME, "J", "Landroidx/lifecycle/MutableLiveData;", "x", UserInfo.SEX_FEMALE, "C", "O", "Lcom/heytap/health/menstrual_period/viewhelper/MenstrualDialogHelper$DialogType;", "A", "M", "", "u", "value", "w", "(Ljava/lang/Long;)Z", "N", "L", "Lcom/heytap/health/menstrual_period/net/CycleNetRepository;", "i", "Lkotlin/Lazy;", "z", "()Lcom/heytap/health/menstrual_period/net/CycleNetRepository;", "cycleNetRepository", "", "j", "H", "()Ljava/lang/String;", "ssoid", "Lcom/heytap/health/menstrual/inter/MenstrualService;", MapSchema.FIELD_NAME_KEY, ExifInterface.LONGITUDE_EAST, "()Lcom/heytap/health/menstrual/inter/MenstrualService;", "menstrualService", LogFieldKey.LEVEL_KEY, "y", "()Landroidx/lifecycle/MutableLiveData;", "cycleDefaultDaysLiveData", LogFieldKey.MESSAGE_KEY, "G", "periodDefaultDaysLiveData", "n", "D", "latestDaysLiveData", "Landroidx/compose/runtime/MutableState;", "o", "Landroidx/compose/runtime/MutableState;", c8l.KEY_B, "()Landroidx/compose/runtime/MutableState;", "enableState", "<init>", "()V", "Companion", "a", "ValueType", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CycleSettingViewModel extends ViewModel {

    @NotNull
    public static final String TAG = "CycleSettingViewModel";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy cycleNetRepository = LazyKt__LazyJVMKt.lazy(new Function0<CycleNetRepository>() { // from class: com.heytap.health.menstrual_period.viewmodel.CycleSettingViewModel$cycleNetRepository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CycleNetRepository invoke() {
            return new CycleNetRepository();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy ssoid = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.menstrual_period.viewmodel.CycleSettingViewModel$ssoid$2
        @Override // p010kotlin.jvm.functions.Function0
        public final String invoke() {
            return um.c().getSsoid();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy menstrualService = LazyKt__LazyJVMKt.lazy(new Function0<MenstrualService>() { // from class: com.heytap.health.menstrual_period.viewmodel.CycleSettingViewModel$menstrualService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MenstrualService invoke() {
            Object objNavigation = x0.d().b("/menstrual/MenstrualService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.menstrual.inter.MenstrualService");
            return (MenstrualService) objNavigation;
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy cycleDefaultDaysLiveData = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<Integer>>() { // from class: com.heytap.health.menstrual_period.viewmodel.CycleSettingViewModel$cycleDefaultDaysLiveData$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>(Integer.valueOf(CycleSettingHelper.INSTANCE.d()));
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy periodDefaultDaysLiveData = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<Integer>>() { // from class: com.heytap.health.menstrual_period.viewmodel.CycleSettingViewModel$periodDefaultDaysLiveData$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>(Integer.valueOf(CycleSettingHelper.INSTANCE.g()));
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy latestDaysLiveData = LazyKt__LazyJVMKt.lazy(new Function0<MutableLiveData<Long>>() { // from class: com.heytap.health.menstrual_period.viewmodel.CycleSettingViewModel$latestDaysLiveData$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MutableLiveData<Long> invoke() {
            return new MutableLiveData<>(Long.valueOf(CycleSettingHelper.INSTANCE.e()));
        }
    });

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableState<Boolean> enableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/menstrual_period/viewmodel/CycleSettingViewModel$ValueType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FORGET", "UNSET", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ValueType {
        FORGET(-1),
        UNSET(-2);

        private final int value;

        ValueType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @NotNull
    public final MenstrualDialogHelper.DialogType A() {
        MenstrualDialogHelper menstrualDialogHelper = new MenstrualDialogHelper();
        Integer value = G().getValue();
        Intrinsics.checkNotNull(value);
        int iIntValue = value.intValue();
        Integer value2 = y().getValue();
        Intrinsics.checkNotNull(value2);
        return menstrualDialogHelper.e(iIntValue, value2.intValue());
    }

    @NotNull
    public final MutableState<Boolean> B() {
        return this.enableState;
    }

    @NotNull
    public final MutableLiveData<Long> C() {
        return D();
    }

    public final MutableLiveData<Long> D() {
        return (MutableLiveData) this.latestDaysLiveData.getValue();
    }

    public final MenstrualService E() {
        return (MenstrualService) this.menstrualService.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> F() {
        return G();
    }

    public final MutableLiveData<Integer> G() {
        return (MutableLiveData) this.periodDefaultDaysLiveData.getValue();
    }

    public final String H() {
        Object value = this.ssoid.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-ssoid>(...)");
        return (String) value;
    }

    public final void I(int days) {
        y().setValue(Integer.valueOf(days));
    }

    public final void J(long time) {
        D().setValue(Long.valueOf(time));
    }

    public final void K(int days) {
        G().setValue(Integer.valueOf(days));
    }

    public final void L() {
        CycleSettingHelper.Companion companion = CycleSettingHelper.INSTANCE;
        if (companion.g() < 0) {
            gub.e0(5, H());
        }
        if (companion.d() < 0) {
            gub.S(28, H());
        }
    }

    public final void M() {
        a7b.f(TAG, "saveSettingValue,period:" + G().getValue() + ", cycle:" + y().getValue() + "， lastDay:" + D().getValue());
        Integer value = G().getValue();
        if (w(value != null ? Long.valueOf(value.intValue()) : null)) {
            Integer value2 = G().getValue();
            Intrinsics.checkNotNull(value2);
            gub.e0(value2.intValue(), H());
        }
        Integer value3 = y().getValue();
        if (w(value3 != null ? Long.valueOf(value3.intValue()) : null)) {
            Integer value4 = y().getValue();
            Intrinsics.checkNotNull(value4);
            gub.S(value4.intValue(), H());
        }
        if (w(D().getValue())) {
            Long value5 = D().getValue();
            Intrinsics.checkNotNull(value5);
            gub.T(value5.longValue(), H());
        }
        if (u()) {
            gub.g0(System.currentTimeMillis(), H());
        }
        E().v();
    }

    public final void N() {
        boolean z;
        a7b.f(TAG, "setModifiedTime");
        Integer value = G().getValue();
        CycleSettingHelper.Companion companion = CycleSettingHelper.INSTANCE;
        int iG = companion.g();
        boolean z2 = true;
        if (value != null && value.intValue() == iG) {
            z = false;
        } else {
            Integer value2 = G().getValue();
            Intrinsics.checkNotNull(value2);
            gub.e0(value2.intValue(), H());
            z = true;
        }
        Integer value3 = y().getValue();
        int iD = companion.d();
        if (value3 == null || value3.intValue() != iD) {
            Integer value4 = y().getValue();
            Intrinsics.checkNotNull(value4);
            gub.S(value4.intValue(), H());
            z = true;
        }
        Long value5 = D().getValue();
        long jE = companion.e();
        if (value5 != null && value5.longValue() == jE) {
            z2 = z;
        } else {
            Long value6 = D().getValue();
            Intrinsics.checkNotNull(value6);
            gub.T(value6.longValue(), H());
        }
        if (z2) {
            a7b.f(TAG, "setModifiedTime setting has changed:" + System.currentTimeMillis());
            new CycleDeviceApi().N();
            gub.g0(System.currentTimeMillis(), H());
        }
    }

    public final void O() {
        a7b.f(TAG, "uploadAllValues");
        N();
        L();
        z().k(CycleSettingHelper.INSTANCE.m());
    }

    public final boolean u() {
        a7b.f(TAG, "checkIfHasFinishAllMsg period:" + G().getValue() + ",cycle:" + y().getValue() + ", lastDay:" + D().getValue());
        Integer value = G().getValue();
        if (!w(value != null ? Long.valueOf(value.intValue()) : null)) {
            return false;
        }
        Integer value2 = y().getValue();
        return w(value2 != null ? Long.valueOf((long) value2.intValue()) : null) && w(D().getValue());
    }

    public final void v() {
        this.enableState.setValue(Boolean.valueOf(u()));
        a7b.f(TAG, "checkIfModified:" + this.enableState.getValue());
    }

    public final boolean w(Long value) {
        return value == null || value.longValue() != ((long) ValueType.UNSET.getValue());
    }

    @NotNull
    public final MutableLiveData<Integer> x() {
        return y();
    }

    public final MutableLiveData<Integer> y() {
        return (MutableLiveData) this.cycleDefaultDaysLiveData.getValue();
    }

    public final CycleNetRepository z() {
        return (CycleNetRepository) this.cycleNetRepository.getValue();
    }
}
