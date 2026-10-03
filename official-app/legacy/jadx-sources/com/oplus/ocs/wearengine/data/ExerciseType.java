package com.oplus.ocs.wearengine.data;

import androidx.annotation.RestrictTo;
import com.oplus.ocs.wearengine.proto.DataProto$ExerciseType;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseType;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "toProto", "Lcom/oplus/ocs/wearengine/proto/DataProto$ExerciseType;", "toString", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExerciseType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExerciseType.kt\ncom/oplus/ocs/wearengine/data/ExerciseType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n*S KotlinDebug\n*F\n+ 1 ExerciseType.kt\ncom/oplus/ocs/wearengine/data/ExerciseType\n*L\n86#1:104\n86#1:105,3\n*E\n"})
public final class ExerciseType {

    @JvmField
    @NotNull
    public static final ExerciseType BADMINTON;

    @JvmField
    @NotNull
    public static final ExerciseType BASIC;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Map<Integer, ExerciseType> IDS;

    @JvmField
    @NotNull
    public static final ExerciseType MOUNTAIN_HIKING;

    @JvmField
    @NotNull
    public static final ExerciseType OUTDOOR_CYCLE;

    @JvmField
    @NotNull
    public static final ExerciseType OUTDOOR_RUN;

    @JvmField
    @NotNull
    public static final ExerciseType ROPE_SKIPPING;

    @JvmField
    @NotNull
    public static final ExerciseType SKIING;

    @JvmField
    @NotNull
    public static final ExerciseType TENNIS;

    @JvmField
    @NotNull
    public static final ExerciseType TRAIL_HIKING;

    @JvmField
    @NotNull
    public static final ExerciseType TRAIL_RUN;

    @JvmField
    @NotNull
    public static final ExerciseType UNKNOWN;

    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public static final List<ExerciseType> VALUES;
    private final int id;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\bH\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseType$Companion;", "", "()V", "BADMINTON", "Lcom/oplus/ocs/wearengine/data/ExerciseType;", "BASIC", "IDS", "", "", "MOUNTAIN_HIKING", "OUTDOOR_CYCLE", "OUTDOOR_RUN", "ROPE_SKIPPING", "SKIING", "TENNIS", "TRAIL_HIKING", "TRAIL_RUN", LanConstants.OPERATOR_UNKNOWN, "VALUES", "", "fromId", "id", "fromProto", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$ExerciseType;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ExerciseType fromId(int id) {
            ExerciseType exerciseType = (ExerciseType) ExerciseType.IDS.get(Integer.valueOf(id));
            return exerciseType == null ? ExerciseType.UNKNOWN : exerciseType;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final ExerciseType fromProto(@NotNull DataProto$ExerciseType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return fromId(proto.getNumber());
        }
    }

    static {
        ExerciseType exerciseType = new ExerciseType(0, LanConstants.OPERATOR_UNKNOWN);
        UNKNOWN = exerciseType;
        ExerciseType exerciseType2 = new ExerciseType(10001, "TRAIL_HIKING");
        TRAIL_HIKING = exerciseType2;
        ExerciseType exerciseType3 = new ExerciseType(10002, "MOUNTAIN_HIKING");
        MOUNTAIN_HIKING = exerciseType3;
        ExerciseType exerciseType4 = new ExerciseType(10003, "OUTDOOR_CYCLE");
        OUTDOOR_CYCLE = exerciseType4;
        ExerciseType exerciseType5 = new ExerciseType(10004, "OUTDOOR_RUN");
        OUTDOOR_RUN = exerciseType5;
        ExerciseType exerciseType6 = new ExerciseType(10005, "BASIC");
        BASIC = exerciseType6;
        ExerciseType exerciseType7 = new ExerciseType(10006, "SKIING");
        SKIING = exerciseType7;
        ExerciseType exerciseType8 = new ExerciseType(10007, "BADMINTON");
        BADMINTON = exerciseType8;
        ExerciseType exerciseType9 = new ExerciseType(10008, "TENNIS");
        TENNIS = exerciseType9;
        ExerciseType exerciseType10 = new ExerciseType(10009, "TRAIL_RUN");
        TRAIL_RUN = exerciseType10;
        ExerciseType exerciseType11 = new ExerciseType(10010, "ROPE_SKIPPING");
        ROPE_SKIPPING = exerciseType11;
        List<ExerciseType> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ExerciseType[]{exerciseType, exerciseType2, exerciseType3, exerciseType4, exerciseType5, exerciseType6, exerciseType7, exerciseType8, exerciseType9, exerciseType10, exerciseType11});
        VALUES = listListOf;
        List<ExerciseType> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (ExerciseType exerciseType12 : list) {
            arrayList.add(TuplesKt.to(Integer.valueOf(exerciseType12.id), exerciseType12));
        }
        IDS = MapsKt__MapsKt.toMap(arrayList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ExerciseType(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
    }

    @JvmStatic
    @NotNull
    public static final ExerciseType fromId(int i) {
        return INSTANCE.fromId(i);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExerciseType) && this.id == ((ExerciseType) other).id;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final DataProto$ExerciseType toProto() {
        DataProto$ExerciseType dataProto$ExerciseTypeForNumber = DataProto$ExerciseType.forNumber(this.id);
        return dataProto$ExerciseTypeForNumber == null ? DataProto$ExerciseType.EXERCISE_TYPE_UNKNOWN : dataProto$ExerciseTypeForNumber;
    }

    @NotNull
    public String toString() {
        return this.name;
    }
}
