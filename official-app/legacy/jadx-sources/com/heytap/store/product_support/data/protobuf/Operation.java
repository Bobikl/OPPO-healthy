package com.heytap.store.product_support.data.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
public final class Operation extends Message<Operation, Builder> {
    public static final ProtoAdapter<Operation> ADAPTER = new ProtoAdapter_Operation();
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_LINKBUTTONTEXT = "";
    public static final String DEFAULT_MSG = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String linkButtonText;

    @WireField(adapter = "com.homestead.model.protobuf.Meta#ADAPTER", tag = 1)
    public final Meta meta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String msg;

    public static final class Builder extends Message.Builder<Operation, Builder> {
        public String link;
        public String linkButtonText;
        public Meta meta;
        public String msg;

        public Builder link(String str) {
            this.link = str;
            return this;
        }

        public Builder linkButtonText(String str) {
            this.linkButtonText = str;
            return this;
        }

        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        public Builder msg(String str) {
            this.msg = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Operation build() {
            return new Operation(this.meta, this.msg, this.link, this.linkButtonText, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_Operation extends ProtoAdapter<Operation> {
        public ProtoAdapter_Operation() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Operation.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Operation decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.meta(Meta.ADAPTER.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.msg(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.link(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                    builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.linkButtonText(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Operation operation) throws IOException {
            Meta meta = operation.meta;
            if (meta != null) {
                Meta.ADAPTER.encodeWithTag(protoWriter, 1, meta);
            }
            String str = operation.msg;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
            }
            String str2 = operation.link;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str2);
            }
            String str3 = operation.linkButtonText;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str3);
            }
            protoWriter.writeBytes(operation.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Operation operation) {
            Meta meta = operation.meta;
            int iEncodedSizeWithTag = meta != null ? Meta.ADAPTER.encodedSizeWithTag(1, meta) : 0;
            String str = operation.msg;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) : 0);
            String str2 = operation.link;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str2) : 0);
            String str3 = operation.linkButtonText;
            return iEncodedSizeWithTag3 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str3) : 0) + operation.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Operation redact(Operation operation) {
            Builder builderNewBuilder = operation.newBuilder();
            Meta meta = builderNewBuilder.meta;
            if (meta != null) {
                builderNewBuilder.meta = Meta.ADAPTER.redact(meta);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public Operation(Meta meta, String str, String str2, String str3) {
        this(meta, str, str2, str3, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Operation)) {
            return false;
        }
        Operation operation = (Operation) obj;
        return getUnknownFields().equals(operation.getUnknownFields()) && Internal.equals(this.meta, operation.meta) && Internal.equals(this.msg, operation.msg) && Internal.equals(this.link, operation.link) && Internal.equals(this.linkButtonText, operation.linkButtonText);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Meta meta = this.meta;
        int iHashCode2 = (iHashCode + (meta != null ? meta.hashCode() : 0)) * 37;
        String str = this.msg;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.link;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.linkButtonText;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.meta != null) {
            sb.append(", meta=");
            sb.append(this.meta);
        }
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.linkButtonText != null) {
            sb.append(", linkButtonText=");
            sb.append(this.linkButtonText);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Operation{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public Operation(Meta meta, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meta = meta;
        this.msg = str;
        this.link = str2;
        this.linkButtonText = str3;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.meta = this.meta;
        builder.msg = this.msg;
        builder.link = this.link;
        builder.linkButtonText = this.linkButtonText;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
