package com.heytap.health.healthecg.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.ECGRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ECGVerifyRecord {
    private double adcToUv;
    private long avgHeartRate;
    private String clientDataId;
    private String data;
    private String deviceUniqueId;
    private long endTimestamp;
    private String expertInterpretation;
    private int hand;
    private int length = 30;
    private String ssoid;
    private long startTimestamp;

    @SerializedName("take_time")
    private long takeTime;

    @SerializedName("time_length")
    private String timeLength;
    private List<Integer> timing;
    private int version;

    public ECGVerifyRecord(ECGRecord eCGRecord, double d) {
        this.avgHeartRate = eCGRecord.getAvgHeartRate();
        this.takeTime = eCGRecord.getStartTimestamp();
        this.startTimestamp = eCGRecord.getStartTimestamp();
        this.expertInterpretation = eCGRecord.getExpertInterpretation();
        this.clientDataId = eCGRecord.getClientDataId();
        this.hand = eCGRecord.getHand();
        this.deviceUniqueId = eCGRecord.getDeviceUniqueId();
        this.ssoid = eCGRecord.getSsoid();
        this.version = eCGRecord.getVersion();
        this.data = eCGRecord.getData();
        this.adcToUv = d;
        this.endTimestamp = eCGRecord.getEndTimestamp();
        ArrayList arrayList = new ArrayList();
        this.timing = arrayList;
        arrayList.add(0);
    }

    public double getAdcToUv() {
        return this.adcToUv;
    }

    public long getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public String getData() {
        return this.data;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public long getEndTimestamp() {
        return this.endTimestamp;
    }

    public String getExpertInterpretation() {
        return this.expertInterpretation;
    }

    public int getHand() {
        return this.hand;
    }

    public int getLength() {
        return this.length;
    }

    public String getSsoid() {
        return this.ssoid;
    }

    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public long getTakeTime() {
        return this.takeTime;
    }

    public String getTimeLength() {
        return this.timeLength;
    }

    public List<Integer> getTiming() {
        return this.timing;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAdcToUv(double d) {
        this.adcToUv = d;
    }

    public void setAvgHeartRate(long j2) {
        this.avgHeartRate = j2;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public void setExpertInterpretation(String str) {
        this.expertInterpretation = str;
    }

    public void setHand(int i) {
        this.hand = i;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public void setSsoid(String str) {
        this.ssoid = str;
    }

    public void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public void setTakeTime(long j2) {
        this.takeTime = j2;
    }

    public void setTimeLength(String str) {
        this.timeLength = str;
    }

    public void setTiming(List<Integer> list) {
        this.timing = list;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
