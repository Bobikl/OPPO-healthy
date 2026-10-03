package com.heytap.speech.engine.protocol.directive.aicall;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.heytap.speech.engine.protocol.directive.exclusiveai.Schedule;
import com.heytap.speech.engine.protocol.directive.navigation.NavigationSignpostCard;
import com.heytap.speech.engine.protocol.directive.note.CreateNote;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b+\u0010,R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aicall/HighlightEntity;", "", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;)V", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "beginIndex", "getBeginIndex", "setBeginIndex", "endIndex", "getEndIndex", "setEndIndex", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Schedule;", "schedule", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Schedule;", "getSchedule", "()Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Schedule;", "setSchedule", "(Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Schedule;)V", "Lcom/heytap/speech/engine/protocol/directive/note/CreateNote;", "note", "Lcom/heytap/speech/engine/protocol/directive/note/CreateNote;", "getNote", "()Lcom/heytap/speech/engine/protocol/directive/note/CreateNote;", "setNote", "(Lcom/heytap/speech/engine/protocol/directive/note/CreateNote;)V", "Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationSignpostCard;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationSignpostCard;", "getNavigation", "()Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationSignpostCard;", "setNavigation", "(Lcom/heytap/speech/engine/protocol/directive/navigation/NavigationSignpostCard;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class HighlightEntity {
    public static final int TYPE_DATE_TIME = 1;
    public static final int TYPE_LOCATION = 2;
    public static final int TYPE_NAME = 3;
    public static final int TYPE_PHONE_NUMBER = 4;

    @Nullable
    private Integer beginIndex;

    @Nullable
    private Integer endIndex;

    @Nullable
    private NavigationSignpostCard navigation;

    @Nullable
    private CreateNote note;

    @Nullable
    private Schedule schedule;

    @Nullable
    private String text;

    @Nullable
    private Integer type;

    @Nullable
    public final Integer getBeginIndex() {
        return this.beginIndex;
    }

    @Nullable
    public final Integer getEndIndex() {
        return this.endIndex;
    }

    @Nullable
    public final NavigationSignpostCard getNavigation() {
        return this.navigation;
    }

    @Nullable
    public final CreateNote getNote() {
        return this.note;
    }

    @Nullable
    public final Schedule getSchedule() {
        return this.schedule;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setBeginIndex(@Nullable Integer num) {
        this.beginIndex = num;
    }

    public final void setEndIndex(@Nullable Integer num) {
        this.endIndex = num;
    }

    public final void setNavigation(@Nullable NavigationSignpostCard navigationSignpostCard) {
        this.navigation = navigationSignpostCard;
    }

    public final void setNote(@Nullable CreateNote createNote) {
        this.note = createNote;
    }

    public final void setSchedule(@Nullable Schedule schedule) {
        this.schedule = schedule;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
