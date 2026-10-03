package com.heytap.health.protocol.userevent;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.oplus.aiunit.vision.tnk;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class UserEventProto$UserEvent extends GeneratedMessageLite<UserEventProto$UserEvent, Builder> implements UserEventProto$UserEventOrBuilder {
    private static final UserEventProto$UserEvent DEFAULT_INSTANCE;
    public static final int EVENT_CATEGORY_FIELD_NUMBER = 2;
    public static final int EVENT_NAME_FIELD_NUMBER = 3;
    private static volatile Parser<UserEventProto$UserEvent> PARSER = null;
    public static final int UTC_TIME_MS_FIELD_NUMBER = 1;
    public static final int VALUES_FIELD_NUMBER = 4;
    private long utcTimeMs_;
    private MapFieldLite<String, String> values_ = MapFieldLite.emptyMapField();
    private String eventCategory_ = "";
    private String eventName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<UserEventProto$UserEvent, Builder> implements UserEventProto$UserEventOrBuilder {
        public Builder clearEventCategory() {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).clearEventCategory();
            return this;
        }

        public Builder clearEventName() {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).clearEventName();
            return this;
        }

        public Builder clearUtcTimeMs() {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).clearUtcTimeMs();
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).getMutableValuesMap().clear();
            return this;
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public boolean containsValues(String str) {
            str.getClass();
            return ((UserEventProto$UserEvent) this.instance).getValuesMap().containsKey(str);
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public String getEventCategory() {
            return ((UserEventProto$UserEvent) this.instance).getEventCategory();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public ByteString getEventCategoryBytes() {
            return ((UserEventProto$UserEvent) this.instance).getEventCategoryBytes();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public String getEventName() {
            return ((UserEventProto$UserEvent) this.instance).getEventName();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public ByteString getEventNameBytes() {
            return ((UserEventProto$UserEvent) this.instance).getEventNameBytes();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public long getUtcTimeMs() {
            return ((UserEventProto$UserEvent) this.instance).getUtcTimeMs();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        @Deprecated
        public Map<String, String> getValues() {
            return getValuesMap();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public int getValuesCount() {
            return ((UserEventProto$UserEvent) this.instance).getValuesMap().size();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public Map<String, String> getValuesMap() {
            return Collections.unmodifiableMap(((UserEventProto$UserEvent) this.instance).getValuesMap());
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public String getValuesOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> valuesMap = ((UserEventProto$UserEvent) this.instance).getValuesMap();
            return valuesMap.containsKey(str) ? valuesMap.get(str) : str2;
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
        public String getValuesOrThrow(String str) {
            str.getClass();
            Map<String, String> valuesMap = ((UserEventProto$UserEvent) this.instance).getValuesMap();
            if (valuesMap.containsKey(str)) {
                return valuesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllValues(Map<String, String> map) {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).getMutableValuesMap().putAll(map);
            return this;
        }

        public Builder putValues(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).getMutableValuesMap().put(str, str2);
            return this;
        }

        public Builder removeValues(String str) {
            str.getClass();
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).getMutableValuesMap().remove(str);
            return this;
        }

        public Builder setEventCategory(String str) {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).setEventCategory(str);
            return this;
        }

        public Builder setEventCategoryBytes(ByteString byteString) {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).setEventCategoryBytes(byteString);
            return this;
        }

        public Builder setEventName(String str) {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).setEventName(str);
            return this;
        }

        public Builder setEventNameBytes(ByteString byteString) {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).setEventNameBytes(byteString);
            return this;
        }

        public Builder setUtcTimeMs(long j2) {
            copyOnWrite();
            ((UserEventProto$UserEvent) this.instance).setUtcTimeMs(j2);
            return this;
        }

        private Builder() {
            super(UserEventProto$UserEvent.DEFAULT_INSTANCE);
        }
    }

    public static final class a {
        public static final MapEntryLite<String, String> a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        UserEventProto$UserEvent userEventProto$UserEvent = new UserEventProto$UserEvent();
        DEFAULT_INSTANCE = userEventProto$UserEvent;
        GeneratedMessageLite.registerDefaultInstance(UserEventProto$UserEvent.class, userEventProto$UserEvent);
    }

    private UserEventProto$UserEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventCategory() {
        this.eventCategory_ = getDefaultInstance().getEventCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventName() {
        this.eventName_ = getDefaultInstance().getEventName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtcTimeMs() {
        this.utcTimeMs_ = 0L;
    }

    public static UserEventProto$UserEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableValuesMap() {
        return internalGetMutableValues();
    }

    private MapFieldLite<String, String> internalGetMutableValues() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private MapFieldLite<String, String> internalGetValues() {
        return this.values_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserEventProto$UserEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserEventProto$UserEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserEventProto$UserEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventCategory(String str) {
        str.getClass();
        this.eventCategory_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventCategoryBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventCategory_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventName(String str) {
        str.getClass();
        this.eventName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtcTimeMs(long j2) {
        this.utcTimeMs_ = j2;
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public boolean containsValues(String str) {
        str.getClass();
        return internalGetValues().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = tnk.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new UserEventProto$UserEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u00042", new Object[]{"utcTimeMs_", "eventCategory_", "eventName_", "values_", a.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserEventProto$UserEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (UserEventProto$UserEvent.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public String getEventCategory() {
        return this.eventCategory_;
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public ByteString getEventCategoryBytes() {
        return ByteString.copyFromUtf8(this.eventCategory_);
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public String getEventName() {
        return this.eventName_;
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public ByteString getEventNameBytes() {
        return ByteString.copyFromUtf8(this.eventName_);
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public long getUtcTimeMs() {
        return this.utcTimeMs_;
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    @Deprecated
    public Map<String, String> getValues() {
        return getValuesMap();
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public int getValuesCount() {
        return internalGetValues().size();
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public Map<String, String> getValuesMap() {
        return Collections.unmodifiableMap(internalGetValues());
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public String getValuesOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetValues = internalGetValues();
        return mapFieldLiteInternalGetValues.containsKey(str) ? mapFieldLiteInternalGetValues.get(str) : str2;
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventOrBuilder
    public String getValuesOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetValues = internalGetValues();
        if (mapFieldLiteInternalGetValues.containsKey(str)) {
            return mapFieldLiteInternalGetValues.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(UserEventProto$UserEvent userEventProto$UserEvent) {
        return DEFAULT_INSTANCE.createBuilder(userEventProto$UserEvent);
    }

    public static UserEventProto$UserEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserEventProto$UserEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserEventProto$UserEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserEventProto$UserEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserEventProto$UserEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserEventProto$UserEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserEventProto$UserEvent parseFrom(InputStream inputStream) throws IOException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserEventProto$UserEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserEventProto$UserEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserEventProto$UserEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserEventProto$UserEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
