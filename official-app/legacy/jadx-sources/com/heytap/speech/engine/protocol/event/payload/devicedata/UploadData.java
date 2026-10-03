package com.heytap.speech.engine.protocol.event.payload.devicedata;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.speech.engine.protocol.event.payload.customerData.Location;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\bJ\u0010KR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010;\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C\u0018\u00010A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/UploadData;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/CallLogData;", "callLogData", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/CallLogData;", "getCallLogData", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/CallLogData;", "setCallLogData", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/CallLogData;)V", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ScheduleData;", "scheduleData", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ScheduleData;", "getScheduleData", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ScheduleData;", "setScheduleData", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ScheduleData;)V", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AlarmData;", "alarmData", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AlarmData;", "getAlarmData", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AlarmData;", "setAlarmData", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AlarmData;)V", "Lcom/heytap/speech/engine/protocol/event/payload/customerData/Location;", "location", "Lcom/heytap/speech/engine/protocol/event/payload/customerData/Location;", "getLocation", "()Lcom/heytap/speech/engine/protocol/event/payload/customerData/Location;", "setLocation", "(Lcom/heytap/speech/engine/protocol/event/payload/customerData/Location;)V", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/UserPortrait;", "userPortrait", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/UserPortrait;", "getUserPortrait", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/UserPortrait;", "setUserPortrait", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/UserPortrait;)V", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ShortcutData;", "shortCutData", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ShortcutData;", "getShortCutData", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ShortcutData;", "setShortCutData", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/ShortcutData;)V", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchData;", "aiSearchData", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchData;", "getAiSearchData", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchData;", "setAiSearchData", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/AiSearchData;)V", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowInfoData;", "windowInfoData", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowInfoData;", "getWindowInfoData", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowInfoData;", "setWindowInfoData", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/WindowInfoData;)V", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TourismData;", "tourismData", "Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TourismData;", "getTourismData", "()Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TourismData;", "setTourismData", "(Lcom/heytap/speech/engine/protocol/event/payload/devicedata/TourismData;)V", "Ljava/util/HashMap;", "", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class UploadData extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.5";

    @Nullable
    private AiSearchData aiSearchData;

    @Nullable
    private AlarmData alarmData;

    @Nullable
    private CallLogData callLogData;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Location location;

    @Nullable
    private ScheduleData scheduleData;

    @Nullable
    private ShortcutData shortCutData;

    @Nullable
    private TourismData tourismData;

    @Nullable
    private UserPortrait userPortrait;

    @Nullable
    private WindowInfoData windowInfoData;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.devicedata.UploadData$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/devicedata/UploadData$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return UploadData.VERSION;
        }
    }

    @Nullable
    public final AiSearchData getAiSearchData() {
        return this.aiSearchData;
    }

    @Nullable
    public final AlarmData getAlarmData() {
        return this.alarmData;
    }

    @Nullable
    public final CallLogData getCallLogData() {
        return this.callLogData;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Location getLocation() {
        return this.location;
    }

    @Nullable
    public final ScheduleData getScheduleData() {
        return this.scheduleData;
    }

    @Nullable
    public final ShortcutData getShortCutData() {
        return this.shortCutData;
    }

    @Nullable
    public final TourismData getTourismData() {
        return this.tourismData;
    }

    @Nullable
    public final UserPortrait getUserPortrait() {
        return this.userPortrait;
    }

    @Nullable
    public final WindowInfoData getWindowInfoData() {
        return this.windowInfoData;
    }

    public final void setAiSearchData(@Nullable AiSearchData aiSearchData) {
        this.aiSearchData = aiSearchData;
    }

    public final void setAlarmData(@Nullable AlarmData alarmData) {
        this.alarmData = alarmData;
    }

    public final void setCallLogData(@Nullable CallLogData callLogData) {
        this.callLogData = callLogData;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setLocation(@Nullable Location location) {
        this.location = location;
    }

    public final void setScheduleData(@Nullable ScheduleData scheduleData) {
        this.scheduleData = scheduleData;
    }

    public final void setShortCutData(@Nullable ShortcutData shortcutData) {
        this.shortCutData = shortcutData;
    }

    public final void setTourismData(@Nullable TourismData tourismData) {
        this.tourismData = tourismData;
    }

    public final void setUserPortrait(@Nullable UserPortrait userPortrait) {
        this.userPortrait = userPortrait;
    }

    public final void setWindowInfoData(@Nullable WindowInfoData windowInfoData) {
        this.windowInfoData = windowInfoData;
    }
}
