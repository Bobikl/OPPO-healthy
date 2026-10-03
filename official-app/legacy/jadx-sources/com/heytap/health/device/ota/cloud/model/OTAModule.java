package com.heytap.health.device.ota.cloud.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class OTAModule {
    public String active_url;
    public String checkFailReason;
    public String description;
    public String down_url;
    public String extract;
    public int googlePatchLevel;
    public long needDataSpace;
    public String new_version;
    public int noticeType;
    public int otaPkgType;
    public int paramFlag;
    public String patchFilePath;
    public int patchId;
    public String patch_md5;
    public String patch_name;
    public String patch_size;
    public String recommend;
    public int reminderType;
    public String share;
    public int silenceUpdate;
    public String type;
    public String version_name;
    public String wipe;

    public String toString() {
        return "OTAModule{type='" + this.type + "', wipe='" + this.wipe + "', new_version='" + this.new_version + "', version_name='" + this.version_name + "', description='" + this.description + "', extract='" + this.extract + "', patch_name='" + this.patch_name + "', patch_md5='" + this.patch_md5 + "', patch_size='" + this.patch_size + "', down_url='" + this.down_url + "', active_url='" + this.active_url + "', recommend='" + this.recommend + "', needDataSpace=" + this.needDataSpace + ", share='" + this.share + "', patchFilePath='" + this.patchFilePath + "', silenceUpdate=" + this.silenceUpdate + ", noticeType=" + this.noticeType + ", paramFlag=" + this.paramFlag + ", googlePatchLevel=" + this.googlePatchLevel + ", patchId=" + this.patchId + ", reminderType=" + this.reminderType + ", otaPkgType=" + this.otaPkgType + '}';
    }
}
