package com.heytap.databaseengine.model;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.me8;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class TrackMetaData {
    private static final String TAG = "TrackMetaData";
    private String coordinate;
    private String runExtra;
    private String sportId;
    private int sportMode;
    private String sportName;
    private int sportType;
    private String vendor;
    private int avgPace = 0;
    private int bestPace = 0;
    private int avgHeartRate = 0;
    private int maxHeartRate = 0;
    private int minHeartRate = 0;
    private int avgStepRate = 0;
    private int bestStepRate = 0;
    private int totalDistance = 0;
    private int modifiedTotalDistance = 0;
    private long totalCalories = 0;
    private int totalSteps = 0;
    private long totalTime = 0;
    private int totalClimb = 0;
    private Map<Float, Short> partTimeMap = new HashMap();
    private Map<Double, Short> britishPartTimeMap = new HashMap();
    private Map<Integer, Integer> paceMap = new HashMap();
    private Map<Float, Integer> britishPaceMap = new HashMap();
    private int creepingWave = 0;
    private Map<String, Integer> wearSportData = new HashMap();
    private boolean isFreeMotion = false;
    private int sportDataSource = 0;
    private int chiefSportDataType = 0;
    private boolean hasTrackPoint = true;
    private int abnormalTrack = 0;
    private Map<Long, Short> stepRate = new HashMap();
    private Map<Long, Double> altitude = new HashMap();

    public int getAbnormalTrack() {
        return this.abnormalTrack;
    }

    public Map<Long, Double> getAltitude() {
        return this.altitude;
    }

    public int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public int getAvgPace() {
        return this.avgPace;
    }

    public int getAvgStepRate() {
        return this.avgStepRate;
    }

    public int getBestPace() {
        return this.bestPace;
    }

    public int getBestStepRate() {
        return this.bestStepRate;
    }

    public Map<Float, Integer> getBritishPaceMap() {
        return this.britishPaceMap;
    }

    public Map<Double, Short> getBritishPartTimeMap() {
        return this.britishPartTimeMap;
    }

    public int getChiefSportDataType() {
        return this.chiefSportDataType;
    }

    public String getCoordinate() {
        return this.coordinate;
    }

    public int getCreepingWave() {
        return this.creepingWave;
    }

    public boolean getHasTrackPoint() {
        return this.hasTrackPoint;
    }

    public boolean getIsFreeMotion() {
        return this.isFreeMotion;
    }

    public int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public int getMinHeartRate() {
        return this.minHeartRate;
    }

    public int getModifiedTotalDistance() {
        return this.modifiedTotalDistance;
    }

    public Map<Integer, Integer> getPaceMap() {
        return this.paceMap;
    }

    public Map<Float, Short> getPartTimeMap() {
        return this.partTimeMap;
    }

    public int getRecordGrade() {
        if (!TextUtils.isEmpty(this.runExtra)) {
            try {
                return new JSONObject(this.runExtra).optInt("recordGrade", 0);
            } catch (JSONException e2) {
                me8.b(TAG, "JSONException e = " + e2.getMessage());
            }
        }
        return 0;
    }

    public String getRunExtra() {
        return this.runExtra;
    }

    public int getSportDataSource() {
        return this.sportDataSource;
    }

    public String getSportId() {
        return this.sportId;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public String getSportName() {
        return this.sportName;
    }

    public int getSportType() {
        return this.sportType;
    }

    public Map<Long, Short> getStepRate() {
        return this.stepRate;
    }

    public long getTotalCalories() {
        return this.totalCalories;
    }

    public int getTotalClimb() {
        return this.totalClimb;
    }

    public int getTotalDistance() {
        return this.totalDistance;
    }

    public int getTotalSteps() {
        return this.totalSteps;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    public String getVendor() {
        return this.vendor;
    }

    public Map<String, Integer> getWearSportData() {
        return this.wearSportData;
    }

    public void setAbnormalTrack(int i) {
        this.abnormalTrack = i;
    }

    public void setAltitude(Map<Long, Double> map) {
        this.altitude = map;
    }

    public void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public void setAvgPace(int i) {
        this.avgPace = i;
    }

    public void setAvgStepRate(int i) {
        this.avgStepRate = i;
    }

    public void setBestPace(int i) {
        this.bestPace = i;
    }

    public void setBestStepRate(int i) {
        this.bestStepRate = i;
    }

    public void setBritishPaceMap(Map<Float, Integer> map) {
        this.britishPaceMap = map;
    }

    public void setBritishPartTimeMap(Map<Double, Short> map) {
        this.britishPartTimeMap = map;
    }

    public void setChiefSportDataType(int i) {
        this.chiefSportDataType = i;
    }

    public void setCoordinate(String str) {
        this.coordinate = str;
    }

    public void setCreepingWave(int i) {
        this.creepingWave = i;
    }

    public void setHasTrackPoint(boolean z) {
        this.hasTrackPoint = z;
    }

    public void setIsFreeMotion(boolean z) {
        this.isFreeMotion = z;
    }

    public void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public void setModifiedTotalDistance(int i) {
        this.modifiedTotalDistance = i;
    }

    public void setPaceMap(Map<Integer, Integer> map) {
        this.paceMap = map;
    }

    public void setPartTimeMap(Map<Float, Short> map) {
        this.partTimeMap = map;
    }

    public void setRunExtra(String str) {
        this.runExtra = str;
    }

    public void setSportDataSource(int i) {
        this.sportDataSource = i;
    }

    public void setSportId(String str) {
        this.sportId = str;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSportName(String str) {
        this.sportName = str;
    }

    public void setSportType(int i) {
        this.sportType = i;
    }

    public void setStepRate(Map<Long, Short> map) {
        this.stepRate = map;
    }

    public void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    public void setTotalClimb(int i) {
        this.totalClimb = i;
    }

    public void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public void setTotalTime(long j2) {
        this.totalTime = j2;
    }

    public void setVendor(String str) {
        this.vendor = str;
    }

    public void setWearSportData(Map<String, Integer> map) {
        this.wearSportData = map;
    }

    public String toString() {
        return "TrackMetaData{avgPace=" + this.avgPace + ", bestPace=" + this.bestPace + ", avgStepRate=" + this.avgStepRate + ", bestStepRate=" + this.bestStepRate + ", totalDistance=" + this.totalDistance + ", modifiedTotalDistance=" + this.modifiedTotalDistance + ", totalCalories=" + this.totalCalories + ", totalSteps=" + this.totalSteps + ", totalTime=" + this.totalTime + ", sportId='" + this.sportId + "', sportType=" + this.sportType + ", partTimeMap=" + this.partTimeMap + ", britishPartTimeMap=" + this.britishPartTimeMap + ", paceMap=" + this.paceMap + ", britishPaceMap=" + this.britishPaceMap + ", sportMode=" + this.sportMode + ", creepingWave=" + this.creepingWave + ", wearSportData=" + this.wearSportData + ", vendor='" + this.vendor + "', coordinate='" + this.coordinate + "', isFreeMotion=" + this.isFreeMotion + ", sportDataSource=" + this.sportDataSource + ", chiefSportDataType=" + this.chiefSportDataType + ", hasTrackPoint=" + this.hasTrackPoint + ", abnormalTrack=" + this.abnormalTrack + ", stepRate=" + this.stepRate + ", altitude=" + this.altitude + '}';
    }
}
