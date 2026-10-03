package com.nearme.instant.xcard.statitics;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class StatFieldConfig {
    private Map<String, String> fields;
    private String sceneId;
    private String sourceId;
    private String traceId;

    public StatFieldConfig(String str, String str2) {
        this.sourceId = str;
        this.sceneId = str2;
    }

    public Map<String, String> getFields() {
        return this.fields;
    }

    public String getSceneId() {
        return this.sceneId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setFields(Map<String, String> map) {
        this.fields = map;
    }

    public void setSceneId(String str) {
        this.sceneId = str;
    }

    public void setSourceId(String str) {
        this.sourceId = str;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }
}
