package com.oplus.drs.core.config.entity;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class CommonConfig {
    private final Map<String, List<String>> areaRegionMapping;
    private final DefaultHost defaultHost;
    private final int enableHLog;
    private final List<String> grayPkgs;
    private final int ipcFreq;
    private final List<String> reconciliationAppIds;

    @SerializedName("v")
    private final int version;

    public static class DefaultHost {
        private final Map<String, String> config;
        private final Map<String, String> data;

        public DefaultHost(Map<String, String> map, Map<String, String> map2) {
            this.config = map;
            this.data = map2;
        }

        public Map<String, String> getConfig() {
            return this.config;
        }

        public Map<String, String> getData() {
            return this.data;
        }
    }

    public CommonConfig(int i, int i2, List<String> list, List<String> list2, Map<String, List<String>> map, DefaultHost defaultHost, int i3) {
        this.version = i;
        this.ipcFreq = i2;
        this.reconciliationAppIds = list;
        this.grayPkgs = list2;
        this.areaRegionMapping = map;
        this.defaultHost = defaultHost;
        this.enableHLog = i3;
    }

    public Map<String, List<String>> getAreaRegionMapping() {
        return this.areaRegionMapping;
    }

    public DefaultHost getDefaultHost() {
        return this.defaultHost;
    }

    public List<String> getGrayPkgs() {
        return this.grayPkgs;
    }

    public int getIpcFreq() {
        return this.ipcFreq;
    }

    public List<String> getReconciliationAppIds() {
        return this.reconciliationAppIds;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isEnableHLog() {
        return this.enableHLog == 1;
    }

    @NonNull
    public String toString() {
        return "CommonConfig{version=" + this.version + ", ipcFreq=" + this.ipcFreq + ", reconciliationAppIds=" + this.reconciliationAppIds + ", grayPkgs=" + this.grayPkgs + ", areaRegionMapping=" + this.areaRegionMapping + ", defaultHost=" + this.defaultHost + ", enableHLog=" + this.enableHLog + '}';
    }
}
