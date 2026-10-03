package com.heytap.sports.record.details;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.databaseengine.apiv2.health.HeytapHealthParams;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$id;
import com.heytap.sports.R$string;
import com.heytap.sports.record.details.widget.ExerciseIntensityHelpPageCompose;
import com.heytap.sports.record.details.widget.HeartRateInstructionCompose;
import com.heytap.sports.record.details.widget.HelpPageCompose;
import com.heytap.sports.record.details.widget.RunningPostureHelpPageCompose;
import com.heytap.sports.record.details.widget.SwimGradeHelpPage;
import com.heytap.sports.record.details.widget.SwimSwolfHelpPage;
import com.heytap.sports.record.details.widget.TextOnlyHelpPageCompose;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.i3g;
import com.oplus.aiunit.vision.n3g;
import com.oplus.aiunit.vision.p9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/sports/RecordDetailInstructionActivity")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/heytap/sports/record/details/RecordDetailsInstructionActivity;", "Lcom/heytap/health/base/base/BaseActivity;", "", "F5", "E3", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "m7", "", LogFieldKey.MESSAGE_KEY, "I", "mSportMode", "<init>", "()V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RecordDetailsInstructionActivity extends BaseActivity {

    @NotNull
    public static final String BADMINTON = "badminton";

    @NotNull
    public static final String BADMINTON_ACTIVE_RATIO = "badminton_active_ratio";

    @NotNull
    public static final String BADMINTON_BATTING_DISTRIBUTION = "badminton_batting_distribution";

    @NotNull
    public static final String BADMINTON_OVER_HAND_RATIO = "badminton_over_hand_ratio";

    @NotNull
    public static final String CLIMB_FLOORS = "climb_floors";

    @NotNull
    public static final String EXERCISE_INTENSITY = "exercise_intensity";

    @NotNull
    public static final String EXERCISE_LOAD = "exercise_load";

    @NotNull
    public static final String HEART_RATE = "heart_rate";

    @NotNull
    public static final String KEY_CARD_TYPE = "type";

    @NotNull
    public static final String KEY_INSTRUCTION_VIEW = "INSTRUCTION_VIEW";

    @NotNull
    public static final String KEY_INTERVAL_HR_VERSION = "interval_hr_version";

    @NotNull
    public static final String KEY_SPORT_MODE = "sportMode";

    @NotNull
    public static final String OPEN_WATER_SWIM_GPS_TIPS = "open_water_swim_gps_tips";

    @NotNull
    public static final String PACE = "pace";

    @NotNull
    public static final String RIDE_POWER = "ride_power";

    @NotNull
    public static final String RUNNING_ADVANCED = "running_advanced";

    @NotNull
    public static final String RUNNING_POSTURE = "running_posture";

    @NotNull
    public static final String RUNNING_POSTURE_TOUCHDOWN_BALANCE = "running_posture_touchdown_balance";

    @NotNull
    public static final String RUNNING_POSTURE_TOUCHDOWN_TIME = "running_posture_touchdown_time";

    @NotNull
    public static final String RUNNING_POSTURE_VERTICAL_AMPLITUDE = "running_posture_vertical_amplitude";

    @NotNull
    public static final String RUNNING_POSTURE_VERTICAL_STRIDE_RATIO = "running_posture_vertical_amplitude_ratio";

    @NotNull
    public static final String RUNNING_POWER = "running_power";

    @NotNull
    public static final String STEP_RATE = "step_rate";

    @NotNull
    public static final String STRIDE = "stride";

    @NotNull
    public static final String SWIM_GRADE = "swim_grade";

    @NotNull
    public static final String SWIM_SWOLF = "swim_swolf";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mSportMode = -1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.sports.record.details.RecordDetailsInstructionActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004¨\u0006 "}, d2 = {"Lcom/heytap/sports/record/details/RecordDetailsInstructionActivity$a;", "", "", "BADMINTON", "Ljava/lang/String;", "BADMINTON_ACTIVE_RATIO", "BADMINTON_BATTING_DISTRIBUTION", "BADMINTON_OVER_HAND_RATIO", "CLIMB_FLOORS", p9j.EXERCISE_INTENSITY, "EXERCISE_LOAD", HeytapHealthParams.HEART_RATE, "KEY_CARD_TYPE", "KEY_INSTRUCTION_VIEW", "KEY_INTERVAL_HR_VERSION", "KEY_SPORT_MODE", "OPEN_WATER_SWIM_GPS_TIPS", "PACE", "RIDE_POWER", "RUNNING_ADVANCED", "RUNNING_POSTURE", "RUNNING_POSTURE_TOUCHDOWN_BALANCE", "RUNNING_POSTURE_TOUCHDOWN_TIME", "RUNNING_POSTURE_VERTICAL_AMPLITUDE", "RUNNING_POSTURE_VERTICAL_STRIDE_RATIO", "RUNNING_POWER", "STEP_RATE", "STRIDE", "SWIM_GRADE", "SWIM_SWOLF", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/sports/record/details/RecordDetailsInstructionActivity$b", "Lcom/oplus/aiunit/vision/n3g;", "", "data", "", b2n.g, "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends n3g<Object> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.n3g
        public void h(@Nullable Object data) {
            if (data instanceof View) {
                RecordDetailsInstructionActivity.this.m7((View) data);
            }
            j(RecordDetailsInstructionActivity.KEY_INSTRUCTION_VIEW);
            dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.az0
    public boolean E3() {
        return true;
    }

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean F5() {
        return false;
    }

    @Override // com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    public final void m7(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        setContentView(view);
        R1(this, (COUIToolbar) findViewById(R$id.toolbar), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String stringExtra;
        final HelpPageCompose exerciseIntensityHelpPageCompose;
        super.onCreate(savedInstanceState);
        try {
            stringExtra = getIntent().getStringExtra("type");
        } catch (Exception e2) {
            e2.getMessage();
            stringExtra = null;
        }
        this.mSportMode = getIntent().getIntExtra(KEY_SPORT_MODE, -1);
        if (!i3g.b().c(KEY_INSTRUCTION_VIEW) && TextUtils.isEmpty(stringExtra)) {
            finish();
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -2080463220:
                    if (stringExtra.equals(EXERCISE_INTENSITY)) {
                        exerciseIntensityHelpPageCompose = new ExerciseIntensityHelpPageCompose();
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case -2005973498:
                    if (stringExtra.equals(BADMINTON)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose.k(Integer.valueOf(R$string.sports_badminton_bxzs));
                        textOnlyHelpPageCompose.i(new Integer[]{Integer.valueOf(R$string.sports_badminton_bf), Integer.valueOf(R$string.sports_badminton_bf_desc), Integer.valueOf(R$string.sports_badminton_gf), Integer.valueOf(R$string.sports_badminton_gf_desc), Integer.valueOf(R$string.sports_badminton_dk), Integer.valueOf(R$string.sports_badminton_dk_desc), Integer.valueOf(R$string.sports_badminton_nl), Integer.valueOf(R$string.sports_badminton_nl_desc), Integer.valueOf(R$string.sports_badminton_hy), Integer.valueOf(R$string.sports_badminton_hy_desc)});
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case -1561599251:
                    if (stringExtra.equals(EXERCISE_LOAD)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose2 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose2.k(Integer.valueOf(R$string.sports_exercise_load_evaluate_card_title));
                        textOnlyHelpPageCompose2.i(new Integer[]{Integer.valueOf(R$string.sports_exercise_load_instruction_title0), Integer.valueOf(R$string.sports_exercise_load_instruction_content0), Integer.valueOf(R$string.sports_exercise_load_instruction_title1), Integer.valueOf(R$string.sports_exercise_load_instruction_content1_1), Integer.valueOf(R$string.sports_exercise_load_instruction_content1_2), Integer.valueOf(R$string.sports_exercise_load_instruction_content1_3), Integer.valueOf(R$string.sports_exercise_load_instruction_title2), Integer.valueOf(R$string.sports_exercise_load_instruction_content2_1), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_1), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_content_1), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_2), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_content_2), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_3), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_content_3), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_4), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_content_4), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_5), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_content_5), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_6), Integer.valueOf(R$string.sports_home_exercise_load_evaluate_content_6)});
                        textOnlyHelpPageCompose2.j(new Function1<Integer, Boolean>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity$onCreate$helpPage$18$1
                            @NotNull
                            public final Boolean invoke(int i) {
                                return Boolean.valueOf(i == 0 || i == 2 || i == 6);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                                return invoke(num.intValue());
                            }
                        });
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose2;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case -1274299650:
                    if (stringExtra.equals(RIDE_POWER)) {
                        RunningPostureHelpPageCompose runningPostureHelpPageCompose = new RunningPostureHelpPageCompose();
                        runningPostureHelpPageCompose.i(RunningPostureHelpPageCompose.RUNNING_POWER_RIDE);
                        exerciseIntensityHelpPageCompose = runningPostureHelpPageCompose;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case -1070664917:
                    if (stringExtra.equals(BADMINTON_ACTIVE_RATIO)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose3 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose3.k(Integer.valueOf(R$string.sports_badminton_card_active_ratio));
                        textOnlyHelpPageCompose3.i(new Integer[]{Integer.valueOf(R$string.sports_badminton_card_active_ratio_desc)});
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose3;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case -891986215:
                    if (stringExtra.equals("stride")) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose4 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose4.k(Integer.valueOf(R$string.sports_record_detail_instruction_stride_title));
                        textOnlyHelpPageCompose4.i(new Integer[]{Integer.valueOf(R$string.sports_record_detail_instruction_stride_sub_title1), Integer.valueOf(R$string.sports_record_detail_instruction_stride_content1), Integer.valueOf(R$string.sports_record_detail_instruction_stride_sub_title2), Integer.valueOf(R$string.sports_record_detail_instruction_stride_content2), Integer.valueOf(R$string.sports_record_detail_instruction_stride_sub_title3), Integer.valueOf(R$string.sports_record_detail_instruction_stride_content3), Integer.valueOf(R$string.sports_record_detail_instruction_stride_content31), Integer.valueOf(R$string.sports_record_detail_instruction_stride_content32)});
                        textOnlyHelpPageCompose4.j(new Function1<Integer, Boolean>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity$onCreate$helpPage$4$1
                            @NotNull
                            public final Boolean invoke(int i) {
                                return Boolean.valueOf(ArraysKt___ArraysKt.contains(new Integer[]{0, 2, 4}, Integer.valueOf(i)));
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                                return invoke(num.intValue());
                            }
                        });
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose4;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case -716115262:
                    if (stringExtra.equals(RUNNING_POSTURE_TOUCHDOWN_TIME)) {
                        RunningPostureHelpPageCompose runningPostureHelpPageCompose2 = new RunningPostureHelpPageCompose();
                        runningPostureHelpPageCompose2.i(RunningPostureHelpPageCompose.RUNNING_POSTURE_TOUCHDOWN_TIME);
                        exerciseIntensityHelpPageCompose = runningPostureHelpPageCompose2;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 3432979:
                    if (stringExtra.equals("pace")) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose5 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose5.k(Integer.valueOf(R$string.sports_record_detail_instruction_pace_title));
                        textOnlyHelpPageCompose5.i(new Integer[]{Integer.valueOf(R$string.sports_record_detail_instruction_pace_sub_title1), Integer.valueOf(R$string.sports_record_detail_instruction_pace_content11), Integer.valueOf(R$string.sports_record_detail_instruction_pace_content12), Integer.valueOf(R$string.sports_record_detail_instruction_pace_sub_title2), Integer.valueOf(R$string.sports_record_detail_instruction_pace_content2), Integer.valueOf(R$string.sports_record_detail_instruction_pace_sub_title3), Integer.valueOf(R$string.sports_record_detail_instruction_pace_content3)});
                        textOnlyHelpPageCompose5.j(new Function1<Integer, Boolean>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity$onCreate$helpPage$2$1
                            @NotNull
                            public final Boolean invoke(int i) {
                                return Boolean.valueOf(ArraysKt___ArraysKt.contains(new Integer[]{0, 3, 5}, Integer.valueOf(i)));
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                                return invoke(num.intValue());
                            }
                        });
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose5;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 273446533:
                    if (stringExtra.equals(RUNNING_POWER)) {
                        RunningPostureHelpPageCompose runningPostureHelpPageCompose3 = new RunningPostureHelpPageCompose();
                        runningPostureHelpPageCompose3.i(RunningPostureHelpPageCompose.RUNNING_POWER);
                        exerciseIntensityHelpPageCompose = runningPostureHelpPageCompose3;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 287624903:
                    if (stringExtra.equals(RUNNING_POSTURE_TOUCHDOWN_BALANCE)) {
                        RunningPostureHelpPageCompose runningPostureHelpPageCompose4 = new RunningPostureHelpPageCompose();
                        runningPostureHelpPageCompose4.i(RunningPostureHelpPageCompose.RUNNING_POSTURE_TOUCHDOWN_BALANCE);
                        exerciseIntensityHelpPageCompose = runningPostureHelpPageCompose4;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 290357325:
                    if (stringExtra.equals(BADMINTON_OVER_HAND_RATIO)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose6 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose6.k(Integer.valueOf(R$string.sports_badminton_card_over_hand_ratio));
                        textOnlyHelpPageCompose6.i(new Integer[]{Integer.valueOf(R$string.sports_badminton_card_over_hand_ratio_desc)});
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose6;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 640916825:
                    if (stringExtra.equals(BADMINTON_BATTING_DISTRIBUTION)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose7 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose7.k(Integer.valueOf(R$string.sports_record_tennis_detail_card_title_desc));
                        textOnlyHelpPageCompose7.i(new Integer[]{Integer.valueOf(R$string.sports_badminton_zs), Integer.valueOf(R$string.sports_badminton_zs_desc), Integer.valueOf(R$string.sports_badminton_fs), Integer.valueOf(R$string.sports_badminton_fs_desc), Integer.valueOf(R$string.sports_badminton_ssq), Integer.valueOf(R$string.sports_badminton_ssq_desc), Integer.valueOf(R$string.sports_badminton_xsq), Integer.valueOf(R$string.sports_badminton_xsq_desc), Integer.valueOf(R$string.sports_record_swim_stroke_others), Integer.valueOf(R$string.sports_badminton_qt_desc), Integer.valueOf(R$string.sports_badminton_feasibility), Integer.valueOf(R$string.sports_badminton_feasibility_desc)});
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose7;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 785767143:
                    if (stringExtra.equals(OPEN_WATER_SWIM_GPS_TIPS)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose8 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose8.k(Integer.valueOf(R$string.sports_open_water_swim_gps_tips_title));
                        textOnlyHelpPageCompose8.i(new Integer[]{Integer.valueOf(R$string.sports_open_water_swim_gps_tips_content)});
                        textOnlyHelpPageCompose8.j(new Function1<Integer, Boolean>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity$onCreate$helpPage$16$1
                            @NotNull
                            public final Boolean invoke(int i) {
                                return Boolean.FALSE;
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                                return invoke(num.intValue());
                            }
                        });
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose8;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 785872456:
                    if (stringExtra.equals(RUNNING_POSTURE)) {
                        RunningPostureHelpPageCompose runningPostureHelpPageCompose5 = new RunningPostureHelpPageCompose();
                        runningPostureHelpPageCompose5.i(RunningPostureHelpPageCompose.RUNNING_POSTURE);
                        exerciseIntensityHelpPageCompose = runningPostureHelpPageCompose5;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 927502001:
                    if (stringExtra.equals(CLIMB_FLOORS)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose9 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose9.k(Integer.valueOf(R$string.sports_climb_floors_instruction));
                        textOnlyHelpPageCompose9.i(new Integer[]{Integer.valueOf(R$string.sports_climb_floors_instruction_content), Integer.valueOf(R$string.sports_climb_floors_instruction_sub_title1), Integer.valueOf(R$string.sports_climb_floors_instruction_content1), Integer.valueOf(R$string.sports_climb_floors_instruction_sub_title2), Integer.valueOf(R$string.sports_climb_floors_instruction_content2)});
                        textOnlyHelpPageCompose9.j(new Function1<Integer, Boolean>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity$onCreate$helpPage$17$1
                            @NotNull
                            public final Boolean invoke(int i) {
                                return Boolean.valueOf(i % 2 == 1);
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                                return invoke(num.intValue());
                            }
                        });
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose9;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 1344953971:
                    if (stringExtra.equals(STEP_RATE)) {
                        TextOnlyHelpPageCompose textOnlyHelpPageCompose10 = new TextOnlyHelpPageCompose();
                        textOnlyHelpPageCompose10.k(Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_title));
                        textOnlyHelpPageCompose10.i(new Integer[]{Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_sub_title1), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content1), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_sub_title2), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content2), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_sub_title3), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content3), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content31), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content32), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content33), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_sub_title4), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content41), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content42), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content43), Integer.valueOf(R$string.sports_record_detail_instruction_step_rate_content44)});
                        textOnlyHelpPageCompose10.j(new Function1<Integer, Boolean>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity$onCreate$helpPage$3$1
                            @NotNull
                            public final Boolean invoke(int i) {
                                return Boolean.valueOf(ArraysKt___ArraysKt.contains(new Integer[]{0, 2, 4, 9}, Integer.valueOf(i)));
                            }

                            @Override // p010kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                                return invoke(num.intValue());
                            }
                        });
                        exerciseIntensityHelpPageCompose = textOnlyHelpPageCompose10;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 1400634961:
                    if (stringExtra.equals(RUNNING_POSTURE_VERTICAL_AMPLITUDE)) {
                        RunningPostureHelpPageCompose runningPostureHelpPageCompose6 = new RunningPostureHelpPageCompose();
                        runningPostureHelpPageCompose6.i(RunningPostureHelpPageCompose.RUNNING_POSTURE_VERTICAL_AMPLITUDE);
                        exerciseIntensityHelpPageCompose = runningPostureHelpPageCompose6;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 1601106077:
                    if (stringExtra.equals(RUNNING_POSTURE_VERTICAL_STRIDE_RATIO)) {
                        RunningPostureHelpPageCompose runningPostureHelpPageCompose7 = new RunningPostureHelpPageCompose();
                        runningPostureHelpPageCompose7.i(RunningPostureHelpPageCompose.RUNNING_POSTURE_VERTICAL_STRIDE_RATIO);
                        exerciseIntensityHelpPageCompose = runningPostureHelpPageCompose7;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 1915563872:
                    if (stringExtra.equals(SWIM_GRADE)) {
                        exerciseIntensityHelpPageCompose = new SwimGradeHelpPage();
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 1926808782:
                    if (stringExtra.equals(SWIM_SWOLF)) {
                        exerciseIntensityHelpPageCompose = new SwimSwolfHelpPage();
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
                case 1930449209:
                    if (stringExtra.equals("heart_rate")) {
                        HeartRateInstructionCompose heartRateInstructionCompose = new HeartRateInstructionCompose();
                        heartRateInstructionCompose.y(this.mSportMode);
                        Intent intent = getIntent();
                        heartRateInstructionCompose.z(intent != null ? intent.getIntExtra(KEY_INTERVAL_HR_VERSION, 0) : 0);
                        exerciseIntensityHelpPageCompose = heartRateInstructionCompose;
                        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1299803912, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.1
                            {
                                super(2);
                            }

                            @Override // p010kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer, int i) {
                                if ((i & 11) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299803912, i, -1, "com.heytap.sports.record.details.RecordDetailsInstructionActivity.onCreate.<anonymous> (RecordDetailsInstructionActivity.kt:282)");
                                }
                                exerciseIntensityHelpPageCompose.a(composer, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 1, null);
                        return;
                    }
                    break;
            }
        }
        i3g.b().d(KEY_INSTRUCTION_VIEW, new b());
    }
}
