package com.heytap.health.protocol.userevent;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.tnk;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class UserEventProto$UserEventResult extends GeneratedMessageLite<UserEventProto$UserEventResult, Builder> implements UserEventProto$UserEventResultOrBuilder {
    private static final UserEventProto$UserEventResult DEFAULT_INSTANCE;
    private static volatile Parser<UserEventProto$UserEventResult> PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    public static final int UTC_TIME_MS_FIELD_NUMBER = 1;
    private boolean success_;
    private long utcTimeMs_;

    public static final class Builder extends GeneratedMessageLite.Builder<UserEventProto$UserEventResult, Builder> implements UserEventProto$UserEventResultOrBuilder {
        public Builder clearSuccess() {
            copyOnWrite();
            ((UserEventProto$UserEventResult) this.instance).clearSuccess();
            return this;
        }

        public Builder clearUtcTimeMs() {
            copyOnWrite();
            ((UserEventProto$UserEventResult) this.instance).clearUtcTimeMs();
            return this;
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventResultOrBuilder
        public boolean getSuccess() {
            return ((UserEventProto$UserEventResult) this.instance).getSuccess();
        }

        @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventResultOrBuilder
        public long getUtcTimeMs() {
            return ((UserEventProto$UserEventResult) this.instance).getUtcTimeMs();
        }

        public Builder setSuccess(boolean z) {
            copyOnWrite();
            ((UserEventProto$UserEventResult) this.instance).setSuccess(z);
            return this;
        }

        public Builder setUtcTimeMs(long j2) {
            copyOnWrite();
            ((UserEventProto$UserEventResult) this.instance).setUtcTimeMs(j2);
            return this;
        }

        private Builder() {
            super(UserEventProto$UserEventResult.DEFAULT_INSTANCE);
        }
    }

    static {
        UserEventProto$UserEventResult userEventProto$UserEventResult = new UserEventProto$UserEventResult();
        DEFAULT_INSTANCE = userEventProto$UserEventResult;
        GeneratedMessageLite.registerDefaultInstance(UserEventProto$UserEventResult.class, userEventProto$UserEventResult);
    }

    private UserEventProto$UserEventResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuccess() {
        this.success_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUtcTimeMs() {
        this.utcTimeMs_ = 0L;
    }

    public static UserEventProto$UserEventResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static UserEventProto$UserEventResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserEventProto$UserEventResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<UserEventProto$UserEventResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccess(boolean z) {
        this.success_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtcTimeMs(long j2) {
        this.utcTimeMs_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = tnk.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new UserEventProto$UserEventResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0007", new Object[]{"utcTimeMs_", "success_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<UserEventProto$UserEventResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (UserEventProto$UserEventResult.class) {
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

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventResultOrBuilder
    public boolean getSuccess() {
        return this.success_;
    }

    @Override // com.heytap.health.protocol.userevent.UserEventProto$UserEventResultOrBuilder
    public long getUtcTimeMs() {
        return this.utcTimeMs_;
    }

    public static Builder newBuilder(UserEventProto$UserEventResult userEventProto$UserEventResult) {
        return DEFAULT_INSTANCE.createBuilder(userEventProto$UserEventResult);
    }

    public static UserEventProto$UserEventResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserEventProto$UserEventResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static UserEventProto$UserEventResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static UserEventProto$UserEventResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static UserEventProto$UserEventResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UserEventProto$UserEventResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static UserEventProto$UserEventResult parseFrom(InputStream inputStream) throws IOException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UserEventProto$UserEventResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static UserEventProto$UserEventResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static UserEventProto$UserEventResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UserEventProto$UserEventResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
