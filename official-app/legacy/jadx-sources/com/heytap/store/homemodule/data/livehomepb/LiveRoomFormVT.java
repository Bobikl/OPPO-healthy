package com.heytap.store.homemodule.data.livehomepb;

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
public final class LiveRoomFormVT extends Message<LiveRoomFormVT, Builder> {
    public static final String DEFAULT_ACCOUNT = "";
    public static final String DEFAULT_ACCOUNTLOGO = "";
    public static final String DEFAULT_LINK = "";
    public static final String DEFAULT_LISTPICURL = "";
    public static final String DEFAULT_LIVENAME = "";
    public static final String DEFAULT_PULLURL = "";
    public static final String DEFAULT_SCREENSIZE = "";
    public static final String DEFAULT_STREAMCODE = "";
    public static final String DEFAULT_TITLE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String account;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String accountLogo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 9)
    public final List<String> activityInfos;

    @WireField(adapter = "com.homestead.model.protobuf.LiveCommentsVT#ADAPTER", label = WireField.Label.REPEATED, tag = 16)
    public final List<LiveCommentsVT> comments;

    @WireField(adapter = "com.homestead.model.protobuf.LiveGoodsVT#ADAPTER", label = WireField.Label.REPEATED, tag = 10)
    public final List<LiveGoodsVT> goods;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 12)
    public final Integer isAdvance;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 14)
    public final Integer isBooked;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 18)
    public final String link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 17)
    public final String listPicUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 21)
    public final String liveName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 15)
    public final Long nowTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 13)
    public final Long planStartTime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer pullType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String pullUrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 20)
    public final Long roomId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String screenSize;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long steamId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String streamCode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 19)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 11)
    public final Long viewNum;
    public static final ProtoAdapter<LiveRoomFormVT> ADAPTER = new ProtoAdapter_LiveRoomFormVT();
    public static final Long DEFAULT_STEAMID = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Integer DEFAULT_PULLTYPE = 0;
    public static final Long DEFAULT_VIEWNUM = 0L;
    public static final Integer DEFAULT_ISADVANCE = 0;
    public static final Long DEFAULT_PLANSTARTTIME = 0L;
    public static final Integer DEFAULT_ISBOOKED = 0;
    public static final Long DEFAULT_NOWTIME = 0L;
    public static final Long DEFAULT_ROOMID = 0L;

    public static final class Builder extends Message.Builder<LiveRoomFormVT, Builder> {
        public String account;
        public String accountLogo;
        public Integer isAdvance;
        public Integer isBooked;
        public String link;
        public String listPicUrl;
        public String liveName;
        public Long nowTime;
        public Long planStartTime;
        public Integer pullType;
        public String pullUrl;
        public Long roomId;
        public String screenSize;
        public Integer status;
        public Long steamId;
        public String streamCode;
        public String title;
        public Long viewNum;
        public List<String> activityInfos = Internal.newMutableList();
        public List<LiveGoodsVT> goods = Internal.newMutableList();
        public List<LiveCommentsVT> comments = Internal.newMutableList();

        public Builder account(String str) {
            this.account = str;
            return this;
        }

        public Builder accountLogo(String str) {
            this.accountLogo = str;
            return this;
        }

        public Builder activityInfos(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.activityInfos = list;
            return this;
        }

        public Builder comments(List<LiveCommentsVT> list) {
            Internal.checkElementsNotNull(list);
            this.comments = list;
            return this;
        }

        public Builder goods(List<LiveGoodsVT> list) {
            Internal.checkElementsNotNull(list);
            this.goods = list;
            return this;
        }

        public Builder isAdvance(Integer num) {
            this.isAdvance = num;
            return this;
        }

        public Builder isBooked(Integer num) {
            this.isBooked = num;
            return this;
        }

        public Builder link(String str) {
            this.link = str;
            return this;
        }

        public Builder listPicUrl(String str) {
            this.listPicUrl = str;
            return this;
        }

        public Builder liveName(String str) {
            this.liveName = str;
            return this;
        }

        public Builder nowTime(Long l2) {
            this.nowTime = l2;
            return this;
        }

        public Builder planStartTime(Long l2) {
            this.planStartTime = l2;
            return this;
        }

        public Builder pullType(Integer num) {
            this.pullType = num;
            return this;
        }

        public Builder pullUrl(String str) {
            this.pullUrl = str;
            return this;
        }

        public Builder roomId(Long l2) {
            this.roomId = l2;
            return this;
        }

        public Builder screenSize(String str) {
            this.screenSize = str;
            return this;
        }

        public Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public Builder steamId(Long l2) {
            this.steamId = l2;
            return this;
        }

        public Builder streamCode(String str) {
            this.streamCode = str;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder viewNum(Long l2) {
            this.viewNum = l2;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LiveRoomFormVT build() {
            return new LiveRoomFormVT(this.streamCode, this.steamId, this.status, this.pullType, this.pullUrl, this.screenSize, this.account, this.accountLogo, this.activityInfos, this.goods, this.viewNum, this.isAdvance, this.planStartTime, this.isBooked, this.nowTime, this.comments, this.listPicUrl, this.link, this.title, this.roomId, this.liveName, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_LiveRoomFormVT extends ProtoAdapter<LiveRoomFormVT> {
        public ProtoAdapter_LiveRoomFormVT() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) LiveRoomFormVT.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public LiveRoomFormVT decode(ProtoReader protoReader) throws IOException {
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
                        builder.streamCode(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.steamId(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 3:
                        builder.status(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 4:
                        builder.pullType(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 5:
                        builder.pullUrl(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 6:
                        builder.screenSize(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 7:
                        builder.account(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 8:
                        builder.accountLogo(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 9:
                        builder.activityInfos.add(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 10:
                        builder.goods.add(LiveGoodsVT.ADAPTER.decode(protoReader));
                        break;
                    case 11:
                        builder.viewNum(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 12:
                        builder.isAdvance(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 13:
                        builder.planStartTime(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 14:
                        builder.isBooked(ProtoAdapter.INT32.decode(protoReader));
                        break;
                    case 15:
                        builder.nowTime(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 16:
                        builder.comments.add(LiveCommentsVT.ADAPTER.decode(protoReader));
                        break;
                    case 17:
                        builder.listPicUrl(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 18:
                        builder.link(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 19:
                        builder.title(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 20:
                        builder.roomId(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 21:
                        builder.liveName(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        FieldEncoding nextFieldEncoding = protoReader.getNextFieldEncoding();
                        builder.addUnknownField(iNextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, LiveRoomFormVT liveRoomFormVT) throws IOException {
            String str = liveRoomFormVT.streamCode;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, str);
            }
            Long l2 = liveRoomFormVT.steamId;
            if (l2 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, l2);
            }
            Integer num = liveRoomFormVT.status;
            if (num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, num);
            }
            Integer num2 = liveRoomFormVT.pullType;
            if (num2 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, num2);
            }
            String str2 = liveRoomFormVT.pullUrl;
            if (str2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, str2);
            }
            String str3 = liveRoomFormVT.screenSize;
            if (str3 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, str3);
            }
            String str4 = liveRoomFormVT.account;
            if (str4 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, str4);
            }
            String str5 = liveRoomFormVT.accountLogo;
            if (str5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, str5);
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, liveRoomFormVT.activityInfos);
            LiveGoodsVT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, liveRoomFormVT.goods);
            Long l3 = liveRoomFormVT.viewNum;
            if (l3 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, l3);
            }
            Integer num3 = liveRoomFormVT.isAdvance;
            if (num3 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, num3);
            }
            Long l4 = liveRoomFormVT.planStartTime;
            if (l4 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, l4);
            }
            Integer num4 = liveRoomFormVT.isBooked;
            if (num4 != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 14, num4);
            }
            Long l5 = liveRoomFormVT.nowTime;
            if (l5 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 15, l5);
            }
            LiveCommentsVT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, liveRoomFormVT.comments);
            String str6 = liveRoomFormVT.listPicUrl;
            if (str6 != null) {
                protoAdapter.encodeWithTag(protoWriter, 17, str6);
            }
            String str7 = liveRoomFormVT.link;
            if (str7 != null) {
                protoAdapter.encodeWithTag(protoWriter, 18, str7);
            }
            String str8 = liveRoomFormVT.title;
            if (str8 != null) {
                protoAdapter.encodeWithTag(protoWriter, 19, str8);
            }
            Long l6 = liveRoomFormVT.roomId;
            if (l6 != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, l6);
            }
            String str9 = liveRoomFormVT.liveName;
            if (str9 != null) {
                protoAdapter.encodeWithTag(protoWriter, 21, str9);
            }
            protoWriter.writeBytes(liveRoomFormVT.getUnknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(LiveRoomFormVT liveRoomFormVT) {
            String str = liveRoomFormVT.streamCode;
            int iEncodedSizeWithTag = str != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, str) : 0;
            Long l2 = liveRoomFormVT.steamId;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + (l2 != null ? ProtoAdapter.INT64.encodedSizeWithTag(2, l2) : 0);
            Integer num = liveRoomFormVT.status;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + (num != null ? ProtoAdapter.INT32.encodedSizeWithTag(3, num) : 0);
            Integer num2 = liveRoomFormVT.pullType;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + (num2 != null ? ProtoAdapter.INT32.encodedSizeWithTag(4, num2) : 0);
            String str2 = liveRoomFormVT.pullUrl;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + (str2 != null ? ProtoAdapter.STRING.encodedSizeWithTag(5, str2) : 0);
            String str3 = liveRoomFormVT.screenSize;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + (str3 != null ? ProtoAdapter.STRING.encodedSizeWithTag(6, str3) : 0);
            String str4 = liveRoomFormVT.account;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + (str4 != null ? ProtoAdapter.STRING.encodedSizeWithTag(7, str4) : 0);
            String str5 = liveRoomFormVT.accountLogo;
            int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + (str5 != null ? ProtoAdapter.STRING.encodedSizeWithTag(8, str5) : 0);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag9 = iEncodedSizeWithTag8 + protoAdapter.asRepeated().encodedSizeWithTag(9, liveRoomFormVT.activityInfos) + LiveGoodsVT.ADAPTER.asRepeated().encodedSizeWithTag(10, liveRoomFormVT.goods);
            Long l3 = liveRoomFormVT.viewNum;
            int iEncodedSizeWithTag10 = iEncodedSizeWithTag9 + (l3 != null ? ProtoAdapter.INT64.encodedSizeWithTag(11, l3) : 0);
            Integer num3 = liveRoomFormVT.isAdvance;
            int iEncodedSizeWithTag11 = iEncodedSizeWithTag10 + (num3 != null ? ProtoAdapter.INT32.encodedSizeWithTag(12, num3) : 0);
            Long l4 = liveRoomFormVT.planStartTime;
            int iEncodedSizeWithTag12 = iEncodedSizeWithTag11 + (l4 != null ? ProtoAdapter.INT64.encodedSizeWithTag(13, l4) : 0);
            Integer num4 = liveRoomFormVT.isBooked;
            int iEncodedSizeWithTag13 = iEncodedSizeWithTag12 + (num4 != null ? ProtoAdapter.INT32.encodedSizeWithTag(14, num4) : 0);
            Long l5 = liveRoomFormVT.nowTime;
            int iEncodedSizeWithTag14 = iEncodedSizeWithTag13 + (l5 != null ? ProtoAdapter.INT64.encodedSizeWithTag(15, l5) : 0) + LiveCommentsVT.ADAPTER.asRepeated().encodedSizeWithTag(16, liveRoomFormVT.comments);
            String str6 = liveRoomFormVT.listPicUrl;
            int iEncodedSizeWithTag15 = iEncodedSizeWithTag14 + (str6 != null ? protoAdapter.encodedSizeWithTag(17, str6) : 0);
            String str7 = liveRoomFormVT.link;
            int iEncodedSizeWithTag16 = iEncodedSizeWithTag15 + (str7 != null ? protoAdapter.encodedSizeWithTag(18, str7) : 0);
            String str8 = liveRoomFormVT.title;
            int iEncodedSizeWithTag17 = iEncodedSizeWithTag16 + (str8 != null ? protoAdapter.encodedSizeWithTag(19, str8) : 0);
            Long l6 = liveRoomFormVT.roomId;
            int iEncodedSizeWithTag18 = iEncodedSizeWithTag17 + (l6 != null ? ProtoAdapter.INT64.encodedSizeWithTag(20, l6) : 0);
            String str9 = liveRoomFormVT.liveName;
            return iEncodedSizeWithTag18 + (str9 != null ? protoAdapter.encodedSizeWithTag(21, str9) : 0) + liveRoomFormVT.getUnknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public LiveRoomFormVT redact(LiveRoomFormVT liveRoomFormVT) {
            Builder builderNewBuilder = liveRoomFormVT.newBuilder();
            Internal.redactElements(builderNewBuilder.goods, LiveGoodsVT.ADAPTER);
            Internal.redactElements(builderNewBuilder.comments, LiveCommentsVT.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public LiveRoomFormVT(String str, Long l2, Integer num, Integer num2, String str2, String str3, String str4, String str5, List<String> list, List<LiveGoodsVT> list2, Long l3, Integer num3, Long l4, Integer num4, Long l5, List<LiveCommentsVT> list3, String str6, String str7, String str8, Long l6, String str9) {
        this(str, l2, num, num2, str2, str3, str4, str5, list, list2, l3, num3, l4, num4, l5, list3, str6, str7, str8, l6, str9, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRoomFormVT)) {
            return false;
        }
        LiveRoomFormVT liveRoomFormVT = (LiveRoomFormVT) obj;
        return getUnknownFields().equals(liveRoomFormVT.getUnknownFields()) && Internal.equals(this.streamCode, liveRoomFormVT.streamCode) && Internal.equals(this.steamId, liveRoomFormVT.steamId) && Internal.equals(this.status, liveRoomFormVT.status) && Internal.equals(this.pullType, liveRoomFormVT.pullType) && Internal.equals(this.pullUrl, liveRoomFormVT.pullUrl) && Internal.equals(this.screenSize, liveRoomFormVT.screenSize) && Internal.equals(this.account, liveRoomFormVT.account) && Internal.equals(this.accountLogo, liveRoomFormVT.accountLogo) && this.activityInfos.equals(liveRoomFormVT.activityInfos) && this.goods.equals(liveRoomFormVT.goods) && Internal.equals(this.viewNum, liveRoomFormVT.viewNum) && Internal.equals(this.isAdvance, liveRoomFormVT.isAdvance) && Internal.equals(this.planStartTime, liveRoomFormVT.planStartTime) && Internal.equals(this.isBooked, liveRoomFormVT.isBooked) && Internal.equals(this.nowTime, liveRoomFormVT.nowTime) && this.comments.equals(liveRoomFormVT.comments) && Internal.equals(this.listPicUrl, liveRoomFormVT.listPicUrl) && Internal.equals(this.link, liveRoomFormVT.link) && Internal.equals(this.title, liveRoomFormVT.title) && Internal.equals(this.roomId, liveRoomFormVT.roomId) && Internal.equals(this.liveName, liveRoomFormVT.liveName);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() * 37;
        String str = this.streamCode;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.steamId;
        int iHashCode3 = (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Integer num = this.status;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.pullType;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str2 = this.pullUrl;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.screenSize;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.account;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.accountLogo;
        int iHashCode9 = (((((iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37) + this.activityInfos.hashCode()) * 37) + this.goods.hashCode()) * 37;
        Long l3 = this.viewNum;
        int iHashCode10 = (iHashCode9 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Integer num3 = this.isAdvance;
        int iHashCode11 = (iHashCode10 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Long l4 = this.planStartTime;
        int iHashCode12 = (iHashCode11 + (l4 != null ? l4.hashCode() : 0)) * 37;
        Integer num4 = this.isBooked;
        int iHashCode13 = (iHashCode12 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Long l5 = this.nowTime;
        int iHashCode14 = (((iHashCode13 + (l5 != null ? l5.hashCode() : 0)) * 37) + this.comments.hashCode()) * 37;
        String str6 = this.listPicUrl;
        int iHashCode15 = (iHashCode14 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.link;
        int iHashCode16 = (iHashCode15 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.title;
        int iHashCode17 = (iHashCode16 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Long l6 = this.roomId;
        int iHashCode18 = (iHashCode17 + (l6 != null ? l6.hashCode() : 0)) * 37;
        String str9 = this.liveName;
        int iHashCode19 = iHashCode18 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode19;
        return iHashCode19;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.streamCode != null) {
            sb.append(", streamCode=");
            sb.append(this.streamCode);
        }
        if (this.steamId != null) {
            sb.append(", steamId=");
            sb.append(this.steamId);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.pullType != null) {
            sb.append(", pullType=");
            sb.append(this.pullType);
        }
        if (this.pullUrl != null) {
            sb.append(", pullUrl=");
            sb.append(this.pullUrl);
        }
        if (this.screenSize != null) {
            sb.append(", screenSize=");
            sb.append(this.screenSize);
        }
        if (this.account != null) {
            sb.append(", account=");
            sb.append(this.account);
        }
        if (this.accountLogo != null) {
            sb.append(", accountLogo=");
            sb.append(this.accountLogo);
        }
        if (!this.activityInfos.isEmpty()) {
            sb.append(", activityInfos=");
            sb.append(this.activityInfos);
        }
        if (!this.goods.isEmpty()) {
            sb.append(", goods=");
            sb.append(this.goods);
        }
        if (this.viewNum != null) {
            sb.append(", viewNum=");
            sb.append(this.viewNum);
        }
        if (this.isAdvance != null) {
            sb.append(", isAdvance=");
            sb.append(this.isAdvance);
        }
        if (this.planStartTime != null) {
            sb.append(", planStartTime=");
            sb.append(this.planStartTime);
        }
        if (this.isBooked != null) {
            sb.append(", isBooked=");
            sb.append(this.isBooked);
        }
        if (this.nowTime != null) {
            sb.append(", nowTime=");
            sb.append(this.nowTime);
        }
        if (!this.comments.isEmpty()) {
            sb.append(", comments=");
            sb.append(this.comments);
        }
        if (this.listPicUrl != null) {
            sb.append(", listPicUrl=");
            sb.append(this.listPicUrl);
        }
        if (this.link != null) {
            sb.append(", link=");
            sb.append(this.link);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.roomId != null) {
            sb.append(", roomId=");
            sb.append(this.roomId);
        }
        if (this.liveName != null) {
            sb.append(", liveName=");
            sb.append(this.liveName);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "LiveRoomFormVT{");
        sbReplace.append('}');
        return sbReplace.toString();
    }

    public LiveRoomFormVT(String str, Long l2, Integer num, Integer num2, String str2, String str3, String str4, String str5, List<String> list, List<LiveGoodsVT> list2, Long l3, Integer num3, Long l4, Integer num4, Long l5, List<LiveCommentsVT> list3, String str6, String str7, String str8, Long l6, String str9, ByteString byteString) {
        super(ADAPTER, byteString);
        this.streamCode = str;
        this.steamId = l2;
        this.status = num;
        this.pullType = num2;
        this.pullUrl = str2;
        this.screenSize = str3;
        this.account = str4;
        this.accountLogo = str5;
        this.activityInfos = Internal.immutableCopyOf("activityInfos", list);
        this.goods = Internal.immutableCopyOf("goods", list2);
        this.viewNum = l3;
        this.isAdvance = num3;
        this.planStartTime = l4;
        this.isBooked = num4;
        this.nowTime = l5;
        this.comments = Internal.immutableCopyOf("comments", list3);
        this.listPicUrl = str6;
        this.link = str7;
        this.title = str8;
        this.roomId = l6;
        this.liveName = str9;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.streamCode = this.streamCode;
        builder.steamId = this.steamId;
        builder.status = this.status;
        builder.pullType = this.pullType;
        builder.pullUrl = this.pullUrl;
        builder.screenSize = this.screenSize;
        builder.account = this.account;
        builder.accountLogo = this.accountLogo;
        builder.activityInfos = Internal.copyOf("activityInfos", this.activityInfos);
        builder.goods = Internal.copyOf("goods", this.goods);
        builder.viewNum = this.viewNum;
        builder.isAdvance = this.isAdvance;
        builder.planStartTime = this.planStartTime;
        builder.isBooked = this.isBooked;
        builder.nowTime = this.nowTime;
        builder.comments = Internal.copyOf("comments", this.comments);
        builder.listPicUrl = this.listPicUrl;
        builder.link = this.link;
        builder.title = this.title;
        builder.roomId = this.roomId;
        builder.liveName = this.liveName;
        builder.addUnknownFields(getUnknownFields());
        return builder;
    }
}
