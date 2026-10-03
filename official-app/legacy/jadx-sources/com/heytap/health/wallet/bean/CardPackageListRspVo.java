package com.heytap.health.wallet.bean;

import io.protostuff.Tag;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CardPackageListRspVo implements Serializable {
    private static final long serialVersionUID = 338863596231052731L;

    @Tag(1)
    private List<CardPackageRspVo> cardPackageRspVoList;

    public CardPackageListRspVo deepCopy() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
        return (CardPackageListRspVo) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
    }

    public List<CardPackageRspVo> getCardPackageRspVoList() {
        return this.cardPackageRspVoList;
    }

    public void setCardPackageRspVoList(List<CardPackageRspVo> list) {
        this.cardPackageRspVoList = list;
    }

    public String toString() {
        return "CardPackageListRspVo{cardPackageRspVoList=" + this.cardPackageRspVoList + '}';
    }
}
