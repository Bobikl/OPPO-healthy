package com.heytap.speech.engine.protocol.directive.note;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 42\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b2\u00103R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR*\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR$\u0010/\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b¨\u00067"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/note/CreateNote;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "content", "getContent", "setContent", ClickApiEntity.TIME, "getTime", "setTime", "title", "getTitle", "setTitle", "iconUrl", "getIconUrl", "setIconUrl", "reply", "getReply", "setReply", "noteTitle", "getNoteTitle", "setNoteTitle", "remark", "getRemark", "setRemark", "uiType", "getUiType", "setUiType", "contentType", "getContentType", "setContentType", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/note/CreateNote$HtmlContent;", "htmlContents", "Ljava/util/ArrayList;", "getHtmlContents", "()Ljava/util/ArrayList;", "setHtmlContents", "(Ljava/util/ArrayList;)V", "cardBackground", "getCardBackground", "setCardBackground", "notebookId", "getNotebookId", "setNotebookId", "<init>", "()V", "Companion", "a", "HtmlContent", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CreateNote extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.4";

    @Nullable
    private String cardBackground;

    @Nullable
    private String content;

    @Nullable
    private String contentType;

    @Nullable
    private ArrayList<HtmlContent> htmlContents;

    @Nullable
    private String iconUrl;

    @Nullable
    private String noteTitle;

    @Nullable
    private String notebookId;

    @Nullable
    private String remark;

    @Nullable
    private String reply;

    @Nullable
    private String time;

    @Nullable
    private String title;

    @Nullable
    private String type;

    @Nullable
    private String uiType;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/note/CreateNote$HtmlContent;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "logoUrl", "getLogoUrl", "setLogoUrl", "name", "getName", "setName", "packageName", "getPackageName", "setPackageName", "path", "getPath", "setPath", "type", "getType", "setType", "url", "getUrl", "setUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class HtmlContent extends DirectivePayload {

        @Nullable
        private String content;

        @Nullable
        private String logoUrl;

        @Nullable
        private String name;

        @Nullable
        private String packageName;

        @Nullable
        private String path;

        @Nullable
        private String type;

        @Nullable
        private String url;

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getLogoUrl() {
            return this.logoUrl;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getPackageName() {
            return this.packageName;
        }

        @Nullable
        public final String getPath() {
            return this.path;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setLogoUrl(@Nullable String str) {
            this.logoUrl = str;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setPackageName(@Nullable String str) {
            this.packageName = str;
        }

        public final void setPath(@Nullable String str) {
            this.path = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    @Nullable
    public final String getCardBackground() {
        return this.cardBackground;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final ArrayList<HtmlContent> getHtmlContents() {
        return this.htmlContents;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getNoteTitle() {
        return this.noteTitle;
    }

    @Nullable
    public final String getNotebookId() {
        return this.notebookId;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUiType() {
        return this.uiType;
    }

    public final void setCardBackground(@Nullable String str) {
        this.cardBackground = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setContentType(@Nullable String str) {
        this.contentType = str;
    }

    public final void setHtmlContents(@Nullable ArrayList<HtmlContent> arrayList) {
        this.htmlContents = arrayList;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setNoteTitle(@Nullable String str) {
        this.noteTitle = str;
    }

    public final void setNotebookId(@Nullable String str) {
        this.notebookId = str;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setTime(@Nullable String str) {
        this.time = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUiType(@Nullable String str) {
        this.uiType = str;
    }
}
