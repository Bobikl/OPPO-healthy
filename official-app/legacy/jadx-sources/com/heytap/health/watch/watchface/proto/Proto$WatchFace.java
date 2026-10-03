package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$WatchFace extends GeneratedMessageLite<Proto$WatchFace, Builder> implements Proto$WatchFaceOrBuilder {
    private static final Proto$WatchFace DEFAULT_INSTANCE;
    public static final int IS_CURRENT_FIELD_NUMBER = 6;
    private static volatile Parser<Proto$WatchFace> PARSER = null;
    public static final int POSITION_INDEX_FIELD_NUMBER = 2;
    public static final int STYLE_DATA_FIELD_NUMBER = 4;
    public static final int STYLE_INDEX_FIELD_NUMBER = 3;
    public static final int WATCH_FACE_KEY_FIELD_NUMBER = 1;
    public static final int WATCH_FACE_NAME_FIELD_NUMBER = 5;
    private boolean isCurrent_;
    private int positionIndex_;
    private int styleIndex_;
    private String watchFaceKey_ = "";
    private String styleData_ = "";
    private String watchFaceName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WatchFace, Builder> implements Proto$WatchFaceOrBuilder {
        public Builder clearIsCurrent() {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).clearIsCurrent();
            return this;
        }

        public Builder clearPositionIndex() {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).clearPositionIndex();
            return this;
        }

        public Builder clearStyleData() {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).clearStyleData();
            return this;
        }

        public Builder clearStyleIndex() {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).clearStyleIndex();
            return this;
        }

        public Builder clearWatchFaceKey() {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).clearWatchFaceKey();
            return this;
        }

        public Builder clearWatchFaceName() {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).clearWatchFaceName();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public boolean getIsCurrent() {
            return ((Proto$WatchFace) this.instance).getIsCurrent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public int getPositionIndex() {
            return ((Proto$WatchFace) this.instance).getPositionIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public String getStyleData() {
            return ((Proto$WatchFace) this.instance).getStyleData();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public ByteString getStyleDataBytes() {
            return ((Proto$WatchFace) this.instance).getStyleDataBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public int getStyleIndex() {
            return ((Proto$WatchFace) this.instance).getStyleIndex();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public String getWatchFaceKey() {
            return ((Proto$WatchFace) this.instance).getWatchFaceKey();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public ByteString getWatchFaceKeyBytes() {
            return ((Proto$WatchFace) this.instance).getWatchFaceKeyBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public String getWatchFaceName() {
            return ((Proto$WatchFace) this.instance).getWatchFaceName();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
        public ByteString getWatchFaceNameBytes() {
            return ((Proto$WatchFace) this.instance).getWatchFaceNameBytes();
        }

        public Builder setIsCurrent(boolean z) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setIsCurrent(z);
            return this;
        }

        public Builder setPositionIndex(int i) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setPositionIndex(i);
            return this;
        }

        public Builder setStyleData(String str) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setStyleData(str);
            return this;
        }

        public Builder setStyleDataBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setStyleDataBytes(byteString);
            return this;
        }

        public Builder setStyleIndex(int i) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setStyleIndex(i);
            return this;
        }

        public Builder setWatchFaceKey(String str) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setWatchFaceKey(str);
            return this;
        }

        public Builder setWatchFaceKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setWatchFaceKeyBytes(byteString);
            return this;
        }

        public Builder setWatchFaceName(String str) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setWatchFaceName(str);
            return this;
        }

        public Builder setWatchFaceNameBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFace) this.instance).setWatchFaceNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(Proto$WatchFace.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$WatchFace proto$WatchFace = new Proto$WatchFace();
        DEFAULT_INSTANCE = proto$WatchFace;
        GeneratedMessageLite.registerDefaultInstance(Proto$WatchFace.class, proto$WatchFace);
    }

    private Proto$WatchFace() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCurrent() {
        this.isCurrent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositionIndex() {
        this.positionIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleData() {
        this.styleData_ = getDefaultInstance().getStyleData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleIndex() {
        this.styleIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchFaceKey() {
        this.watchFaceKey_ = getDefaultInstance().getWatchFaceKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchFaceName() {
        this.watchFaceName_ = getDefaultInstance().getWatchFaceName();
    }

    public static Proto$WatchFace getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WatchFace parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFace parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WatchFace> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCurrent(boolean z) {
        this.isCurrent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositionIndex(int i) {
        this.positionIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleData(String str) {
        str.getClass();
        this.styleData_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleDataBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.styleData_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleIndex(int i) {
        this.styleIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaceKey(String str) {
        str.getClass();
        this.watchFaceKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaceKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.watchFaceKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaceName(String str) {
        str.getClass();
        this.watchFaceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaceNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.watchFaceName_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$WatchFace();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006\u0007", new Object[]{"watchFaceKey_", "positionIndex_", "styleIndex_", "styleData_", "watchFaceName_", "isCurrent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WatchFace> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WatchFace.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public boolean getIsCurrent() {
        return this.isCurrent_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public int getPositionIndex() {
        return this.positionIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public String getStyleData() {
        return this.styleData_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public ByteString getStyleDataBytes() {
        return ByteString.copyFromUtf8(this.styleData_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public int getStyleIndex() {
        return this.styleIndex_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public String getWatchFaceKey() {
        return this.watchFaceKey_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public ByteString getWatchFaceKeyBytes() {
        return ByteString.copyFromUtf8(this.watchFaceKey_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public String getWatchFaceName() {
        return this.watchFaceName_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFaceOrBuilder
    public ByteString getWatchFaceNameBytes() {
        return ByteString.copyFromUtf8(this.watchFaceName_);
    }

    public static Builder newBuilder(Proto$WatchFace proto$WatchFace) {
        return DEFAULT_INSTANCE.createBuilder(proto$WatchFace);
    }

    public static Proto$WatchFace parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFace) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFace parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WatchFace parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$WatchFace parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WatchFace parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WatchFace parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WatchFace parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFace parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFace parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WatchFace parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
