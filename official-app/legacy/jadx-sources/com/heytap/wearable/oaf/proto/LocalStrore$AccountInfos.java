package com.heytap.wearable.oaf.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.oplus.aiunit.vision.i4b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalStrore$AccountInfos extends GeneratedMessageLite<LocalStrore$AccountInfos, Builder> implements LocalStrore$AccountInfosOrBuilder {
    private static final LocalStrore$AccountInfos DEFAULT_INSTANCE;
    private static volatile Parser<LocalStrore$AccountInfos> PARSER = null;
    public static final int SSODITOACCOUNTNAME_FIELD_NUMBER = 1;
    private MapFieldLite<String, String> ssodiToAccountName_ = MapFieldLite.emptyMapField();

    public static final class Builder extends GeneratedMessageLite.Builder<LocalStrore$AccountInfos, Builder> implements LocalStrore$AccountInfosOrBuilder {
        public Builder clearSsodiToAccountName() {
            copyOnWrite();
            ((LocalStrore$AccountInfos) this.instance).getMutableSsodiToAccountNameMap().clear();
            return this;
        }

        @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
        public boolean containsSsodiToAccountName(String str) {
            str.getClass();
            return ((LocalStrore$AccountInfos) this.instance).getSsodiToAccountNameMap().containsKey(str);
        }

        @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
        @Deprecated
        public Map<String, String> getSsodiToAccountName() {
            return getSsodiToAccountNameMap();
        }

        @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
        public int getSsodiToAccountNameCount() {
            return ((LocalStrore$AccountInfos) this.instance).getSsodiToAccountNameMap().size();
        }

        @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
        public Map<String, String> getSsodiToAccountNameMap() {
            return Collections.unmodifiableMap(((LocalStrore$AccountInfos) this.instance).getSsodiToAccountNameMap());
        }

        @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
        public String getSsodiToAccountNameOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> ssodiToAccountNameMap = ((LocalStrore$AccountInfos) this.instance).getSsodiToAccountNameMap();
            return ssodiToAccountNameMap.containsKey(str) ? ssodiToAccountNameMap.get(str) : str2;
        }

        @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
        public String getSsodiToAccountNameOrThrow(String str) {
            str.getClass();
            Map<String, String> ssodiToAccountNameMap = ((LocalStrore$AccountInfos) this.instance).getSsodiToAccountNameMap();
            if (ssodiToAccountNameMap.containsKey(str)) {
                return ssodiToAccountNameMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllSsodiToAccountName(Map<String, String> map) {
            copyOnWrite();
            ((LocalStrore$AccountInfos) this.instance).getMutableSsodiToAccountNameMap().putAll(map);
            return this;
        }

        public Builder putSsodiToAccountName(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((LocalStrore$AccountInfos) this.instance).getMutableSsodiToAccountNameMap().put(str, str2);
            return this;
        }

        public Builder removeSsodiToAccountName(String str) {
            str.getClass();
            copyOnWrite();
            ((LocalStrore$AccountInfos) this.instance).getMutableSsodiToAccountNameMap().remove(str);
            return this;
        }

        private Builder() {
            super(LocalStrore$AccountInfos.DEFAULT_INSTANCE);
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
        LocalStrore$AccountInfos localStrore$AccountInfos = new LocalStrore$AccountInfos();
        DEFAULT_INSTANCE = localStrore$AccountInfos;
        GeneratedMessageLite.registerDefaultInstance(LocalStrore$AccountInfos.class, localStrore$AccountInfos);
    }

    private LocalStrore$AccountInfos() {
    }

    public static LocalStrore$AccountInfos getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableSsodiToAccountNameMap() {
        return internalGetMutableSsodiToAccountName();
    }

    private MapFieldLite<String, String> internalGetMutableSsodiToAccountName() {
        if (!this.ssodiToAccountName_.isMutable()) {
            this.ssodiToAccountName_ = this.ssodiToAccountName_.mutableCopy();
        }
        return this.ssodiToAccountName_;
    }

    private MapFieldLite<String, String> internalGetSsodiToAccountName() {
        return this.ssodiToAccountName_;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LocalStrore$AccountInfos parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalStrore$AccountInfos parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LocalStrore$AccountInfos> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
    public boolean containsSsodiToAccountName(String str) {
        str.getClass();
        return internalGetSsodiToAccountName().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = i4b.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LocalStrore$AccountInfos();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"ssodiToAccountName_", a.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LocalStrore$AccountInfos> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LocalStrore$AccountInfos.class) {
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

    @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
    @Deprecated
    public Map<String, String> getSsodiToAccountName() {
        return getSsodiToAccountNameMap();
    }

    @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
    public int getSsodiToAccountNameCount() {
        return internalGetSsodiToAccountName().size();
    }

    @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
    public Map<String, String> getSsodiToAccountNameMap() {
        return Collections.unmodifiableMap(internalGetSsodiToAccountName());
    }

    @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
    public String getSsodiToAccountNameOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetSsodiToAccountName = internalGetSsodiToAccountName();
        return mapFieldLiteInternalGetSsodiToAccountName.containsKey(str) ? mapFieldLiteInternalGetSsodiToAccountName.get(str) : str2;
    }

    @Override // com.heytap.wearable.oaf.proto.LocalStrore$AccountInfosOrBuilder
    public String getSsodiToAccountNameOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetSsodiToAccountName = internalGetSsodiToAccountName();
        if (mapFieldLiteInternalGetSsodiToAccountName.containsKey(str)) {
            return mapFieldLiteInternalGetSsodiToAccountName.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(LocalStrore$AccountInfos localStrore$AccountInfos) {
        return DEFAULT_INSTANCE.createBuilder(localStrore$AccountInfos);
    }

    public static LocalStrore$AccountInfos parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocalStrore$AccountInfos parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LocalStrore$AccountInfos parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LocalStrore$AccountInfos parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LocalStrore$AccountInfos parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocalStrore$AccountInfos parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LocalStrore$AccountInfos parseFrom(InputStream inputStream) throws IOException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocalStrore$AccountInfos parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocalStrore$AccountInfos parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LocalStrore$AccountInfos parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalStrore$AccountInfos) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
