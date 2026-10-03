package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.camera.core.processing.util.GLUtils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.wristtemperature.WristTemperature;
import com.heytap.databaseengine.model.wristtemperature.WristTemperatureStat;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import com.heytap.health.wrist_temperature.R$string;
import io.protostuff.MapSchema;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/m6m;", "", "", "startTime", "endTime", "", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperature;", "dataList", "Lcom/oplus/aiunit/vision/n6m;", "d", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "f", c7n.f, "", "Ljava/time/LocalDate;", MapSchema.FIELD_NAME_ENTRY, "timestamp", "Ljava/time/LocalDateTime;", "j", "i", "wristTemperature", "", c7n.g, "<init>", "()V", "Companion", "a", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
public final class m6m {
    public static final float ABNORMAL_DATA = 10000.0f;
    public static final float INVALID_DATA = -10000.0f;
    public static final float MAX_VALUE = 8.0f;
    public static final float MIN_VALUE = -8.0f;
    public static final int ONEDAY = 86400000;
    public static final int ONE_HOUR = 3600000;
    public static final int ONE_MINUTE = 60000;

    @NotNull
    public static final String TAG = "WristDataRegroup";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final DecimalFormat a = new DecimalFormat(GLUtils.VERSION_UNKNOWN);
    public static int b = 1;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.m6m$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011J\"\u0010\u001a\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017R\"\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0014\u0010&\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001cR\u0014\u0010(\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u0014\u0010)\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/m6m$a;", "", "Lcom/oplus/aiunit/vision/n6m;", "wristDayBean", c7n.g, "", DBWristTemperatureStat.SYMPTOMS, DBWristTemperatureStat.ACTIONS, "Landroid/content/Context;", "context", "", "", "b", "", "value", c7n.f, "c", "Lcom/heytap/databaseengine/model/wristtemperature/WristTemperatureStat;", "wristTemperatureStat", "f", "d", MapSchema.FIELD_NAME_ENTRY, "statList", "", "detailsList", "", "j", "interval", "I", "a", "()I", "i", "(I)V", "ABNORMAL_DATA", UserInfo.SEX_FEMALE, "INVALID_DATA", "MAX_VALUE", "MIN_VALUE", "ONEDAY", "ONE_HOUR", "ONE_MINUTE", "TAG", "Ljava/lang/String;", "Ljava/text/DecimalFormat;", "decimalFormat", "Ljava/text/DecimalFormat;", "<init>", "()V", "wrist_temperature_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return m6m.b;
        }

        @NotNull
        public final List<String> b(int symptoms, int actions, @Nullable Context context) {
            ArrayList arrayList = new ArrayList();
            if (context != null && actions != 255 && symptoms != 255) {
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(R$string.health_wrist_symptoms_Im_fine), context.getString(R$string.health_wrist_symptoms_have_fever), context.getString(R$string.health_wrist_symptoms_have_cold), context.getString(R$string.health_wrist_symptoms_weary), context.getString(R$string.health_wrist_symptoms_chill), context.getString(R$string.health_wrist_symptoms_hot)});
                List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{context.getString(R$string.health_wrist_actions_drink_alcohol), context.getString(R$string.health_wrist_actions_sport), context.getString(R$string.health_wrist_actions_stay_up_late)});
                for (int i = 0; i < 6; i++) {
                    int i2 = 1 << i;
                    boolean z = (symptoms & i2) == i2;
                    boolean z2 = (actions & i2) == i2;
                    if (z && i < listListOf.size()) {
                        Object obj = listListOf.get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "symptomsList[i]");
                        arrayList.add(obj);
                    }
                    if (z2 && i < listListOf2.size()) {
                        Object obj2 = listListOf2.get(i);
                        Intrinsics.checkNotNullExpressionValue(obj2, "actionsList[i]");
                        arrayList.add(obj2);
                    }
                }
            }
            return arrayList;
        }

        public final float c(float value) {
            if (value > 8.0f) {
                value = 8.0f;
            }
            if (value < -8.0f) {
                value = -8.0f;
            }
            return new BigDecimal(String.valueOf(value)).setScale(1, 4).floatValue();
        }

        public final float d(@NotNull WristTemperatureStat wristTemperatureStat) {
            Intrinsics.checkNotNullParameter(wristTemperatureStat, "wristTemperatureStat");
            if (wristTemperatureStat.getDayBaseLineWristTemperature() == 0) {
                return -10000.0f;
            }
            float max = wristTemperatureStat.getMax() / 100.0f;
            float f = 8.0f;
            if (max <= 8.0f) {
                f = -8.0f;
                if (max >= -8.0f) {
                    return max;
                }
            }
            return f;
        }

        public final float e(@NotNull WristTemperatureStat wristTemperatureStat) {
            Intrinsics.checkNotNullParameter(wristTemperatureStat, "wristTemperatureStat");
            if (wristTemperatureStat.getDayBaseLineWristTemperature() == 0) {
                return -10000.0f;
            }
            float min = wristTemperatureStat.getMin() / 100.0f;
            float f = 8.0f;
            if (min <= 8.0f) {
                f = -8.0f;
                if (min >= -8.0f) {
                    return min;
                }
            }
            return f;
        }

        public final float f(@NotNull WristTemperatureStat wristTemperatureStat) {
            Intrinsics.checkNotNullParameter(wristTemperatureStat, "wristTemperatureStat");
            if (wristTemperatureStat.getDayBaseLineWristTemperature() == 0) {
                return -10000.0f;
            }
            float fFloatValue = new BigDecimal(String.valueOf((wristTemperatureStat.getWristTemperature() - wristTemperatureStat.getDayBaseLineWristTemperature()) / 100.0f)).setScale(1, 4).floatValue();
            float f = 8.0f;
            if (fFloatValue <= 8.0f) {
                f = -8.0f;
                if (fFloatValue >= -8.0f) {
                    return fFloatValue;
                }
            }
            return f;
        }

        @NotNull
        public final String g(float value, @Nullable Context context) {
            m6m.a.setRoundingMode(RoundingMode.HALF_UP);
            if (value > 8.0f) {
                value = 8.0f;
            }
            if (value < -8.0f) {
                value = -8.0f;
            }
            float fFloatValue = new BigDecimal(String.valueOf(value)).setScale(1, 4).floatValue();
            if (fFloatValue <= 0.0f) {
                return String.valueOf(fFloatValue);
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strO = kjk.o(context, R$string.health_wrist_temperature_format_data2);
            Intrinsics.checkNotNullExpressionValue(strO, "getString(context, R.str…temperature_format_data2)");
            String str = String.format(strO, Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @NotNull
        public final n6m h(@NotNull n6m wristDayBean) {
            int i;
            Intrinsics.checkNotNullParameter(wristDayBean, "wristDayBean");
            long jA = wristDayBean.getEndTimestamp() - wristDayBean.getStartTimestamp();
            List<WristValue> listC = wristDayBean.c();
            ArrayList arrayList = new ArrayList();
            List<WristValue> list = listC;
            int iA = 0;
            if ((list == null || list.isEmpty()) || listC.size() == 1) {
                return wristDayBean;
            }
            float fC = listC.get(0).getValue();
            float fC2 = listC.get(0).getValue();
            int size = listC.size();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                if (fC < listC.get(i4).getValue()) {
                    fC = listC.get(i4).getValue();
                    i2 = i4;
                }
                if (fC2 > listC.get(i4).getValue()) {
                    fC2 = listC.get(i4).getValue();
                    i3 = i4;
                }
            }
            if (jA > 28800000) {
                i = 6;
            } else if (jA <= 14400000 || jA > 28800000) {
                i = (jA <= 3600000 || jA > 14400000) ? 1 : 2;
            } else {
                i = 4;
            }
            i(i);
            while (iA <= listC.size() - 1) {
                arrayList.add(listC.get(iA));
                iA += a();
            }
            if (iA != listC.size() - 1) {
                arrayList.add(listC.get(listC.size() - 1));
            }
            arrayList.set(i2 / a(), listC.get(i2));
            arrayList.set(i3 / a(), listC.get(i3));
            return new n6m(wristDayBean.getStartTimestamp(), wristDayBean.getEndTimestamp(), arrayList);
        }

        public final void i(int i) {
            m6m.b = i;
        }

        public final void j(@NotNull List<WristTemperatureStat> statList, @NotNull List<n6m> detailsList) {
            Intrinsics.checkNotNullParameter(statList, "statList");
            Intrinsics.checkNotNullParameter(detailsList, "detailsList");
            int size = detailsList.size();
            for (int i = 0; i < size; i++) {
                long jA = detailsList.get(i).getEndTimestamp();
                pr8 pr8Var = pr8.INSTANCE;
                int iE = pr8Var.e(pr8Var.n(jA));
                int size2 = statList.size();
                boolean z = true;
                for (int i2 = 0; i2 < size2; i2++) {
                    if (iE == statList.get(i2).getDate()) {
                        z = false;
                    }
                }
                if (z) {
                    m8b.f(m6m.TAG, "shield " + iE + " data");
                    n6m n6mVar = detailsList.get(i);
                    n6mVar.f(CollectionsKt__CollectionsKt.arrayListOf(new WristValue(-10000.0f, n6mVar.getStartTimestamp(), n6mVar.getEndTimestamp())));
                }
            }
        }
    }

    @NotNull
    public final List<n6m> d(long startTime, long endTime, @NotNull List<WristTemperature> dataList) {
        ArrayList arrayList;
        List<WristTemperature> dataList2 = dataList;
        Intrinsics.checkNotNullParameter(dataList2, "dataList");
        ArrayList arrayList2 = new ArrayList();
        long j2 = 86400000;
        long j3 = (endTime - startTime) / j2;
        long j4 = 0;
        while (j4 < j3) {
            long epochMilli = j(startTime).plusDays(j4).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long epochMilli2 = j(startTime + j2).plusDays(j4).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            n6m n6mVar = new n6m(0L, 0L, null, 7, null);
            ArrayList arrayList3 = new ArrayList();
            int size = dataList.size();
            long j5 = j3;
            int i = 0;
            while (i < size) {
                if (dataList2.get(i).getStartTimestamp() >= epochMilli && dataList2.get(i).getEndTimestamp() <= epochMilli2) {
                    WristTemperature wristTemperature = dataList2.get(i);
                    arrayList3.add(new WristValue(h(wristTemperature), wristTemperature.getStartTimestamp(), wristTemperature.getEndTimestamp()));
                }
                i++;
                dataList2 = dataList;
            }
            if (arrayList3.isEmpty()) {
                arrayList = arrayList3;
                arrayList.add(new WristValue(-10000.0f, epochMilli, epochMilli2));
            } else {
                arrayList = arrayList3;
            }
            n6mVar.e(arrayList.get(0).getStartTimestamp());
            n6mVar.d(arrayList.get(arrayList.size() - 1).getEndTimestamp() - ((long) 60000));
            n6mVar.f(arrayList);
            arrayList2.add(n6mVar);
            j4++;
            j3 = j5;
            dataList2 = dataList;
        }
        return arrayList2;
    }

    @NotNull
    public final Map<LocalDate, WristTemperatureStat> e(long startTime, long endTime, @NotNull List<WristTemperatureStat> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j2 = 1000;
        long jM = pr8.INSTANCE.m(startTime, endTime + j2);
        long j3 = 0;
        while (j3 < jM) {
            long epochMilli = j(startTime).plusDays(j3).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            j3++;
            long epochMilli2 = j(startTime).plusDays(j3).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - j2;
            int size = dataList.size();
            long j4 = j2;
            int i = 0;
            boolean z = false;
            while (i < size) {
                int i2 = size;
                long jG = pr8.INSTANCE.g(dataList.get(i).getDate());
                if (epochMilli <= jG && jG <= epochMilli2) {
                    linkedHashMap.put(i(jG), dataList.get(i));
                    z = true;
                }
                i++;
                size = i2;
            }
            if (!z) {
                WristTemperatureStat wristTemperatureStat = new WristTemperatureStat();
                wristTemperatureStat.setDate(pr8.INSTANCE.e(epochMilli2));
                wristTemperatureStat.setDayBaseLineWristTemperature(0);
                linkedHashMap.put(i(epochMilli2), wristTemperatureStat);
            }
            j2 = j4;
        }
        return linkedHashMap;
    }

    @NotNull
    public final List<WristTemperatureStat> f(long startTime, long endTime, @NotNull List<WristTemperatureStat> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        long j2 = 1000;
        long jM = pr8.INSTANCE.m(startTime, endTime + j2);
        long j3 = 0;
        while (j3 < jM) {
            long epochMilli = j(startTime).plusDays(j3).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            j3++;
            long epochMilli2 = j(startTime).plusDays(j3).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() - j2;
            int size = dataList.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                int i2 = size;
                long j4 = j2;
                long jG = pr8.INSTANCE.g(dataList.get(i).getDate());
                if ((epochMilli <= jG && jG <= epochMilli2) && dataList.get(i).getConfidence() != 0) {
                    arrayList.add(dataList.get(i));
                    z = true;
                }
                i++;
                size = i2;
                j2 = j4;
            }
            long j5 = j2;
            if (!z) {
                WristTemperatureStat wristTemperatureStat = new WristTemperatureStat();
                wristTemperatureStat.setDate(pr8.INSTANCE.e(epochMilli2));
                wristTemperatureStat.setDayBaseLineWristTemperature(0);
                arrayList.add(wristTemperatureStat);
            }
            j2 = j5;
        }
        return arrayList;
    }

    @NotNull
    public final List<WristTemperatureStat> g(long startTime, long endTime, @NotNull List<WristTemperatureStat> dataList) {
        boolean z;
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        ArrayList arrayList = new ArrayList();
        pr8 pr8Var = pr8.INSTANCE;
        int iF = pr8Var.f(pr8Var.j(startTime), pr8Var.j(endTime)) + 1;
        for (int i = 0; i < iF; i++) {
            long epochMilli = j(startTime).plusMonths(i).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            long jK = pr8.INSTANCE.k(epochMilli);
            int size = dataList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                long jG = pr8.INSTANCE.g(dataList.get(i2).getDate());
                if (epochMilli <= jG && jG <= jK) {
                    arrayList.add(dataList.get(i2));
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                WristTemperatureStat wristTemperatureStat = new WristTemperatureStat();
                wristTemperatureStat.setDate(pr8.INSTANCE.e(epochMilli));
                wristTemperatureStat.setDayBaseLineWristTemperature(0);
                arrayList.add(wristTemperatureStat);
            }
        }
        return arrayList;
    }

    public final float h(WristTemperature wristTemperature) {
        if (wristTemperature.getConfidence() == 0) {
            return 10000.0f;
        }
        if (wristTemperature.getBaseLine() == 0) {
            return -10000.0f;
        }
        float value = (wristTemperature.getValue() - wristTemperature.getBaseLine()) / 100.0f;
        float f = 8.0f;
        if (value <= 8.0f) {
            f = -8.0f;
            if (value >= -8.0f) {
                return value;
            }
        }
        return f;
    }

    public final LocalDate i(long timestamp) {
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault()).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofInstant(Instant.ofEpoc…           .toLocalDate()");
        return localDate;
    }

    public final LocalDateTime j(long timestamp) {
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
        Intrinsics.checkNotNullExpressionValue(localDateTimeOfInstant, "ofInstant(Instant.ofEpoc…, ZoneId.systemDefault())");
        return localDateTimeOfInstant;
    }
}