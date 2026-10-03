package com.heytap.speech.engine.protocol.directive.oassistant;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 92\u00020\u0001:\u0005:;<=>B\u0007¢\u0006\u0004\b7\u00108R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006?"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "serviceVersion", "getServiceVersion", "setServiceVersion", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$Header;)V", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$SwitchUI;", "switchUI", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$SwitchUI;", "getSwitchUI", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$SwitchUI;", "setSwitchUI", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$SwitchUI;)V", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ListUI;", "listUI", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ListUI;", "getListUI", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ListUI;", "setListUI", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ListUI;)V", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ProgressBarUI;", "progressBarUI", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ProgressBarUI;", "getProgressBarUI", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ProgressBarUI;", "setProgressBarUI", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ProgressBarUI;)V", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "Header", "ListUI", "ProgressBarUI", "SwitchUI", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OAssistantDisplay extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Header header;

    @Nullable
    private ListUI listUI;

    @Nullable
    private ProgressBarUI progressBarUI;

    @Nullable
    private String reply;

    @Nullable
    private Integer serviceVersion;

    @Nullable
    private SwitchUI switchUI;

    @Nullable
    private Integer type;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$Header;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "actionInfo", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "setActionInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;)V", "headerDarkIcon", "", "getHeaderDarkIcon", "()Ljava/lang/String;", "setHeaderDarkIcon", "(Ljava/lang/String;)V", "headerIcon", "getHeaderIcon", "setHeaderIcon", "headerName", "getHeaderName", "setHeaderName", "headerRightText", "getHeaderRightText", "setHeaderRightText", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Header extends DirectivePayload {

        @Nullable
        private ActionInfo actionInfo;

        @Nullable
        private String headerDarkIcon;

        @Nullable
        private String headerIcon;

        @Nullable
        private String headerName;

        @Nullable
        private String headerRightText;

        @Nullable
        public final ActionInfo getActionInfo() {
            return this.actionInfo;
        }

        @Nullable
        public final String getHeaderDarkIcon() {
            return this.headerDarkIcon;
        }

        @Nullable
        public final String getHeaderIcon() {
            return this.headerIcon;
        }

        @Nullable
        public final String getHeaderName() {
            return this.headerName;
        }

        @Nullable
        public final String getHeaderRightText() {
            return this.headerRightText;
        }

        public final void setActionInfo(@Nullable ActionInfo actionInfo) {
            this.actionInfo = actionInfo;
        }

        public final void setHeaderDarkIcon(@Nullable String str) {
            this.headerDarkIcon = str;
        }

        public final void setHeaderIcon(@Nullable String str) {
            this.headerIcon = str;
        }

        public final void setHeaderName(@Nullable String str) {
            this.headerName = str;
        }

        public final void setHeaderRightText(@Nullable String str) {
            this.headerRightText = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ListUI;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "itemList", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ListUI$ListItem;", "getItemList", "()Ljava/util/ArrayList;", "setItemList", "(Ljava/util/ArrayList;)V", "ListItem", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ListUI extends DirectivePayload {

        @Nullable
        private ArrayList<ListItem> itemList;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ListUI$ListItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "itemName", "", "getItemName", "()Ljava/lang/String;", "setItemName", "(Ljava/lang/String;)V", "itemSubTitle", "getItemSubTitle", "setItemSubTitle", "relatedApi", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "getRelatedApi", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "setRelatedApi", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;)V", "selected", "", "getSelected", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class ListItem extends DirectivePayload {

            @Nullable
            private String itemName;

            @Nullable
            private String itemSubTitle;

            @Nullable
            private OAssistant.OAssistantApiInfo relatedApi;

            @Nullable
            private Boolean selected;

            @Nullable
            public final String getItemName() {
                return this.itemName;
            }

            @Nullable
            public final String getItemSubTitle() {
                return this.itemSubTitle;
            }

            @Nullable
            public final OAssistant.OAssistantApiInfo getRelatedApi() {
                return this.relatedApi;
            }

            @Nullable
            public final Boolean getSelected() {
                return this.selected;
            }

            public final void setItemName(@Nullable String str) {
                this.itemName = str;
            }

            public final void setItemSubTitle(@Nullable String str) {
                this.itemSubTitle = str;
            }

            public final void setRelatedApi(@Nullable OAssistant.OAssistantApiInfo oAssistantApiInfo) {
                this.relatedApi = oAssistantApiInfo;
            }

            public final void setSelected(@Nullable Boolean bool) {
                this.selected = bool;
            }
        }

        @Nullable
        public final ArrayList<ListItem> getItemList() {
            return this.itemList;
        }

        public final void setItemList(@Nullable ArrayList<ListItem> arrayList) {
            this.itemList = arrayList;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$ProgressBarUI;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "currentParamValue", "", "getCurrentParamValue", "()Ljava/lang/Integer;", "setCurrentParamValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "leftDetailName", "", "getLeftDetailName", "()Ljava/lang/String;", "setLeftDetailName", "(Ljava/lang/String;)V", "paramName", "getParamName", "setParamName", "relatedApi", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "getRelatedApi", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "setRelatedApi", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;)V", "rightDetailName", "getRightDetailName", "setRightDetailName", "settingName", "getSettingName", "setSettingName", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ProgressBarUI extends DirectivePayload {

        @Nullable
        private Integer currentParamValue;

        @Nullable
        private String leftDetailName;

        @Nullable
        private String paramName;

        @Nullable
        private OAssistant.OAssistantApiInfo relatedApi;

        @Nullable
        private String rightDetailName;

        @Nullable
        private String settingName;

        @Nullable
        public final Integer getCurrentParamValue() {
            return this.currentParamValue;
        }

        @Nullable
        public final String getLeftDetailName() {
            return this.leftDetailName;
        }

        @Nullable
        public final String getParamName() {
            return this.paramName;
        }

        @Nullable
        public final OAssistant.OAssistantApiInfo getRelatedApi() {
            return this.relatedApi;
        }

        @Nullable
        public final String getRightDetailName() {
            return this.rightDetailName;
        }

        @Nullable
        public final String getSettingName() {
            return this.settingName;
        }

        public final void setCurrentParamValue(@Nullable Integer num) {
            this.currentParamValue = num;
        }

        public final void setLeftDetailName(@Nullable String str) {
            this.leftDetailName = str;
        }

        public final void setParamName(@Nullable String str) {
            this.paramName = str;
        }

        public final void setRelatedApi(@Nullable OAssistant.OAssistantApiInfo oAssistantApiInfo) {
            this.relatedApi = oAssistantApiInfo;
        }

        public final void setRightDetailName(@Nullable String str) {
            this.rightDetailName = str;
        }

        public final void setSettingName(@Nullable String str) {
            this.settingName = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistantDisplay$SwitchUI;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "currentApi", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "getCurrentApi", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "setCurrentApi", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;)V", "itemName", "", "getItemName", "()Ljava/lang/String;", "setItemName", "(Ljava/lang/String;)V", "itemState", "getItemState", "setItemState", "itemSubTitle", "getItemSubTitle", "setItemSubTitle", "relatedApi", "getRelatedApi", "setRelatedApi", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SwitchUI extends DirectivePayload {

        @Nullable
        private OAssistant.OAssistantApiInfo currentApi;

        @Nullable
        private String itemName;

        @Nullable
        private String itemState;

        @Nullable
        private String itemSubTitle;

        @Nullable
        private OAssistant.OAssistantApiInfo relatedApi;

        @Nullable
        public final OAssistant.OAssistantApiInfo getCurrentApi() {
            return this.currentApi;
        }

        @Nullable
        public final String getItemName() {
            return this.itemName;
        }

        @Nullable
        public final String getItemState() {
            return this.itemState;
        }

        @Nullable
        public final String getItemSubTitle() {
            return this.itemSubTitle;
        }

        @Nullable
        public final OAssistant.OAssistantApiInfo getRelatedApi() {
            return this.relatedApi;
        }

        public final void setCurrentApi(@Nullable OAssistant.OAssistantApiInfo oAssistantApiInfo) {
            this.currentApi = oAssistantApiInfo;
        }

        public final void setItemName(@Nullable String str) {
            this.itemName = str;
        }

        public final void setItemState(@Nullable String str) {
            this.itemState = str;
        }

        public final void setItemSubTitle(@Nullable String str) {
            this.itemSubTitle = str;
        }

        public final void setRelatedApi(@Nullable OAssistant.OAssistantApiInfo oAssistantApiInfo) {
            this.relatedApi = oAssistantApiInfo;
        }
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final ListUI getListUI() {
        return this.listUI;
    }

    @Nullable
    public final ProgressBarUI getProgressBarUI() {
        return this.progressBarUI;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final Integer getServiceVersion() {
        return this.serviceVersion;
    }

    @Nullable
    public final SwitchUI getSwitchUI() {
        return this.switchUI;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }

    public final void setListUI(@Nullable ListUI listUI) {
        this.listUI = listUI;
    }

    public final void setProgressBarUI(@Nullable ProgressBarUI progressBarUI) {
        this.progressBarUI = progressBarUI;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setServiceVersion(@Nullable Integer num) {
        this.serviceVersion = num;
    }

    public final void setSwitchUI(@Nullable SwitchUI switchUI) {
        this.switchUI = switchUI;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
