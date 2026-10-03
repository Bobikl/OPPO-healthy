package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$drawable;
import com.heytap.sports.R$string;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f*\u00020\u000eH\u0002R)\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u00118\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/f5j;", "", "", "isMale", "", "swimType", "pace", "b", "(ZII)Ljava/lang/Integer;", "level", "c", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "d", MapSchema.FIELD_NAME_ENTRY, "", "", b2n.f, "", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "femaleStandardArr", "f", "maleStandardArr", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwimGradeCommon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwimGradeCommon.kt\ncom/heytap/sports/record/details/cards/SwimGradeCommon\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n1855#2:113\n1864#2,3:114\n1856#2:117\n1864#2,3:118\n*S KotlinDebug\n*F\n+ 1 SwimGradeCommon.kt\ncom/heytap/sports/record/details/cards/SwimGradeCommon\n*L\n46#1:113\n48#1:114,3\n46#1:117\n67#1:118,3\n*E\n"})
public final class f5j {
    public static final int $stable;

    @NotNull
    public static final f5j INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Map<Integer, List<Integer>> femaleStandardArr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Map<Integer, List<Integer>> maleStandardArr;

    static {
        f5j f5jVar = new f5j();
        INSTANCE = f5jVar;
        femaleStandardArr = MapsKt__MapsKt.mapOf(TuplesKt.to(1, f5jVar.g("02:15,02:25,02:55,03:20,03:30")), TuplesKt.to(2, f5jVar.g("02:30,02:50,03:20,03:40,03:50")), TuplesKt.to(4, f5jVar.g("02:30,02:48,03:15,03:35,03:45")), TuplesKt.to(3, f5jVar.g("02:30,02:48,03:15,03:35,03:50")));
        maleStandardArr = MapsKt__MapsKt.mapOf(TuplesKt.to(1, f5jVar.g("01:40,01:58,02:20,02:50,03:10")), TuplesKt.to(2, f5jVar.g("01:50,02:05,02:26,02:58,03:18")), TuplesKt.to(4, f5jVar.g("01:50,02:02,02:25,02:55,03:15")), TuplesKt.to(3, f5jVar.g("01:50,02:02,02:25,02:55,03:20")));
        $stable = 8;
    }

    @NotNull
    public final Map<Integer, List<Integer>> a() {
        return femaleStandardArr;
    }

    @Nullable
    public final Integer b(boolean isMale, int swimType, int pace) {
        if (pace <= 0) {
            return null;
        }
        List<Integer> list = (isMale ? maleStandardArr : femaleStandardArr).get(Integer.valueOf(swimType));
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (pace <= ((Number) obj).intValue()) {
                    return Integer.valueOf(i2);
                }
                i = i2;
            }
        }
        return null;
    }

    @Nullable
    public final Integer c(@Nullable Integer level) {
        if (level != null && level.intValue() == 1) {
            return Integer.valueOf(R$drawable.sports_record_ic_swim_grade_level_1);
        }
        if (level != null && level.intValue() == 2) {
            return Integer.valueOf(R$drawable.sports_record_ic_swim_grade_level_2);
        }
        if (level != null && level.intValue() == 3) {
            return Integer.valueOf(R$drawable.sports_record_ic_swim_grade_level_3);
        }
        if (level != null && level.intValue() == 4) {
            return Integer.valueOf(R$drawable.sports_record_ic_swim_grade_level_4);
        }
        if (level != null && level.intValue() == 5) {
            return Integer.valueOf(R$drawable.sports_record_ic_swim_grade_level_5);
        }
        return null;
    }

    @Nullable
    public final Integer d(@Nullable Integer level) {
        if (level != null && level.intValue() == 1) {
            return Integer.valueOf(R$drawable.sports_record_swim_grade_level_1);
        }
        if (level != null && level.intValue() == 2) {
            return Integer.valueOf(R$drawable.sports_record_swim_grade_level_2);
        }
        if (level != null && level.intValue() == 3) {
            return Integer.valueOf(R$drawable.sports_record_swim_grade_level_3);
        }
        if (level != null && level.intValue() == 4) {
            return Integer.valueOf(R$drawable.sports_record_swim_grade_level_4);
        }
        if (level != null && level.intValue() == 5) {
            return Integer.valueOf(R$drawable.sports_record_swim_grade_level_5);
        }
        return null;
    }

    @Nullable
    public final Integer e(@Nullable Integer level) {
        if (level != null && level.intValue() == 1) {
            return Integer.valueOf(R$string.sports_record_swim_grade_card_level_1);
        }
        if (level != null && level.intValue() == 2) {
            return Integer.valueOf(R$string.sports_record_swim_grade_card_level_2);
        }
        if (level != null && level.intValue() == 3) {
            return Integer.valueOf(R$string.sports_record_swim_grade_card_level_3);
        }
        if (level != null && level.intValue() == 4) {
            return Integer.valueOf(R$string.sports_record_swim_grade_card_level_4);
        }
        if (level != null && level.intValue() == 5) {
            return Integer.valueOf(R$string.sports_record_swim_grade_card_level_5);
        }
        return null;
    }

    @NotNull
    public final Map<Integer, List<Integer>> f() {
        return maleStandardArr;
    }

    public final List<Integer> g(String str) {
        double d;
        double dPow;
        ArrayList arrayList = new ArrayList();
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).iterator();
        while (it.hasNext()) {
            int i = 0;
            int i2 = 0;
            for (Object obj : CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{":"}, false, 0, 6, (Object) null))) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str2 = (String) obj;
                if (!StringsKt__StringsJVMKt.startsWith$default(str2, "00", false, 2, null)) {
                    if (StringsKt__StringsJVMKt.startsWith$default(str2, "0", false, 2, null)) {
                        String strSubstring = str2.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        d = Integer.parseInt(strSubstring);
                        dPow = Math.pow(60.0d, 1.0d - ((double) i2));
                    } else {
                        d = Integer.parseInt(str2);
                        dPow = Math.pow(60.0d, 1.0d - ((double) i2));
                    }
                    i += (int) (d * dPow);
                }
                i2 = i3;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
