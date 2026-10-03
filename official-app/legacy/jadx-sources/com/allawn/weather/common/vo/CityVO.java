package com.allawn.weather.common.vo;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class CityVO implements Serializable {
    public static final CityVO EMPTY = new CityVO();
    private String cityName;
    private String countryEnName;
    private String countryID;
    private String countryName;
    private int dataSouceType;
    private String enName;
    private String language;
    private String locationKey;
    private String locationKeyUpdate;
    private String parentLocationKey;
    private String parentSourceKey;
    private String regionEnName;
    private String regionName;
    private String secondaryEnName;
    private String secondaryName;
    private String sourceKey;
    private String tertiaryEnName;
    private String tertiaryName;
    private String timezone;

    public CityVO() {
    }

    public static CityVO getEMPTY() {
        return EMPTY;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CityVO cityVO = (CityVO) obj;
        String str = this.language;
        if (str == null ? cityVO.language != null : !str.equals(cityVO.language)) {
            return false;
        }
        String str2 = this.locationKey;
        if (str2 == null ? cityVO.locationKey != null : !str2.equals(cityVO.locationKey)) {
            return false;
        }
        String str3 = this.cityName;
        if (str3 == null ? cityVO.cityName != null : !str3.equals(cityVO.cityName)) {
            return false;
        }
        String str4 = this.enName;
        if (str4 == null ? cityVO.enName != null : !str4.equals(cityVO.enName)) {
            return false;
        }
        String str5 = this.regionName;
        if (str5 == null ? cityVO.regionName != null : !str5.equals(cityVO.regionName)) {
            return false;
        }
        String str6 = this.regionEnName;
        if (str6 == null ? cityVO.regionEnName != null : !str6.equals(cityVO.regionEnName)) {
            return false;
        }
        String str7 = this.countryName;
        if (str7 == null ? cityVO.countryName != null : !str7.equals(cityVO.countryName)) {
            return false;
        }
        String str8 = this.countryEnName;
        if (str8 == null ? cityVO.countryEnName != null : !str8.equals(cityVO.countryEnName)) {
            return false;
        }
        String str9 = this.secondaryName;
        if (str9 == null ? cityVO.secondaryName != null : !str9.equals(cityVO.secondaryName)) {
            return false;
        }
        String str10 = this.secondaryEnName;
        if (str10 == null ? cityVO.secondaryEnName != null : !str10.equals(cityVO.secondaryEnName)) {
            return false;
        }
        String str11 = this.tertiaryName;
        if (str11 == null ? cityVO.tertiaryName != null : !str11.equals(cityVO.tertiaryName)) {
            return false;
        }
        String str12 = this.tertiaryEnName;
        if (str12 == null ? cityVO.tertiaryEnName != null : !str12.equals(cityVO.tertiaryEnName)) {
            return false;
        }
        String str13 = this.timezone;
        if (str13 == null ? cityVO.timezone != null : !str13.equals(cityVO.timezone)) {
            return false;
        }
        String str14 = this.countryID;
        if (str14 == null ? cityVO.countryID != null : !str14.equals(cityVO.countryID)) {
            return false;
        }
        String str15 = this.parentLocationKey;
        if (str15 != null) {
            return str15.equals(cityVO.parentLocationKey);
        }
        return cityVO.parentLocationKey == null;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getCountryEnName() {
        return this.countryEnName;
    }

    public String getCountryID() {
        return this.countryID;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public int getDataSouceType() {
        return this.dataSouceType;
    }

    public String getEnName() {
        return this.enName;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLocationKey() {
        return this.locationKey;
    }

    public String getLocationKeyUpdate() {
        return this.locationKeyUpdate;
    }

    public String getParentLocationKey() {
        return this.parentLocationKey;
    }

    public String getParentSourceKey() {
        return this.parentSourceKey;
    }

    public String getRegionEnName() {
        return this.regionEnName;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public String getSecondaryEnName() {
        return this.secondaryEnName;
    }

    public String getSecondaryName() {
        return this.secondaryName;
    }

    public String getSourceKey() {
        return this.sourceKey;
    }

    public String getTertiaryEnName() {
        return this.tertiaryEnName;
    }

    public String getTertiaryName() {
        return this.tertiaryName;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        String str = this.language;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.locationKey;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cityName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.enName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.regionName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.regionEnName;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.countryName;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.countryEnName;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.secondaryName;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.secondaryEnName;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.tertiaryName;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.tertiaryEnName;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.timezone;
        int iHashCode13 = (iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.countryID;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.parentLocationKey;
        return iHashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public void setCountryEnName(String str) {
        this.countryEnName = str;
    }

    public void setCountryID(String str) {
        this.countryID = str;
    }

    public void setCountryName(String str) {
        this.countryName = str;
    }

    public void setDataSouceType(int i) {
        this.dataSouceType = i;
    }

    public void setEnName(String str) {
        this.enName = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLocationKey(String str) {
        this.locationKey = str;
    }

    public void setLocationKeyUpdate(String str) {
        this.locationKeyUpdate = str;
    }

    public void setParentLocationKey(String str) {
        this.parentLocationKey = str;
    }

    public void setParentSourceKey(String str) {
        this.parentSourceKey = str;
    }

    public void setRegionEnName(String str) {
        this.regionEnName = str;
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public void setSecondaryEnName(String str) {
        this.secondaryEnName = str;
    }

    public void setSecondaryName(String str) {
        this.secondaryName = str;
    }

    public void setSourceKey(String str) {
        this.sourceKey = str;
    }

    public void setTertiaryEnName(String str) {
        this.tertiaryEnName = str;
    }

    public void setTertiaryName(String str) {
        this.tertiaryName = str;
    }

    public void setTimezone(String str) {
        this.timezone = str;
    }

    public String toKeyString() {
        return "CityVO{, cityName='" + this.cityName + "', enName='" + this.enName + "', countryName='" + this.countryName + "', countryEnName='" + this.countryEnName + "', secondaryName='" + this.secondaryName + "', secondaryEnName='" + this.secondaryEnName + "', tertiaryName='" + this.tertiaryName + "', tertiaryEnName='" + this.tertiaryEnName + "'}";
    }

    public CityVO(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.language = str;
        this.locationKey = str2;
        this.cityName = str3;
        this.enName = str4;
        this.regionName = str5;
        this.regionEnName = str6;
        this.countryName = str7;
        this.countryEnName = str8;
        this.secondaryName = str9;
        this.secondaryEnName = str10;
        this.tertiaryName = str11;
        this.tertiaryEnName = str12;
        this.timezone = str13;
        this.countryID = str14;
        this.parentLocationKey = str15;
    }
}
