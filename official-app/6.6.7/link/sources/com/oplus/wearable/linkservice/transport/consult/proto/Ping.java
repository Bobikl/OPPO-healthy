package com.oplus.wearable.linkservice.transport.consult.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class Ping extends GeneratedMessageLite<Ping, Builder> implements PingOrBuilder {
    private static final Ping DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 3;
    private static volatile Parser<Ping> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 4;
    public static final int RESPONSETIME_FIELD_NUMBER = 2;
    public static final int SENDTIME_FIELD_NUMBER = 1;
    private long endTime_;
    private ByteString payload_ = ByteString.EMPTY;
    private long responseTime_;
    private long sendTime_;

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Ping, Builder> implements PingOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).clearEndTime();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).clearPayload();
            return this;
        }

        public Builder clearResponseTime() {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).clearResponseTime();
            return this;
        }

        public Builder clearSendTime() {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).clearSendTime();
            return this;
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
        public long getEndTime() {
            return ((Ping) ((GeneratedMessageLite.Builder) this).instance).getEndTime();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
        public ByteString getPayload() {
            return ((Ping) ((GeneratedMessageLite.Builder) this).instance).getPayload();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
        public long getResponseTime() {
            return ((Ping) ((GeneratedMessageLite.Builder) this).instance).getResponseTime();
        }

        @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
        public long getSendTime() {
            return ((Ping) ((GeneratedMessageLite.Builder) this).instance).getSendTime();
        }

        public Builder setEndTime(long j) {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).setEndTime(j);
            return this;
        }

        public Builder setPayload(ByteString byteString) {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).setPayload(byteString);
            return this;
        }

        public Builder setResponseTime(long j) {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).setResponseTime(j);
            return this;
        }

        public Builder setSendTime(long j) {
            copyOnWrite();
            ((Ping) ((GeneratedMessageLite.Builder) this).instance).setSendTime(j);
            return this;
        }

        private Builder() {
            super(Ping.DEFAULT_INSTANCE);
        }
    }

    static {
        Ping ping = new Ping();
        DEFAULT_INSTANCE = ping;
        GeneratedMessageLite.registerDefaultInstance(Ping.class, ping);
    }

    private Ping() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = getDefaultInstance().getPayload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTime() {
        this.responseTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendTime() {
        this.sendTime_ = 0L;
    }

    public static Ping getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Ping parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ping parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Ping> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(long j) {
        this.endTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(ByteString byteString) {
        byteString.getClass();
        this.payload_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTime(long j) {
        this.responseTime_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendTime(long j) {
        this.sendTime_ = j;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Ping();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\n", new Object[]{"sendTime_", "responseTime_", "endTime_", "payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Ping.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
    public long getEndTime() {
        return this.endTime_;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
    public ByteString getPayload() {
        return this.payload_;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
    public long getResponseTime() {
        return this.responseTime_;
    }

    @Override // com.oplus.wearable.linkservice.transport.consult.proto.PingOrBuilder
    public long getSendTime() {
        return this.sendTime_;
    }

    public static Builder newBuilder(Ping ping) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(ping);
    }

    public static Ping parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ping parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Ping parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Ping parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Ping parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ping parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Ping parseFrom(InputStream inputStream) throws IOException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ping parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Ping parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Ping parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Ping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
