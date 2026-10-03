package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.weather.constant.BusinessConstants$RequestMethodEnum;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class sqf {
    public Map<String, String> a;
    public Map<String, String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f16703c;

    public static class b {
        public c a;
        public f b;

        public sqf a() {
            sqf sqfVar = new sqf();
            c cVar = this.a;
            if (cVar != null) {
                sqfVar.a = cVar.a();
            }
            f fVar = this.b;
            if (fVar != null) {
                sqfVar.b = fVar.a();
            }
            sqf.c(sqfVar, null);
            return sqfVar;
        }

        public b b(c cVar) {
            this.a = cVar;
            return this;
        }

        public b c(f fVar) {
            this.b = fVar;
            return this;
        }
    }

    public static class c {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16704c;
        public String d;

        public Map<String, String> a() {
            HashMap map = new HashMap();
            map.put(TraceConstants.KEY_PKG_NAME, this.a);
            map.put("model", this.b);
            map.put("osVersion", this.f16704c);
            map.put("versionCode", this.d);
            return map;
        }
    }

    public interface d {
    }

    public static class e extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16705e;

        public e() {
        }

        public e(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.f16704c = cVar.f16704c;
            this.d = cVar.d;
        }

        @Override // com.oplus.aiunit.vision.sqf.c
        public Map<String, String> a() {
            Map<String, String> mapA = super.a();
            mapA.put("versionName", this.f16705e);
            return mapA;
        }
    }

    public static class f extends e {
        public String f;

        public f(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.f16704c = cVar.f16704c;
            this.d = cVar.d;
        }

        @Override // com.oplus.aiunit.vision.sqf.e, com.oplus.aiunit.vision.sqf.c
        public Map<String, String> a() {
            Map<String, String> mapA = super.a();
            if (!TextUtils.isEmpty(this.f)) {
                mapA.put("region", this.f);
            }
            return mapA;
        }

        public f(e eVar) {
            this((c) eVar);
            this.f16705e = eVar.f16705e;
        }
    }

    public sqf() {
    }

    public static /* synthetic */ d c(sqf sqfVar, d dVar) {
        sqfVar.getClass();
        return dVar;
    }

    public Map<String, String> d(String str, String str2) {
        Map<String, String> map;
        b7b.a("RequestHeader", "getHeaderByRequest handle default header");
        HashMap map2 = new HashMap();
        b7b.b("RequestHeader", "getHeaderByRequest method:" + str + " path: " + str2);
        if (BusinessConstants$RequestMethodEnum.WEATHERDATA.getValue().equals(str)) {
            map = this.b;
        } else {
            map = ("/weather/ad/indexAdData".equals(str2) || BusinessConstants$RequestMethodEnum.INDEX_AD_DATA.getValue().equals(str)) ? this.f16703c : this.a;
        }
        map2.putAll(map);
        return map2;
    }
}
