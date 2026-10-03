package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.p5j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SwipeSetting$CardTime extends GeneratedMessageLite<SwipeSetting$CardTime, Builder> implements SwipeSetting$CardTimeOrBuilder {
    public static final int AID_FIELD_NUMBER = 1;
    private static final SwipeSetting$CardTime DEFAULT_INSTANCE;
    private static volatile Parser<SwipeSetting$CardTime> PARSER = null;
    public static final int SWIPETIME_FIELD_NUMBER = 2;
    private String aid_ = "";
    private Internal.ProtobufList<SwipeSetting$SwipeTime> swipeTime_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<SwipeSetting$CardTime, Builder> implements SwipeSetting$CardTimeOrBuilder {
        public Builder addAllSwipeTime(Iterable<? extends SwipeSetting$SwipeTime> iterable) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).addAllSwipeTime(iterable);
            return this;
        }

        public Builder addSwipeTime(SwipeSetting$SwipeTime swipeSetting$SwipeTime) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).addSwipeTime(swipeSetting$SwipeTime);
            return this;
        }

        public Builder clearAid() {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).clearAid();
            return this;
        }

        public Builder clearSwipeTime() {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).clearSwipeTime();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
        public String getAid() {
            return ((SwipeSetting$CardTime) this.instance).getAid();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
        public ByteString getAidBytes() {
            return ((SwipeSetting$CardTime) this.instance).getAidBytes();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
        public SwipeSetting$SwipeTime getSwipeTime(int i) {
            return ((SwipeSetting$CardTime) this.instance).getSwipeTime(i);
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
        public int getSwipeTimeCount() {
            return ((SwipeSetting$CardTime) this.instance).getSwipeTimeCount();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
        public List<SwipeSetting$SwipeTime> getSwipeTimeList() {
            return Collections.unmodifiableList(((SwipeSetting$CardTime) this.instance).getSwipeTimeList());
        }

        public Builder removeSwipeTime(int i) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).removeSwipeTime(i);
            return this;
        }

        public Builder setAid(String str) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).setAid(str);
            return this;
        }

        public Builder setAidBytes(ByteString byteString) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).setAidBytes(byteString);
            return this;
        }

        public Builder setSwipeTime(int i, SwipeSetting$SwipeTime swipeSetting$SwipeTime) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).setSwipeTime(i, swipeSetting$SwipeTime);
            return this;
        }

        private Builder() {
            super(SwipeSetting$CardTime.DEFAULT_INSTANCE);
        }

        public Builder addSwipeTime(int i, SwipeSetting$SwipeTime swipeSetting$SwipeTime) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).addSwipeTime(i, swipeSetting$SwipeTime);
            return this;
        }

        public Builder setSwipeTime(int i, SwipeSetting$SwipeTime.Builder builder) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).setSwipeTime(i, builder.build());
            return this;
        }

        public Builder addSwipeTime(SwipeSetting$SwipeTime.Builder builder) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).addSwipeTime(builder.build());
            return this;
        }

        public Builder addSwipeTime(int i, SwipeSetting$SwipeTime.Builder builder) {
            copyOnWrite();
            ((SwipeSetting$CardTime) this.instance).addSwipeTime(i, builder.build());
            return this;
        }
    }

    static {
        SwipeSetting$CardTime swipeSetting$CardTime = new SwipeSetting$CardTime();
        DEFAULT_INSTANCE = swipeSetting$CardTime;
        GeneratedMessageLite.registerDefaultInstance(SwipeSetting$CardTime.class, swipeSetting$CardTime);
    }

    private SwipeSetting$CardTime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSwipeTime(Iterable<? extends SwipeSetting$SwipeTime> iterable) {
        ensureSwipeTimeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.swipeTime_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSwipeTime(SwipeSetting$SwipeTime swipeSetting$SwipeTime) {
        swipeSetting$SwipeTime.getClass();
        ensureSwipeTimeIsMutable();
        this.swipeTime_.add(swipeSetting$SwipeTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = getDefaultInstance().getAid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwipeTime() {
        this.swipeTime_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSwipeTimeIsMutable() {
        Internal.ProtobufList<SwipeSetting$SwipeTime> protobufList = this.swipeTime_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.swipeTime_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SwipeSetting$CardTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SwipeSetting$CardTime parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$CardTime parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SwipeSetting$CardTime> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSwipeTime(int i) {
        ensureSwipeTimeIsMutable();
        this.swipeTime_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(String str) {
        str.getClass();
        this.aid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.aid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeTime(int i, SwipeSetting$SwipeTime swipeSetting$SwipeTime) {
        swipeSetting$SwipeTime.getClass();
        ensureSwipeTimeIsMutable();
        this.swipeTime_.set(i, swipeSetting$SwipeTime);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = p5j.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SwipeSetting$CardTime();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"aid_", "swipeTime_", SwipeSetting$SwipeTime.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SwipeSetting$CardTime> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SwipeSetting$CardTime.class) {
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

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
    public String getAid() {
        return this.aid_;
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
    public ByteString getAidBytes() {
        return ByteString.copyFromUtf8(this.aid_);
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
    public SwipeSetting$SwipeTime getSwipeTime(int i) {
        return this.swipeTime_.get(i);
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
    public int getSwipeTimeCount() {
        return this.swipeTime_.size();
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$CardTimeOrBuilder
    public List<SwipeSetting$SwipeTime> getSwipeTimeList() {
        return this.swipeTime_;
    }

    public SwipeSetting$SwipeTimeOrBuilder getSwipeTimeOrBuilder(int i) {
        return this.swipeTime_.get(i);
    }

    public List<? extends SwipeSetting$SwipeTimeOrBuilder> getSwipeTimeOrBuilderList() {
        return this.swipeTime_;
    }

    public static Builder newBuilder(SwipeSetting$CardTime swipeSetting$CardTime) {
        return DEFAULT_INSTANCE.createBuilder(swipeSetting$CardTime);
    }

    public static SwipeSetting$CardTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$CardTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SwipeSetting$CardTime parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSwipeTime(int i, SwipeSetting$SwipeTime swipeSetting$SwipeTime) {
        swipeSetting$SwipeTime.getClass();
        ensureSwipeTimeIsMutable();
        this.swipeTime_.add(i, swipeSetting$SwipeTime);
    }

    public static SwipeSetting$CardTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SwipeSetting$CardTime parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SwipeSetting$CardTime parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SwipeSetting$CardTime parseFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$CardTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$CardTime parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SwipeSetting$CardTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$CardTime) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
