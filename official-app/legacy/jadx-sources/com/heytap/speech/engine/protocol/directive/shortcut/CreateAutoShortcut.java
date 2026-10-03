package com.heytap.speech.engine.protocol.directive.shortcut;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b/\u00100R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012RB\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\b¨\u00063"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/CreateAutoShortcut;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", DBHealthReviewPlan.DESC, "getDesc", "setDesc", "Ljava/util/ArrayList;", "triggerIcons", "Ljava/util/ArrayList;", "getTriggerIcons", "()Ljava/util/ArrayList;", "setTriggerIcons", "(Ljava/util/ArrayList;)V", "triggerGrayIcons", "getTriggerGrayIcons", "setTriggerGrayIcons", "taskIcons", "getTaskIcons", "setTaskIcons", "taskGrayIcons", "getTaskGrayIcons", "setTaskGrayIcons", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "params", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "", "paramComplete", "Ljava/lang/Boolean;", "getParamComplete", "()Ljava/lang/Boolean;", "setParamComplete", "(Ljava/lang/Boolean;)V", "reply", "getReply", "setReply", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CreateAutoShortcut extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String desc;

    @Nullable
    private String name;

    @Nullable
    private Boolean paramComplete;

    @Nullable
    private HashMap<String, Object> params;

    @Nullable
    private String reply;

    @Nullable
    private ArrayList<String> taskGrayIcons;

    @Nullable
    private ArrayList<String> taskIcons;

    @Nullable
    private ArrayList<String> triggerGrayIcons;

    @Nullable
    private ArrayList<String> triggerIcons;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.shortcut.CreateAutoShortcut$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/CreateAutoShortcut$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return CreateAutoShortcut.VERSION;
        }
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Boolean getParamComplete() {
        return this.paramComplete;
    }

    @Nullable
    public final HashMap<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final ArrayList<String> getTaskGrayIcons() {
        return this.taskGrayIcons;
    }

    @Nullable
    public final ArrayList<String> getTaskIcons() {
        return this.taskIcons;
    }

    @Nullable
    public final ArrayList<String> getTriggerGrayIcons() {
        return this.triggerGrayIcons;
    }

    @Nullable
    public final ArrayList<String> getTriggerIcons() {
        return this.triggerIcons;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setParamComplete(@Nullable Boolean bool) {
        this.paramComplete = bool;
    }

    public final void setParams(@Nullable HashMap<String, Object> map) {
        this.params = map;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setTaskGrayIcons(@Nullable ArrayList<String> arrayList) {
        this.taskGrayIcons = arrayList;
    }

    public final void setTaskIcons(@Nullable ArrayList<String> arrayList) {
        this.taskIcons = arrayList;
    }

    public final void setTriggerGrayIcons(@Nullable ArrayList<String> arrayList) {
        this.triggerGrayIcons = arrayList;
    }

    public final void setTriggerIcons(@Nullable ArrayList<String> arrayList) {
        this.triggerIcons = arrayList;
    }
}
