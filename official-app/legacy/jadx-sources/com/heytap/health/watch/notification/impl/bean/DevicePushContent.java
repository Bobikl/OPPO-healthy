package com.heytap.health.watch.notification.impl.bean;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/watch/notification/impl/bean/DevicePushContent;", "", SpeechConstant.TTS_PLAY_MARK, "", "key", "event", "Lcom/heytap/health/watch/notification/impl/bean/DevicePushMessageEvent;", "(Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/watch/notification/impl/bean/DevicePushMessageEvent;)V", "getEvent", "()Lcom/heytap/health/watch/notification/impl/bean/DevicePushMessageEvent;", "getKey", "()Ljava/lang/String;", "getMark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DevicePushContent {

    @NotNull
    private final DevicePushMessageEvent event;

    @NotNull
    private final String key;

    @NotNull
    private final String mark;

    public DevicePushContent(@NotNull String mark, @NotNull String key, @NotNull DevicePushMessageEvent event) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(event, "event");
        this.mark = mark;
        this.key = key;
        this.event = event;
    }

    public static /* synthetic */ DevicePushContent copy$default(DevicePushContent devicePushContent, String str, String str2, DevicePushMessageEvent devicePushMessageEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = devicePushContent.mark;
        }
        if ((i & 2) != 0) {
            str2 = devicePushContent.key;
        }
        if ((i & 4) != 0) {
            devicePushMessageEvent = devicePushContent.event;
        }
        return devicePushContent.copy(str, str2, devicePushMessageEvent);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMark() {
        return this.mark;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DevicePushMessageEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final DevicePushContent copy(@NotNull String mark, @NotNull String key, @NotNull DevicePushMessageEvent event) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(event, "event");
        return new DevicePushContent(mark, key, event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicePushContent)) {
            return false;
        }
        DevicePushContent devicePushContent = (DevicePushContent) other;
        return Intrinsics.areEqual(this.mark, devicePushContent.mark) && Intrinsics.areEqual(this.key, devicePushContent.key) && Intrinsics.areEqual(this.event, devicePushContent.event);
    }

    @NotNull
    public final DevicePushMessageEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getMark() {
        return this.mark;
    }

    public int hashCode() {
        return (((this.mark.hashCode() * 31) + this.key.hashCode()) * 31) + this.event.hashCode();
    }

    @NotNull
    public String toString() {
        return "DevicePushContent(mark=" + this.mark + ", key=" + this.key + ", event=" + this.event + ")";
    }
}
