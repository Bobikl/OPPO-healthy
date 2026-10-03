package com.heytap.sports.vmedia;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class VmediaCloudResourceResponse {

    @SerializedName("downloadUrl")
    String downloadUrl;

    @SerializedName("md5AfterEncryption")
    String md5AfterEncryption;

    @SerializedName("md5BeforeEncryption")
    String md5BeforeEncryption;

    @SerializedName("resourceName")
    String resourceName;

    @SerializedName(CloudDownloadWorker.KEY_SECRET)
    String secret;

    @SerializedName("sizeAfterEncryption")
    long sizeAfterEncryption;

    @SerializedName("sizeBeforeEncryption")
    long sizeBeforeEncryption;

    @SerializedName("version")
    int version;
}
