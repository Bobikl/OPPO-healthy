package com.heytap.speech.engine.constant;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J?\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/constant/CloudWakeupBean;", "", "state", "", "confidence", "", "errorCode", "", "type", ClickApiEntity.TIME, "", "(Ljava/lang/String;DILjava/lang/String;J)V", "getConfidence", "()D", "getErrorCode", "()I", SpeechConstant.KEY_RECORD_ID, "getRecordId", "()Ljava/lang/String;", "setRecordId", "(Ljava/lang/String;)V", "getState", "getTime", "()J", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class CloudWakeupBean {
    private final double confidence;
    private final int errorCode;

    @Nullable
    private String recordId;

    @Nullable
    private final String state;
    private final long time;

    @Nullable
    private final String type;

    public CloudWakeupBean(@Nullable String str, double d, int i, @Nullable String str2, long j2) {
        this.state = str;
        this.confidence = d;
        this.errorCode = i;
        this.type = str2;
        this.time = j2;
    }

    public static /* synthetic */ CloudWakeupBean copy$default(CloudWakeupBean cloudWakeupBean, String str, double d, int i, String str2, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cloudWakeupBean.state;
        }
        if ((i2 & 2) != 0) {
            d = cloudWakeupBean.confidence;
        }
        double d2 = d;
        if ((i2 & 4) != 0) {
            i = cloudWakeupBean.errorCode;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = cloudWakeupBean.type;
        }
        String str3 = str2;
        if ((i2 & 16) != 0) {
            j2 = cloudWakeupBean.time;
        }
        return cloudWakeupBean.copy(str, d2, i3, str3, j2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getConfidence() {
        return this.confidence;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final CloudWakeupBean copy(@Nullable String state, double confidence, int errorCode, @Nullable String type, long time) {
        return new CloudWakeupBean(state, confidence, errorCode, type, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudWakeupBean)) {
            return false;
        }
        CloudWakeupBean cloudWakeupBean = (CloudWakeupBean) other;
        return Intrinsics.areEqual(this.state, cloudWakeupBean.state) && Intrinsics.areEqual((Object) Double.valueOf(this.confidence), (Object) Double.valueOf(cloudWakeupBean.confidence)) && this.errorCode == cloudWakeupBean.errorCode && Intrinsics.areEqual(this.type, cloudWakeupBean.type) && this.time == cloudWakeupBean.time;
    }

    public final double getConfidence() {
        return this.confidence;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.state;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Double.hashCode(this.confidence)) * 31) + Integer.hashCode(this.errorCode)) * 31;
        String str2 = this.type;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.time);
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    @NotNull
    public String toString() {
        return "CloudWakeupBean(state=" + ((Object) this.state) + ", confidence=" + this.confidence + ", errorCode=" + this.errorCode + ", type=" + ((Object) this.type) + ", time=" + this.time + ')';
    }
}
