package com.oppo.obus.common.configmetadata.core.entity.common;

import com.oppo.obus.common.configmetadata.core.concept.EmptyCheckable;
import com.oppo.obus.common.configmetadata.core.enums.Area;
import com.oppo.obus.common.configmetadata.core.util.ObjectUtils;
import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MinCommonConfig implements Serializable {
    private static final long serialVersionUID = -5874317165260913373L;

    @Tag(5)
    protected Map<Area, List<String>> areaRegionMapping;

    @Tag(6)
    protected DefaultHost defaultHost;

    @Tag(9)
    protected Integer defaultObusUploadPeriodMinutes;

    @Tag(12)
    protected Integer defaultQuotaPerAppMB;

    @Tag(8)
    protected Integer drsUploadPeriodMinutes;

    @Tag(7)
    protected Integer enableHLog;

    @Tag(16)
    protected Integer enableNetRequest;

    @Tag(3)
    protected List<String> grayPkgs;

    @Tag(4)
    private Integer ipcFreq;

    @Tag(17)
    protected Integer lowBatteryBlockPercent;

    @Tag(15)
    protected Integer maxStorageMB;

    @Tag(22)
    protected List<String> mspRegionWhiteAppIdList;

    @Tag(10)
    protected Map<String, Integer> obusUploadPeriodMinutesMap;

    @Tag(18)
    protected Integer osenseCpuBlockLevel;

    @Tag(19)
    protected Integer osenseThermalBlockLevel;

    @Tag(11)
    protected Integer pseudoPeriodMinutes;

    @Tag(14)
    protected Integer quotaGlobalMB;

    @Tag(13)
    protected Map<String, Integer> quotaPerAppMBMap;

    @Tag(2)
    protected List<String> reconciliationAppIds;

    @Tag(20)
    protected Integer sdkFilterGlobalSwitch;

    @Tag(21)
    protected List<String> sdkFilterWhiteAppIdList;

    @Tag(1)
    protected Integer v;

    public static class DefaultHost implements EmptyCheckable {

        @Tag(1)
        private Map<Area, String> config;

        @Tag(2)
        private Map<Area, String> data;

        public DefaultHost() {
        }

        public DefaultHost(Map<Area, String> map, Map<Area, String> map2) {
            this.config = map;
            this.data = map2;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof DefaultHost;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DefaultHost)) {
                return false;
            }
            DefaultHost defaultHost = (DefaultHost) obj;
            if (!defaultHost.canEqual(this)) {
                return false;
            }
            Map<Area, String> config = getConfig();
            Map<Area, String> config2 = defaultHost.getConfig();
            if (config != null ? !config.equals(config2) : config2 != null) {
                return false;
            }
            Map<Area, String> data = getData();
            Map<Area, String> data2 = defaultHost.getData();
            return data != null ? data.equals(data2) : data2 == null;
        }

        public Map<Area, String> getConfig() {
            return this.config;
        }

        public Map<Area, String> getData() {
            return this.data;
        }

        public int hashCode() {
            Map<Area, String> config = getConfig();
            int iHashCode = config == null ? 43 : config.hashCode();
            Map<Area, String> data = getData();
            return ((iHashCode + 59) * 59) + (data != null ? data.hashCode() : 43);
        }

        @Override // com.oppo.obus.common.configmetadata.core.concept.EmptyCheckable
        public boolean ifEmpty() {
            return ObjectUtils.isEmpty(this.config) && ObjectUtils.isEmpty(this.data);
        }

        public DefaultHost setConfig(Map<Area, String> map) {
            this.config = map;
            return this;
        }

        public DefaultHost setData(Map<Area, String> map) {
            this.data = map;
            return this;
        }

        public String toString() {
            return "MinCommonConfig.DefaultHost(config=" + getConfig() + ", data=" + getData() + ")";
        }
    }

    public MinCommonConfig() {
        this.ipcFreq = 5;
        this.enableHLog = 1;
        this.drsUploadPeriodMinutes = 120;
        this.defaultObusUploadPeriodMinutes = 15;
        this.pseudoPeriodMinutes = 5;
        this.defaultQuotaPerAppMB = 12;
        this.quotaGlobalMB = 150;
        this.maxStorageMB = 350;
        this.enableNetRequest = 1;
        this.lowBatteryBlockPercent = 20;
        this.osenseCpuBlockLevel = 3;
        this.osenseThermalBlockLevel = 3;
        this.sdkFilterGlobalSwitch = 1;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MinCommonConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MinCommonConfig)) {
            return false;
        }
        MinCommonConfig minCommonConfig = (MinCommonConfig) obj;
        if (!minCommonConfig.canEqual(this)) {
            return false;
        }
        Integer v = getV();
        Integer v2 = minCommonConfig.getV();
        if (v != null ? !v.equals(v2) : v2 != null) {
            return false;
        }
        Integer ipcFreq = getIpcFreq();
        Integer ipcFreq2 = minCommonConfig.getIpcFreq();
        if (ipcFreq != null ? !ipcFreq.equals(ipcFreq2) : ipcFreq2 != null) {
            return false;
        }
        Integer enableHLog = getEnableHLog();
        Integer enableHLog2 = minCommonConfig.getEnableHLog();
        if (enableHLog != null ? !enableHLog.equals(enableHLog2) : enableHLog2 != null) {
            return false;
        }
        Integer drsUploadPeriodMinutes = getDrsUploadPeriodMinutes();
        Integer drsUploadPeriodMinutes2 = minCommonConfig.getDrsUploadPeriodMinutes();
        if (drsUploadPeriodMinutes != null ? !drsUploadPeriodMinutes.equals(drsUploadPeriodMinutes2) : drsUploadPeriodMinutes2 != null) {
            return false;
        }
        Integer defaultObusUploadPeriodMinutes = getDefaultObusUploadPeriodMinutes();
        Integer defaultObusUploadPeriodMinutes2 = minCommonConfig.getDefaultObusUploadPeriodMinutes();
        if (defaultObusUploadPeriodMinutes != null ? !defaultObusUploadPeriodMinutes.equals(defaultObusUploadPeriodMinutes2) : defaultObusUploadPeriodMinutes2 != null) {
            return false;
        }
        Integer pseudoPeriodMinutes = getPseudoPeriodMinutes();
        Integer pseudoPeriodMinutes2 = minCommonConfig.getPseudoPeriodMinutes();
        if (pseudoPeriodMinutes != null ? !pseudoPeriodMinutes.equals(pseudoPeriodMinutes2) : pseudoPeriodMinutes2 != null) {
            return false;
        }
        Integer defaultQuotaPerAppMB = getDefaultQuotaPerAppMB();
        Integer defaultQuotaPerAppMB2 = minCommonConfig.getDefaultQuotaPerAppMB();
        if (defaultQuotaPerAppMB != null ? !defaultQuotaPerAppMB.equals(defaultQuotaPerAppMB2) : defaultQuotaPerAppMB2 != null) {
            return false;
        }
        Integer quotaGlobalMB = getQuotaGlobalMB();
        Integer quotaGlobalMB2 = minCommonConfig.getQuotaGlobalMB();
        if (quotaGlobalMB != null ? !quotaGlobalMB.equals(quotaGlobalMB2) : quotaGlobalMB2 != null) {
            return false;
        }
        Integer maxStorageMB = getMaxStorageMB();
        Integer maxStorageMB2 = minCommonConfig.getMaxStorageMB();
        if (maxStorageMB != null ? !maxStorageMB.equals(maxStorageMB2) : maxStorageMB2 != null) {
            return false;
        }
        Integer enableNetRequest = getEnableNetRequest();
        Integer enableNetRequest2 = minCommonConfig.getEnableNetRequest();
        if (enableNetRequest != null ? !enableNetRequest.equals(enableNetRequest2) : enableNetRequest2 != null) {
            return false;
        }
        Integer lowBatteryBlockPercent = getLowBatteryBlockPercent();
        Integer lowBatteryBlockPercent2 = minCommonConfig.getLowBatteryBlockPercent();
        if (lowBatteryBlockPercent != null ? !lowBatteryBlockPercent.equals(lowBatteryBlockPercent2) : lowBatteryBlockPercent2 != null) {
            return false;
        }
        Integer osenseCpuBlockLevel = getOsenseCpuBlockLevel();
        Integer osenseCpuBlockLevel2 = minCommonConfig.getOsenseCpuBlockLevel();
        if (osenseCpuBlockLevel != null ? !osenseCpuBlockLevel.equals(osenseCpuBlockLevel2) : osenseCpuBlockLevel2 != null) {
            return false;
        }
        Integer osenseThermalBlockLevel = getOsenseThermalBlockLevel();
        Integer osenseThermalBlockLevel2 = minCommonConfig.getOsenseThermalBlockLevel();
        if (osenseThermalBlockLevel != null ? !osenseThermalBlockLevel.equals(osenseThermalBlockLevel2) : osenseThermalBlockLevel2 != null) {
            return false;
        }
        Integer sdkFilterGlobalSwitch = getSdkFilterGlobalSwitch();
        Integer sdkFilterGlobalSwitch2 = minCommonConfig.getSdkFilterGlobalSwitch();
        if (sdkFilterGlobalSwitch != null ? !sdkFilterGlobalSwitch.equals(sdkFilterGlobalSwitch2) : sdkFilterGlobalSwitch2 != null) {
            return false;
        }
        List<String> reconciliationAppIds = getReconciliationAppIds();
        List<String> reconciliationAppIds2 = minCommonConfig.getReconciliationAppIds();
        if (reconciliationAppIds != null ? !reconciliationAppIds.equals(reconciliationAppIds2) : reconciliationAppIds2 != null) {
            return false;
        }
        List<String> grayPkgs = getGrayPkgs();
        List<String> grayPkgs2 = minCommonConfig.getGrayPkgs();
        if (grayPkgs != null ? !grayPkgs.equals(grayPkgs2) : grayPkgs2 != null) {
            return false;
        }
        Map<Area, List<String>> areaRegionMapping = getAreaRegionMapping();
        Map<Area, List<String>> areaRegionMapping2 = minCommonConfig.getAreaRegionMapping();
        if (areaRegionMapping != null ? !areaRegionMapping.equals(areaRegionMapping2) : areaRegionMapping2 != null) {
            return false;
        }
        DefaultHost defaultHost = getDefaultHost();
        DefaultHost defaultHost2 = minCommonConfig.getDefaultHost();
        if (defaultHost != null ? !defaultHost.equals(defaultHost2) : defaultHost2 != null) {
            return false;
        }
        Map<String, Integer> obusUploadPeriodMinutesMap = getObusUploadPeriodMinutesMap();
        Map<String, Integer> obusUploadPeriodMinutesMap2 = minCommonConfig.getObusUploadPeriodMinutesMap();
        if (obusUploadPeriodMinutesMap != null ? !obusUploadPeriodMinutesMap.equals(obusUploadPeriodMinutesMap2) : obusUploadPeriodMinutesMap2 != null) {
            return false;
        }
        Map<String, Integer> quotaPerAppMBMap = getQuotaPerAppMBMap();
        Map<String, Integer> quotaPerAppMBMap2 = minCommonConfig.getQuotaPerAppMBMap();
        if (quotaPerAppMBMap != null ? !quotaPerAppMBMap.equals(quotaPerAppMBMap2) : quotaPerAppMBMap2 != null) {
            return false;
        }
        List<String> sdkFilterWhiteAppIdList = getSdkFilterWhiteAppIdList();
        List<String> sdkFilterWhiteAppIdList2 = minCommonConfig.getSdkFilterWhiteAppIdList();
        if (sdkFilterWhiteAppIdList != null ? !sdkFilterWhiteAppIdList.equals(sdkFilterWhiteAppIdList2) : sdkFilterWhiteAppIdList2 != null) {
            return false;
        }
        List<String> mspRegionWhiteAppIdList = getMspRegionWhiteAppIdList();
        List<String> mspRegionWhiteAppIdList2 = minCommonConfig.getMspRegionWhiteAppIdList();
        return mspRegionWhiteAppIdList != null ? mspRegionWhiteAppIdList.equals(mspRegionWhiteAppIdList2) : mspRegionWhiteAppIdList2 == null;
    }

    public Map<Area, List<String>> getAreaRegionMapping() {
        return this.areaRegionMapping;
    }

    public DefaultHost getDefaultHost() {
        return this.defaultHost;
    }

    public Integer getDefaultObusUploadPeriodMinutes() {
        return this.defaultObusUploadPeriodMinutes;
    }

    public Integer getDefaultQuotaPerAppMB() {
        return this.defaultQuotaPerAppMB;
    }

    public Integer getDrsUploadPeriodMinutes() {
        return this.drsUploadPeriodMinutes;
    }

    public Integer getEnableHLog() {
        return this.enableHLog;
    }

    public Integer getEnableNetRequest() {
        return this.enableNetRequest;
    }

    public List<String> getGrayPkgs() {
        return this.grayPkgs;
    }

    public Integer getIpcFreq() {
        return this.ipcFreq;
    }

    public Integer getLowBatteryBlockPercent() {
        return this.lowBatteryBlockPercent;
    }

    public Integer getMaxStorageMB() {
        return this.maxStorageMB;
    }

    public List<String> getMspRegionWhiteAppIdList() {
        return this.mspRegionWhiteAppIdList;
    }

    public Map<String, Integer> getObusUploadPeriodMinutesMap() {
        return this.obusUploadPeriodMinutesMap;
    }

    public Integer getOsenseCpuBlockLevel() {
        return this.osenseCpuBlockLevel;
    }

    public Integer getOsenseThermalBlockLevel() {
        return this.osenseThermalBlockLevel;
    }

    public Integer getPseudoPeriodMinutes() {
        return this.pseudoPeriodMinutes;
    }

    public Integer getQuotaGlobalMB() {
        return this.quotaGlobalMB;
    }

    public Map<String, Integer> getQuotaPerAppMBMap() {
        return this.quotaPerAppMBMap;
    }

    public List<String> getReconciliationAppIds() {
        return this.reconciliationAppIds;
    }

    public Integer getSdkFilterGlobalSwitch() {
        return this.sdkFilterGlobalSwitch;
    }

    public List<String> getSdkFilterWhiteAppIdList() {
        return this.sdkFilterWhiteAppIdList;
    }

    public Integer getV() {
        return this.v;
    }

    public int hashCode() {
        Integer v = getV();
        int iHashCode = v == null ? 43 : v.hashCode();
        Integer ipcFreq = getIpcFreq();
        int iHashCode2 = ((iHashCode + 59) * 59) + (ipcFreq == null ? 43 : ipcFreq.hashCode());
        Integer enableHLog = getEnableHLog();
        int iHashCode3 = (iHashCode2 * 59) + (enableHLog == null ? 43 : enableHLog.hashCode());
        Integer drsUploadPeriodMinutes = getDrsUploadPeriodMinutes();
        int iHashCode4 = (iHashCode3 * 59) + (drsUploadPeriodMinutes == null ? 43 : drsUploadPeriodMinutes.hashCode());
        Integer defaultObusUploadPeriodMinutes = getDefaultObusUploadPeriodMinutes();
        int iHashCode5 = (iHashCode4 * 59) + (defaultObusUploadPeriodMinutes == null ? 43 : defaultObusUploadPeriodMinutes.hashCode());
        Integer pseudoPeriodMinutes = getPseudoPeriodMinutes();
        int iHashCode6 = (iHashCode5 * 59) + (pseudoPeriodMinutes == null ? 43 : pseudoPeriodMinutes.hashCode());
        Integer defaultQuotaPerAppMB = getDefaultQuotaPerAppMB();
        int iHashCode7 = (iHashCode6 * 59) + (defaultQuotaPerAppMB == null ? 43 : defaultQuotaPerAppMB.hashCode());
        Integer quotaGlobalMB = getQuotaGlobalMB();
        int iHashCode8 = (iHashCode7 * 59) + (quotaGlobalMB == null ? 43 : quotaGlobalMB.hashCode());
        Integer maxStorageMB = getMaxStorageMB();
        int iHashCode9 = (iHashCode8 * 59) + (maxStorageMB == null ? 43 : maxStorageMB.hashCode());
        Integer enableNetRequest = getEnableNetRequest();
        int iHashCode10 = (iHashCode9 * 59) + (enableNetRequest == null ? 43 : enableNetRequest.hashCode());
        Integer lowBatteryBlockPercent = getLowBatteryBlockPercent();
        int iHashCode11 = (iHashCode10 * 59) + (lowBatteryBlockPercent == null ? 43 : lowBatteryBlockPercent.hashCode());
        Integer osenseCpuBlockLevel = getOsenseCpuBlockLevel();
        int iHashCode12 = (iHashCode11 * 59) + (osenseCpuBlockLevel == null ? 43 : osenseCpuBlockLevel.hashCode());
        Integer osenseThermalBlockLevel = getOsenseThermalBlockLevel();
        int iHashCode13 = (iHashCode12 * 59) + (osenseThermalBlockLevel == null ? 43 : osenseThermalBlockLevel.hashCode());
        Integer sdkFilterGlobalSwitch = getSdkFilterGlobalSwitch();
        int iHashCode14 = (iHashCode13 * 59) + (sdkFilterGlobalSwitch == null ? 43 : sdkFilterGlobalSwitch.hashCode());
        List<String> reconciliationAppIds = getReconciliationAppIds();
        int iHashCode15 = (iHashCode14 * 59) + (reconciliationAppIds == null ? 43 : reconciliationAppIds.hashCode());
        List<String> grayPkgs = getGrayPkgs();
        int iHashCode16 = (iHashCode15 * 59) + (grayPkgs == null ? 43 : grayPkgs.hashCode());
        Map<Area, List<String>> areaRegionMapping = getAreaRegionMapping();
        int iHashCode17 = (iHashCode16 * 59) + (areaRegionMapping == null ? 43 : areaRegionMapping.hashCode());
        DefaultHost defaultHost = getDefaultHost();
        int iHashCode18 = (iHashCode17 * 59) + (defaultHost == null ? 43 : defaultHost.hashCode());
        Map<String, Integer> obusUploadPeriodMinutesMap = getObusUploadPeriodMinutesMap();
        int iHashCode19 = (iHashCode18 * 59) + (obusUploadPeriodMinutesMap == null ? 43 : obusUploadPeriodMinutesMap.hashCode());
        Map<String, Integer> quotaPerAppMBMap = getQuotaPerAppMBMap();
        int iHashCode20 = (iHashCode19 * 59) + (quotaPerAppMBMap == null ? 43 : quotaPerAppMBMap.hashCode());
        List<String> sdkFilterWhiteAppIdList = getSdkFilterWhiteAppIdList();
        int i = iHashCode20 * 59;
        int iHashCode21 = sdkFilterWhiteAppIdList == null ? 43 : sdkFilterWhiteAppIdList.hashCode();
        List<String> mspRegionWhiteAppIdList = getMspRegionWhiteAppIdList();
        return ((i + iHashCode21) * 59) + (mspRegionWhiteAppIdList != null ? mspRegionWhiteAppIdList.hashCode() : 43);
    }

    public MinCommonConfig setAreaRegionMapping(Map<Area, List<String>> map) {
        this.areaRegionMapping = map;
        return this;
    }

    public MinCommonConfig setDefaultHost(DefaultHost defaultHost) {
        this.defaultHost = defaultHost;
        return this;
    }

    public MinCommonConfig setDefaultObusUploadPeriodMinutes(Integer num) {
        this.defaultObusUploadPeriodMinutes = num;
        return this;
    }

    public MinCommonConfig setDefaultQuotaPerAppMB(Integer num) {
        this.defaultQuotaPerAppMB = num;
        return this;
    }

    public MinCommonConfig setDrsUploadPeriodMinutes(Integer num) {
        this.drsUploadPeriodMinutes = num;
        return this;
    }

    public MinCommonConfig setEnableHLog(Integer num) {
        this.enableHLog = num;
        return this;
    }

    public MinCommonConfig setEnableNetRequest(Integer num) {
        this.enableNetRequest = num;
        return this;
    }

    public MinCommonConfig setGrayPkgs(List<String> list) {
        this.grayPkgs = list;
        return this;
    }

    public MinCommonConfig setIpcFreq(Integer num) {
        this.ipcFreq = num;
        return this;
    }

    public MinCommonConfig setLowBatteryBlockPercent(Integer num) {
        this.lowBatteryBlockPercent = num;
        return this;
    }

    public MinCommonConfig setMaxStorageMB(Integer num) {
        this.maxStorageMB = num;
        return this;
    }

    public MinCommonConfig setMspRegionWhiteAppIdList(List<String> list) {
        this.mspRegionWhiteAppIdList = list;
        return this;
    }

    public MinCommonConfig setObusUploadPeriodMinutesMap(Map<String, Integer> map) {
        this.obusUploadPeriodMinutesMap = map;
        return this;
    }

    public MinCommonConfig setOsenseCpuBlockLevel(Integer num) {
        this.osenseCpuBlockLevel = num;
        return this;
    }

    public MinCommonConfig setOsenseThermalBlockLevel(Integer num) {
        this.osenseThermalBlockLevel = num;
        return this;
    }

    public MinCommonConfig setPseudoPeriodMinutes(Integer num) {
        this.pseudoPeriodMinutes = num;
        return this;
    }

    public MinCommonConfig setQuotaGlobalMB(Integer num) {
        this.quotaGlobalMB = num;
        return this;
    }

    public MinCommonConfig setQuotaPerAppMBMap(Map<String, Integer> map) {
        this.quotaPerAppMBMap = map;
        return this;
    }

    public MinCommonConfig setReconciliationAppIds(List<String> list) {
        this.reconciliationAppIds = list;
        return this;
    }

    public MinCommonConfig setSdkFilterGlobalSwitch(Integer num) {
        this.sdkFilterGlobalSwitch = num;
        return this;
    }

    public MinCommonConfig setSdkFilterWhiteAppIdList(List<String> list) {
        this.sdkFilterWhiteAppIdList = list;
        return this;
    }

    public MinCommonConfig setV(Integer num) {
        this.v = num;
        return this;
    }

    public String toString() {
        return "MinCommonConfig(v=" + getV() + ", reconciliationAppIds=" + getReconciliationAppIds() + ", grayPkgs=" + getGrayPkgs() + ", ipcFreq=" + getIpcFreq() + ", areaRegionMapping=" + getAreaRegionMapping() + ", defaultHost=" + getDefaultHost() + ", enableHLog=" + getEnableHLog() + ", drsUploadPeriodMinutes=" + getDrsUploadPeriodMinutes() + ", defaultObusUploadPeriodMinutes=" + getDefaultObusUploadPeriodMinutes() + ", obusUploadPeriodMinutesMap=" + getObusUploadPeriodMinutesMap() + ", pseudoPeriodMinutes=" + getPseudoPeriodMinutes() + ", defaultQuotaPerAppMB=" + getDefaultQuotaPerAppMB() + ", quotaPerAppMBMap=" + getQuotaPerAppMBMap() + ", quotaGlobalMB=" + getQuotaGlobalMB() + ", maxStorageMB=" + getMaxStorageMB() + ", enableNetRequest=" + getEnableNetRequest() + ", lowBatteryBlockPercent=" + getLowBatteryBlockPercent() + ", osenseCpuBlockLevel=" + getOsenseCpuBlockLevel() + ", osenseThermalBlockLevel=" + getOsenseThermalBlockLevel() + ", sdkFilterGlobalSwitch=" + getSdkFilterGlobalSwitch() + ", sdkFilterWhiteAppIdList=" + getSdkFilterWhiteAppIdList() + ", mspRegionWhiteAppIdList=" + getMspRegionWhiteAppIdList() + ")";
    }

    public MinCommonConfig(Integer num, List<String> list, List<String> list2, Integer num2, Map<Area, List<String>> map, DefaultHost defaultHost, Integer num3, Integer num4, Integer num5, Map<String, Integer> map2, Integer num6, Integer num7, Map<String, Integer> map3, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, List<String> list3, List<String> list4) {
        this.ipcFreq = 5;
        this.enableHLog = 1;
        this.drsUploadPeriodMinutes = 120;
        this.defaultObusUploadPeriodMinutes = 15;
        this.pseudoPeriodMinutes = 5;
        this.defaultQuotaPerAppMB = 12;
        this.quotaGlobalMB = 150;
        this.maxStorageMB = 350;
        this.enableNetRequest = 1;
        this.lowBatteryBlockPercent = 20;
        this.osenseCpuBlockLevel = 3;
        this.osenseThermalBlockLevel = 3;
        this.v = num;
        this.reconciliationAppIds = list;
        this.grayPkgs = list2;
        this.ipcFreq = num2;
        this.areaRegionMapping = map;
        this.defaultHost = defaultHost;
        this.enableHLog = num3;
        this.drsUploadPeriodMinutes = num4;
        this.defaultObusUploadPeriodMinutes = num5;
        this.obusUploadPeriodMinutesMap = map2;
        this.pseudoPeriodMinutes = num6;
        this.defaultQuotaPerAppMB = num7;
        this.quotaPerAppMBMap = map3;
        this.quotaGlobalMB = num8;
        this.maxStorageMB = num9;
        this.enableNetRequest = num10;
        this.lowBatteryBlockPercent = num11;
        this.osenseCpuBlockLevel = num12;
        this.osenseThermalBlockLevel = num13;
        this.sdkFilterGlobalSwitch = num14;
        this.sdkFilterWhiteAppIdList = list3;
        this.mspRegionWhiteAppIdList = list4;
    }
}
