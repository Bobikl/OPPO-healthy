package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class TrainingSessionResBean {

    @SerializedName("seconds")
    private int seconds;

    @SerializedName(DeepLinkInterpreter.KEY_SECTION)
    private int section;

    @SerializedName("training_detail")
    private List<TrainingDetail> trainingDetail;

    public TrainingSessionResBean(int i, int i2, List<TrainingDetail> list) {
        this.section = i;
        this.seconds = i2;
        this.trainingDetail = list;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public int getSection() {
        return this.section;
    }

    public List<TrainingDetail> getTrainingDetail() {
        return this.trainingDetail;
    }

    public void setSeconds(int i) {
        this.seconds = i;
    }

    public void setSection(int i) {
        this.section = i;
    }

    public void setTrainingDetail(List<TrainingDetail> list) {
        this.trainingDetail = list;
    }
}
