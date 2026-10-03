package com.heytap.sports.map.modules.map;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.coloros.sceneservice.dataprovider.bean.SceneStatusInfo;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gw4;
import com.oplus.aiunit.vision.oei;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/sports/map/modules/map/a;", "", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final int[] a = {720, 450, 360, 300, 200, 144};

    @NotNull
    public static final int[] b = {2400, 1800, 1200, 900, 720, 600};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f7889c = {2400, 1800, 1200, 900, 720, 600};

    @NotNull
    public static final int[] d = {600, 570, TypedValues.PositionType.TYPE_POSITION_TYPE, 450, 390, 330};

    /* JADX INFO: renamed from: com.heytap.sports.map.modules.map.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u001e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004H\u0002R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006#"}, d2 = {"Lcom/heytap/sports/map/modules/map/a$a;", "", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "pace", "", ParserTag.TAG_COLORS, "d", "mode", "", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/gw4;", "dataSet", "", "a", "f", "startColor", "endColor", ParserTag.TAG_PERCENT, "c", "totalDistance", "b", "MINUTE_SECOND", "I", "", "TAG", "Ljava/lang/String;", "paceListOutdoor", "[I", "paceListRideAndSki", "paceListRun", "paceListWalk", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTraceColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraceColor.kt\ncom/heytap/sports/map/modules/map/TraceColor$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n13404#2,2:209\n13406#2:212\n1#3:211\n*S KotlinDebug\n*F\n+ 1 TraceColor.kt\ncom/heytap/sports/map/modules/map/TraceColor$Companion\n*L\n95#1:209,2\n95#1:212\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00af  */
        /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
        public final void a(@NotNull gw4 dataSet) {
            int i;
            double dDoubleValue;
            int i2;
            Intrinsics.checkNotNullParameter(dataSet, "dataSet");
            int iB = b(dataSet.getTotalDistance());
            if (dataSet.g().size() > iB) {
                ArrayList arrayList = new ArrayList();
                int size = dataSet.g().size();
                double dDoubleValue2 = 0.0d;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i3++;
                    dDoubleValue2 += dataSet.g().get(i4).doubleValue();
                    if (i3 >= iB || i4 == dataSet.g().size() - 1) {
                        arrayList.add(Double.valueOf(dDoubleValue2 / ((double) i3)));
                        dDoubleValue2 = 0.0d;
                        i3 = 0;
                    }
                }
                if (arrayList.isEmpty()) {
                    a7b.f("TraceColor", "mDataSet.speeds.isEmpty");
                    return;
                }
                int size2 = dataSet.g().size();
                for (int i5 = 0; i5 < size2; i5++) {
                    int i6 = i5 % iB;
                    int i7 = (iB * 2) / 3;
                    if (i6 > i7) {
                        int i8 = i5 / iB;
                        if (i8 + 1 < arrayList.size()) {
                            List listSubList = arrayList.subList(i8, i8 + 2);
                            dDoubleValue = ((Number) listSubList.get(0)).doubleValue() + (((((Number) listSubList.get(1)).doubleValue() - ((Number) listSubList.get(0)).doubleValue()) * ((double) (i6 - i7))) / ((double) i7));
                        } else {
                            i = iB / 3;
                            if (i6 < i || (i2 = i5 / iB) <= 0) {
                                dDoubleValue = ((Number) arrayList.get(i5 / iB)).doubleValue();
                            } else {
                                int i9 = i2 - 1;
                                List listSubList2 = arrayList.subList(i9, i9 + 2);
                                dDoubleValue = ((Number) listSubList2.get(0)).doubleValue() + (((((Number) listSubList2.get(1)).doubleValue() - ((Number) listSubList2.get(0)).doubleValue()) * ((double) (i6 + i))) / ((double) i7));
                            }
                        }
                    } else {
                        i = iB / 3;
                        if (i6 < i) {
                            dDoubleValue = ((Number) arrayList.get(i5 / iB)).doubleValue();
                        } else {
                            dDoubleValue = ((Number) arrayList.get(i5 / iB)).doubleValue();
                        }
                    }
                    dataSet.g().set(i5, Double.valueOf(dDoubleValue)).doubleValue();
                }
            }
        }

        public final int b(double totalDistance) {
            if (totalDistance <= 4000) {
                return 60;
            }
            if (totalDistance <= SceneStatusInfo.SceneConstant.TRIP_IN_JOURNEY) {
                return 90;
            }
            if (totalDistance <= 8000) {
                return 120;
            }
            if (totalDistance <= 10000) {
                return 150;
            }
            if (totalDistance <= 15000) {
                return 180;
            }
            if (totalDistance <= 20000) {
                return 210;
            }
            return totalDistance <= ((double) 40000) ? 240 : 480;
        }

        public final int c(int startColor, int endColor, double percent) {
            int i = (startColor >> 24) & 255;
            int i2 = (startColor >> 16) & 255;
            int i3 = (startColor >> 8) & 255;
            int i4 = startColor & 255;
            return (((int) (((double) i) + (((double) (((endColor >> 24) & 255) - i)) * percent))) << 24) | 0 | (((int) (((double) i2) + (((double) (((endColor >> 16) & 255) - i2)) * percent))) << 16) | (((int) (((double) i3) + (((double) (((endColor >> 8) & 255) - i3)) * percent))) << 8) | ((int) (((double) i4) + (((double) ((endColor & 255) - i4)) * percent)));
        }

        public final int d(int sportMode, double pace, @NotNull int[] colors) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            int[] iArrF = f(sportMode);
            int length = iArrF.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    int i3 = colors[ArraysKt___ArraysKt.getLastIndex(colors) - 1];
                    int iLast = ArraysKt___ArraysKt.last(colors);
                    double dLast = ArraysKt___ArraysKt.last(iArrF);
                    return c(i3, iLast, (dLast - pace) / dLast);
                }
                int i4 = iArrF[i];
                int i5 = i2 + 1;
                if (pace > ((double) i4)) {
                    if (i2 == 0) {
                        return colors[0];
                    }
                    Companion companion = a.INSTANCE;
                    int i6 = i2 - 1;
                    int i7 = colors[i6];
                    int i8 = colors[i2];
                    int i9 = iArrF[i6];
                    return companion.c(i7, i8, (((double) i9) - pace) / ((double) (i9 - i4)));
                }
                i++;
                i2 = i5;
            }
        }

        public final boolean e(int mode) {
            return oei.j(mode) || oei.m(mode) || oei.h(mode) || oei.i(mode) || oei.k(mode);
        }

        public final int[] f(int sportMode) {
            if (oei.j(sportMode)) {
                return a.d;
            }
            if (oei.m(sportMode)) {
                return a.f7889c;
            }
            if (oei.h(sportMode)) {
                return a.b;
            }
            return (oei.i(sportMode) || oei.k(sportMode)) ? a.a : a.d;
        }
    }
}
