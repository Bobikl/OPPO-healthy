package com.oplus.ocs.wearengine.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.ocs.wearengine.data.ProtoParcelable;
import com.oplus.ocs.wearengine.proto.EventsProto$ExerciseUpdateListenerEvent;
import com.oplus.ocs.wearengine.response.AvailabilityResponse;
import com.oplus.ocs.wearengine.response.ExerciseExtraInfoResponse;
import com.oplus.ocs.wearengine.response.ExerciseLapSummaryResponse;
import com.oplus.ocs.wearengine.response.ExerciseUpdateResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/ExerciseUpdateListenerEvent;", "Lcom/oplus/ocs/wearengine/data/ProtoParcelable;", "Lcom/oplus/ocs/wearengine/proto/EventsProto$ExerciseUpdateListenerEvent;", "proto", "Lcom/oplus/ocs/wearengine/proto/EventsProto$ExerciseUpdateListenerEvent;", "getProto", "()Lcom/oplus/ocs/wearengine/proto/EventsProto$ExerciseUpdateListenerEvent;", "<init>", "(Lcom/oplus/ocs/wearengine/proto/EventsProto$ExerciseUpdateListenerEvent;)V", "Companion", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExerciseUpdateListenerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExerciseUpdateListenerEvent.kt\ncom/oplus/ocs/wearengine/bean/ExerciseUpdateListenerEvent\n+ 2 ProtoParcelable.kt\ncom/oplus/ocs/wearengine/data/ProtoParcelable$Companion\n*L\n1#1,53:1\n58#2:54\n*S KotlinDebug\n*F\n+ 1 ExerciseUpdateListenerEvent.kt\ncom/oplus/ocs/wearengine/bean/ExerciseUpdateListenerEvent\n*L\n17#1:54\n*E\n"})
public final class ExerciseUpdateListenerEvent extends ProtoParcelable<EventsProto$ExerciseUpdateListenerEvent> {

    @NotNull
    private final EventsProto$ExerciseUpdateListenerEvent proto;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ExerciseUpdateListenerEvent> CREATOR = new b();

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.bean.ExerciseUpdateListenerEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/oplus/ocs/wearengine/bean/ExerciseUpdateListenerEvent$a;", "", "Lcom/oplus/ocs/wearengine/response/ExerciseUpdateResponse;", "exerciseUpdate", "Lcom/oplus/ocs/wearengine/bean/ExerciseUpdateListenerEvent;", "c", "Lcom/oplus/ocs/wearengine/response/ExerciseExtraInfoResponse;", "extraInfo", "b", "Lcom/oplus/ocs/wearengine/response/AvailabilityResponse;", "availability", "a", "Lcom/oplus/ocs/wearengine/response/ExerciseLapSummaryResponse;", "lapSummary", "d", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ExerciseUpdateListenerEvent a(@NotNull AvailabilityResponse availability) {
            Intrinsics.checkNotNullParameter(availability, "availability");
            EventsProto$ExerciseUpdateListenerEvent eventsProto$ExerciseUpdateListenerEventBuild = EventsProto$ExerciseUpdateListenerEvent.newBuilder().setAvailabilityResponse(availability.getProto()).build();
            Intrinsics.checkNotNullExpressionValue(eventsProto$ExerciseUpdateListenerEventBuild, "newBuilder().setAvailabi…ailability.proto).build()");
            return new ExerciseUpdateListenerEvent(eventsProto$ExerciseUpdateListenerEventBuild);
        }

        @JvmStatic
        @NotNull
        public final ExerciseUpdateListenerEvent b(@NotNull ExerciseExtraInfoResponse extraInfo) {
            Intrinsics.checkNotNullParameter(extraInfo, "extraInfo");
            EventsProto$ExerciseUpdateListenerEvent eventsProto$ExerciseUpdateListenerEventBuild = EventsProto$ExerciseUpdateListenerEvent.newBuilder().setExerciseExtraInfoResponse(extraInfo.getProto()).build();
            Intrinsics.checkNotNullExpressionValue(eventsProto$ExerciseUpdateListenerEventBuild, "newBuilder().setExercise…(extraInfo.proto).build()");
            return new ExerciseUpdateListenerEvent(eventsProto$ExerciseUpdateListenerEventBuild);
        }

        @JvmStatic
        @NotNull
        public final ExerciseUpdateListenerEvent c(@NotNull ExerciseUpdateResponse exerciseUpdate) {
            Intrinsics.checkNotNullParameter(exerciseUpdate, "exerciseUpdate");
            EventsProto$ExerciseUpdateListenerEvent eventsProto$ExerciseUpdateListenerEventBuild = EventsProto$ExerciseUpdateListenerEvent.newBuilder().setExerciseUpdateResponse(exerciseUpdate.getProto()).build();
            Intrinsics.checkNotNullExpressionValue(eventsProto$ExerciseUpdateListenerEventBuild, "newBuilder().setExercise…ciseUpdate.proto).build()");
            return new ExerciseUpdateListenerEvent(eventsProto$ExerciseUpdateListenerEventBuild);
        }

        @JvmStatic
        @NotNull
        public final ExerciseUpdateListenerEvent d(@NotNull ExerciseLapSummaryResponse lapSummary) {
            Intrinsics.checkNotNullParameter(lapSummary, "lapSummary");
            EventsProto$ExerciseUpdateListenerEvent eventsProto$ExerciseUpdateListenerEventBuild = EventsProto$ExerciseUpdateListenerEvent.newBuilder().setLapSummaryResponse(lapSummary.getProto()).build();
            Intrinsics.checkNotNullExpressionValue(eventsProto$ExerciseUpdateListenerEventBuild, "newBuilder().setLapSumma…lapSummary.proto).build()");
            return new ExerciseUpdateListenerEvent(eventsProto$ExerciseUpdateListenerEventBuild);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b¸\u0006\u0000"}, d2 = {"com/oplus/ocs/wearengine/data/ProtoParcelable$Companion$newCreator$1", "Landroid/os/Parcelable$Creator;", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lcom/oplus/ocs/wearengine/data/ProtoParcelable;", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/data/ProtoParcelable;", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nProtoParcelable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoParcelable.kt\ncom/oplus/ocs/wearengine/data/ProtoParcelable$Companion$newCreator$1\n+ 2 ExerciseUpdateListenerEvent.kt\ncom/oplus/ocs/wearengine/bean/ExerciseUpdateListenerEvent\n*L\n1#1,69:1\n18#2:70\n*E\n"})
    public static final class b implements Parcelable.Creator<ExerciseUpdateListenerEvent> {
        @Override // android.os.Parcelable.Creator
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ExerciseUpdateListenerEvent createFromParcel(@NotNull Parcel source) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArrCreateByteArray = source.createByteArray();
            if (bArrCreateByteArray == null) {
                return null;
            }
            EventsProto$ExerciseUpdateListenerEvent from = EventsProto$ExerciseUpdateListenerEvent.parseFrom(bArrCreateByteArray);
            Intrinsics.checkNotNullExpressionValue(from, "parseFrom(it)");
            return new ExerciseUpdateListenerEvent(from);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExerciseUpdateListenerEvent[] newArray(int size) {
            return new ExerciseUpdateListenerEvent[size];
        }
    }

    public ExerciseUpdateListenerEvent(@NotNull EventsProto$ExerciseUpdateListenerEvent proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        this.proto = proto;
    }

    @JvmStatic
    @NotNull
    public static final ExerciseUpdateListenerEvent createAvailabilityUpdateEvent(@NotNull AvailabilityResponse availabilityResponse) {
        return INSTANCE.a(availabilityResponse);
    }

    @JvmStatic
    @NotNull
    public static final ExerciseUpdateListenerEvent createExerciseExtraInfoEvent(@NotNull ExerciseExtraInfoResponse exerciseExtraInfoResponse) {
        return INSTANCE.b(exerciseExtraInfoResponse);
    }

    @JvmStatic
    @NotNull
    public static final ExerciseUpdateListenerEvent createExerciseUpdateEvent(@NotNull ExerciseUpdateResponse exerciseUpdateResponse) {
        return INSTANCE.c(exerciseUpdateResponse);
    }

    @JvmStatic
    @NotNull
    public static final ExerciseUpdateListenerEvent createLapSummaryEvent(@NotNull ExerciseLapSummaryResponse exerciseLapSummaryResponse) {
        return INSTANCE.d(exerciseLapSummaryResponse);
    }

    @Override // com.oplus.ocs.wearengine.data.ProtoParcelable
    @NotNull
    public EventsProto$ExerciseUpdateListenerEvent getProto() {
        return this.proto;
    }
}
