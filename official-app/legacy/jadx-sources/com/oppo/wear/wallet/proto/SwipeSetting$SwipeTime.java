package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.p5j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class SwipeSetting$SwipeTime extends GeneratedMessageLite<SwipeSetting$SwipeTime, Builder> implements SwipeSetting$SwipeTimeOrBuilder {
    private static final SwipeSetting$SwipeTime DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<SwipeSetting$SwipeTime> PARSER = null;
    public static final int STARTTIME_FIELD_NUMBER = 2;
    private int id_;
    private String startTime_ = "";
    private String endTime_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<SwipeSetting$SwipeTime, Builder> implements SwipeSetting$SwipeTimeOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).clearEndTime();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).clearId();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).clearStartTime();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
        public String getEndTime() {
            return ((SwipeSetting$SwipeTime) this.instance).getEndTime();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
        public ByteString getEndTimeBytes() {
            return ((SwipeSetting$SwipeTime) this.instance).getEndTimeBytes();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
        public int getId() {
            return ((SwipeSetting$SwipeTime) this.instance).getId();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
        public String getStartTime() {
            return ((SwipeSetting$SwipeTime) this.instance).getStartTime();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
        public ByteString getStartTimeBytes() {
            return ((SwipeSetting$SwipeTime) this.instance).getStartTimeBytes();
        }

        public Builder setEndTime(String str) {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).setEndTime(str);
            return this;
        }

        public Builder setEndTimeBytes(ByteString byteString) {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).setEndTimeBytes(byteString);
            return this;
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).setId(i);
            return this;
        }

        public Builder setStartTime(String str) {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).setStartTime(str);
            return this;
        }

        public Builder setStartTimeBytes(ByteString byteString) {
            copyOnWrite();
            ((SwipeSetting$SwipeTime) this.instance).setStartTimeBytes(byteString);
            return this;
        }

        private Builder() {
            super(SwipeSetting$SwipeTime.DEFAULT_INSTANCE);
        }
    }

    static {
        SwipeSetting$SwipeTime swipeSetting$SwipeTime = new SwipeSetting$SwipeTime();
        DEFAULT_INSTANCE = swipeSetting$SwipeTime;
        GeneratedMessageLite.registerDefaultInstance(SwipeSetting$SwipeTime.class, swipeSetting$SwipeTime);
    }

    private SwipeSetting$SwipeTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = getDefaultInstance().getEndTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = getDefaultInstance().getStartTime();
    }

    public static SwipeSetting$SwipeTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SwipeSetting$SwipeTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$SwipeTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SwipeSetting$SwipeTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(String str) {
        str.getClass();
        this.endTime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.endTime_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(String str) {
        str.getClass();
        this.startTime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.startTime_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = p5j.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SwipeSetting$SwipeTime();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ", new Object[]{"id_", "startTime_", "endTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SwipeSetting$SwipeTime> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SwipeSetting$SwipeTime.class) {
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

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
    public String getEndTime() {
        return this.endTime_;
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
    public ByteString getEndTimeBytes() {
        return ByteString.copyFromUtf8(this.endTime_);
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
    public String getStartTime() {
        return this.startTime_;
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwipeTimeOrBuilder
    public ByteString getStartTimeBytes() {
        return ByteString.copyFromUtf8(this.startTime_);
    }

    public static Builder newBuilder(SwipeSetting$SwipeTime swipeSetting$SwipeTime) {
        return DEFAULT_INSTANCE.createBuilder(swipeSetting$SwipeTime);
    }

    public static SwipeSetting$SwipeTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SwipeSetting$SwipeTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SwipeSetting$SwipeTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeTime parseFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$SwipeTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$SwipeTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SwipeSetting$SwipeTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwipeTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
