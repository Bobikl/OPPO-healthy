package com.oplus.ocs.wearengine.data;

import androidx.annotation.RestrictTo;
import com.oplus.aiunit.vision.d04;
import com.oplus.ocs.wearengine.proto.DataProto$ExerciseState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\r\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseState;", "", "id", "", "name", "", "(ILjava/lang/String;)V", "getId", "()I", "isEnded", "", "()Z", "isEnding", "isPaused", "isResuming", "getName", "()Ljava/lang/String;", "equals", "other", "hashCode", "toProto", "Lcom/oplus/ocs/wearengine/proto/DataProto$ExerciseState;", "toProto$thirdparty_impl_release", "toString", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExerciseState {

    @JvmField
    @NotNull
    public static final ExerciseState ACTIVE;

    @JvmField
    @NotNull
    public static final ExerciseState AUTO_ENDED;

    @JvmField
    @NotNull
    public static final ExerciseState AUTO_ENDED_PERMISSION_LOST;

    @JvmField
    @NotNull
    public static final ExerciseState AUTO_ENDING;

    @JvmField
    @NotNull
    public static final ExerciseState AUTO_ENDING_PERMISSION_LOST;

    @JvmField
    @NotNull
    public static final ExerciseState AUTO_PAUSED;

    @JvmField
    @NotNull
    public static final ExerciseState AUTO_PAUSING;

    @JvmField
    @NotNull
    public static final ExerciseState AUTO_RESUMING;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final ExerciseState ENDED;

    @NotNull
    private static final Set<ExerciseState> ENDED_STATES;

    @JvmField
    @NotNull
    public static final ExerciseState ENDING;

    @NotNull
    private static final Set<ExerciseState> ENDING_STATES;

    @NotNull
    private static final Set<ExerciseState> OTHER_STATES;

    @NotNull
    private static final Set<ExerciseState> PAUSED_STATES;

    @JvmField
    @NotNull
    public static final ExerciseState PREPARING;

    @NotNull
    private static final Set<ExerciseState> RESUMING_STATES;

    @JvmField
    @NotNull
    public static final ExerciseState TERMINATED;

    @JvmField
    @NotNull
    public static final ExerciseState TERMINATING;

    @JvmField
    @NotNull
    public static final ExerciseState USER_ENDED;

    @JvmField
    @NotNull
    public static final ExerciseState USER_ENDING;

    @JvmField
    @NotNull
    public static final ExerciseState USER_PAUSED;

    @JvmField
    @NotNull
    public static final ExerciseState USER_PAUSING;

    @JvmField
    @NotNull
    public static final ExerciseState USER_RESUMING;

    @JvmField
    @NotNull
    public static final ExerciseState USER_STARTING;

    @NotNull
    private static final Set<ExerciseState> VALUES;
    private final int id;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020#H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseState$Companion;", "", "()V", d04.CARD_STATUS_ACTIVE, "Lcom/oplus/ocs/wearengine/data/ExerciseState;", "AUTO_ENDED", "AUTO_ENDED_PERMISSION_LOST", "AUTO_ENDING", "AUTO_ENDING_PERMISSION_LOST", "AUTO_PAUSED", "AUTO_PAUSING", "AUTO_RESUMING", "ENDED", "ENDED_STATES", "", "ENDING", "ENDING_STATES", "OTHER_STATES", "PAUSED_STATES", "PREPARING", "RESUMING_STATES", "TERMINATED", "TERMINATING", "USER_ENDED", "USER_ENDING", "USER_PAUSED", "USER_PAUSING", "USER_RESUMING", "USER_STARTING", "VALUES", "fromId", "id", "", "fromProto", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$ExerciseState;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExerciseState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExerciseState.kt\ncom/oplus/ocs/wearengine/data/ExerciseState$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n288#2,2:196\n*S KotlinDebug\n*F\n+ 1 ExerciseState.kt\ncom/oplus/ocs/wearengine/data/ExerciseState$Companion\n*L\n188#1:196,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final ExerciseState fromId(int id) {
            Object next;
            Iterator it = ExerciseState.VALUES.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((ExerciseState) next).getId() == id) {
                    return (ExerciseState) next;
                }
            }
            next = null;
            return (ExerciseState) next;
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @Nullable
        public final ExerciseState fromProto(@NotNull DataProto$ExerciseState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return fromId(proto.getNumber());
        }
    }

    static {
        ExerciseState exerciseState = new ExerciseState(15, "PREPARING");
        PREPARING = exerciseState;
        ExerciseState exerciseState2 = new ExerciseState(1, "USER_STARTING");
        USER_STARTING = exerciseState2;
        ExerciseState exerciseState3 = new ExerciseState(2, d04.CARD_STATUS_ACTIVE);
        ACTIVE = exerciseState3;
        ExerciseState exerciseState4 = new ExerciseState(3, "USER_PAUSING");
        USER_PAUSING = exerciseState4;
        ExerciseState exerciseState5 = new ExerciseState(4, "USER_PAUSED");
        USER_PAUSED = exerciseState5;
        ExerciseState exerciseState6 = new ExerciseState(5, "AUTO_PAUSING");
        AUTO_PAUSING = exerciseState6;
        ExerciseState exerciseState7 = new ExerciseState(6, "AUTO_PAUSED");
        AUTO_PAUSED = exerciseState7;
        ExerciseState exerciseState8 = new ExerciseState(7, "USER_RESUMING");
        USER_RESUMING = exerciseState8;
        ExerciseState exerciseState9 = new ExerciseState(8, "AUTO_RESUMING");
        AUTO_RESUMING = exerciseState9;
        ExerciseState exerciseState10 = new ExerciseState(9, "USER_ENDING");
        USER_ENDING = exerciseState10;
        ExerciseState exerciseState11 = new ExerciseState(10, "USER_ENDED");
        USER_ENDED = exerciseState11;
        ExerciseState exerciseState12 = new ExerciseState(11, "AUTO_ENDING");
        AUTO_ENDING = exerciseState12;
        ExerciseState exerciseState13 = new ExerciseState(12, "AUTO_ENDED");
        AUTO_ENDED = exerciseState13;
        ExerciseState exerciseState14 = new ExerciseState(16, "AUTO_ENDING_PERMISSION_LOST");
        AUTO_ENDING_PERMISSION_LOST = exerciseState14;
        ExerciseState exerciseState15 = new ExerciseState(17, "AUTO_ENDED_PERMISSION_LOST");
        AUTO_ENDED_PERMISSION_LOST = exerciseState15;
        ExerciseState exerciseState16 = new ExerciseState(13, "TERMINATING");
        TERMINATING = exerciseState16;
        ExerciseState exerciseState17 = new ExerciseState(14, "TERMINATED");
        TERMINATED = exerciseState17;
        ExerciseState exerciseState18 = new ExerciseState(18, "ENDED");
        ENDED = exerciseState18;
        ExerciseState exerciseState19 = new ExerciseState(19, "ENDING");
        ENDING = exerciseState19;
        Set<ExerciseState> of = SetsKt__SetsKt.setOf((Object[]) new ExerciseState[]{exerciseState8, exerciseState9});
        RESUMING_STATES = of;
        Set<ExerciseState> of2 = SetsKt__SetsKt.setOf((Object[]) new ExerciseState[]{exerciseState5, exerciseState7});
        PAUSED_STATES = of2;
        Set<ExerciseState> of3 = SetsKt__SetsKt.setOf((Object[]) new ExerciseState[]{exerciseState11, exerciseState13, exerciseState15, exerciseState17, exerciseState18});
        ENDED_STATES = of3;
        Set<ExerciseState> of4 = SetsKt__SetsKt.setOf((Object[]) new ExerciseState[]{exerciseState10, exerciseState12, exerciseState14, exerciseState16, exerciseState19});
        ENDING_STATES = of4;
        Set<ExerciseState> of5 = SetsKt__SetsKt.setOf((Object[]) new ExerciseState[]{exerciseState, exerciseState2, exerciseState4, exerciseState6, exerciseState3});
        OTHER_STATES = of5;
        HashSet hashSet = new HashSet();
        hashSet.addAll(of5);
        hashSet.addAll(of);
        hashSet.addAll(of2);
        hashSet.addAll(of3);
        hashSet.addAll(of4);
        VALUES = hashSet;
    }

    private ExerciseState(int i, String str) {
        this.id = i;
        this.name = str;
    }

    @JvmStatic
    @Nullable
    public static final ExerciseState fromId(int i) {
        return INSTANCE.fromId(i);
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Nullable
    public static final ExerciseState fromProto(@NotNull DataProto$ExerciseState dataProto$ExerciseState) {
        return INSTANCE.fromProto(dataProto$ExerciseState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExerciseState) && this.id == ((ExerciseState) other).id;
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

    public final boolean isEnded() {
        return ENDED_STATES.contains(this);
    }

    public final boolean isEnding() {
        return ENDING_STATES.contains(this);
    }

    public final boolean isPaused() {
        return PAUSED_STATES.contains(this);
    }

    public final boolean isResuming() {
        return RESUMING_STATES.contains(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final DataProto$ExerciseState toProto$thirdparty_impl_release() {
        DataProto$ExerciseState dataProto$ExerciseStateForNumber = DataProto$ExerciseState.forNumber(this.id);
        return dataProto$ExerciseStateForNumber == null ? DataProto$ExerciseState.EXERCISE_STATE_UNKNOWN : dataProto$ExerciseStateForNumber;
    }

    @NotNull
    public String toString() {
        return this.name;
    }
}
