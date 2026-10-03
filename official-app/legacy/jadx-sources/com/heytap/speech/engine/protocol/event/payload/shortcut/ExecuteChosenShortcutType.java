package com.heytap.speech.engine.protocol.event.payload.shortcut;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.shortcut.SelectItem;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/shortcut/ExecuteChosenShortcutType;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/shortcut/SelectItem;", "selectList", "Ljava/util/ArrayList;", "getSelectList", "()Ljava/util/ArrayList;", "setSelectList", "(Ljava/util/ArrayList;)V", "", "index", "Ljava/lang/Integer;", "getIndex", "()Ljava/lang/Integer;", "setIndex", "(Ljava/lang/Integer;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ExecuteChosenShortcutType extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Integer index;

    @Nullable
    private ArrayList<SelectItem> selectList;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.shortcut.ExecuteChosenShortcutType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/shortcut/ExecuteChosenShortcutType$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return ExecuteChosenShortcutType.VERSION;
        }
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final ArrayList<SelectItem> getSelectList() {
        return this.selectList;
    }

    public final void setIndex(@Nullable Integer num) {
        this.index = num;
    }

    public final void setSelectList(@Nullable ArrayList<SelectItem> arrayList) {
        this.selectList = arrayList;
    }
}
