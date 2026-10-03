package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\bC\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\tHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\tHÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\tHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0012\"\u0004\b1\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R\u001a\u00104\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0012\"\u0004\b6\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0012\"\u0004\b<\u0010\u0014R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&¨\u0006Q"}, d2 = {"Lcom/heytap/health/community/data/ChooseImageJSData;", "", "url", "", "thumbnailUrl", "id", "clientFileId", "thumbnailClientFileId", "statusCode", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "cloudFileName", "thumbnailCloudFileName", "thumbnailWidth", "thumbnailHeight", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;II)V", "getClientFileId", "()Ljava/lang/String;", "setClientFileId", "(Ljava/lang/String;)V", "getCloudFileName", "setCloudFileName", "compressImageMD5", "getCompressImageMD5", "setCompressImageMD5", "compressImagePath", "getCompressImagePath", "setCompressImagePath", "compressThumbnailImagePath", "getCompressThumbnailImagePath", "setCompressThumbnailImagePath", "compressThumbnailMD5", "getCompressThumbnailMD5", "setCompressThumbnailMD5", "getHeight", "()I", "setHeight", "(I)V", "getId", "setId", "ocsUrl", "getOcsUrl", "setOcsUrl", "getStatusCode", "setStatusCode", "getThumbnailClientFileId", "setThumbnailClientFileId", "getThumbnailCloudFileName", "setThumbnailCloudFileName", "getThumbnailHeight", "setThumbnailHeight", "thumbnailOcsUrl", "getThumbnailOcsUrl", "setThumbnailOcsUrl", "getThumbnailUrl", "setThumbnailUrl", "getThumbnailWidth", "setThumbnailWidth", "getUrl", "setUrl", "getWidth", "setWidth", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "community_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ChooseImageJSData {

    @NotNull
    private String clientFileId;

    @NotNull
    private String cloudFileName;

    @NotNull
    private String compressImageMD5;

    @NotNull
    private String compressImagePath;

    @NotNull
    private String compressThumbnailImagePath;

    @NotNull
    private String compressThumbnailMD5;
    private int height;

    @NotNull
    private String id;

    @NotNull
    private String ocsUrl;
    private int statusCode;

    @NotNull
    private String thumbnailClientFileId;

    @NotNull
    private String thumbnailCloudFileName;
    private int thumbnailHeight;

    @NotNull
    private String thumbnailOcsUrl;

    @NotNull
    private String thumbnailUrl;
    private int thumbnailWidth;

    @NotNull
    private String url;
    private int width;

    public ChooseImageJSData() {
        this(null, null, null, null, null, 0, 0, 0, null, null, 0, 0, 4095, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getThumbnailCloudFileName() {
        return this.thumbnailCloudFileName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getThumbnailWidth() {
        return this.thumbnailWidth;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getThumbnailHeight() {
        return this.thumbnailHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThumbnailClientFileId() {
        return this.thumbnailClientFileId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCloudFileName() {
        return this.cloudFileName;
    }

    @NotNull
    public final ChooseImageJSData copy(@NotNull String url, @NotNull String thumbnailUrl, @NotNull String id, @NotNull String clientFileId, @NotNull String thumbnailClientFileId, int statusCode, int width, int height, @NotNull String cloudFileName, @NotNull String thumbnailCloudFileName, int thumbnailWidth, int thumbnailHeight) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(thumbnailClientFileId, "thumbnailClientFileId");
        Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
        Intrinsics.checkNotNullParameter(thumbnailCloudFileName, "thumbnailCloudFileName");
        return new ChooseImageJSData(url, thumbnailUrl, id, clientFileId, thumbnailClientFileId, statusCode, width, height, cloudFileName, thumbnailCloudFileName, thumbnailWidth, thumbnailHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChooseImageJSData)) {
            return false;
        }
        ChooseImageJSData chooseImageJSData = (ChooseImageJSData) other;
        return Intrinsics.areEqual(this.url, chooseImageJSData.url) && Intrinsics.areEqual(this.thumbnailUrl, chooseImageJSData.thumbnailUrl) && Intrinsics.areEqual(this.id, chooseImageJSData.id) && Intrinsics.areEqual(this.clientFileId, chooseImageJSData.clientFileId) && Intrinsics.areEqual(this.thumbnailClientFileId, chooseImageJSData.thumbnailClientFileId) && this.statusCode == chooseImageJSData.statusCode && this.width == chooseImageJSData.width && this.height == chooseImageJSData.height && Intrinsics.areEqual(this.cloudFileName, chooseImageJSData.cloudFileName) && Intrinsics.areEqual(this.thumbnailCloudFileName, chooseImageJSData.thumbnailCloudFileName) && this.thumbnailWidth == chooseImageJSData.thumbnailWidth && this.thumbnailHeight == chooseImageJSData.thumbnailHeight;
    }

    @NotNull
    public final String getClientFileId() {
        return this.clientFileId;
    }

    @NotNull
    public final String getCloudFileName() {
        return this.cloudFileName;
    }

    @NotNull
    public final String getCompressImageMD5() {
        return this.compressImageMD5;
    }

    @NotNull
    public final String getCompressImagePath() {
        return this.compressImagePath;
    }

    @NotNull
    public final String getCompressThumbnailImagePath() {
        return this.compressThumbnailImagePath;
    }

    @NotNull
    public final String getCompressThumbnailMD5() {
        return this.compressThumbnailMD5;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getOcsUrl() {
        return this.ocsUrl;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final String getThumbnailClientFileId() {
        return this.thumbnailClientFileId;
    }

    @NotNull
    public final String getThumbnailCloudFileName() {
        return this.thumbnailCloudFileName;
    }

    public final int getThumbnailHeight() {
        return this.thumbnailHeight;
    }

    @NotNull
    public final String getThumbnailOcsUrl() {
        return this.thumbnailOcsUrl;
    }

    @NotNull
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final int getThumbnailWidth() {
        return this.thumbnailWidth;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.url.hashCode() * 31) + this.thumbnailUrl.hashCode()) * 31) + this.id.hashCode()) * 31) + this.clientFileId.hashCode()) * 31) + this.thumbnailClientFileId.hashCode()) * 31) + Integer.hashCode(this.statusCode)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + this.cloudFileName.hashCode()) * 31) + this.thumbnailCloudFileName.hashCode()) * 31) + Integer.hashCode(this.thumbnailWidth)) * 31) + Integer.hashCode(this.thumbnailHeight);
    }

    public final void setClientFileId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientFileId = str;
    }

    public final void setCloudFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cloudFileName = str;
    }

    public final void setCompressImageMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.compressImageMD5 = str;
    }

    public final void setCompressImagePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.compressImagePath = str;
    }

    public final void setCompressThumbnailImagePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.compressThumbnailImagePath = str;
    }

    public final void setCompressThumbnailMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.compressThumbnailMD5 = str;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setOcsUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ocsUrl = str;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setThumbnailClientFileId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thumbnailClientFileId = str;
    }

    public final void setThumbnailCloudFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thumbnailCloudFileName = str;
    }

    public final void setThumbnailHeight(int i) {
        this.thumbnailHeight = i;
    }

    public final void setThumbnailOcsUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thumbnailOcsUrl = str;
    }

    public final void setThumbnailUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.thumbnailUrl = str;
    }

    public final void setThumbnailWidth(int i) {
        this.thumbnailWidth = i;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        return "ChooseImageJSData(url=" + this.url + ", thumbnailUrl=" + this.thumbnailUrl + ", id=" + this.id + ", clientFileId=" + this.clientFileId + ", thumbnailClientFileId=" + this.thumbnailClientFileId + ", statusCode=" + this.statusCode + ", width=" + this.width + ", height=" + this.height + ", cloudFileName=" + this.cloudFileName + ", thumbnailCloudFileName=" + this.thumbnailCloudFileName + ", thumbnailWidth=" + this.thumbnailWidth + ", thumbnailHeight=" + this.thumbnailHeight + ")";
    }

    public ChooseImageJSData(@NotNull String url, @NotNull String thumbnailUrl, @NotNull String id, @NotNull String clientFileId, @NotNull String thumbnailClientFileId, int i, int i2, int i3, @NotNull String cloudFileName, @NotNull String thumbnailCloudFileName, int i4, int i5) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(clientFileId, "clientFileId");
        Intrinsics.checkNotNullParameter(thumbnailClientFileId, "thumbnailClientFileId");
        Intrinsics.checkNotNullParameter(cloudFileName, "cloudFileName");
        Intrinsics.checkNotNullParameter(thumbnailCloudFileName, "thumbnailCloudFileName");
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.id = id;
        this.clientFileId = clientFileId;
        this.thumbnailClientFileId = thumbnailClientFileId;
        this.statusCode = i;
        this.width = i2;
        this.height = i3;
        this.cloudFileName = cloudFileName;
        this.thumbnailCloudFileName = thumbnailCloudFileName;
        this.thumbnailWidth = i4;
        this.thumbnailHeight = i5;
        this.compressImagePath = "";
        this.compressImageMD5 = "";
        this.compressThumbnailImagePath = "";
        this.compressThumbnailMD5 = "";
        this.ocsUrl = "";
        this.thumbnailOcsUrl = "";
    }

    public /* synthetic */ ChooseImageJSData(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? "" : str5, (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? "" : str6, (i6 & 512) == 0 ? str7 : "", (i6 & 1024) != 0 ? 0 : i4, (i6 & 2048) == 0 ? i5 : 0);
    }
}
