package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/tii;", "", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class tii {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.tii$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/tii$a;", "", "", "type", "Landroid/content/Context;", "context", "", "b", "", "value", "c", "", "", "originDataList", "a", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSportStatUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportStatUtil.kt\ncom/heytap/sports/home/util/SportStatUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,169:1\n1855#2,2:170\n1549#2:172\n1620#2,3:173\n*S KotlinDebug\n*F\n+ 1 SportStatUtil.kt\ncom/heytap/sports/home/util/SportStatUtil$Companion\n*L\n144#1:170,2\n165#1:172\n165#1:173,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<Float> a(@NotNull List<Float> originDataList) {
            Intrinsics.checkNotNullParameter(originDataList, "originDataList");
            float fSumOfFloat = CollectionsKt___CollectionsKt.sumOfFloat(originDataList);
            float fFloatValue = 0.0f;
            if (!originDataList.isEmpty()) {
                if (!(fSumOfFloat == 0.0f)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = originDataList.iterator();
                    while (it.hasNext()) {
                        BigDecimal p = new BigDecimal(String.valueOf((100 * ((Number) it.next()).floatValue()) / fSumOfFloat)).setScale(1, RoundingMode.HALF_UP);
                        fFloatValue += p.floatValue();
                        Intrinsics.checkNotNullExpressionValue(p, "p");
                        arrayList.add(p);
                    }
                    int iFloatValue = ((int) (new BigDecimal(String.valueOf(fFloatValue)).setScale(1, RoundingMode.HALF_UP).floatValue() * 10)) - 1000;
                    while (iFloatValue != 0) {
                        if (!(iFloatValue <= arrayList.size() && (-arrayList.size()) <= iFloatValue)) {
                            break;
                        }
                        if (iFloatValue > 0) {
                            int i = iFloatValue - 1;
                            BigDecimal bigDecimalSubtract = ((BigDecimal) arrayList.get(i)).subtract(new BigDecimal(0.1d));
                            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                            BigDecimal scale = bigDecimalSubtract.setScale(1, RoundingMode.HALF_UP);
                            Intrinsics.checkNotNullExpressionValue(scale, "percentList[index].minus…(1, RoundingMode.HALF_UP)");
                            arrayList.set(i, scale);
                            iFloatValue--;
                        } else {
                            iFloatValue++;
                            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList) + iFloatValue;
                            BigDecimal bigDecimalAdd = ((BigDecimal) arrayList.get(lastIndex)).add(new BigDecimal(0.1d));
                            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                            BigDecimal scale2 = bigDecimalAdd.setScale(1, RoundingMode.HALF_UP);
                            Intrinsics.checkNotNullExpressionValue(scale2, "percentList[index].plus(…(1, RoundingMode.HALF_UP)");
                            arrayList.set(lastIndex, scale2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Float.valueOf(((BigDecimal) it2.next()).floatValue()));
                    }
                    return arrayList2;
                }
            }
            return CollectionsKt__CollectionsJVMKt.listOf(Float.valueOf(0.0f));
        }

        @NotNull
        public final String b(int type, @Nullable Context context) {
            if (context == null) {
                return "";
            }
            switch (type) {
                case 600008:
                    String string = context.getString(R$string.sports_stat_badminton_hand_num);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n                    co…nd_num)\n                }");
                    return string;
                case 600009:
                case 600017:
                case 600018:
                case 600019:
                case 600021:
                case 600022:
                case 600023:
                case 600024:
                case 600026:
                case 600029:
                case 600031:
                default:
                    return "";
                case 600010:
                    String string2 = context.getString(R$string.sports_stat_aerobic_te);
                    Intrinsics.checkNotNullExpressionValue(string2, "{\n                    co…bic_te)\n                }");
                    return string2;
                case 600011:
                    String string3 = context.getString(R$string.sports_stat_vo2_max);
                    Intrinsics.checkNotNullExpressionValue(string3, "{\n                    co…o2_max)\n                }");
                    return string3;
                case 600012:
                    String string4 = context.getString(R$string.sports_running_power_card_title);
                    Intrinsics.checkNotNullExpressionValue(string4, "{\n                    co…_title)\n                }");
                    return string4;
                case 600013:
                    String string5 = context.getString(R$string.sports_stat_avg_stance);
                    Intrinsics.checkNotNullExpressionValue(string5, "{\n                    co…stance)\n                }");
                    return string5;
                case 600014:
                    String string6 = context.getString(R$string.sports_stat_avg_vertical);
                    Intrinsics.checkNotNullExpressionValue(string6, "{\n                    co…rtical)\n                }");
                    return string6;
                case 600015:
                    String string7 = context.getString(R$string.sports_stat_avg_vertical_ratio);
                    Intrinsics.checkNotNullExpressionValue(string7, "{\n                    co…_ratio)\n                }");
                    return string7;
                case 600016:
                    String string8 = context.getString(R$string.sports_stat_avg_baclance);
                    Intrinsics.checkNotNullExpressionValue(string8, "{\n                    co…clance)\n                }");
                    return string8;
                case 600020:
                    String string9 = context.getString(R$string.sports_stat_avg_speed);
                    Intrinsics.checkNotNullExpressionValue(string9, "{\n                    co…_speed)\n                }");
                    return string9;
                case 600025:
                    String string10 = context.getString(R$string.sports_stat_avg_stride);
                    Intrinsics.checkNotNullExpressionValue(string10, "{\n                    co…stride)\n                }");
                    return string10;
                case 600027:
                    String string11 = context.getString(R$string.sports_stat_amount_run);
                    Intrinsics.checkNotNullExpressionValue(string11, "{\n                    co…nt_run)\n                }");
                    return string11;
                case 600028:
                    String string12 = context.getString(R$string.sports_stat_calorie);
                    Intrinsics.checkNotNullExpressionValue(string12, "{\n                    co…alorie)\n                }");
                    return string12;
                case 600030:
                    String string13 = context.getString(R$string.sports_stat_duration);
                    Intrinsics.checkNotNullExpressionValue(string13, "{\n                    co…ration)\n                }");
                    return string13;
                case 600032:
                    String string14 = context.getString(R$string.sports_stat_time);
                    Intrinsics.checkNotNullExpressionValue(string14, "{\n                    co…t_time)\n                }");
                    return string14;
            }
        }

        public final double c(double value, int type) {
            int iIntValue;
            if (value <= 0.0d) {
                return 0.0d;
            }
            switch (type) {
                case 600027:
                    return new BigDecimal(String.valueOf(fji.b(Double.valueOf(value / 1000.0d)))).setScale(2, RoundingMode.DOWN).doubleValue();
                case 600028:
                    iIntValue = new BigDecimal(String.valueOf((int) fji.d(value / ((double) 1000)))).setScale(1, RoundingMode.DOWN).intValue();
                    break;
                case 600029:
                default:
                    return new BigDecimal(String.valueOf(value)).setScale(1, RoundingMode.DOWN).doubleValue();
                case 600030:
                    iIntValue = new BigDecimal(String.valueOf(value / ((double) 60000))).setScale(1, RoundingMode.DOWN).intValue();
                    break;
            }
            return iIntValue;
        }
    }
}
