package com.heytap.speech.engine.protocol.directive.oassistant;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "currentApi", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "getCurrentApi", "()Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "setCurrentApi", "(Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;)V", "", "serviceVersion", "Ljava/lang/Integer;", "getServiceVersion", "()Ljava/lang/Integer;", "setServiceVersion", "(Ljava/lang/Integer;)V", "Ljava/util/HashMap;", "", "", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "OAssistantApiInfo", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OAssistant extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private OAssistantApiInfo currentApi;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Integer serviceVersion;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", SensorsBean.API_NAME, "", "getApiName", "()Ljava/lang/String;", "setApiName", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", "params", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo$OAssistantInputParam;", "getParams", "()Ljava/util/ArrayList;", "setParams", "(Ljava/util/ArrayList;)V", "protocol", "getProtocol", "setProtocol", "requestId", "getRequestId", "setRequestId", "OAssistantInputParam", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class OAssistantApiInfo extends DirectivePayload {

        @Nullable
        private String apiName;

        @Nullable
        private String packageName;

        @Nullable
        private ArrayList<OAssistantInputParam> params;

        @Nullable
        private String protocol;

        @Nullable
        private String requestId;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/oassistant/OAssistant$OAssistantApiInfo$OAssistantInputParam;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "paramName", "", "getParamName", "()Ljava/lang/String;", "setParamName", "(Ljava/lang/String;)V", "paramType", "getParamType", "setParamType", "paramValue", "getParamValue", "setParamValue", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class OAssistantInputParam extends DirectivePayload {

            @Nullable
            private String paramName;

            @Nullable
            private String paramType;

            @Nullable
            private String paramValue;

            @Nullable
            public final String getParamName() {
                return this.paramName;
            }

            @Nullable
            public final String getParamType() {
                return this.paramType;
            }

            @Nullable
            public final String getParamValue() {
                return this.paramValue;
            }

            public final void setParamName(@Nullable String str) {
                this.paramName = str;
            }

            public final void setParamType(@Nullable String str) {
                this.paramType = str;
            }

            public final void setParamValue(@Nullable String str) {
                this.paramValue = str;
            }
        }

        @Nullable
        public final String getApiName() {
            return this.apiName;
        }

        @Nullable
        public final String getPackageName() {
            return this.packageName;
        }

        @Nullable
        public final ArrayList<OAssistantInputParam> getParams() {
            return this.params;
        }

        @Nullable
        public final String getProtocol() {
            return this.protocol;
        }

        @Nullable
        public final String getRequestId() {
            return this.requestId;
        }

        public final void setApiName(@Nullable String str) {
            this.apiName = str;
        }

        public final void setPackageName(@Nullable String str) {
            this.packageName = str;
        }

        public final void setParams(@Nullable ArrayList<OAssistantInputParam> arrayList) {
            this.params = arrayList;
        }

        public final void setProtocol(@Nullable String str) {
            this.protocol = str;
        }

        public final void setRequestId(@Nullable String str) {
            this.requestId = str;
        }
    }

    @Nullable
    public final OAssistantApiInfo getCurrentApi() {
        return this.currentApi;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Integer getServiceVersion() {
        return this.serviceVersion;
    }

    public final void setCurrentApi(@Nullable OAssistantApiInfo oAssistantApiInfo) {
        this.currentApi = oAssistantApiInfo;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setServiceVersion(@Nullable Integer num) {
        this.serviceVersion = num;
    }
}
