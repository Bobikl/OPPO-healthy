package com.heytap.databaseengineservice.sync.weight;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.databaseengine.model.weight.WeightLabel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class WeightCalResultRsp {

    @SerializedName("bodyAdviceText")
    private String bodyAdviceText;

    @SerializedName("bodyStyleText")
    private String bodyStyleText;

    @SerializedName("weight")
    private int weight;

    @SerializedName("labelList")
    private List<WeightLabel> weightLabelList;

    public String getBodyAdviceText() {
        return this.bodyAdviceText;
    }

    public String getBodyStyleText() {
        return this.bodyStyleText;
    }

    public int getWeight() {
        return this.weight;
    }

    public List<WeightLabel> getWeightLabelList() {
        return this.weightLabelList;
    }

    public void setBodyAdviceText(String str) {
        this.bodyAdviceText = str;
    }

    public void setBodyStyleText(String str) {
        this.bodyStyleText = str;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    public void setWeightLabelList(List<WeightLabel> list) {
        this.weightLabelList = list;
    }

    public String toString() {
        return "WeightCalResultRsp{weight=" + this.weight + ", bodyStyleText='" + this.bodyStyleText + "', bodyAdviceText='" + this.bodyAdviceText + "', weightLabelList=" + this.weightLabelList + '}';
    }
}
