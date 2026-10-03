package com.heytap.store.homemodule.data.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class GoodsActivityInfo extends Message<GoodsActivityInfo, Builder> {
    public static final String DEFAULT_ACTIVITYINFO = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String activityInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer type;
    public static final ProtoAdapter<GoodsActivityInfo> ADAPTER = new ProtoAdapter_GoodsActivityInfo();
    public static final Integer DEFAULT_TYPE = 0;

    public static final class Builder extends Message.Builder<GoodsActivityInfo, Builder> {
        public String activityInfo;
        public Integer type;

        public Builder activityInfo(String str) {
            this.activityInfo = str;
            return this;
        }

        public Builder type(Integer num) {
            this.type = num;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public GoodsActivityInfo build() {
            return new GoodsActivityInfo(this.type, this.activityInfo, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_GoodsActivityInfo extends ProtoAdapter<GoodsActivityInfo> {
        public ProtoAdapter_GoodsActivityInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) GoodsActivityInfo.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public GoodsActivityInfo decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.type(ProtoAdapter.INT32.decode(protoReader));
                } else if (iNextTag != 2) {
                    FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                    builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.activityInfo(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, GoodsActivityInfo goodsActivityInfo) throws IOException {
            Integer num = goodsActivityInfo.type;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, num);
            }
            String str = goodsActivityInfo.activityInfo;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
            }
            protoWriter.writeBytes(goodsActivityInfo.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(GoodsActivityInfo goodsActivityInfo) {
            Integer num = goodsActivityInfo.type;
            int iEncodedSizeWithTag = num != null ? ProtoAdapter.INT32.encodedSizeWithTag(1, num) : 0;
            String str = goodsActivityInfo.activityInfo;
            return iEncodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) : 0) + goodsActivityInfo.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public GoodsActivityInfo redact(GoodsActivityInfo goodsActivityInfo) {
            Builder builderNewBuilder = goodsActivityInfo.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public GoodsActivityInfo(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoodsActivityInfo)) {
            return false;
        }
        GoodsActivityInfo goodsActivityInfo = (GoodsActivityInfo) obj;
        return getUnknownFields().equals(goodsActivityInfo.getUnknownFields()) && Internal.equals(this.type, goodsActivityInfo.type) && Internal.equals(this.activityInfo, goodsActivityInfo.activityInfo);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.activityInfo;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.activityInfo != null) {
            sb.append(", activityInfo=");
            sb.append(this.activityInfo);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "GoodsActivityInfo{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public GoodsActivityInfo(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.activityInfo = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.activityInfo = this.activityInfo;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
