package com.heytap.speech.engine.protocol.directive.system;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/system/SettingsSearch;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "settingName", "Ljava/lang/String;", "getSettingName", "()Ljava/lang/String;", "setSettingName", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/system/SearchItem;", "Lkotlin/collections/ArrayList;", "items", "Ljava/util/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "reply", "getReply", "setReply", "", "index", "Ljava/lang/Integer;", "getIndex", "()Ljava/lang/Integer;", "setIndex", "(Ljava/lang/Integer;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SettingsSearch extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Integer index;

    @Nullable
    private ArrayList<SearchItem> items;

    @Nullable
    private String reply;

    @Nullable
    private String settingName;

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final ArrayList<SearchItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getSettingName() {
        return this.settingName;
    }

    public final void setIndex(@Nullable Integer num) {
        this.index = num;
    }

    public final void setItems(@Nullable ArrayList<SearchItem> arrayList) {
        this.items = arrayList;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSettingName(@Nullable String str) {
        this.settingName = str;
    }
}
