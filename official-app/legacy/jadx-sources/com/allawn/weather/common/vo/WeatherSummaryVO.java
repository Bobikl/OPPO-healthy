package com.allawn.weather.common.vo;

/* JADX INFO: loaded from: classes12.dex */
public class WeatherSummaryVO implements Cloneable {
    private AlertVO alert;
    private AirqualityVO aq;
    private DailyForecastVO dfw;
    private HourlyForecastVO hfw;
    private IndexVO index;
    private ObserveVO obw;

    public AlertVO getAlert() {
        return this.alert;
    }

    public AirqualityVO getAq() {
        return this.aq;
    }

    public DailyForecastVO getDfw() {
        return this.dfw;
    }

    public HourlyForecastVO getHfw() {
        return this.hfw;
    }

    public IndexVO getIndex() {
        return this.index;
    }

    public ObserveVO getObw() {
        return this.obw;
    }

    public void setAlert(AlertVO alertVO) {
        this.alert = alertVO;
    }

    public void setAq(AirqualityVO airqualityVO) {
        this.aq = airqualityVO;
    }

    public void setDfw(DailyForecastVO dailyForecastVO) {
        this.dfw = dailyForecastVO;
    }

    public void setHfw(HourlyForecastVO hourlyForecastVO) {
        this.hfw = hourlyForecastVO;
    }

    public void setIndex(IndexVO indexVO) {
        this.index = indexVO;
    }

    public void setObw(ObserveVO observeVO) {
        this.obw = observeVO;
    }

    public String toString() {
        return "WeatherSummaryVO{obw=" + this.obw + ", dfw=" + this.dfw + ", hfw=" + this.hfw + ", aq=" + this.aq + ", index=" + this.index + ", alert=" + this.alert + '}';
    }
}
