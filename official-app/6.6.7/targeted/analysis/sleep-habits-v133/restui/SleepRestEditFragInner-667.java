package com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.preference.PreferenceScreen;
import com.coui.appcompat.edittext.COUIEditText;
import com.coui.appcompat.panel.COUIBottomSheetDialogFragment;
import com.coui.appcompat.picker.COUITimeLimitPicker;
import com.coui.appcompat.preference.COUICheckedLinearLayout;
import com.coui.appcompat.preference.COUIInputPreference;
import com.coui.appcompat.preference.COUIPreferenceCategory;
import com.coui.appcompat.rotateview.COUIRotateView;
import com.heytap.health.device_settings.impl.R;
import com.heytap.health.settings.watch.widget.WeekPicker;
import com.heytap.sporthealth.blib.basic.ui.BasicPreferenceFragment;
import com.heytap.sporthealth.blib.helper.HCOUIPreferenceCategory;
import com.heytap.sporthealth.blib.helper.HCOUISwitchPreference;
import com.heytap.sporthealth.blib.helper.PrefDsl;
import com.heytap.sporthealth.blib.helper.ViewDsl;
import com.heytap.wsport.data.SleepSettingBean;
import com.oplus.aiunit.model.gk8;
import com.oplus.aiunit.vision.a5k;
import com.oplus.aiunit.vision.quh;
import com.oplus.aiunit.vision.swf;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0013\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b6\u00107J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002JV\u0010\u001a\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00152\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002J\u0018\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0013*\u00020\bH\u0002R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\b0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102¨\u00068"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner;", "Lcom/heytap/sporthealth/blib/basic/ui/BasicPreferenceFragment;", "Lcom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepAllRestViewModel;", "Lcom/heytap/health/base/base/BaseViewSizeControl;", "Lcom/heytap/sporthealth/blib/helper/PrefDsl;", "Landroidx/preference/PreferenceScreen;", "", "n0", "", "h0", "()Ljava/lang/Integer;", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "N0", "L0", "Lcom/coui/appcompat/preference/COUIPreferenceCategory;", "title", "Lkotlin/Pair;", "timePair", "Lkotlin/Function1;", "", "onShowSelectedTime", "Lkotlin/Function2;", "onTimeChange", "O0", "P0", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;", "q", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;", "sleepRest", "r", "Lkotlin/Lazy;", "M0", "()Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;", "sleepRestData", "s", "Ljava/lang/String;", "restName", gk8.TIMESTAMP, "I", "bedTime", "u", "wakeUpTime", "Landroidx/lifecycle/MutableLiveData;", "v", "Landroidx/lifecycle/MutableLiveData;", "userDefinedDate", "w", "Z", "excludeHoliday", "x", "isSubmitting", "<init>", "(Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSleepRestEditFrag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,248:1\n155#2:249\n*S KotlinDebug\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner\n*L\n197#1:249\n*E\n"})
public final class SleepRestEditFragInner extends BasicPreferenceFragment<SleepAllRestViewModel> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public final SleepSettingBean.SleepRest sleepRest;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Lazy sleepRestData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public String restName;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int bedTime;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int wakeUpTime;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public MutableLiveData<Integer> userDefinedDate;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean excludeHoliday;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public boolean isSubmitting;

    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$onOptionsItemSelected$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$onOptionsItemSelected$1", f = "SleepRestEditFrag.kt", i = {1}, l = {221, 231}, m = "invokeSuspend", n = {"toEdit"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nSleepRestEditFrag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner$onOptionsItemSelected$1\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,248:1\n155#2:249\n*S KotlinDebug\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner$onOptionsItemSelected$1\n*L\n239#1:249\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepRestEditFragInner.this.new AnonymousClass1(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0121 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x0013, B:34:0x0119, B:36:0x0121, B:38:0x012c, B:40:0x0135, B:42:0x013b, B:46:0x0141, B:48:0x0145, B:11:0x0020, B:25:0x00b7, B:16:0x002b, B:18:0x0033, B:22:0x008d, B:26:0x00be, B:30:0x0101), top: B:53:0x0009 }] */
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepSettingBean.SleepRest sleepRest;
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 1;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (SleepRestEditFragInner.this.N0()) {
                        SleepRestEditFragInner.this.M0().setName(SleepRestEditFragInner.this.restName);
                        SleepRestEditFragInner.this.M0().setBedTime(SleepRestEditFragInner.this.bedTime);
                        SleepRestEditFragInner.this.M0().setWakeUpTime(SleepRestEditFragInner.this.wakeUpTime);
                        SleepSettingBean.SleepRest sleepRestM0 = SleepRestEditFragInner.this.M0();
                        Object value = SleepRestEditFragInner.this.userDefinedDate.getValue();
                        Intrinsics.checkNotNull(value);
                        sleepRestM0.setUserDefinedDate(((Number) value).intValue());
                        SleepRestEditFragInner.this.M0().setExcludeHoliday(SleepRestEditFragInner.this.excludeHoliday ? 1 : 0);
                        SleepRestEditFragInner.this.M0().setCreateTime(System.currentTimeMillis() / 1000);
                        SleepAllRestViewModel sleepAllRestViewModel = (SleepAllRestViewModel) SleepRestEditFragInner.this.c0();
                        SleepSettingBean.SleepRest sleepRestM1 = SleepRestEditFragInner.this.M0();
                        this.label = 1;
                        obj = sleepAllRestViewModel.z0(sleepRestM1, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) obj).booleanValue();
                    } else {
                        SleepSettingBean.SleepRest sleepRest2 = new SleepSettingBean.SleepRest();
                        SleepRestEditFragInner sleepRestEditFragInner = SleepRestEditFragInner.this;
                        sleepRest2.setCreateTime(sleepRestEditFragInner.M0().getCreateTime());
                        sleepRest2.setName(sleepRestEditFragInner.restName);
                        sleepRest2.setBedTime(sleepRestEditFragInner.bedTime);
                        sleepRest2.setWakeUpTime(sleepRestEditFragInner.wakeUpTime);
                        Object value2 = sleepRestEditFragInner.userDefinedDate.getValue();
                        Intrinsics.checkNotNull(value2);
                        sleepRest2.setUserDefinedDate(((Number) value2).intValue());
                        if (!sleepRestEditFragInner.excludeHoliday) {
                            i2 = 0;
                        }
                        sleepRest2.setExcludeHoliday(i2);
                        SleepAllRestViewModel sleepAllRestViewModel2 = (SleepAllRestViewModel) SleepRestEditFragInner.this.c0();
                        this.L$0 = sleepRest2;
                        this.label = 2;
                        Object objC0 = sleepAllRestViewModel2.C0(sleepRest2, this);
                        if (objC0 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        sleepRest = sleepRest2;
                        obj = objC0;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (zBooleanValue) {
                            SleepRestEditFragInner.this.M0().update(sleepRest);
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sleepRest = (SleepSettingBean.SleepRest) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        SleepRestEditFragInner.this.M0().update(sleepRest);
                    }
                }
                if (zBooleanValue) {
                    Fragment parentFragment = SleepRestEditFragInner.this.getParentFragment();
                    Fragment fragment = null;
                    Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
                    if (parentFragment2 instanceof COUIBottomSheetDialogFragment) {
                        fragment = parentFragment2;
                    }
                    COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = (COUIBottomSheetDialogFragment) fragment;
                    if (cOUIBottomSheetDialogFragment != null) {
                        cOUIBottomSheetDialogFragment.dismiss();
                    }
                }
                SleepRestEditFragInner.this.isSubmitting = false;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                SleepRestEditFragInner.this.isSubmitting = false;
                throw th;
            }
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SleepRestEditFragInner() {
        SleepSettingBean.SleepRest sleepRest = null;
        this(sleepRest, 1, sleepRest);
    }

    public final void L0() {
        String name = M0().getName();
        if (name == null) {
            name = "";
        }
        this.restName = name;
        this.bedTime = M0().getBedTime();
        this.wakeUpTime = M0().getWakeUpTime();
        this.userDefinedDate.setValue(Integer.valueOf(M0().getUserDefinedDate()));
        this.excludeHoliday = M0().getExcludeHoliday() == 1;
    }

    public final SleepSettingBean.SleepRest M0() {
        return (SleepSettingBean.SleepRest) this.sleepRestData.getValue();
    }

    public final boolean N0() {
        return this.sleepRest == null;
    }

    public final void O0(COUIPreferenceCategory cOUIPreferenceCategory, final int i, Pair<Integer, Integer> pair, final Function1<? super String, String> function1, final Function2<? super Integer, ? super Integer, Unit> function2) {
        final MutableLiveData mutableLiveData = new MutableLiveData(pair);
        PrefDsl.DefaultImpls.V(this, cOUIPreferenceCategory, 0, false, false, new Function1<LinearLayout, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1

            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/picker/COUITimeLimitPicker;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension({"SMAP\nSleepRestEditFrag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner$restTimePick$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,248:1\n256#2,2:249\n*S KotlinDebug\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner$restTimePick$1$2\n*L\n177#1:249,2\n*E\n"})
            public static final class AnonymousClass2 extends Lambda implements Function1<COUITimeLimitPicker, Unit> {
                final /* synthetic */ MutableLiveData<Pair<Integer, Integer>> $hour_minute;
                final /* synthetic */ Function2<Integer, Integer, Unit> $onTimeChange;
                final /* synthetic */ Ref.ObjectRef<View> $timePicker;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(Ref.ObjectRef<View> objectRef, MutableLiveData<Pair<Integer, Integer>> mutableLiveData, Function2<? super Integer, ? super Integer, Unit> function2) {
                    super(1);
                    this.$timePicker = objectRef;
                    this.$hour_minute = mutableLiveData;
                    this.$onTimeChange = function2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$0(MutableLiveData mutableLiveData, Function2 function2, COUITimeLimitPicker cOUITimeLimitPicker, int i, int i2) {
                    Intrinsics.checkNotNullParameter(mutableLiveData, "$hour_minute");
                    Intrinsics.checkNotNullParameter(function2, "$onTimeChange");
                    mutableLiveData.setValue(TuplesKt.to(Integer.valueOf(i), Integer.valueOf(i2)));
                    function2.invoke(Integer.valueOf(i), Integer.valueOf(i2));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((COUITimeLimitPicker) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull COUITimeLimitPicker cOUITimeLimitPicker) {
                    Intrinsics.checkNotNullParameter(cOUITimeLimitPicker, "$this$timeLimitPicker");
                    this.$timePicker.element = cOUITimeLimitPicker;
                    cOUITimeLimitPicker.setVisibility(8);
                    Object value = this.$hour_minute.getValue();
                    Intrinsics.checkNotNull(value);
                    cOUITimeLimitPicker.setCurrentHour((Integer) ((Pair) value).getFirst());
                    Object value2 = this.$hour_minute.getValue();
                    Intrinsics.checkNotNull(value2);
                    cOUITimeLimitPicker.setCurrentMinute((Integer) ((Pair) value2).getSecond());
                    cOUITimeLimitPicker.setIs24HourView(Boolean.TRUE);
                    cOUITimeLimitPicker.setTextVisibility(false);
                    final MutableLiveData<Pair<Integer, Integer>> mutableLiveData = this.$hour_minute;
                    final Function2<Integer, Integer, Unit> function2 = this.$onTimeChange;
                    cOUITimeLimitPicker.setOnTimeChangedListener(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: INVOKE 
                          (r3v0 'cOUITimeLimitPicker' com.coui.appcompat.picker.COUITimeLimitPicker)
                          (wrap com.coui.appcompat.picker.COUITimeLimitPicker$i:0x0045: CONSTRUCTOR 
                          (r0v15 'mutableLiveData' androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Integer>> A[DONT_INLINE])
                          (r2v1 'function2' kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> A[DONT_INLINE])
                         A[MD:(androidx.lifecycle.MutableLiveData, kotlin.jvm.functions.Function2):void (m), WRAPPED] call: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.f.<init>(androidx.lifecycle.MutableLiveData, kotlin.jvm.functions.Function2):void type: CONSTRUCTOR)
                         VIRTUAL call: com.coui.appcompat.picker.COUITimeLimitPicker.setOnTimeChangedListener(com.coui.appcompat.picker.COUITimeLimitPicker$i):void in method: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1.2.invoke(com.coui.appcompat.picker.COUITimeLimitPicker):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.f, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$timeLimitPicker"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                        kotlin.jvm.internal.Ref$ObjectRef<android.view.View> r0 = r2.$timePicker
                        r0.element = r3
                        r0 = 8
                        r3.setVisibility(r0)
                        androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r2.$hour_minute
                        java.lang.Object r0 = r0.getValue()
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                        kotlin.Pair r0 = (kotlin.Pair) r0
                        java.lang.Object r0 = r0.getFirst()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r3.setCurrentHour(r0)
                        androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r2.$hour_minute
                        java.lang.Object r0 = r0.getValue()
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                        kotlin.Pair r0 = (kotlin.Pair) r0
                        java.lang.Object r0 = r0.getSecond()
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r3.setCurrentMinute(r0)
                        java.lang.Boolean r0 = java.lang.Boolean.TRUE
                        r3.setIs24HourView(r0)
                        r0 = 0
                        r3.setTextVisibility(r0)
                        androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.Integer>> r0 = r2.$hour_minute
                        kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> r2 = r2.$onTimeChange
                        com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.f r1 = new com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.f
                        r1.<init>(r0, r2)
                        r3.setOnTimeChangedListener(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1.AnonymousClass2.invoke(com.coui.appcompat.picker.COUITimeLimitPicker):void");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LinearLayout) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LinearLayout linearLayout) {
                Intrinsics.checkNotNullParameter(linearLayout, "$this$layoutDsl");
                linearLayout.setClickable(false);
                linearLayout.setLayoutTransition(new LayoutTransition());
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final SleepRestEditFragInner sleepRestEditFragInner = this.this$0;
                final int i2 = i;
                final MutableLiveData<Pair<Integer, Integer>> mutableLiveData2 = mutableLiveData;
                final Function1<String, String> function3 = function1;
                ViewDsl.DefaultImpls.q0(sleepRestEditFragInner, linearLayout, 0, 0, new Function1<COUICheckedLinearLayout, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/coui/appcompat/rotateview/COUIRotateView;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @SourceDebugExtension({"SMAP\nSleepRestEditFrag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner$restTimePick$1$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,248:1\n256#2,2:249\n*S KotlinDebug\n*F\n+ 1 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner$restTimePick$1$1$2\n*L\n171#1:249,2\n*E\n"})
                    public static final class AnonymousClass2 extends Lambda implements Function1<COUIRotateView, Unit> {
                        final /* synthetic */ COUICheckedLinearLayout $this_row;
                        final /* synthetic */ Ref.ObjectRef<View> $timePicker;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(COUICheckedLinearLayout cOUICheckedLinearLayout, Ref.ObjectRef<View> objectRef) {
                            super(1);
                            this.$this_row = cOUICheckedLinearLayout;
                            this.$timePicker = objectRef;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$0(COUIRotateView cOUIRotateView, Ref.ObjectRef objectRef, View view) {
                            Intrinsics.checkNotNullParameter(cOUIRotateView, "$this_rotate");
                            Intrinsics.checkNotNullParameter(objectRef, "$timePicker");
                            cOUIRotateView.setExpanded(!cOUIRotateView.isExpanded());
                            View view2 = (View) objectRef.element;
                            if (view2 == null) {
                                return;
                            }
                            view2.setVisibility(cOUIRotateView.isExpanded() ? 0 : 8);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((COUIRotateView) obj);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull final COUIRotateView cOUIRotateView) {
                            Intrinsics.checkNotNullParameter(cOUIRotateView, "$this$rotate");
                            COUICheckedLinearLayout cOUICheckedLinearLayout = this.$this_row;
                            final Ref.ObjectRef<View> objectRef = this.$timePicker;
                            cOUICheckedLinearLayout.setOnClickListener(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: INVOKE 
                                  (r0v1 'cOUICheckedLinearLayout' com.coui.appcompat.preference.COUICheckedLinearLayout)
                                  (wrap android.view.View$OnClickListener:0x000b: CONSTRUCTOR 
                                  (r3v0 'cOUIRotateView' com.coui.appcompat.rotateview.COUIRotateView A[DONT_INLINE])
                                  (r2v1 'objectRef' kotlin.jvm.internal.Ref$ObjectRef<android.view.View> A[DONT_INLINE])
                                 A[MD:(com.coui.appcompat.rotateview.COUIRotateView, kotlin.jvm.internal.Ref$ObjectRef):void (m), WRAPPED] call: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.e.<init>(com.coui.appcompat.rotateview.COUIRotateView, kotlin.jvm.internal.Ref$ObjectRef):void type: CONSTRUCTOR)
                                 VIRTUAL call: android.view.View.setOnClickListener(android.view.View$OnClickListener):void A[MD:(android.view.View$OnClickListener):void (c)] in method: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.restTimePick.1.1.2.invoke(com.coui.appcompat.rotateview.COUIRotateView):void, file: D:\￩ﾡﾹ￧ﾛﾮ\oppo￩ﾀﾚ￧ﾟﾥ￨ﾽﾬ￥ﾏﾑ\analysis\health667-dex\classes18.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.e, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 15 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = "$this$rotate"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                                com.coui.appcompat.preference.COUICheckedLinearLayout r0 = r2.$this_row
                                kotlin.jvm.internal.Ref$ObjectRef<android.view.View> r2 = r2.$timePicker
                                com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.e r1 = new com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.e
                                r1.<init>(r3, r2)
                                r0.setOnClickListener(r1)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1.AnonymousClass1.AnonymousClass2.invoke(com.coui.appcompat.rotateview.COUIRotateView):void");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUICheckedLinearLayout) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull COUICheckedLinearLayout cOUICheckedLinearLayout) {
                        Intrinsics.checkNotNullParameter(cOUICheckedLinearLayout, "$this$row");
                        final SleepRestEditFragInner sleepRestEditFragInner2 = sleepRestEditFragInner;
                        final int i3 = i2;
                        final MutableLiveData<Pair<Integer, Integer>> mutableLiveData3 = mutableLiveData2;
                        final Function1<String, String> function4 = function3;
                        ViewDsl.DefaultImpls.w(sleepRestEditFragInner2, cOUICheckedLinearLayout, 0, 0, new Function1<COUICheckedLinearLayout, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.restTimePick.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((COUICheckedLinearLayout) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull COUICheckedLinearLayout cOUICheckedLinearLayout2) {
                                Intrinsics.checkNotNullParameter(cOUICheckedLinearLayout2, "$this$column");
                                final SleepRestEditFragInner sleepRestEditFragInner3 = sleepRestEditFragInner2;
                                final int i4 = i3;
                                sleepRestEditFragInner3.textView(cOUICheckedLinearLayout2, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.restTimePick.1.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextView) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull TextView textView) {
                                        Intrinsics.checkNotNullParameter(textView, "$this$textView");
                                        sleepRestEditFragInner3.preferenceTitleStyle(textView, Float.valueOf(16.0f));
                                        textView.setText(i4);
                                    }
                                });
                                final SleepRestEditFragInner sleepRestEditFragInner4 = sleepRestEditFragInner2;
                                final MutableLiveData<Pair<Integer, Integer>> mutableLiveData4 = mutableLiveData3;
                                final Function1<String, String> function5 = function4;
                                sleepRestEditFragInner4.textView(cOUICheckedLinearLayout2, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.restTimePick.1.1.1.2

                                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$restTimePick$1$1$1$2$a */
                                    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                                    public static final class a implements Observer<Pair<? extends Integer, ? extends Integer>> {
                                        public final /* synthetic */ TextView i;
                                        public final /* synthetic */ Function1<String, String> j;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        public a(TextView textView, Function1<? super String, String> function1) {
                                            this.i = textView;
                                            this.j = function1;
                                        }

                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final void onChanged(Pair<Integer, Integer> pair) {
                                            TextView textView = this.i;
                                            Function1<String, String> function1 = this.j;
                                            String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{pair.getFirst(), pair.getSecond()}, 2));
                                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                                            textView.setText((CharSequence) function1.invoke(str));
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((TextView) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull TextView textView) {
                                        Intrinsics.checkNotNullParameter(textView, "$this$textView");
                                        sleepRestEditFragInner4.preferenceSummaryStyle(textView, Float.valueOf(16.0f));
                                        sleepRestEditFragInner4.d0(mutableLiveData4, new a(textView, function5));
                                    }
                                });
                                ViewDsl.DefaultImpls.U(sleepRestEditFragInner2, cOUICheckedLinearLayout2, 0, 0, new Function1<LinearLayout.LayoutParams, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.restTimePick.1.1.1.3
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke((LinearLayout.LayoutParams) obj);
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull LinearLayout.LayoutParams layoutParams) {
                                        Intrinsics.checkNotNullParameter(layoutParams, "$this$linearParam");
                                        layoutParams.weight = 1.0f;
                                    }
                                }, 3, (Object) null);
                            }
                        }, 3, (Object) null);
                        sleepRestEditFragInner.rotate(cOUICheckedLinearLayout, new AnonymousClass2(cOUICheckedLinearLayout, objectRef));
                    }
                }, 3, (Object) null);
                this.this$0.timeLimitPicker(linearLayout, new AnonymousClass2(objectRef, mutableLiveData, function2));
            }
        }, 7, (Object) null);
    }

    public final Pair<Integer, Integer> P0(int i) {
        return TuplesKt.to(Integer.valueOf((i >> 8) & 255), Integer.valueOf(i & 255));
    }

    @NotNull
    public Integer h0() {
        return Integer.valueOf(R.menu.settings_menu_panel_edit);
    }

    public void n0(@NotNull PreferenceScreen preferenceScreen) {
        Intrinsics.checkNotNullParameter(preferenceScreen, "<this>");
        L0();
        getToolbar().setIsTitleCenterStyle(true);
        q0(false);
        k0();
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                final SleepRestEditFragInner sleepRestEditFragInner = this.this$0;
                PrefDsl.DefaultImpls.M(sleepRestEditFragInner, hCOUIPreferenceCategory, false, new Function1<COUIInputPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$1.1

                    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$1$1$a */
                    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J*\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "", "text", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, k = 1, mv = {1, 8, 0})
                    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 SleepRestEditFrag.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/sleepsetting/ui/SleepRestEditFragInner$showScreen$1$1\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n84#2,2:98\n71#3:100\n77#4:101\n*E\n"})
                    public static final class a implements TextWatcher {
                        public final /* synthetic */ SleepRestEditFragInner i;

                        public a(SleepRestEditFragInner sleepRestEditFragInner) {
                            this.i = sleepRestEditFragInner;
                        }

                        @Override // android.text.TextWatcher
                        public void afterTextChanged(@Nullable Editable s) {
                            this.i.restName = String.valueOf(s);
                        }

                        @Override // android.text.TextWatcher
                        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
                        }

                        @Override // android.text.TextWatcher
                        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
                        }
                    }

                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((COUIInputPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull COUIInputPreference cOUIInputPreference) {
                        Intrinsics.checkNotNullParameter(cOUIInputPreference, "$this$input");
                        cOUIInputPreference.l().setTitle(swf.l(R.string.settings_sleep_user_habits));
                        cOUIInputPreference.setHint(swf.l(R.string.device_settings_sleep_user_rest_name));
                        cOUIInputPreference.l().getEditText().setText(sleepRestEditFragInner.restName);
                        cOUIInputPreference.l().getEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(14)});
                        COUIEditText editText = cOUIInputPreference.l().getEditText();
                        Intrinsics.checkNotNullExpressionValue(editText, "inputView.editText");
                        editText.addTextChangedListener(new a(sleepRestEditFragInner));
                    }
                }, 1, (Object) null);
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$2
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                SleepRestEditFragInner sleepRestEditFragInner = this.this$0;
                int i = R.string.settings_star_time_title;
                Pair pairP0 = sleepRestEditFragInner.P0(sleepRestEditFragInner.M0().getBedTime());
                Function1<String, String> function1 = new Function1<String, String>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final String invoke(@NotNull String str) {
                        Intrinsics.checkNotNullParameter(str, "it");
                        objectRef.element = str;
                        return str;
                    }
                };
                final SleepRestEditFragInner sleepRestEditFragInner2 = this.this$0;
                sleepRestEditFragInner.O0(hCOUIPreferenceCategory, i, pairP0, function1, new Function2<Integer, Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$2.2
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i2, int i3) {
                        sleepRestEditFragInner2.bedTime = quh.c(i2, i3);
                    }
                });
                SleepRestEditFragInner sleepRestEditFragInner3 = this.this$0;
                int i2 = R.string.settings_end_time_title;
                Pair pairP1 = sleepRestEditFragInner3.P0(sleepRestEditFragInner3.M0().getWakeUpTime());
                Function1<String, String> function2 = new Function1<String, String>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$2.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @NotNull
                    public final String invoke(@NotNull String str) {
                        Intrinsics.checkNotNullParameter(str, "it");
                        if (((String) objectRef.element).compareTo(str) < 0) {
                            return str;
                        }
                        return swf.l(R.string.settings_sleep_user_habit_tomorrow_date_desc) + " " + str;
                    }
                };
                final SleepRestEditFragInner sleepRestEditFragInner4 = this.this$0;
                sleepRestEditFragInner3.O0(hCOUIPreferenceCategory, i2, pairP1, function2, new Function2<Integer, Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$2.4
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i3, int i4) {
                        sleepRestEditFragInner4.wakeUpTime = quh.c(i3, i4);
                    }
                });
            }
        }, 1, (Object) null);
        PrefDsl.DefaultImpls.o(this, preferenceScreen, false, new Function1<HCOUIPreferenceCategory, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$3
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HCOUIPreferenceCategory) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull HCOUIPreferenceCategory hCOUIPreferenceCategory) {
                Intrinsics.checkNotNullParameter(hCOUIPreferenceCategory, "$this$category");
                final SleepRestEditFragInner sleepRestEditFragInner = this.this$0;
                PrefDsl.DefaultImpls.V(sleepRestEditFragInner, hCOUIPreferenceCategory, 0, false, false, new Function1<LinearLayout, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$3.1
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LinearLayout) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull LinearLayout linearLayout) {
                        Intrinsics.checkNotNullParameter(linearLayout, "$this$layoutDsl");
                        linearLayout.setClickable(false);
                        final SleepRestEditFragInner sleepRestEditFragInner2 = sleepRestEditFragInner;
                        sleepRestEditFragInner2.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.showScreen.3.1.1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextView) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull TextView textView) {
                                Intrinsics.checkNotNullParameter(textView, "$this$textView");
                                ViewDsl.DefaultImpls.l0(sleepRestEditFragInner2, textView, (Float) null, 1, (Object) null);
                                textView.setText(R.string.device_settings_rest_repeat);
                            }
                        });
                        final SleepRestEditFragInner sleepRestEditFragInner3 = sleepRestEditFragInner;
                        sleepRestEditFragInner3.textView(linearLayout, new Function1<TextView, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.showScreen.3.1.2

                            /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$3$1$2$a */
                            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                            public static final class a implements Observer<Integer> {
                                public final /* synthetic */ TextView i;

                                public a(TextView textView) {
                                    this.i = textView;
                                }

                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final void onChanged(Integer num) {
                                    TextView textView = this.i;
                                    WeekPicker.a aVar = WeekPicker.Companion;
                                    Intrinsics.checkNotNullExpressionValue(num, "it");
                                    textView.setText(aVar.b(num.intValue()));
                                }
                            }

                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((TextView) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull TextView textView) {
                                Intrinsics.checkNotNullParameter(textView, "$this$textView");
                                ViewDsl.DefaultImpls.j0(sleepRestEditFragInner3, textView, (Float) null, 1, (Object) null);
                                SleepRestEditFragInner sleepRestEditFragInner4 = sleepRestEditFragInner3;
                                Context contextRequireContext = sleepRestEditFragInner4.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                                textView.setTextColor(sleepRestEditFragInner4.themeColor(contextRequireContext));
                                SleepRestEditFragInner sleepRestEditFragInner5 = sleepRestEditFragInner3;
                                sleepRestEditFragInner5.d0(sleepRestEditFragInner5.userDefinedDate, new a(textView));
                            }
                        });
                        ViewDsl.DefaultImpls.w0(sleepRestEditFragInner, linearLayout, 0, swf.b(16.0f), 0, (ViewGroup.LayoutParams) null, 13, (Object) null);
                        final SleepRestEditFragInner sleepRestEditFragInner4 = sleepRestEditFragInner;
                        sleepRestEditFragInner4.view(linearLayout, -1, -2, new Function0<View>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.showScreen.3.1.3
                            {
                                super(0);
                            }

                            @NotNull
                            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                            public final View m24invoke() {
                                Context contextRequireContext = sleepRestEditFragInner4.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
                                Object value = sleepRestEditFragInner4.userDefinedDate.getValue();
                                Intrinsics.checkNotNull(value);
                                int iIntValue = ((Number) value).intValue();
                                final SleepRestEditFragInner sleepRestEditFragInner5 = sleepRestEditFragInner4;
                                return new WeekPicker(contextRequireContext, iIntValue, new Function1<Integer, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.showScreen.3.1.3.1
                                    {
                                        super(1);
                                    }

                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke(((Number) obj).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int i) {
                                        sleepRestEditFragInner5.userDefinedDate.setValue(Integer.valueOf(i));
                                    }
                                });
                            }
                        });
                    }
                }, 7, (Object) null);
                final SleepRestEditFragInner sleepRestEditFragInner2 = this.this$0;
                PrefDsl.DefaultImpls.E0(sleepRestEditFragInner2, hCOUIPreferenceCategory, (String) null, false, new Function1<HCOUISwitchPreference, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$showScreen$3.2
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((HCOUISwitchPreference) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull HCOUISwitchPreference hCOUISwitchPreference) {
                        Intrinsics.checkNotNullParameter(hCOUISwitchPreference, "$this$switch");
                        hCOUISwitchPreference.setVisible(false);
                        hCOUISwitchPreference.setSummary(R.string.device_settings_exclude_holiday_desc);
                        hCOUISwitchPreference.setTitle(R.string.device_settings_exclude_holiday_title);
                        hCOUISwitchPreference.setChecked(sleepRestEditFragInner2.excludeHoliday);
                        final SleepRestEditFragInner sleepRestEditFragInner3 = sleepRestEditFragInner2;
                        sleepRestEditFragInner3.e0(hCOUISwitchPreference, new Function1<Object, Unit>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner.showScreen.3.2.1
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m25invoke(@NotNull Object obj) {
                                Intrinsics.checkNotNullParameter(obj, "it");
                                sleepRestEditFragInner3.excludeHoliday = Boolean.parseBoolean(obj.toString());
                            }
                        });
                    }
                }, 3, (Object) null);
            }
        }, 1, (Object) null);
    }

    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.cancel) {
            Fragment parentFragment = getParentFragment();
            Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
            COUIBottomSheetDialogFragment cOUIBottomSheetDialogFragment = (COUIBottomSheetDialogFragment) (parentFragment2 instanceof COUIBottomSheetDialogFragment ? parentFragment2 : null);
            if (cOUIBottomSheetDialogFragment != null) {
                cOUIBottomSheetDialogFragment.dismiss();
            }
        } else {
            Integer num = (Integer) this.userDefinedDate.getValue();
            if (num != null && num.intValue() == 0) {
                a5k.h(getString(R.string.device_settings_must_select_one_day));
                return true;
            }
            if (this.restName.length() == 0) {
                a5k.h(getString(R.string.device_settings_input_rest_name_tips));
                return true;
            }
            if (this.isSubmitting) {
                return true;
            }
            this.isSubmitting = true;
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(null), 3, (Object) null);
        }
        return super/*androidx.fragment.app.Fragment*/.onOptionsItemSelected(item);
    }

    public SleepRestEditFragInner(@Nullable SleepSettingBean.SleepRest sleepRest) {
        this.sleepRest = sleepRest;
        this.sleepRestData = LazyKt.lazy(new Function0<SleepSettingBean.SleepRest>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.sleepsetting.ui.SleepRestEditFragInner$sleepRestData$2
            {
                super(0);
            }

            @NotNull
            /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
            public final SleepSettingBean.SleepRest m26invoke() {
                SleepSettingBean.SleepRest sleepRest2 = this.this$0.sleepRest;
                return sleepRest2 == null ? ((SleepAllRestViewModel) this.this$0.c0()).D0() : sleepRest2;
            }
        });
        this.restName = "";
        this.userDefinedDate = new MutableLiveData<>();
    }

    public /* synthetic */ SleepRestEditFragInner(SleepSettingBean.SleepRest sleepRest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sleepRest);
    }
}