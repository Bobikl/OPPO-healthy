package com.oplus.aiunit.vision;

import androidx.core.app.FrameMetricsAggregator;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import io.protostuff.MapSchema;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ca4, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010%\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010'¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR$\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\"\u001a\u0004\b\u0019\u0010#\"\u0004\b$\u0010%R0\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/ca4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", MapSchema.FIELD_NAME_KEY, "(Ljava/lang/String;)V", SpeechConstant.KEY_RECORD_ID, "b", b2n.g, "currentRecordId", "c", "f", "n", "sessionId", b2n.f, "conversationId", MapSchema.FIELD_NAME_ENTRY, "i", ShowDialogExecutor.JSON_DIALOG_ID_KEY, "getRoomId", LogFieldKey.LEVEL_KEY, "roomId", "getUniqueId", "o", "uniqueId", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", LogFieldKey.MESSAGE_KEY, "(Ljava/lang/Integer;)V", "sequenceId", "", "Ljava/util/Map;", "getExtend", "()Ljava/util/Map;", "j", "(Ljava/util/Map;)V", "extend", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ConversationInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public String recordId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public String currentRecordId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String sessionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public String conversationId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String dialogId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public String roomId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public String uniqueId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer sequenceId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public Map<String, String> extend;

    public ConversationInfo() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrentRecordId() {
        return this.currentRecordId;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDialogId() {
        return this.dialogId;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getSequenceId() {
        return this.sequenceId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationInfo)) {
            return false;
        }
        ConversationInfo conversationInfo = (ConversationInfo) other;
        return Intrinsics.areEqual(this.recordId, conversationInfo.recordId) && Intrinsics.areEqual(this.currentRecordId, conversationInfo.currentRecordId) && Intrinsics.areEqual(this.sessionId, conversationInfo.sessionId) && Intrinsics.areEqual(this.conversationId, conversationInfo.conversationId) && Intrinsics.areEqual(this.dialogId, conversationInfo.dialogId) && Intrinsics.areEqual(this.roomId, conversationInfo.roomId) && Intrinsics.areEqual(this.uniqueId, conversationInfo.uniqueId) && Intrinsics.areEqual(this.sequenceId, conversationInfo.sequenceId) && Intrinsics.areEqual(this.extend, conversationInfo.extend);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final void g(@Nullable String str) {
        this.conversationId = str;
    }

    public final void h(@Nullable String str) {
        this.currentRecordId = str;
    }

    public int hashCode() {
        String str = this.recordId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currentRecordId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sessionId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.conversationId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dialogId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.roomId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.uniqueId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.sequenceId;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, String> map = this.extend;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    public final void i(@Nullable String str) {
        this.dialogId = str;
    }

    public final void j(@Nullable Map<String, String> map) {
        this.extend = map;
    }

    public final void k(@Nullable String str) {
        this.recordId = str;
    }

    public final void l(@Nullable String str) {
        this.roomId = str;
    }

    public final void m(@Nullable Integer num) {
        this.sequenceId = num;
    }

    public final void n(@Nullable String str) {
        this.sessionId = str;
    }

    public final void o(@Nullable String str) {
        this.uniqueId = str;
    }

    @NotNull
    public String toString() {
        return "ConversationInfo(recordId=" + ((Object) this.recordId) + ", currentRecordId=" + ((Object) this.currentRecordId) + ", sessionId=" + ((Object) this.sessionId) + ", conversationId=" + ((Object) this.conversationId) + ", dialogId=" + ((Object) this.dialogId) + ", roomId=" + ((Object) this.roomId) + ", uniqueId=" + ((Object) this.uniqueId) + ", sequenceId=" + this.sequenceId + ", extend=" + this.extend + ')';
    }

    public ConversationInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Integer num, @Nullable Map<String, String> map) {
        this.recordId = str;
        this.currentRecordId = str2;
        this.sessionId = str3;
        this.conversationId = str4;
        this.dialogId = str5;
        this.roomId = str6;
        this.uniqueId = str7;
        this.sequenceId = num;
        this.extend = map;
    }

    public /* synthetic */ ConversationInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : map);
    }
}
