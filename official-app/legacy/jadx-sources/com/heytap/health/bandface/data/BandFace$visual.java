package com.heytap.health.bandface.data;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ru0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class BandFace$visual extends GeneratedMessageLite<BandFace$visual, Builder> implements BandFace$visualOrBuilder {
    public static final int BACKGROUNDS_FIELD_NUMBER = 1;
    private static final BandFace$visual DEFAULT_INSTANCE;
    private static volatile Parser<BandFace$visual> PARSER = null;
    public static final int STYLEID_FIELD_NUMBER = 2;
    private Internal.ProtobufList<String> backgrounds_ = GeneratedMessageLite.emptyProtobufList();
    private int styleId_;

    public static final class Builder extends GeneratedMessageLite.Builder<BandFace$visual, Builder> implements BandFace$visualOrBuilder {
        public Builder addAllBackgrounds(Iterable<String> iterable) {
            copyOnWrite();
            ((BandFace$visual) this.instance).addAllBackgrounds(iterable);
            return this;
        }

        public Builder addBackgrounds(String str) {
            copyOnWrite();
            ((BandFace$visual) this.instance).addBackgrounds(str);
            return this;
        }

        public Builder addBackgroundsBytes(ByteString byteString) {
            copyOnWrite();
            ((BandFace$visual) this.instance).addBackgroundsBytes(byteString);
            return this;
        }

        public Builder clearBackgrounds() {
            copyOnWrite();
            ((BandFace$visual) this.instance).clearBackgrounds();
            return this;
        }

        public Builder clearStyleId() {
            copyOnWrite();
            ((BandFace$visual) this.instance).clearStyleId();
            return this;
        }

        @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
        public String getBackgrounds(int i) {
            return ((BandFace$visual) this.instance).getBackgrounds(i);
        }

        @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
        public ByteString getBackgroundsBytes(int i) {
            return ((BandFace$visual) this.instance).getBackgroundsBytes(i);
        }

        @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
        public int getBackgroundsCount() {
            return ((BandFace$visual) this.instance).getBackgroundsCount();
        }

        @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
        public List<String> getBackgroundsList() {
            return Collections.unmodifiableList(((BandFace$visual) this.instance).getBackgroundsList());
        }

        @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
        public int getStyleId() {
            return ((BandFace$visual) this.instance).getStyleId();
        }

        public Builder setBackgrounds(int i, String str) {
            copyOnWrite();
            ((BandFace$visual) this.instance).setBackgrounds(i, str);
            return this;
        }

        public Builder setStyleId(int i) {
            copyOnWrite();
            ((BandFace$visual) this.instance).setStyleId(i);
            return this;
        }

        private Builder() {
            super(BandFace$visual.DEFAULT_INSTANCE);
        }
    }

    static {
        BandFace$visual bandFace$visual = new BandFace$visual();
        DEFAULT_INSTANCE = bandFace$visual;
        GeneratedMessageLite.registerDefaultInstance(BandFace$visual.class, bandFace$visual);
    }

    private BandFace$visual() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBackgrounds(Iterable<String> iterable) {
        ensureBackgroundsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.backgrounds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBackgrounds(String str) {
        str.getClass();
        ensureBackgroundsIsMutable();
        this.backgrounds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBackgroundsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureBackgroundsIsMutable();
        this.backgrounds_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgrounds() {
        this.backgrounds_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStyleId() {
        this.styleId_ = 0;
    }

    private void ensureBackgroundsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.backgrounds_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.backgrounds_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static BandFace$visual getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BandFace$visual parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BandFace$visual) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$visual parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BandFace$visual> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgrounds(int i, String str) {
        str.getClass();
        ensureBackgroundsIsMutable();
        this.backgrounds_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyleId(int i) {
        this.styleId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ru0.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new BandFace$visual();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\u000b", new Object[]{"backgrounds_", "styleId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BandFace$visual> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BandFace$visual.class) {
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

    @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
    public String getBackgrounds(int i) {
        return this.backgrounds_.get(i);
    }

    @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
    public ByteString getBackgroundsBytes(int i) {
        return ByteString.copyFromUtf8(this.backgrounds_.get(i));
    }

    @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
    public int getBackgroundsCount() {
        return this.backgrounds_.size();
    }

    @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
    public List<String> getBackgroundsList() {
        return this.backgrounds_;
    }

    @Override // com.heytap.health.bandface.data.BandFace$visualOrBuilder
    public int getStyleId() {
        return this.styleId_;
    }

    public static Builder newBuilder(BandFace$visual bandFace$visual) {
        return DEFAULT_INSTANCE.createBuilder(bandFace$visual);
    }

    public static BandFace$visual parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$visual) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$visual parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BandFace$visual parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BandFace$visual parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BandFace$visual parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BandFace$visual parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BandFace$visual parseFrom(InputStream inputStream) throws IOException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BandFace$visual parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BandFace$visual parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BandFace$visual parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BandFace$visual) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
