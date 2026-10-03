package com.heytap.health.bandface.watchface.worldclock.cities;

import android.database.Cursor;
import android.text.TextUtils;
import com.oplus.aiunit.vision.cc3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public class CityBean implements Serializable {
    public static final String ALLSPELL = "full_spell";
    public static final String CITYID = "city_id";
    public static final String CONTINENT = "continent";
    public static final String FLAG = "flag";
    public static final String FLAG2 = "flag2";
    public static final String FLETTER = "first_letter";
    public static final String FSPELL = "first_spell";
    public static final String INDEX = "city_index";
    public static final String LAT = "latitude";
    public static final String LOCALE = "locale";
    public static final String LON = "longitude";
    public static final String NAME = "name";
    public static final String POS = "pos";
    public static final String RAWOFFSET = "raw_offset";
    public static final String REGION = "region";
    public static final String SORTORDER = "sort_order";
    public static final String TIMEZONEID = "timezone_id";
    private final int cityId;
    private final int cityIndex;
    private final String continent;
    private final String firstLetter;
    private final String firstSpell;
    private final int flag;
    private final int flag2;
    private final String fullSpell;
    private final float latitude;
    private final String locale;
    private final float longitude;
    private final String name;
    public String nameEn;
    private final int pos;
    private final int rawOffset;
    private final String region;
    private final int sortOrder;
    private final String timezoneId;

    public CityBean(Cursor cursor) {
        this.cityId = cursor.getInt(cursor.getColumnIndex("city_id"));
        this.name = cursor.getString(cursor.getColumnIndex("name"));
        this.firstLetter = cursor.getString(cursor.getColumnIndex(FLETTER));
        this.cityIndex = cursor.getInt(cursor.getColumnIndex(INDEX));
        this.timezoneId = cursor.getString(cursor.getColumnIndex(TIMEZONEID));
        this.rawOffset = cursor.getInt(cursor.getColumnIndex(RAWOFFSET));
        this.latitude = cursor.getFloat(cursor.getColumnIndex("latitude"));
        this.longitude = cursor.getFloat(cursor.getColumnIndex("longitude"));
        this.firstSpell = cursor.getString(cursor.getColumnIndex(FSPELL));
        this.fullSpell = cursor.getString(cursor.getColumnIndex(ALLSPELL));
        this.flag = cursor.getInt(cursor.getColumnIndex("flag"));
        this.flag2 = cursor.getInt(cursor.getColumnIndex(FLAG2));
        this.sortOrder = cursor.getInt(cursor.getColumnIndex(SORTORDER));
        this.pos = cursor.getInt(cursor.getColumnIndex(POS));
        this.locale = cursor.getString(cursor.getColumnIndex(LOCALE));
        this.region = cursor.getString(cursor.getColumnIndex("region"));
        this.continent = cursor.getString(cursor.getColumnIndex(CONTINENT));
    }

    public int getCityId() {
        return this.cityId;
    }

    public int getCityIndex() {
        return this.cityIndex;
    }

    public String getContinent() {
        return this.continent;
    }

    public String getDisplayName() {
        String strC = new cc3().c(this);
        this.nameEn = strC;
        if (TextUtils.isEmpty(strC)) {
            this.nameEn = this.name;
        }
        String str = this.nameEn.split(",")[0];
        this.nameEn = str;
        return str.replaceAll("[^\\x20-\\x7e]", "");
    }

    public String getFirstLetter() {
        return this.firstLetter;
    }

    public String getFirstSpell() {
        return this.firstSpell;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getFlag2() {
        return this.flag2;
    }

    public String getFullSpell() {
        return this.fullSpell;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public String getLocale() {
        return this.locale;
    }

    public float getLongitude() {
        return this.longitude;
    }

    public String getName() {
        return this.name;
    }

    public int getPos() {
        return this.pos;
    }

    public int getRawOffset() {
        return this.rawOffset;
    }

    public String getRegion() {
        return this.region;
    }

    public int getSortOrder() {
        return this.sortOrder;
    }

    public String getTimezoneId() {
        return this.timezoneId;
    }

    public String toString() {
        return "CityBean{city_id=" + this.cityId + ", name='" + this.name + "', first_letter='" + this.firstLetter + "', city_index=" + this.cityIndex + ", timezone_id='" + this.timezoneId + "', raw_offset=" + this.rawOffset + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", first_spell='" + this.firstSpell + "', full_spell='" + this.fullSpell + "', flag=" + this.flag + ", flag2=" + this.flag2 + ", sort_order=" + this.sortOrder + ", pos=" + this.pos + ", locale='" + this.locale + "', region='" + this.region + "', continent='" + this.continent + "'}";
    }
}
