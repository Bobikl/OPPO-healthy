package com.heytap.health.home.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class HomeUserDeviceBean {
    private long bindingTime;
    private String boardId;
    private String deviceName;
    private int deviceType;
    private String deviceUniqueId;
    private String model;
    private String projectId;
    private ResourceBean resource;
    private String sku;
    private String skuCode;

    @Keep
    public static class ResourceBean {
        private String darkFloatingImage;
        private String darkFloatingVideo;
        private String floatingImage;
        private String floatingVideo;

        public String getDarkFloatingImage() {
            return this.darkFloatingImage;
        }

        public String getDarkFloatingVideo() {
            return this.darkFloatingVideo;
        }

        public String getFloatingImage() {
            return this.floatingImage;
        }

        public String getFloatingVideo() {
            return this.floatingVideo;
        }

        public void setDarkFloatingImage(String str) {
            this.darkFloatingImage = str;
        }

        public void setDarkFloatingVideo(String str) {
            this.darkFloatingVideo = str;
        }

        public void setFloatingImage(String str) {
            this.floatingImage = str;
        }

        public void setFloatingVideo(String str) {
            this.floatingVideo = str;
        }

        public String toString() {
            return "ResourceBean{floatingImage='" + this.floatingImage + "', darkFloatingImage='" + this.darkFloatingImage + "', floatingVideo='" + this.floatingVideo + "', darkFloatingVideo='" + this.darkFloatingVideo + "'}";
        }
    }

    public long getBindingTime() {
        return this.bindingTime;
    }

    public String getBoardId() {
        return this.boardId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int getDeviceType() {
        return this.deviceType;
    }

    public String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public String getModel() {
        return this.model;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public ResourceBean getResource() {
        return this.resource;
    }

    public String getSku() {
        return this.sku;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public void setBindingTime(long j2) {
        this.bindingTime = j2;
    }

    public void setBoardId(String str) {
        this.boardId = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceType(int i) {
        this.deviceType = i;
    }

    public void setDeviceUniqueId(String str) {
        this.deviceUniqueId = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setProjectId(String str) {
        this.projectId = str;
    }

    public void setResource(ResourceBean resourceBean) {
        this.resource = resourceBean;
    }

    public void setSku(String str) {
        this.sku = str;
    }

    public void setSkuCode(String str) {
        this.skuCode = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HomeUserDeviceBean{deviceUniqueId='");
        sb.append(this.deviceUniqueId);
        sb.append('\'');
        sb.append(", deviceType=");
        sb.append(this.deviceType);
        sb.append(", model='");
        sb.append(this.model);
        sb.append('\'');
        sb.append(", sku='");
        sb.append(this.sku);
        sb.append('\'');
        sb.append(", skuCode='");
        sb.append(this.skuCode);
        sb.append('\'');
        sb.append(", deviceName='");
        sb.append(this.deviceName);
        sb.append('\'');
        sb.append(", boardId='");
        sb.append(this.boardId);
        sb.append('\'');
        sb.append(", projectId='");
        sb.append(this.projectId);
        sb.append('\'');
        sb.append(", bindingTime=");
        sb.append(this.bindingTime);
        sb.append(", resource=");
        ResourceBean resourceBean = this.resource;
        sb.append(resourceBean == null ? "null" : resourceBean.toString());
        sb.append('}');
        return sb.toString();
    }
}
