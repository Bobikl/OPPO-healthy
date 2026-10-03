package com.heytap.health.menstrual_period.datahandler;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.menstrual_period.data.SymptomType;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/SymptomStateHelper;", "", "Companion", "a", "SymptomState", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SymptomStateHelper {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/SymptomStateHelper$SymptomState;", "", "(Ljava/lang/String;I)V", "CHECKED", "NORMAL", "UNCHECKED", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum SymptomState {
        CHECKED,
        NORMAL,
        UNCHECKED
    }

    /* JADX INFO: renamed from: com.heytap.health.menstrual_period.datahandler.SymptomStateHelper$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/SymptomStateHelper$a;", "", "Lcom/heytap/health/menstrual_period/datahandler/SymptomStateHelper$SymptomState;", "checkState", "Lcom/heytap/health/menstrual_period/data/SymptomType;", "symptomType", b2n.g, "", "symptomValue", "Lcom/heytap/health/menstrual_period/data/SymptomType$SymptomValueBase;", "symptomValueBase", "c", "a", "", "d", MapSchema.FIELD_NAME_ENTRY, "b", "f", b2n.f, "<init>", "()V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return 1 << (SymptomType.PhysicalSymptom.VALUE.Normal.getBitPos() - 1);
        }

        public final int b() {
            return 1 << (SymptomType.Skin.VALUE.Good.getBitPos() - 1);
        }

        @NotNull
        public final SymptomState c(int symptomValue, @NotNull SymptomType.SymptomValueBase symptomValueBase, @NotNull SymptomType symptomType) {
            Intrinsics.checkNotNullParameter(symptomValueBase, "symptomValueBase");
            Intrinsics.checkNotNullParameter(symptomType, "symptomType");
            if (symptomType.getTypeValue() == SymptomType.Type.PhysicalSymptom && (symptomValueBase instanceof SymptomType.PhysicalSymptom.VALUE)) {
                boolean zD = d(symptomValue);
                boolean zE = e(symptomValue);
                SymptomType.PhysicalSymptom.VALUE value = SymptomType.PhysicalSymptom.VALUE.Normal;
                if (symptomValueBase == value && zE && !zD) {
                    return SymptomState.UNCHECKED;
                }
                if (symptomValueBase != value && zD && !zE) {
                    return SymptomState.UNCHECKED;
                }
            }
            if (symptomType.getTypeValue() == SymptomType.Type.Skin && (symptomValueBase instanceof SymptomType.Skin.VALUE)) {
                boolean zF = f(symptomValue);
                boolean zG = g(symptomValue);
                SymptomType.Skin.VALUE value2 = SymptomType.Skin.VALUE.Good;
                if (symptomValueBase == value2 && zG && !zF) {
                    return SymptomState.UNCHECKED;
                }
                if (symptomValueBase != value2 && zF && !zG) {
                    return SymptomState.UNCHECKED;
                }
            }
            if (symptomType.isValueChecked(symptomValueBase, symptomValue)) {
                return SymptomState.CHECKED;
            }
            return (symptomValue == 0 || symptomType.isMultiChoice()) ? SymptomState.NORMAL : SymptomState.UNCHECKED;
        }

        public final boolean d(int symptomValue) {
            return (a() & symptomValue) != 0;
        }

        public final boolean e(int symptomValue) {
            return ((~a()) & symptomValue) != 0;
        }

        public final boolean f(int symptomValue) {
            return (b() & symptomValue) != 0;
        }

        public final boolean g(int symptomValue) {
            return ((~b()) & symptomValue) != 0;
        }

        @NotNull
        public final SymptomState h(@NotNull SymptomState checkState, @NotNull SymptomType symptomType) {
            Intrinsics.checkNotNullParameter(checkState, "checkState");
            Intrinsics.checkNotNullParameter(symptomType, "symptomType");
            SymptomState symptomState = SymptomState.CHECKED;
            if (checkState == symptomState) {
                return symptomType.isMultiChoice() ? SymptomState.NORMAL : SymptomState.UNCHECKED;
            }
            return symptomState;
        }
    }
}
