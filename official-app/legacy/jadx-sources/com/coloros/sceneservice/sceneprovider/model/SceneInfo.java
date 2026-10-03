package com.coloros.sceneservice.sceneprovider.model;

import android.os.Bundle;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class SceneInfo {
    public Bundle mPolicyData;
    public int mSceneId;
    public List mServiceList = new ArrayList();

    public SceneInfo(int i) {
        this.mSceneId = i;
    }

    public Bundle getPolicyData() {
        return this.mPolicyData;
    }

    public int getSceneId() {
        return this.mSceneId;
    }

    public List getServiceList() {
        return this.mServiceList;
    }

    public void setPolicyData(Bundle bundle) {
        this.mPolicyData = bundle;
    }

    public void setServiceList(List list) {
        this.mServiceList = list;
    }

    public String toString() {
        return "SceneInfo{mSceneId=" + this.mSceneId + ", mPolicyData=" + this.mPolicyData + '}';
    }
}
