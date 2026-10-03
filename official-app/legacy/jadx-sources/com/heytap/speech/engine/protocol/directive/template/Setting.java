package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/Setting;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "settingType", "Ljava/lang/String;", "getSettingType", "()Ljava/lang/String;", "setSettingType", "(Ljava/lang/String;)V", "settingName", "getSettingName", "setSettingName", "", "settingValues", "Ljava/util/List;", "getSettingValues", "()Ljava/util/List;", "setSettingValues", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Setting extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("settingName")
    @Nullable
    private String settingName;

    @JsonProperty("settingType")
    @Nullable
    private String settingType;

    @JsonProperty("settingValues")
    @Nullable
    private List<String> settingValues;

    @Nullable
    public final String getSettingName() {
        return this.settingName;
    }

    @Nullable
    public final String getSettingType() {
        return this.settingType;
    }

    @Nullable
    public final List<String> getSettingValues() {
        return this.settingValues;
    }

    public final void setSettingName(@Nullable String str) {
        this.settingName = str;
    }

    public final void setSettingType(@Nullable String str) {
        this.settingType = str;
    }

    public final void setSettingValues(@Nullable List<String> list) {
        this.settingValues = list;
    }
}
