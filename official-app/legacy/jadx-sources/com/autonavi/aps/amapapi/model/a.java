package com.autonavi.aps.amapapi.model;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.utils.c;
import com.autonavi.aps.amapapi.utils.k;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AMapLocation {
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f1111e;
    String f;
    private String g;
    private String h;
    private int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f1112j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f1113l;
    private JSONObject m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f1114n;
    private String o;
    private String p;

    public a(String str) {
        super(str);
        this.d = "";
        this.g = null;
        this.h = "";
        this.f1112j = "";
        this.k = 0;
        this.f1113l = EventType.CityFenceExtra.BUNDLE_KEY_NEW;
        this.m = null;
        this.f1114n = "";
        this.f1111e = true;
        this.f = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
        this.o = "";
        this.p = null;
    }

    private void i(String str) {
        this.f1114n = str;
    }

    public final String a() {
        return this.g;
    }

    public final String b() {
        return this.h;
    }

    public final int c() {
        return this.i;
    }

    public final String d() {
        return this.f1112j;
    }

    public final String e() {
        return this.f1113l;
    }

    public final JSONObject f() {
        return this.m;
    }

    public final String g() {
        return this.f1114n;
    }

    public final a h() {
        String strG = g();
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        String[] strArrSplit = strG.split(",");
        if (strArrSplit.length != 3) {
            return null;
        }
        a aVar = new a("");
        aVar.setProvider(getProvider());
        aVar.setLongitude(k.c(strArrSplit[0]));
        aVar.setLatitude(k.c(strArrSplit[1]));
        aVar.setAccuracy(k.d(strArrSplit[2]));
        aVar.setCityCode(getCityCode());
        aVar.setAdCode(getAdCode());
        aVar.setCountry(getCountry());
        aVar.setProvince(getProvince());
        aVar.setCity(getCity());
        aVar.setTime(getTime());
        aVar.e(e());
        aVar.c(String.valueOf(c()));
        if (k.a(aVar)) {
            return aVar;
        }
        return null;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.p;
    }

    public final int l() {
        return this.k;
    }

    @Override // com.amap.api.location.AMapLocation
    public final void setLocationType(int i) {
        if (i == 2 || i == 4 || i == 9) {
            com.autonavi.aps.amapapi.utils.a.a(this);
        }
        super.setLocationType(i);
    }

    @Override // com.amap.api.location.AMapLocation
    public final JSONObject toJson(int i) {
        try {
            JSONObject json = super.toJson(i);
            if (i == 1) {
                json.put("retype", this.f1112j);
                json.put("cens", this.o);
                json.put("coord", this.i);
                json.put("mcell", this.f1114n);
                json.put(DBHealthReviewPlan.DESC, this.d);
                json.put("address", getAddress());
                if (this.m != null && k.a(json, "offpct")) {
                    json.put("offpct", this.m.getString("offpct"));
                }
            } else if (i != 2 && i != 3) {
                return json;
            }
            json.put("type", this.f1113l);
            json.put("isReversegeo", this.f1111e);
            json.put("geoLanguage", this.f);
            return json;
        } catch (Throwable th) {
            c.a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr() {
        return toStr(1);
    }

    private void j(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split("\\*")) {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split(",");
                setLongitude(k.c(strArrSplit[0]));
                setLatitude(k.c(strArrSplit[1]));
                setAccuracy(k.e(strArrSplit[2]));
                break;
            }
        }
        this.o = str;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void b(String str) {
        this.h = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            this.i = -1;
        } else if (str.equals("0")) {
            this.i = 0;
        } else if (str.equals("1")) {
            this.i = 1;
        } else {
            this.i = -1;
        }
        if (this.i == 0) {
            super.setCoordType("WGS84");
        } else {
            super.setCoordType("GCJ02");
        }
    }

    public final void d(String str) {
        this.f1112j = str;
    }

    public final void e(String str) {
        this.f1113l = str;
    }

    public final void f(String str) {
        this.f = str;
    }

    public final void g(String str) {
        this.d = str;
    }

    public final boolean i() {
        return this.f1111e;
    }

    @Override // com.amap.api.location.AMapLocation
    public final String toStr(int i) {
        JSONObject json;
        try {
            json = toJson(i);
            json.put("nb", this.p);
        } catch (Throwable th) {
            c.a(th, "AMapLocation", "toStr part2");
            json = null;
        }
        if (json == null) {
            return null;
        }
        return json.toString();
    }

    public final void a(JSONObject jSONObject) {
        this.m = jSONObject;
    }

    public final void b(JSONObject jSONObject) {
        try {
            c.a(this, jSONObject);
            e(jSONObject.optString("type", this.f1113l));
            d(jSONObject.optString("retype", this.f1112j));
            j(jSONObject.optString("cens", this.o));
            g(jSONObject.optString(DBHealthReviewPlan.DESC, this.d));
            c(jSONObject.optString("coord", String.valueOf(this.i)));
            i(jSONObject.optString("mcell", this.f1114n));
            a(jSONObject.optBoolean("isReversegeo", this.f1111e));
            f(jSONObject.optString("geoLanguage", this.f));
            if (k.a(jSONObject, "poiid")) {
                setBuildingId(jSONObject.optString("poiid"));
            }
            if (k.a(jSONObject, "pid")) {
                setBuildingId(jSONObject.optString("pid"));
            }
            if (k.a(jSONObject, "floor")) {
                setFloor(jSONObject.optString("floor"));
            }
            if (k.a(jSONObject, "flr")) {
                setFloor(jSONObject.optString("flr"));
            }
        } catch (Throwable th) {
            c.a(th, "AmapLoc", "AmapLoc");
        }
    }

    public final void a(boolean z) {
        this.f1111e = z;
    }

    public final void a(int i) {
        this.k = i;
    }

    public final void h(String str) {
        this.p = str;
    }
}
