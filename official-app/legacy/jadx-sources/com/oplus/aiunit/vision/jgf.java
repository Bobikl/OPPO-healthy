package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.health.sport.R$drawable;
import com.heytap.health.sport.R$string;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0011R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0011R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b&\u0010*¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/jgf;", "", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, MapSchema.FIELD_NAME_ENTRY, "(I)Ljava/lang/Integer;", "d", "gameId", "c", "b", "Landroid/content/Context;", "context", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "record", "", "f", "RECORD_DATA_TYPE_TOTAL_DISTANCE", "I", "RECORD_DATA_TYPE_TOTAL_CALORIES", "RECORD_DATA_TYPE_TOTAL_STEP_COUNT", "RECORD_DATA_TYPE_TOTAL_DURATION", "RECORD_DATA_TYPE_PACE", "RECORD_DATA_TYPE_SPEED", "RECORD_DATA_TYPE_TOTAL_COMPLETE_TIMES", "RECORD_DATA_TYPE_SWIM_PACE", "RECORD_DATA_TYPE_TOTAL_STROKE", "RECORD_DATA_TYPE_SWOIF", "RECORD_DATA_TYPE_TOTAL_LAP", "RECORD_DATA_TYPE_TOTAL_STRIDE", "SWIM_STROKE_FREESTYLE", "SWIM_STROKE_BREASTSTROKE", "SWIM_STROKE_BUTTERFLY", "SWIM_STROKE_BACKSTROKE", "SWIM_STROKE_MEDLEY_STROKE", "SWIM_STROKE_OTHERS", "SUB_TYP_INTERVAL_TRAINING", "SUB_TYP_SEGMENT", "Landroid/util/SparseArray;", "a", "Landroid/util/SparseArray;", "sportNames", "sportIcons", "()I", "defaultDrawable", "<init>", "()V", "sport_release"}, k = 1, mv = {1, 8, 0})
public final class jgf {
    public static final int $stable;

    @NotNull
    public static final jgf INSTANCE = new jgf();
    public static final int RECORD_DATA_TYPE_PACE = 5;
    public static final int RECORD_DATA_TYPE_SPEED = 6;
    public static final int RECORD_DATA_TYPE_SWIM_PACE = 8;
    public static final int RECORD_DATA_TYPE_SWOIF = 10;
    public static final int RECORD_DATA_TYPE_TOTAL_CALORIES = 3;
    public static final int RECORD_DATA_TYPE_TOTAL_COMPLETE_TIMES = 7;
    public static final int RECORD_DATA_TYPE_TOTAL_DISTANCE = 1;
    public static final int RECORD_DATA_TYPE_TOTAL_DURATION = 4;
    public static final int RECORD_DATA_TYPE_TOTAL_LAP = 11;
    public static final int RECORD_DATA_TYPE_TOTAL_STEP_COUNT = 2;
    public static final int RECORD_DATA_TYPE_TOTAL_STRIDE = 12;
    public static final int RECORD_DATA_TYPE_TOTAL_STROKE = 9;
    public static final int SUB_TYP_INTERVAL_TRAINING = 1;
    public static final int SUB_TYP_SEGMENT = 2;
    public static final int SWIM_STROKE_BACKSTROKE = 4;
    public static final int SWIM_STROKE_BREASTSTROKE = 2;
    public static final int SWIM_STROKE_BUTTERFLY = 3;
    public static final int SWIM_STROKE_FREESTYLE = 1;
    public static final int SWIM_STROKE_MEDLEY_STROKE = 5;
    public static final int SWIM_STROKE_OTHERS = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final SparseArray<Integer> sportNames;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final SparseArray<Integer> sportIcons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final int defaultDrawable;

    static {
        SparseArray<Integer> sparseArray = new SparseArray<>();
        sportNames = sparseArray;
        SparseArray<Integer> sparseArray2 = new SparseArray<>();
        sportIcons = sparseArray2;
        defaultDrawable = R$drawable.sports_mode_ic_default;
        int i = R$string.sports_sp_5km_relax_run;
        sparseArray.put(16, Integer.valueOf(i));
        sparseArray.put(18, Integer.valueOf(R$string.settings_customize_sport_type_fat_run_outdoor));
        sparseArray.put(19, Integer.valueOf(R$string.settings_customize_sport_type_indoor_fitness_walk));
        int i2 = R$string.sports_sp_running_indoor;
        sparseArray.put(14, Integer.valueOf(i2));
        sparseArray.put(10, Integer.valueOf(i2));
        sparseArray.put(21, Integer.valueOf(i2));
        sparseArray.put(15, Integer.valueOf(i));
        sparseArray.put(17, Integer.valueOf(R$string.settings_customize_sport_type_fat_run_indoor));
        int i3 = R$string.sports_sp_running_outdoor;
        sparseArray.put(13, Integer.valueOf(i3));
        sparseArray.put(2, Integer.valueOf(i3));
        sparseArray.put(40, Integer.valueOf(R$string.sports_run));
        sparseArray.put(oei.PLAYGROUND_RUN, Integer.valueOf(R$string.sports_sp_playground_run));
        sparseArray.put(1, Integer.valueOf(R$string.settings_customize_sport_type_walk));
        sparseArray.put(41, Integer.valueOf(R$string.sports_walk));
        sparseArray.put(22, Integer.valueOf(R$string.sports_sp_marathon));
        sparseArray.put(36, Integer.valueOf(R$string.sports_record_mountain_climbing));
        sparseArray.put(37, Integer.valueOf(R$string.sports_record_cross_country));
        sparseArray.put(127, Integer.valueOf(R$string.sports_record_stamina_testing1));
        sparseArray.put(35, Integer.valueOf(R$string.fit_title_free_movement));
        sparseArray.put(33, Integer.valueOf(R$string.fit_title_rowing_machine));
        sparseArray.put(32, Integer.valueOf(R$string.record_title_elliptical_machine));
        sparseArray.put(31, Integer.valueOf(R$string.record_title_badminton));
        sparseArray.put(34, Integer.valueOf(R$string.settings_customize_sport_type_indoor_motion_bike));
        sparseArray.put(7, Integer.valueOf(R$string.fit_title_pool_swim));
        sparseArray.put(oei.OPEN_WATER_SWIM, Integer.valueOf(R$string.sports_record_mode_open_water_swim));
        sparseArray.put(3, Integer.valueOf(R$string.settings_customize_sport_type_ride));
        sparseArray.put(8, Integer.valueOf(R$string.sports_record_mode_8));
        sparseArray.put(201, Integer.valueOf(R$string.sports_record_mode_201));
        sparseArray.put(202, Integer.valueOf(R$string.sports_record_mode_202));
        sparseArray.put(204, Integer.valueOf(R$string.sports_record_mode_204));
        sparseArray.put(205, Integer.valueOf(R$string.sports_record_mode_205));
        sparseArray.put(206, Integer.valueOf(R$string.sports_record_mode_206));
        sparseArray.put(207, Integer.valueOf(R$string.sports_record_mode_207));
        sparseArray.put(208, Integer.valueOf(R$string.sports_record_mode_208));
        sparseArray.put(209, Integer.valueOf(R$string.sports_record_mode_209));
        sparseArray.put(210, Integer.valueOf(R$string.sports_record_mode_210));
        sparseArray.put(211, Integer.valueOf(R$string.sports_record_mode_211));
        sparseArray.put(213, Integer.valueOf(R$string.sports_record_mode_213));
        sparseArray.put(214, Integer.valueOf(R$string.sports_record_mode_214));
        sparseArray.put(215, Integer.valueOf(R$string.sports_record_mode_215));
        sparseArray.put(216, Integer.valueOf(R$string.sports_record_mode_216));
        sparseArray.put(217, Integer.valueOf(R$string.sports_record_mode_217));
        sparseArray.put(218, Integer.valueOf(R$string.sports_record_mode_218));
        sparseArray.put(219, Integer.valueOf(R$string.sports_record_mode_219));
        sparseArray.put(220, Integer.valueOf(R$string.sports_record_mode_220));
        sparseArray.put(222, Integer.valueOf(R$string.sports_record_mode_222));
        sparseArray.put(223, Integer.valueOf(R$string.sports_record_mode_223));
        sparseArray.put(oei.TAI_CHI, Integer.valueOf(R$string.sports_record_mode_224));
        sparseArray.put(225, Integer.valueOf(R$string.sports_record_mode_225));
        sparseArray.put(227, Integer.valueOf(R$string.sports_record_mode_227));
        sparseArray.put(228, Integer.valueOf(R$string.sports_record_mode_228));
        sparseArray.put(229, Integer.valueOf(R$string.sports_record_mode_229));
        sparseArray.put(230, Integer.valueOf(R$string.sports_record_mode_230));
        sparseArray.put(42, Integer.valueOf(R$string.sports_record_mode_42));
        int i4 = com.heytap.health.base.R$string.lib_base_yoga;
        sparseArray.put(12, Integer.valueOf(i4));
        sparseArray.put(107, Integer.valueOf(i4));
        sparseArray.put(301, Integer.valueOf(R$string.sports_record_mode_301));
        sparseArray.put(302, Integer.valueOf(R$string.sports_record_mode_302));
        sparseArray.put(303, Integer.valueOf(R$string.sports_record_mode_303));
        sparseArray.put(304, Integer.valueOf(R$string.sports_record_mode_304));
        sparseArray.put(305, Integer.valueOf(R$string.sports_record_mode_305));
        sparseArray.put(306, Integer.valueOf(R$string.sports_record_mode_306));
        sparseArray.put(307, Integer.valueOf(R$string.sports_record_mode_307));
        sparseArray.put(308, Integer.valueOf(R$string.sports_record_mode_308));
        sparseArray.put(309, Integer.valueOf(R$string.sports_record_mode_309));
        sparseArray.put(310, Integer.valueOf(R$string.sports_record_mode_310));
        sparseArray.put(311, Integer.valueOf(R$string.sports_record_mode_311));
        sparseArray.put(312, Integer.valueOf(R$string.sports_record_mode_312));
        sparseArray.put(313, Integer.valueOf(R$string.sports_record_mode_313));
        sparseArray.put(401, Integer.valueOf(R$string.sports_record_mode_401));
        sparseArray.put(402, Integer.valueOf(R$string.sports_record_mode_402));
        sparseArray.put(403, Integer.valueOf(R$string.sports_record_mode_403));
        sparseArray.put(404, Integer.valueOf(R$string.sports_record_mode_404));
        sparseArray.put(405, Integer.valueOf(R$string.sports_record_mode_405));
        sparseArray.put(406, Integer.valueOf(R$string.sports_record_mode_406));
        sparseArray.put(407, Integer.valueOf(R$string.sports_record_mode_407));
        sparseArray.put(408, Integer.valueOf(R$string.sports_record_mode_408));
        sparseArray.put(409, Integer.valueOf(R$string.sports_record_mode_409));
        sparseArray.put(410, Integer.valueOf(R$string.sports_record_mode_410));
        sparseArray.put(501, Integer.valueOf(R$string.sports_record_mode_501));
        sparseArray.put(502, Integer.valueOf(R$string.sports_record_mode_502));
        sparseArray.put(503, Integer.valueOf(R$string.sports_record_mode_503));
        sparseArray.put(504, Integer.valueOf(R$string.sports_record_mode_504));
        sparseArray.put(505, Integer.valueOf(R$string.sports_record_mode_505));
        sparseArray.put(506, Integer.valueOf(R$string.sports_record_mode_506));
        sparseArray.put(601, Integer.valueOf(R$string.sports_record_mode_601));
        sparseArray.put(602, Integer.valueOf(R$string.sports_record_mode_602));
        sparseArray.put(603, Integer.valueOf(R$string.sports_record_mode_603));
        sparseArray.put(604, Integer.valueOf(R$string.sports_record_mode_604));
        sparseArray.put(605, Integer.valueOf(R$string.sports_record_mode_605));
        sparseArray.put(606, Integer.valueOf(R$string.sports_record_mode_606));
        sparseArray.put(607, Integer.valueOf(R$string.sports_record_mode_607));
        sparseArray.put(608, Integer.valueOf(R$string.sports_record_mode_608));
        sparseArray.put(609, Integer.valueOf(R$string.sports_record_mode_609));
        sparseArray.put(610, Integer.valueOf(R$string.sports_record_mode_610));
        sparseArray.put(611, Integer.valueOf(R$string.sports_record_mode_611));
        sparseArray.put(612, Integer.valueOf(R$string.sports_record_mode_612));
        sparseArray.put(oei.PADEL_TENNIS, Integer.valueOf(R$string.sports_record_mode_613));
        sparseArray.put(701, Integer.valueOf(R$string.sports_record_mode_701));
        sparseArray.put(702, Integer.valueOf(R$string.sports_record_mode_702));
        sparseArray.put(703, Integer.valueOf(R$string.sports_record_mode_703));
        sparseArray.put(704, Integer.valueOf(R$string.sports_record_mode_704));
        sparseArray.put(705, Integer.valueOf(R$string.sports_record_mode_705));
        sparseArray.put(706, Integer.valueOf(R$string.sports_record_mode_706));
        sparseArray.put(707, Integer.valueOf(R$string.sports_record_mode_707));
        sparseArray.put(801, Integer.valueOf(R$string.sports_record_mode_801));
        sparseArray.put(802, Integer.valueOf(R$string.sports_record_mode_802));
        sparseArray.put(803, Integer.valueOf(R$string.sports_record_mode_803));
        sparseArray.put(804, Integer.valueOf(R$string.sports_record_mode_804));
        sparseArray.put(805, Integer.valueOf(R$string.sports_record_mode_805));
        sparseArray.put(oei.ROWING, Integer.valueOf(R$string.sports_record_mode_806));
        sparseArray.put(oei.WATER_POLO, Integer.valueOf(R$string.sports_record_mode_807));
        sparseArray.put(oei.DIVING, Integer.valueOf(R$string.sports_record_mode_808));
        sparseArray.put(901, Integer.valueOf(R$string.sports_record_mode_901));
        sparseArray.put(902, Integer.valueOf(R$string.sports_record_mode_902));
        sparseArray.put(903, Integer.valueOf(R$string.sports_record_mode_903));
        sparseArray.put(904, Integer.valueOf(R$string.sports_record_mode_904));
        sparseArray.put(905, Integer.valueOf(R$string.sports_record_mode_905));
        sparseArray.put(906, Integer.valueOf(R$string.sports_record_mode_906));
        sparseArray.put(oei.ROPE_SKIPPING, Integer.valueOf(R$string.sports_record_mode_908));
        sparseArray.put(5, Integer.valueOf(R$string.sports_record_mode_climb));
        sparseArray2.put(16, Integer.valueOf(R$drawable.sports_record_5km_relax_run_indoor));
        sparseArray2.put(18, Integer.valueOf(R$drawable.sports_record_fat_reduce_run_indoor));
        sparseArray2.put(19, Integer.valueOf(R$drawable.sports_ic_record_item_walk_indoor));
        int i5 = R$drawable.sports_ic_record_item_run;
        sparseArray2.put(14, Integer.valueOf(i5));
        sparseArray2.put(10, Integer.valueOf(i5));
        sparseArray2.put(21, Integer.valueOf(i5));
        sparseArray2.put(15, Integer.valueOf(R$drawable.sports_record_5km_relax_run));
        sparseArray2.put(17, Integer.valueOf(R$drawable.sports_record_fat_reduce_run));
        int i6 = R$drawable.sports_ic_record_item_run_outdoor;
        sparseArray2.put(13, Integer.valueOf(i6));
        sparseArray2.put(2, Integer.valueOf(i6));
        sparseArray2.put(40, Integer.valueOf(i6));
        sparseArray2.put(oei.PLAYGROUND_RUN, Integer.valueOf(R$drawable.sports_mode_ic_playground_run));
        int i7 = R$drawable.sports_ic_record_item_walk;
        sparseArray2.put(1, Integer.valueOf(i7));
        sparseArray2.put(41, Integer.valueOf(i7));
        sparseArray2.put(22, Integer.valueOf(R$drawable.sports_mode_ic_marathon));
        sparseArray2.put(36, Integer.valueOf(R$drawable.record_icon_mountain_climbing));
        sparseArray2.put(37, Integer.valueOf(R$drawable.record_icon_cross_country));
        sparseArray2.put(127, Integer.valueOf(R$drawable.record_icon_physical_testing));
        sparseArray2.put(35, Integer.valueOf(R$drawable.record_icon_free_training));
        sparseArray2.put(33, Integer.valueOf(R$drawable.record_icon_rowing_machine));
        sparseArray2.put(32, Integer.valueOf(R$drawable.record_icon_elliptical_machine));
        sparseArray2.put(31, Integer.valueOf(R$drawable.record_icon_badminton));
        int i8 = R$drawable.sports_record_list_title_bike;
        sparseArray2.put(34, Integer.valueOf(i8));
        sparseArray2.put(7, Integer.valueOf(R$drawable.sports_mode_ic_swim));
        sparseArray2.put(oei.OPEN_WATER_SWIM, Integer.valueOf(R$drawable.sports_mode_ic_open_water_swim));
        sparseArray2.put(3, Integer.valueOf(i8));
        sparseArray2.put(8, Integer.valueOf(R$drawable.sports_mode_ic_golf));
        sparseArray2.put(201, Integer.valueOf(R$drawable.sports_mode_ic_explosive_training));
        sparseArray2.put(202, Integer.valueOf(R$drawable.sports_mode_ic_back_training));
        sparseArray2.put(204, Integer.valueOf(R$drawable.sports_mode_ic_climber));
        sparseArray2.put(205, Integer.valueOf(R$drawable.sports_mode_ic_abdominal_training));
        sparseArray2.put(206, Integer.valueOf(R$drawable.sports_mode_ic_core_training));
        sparseArray2.put(207, Integer.valueOf(R$drawable.sports_mode_ic_fencing));
        sparseArray2.put(208, Integer.valueOf(R$drawable.sports_mode_ic_shoulder_training));
        sparseArray2.put(209, Integer.valueOf(R$drawable.sports_mode_ic_aerobics));
        sparseArray2.put(210, Integer.valueOf(R$drawable.sports_mode_ic_neck_training));
        sparseArray2.put(211, Integer.valueOf(R$drawable.sports_mode_ic_strength_training));
        sparseArray2.put(213, Integer.valueOf(R$drawable.sports_mode_ic_agility_training));
        sparseArray2.put(214, Integer.valueOf(R$drawable.sports_mode_ic_balance_training));
        sparseArray2.put(215, Integer.valueOf(R$drawable.sports_mode_ic_boxing));
        sparseArray2.put(216, Integer.valueOf(R$drawable.sports_mode_ic_judo));
        sparseArray2.put(217, Integer.valueOf(R$drawable.sports_mode_ic_flexibility_training));
        sparseArray2.put(218, Integer.valueOf(R$drawable.sports_mode_ic_upper_limb_training));
        sparseArray2.put(219, Integer.valueOf(R$drawable.sports_mode_ic_shooting));
        sparseArray2.put(220, Integer.valueOf(R$drawable.sports_mode_ic_archery));
        sparseArray2.put(222, Integer.valueOf(R$drawable.sports_mode_ic_stepper));
        sparseArray2.put(223, Integer.valueOf(R$drawable.sports_mode_ic_taekwondo));
        sparseArray2.put(oei.TAI_CHI, Integer.valueOf(R$drawable.sports_mode_ic_tai_chi));
        sparseArray2.put(225, Integer.valueOf(R$drawable.sports_mode_ic_gymnastics));
        sparseArray2.put(227, Integer.valueOf(R$drawable.sports_mode_ic_martial_arts));
        sparseArray2.put(228, Integer.valueOf(R$drawable.sports_mode_ic_lower_limb_training));
        sparseArray2.put(229, Integer.valueOf(R$drawable.sports_mode_ic_chest_training));
        sparseArray2.put(230, Integer.valueOf(R$drawable.sports_mode_ic_waist_training));
        int i9 = R$drawable.sports_mode_ic_comp_physical_fit;
        sparseArray2.put(42, Integer.valueOf(i9));
        int i10 = R$drawable.sports_mode_ic_yoga;
        sparseArray2.put(12, Integer.valueOf(i10));
        sparseArray2.put(107, Integer.valueOf(i10));
        sparseArray2.put(301, Integer.valueOf(R$drawable.sports_mode_ic_anusara));
        sparseArray2.put(302, Integer.valueOf(R$drawable.sports_mode_ic_ashtanga_yoga));
        sparseArray2.put(303, Integer.valueOf(R$drawable.sports_mode_ic_iyengar_yoga));
        sparseArray2.put(304, Integer.valueOf(R$drawable.sports_mode_ic_fly_yoga));
        sparseArray2.put(305, Integer.valueOf(R$drawable.sports_mode_ic_hatha_yoga));
        sparseArray2.put(306, Integer.valueOf(R$drawable.sports_mode_ic_aerial_yoga));
        sparseArray2.put(307, Integer.valueOf(R$drawable.sports_mode_ic_physiotherapy_yoga));
        sparseArray2.put(308, Integer.valueOf(R$drawable.sports_mode_ic_flow_yoga));
        sparseArray2.put(309, Integer.valueOf(R$drawable.sports_mode_ic_meditation));
        sparseArray2.put(310, Integer.valueOf(R$drawable.sports_mode_ic_vipassana_flow_yoga));
        sparseArray2.put(311, Integer.valueOf(R$drawable.sports_mode_ic_pilates));
        sparseArray2.put(312, Integer.valueOf(R$drawable.sports_mode_ic_yin_yoga));
        sparseArray2.put(313, Integer.valueOf(R$drawable.sports_mode_ic_pregnancy_yoga));
        sparseArray2.put(401, Integer.valueOf(R$drawable.sports_mode_ic_ballet));
        sparseArray2.put(402, Integer.valueOf(R$drawable.sports_mode_ic_disco));
        sparseArray2.put(403, Integer.valueOf(R$drawable.sports_mode_ic_belly_dance));
        sparseArray2.put(404, Integer.valueOf(R$drawable.sports_mode_ic_square_dance));
        sparseArray2.put(405, Integer.valueOf(R$drawable.sports_mode_ic_waltz));
        sparseArray2.put(406, Integer.valueOf(R$drawable.sports_mode_ic_street_dance));
        sparseArray2.put(407, Integer.valueOf(R$drawable.sports_mode_ic_jazz));
        sparseArray2.put(408, Integer.valueOf(R$drawable.sports_mode_ic_latin_dance));
        sparseArray2.put(409, Integer.valueOf(R$drawable.sports_mode_ic_tango));
        sparseArray2.put(410, Integer.valueOf(R$drawable.sports_mode_ic_tap_dance));
        sparseArray2.put(501, Integer.valueOf(R$drawable.sports_mode_ic_bungee_jumping));
        sparseArray2.put(502, Integer.valueOf(R$drawable.sports_mode_ic_skateboard));
        sparseArray2.put(503, Integer.valueOf(R$drawable.sports_mode_ic_roller_skating));
        sparseArray2.put(504, Integer.valueOf(R$drawable.sports_mode_ic_rock_climbing));
        sparseArray2.put(505, Integer.valueOf(R$drawable.sports_mode_ic_parkour));
        sparseArray2.put(506, Integer.valueOf(R$drawable.sports_mode_ic_on_foot));
        sparseArray2.put(601, Integer.valueOf(R$drawable.sports_mode_ic_cricket));
        sparseArray2.put(602, Integer.valueOf(R$drawable.sports_mode_ic_baseball));
        sparseArray2.put(603, Integer.valueOf(R$drawable.sports_mode_ic_american_football));
        sparseArray2.put(604, Integer.valueOf(R$drawable.sports_mode_ic_basketball));
        sparseArray2.put(605, Integer.valueOf(R$drawable.sports_mode_ic_softball));
        sparseArray2.put(606, Integer.valueOf(R$drawable.sports_mode_ic_croquet));
        sparseArray2.put(607, Integer.valueOf(R$drawable.sports_mode_ic_volleyball));
        sparseArray2.put(608, Integer.valueOf(R$drawable.sports_mode_ic_pingpong));
        sparseArray2.put(609, Integer.valueOf(R$drawable.sports_mode_ic_hockey));
        sparseArray2.put(610, Integer.valueOf(R$drawable.sports_mode_ic_tennis));
        sparseArray2.put(611, Integer.valueOf(R$drawable.sports_mode_ic_football));
        sparseArray2.put(612, Integer.valueOf(R$drawable.sports_mode_ic_pickleball));
        sparseArray2.put(oei.PADEL_TENNIS, Integer.valueOf(R$drawable.sports_mode_ic_padel_tennis));
        sparseArray2.put(701, Integer.valueOf(R$drawable.sports_mode_ic_curling));
        sparseArray2.put(702, Integer.valueOf(R$drawable.sports_mode_ic_puck));
        sparseArray2.put(703, Integer.valueOf(R$drawable.sports_mode_ic_biathlon));
        sparseArray2.put(704, Integer.valueOf(R$drawable.sports_mode_ic_skate));
        sparseArray2.put(705, Integer.valueOf(R$drawable.sports_mode_ic_ski));
        sparseArray2.put(706, Integer.valueOf(R$drawable.sports_mode_ic_snow_car));
        sparseArray2.put(707, Integer.valueOf(R$drawable.sports_mode_ic_sled));
        sparseArray2.put(801, Integer.valueOf(R$drawable.sports_mode_ic_surf));
        sparseArray2.put(802, Integer.valueOf(R$drawable.sports_mode_ic_sailboat));
        sparseArray2.put(803, Integer.valueOf(R$drawable.sports_mode_ic_motorboat));
        sparseArray2.put(804, Integer.valueOf(R$drawable.sports_mode_ic_kayaking));
        sparseArray2.put(805, Integer.valueOf(R$drawable.sports_mode_ic_drifting));
        sparseArray2.put(oei.ROWING, Integer.valueOf(R$drawable.sports_mode_ic_rowing));
        sparseArray2.put(oei.WATER_POLO, Integer.valueOf(R$drawable.sports_mode_ic_water_polo));
        sparseArray2.put(oei.DIVING, Integer.valueOf(R$drawable.sports_mode_ic_diving));
        sparseArray2.put(901, Integer.valueOf(R$drawable.sports_mode_ic_tug_of_war));
        sparseArray2.put(902, Integer.valueOf(R$drawable.sports_mode_ic_fly_a_kite));
        sparseArray2.put(903, Integer.valueOf(R$drawable.sports_mode_ic_darts));
        sparseArray2.put(904, Integer.valueOf(R$drawable.sports_mode_ic_frisbee));
        sparseArray2.put(905, Integer.valueOf(R$drawable.sports_mode_ic_walk_the_dog));
        sparseArray2.put(906, Integer.valueOf(R$drawable.sports_mode_ic_horse_riding));
        sparseArray2.put(oei.ROPE_SKIPPING, Integer.valueOf(R$drawable.sports_mode_ic_rope_skipping));
        sparseArray2.put(44, Integer.valueOf(i6));
        sparseArray2.put(43, Integer.valueOf(i5));
        sparseArray2.put(290, Integer.valueOf(i9));
        sparseArray2.put(38, Integer.valueOf(R$drawable.lib_game_avatar_default));
        sparseArray2.put(9, Integer.valueOf(R$drawable.sports_mode_ic_fitness));
        sparseArray2.put(5, Integer.valueOf(R$drawable.sports_mode_ic_climb));
        $stable = 8;
    }

    @JvmStatic
    public static final int c(int gameId) {
        if (gameId == 1) {
            return R$string.lib_core_game_king;
        }
        if (gameId == 2) {
            return R$string.lib_core_game_peace;
        }
        if (gameId == 3) {
            return R$string.lib_core_game_cf;
        }
        if (gameId != 4) {
            return gameId != 5 ? R$string.lib_core_game_default : R$string.lib_core_game_ace;
        }
        return R$string.lib_core_game_qqfc;
    }

    @JvmStatic
    @Nullable
    public static final Integer d(int sportMode) {
        return sportIcons.get(sportMode);
    }

    @JvmStatic
    @Nullable
    public static final Integer e(int sportMode) {
        return sportNames.get(sportMode);
    }

    public final int a() {
        return defaultDrawable;
    }

    public final int b(int gameId) {
        return R$drawable.lib_game_avatar_default;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    @NotNull
    public final String f(@NotNull Context context, @NotNull TrackMetadataStat record) {
        boolean z;
        Integer numIsThirdpartySports;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(record, "record");
        RunExtra runExtra = (RunExtra) sc8.a(record.getRunExtra(), RunExtra.class);
        String sportName = record.getSportName();
        boolean z2 = true;
        if (sportName == null) {
            z = false;
        } else {
            if (sportName.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            if (((runExtra == null || (numIsThirdpartySports = runExtra.isThirdpartySports()) == null || numIsThirdpartySports.intValue() != 1) ? false : true) || Intrinsics.areEqual(record.getDeviceCategory(), op5.WATCH_iWATCH)) {
                String sportName2 = record.getSportName();
                Intrinsics.checkNotNullExpressionValue(sportName2, "record.sportName");
                return sportName2;
            }
        }
        int sportMode = record.getSportMode();
        String sportName3 = record.getSportName();
        Integer numE = e(sportMode);
        if (numE != null) {
            sportName3 = context.getString(numE.intValue());
        }
        if (oei.f(sportMode)) {
            sportName3 = context.getString(c(runExtra != null ? runExtra.getGameId() : 0));
        } else if (oei.b(sportMode)) {
            if (sportName3 == null || sportName3.length() == 0) {
                sportName3 = context.getString(R$string.sport_his_record_title_exclusive_custom_sports);
            }
        }
        if (sportName3 != null && sportName3.length() != 0) {
            z2 = false;
        }
        if (z2) {
            sportName3 = "--";
        }
        Intrinsics.checkNotNullExpressionValue(sportName3, "sportName");
        return sportName3;
    }
}
