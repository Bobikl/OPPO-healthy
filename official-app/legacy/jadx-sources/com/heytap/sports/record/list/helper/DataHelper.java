package com.heytap.sports.record.list.helper;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.RunExtra;
import com.heytap.databaseengine.model.TrackMetadataStat;
import com.heytap.databaseengine.model.gymstrengthtraining.GymStrengthTrainingExtra;
import com.heytap.health.sport.R$drawable;
import com.heytap.health.sport.R$string;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$array;
import com.heytap.sports.R$plurals;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.sports.record.list.bean.SportModeSelectData;
import com.heytap.sports.record.util.RecordHelper;
import com.heytap.store.apm.PageTrackBean;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.eji;
import com.oplus.aiunit.vision.fji;
import com.oplus.aiunit.vision.jgf;
import com.oplus.aiunit.vision.lzc;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.op5;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.vc;
import io.protostuff.MapSchema;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u00018B\t\b\u0002¢\u0006\u0004\b6\u00107J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0007J\u001a\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007J \u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\"\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dJ8\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020\u0005J@\u0010)\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u001d2\u001e\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0&Jd\u0010/\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010\u00032\b\u0010.\u001a\u0004\u0018\u00010-2\u001e\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0&J$\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J0\u00104\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000303032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J,\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¨\u00069"}, d2 = {"Lcom/heytap/sports/record/list/helper/DataHelper;", "", "value", "", "o", "", "milliseconds", "n", "", "meters", LogFieldKey.PROCESS_NAME_KEY, "", "num", "", "keep0", "q", "Landroid/content/Context;", "context", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "Lcom/heytap/sports/record/list/helper/DataHelper$SportNameType;", "nameType", "j", "Landroid/content/res/Resources;", "resources", "", "Lcom/heytap/sports/record/list/bean/SportModeSelectData;", "b", vc.KEY_REQUEST_CODE, "a", "Lcom/heytap/databaseengine/model/TrackMetadataStat;", "record", "Lkotlin/Pair;", b2n.g, "defaultSportName", "gameId", b2n.f, "showName", "data", "Lkotlin/Function3;", "", "result", LogFieldKey.LEVEL_KEY, "totalDistance", PageTrackBean.TOTAL_TIME, "runExtra", "Lcom/heytap/databaseengine/model/gymstrengthtraining/GymStrengthTrainingExtra;", "trainingData", MapSchema.FIELD_NAME_KEY, "Ljava/util/LinkedHashMap;", "d", "c", "", "f", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "SportNameType", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHelper.kt\ncom/heytap/sports/record/list/helper/DataHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,694:1\n215#2,2:695\n125#2:705\n152#2,3:706\n1855#3:697\n1856#3:709\n1864#3,3:710\n1864#3,3:713\n1855#3,2:716\n1864#3,3:718\n526#4:698\n511#4,6:699\n*S KotlinDebug\n*F\n+ 1 DataHelper.kt\ncom/heytap/sports/record/list/helper/DataHelper\n*L\n168#1:695,2\n191#1:705\n191#1:706,3\n187#1:697\n187#1:709\n218#1:710,3\n248#1:713,3\n268#1:716,2\n391#1:718,3\n191#1:698\n191#1:699,6\n*E\n"})
public final class DataHelper {
    public static final int $stable = 0;

    @NotNull
    public static final DataHelper INSTANCE = new DataHelper();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sports/record/list/helper/DataHelper$SportNameType;", "", "(Ljava/lang/String;I)V", "SimpleName", "CommonName", "RecordName", "StatName", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum SportNameType {
        SimpleName,
        CommonName,
        RecordName,
        StatName
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportNameType.values().length];
            try {
                iArr[SportNameType.SimpleName.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportNameType.CommonName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportNameType.RecordName.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportNameType.StatName.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ Pair i(DataHelper dataHelper, Context context, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return dataHelper.g(context, i, str, i2);
    }

    public static /* synthetic */ void m(DataHelper dataHelper, Context context, boolean z, TrackMetadataStat trackMetadataStat, Function3 function3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        dataHelper.l(context, z, trackMetadataStat, function3);
    }

    @JvmStatic
    public static final int n(int milliseconds) {
        return Math.max(milliseconds, 60000) / 60000;
    }

    @JvmStatic
    @NotNull
    public static final String o(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            String strA = lzc.a(2, Double.parseDouble(value.toString()));
            Intrinsics.checkNotNullExpressionValue(strA, "formatDataModeDownWithXDecimalPlaces(2, num)");
            return strA;
        } catch (Exception unused) {
            return value.toString();
        }
    }

    @JvmStatic
    @NotNull
    public static final String p(long meters) {
        double d = meters;
        return d < 0.005d ? "0.00" : q(d / 1000.0d, true);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String q(double num, boolean keep0) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        numberFormat.setGroupingUsed(false);
        if (num < 100.0d) {
            numberFormat.setMinimumFractionDigits(keep0 ? 2 : 0);
            numberFormat.setMaximumFractionDigits(2);
            String str = numberFormat.format(num);
            Intrinsics.checkNotNullExpressionValue(str, "{\n            distanceFo…ter.format(num)\n        }");
            return str;
        }
        if (num < 100.0d || num >= 1000.0d) {
            numberFormat.setMinimumFractionDigits(0);
            numberFormat.setMaximumFractionDigits(0);
            String str2 = numberFormat.format(num);
            Intrinsics.checkNotNullExpressionValue(str2, "{\n            distanceFo…ter.format(num)\n        }");
            return str2;
        }
        numberFormat.setMinimumFractionDigits(keep0 ? 1 : 0);
        numberFormat.setMaximumFractionDigits(1);
        String str3 = numberFormat.format(num);
        Intrinsics.checkNotNullExpressionValue(str3, "{\n            distanceFo…ter.format(num)\n        }");
        return str3;
    }

    public final int a(int requestCode) {
        if (oei.d(requestCode)) {
            return 103;
        }
        if (oei.j(requestCode)) {
            return 100;
        }
        if (oei.m(requestCode)) {
            return 101;
        }
        if (oei.l(requestCode)) {
            return 104;
        }
        if (oei.i(requestCode)) {
            return 102;
        }
        if (oei.a(requestCode)) {
            return 105;
        }
        if (oei.h(requestCode)) {
            return 106;
        }
        if (oei.o(requestCode)) {
            return 107;
        }
        if (oei.c(requestCode)) {
            return 108;
        }
        if (oei.k(requestCode)) {
            return 109;
        }
        if (oei.n(requestCode)) {
            return 110;
        }
        if (oei.g(requestCode)) {
            return 111;
        }
        if (oei.f(requestCode)) {
            return 112;
        }
        if (oei.b(requestCode)) {
            return 113;
        }
        return requestCode;
    }

    @NotNull
    public final List<SportModeSelectData> b(@NotNull Resources resources, @NotNull SportNameType nameType) {
        Map<Integer, String> map;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(nameType, "nameType");
        LinkedHashMap<Integer, String> linkedHashMapC = c(resources, nameType);
        Map<Integer, Map<Integer, String>> mapF = f(resources, nameType);
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<Integer, String>> setEntrySet = linkedHashMapC.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "typeMap.entries");
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "outEnty.key");
            boolean zContainsKey = mapF.containsKey(key);
            Object key2 = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key2, "outEnty.key");
            int iIntValue = ((Number) key2).intValue();
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "outEnty.value");
            arrayList.add(new SportModeSelectData(iIntValue, (String) value, 0L, zContainsKey));
            if (zContainsKey && (map = mapF.get(entry.getKey())) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<Integer, String> entry2 : map.entrySet()) {
                    int iIntValue2 = entry2.getKey().intValue();
                    Integer num = (Integer) entry.getKey();
                    if (num == null || iIntValue2 != num.intValue()) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    arrayList2.add(Boolean.valueOf(arrayList.add(new SportModeSelectData(((Number) entry3.getKey()).intValue(), (String) entry3.getValue(), 0L, false))));
                }
            }
        }
        return arrayList;
    }

    public final LinkedHashMap<Integer, String> c(Resources resources, SportNameType nameType) {
        String[] stringArray;
        int i = a.$EnumSwitchMapping$0[nameType.ordinal()];
        if (i == 1) {
            stringArray = resources.getStringArray(R$array.sports_sport_mode_titles_watch);
        } else if (i == 2) {
            stringArray = resources.getStringArray(R$array.sports_sport_common_name_watch);
        } else if (i == 3) {
            stringArray = resources.getStringArray(R$array.sports_record_list_titles_watch);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            stringArray = resources.getStringArray(R$array.sports_statistics_titles_watch);
        }
        Intrinsics.checkNotNullExpressionValue(stringArray, "when (nameType) {\n      …s_titles_watch)\n        }");
        int i2 = 0;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{102, 104, 106, 105, 108, 109, 110, 111, 112, 113});
        LinkedHashMap<Integer, String> linkedHashMapD = d(resources, nameType);
        for (Object obj : listListOf) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
            String str = stringArray[i2];
            Intrinsics.checkNotNullExpressionValue(str, "names[i]");
            linkedHashMapD.put(numValueOf, str);
            i2 = i3;
        }
        return linkedHashMapD;
    }

    public final LinkedHashMap<Integer, String> d(Resources resources, SportNameType nameType) {
        String[] stringArray;
        int i = a.$EnumSwitchMapping$0[nameType.ordinal()];
        if (i == 1) {
            stringArray = resources.getStringArray(R$array.sports_sport_mode_titles);
        } else if (i == 2) {
            stringArray = resources.getStringArray(R$array.sports_sport_common_name);
        } else if (i == 3) {
            stringArray = resources.getStringArray(R$array.sports_record_list_titles);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            stringArray = resources.getStringArray(R$array.sports_statistics_titles);
        }
        Intrinsics.checkNotNullExpressionValue(stringArray, "when (nameType) {\n      …tistics_titles)\n        }");
        int i2 = 0;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{-2, 100, 101, 103, 107});
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (Object obj : listListOf) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
            String str = stringArray[i2];
            Intrinsics.checkNotNullExpressionValue(str, "names[i]");
            linkedHashMap.put(numValueOf, str);
            i2 = i3;
        }
        return linkedHashMap;
    }

    public final Map<Integer, String> e(Resources resources, SportNameType nameType, int sportMode) {
        List listListOf;
        String[] stringArray;
        String str;
        int i = 0;
        switch (sportMode) {
            case 105:
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{105, 31, 601, 602, 8, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, Integer.valueOf(oei.PADEL_TENNIS)});
                int i2 = a.$EnumSwitchMapping$0[nameType.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_ball_common_name);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringArray = resources.getStringArray(R$array.sports_sport_all_ball_stat_name);
                } else {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_ball_record_name);
                }
                break;
            case 106:
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{106, 36, 37, 501, 502, 503, 504, 505, 506});
                int i3 = a.$EnumSwitchMapping$0[nameType.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_outdoor_common_name);
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringArray = resources.getStringArray(R$array.sports_sport_all_outdoor_stat_name);
                } else {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_outdoor_record_name);
                }
                break;
            case 107:
            case 108:
            default:
                listListOf = null;
                stringArray = null;
                break;
            case 109:
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{109, 701, 702, 703, 704, 705, 706, 707});
                int i4 = a.$EnumSwitchMapping$0[nameType.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_snow_common_name);
                } else if (i4 != 3) {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringArray = resources.getStringArray(R$array.sports_sport_all_snow_stat_name);
                } else {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_snow_record_name);
                }
                break;
            case 110:
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{110, 801, 802, 803, 804, 805, Integer.valueOf(oei.ROWING), Integer.valueOf(oei.WATER_POLO)});
                int i5 = a.$EnumSwitchMapping$0[nameType.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_water_common_name);
                } else if (i5 != 3) {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringArray = resources.getStringArray(R$array.sports_sport_all_water_stat_name);
                } else {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_water_record_name);
                }
                break;
            case 111:
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{111, 901, 902, 903, 904, 905, 906, Integer.valueOf(oei.ROPE_SKIPPING)});
                int i6 = a.$EnumSwitchMapping$0[nameType.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_leisure_common_name);
                } else if (i6 != 3) {
                    if (i6 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stringArray = resources.getStringArray(R$array.sports_sport_all_leisure_stat_name);
                } else {
                    stringArray = resources.getStringArray(R$array.sports_sport_all_leisure_record_name);
                }
                break;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (listListOf != null) {
            for (Object obj : listListOf) {
                int i7 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
                if (stringArray == null || (str = (String) ArraysKt___ArraysKt.getOrNull(stringArray, i)) == null) {
                    str = "";
                }
                linkedHashMap.put(numValueOf, str);
                i = i7;
            }
        }
        return linkedHashMap;
    }

    public final Map<Integer, Map<Integer, String>> f(Resources resources, SportNameType nameType) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = SetsKt__SetsKt.setOf((Object[]) new Integer[]{106, 105, 109, 110, 111}).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), INSTANCE.e(resources, nameType, iIntValue));
        }
        return linkedHashMap;
    }

    @NotNull
    public final Pair<String, Integer> g(@NotNull Context context, int sportMode, @Nullable String defaultSportName, int gameId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer numE = jgf.e(sportMode);
        if (numE != null) {
            defaultSportName = context.getString(numE.intValue());
        }
        Integer numD = jgf.d(sportMode);
        int iIntValue = numD != null ? numD.intValue() : jgf.INSTANCE.a();
        if (oei.f(sportMode)) {
            iIntValue = jgf.INSTANCE.b(gameId);
            defaultSportName = context.getString(jgf.c(gameId));
        } else if (oei.b(sportMode)) {
            if (defaultSportName == null || defaultSportName.length() == 0) {
                defaultSportName = context.getString(R$string.sport_his_record_title_exclusive_custom_sports);
            }
            iIntValue = R$drawable.sports_mode_ic_custom_sports;
        }
        if (defaultSportName == null || defaultSportName.length() == 0) {
            defaultSportName = "--";
        }
        Intrinsics.checkNotNull(defaultSportName);
        return TuplesKt.to(defaultSportName, Integer.valueOf(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @NotNull
    public final Pair<String, Integer> h(@NotNull Context context, @NotNull TrackMetadataStat record) {
        boolean z;
        Integer numIsThirdpartySports;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(record, "record");
        int sportMode = record.getSportMode();
        String sportName = record.getSportName();
        RunExtra runExtra = (RunExtra) sc8.a(record.getRunExtra(), RunExtra.class);
        boolean z2 = false;
        Pair<String, Integer> pairG = g(context, sportMode, sportName, runExtra != null ? runExtra.getGameId() : 0);
        RunExtra runExtra2 = (RunExtra) sc8.a(record.getRunExtra(), RunExtra.class);
        String sportName2 = record.getSportName();
        if (sportName2 == null) {
            z = false;
        } else {
            if (sportName2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return pairG;
        }
        if (runExtra2 != null && (numIsThirdpartySports = runExtra2.isThirdpartySports()) != null && numIsThirdpartySports.intValue() == 1) {
            z2 = true;
        }
        return (z2 || Intrinsics.areEqual(record.getDeviceCategory(), op5.WATCH_iWATCH)) ? TuplesKt.to(record.getSportName(), pairG.getSecond()) : pairG;
    }

    @Nullable
    public final String j(@NotNull Context context, int sportMode, @NotNull SportNameType nameType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nameType, "nameType");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        String str = c(resources, nameType).get(Integer.valueOf(sportMode));
        if (str != null) {
            return str;
        }
        Resources resources2 = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
        Iterator<Map.Entry<Integer, Map<Integer, String>>> it = f(resources2, nameType).entrySet().iterator();
        while (it.hasNext()) {
            String str2 = it.next().getValue().get(Integer.valueOf(sportMode));
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0270  */
    public final void k(@NotNull Context context, boolean showName, int sportMode, long totalDistance, long totalTime, @Nullable String runExtra, @Nullable GymStrengthTrainingExtra trainingData, @NotNull Function3<Object, ? super Double, ? super String, Unit> result) {
        double dDoubleValue;
        StringBuilder sb;
        String string;
        String quantityString;
        StringBuilder sb2;
        double dDoubleValue2;
        StringBuilder sb3;
        StringBuilder sb4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(result, "result");
        JSONObject jSONObject = null;
        if (runExtra != null) {
            try {
                jSONObject = new JSONObject(runExtra);
            } catch (Exception unused) {
            }
        }
        eji.Companion companion = eji.INSTANCE;
        Double dH = companion.h(runExtra);
        int iN = n((int) totalTime);
        int iOptInt = jSONObject != null ? jSONObject.optInt("count", 0) : 0;
        Object objValueOf = String.valueOf(iN);
        double dG = iN;
        String quantityString2 = context.getResources().getQuantityString(showName ? R$plurals.sports_record_name_value_min_format : R$plurals.sports_record_value_min_format, (int) dG);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "context.resources.getQua…formatRes, value.toInt())");
        if (!(sportMode == 7 || sportMode == 809)) {
            if (sportMode == 908) {
                if (iOptInt > 0) {
                    objValueOf = String.valueOf(iOptInt);
                    dG = iOptInt;
                    quantityString = context.getResources().getQuantityString(showName ? R$plurals.sports_record_name_value_count_format : R$plurals.sports_record_value_rope_skipping_count_format, (int) dG);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…formatRes, value.toInt())");
                } else {
                    quantityString = quantityString2;
                }
            } else if (sportMode == 31) {
                int iT = RecordHelper.INSTANCE.t(runExtra);
                if (iT > 0) {
                    objValueOf = String.valueOf(iT);
                    dG = iT;
                    quantityString = context.getResources().getQuantityString(showName ? R$plurals.sports_record_name_value_chp : R$plurals.sports_record_value_badminton_count_format, (int) dG);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…formatRes, value.toInt())");
                } else {
                    quantityString = quantityString2;
                }
            } else if (sportMode == 32) {
                RecordHelper recordHelper = RecordHelper.INSTANCE;
                if (recordHelper.o(runExtra)) {
                    int iA = recordHelper.a(runExtra);
                    objValueOf = String.valueOf(iA);
                    dG = iA;
                    quantityString = context.getResources().getQuantityString(showName ? R$plurals.sports_record_name_value_step : R$plurals.sports_record_value_elliptical_machine_count_format, (int) dG);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…formatRes, value.toInt())");
                } else {
                    quantityString = quantityString2;
                }
            } else if (sportMode == 33) {
                RecordHelper recordHelper2 = RecordHelper.INSTANCE;
                if (recordHelper2.p(runExtra)) {
                    int iS = recordHelper2.s(runExtra);
                    objValueOf = String.valueOf(iS);
                    dG = iS;
                    quantityString = context.getResources().getQuantityString(showName ? R$plurals.sports_record_name_value_jiang : R$plurals.sports_record_value_rowing_machine_count_format, (int) dG);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…formatRes, value.toInt())");
                } else {
                    quantityString = quantityString2;
                }
            } else if (sportMode == 610) {
                int iG = RecordHelper.INSTANCE.g(runExtra);
                if (iG > 0) {
                    objValueOf = showName ? Integer.valueOf(iG) : String.valueOf(iG);
                    dG = iG;
                    quantityString = context.getResources().getQuantityString(showName ? R$plurals.sports_record_name_value_tennis_count_format : R$plurals.sports_record_value_tennis_count_format, (int) dG);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…formatRes, value.toInt())");
                } else {
                    quantityString = quantityString2;
                }
            } else if (sportMode == 705) {
                if (RecordHelper.INSTANCE.l(runExtra)) {
                    if (dH != null) {
                        dDoubleValue2 = dH.doubleValue();
                    } else {
                        Double dB = fji.b(Double.valueOf(totalDistance / 1000.0d));
                        Intrinsics.checkNotNullExpressionValue(dB, "autoFormat2Mile(totalDistance / 1000.0)");
                        dDoubleValue2 = dB.doubleValue();
                    }
                    dG = dDoubleValue2;
                    objValueOf = o(Double.valueOf(Math.min(dG, 999.99d)));
                    String strB = companion.b();
                    if (showName) {
                        sb3 = new StringBuilder();
                        sb3.append("%1$s %2$s ");
                    } else {
                        sb3 = new StringBuilder();
                        sb3.append("%s ");
                    }
                    sb3.append(strB);
                    string = sb3.toString();
                } else {
                    quantityString = quantityString2;
                }
            } else if (sportMode == 290) {
                if (trainingData != null) {
                    int trainingCapacity = trainingData.getTrainingCapacity() / 1000;
                    dG = trainingCapacity;
                    objValueOf = String.valueOf(trainingCapacity);
                    String string2 = context.getString(com.heytap.sports.R$string.sports_training_record_unit);
                    Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rts_training_record_unit)");
                    if (showName) {
                        sb2 = new StringBuilder();
                        sb2.append("%1$s %2$s ");
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("%s ");
                    }
                    sb2.append(string2);
                    string = sb2.toString();
                } else {
                    quantityString = quantityString2;
                }
            } else if (sportMode == 5) {
                RunExtra runExtra2 = (RunExtra) sc8.a(runExtra, RunExtra.class);
                long totalFloors = runExtra2 != null ? runExtra2.getTotalFloors() : 0L;
                dG = totalFloors;
                objValueOf = String.valueOf(totalFloors);
                quantityString = context.getResources().getQuantityString(showName ? R$plurals.sports_climbing_floors_show_name_unit : R$plurals.sports_climbing_floors_unit, (int) totalFloors);
                Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…toInt()\n                )");
            } else if (!oei.ALL_TRACK_TYPES.contains(Integer.valueOf(sportMode)) || oei.allCustomizeMode.contains(Integer.valueOf(sportMode))) {
                quantityString = quantityString2;
            } else {
                if (dH != null) {
                    dDoubleValue = dH.doubleValue();
                } else {
                    Double dB2 = fji.b(Double.valueOf(totalDistance / 1000.0d));
                    Intrinsics.checkNotNullExpressionValue(dB2, "autoFormat2Mile(totalDistance / 1000.0)");
                    dDoubleValue = dB2.doubleValue();
                }
                dG = dDoubleValue;
                objValueOf = o(Double.valueOf(dG));
                String strB2 = companion.b();
                if (showName) {
                    sb = new StringBuilder();
                    sb.append("%1$s %2$s ");
                } else {
                    sb = new StringBuilder();
                    sb.append("%s ");
                }
                sb.append(strB2);
                string = sb.toString();
            }
            result.invoke(objValueOf, Double.valueOf(dG), quantityString);
        }
        dG = fji.G(runExtra, (int) totalDistance);
        objValueOf = String.valueOf((long) dG);
        String strD = companion.d((int) dG);
        if (showName) {
            sb4 = new StringBuilder();
            sb4.append("%1$s %2$s ");
        } else {
            sb4 = new StringBuilder();
            sb4.append("%s ");
        }
        sb4.append(strD);
        string = sb4.toString();
        quantityString = string;
        result.invoke(objValueOf, Double.valueOf(dG), quantityString);
    }

    public final void l(@NotNull Context context, boolean showName, @NotNull TrackMetadataStat data, @NotNull Function3<Object, ? super Double, ? super String, Unit> result) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(result, "result");
        k(context, showName, data.getSportMode(), data.getTotalDistance(), data.getTotalTime(), data.getRunExtra(), null, result);
    }
}
