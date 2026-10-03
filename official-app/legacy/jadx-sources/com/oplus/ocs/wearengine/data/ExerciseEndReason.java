package com.oplus.ocs.wearengine.data;

import androidx.annotation.RestrictTo;
import com.oplus.ocs.wearengine.proto.DataProto$ExerciseEndReason;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseEndReason;", "", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public @interface ExerciseEndReason {
    public static final int AUTO_END_MCU_ERROR = 7;
    public static final int AUTO_END_MISSING_LISTENER = 3;
    public static final int AUTO_END_PAUSE_EXPIRED = 2;
    public static final int AUTO_END_PERMISSION_LOST = 1;
    public static final int AUTO_END_PREPARE_EXPIRED = 6;
    public static final int AUTO_END_SUPERSEDED = 5;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int UNKNOWN = 0;
    public static final int USER_END = 4;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000e*\u00020\u0004H\u0000¢\u0006\u0002\b\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseEndReason$Companion;", "", "()V", "AUTO_END_MCU_ERROR", "", "AUTO_END_MISSING_LISTENER", "AUTO_END_PAUSE_EXPIRED", "AUTO_END_PERMISSION_LOST", "AUTO_END_PREPARE_EXPIRED", "AUTO_END_SUPERSEDED", LanConstants.OPERATOR_UNKNOWN, "USER_END", "fromProto", "proto", "Lcom/oplus/ocs/wearengine/proto/DataProto$ExerciseEndReason;", "fromProto$thirdparty_impl_release", "toProto", "toProto$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int AUTO_END_MCU_ERROR = 7;
        public static final int AUTO_END_MISSING_LISTENER = 3;
        public static final int AUTO_END_PAUSE_EXPIRED = 2;
        public static final int AUTO_END_PERMISSION_LOST = 1;
        public static final int AUTO_END_PREPARE_EXPIRED = 6;
        public static final int AUTO_END_SUPERSEDED = 5;
        public static final int UNKNOWN = 0;
        public static final int USER_END = 4;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DataProto$ExerciseEndReason.values().length];
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_USER_END.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_SUPERSEDED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_MCU_ERROR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public final int fromProto$thirdparty_impl_release(@NotNull DataProto$ExerciseEndReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                default:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                case 5:
                    return 4;
                case 6:
                    return 5;
                case 7:
                    return 6;
                case 8:
                    return 7;
            }
        }

        @NotNull
        public final DataProto$ExerciseEndReason toProto$thirdparty_impl_release(int i) {
            switch (i) {
                case 0:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_UNKNOWN;
                case 1:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PERMISSION_LOST;
                case 2:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PAUSE_EXPIRED;
                case 3:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_MISSING_LISTENER;
                case 4:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_USER_END;
                case 5:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_SUPERSEDED;
                case 6:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_PREPARE_EXPIRED;
                case 7:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_AUTO_END_MCU_ERROR;
                default:
                    return DataProto$ExerciseEndReason.EXERCISE_END_REASON_UNKNOWN;
            }
        }
    }
}
