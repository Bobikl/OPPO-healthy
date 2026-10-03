package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import com.oppo.obus.common.configmetadata.core.enums.Area;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class vg0 {
    public static Area a() {
        Area areaValueOf;
        String strA = alf.a();
        if (TextUtils.isEmpty(strA)) {
            strA = alf.b();
        }
        String strC = c(strA);
        if (TextUtils.isEmpty(strC)) {
            areaValueOf = null;
        } else {
            try {
                areaValueOf = Area.valueOf(strC);
            } catch (Exception unused) {
                z6b.u("AreaUtil", "Area.valueOf failed for: " + strC);
                areaValueOf = null;
            }
        }
        return areaValueOf == null ? d(strA) : areaValueOf;
    }

    public static Area b(String str) {
        Area areaValueOf;
        if (TextUtils.isEmpty(str)) {
            return a();
        }
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            areaValueOf = null;
        } else {
            try {
                areaValueOf = Area.valueOf(strC);
            } catch (Exception unused) {
                z6b.u("AreaUtil", "Area.valueOf failed for: " + strC);
                areaValueOf = null;
            }
        }
        return areaValueOf == null ? d(str) : areaValueOf;
    }

    public static String c(String str) {
        Map<Area, List<String>> areaRegionMapping;
        String strA = t35.a(str);
        MinCommonConfig minCommonConfigJ = t56.configService.j();
        if (minCommonConfigJ != null && (areaRegionMapping = minCommonConfigJ.getAreaRegionMapping()) != null && !areaRegionMapping.isEmpty()) {
            for (Map.Entry<Area, List<String>> entry : areaRegionMapping.entrySet()) {
                List<String> value = entry.getValue();
                if (value != null && value.contains(str)) {
                    return entry.getKey().toString();
                }
            }
        }
        return strA;
    }

    public static Area d(String str) {
        if (TextUtils.isEmpty(str)) {
            return Area.SG;
        }
        String upperCase = str.toUpperCase();
        if ("CN".equals(upperCase) || "OC".equals(upperCase)) {
            return Area.CN;
        }
        if (alf.g(str)) {
            return Area.EU;
        }
        if (alf.US.equals(upperCase)) {
            return Area.US;
        }
        if (alf.RU.equals(upperCase)) {
            return Area.RU;
        }
        return alf.IN.equals(upperCase) ? Area.IN : Area.SG;
    }

    public static String e() {
        String strA = alf.a();
        return TextUtils.isEmpty(strA) ? alf.b() : strA;
    }
}
