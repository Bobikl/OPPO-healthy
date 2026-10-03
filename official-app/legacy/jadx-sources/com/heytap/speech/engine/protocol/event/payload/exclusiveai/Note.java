package com.heytap.speech.engine.protocol.event.payload.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.oplus.aiunit.vision.f04;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/exclusiveai/Note;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "()V", "alarmTime", "", "getAlarmTime", "()Ljava/lang/String;", "setAlarmTime", "(Ljava/lang/String;)V", "createTime", "getCreateTime", "setCreateTime", f04.JSON_KEY_RKE_IS_ENCRYPT, "", "getEncrypt", "()Ljava/lang/Boolean;", "setEncrypt", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "noteId", "getNoteId", "setNoteId", "searchTypes", "Ljava/util/ArrayList;", "getSearchTypes", "()Ljava/util/ArrayList;", "setSearchTypes", "(Ljava/util/ArrayList;)V", "text", "getText", ClickApiEntity.SET_TEXT, "title", "getTitle", "setTitle", "updateTime", "getUpdateTime", "setUpdateTime", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Note extends Payload {

    @Nullable
    private String alarmTime;

    @Nullable
    private String createTime;

    @Nullable
    private Boolean encrypt;

    @Nullable
    private String noteId;

    @Nullable
    private ArrayList<String> searchTypes;

    @Nullable
    private String text;

    @Nullable
    private String title;

    @Nullable
    private String updateTime;

    @Nullable
    public final String getAlarmTime() {
        return this.alarmTime;
    }

    @Nullable
    public final String getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final Boolean getEncrypt() {
        return this.encrypt;
    }

    @Nullable
    public final String getNoteId() {
        return this.noteId;
    }

    @Nullable
    public final ArrayList<String> getSearchTypes() {
        return this.searchTypes;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final void setAlarmTime(@Nullable String str) {
        this.alarmTime = str;
    }

    public final void setCreateTime(@Nullable String str) {
        this.createTime = str;
    }

    public final void setEncrypt(@Nullable Boolean bool) {
        this.encrypt = bool;
    }

    public final void setNoteId(@Nullable String str) {
        this.noteId = str;
    }

    public final void setSearchTypes(@Nullable ArrayList<String> arrayList) {
        this.searchTypes = arrayList;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUpdateTime(@Nullable String str) {
        this.updateTime = str;
    }
}
