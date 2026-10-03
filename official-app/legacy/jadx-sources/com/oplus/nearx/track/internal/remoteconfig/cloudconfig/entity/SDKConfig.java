package com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.u0j;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b,\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\"\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0005\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR\"\u0010'\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\"\u0010*\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0005\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR\"\u00100\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0005\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR\"\u00106\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0005\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\t¨\u0006="}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/SDKConfig;", "", "", "toString", "uploadHost", "Ljava/lang/String;", "getUploadHost", "()Ljava/lang/String;", "setUploadHost", "(Ljava/lang/String;)V", "", "uploadIntervalTime", "J", "getUploadIntervalTime", "()J", "setUploadIntervalTime", "(J)V", "", "uploadIntervalCount", "I", "getUploadIntervalCount", "()I", "setUploadIntervalCount", "(I)V", "accumulateIntervalTime", "getAccumulateIntervalTime", "setAccumulateIntervalTime", "accumulateIntervalCount", "getAccumulateIntervalCount", "setAccumulateIntervalCount", "clearNotCoreTimeout", "getClearNotCoreTimeout", "setClearNotCoreTimeout", "accountIntervalTime", "getAccountIntervalTime", "setAccountIntervalTime", "troubleMsg", "getTroubleMsg", "setTroubleMsg", "cwrTimeout", "getCwrTimeout", "setCwrTimeout", "expirationDate", "getExpirationDate", "setExpirationDate", "secretKey", "getSecretKey", "setSecretKey", "secretKeyID", "getSecretKeyID", "setSecretKeyID", "ntpHost", "getNtpHost", "setNtpHost", "uploadHostForTech", "getUploadHostForTech", "setUploadHostForTech", "<init>", "()V", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class SDKConfig {
    public static final long ACCOUNT_INTERVAL_TIME = 7200000;
    public static final int ACCUMULATE_INTERVAL_COUNT = 10;
    public static final long ACCUMULATE_INTERVAL_TIME = 300000;
    public static final long CWR_TIME = 10000;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int EXPIRATION_DATE = 30;
    public static final int NOT_CORE_DATA_DEFAULT_OVERDUE_TIME = 7;
    public static final int UPLOAD_INTERVAL_COUNT = 100;
    public static final long UPLOAD_INTERVAL_TIME = 300000;

    @NotNull
    private String uploadHost = "";
    private long uploadIntervalTime = 300000;
    private int uploadIntervalCount = 100;
    private long accumulateIntervalTime = 300000;
    private int accumulateIntervalCount = 10;
    private int clearNotCoreTimeout = 7;
    private long accountIntervalTime = 7200000;

    @NotNull
    private String troubleMsg = "";
    private long cwrTimeout = 10000;
    private int expirationDate = 30;

    @NotNull
    private String secretKey = "";
    private long secretKeyID = -1;

    @NotNull
    private String ntpHost = "";

    @NotNull
    private String uploadHostForTech = "";

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.SDKConfig$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/SDKConfig$a;", "", "", "", "configMap", "Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/SDKConfig;", "a", "", "ACCOUNT_INTERVAL_TIME", "J", "", "ACCUMULATE_INTERVAL_COUNT", "I", "ACCUMULATE_INTERVAL_TIME", "CWR_TIME", "EXPIRATION_DATE", "NOT_CORE_DATA_DEFAULT_OVERDUE_TIME", "UPLOAD_INTERVAL_COUNT", "UPLOAD_INTERVAL_TIME", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SDKConfig a(@NotNull Map<String, String> configMap) {
            Intrinsics.checkNotNullParameter(configMap, "configMap");
            SDKConfig sDKConfig = new SDKConfig();
            String str = configMap.get("uploadHost");
            if (str == null) {
                str = "";
            }
            sDKConfig.setUploadHost(str);
            sDKConfig.setUploadIntervalTime(u0j.i(configMap.get("uploadIntervalTime"), 300000L));
            sDKConfig.setUploadIntervalCount(u0j.h(configMap.get("uploadIntervalCount"), 100));
            sDKConfig.setAccumulateIntervalTime(u0j.i(configMap.get("accumulateIntervalTime"), 300000L));
            sDKConfig.setAccumulateIntervalCount(u0j.h(configMap.get("accumulateIntervalCount"), 10));
            sDKConfig.setClearNotCoreTimeout(u0j.h(configMap.get("clearNotCoreTimeout"), 7));
            sDKConfig.setAccountIntervalTime(u0j.i(configMap.get("accountIntervalTime"), 7200000L));
            String str2 = configMap.get("troubleMsg");
            if (str2 == null) {
                str2 = "";
            }
            sDKConfig.setTroubleMsg(str2);
            sDKConfig.setCwrTimeout(u0j.i(configMap.get("cwrTimeout"), 10000L));
            sDKConfig.setExpirationDate(u0j.h(configMap.get("expirationDate"), 30));
            String str3 = configMap.get("secretKey");
            if (str3 == null) {
                str3 = "";
            }
            sDKConfig.setSecretKey(str3);
            sDKConfig.setSecretKeyID(u0j.i(configMap.get("secretKeyID"), -1L));
            String str4 = configMap.get("ntpHost");
            if (str4 == null) {
                str4 = "";
            }
            sDKConfig.setNtpHost(str4);
            String str5 = configMap.get("uploadHostForTech");
            sDKConfig.setUploadHostForTech(str5 != null ? str5 : "");
            return sDKConfig;
        }
    }

    public final long getAccountIntervalTime() {
        return this.accountIntervalTime;
    }

    public final int getAccumulateIntervalCount() {
        return this.accumulateIntervalCount;
    }

    public final long getAccumulateIntervalTime() {
        return this.accumulateIntervalTime;
    }

    public final int getClearNotCoreTimeout() {
        return this.clearNotCoreTimeout;
    }

    public final long getCwrTimeout() {
        return this.cwrTimeout;
    }

    public final int getExpirationDate() {
        return this.expirationDate;
    }

    @NotNull
    public final String getNtpHost() {
        return this.ntpHost;
    }

    @NotNull
    public final String getSecretKey() {
        return this.secretKey;
    }

    public final long getSecretKeyID() {
        return this.secretKeyID;
    }

    @NotNull
    public final String getTroubleMsg() {
        return this.troubleMsg;
    }

    @NotNull
    public final String getUploadHost() {
        return this.uploadHost;
    }

    @NotNull
    public final String getUploadHostForTech() {
        return this.uploadHostForTech;
    }

    public final int getUploadIntervalCount() {
        return this.uploadIntervalCount;
    }

    public final long getUploadIntervalTime() {
        return this.uploadIntervalTime;
    }

    public final void setAccountIntervalTime(long j2) {
        this.accountIntervalTime = j2;
    }

    public final void setAccumulateIntervalCount(int i) {
        this.accumulateIntervalCount = i;
    }

    public final void setAccumulateIntervalTime(long j2) {
        this.accumulateIntervalTime = j2;
    }

    public final void setClearNotCoreTimeout(int i) {
        this.clearNotCoreTimeout = i;
    }

    public final void setCwrTimeout(long j2) {
        this.cwrTimeout = j2;
    }

    public final void setExpirationDate(int i) {
        this.expirationDate = i;
    }

    public final void setNtpHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ntpHost = str;
    }

    public final void setSecretKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secretKey = str;
    }

    public final void setSecretKeyID(long j2) {
        this.secretKeyID = j2;
    }

    public final void setTroubleMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.troubleMsg = str;
    }

    public final void setUploadHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uploadHost = str;
    }

    public final void setUploadHostForTech(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uploadHostForTech = str;
    }

    public final void setUploadIntervalCount(int i) {
        this.uploadIntervalCount = i;
    }

    public final void setUploadIntervalTime(long j2) {
        this.uploadIntervalTime = j2;
    }

    @NotNull
    public String toString() {
        if (!GlobalConfigHelper.INSTANCE.d()) {
            return "GlobalBean(uploadIntervalTime=" + this.uploadIntervalTime + ", uploadIntervalCount=" + this.uploadIntervalCount + ", accumulateIntervalTime=" + this.accumulateIntervalTime + ", accumulateIntervalCount=" + this.accumulateIntervalCount + ", clearNotCoreTimeout=" + this.clearNotCoreTimeout + ", accountIntervalTime=" + this.accountIntervalTime + ", troubleMsg='" + this.troubleMsg + "', cwrTimeout=" + this.cwrTimeout + ", expirationDate=" + this.expirationDate + ", secretKey='" + this.secretKey + "', secretKeyID=" + this.secretKeyID + ')';
        }
        return "GlobalBean(uploadHost='" + this.uploadHost + "', uploadIntervalTime=" + this.uploadIntervalTime + ", uploadIntervalCount=" + this.uploadIntervalCount + ", accumulateIntervalTime=" + this.accumulateIntervalTime + ", accumulateIntervalCount=" + this.accumulateIntervalCount + ", clearNotCoreTimeout=" + this.clearNotCoreTimeout + ", accountIntervalTime=" + this.accountIntervalTime + ", troubleMsg='" + this.troubleMsg + "', cwrTimeout=" + this.cwrTimeout + ", expirationDate=" + this.expirationDate + ", secretKey='" + this.secretKey + "', secretKeyID=" + this.secretKeyID + ", ntpHost=" + this.ntpHost + ", uploadHostForTech=" + this.uploadHostForTech + ')';
    }
}
