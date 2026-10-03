package com.heytap.store.homemodule.data.seckill;

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

/* JADX INFO: loaded from: classes5.dex */
public final class Seckill extends Message<Seckill, Builder> {
    public static final String DEFAULT_STATUS = "";
    public static final String DEFAULT_TITLE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long beginAt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long endAt;

    @WireField(adapter = "com.homestead.model.protobuf.SeckillGoodsVT#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<SeckillGoodsVT> goods;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long startAt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String title;
    public static final ProtoAdapter<Seckill> ADAPTER = new ProtoAdapter_Seckill();
    public static final Long DEFAULT_BEGINAT = 0L;
    public static final Long DEFAULT_STARTAT = 0L;
    public static final Long DEFAULT_ENDAT = 0L;

    public static final class Builder extends Message.Builder<Seckill, Builder> {
        public Long beginAt;
        public Long endAt;
        public List<SeckillGoodsVT> goods = Internal.newMutableList();
        public Long startAt;
        public String status;
        public String title;

        public Builder beginAt(Long l2) {
            this.beginAt = l2;
            return this;
        }

        public Builder endAt(Long l2) {
            this.endAt = l2;
            return this;
        }

        public Builder goods(List<SeckillGoodsVT> list) {
            Internal.checkElementsNotNull(list);
            this.goods = list;
            return this;
        }

        public Builder startAt(Long l2) {
            this.startAt = l2;
            return this;
        }

        public Builder status(String str) {
            this.status = str;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Seckill build() {
            return new Seckill(this.beginAt, this.startAt, this.endAt, this.title, this.status, this.goods, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_Seckill extends ProtoAdapter<Seckill> {
        public ProtoAdapter_Seckill() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Seckill.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Seckill decode(ProtoReader protoReader) throws IOException {
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
                        builder.beginAt(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 2:
                        builder.startAt(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 3:
                        builder.endAt(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 4:
                        builder.title(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 5:
                        builder.status(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 6:
                        builder.goods.add(SeckillGoodsVT.ADAPTER.decode(protoReader));
                        break;
                    default:
                        FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Seckill seckill) throws IOException {
            Long l2 = seckill.beginAt;
            if (l2 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, l2);
            }
            Long l3 = seckill.startAt;
            if (l3 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, l3);
            }
            Long l4 = seckill.endAt;
            if (l4 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, l4);
            }
            String str = seckill.title;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str);
            }
            String str2 = seckill.status;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str2);
            }
            SeckillGoodsVT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, seckill.goods);
            protoWriter.writeBytes(seckill.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Seckill seckill) {
            Long l2 = seckill.beginAt;
            int iEncodedSizeWithTag = l2 != null ? ProtoAdapter.INT64.encodedSizeWithTag(1, l2) : 0;
            Long l3 = seckill.startAt;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (l3 != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, l3) : 0);
            Long l4 = seckill.endAt;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (l4 != null ? ProtoAdapter.INT64.encodedSizeWithTag(3, l4) : 0);
            String str = seckill.title;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str) : 0);
            String str2 = seckill.status;
            return iEncodedSizeWithTag4 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str2) : 0) + SeckillGoodsVT.ADAPTER.asRepeated().encodedSizeWithTag(6, seckill.goods) + seckill.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Seckill redact(Seckill seckill) {
            Builder builderNewBuilder = seckill.newBuilder();
            Internal.redactElements(builderNewBuilder.goods, SeckillGoodsVT.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public Seckill(Long l2, Long l3, Long l4, String str, String str2, List<SeckillGoodsVT> list) {
        this(l2, l3, l4, str, str2, list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Seckill)) {
            return false;
        }
        Seckill seckill = (Seckill) obj;
        return getUnknownFields().equals(seckill.getUnknownFields()) && Internal.equals(this.beginAt, seckill.beginAt) && Internal.equals(this.startAt, seckill.startAt) && Internal.equals(this.endAt, seckill.endAt) && Internal.equals(this.title, seckill.title) && Internal.equals(this.status, seckill.status) && this.goods.equals(seckill.goods);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        Long l2 = this.beginAt;
        int iHashCode2 = (iHashCode + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.startAt;
        int iHashCode3 = (iHashCode2 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Long l4 = this.endAt;
        int iHashCode4 = (iHashCode3 + (l4 != null ? l4.hashCode() : 0)) * 37;
        String str = this.title;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.status;
        int iHashCode6 = ((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.goods.hashCode();
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.beginAt != null) {
            sb.append(", beginAt=");
            sb.append(this.beginAt);
        }
        if (this.startAt != null) {
            sb.append(", startAt=");
            sb.append(this.startAt);
        }
        if (this.endAt != null) {
            sb.append(", endAt=");
            sb.append(this.endAt);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (!this.goods.isEmpty()) {
            sb.append(", goods=");
            sb.append(this.goods);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Seckill{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public Seckill(Long l2, Long l3, Long l4, String str, String str2, List<SeckillGoodsVT> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.beginAt = l2;
        this.startAt = l3;
        this.endAt = l4;
        this.title = str;
        this.status = str2;
        this.goods = Internal.immutableCopyOf("goods", list);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.beginAt = this.beginAt;
        builder.startAt = this.startAt;
        builder.endAt = this.endAt;
        builder.title = this.title;
        builder.status = this.status;
        builder.goods = Internal.copyOf("goods", this.goods);
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
