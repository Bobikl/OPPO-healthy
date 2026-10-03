package com.heytap.weather.vo;

/* JADX INFO: loaded from: classes3.dex */
public class ParamVO {
    private String name;
    private Boolean required;
    private String type;

    public ParamVO() {
    }

    public ParamVO(String str, String str2, Boolean bool) {
        this.name = str;
        this.type = str2;
        this.required = bool;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public String getType() {
        return this.type;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRequired(Boolean bool) {
        this.required = bool;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "MethodUrlParamsVO{name=" + this.name + ", type=" + this.type + ", required=" + this.required + '}';
    }
}
