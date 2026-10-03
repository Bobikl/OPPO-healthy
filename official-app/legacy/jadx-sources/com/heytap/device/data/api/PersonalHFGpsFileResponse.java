package com.heytap.device.data.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.log.consts.LogSenderConst;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002R\u00020\u00000\u0001:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/heytap/device/data/api/PersonalHFGpsFileResponse;", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/device/data/api/PersonalHFGpsFileResponse$PersonalHFGpsInfo;", "()V", "PersonalHFGpsInfo", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PersonalHFGpsFileResponse extends BaseResponse<PersonalHFGpsInfo> {

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/device/data/api/PersonalHFGpsFileResponse$PersonalHFGpsInfo;", "", "(Lcom/heytap/device/data/api/PersonalHFGpsFileResponse;)V", LogSenderConst.FILENAME, "", "getFileName", "()Ljava/lang/String;", "setFileName", "(Ljava/lang/String;)V", "path", "getPath", "setPath", CloudDownloadWorker.KEY_SECRET, "getSecret", "setSecret", "hasRealData", "", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PersonalHFGpsInfo {

        @Nullable
        private String fileName;

        @Nullable
        private String path;

        @Nullable
        private String secret;

        public PersonalHFGpsInfo() {
        }

        @Nullable
        public final String getFileName() {
            return this.fileName;
        }

        @Nullable
        public final String getPath() {
            return this.path;
        }

        @Nullable
        public final String getSecret() {
            return this.secret;
        }

        public final boolean hasRealData() {
            return (TextUtils.isEmpty(this.path) || TextUtils.isEmpty(this.fileName) || TextUtils.isEmpty(this.secret)) ? false : true;
        }

        public final void setFileName(@Nullable String str) {
            this.fileName = str;
        }

        public final void setPath(@Nullable String str) {
            this.path = str;
        }

        public final void setSecret(@Nullable String str) {
            this.secret = str;
        }
    }
}
