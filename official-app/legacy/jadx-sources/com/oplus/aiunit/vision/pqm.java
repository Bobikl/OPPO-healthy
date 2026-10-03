package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.amap.api.services.district.DistrictSearchQuery;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.oplus.deepthinker.sdk.app.userprofile.labels.CommuteWayLabel;

/* JADX INFO: loaded from: classes12.dex */
public final class pqm {
    public static final int[][] a = {new int[]{0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}, new int[]{12}, new int[]{1}, new int[]{13}, new int[]{14}, new int[]{15, 16}, new int[]{17, 18, 19, 20, 21, 26, 27, 28}, new int[]{22, 23}, new int[]{24, 25}, new int[]{39, 40, 41}, new int[]{29, 30, 31}, new int[]{32, 33, 34, 35, 36, 37, 38}};
    public static final String[] b = {"land", "water", "green", "building", "highway", "arterial", "local", "railway", CommuteWayLabel.SUBWAY_TAG, "boundary", "poilabel", "districtlable"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[][] f15449c = {new String[]{"land", "edu", "public", "traffic", "scenicSpot", "culture", "health", "sports", "business", "parkingLot", CommuteWayLabel.SUBWAY_TAG}, new String[]{"water"}, new String[]{"green"}, new String[]{"buildings"}, new String[]{"highWay"}, new String[]{"ringRoad", "nationalRoad"}, new String[]{"provincialRoad", "secondaryRoad", "levelThreeRoad", "levelFourRoad", "roadsBeingBuilt", "overPass", "underPass", "other"}, new String[]{"railway", "highSpeedRailway"}, new String[]{"subwayline", "subwayBeingBuilt"}, new String[]{"China", "foreign", "provincial"}, new String[]{"guideBoards", "pois", "aois"}, new String[]{CityBean.CONTINENT, "country", DistrictSearchQuery.KEYWORDS_PROVINCE, DistrictSearchQuery.KEYWORDS_CITY, DistrictSearchQuery.KEYWORDS_DISTRICT, "town", "village"}};
    public static final String[] d = {"regions", "water", "regions", "buildings", "roads", "roads", "roads", "roads", "roads", "borders", "labels", "labels"};

    public static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = b;
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (strArr[i].equals(str)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return f15449c[i];
        }
        return null;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = b;
            if (i >= strArr.length) {
                i = -1;
                break;
            }
            if (strArr[i].equals(str)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return d[i];
        }
        return null;
    }
}
