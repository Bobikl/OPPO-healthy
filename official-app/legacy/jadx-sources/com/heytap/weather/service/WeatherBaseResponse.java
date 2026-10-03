package com.heytap.weather.service;

import androidx.annotation.Keep;
import com.allawn.weather.common.vo.CityVO;
import com.allawn.weather.common.vo.WeatherSummaryVO;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/weather/service/WeatherBaseResponse;", "", "weatherSummaryVO", "Lcom/allawn/weather/common/vo/WeatherSummaryVO;", "cityVO", "Lcom/allawn/weather/common/vo/CityVO;", "citySearchList", "", "(Lcom/allawn/weather/common/vo/WeatherSummaryVO;Lcom/allawn/weather/common/vo/CityVO;Ljava/util/List;)V", "getCitySearchList", "()Ljava/util/List;", "setCitySearchList", "(Ljava/util/List;)V", "getCityVO", "()Lcom/allawn/weather/common/vo/CityVO;", "setCityVO", "(Lcom/allawn/weather/common/vo/CityVO;)V", "getWeatherSummaryVO", "()Lcom/allawn/weather/common/vo/WeatherSummaryVO;", "setWeatherSummaryVO", "(Lcom/allawn/weather/common/vo/WeatherSummaryVO;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeatherBaseResponse {

    @Nullable
    private List<? extends CityVO> citySearchList;

    @Nullable
    private CityVO cityVO;

    @Nullable
    private WeatherSummaryVO weatherSummaryVO;

    public WeatherBaseResponse(@Nullable WeatherSummaryVO weatherSummaryVO, @Nullable CityVO cityVO, @Nullable List<? extends CityVO> list) {
        this.weatherSummaryVO = weatherSummaryVO;
        this.cityVO = cityVO;
        this.citySearchList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeatherBaseResponse copy$default(WeatherBaseResponse weatherBaseResponse, WeatherSummaryVO weatherSummaryVO, CityVO cityVO, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            weatherSummaryVO = weatherBaseResponse.weatherSummaryVO;
        }
        if ((i & 2) != 0) {
            cityVO = weatherBaseResponse.cityVO;
        }
        if ((i & 4) != 0) {
            list = weatherBaseResponse.citySearchList;
        }
        return weatherBaseResponse.copy(weatherSummaryVO, cityVO, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeatherSummaryVO getWeatherSummaryVO() {
        return this.weatherSummaryVO;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CityVO getCityVO() {
        return this.cityVO;
    }

    @Nullable
    public final List<CityVO> component3() {
        return this.citySearchList;
    }

    @NotNull
    public final WeatherBaseResponse copy(@Nullable WeatherSummaryVO weatherSummaryVO, @Nullable CityVO cityVO, @Nullable List<? extends CityVO> citySearchList) {
        return new WeatherBaseResponse(weatherSummaryVO, cityVO, citySearchList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherBaseResponse)) {
            return false;
        }
        WeatherBaseResponse weatherBaseResponse = (WeatherBaseResponse) other;
        return Intrinsics.areEqual(this.weatherSummaryVO, weatherBaseResponse.weatherSummaryVO) && Intrinsics.areEqual(this.cityVO, weatherBaseResponse.cityVO) && Intrinsics.areEqual(this.citySearchList, weatherBaseResponse.citySearchList);
    }

    @Nullable
    public final List<CityVO> getCitySearchList() {
        return this.citySearchList;
    }

    @Nullable
    public final CityVO getCityVO() {
        return this.cityVO;
    }

    @Nullable
    public final WeatherSummaryVO getWeatherSummaryVO() {
        return this.weatherSummaryVO;
    }

    public int hashCode() {
        WeatherSummaryVO weatherSummaryVO = this.weatherSummaryVO;
        int iHashCode = (weatherSummaryVO == null ? 0 : weatherSummaryVO.hashCode()) * 31;
        CityVO cityVO = this.cityVO;
        int iHashCode2 = (iHashCode + (cityVO == null ? 0 : cityVO.hashCode())) * 31;
        List<? extends CityVO> list = this.citySearchList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setCitySearchList(@Nullable List<? extends CityVO> list) {
        this.citySearchList = list;
    }

    public final void setCityVO(@Nullable CityVO cityVO) {
        this.cityVO = cityVO;
    }

    public final void setWeatherSummaryVO(@Nullable WeatherSummaryVO weatherSummaryVO) {
        this.weatherSummaryVO = weatherSummaryVO;
    }

    @NotNull
    public String toString() {
        return "WeatherBaseResponse(weatherSummaryVO=" + this.weatherSummaryVO + ", cityVO=" + this.cityVO + ", citySearchList=" + this.citySearchList + ")";
    }
}
