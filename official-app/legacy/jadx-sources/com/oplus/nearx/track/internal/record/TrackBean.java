package com.oplus.nearx.track.internal.record;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.wvg;
import com.oplus.nearx.track.internal.common.DataType;
import com.oplus.nearx.track.internal.common.EventNetType;
import com.oplus.nearx.track.internal.common.UploadType;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import com.oplus.nearx.track.internal.utils.NetworkUtil;
import io.protostuff.MapSchema;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bF\b\u0081\b\u0018\u0000 U2\u00020\u0001:\u0001VB£\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\u0011\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\b\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\b¢\u0006\u0004\bS\u0010TJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J©\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\bHÆ\u0001J\t\u0010(\u001a\u00020\u0002HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001J\u0013\u0010+\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u00100\u001a\u0004\b1\u00102R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00105R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b7\u00108R\"\u0010\u001c\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b>\u0010.R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b?\u0010.R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b@\u0010.R\"\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00100\u001a\u0004\bA\u00102\"\u0004\bB\u0010CR\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00106\u001a\u0004\bD\u00108\"\u0004\bE\u0010FR\"\u0010\"\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010G\u001a\u0004\b\"\u0010H\"\u0004\bI\u0010JR\"\u0010#\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00106\u001a\u0004\bK\u00108\"\u0004\bL\u0010FR\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u00106\u001a\u0004\bM\u00108\"\u0004\bN\u0010FR\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010,\u001a\u0004\bO\u0010.\"\u0004\bP\u00105R\"\u0010&\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00106\u001a\u0004\bQ\u00108\"\u0004\bR\u0010F¨\u0006W"}, d2 = {"Lcom/oplus/nearx/track/internal/record/TrackBean;", "", "", "component1", "component2", "", "component3", "component4", "", "component5", "Lcom/oplus/nearx/track/internal/common/EventNetType;", "component6", "component7", "component8", "component9", "component10", "component11", "", "component12", "component13", "component14", "component15", "component16", "event_group", of5.ARG_EVENT_ID, "event_time", "event_info", "event_time_type", "event_net_type", "event_access", "session_id", "sequence_id", "head_switch", "track_type", "is_realtime", "upload_type", "data_type", "event_sample_intervals", "event_cache_status", "copy", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getEvent_group", "()Ljava/lang/String;", "getEvent_id", "J", "getEvent_time", "()J", "getEvent_info", "setEvent_info", "(Ljava/lang/String;)V", "I", "getEvent_time_type", "()I", "Lcom/oplus/nearx/track/internal/common/EventNetType;", "getEvent_net_type", "()Lcom/oplus/nearx/track/internal/common/EventNetType;", "setEvent_net_type", "(Lcom/oplus/nearx/track/internal/common/EventNetType;)V", "getEvent_access", "getSession_id", "getSequence_id", "getHead_switch", "setHead_switch", "(J)V", "getTrack_type", "setTrack_type", "(I)V", "Z", "()Z", "set_realtime", "(Z)V", "getUpload_type", "setUpload_type", "getData_type", "setData_type", "getEvent_sample_intervals", "setEvent_sample_intervals", "getEvent_cache_status", "setEvent_cache_status", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILcom/oplus/nearx/track/internal/common/EventNetType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIZIILjava/lang/String;I)V", "Companion", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TrackBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private int data_type;

    @NotNull
    private final String event_access;
    private int event_cache_status;

    @NotNull
    private final String event_group;

    @NotNull
    private final String event_id;

    @NotNull
    private String event_info;

    @NotNull
    private EventNetType event_net_type;

    @NotNull
    private String event_sample_intervals;
    private final long event_time;
    private final int event_time_type;
    private long head_switch;
    private boolean is_realtime;

    @NotNull
    private final String sequence_id;

    @NotNull
    private final String session_id;
    private int track_type;
    private int upload_type;

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.record.TrackBean$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0006H\u0002¨\u0006\u0010"}, d2 = {"Lcom/oplus/nearx/track/internal/record/TrackBean$a;", "", "Lcom/oplus/nearx/track/internal/record/TrackBean;", "data", "Lorg/json/JSONObject;", MapSchema.FIELD_NAME_ENTRY, "", "jsonString", "a", "d", "name", "b", TypedValues.Custom.S_STRING, "c", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TrackBean a(@NotNull String jsonString) {
            Object objM5287constructorimpl;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            try {
                Result.Companion companion = Result.INSTANCE;
                JSONObject jSONObject = new JSONObject(jsonString);
                Companion companion2 = TrackBean.INSTANCE;
                String strOptString = jSONObject.optString(companion2.b("event_group"));
                Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObj.optString(getJso…kBean::event_group.name))");
                String strOptString2 = jSONObject.optString(companion2.b(of5.ARG_EVENT_ID));
                Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObj.optString(getJso…rackBean::event_id.name))");
                long jOptLong = jSONObject.optLong(companion2.b("event_time"));
                String string = jSONObject.optJSONObject(companion2.b("event_info")).toString();
                Intrinsics.checkNotNullExpressionValue(string, "jsonObj.optJSONObject(ge…nt_info.name)).toString()");
                String strOptString3 = jSONObject.optString(companion2.b("session_id"));
                Intrinsics.checkNotNullExpressionValue(strOptString3, "jsonObj.optString(getJso…ckBean::session_id.name))");
                String strOptString4 = jSONObject.optString(companion2.b("sequence_id"));
                Intrinsics.checkNotNullExpressionValue(strOptString4, "jsonObj.optString(getJso…kBean::sequence_id.name))");
                objM5287constructorimpl = Result.m5287constructorimpl(new TrackBean(strOptString, strOptString2, jOptLong, string, jSONObject.optInt(companion2.b("event_time_type")), null, null, strOptString3, strOptString4, jSONObject.optLong("head_switch"), jSONObject.optInt("track_type"), false, jSONObject.optInt("upload_type"), jSONObject.optInt("data_type"), null, 0, 51296, null));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
                objM5287constructorimpl = null;
            }
            return (TrackBean) objM5287constructorimpl;
        }

        @NotNull
        public final String b(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return Typography.dollar + name;
        }

        public final Object c(String string) {
            Object objM5287constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(new JSONObject(string));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            return Result.m5293isFailureimpl(objM5287constructorimpl) ? string : objM5287constructorimpl;
        }

        @NotNull
        public final JSONObject d(@NotNull TrackBean data) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            JSONObject jSONObject = new JSONObject();
            Companion companion = TrackBean.INSTANCE;
            jSONObject.put(companion.b("event_group"), data.getEvent_group());
            jSONObject.put(companion.b(of5.ARG_EVENT_ID), data.getEvent_id());
            jSONObject.put(companion.b("event_time"), data.getEvent_time());
            jSONObject.put(companion.b("event_time_type"), data.getEvent_time_type());
            jSONObject.put(companion.b("session_id"), data.getSession_id());
            jSONObject.put(companion.b("sequence_id"), data.getSequence_id());
            jSONObject.put(companion.b("event_info"), companion.c(data.getEvent_info()));
            jSONObject.put("head_switch", data.getHead_switch());
            return jSONObject;
        }

        @NotNull
        public final JSONObject e(@NotNull TrackBean data) throws JSONException {
            Intrinsics.checkNotNullParameter(data, "data");
            JSONObject jSONObjectD = d(data);
            jSONObjectD.put("head_switch", data.getHead_switch());
            jSONObjectD.put("track_type", data.getTrack_type());
            jSONObjectD.put("upload_type", data.getUpload_type());
            jSONObjectD.put("data_type", data.getData_type());
            return jSONObjectD;
        }
    }

    public TrackBean(@NotNull String event_group, @NotNull String event_id, long j2, @NotNull String event_info, int i, @NotNull EventNetType event_net_type, @NotNull String event_access, @NotNull String session_id, @NotNull String sequence_id, long j3, int i2, boolean z, int i3, int i4, @NotNull String event_sample_intervals, int i5) {
        Intrinsics.checkNotNullParameter(event_group, "event_group");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(event_info, "event_info");
        Intrinsics.checkNotNullParameter(event_net_type, "event_net_type");
        Intrinsics.checkNotNullParameter(event_access, "event_access");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(sequence_id, "sequence_id");
        Intrinsics.checkNotNullParameter(event_sample_intervals, "event_sample_intervals");
        this.event_group = event_group;
        this.event_id = event_id;
        this.event_time = j2;
        this.event_info = event_info;
        this.event_time_type = i;
        this.event_net_type = event_net_type;
        this.event_access = event_access;
        this.session_id = session_id;
        this.sequence_id = sequence_id;
        this.head_switch = j3;
        this.track_type = i2;
        this.is_realtime = z;
        this.upload_type = i3;
        this.data_type = i4;
        this.event_sample_intervals = event_sample_intervals;
        this.event_cache_status = i5;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEvent_group() {
        return this.event_group;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getHead_switch() {
        return this.head_switch;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTrack_type() {
        return this.track_type;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIs_realtime() {
        return this.is_realtime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getUpload_type() {
        return this.upload_type;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getData_type() {
        return this.data_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getEvent_sample_intervals() {
        return this.event_sample_intervals;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getEvent_cache_status() {
        return this.event_cache_status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEvent_id() {
        return this.event_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEvent_time() {
        return this.event_time;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEvent_info() {
        return this.event_info;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getEvent_time_type() {
        return this.event_time_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EventNetType getEvent_net_type() {
        return this.event_net_type;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEvent_access() {
        return this.event_access;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSession_id() {
        return this.session_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSequence_id() {
        return this.sequence_id;
    }

    @NotNull
    public final TrackBean copy(@NotNull String event_group, @NotNull String event_id, long event_time, @NotNull String event_info, int event_time_type, @NotNull EventNetType event_net_type, @NotNull String event_access, @NotNull String session_id, @NotNull String sequence_id, long head_switch, int track_type, boolean is_realtime, int upload_type, int data_type, @NotNull String event_sample_intervals, int event_cache_status) {
        Intrinsics.checkNotNullParameter(event_group, "event_group");
        Intrinsics.checkNotNullParameter(event_id, "event_id");
        Intrinsics.checkNotNullParameter(event_info, "event_info");
        Intrinsics.checkNotNullParameter(event_net_type, "event_net_type");
        Intrinsics.checkNotNullParameter(event_access, "event_access");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(sequence_id, "sequence_id");
        Intrinsics.checkNotNullParameter(event_sample_intervals, "event_sample_intervals");
        return new TrackBean(event_group, event_id, event_time, event_info, event_time_type, event_net_type, event_access, session_id, sequence_id, head_switch, track_type, is_realtime, upload_type, data_type, event_sample_intervals, event_cache_status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackBean)) {
            return false;
        }
        TrackBean trackBean = (TrackBean) other;
        return Intrinsics.areEqual(this.event_group, trackBean.event_group) && Intrinsics.areEqual(this.event_id, trackBean.event_id) && this.event_time == trackBean.event_time && Intrinsics.areEqual(this.event_info, trackBean.event_info) && this.event_time_type == trackBean.event_time_type && this.event_net_type == trackBean.event_net_type && Intrinsics.areEqual(this.event_access, trackBean.event_access) && Intrinsics.areEqual(this.session_id, trackBean.session_id) && Intrinsics.areEqual(this.sequence_id, trackBean.sequence_id) && this.head_switch == trackBean.head_switch && this.track_type == trackBean.track_type && this.is_realtime == trackBean.is_realtime && this.upload_type == trackBean.upload_type && this.data_type == trackBean.data_type && Intrinsics.areEqual(this.event_sample_intervals, trackBean.event_sample_intervals) && this.event_cache_status == trackBean.event_cache_status;
    }

    public final int getData_type() {
        return this.data_type;
    }

    @NotNull
    public final String getEvent_access() {
        return this.event_access;
    }

    public final int getEvent_cache_status() {
        return this.event_cache_status;
    }

    @NotNull
    public final String getEvent_group() {
        return this.event_group;
    }

    @NotNull
    public final String getEvent_id() {
        return this.event_id;
    }

    @NotNull
    public final String getEvent_info() {
        return this.event_info;
    }

    @NotNull
    public final EventNetType getEvent_net_type() {
        return this.event_net_type;
    }

    @NotNull
    public final String getEvent_sample_intervals() {
        return this.event_sample_intervals;
    }

    public final long getEvent_time() {
        return this.event_time;
    }

    public final int getEvent_time_type() {
        return this.event_time_type;
    }

    public final long getHead_switch() {
        return this.head_switch;
    }

    @NotNull
    public final String getSequence_id() {
        return this.sequence_id;
    }

    @NotNull
    public final String getSession_id() {
        return this.session_id;
    }

    public final int getTrack_type() {
        return this.track_type;
    }

    public final int getUpload_type() {
        return this.upload_type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.event_group.hashCode() * 31) + this.event_id.hashCode()) * 31) + Long.hashCode(this.event_time)) * 31) + this.event_info.hashCode()) * 31) + Integer.hashCode(this.event_time_type)) * 31) + this.event_net_type.hashCode()) * 31) + this.event_access.hashCode()) * 31) + this.session_id.hashCode()) * 31) + this.sequence_id.hashCode()) * 31) + Long.hashCode(this.head_switch)) * 31) + Integer.hashCode(this.track_type)) * 31;
        boolean z = this.is_realtime;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + Integer.hashCode(this.upload_type)) * 31) + Integer.hashCode(this.data_type)) * 31) + this.event_sample_intervals.hashCode()) * 31) + Integer.hashCode(this.event_cache_status);
    }

    public final boolean is_realtime() {
        return this.is_realtime;
    }

    public final void setData_type(int i) {
        this.data_type = i;
    }

    public final void setEvent_cache_status(int i) {
        this.event_cache_status = i;
    }

    public final void setEvent_info(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event_info = str;
    }

    public final void setEvent_net_type(@NotNull EventNetType eventNetType) {
        Intrinsics.checkNotNullParameter(eventNetType, "<set-?>");
        this.event_net_type = eventNetType;
    }

    public final void setEvent_sample_intervals(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.event_sample_intervals = str;
    }

    public final void setHead_switch(long j2) {
        this.head_switch = j2;
    }

    public final void setTrack_type(int i) {
        this.track_type = i;
    }

    public final void setUpload_type(int i) {
        this.upload_type = i;
    }

    public final void set_realtime(boolean z) {
        this.is_realtime = z;
    }

    @NotNull
    public String toString() {
        return "TrackBean(event_group=" + this.event_group + ", event_id=" + this.event_id + ", event_time=" + this.event_time + ", event_info=" + this.event_info + ", event_time_type=" + this.event_time_type + ", event_net_type=" + this.event_net_type + ", event_access=" + this.event_access + ", session_id=" + this.session_id + ", sequence_id=" + this.sequence_id + ", head_switch=" + this.head_switch + ", track_type=" + this.track_type + ", is_realtime=" + this.is_realtime + ", upload_type=" + this.upload_type + ", data_type=" + this.data_type + ", event_sample_intervals=" + this.event_sample_intervals + ", event_cache_status=" + this.event_cache_status + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TrackBean(String str, String str2, long j2, String str3, int i, EventNetType eventNetType, String str4, String str5, String str6, long j3, int i2, boolean z, int i3, int i4, String str7, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        long j4 = (i6 & 4) != 0 ? 0L : j2;
        String str9 = (i6 & 8) != 0 ? "" : str3;
        int i7 = (i6 & 16) != 0 ? 0 : i;
        EventNetType eventNetType2 = (i6 & 32) != 0 ? EventNetType.NET_TYPE_ALL_NET : eventNetType;
        String strD = (i6 & 64) != 0 ? NetworkUtil.INSTANCE.d(GlobalConfigHelper.INSTANCE.c()) : str4;
        String strA = (i6 & 128) != 0 ? wvg.INSTANCE.a() : str5;
        if ((i6 & 256) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            str8 = string;
        } else {
            str8 = str6;
        }
        this(str, str2, j4, str9, i7, eventNetType2, strD, strA, str8, (i6 & 512) != 0 ? 0L : j3, (i6 & 1024) != 0 ? 1 : i2, (i6 & 2048) != 0 ? true : z, (i6 & 4096) != 0 ? UploadType.REALTIME.getUploadType() : i3, (i6 & 8192) != 0 ? DataType.BIZ.getDataType() : i4, (i6 & 16384) != 0 ? EventRuleEntity.DEFAULT_SAMPLING_INTERVAL : str7, (i6 & 32768) != 0 ? 0 : i5);
    }
}
