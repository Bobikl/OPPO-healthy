package com.allawn.weather.common.constant;

/* JADX INFO: loaded from: classes12.dex */
public enum WeatherCodeEnum {
    NONE("NA", 0, "-1", "-1"),
    RAIN("雨", 1, "ic_hour_rain_light", "ic_hour_rain_light_dark"),
    SHOWERS("阵雨", 2, "ic_hour_rain_showers", "ic_hour_rain_showers_dark"),
    SCATTERED_SHOWER("局部阵雨", 3, "ic_hour_rain_showers", "ic_hour_rain_showers_dark"),
    LIGHT_SHOWER("小阵雨", 4, "ic_hour_rain_showers", "ic_hour_rain_showers_dark"),
    HEAVY_SHOWER("强阵雨", 5, "ic_hour_rain_showers", "ic_hour_rain_showers_dark"),
    LIGHT_RAIN("小雨", 6, "ic_hour_rain_light", "ic_hour_rain_light_dark"),
    LIGHT_TO_MID_RAIN("小到中雨", 7, "ic_hour_rain_light", "ic_hour_rain_light_dark"),
    MID_RAIN("中雨", 8, "ic_hour_rain_moderate", "ic_hour_rain_moderate_dark"),
    MID_TO_HEAVY_RAIN("中到大雨", 9, "ic_hour_rain_moderate", "ic_hour_rain_moderate_dark"),
    HEAVY_RAIN("大雨", 10, "ic_hour_rain_heavy", "ic_hour_rain_heavy_dark"),
    HEAVY_TO_RAINSTORM("大到暴雨", 11, "ic_hour_rain_heavy", "ic_hour_rain_heavy_dark"),
    RAINSTORM("暴雨", 12, "ic_hour_rain_storm", "ic_hour_rain_storm_dark"),
    RAINSTORM_TO_HEAVY_RAINSTORM("暴雨到大暴雨", 13, "ic_hour_rain_storm", "ic_hour_rain_storm_dark"),
    HEAVY_RAINSTORM("大暴雨", 14, "ic_hour_rain_storm", "ic_hour_rain_storm_dark"),
    HEAVY_RAINSTORM_TO_EXTRAORDINARY_HEAVY_RAINSTORM("大暴雨到特大暴雨", 15, "ic_hour_rain_storm", "ic_hour_rain_storm_dark"),
    EXTRAORDINARY_HEAVY_RAINSTORM("特大暴雨", 16, "ic_hour_rain_storm", "ic_hour_rain_storm_dark"),
    FREEZING_RAIN("冻雨", 17, "ic_hour_freez_rain", "ic_hour_freez_rain_dark"),
    HAIL("冰雹", 18, "ic_hour_hail", "ic_hour_hail_dark"),
    ICE_NEEDLE("冰针", 19, "ic_hour_hail", "ic_hour_hail_dark"),
    ICE_GRAIN("冰粒", 20, "ic_hour_hail", "ic_hour_hail_dark"),
    ICE("结冰", 21, "ic_hour_snow_storm", "ic_hour_snow_storm_dark"),
    THUNDER_SHOWER("雷阵雨", 22, "ic_hour_thundershower", "ic_hour_thundershower_dark"),
    THUNDER("雷", 23, "ic_hour_thundershower_hail", "ic_hour_thundershower_hail_dark"),
    THUNDER_BOLT("雷电", 24, "ic_hour_thunderstorm", "ic_hour_thunderstorm_dark"),
    THUNDERSTORMS("雷暴", 25, "ic_hour_thunderstorm", "ic_hour_thunderstorm_dark"),
    SNOW("雪", 26, "ic_hour_snow_light", "ic_hour_snow_light_dark"),
    SNOW_SHOWERS("阵雪", 27, "ic_hour_snow_light", "ic_hour_snow_light_dark"),
    SCATTERED_SNOW_SHOWERS("小阵雪", 28, "ic_hour_snow_light", "ic_hour_snow_light_dark"),
    FLURRIES("小雪", 29, "ic_hour_snow_light", "ic_hour_snow_light_dark"),
    FLURRIES_TO_MID_SNOW("小到中雪", 30, "ic_hour_snow_light", "ic_hour_snow_light_dark"),
    MID_SNOW("中雪", 31, "ic_hour_snow_moderate", "ic_hour_snow_moderate_dark"),
    MID_TO_HEAVY_SNOW("中到大雪", 32, "ic_hour_snow_moderate", "ic_hour_snow_moderate_dark"),
    HEAVY_SNOW("大雪", 33, "ic_hour_snow_heavy", "ic_hour_snow_heavy_dark"),
    HEAVY_TO_SNOWSTORM("大到暴雪", 34, "ic_hour_snow_heavy", "ic_hour_snow_heavy_dark"),
    HEAVY_SNOWFALL("暴雪", 35, "ic_hour_snow_storm", "ic_hour_snow_storm_dark"),
    SNOWSTORM("暴风雪", 36, "ic_hour_snow_storm", "ic_hour_snow_storm_dark"),
    RAIN_WITH_SNOW("雨夹雪", 37, "ic_hour_sleet", "ic_hour_sleet_dark"),
    FOGGY("雾", 38, "ic_hour_fog", "ic_hour_fog_dark"),
    FROZEN_FOG("冻雾", 39, "ic_hour_fog", "ic_hour_fog_dark"),
    THIN_FOG("薄雾", 40, "ic_hour_fog", "ic_hour_fog_dark"),
    HEAVY_FOG("大雾", 41, "ic_hour_fog", "ic_hour_fog_dark"),
    THICK_FOG("浓雾", 42, "ic_hour_fog", "ic_hour_fog_dark"),
    STRONG_FOG("强浓雾", 43, "ic_hour_fog", "ic_hour_fog_dark"),
    EXTRAORDINARY_STRONG_FOG("特强浓雾", 44, "ic_hour_fog", "ic_hour_fog_dark"),
    FLOATING_DUST("浮尘", 45, "ic_hour_sand_dust", "ic_hour_sand_dust_dark"),
    SAND_DUST("扬沙", 46, "ic_hour_sand_storm", "ic_hour_sand_storm_dark"),
    DUST_WIND("尘卷风", 47, "ic_hour_sand_storm", "ic_hour_sand_storm_dark"),
    SANDSTORM("沙尘暴", 48, "ic_hour_sand_storm", "ic_hour_sand_storm_dark"),
    STRONG_SANDSTORM("强沙尘暴", 49, "ic_hour_sand_storm", "ic_hour_sand_storm_dark"),
    HAZE("霾", 50, "ic_hour_haze", "ic_hour_haze_dark"),
    MID_HAZE("中度霾", 51, "ic_hour_haze", "ic_hour_haze_dark"),
    HEAVY_HAZE("重度霾", 52, "ic_hour_haze", "ic_hour_haze_dark"),
    SERIOUS_HAZE("严重霾", 53, "ic_hour_haze", "ic_hour_haze_dark"),
    SUNNY("晴", 54, "ic_hour_sunny_day", "ic_hour_sunny_day_dark"),
    MOSTLY_SUNNY("大部晴朗", 55, "ic_hour_sunny_day", "ic_hour_sunny_day_dark"),
    CLOUDY("多云", 56, "ic_hour_cloudy_day", "ic_hour_cloudy_day_dark"),
    CLOUDY_("多云", 57, "ic_hour_cloudy_day", "ic_hour_cloudy_day_dark"),
    PARTLY_CLOUDY("少云", 58, "ic_hour_cloudy_day", "ic_hour_cloudy_day_dark"),
    DREARY("阴", 59, "ic_hour_overcast", "ic_hour_overcast_dark"),
    WIND("风", 60, "ic_hour_wind", "ic_hour_wind_dark"),
    BREEZE("微风", 61, "ic_hour_wind", "ic_hour_wind_dark"),
    STRONG_WIND("强风", 62, "ic_hour_wind", "ic_hour_wind_dark"),
    STORM_WIND("暴风", 63, "ic_hour_typhoon", "ic_hour_typhoon_dark"),
    HURRICANE("飓风", 64, "ic_hour_typhoon", "ic_hour_typhoon_dark"),
    STRONG_STORM("强风暴", 65, "ic_hour_typhoon", "ic_hour_typhoon_dark"),
    TORNADO("龙卷风", 66, "ic_hour_tornado", "ic_hour_tornado_dark"),
    TROPICAL_STORM("热带风暴", 67, "ic_hour_typhoon", "ic_hour_typhoon_dark"),
    SUNNY_NIGHT("夜晴", 68, "ic_hour_sunny_night", "ic_hour_sunny_night_dark"),
    CLOUDY_NIGHT("夜多云", 69, "ic_hour_cloudy_night", "ic_hour_cloudy_night_dark"),
    SUNSET_SETRISE("日出日落", 70, "ic_sunsetrise", "ic_sunsetrise_dark"),
    SUNSET_SETRISE_("日出日落", 71, "ic_sunsetrise", "ic_sunsetrise_dark");

    private int weatherCode;
    private String weatherDesc;
    private String weatherIcon;
    private String weatherIconDark;

    WeatherCodeEnum(String str, int i, String str2, String str3) {
        this.weatherDesc = str;
        this.weatherCode = i;
        this.weatherIcon = str2;
        this.weatherIconDark = str3;
    }

    public static WeatherCodeEnum getWeatherCodeEnum(int i) {
        for (WeatherCodeEnum weatherCodeEnum : values()) {
            if (weatherCodeEnum.weatherCode == i) {
                return weatherCodeEnum;
            }
        }
        return null;
    }

    public static String getWeatherDesc(int i) {
        for (WeatherCodeEnum weatherCodeEnum : values()) {
            if (weatherCodeEnum.weatherCode == i) {
                return weatherCodeEnum.weatherDesc;
            }
        }
        return null;
    }

    public static String getWeatherIcon(int i) {
        for (WeatherCodeEnum weatherCodeEnum : values()) {
            if (weatherCodeEnum.weatherCode == i) {
                return weatherCodeEnum.weatherIcon;
            }
        }
        return null;
    }

    public static String getWeatherIconDark(int i) {
        for (WeatherCodeEnum weatherCodeEnum : values()) {
            if (weatherCodeEnum.weatherCode == i) {
                return weatherCodeEnum.weatherIconDark;
            }
        }
        return null;
    }
}
