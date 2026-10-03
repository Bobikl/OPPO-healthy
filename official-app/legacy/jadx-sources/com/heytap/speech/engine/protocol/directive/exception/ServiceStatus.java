package com.heytap.speech.engine.protocol.directive.exception;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exception/ServiceStatus;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "success", "Ljava/lang/Boolean;", "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "", "code", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "", DBHealthReviewPlan.DESC, "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "retriable", "getRetriable", "setRetriable", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ServiceStatus extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Integer code;

    @Nullable
    private String desc;

    @Nullable
    private Boolean retriable;

    @Nullable
    private Boolean success;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.exception.ServiceStatus$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exception/ServiceStatus$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return ServiceStatus.VERSION;
        }
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final Boolean getRetriable() {
        return this.retriable;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setRetriable(@Nullable Boolean bool) {
        this.retriable = bool;
    }

    public final void setSuccess(@Nullable Boolean bool) {
        this.success = bool;
    }
}
