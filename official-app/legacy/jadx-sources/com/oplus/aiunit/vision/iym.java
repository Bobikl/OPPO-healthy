package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.district.DistrictSearchQuery;
import com.amap.api.services.geocoder.AoiItem;
import com.amap.api.services.geocoder.BusinessArea;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeRoad;
import com.amap.api.services.geocoder.StreetNumber;
import com.amap.api.services.help.Tip;
import com.amap.api.services.poisearch.IndoorData;
import com.amap.api.services.poisearch.Photo;
import com.amap.api.services.poisearch.PoiItemExtension;
import com.amap.api.services.poisearch.SubPoiItem;
import com.amap.api.services.road.Crossroad;
import com.heytap.health.settings.me.setting.NetWorkOfficeWebViewActivity;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes12.dex */
public final class iym {
    public static String[] a = {"010", "021", "022", "023", "1852", "1853"};

    public static List<Photo> a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null || !jSONObject.has("photos")) {
            return arrayList;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("photos");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            Photo photo = new Photo();
            photo.setTitle(b(jSONObjectOptJSONObject, "title"));
            photo.setUrl(b(jSONObjectOptJSONObject, "url"));
            arrayList.add(photo);
        }
        return arrayList;
    }

    public static String b(JSONObject jSONObject, String str) throws JSONException {
        return (jSONObject == null || !jSONObject.has(str) || jSONObject.optString(str).equals("[]")) ? "" : jSONObject.optString(str).trim();
    }

    public static ArrayList<g3j> c(JSONObject jSONObject) throws JSONException, NumberFormatException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList<g3j> arrayList = new ArrayList<>();
        if (!jSONObject.has("cities") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("cities")) == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(new g3j(b(jSONObjectOptJSONObject, "name"), b(jSONObjectOptJSONObject, "citycode"), b(jSONObjectOptJSONObject, "adcode"), v(b(jSONObjectOptJSONObject, "num"))));
            }
        }
        return arrayList;
    }

    public static void d(PoiItem poiItem, JSONObject jSONObject) throws JSONException {
        List<Photo> listA = a(jSONObject.optJSONObject("deep_info"));
        if (listA.size() == 0) {
            listA = a(jSONObject);
        }
        poiItem.setPhotos(listA);
    }

    public static void e(RegeocodeAddress regeocodeAddress) {
        if ((regeocodeAddress.getCity() == null || regeocodeAddress.getCity().length() <= 0) && s(regeocodeAddress.getCityCode())) {
            regeocodeAddress.setCity(regeocodeAddress.getProvince());
        }
    }

    public static void f(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Crossroad crossroad = new Crossroad();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                crossroad.setId(b(jSONObjectOptJSONObject, "id"));
                crossroad.setDirection(b(jSONObjectOptJSONObject, "direction"));
                crossroad.setDistance(x(b(jSONObjectOptJSONObject, "distance")));
                crossroad.setCenterPoint(j(jSONObjectOptJSONObject, "location"));
                crossroad.setFirstRoadId(b(jSONObjectOptJSONObject, "first_id"));
                crossroad.setFirstRoadName(b(jSONObjectOptJSONObject, "first_name"));
                crossroad.setSecondRoadId(b(jSONObjectOptJSONObject, "second_id"));
                crossroad.setSecondRoadName(b(jSONObjectOptJSONObject, "second_name"));
                arrayList.add(crossroad);
            }
        }
        regeocodeAddress.setCrossroads(arrayList);
    }

    public static void g(JSONObject jSONObject, RegeocodeAddress regeocodeAddress) throws JSONException {
        regeocodeAddress.setCountry(b(jSONObject, "country"));
        regeocodeAddress.setCountryCode(b(jSONObject, "countrycode"));
        regeocodeAddress.setProvince(b(jSONObject, DistrictSearchQuery.KEYWORDS_PROVINCE));
        regeocodeAddress.setCity(b(jSONObject, DistrictSearchQuery.KEYWORDS_CITY));
        regeocodeAddress.setCityCode(b(jSONObject, "citycode"));
        regeocodeAddress.setAdCode(b(jSONObject, "adcode"));
        regeocodeAddress.setDistrict(b(jSONObject, DistrictSearchQuery.KEYWORDS_DISTRICT));
        regeocodeAddress.setTownship(b(jSONObject, "township"));
        regeocodeAddress.setNeighborhood(b(jSONObject.optJSONObject("neighborhood"), "name"));
        regeocodeAddress.setBuilding(b(jSONObject.optJSONObject("building"), "name"));
        StreetNumber streetNumber = new StreetNumber();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("streetNumber");
        streetNumber.setStreet(b(jSONObjectOptJSONObject, "street"));
        streetNumber.setNumber(b(jSONObjectOptJSONObject, "number"));
        streetNumber.setLatLonPoint(j(jSONObjectOptJSONObject, "location"));
        streetNumber.setDirection(b(jSONObjectOptJSONObject, "direction"));
        streetNumber.setDistance(x(b(jSONObjectOptJSONObject, "distance")));
        regeocodeAddress.setStreetNumber(streetNumber);
        regeocodeAddress.setBusinessAreas(w(jSONObject));
        regeocodeAddress.setTowncode(b(jSONObject, "towncode"));
        e(regeocodeAddress);
    }

    public static ArrayList<String> h(JSONObject jSONObject) throws JSONException {
        ArrayList<String> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keywords");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(jSONArrayOptJSONArray.optString(i));
        }
        return arrayList;
    }

    public static void i(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            RegeocodeRoad regeocodeRoad = new RegeocodeRoad();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                regeocodeRoad.setId(b(jSONObjectOptJSONObject, "id"));
                regeocodeRoad.setName(b(jSONObjectOptJSONObject, "name"));
                regeocodeRoad.setLatLngPoint(j(jSONObjectOptJSONObject, "location"));
                regeocodeRoad.setDirection(b(jSONObjectOptJSONObject, "direction"));
                regeocodeRoad.setDistance(x(b(jSONObjectOptJSONObject, "distance")));
                arrayList.add(regeocodeRoad);
            }
        }
        regeocodeAddress.setRoads(arrayList);
    }

    public static LatLonPoint j(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            return t(jSONObject.optString(str));
        }
        return null;
    }

    public static ArrayList<PoiItem> k(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        ArrayList<PoiItem> arrayList = new ArrayList<>();
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("pois")) != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(m(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    public static void l(JSONArray jSONArray, RegeocodeAddress regeocodeAddress) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            AoiItem aoiItem = new AoiItem();
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                aoiItem.setId(b(jSONObjectOptJSONObject, "id"));
                aoiItem.setName(b(jSONObjectOptJSONObject, "name"));
                aoiItem.setAdcode(b(jSONObjectOptJSONObject, "adcode"));
                aoiItem.setLocation(j(jSONObjectOptJSONObject, "location"));
                aoiItem.setArea(Float.valueOf(x(b(jSONObjectOptJSONObject, DebugModeEntity.KEY_AREA))));
                aoiItem.setDistance(x(b(jSONObjectOptJSONObject, "distance")));
                aoiItem.setType(b(jSONObjectOptJSONObject, "type"));
                arrayList.add(aoiItem);
            }
        }
        regeocodeAddress.setAois(arrayList);
    }

    public static PoiItem m(JSONObject jSONObject) throws JSONException {
        PoiItem poiItem = new PoiItem(b(jSONObject, "id"), j(jSONObject, "location"), b(jSONObject, "name"), b(jSONObject, "address"));
        poiItem.setAdCode(b(jSONObject, "adcode"));
        poiItem.setProvinceName(b(jSONObject, TombstoneParser.keyProcessName));
        poiItem.setCityName(b(jSONObject, "cityname"));
        poiItem.setAdName(b(jSONObject, "adname"));
        poiItem.setCityCode(b(jSONObject, "citycode"));
        poiItem.setProvinceCode(b(jSONObject, "pcode"));
        poiItem.setDirection(b(jSONObject, "direction"));
        if (jSONObject.has("distance")) {
            String strB = b(jSONObject, "distance");
            if (!p(strB)) {
                try {
                    poiItem.setDistance((int) Float.parseFloat(strB));
                } catch (NumberFormatException e2) {
                    qxm.g(e2, "JSONHelper", "parseBasePoi");
                } catch (Exception e3) {
                    qxm.g(e3, "JSONHelper", "parseBasePoi");
                }
            }
        }
        poiItem.setTel(b(jSONObject, "tel"));
        poiItem.setTypeDes(b(jSONObject, "type"));
        poiItem.setEnter(j(jSONObject, "entr_location"));
        poiItem.setExit(j(jSONObject, "exit_location"));
        poiItem.setWebsite(b(jSONObject, NetWorkOfficeWebViewActivity.EXTRA_WEBSITE));
        poiItem.setPostcode(b(jSONObject, "postcode"));
        String strB2 = b(jSONObject, "business_area");
        if (p(strB2)) {
            strB2 = b(jSONObject, "businessarea");
        }
        poiItem.setBusinessArea(strB2);
        poiItem.setEmail(b(jSONObject, "email"));
        if (u(b(jSONObject, "indoor_map"))) {
            poiItem.setIndoorMap(false);
        } else {
            poiItem.setIndoorMap(true);
        }
        poiItem.setParkingType(b(jSONObject, "parking_type"));
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("children")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(r(jSONObjectOptJSONObject));
                    }
                }
            }
            poiItem.setSubPois(arrayList);
        }
        poiItem.setIndoorDate(n(jSONObject, "indoor_data"));
        poiItem.setPoiExtension(o(jSONObject, "biz_ext"));
        poiItem.setTypeCode(b(jSONObject, "typecode"));
        poiItem.setShopID(b(jSONObject, "shopid"));
        d(poiItem, jSONObject);
        return poiItem;
    }

    public static IndoorData n(JSONObject jSONObject, String str) throws JSONException {
        String strB;
        int iV;
        String strB2;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject.has(str) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null && jSONObjectOptJSONObject.has("cpid") && jSONObjectOptJSONObject.has("floor")) {
            strB = b(jSONObjectOptJSONObject, "cpid");
            iV = v(b(jSONObjectOptJSONObject, "floor"));
            strB2 = b(jSONObjectOptJSONObject, "truefloor");
        } else {
            strB = "";
            iV = 0;
            strB2 = "";
        }
        return new IndoorData(strB, iV, strB2);
    }

    public static PoiItemExtension o(JSONObject jSONObject, String str) throws JSONException {
        String strB;
        String strB2;
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null) {
            strB = "";
            strB2 = "";
        } else {
            strB = b(jSONObjectOptJSONObject, "open_time");
            strB2 = b(jSONObjectOptJSONObject, "rating");
        }
        return new PoiItemExtension(strB, strB2);
    }

    public static boolean p(String str) {
        return str == null || str.equals("");
    }

    public static ArrayList<Tip> q(JSONObject jSONObject) throws JSONException {
        ArrayList<Tip> arrayList = new ArrayList<>();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tips");
        if (jSONArrayOptJSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            Tip tip = new Tip();
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                tip.setName(b(jSONObjectOptJSONObject, "name"));
                tip.setDistrict(b(jSONObjectOptJSONObject, DistrictSearchQuery.KEYWORDS_DISTRICT));
                tip.setAdcode(b(jSONObjectOptJSONObject, "adcode"));
                tip.setID(b(jSONObjectOptJSONObject, "id"));
                tip.setAddress(b(jSONObjectOptJSONObject, "address"));
                tip.setTypeCode(b(jSONObjectOptJSONObject, "typecode"));
                String strB = b(jSONObjectOptJSONObject, "location");
                if (!TextUtils.isEmpty(strB)) {
                    String[] strArrSplit = strB.split(",");
                    if (strArrSplit.length == 2) {
                        tip.setPostion(new LatLonPoint(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0])));
                    }
                }
                arrayList.add(tip);
            }
        }
        return arrayList;
    }

    public static SubPoiItem r(JSONObject jSONObject) throws JSONException {
        SubPoiItem subPoiItem = new SubPoiItem(b(jSONObject, "id"), j(jSONObject, "location"), b(jSONObject, "name"), b(jSONObject, "address"));
        subPoiItem.setSubName(b(jSONObject, "sname"));
        subPoiItem.setSubTypeDes(b(jSONObject, "subtype"));
        if (jSONObject.has("distance")) {
            String strB = b(jSONObject, "distance");
            if (!p(strB)) {
                try {
                    subPoiItem.setDistance((int) Float.parseFloat(strB));
                } catch (NumberFormatException e2) {
                    qxm.g(e2, "JSONHelper", "parseSubPoiItem");
                } catch (Exception e3) {
                    qxm.g(e3, "JSONHelper", "parseSubPoiItem");
                }
            }
        }
        return subPoiItem;
    }

    public static boolean s(String str) {
        if (str != null && str.length() > 0) {
            for (String str2 : a) {
                if (str.trim().equals(str2.trim())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static LatLonPoint t(String str) {
        if (str == null || str.equals("") || str.equals("[]")) {
            return null;
        }
        String[] strArrSplit = str.split(",| ");
        if (strArrSplit.length != 2) {
            return null;
        }
        return new LatLonPoint(Double.parseDouble(strArrSplit[1]), Double.parseDouble(strArrSplit[0]));
    }

    public static boolean u(String str) {
        return str == null || str.equals("") || str.equals("0");
    }

    public static int v(String str) {
        if (str == null || str.equals("") || str.equals("[]")) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            qxm.g(e2, "JSONHelper", "str2int");
            return 0;
        }
    }

    public static List<BusinessArea> w(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("businessAreas");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                BusinessArea businessArea = new BusinessArea();
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    businessArea.setCenterPoint(j(jSONObjectOptJSONObject, "location"));
                    businessArea.setName(b(jSONObjectOptJSONObject, "name"));
                    arrayList.add(businessArea);
                }
            }
        }
        return arrayList;
    }

    public static float x(String str) {
        if (str == null || str.equals("") || str.equals("[]")) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            qxm.g(e2, "JSONHelper", "str2float");
            return 0.0f;
        }
    }
}
