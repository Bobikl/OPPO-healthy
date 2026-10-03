package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ModifySchedule;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Ljava/util/ArrayList;", "", "ids", "Ljava/util/ArrayList;", "getIds", "()Ljava/util/ArrayList;", "setIds", "(Ljava/util/ArrayList;)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Schedule;", "schedules", "getSchedules", "setSchedules", "adjustSchedules", "getAdjustSchedules", "setAdjustSchedules", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ModifySchedule extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<Schedule> adjustSchedules;

    @Nullable
    private ArrayList<String> ids;

    @Nullable
    private ArrayList<Schedule> schedules;

    @Nullable
    private String type;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.exclusiveai.ModifySchedule$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ModifySchedule$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return ModifySchedule.VERSION;
        }
    }

    @Nullable
    public final ArrayList<Schedule> getAdjustSchedules() {
        return this.adjustSchedules;
    }

    @Nullable
    public final ArrayList<String> getIds() {
        return this.ids;
    }

    @Nullable
    public final ArrayList<Schedule> getSchedules() {
        return this.schedules;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setAdjustSchedules(@Nullable ArrayList<Schedule> arrayList) {
        this.adjustSchedules = arrayList;
    }

    public final void setIds(@Nullable ArrayList<String> arrayList) {
        this.ids = arrayList;
    }

    public final void setSchedules(@Nullable ArrayList<Schedule> arrayList) {
        this.schedules = arrayList;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
