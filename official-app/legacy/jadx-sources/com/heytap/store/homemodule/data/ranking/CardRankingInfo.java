package com.heytap.store.homemodule.data.ranking;

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
public final class CardRankingInfo extends Message<CardRankingInfo, Builder> {
    public static final ProtoAdapter<CardRankingInfo> ADAPTER = new ProtoAdapter_CardRankingInfo();
    public static final String DEFAULT_BACKGROUNDURL = "";
    public static final String DEFAULT_MAINTITLE = "";
    public static final String DEFAULT_RANKNAME = "";
    public static final String DEFAULT_SUBTITLE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String backgroundUrl;

    @WireField(adapter = "com.homestead.model.protobuf.RankingGoodsDetailVT#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<RankingGoodsDetailVT> goods;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String mainTitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String rankName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String subTitle;

    public static final class Builder extends Message.Builder<CardRankingInfo, Builder> {
        public String backgroundUrl;
        public List<RankingGoodsDetailVT> goods = Internal.newMutableList();
        public String mainTitle;
        public String rankName;
        public String subTitle;

        public Builder backgroundUrl(String str) {
            this.backgroundUrl = str;
            return this;
        }

        public Builder goods(List<RankingGoodsDetailVT> list) {
            Internal.checkElementsNotNull(list);
            this.goods = list;
            return this;
        }

        public Builder mainTitle(String str) {
            this.mainTitle = str;
            return this;
        }

        public Builder rankName(String str) {
            this.rankName = str;
            return this;
        }

        public Builder subTitle(String str) {
            this.subTitle = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CardRankingInfo build() {
            return new CardRankingInfo(this.mainTitle, this.subTitle, this.rankName, this.backgroundUrl, this.goods, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_CardRankingInfo extends ProtoAdapter<CardRankingInfo> {
        public ProtoAdapter_CardRankingInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) CardRankingInfo.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public CardRankingInfo decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.mainTitle(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.subTitle(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.rankName(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.backgroundUrl(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 5) {
                    FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                    builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.goods.add(RankingGoodsDetailVT.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, CardRankingInfo cardRankingInfo) throws IOException {
            String str = cardRankingInfo.mainTitle;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            String str2 = cardRankingInfo.subTitle;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str2);
            }
            String str3 = cardRankingInfo.rankName;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str3);
            }
            String str4 = cardRankingInfo.backgroundUrl;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, str4);
            }
            RankingGoodsDetailVT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, cardRankingInfo.goods);
            protoWriter.writeBytes(cardRankingInfo.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(CardRankingInfo cardRankingInfo) {
            String str = cardRankingInfo.mainTitle;
            int iEncodedSizeWithTag = str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0;
            String str2 = cardRankingInfo.subTitle;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str2) : 0);
            String str3 = cardRankingInfo.rankName;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str3) : 0);
            String str4 = cardRankingInfo.backgroundUrl;
            return iEncodedSizeWithTag3 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(4, str4) : 0) + RankingGoodsDetailVT.ADAPTER.asRepeated().encodedSizeWithTag(5, cardRankingInfo.goods) + cardRankingInfo.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public CardRankingInfo redact(CardRankingInfo cardRankingInfo) {
            Builder builderNewBuilder = cardRankingInfo.newBuilder();
            Internal.redactElements(builderNewBuilder.goods, RankingGoodsDetailVT.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public CardRankingInfo(String str, String str2, String str3, String str4, List<RankingGoodsDetailVT> list) {
        this(str, str2, str3, str4, list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardRankingInfo)) {
            return false;
        }
        CardRankingInfo cardRankingInfo = (CardRankingInfo) obj;
        return getUnknownFields().equals(cardRankingInfo.getUnknownFields()) && Internal.equals(this.mainTitle, cardRankingInfo.mainTitle) && Internal.equals(this.subTitle, cardRankingInfo.subTitle) && Internal.equals(this.rankName, cardRankingInfo.rankName) && Internal.equals(this.backgroundUrl, cardRankingInfo.backgroundUrl) && this.goods.equals(cardRankingInfo.goods);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        String str = this.mainTitle;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.rankName;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.backgroundUrl;
        int iHashCode5 = ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37) + this.goods.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mainTitle != null) {
            sb.append(", mainTitle=");
            sb.append(this.mainTitle);
        }
        if (this.subTitle != null) {
            sb.append(", subTitle=");
            sb.append(this.subTitle);
        }
        if (this.rankName != null) {
            sb.append(", rankName=");
            sb.append(this.rankName);
        }
        if (this.backgroundUrl != null) {
            sb.append(", backgroundUrl=");
            sb.append(this.backgroundUrl);
        }
        if (!this.goods.isEmpty()) {
            sb.append(", goods=");
            sb.append(this.goods);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "CardRankingInfo{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public CardRankingInfo(String str, String str2, String str3, String str4, List<RankingGoodsDetailVT> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mainTitle = str;
        this.subTitle = str2;
        this.rankName = str3;
        this.backgroundUrl = str4;
        this.goods = Internal.immutableCopyOf("goods", list);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.mainTitle = this.mainTitle;
        builder.subTitle = this.subTitle;
        builder.rankName = this.rankName;
        builder.backgroundUrl = this.backgroundUrl;
        builder.goods = Internal.copyOf("goods", this.goods);
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
