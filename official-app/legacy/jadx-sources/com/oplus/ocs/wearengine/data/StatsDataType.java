package com.oplus.ocs.wearengine.data;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.ocs.wearengine.data.StatsDataPoint;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u000bB\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/oplus/ocs/wearengine/data/StatsDataType;", ExifInterface.GPS_DIRECTION_TRUE, "", "D", "Lcom/oplus/ocs/wearengine/data/StatsDataPoint;", "Lcom/oplus/ocs/wearengine/data/DataType;", "name", "", "valueClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)V", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStatsDataType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatsDataType.kt\ncom/oplus/ocs/wearengine/data/StatsDataType\n+ 2 StatsDataType.kt\ncom/oplus/ocs/wearengine/data/StatsDataType$Companion\n*L\n1#1,506:1\n14#2:507\n14#2:508\n14#2:509\n14#2:510\n14#2:511\n14#2:512\n14#2:513\n14#2:514\n14#2:515\n14#2:516\n14#2:517\n14#2:518\n14#2:519\n14#2:520\n14#2:521\n14#2:522\n14#2:523\n14#2:524\n14#2:525\n14#2:526\n14#2:527\n14#2:528\n14#2:529\n14#2:530\n14#2:531\n14#2:532\n14#2:533\n14#2:534\n14#2:535\n14#2:536\n14#2:537\n14#2:538\n14#2:539\n14#2:540\n14#2:541\n14#2:542\n14#2:543\n14#2:544\n14#2:545\n14#2:546\n14#2:547\n14#2:548\n14#2:549\n14#2:550\n14#2:551\n14#2:552\n14#2:553\n14#2:554\n14#2:555\n14#2:556\n14#2:557\n14#2:558\n14#2:559\n14#2:560\n14#2:561\n14#2:562\n14#2:563\n14#2:564\n14#2:565\n14#2:566\n*S KotlinDebug\n*F\n+ 1 StatsDataType.kt\ncom/oplus/ocs/wearengine/data/StatsDataType\n*L\n21#1:507\n28#1:508\n35#1:509\n42#1:510\n49#1:511\n56#1:512\n63#1:513\n70#1:514\n77#1:515\n84#1:516\n91#1:517\n98#1:518\n105#1:519\n112#1:520\n119#1:521\n126#1:522\n133#1:523\n140#1:524\n147#1:525\n154#1:526\n161#1:527\n168#1:528\n182#1:529\n189#1:530\n196#1:531\n203#1:532\n210#1:533\n217#1:534\n224#1:535\n231#1:536\n238#1:537\n245#1:538\n252#1:539\n259#1:540\n266#1:541\n273#1:542\n280#1:543\n287#1:544\n294#1:545\n301#1:546\n308#1:547\n315#1:548\n322#1:549\n329#1:550\n336#1:551\n343#1:552\n350#1:553\n357#1:554\n364#1:555\n371#1:556\n378#1:557\n385#1:558\n392#1:559\n399#1:560\n406#1:561\n413#1:562\n420#1:563\n427#1:564\n434#1:565\n441#1:566\n*E\n"})
public final class StatsDataType<T, D extends StatsDataPoint<T>> extends DataType<T, D> {

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> ACTIVE_DURATION;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_FAT_BURNED_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> AVG_GROUND_CONTACT_TIME_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_HEART_RATE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_PACE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> AVG_POWER_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> AVG_ROTATIONS_PER_MINUTE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> AVG_STEPS_PER_MINUTE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_STRIDE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> AVG_STROKES_PER_MINUTE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_SUGAR_BURNED_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_SWING_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> AVG_VERTICAL_OSCILLATION_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> All_DURATION;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> BACKHAND_SHOTS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> BADMINTON_DOWN_SHOTS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> BADMINTON_LONGEST_CONTINUOUS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> BADMINTON_OTHER_SHOTS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> BADMINTON_UP_SHOTS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> BEST_PACE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> CALORIES_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> DISTANCE_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> DYNAMIC_CALORIES_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> DYNAMIC_DURATION_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> END_TIME;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> FAT_BURNED_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> FOREHAND_SHOTS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> GROUND_BALANCE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MAX_ELEVATION_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MAX_HEART_RATE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> MAX_POWER_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> MAX_ROTATIONS_PER_MINUTE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MAX_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> MAX_STEPS_PER_MINUTE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MAX_STRIDE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> MAX_STROKES_PER_MINUTE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MAX_SWING_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MIN_ELEVATION_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> MIN_GROUND_CONTACT_TIME_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MIN_HEART_RATE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> MIN_VERTICAL_OSCILLATION_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> PAUSE_TIME;

    @JvmField
    @NotNull
    public static final StatsDataType<PerKMPaceData, StatsDataPoint<PerKMPaceData>> PER_KM_PACE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> ROPE_SKIPPING_AVG_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> ROPE_SKIPPING_COUNT_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> ROPE_SKIPPING_MAX_SPEED_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> SHOTS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> SKI_DISTANCE_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> SKI_DROPS_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> SKI_MAXIMUM_SLOPE_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> START_TIME;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> STATIC_CALORIES_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> STEPS_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> STROKES_COUNT_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> SUGAR_BURNED_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> TENNIS_SERVE_COUNT_TOTAL;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> TOTAL_ASCENT_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Double, StatsDataPoint<Double>> TOTAL_DESCENT_STATS;

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> TRIPS_COUNT_TOTAL;

    @NotNull
    private static final Set<StatsDataType<?, ?>> statsDataType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final StatsDataType<Long, StatsDataPoint<Long>> UNKNOWN = new StatsDataType<>("Unknown", Long.class);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010I\u001a\u0014\u0012\u0004\u0012\u0002HJ\u0012\n\u0012\b\u0012\u0004\u0012\u0002HJ0\u00060\u0004\"\n\b\u0002\u0010J\u0018\u0001*\u00020K2\u0006\u0010L\u001a\u00020MH\u0082\bR\"\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00100\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00102\u001a\u0014\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00108\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00109\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010@\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010B\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040FX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H¨\u0006N"}, d2 = {"Lcom/oplus/ocs/wearengine/data/StatsDataType$Companion;", "", "()V", "ACTIVE_DURATION", "Lcom/oplus/ocs/wearengine/data/StatsDataType;", "", "Lcom/oplus/ocs/wearengine/data/StatsDataPoint;", "AVG_FAT_BURNED_SPEED_STATS", "", "AVG_GROUND_CONTACT_TIME_STATS", "AVG_HEART_RATE_STATS", "AVG_PACE_STATS", "AVG_POWER_STATS", "AVG_ROTATIONS_PER_MINUTE_STATS", "AVG_SPEED_STATS", "AVG_STEPS_PER_MINUTE_STATS", "AVG_STRIDE_STATS", "AVG_STROKES_PER_MINUTE_STATS", "AVG_SUGAR_BURNED_SPEED_STATS", "AVG_SWING_SPEED_STATS", "AVG_VERTICAL_OSCILLATION_STATS", "All_DURATION", "BACKHAND_SHOTS_TOTAL", "BADMINTON_DOWN_SHOTS_TOTAL", "BADMINTON_LONGEST_CONTINUOUS_TOTAL", "BADMINTON_OTHER_SHOTS_TOTAL", "BADMINTON_UP_SHOTS_TOTAL", "BEST_PACE_STATS", "CALORIES_TOTAL", "DISTANCE_TOTAL", "DYNAMIC_CALORIES_TOTAL", "DYNAMIC_DURATION_TOTAL", "END_TIME", "FAT_BURNED_TOTAL", "FOREHAND_SHOTS_TOTAL", "GROUND_BALANCE_STATS", "MAX_ELEVATION_STATS", "MAX_HEART_RATE_STATS", "MAX_POWER_STATS", "MAX_ROTATIONS_PER_MINUTE_STATS", "MAX_SPEED_STATS", "MAX_STEPS_PER_MINUTE_STATS", "MAX_STRIDE_STATS", "MAX_STROKES_PER_MINUTE_STATS", "MAX_SWING_SPEED_STATS", "MIN_ELEVATION_STATS", "MIN_GROUND_CONTACT_TIME_STATS", "MIN_HEART_RATE_STATS", "MIN_VERTICAL_OSCILLATION_STATS", "PAUSE_TIME", "PER_KM_PACE_STATS", "Lcom/oplus/ocs/wearengine/data/PerKMPaceData;", "ROPE_SKIPPING_AVG_SPEED_STATS", "ROPE_SKIPPING_COUNT_TOTAL", "ROPE_SKIPPING_MAX_SPEED_STATS", "SHOTS_TOTAL", "SKI_DISTANCE_TOTAL", "SKI_DROPS_STATS", "SKI_MAXIMUM_SLOPE_STATS", "START_TIME", "STATIC_CALORIES_TOTAL", "STEPS_TOTAL", "STROKES_COUNT_TOTAL", "SUGAR_BURNED_TOTAL", "TENNIS_SERVE_COUNT_TOTAL", "TOTAL_ASCENT_STATS", "TOTAL_DESCENT_STATS", "TRIPS_COUNT_TOTAL", LanConstants.OPERATOR_UNKNOWN, "statsDataType", "", "getStatsDataType$thirdparty_impl_release", "()Ljava/util/Set;", "createStatsDataType", ExifInterface.GPS_DIRECTION_TRUE, "", "name", "", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ <T extends Number> StatsDataType<T, StatsDataPoint<T>> createStatsDataType(String name) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return new StatsDataType<>(name, Number.class);
        }

        @NotNull
        public final Set<StatsDataType<?, ?>> getStatsDataType$thirdparty_impl_release() {
            return StatsDataType.statsDataType;
        }
    }

    static {
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType2 = new StatsDataType<>("Distance Total", Long.class);
        DISTANCE_TOTAL = statsDataType2;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType3 = new StatsDataType<>("Start Time", Long.class);
        START_TIME = statsDataType3;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType4 = new StatsDataType<>("End Time", Long.class);
        END_TIME = statsDataType4;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType5 = new StatsDataType<>("All Duration", Long.class);
        All_DURATION = statsDataType5;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType6 = new StatsDataType<>("Active Duration", Long.class);
        ACTIVE_DURATION = statsDataType6;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType7 = new StatsDataType<>("Pause Time", Long.class);
        PAUSE_TIME = statsDataType7;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType8 = new StatsDataType<>("Dynamic Calories total", Double.class);
        DYNAMIC_CALORIES_TOTAL = statsDataType8;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType9 = new StatsDataType<>("Total Ascent Stats", Double.class);
        TOTAL_ASCENT_STATS = statsDataType9;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType10 = new StatsDataType<>("Total Descent Stats", Double.class);
        TOTAL_DESCENT_STATS = statsDataType10;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType11 = new StatsDataType<>("Steps Total", Long.class);
        STEPS_TOTAL = statsDataType11;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType12 = new StatsDataType<>("Max Speed Stats", Double.class);
        MAX_SPEED_STATS = statsDataType12;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType13 = new StatsDataType<>("Avg Speed Stats", Double.class);
        AVG_SPEED_STATS = statsDataType13;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType14 = new StatsDataType<>("Best Pace Stats", Double.class);
        BEST_PACE_STATS = statsDataType14;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType15 = new StatsDataType<>("Avg Pace Stats", Double.class);
        AVG_PACE_STATS = statsDataType15;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType16 = new StatsDataType<>("Max Steps Per Minute Stats", Long.class);
        MAX_STEPS_PER_MINUTE_STATS = statsDataType16;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType17 = new StatsDataType<>("Avg Steps Per Minute Stats", Long.class);
        AVG_STEPS_PER_MINUTE_STATS = statsDataType17;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType18 = new StatsDataType<>("Max Heart Rate Stats", Double.class);
        MAX_HEART_RATE_STATS = statsDataType18;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType19 = new StatsDataType<>("Min Heart Rate Stats", Double.class);
        MIN_HEART_RATE_STATS = statsDataType19;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType20 = new StatsDataType<>("Avg Heart Rate Stats", Double.class);
        AVG_HEART_RATE_STATS = statsDataType20;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType21 = new StatsDataType<>("Max Elevation Stats", Double.class);
        MAX_ELEVATION_STATS = statsDataType21;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType22 = new StatsDataType<>("Min Elevation Stats", Double.class);
        MIN_ELEVATION_STATS = statsDataType22;
        StatsDataType<PerKMPaceData, StatsDataPoint<PerKMPaceData>> statsDataType23 = new StatsDataType<>("Per km Pace Stats", PerKMPaceData.class);
        PER_KM_PACE_STATS = statsDataType23;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType24 = new StatsDataType<>("Calories total", Double.class);
        CALORIES_TOTAL = statsDataType24;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType25 = new StatsDataType<>("Static Calories total", Double.class);
        STATIC_CALORIES_TOTAL = statsDataType25;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType26 = new StatsDataType<>("Avg Stride Stats", Double.class);
        AVG_STRIDE_STATS = statsDataType26;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType27 = new StatsDataType<>("Max Stride Stats", Double.class);
        MAX_STRIDE_STATS = statsDataType27;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType28 = new StatsDataType<>("Dynamic Duration Total", Long.class);
        DYNAMIC_DURATION_TOTAL = statsDataType28;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType29 = new StatsDataType<>("Shots Total", Long.class);
        SHOTS_TOTAL = statsDataType29;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType30 = new StatsDataType<>("Badminton Longest Continuous Total", Long.class);
        BADMINTON_LONGEST_CONTINUOUS_TOTAL = statsDataType30;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType31 = new StatsDataType<>("Forehand Shots Total", Long.class);
        FOREHAND_SHOTS_TOTAL = statsDataType31;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType32 = new StatsDataType<>("Backhand Shots Total", Long.class);
        BACKHAND_SHOTS_TOTAL = statsDataType32;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType33 = new StatsDataType<>("Badminton Up Shots Total", Long.class);
        BADMINTON_UP_SHOTS_TOTAL = statsDataType33;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType34 = new StatsDataType<>("Badminton Down Shots Total", Long.class);
        BADMINTON_DOWN_SHOTS_TOTAL = statsDataType34;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType35 = new StatsDataType<>("Badminton Other Shots Total", Long.class);
        BADMINTON_OTHER_SHOTS_TOTAL = statsDataType35;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType36 = new StatsDataType<>("Tennis Serve Count Total", Long.class);
        TENNIS_SERVE_COUNT_TOTAL = statsDataType36;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType37 = new StatsDataType<>("Avg Swing Speed Stats", Double.class);
        AVG_SWING_SPEED_STATS = statsDataType37;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType38 = new StatsDataType<>("Max Swing Speed Stats", Double.class);
        MAX_SWING_SPEED_STATS = statsDataType38;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType39 = new StatsDataType<>("Ski Drops Stats", Double.class);
        SKI_DROPS_STATS = statsDataType39;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType40 = new StatsDataType<>("Ski Maximum Slope Stats", Long.class);
        SKI_MAXIMUM_SLOPE_STATS = statsDataType40;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType41 = new StatsDataType<>("Trips Count Total", Long.class);
        TRIPS_COUNT_TOTAL = statsDataType41;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType42 = new StatsDataType<>("Ski Distance Total", Double.class);
        SKI_DISTANCE_TOTAL = statsDataType42;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType43 = new StatsDataType<>("Rope Skipping Count Total", Long.class);
        ROPE_SKIPPING_COUNT_TOTAL = statsDataType43;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType44 = new StatsDataType<>("Rope Skipping Avg Speed Stats", Long.class);
        ROPE_SKIPPING_AVG_SPEED_STATS = statsDataType44;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType45 = new StatsDataType<>("Rope Skipping Max Speed Stats", Long.class);
        ROPE_SKIPPING_MAX_SPEED_STATS = statsDataType45;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType46 = new StatsDataType<>("Avg Ground Contact Time Stats", Long.class);
        AVG_GROUND_CONTACT_TIME_STATS = statsDataType46;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType47 = new StatsDataType<>("Min Ground Contact Time Stats", Long.class);
        MIN_GROUND_CONTACT_TIME_STATS = statsDataType47;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType48 = new StatsDataType<>("Avg Vertical Oscillation Stats", Double.class);
        AVG_VERTICAL_OSCILLATION_STATS = statsDataType48;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType49 = new StatsDataType<>("Min Vertical Oscillation Stats", Double.class);
        MIN_VERTICAL_OSCILLATION_STATS = statsDataType49;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType50 = new StatsDataType<>("Ground Balance Stats", Double.class);
        GROUND_BALANCE_STATS = statsDataType50;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType51 = new StatsDataType<>("Fat Burned Total", Double.class);
        FAT_BURNED_TOTAL = statsDataType51;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType52 = new StatsDataType<>("Sugar Burned Total", Double.class);
        SUGAR_BURNED_TOTAL = statsDataType52;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType53 = new StatsDataType<>("Avg Fat Burned Speed Stats", Double.class);
        AVG_FAT_BURNED_SPEED_STATS = statsDataType53;
        StatsDataType<Double, StatsDataPoint<Double>> statsDataType54 = new StatsDataType<>("Avg Sugar Burned Speed Stats", Double.class);
        AVG_SUGAR_BURNED_SPEED_STATS = statsDataType54;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType55 = new StatsDataType<>("Avg Rotations Per Minute Stats", Long.class);
        AVG_ROTATIONS_PER_MINUTE_STATS = statsDataType55;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType56 = new StatsDataType<>("Max Rotations Per Minute Stats", Long.class);
        MAX_ROTATIONS_PER_MINUTE_STATS = statsDataType56;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType57 = new StatsDataType<>("Avg Strokes Per Minute Stats", Long.class);
        AVG_STROKES_PER_MINUTE_STATS = statsDataType57;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType58 = new StatsDataType<>("Max Strokes Per Minute Stats", Long.class);
        MAX_STROKES_PER_MINUTE_STATS = statsDataType58;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType59 = new StatsDataType<>("Strokes Count Total", Long.class);
        STROKES_COUNT_TOTAL = statsDataType59;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType60 = new StatsDataType<>("Avg Power Stats", Long.class);
        AVG_POWER_STATS = statsDataType60;
        StatsDataType<Long, StatsDataPoint<Long>> statsDataType61 = new StatsDataType<>("Max Power Stats", Long.class);
        MAX_POWER_STATS = statsDataType61;
        statsDataType = SetsKt__SetsKt.setOf((Object[]) new StatsDataType[]{statsDataType2, statsDataType3, statsDataType4, statsDataType5, statsDataType6, statsDataType7, statsDataType8, statsDataType9, statsDataType10, statsDataType11, statsDataType12, statsDataType13, statsDataType14, statsDataType15, statsDataType16, statsDataType17, statsDataType18, statsDataType19, statsDataType20, statsDataType21, statsDataType22, statsDataType23, statsDataType24, statsDataType25, statsDataType26, statsDataType27, statsDataType28, statsDataType29, statsDataType30, statsDataType31, statsDataType32, statsDataType33, statsDataType34, statsDataType35, statsDataType36, statsDataType37, statsDataType38, statsDataType39, statsDataType40, statsDataType41, statsDataType42, statsDataType43, statsDataType44, statsDataType45, statsDataType46, statsDataType47, statsDataType48, statsDataType49, statsDataType50, statsDataType51, statsDataType52, statsDataType53, statsDataType54, statsDataType55, statsDataType56, statsDataType57, statsDataType58, statsDataType59, statsDataType60, statsDataType61});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsDataType(@NotNull String name, @NotNull Class<T> valueClass) {
        super(name, valueClass, true);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(valueClass, "valueClass");
    }
}
