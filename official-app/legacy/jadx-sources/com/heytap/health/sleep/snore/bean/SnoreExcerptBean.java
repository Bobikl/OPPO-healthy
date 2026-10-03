package com.heytap.health.sleep.snore.bean;

import android.text.format.DateFormat;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.snore.SnoreDbFileInfo;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreExcerptBean {
    private Audio audio;
    private int averageSpo2;
    private long endTime;
    private float maxSnoreDB;
    private float minSnoreDB;
    private int mode;
    private SnoreDbFileInfo snoreDbFileInfo;
    private int snoreNum;
    private long startTime;
    private List<TimeStampedData> spo2List = new ArrayList();
    private List<TimeStampedData> snoreDbBuffs = new ArrayList();
    private int downCode = -10000;

    public Audio getAudio() {
        return this.audio;
    }

    public int getAverageSpo2() {
        return this.averageSpo2;
    }

    public int getDownCode() {
        return this.downCode;
    }

    public long getDuration() {
        return this.endTime - this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public String getFileName() {
        SnoreDbFileInfo snoreDbFileInfo = this.snoreDbFileInfo;
        return snoreDbFileInfo != null ? snoreDbFileInfo.getFileName() : "null";
    }

    public String getFilePath() {
        Audio audio = this.audio;
        return audio != null ? audio.getPath() : "null";
    }

    public float getMaxSnoreDB() {
        return this.maxSnoreDB;
    }

    public float getMinSnoreDB() {
        return this.minSnoreDB;
    }

    public int getMode() {
        return this.mode;
    }

    public List<TimeStampedData> getSnoreDbBuffs() {
        return this.snoreDbBuffs;
    }

    public SnoreDbFileInfo getSnoreDbFileInfo() {
        return this.snoreDbFileInfo;
    }

    public int getSnoreNum() {
        return this.snoreNum;
    }

    public List<TimeStampedData> getSpo2List() {
        return this.spo2List;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public boolean isNeedDownload() {
        return this.snoreDbFileInfo != null && this.audio == null;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setAverageSpo2(int i) {
        this.averageSpo2 = i;
    }

    public void setDownCode(int i) {
        this.downCode = i;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setMaxSnoreDB(float f) {
        this.maxSnoreDB = f;
    }

    public void setMinSnoreDB(float f) {
        this.minSnoreDB = f;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setSnoreDbBuffs(List<TimeStampedData> list) {
        this.snoreDbBuffs = list;
    }

    public void setSnoreDbFileInfo(SnoreDbFileInfo snoreDbFileInfo) {
        this.snoreDbFileInfo = snoreDbFileInfo;
    }

    public void setSnoreNum(int i) {
        this.snoreNum = i;
    }

    public void setSpo2List(List<TimeStampedData> list) {
        this.spo2List = list;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    @NonNull
    public String toString() {
        return "SnoreExcerptBean{averageSpo2=" + this.averageSpo2 + ", spo2List=" + this.spo2List.size() + ", maxSnoreDB=" + this.maxSnoreDB + ", minSnoreDB=" + this.minSnoreDB + ", startTime=" + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", this.startTime)) + ", endTime=" + ((Object) DateFormat.format("yyyy/MM/dd HH:mm:ss", this.endTime)) + ", snoreDbBuffs=" + this.snoreDbBuffs.size() + ", snoreDbFileInfo=" + getFileName() + ", audio=" + getFilePath() + '}';
    }
}
