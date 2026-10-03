package com.oplus.aiunit.vision;

import com.heytap.health.cervical_vertebra.datamodel.Procedure;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/z1c;", "", "", "angle1", "angle2", "", "d", "j", "Lcom/heytap/health/cervical_vertebra/datamodel/Procedure;", "procedure", "angle", "c", "a", "b", "", "timestamp", "", MapSchema.FIELD_NAME_KEY, "f", MapSchema.FIELD_NAME_ENTRY, "", b2n.f, "Ljava/util/Date;", ClickApiEntity.TIME, "i", b2n.g, "<init>", "()V", "Companion", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class z1c {
    public static final int ANGLE_GRADE_EXCELLENT = 2;
    public static final int ANGLE_GRADE_NORMAL = 1;
    public static final int ANGLE_GRADE_UNQUALIFIED = 0;
    public static final int BACKWARD_ANGLE_EXCELLENT = 85;
    public static final int BACKWARD_ANGLE_NORMAL = 70;
    public static final int FLEXION_ANGLE_EXCELLENT = 45;
    public static final int FLEXION_ANGLE_NORMAL = 30;
    public static final int FORWARD_ANGLE_EXCELLENT = 55;
    public static final int FORWARD_ANGLE_NORMAL = 40;
    public static final int ROTATE_ANGLE_EXCELLENT = 80;
    public static final int ROTATE_ANGLE_NORMAL = 60;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Procedure.values().length];
            try {
                iArr[Procedure.ROTATE_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Procedure.ROTATE_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Procedure.LEFT_FLEXION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Procedure.RIGHT_FLEXION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Procedure.FORWARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Procedure.BACKWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean a(@NotNull Procedure procedure, int angle) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        return b(procedure, angle) == 2;
    }

    public final int b(@NotNull Procedure procedure, int angle) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        switch (b.$EnumSwitchMapping$0[procedure.ordinal()]) {
            case 1:
            case 2:
                if (angle >= 60) {
                    if (angle > 80) {
                        return 2;
                    }
                    return 1;
                }
                break;
            case 3:
            case 4:
                if (angle >= 30) {
                    if (angle > 45) {
                        return 2;
                    }
                    return 1;
                }
                break;
            case 5:
                if (angle >= 40) {
                    if (angle > 55) {
                        return 2;
                    }
                    return 1;
                }
                break;
            case 6:
                if (angle >= 70) {
                    if (angle > 85) {
                        return 2;
                    }
                    return 1;
                }
                break;
            default:
                return -1;
        }
        return 0;
    }

    public final boolean c(@NotNull Procedure procedure, int angle) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        return b(procedure, angle) == 0;
    }

    public final boolean d(int angle1, int angle2) {
        return g(angle1, angle2) <= 10.0f;
    }

    public final int e(@NotNull Procedure procedure) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        switch (b.$EnumSwitchMapping$0[procedure.ordinal()]) {
            case 1:
            case 2:
                return 80;
            case 3:
            case 4:
                return 45;
            case 5:
                return 55;
            case 6:
                return 85;
            default:
                return 0;
        }
    }

    public final int f(@NotNull Procedure procedure) {
        Intrinsics.checkNotNullParameter(procedure, "procedure");
        switch (b.$EnumSwitchMapping$0[procedure.ordinal()]) {
            case 1:
            case 2:
                return 60;
            case 3:
            case 4:
                return 30;
            case 5:
                return 40;
            case 6:
                return 70;
            default:
                return 0;
        }
    }

    public final float g(int angle1, int angle2) {
        float fAbs = Math.abs(angle1 - angle2);
        return Math.max(fAbs / angle1, fAbs / angle2) * 100;
    }

    public final boolean h(Date time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        return simpleDateFormat.format(time).equals(simpleDateFormat.format(new Date()));
    }

    public final boolean i(Date time) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        return simpleDateFormat.format(time).equals(simpleDateFormat.format(new Date()));
    }

    public final boolean j(int angle1, int angle2) {
        return g(angle1, angle2) <= 15.0f;
    }

    @NotNull
    public final String k(long timestamp) {
        Date date = new Date(timestamp);
        if (i(date)) {
            String strG = fn9.g(timestamp, "HHmm");
            Intrinsics.checkNotNullExpressionValue(strG, "{\n            ICUFormatU…estamp, \"HHmm\")\n        }");
            return strG;
        }
        String strG2 = h(date) ? fn9.g(timestamp, "MMMddHHmm") : fn9.g(timestamp, "yyyyMMMddHHmm");
        Intrinsics.checkNotNullExpressionValue(strG2, "{\n            if (isThis…)\n            }\n        }");
        return strG2;
    }
}
