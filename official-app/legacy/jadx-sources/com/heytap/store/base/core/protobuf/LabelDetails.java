package com.heytap.store.base.core.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class LabelDetails extends Message<LabelDetails, Builder> {
    public static final String DEFAULT_CONFIGKEY = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIGMENT = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long beginAt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String configKey;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 4)
    public final Long endAt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String pigment;
    public static final ProtoAdapter<LabelDetails> ADAPTER = new ProtoAdapter_LabelDetails();
    public static final Integer DEFAULT_COLOR = 0;
    public static final Long DEFAULT_BEGINAT = 0L;
    public static final Long DEFAULT_ENDAT = 0L;

    public static final class Builder extends Message.Builder<LabelDetails, Builder> {
        public Long beginAt;
        public Integer color;
        public String configKey;
        public Long endAt;
        public String name;
        public String pigment;

        public Builder beginAt(Long l2) {
            this.beginAt = l2;
            return this;
        }

        public Builder color(Integer num) {
            this.color = num;
            return this;
        }

        public Builder configKey(String str) {
            this.configKey = str;
            return this;
        }

        public Builder endAt(Long l2) {
            this.endAt = l2;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder pigment(String str) {
            this.pigment = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LabelDetails build() {
            return new LabelDetails(this.name, this.color, this.beginAt, this.endAt, this.pigment, this.configKey, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_LabelDetails extends ProtoAdapter<LabelDetails> {
        public ProtoAdapter_LabelDetails() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) LabelDetails.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public LabelDetails decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                switch (iNextTag) {
                    case 1:
                        builder.name(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.color(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 3:
                        builder.beginAt(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 4:
                        builder.endAt(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 5:
                        builder.pigment(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 6:
                        builder.configKey(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, LabelDetails labelDetails) throws IOException {
            String str = labelDetails.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            Integer num = labelDetails.color;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, num);
            }
            Long l2 = labelDetails.beginAt;
            if (l2 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, l2);
            }
            Long l3 = labelDetails.endAt;
            if (l3 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, l3);
            }
            String str2 = labelDetails.pigment;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str2);
            }
            String str3 = labelDetails.configKey;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str3);
            }
            protoWriter.writeBytes(labelDetails.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(LabelDetails labelDetails) {
            String str = labelDetails.name;
            int iEncodedSizeWithTag = str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0;
            Integer num = labelDetails.color;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(2, num) : 0);
            Long l2 = labelDetails.beginAt;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (l2 != null ? ProtoAdapter.INT64.encodedSizeWithTag(3, l2) : 0);
            Long l3 = labelDetails.endAt;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (l3 != null ? ProtoAdapter.INT64.encodedSizeWithTag(4, l3) : 0);
            String str2 = labelDetails.pigment;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str2) : 0);
            String str3 = labelDetails.configKey;
            return iEncodedSizeWithTag5 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str3) : 0) + labelDetails.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public LabelDetails redact(LabelDetails labelDetails) {
            Builder builderNewBuilder = labelDetails.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public LabelDetails(String str, Integer num, Long l2, Long l3, String str2, String str3) {
        this(str, num, l2, l3, str2, str3, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LabelDetails)) {
            return false;
        }
        LabelDetails labelDetails = (LabelDetails) obj;
        return getUnknownFields().equals(labelDetails.getUnknownFields()) && Internal.equals(this.name, labelDetails.name) && Internal.equals(this.color, labelDetails.color) && Internal.equals(this.beginAt, labelDetails.beginAt) && Internal.equals(this.endAt, labelDetails.endAt) && Internal.equals(this.pigment, labelDetails.pigment) && Internal.equals(this.configKey, labelDetails.configKey);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.color;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Long l2 = this.beginAt;
        int iHashCode4 = (iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.endAt;
        int iHashCode5 = (iHashCode4 + (l3 != null ? l3.hashCode() : 0)) * 37;
        String str2 = this.pigment;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.configKey;
        int iHashCode7 = iHashCode6 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.color != null) {
            sb.append(", color=");
            sb.append(this.color);
        }
        if (this.beginAt != null) {
            sb.append(", beginAt=");
            sb.append(this.beginAt);
        }
        if (this.endAt != null) {
            sb.append(", endAt=");
            sb.append(this.endAt);
        }
        if (this.pigment != null) {
            sb.append(", pigment=");
            sb.append(this.pigment);
        }
        if (this.configKey != null) {
            sb.append(", configKey=");
            sb.append(this.configKey);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "LabelDetails{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public LabelDetails(String str, Integer num, Long l2, Long l3, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.color = num;
        this.beginAt = l2;
        this.endAt = l3;
        this.pigment = str2;
        this.configKey = str3;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.color = this.color;
        builder.beginAt = this.beginAt;
        builder.endAt = this.endAt;
        builder.pigment = this.pigment;
        builder.configKey = this.configKey;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
