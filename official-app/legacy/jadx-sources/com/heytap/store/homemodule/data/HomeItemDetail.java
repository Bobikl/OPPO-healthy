package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\bx\b\u0017\u0018\u00002\u00020\u0001Bí\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0013\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0015\u0012\b\b\u0002\u0010%\u001a\u00020\u0015\u0012\b\b\u0002\u0010&\u001a\u00020\u0015\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\b\b\u0002\u0010*\u001a\u00020\u0005\u0012\b\b\u0002\u0010+\u001a\u00020,\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020\u0005\u0012\b\b\u0002\u00100\u001a\u00020\u0005\u0012\b\b\u0002\u00101\u001a\u00020\u0015\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00103\u001a\u00020\u0015\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000105\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0013\u0012\b\b\u0002\u00107\u001a\u00020\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0003\u0012\b\b\u0002\u00109\u001a\u00020\u0003\u0012\b\b\u0002\u0010:\u001a\u00020\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010=\u001a\u00020\u0015\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010D\u001a\u00020\u0003\u0012\b\b\u0002\u0010E\u001a\u00020\u0005\u0012\b\b\u0002\u0010F\u001a\u00020\u0005\u0012\b\b\u0002\u0010G\u001a\u00020\u0005¢\u0006\u0002\u0010HJ\u0007\u0010ß\u0001\u001a\u00020\u0000R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010-\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010.\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010*\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010+\u001a\u00020,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010N\"\u0004\bZ\u0010PR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010V\"\u0004\b`\u0010XR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010R\"\u0004\bf\u0010TR\u001c\u0010g\u001a\u0004\u0018\u00010hX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u00100\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010V\"\u0004\bn\u0010XR\u001a\u0010E\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010V\"\u0004\bp\u0010XR\u001a\u0010F\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010V\"\u0004\br\u0010XR\u001c\u0010s\u001a\u0004\u0018\u00010hX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010j\"\u0004\bu\u0010lR\u001c\u0010;\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010R\"\u0004\b\u007f\u0010TR \u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010D\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010R\"\u0005\b\u0085\u0001\u0010TR#\u0010<\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u00109\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010R\"\u0005\b\u008c\u0001\u0010TR\u001c\u00108\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010R\"\u0005\b\u008e\u0001\u0010TR \u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010R\"\u0005\b\u0094\u0001\u0010TR\u001e\u00102\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010V\"\u0005\b\u0096\u0001\u0010XR$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010{\"\u0005\b\u0098\u0001\u0010}R\u001d\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0014\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001d\u00103\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b3\u0010\u0099\u0001\"\u0006\b\u009c\u0001\u0010\u009b\u0001R\u001c\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010V\"\u0005\b\u009e\u0001\u0010XR \u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R\u001c\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010V\"\u0005\b¤\u0001\u0010XR \u00104\u001a\u0004\u0018\u000105X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R$\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010{\"\u0005\bª\u0001\u0010}R\u001c\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010R\"\u0005\b¬\u0001\u0010TR\u001c\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010V\"\u0005\b®\u0001\u0010XR\u001c\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010R\"\u0005\b°\u0001\u0010TR\u001c\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010R\"\u0005\b²\u0001\u0010TR#\u0010@\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0015\n\u0003\u0010\u008a\u0001\u001a\u0006\b³\u0001\u0010\u0087\u0001\"\u0006\b´\u0001\u0010\u0089\u0001R \u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R \u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R\u001e\u0010=\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b½\u0001\u0010\u0099\u0001\"\u0006\b¾\u0001\u0010\u009b\u0001R\u001c\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¿\u0001\u0010V\"\u0005\bÀ\u0001\u0010XR\u001c\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÁ\u0001\u0010V\"\u0005\bÂ\u0001\u0010XR$\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÃ\u0001\u0010{\"\u0005\bÄ\u0001\u0010}R\u001c\u0010:\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÅ\u0001\u0010R\"\u0005\bÆ\u0001\u0010TR\u001c\u00107\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010V\"\u0005\bÈ\u0001\u0010XR\u001c\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÉ\u0001\u0010R\"\u0005\bÊ\u0001\u0010TR\u001c\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bË\u0001\u0010V\"\u0005\bÌ\u0001\u0010XR\u001c\u0010/\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010V\"\u0005\bÎ\u0001\u0010XR\u001e\u00101\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÏ\u0001\u0010\u0099\u0001\"\u0006\bÐ\u0001\u0010\u009b\u0001R\u001e\u0010$\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÑ\u0001\u0010\u0099\u0001\"\u0006\bÒ\u0001\u0010\u009b\u0001R\u001e\u0010%\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÓ\u0001\u0010\u0099\u0001\"\u0006\bÔ\u0001\u0010\u009b\u0001R\u001e\u0010&\u001a\u00020\u0015X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÕ\u0001\u0010\u0099\u0001\"\u0006\bÖ\u0001\u0010\u009b\u0001R\u001c\u0010'\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b×\u0001\u0010V\"\u0005\bØ\u0001\u0010XR\u001c\u0010G\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÙ\u0001\u0010V\"\u0005\bÚ\u0001\u0010XR\u001c\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÛ\u0001\u0010R\"\u0005\bÜ\u0001\u0010TR\u001c\u0010)\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÝ\u0001\u0010V\"\u0005\bÞ\u0001\u0010X¨\u0006à\u0001"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeItemDetail;", "", "id", "", "backgroundColor", "", "backgroundPic", "backgroundPicJson", "pic", "picJson", "cardSpecialInfo", "Lcom/heytap/store/homemodule/data/CardSpecialInfo;", "newsTitleForm", "Lcom/heytap/store/homemodule/data/NewsTitleForm;", "cardType", "goodsCardType", "goodsForm", "Lcom/heytap/store/homemodule/data/GoodsDetailInfo;", "interPics", "", "isLogin", "", "jsonValue", "labelDetailsInfo", "Lcom/heytap/store/homemodule/data/LabelDetailsInfo;", "link", "mediaType", "nameLabel", "nameLabelWidth", "nameLabelHeight", "newProduct", "Lcom/heytap/store/homemodule/data/NewProduct;", "picList", "Lcom/heytap/store/homemodule/data/PicLinkDetail;", "rowNum", "secondTitle", "showSoundButton", "supportOneShot", "switchValue", "title", "type", "video", "alphaVideo", "alphaVideoRatio", "", "alphaAddBigScale", "alphaAlignHigh", "sensorId", "contentSensorId", "showInformationAdvert", "informationId", "isShowNotInterestedButton", "liveInfoForm", "Lcom/heytap/store/homemodule/data/LiveInfoForm;", "liveInfoForms", "purposeId", "groupId", "gridType", "position", "extendObj", "goodsSourceType", "pendantShow", "advertPendantInfo", "Lcom/heytap/store/homemodule/data/AdvertPendantInfo;", "navigateStyle", "goodGridDetails", "hotZone", "Lcom/heytap/store/homemodule/data/HotZoneInfo;", "goodsPicType", "creditsExpansionActivityId", "creditsExpansionActivityName", "transparent", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/homemodule/data/CardSpecialInfo;Lcom/heytap/store/homemodule/data/NewsTitleForm;IILcom/heytap/store/homemodule/data/GoodsDetailInfo;Ljava/util/List;ZLjava/lang/String;Lcom/heytap/store/homemodule/data/LabelDetailsInfo;Ljava/lang/String;ILjava/lang/String;IILcom/heytap/store/homemodule/data/NewProduct;Ljava/util/List;ILjava/lang/String;ZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;FFILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLcom/heytap/store/homemodule/data/LiveInfoForm;Ljava/util/List;Ljava/lang/String;IIILjava/lang/Object;Ljava/lang/Integer;ZLcom/heytap/store/homemodule/data/AdvertPendantInfo;Ljava/lang/Integer;Ljava/util/List;Lcom/heytap/store/homemodule/data/HotZoneInfo;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertPendantInfo", "()Lcom/heytap/store/homemodule/data/AdvertPendantInfo;", "setAdvertPendantInfo", "(Lcom/heytap/store/homemodule/data/AdvertPendantInfo;)V", "getAlphaAddBigScale", "()F", "setAlphaAddBigScale", "(F)V", "getAlphaAlignHigh", "()I", "setAlphaAlignHigh", "(I)V", "getAlphaVideo", "()Ljava/lang/String;", "setAlphaVideo", "(Ljava/lang/String;)V", "getAlphaVideoRatio", "setAlphaVideoRatio", "getBackgroundColor", "setBackgroundColor", "getBackgroundPic", "setBackgroundPic", "getBackgroundPicJson", "setBackgroundPicJson", "getCardSpecialInfo", "()Lcom/heytap/store/homemodule/data/CardSpecialInfo;", "setCardSpecialInfo", "(Lcom/heytap/store/homemodule/data/CardSpecialInfo;)V", "getCardType", "setCardType", "clickReportBean", "Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "getClickReportBean", "()Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "setClickReportBean", "(Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;)V", "getContentSensorId", "setContentSensorId", "getCreditsExpansionActivityId", "setCreditsExpansionActivityId", "getCreditsExpansionActivityName", "setCreditsExpansionActivityName", "exposureReportBean", "getExposureReportBean", "setExposureReportBean", "getExtendObj", "()Ljava/lang/Object;", "setExtendObj", "(Ljava/lang/Object;)V", "getGoodGridDetails", "()Ljava/util/List;", "setGoodGridDetails", "(Ljava/util/List;)V", "getGoodsCardType", "setGoodsCardType", "getGoodsForm", "()Lcom/heytap/store/homemodule/data/GoodsDetailInfo;", "setGoodsForm", "(Lcom/heytap/store/homemodule/data/GoodsDetailInfo;)V", "getGoodsPicType", "setGoodsPicType", "getGoodsSourceType", "()Ljava/lang/Integer;", "setGoodsSourceType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGridType", "setGridType", "getGroupId", "setGroupId", "getHotZone", "()Lcom/heytap/store/homemodule/data/HotZoneInfo;", "setHotZone", "(Lcom/heytap/store/homemodule/data/HotZoneInfo;)V", "getId", "setId", "getInformationId", "setInformationId", "getInterPics", "setInterPics", "()Z", "setLogin", "(Z)V", "setShowNotInterestedButton", "getJsonValue", "setJsonValue", "getLabelDetailsInfo", "()Lcom/heytap/store/homemodule/data/LabelDetailsInfo;", "setLabelDetailsInfo", "(Lcom/heytap/store/homemodule/data/LabelDetailsInfo;)V", "getLink", "setLink", "getLiveInfoForm", "()Lcom/heytap/store/homemodule/data/LiveInfoForm;", "setLiveInfoForm", "(Lcom/heytap/store/homemodule/data/LiveInfoForm;)V", "getLiveInfoForms", "setLiveInfoForms", "getMediaType", "setMediaType", "getNameLabel", "setNameLabel", "getNameLabelHeight", "setNameLabelHeight", "getNameLabelWidth", "setNameLabelWidth", "getNavigateStyle", "setNavigateStyle", "getNewProduct", "()Lcom/heytap/store/homemodule/data/NewProduct;", "setNewProduct", "(Lcom/heytap/store/homemodule/data/NewProduct;)V", "getNewsTitleForm", "()Lcom/heytap/store/homemodule/data/NewsTitleForm;", "setNewsTitleForm", "(Lcom/heytap/store/homemodule/data/NewsTitleForm;)V", "getPendantShow", "setPendantShow", "getPic", "setPic", "getPicJson", "setPicJson", "getPicList", "setPicList", "getPosition", "setPosition", "getPurposeId", "setPurposeId", "getRowNum", "setRowNum", "getSecondTitle", "setSecondTitle", "getSensorId", "setSensorId", "getShowInformationAdvert", "setShowInformationAdvert", "getShowSoundButton", "setShowSoundButton", "getSupportOneShot", "setSupportOneShot", "getSwitchValue", "setSwitchValue", "getTitle", "setTitle", "getTransparent", "setTransparent", "getType", "setType", "getVideo", "setVideo", "clone", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class HomeItemDetail {

    @Nullable
    private AdvertPendantInfo advertPendantInfo;
    private float alphaAddBigScale;
    private int alphaAlignHigh;

    @NotNull
    private String alphaVideo;
    private float alphaVideoRatio;

    @NotNull
    private String backgroundColor;

    @NotNull
    private String backgroundPic;

    @NotNull
    private String backgroundPicJson;

    @Nullable
    private CardSpecialInfo cardSpecialInfo;
    private int cardType;

    @Nullable
    private SensorsBean clickReportBean;

    @NotNull
    private String contentSensorId;

    @NotNull
    private String creditsExpansionActivityId;

    @NotNull
    private String creditsExpansionActivityName;

    @Nullable
    private SensorsBean exposureReportBean;

    @Nullable
    private Object extendObj;

    @Nullable
    private List<? extends HomeItemDetail> goodGridDetails;
    private int goodsCardType;

    @Nullable
    private GoodsDetailInfo goodsForm;
    private int goodsPicType;

    @Nullable
    private Integer goodsSourceType;
    private int gridType;
    private int groupId;

    @Nullable
    private HotZoneInfo hotZone;
    private int id;

    @Nullable
    private String informationId;

    @Nullable
    private List<String> interPics;
    private boolean isLogin;
    private boolean isShowNotInterestedButton;

    @NotNull
    private String jsonValue;

    @Nullable
    private LabelDetailsInfo labelDetailsInfo;

    @NotNull
    private String link;

    @Nullable
    private LiveInfoForm liveInfoForm;

    @Nullable
    private List<LiveInfoForm> liveInfoForms;
    private int mediaType;

    @NotNull
    private String nameLabel;
    private int nameLabelHeight;
    private int nameLabelWidth;

    @Nullable
    private Integer navigateStyle;

    @Nullable
    private NewProduct newProduct;

    @Nullable
    private NewsTitleForm newsTitleForm;
    private boolean pendantShow;

    @NotNull
    private String pic;

    @NotNull
    private String picJson;

    @Nullable
    private List<? extends PicLinkDetail> picList;
    private int position;

    @NotNull
    private String purposeId;
    private int rowNum;

    @NotNull
    private String secondTitle;

    @NotNull
    private String sensorId;
    private boolean showInformationAdvert;
    private boolean showSoundButton;
    private boolean supportOneShot;
    private boolean switchValue;

    @NotNull
    private String title;

    @NotNull
    private String transparent;
    private int type;

    @NotNull
    private String video;

    public HomeItemDetail() {
        this(0, null, null, null, null, null, null, null, 0, 0, null, null, false, null, null, null, 0, null, 0, 0, null, null, 0, null, false, false, false, null, 0, null, null, 0.0f, 0.0f, 0, null, null, false, null, false, null, null, null, 0, 0, 0, null, null, false, null, null, null, null, 0, null, null, null, -1, 16777215, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HomeItemDetail clone() {
        HomeItemDetail homeItemDetail = new HomeItemDetail(0, null, null, null, null, null, null, null, 0, 0, null, null, false, null, null, 0 == true ? 1 : 0, 0, null, 0, 0, null, null, 0, null, false, false, false, null, 0, null, null, 0.0f, 0.0f, 0, null, null, false, null, false, null, null, null, 0, 0, 0, null, null, false, null, null, null, null, 0, null, null, null, -1, 16777215, null);
        homeItemDetail.setGoodsForm(getGoodsForm());
        homeItemDetail.setPic(getPic());
        homeItemDetail.setBackgroundPic(getBackgroundPic());
        homeItemDetail.setBackgroundPicJson(getBackgroundPicJson());
        homeItemDetail.setBackgroundColor(getBackgroundColor());
        homeItemDetail.setLabelDetailsInfo(getLabelDetailsInfo());
        homeItemDetail.setTitle(getTitle());
        homeItemDetail.setLink(getLink());
        homeItemDetail.setCardSpecialInfo(getCardSpecialInfo());
        homeItemDetail.setCardType(getCardType());
        homeItemDetail.setExtendObj(getExtendObj());
        homeItemDetail.setGoodsCardType(getGoodsCardType());
        homeItemDetail.setId(getId());
        homeItemDetail.setInterPics(getInterPics());
        homeItemDetail.setLogin(getIsLogin());
        homeItemDetail.setShowNotInterestedButton(getIsShowNotInterestedButton());
        homeItemDetail.setJsonValue(getJsonValue());
        homeItemDetail.setLiveInfoForm(getLiveInfoForm());
        homeItemDetail.setMediaType(getMediaType());
        homeItemDetail.setNameLabel(getNameLabel());
        homeItemDetail.setNameLabelHeight(getNameLabelHeight());
        homeItemDetail.setNameLabelWidth(getNameLabelWidth());
        homeItemDetail.setNewProduct(getNewProduct());
        homeItemDetail.setNewsTitleForm(getNewsTitleForm());
        homeItemDetail.setPicJson(getPicJson());
        homeItemDetail.setPurposeId(getPurposeId());
        homeItemDetail.setPicList(getPicList());
        homeItemDetail.setPosition(getPosition());
        homeItemDetail.setRowNum(getRowNum());
        homeItemDetail.setSecondTitle(getSecondTitle());
        homeItemDetail.setSensorId(getSensorId());
        homeItemDetail.setShowSoundButton(getShowSoundButton());
        homeItemDetail.setGroupId(getGroupId());
        homeItemDetail.setSupportOneShot(getSupportOneShot());
        homeItemDetail.setSwitchValue(getSwitchValue());
        homeItemDetail.setVideo(getVideo());
        homeItemDetail.setType(getType());
        homeItemDetail.setGridType(getGridType());
        homeItemDetail.setGoodsSourceType(getGoodsSourceType());
        homeItemDetail.setNavigateStyle(getNavigateStyle());
        homeItemDetail.setGoodGridDetails(getGoodGridDetails());
        homeItemDetail.setGoodsPicType(getGoodsPicType());
        homeItemDetail.setHotZone(getHotZone());
        homeItemDetail.setCreditsExpansionActivityId(getCreditsExpansionActivityId());
        homeItemDetail.setCreditsExpansionActivityName(getCreditsExpansionActivityName());
        homeItemDetail.setTransparent(getTransparent());
        return homeItemDetail;
    }

    @Nullable
    public final AdvertPendantInfo getAdvertPendantInfo() {
        return this.advertPendantInfo;
    }

    public final float getAlphaAddBigScale() {
        return this.alphaAddBigScale;
    }

    public final int getAlphaAlignHigh() {
        return this.alphaAlignHigh;
    }

    @NotNull
    public final String getAlphaVideo() {
        return this.alphaVideo;
    }

    public final float getAlphaVideoRatio() {
        return this.alphaVideoRatio;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getBackgroundPic() {
        return this.backgroundPic;
    }

    @NotNull
    public final String getBackgroundPicJson() {
        return this.backgroundPicJson;
    }

    @Nullable
    public final CardSpecialInfo getCardSpecialInfo() {
        return this.cardSpecialInfo;
    }

    public final int getCardType() {
        return this.cardType;
    }

    @Nullable
    public final SensorsBean getClickReportBean() {
        return this.clickReportBean;
    }

    @NotNull
    public final String getContentSensorId() {
        return this.contentSensorId;
    }

    @NotNull
    public final String getCreditsExpansionActivityId() {
        return this.creditsExpansionActivityId;
    }

    @NotNull
    public final String getCreditsExpansionActivityName() {
        return this.creditsExpansionActivityName;
    }

    @Nullable
    public final SensorsBean getExposureReportBean() {
        return this.exposureReportBean;
    }

    @Nullable
    public final Object getExtendObj() {
        return this.extendObj;
    }

    @Nullable
    public final List<HomeItemDetail> getGoodGridDetails() {
        return this.goodGridDetails;
    }

    public final int getGoodsCardType() {
        return this.goodsCardType;
    }

    @Nullable
    public final GoodsDetailInfo getGoodsForm() {
        return this.goodsForm;
    }

    public final int getGoodsPicType() {
        return this.goodsPicType;
    }

    @Nullable
    public final Integer getGoodsSourceType() {
        return this.goodsSourceType;
    }

    public final int getGridType() {
        return this.gridType;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final HotZoneInfo getHotZone() {
        return this.hotZone;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getInformationId() {
        return this.informationId;
    }

    @Nullable
    public final List<String> getInterPics() {
        return this.interPics;
    }

    @NotNull
    public final String getJsonValue() {
        return this.jsonValue;
    }

    @Nullable
    public final LabelDetailsInfo getLabelDetailsInfo() {
        return this.labelDetailsInfo;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final LiveInfoForm getLiveInfoForm() {
        return this.liveInfoForm;
    }

    @Nullable
    public final List<LiveInfoForm> getLiveInfoForms() {
        return this.liveInfoForms;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final String getNameLabel() {
        return this.nameLabel;
    }

    public final int getNameLabelHeight() {
        return this.nameLabelHeight;
    }

    public final int getNameLabelWidth() {
        return this.nameLabelWidth;
    }

    @Nullable
    public final Integer getNavigateStyle() {
        return this.navigateStyle;
    }

    @Nullable
    public final NewProduct getNewProduct() {
        return this.newProduct;
    }

    @Nullable
    public final NewsTitleForm getNewsTitleForm() {
        return this.newsTitleForm;
    }

    public final boolean getPendantShow() {
        return this.pendantShow;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    @NotNull
    public final String getPicJson() {
        return this.picJson;
    }

    @Nullable
    public final List<PicLinkDetail> getPicList() {
        return this.picList;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getPurposeId() {
        return this.purposeId;
    }

    public final int getRowNum() {
        return this.rowNum;
    }

    @NotNull
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    @NotNull
    public final String getSensorId() {
        return this.sensorId;
    }

    public final boolean getShowInformationAdvert() {
        return this.showInformationAdvert;
    }

    public final boolean getShowSoundButton() {
        return this.showSoundButton;
    }

    public final boolean getSupportOneShot() {
        return this.supportOneShot;
    }

    public final boolean getSwitchValue() {
        return this.switchValue;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTransparent() {
        return this.transparent;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getVideo() {
        return this.video;
    }

    /* JADX INFO: renamed from: isLogin, reason: from getter */
    public final boolean getIsLogin() {
        return this.isLogin;
    }

    /* JADX INFO: renamed from: isShowNotInterestedButton, reason: from getter */
    public final boolean getIsShowNotInterestedButton() {
        return this.isShowNotInterestedButton;
    }

    public final void setAdvertPendantInfo(@Nullable AdvertPendantInfo advertPendantInfo) {
        this.advertPendantInfo = advertPendantInfo;
    }

    public final void setAlphaAddBigScale(float f) {
        this.alphaAddBigScale = f;
    }

    public final void setAlphaAlignHigh(int i) {
        this.alphaAlignHigh = i;
    }

    public final void setAlphaVideo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alphaVideo = str;
    }

    public final void setAlphaVideoRatio(float f) {
        this.alphaVideoRatio = f;
    }

    public final void setBackgroundColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundColor = str;
    }

    public final void setBackgroundPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundPic = str;
    }

    public final void setBackgroundPicJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundPicJson = str;
    }

    public final void setCardSpecialInfo(@Nullable CardSpecialInfo cardSpecialInfo) {
        this.cardSpecialInfo = cardSpecialInfo;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setClickReportBean(@Nullable SensorsBean sensorsBean) {
        this.clickReportBean = sensorsBean;
    }

    public final void setContentSensorId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contentSensorId = str;
    }

    public final void setCreditsExpansionActivityId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.creditsExpansionActivityId = str;
    }

    public final void setCreditsExpansionActivityName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.creditsExpansionActivityName = str;
    }

    public final void setExposureReportBean(@Nullable SensorsBean sensorsBean) {
        this.exposureReportBean = sensorsBean;
    }

    public final void setExtendObj(@Nullable Object obj) {
        this.extendObj = obj;
    }

    public final void setGoodGridDetails(@Nullable List<? extends HomeItemDetail> list) {
        this.goodGridDetails = list;
    }

    public final void setGoodsCardType(int i) {
        this.goodsCardType = i;
    }

    public final void setGoodsForm(@Nullable GoodsDetailInfo goodsDetailInfo) {
        this.goodsForm = goodsDetailInfo;
    }

    public final void setGoodsPicType(int i) {
        this.goodsPicType = i;
    }

    public final void setGoodsSourceType(@Nullable Integer num) {
        this.goodsSourceType = num;
    }

    public final void setGridType(int i) {
        this.gridType = i;
    }

    public final void setGroupId(int i) {
        this.groupId = i;
    }

    public final void setHotZone(@Nullable HotZoneInfo hotZoneInfo) {
        this.hotZone = hotZoneInfo;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setInformationId(@Nullable String str) {
        this.informationId = str;
    }

    public final void setInterPics(@Nullable List<String> list) {
        this.interPics = list;
    }

    public final void setJsonValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jsonValue = str;
    }

    public final void setLabelDetailsInfo(@Nullable LabelDetailsInfo labelDetailsInfo) {
        this.labelDetailsInfo = labelDetailsInfo;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final void setLiveInfoForm(@Nullable LiveInfoForm liveInfoForm) {
        this.liveInfoForm = liveInfoForm;
    }

    public final void setLiveInfoForms(@Nullable List<LiveInfoForm> list) {
        this.liveInfoForms = list;
    }

    public final void setLogin(boolean z) {
        this.isLogin = z;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setNameLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameLabel = str;
    }

    public final void setNameLabelHeight(int i) {
        this.nameLabelHeight = i;
    }

    public final void setNameLabelWidth(int i) {
        this.nameLabelWidth = i;
    }

    public final void setNavigateStyle(@Nullable Integer num) {
        this.navigateStyle = num;
    }

    public final void setNewProduct(@Nullable NewProduct newProduct) {
        this.newProduct = newProduct;
    }

    public final void setNewsTitleForm(@Nullable NewsTitleForm newsTitleForm) {
        this.newsTitleForm = newsTitleForm;
    }

    public final void setPendantShow(boolean z) {
        this.pendantShow = z;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setPicJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picJson = str;
    }

    public final void setPicList(@Nullable List<? extends PicLinkDetail> list) {
        this.picList = list;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setPurposeId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purposeId = str;
    }

    public final void setRowNum(int i) {
        this.rowNum = i;
    }

    public final void setSecondTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secondTitle = str;
    }

    public final void setSensorId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sensorId = str;
    }

    public final void setShowInformationAdvert(boolean z) {
        this.showInformationAdvert = z;
    }

    public final void setShowNotInterestedButton(boolean z) {
        this.isShowNotInterestedButton = z;
    }

    public final void setShowSoundButton(boolean z) {
        this.showSoundButton = z;
    }

    public final void setSupportOneShot(boolean z) {
        this.supportOneShot = z;
    }

    public final void setSwitchValue(boolean z) {
        this.switchValue = z;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setTransparent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.transparent = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setVideo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.video = str;
    }

    public HomeItemDetail(int i, @NotNull String backgroundColor, @NotNull String backgroundPic, @NotNull String backgroundPicJson, @NotNull String pic, @NotNull String picJson, @Nullable CardSpecialInfo cardSpecialInfo, @Nullable NewsTitleForm newsTitleForm, int i2, int i3, @Nullable GoodsDetailInfo goodsDetailInfo, @Nullable List<String> list, boolean z, @NotNull String jsonValue, @Nullable LabelDetailsInfo labelDetailsInfo, @NotNull String link, int i4, @NotNull String nameLabel, int i5, int i6, @Nullable NewProduct newProduct, @Nullable List<? extends PicLinkDetail> list2, int i7, @NotNull String secondTitle, boolean z2, boolean z3, boolean z4, @NotNull String title, int i8, @NotNull String video, @NotNull String alphaVideo, float f, float f2, int i9, @NotNull String sensorId, @NotNull String contentSensorId, boolean z5, @Nullable String str, boolean z6, @Nullable LiveInfoForm liveInfoForm, @Nullable List<LiveInfoForm> list3, @NotNull String purposeId, int i10, int i11, int i12, @Nullable Object obj, @Nullable Integer num, boolean z7, @Nullable AdvertPendantInfo advertPendantInfo, @Nullable Integer num2, @Nullable List<? extends HomeItemDetail> list4, @Nullable HotZoneInfo hotZoneInfo, int i13, @NotNull String creditsExpansionActivityId, @NotNull String creditsExpansionActivityName, @NotNull String transparent) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundPic, "backgroundPic");
        Intrinsics.checkNotNullParameter(backgroundPicJson, "backgroundPicJson");
        Intrinsics.checkNotNullParameter(pic, "pic");
        Intrinsics.checkNotNullParameter(picJson, "picJson");
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(nameLabel, "nameLabel");
        Intrinsics.checkNotNullParameter(secondTitle, "secondTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(alphaVideo, "alphaVideo");
        Intrinsics.checkNotNullParameter(sensorId, "sensorId");
        Intrinsics.checkNotNullParameter(contentSensorId, "contentSensorId");
        Intrinsics.checkNotNullParameter(purposeId, "purposeId");
        Intrinsics.checkNotNullParameter(creditsExpansionActivityId, "creditsExpansionActivityId");
        Intrinsics.checkNotNullParameter(creditsExpansionActivityName, "creditsExpansionActivityName");
        Intrinsics.checkNotNullParameter(transparent, "transparent");
        this.id = i;
        this.backgroundColor = backgroundColor;
        this.backgroundPic = backgroundPic;
        this.backgroundPicJson = backgroundPicJson;
        this.pic = pic;
        this.picJson = picJson;
        this.cardSpecialInfo = cardSpecialInfo;
        this.newsTitleForm = newsTitleForm;
        this.cardType = i2;
        this.goodsCardType = i3;
        this.goodsForm = goodsDetailInfo;
        this.interPics = list;
        this.isLogin = z;
        this.jsonValue = jsonValue;
        this.labelDetailsInfo = labelDetailsInfo;
        this.link = link;
        this.mediaType = i4;
        this.nameLabel = nameLabel;
        this.nameLabelWidth = i5;
        this.nameLabelHeight = i6;
        this.newProduct = newProduct;
        this.picList = list2;
        this.rowNum = i7;
        this.secondTitle = secondTitle;
        this.showSoundButton = z2;
        this.supportOneShot = z3;
        this.switchValue = z4;
        this.title = title;
        this.type = i8;
        this.video = video;
        this.alphaVideo = alphaVideo;
        this.alphaVideoRatio = f;
        this.alphaAddBigScale = f2;
        this.alphaAlignHigh = i9;
        this.sensorId = sensorId;
        this.contentSensorId = contentSensorId;
        this.showInformationAdvert = z5;
        this.informationId = str;
        this.isShowNotInterestedButton = z6;
        this.liveInfoForm = liveInfoForm;
        this.liveInfoForms = list3;
        this.purposeId = purposeId;
        this.groupId = i10;
        this.gridType = i11;
        this.position = i12;
        this.extendObj = obj;
        this.goodsSourceType = num;
        this.pendantShow = z7;
        this.advertPendantInfo = advertPendantInfo;
        this.navigateStyle = num2;
        this.goodGridDetails = list4;
        this.hotZone = hotZoneInfo;
        this.goodsPicType = i13;
        this.creditsExpansionActivityId = creditsExpansionActivityId;
        this.creditsExpansionActivityName = creditsExpansionActivityName;
        this.transparent = transparent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HomeItemDetail(int i, String str, String str2, String str3, String str4, String str5, CardSpecialInfo cardSpecialInfo, NewsTitleForm newsTitleForm, int i2, int i3, GoodsDetailInfo goodsDetailInfo, List list, boolean z, String str6, LabelDetailsInfo labelDetailsInfo, String str7, int i4, String str8, int i5, int i6, NewProduct newProduct, List list2, int i7, String str9, boolean z2, boolean z3, boolean z4, String str10, int i8, String str11, String str12, float f, float f2, int i9, String str13, String str14, boolean z5, String str15, boolean z6, LiveInfoForm liveInfoForm, List list3, String str16, int i10, int i11, int i12, Object obj, Integer num, boolean z7, AdvertPendantInfo advertPendantInfo, Integer num2, List list4, HotZoneInfo hotZoneInfo, int i13, String str17, String str18, String str19, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str20 = "";
        this((i14 & 1) != 0 ? -1 : i, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? "" : str4, (i14 & 32) != 0 ? "" : str5, (i14 & 64) != 0 ? null : cardSpecialInfo, (i14 & 128) != 0 ? null : newsTitleForm, (i14 & 256) != 0 ? -1 : i2, (i14 & 512) != 0 ? -1 : i3, (i14 & 1024) != 0 ? null : goodsDetailInfo, (i14 & 2048) != 0 ? null : list, (i14 & 4096) != 0 ? false : z, (i14 & 8192) != 0 ? str20 : str6, (i14 & 16384) != 0 ? null : labelDetailsInfo, (i14 & 32768) != 0 ? str20 : str7, (i14 & 65536) != 0 ? -1 : i4, (i14 & 131072) != 0 ? str20 : str8, (i14 & 262144) != 0 ? 0 : i5, (i14 & 524288) != 0 ? 0 : i6, (i14 & 1048576) != 0 ? null : newProduct, (i14 & 2097152) != 0 ? null : list2, (i14 & 4194304) != 0 ? -1 : i7, (i14 & 8388608) != 0 ? str20 : str9, (i14 & 16777216) != 0 ? false : z2, (i14 & 33554432) != 0 ? false : z3, (i14 & 67108864) != 0 ? false : z4, (i14 & 134217728) != 0 ? str20 : str10, (i14 & 268435456) != 0 ? -1 : i8, (i14 & 536870912) != 0 ? str20 : str11, (i14 & 1073741824) != 0 ? str20 : str12, (i14 & Integer.MIN_VALUE) != 0 ? 1.6f : f, (i15 & 1) != 0 ? 1.0f : f2, (i15 & 2) != 0 ? 0 : i9, (i15 & 4) != 0 ? str20 : str13, (i15 & 8) != 0 ? str20 : str14, (i15 & 16) != 0 ? false : z5, (i15 & 32) != 0 ? null : str15, (i15 & 64) != 0 ? false : z6, (i15 & 128) != 0 ? null : liveInfoForm, (i15 & 256) != 0 ? null : list3, (i15 & 512) != 0 ? str20 : str16, (i15 & 1024) != 0 ? -1 : i10, (i15 & 2048) != 0 ? -1 : i11, (i15 & 4096) != 0 ? 0 : i12, (i15 & 8192) != 0 ? null : obj, (i15 & 16384) != 0 ? null : num, (i15 & 32768) == 0 ? z7 : false, (i15 & 65536) != 0 ? null : advertPendantInfo, (i15 & 131072) != 0 ? null : num2, (i15 & 262144) != 0 ? null : list4, (i15 & 524288) != 0 ? null : hotZoneInfo, (i15 & 1048576) != 0 ? 2 : i13, (i15 & 2097152) != 0 ? str20 : str17, (i15 & 4194304) != 0 ? str20 : str18, (i15 & 8388608) == 0 ? str19 : "");
    }
}
