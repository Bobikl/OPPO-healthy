package com.heytap.speech.engine.protocol.directive.shortcut;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.commoninfo.RouteInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/SelectShortcut;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "headerIcon", "Ljava/lang/String;", "getHeaderIcon", "()Ljava/lang/String;", "setHeaderIcon", "(Ljava/lang/String;)V", "headerGrayIcon", "getHeaderGrayIcon", "setHeaderGrayIcon", "headerText", "getHeaderText", "setHeaderText", "selectTip", "getSelectTip", "setSelectTip", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/shortcut/ManualShortcutItem;", "selectManualShortcutList", "Ljava/util/ArrayList;", "getSelectManualShortcutList", "()Ljava/util/ArrayList;", "setSelectManualShortcutList", "(Ljava/util/ArrayList;)V", "reply", "getReply", "setReply", "tts", "getTts", "setTts", "Lcom/heytap/speech/engine/protocol/directive/commoninfo/RouteInfo;", "routeInfo", "Lcom/heytap/speech/engine/protocol/directive/commoninfo/RouteInfo;", "getRouteInfo", "()Lcom/heytap/speech/engine/protocol/directive/commoninfo/RouteInfo;", "setRouteInfo", "(Lcom/heytap/speech/engine/protocol/directive/commoninfo/RouteInfo;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class SelectShortcut extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String headerGrayIcon;

    @Nullable
    private String headerIcon;

    @Nullable
    private String headerText;

    @Nullable
    private String reply;

    @Nullable
    private RouteInfo routeInfo;

    @Nullable
    private ArrayList<ManualShortcutItem> selectManualShortcutList;

    @Nullable
    private String selectTip;

    @Nullable
    private String tts;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.shortcut.SelectShortcut$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/shortcut/SelectShortcut$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return SelectShortcut.VERSION;
        }
    }

    @Nullable
    public final String getHeaderGrayIcon() {
        return this.headerGrayIcon;
    }

    @Nullable
    public final String getHeaderIcon() {
        return this.headerIcon;
    }

    @Nullable
    public final String getHeaderText() {
        return this.headerText;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @Nullable
    public final ArrayList<ManualShortcutItem> getSelectManualShortcutList() {
        return this.selectManualShortcutList;
    }

    @Nullable
    public final String getSelectTip() {
        return this.selectTip;
    }

    @Nullable
    public final String getTts() {
        return this.tts;
    }

    public final void setHeaderGrayIcon(@Nullable String str) {
        this.headerGrayIcon = str;
    }

    public final void setHeaderIcon(@Nullable String str) {
        this.headerIcon = str;
    }

    public final void setHeaderText(@Nullable String str) {
        this.headerText = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setRouteInfo(@Nullable RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }

    public final void setSelectManualShortcutList(@Nullable ArrayList<ManualShortcutItem> arrayList) {
        this.selectManualShortcutList = arrayList;
    }

    public final void setSelectTip(@Nullable String str) {
        this.selectTip = str;
    }

    public final void setTts(@Nullable String str) {
        this.tts = str;
    }
}
