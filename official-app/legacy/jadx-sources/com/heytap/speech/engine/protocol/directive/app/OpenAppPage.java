package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bA\u0010BR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0004\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR$\u00104\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R*\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0014\u001a\u0004\b9\u0010\u0016\"\u0004\b:\u0010\u0018R*\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u0016\"\u0004\b=\u0010\u0018R$\u0010>\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010,\u001a\u0004\b?\u0010.\"\u0004\b@\u00100¨\u0006E"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/OpenAppPage;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "appName", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", "actionName", "getActionName", "setActionName", "reply", "getReply", "setReply", "", "categoryList", "Ljava/util/List;", "getCategoryList", "()Ljava/util/List;", "setCategoryList", "(Ljava/util/List;)V", "", "", "extra", "Ljava/util/Map;", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "className", "getClassName", "setClassName", "type", "getType", "setType", "bundle", "getBundle", "setBundle", "", "forceTurnOut", "Ljava/lang/Boolean;", "getForceTurnOut", "()Ljava/lang/Boolean;", "setForceTurnOut", "(Ljava/lang/Boolean;)V", "lowVersionTts", "getLowVersionTts", "setLowVersionTts", "checkTargetVersion", "getCheckTargetVersion", "setCheckTargetVersion", "Lcom/heytap/speech/engine/protocol/directive/app/AppVersionMetaData;", "appVersionMetaData", "getAppVersionMetaData", "setAppVersionMetaData", "appSupportConfig", "getAppSupportConfig", "setAppSupportConfig", "disableClientReply", "getDisableClientReply", "setDisableClientReply", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OpenAppPage extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.3";

    @Nullable
    private String actionName;

    @Nullable
    private String appName;

    @Nullable
    private List<String> appSupportConfig;

    @Nullable
    private List<AppVersionMetaData> appVersionMetaData;

    @Nullable
    private String bundle;

    @Nullable
    private List<String> categoryList;

    @Nullable
    private Boolean checkTargetVersion;

    @Nullable
    private String className;

    @Nullable
    private Boolean disableClientReply;

    @Nullable
    private Map<String, ? extends Object> extra;

    @Nullable
    private Boolean forceTurnOut;

    @Nullable
    private String lowVersionTts;

    @Nullable
    private String packageName;

    @Nullable
    private String reply;

    @Nullable
    private String type;

    @Nullable
    public final String getActionName() {
        return this.actionName;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final List<String> getAppSupportConfig() {
        return this.appSupportConfig;
    }

    @Nullable
    public final List<AppVersionMetaData> getAppVersionMetaData() {
        return this.appVersionMetaData;
    }

    @Nullable
    public final String getBundle() {
        return this.bundle;
    }

    @Nullable
    public final List<String> getCategoryList() {
        return this.categoryList;
    }

    @Nullable
    public final Boolean getCheckTargetVersion() {
        return this.checkTargetVersion;
    }

    @Nullable
    public final String getClassName() {
        return this.className;
    }

    @Nullable
    public final Boolean getDisableClientReply() {
        return this.disableClientReply;
    }

    @Nullable
    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    @Nullable
    public final Boolean getForceTurnOut() {
        return this.forceTurnOut;
    }

    @Nullable
    public final String getLowVersionTts() {
        return this.lowVersionTts;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setActionName(@Nullable String str) {
        this.actionName = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAppSupportConfig(@Nullable List<String> list) {
        this.appSupportConfig = list;
    }

    public final void setAppVersionMetaData(@Nullable List<AppVersionMetaData> list) {
        this.appVersionMetaData = list;
    }

    public final void setBundle(@Nullable String str) {
        this.bundle = str;
    }

    public final void setCategoryList(@Nullable List<String> list) {
        this.categoryList = list;
    }

    public final void setCheckTargetVersion(@Nullable Boolean bool) {
        this.checkTargetVersion = bool;
    }

    public final void setClassName(@Nullable String str) {
        this.className = str;
    }

    public final void setDisableClientReply(@Nullable Boolean bool) {
        this.disableClientReply = bool;
    }

    public final void setExtra(@Nullable Map<String, ? extends Object> map) {
        this.extra = map;
    }

    public final void setForceTurnOut(@Nullable Boolean bool) {
        this.forceTurnOut = bool;
    }

    public final void setLowVersionTts(@Nullable String str) {
        this.lowVersionTts = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
