package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0003\b\u008b\u0001\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0006\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\b\b\u0002\u0010#\u001a\u00020\r\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u0006\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010'J\t\u0010q\u001a\u00020\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0006HÆ\u0003J\u0010\u0010s\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010t\u001a\u00020\u0006HÆ\u0003J\t\u0010u\u001a\u00020\u0006HÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\t\u0010w\u001a\u00020\u0006HÆ\u0003J\t\u0010x\u001a\u00020\u0006HÆ\u0003J\t\u0010y\u001a\u00020\u0006HÆ\u0003J\t\u0010z\u001a\u00020\u0006HÆ\u0003J\t\u0010{\u001a\u00020\u0006HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0006HÆ\u0003J\t\u0010~\u001a\u00020\u0006HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010/J\n\u0010\u0082\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010/J\n\u0010\u0086\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\rHÆ\u0003J\u0012\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010/J\n\u0010\u008c\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0006HÆ\u0003J\u0012\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0006HÆ\u0003Jò\u0002\u0010\u0092\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\r2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010%\u001a\u00020\u00062\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0003\u0010\u0093\u0001J\u0015\u0010\u0094\u0001\u001a\u00020\r2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0006HÖ\u0001J\n\u0010\u0097\u0001\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0018\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u001f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00104\"\u0004\bG\u00106R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00104\"\u0004\bI\u00106R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00104\"\u0004\bK\u00106R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010C\"\u0004\bM\u0010ER\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00104\"\u0004\bO\u00106R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u00104R\u001a\u0010\u0019\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u00104\"\u0004\bR\u00106R\u001a\u0010\u001e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u00104\"\u0004\bS\u00106R\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00104\"\u0004\bU\u00106R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bV\u0010/\"\u0004\bW\u00101R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00104\"\u0004\bY\u00106R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00104\"\u0004\b[\u00106R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00104\"\u0004\b]\u00106R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00104\"\u0004\b_\u00106R\u001a\u0010\u0017\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\u001e\u0010!\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bb\u0010/\"\u0004\bc\u00101R\u001e\u0010&\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bd\u0010/\"\u0004\be\u00101R\u001a\u0010\"\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00104\"\u0004\bg\u00106R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010#\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010i\"\u0004\bm\u0010kR\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bn\u00104R\u001a\u0010%\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u00104\"\u0004\bp\u00106¨\u0006\u0098\u0001"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeItemStyleInfo;", "", "backgroundColor", "", "backgroundPic", "fieldMaxNum", "", "fieldNumPage", "fieldNumPerLine", "fieldShowLine", "goodsLabelSwitch", "", "showDiscounts", "", "goodsNameType", "goodsPicType", "bannerHeight", "goodsMaxNum", "goodsShowLine", "marktingMaxNum", "mediaMaxNum", "mediaNumPerLine", "mediaPicShowLine", "mediaShowLine", "cardType", "informationStyle", "goodsBannerStyle", "showPrice", "gridStyle", "liveCardStyle", "isTopMargin", "couponsStyle", "lanternStyle", "picSize", "reservedBorder", "showGoodsSlogan", "goodsPrefix", "titleShowStyleNumber", "recycleUseScene", "(Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;ZIILjava/lang/Integer;IIIIIIIIIIIILjava/lang/Integer;IIILjava/lang/Integer;IZLjava/util/List;ILjava/lang/Integer;)V", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "getBackgroundPic", "setBackgroundPic", "getBannerHeight", "()Ljava/lang/Integer;", "setBannerHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCardType", "()I", "setCardType", "(I)V", "getCouponsStyle", "setCouponsStyle", "getFieldMaxNum", "setFieldMaxNum", "getFieldNumPage", "setFieldNumPage", "getFieldNumPerLine", "setFieldNumPerLine", "getFieldShowLine", "setFieldShowLine", "getGoodsBannerStyle", "getGoodsLabelSwitch", "()Ljava/util/List;", "setGoodsLabelSwitch", "(Ljava/util/List;)V", "getGoodsMaxNum", "setGoodsMaxNum", "getGoodsNameType", "setGoodsNameType", "getGoodsPicType", "setGoodsPicType", "getGoodsPrefix", "setGoodsPrefix", "getGoodsShowLine", "setGoodsShowLine", "getGridStyle", "getInformationStyle", "setInformationStyle", "setTopMargin", "getLanternStyle", "setLanternStyle", "getLiveCardStyle", "setLiveCardStyle", "getMarktingMaxNum", "setMarktingMaxNum", "getMediaMaxNum", "setMediaMaxNum", "getMediaNumPerLine", "setMediaNumPerLine", "getMediaPicShowLine", "setMediaPicShowLine", "getMediaShowLine", "setMediaShowLine", "getPicSize", "setPicSize", "getRecycleUseScene", "setRecycleUseScene", "getReservedBorder", "setReservedBorder", "getShowDiscounts", "()Z", "setShowDiscounts", "(Z)V", "getShowGoodsSlogan", "setShowGoodsSlogan", "getShowPrice", "getTitleShowStyleNumber", "setTitleShowStyleNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IIIILjava/util/List;ZIILjava/lang/Integer;IIIIIIIIIIIILjava/lang/Integer;IIILjava/lang/Integer;IZLjava/util/List;ILjava/lang/Integer;)Lcom/heytap/store/homemodule/data/HomeItemStyleInfo;", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeItemStyleInfo {

    @NotNull
    private String backgroundColor;

    @NotNull
    private String backgroundPic;

    @Nullable
    private Integer bannerHeight;
    private int cardType;
    private int couponsStyle;
    private int fieldMaxNum;
    private int fieldNumPage;
    private int fieldNumPerLine;
    private int fieldShowLine;
    private final int goodsBannerStyle;

    @Nullable
    private List<Integer> goodsLabelSwitch;
    private int goodsMaxNum;
    private int goodsNameType;
    private int goodsPicType;

    @Nullable
    private List<Integer> goodsPrefix;
    private int goodsShowLine;
    private final int gridStyle;
    private int informationStyle;
    private int isTopMargin;
    private int lanternStyle;

    @Nullable
    private Integer liveCardStyle;
    private int marktingMaxNum;
    private int mediaMaxNum;
    private int mediaNumPerLine;
    private int mediaPicShowLine;
    private int mediaShowLine;

    @Nullable
    private Integer picSize;

    @Nullable
    private Integer recycleUseScene;
    private int reservedBorder;
    private boolean showDiscounts;
    private boolean showGoodsSlogan;
    private final int showPrice;
    private int titleShowStyleNumber;

    public HomeItemStyleInfo() {
        this(null, null, 0, 0, 0, 0, null, false, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, null, 0, false, null, 0, null, -1, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getGoodsPicType() {
        return this.goodsPicType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getBannerHeight() {
        return this.bannerHeight;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getGoodsMaxNum() {
        return this.goodsMaxNum;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getGoodsShowLine() {
        return this.goodsShowLine;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getMarktingMaxNum() {
        return this.marktingMaxNum;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getMediaMaxNum() {
        return this.mediaMaxNum;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getMediaNumPerLine() {
        return this.mediaNumPerLine;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getMediaPicShowLine() {
        return this.mediaPicShowLine;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getMediaShowLine() {
        return this.mediaShowLine;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundPic() {
        return this.backgroundPic;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getInformationStyle() {
        return this.informationStyle;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getGoodsBannerStyle() {
        return this.goodsBannerStyle;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getShowPrice() {
        return this.showPrice;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final int getGridStyle() {
        return this.gridStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Integer getLiveCardStyle() {
        return this.liveCardStyle;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final int getIsTopMargin() {
        return this.isTopMargin;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getCouponsStyle() {
        return this.couponsStyle;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getLanternStyle() {
        return this.lanternStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Integer getPicSize() {
        return this.picSize;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getReservedBorder() {
        return this.reservedBorder;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFieldMaxNum() {
        return this.fieldMaxNum;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getShowGoodsSlogan() {
        return this.showGoodsSlogan;
    }

    @Nullable
    public final List<Integer> component31() {
        return this.goodsPrefix;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final int getTitleShowStyleNumber() {
        return this.titleShowStyleNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getRecycleUseScene() {
        return this.recycleUseScene;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getFieldNumPage() {
        return this.fieldNumPage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFieldNumPerLine() {
        return this.fieldNumPerLine;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFieldShowLine() {
        return this.fieldShowLine;
    }

    @Nullable
    public final List<Integer> component7() {
        return this.goodsLabelSwitch;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowDiscounts() {
        return this.showDiscounts;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getGoodsNameType() {
        return this.goodsNameType;
    }

    @NotNull
    public final HomeItemStyleInfo copy(@NotNull String backgroundColor, @NotNull String backgroundPic, int fieldMaxNum, int fieldNumPage, int fieldNumPerLine, int fieldShowLine, @Nullable List<Integer> goodsLabelSwitch, boolean showDiscounts, int goodsNameType, int goodsPicType, @Nullable Integer bannerHeight, int goodsMaxNum, int goodsShowLine, int marktingMaxNum, int mediaMaxNum, int mediaNumPerLine, int mediaPicShowLine, int mediaShowLine, int cardType, int informationStyle, int goodsBannerStyle, int showPrice, int gridStyle, @Nullable Integer liveCardStyle, int isTopMargin, int couponsStyle, int lanternStyle, @Nullable Integer picSize, int reservedBorder, boolean showGoodsSlogan, @Nullable List<Integer> goodsPrefix, int titleShowStyleNumber, @Nullable Integer recycleUseScene) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundPic, "backgroundPic");
        return new HomeItemStyleInfo(backgroundColor, backgroundPic, fieldMaxNum, fieldNumPage, fieldNumPerLine, fieldShowLine, goodsLabelSwitch, showDiscounts, goodsNameType, goodsPicType, bannerHeight, goodsMaxNum, goodsShowLine, marktingMaxNum, mediaMaxNum, mediaNumPerLine, mediaPicShowLine, mediaShowLine, cardType, informationStyle, goodsBannerStyle, showPrice, gridStyle, liveCardStyle, isTopMargin, couponsStyle, lanternStyle, picSize, reservedBorder, showGoodsSlogan, goodsPrefix, titleShowStyleNumber, recycleUseScene);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeItemStyleInfo)) {
            return false;
        }
        HomeItemStyleInfo homeItemStyleInfo = (HomeItemStyleInfo) other;
        return Intrinsics.areEqual(this.backgroundColor, homeItemStyleInfo.backgroundColor) && Intrinsics.areEqual(this.backgroundPic, homeItemStyleInfo.backgroundPic) && this.fieldMaxNum == homeItemStyleInfo.fieldMaxNum && this.fieldNumPage == homeItemStyleInfo.fieldNumPage && this.fieldNumPerLine == homeItemStyleInfo.fieldNumPerLine && this.fieldShowLine == homeItemStyleInfo.fieldShowLine && Intrinsics.areEqual(this.goodsLabelSwitch, homeItemStyleInfo.goodsLabelSwitch) && this.showDiscounts == homeItemStyleInfo.showDiscounts && this.goodsNameType == homeItemStyleInfo.goodsNameType && this.goodsPicType == homeItemStyleInfo.goodsPicType && Intrinsics.areEqual(this.bannerHeight, homeItemStyleInfo.bannerHeight) && this.goodsMaxNum == homeItemStyleInfo.goodsMaxNum && this.goodsShowLine == homeItemStyleInfo.goodsShowLine && this.marktingMaxNum == homeItemStyleInfo.marktingMaxNum && this.mediaMaxNum == homeItemStyleInfo.mediaMaxNum && this.mediaNumPerLine == homeItemStyleInfo.mediaNumPerLine && this.mediaPicShowLine == homeItemStyleInfo.mediaPicShowLine && this.mediaShowLine == homeItemStyleInfo.mediaShowLine && this.cardType == homeItemStyleInfo.cardType && this.informationStyle == homeItemStyleInfo.informationStyle && this.goodsBannerStyle == homeItemStyleInfo.goodsBannerStyle && this.showPrice == homeItemStyleInfo.showPrice && this.gridStyle == homeItemStyleInfo.gridStyle && Intrinsics.areEqual(this.liveCardStyle, homeItemStyleInfo.liveCardStyle) && this.isTopMargin == homeItemStyleInfo.isTopMargin && this.couponsStyle == homeItemStyleInfo.couponsStyle && this.lanternStyle == homeItemStyleInfo.lanternStyle && Intrinsics.areEqual(this.picSize, homeItemStyleInfo.picSize) && this.reservedBorder == homeItemStyleInfo.reservedBorder && this.showGoodsSlogan == homeItemStyleInfo.showGoodsSlogan && Intrinsics.areEqual(this.goodsPrefix, homeItemStyleInfo.goodsPrefix) && this.titleShowStyleNumber == homeItemStyleInfo.titleShowStyleNumber && Intrinsics.areEqual(this.recycleUseScene, homeItemStyleInfo.recycleUseScene);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getBackgroundPic() {
        return this.backgroundPic;
    }

    @Nullable
    public final Integer getBannerHeight() {
        return this.bannerHeight;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final int getCouponsStyle() {
        return this.couponsStyle;
    }

    public final int getFieldMaxNum() {
        return this.fieldMaxNum;
    }

    public final int getFieldNumPage() {
        return this.fieldNumPage;
    }

    public final int getFieldNumPerLine() {
        return this.fieldNumPerLine;
    }

    public final int getFieldShowLine() {
        return this.fieldShowLine;
    }

    public final int getGoodsBannerStyle() {
        return this.goodsBannerStyle;
    }

    @Nullable
    public final List<Integer> getGoodsLabelSwitch() {
        return this.goodsLabelSwitch;
    }

    public final int getGoodsMaxNum() {
        return this.goodsMaxNum;
    }

    public final int getGoodsNameType() {
        return this.goodsNameType;
    }

    public final int getGoodsPicType() {
        return this.goodsPicType;
    }

    @Nullable
    public final List<Integer> getGoodsPrefix() {
        return this.goodsPrefix;
    }

    public final int getGoodsShowLine() {
        return this.goodsShowLine;
    }

    public final int getGridStyle() {
        return this.gridStyle;
    }

    public final int getInformationStyle() {
        return this.informationStyle;
    }

    public final int getLanternStyle() {
        return this.lanternStyle;
    }

    @Nullable
    public final Integer getLiveCardStyle() {
        return this.liveCardStyle;
    }

    public final int getMarktingMaxNum() {
        return this.marktingMaxNum;
    }

    public final int getMediaMaxNum() {
        return this.mediaMaxNum;
    }

    public final int getMediaNumPerLine() {
        return this.mediaNumPerLine;
    }

    public final int getMediaPicShowLine() {
        return this.mediaPicShowLine;
    }

    public final int getMediaShowLine() {
        return this.mediaShowLine;
    }

    @Nullable
    public final Integer getPicSize() {
        return this.picSize;
    }

    @Nullable
    public final Integer getRecycleUseScene() {
        return this.recycleUseScene;
    }

    public final int getReservedBorder() {
        return this.reservedBorder;
    }

    public final boolean getShowDiscounts() {
        return this.showDiscounts;
    }

    public final boolean getShowGoodsSlogan() {
        return this.showGoodsSlogan;
    }

    public final int getShowPrice() {
        return this.showPrice;
    }

    public final int getTitleShowStyleNumber() {
        return this.titleShowStyleNumber;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((((((((((this.backgroundColor.hashCode() * 31) + this.backgroundPic.hashCode()) * 31) + Integer.hashCode(this.fieldMaxNum)) * 31) + Integer.hashCode(this.fieldNumPage)) * 31) + Integer.hashCode(this.fieldNumPerLine)) * 31) + Integer.hashCode(this.fieldShowLine)) * 31;
        List<Integer> list = this.goodsLabelSwitch;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        boolean z = this.showDiscounts;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode3 = (((((iHashCode2 + r1) * 31) + Integer.hashCode(this.goodsNameType)) * 31) + Integer.hashCode(this.goodsPicType)) * 31;
        Integer num = this.bannerHeight;
        int iHashCode4 = (((((((((((((((((((((((((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.goodsMaxNum)) * 31) + Integer.hashCode(this.goodsShowLine)) * 31) + Integer.hashCode(this.marktingMaxNum)) * 31) + Integer.hashCode(this.mediaMaxNum)) * 31) + Integer.hashCode(this.mediaNumPerLine)) * 31) + Integer.hashCode(this.mediaPicShowLine)) * 31) + Integer.hashCode(this.mediaShowLine)) * 31) + Integer.hashCode(this.cardType)) * 31) + Integer.hashCode(this.informationStyle)) * 31) + Integer.hashCode(this.goodsBannerStyle)) * 31) + Integer.hashCode(this.showPrice)) * 31) + Integer.hashCode(this.gridStyle)) * 31;
        Integer num2 = this.liveCardStyle;
        int iHashCode5 = (((((((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31) + Integer.hashCode(this.isTopMargin)) * 31) + Integer.hashCode(this.couponsStyle)) * 31) + Integer.hashCode(this.lanternStyle)) * 31;
        Integer num3 = this.picSize;
        int iHashCode6 = (((iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31) + Integer.hashCode(this.reservedBorder)) * 31;
        boolean z2 = this.showGoodsSlogan;
        int i = (iHashCode6 + (z2 ? 1 : z2)) * 31;
        List<Integer> list2 = this.goodsPrefix;
        int iHashCode7 = (((i + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.titleShowStyleNumber)) * 31;
        Integer num4 = this.recycleUseScene;
        return iHashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public final int isTopMargin() {
        return this.isTopMargin;
    }

    public final void setBackgroundColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundColor = str;
    }

    public final void setBackgroundPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundPic = str;
    }

    public final void setBannerHeight(@Nullable Integer num) {
        this.bannerHeight = num;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setCouponsStyle(int i) {
        this.couponsStyle = i;
    }

    public final void setFieldMaxNum(int i) {
        this.fieldMaxNum = i;
    }

    public final void setFieldNumPage(int i) {
        this.fieldNumPage = i;
    }

    public final void setFieldNumPerLine(int i) {
        this.fieldNumPerLine = i;
    }

    public final void setFieldShowLine(int i) {
        this.fieldShowLine = i;
    }

    public final void setGoodsLabelSwitch(@Nullable List<Integer> list) {
        this.goodsLabelSwitch = list;
    }

    public final void setGoodsMaxNum(int i) {
        this.goodsMaxNum = i;
    }

    public final void setGoodsNameType(int i) {
        this.goodsNameType = i;
    }

    public final void setGoodsPicType(int i) {
        this.goodsPicType = i;
    }

    public final void setGoodsPrefix(@Nullable List<Integer> list) {
        this.goodsPrefix = list;
    }

    public final void setGoodsShowLine(int i) {
        this.goodsShowLine = i;
    }

    public final void setInformationStyle(int i) {
        this.informationStyle = i;
    }

    public final void setLanternStyle(int i) {
        this.lanternStyle = i;
    }

    public final void setLiveCardStyle(@Nullable Integer num) {
        this.liveCardStyle = num;
    }

    public final void setMarktingMaxNum(int i) {
        this.marktingMaxNum = i;
    }

    public final void setMediaMaxNum(int i) {
        this.mediaMaxNum = i;
    }

    public final void setMediaNumPerLine(int i) {
        this.mediaNumPerLine = i;
    }

    public final void setMediaPicShowLine(int i) {
        this.mediaPicShowLine = i;
    }

    public final void setMediaShowLine(int i) {
        this.mediaShowLine = i;
    }

    public final void setPicSize(@Nullable Integer num) {
        this.picSize = num;
    }

    public final void setRecycleUseScene(@Nullable Integer num) {
        this.recycleUseScene = num;
    }

    public final void setReservedBorder(int i) {
        this.reservedBorder = i;
    }

    public final void setShowDiscounts(boolean z) {
        this.showDiscounts = z;
    }

    public final void setShowGoodsSlogan(boolean z) {
        this.showGoodsSlogan = z;
    }

    public final void setTitleShowStyleNumber(int i) {
        this.titleShowStyleNumber = i;
    }

    public final void setTopMargin(int i) {
        this.isTopMargin = i;
    }

    @NotNull
    public String toString() {
        return "HomeItemStyleInfo(backgroundColor=" + this.backgroundColor + ", backgroundPic=" + this.backgroundPic + ", fieldMaxNum=" + this.fieldMaxNum + ", fieldNumPage=" + this.fieldNumPage + ", fieldNumPerLine=" + this.fieldNumPerLine + ", fieldShowLine=" + this.fieldShowLine + ", goodsLabelSwitch=" + this.goodsLabelSwitch + ", showDiscounts=" + this.showDiscounts + ", goodsNameType=" + this.goodsNameType + ", goodsPicType=" + this.goodsPicType + ", bannerHeight=" + this.bannerHeight + ", goodsMaxNum=" + this.goodsMaxNum + ", goodsShowLine=" + this.goodsShowLine + ", marktingMaxNum=" + this.marktingMaxNum + ", mediaMaxNum=" + this.mediaMaxNum + ", mediaNumPerLine=" + this.mediaNumPerLine + ", mediaPicShowLine=" + this.mediaPicShowLine + ", mediaShowLine=" + this.mediaShowLine + ", cardType=" + this.cardType + ", informationStyle=" + this.informationStyle + ", goodsBannerStyle=" + this.goodsBannerStyle + ", showPrice=" + this.showPrice + ", gridStyle=" + this.gridStyle + ", liveCardStyle=" + this.liveCardStyle + ", isTopMargin=" + this.isTopMargin + ", couponsStyle=" + this.couponsStyle + ", lanternStyle=" + this.lanternStyle + ", picSize=" + this.picSize + ", reservedBorder=" + this.reservedBorder + ", showGoodsSlogan=" + this.showGoodsSlogan + ", goodsPrefix=" + this.goodsPrefix + ", titleShowStyleNumber=" + this.titleShowStyleNumber + ", recycleUseScene=" + this.recycleUseScene + ')';
    }

    public HomeItemStyleInfo(@NotNull String backgroundColor, @NotNull String backgroundPic, int i, int i2, int i3, int i4, @Nullable List<Integer> list, boolean z, int i5, int i6, @Nullable Integer num, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, @Nullable Integer num2, int i19, int i20, int i21, @Nullable Integer num3, int i22, boolean z2, @Nullable List<Integer> list2, int i23, @Nullable Integer num4) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundPic, "backgroundPic");
        this.backgroundColor = backgroundColor;
        this.backgroundPic = backgroundPic;
        this.fieldMaxNum = i;
        this.fieldNumPage = i2;
        this.fieldNumPerLine = i3;
        this.fieldShowLine = i4;
        this.goodsLabelSwitch = list;
        this.showDiscounts = z;
        this.goodsNameType = i5;
        this.goodsPicType = i6;
        this.bannerHeight = num;
        this.goodsMaxNum = i7;
        this.goodsShowLine = i8;
        this.marktingMaxNum = i9;
        this.mediaMaxNum = i10;
        this.mediaNumPerLine = i11;
        this.mediaPicShowLine = i12;
        this.mediaShowLine = i13;
        this.cardType = i14;
        this.informationStyle = i15;
        this.goodsBannerStyle = i16;
        this.showPrice = i17;
        this.gridStyle = i18;
        this.liveCardStyle = num2;
        this.isTopMargin = i19;
        this.couponsStyle = i20;
        this.lanternStyle = i21;
        this.picSize = num3;
        this.reservedBorder = i22;
        this.showGoodsSlogan = z2;
        this.goodsPrefix = list2;
        this.titleShowStyleNumber = i23;
        this.recycleUseScene = num4;
    }

    public /* synthetic */ HomeItemStyleInfo(String str, String str2, int i, int i2, int i3, int i4, List list, boolean z, int i5, int i6, Integer num, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Integer num2, int i19, int i20, int i21, Integer num3, int i22, boolean z2, List list2, int i23, Integer num4, int i24, int i25, DefaultConstructorMarker defaultConstructorMarker) {
        this((i24 & 1) != 0 ? "" : str, (i24 & 2) == 0 ? str2 : "", (i24 & 4) != 0 ? -1 : i, (i24 & 8) != 0 ? -1 : i2, (i24 & 16) != 0 ? -1 : i3, (i24 & 32) != 0 ? -1 : i4, (i24 & 64) != 0 ? null : list, (i24 & 128) != 0 ? true : z, (i24 & 256) != 0 ? 1 : i5, (i24 & 512) != 0 ? 0 : i6, (i24 & 1024) != 0 ? null : num, (i24 & 2048) != 0 ? -1 : i7, (i24 & 4096) != 0 ? -1 : i8, (i24 & 8192) != 0 ? -1 : i9, (i24 & 16384) != 0 ? -1 : i10, (i24 & 32768) != 0 ? -1 : i11, (i24 & 65536) != 0 ? -1 : i12, (i24 & 131072) != 0 ? -1 : i13, (i24 & 262144) != 0 ? -1 : i14, (i24 & 524288) != 0 ? -1 : i15, (i24 & 1048576) != 0 ? 0 : i16, (i24 & 2097152) != 0 ? 1 : i17, (i24 & 4194304) != 0 ? 0 : i18, (i24 & 8388608) != 0 ? null : num2, (i24 & 16777216) != 0 ? 0 : i19, (i24 & 33554432) != 0 ? 0 : i20, (i24 & 67108864) != 0 ? 0 : i21, (i24 & 134217728) != 0 ? null : num3, (i24 & 268435456) != 0 ? 0 : i22, (i24 & 536870912) != 0 ? true : z2, (i24 & 1073741824) != 0 ? null : list2, (i24 & Integer.MIN_VALUE) != 0 ? 2 : i23, (i25 & 1) != 0 ? 1 : num4);
    }
}
