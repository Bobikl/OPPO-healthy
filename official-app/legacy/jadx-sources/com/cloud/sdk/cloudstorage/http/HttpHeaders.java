package com.cloud.sdk.cloudstorage.http;

import android.os.Build;
import com.cloud.sdk.cloudstorage.data.ServerConfig;
import com.cloud.sdk.cloudstorage.utils.ApkInfo;
import com.cloud.sdk.cloudstorage.utils.DeviceInfo;
import com.cloud.sdk.cloudstorage.utils.MD5Utils;
import com.cloud.sdk.cloudstorage.utils.OCConstants;
import com.cloud.sdk.cloudstorage.utils.UrlSafeBase64;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/cloud/sdk/cloudstorage/http/HttpHeaders;", "", "()V", "BLOCK_MISS", "", "CHUNK_SIZE", "CLOUD_ACCESSTOKEN", "CLOUD_APPID", "CLOUD_BUCKET", "CLOUD_FILENAME", "CLOUD_IMEI", "CLOUD_KEY_HEADER_CRC32", "CLOUD_MODEL", "CLOUD_OTA_VERSION", "CLOUD_SDK_VERSION", "CLOUD_SIGN", "CLOUD_VERSION", "CTX", "DOWNLOAD_CTX", "ENCRYPT_BLOCK_SIZE", "KEY", "LEVEL", "METHOD", "PART_NUMBER", "SERVER_TIME", "TIMESTAMP", "UPLOAD_ID", "addCommonHeader", "", "headerMap", "filePath", "serverConfig", "Lcom/cloud/sdk/cloudstorage/data/ServerConfig;", "addCommonHeader$cloud_storage_sdk_release", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class HttpHeaders {

    @NotNull
    public static final String BLOCK_MISS = "ocloud-block-mising";

    @NotNull
    public static final String CHUNK_SIZE = "ocloud-chunk-size";

    @NotNull
    public static final String CLOUD_ACCESSTOKEN = "OCLOUD-ACCESSTOKEN";

    @NotNull
    public static final String CLOUD_APPID = "OCLOUD-APPID";

    @NotNull
    public static final String CLOUD_BUCKET = "OCLOUD-BUCKET";

    @NotNull
    public static final String CLOUD_FILENAME = "OCLOUD-FILENAME";

    @NotNull
    public static final String CLOUD_IMEI = "OCLOUD-IMEI";

    @NotNull
    public static final String CLOUD_KEY_HEADER_CRC32 = "OCLOUD-CRC32";

    @NotNull
    public static final String CLOUD_MODEL = "OCLOUD-MODEL";

    @NotNull
    public static final String CLOUD_OTA_VERSION = "OCLOUD-OTA-VERSION";

    @NotNull
    public static final String CLOUD_SDK_VERSION = "OCLOUD-SDK-VERSION";

    @NotNull
    public static final String CLOUD_SIGN = "OCLOUD-SIGN";

    @NotNull
    public static final String CLOUD_VERSION = "OCLOUD-VERSION";

    @NotNull
    public static final String CTX = "ctx";

    @NotNull
    public static final String DOWNLOAD_CTX = "_video-ctx";

    @NotNull
    public static final String ENCRYPT_BLOCK_SIZE = "Encrypt-Block-Size";

    @NotNull
    public static final HttpHeaders INSTANCE = new HttpHeaders();

    @NotNull
    public static final String KEY = "key";

    @NotNull
    public static final String LEVEL = "ocloud-io-limit-level";

    @NotNull
    public static final String METHOD = "method";

    @NotNull
    public static final String PART_NUMBER = "partNumber";

    @NotNull
    public static final String SERVER_TIME = "ocloud-io-limit-serverTime";

    @NotNull
    public static final String TIMESTAMP = "TimeStamp";

    @NotNull
    public static final String UPLOAD_ID = "uploadId";

    private HttpHeaders() {
    }

    @NotNull
    public final Map<String, String> addCommonHeader$cloud_storage_sdk_release(@NotNull Map<String, String> headerMap, @NotNull String filePath, @NotNull ServerConfig serverConfig) {
        Intrinsics.checkNotNullParameter(headerMap, "headerMap");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        String accessToken = serverConfig.getAccessToken().getAccessToken();
        String aesSecretKey = serverConfig.getAccessToken().getAesSecretKey();
        String bucket = serverConfig.getServerInfo().getBucket();
        String deviceId = DeviceInfo.INSTANCE.getDeviceId();
        StringBuilder sb = new StringBuilder();
        sb.append(aesSecretKey);
        sb.append(accessToken);
        sb.append(bucket);
        sb.append(filePath);
        sb.append(deviceId);
        ApkInfo apkInfo = ApkInfo.INSTANCE;
        sb.append(String.valueOf(apkInfo.getVersionCode()));
        sb.append(aesSecretKey);
        String string = sb.toString();
        headerMap.put("TimeStamp", String.valueOf(System.currentTimeMillis()));
        headerMap.put(CLOUD_IMEI, deviceId);
        String str = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str, "Build.MODEL");
        headerMap.put(CLOUD_MODEL, str);
        headerMap.put(CLOUD_VERSION, String.valueOf(apkInfo.getVersionCode()));
        headerMap.put(CLOUD_SDK_VERSION, OCConstants.SDK_VERSION);
        headerMap.put(CLOUD_APPID, apkInfo.getEncodePkgName());
        headerMap.put(CLOUD_BUCKET, serverConfig.getServerInfo().getBucket());
        headerMap.put(CLOUD_FILENAME, UrlSafeBase64.INSTANCE.encodeToString(filePath));
        headerMap.put(CLOUD_ACCESSTOKEN, serverConfig.getAccessToken().getAccessToken());
        headerMap.put(CLOUD_SIGN, MD5Utils.computeMd5$default(MD5Utils.INSTANCE, string, null, 2, null));
        return headerMap;
    }
}
