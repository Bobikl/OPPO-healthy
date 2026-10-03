package com.heytap.health.home.homecard;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class CardFollowedBean {
    private long modifiedTimestamp;
    private List<CardNetBean> userCardList;

    public CardFollowedBean() {
    }

    private String printUserCardList(List<CardNetBean> list) {
        StringBuilder sb = new StringBuilder();
        if (list == null || list.size() <= 0) {
            sb.append("query beans == null");
        } else {
            for (CardNetBean cardNetBean : list) {
                if (cardNetBean != null) {
                    sb.append(cardNetBean.toString());
                    sb.append("#");
                } else {
                    sb.append("cardNetBean is null!#");
                }
            }
        }
        return sb.toString();
    }

    public long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public List<CardNetBean> getUserCardList() {
        return this.userCardList;
    }

    public void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public void setUserCardList(List<CardNetBean> list) {
        this.userCardList = list;
    }

    public String toString() {
        return "CardFollowedBean{modifiedTimestamp=" + this.modifiedTimestamp + ", userCardList=" + printUserCardList(this.userCardList) + '}';
    }

    public CardFollowedBean(long j2, List<CardNetBean> list) {
        this.modifiedTimestamp = j2;
        this.userCardList = list;
    }
}
