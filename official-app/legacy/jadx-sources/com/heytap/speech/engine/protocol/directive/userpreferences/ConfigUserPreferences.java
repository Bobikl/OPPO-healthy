package com.heytap.speech.engine.protocol.directive.userpreferences;

import androidx.annotation.Keep;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Header;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0007\u0018\u0000 )2\u00020\u0001:\u0004*+,-B\u0007¢\u0006\u0004\b'\u0010(R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "backgroundImage", "Ljava/lang/String;", "getBackgroundImage", "()Ljava/lang/String;", "setBackgroundImage", "(Ljava/lang/String;)V", "darkBackgroundImage", "getDarkBackgroundImage", "setDarkBackgroundImage", "Lcom/heytap/speech/engine/protocol/directive/common/Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/common/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/common/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/common/Header;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$PreferenceConfig;", "configs", "Ljava/util/ArrayList;", "getConfigs", "()Ljava/util/ArrayList;", "setConfigs", "(Ljava/util/ArrayList;)V", "Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$ConfigButton;", "bottomButtons", "getBottomButtons", "setBottomButtons", "Ljava/util/HashMap;", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "ConfigButton", "ConfigItem", "PreferenceConfig", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ConfigUserPreferences extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String backgroundImage;

    @Nullable
    private ArrayList<ConfigButton> bottomButtons;

    @Nullable
    private ArrayList<PreferenceConfig> configs;

    @Nullable
    private String darkBackgroundImage;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Header header;

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$ConfigButton;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "actionInfos", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "appendConfigs", "", "getAppendConfigs", "setAppendConfigs", "buttonName", "getButtonName", "()Ljava/lang/String;", "setButtonName", "(Ljava/lang/String;)V", "buttonType", "getButtonType", "setButtonType", "order", "", "getOrder", "()Ljava/lang/Integer;", "setOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", SearchIntents.EXTRA_QUERY, "getQuery", "setQuery", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ConfigButton extends DirectivePayload {

        @Nullable
        private ArrayList<ActionInfo> actionInfos;

        @Nullable
        private ArrayList<String> appendConfigs;

        @Nullable
        private String buttonName;

        @Nullable
        private String buttonType;

        @Nullable
        private Integer order;

        @Nullable
        private String query;

        @Nullable
        public final ArrayList<ActionInfo> getActionInfos() {
            return this.actionInfos;
        }

        @Nullable
        public final ArrayList<String> getAppendConfigs() {
            return this.appendConfigs;
        }

        @Nullable
        public final String getButtonName() {
            return this.buttonName;
        }

        @Nullable
        public final String getButtonType() {
            return this.buttonType;
        }

        @Nullable
        public final Integer getOrder() {
            return this.order;
        }

        @Nullable
        public final String getQuery() {
            return this.query;
        }

        public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
            this.actionInfos = arrayList;
        }

        public final void setAppendConfigs(@Nullable ArrayList<String> arrayList) {
            this.appendConfigs = arrayList;
        }

        public final void setButtonName(@Nullable String str) {
            this.buttonName = str;
        }

        public final void setButtonType(@Nullable String str) {
            this.buttonType = str;
        }

        public final void setOrder(@Nullable Integer num) {
            this.order = num;
        }

        public final void setQuery(@Nullable String str) {
            this.query = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$ConfigItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "hint", "", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "itemType", "getItemType", "setItemType", "maxValue", "", "getMaxValue", "()Ljava/lang/Integer;", "setMaxValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "getName", "setName", "order", "getOrder", "setOrder", "selected", "getSelected", "setSelected", "unit", "getUnit", "setUnit", "value", "getValue", "setValue", "values", "Ljava/util/ArrayList;", "getValues", "()Ljava/util/ArrayList;", "setValues", "(Ljava/util/ArrayList;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ConfigItem extends DirectivePayload {

        @Nullable
        private String hint;

        @Nullable
        private String itemType;

        @Nullable
        private Integer maxValue;

        @Nullable
        private String name;

        @Nullable
        private Integer order;

        @Nullable
        private Integer selected;

        @Nullable
        private String unit;

        @Nullable
        private String value;

        @Nullable
        private ArrayList<ConfigItem> values;

        @Nullable
        public final String getHint() {
            return this.hint;
        }

        @Nullable
        public final String getItemType() {
            return this.itemType;
        }

        @Nullable
        public final Integer getMaxValue() {
            return this.maxValue;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final Integer getOrder() {
            return this.order;
        }

        @Nullable
        public final Integer getSelected() {
            return this.selected;
        }

        @Nullable
        public final String getUnit() {
            return this.unit;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        @Nullable
        public final ArrayList<ConfigItem> getValues() {
            return this.values;
        }

        public final void setHint(@Nullable String str) {
            this.hint = str;
        }

        public final void setItemType(@Nullable String str) {
            this.itemType = str;
        }

        public final void setMaxValue(@Nullable Integer num) {
            this.maxValue = num;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setOrder(@Nullable Integer num) {
            this.order = num;
        }

        public final void setSelected(@Nullable Integer num) {
            this.selected = num;
        }

        public final void setUnit(@Nullable String str) {
            this.unit = str;
        }

        public final void setValue(@Nullable String str) {
            this.value = str;
        }

        public final void setValues(@Nullable ArrayList<ConfigItem> arrayList) {
            this.values = arrayList;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$PreferenceConfig;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "configId", "", "getConfigId", "()Ljava/lang/String;", "setConfigId", "(Ljava/lang/String;)V", "configItems", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/userpreferences/ConfigUserPreferences$ConfigItem;", "getConfigItems", "()Ljava/util/ArrayList;", "setConfigItems", "(Ljava/util/ArrayList;)V", "configName", "getConfigName", "setConfigName", "configStyle", "getConfigStyle", "setConfigStyle", "maxSelectCount", "", "getMaxSelectCount", "()Ljava/lang/Integer;", "setMaxSelectCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "order", "getOrder", "setOrder", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class PreferenceConfig extends DirectivePayload {

        @Nullable
        private String configId;

        @Nullable
        private ArrayList<ConfigItem> configItems;

        @Nullable
        private String configName;

        @Nullable
        private String configStyle;

        @Nullable
        private Integer maxSelectCount;

        @Nullable
        private Integer order;

        @Nullable
        public final String getConfigId() {
            return this.configId;
        }

        @Nullable
        public final ArrayList<ConfigItem> getConfigItems() {
            return this.configItems;
        }

        @Nullable
        public final String getConfigName() {
            return this.configName;
        }

        @Nullable
        public final String getConfigStyle() {
            return this.configStyle;
        }

        @Nullable
        public final Integer getMaxSelectCount() {
            return this.maxSelectCount;
        }

        @Nullable
        public final Integer getOrder() {
            return this.order;
        }

        public final void setConfigId(@Nullable String str) {
            this.configId = str;
        }

        public final void setConfigItems(@Nullable ArrayList<ConfigItem> arrayList) {
            this.configItems = arrayList;
        }

        public final void setConfigName(@Nullable String str) {
            this.configName = str;
        }

        public final void setConfigStyle(@Nullable String str) {
            this.configStyle = str;
        }

        public final void setMaxSelectCount(@Nullable Integer num) {
            this.maxSelectCount = num;
        }

        public final void setOrder(@Nullable Integer num) {
            this.order = num;
        }
    }

    @Nullable
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @Nullable
    public final ArrayList<ConfigButton> getBottomButtons() {
        return this.bottomButtons;
    }

    @Nullable
    public final ArrayList<PreferenceConfig> getConfigs() {
        return this.configs;
    }

    @Nullable
    public final String getDarkBackgroundImage() {
        return this.darkBackgroundImage;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    public final void setBackgroundImage(@Nullable String str) {
        this.backgroundImage = str;
    }

    public final void setBottomButtons(@Nullable ArrayList<ConfigButton> arrayList) {
        this.bottomButtons = arrayList;
    }

    public final void setConfigs(@Nullable ArrayList<PreferenceConfig> arrayList) {
        this.configs = arrayList;
    }

    public final void setDarkBackgroundImage(@Nullable String str) {
        this.darkBackgroundImage = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }
}
