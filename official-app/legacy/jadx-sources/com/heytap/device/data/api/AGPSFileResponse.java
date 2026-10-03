package com.heytap.device.data.api;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.network.core.BaseResponse;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class AGPSFileResponse extends BaseResponse<List<AGPSFileItem>> {

    @Keep
    public static class AGPSFileItem {
        public String ephemerisFileUrl;
        public String fileName;
        public int fileType;
        public String md5String;
        public int resourceType;
        public long updateTime;

        public String getEphemerisFileName() {
            if (!TextUtils.isEmpty(this.fileName)) {
                return this.fileName;
            }
            String str = this.ephemerisFileUrl;
            if (str == null) {
                return UUID.randomUUID().toString();
            }
            return this.ephemerisFileUrl.substring(str.lastIndexOf("/") + 1);
        }
    }
}
