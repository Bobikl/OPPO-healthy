package com.heytap.speech.engine.protocol.directive.devicedata;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bK\u0010LR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109RB\u0010>\u001a\"\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u00010:j\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u0001`=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/GetData;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/devicedata/CallLogCondition;", "callLog", "Lcom/heytap/speech/engine/protocol/directive/devicedata/CallLogCondition;", "getCallLog", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/CallLogCondition;", "setCallLog", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/CallLogCondition;)V", "Lcom/heytap/speech/engine/protocol/directive/devicedata/LocationCondition;", "location", "Lcom/heytap/speech/engine/protocol/directive/devicedata/LocationCondition;", "getLocation", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/LocationCondition;", "setLocation", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/LocationCondition;)V", "Lcom/heytap/speech/engine/protocol/directive/devicedata/ShortcutCondition;", "shortcut", "Lcom/heytap/speech/engine/protocol/directive/devicedata/ShortcutCondition;", "getShortcut", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/ShortcutCondition;", "setShortcut", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/ShortcutCondition;)V", "Lcom/heytap/speech/engine/protocol/directive/devicedata/AlarmCondition;", NotificationCompat.CATEGORY_ALARM, "Lcom/heytap/speech/engine/protocol/directive/devicedata/AlarmCondition;", "getAlarm", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/AlarmCondition;", "setAlarm", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/AlarmCondition;)V", "Lcom/heytap/speech/engine/protocol/directive/devicedata/ScheduleCondition;", "schedule", "Lcom/heytap/speech/engine/protocol/directive/devicedata/ScheduleCondition;", "getSchedule", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/ScheduleCondition;", "setSchedule", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/ScheduleCondition;)V", "Lcom/heytap/speech/engine/protocol/directive/devicedata/UserPortraitCondition;", "userPortrait", "Lcom/heytap/speech/engine/protocol/directive/devicedata/UserPortraitCondition;", "getUserPortrait", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/UserPortraitCondition;", "setUserPortrait", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/UserPortraitCondition;)V", "Lcom/heytap/speech/engine/protocol/directive/devicedata/AiSearchCondition;", "aiSearch", "Lcom/heytap/speech/engine/protocol/directive/devicedata/AiSearchCondition;", "getAiSearch", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/AiSearchCondition;", "setAiSearch", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/AiSearchCondition;)V", "Lcom/heytap/speech/engine/protocol/directive/devicedata/WindowInfoCondition;", "windowInfo", "Lcom/heytap/speech/engine/protocol/directive/devicedata/WindowInfoCondition;", "getWindowInfo", "()Lcom/heytap/speech/engine/protocol/directive/devicedata/WindowInfoCondition;", "setWindowInfo", "(Lcom/heytap/speech/engine/protocol/directive/devicedata/WindowInfoCondition;)V", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "", "timeout", "Ljava/lang/Integer;", "getTimeout", "()Ljava/lang/Integer;", "setTimeout", "(Ljava/lang/Integer;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class GetData extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.6";

    @Nullable
    private AiSearchCondition aiSearch;

    @Nullable
    private AlarmCondition alarm;

    @Nullable
    private CallLogCondition callLog;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private LocationCondition location;

    @Nullable
    private ScheduleCondition schedule;

    @Nullable
    private ShortcutCondition shortcut;

    @Nullable
    private Integer timeout;

    @Nullable
    private UserPortraitCondition userPortrait;

    @Nullable
    private WindowInfoCondition windowInfo;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.devicedata.GetData$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/devicedata/GetData$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return GetData.VERSION;
        }
    }

    @Nullable
    public final AiSearchCondition getAiSearch() {
        return this.aiSearch;
    }

    @Nullable
    public final AlarmCondition getAlarm() {
        return this.alarm;
    }

    @Nullable
    public final CallLogCondition getCallLog() {
        return this.callLog;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final LocationCondition getLocation() {
        return this.location;
    }

    @Nullable
    public final ScheduleCondition getSchedule() {
        return this.schedule;
    }

    @Nullable
    public final ShortcutCondition getShortcut() {
        return this.shortcut;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final UserPortraitCondition getUserPortrait() {
        return this.userPortrait;
    }

    @Nullable
    public final WindowInfoCondition getWindowInfo() {
        return this.windowInfo;
    }

    public final void setAiSearch(@Nullable AiSearchCondition aiSearchCondition) {
        this.aiSearch = aiSearchCondition;
    }

    public final void setAlarm(@Nullable AlarmCondition alarmCondition) {
        this.alarm = alarmCondition;
    }

    public final void setCallLog(@Nullable CallLogCondition callLogCondition) {
        this.callLog = callLogCondition;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setLocation(@Nullable LocationCondition locationCondition) {
        this.location = locationCondition;
    }

    public final void setSchedule(@Nullable ScheduleCondition scheduleCondition) {
        this.schedule = scheduleCondition;
    }

    public final void setShortcut(@Nullable ShortcutCondition shortcutCondition) {
        this.shortcut = shortcutCondition;
    }

    public final void setTimeout(@Nullable Integer num) {
        this.timeout = num;
    }

    public final void setUserPortrait(@Nullable UserPortraitCondition userPortraitCondition) {
        this.userPortrait = userPortraitCondition;
    }

    public final void setWindowInfo(@Nullable WindowInfoCondition windowInfoCondition) {
        this.windowInfo = windowInfoCondition;
    }
}
