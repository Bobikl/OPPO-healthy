package com.heytap.health.protocol.insight;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r9a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class Insight$InsightData extends GeneratedMessageLite<Insight$InsightData, Builder> implements Insight$InsightDataOrBuilder {
    public static final int CATEGORY_FIELD_NUMBER = 3;
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int CONTENT_FIELD_NUMBER = 5;
    private static final Insight$InsightData DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 7;
    public static final int OSAANALYSIS_FIELD_NUMBER = 8;
    private static volatile Parser<Insight$InsightData> PARSER = null;
    public static final int SCOREANALYSIS_FIELD_NUMBER = 9;
    public static final int SHOWNOTIFY_FIELD_NUMBER = 6;
    public static final int TEMPERATUREANALYSIS_FIELD_NUMBER = 10;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 4;
    private int category_;
    private Object payload_;
    private boolean showNotify_;
    private int timestamp_;
    private int payloadCase_ = 0;
    private String code_ = "";
    private String title_ = "";
    private String content_ = "";
    private String extra_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Insight$InsightData, Builder> implements Insight$InsightDataOrBuilder {
        public Builder clearCategory() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearCategory();
            return this;
        }

        public Builder clearCode() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearCode();
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearContent();
            return this;
        }

        public Builder clearExtra() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearExtra();
            return this;
        }

        public Builder clearOsaAnalysis() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearOsaAnalysis();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearPayload();
            return this;
        }

        public Builder clearScoreAnalysis() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearScoreAnalysis();
            return this;
        }

        public Builder clearShowNotify() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearShowNotify();
            return this;
        }

        public Builder clearTemperatureAnalysis() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearTemperatureAnalysis();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((Insight$InsightData) this.instance).clearTitle();
            return this;
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public int getCategory() {
            return ((Insight$InsightData) this.instance).getCategory();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public String getCode() {
            return ((Insight$InsightData) this.instance).getCode();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public ByteString getCodeBytes() {
            return ((Insight$InsightData) this.instance).getCodeBytes();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public String getContent() {
            return ((Insight$InsightData) this.instance).getContent();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public ByteString getContentBytes() {
            return ((Insight$InsightData) this.instance).getContentBytes();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public String getExtra() {
            return ((Insight$InsightData) this.instance).getExtra();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public ByteString getExtraBytes() {
            return ((Insight$InsightData) this.instance).getExtraBytes();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public Insight$SnoreAnalysis getOsaAnalysis() {
            return ((Insight$InsightData) this.instance).getOsaAnalysis();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public PayloadCase getPayloadCase() {
            return ((Insight$InsightData) this.instance).getPayloadCase();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public Insight$ScoreAnalysis getScoreAnalysis() {
            return ((Insight$InsightData) this.instance).getScoreAnalysis();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public boolean getShowNotify() {
            return ((Insight$InsightData) this.instance).getShowNotify();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public Insight$MultipleSignsAnalysis getTemperatureAnalysis() {
            return ((Insight$InsightData) this.instance).getTemperatureAnalysis();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public int getTimestamp() {
            return ((Insight$InsightData) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public String getTitle() {
            return ((Insight$InsightData) this.instance).getTitle();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public ByteString getTitleBytes() {
            return ((Insight$InsightData) this.instance).getTitleBytes();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public boolean hasOsaAnalysis() {
            return ((Insight$InsightData) this.instance).hasOsaAnalysis();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public boolean hasScoreAnalysis() {
            return ((Insight$InsightData) this.instance).hasScoreAnalysis();
        }

        @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
        public boolean hasTemperatureAnalysis() {
            return ((Insight$InsightData) this.instance).hasTemperatureAnalysis();
        }

        public Builder mergeOsaAnalysis(Insight$SnoreAnalysis insight$SnoreAnalysis) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).mergeOsaAnalysis(insight$SnoreAnalysis);
            return this;
        }

        public Builder mergeScoreAnalysis(Insight$ScoreAnalysis insight$ScoreAnalysis) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).mergeScoreAnalysis(insight$ScoreAnalysis);
            return this;
        }

        public Builder mergeTemperatureAnalysis(Insight$MultipleSignsAnalysis insight$MultipleSignsAnalysis) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).mergeTemperatureAnalysis(insight$MultipleSignsAnalysis);
            return this;
        }

        public Builder setCategory(int i) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setCategory(i);
            return this;
        }

        public Builder setCode(String str) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setCode(str);
            return this;
        }

        public Builder setCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setCodeBytes(byteString);
            return this;
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setExtra(String str) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setExtra(str);
            return this;
        }

        public Builder setExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setExtraBytes(byteString);
            return this;
        }

        public Builder setOsaAnalysis(Insight$SnoreAnalysis insight$SnoreAnalysis) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setOsaAnalysis(insight$SnoreAnalysis);
            return this;
        }

        public Builder setScoreAnalysis(Insight$ScoreAnalysis insight$ScoreAnalysis) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setScoreAnalysis(insight$ScoreAnalysis);
            return this;
        }

        public Builder setShowNotify(boolean z) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setShowNotify(z);
            return this;
        }

        public Builder setTemperatureAnalysis(Insight$MultipleSignsAnalysis insight$MultipleSignsAnalysis) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setTemperatureAnalysis(insight$MultipleSignsAnalysis);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(Insight$InsightData.DEFAULT_INSTANCE);
        }

        public Builder setOsaAnalysis(Insight$SnoreAnalysis.Builder builder) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setOsaAnalysis(builder.build());
            return this;
        }

        public Builder setScoreAnalysis(Insight$ScoreAnalysis.Builder builder) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setScoreAnalysis(builder.build());
            return this;
        }

        public Builder setTemperatureAnalysis(Insight$MultipleSignsAnalysis.Builder builder) {
            copyOnWrite();
            ((Insight$InsightData) this.instance).setTemperatureAnalysis(builder.build());
            return this;
        }
    }

    public enum PayloadCase {
        OSAANALYSIS(8),
        SCOREANALYSIS(9),
        TEMPERATUREANALYSIS(10),
        PAYLOAD_NOT_SET(0);

        private final int value;

        PayloadCase(int i) {
            this.value = i;
        }

        public static PayloadCase forNumber(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            switch (i) {
                case 8:
                    return OSAANALYSIS;
                case 9:
                    return SCOREANALYSIS;
                case 10:
                    return TEMPERATUREANALYSIS;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static PayloadCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Insight$InsightData insight$InsightData = new Insight$InsightData();
        DEFAULT_INSTANCE = insight$InsightData;
        GeneratedMessageLite.registerDefaultInstance(Insight$InsightData.class, insight$InsightData);
    }

    private Insight$InsightData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = getDefaultInstance().getCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsaAnalysis() {
        if (this.payloadCase_ == 8) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScoreAnalysis() {
        if (this.payloadCase_ == 9) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowNotify() {
        this.showNotify_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemperatureAnalysis() {
        if (this.payloadCase_ == 10) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Insight$InsightData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOsaAnalysis(Insight$SnoreAnalysis insight$SnoreAnalysis) {
        insight$SnoreAnalysis.getClass();
        if (this.payloadCase_ != 8 || this.payload_ == Insight$SnoreAnalysis.getDefaultInstance()) {
            this.payload_ = insight$SnoreAnalysis;
        } else {
            this.payload_ = Insight$SnoreAnalysis.newBuilder((Insight$SnoreAnalysis) this.payload_).mergeFrom(insight$SnoreAnalysis).buildPartial();
        }
        this.payloadCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScoreAnalysis(Insight$ScoreAnalysis insight$ScoreAnalysis) {
        insight$ScoreAnalysis.getClass();
        if (this.payloadCase_ != 9 || this.payload_ == Insight$ScoreAnalysis.getDefaultInstance()) {
            this.payload_ = insight$ScoreAnalysis;
        } else {
            this.payload_ = Insight$ScoreAnalysis.newBuilder((Insight$ScoreAnalysis) this.payload_).mergeFrom(insight$ScoreAnalysis).buildPartial();
        }
        this.payloadCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTemperatureAnalysis(Insight$MultipleSignsAnalysis insight$MultipleSignsAnalysis) {
        insight$MultipleSignsAnalysis.getClass();
        if (this.payloadCase_ != 10 || this.payload_ == Insight$MultipleSignsAnalysis.getDefaultInstance()) {
            this.payload_ = insight$MultipleSignsAnalysis;
        } else {
            this.payload_ = Insight$MultipleSignsAnalysis.newBuilder((Insight$MultipleSignsAnalysis) this.payload_).mergeFrom(insight$MultipleSignsAnalysis).buildPartial();
        }
        this.payloadCase_ = 10;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Insight$InsightData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Insight$InsightData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$InsightData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Insight$InsightData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(int i) {
        this.category_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(String str) {
        str.getClass();
        this.code_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.code_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(String str) {
        str.getClass();
        this.extra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsaAnalysis(Insight$SnoreAnalysis insight$SnoreAnalysis) {
        insight$SnoreAnalysis.getClass();
        this.payload_ = insight$SnoreAnalysis;
        this.payloadCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScoreAnalysis(Insight$ScoreAnalysis insight$ScoreAnalysis) {
        insight$ScoreAnalysis.getClass();
        this.payload_ = insight$ScoreAnalysis;
        this.payloadCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowNotify(boolean z) {
        this.showNotify_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemperatureAnalysis(Insight$MultipleSignsAnalysis insight$MultipleSignsAnalysis) {
        insight$MultipleSignsAnalysis.getClass();
        this.payload_ = insight$MultipleSignsAnalysis;
        this.payloadCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r9a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Insight$InsightData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004Ȉ\u0005Ȉ\u0006\u0007\u0007Ȉ\b<\u0000\t<\u0000\n<\u0000", new Object[]{"payload_", "payloadCase_", "code_", "timestamp_", "category_", "title_", "content_", "showNotify_", "extra_", Insight$SnoreAnalysis.class, Insight$ScoreAnalysis.class, Insight$MultipleSignsAnalysis.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Insight$InsightData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Insight$InsightData.class) {
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

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public int getCategory() {
        return this.category_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public String getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public ByteString getCodeBytes() {
        return ByteString.copyFromUtf8(this.code_);
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public String getExtra() {
        return this.extra_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public ByteString getExtraBytes() {
        return ByteString.copyFromUtf8(this.extra_);
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public Insight$SnoreAnalysis getOsaAnalysis() {
        return this.payloadCase_ == 8 ? (Insight$SnoreAnalysis) this.payload_ : Insight$SnoreAnalysis.getDefaultInstance();
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public PayloadCase getPayloadCase() {
        return PayloadCase.forNumber(this.payloadCase_);
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public Insight$ScoreAnalysis getScoreAnalysis() {
        return this.payloadCase_ == 9 ? (Insight$ScoreAnalysis) this.payload_ : Insight$ScoreAnalysis.getDefaultInstance();
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public boolean getShowNotify() {
        return this.showNotify_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public Insight$MultipleSignsAnalysis getTemperatureAnalysis() {
        return this.payloadCase_ == 10 ? (Insight$MultipleSignsAnalysis) this.payload_ : Insight$MultipleSignsAnalysis.getDefaultInstance();
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public boolean hasOsaAnalysis() {
        return this.payloadCase_ == 8;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public boolean hasScoreAnalysis() {
        return this.payloadCase_ == 9;
    }

    @Override // com.heytap.health.protocol.insight.Insight$InsightDataOrBuilder
    public boolean hasTemperatureAnalysis() {
        return this.payloadCase_ == 10;
    }

    public static Builder newBuilder(Insight$InsightData insight$InsightData) {
        return DEFAULT_INSTANCE.createBuilder(insight$InsightData);
    }

    public static Insight$InsightData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$InsightData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$InsightData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Insight$InsightData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Insight$InsightData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Insight$InsightData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Insight$InsightData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Insight$InsightData parseFrom(InputStream inputStream) throws IOException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$InsightData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$InsightData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Insight$InsightData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$InsightData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
