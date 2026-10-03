package com.heytap.health.devicemanagerimpl.processor.bean;

import androidx.annotation.Keep;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class FilterReportBean {
    private String bleSecretMetadata;
    private String guid;
    private String iwatchKey;
    private String iwatchRandom;
    private String mac;
    private String osVersion;
    private String otaVersion;
    private long reportTime;
    private String softVersion;

    public FilterReportBean(String str, String str2, String str3, String str4, long j2) {
        this.mac = str;
        this.otaVersion = str2;
        this.softVersion = str3;
        this.osVersion = str4;
        this.reportTime = j2;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FilterReportBean filterReportBean = (FilterReportBean) obj;
        return Objects.equals(this.mac, filterReportBean.mac) && Objects.equals(this.otaVersion, filterReportBean.otaVersion) && Objects.equals(this.softVersion, filterReportBean.softVersion) && Objects.equals(this.osVersion, filterReportBean.osVersion) && Objects.equals(this.bleSecretMetadata, filterReportBean.bleSecretMetadata) && Objects.equals(this.guid, filterReportBean.guid) && Objects.equals(this.iwatchKey, filterReportBean.iwatchKey) && Objects.equals(this.iwatchRandom, filterReportBean.iwatchRandom);
    }

    public long getReportTime() {
        return this.reportTime;
    }

    public int hashCode() {
        return Objects.hash(this.mac, this.otaVersion, this.softVersion, this.osVersion, this.bleSecretMetadata, this.guid, this.iwatchKey, this.iwatchRandom);
    }

    public FilterReportBean setBleSecretMetadata(String str) {
        this.bleSecretMetadata = str;
        return this;
    }

    public FilterReportBean setGuid(String str) {
        this.guid = str;
        return this;
    }

    public FilterReportBean setIwatchKey(String str) {
        this.iwatchKey = str;
        return this;
    }

    public FilterReportBean setIwatchRandom(String str) {
        this.iwatchRandom = str;
        return this;
    }
}
