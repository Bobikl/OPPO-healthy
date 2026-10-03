package com.heytap.health.wallet.model.response;

import androidx.annotation.Keep;
import com.heytap.health.wallet.network.door.params.SwipeCardLocationVO;
import io.protostuff.Exclude;
import io.protostuff.Tag;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PayCardInfo implements Serializable {
    private static final long serialVersionUID = -2533917529997074546L;

    @Tag(5)
    private Long acctAmount;

    @Tag(6)
    private String aid;

    @Tag(10)
    private String appCode;

    @Tag(2)
    private String bankLogo;

    @Tag(12)
    private String bindPay;

    @Tag(8)
    private String bizId;

    @Tag(9)
    private String cardImg;

    @Tag(4)
    private String cardStatus;

    @Tag(7)
    private String cardType;

    @Tag(16)
    private Map<String, Object> data;

    @Tag(1)
    private String displayName;

    @Tag(17)
    private boolean isDefaultCard;

    @Tag(3)
    private String lastDigest;

    @Tag(15)
    private String nfcCardModel;

    @Tag(11)
    private String qrTokenId;

    @Exclude
    private ArrayList<SwipeCardLocationVO> swipeLocations;

    @Tag(13)
    private String tips;

    @Tag(14)
    private String virtualCardRefId;

    public PayCardInfo deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(this);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        PayCardInfo payCardInfo = (PayCardInfo) objectInputStream.readObject();
                        objectInputStream.close();
                        byteArrayInputStream.close();
                        objectOutputStream.close();
                        byteArrayOutputStream.close();
                        return payCardInfo;
                    } catch (Throwable th) {
                        try {
                            objectInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    objectOutputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public boolean equals(Object obj) {
        if (toString().equals(obj.toString())) {
            return true;
        }
        return super.equals(obj);
    }

    public Long getAcctAmount() {
        return this.acctAmount;
    }

    public String getAid() {
        return this.aid;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public String getBankLogo() {
        return this.bankLogo;
    }

    public String getBindPay() {
        return this.bindPay;
    }

    public String getBizId() {
        return this.bizId;
    }

    public String getCardImg() {
        return this.cardImg;
    }

    public String getCardStatus() {
        return this.cardStatus;
    }

    public String getCardType() {
        return this.cardType;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getLastDigest() {
        return this.lastDigest;
    }

    public String getNfcCardModel() {
        return this.nfcCardModel;
    }

    public String getQrTokenId() {
        return this.qrTokenId;
    }

    public ArrayList<SwipeCardLocationVO> getSwipeLocations() {
        return this.swipeLocations;
    }

    public String getTips() {
        return this.tips;
    }

    public String getVirtualCardRefId() {
        return this.virtualCardRefId;
    }

    public boolean isDefaultCard() {
        return this.isDefaultCard;
    }

    public void setAcctAmount(Long l2) {
        this.acctAmount = l2;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppCode(String str) {
        this.appCode = str;
    }

    public void setBankLogo(String str) {
        this.bankLogo = str;
    }

    public void setBindPay(String str) {
        this.bindPay = str;
    }

    public void setBizId(String str) {
        this.bizId = str;
    }

    public void setCardImg(String str) {
        this.cardImg = str;
    }

    public void setCardStatus(String str) {
        this.cardStatus = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    public void setDefaultCard(boolean z) {
        this.isDefaultCard = z;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setLastDigest(String str) {
        this.lastDigest = str;
    }

    public void setNfcCardModel(String str) {
        this.nfcCardModel = str;
    }

    public void setQrTokenId(String str) {
        this.qrTokenId = str;
    }

    public void setSwipeLocations(ArrayList<SwipeCardLocationVO> arrayList) {
        this.swipeLocations = arrayList;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setVirtualCardRefId(String str) {
        this.virtualCardRefId = str;
    }

    public String toString() {
        return "PayCardInfo{displayName='" + this.displayName + "', bankLogo='" + this.bankLogo + "', lastDigest='" + this.lastDigest + "', cardStatus='" + this.cardStatus + "', acctAmount=" + this.acctAmount + ", aid='" + this.aid + "', cardType='" + this.cardType + "', bizId='" + this.bizId + "', cardImg='" + this.cardImg + "', appCode='" + this.appCode + "', qrTokenId='" + this.qrTokenId + "', bindPay='" + this.bindPay + "', tips='" + this.tips + "', virtualCardRefId='" + this.virtualCardRefId + "', nfcCardModel='" + this.nfcCardModel + "', data=" + this.data + "', isDefaultCard='" + this.isDefaultCard + ", swipeLocations='" + this.swipeLocations + '}';
    }
}
