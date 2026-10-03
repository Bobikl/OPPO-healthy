package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.health.cardiovascular.R$string;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012R\u001a\u0010\u001b\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/t23;", "", "", "int", "a", "(Ljava/lang/Integer;)I", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;", "", DBAssessmentRecord.PWV, MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/Float;)I", "pwvAgeCompare", "d", "str", "", "revert", "", "f", "itemsStr", "c", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardiovascularDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardiovascularDataUtil.kt\ncom/heytap/health/cardiovascular/util/CardiovascularDataUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1603#2,9:152\n1855#2:161\n1856#2:163\n1612#2:164\n766#2:165\n857#2,2:166\n1603#2,9:168\n1855#2:177\n1856#2:179\n1612#2:180\n1864#2,3:181\n1#3:162\n1#3:178\n*S KotlinDebug\n*F\n+ 1 CardiovascularDataUtil.kt\ncom/heytap/health/cardiovascular/util/CardiovascularDataUtil\n*L\n102#1:152,9\n102#1:161\n102#1:163\n102#1:164\n105#1:165\n105#1:166,2\n144#1:168,9\n144#1:177\n144#1:179\n144#1:180\n144#1:181,3\n102#1:162\n144#1:178\n*E\n"})
public final class t23 {
    public static final int $stable = 0;

    @NotNull
    public static final t23 INSTANCE = new t23();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "CardiovascularDataUtil";

    public static /* synthetic */ List g(t23 t23Var, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return t23Var.f(str, z);
    }

    public final int a(@Nullable Integer num) {
        if (num != null && num.intValue() == 0) {
            return R$string.health_cardiovascular_ecg_arr_nml;
        }
        if (num != null && num.intValue() == 1) {
            return R$string.health_cardiovascular_ecg_arr_af;
        }
        if (num != null && num.intValue() == 2) {
            return R$string.health_cardiovascular_ecg_arr_fre_pvc;
        }
        if (num != null && num.intValue() == 3) {
            return R$string.health_cardiovascular_ecg_arr_fre_pac;
        }
        if (num != null && num.intValue() == 4) {
            return R$string.health_cardiovascular_ecg_arr_hr_extra_low;
        }
        if (num != null && num.intValue() == 5) {
            return R$string.health_cardiovascular_ecg_arr_hr_low;
        }
        if (num != null && num.intValue() == 6) {
            return R$string.health_cardiovascular_ecg_arr_hr_high;
        }
        if (num != null && num.intValue() == 7) {
            return R$string.health_cardiovascular_ecg_arr_hr_extra_high;
        }
        if (num != null && num.intValue() == 8) {
            return R$string.health_cardiovascular_ecg_arr_inconclusive;
        }
        if (num != null && num.intValue() == 9) {
            return R$string.health_cardiovascular_ecg_arr_nosie;
        }
        return (num != null && num.intValue() == 10) ? R$string.health_cardiovascular_ecg_arr_weak_signal : R$string.health_cardiovascular_heart_valid;
    }

    @NotNull
    public final String b(@NotNull Context context, @Nullable Integer num) {
        int iA;
        Intrinsics.checkNotNullParameter(context, "context");
        if (num != null && num.intValue() == 0) {
            iA = R$string.health_cardiovascular_ecg_arr_hint_1;
        } else {
            iA = (num != null && num.intValue() == 1) ? R$string.health_cardiovascular_ecg_arr_hint_2 : a(num);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(context.getString(iA));
        stringBuffer.append("，");
        stringBuffer.append(context.getString(R$string.health_cardiovascular_ecg_hint));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "str.toString()");
        return string;
    }

    @NotNull
    public final String c(@NotNull Context context, @NotNull String itemsStr, boolean revert) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemsStr, "itemsStr");
        StringBuilder sb = new StringBuilder();
        Map mapMapOf = MapsKt__MapsKt.mapOf(TuplesKt.to(5, Integer.valueOf(R$string.health_cardiovascular_blood_oxygen_title)), TuplesKt.to(6, Integer.valueOf(R$string.health_cardiovascular_press_title)), TuplesKt.to(3, Integer.valueOf(R$string.health_cardiovascular_vascular)), TuplesKt.to(4, Integer.valueOf(R$string.health_cardiovascular_heart_rate_title)), TuplesKt.to(2, Integer.valueOf(R$string.health_cardiovascular_ecg_title)));
        List<Integer> listF = f(itemsStr, revert);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) mapMapOf.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (num != null) {
                arrayList.add(num);
            }
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            if (i != 0) {
                sb.append(context.getString(R$string.health_cardiovascular_dunhao));
            }
            sb.append(context.getString(iIntValue));
            i = i2;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    public final int d(@Nullable Integer pwvAgeCompare) {
        if (pwvAgeCompare != null && pwvAgeCompare.intValue() == 1) {
            return R$string.health_cardiovascular_vascular_compare_normal;
        }
        if (pwvAgeCompare != null && pwvAgeCompare.intValue() == 2) {
            return R$string.health_cardiovascular_vascular_compare_low;
        }
        return (pwvAgeCompare != null && pwvAgeCompare.intValue() == 3) ? R$string.health_cardiovascular_vascular_compare_high : R$string.health_cardiovascular_vascular_compare_invalid;
    }

    public final int e(@Nullable Float pwv) {
        if (pwv == null) {
            return R$string.health_cardiovascular_heart_valid;
        }
        if (pwv.floatValue() > 0.0f && pwv.floatValue() < 8.5f) {
            return R$string.health_cardiovascular_vascular_indec_1;
        }
        if (pwv.floatValue() < 8.5f || pwv.floatValue() >= 10.0f) {
            return pwv.floatValue() >= 10.0f ? R$string.health_cardiovascular_vascular_indec_3 : R$string.health_cardiovascular_heart_valid;
        }
        return R$string.health_cardiovascular_vascular_indec_2;
    }

    @NotNull
    public final List<Integer> f(@NotNull String str, boolean revert) {
        Intrinsics.checkNotNullParameter(str, "str");
        LinkedHashMap linkedHashMapLinkedMapOf = MapsKt__MapsKt.linkedMapOf(TuplesKt.to("3", 3), TuplesKt.to("5", 2), TuplesKt.to("4", 4), TuplesKt.to("2", 6), TuplesKt.to("1", 5));
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) linkedHashMapLinkedMapOf.get(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
            if (num != null) {
                arrayList.add(num);
            }
        }
        Collection collectionValues = linkedHashMapLinkedMapOf.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "itemNumMap.values");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            int iIntValue = ((Number) obj).intValue();
            if (revert ? !arrayList.contains(Integer.valueOf(iIntValue)) : arrayList.contains(Integer.valueOf(iIntValue))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
