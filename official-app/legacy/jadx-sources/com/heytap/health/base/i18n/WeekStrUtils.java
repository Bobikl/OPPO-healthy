package com.heytap.health.base.i18n;

import com.heytap.health.base.R$string;
import com.oplus.aiunit.vision.qtf;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/base/i18n/WeekStrUtils;", "", "", ClickApiEntity.TIME, "", "c", "a", "", "", "Lkotlin/Lazy;", "d", "()Ljava/util/Map;", "weekStrMap", "b", "weekNumStrMap", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class WeekStrUtils {

    @NotNull
    public static final WeekStrUtils INSTANCE = new WeekStrUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy weekStrMap = LazyKt__LazyJVMKt.lazy(new Function0<HashMap<String, Integer>>() { // from class: com.heytap.health.base.i18n.WeekStrUtils$weekStrMap$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final HashMap<String, Integer> invoke() {
            HashMap<String, Integer> map = new HashMap<>(8, 1.0f);
            map.put("MONDAY", Integer.valueOf(R$string.lib_base_date_monday));
            map.put("TUESDAY", Integer.valueOf(R$string.lib_base_date_tuesday));
            map.put("WEDNESDAY", Integer.valueOf(R$string.lib_base_date_wednesday));
            map.put("THURSDAY", Integer.valueOf(R$string.lib_base_date_thursday));
            map.put("FRIDAY", Integer.valueOf(R$string.lib_base_date_friday));
            map.put("SATURDAY", Integer.valueOf(R$string.lib_base_date_saturday));
            map.put("SUNDAY", Integer.valueOf(R$string.lib_base_date_sunday));
            return map;
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy weekNumStrMap = LazyKt__LazyJVMKt.lazy(new Function0<HashMap<String, Integer>>() { // from class: com.heytap.health.base.i18n.WeekStrUtils$weekNumStrMap$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final HashMap<String, Integer> invoke() {
            HashMap<String, Integer> map = new HashMap<>(8, 1.0f);
            map.put("MONDAY", Integer.valueOf(R$string.lib_base_date_monday_num));
            map.put("TUESDAY", Integer.valueOf(R$string.lib_base_date_tuesday_num));
            map.put("WEDNESDAY", Integer.valueOf(R$string.lib_base_date_wednesday_num));
            map.put("THURSDAY", Integer.valueOf(R$string.lib_base_date_thursday_num));
            map.put("FRIDAY", Integer.valueOf(R$string.lib_base_date_friday_num));
            map.put("SATURDAY", Integer.valueOf(R$string.lib_base_date_saturday_num));
            map.put("SUNDAY", Integer.valueOf(R$string.lib_base_date_sunday_num));
            return map;
        }
    });

    @JvmStatic
    @NotNull
    public static final String a(long time) {
        String strL;
        String string = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault()).toLocalDate().getDayOfWeek().toString();
        Integer num = INSTANCE.b().get(string);
        return (num == null || (strL = qtf.l(num.intValue())) == null) ? string : strL;
    }

    @JvmStatic
    @NotNull
    public static final String c(long time) {
        String strL;
        String string = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault()).toLocalDate().getDayOfWeek().toString();
        Integer num = INSTANCE.d().get(string);
        return (num == null || (strL = qtf.l(num.intValue())) == null) ? string : strL;
    }

    public final Map<String, Integer> b() {
        return (Map) weekNumStrMap.getValue();
    }

    public final Map<String, Integer> d() {
        return (Map) weekStrMap.getValue();
    }
}
