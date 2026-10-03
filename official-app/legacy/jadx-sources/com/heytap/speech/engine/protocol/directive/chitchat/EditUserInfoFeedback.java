package com.heytap.speech.engine.protocol.directive.chitchat;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/chitchat/EditUserInfoFeedback;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "code", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "", DBHealthReviewPlan.DESC, "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "name", "getName", "setName", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class EditUserInfoFeedback extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("code")
    @Nullable
    private Integer code;

    @JsonProperty(DBHealthReviewPlan.DESC)
    @Nullable
    private String desc;

    @JsonProperty("name")
    @Nullable
    private String name;

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setCode(@Nullable Integer num) {
        this.code = num;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
