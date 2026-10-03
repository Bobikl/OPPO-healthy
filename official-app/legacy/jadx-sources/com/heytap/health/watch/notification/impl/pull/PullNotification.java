package com.heytap.health.watch.notification.impl.pull;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.e36;
import com.oplus.aiunit.vision.t04;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0002\u0010#J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0006HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\u0006HÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\u0006HÆ\u0003J\t\u0010_\u001a\u00020\u0006HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J»\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0006HÆ\u0001J\u0013\u0010d\u001a\u00020e2\b\u0010f\u001a\u0004\u0018\u00010gHÖ\u0003J\t\u0010h\u001a\u00020\u0006HÖ\u0001J\t\u0010i\u001a\u00020\u0003HÖ\u0001R\u0011\u0010 \u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0011\u0010\"\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010%R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010'R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b=\u0010%R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010'R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010'¨\u0006j"}, d2 = {"Lcom/heytap/health/watch/notification/impl/pull/PullNotification;", "Ljava/io/Serializable;", "title", "", "content", "pushTimeType", "", "pushStartTime", "", "pushMode", "deviceType", "model", "sku", t04.DEVICE_UNIQUE_ID, "bigPictureUrl", "smallIcon", "largeIcon", "clickActionType", "clickActionActivity", "clickActionUrl", "notifyId", "messageType", "showTtl", "showTimeType", "showStartTime", "showEndTime", "deviceSystemMode", e36.PARAM_FIRMWARE_VERSION, "principalName", "executeTime", "buttonPackageName", "buttonTitle", SpeechConstant.KEY_APP_VERSION, "principalPackageName", EngineConstant.WAKEUP_TYPE_COMMAND, "(Ljava/lang/String;Ljava/lang/String;IJIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIIJJIILjava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getAppVersion", "()I", "getBigPictureUrl", "()Ljava/lang/String;", "getButtonPackageName", "getButtonTitle", "getClickActionActivity", "getClickActionType", "getClickActionUrl", "getCommand", "getContent", "getDeviceSystemMode", "getDeviceType", "getDeviceUniqueId", "getExecuteTime", "()J", "getFirmwareVersion", "getLargeIcon", "getMessageType", "getModel", "getNotifyId", "getPrincipalName", "getPrincipalPackageName", "getPushMode", "getPushStartTime", "getPushTimeType", "getShowEndTime", "getShowStartTime", "getShowTimeType", "getShowTtl", "getSku", "getSmallIcon", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PullNotification implements Serializable {
    private final int appVersion;

    @NotNull
    private final String bigPictureUrl;

    @Nullable
    private final String buttonPackageName;

    @Nullable
    private final String buttonTitle;

    @NotNull
    private final String clickActionActivity;
    private final int clickActionType;

    @Nullable
    private final String clickActionUrl;
    private final int command;

    @NotNull
    private final String content;
    private final int deviceSystemMode;
    private final int deviceType;

    @NotNull
    private final String deviceUniqueId;
    private final long executeTime;
    private final int firmwareVersion;

    @NotNull
    private final String largeIcon;
    private final int messageType;

    @NotNull
    private final String model;
    private final int notifyId;

    @NotNull
    private final String principalName;

    @NotNull
    private final String principalPackageName;
    private final int pushMode;
    private final long pushStartTime;
    private final int pushTimeType;
    private final long showEndTime;
    private final long showStartTime;
    private final int showTimeType;
    private final int showTtl;

    @NotNull
    private final String sku;

    @NotNull
    private final String smallIcon;

    @NotNull
    private final String title;

    public PullNotification(@NotNull String title, @NotNull String content, int i, long j2, int i2, int i3, @NotNull String model, @NotNull String sku, @NotNull String deviceUniqueId, @NotNull String bigPictureUrl, @NotNull String smallIcon, @NotNull String largeIcon, int i4, @NotNull String clickActionActivity, @Nullable String str, int i5, int i6, int i7, int i8, long j3, long j4, int i9, int i10, @NotNull String principalName, long j5, @Nullable String str2, @Nullable String str3, int i11, @NotNull String principalPackageName, int i12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(bigPictureUrl, "bigPictureUrl");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        Intrinsics.checkNotNullParameter(largeIcon, "largeIcon");
        Intrinsics.checkNotNullParameter(clickActionActivity, "clickActionActivity");
        Intrinsics.checkNotNullParameter(principalName, "principalName");
        Intrinsics.checkNotNullParameter(principalPackageName, "principalPackageName");
        this.title = title;
        this.content = content;
        this.pushTimeType = i;
        this.pushStartTime = j2;
        this.pushMode = i2;
        this.deviceType = i3;
        this.model = model;
        this.sku = sku;
        this.deviceUniqueId = deviceUniqueId;
        this.bigPictureUrl = bigPictureUrl;
        this.smallIcon = smallIcon;
        this.largeIcon = largeIcon;
        this.clickActionType = i4;
        this.clickActionActivity = clickActionActivity;
        this.clickActionUrl = str;
        this.notifyId = i5;
        this.messageType = i6;
        this.showTtl = i7;
        this.showTimeType = i8;
        this.showStartTime = j3;
        this.showEndTime = j4;
        this.deviceSystemMode = i9;
        this.firmwareVersion = i10;
        this.principalName = principalName;
        this.executeTime = j5;
        this.buttonPackageName = str2;
        this.buttonTitle = str3;
        this.appVersion = i11;
        this.principalPackageName = principalPackageName;
        this.command = i12;
    }

    public static /* synthetic */ PullNotification copy$default(PullNotification pullNotification, String str, String str2, int i, long j2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, String str8, int i4, String str9, String str10, int i5, int i6, int i7, int i8, long j3, long j4, int i9, int i10, String str11, long j5, String str12, String str13, int i11, String str14, int i12, int i13, Object obj) {
        String str15 = (i13 & 1) != 0 ? pullNotification.title : str;
        String str16 = (i13 & 2) != 0 ? pullNotification.content : str2;
        int i14 = (i13 & 4) != 0 ? pullNotification.pushTimeType : i;
        long j6 = (i13 & 8) != 0 ? pullNotification.pushStartTime : j2;
        int i15 = (i13 & 16) != 0 ? pullNotification.pushMode : i2;
        int i16 = (i13 & 32) != 0 ? pullNotification.deviceType : i3;
        String str17 = (i13 & 64) != 0 ? pullNotification.model : str3;
        String str18 = (i13 & 128) != 0 ? pullNotification.sku : str4;
        String str19 = (i13 & 256) != 0 ? pullNotification.deviceUniqueId : str5;
        String str20 = (i13 & 512) != 0 ? pullNotification.bigPictureUrl : str6;
        String str21 = (i13 & 1024) != 0 ? pullNotification.smallIcon : str7;
        String str22 = (i13 & 2048) != 0 ? pullNotification.largeIcon : str8;
        return pullNotification.copy(str15, str16, i14, j6, i15, i16, str17, str18, str19, str20, str21, str22, (i13 & 4096) != 0 ? pullNotification.clickActionType : i4, (i13 & 8192) != 0 ? pullNotification.clickActionActivity : str9, (i13 & 16384) != 0 ? pullNotification.clickActionUrl : str10, (i13 & 32768) != 0 ? pullNotification.notifyId : i5, (i13 & 65536) != 0 ? pullNotification.messageType : i6, (i13 & 131072) != 0 ? pullNotification.showTtl : i7, (i13 & 262144) != 0 ? pullNotification.showTimeType : i8, (i13 & 524288) != 0 ? pullNotification.showStartTime : j3, (i13 & 1048576) != 0 ? pullNotification.showEndTime : j4, (i13 & 2097152) != 0 ? pullNotification.deviceSystemMode : i9, (4194304 & i13) != 0 ? pullNotification.firmwareVersion : i10, (i13 & 8388608) != 0 ? pullNotification.principalName : str11, (i13 & 16777216) != 0 ? pullNotification.executeTime : j5, (i13 & 33554432) != 0 ? pullNotification.buttonPackageName : str12, (67108864 & i13) != 0 ? pullNotification.buttonTitle : str13, (i13 & 134217728) != 0 ? pullNotification.appVersion : i11, (i13 & 268435456) != 0 ? pullNotification.principalPackageName : str14, (i13 & 536870912) != 0 ? pullNotification.command : i12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBigPictureUrl() {
        return this.bigPictureUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLargeIcon() {
        return this.largeIcon;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getClickActionType() {
        return this.clickActionType;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getClickActionActivity() {
        return this.clickActionActivity;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getClickActionUrl() {
        return this.clickActionUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getNotifyId() {
        return this.notifyId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getShowTtl() {
        return this.showTtl;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getShowTimeType() {
        return this.showTimeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final long getShowStartTime() {
        return this.showStartTime;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final long getShowEndTime() {
        return this.showEndTime;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getDeviceSystemMode() {
        return this.deviceSystemMode;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPrincipalName() {
        return this.principalName;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final long getExecuteTime() {
        return this.executeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getButtonPackageName() {
        return this.buttonPackageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final int getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getPrincipalPackageName() {
        return this.principalPackageName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPushTimeType() {
        return this.pushTimeType;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getCommand() {
        return this.command;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPushStartTime() {
        return this.pushStartTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPushMode() {
        return this.pushMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @NotNull
    public final PullNotification copy(@NotNull String title, @NotNull String content, int pushTimeType, long pushStartTime, int pushMode, int deviceType, @NotNull String model, @NotNull String sku, @NotNull String deviceUniqueId, @NotNull String bigPictureUrl, @NotNull String smallIcon, @NotNull String largeIcon, int clickActionType, @NotNull String clickActionActivity, @Nullable String clickActionUrl, int notifyId, int messageType, int showTtl, int showTimeType, long showStartTime, long showEndTime, int deviceSystemMode, int firmwareVersion, @NotNull String principalName, long executeTime, @Nullable String buttonPackageName, @Nullable String buttonTitle, int appVersion, @NotNull String principalPackageName, int command) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(bigPictureUrl, "bigPictureUrl");
        Intrinsics.checkNotNullParameter(smallIcon, "smallIcon");
        Intrinsics.checkNotNullParameter(largeIcon, "largeIcon");
        Intrinsics.checkNotNullParameter(clickActionActivity, "clickActionActivity");
        Intrinsics.checkNotNullParameter(principalName, "principalName");
        Intrinsics.checkNotNullParameter(principalPackageName, "principalPackageName");
        return new PullNotification(title, content, pushTimeType, pushStartTime, pushMode, deviceType, model, sku, deviceUniqueId, bigPictureUrl, smallIcon, largeIcon, clickActionType, clickActionActivity, clickActionUrl, notifyId, messageType, showTtl, showTimeType, showStartTime, showEndTime, deviceSystemMode, firmwareVersion, principalName, executeTime, buttonPackageName, buttonTitle, appVersion, principalPackageName, command);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PullNotification)) {
            return false;
        }
        PullNotification pullNotification = (PullNotification) other;
        return Intrinsics.areEqual(this.title, pullNotification.title) && Intrinsics.areEqual(this.content, pullNotification.content) && this.pushTimeType == pullNotification.pushTimeType && this.pushStartTime == pullNotification.pushStartTime && this.pushMode == pullNotification.pushMode && this.deviceType == pullNotification.deviceType && Intrinsics.areEqual(this.model, pullNotification.model) && Intrinsics.areEqual(this.sku, pullNotification.sku) && Intrinsics.areEqual(this.deviceUniqueId, pullNotification.deviceUniqueId) && Intrinsics.areEqual(this.bigPictureUrl, pullNotification.bigPictureUrl) && Intrinsics.areEqual(this.smallIcon, pullNotification.smallIcon) && Intrinsics.areEqual(this.largeIcon, pullNotification.largeIcon) && this.clickActionType == pullNotification.clickActionType && Intrinsics.areEqual(this.clickActionActivity, pullNotification.clickActionActivity) && Intrinsics.areEqual(this.clickActionUrl, pullNotification.clickActionUrl) && this.notifyId == pullNotification.notifyId && this.messageType == pullNotification.messageType && this.showTtl == pullNotification.showTtl && this.showTimeType == pullNotification.showTimeType && this.showStartTime == pullNotification.showStartTime && this.showEndTime == pullNotification.showEndTime && this.deviceSystemMode == pullNotification.deviceSystemMode && this.firmwareVersion == pullNotification.firmwareVersion && Intrinsics.areEqual(this.principalName, pullNotification.principalName) && this.executeTime == pullNotification.executeTime && Intrinsics.areEqual(this.buttonPackageName, pullNotification.buttonPackageName) && Intrinsics.areEqual(this.buttonTitle, pullNotification.buttonTitle) && this.appVersion == pullNotification.appVersion && Intrinsics.areEqual(this.principalPackageName, pullNotification.principalPackageName) && this.command == pullNotification.command;
    }

    public final int getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getBigPictureUrl() {
        return this.bigPictureUrl;
    }

    @Nullable
    public final String getButtonPackageName() {
        return this.buttonPackageName;
    }

    @Nullable
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @NotNull
    public final String getClickActionActivity() {
        return this.clickActionActivity;
    }

    public final int getClickActionType() {
        return this.clickActionType;
    }

    @Nullable
    public final String getClickActionUrl() {
        return this.clickActionUrl;
    }

    public final int getCommand() {
        return this.command;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getDeviceSystemMode() {
        return this.deviceSystemMode;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getExecuteTime() {
        return this.executeTime;
    }

    public final int getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @NotNull
    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final int getNotifyId() {
        return this.notifyId;
    }

    @NotNull
    public final String getPrincipalName() {
        return this.principalName;
    }

    @NotNull
    public final String getPrincipalPackageName() {
        return this.principalPackageName;
    }

    public final int getPushMode() {
        return this.pushMode;
    }

    public final long getPushStartTime() {
        return this.pushStartTime;
    }

    public final int getPushTimeType() {
        return this.pushTimeType;
    }

    public final long getShowEndTime() {
        return this.showEndTime;
    }

    public final long getShowStartTime() {
        return this.showStartTime;
    }

    public final int getShowTimeType() {
        return this.showTimeType;
    }

    public final int getShowTtl() {
        return this.showTtl;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    public final String getSmallIcon() {
        return this.smallIcon;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.pushTimeType)) * 31) + Long.hashCode(this.pushStartTime)) * 31) + Integer.hashCode(this.pushMode)) * 31) + Integer.hashCode(this.deviceType)) * 31) + this.model.hashCode()) * 31) + this.sku.hashCode()) * 31) + this.deviceUniqueId.hashCode()) * 31) + this.bigPictureUrl.hashCode()) * 31) + this.smallIcon.hashCode()) * 31) + this.largeIcon.hashCode()) * 31) + Integer.hashCode(this.clickActionType)) * 31) + this.clickActionActivity.hashCode()) * 31;
        String str = this.clickActionUrl;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.notifyId)) * 31) + Integer.hashCode(this.messageType)) * 31) + Integer.hashCode(this.showTtl)) * 31) + Integer.hashCode(this.showTimeType)) * 31) + Long.hashCode(this.showStartTime)) * 31) + Long.hashCode(this.showEndTime)) * 31) + Integer.hashCode(this.deviceSystemMode)) * 31) + Integer.hashCode(this.firmwareVersion)) * 31) + this.principalName.hashCode()) * 31) + Long.hashCode(this.executeTime)) * 31;
        String str2 = this.buttonPackageName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonTitle;
        return ((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.appVersion)) * 31) + this.principalPackageName.hashCode()) * 31) + Integer.hashCode(this.command);
    }

    @NotNull
    public String toString() {
        return "PullNotification(title=" + this.title + ", content=" + this.content + ", pushTimeType=" + this.pushTimeType + ", pushStartTime=" + this.pushStartTime + ", pushMode=" + this.pushMode + ", deviceType=" + this.deviceType + ", model=" + this.model + ", sku=" + this.sku + ", deviceUniqueId=" + this.deviceUniqueId + ", bigPictureUrl=" + this.bigPictureUrl + ", smallIcon=" + this.smallIcon + ", largeIcon=" + this.largeIcon + ", clickActionType=" + this.clickActionType + ", clickActionActivity=" + this.clickActionActivity + ", clickActionUrl=" + this.clickActionUrl + ", notifyId=" + this.notifyId + ", messageType=" + this.messageType + ", showTtl=" + this.showTtl + ", showTimeType=" + this.showTimeType + ", showStartTime=" + this.showStartTime + ", showEndTime=" + this.showEndTime + ", deviceSystemMode=" + this.deviceSystemMode + ", firmwareVersion=" + this.firmwareVersion + ", principalName=" + this.principalName + ", executeTime=" + this.executeTime + ", buttonPackageName=" + this.buttonPackageName + ", buttonTitle=" + this.buttonTitle + ", appVersion=" + this.appVersion + ", principalPackageName=" + this.principalPackageName + ", command=" + this.command + ")";
    }
}
