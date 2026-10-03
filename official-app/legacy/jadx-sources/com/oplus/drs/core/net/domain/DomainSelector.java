package com.oplus.drs.core.net.domain;

import com.heytap.log.config.LogMemoryConfig;
import com.oplus.aiunit.vision.gz5;
import com.oplus.aiunit.vision.j45;
import com.oplus.aiunit.vision.j75;
import com.oplus.aiunit.vision.p25;
import com.oplus.aiunit.vision.t56;
import com.oplus.aiunit.vision.vg0;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.base.util.SystemProperty;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import com.oppo.obus.common.configmetadata.core.entity.host.AppHost;
import com.oppo.obus.common.configmetadata.core.entity.host.MinHostConfig;
import com.oppo.obus.common.configmetadata.core.enums.Area;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class DomainSelector {
    public final gz5 a = gz5.a();

    public enum DomainLevel {
        APP_SPECIFIC,
        GLOBAL,
        FALLBACK
    }

    public static final class a {
        public final String a;
        public final DomainLevel b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f19784c;

        public a(String str, DomainLevel domainLevel) {
            this.a = str;
            this.b = domainLevel;
            this.f19784c = domainLevel == DomainLevel.FALLBACK;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("DomainResult{domain=");
            String str2 = this.a;
            if (str2 == null || str2.length() <= 20) {
                str = this.a;
            } else {
                str = this.a.substring(0, 20) + LogMemoryConfig.LOG_ELLIPSIS;
            }
            sb.append(str);
            sb.append(", level=");
            sb.append(this.b);
            sb.append("}");
            return sb.toString();
        }
    }

    public final void a(Set<String> set, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        set.add(str);
    }

    public final String b(String str, boolean z, Area area) {
        AppHost appHostN;
        if (str == null || str.isEmpty() || (appHostN = t56.configService.n(str, area.toString())) == null) {
            return null;
        }
        return z ? appHostN.getBizHost() : appHostN.getTechHost();
    }

    public List<String> c(String str, boolean z) {
        Area areaB = vg0.b(vg0.e());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        a(linkedHashSet, b(str, z, areaB));
        a(linkedHashSet, f(z, areaB));
        a(linkedHashSet, d(z, areaB));
        return new ArrayList(linkedHashSet);
    }

    public final String d(boolean z, Area area) {
        Map<Area, String> data;
        String str;
        MinCommonConfig minCommonConfigJ = t56.configService.j();
        if (minCommonConfigJ == null || minCommonConfigJ.getDefaultHost() == null || (data = minCommonConfigJ.getDefaultHost().getData()) == null || (str = data.get(area)) == null || str.isEmpty()) {
            z6b.k("DomainSelector", "Using hardcoded fallback domain, area=" + area);
            return z ? j75.a(area.toString()) : j75.b(area.toString());
        }
        z6b.k("DomainSelector", "Using cloud fallback domain, area=" + area);
        return str;
    }

    public final String e(Area area, boolean z) {
        Map<Area, String> data;
        String str;
        if (area == null) {
            return null;
        }
        MinCommonConfig minCommonConfigJ = t56.configService.j();
        if (minCommonConfigJ == null || minCommonConfigJ.getDefaultHost() == null || (data = minCommonConfigJ.getDefaultHost().getData()) == null || (str = data.get(area)) == null || str.isEmpty()) {
            z6b.k("DomainSelector", "Using hardcoded fallback domain, area=" + area);
            return z ? j75.a(area.toString()) : j75.b(area.toString());
        }
        z6b.k("DomainSelector", "Using cloud fallback domain, area=" + area);
        return str;
    }

    public final String f(boolean z, Area area) {
        MinHostConfig minHostConfigE = t56.configService.e(area.toString());
        if (minHostConfigE == null) {
            return null;
        }
        return z ? minHostConfigE.getBizHost() : minHostConfigE.getTechHost();
    }

    public final boolean g(String str, Set<String> set) {
        return (str == null || str.isEmpty() || (set != null && set.contains(str))) ? false : true;
    }

    public void h(String str) {
        this.a.c(str);
    }

    public void i(String str) {
        this.a.d(str);
    }

    public void j() {
        this.a.f();
    }

    public a k(String str, boolean z, Set<String> set) {
        String str2 = z ? "business" : "technology";
        if (SystemProperty.getBoolean(j45.TEST_ADB_KEY, false)) {
            String strB = j45.b();
            z6b.l("DomainSelector", "Using test domain: " + strB);
            return new a(strB, DomainLevel.GLOBAL);
        }
        Area areaB = vg0.b(vg0.e());
        Area areaC = p25.c(str);
        if (areaC != null) {
            String strE = e(areaC, z);
            if (g(strE, set) && this.a.b(strE)) {
                z6b.k("DomainSelector", "Selected " + str2 + " domain (excluding): DEBUG_AREA(" + areaC + "), appId=" + str);
                return new a(strE, DomainLevel.FALLBACK);
            }
        }
        String strB2 = b(str, z, areaB);
        if (g(strB2, set)) {
            if (this.a.b(strB2)) {
                z6b.k("DomainSelector", "Selected " + str2 + " domain (excluding): APP_SPECIFIC for appId=" + str);
                return new a(strB2, DomainLevel.APP_SPECIFIC);
            }
            z6b.k("DomainSelector", "App " + str2 + " domain unavailable, try next level");
        }
        String strF = f(z, areaB);
        if (g(strF, set)) {
            if (this.a.b(strF)) {
                z6b.k("DomainSelector", "Selected " + str2 + " domain (excluding): GLOBAL");
                return new a(strF, DomainLevel.GLOBAL);
            }
            z6b.k("DomainSelector", "Global " + str2 + " domain unavailable, try fallback");
        }
        String strD = d(z, areaB);
        if (g(strD, set)) {
            z6b.k("DomainSelector", "Selected " + str2 + " domain (excluding): FALLBACK");
            return new a(strD, DomainLevel.FALLBACK);
        }
        z6b.u("DomainSelector", "No available " + str2 + " domain (all excluded or unavailable)");
        return null;
    }
}
