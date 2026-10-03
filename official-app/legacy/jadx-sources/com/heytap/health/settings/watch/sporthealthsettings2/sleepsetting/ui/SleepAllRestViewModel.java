package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.heytap.device.sleep.ISleepDataService;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel;
import com.heytap.sporthealth.blib.helper.ExpandKt;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.vision.SleepHabit;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.qtf;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.zqh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0011\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u001b\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\u0016\u0010\"\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190 H\u0002J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\u0002R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAllRestViewModel;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/SHSettingBaseViewModel;", "Lcom/oplus/aiunit/vision/whh;", "", "p0", "Landroidx/lifecycle/SavedStateHandle;", "stateHandle", "J", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;", "D0", "editMode", "", "L0", "restItem", "selected", "K0", c8l.KEY_B0, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "N0", "sleepRest", "z0", "(Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "C0", "J0", "", "hour", "minute", "G0", "intDay", "", "H0", "", "restCountMoreThan5Days", "M0", c8l.KEY_A0, "Lcom/heytap/health/base/livedata/OLiveData;", "w", "Lcom/heytap/health/base/livedata/OLiveData;", "_addRest", "Landroidx/lifecycle/LiveData;", "x", "Landroidx/lifecycle/LiveData;", "F0", "()Landroidx/lifecycle/LiveData;", "sleepRestAddLiveData", "Lkotlinx/coroutines/sync/Mutex;", "y", "Lkotlinx/coroutines/sync/Mutex;", "restChangeMutex", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepAllRestViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepAllRestViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAllRestViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,193:1\n766#2:194\n857#2,2:195\n1549#2:197\n1620#2,3:198\n1855#2,2:201\n1747#2,3:211\n120#3,8:203\n129#3:214\n120#3,10:215\n*S KotlinDebug\n*F\n+ 1 SleepAllRestViewModel.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAllRestViewModel\n*L\n78#1:194\n78#1:195,2\n78#1:197\n78#1:198,3\n138#1:201,2\n146#1:211,3\n144#1:203,8\n144#1:214\n164#1:215,10\n*E\n"})
public final class SleepAllRestViewModel extends SHSettingBaseViewModel<SleepHabit> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<SleepSettingBean.SleepRest> _addRest;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final LiveData<SleepSettingBean.SleepRest> sleepRestAddLiveData;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Mutex restChangeMutex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepAllRestViewModel(@NotNull SavedStateHandle stateHandle) {
        super(stateHandle);
        Intrinsics.checkNotNullParameter(stateHandle, "stateHandle");
        OLiveData<SleepSettingBean.SleepRest> oLiveData = new OLiveData<>();
        this._addRest = oLiveData;
        this.sleepRestAddLiveData = oLiveData;
        this.restChangeMutex = MutexKt.Mutex$default(false, 1, null);
    }

    public final boolean A0(SleepSettingBean.SleepRest sleepRest) {
        List<Integer> existRestOverMaxCountDays;
        Object objNavigation = x0.d().b("/device_data_sync/SleepDataServiceImpl").navigation();
        ISleepDataService iSleepDataService = objNavigation instanceof ISleepDataService ? (ISleepDataService) objNavigation : null;
        int i = iSleepDataService != null && iSleepDataService.G() ? 5 : 1;
        if (iSleepDataService == null || (existRestOverMaxCountDays = iSleepDataService.Q4(i0().b0(), sleepRest, i)) == null) {
            existRestOverMaxCountDays = i0().Y(sleepRest, i);
        }
        Intrinsics.checkNotNullExpressionValue(existRestOverMaxCountDays, "existRestOverMaxCountDays");
        if (!(!existRestOverMaxCountDays.isEmpty())) {
            return true;
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(existRestOverMaxCountDays);
        if (i == 5) {
            rg7.m(qtf.o(R$string.device_settings_rest_more_than_five, M0(existRestOverMaxCountDays)));
        } else {
            rg7.m(qtf.o(R$string.device_settings_rest_more_than_one, M0(existRestOverMaxCountDays)));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object B0(@NotNull Continuation<? super Unit> continuation) {
        SleepAllRestViewModel$deleteSelectedRest$1 sleepAllRestViewModel$deleteSelectedRest$1;
        SleepAllRestViewModel sleepAllRestViewModel;
        if (continuation instanceof SleepAllRestViewModel$deleteSelectedRest$1) {
            sleepAllRestViewModel$deleteSelectedRest$1 = (SleepAllRestViewModel$deleteSelectedRest$1) continuation;
            int i = sleepAllRestViewModel$deleteSelectedRest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepAllRestViewModel$deleteSelectedRest$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepAllRestViewModel$deleteSelectedRest$1 = new SleepAllRestViewModel$deleteSelectedRest$1(this, continuation);
            }
        } else {
            sleepAllRestViewModel$deleteSelectedRest$1 = new SleepAllRestViewModel$deleteSelectedRest$1(this, continuation);
        }
        Object objC = sleepAllRestViewModel$deleteSelectedRest$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepAllRestViewModel$deleteSelectedRest$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                this = (SleepAllRestViewModel) sleepAllRestViewModel$deleteSelectedRest$1.L$1;
                sleepAllRestViewModel = (SleepAllRestViewModel) sleepAllRestViewModel$deleteSelectedRest$1.L$0;
                ResultKt.throwOnFailure(objC);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objC);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objC);
        List<SleepSettingBean.SleepRest> listD = ((SleepHabit) T()).d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (((SleepSettingBean.SleepRest) obj).isSelected) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Boxing.boxLong(((SleepSettingBean.SleepRest) it.next()).getCreateTime()));
        }
        LiveData<Integer> liveDataA0 = i0().a0(arrayList2);
        Intrinsics.checkNotNullExpressionValue(liveDataA0, "sleepSettingViewModel.deleteSelectedRest(delDatas)");
        sleepAllRestViewModel$deleteSelectedRest$1.L$0 = this;
        sleepAllRestViewModel$deleteSelectedRest$1.L$1 = this;
        sleepAllRestViewModel$deleteSelectedRest$1.label = 1;
        objC = ExpandKt.c(liveDataA0, sleepAllRestViewModel$deleteSelectedRest$1);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepAllRestViewModel = this;
        SleepAllRestViewModel$deleteSelectedRest$2 sleepAllRestViewModel$deleteSelectedRest$2 = new SleepAllRestViewModel$deleteSelectedRest$2(sleepAllRestViewModel, null);
        sleepAllRestViewModel$deleteSelectedRest$1.L$0 = null;
        sleepAllRestViewModel$deleteSelectedRest$1.L$1 = null;
        sleepAllRestViewModel$deleteSelectedRest$1.label = 2;
        if (this.t0((Integer) objC, sleepAllRestViewModel$deleteSelectedRest$2, sleepAllRestViewModel$deleteSelectedRest$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object C0(@NotNull SleepSettingBean.SleepRest sleepRest, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        SleepAllRestViewModel$editSleepRest$1 sleepAllRestViewModel$editSleepRest$1;
        Mutex mutex;
        SleepAllRestViewModel sleepAllRestViewModel;
        Mutex mutex2;
        boolean z;
        Throwable th;
        Mutex mutex3;
        if (continuation instanceof SleepAllRestViewModel$editSleepRest$1) {
            sleepAllRestViewModel$editSleepRest$1 = (SleepAllRestViewModel$editSleepRest$1) continuation;
            int i = sleepAllRestViewModel$editSleepRest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepAllRestViewModel$editSleepRest$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepAllRestViewModel$editSleepRest$1 = new SleepAllRestViewModel$editSleepRest$1(this, continuation);
            }
        } else {
            sleepAllRestViewModel$editSleepRest$1 = new SleepAllRestViewModel$editSleepRest$1(this, continuation);
        }
        Object objT0 = sleepAllRestViewModel$editSleepRest$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepAllRestViewModel$editSleepRest$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objT0);
                mutex = this.restChangeMutex;
                sleepAllRestViewModel$editSleepRest$1.L$0 = this;
                sleepAllRestViewModel$editSleepRest$1.L$1 = sleepRest;
                sleepAllRestViewModel$editSleepRest$1.L$2 = mutex;
                sleepAllRestViewModel$editSleepRest$1.label = 1;
                if (mutex.lock(null, sleepAllRestViewModel$editSleepRest$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex3 = (Mutex) sleepAllRestViewModel$editSleepRest$1.L$0;
                        try {
                            ResultKt.throwOnFailure(objT0);
                            boolean zBooleanValue = ((Boolean) objT0).booleanValue();
                            mutex = mutex3;
                            z = zBooleanValue;
                            Boolean boolBoxBoolean = Boxing.boxBoolean(z);
                            mutex.unlock(null);
                            return boolBoxBoolean;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex3.unlock(null);
                            throw th;
                        }
                    }
                    this = (SleepAllRestViewModel) sleepAllRestViewModel$editSleepRest$1.L$2;
                    mutex2 = (Mutex) sleepAllRestViewModel$editSleepRest$1.L$1;
                    sleepAllRestViewModel = (SleepAllRestViewModel) sleepAllRestViewModel$editSleepRest$1.L$0;
                    try {
                        ResultKt.throwOnFailure(objT0);
                        SleepAllRestViewModel$editSleepRest$2$1 sleepAllRestViewModel$editSleepRest$2$1 = new SleepAllRestViewModel$editSleepRest$2$1(sleepAllRestViewModel, null);
                        sleepAllRestViewModel$editSleepRest$1.L$0 = mutex2;
                        sleepAllRestViewModel$editSleepRest$1.L$1 = null;
                        sleepAllRestViewModel$editSleepRest$1.L$2 = null;
                        sleepAllRestViewModel$editSleepRest$1.label = 3;
                        objT0 = this.t0((Integer) objT0, sleepAllRestViewModel$editSleepRest$2$1, sleepAllRestViewModel$editSleepRest$1);
                        if (objT0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex3 = mutex2;
                        boolean zBooleanValue2 = ((Boolean) objT0).booleanValue();
                        mutex = mutex3;
                        z = zBooleanValue2;
                        Boolean boolBoxBoolean2 = Boxing.boxBoolean(z);
                        mutex.unlock(null);
                        return boolBoxBoolean2;
                    } catch (Throwable th3) {
                        Mutex mutex4 = mutex2;
                        th = th3;
                        mutex3 = mutex4;
                        mutex3.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex5 = (Mutex) sleepAllRestViewModel$editSleepRest$1.L$2;
                sleepRest = (SleepSettingBean.SleepRest) sleepAllRestViewModel$editSleepRest$1.L$1;
                SleepAllRestViewModel sleepAllRestViewModel2 = (SleepAllRestViewModel) sleepAllRestViewModel$editSleepRest$1.L$0;
                ResultKt.throwOnFailure(objT0);
                mutex = mutex5;
                this = sleepAllRestViewModel2;
            }
            if (this.A0(sleepRest)) {
                LiveData<Integer> liveDataX = this.i0().X(sleepRest, 2);
                Intrinsics.checkNotNullExpressionValue(liveDataX, "sleepSettingViewModel.ch…geSleepRest(sleepRest, 2)");
                sleepAllRestViewModel$editSleepRest$1.L$0 = this;
                sleepAllRestViewModel$editSleepRest$1.L$1 = mutex;
                sleepAllRestViewModel$editSleepRest$1.L$2 = this;
                sleepAllRestViewModel$editSleepRest$1.label = 2;
                Object objC = ExpandKt.c(liveDataX, sleepAllRestViewModel$editSleepRest$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sleepAllRestViewModel = this;
                Mutex mutex6 = mutex;
                objT0 = objC;
                mutex2 = mutex6;
                SleepAllRestViewModel$editSleepRest$2$1 sleepAllRestViewModel$editSleepRest$2$2 = new SleepAllRestViewModel$editSleepRest$2$1(sleepAllRestViewModel, null);
                sleepAllRestViewModel$editSleepRest$1.L$0 = mutex2;
                sleepAllRestViewModel$editSleepRest$1.L$1 = null;
                sleepAllRestViewModel$editSleepRest$1.L$2 = null;
                sleepAllRestViewModel$editSleepRest$1.label = 3;
                objT0 = this.t0((Integer) objT0, sleepAllRestViewModel$editSleepRest$2$2, sleepAllRestViewModel$editSleepRest$1);
                if (objT0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex3 = mutex2;
                boolean zBooleanValue3 = ((Boolean) objT0).booleanValue();
                mutex = mutex3;
                z = zBooleanValue3;
            } else {
                z = false;
            }
            Boolean boolBoxBoolean3 = Boxing.boxBoolean(z);
            mutex.unlock(null);
            return boolBoxBoolean3;
        } catch (Throwable th4) {
            th = th4;
            mutex3 = mutex;
            mutex3.unlock(null);
            throw th;
        }
    }

    @NotNull
    public final SleepSettingBean.SleepRest D0() {
        SleepSettingBean.SleepRest sleepRest = new SleepSettingBean.SleepRest();
        sleepRest.setName(qtf.m(R$string.settings_habits_index, i0().c0().h().size() + 1));
        sleepRest.setWakeUpTime(G0(7, 0));
        sleepRest.setBedTime(G0(23, 0));
        sleepRest.setUserDefinedDate(31);
        return sleepRest;
    }

    @NotNull
    public final LiveData<SleepSettingBean.SleepRest> F0() {
        return this.sleepRestAddLiveData;
    }

    public final int G0(int hour, int minute) {
        return zqh.c(hour, minute);
    }

    public final String H0(int intDay) {
        switch (intDay) {
            case 1:
                return qtf.l(com.heytap.health.base.R$string.lib_base_date_monday);
            case 2:
                return qtf.l(com.heytap.health.base.R$string.lib_base_date_tuesday);
            case 3:
                return qtf.l(com.heytap.health.base.R$string.lib_base_date_wednesday);
            case 4:
                return qtf.l(com.heytap.health.base.R$string.lib_base_date_thursday);
            case 5:
                return qtf.l(com.heytap.health.base.R$string.lib_base_date_friday);
            case 6:
                return qtf.l(com.heytap.health.base.R$string.lib_base_date_saturday);
            case 7:
                return qtf.l(com.heytap.health.base.R$string.lib_base_date_sunday);
            default:
                return "";
        }
    }

    @Override // com.heytap.sporthealth.blib.basic.BasicStateViewModel
    @Nullable
    public Object J(@NotNull SavedStateHandle savedStateHandle, @NotNull Continuation<? super SleepHabit> continuation) {
        return J0();
    }

    public final SleepHabit J0() {
        List<SleepSettingBean.SleepRest> sleepRests = i0().c0().h();
        if (sleepRests.isEmpty()) {
            a7b.f(getTAG(), "load sleepHabit -> sleepRests is empty");
            N(R$drawable.settings_empty_rest_icon, R$string.device_settings_empty_rest_tips);
        }
        a7b.f(getTAG(), "load sleepHabit -> sleepRests:" + sleepRests.size() + " ->" + sleepRests + " ");
        Intrinsics.checkNotNullExpressionValue(sleepRests, "sleepRests");
        return new SleepHabit(false, sleepRests);
    }

    public final void K0(@NotNull final SleepSettingBean.SleepRest restItem, final boolean selected) {
        Intrinsics.checkNotNullParameter(restItem, "restItem");
        Y(new Function1<SleepHabit, SleepHabit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAllRestViewModel$select$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final SleepHabit invoke(@NotNull SleepHabit update) {
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List<SleepSettingBean.SleepRest> listD = update.d();
                boolean z = selected;
                SleepSettingBean.SleepRest sleepRest = restItem;
                for (Object obj : listD) {
                    if (((SleepSettingBean.SleepRest) obj).getCreateTime() == sleepRest.getCreateTime()) {
                        SleepSettingBean.SleepRest sleepRest2 = (SleepSettingBean.SleepRest) obj;
                        Intrinsics.checkNotNull(sleepRest2);
                        sleepRest2.isSelected = z;
                        Unit unit = Unit.INSTANCE;
                        return SleepHabit.b(update, false, listD, 1, null);
                    }
                }
                obj = null;
                SleepSettingBean.SleepRest sleepRest3 = (SleepSettingBean.SleepRest) obj;
                Intrinsics.checkNotNull(sleepRest3);
                sleepRest3.isSelected = z;
                Unit unit2 = Unit.INSTANCE;
                return SleepHabit.b(update, false, listD, 1, null);
            }
        });
    }

    public final void L0(final boolean editMode) {
        Y(new Function1<SleepHabit, SleepHabit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAllRestViewModel$switchMode$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final SleepHabit invoke(@NotNull SleepHabit update) {
                Intrinsics.checkNotNullParameter(update, "$this$update");
                if (editMode) {
                    return SleepHabit.b(update, true, null, 2, null);
                }
                List<SleepSettingBean.SleepRest> listD = update.d();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
                for (SleepSettingBean.SleepRest sleepRest : listD) {
                    sleepRest.isSelected = false;
                    arrayList.add(sleepRest);
                }
                return update.a(false, arrayList);
            }
        });
    }

    public final String M0(List<Integer> restCountMoreThan5Days) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = restCountMoreThan5Days.iterator();
        while (it.hasNext()) {
            sb.append(H0(((Number) it.next()).intValue()) + " ");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final void N0() {
        Y(new Function1<SleepHabit, SleepHabit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepAllRestViewModel$toggleSelectAll$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final SleepHabit invoke(@NotNull SleepHabit update) {
                boolean z;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                List<SleepSettingBean.SleepRest> listD = update.d();
                if (!(listD instanceof Collection) || !listD.isEmpty()) {
                    Iterator<T> it = listD.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        if (!((SleepSettingBean.SleepRest) it.next()).isSelected) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                List<SleepSettingBean.SleepRest> listD2 = update.d();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD2, 10));
                for (SleepSettingBean.SleepRest sleepRest : listD2) {
                    sleepRest.isSelected = !z;
                    arrayList.add(sleepRest);
                }
                return SleepHabit.b(update, false, arrayList, 1, null);
            }
        });
    }

    @Override // com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingBaseViewModel
    public boolean p0() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object z0(@NotNull SleepSettingBean.SleepRest sleepRest, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        SleepAllRestViewModel$addSleepRest$1 sleepAllRestViewModel$addSleepRest$1;
        Mutex mutex;
        SleepSettingBean.SleepRest sleepRest2;
        Mutex mutex2;
        boolean zBooleanValue;
        boolean z;
        SleepAllRestViewModel sleepAllRestViewModel;
        Mutex mutex3;
        SleepSettingBean.SleepRest sleepRest3;
        SleepAllRestViewModel sleepAllRestViewModel2 = this;
        if (continuation instanceof SleepAllRestViewModel$addSleepRest$1) {
            sleepAllRestViewModel$addSleepRest$1 = (SleepAllRestViewModel$addSleepRest$1) continuation;
            int i = sleepAllRestViewModel$addSleepRest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sleepAllRestViewModel$addSleepRest$1.label = i - Integer.MIN_VALUE;
            } else {
                sleepAllRestViewModel$addSleepRest$1 = new SleepAllRestViewModel$addSleepRest$1(sleepAllRestViewModel2, continuation);
            }
        } else {
            sleepAllRestViewModel$addSleepRest$1 = new SleepAllRestViewModel$addSleepRest$1(sleepAllRestViewModel2, continuation);
        }
        Object objT0 = sleepAllRestViewModel$addSleepRest$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sleepAllRestViewModel$addSleepRest$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objT0);
                mutex = sleepAllRestViewModel2.restChangeMutex;
                sleepAllRestViewModel$addSleepRest$1.L$0 = sleepAllRestViewModel2;
                sleepRest2 = sleepRest;
                sleepAllRestViewModel$addSleepRest$1.L$1 = sleepRest2;
                sleepAllRestViewModel$addSleepRest$1.L$2 = mutex;
                sleepAllRestViewModel$addSleepRest$1.label = 1;
                if (mutex.lock(null, sleepAllRestViewModel$addSleepRest$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) sleepAllRestViewModel$addSleepRest$1.L$0;
                        try {
                            ResultKt.throwOnFailure(objT0);
                            zBooleanValue = ((Boolean) objT0).booleanValue();
                            Boolean boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                            mutex2.unlock(null);
                            return boolBoxBoolean;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    sleepAllRestViewModel2 = (SleepAllRestViewModel) sleepAllRestViewModel$addSleepRest$1.L$3;
                    mutex3 = (Mutex) sleepAllRestViewModel$addSleepRest$1.L$2;
                    sleepRest3 = (SleepSettingBean.SleepRest) sleepAllRestViewModel$addSleepRest$1.L$1;
                    sleepAllRestViewModel = (SleepAllRestViewModel) sleepAllRestViewModel$addSleepRest$1.L$0;
                    try {
                        ResultKt.throwOnFailure(objT0);
                        SleepAllRestViewModel$addSleepRest$2$2 sleepAllRestViewModel$addSleepRest$2$2 = new SleepAllRestViewModel$addSleepRest$2$2(sleepAllRestViewModel, sleepRest3, null);
                        sleepAllRestViewModel$addSleepRest$1.L$0 = mutex3;
                        sleepAllRestViewModel$addSleepRest$1.L$1 = null;
                        sleepAllRestViewModel$addSleepRest$1.L$2 = null;
                        sleepAllRestViewModel$addSleepRest$1.L$3 = null;
                        sleepAllRestViewModel$addSleepRest$1.label = 3;
                        objT0 = sleepAllRestViewModel2.t0((Integer) objT0, sleepAllRestViewModel$addSleepRest$2$2, sleepAllRestViewModel$addSleepRest$1);
                        if (objT0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex2 = mutex3;
                        zBooleanValue = ((Boolean) objT0).booleanValue();
                        Boolean boolBoxBoolean2 = Boxing.boxBoolean(zBooleanValue);
                        mutex2.unlock(null);
                        return boolBoxBoolean2;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2 = mutex3;
                        mutex2.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex4 = (Mutex) sleepAllRestViewModel$addSleepRest$1.L$2;
                sleepRest2 = (SleepSettingBean.SleepRest) sleepAllRestViewModel$addSleepRest$1.L$1;
                SleepAllRestViewModel sleepAllRestViewModel3 = (SleepAllRestViewModel) sleepAllRestViewModel$addSleepRest$1.L$0;
                ResultKt.throwOnFailure(objT0);
                mutex = mutex4;
                sleepAllRestViewModel2 = sleepAllRestViewModel3;
            }
            List<SleepSettingBean.SleepRest> listB0 = sleepAllRestViewModel2.i0().b0();
            Intrinsics.checkNotNullExpressionValue(listB0, "sleepSettingViewModel.allRestList");
            List<SleepSettingBean.SleepRest> list = listB0;
            zBooleanValue = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((SleepSettingBean.SleepRest) it.next()).getCreateTime() == sleepRest2.getCreateTime()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                if (sleepAllRestViewModel2.A0(sleepRest2)) {
                    LiveData<Integer> liveDataX = sleepAllRestViewModel2.i0().X(sleepRest2, 1);
                    Intrinsics.checkNotNullExpressionValue(liveDataX, "sleepSettingViewModel.ch…geSleepRest(sleepRest, 1)");
                    sleepAllRestViewModel$addSleepRest$1.L$0 = sleepAllRestViewModel2;
                    sleepAllRestViewModel$addSleepRest$1.L$1 = sleepRest2;
                    sleepAllRestViewModel$addSleepRest$1.L$2 = mutex;
                    sleepAllRestViewModel$addSleepRest$1.L$3 = sleepAllRestViewModel2;
                    sleepAllRestViewModel$addSleepRest$1.label = 2;
                    Object objC = ExpandKt.c(liveDataX, sleepAllRestViewModel$addSleepRest$1);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sleepAllRestViewModel = sleepAllRestViewModel2;
                    SleepSettingBean.SleepRest sleepRest4 = sleepRest2;
                    mutex3 = mutex;
                    objT0 = objC;
                    sleepRest3 = sleepRest4;
                    SleepAllRestViewModel$addSleepRest$2$2 sleepAllRestViewModel$addSleepRest$2$3 = new SleepAllRestViewModel$addSleepRest$2$2(sleepAllRestViewModel, sleepRest3, null);
                    sleepAllRestViewModel$addSleepRest$1.L$0 = mutex3;
                    sleepAllRestViewModel$addSleepRest$1.L$1 = null;
                    sleepAllRestViewModel$addSleepRest$1.L$2 = null;
                    sleepAllRestViewModel$addSleepRest$1.L$3 = null;
                    sleepAllRestViewModel$addSleepRest$1.label = 3;
                    objT0 = sleepAllRestViewModel2.t0((Integer) objT0, sleepAllRestViewModel$addSleepRest$2$3, sleepAllRestViewModel$addSleepRest$1);
                    if (objT0 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex3;
                    zBooleanValue = ((Boolean) objT0).booleanValue();
                }
                Boolean boolBoxBoolean3 = Boxing.boxBoolean(zBooleanValue);
                mutex2.unlock(null);
                return boolBoxBoolean3;
            }
            a7b.f(sleepAllRestViewModel2.getTAG(), "addSleepRest -> duplicate createTime=" + sleepRest2.getCreateTime() + ", ignore");
            mutex2 = mutex;
            Boolean boolBoxBoolean4 = Boxing.boxBoolean(zBooleanValue);
            mutex2.unlock(null);
            return boolBoxBoolean4;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
