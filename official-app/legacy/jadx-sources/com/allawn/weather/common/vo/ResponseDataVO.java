package com.allawn.weather.common.vo;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ResponseDataVO {
    private List<CityVO> citySearchList;
    private CityVO cityVO;
    private Double seaLevelPressure;
    private String version;
    private WeatherSummaryVO weatherSummaryVO;

    public List<CityVO> getCitySearchList() {
        return this.citySearchList;
    }

    public CityVO getCityVO() {
        return this.cityVO;
    }

    public Double getSeaLevelPressure() {
        return this.seaLevelPressure;
    }

    public String getVersion() {
        return this.version;
    }

    public WeatherSummaryVO getWeatherSummaryVO() {
        return this.weatherSummaryVO;
    }

    public void setCitySearchList(List<CityVO> list) {
        this.citySearchList = list;
    }

    public void setCityVO(CityVO cityVO) {
        this.cityVO = cityVO;
    }

    public void setSeaLevelPressure(Double d) {
        this.seaLevelPressure = d;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWeatherSummaryVO(WeatherSummaryVO weatherSummaryVO) {
        this.weatherSummaryVO = weatherSummaryVO;
    }
}
