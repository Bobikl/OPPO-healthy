package com.oplus.ocs.wearengine.data;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.ocs.wearengine.data.SampleDataPoint;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.platform.usercenter.network.header.HeaderConstant;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001\u000bB\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/oplus/ocs/wearengine/data/SampleDataType;", ExifInterface.GPS_DIRECTION_TRUE, "", "D", "Lcom/oplus/ocs/wearengine/data/SampleDataPoint;", "Lcom/oplus/ocs/wearengine/data/DataType;", "name", "", "valueClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)V", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSampleDataType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SampleDataType.kt\ncom/oplus/ocs/wearengine/data/SampleDataType\n+ 2 SampleDataType.kt\ncom/oplus/ocs/wearengine/data/SampleDataType$Companion\n*L\n1#1,550:1\n16#2:551\n16#2:552\n16#2:553\n16#2:554\n16#2:555\n16#2:556\n16#2:557\n16#2:558\n16#2:559\n16#2:560\n16#2:561\n16#2:562\n16#2:563\n16#2:564\n16#2:565\n16#2:566\n16#2:567\n16#2:568\n16#2:569\n16#2:570\n16#2:571\n16#2:572\n16#2:573\n16#2:574\n16#2:575\n16#2:576\n16#2:577\n16#2:578\n16#2:579\n16#2:580\n16#2:581\n16#2:582\n16#2:583\n16#2:584\n16#2:585\n16#2:586\n16#2:587\n16#2:588\n16#2:589\n16#2:590\n16#2:591\n16#2:592\n16#2:593\n16#2:594\n16#2:595\n16#2:596\n16#2:597\n16#2:598\n16#2:599\n16#2:600\n16#2:601\n16#2:602\n16#2:603\n16#2:604\n16#2:605\n16#2:606\n16#2:607\n16#2:608\n16#2:609\n16#2:610\n16#2:611\n16#2:612\n16#2:613\n16#2:614\n16#2:615\n*S KotlinDebug\n*F\n+ 1 SampleDataType.kt\ncom/oplus/ocs/wearengine/data/SampleDataType\n*L\n23#1:551\n30#1:552\n37#1:553\n44#1:554\n51#1:555\n58#1:556\n65#1:557\n72#1:558\n79#1:559\n86#1:560\n93#1:561\n100#1:562\n108#1:563\n115#1:564\n122#1:565\n129#1:566\n136#1:567\n150#1:568\n157#1:569\n164#1:570\n171#1:571\n178#1:572\n185#1:573\n192#1:574\n199#1:575\n206#1:576\n213#1:577\n220#1:578\n227#1:579\n234#1:580\n241#1:581\n248#1:582\n255#1:583\n262#1:584\n269#1:585\n276#1:586\n283#1:587\n290#1:588\n297#1:589\n304#1:590\n311#1:591\n318#1:592\n325#1:593\n332#1:594\n339#1:595\n346#1:596\n353#1:597\n360#1:598\n367#1:599\n374#1:600\n381#1:601\n388#1:602\n395#1:603\n402#1:604\n409#1:605\n416#1:606\n423#1:607\n430#1:608\n437#1:609\n444#1:610\n451#1:611\n458#1:612\n465#1:613\n472#1:614\n479#1:615\n*E\n"})
public final class SampleDataType<T, D extends SampleDataPoint<T>> extends DataType<T, D> {

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> ACTIVE_DURATION;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> ALL_AVG_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> ALL_DURATION;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> AVG_GROUND_CONTACT_TIME;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> AVG_PACE;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> AVG_POWER;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> AVG_ROTATIONS_PER_MINUTE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> AVG_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> AVG_STROKES_PER_MINUTE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> AVG_VERTICAL_OSCILLATION;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> BACKHAND_SHOTS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> BADMINTON_DOWN_SHOTS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> BADMINTON_LONGEST_CONTINUOUS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> BADMINTON_OTHER_SHOTS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> BADMINTON_UP_SHOTS;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> BEST_PACE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> CALORIES;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> DISTANCE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> DYNAMIC_CALORIES;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> ELEVATION;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> FAT_BURNED;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> FOREHAND_SHOTS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> GPS_SATELLITE_NUM;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> GROUND_BALANCE;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> GROUND_CONTACT_TIME;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> HEART_RATE_BPM;

    @JvmField
    @NotNull
    public static final SampleDataType<LocationData, SampleDataPoint<LocationData>> LOCATION;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> MAX_ELEVATION;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> MAX_POWER;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> MAX_ROTATIONS_PER_MINUTE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> MAX_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> MAX_STROKES_PER_MINUTE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> MAX_SWING_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> PACE;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> POWER;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> ROPE_SKIPPING_COUNT;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> ROPE_SKIPPING_MAX_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> ROPE_SKIPPING_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> ROTATIONS_PER_MINUTE;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> SHOTS;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> SINGLE_SKI_DISTANCE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> SINGLE_SKI_DROPS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> SINGLE_SKI_DURATION;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> SINGLE_SKI_MAXIMUM_SLOPE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> SINGLE_SKI_MAX_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> SKI_DROPS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> SKI_MAXIMUM_SLOPE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> STATIC_CALORIES;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> STEPS;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> STEPS_PER_MINUTE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> STRIDE;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> STROKES_COUNT;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> STROKES_PER_MINUTE;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> SUGAR_BURNED;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> SWING_SPEED;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> TENNIS_BACKHAND_SLICE;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> TENNIS_BACKHAND_TOPSPIN;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> TENNIS_FOREHAND_SLICE;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> TENNIS_FOREHAND_TOPSPIN;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> TENNIS_SERVE_COUNT;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> TOTAL_ASCENT;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> TOTAL_DESCENT;

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> TRIPS_COUNT;

    @JvmField
    @NotNull
    public static final SampleDataType<Double, SampleDataPoint<Double>> VERTICAL_OSCILLATION;

    @NotNull
    private static final Set<SampleDataType<?, ?>> sampleDataTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final SampleDataType<Long, SampleDataPoint<Long>> UNKNOWN = new SampleDataType<>(LanConstants.OPERATOR_UNKNOWN, Long.class);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010N\u001a\u0014\u0012\u0004\u0012\u0002HO\u0012\n\u0012\b\u0012\u0004\u0012\u0002HO0\u00060\u0004\"\n\b\u0002\u0010O\u0018\u0001*\u00020P2\u0006\u0010Q\u001a\u00020RH\u0082\bR\"\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010.\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00100\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00101\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00104\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00105\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00107\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00108\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010@\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010A\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010B\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010G\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010H\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010I\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\"\u0010J\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040KX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010M¨\u0006S"}, d2 = {"Lcom/oplus/ocs/wearengine/data/SampleDataType$Companion;", "", "()V", "ACTIVE_DURATION", "Lcom/oplus/ocs/wearengine/data/SampleDataType;", "", "Lcom/oplus/ocs/wearengine/data/SampleDataPoint;", "ALL_AVG_SPEED", "", "ALL_DURATION", "AVG_GROUND_CONTACT_TIME", "AVG_PACE", "AVG_POWER", "AVG_ROTATIONS_PER_MINUTE", "AVG_SPEED", "AVG_STROKES_PER_MINUTE", "AVG_VERTICAL_OSCILLATION", "BACKHAND_SHOTS", "BADMINTON_DOWN_SHOTS", "BADMINTON_LONGEST_CONTINUOUS", "BADMINTON_OTHER_SHOTS", "BADMINTON_UP_SHOTS", "BEST_PACE", "CALORIES", "DISTANCE", "DYNAMIC_CALORIES", "ELEVATION", "FAT_BURNED", "FOREHAND_SHOTS", "GPS_SATELLITE_NUM", "GROUND_BALANCE", "GROUND_CONTACT_TIME", "HEART_RATE_BPM", "LOCATION", "Lcom/oplus/ocs/wearengine/data/LocationData;", "MAX_ELEVATION", "MAX_POWER", "MAX_ROTATIONS_PER_MINUTE", "MAX_SPEED", "MAX_STROKES_PER_MINUTE", "MAX_SWING_SPEED", "PACE", "POWER", "ROPE_SKIPPING_COUNT", "ROPE_SKIPPING_MAX_SPEED", "ROPE_SKIPPING_SPEED", "ROTATIONS_PER_MINUTE", "SHOTS", "SINGLE_SKI_DISTANCE", "SINGLE_SKI_DROPS", "SINGLE_SKI_DURATION", "SINGLE_SKI_MAXIMUM_SLOPE", "SINGLE_SKI_MAX_SPEED", "SKI_DROPS", "SKI_MAXIMUM_SLOPE", "SPEED", "STATIC_CALORIES", "STEPS", "STEPS_PER_MINUTE", "STRIDE", "STROKES_COUNT", "STROKES_PER_MINUTE", "SUGAR_BURNED", "SWING_SPEED", "TENNIS_BACKHAND_SLICE", "TENNIS_BACKHAND_TOPSPIN", "TENNIS_FOREHAND_SLICE", "TENNIS_FOREHAND_TOPSPIN", "TENNIS_SERVE_COUNT", "TOTAL_ASCENT", "TOTAL_DESCENT", "TRIPS_COUNT", LanConstants.OPERATOR_UNKNOWN, "VERTICAL_OSCILLATION", "sampleDataTypes", "", "getSampleDataTypes$thirdparty_impl_release", "()Ljava/util/Set;", "createSampleDataType", ExifInterface.GPS_DIRECTION_TRUE, "", "name", "", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ <T extends Number> SampleDataType<T, SampleDataPoint<T>> createSampleDataType(String name) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return new SampleDataType<>(name, Number.class);
        }

        @NotNull
        public final Set<SampleDataType<?, ?>> getSampleDataTypes$thirdparty_impl_release() {
            return SampleDataType.sampleDataTypes;
        }
    }

    static {
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType = new SampleDataType<>("All duration", Long.class);
        ALL_DURATION = sampleDataType;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType2 = new SampleDataType<>("Active Duration", Long.class);
        ACTIVE_DURATION = sampleDataType2;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType3 = new SampleDataType<>("Distance", Double.class);
        DISTANCE = sampleDataType3;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType4 = new SampleDataType<>("Elevation", Double.class);
        ELEVATION = sampleDataType4;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType5 = new SampleDataType<>("Speed", Double.class);
        SPEED = sampleDataType5;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType6 = new SampleDataType<>("Max Speed", Double.class);
        MAX_SPEED = sampleDataType6;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType7 = new SampleDataType<>("Avg Pace", Double.class);
        AVG_PACE = sampleDataType7;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType8 = new SampleDataType<>("Dynamic Calories", Double.class);
        DYNAMIC_CALORIES = sampleDataType8;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType9 = new SampleDataType<>("Max Elevation", Double.class);
        MAX_ELEVATION = sampleDataType9;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType10 = new SampleDataType<>("Heart Rate", Double.class);
        HEART_RATE_BPM = sampleDataType10;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType11 = new SampleDataType<>("Total Ascent", Double.class);
        TOTAL_ASCENT = sampleDataType11;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType12 = new SampleDataType<>("Total Descent", Double.class);
        TOTAL_DESCENT = sampleDataType12;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType13 = new SampleDataType<>("steps", Long.class);
        STEPS = sampleDataType13;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType14 = new SampleDataType<>("Pace", Double.class);
        PACE = sampleDataType14;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType15 = new SampleDataType<>("Avg Speed", Double.class);
        AVG_SPEED = sampleDataType15;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType16 = new SampleDataType<>("All Avg Speed", Double.class);
        ALL_AVG_SPEED = sampleDataType16;
        SampleDataType<LocationData, SampleDataPoint<LocationData>> sampleDataType17 = new SampleDataType<>(HeaderConstant.HEAD_K_302_LOCATION, LocationData.class);
        LOCATION = sampleDataType17;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType18 = new SampleDataType<>("Step per minute", Long.class);
        STEPS_PER_MINUTE = sampleDataType18;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType19 = new SampleDataType<>("Stride", Double.class);
        STRIDE = sampleDataType19;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType20 = new SampleDataType<>("GPS satellite num", Long.class);
        GPS_SATELLITE_NUM = sampleDataType20;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType21 = new SampleDataType<>("Best Pace", Double.class);
        BEST_PACE = sampleDataType21;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType22 = new SampleDataType<>("Calories", Double.class);
        CALORIES = sampleDataType22;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType23 = new SampleDataType<>("Static Calories", Double.class);
        STATIC_CALORIES = sampleDataType23;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType24 = new SampleDataType<>("Shots", Long.class);
        SHOTS = sampleDataType24;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType25 = new SampleDataType<>("Badminton Longest Continuous", Long.class);
        BADMINTON_LONGEST_CONTINUOUS = sampleDataType25;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType26 = new SampleDataType<>("Forehand Shots", Long.class);
        FOREHAND_SHOTS = sampleDataType26;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType27 = new SampleDataType<>("Backhand Shots", Long.class);
        BACKHAND_SHOTS = sampleDataType27;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType28 = new SampleDataType<>("Badminton Up Shots", Long.class);
        BADMINTON_UP_SHOTS = sampleDataType28;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType29 = new SampleDataType<>("Badminton Down Shots", Long.class);
        BADMINTON_DOWN_SHOTS = sampleDataType29;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType30 = new SampleDataType<>("Badminton Other Shots", Long.class);
        BADMINTON_OTHER_SHOTS = sampleDataType30;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType31 = new SampleDataType<>("Tennis Serve Count", Long.class);
        TENNIS_SERVE_COUNT = sampleDataType31;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType32 = new SampleDataType<>("Tennis Forehand Topspin", Long.class);
        TENNIS_FOREHAND_TOPSPIN = sampleDataType32;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType33 = new SampleDataType<>("Tennis Backhand Topspin", Long.class);
        TENNIS_BACKHAND_TOPSPIN = sampleDataType33;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType34 = new SampleDataType<>("Tennis Forehand Slice", Long.class);
        TENNIS_FOREHAND_SLICE = sampleDataType34;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType35 = new SampleDataType<>("Tennis Backhand Slice", Long.class);
        TENNIS_BACKHAND_SLICE = sampleDataType35;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType36 = new SampleDataType<>("Swing Speed", Double.class);
        SWING_SPEED = sampleDataType36;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType37 = new SampleDataType<>("Max Swing Speed", Double.class);
        MAX_SWING_SPEED = sampleDataType37;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType38 = new SampleDataType<>("Trips Count", Long.class);
        TRIPS_COUNT = sampleDataType38;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType39 = new SampleDataType<>("Ski Maximum Slope", Long.class);
        SKI_MAXIMUM_SLOPE = sampleDataType39;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType40 = new SampleDataType<>("Ski Drops", Double.class);
        SKI_DROPS = sampleDataType40;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType41 = new SampleDataType<>("Single Ski Distance", Double.class);
        SINGLE_SKI_DISTANCE = sampleDataType41;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType42 = new SampleDataType<>("Single Ski Duration", Long.class);
        SINGLE_SKI_DURATION = sampleDataType42;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType43 = new SampleDataType<>("Single Ski Max Speed", Double.class);
        SINGLE_SKI_MAX_SPEED = sampleDataType43;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType44 = new SampleDataType<>("Single Ski Ski Drops", Double.class);
        SINGLE_SKI_DROPS = sampleDataType44;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType45 = new SampleDataType<>("Single Ski Maximum Slope", Long.class);
        SINGLE_SKI_MAXIMUM_SLOPE = sampleDataType45;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType46 = new SampleDataType<>("Rope Skipping Count", Long.class);
        ROPE_SKIPPING_COUNT = sampleDataType46;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType47 = new SampleDataType<>("Rope Skipping Speed", Long.class);
        ROPE_SKIPPING_SPEED = sampleDataType47;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType48 = new SampleDataType<>("Max Rope Skipping Speed", Long.class);
        ROPE_SKIPPING_MAX_SPEED = sampleDataType48;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType49 = new SampleDataType<>("Ground Contact Time", Long.class);
        GROUND_CONTACT_TIME = sampleDataType49;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType50 = new SampleDataType<>("Avg Ground Contact Time", Long.class);
        AVG_GROUND_CONTACT_TIME = sampleDataType50;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType51 = new SampleDataType<>("Vertical Oscillation", Double.class);
        VERTICAL_OSCILLATION = sampleDataType51;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType52 = new SampleDataType<>("Avg Vertical Oscillation", Double.class);
        AVG_VERTICAL_OSCILLATION = sampleDataType52;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType53 = new SampleDataType<>("Ground Balance", Double.class);
        GROUND_BALANCE = sampleDataType53;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType54 = new SampleDataType<>("Fat Burned", Double.class);
        FAT_BURNED = sampleDataType54;
        SampleDataType<Double, SampleDataPoint<Double>> sampleDataType55 = new SampleDataType<>("Sugar Burned", Double.class);
        SUGAR_BURNED = sampleDataType55;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType56 = new SampleDataType<>("Rotations Per Minute", Long.class);
        ROTATIONS_PER_MINUTE = sampleDataType56;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType57 = new SampleDataType<>("Avg Rotations Per Minute", Long.class);
        AVG_ROTATIONS_PER_MINUTE = sampleDataType57;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType58 = new SampleDataType<>("Max Rotations Per Minute", Long.class);
        MAX_ROTATIONS_PER_MINUTE = sampleDataType58;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType59 = new SampleDataType<>("Strokes Count", Long.class);
        STROKES_COUNT = sampleDataType59;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType60 = new SampleDataType<>("Strokes Per Minute", Long.class);
        STROKES_PER_MINUTE = sampleDataType60;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType61 = new SampleDataType<>("Avg Strokes Per Minute", Long.class);
        AVG_STROKES_PER_MINUTE = sampleDataType61;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType62 = new SampleDataType<>("Max Strokes Per Minute", Long.class);
        MAX_STROKES_PER_MINUTE = sampleDataType62;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType63 = new SampleDataType<>("Power", Long.class);
        POWER = sampleDataType63;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType64 = new SampleDataType<>("Avg Power", Long.class);
        AVG_POWER = sampleDataType64;
        SampleDataType<Long, SampleDataPoint<Long>> sampleDataType65 = new SampleDataType<>("Max Power", Long.class);
        MAX_POWER = sampleDataType65;
        sampleDataTypes = SetsKt__SetsKt.setOf((Object[]) new SampleDataType[]{sampleDataType, sampleDataType2, sampleDataType3, sampleDataType4, sampleDataType5, sampleDataType6, sampleDataType7, sampleDataType8, sampleDataType9, sampleDataType10, sampleDataType11, sampleDataType12, sampleDataType13, sampleDataType14, sampleDataType15, sampleDataType16, sampleDataType17, sampleDataType18, sampleDataType19, sampleDataType20, sampleDataType21, sampleDataType22, sampleDataType23, sampleDataType24, sampleDataType25, sampleDataType26, sampleDataType27, sampleDataType28, sampleDataType29, sampleDataType30, sampleDataType31, sampleDataType32, sampleDataType33, sampleDataType34, sampleDataType35, sampleDataType36, sampleDataType37, sampleDataType38, sampleDataType39, sampleDataType40, sampleDataType41, sampleDataType42, sampleDataType43, sampleDataType44, sampleDataType45, sampleDataType46, sampleDataType47, sampleDataType48, sampleDataType49, sampleDataType50, sampleDataType51, sampleDataType52, sampleDataType53, sampleDataType54, sampleDataType55, sampleDataType56, sampleDataType57, sampleDataType58, sampleDataType59, sampleDataType60, sampleDataType61, sampleDataType62, sampleDataType63, sampleDataType64, sampleDataType65});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SampleDataType(@NotNull String name, @NotNull Class<T> valueClass) {
        super(name, valueClass, false);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(valueClass, "valueClass");
    }
}
