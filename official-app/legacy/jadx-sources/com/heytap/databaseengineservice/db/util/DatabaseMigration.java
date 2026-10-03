package com.heytap.databaseengineservice.db.util;

import android.database.Cursor;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.databaseengineservice.db.table.DBBreathRate;
import com.heytap.databaseengineservice.db.table.DBDisturbSleep;
import com.heytap.databaseengineservice.db.table.DBDisturbSleepStat;
import com.heytap.databaseengineservice.db.table.DBECGRecord;
import com.heytap.databaseengineservice.db.table.DBHealthOriginData;
import com.heytap.databaseengineservice.db.table.DBHearingHealth;
import com.heytap.databaseengineservice.db.table.DBHearingHealthStat;
import com.heytap.databaseengineservice.db.table.DBHeartRate;
import com.heytap.databaseengineservice.db.table.DBHeartRateDataStat;
import com.heytap.databaseengineservice.db.table.DBHeartRateWarning;
import com.heytap.databaseengineservice.db.table.DBPhysicalFitness;
import com.heytap.databaseengineservice.db.table.DBRecoveryHeartRate;
import com.heytap.databaseengineservice.db.table.DBSedentary;
import com.heytap.databaseengineservice.db.table.DBSleep;
import com.heytap.databaseengineservice.db.table.DBSleepDataStat;
import com.heytap.databaseengineservice.db.table.DBSleepIndex;
import com.heytap.databaseengineservice.db.table.DBSleepRRInterval;
import com.heytap.databaseengineservice.db.table.DBSpo2Warning;
import com.heytap.databaseengineservice.db.table.DBSportDataDetail;
import com.heytap.databaseengineservice.db.table.DBTrackMetadata;
import com.heytap.databaseengineservice.db.table.DBTumbleRecord;
import com.heytap.databaseengineservice.db.table.DBUserBoundDevice;
import com.heytap.databaseengineservice.db.table.DBUserVirtualAccount;
import com.heytap.databaseengineservice.db.table.atrialfibril.DBAtrialFibrilDetail;
import com.heytap.databaseengineservice.db.table.atrialfibril.DBAtrialFibrilWarn;
import com.heytap.databaseengineservice.db.table.bloodoxygensaturation.DBBloodOxygenSaturation;
import com.heytap.databaseengineservice.db.table.bloodoxygensaturation.DBBloodOxygenSaturationDataStat;
import com.heytap.databaseengineservice.db.table.bloodpressure.DBBloodPressure;
import com.heytap.databaseengineservice.db.table.bloodpressure.DBBloodPressureStat;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugar;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugarStat;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugarWarning;
import com.heytap.databaseengineservice.db.table.cervicalspine.DBCervicalSpine;
import com.heytap.databaseengineservice.db.table.cervicalspine.DBCervicalSpineAction;
import com.heytap.databaseengineservice.db.table.datacollection.DBDataCollection;
import com.heytap.databaseengineservice.db.table.exerciseload.DBExerciseIntensity;
import com.heytap.databaseengineservice.db.table.exerciseload.DBExerciseLoad;
import com.heytap.databaseengineservice.db.table.fitness.DBFitCourse;
import com.heytap.databaseengineservice.db.table.fitness.DBFitPlan;
import com.heytap.databaseengineservice.db.table.fitness.DBThirdPartFitCourse;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveFile;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthDiseaseRisk;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorDetail;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorFocus;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorStat;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.databaseengineservice.db.table.menstrualcycle.DBMenstrualCycle;
import com.heytap.databaseengineservice.db.table.menstrualcycle.DBMenstrualCycleSymptom;
import com.heytap.databaseengineservice.db.table.menstrualcycle.DBOvulation;
import com.heytap.databaseengineservice.db.table.newsleep.DBBreathRateStat;
import com.heytap.databaseengineservice.db.table.newsleep.DBHeartRateWarningBehavior;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepAdvice;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalStat;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalStatus;
import com.heytap.databaseengineservice.db.table.physique.DBPhysiqueMeasureAll;
import com.heytap.databaseengineservice.db.table.physique.DBPhysiqueMeasureDetail;
import com.heytap.databaseengineservice.db.table.relax.DBRelax;
import com.heytap.databaseengineservice.db.table.relax.DBRelaxStat;
import com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepDayFrgData;
import com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepDayStat;
import com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepMainData;
import com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepPiece;
import com.heytap.databaseengineservice.db.table.snore.DBHrvData;
import com.heytap.databaseengineservice.db.table.snore.DBOsaResult;
import com.heytap.databaseengineservice.db.table.snore.DBSensorOsa;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreDbBuff;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreDbFileInfo;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreEnvNoise;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreFeature;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreOsaModel;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreOsaSummarize;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreResult;
import com.heytap.databaseengineservice.db.table.snore.DBTypicalFragment;
import com.heytap.databaseengineservice.db.table.space.DBSpaceInfo;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.heytap.databaseengineservice.db.table.stress.DBStress;
import com.heytap.databaseengineservice.db.table.stress.DBStressDataStat;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineDetail;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;
import com.heytap.databaseengineservice.db.table.sunshine.DBVitamin;
import com.heytap.databaseengineservice.db.table.thirdsportimport.DBThirdSportImportRecord;
import com.heytap.databaseengineservice.db.table.weight.DBFamilyMemberInfo;
import com.heytap.databaseengineservice.db.table.weight.DBWeightBodyFat;
import com.heytap.databaseengineservice.db.table.weight.DBWeightGoal;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperature;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\by\n\u0002\u0010\u0011\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0004R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0004R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0004R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0004R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0004R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0004R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0004R\u0014\u00109\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0004R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0004R\u0014\u0010=\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0004R\u0014\u0010?\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0004R\u0014\u0010A\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0004R\u0014\u0010C\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0004R\u0014\u0010E\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0004R\u0014\u0010G\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0004R\u0014\u0010I\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0004R\u0014\u0010K\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0004R\u0014\u0010M\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0004R\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0004R\u0014\u0010Q\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0004R\u0014\u0010S\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0004R\u0014\u0010U\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0004R\u0014\u0010W\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0004R\u0014\u0010Y\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0004R\u0014\u0010[\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0004R\u0014\u0010]\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0004R\u0014\u0010_\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0004R\u0014\u0010a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0004R\u0014\u0010c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0004R\u0014\u0010e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0004R\u0014\u0010g\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0004R\u0014\u0010i\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0004R\u0014\u0010k\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0004R\u0014\u0010m\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0004R\u0014\u0010o\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0004R\u0014\u0010q\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0004R\u0014\u0010s\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010\u0004R\u0014\u0010u\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0004R\u0014\u0010w\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0004R\u0014\u0010y\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0004R\u0014\u0010{\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0004R\u001e\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020|8\u0006¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b\u0003\u0010\u007f¨\u0006\u0083\u0001"}, d2 = {"Lcom/heytap/databaseengineservice/db/util/DatabaseMigration;", "", "Landroidx/room/migration/Migration;", "a", "Landroidx/room/migration/Migration;", "MIGRATION_1_2", "b", "MIGRATION_2_3", "c", "MIGRATION_3_4", "d", "MIGRATION_4_5", MapSchema.FIELD_NAME_ENTRY, "MIGRATION_5_6", "f", "MIGRATION_6_7", b2n.f, "MIGRATION_7_8", b2n.g, "MIGRATION_8_9", "i", "MIGRATION_9_10", "j", "MIGRATION_10_11", MapSchema.FIELD_NAME_KEY, "MIGRATION_11_12", LogFieldKey.LEVEL_KEY, "MIGRATION_12_13", LogFieldKey.MESSAGE_KEY, "MIGRATION_13_14", "n", "MIGRATION_14_15", "o", "MIGRATION_15_16", LogFieldKey.PROCESS_NAME_KEY, "MIGRATION_16_17", "q", "MIGRATION_17_18", "r", "MIGRATION_18_19", "s", "MIGRATION_19_20", "t", "MIGRATION_20_21", "u", "MIGRATION_21_22", "v", "MIGRATION_22_23", "w", "MIGRATION_23_24", "x", "MIGRATION_24_25", "y", "MIGRATION_25_26", "z", "MIGRATION_26_27", "A", "MIGRATION_27_28", c8l.KEY_B, "MIGRATION_28_29", "C", "MIGRATION_29_30", "D", "MIGRATION_30_31", ExifInterface.LONGITUDE_EAST, "MIGRATION_31_32", UserInfo.SEX_FEMALE, "MIGRATION_32_33", "G", "MIGRATION_33_34", "H", "MIGRATION_34_35", "I", "MIGRATION_35_36", "J", "MIGRATION_36_37", "K", "MIGRATION_37_38", "L", "MIGRATION_38_39", "M", "MIGRATION_39_40", "N", "MIGRATION_40_41", "O", "MIGRATION_41_42", SecureGcmConstants.MESSAGE_KEY, "MIGRATION_42_43", "Q", "MIGRATION_43_44", "R", "MIGRATION_44_45", "S", "MIGRATION_45_46", ExifInterface.GPS_DIRECTION_TRUE, "MIGRATION_46_47", "U", "MIGRATION_47_48", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "MIGRATION_48_49", ExifInterface.LONGITUDE_WEST, "MIGRATION_49_50", "X", "MIGRATION_50_51", "Y", "MIGRATION_51_52", "Z", "MIGRATION_52_53", "a0", "MIGRATION_53_60", "b0", "MIGRATION_60_61", "c0", "MIGRATION_54_61", "d0", "MIGRATION_61_62", "e0", "MIGRATION_62_63", "f0", "MIGRATION_63_64", "g0", "MIGRATION_64_65", "h0", "MIGRATION_65_66", "", "i0", "[Landroidx/room/migration/Migration;", "()[Landroidx/room/migration/Migration;", "migrations", "<init>", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class DatabaseMigration {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_27_28;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_28_29;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_29_30;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_30_31;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_31_32;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_32_33;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_33_34;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_34_35;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_35_36;

    @NotNull
    public static final DatabaseMigration INSTANCE = new DatabaseMigration();

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_36_37;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_37_38;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_38_39;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_39_40;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_40_41;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_41_42;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_42_43;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_43_44;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_44_45;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_45_46;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_46_47;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_47_48;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_48_49;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_49_50;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_50_51;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_51_52;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_52_53;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_1_2;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_53_60;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_2_3;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_60_61;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_3_4;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_54_61;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_4_5;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_61_62;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_5_6;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_62_63;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_6_7;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_63_64;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_7_8;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_64_65;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_8_9;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_65_66;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_9_10;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @NotNull
    public static final Migration[] migrations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_10_11;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_11_12;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_12_13;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_13_14;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_14_15;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_15_16;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_16_17;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_17_18;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_18_19;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_19_20;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_20_21;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_21_22;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_22_23;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_23_24;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_24_25;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_25_26;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public static final Migration MIGRATION_26_27;

    static {
        Migration migration = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_1_2$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                String strCreateHeartRateTableSQL = DBHeartRate.createHeartRateTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateHeartRateTableSQL, "createHeartRateTableSQL()");
                db.execSQL(strCreateHeartRateTableSQL);
                String strCreateHeartRateDataStatTableSQL = DBHeartRateDataStat.createHeartRateDataStatTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateHeartRateDataStatTableSQL, "createHeartRateDataStatTableSQL()");
                db.execSQL(strCreateHeartRateDataStatTableSQL);
                String strCreateSleepTableSQL = DBSleep.createSleepTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateSleepTableSQL, "createSleepTableSQL()");
                db.execSQL(strCreateSleepTableSQL);
                String strCreateSleepDataStatTableSQL = DBSleepDataStat.createSleepDataStatTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateSleepDataStatTableSQL, "createSleepDataStatTableSQL()");
                db.execSQL(strCreateSleepDataStatTableSQL);
                String strCreateFitPlanTableSQL = DBFitPlan.createFitPlanTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateFitPlanTableSQL, "createFitPlanTableSQL()");
                db.execSQL(strCreateFitPlanTableSQL);
                String strCreateFitCourseTableSQL = DBFitCourse.createFitCourseTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateFitCourseTableSQL, "createFitCourseTableSQL()");
                db.execSQL(strCreateFitCourseTableSQL);
                String strCreateECGRecordTableSQL = DBECGRecord.createECGRecordTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateECGRecordTableSQL, "createECGRecordTableSQL()");
                db.execSQL(strCreateECGRecordTableSQL);
                String strCreatePhysicalFitnessTableSQL = DBPhysicalFitness.createPhysicalFitnessTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreatePhysicalFitnessTableSQL, "createPhysicalFitnessTableSQL()");
                db.execSQL(strCreatePhysicalFitnessTableSQL);
                String strCreateUserBoundDeviceTableSQL = DBUserBoundDevice.createUserBoundDeviceTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateUserBoundDeviceTableSQL, "createUserBoundDeviceTableSQL()");
                db.execSQL(strCreateUserBoundDeviceTableSQL);
                db.execSQL("alter table DBSportDataDetail add column workout INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataDetail add column device_category TEXT default 'Phone'");
                db.execSQL("alter table DBSportDataStat add column total_workout_minutes INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column total_move_about_times INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column current_day_calories_goal INTEGER NOT NULL default 300000");
                db.execSQL("alter table DBSportDataStat add column calories_goal_complete INTEGER NOT NULL default 0");
                db.execSQL("alter table DBOneTimeSport add column device_category TEXT default 'Phone'");
                db.execSQL("alter table DBTrackTemp add column device_category TEXT default 'Phone'");
                db.execSQL("alter table DBDeviceInfo add column micro_mac TEXT");
                db.execSQL("alter table DBDeviceInfo add column ble_secret_metadata TEXT");
                db.execSQL("alter table DBDeviceInfo add column sku TEXT");
            }
        };
        MIGRATION_1_2 = migration;
        Migration migration2 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_2_3$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBPhysicalFitness add column user_workout_id INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalFitness add column heytap_level REAL NOT NULL default 0");
                db.execSQL("alter table DBDeviceInfo add column sku_code TEXT");
                db.execSQL("alter table DBDeviceInfo add column picture_id_image TEXT");
            }
        };
        MIGRATION_2_3 = migration2;
        Migration migration3 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_3_4$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSportDataStat add column update_timestamp INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_3_4 = migration3;
        Migration migration4 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_4_5$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                String strCreateBloodOxygenSaturationTableSQL = DBBloodOxygenSaturation.createBloodOxygenSaturationTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateBloodOxygenSaturationTableSQL, "createBloodOxygenSaturationTableSQL()");
                db.execSQL(strCreateBloodOxygenSaturationTableSQL);
                String strCreateBloodOxygenSaturationDataStatTableSQL = DBBloodOxygenSaturationDataStat.createBloodOxygenSaturationDataStatTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateBloodOxygenSaturationDataStatTableSQL, "createBloodOxygenSaturationDataStatTableSQL()");
                db.execSQL(strCreateBloodOxygenSaturationDataStatTableSQL);
                String strCreateHealthOriginDataTableSQL = DBHealthOriginData.createHealthOriginDataTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateHealthOriginDataTableSQL, "createHealthOriginDataTableSQL()");
                db.execSQL(strCreateHealthOriginDataTableSQL);
            }
        };
        MIGRATION_4_5 = migration4;
        Migration migration5 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_5_6$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBDeviceInfo add column node_id TEXT");
                db.execSQL("alter table DBDeviceInfo add column project_id TEXT");
                db.execSQL("alter table DBDeviceInfo add column board_id TEXT");
                db.execSQL("alter table DBUserBoundDevice add column node_id TEXT");
                db.execSQL("alter table DBUserBoundDevice add column project_id TEXT");
                db.execSQL("alter table DBUserBoundDevice add column board_id TEXT");
                String strCreateStressTableSQL = DBStress.createStressTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateStressTableSQL, "createStressTableSQL()");
                db.execSQL(strCreateStressTableSQL);
                String strCreateStressDataStatTableSQL = DBStressDataStat.createStressDataStatTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateStressDataStatTableSQL, "createStressDataStatTableSQL()");
                db.execSQL(strCreateStressDataStatTableSQL);
            }
        };
        MIGRATION_5_6 = migration5;
        Migration migration6 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_6_7$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                String strCreateSpaceInfoTableSQL = DBSpaceInfo.createSpaceInfoTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateSpaceInfoTableSQL, "createSpaceInfoTableSQL()");
                db.execSQL(strCreateSpaceInfoTableSQL);
            }
        };
        MIGRATION_6_7 = migration6;
        Migration migration7 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_7_8$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBECGRecord add column algorithmsAnalyzeResult TEXT");
                db.execSQL("alter table DBECGRecord add column expertState INTEGER NOT NULL default 0");
                db.execSQL("alter table DBECGRecord add column reportId TEXT");
                db.execSQL("alter table DBECGRecord add column serviceApplyId TEXT");
                db.execSQL("alter table DBECGRecord add column personState TEXT");
            }
        };
        MIGRATION_7_8 = migration7;
        Migration migration8 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_8_9$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBUserInfo add column guide_status INTEGER NOT NULL default 0");
                String strCreateHeartRateWarningTableSQL = DBHeartRateWarning.createHeartRateWarningTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateHeartRateWarningTableSQL, "createHeartRateWarningTableSQL()");
                db.execSQL(strCreateHeartRateWarningTableSQL);
                String strCreateFamilyMemberInfoTableSQL = DBFamilyMemberInfo.createFamilyMemberInfoTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateFamilyMemberInfoTableSQL, "createFamilyMemberInfoTableSQL()");
                db.execSQL(strCreateFamilyMemberInfoTableSQL);
                String strCreateWeightBodyFatTableSQL = DBWeightBodyFat.createWeightBodyFatTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateWeightBodyFatTableSQL, "createWeightBodyFatTableSQL()");
                db.execSQL(strCreateWeightBodyFatTableSQL);
            }
        };
        MIGRATION_8_9 = migration8;
        Migration migration9 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_9_10$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                DBSportDataDetail.changePrimaryKey(db);
                DBSleep.changePrimaryKey(db);
                DBHeartRate.changePrimaryKey(db);
                DBStress.changePrimaryKey(db);
                DBBloodOxygenSaturation.changePrimaryKey(db);
            }
        };
        MIGRATION_9_10 = migration9;
        Migration migration10 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_10_11$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                String strCreateThirdPartFitCourseTableSQL = DBThirdPartFitCourse.createThirdPartFitCourseTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateThirdPartFitCourseTableSQL, "createThirdPartFitCourseTableSQL()");
                db.execSQL(strCreateThirdPartFitCourseTableSQL);
            }
        };
        MIGRATION_10_11 = migration10;
        Migration migration11 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_11_12$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBECGRecord add column ppg_data TEXT");
                db.execSQL("alter table DBECGRecord add column aac_data TEXT");
                db.execSQL("alter table DBECGRecord add column ecg_start_timestamp INTEGER not null default 0");
                db.execSQL("alter table DBECGRecord add column aac_start_timestamp INTEGER not null default 0");
            }
        };
        MIGRATION_11_12 = migration11;
        Migration migration12 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_12_13$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBDeviceInfo add column market_name TEXT");
                db.execSQL("alter table DBDeviceInfo add column sku_market_name TEXT");
                db.execSQL("alter table DBUserBoundDevice add column market_name TEXT");
                db.execSQL("alter table DBUserBoundDevice add column sku_market_name TEXT");
            }
        };
        MIGRATION_12_13 = migration12;
        Migration migration13 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_13_14$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBDeviceInfo add column ota_version TEXT");
                db.execSQL("alter table DBDeviceInfo add column app_terminal_id TEXT");
                db.execSQL("alter table DBUserBoundDevice add column ota_version TEXT");
                db.execSQL("alter table DBUserBoundDevice add column app_terminal_id TEXT");
            }
        };
        MIGRATION_13_14 = migration13;
        Migration migration14 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_14_15$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSleepTable add column data_version INTEGER not null Default 0");
            }
        };
        MIGRATION_14_15 = migration14;
        Migration migration15 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_15_16$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                String strCreateBloodPressureTable = DBBloodPressure.createBloodPressureTable();
                Intrinsics.checkNotNullExpressionValue(strCreateBloodPressureTable, "createBloodPressureTable()");
                db.execSQL(strCreateBloodPressureTable);
                String strCreateBloodPressureStatTable = DBBloodPressureStat.createBloodPressureStatTable();
                Intrinsics.checkNotNullExpressionValue(strCreateBloodPressureStatTable, "createBloodPressureStatTable()");
                db.execSQL(strCreateBloodPressureStatTable);
            }
        };
        MIGRATION_15_16 = migration15;
        Migration migration16 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_16_17$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                String strCreateTableSQL = DBHearingHealth.createTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateTableSQL, "createTableSQL()");
                db.execSQL(strCreateTableSQL);
                String strCreateTableSQL2 = DBHearingHealthStat.createTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateTableSQL2, "createTableSQL()");
                db.execSQL(strCreateTableSQL2);
            }
        };
        MIGRATION_16_17 = migration16;
        Migration migration17 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_17_18$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSportDataStat add column sedentary_counts INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column total_static_cal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column day_goal_complete INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column mjk_total_calories_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column mjk_intake_calories_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column static_cal_source INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column extension TEXT");
            }
        };
        MIGRATION_17_18 = migration17;
        Migration migration18 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_18_19$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBECGRecord add column device_version INTEGER not null Default 0");
                db.execSQL("alter table DBDeviceInfo add column vaid TEXT");
                db.execSQL("alter table DBUserBoundDevice add column vaid TEXT");
                db.execSQL("alter table DBSportDataStat add column sedentary_total_duration INTEGER NOT NULL default 0");
                String strCreatePhysiqueMeasureDetailTableSQL = DBPhysiqueMeasureDetail.createPhysiqueMeasureDetailTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreatePhysiqueMeasureDetailTableSQL, "createPhysiqueMeasureDetailTableSQL()");
                db.execSQL(strCreatePhysiqueMeasureDetailTableSQL);
                String strCreatePhysiqueMeasureAllTableSQL = DBPhysiqueMeasureAll.createPhysiqueMeasureAllTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreatePhysiqueMeasureAllTableSQL, "createPhysiqueMeasureAllTableSQL()");
                db.execSQL(strCreatePhysiqueMeasureAllTableSQL);
                String strCreateRelaxTableSQL = DBRelax.createRelaxTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateRelaxTableSQL, "createRelaxTableSQL()");
                db.execSQL(strCreateRelaxTableSQL);
                String strCreateRelaxStatTableSQL = DBRelaxStat.createRelaxStatTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateRelaxStatTableSQL, "createRelaxStatTableSQL()");
                db.execSQL(strCreateRelaxStatTableSQL);
                String strCreateHrvTableSQL = DBHrvData.createHrvTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateHrvTableSQL, "createHrvTableSQL()");
                db.execSQL(strCreateHrvTableSQL);
                String strCreateOsaResultTableSQL = DBOsaResult.createOsaResultTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateOsaResultTableSQL, "createOsaResultTableSQL()");
                db.execSQL(strCreateOsaResultTableSQL);
                String strCreateSnoreDbBuffTableSQL = DBSnoreDbBuff.createSnoreDbBuffTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateSnoreDbBuffTableSQL, "createSnoreDbBuffTableSQL()");
                db.execSQL(strCreateSnoreDbBuffTableSQL);
                String strCreateSnoreResultTableSQL = DBSnoreResult.createSnoreResultTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateSnoreResultTableSQL, "createSnoreResultTableSQL()");
                db.execSQL(strCreateSnoreResultTableSQL);
                String strCreateTypicalFragmentTableSQL = DBTypicalFragment.createTypicalFragmentTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateTypicalFragmentTableSQL, "createTypicalFragmentTableSQL()");
                db.execSQL(strCreateTypicalFragmentTableSQL);
                String strCreateSnoreDbFileInfoTableSQL = DBSnoreDbFileInfo.createSnoreDbFileInfoTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateSnoreDbFileInfoTableSQL, "createSnoreDbFileInfoTableSQL()");
                db.execSQL(strCreateSnoreDbFileInfoTableSQL);
                String strCreateAtrialFibrilTableSQL = DBAtrialFibrilDetail.createAtrialFibrilTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateAtrialFibrilTableSQL, "createAtrialFibrilTableSQL()");
                db.execSQL(strCreateAtrialFibrilTableSQL);
                String strCreateAtrialFibrilWarnTableSQL = DBAtrialFibrilWarn.createAtrialFibrilWarnTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateAtrialFibrilWarnTableSQL, "createAtrialFibrilWarnTableSQL()");
                db.execSQL(strCreateAtrialFibrilWarnTableSQL);
                String strCreateTumbleRecordTableSQL = DBTumbleRecord.createTumbleRecordTableSQL();
                Intrinsics.checkNotNullExpressionValue(strCreateTumbleRecordTableSQL, "createTumbleRecordTableSQL()");
                db.execSQL(strCreateTumbleRecordTableSQL);
                String strCreateTable = DBUserVirtualAccount.createTable();
                Intrinsics.checkNotNullExpressionValue(strCreateTable, "createTable()");
                db.execSQL(strCreateTable);
            }
        };
        MIGRATION_18_19 = migration18;
        Migration migration19 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_19_20$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSnoreDbFileInfo add column sync_status INTEGER not null Default 0");
                db.execSQL("alter table DBSnoreDbFileInfo add column display INTEGER not null Default 0");
            }
        };
        MIGRATION_19_20 = migration19;
        Migration migration20 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_20_21$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                String strCreateTable = DBTrackMetadata.createTable();
                Intrinsics.checkNotNullExpressionValue(strCreateTable, "createTable()");
                db.execSQL(strCreateTable);
            }
        };
        MIGRATION_20_21 = migration20;
        Migration migration21 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_21_22$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSleepTable add column alg_origin_state INTEGER NOT NULL default 0");
                db.execSQL("alter table DBTrackMetadata add column run_extra TEXT");
                db.execSQL("alter table DBTrackMetadata add column extension TEXT");
            }
        };
        MIGRATION_21_22 = migration21;
        Migration migration22 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_22_23$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBUserPreference add column module TEXT");
                String strCreateRecoveryHeartRateTable = DBRecoveryHeartRate.createRecoveryHeartRateTable();
                Intrinsics.checkNotNullExpressionValue(strCreateRecoveryHeartRateTable, "createRecoveryHeartRateTable()");
                db.execSQL(strCreateRecoveryHeartRateTable);
                String strCreateDisturbSleepTable = DBDisturbSleep.createDisturbSleepTable();
                Intrinsics.checkNotNullExpressionValue(strCreateDisturbSleepTable, "createDisturbSleepTable()");
                db.execSQL(strCreateDisturbSleepTable);
            }
        };
        MIGRATION_22_23 = migration22;
        Migration migration23 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_23_24$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBDisturbSleep add column app_name TEXT");
            }
        };
        MIGRATION_23_24 = migration23;
        Migration migration24 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_24_25$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBHeartRate add column device_type INTEGER");
                db.execSQL("alter table DBOsaResult add column record_time_interval TEXT");
                db.execSQL("alter table DBSleepDataStatTable add column sleep_score INTEGER");
                db.execSQL("alter table DBSleepDataStatTable add column checked_sleep_score INTEGER");
            }
        };
        MIGRATION_24_25 = migration24;
        Migration migration25 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_25_26$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBECGRecord add column ecg_result_id TEXT");
                db.execSQL("alter table DBECGRecord add column ecg_app_version TEXT");
                db.execSQL("alter table DBECGRecord add column app_version TEXT");
                db.execSQL("alter table DBECGRecord add column user_info TEXT");
                db.execSQL("alter table DBECGRecord add column symptoms TEXT");
                db.execSQL("alter table DBECGRecord add column ecg_result_name TEXT");
                db.execSQL("alter table DBOsaResult add column osa_feature TEXT");
                db.execSQL("alter table DBTypicalFragment add column snore_num INTEGER NOT NULL default 0");
                db.execSQL("alter table DBTypicalFragment add column snore_max_db REAL");
                db.execSQL("alter table DBTypicalFragment add column snore_min_db REAL");
                String strCreateSensorOsaTable = DBSensorOsa.createSensorOsaTable();
                Intrinsics.checkNotNullExpressionValue(strCreateSensorOsaTable, "createSensorOsaTable()");
                db.execSQL(strCreateSensorOsaTable);
                String strCreateSnoreEnvNoiseTable = DBSnoreEnvNoise.createSnoreEnvNoiseTable();
                Intrinsics.checkNotNullExpressionValue(strCreateSnoreEnvNoiseTable, "createSnoreEnvNoiseTable()");
                db.execSQL(strCreateSnoreEnvNoiseTable);
                String strCreateSnoreFeatureTable = DBSnoreFeature.createSnoreFeatureTable();
                Intrinsics.checkNotNullExpressionValue(strCreateSnoreFeatureTable, "createSnoreFeatureTable()");
                db.execSQL(strCreateSnoreFeatureTable);
                String strCreateBreathRateTable = DBBreathRate.createBreathRateTable();
                Intrinsics.checkNotNullExpressionValue(strCreateBreathRateTable, "createBreathRateTable()");
                db.execSQL(strCreateBreathRateTable);
                String strCreateSleepIndexTable = DBSleepIndex.createSleepIndexTable();
                Intrinsics.checkNotNullExpressionValue(strCreateSleepIndexTable, "createSleepIndexTable()");
                db.execSQL(strCreateSleepIndexTable);
                String strCreateSpo2WarningTable = DBSpo2Warning.createSpo2WarningTable();
                Intrinsics.checkNotNullExpressionValue(strCreateSpo2WarningTable, "createSpo2WarningTable()");
                db.execSQL(strCreateSpo2WarningTable);
                db.execSQL("alter table DBUserBoundDevice add column guid TEXT");
                db.execSQL("alter table DBDeviceInfo add column guid TEXT");
                db.execSQL("alter table DBStressTable add column sdnn INTEGER");
                db.execSQL("alter table DBStressTable add column rmssd INTEGER");
                db.execSQL("alter table DBOsaResult add column snore_ratio INTEGER NOT NULL default 0");
                String strCreateDisturbSleepStatTable = DBDisturbSleepStat.createDisturbSleepStatTable();
                Intrinsics.checkNotNullExpressionValue(strCreateDisturbSleepStatTable, "createDisturbSleepStatTable()");
                db.execSQL(strCreateDisturbSleepStatTable);
                DBSleepDataStat.changePrimaryKey(db);
                db.execSQL("alter table DBECGRecord add column ecg_id TEXT");
                db.execSQL(DBAssessmentRecord.CREATOR.b());
            }
        };
        MIGRATION_25_26 = migration25;
        Migration migration26 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_26_27$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBHeartRateDataStatTable add column walk_avg_hr INTEGER NOT NULL default 0");
                db.execSQL("alter table DBHeartRateDataStatTable add column sleep_base_hr INTEGER NOT NULL default 0");
                db.execSQL(DBSleepDayStat.Companion.a());
                db.execSQL(DBSleepMainData.Companion.a());
                db.execSQL(DBSleepDayFrgData.Companion.a());
                db.execSQL(DBSleepPiece.Companion.a());
            }
        };
        MIGRATION_26_27 = migration26;
        Migration migration27 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_27_28$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSleepTable add column device_type INTEGER");
                db.execSQL("alter table DBSleepDayFrgStat add column device_type INTEGER");
            }
        };
        MIGRATION_27_28 = migration27;
        Migration migration28 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_28_29$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBCervicalSpine.Companion.a());
                db.execSQL(DBCervicalSpineAction.Companion.a());
            }
        };
        MIGRATION_28_29 = migration28;
        Migration migration29 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_29_30$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBBloodPressureStat add column avg_systolic INTEGER NOT NULL default 0");
                db.execSQL("alter table DBBloodPressureStat add column avg_diastolic INTEGER NOT NULL default 0");
                db.execSQL("alter table DBBloodPressureStat add column high_normal_times INTEGER NOT NULL default 0");
                db.execSQL("alter table DBBloodPressureStat add column mild_hypertension_times INTEGER NOT NULL default 0");
                db.execSQL("alter table DBBloodPressureStat add column moderate_hypertension_times INTEGER NOT NULL default 0");
                db.execSQL("alter table DBBloodPressureStat add column severe_hypertension_times INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column current_day_workout_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column workout_goal_complete INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column current_day_move_about_times_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column move_about_times_goal_complete INTEGER NOT NULL default 0");
                db.execSQL(DBBloodSugar.Companion.a());
                db.execSQL(DBBloodSugarStat.Companion.a());
                db.execSQL(DBBloodSugarWarning.Companion.a());
                db.execSQL(DBMenstrualCycle.Companion.a());
                db.execSQL(DBMenstrualCycleSymptom.Companion.a());
                db.execSQL(DBWristTemperature.Companion.a());
                db.execSQL(DBWristTemperatureStat.Companion.a());
            }
        };
        MIGRATION_29_30 = migration29;
        Migration migration30 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_30_31$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBAtrialFibrilWarn add column warn_flag INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_30_31 = migration30;
        Migration migration31 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_31_32$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBUserInfo add column age INTEGER NOT NULL default 0");
                db.execSQL(DBSportMetadata.Companion.a());
            }
        };
        MIGRATION_31_32 = migration31;
        Migration migration32 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_32_33$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBSportMetadata.Companion.a());
            }
        };
        MIGRATION_32_33 = migration32;
        Migration migration33 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_33_34$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBAssessmentRecord add column user_body_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column wrist_temperature_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column single_sleep_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column single_osa_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column sleep_cross_analysis TEXT");
                db.execSQL("alter table DBAssessmentRecord add column temp_cross_analysis TEXT");
                db.execSQL("alter table DBAssessmentRecord add column snore_analysis TEXT");
                db.execSQL("alter table DBAssessmentRecord add column score_analysis TEXT");
                db.execSQL("alter table DBECGRecord add column max_heart_rate INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_33_34 = migration33;
        Migration migration34 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_34_35$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBDataCollection.Companion.a());
            }
        };
        MIGRATION_34_35 = migration34;
        Migration migration35 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_35_36$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBOsaResult add column ahi REAL");
                db.execSQL("alter table DBOsaResult add column from_type INTEGER NOT NULL default 0");
                db.execSQL(DBSnoreOsaModel.Companion.a());
                db.execSQL(DBSnoreOsaSummarize.Companion.a());
                db.execSQL(DBDataCollection.Companion.a());
            }
        };
        MIGRATION_35_36 = migration35;
        Migration migration36 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_36_37$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSnoreOsaSummarize add column silenced_ratio INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSnoreOsaSummarize add column silenced_time INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSnoreOsaSummarize add column audio_states INTEGER NOT NULL default 0");
                db.execSQL("alter table DBOsaResult add column silenced_ratio INTEGER NOT NULL default 0");
                db.execSQL("alter table DBOsaResult add column silenced_time INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSleepIndex add column has_heart_rate_warning INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSleepIndex add column heart_rate_warning_label TEXT");
                db.execSQL("alter table DBSleepIndex add column sleep_bed_time_data TEXT");
                db.execSQL("alter table DBSportDataDetail add column sedentary_state INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_36_37 = migration36;
        Migration migration37 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_37_38$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBSedentary.Companion.a());
            }
        };
        MIGRATION_37_38 = migration37;
        Migration migration38 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_38_39$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBOneTimeSport add column app_source INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_38_39 = migration38;
        Migration migration39 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_39_40$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBSleepRRInterval.Companion.a());
            }
        };
        MIGRATION_39_40 = migration39;
        Migration migration40 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_40_41$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBHeartRate add column reliability INTEGER");
            }
        };
        MIGRATION_40_41 = migration40;
        Migration migration41 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_41_42$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                Cursor cursorQuery = db.query("select * from sqlite_master where type = 'table' and name = 'DBBloodPressure' and sql like '%collect_exception_type%'");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        db.execSQL("alter table DBBloodPressure add column collect_exception_type INTEGER NOT NULL default 0");
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursorQuery, th);
                        throw th2;
                    }
                }
            }
        };
        MIGRATION_41_42 = migration41;
        Migration migration42 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_42_43$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBSportDataDetail add column amount_of_exercise INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSportDataStat add column total_amount_of_exercise INTEGER NOT NULL default 0");
                db.execSQL("alter table DBSleepIndex add column basal_hrv INTEGER");
                db.execSQL("alter table DBSleepIndex add column hrv_reasonable_range_low INTEGER");
                db.execSQL("alter table DBSleepIndex add column hrv_reasonable_range_high INTEGER");
                db.execSQL("alter table DBSleepIndex add column min_hrv INTEGER");
                db.execSQL("alter table DBSleepIndex add column max_hrv INTEGER");
                db.execSQL("alter table DBSleepIndex add column basal_breathe INTEGER");
                db.execSQL("alter table DBSleepIndex add column breathe_reasonable_range_low INTEGER");
                db.execSQL("alter table DBSleepIndex add column breathe_reasonable_range_high INTEGER");
                db.execSQL("alter table DBSleepIndex add column heart_rate_reasonable_range_low INTEGER");
                db.execSQL("alter table DBSleepIndex add column heart_rate_reasonable_range_high INTEGER");
                db.execSQL("alter table DBSleepIndex add column sleep_recovery_rate INTEGER");
                db.execSQL("alter table DBSleepIndex add column sleep_recovery_diff_value INTEGER");
                db.execSQL(DBSleepAdvice.Companion.a());
                db.execSQL(DBSleepHeartRateStat.Companion.a());
                db.execSQL(DBBreathRateStat.Companion.a());
                db.execSQL(DBHeartRateWarningBehavior.Companion.a());
                db.execSQL(DBPhysicalMentalStatus.Companion.a());
                db.execSQL(DBPhysicalMentalStat.Companion.a());
                db.execSQL("alter table DBUserInfo add column bloodPressureType INTEGER NOT NULL default 0");
                db.execSQL("alter table DBAssessmentRecord add column cardio_history_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column vascular_age_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column blood_pressure_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column body_recovery_info TEXT");
                db.execSQL("alter table DBAssessmentRecord add column hrv_info TEXT");
                db.execSQL(DBPhysicalMentalAchievement.Companion.a());
            }
        };
        MIGRATION_42_43 = migration42;
        Migration migration43 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_43_44$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBUserBoundDevice add column eid TEXT");
            }
        };
        MIGRATION_43_44 = migration43;
        Migration migration44 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_44_45$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBECGRecord add column source INTEGER");
            }
        };
        MIGRATION_44_45 = migration44;
        Migration migration45 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_45_46$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBHealthArchiveFile.Companion.a());
                db.execSQL(DBHealthArchiveRecord.Companion.a());
                DBHealthIndicatorDetail.a aVar = DBHealthIndicatorDetail.Companion;
                db.execSQL(aVar.c());
                db.execSQL(aVar.b());
                db.execSQL(aVar.a());
                db.execSQL(DBHealthIndicatorStat.Companion.b());
                db.execSQL(DBHealthIndicatorFocus.Companion.a());
                db.execSQL(DBHealthDiseaseRisk.Companion.a());
            }
        };
        MIGRATION_45_46 = migration45;
        Migration migration46 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_46_47$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBPhysicalMentalStat add column min_stress_timestamp INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalStat add column max_stress_timestamp INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_46_47 = migration46;
        Migration migration47 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_47_48$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBRelax add column physical_mental INTEGER");
                db.execSQL("alter table DBRelax add column physical_mental_state INTEGER");
            }
        };
        MIGRATION_47_48 = migration47;
        Migration migration48 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_48_49$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                DBHealthIndicatorStat.Companion.a(db);
            }
        };
        MIGRATION_48_49 = migration48;
        Migration migration49 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_49_50$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBOneTimeSport add column included_rhr INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_49_50 = migration49;
        Migration migration50 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_50_51$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBHealthIndicatorDetail add column explain TEXT");
                db.execSQL("alter table DBHealthIndicatorStat add column explain TEXT");
                db.execSQL("alter table DBHealthIndicatorStat add column data_update_time INTEGER NOT NULL default 0");
            }
        };
        MIGRATION_50_51 = migration50;
        Migration migration51 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_51_52$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBHealthArchiveRecord add column archive_type INTEGER NOT NULL default -1");
            }
        };
        MIGRATION_51_52 = migration51;
        Migration migration52 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_52_53$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBHealthIndicatorStat add column trend_tag TEXT NOT NULL default ''");
            }
        };
        MIGRATION_52_53 = migration52;
        Migration migration53 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_53_60$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBExerciseLoad.Companion.a());
                db.execSQL(DBExerciseIntensity.Companion.a());
                DBOsaResult.changePrimaryKey(db);
            }
        };
        MIGRATION_53_60 = migration53;
        Migration migration54 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_60_61$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBHealthArchiveRecord add column original_title TEXT");
                db.execSQL("alter table DBHealthArchiveRecord add column simplify_title TEXT");
                db.execSQL(DBHealthReviewPlan.Companion.a());
            }
        };
        MIGRATION_60_61 = migration54;
        Migration migration55 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_54_61$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBExerciseLoad.Companion.a());
                db.execSQL(DBExerciseIntensity.Companion.a());
                DBOsaResult.changePrimaryKey(db);
            }
        };
        MIGRATION_54_61 = migration55;
        Migration migration56 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_61_62$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBExerciseIntensity add column sport_mode INTEGER");
                db.execSQL("alter table DBExerciseIntensity add column raw_exercise_intensity INTEGER");
                db.execSQL("alter table DBExerciseIntensity add column algo_exercise_load INTEGER");
                db.execSQL("alter table DBExerciseIntensity add column algo_result INTEGER");
                db.execSQL("alter table DBExerciseIntensity add column flash_id INTEGER");
                db.execSQL("alter table DBExerciseIntensity add column modify_source INTEGER");
            }
        };
        MIGRATION_61_62 = migration56;
        Migration migration57 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_62_63$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL("alter table DBPhysicalMentalAchievement add column stats_version INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column should_skip_today INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column today_skip_reason INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column sunshine INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column sunshine_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column regular_bed_time INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column regular_bed_time_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column exercise INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column exercise_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column calorie INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column calorie_goal INTEGER NOT NULL default 0");
                db.execSQL("alter table DBPhysicalMentalAchievement add column target_item_display TEXT NOT NULL default ''");
                db.execSQL(DBOvulation.Companion.b());
                db.execSQL(DBSunshineDetail.Companion.a());
                db.execSQL(DBSunshineStat.Companion.a());
            }
        };
        MIGRATION_62_63 = migration57;
        Migration migration58 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_63_64$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBVitamin.Companion.a());
                DBOvulation.Companion.a(db);
            }
        };
        MIGRATION_63_64 = migration58;
        Migration migration59 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_64_65$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                db.execSQL(DBWeightGoal.Companion.a());
                db.execSQL(DBThirdSportImportRecord.Companion.a());
            }
        };
        MIGRATION_64_65 = migration59;
        Migration migration60 = new Migration() { // from class: com.heytap.databaseengineservice.db.util.DatabaseMigration$MIGRATION_65_66$1
            @Override // androidx.room.migration.Migration
            public void migrate(@NotNull SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                DBHealthIndicatorDetail.a aVar = DBHealthIndicatorDetail.Companion;
                db.execSQL(aVar.b());
                db.execSQL(aVar.a());
            }
        };
        MIGRATION_65_66 = migration60;
        migrations = new Migration[]{migration, migration2, migration3, migration4, migration5, migration6, migration7, migration8, migration9, migration10, migration11, migration12, migration13, migration14, migration15, migration16, migration17, migration18, migration19, migration20, migration21, migration22, migration23, migration24, migration25, migration26, migration27, migration28, migration29, migration30, migration31, migration32, migration33, migration34, migration35, migration36, migration37, migration38, migration39, migration40, migration41, migration42, migration43, migration44, migration45, migration46, migration47, migration48, migration49, migration50, migration51, migration52, migration53, migration55, migration54, migration56, migration57, migration58, migration59, migration60};
    }

    @NotNull
    public final Migration[] a() {
        return migrations;
    }
}
