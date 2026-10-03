package com.oplus.ocs.wearengine.data;

import androidx.annotation.RestrictTo;
import com.oplus.ocs.wearengine.proto.DataProto$ExerciseTrackedStatus;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseTrackedStatus;", "", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public @interface ExerciseTrackedStatus {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int NO_EXERCISE_IN_PROGRESS = 3;
    public static final int OTHER_APP_IN_PROGRESS = 1;
    public static final int OWNED_EXERCISE_IN_PROGRESS = 2;
    public static final int UNKNOWN = 0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0001¢\u0006\u0002\b\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseTrackedStatus$Companion;", "", "()V", "NO_EXERCISE_IN_PROGRESS", "", "OTHER_APP_IN_PROGRESS", "OWNED_EXERCISE_IN_PROGRESS", LanConstants.OPERATOR_UNKNOWN, "fromProto", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$ExerciseTrackedStatus;", "toProto", "toProto$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int NO_EXERCISE_IN_PROGRESS = 3;
        public static final int OTHER_APP_IN_PROGRESS = 1;
        public static final int OWNED_EXERCISE_IN_PROGRESS = 2;
        public static final int UNKNOWN = 0;

        private Companion() {
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public final int fromProto(@NotNull DataProto$ExerciseTrackedStatus proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return proto.getNumber();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        @NotNull
        public final DataProto$ExerciseTrackedStatus toProto$thirdparty_impl_release(int i) {
            DataProto$ExerciseTrackedStatus dataProto$ExerciseTrackedStatusForNumber = DataProto$ExerciseTrackedStatus.forNumber(i);
            return dataProto$ExerciseTrackedStatusForNumber == null ? DataProto$ExerciseTrackedStatus.EXERCISE_TRACKED_STATUS_UNKNOWN : dataProto$ExerciseTrackedStatusForNumber;
        }
    }
}
