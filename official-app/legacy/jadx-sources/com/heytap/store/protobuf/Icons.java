package com.heytap.store.protobuf;

import com.oplus.aiunit.vision.hp6;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Icons extends Message<Icons, Builder> {
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 5)
    public final Integer cols;

    @WireField(adapter = "com.homestead.model.protobuf.IconDetails#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<IconDetails> details;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer maxProductNum;

    @WireField(adapter = "com.homestead.model.protobuf.Meta#ADAPTER", tag = 1)
    public final Meta meta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer rows;
    public static final ProtoAdapter<Icons> ADAPTER = new ProtoAdapter_Icons();
    public static final Integer DEFAULT_ROWS = 0;
    public static final Integer DEFAULT_COLS = 0;
    public static final Integer DEFAULT_MAXPRODUCTNUM = 0;

    public static final class Builder extends Message.Builder<Icons, Builder> {
        public Integer cols;
        public List<IconDetails> details = Internal.newMutableList();
        public Integer maxProductNum;
        public Meta meta;
        public String name;
        public Integer rows;

        public Builder cols(Integer num) {
            this.cols = num;
            return this;
        }

        public Builder details(List<IconDetails> list) {
            Internal.checkElementsNotNull(list);
            this.details = list;
            return this;
        }

        public Builder maxProductNum(Integer num) {
            this.maxProductNum = num;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder rows(Integer num) {
            this.rows = num;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Icons build() {
            return new Icons(this.meta, this.details, this.name, this.rows, this.cols, this.maxProductNum, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_Icons extends ProtoAdapter<Icons> {
        public ProtoAdapter_Icons() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Icons.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Icons decode(ProtoReader protoReader) throws IOException {
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
                        builder.meta(Meta.ADAPTER.decode(protoReader));
                        break;
                    case 2:
                        builder.details.add(IconDetails.ADAPTER.decode(protoReader));
                        break;
                    case 3:
                        builder.name(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        builder.rows(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 5:
                        builder.cols(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 6:
                        builder.maxProductNum(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    default:
                        FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Icons icons) throws IOException {
            Meta meta = icons.meta;
            if (meta != null) {
                Meta.ADAPTER.encodeWithTag(protoWriter, 1, meta);
            }
            IconDetails.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, icons.details);
            String str = icons.name;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
            }
            Integer num = icons.rows;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, num);
            }
            Integer num2 = icons.cols;
            if (num2 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, num2);
            }
            Integer num3 = icons.maxProductNum;
            if (num3 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, num3);
            }
            protoWriter.writeBytes(icons.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Icons icons) {
            Meta meta = icons.meta;
            int iEncodedSizeWithTag = (meta != null ? Meta.ADAPTER.encodedSizeWithTag(1, meta) : 0) + IconDetails.ADAPTER.asRepeated().encodedSizeWithTag(2, icons.details);
            String str = icons.name;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str) : 0);
            Integer num = icons.rows;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, num) : 0);
            Integer num2 = icons.cols;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (num2 != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, num2) : 0);
            Integer num3 = icons.maxProductNum;
            return iEncodedSizeWithTag4 + (num3 != null ? ProtoAdapter.INT32.encodedSizeWithTag(6, num3) : 0) + icons.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Icons redact(Icons icons) {
            Builder builderNewBuilder = icons.newBuilder();
            Meta meta = builderNewBuilder.meta;
            if (meta != null) {
                builderNewBuilder.meta = Meta.ADAPTER.redact(meta);
            }
            Internal.redactElements(builderNewBuilder.details, IconDetails.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public Icons(Meta meta, List<IconDetails> list, String str, Integer num, Integer num2, Integer num3) {
        this(meta, list, str, num, num2, num3, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Icons)) {
            return false;
        }
        Icons icons = (Icons) obj;
        return getUnknownFields().equals(icons.getUnknownFields()) && Internal.equals(this.meta, icons.meta) && this.details.equals(icons.details) && Internal.equals(this.name, icons.name) && Internal.equals(this.rows, icons.rows) && Internal.equals(this.cols, icons.cols) && Internal.equals(this.maxProductNum, icons.maxProductNum);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Meta meta = this.meta;
        int iHashCode2 = (((iHashCode + (meta != null ? meta.hashCode() : 0)) * 37) + this.details.hashCode()) * 37;
        String str = this.name;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.rows;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.cols;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Integer num3 = this.maxProductNum;
        int iHashCode6 = iHashCode5 + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.meta != null) {
            sb.append(", meta=");
            sb.append(this.meta);
        }
        if (!this.details.isEmpty()) {
            sb.append(", details=");
            sb.append(this.details);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.rows != null) {
            sb.append(", rows=");
            sb.append(this.rows);
        }
        if (this.cols != null) {
            sb.append(", cols=");
            sb.append(this.cols);
        }
        if (this.maxProductNum != null) {
            sb.append(", maxProductNum=");
            sb.append(this.maxProductNum);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Icons{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public Icons(Meta meta, List<IconDetails> list, String str, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = meta;
        this.details = Internal.immutableCopyOf(hp6.DETAIL_ENTRY, list);
        this.name = str;
        this.rows = num;
        this.cols = num2;
        this.maxProductNum = num3;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.meta = this.meta;
        builder.details = Internal.copyOf(hp6.DETAIL_ENTRY, this.details);
        builder.name = this.name;
        builder.rows = this.rows;
        builder.cols = this.cols;
        builder.maxProductNum = this.maxProductNum;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
