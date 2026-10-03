package com.heytap.speech.engine.protocol.directive.alerts;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b,\u0010-R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmOperation;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "overallType", "Ljava/lang/Integer;", "getOverallType", "()Ljava/lang/Integer;", "setOverallType", "(Ljava/lang/Integer;)V", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "alarmState", "getAlarmState", "setAlarmState", "alarmName", "getAlarmName", "setAlarmName", "startTime", "getStartTime", "setStartTime", "endTime", "getEndTime", "setEndTime", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmFusion;", "fusionList", "Ljava/util/ArrayList;", "getFusionList", "()Ljava/util/ArrayList;", "setFusionList", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "", "recommendExtend", "Ljava/util/HashMap;", "getRecommendExtend", "()Ljava/util/HashMap;", "setRecommendExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AlarmOperation extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String alarmName;

    @Nullable
    private String alarmState;

    @Nullable
    private String endTime;

    @Nullable
    private ArrayList<AlarmFusion> fusionList;

    @Nullable
    private Integer overallType;

    @Nullable
    private HashMap<String, Object> recommendExtend;

    @Nullable
    private String reply;

    @Nullable
    private String startTime;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.alerts.AlarmOperation$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/alerts/AlarmOperation$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return AlarmOperation.VERSION;
        }
    }

    @Nullable
    public final String getAlarmName() {
        return this.alarmName;
    }

    @Nullable
    public final String getAlarmState() {
        return this.alarmState;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final ArrayList<AlarmFusion> getFusionList() {
        return this.fusionList;
    }

    @Nullable
    public final Integer getOverallType() {
        return this.overallType;
    }

    @Nullable
    public final HashMap<String, Object> getRecommendExtend() {
        return this.recommendExtend;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    public final void setAlarmName(@Nullable String str) {
        this.alarmName = str;
    }

    public final void setAlarmState(@Nullable String str) {
        this.alarmState = str;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setFusionList(@Nullable ArrayList<AlarmFusion> arrayList) {
        this.fusionList = arrayList;
    }

    public final void setOverallType(@Nullable Integer num) {
        this.overallType = num;
    }

    public final void setRecommendExtend(@Nullable HashMap<String, Object> map) {
        this.recommendExtend = map;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }
}
