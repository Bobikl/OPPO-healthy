package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010E\u001a\u00020\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0012\"\u0004\b;\u0010\u0014R\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0014R\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\b¨\u0006F"}, d2 = {"Lcom/heytap/store/business/component/entity/ProductLatticeDetail;", "", "()V", "backgroundColor", "", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "backgroundPic", "getBackgroundPic", "setBackgroundPic", "backgroundPicJson", "getBackgroundPicJson", "setBackgroundPicJson", "cardType", "", "getCardType", "()I", "setCardType", "(I)V", "childDetails", "", "getChildDetails", "()Ljava/util/List;", "setChildDetails", "(Ljava/util/List;)V", "extendObj", "getExtendObj", "setExtendObj", "goodsCardType", "getGoodsCardType", "setGoodsCardType", "goodsForm", "Lcom/heytap/store/business/component/entity/GoodsForm;", "getGoodsForm", "()Lcom/heytap/store/business/component/entity/GoodsForm;", "setGoodsForm", "(Lcom/heytap/store/business/component/entity/GoodsForm;)V", "gridType", "getGridType", "setGridType", "groupId", "getGroupId", "setGroupId", "id", "", "getId", "()J", "setId", "(J)V", "noStockStr", "getNoStockStr", "setNoStockStr", "pic", "getPic", "setPic", "position", "getPosition", "setPosition", "secondTitle", "getSecondTitle", "setSecondTitle", "sourcePosition", "getSourcePosition", "setSourcePosition", "title", "getTitle", "setTitle", "clone", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ProductLatticeDetail {

    @Nullable
    private String backgroundColor;

    @Nullable
    private String backgroundPic;

    @Nullable
    private String backgroundPicJson;
    private int cardType;

    @Nullable
    private List<ProductLatticeDetail> childDetails;

    @Nullable
    private List<ProductLatticeDetail> extendObj;
    private int goodsCardType;

    @Nullable
    private GoodsForm goodsForm;
    private int gridType;

    @Nullable
    private String pic;
    private int position;

    @Nullable
    private String secondTitle;

    @Nullable
    private String title;
    private int groupId = -1;
    private long id = -1;

    @Nullable
    private String noStockStr = "";
    private int sourcePosition = -1;

    @NotNull
    public final ProductLatticeDetail clone() {
        ProductLatticeDetail productLatticeDetail = new ProductLatticeDetail();
        productLatticeDetail.setGoodsForm(getGoodsForm());
        productLatticeDetail.setPic(getPic());
        productLatticeDetail.setBackgroundPic(getBackgroundPic());
        productLatticeDetail.setBackgroundPicJson(getBackgroundPicJson());
        productLatticeDetail.setBackgroundColor(getBackgroundColor());
        productLatticeDetail.setTitle(getTitle());
        productLatticeDetail.setCardType(getCardType());
        productLatticeDetail.setExtendObj(getExtendObj());
        productLatticeDetail.setSecondTitle(getSecondTitle());
        productLatticeDetail.setGroupId(getGroupId());
        productLatticeDetail.setGridType(getGridType());
        productLatticeDetail.setPosition(getPosition());
        productLatticeDetail.setSourcePosition(getSourcePosition());
        productLatticeDetail.setNoStockStr(getNoStockStr());
        productLatticeDetail.setGoodsCardType(getGoodsCardType());
        productLatticeDetail.setId(getId());
        productLatticeDetail.setChildDetails(getChildDetails());
        return productLatticeDetail;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getBackgroundPic() {
        return this.backgroundPic;
    }

    @Nullable
    public final String getBackgroundPicJson() {
        return this.backgroundPicJson;
    }

    public final int getCardType() {
        return this.cardType;
    }

    @Nullable
    public final List<ProductLatticeDetail> getChildDetails() {
        return this.childDetails;
    }

    @Nullable
    public final List<ProductLatticeDetail> getExtendObj() {
        return this.extendObj;
    }

    public final int getGoodsCardType() {
        return this.goodsCardType;
    }

    @Nullable
    public final GoodsForm getGoodsForm() {
        return this.goodsForm;
    }

    public final int getGridType() {
        return this.gridType;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getNoStockStr() {
        return this.noStockStr;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    public final int getSourcePosition() {
        return this.sourcePosition;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setBackgroundPic(@Nullable String str) {
        this.backgroundPic = str;
    }

    public final void setBackgroundPicJson(@Nullable String str) {
        this.backgroundPicJson = str;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setChildDetails(@Nullable List<ProductLatticeDetail> list) {
        this.childDetails = list;
    }

    public final void setExtendObj(@Nullable List<ProductLatticeDetail> list) {
        this.extendObj = list;
    }

    public final void setGoodsCardType(int i) {
        this.goodsCardType = i;
    }

    public final void setGoodsForm(@Nullable GoodsForm goodsForm) {
        this.goodsForm = goodsForm;
    }

    public final void setGridType(int i) {
        this.gridType = i;
    }

    public final void setGroupId(int i) {
        this.groupId = i;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setNoStockStr(@Nullable String str) {
        this.noStockStr = str;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setSecondTitle(@Nullable String str) {
        this.secondTitle = str;
    }

    public final void setSourcePosition(int i) {
        this.sourcePosition = i;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
