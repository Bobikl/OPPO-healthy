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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u0016\u0010\fR$\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0019\u0010\fR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\b\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\fR$\u0010/\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\b\u001a\u0004\b\u0007\u0010\n\"\u0004\b.\u0010\fR0\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00101\u001a\u0004\b\u001c\u00102\"\u0004\b3\u00104R$\u00107\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\b\u001a\u0004\b\u0018\u0010\n\"\u0004\b6\u0010\fR\"\u0010<\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00108\u001a\u0004\b$\u00109\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/oplus/aiunit/vision/da4;", "", "", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/ca4;", "y", "", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "sessionId", "b", b2n.g, "u", SpeechConstant.KEY_RECORD_ID, "c", LogFieldKey.PROCESS_NAME_KEY, "currentRecordId", "d", "o", "conversationId", MapSchema.FIELD_NAME_ENTRY, "q", ShowDialogExecutor.JSON_DIALOG_ID_KEY, "", "f", "Z", LogFieldKey.LEVEL_KEY, "()Z", "s", "(Z)V", "isMultiConversation", "", b2n.f, "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "v", "(Ljava/lang/Integer;)V", "sequenceId", MapSchema.FIELD_NAME_KEY, "x", "wakeupWord", "n", "aiType", "", "Ljava/util/Map;", "()Ljava/util/Map;", "r", "(Ljava/util/Map;)V", "liveData", "setLastInterruptSessionID", "lastInterruptSessionID", "I", "()I", "t", "(I)V", "oneshotState", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class da4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static String recordId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String currentRecordId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String conversationId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static String dialogId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public static boolean isMultiConversation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static Integer sequenceId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public static String wakeupWord;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public static String aiType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static Map<String, ? extends Object> liveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public static String lastInterruptSessionID;

    @NotNull
    public static final da4 INSTANCE = new da4();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static volatile int oneshotState = -1;

    @Nullable
    public final String a() {
        return aiType;
    }

    @Nullable
    public final String b() {
        return conversationId;
    }

    @Nullable
    public final String c() {
        return currentRecordId;
    }

    @Nullable
    public final String d() {
        return dialogId;
    }

    @Nullable
    public final String e() {
        return lastInterruptSessionID;
    }

    @Nullable
    public final Map<String, Object> f() {
        return liveData;
    }

    public final int g() {
        return oneshotState;
    }

    @Nullable
    public final String h() {
        return recordId;
    }

    @Nullable
    public final Integer i() {
        return sequenceId;
    }

    @Nullable
    public final String j() {
        return sessionId;
    }

    @Nullable
    public final String k() {
        return wakeupWord;
    }

    public final boolean l() {
        return isMultiConversation;
    }

    public final void m() {
        aiType = "";
        wakeupWord = "";
        lastInterruptSessionID = "";
        oneshotState = -1;
        sessionId = "";
        recordId = "";
        currentRecordId = "";
        conversationId = "";
        dialogId = "";
        isMultiConversation = false;
        sequenceId = null;
    }

    public final void n(@Nullable String str) {
        aiType = str;
    }

    public final void o(@Nullable String str) {
        conversationId = str;
    }

    public final void p(@Nullable String str) {
        currentRecordId = str;
    }

    public final void q(@Nullable String str) {
        dialogId = str;
    }

    public final void r(@Nullable Map<String, ? extends Object> map) {
        liveData = map;
    }

    public final void s(boolean z) {
        isMultiConversation = z;
    }

    public final void t(int i) {
        oneshotState = i;
    }

    public final void u(@Nullable String str) {
        recordId = str;
    }

    public final void v(@Nullable Integer num) {
        sequenceId = num;
    }

    public final void w(@Nullable String str) {
        sessionId = str;
    }

    public final void x(@Nullable String str) {
        wakeupWord = str;
    }

    @NotNull
    public final ConversationInfo y() {
        ConversationInfo conversationInfo = new ConversationInfo(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        conversationInfo.k(recordId);
        conversationInfo.h(currentRecordId);
        conversationInfo.n(sessionId);
        conversationInfo.g(conversationId);
        conversationInfo.i(dialogId);
        conversationInfo.m(sequenceId);
        return conversationInfo;
    }
}
