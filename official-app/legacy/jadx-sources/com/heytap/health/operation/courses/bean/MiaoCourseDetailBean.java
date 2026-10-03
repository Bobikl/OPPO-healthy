package com.heytap.health.operation.courses.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.operations.bean.ActionBean;
import com.heytap.health.operations.bean.StageBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MiaoCourseDetailBean {
    private List<StageBean> actions;
    private String advice;
    private List<String> bodyParts;
    private String bodyReaction;
    private int calorie;
    private String courseCode;
    private String courseImage;
    private int difficultyLevel;
    private int duration;
    private List<String> evaluationItems;
    private float fatBurningFemale;
    private float fatBurningMale;
    private String fee;
    private String introduce;
    private int joinState;
    private String level;
    private String levelName;
    private String name;
    private String needAttention;
    private SdkDisplayInfoBean sdkDisplayInfo;
    private String state;
    private String suitableCrowd;
    private String tabooCrowd;
    private List<String> target;
    private List<Integer> trainParts;
    private List<Integer> trainTargets;
    private String type;
    private float videoSize;
    private String videoUrl;

    @Keep
    public static class ActionTemp {
        public String duration;
        public String name;

        public ActionTemp(String str, String str2) {
            this.name = str;
            this.duration = str2;
        }
    }

    private void inflateFitActionForkeep() {
        if (this.sdkDisplayInfo == null || TextUtils.isEmpty(this.videoUrl) || this.actions == null || !TextUtils.isEmpty(this.sdkDisplayInfo.getFitActionRecords())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<StageBean> it = this.actions.iterator();
        while (it.hasNext()) {
            for (ActionBean actionBean : it.next().getActions()) {
                arrayList.add(new ActionTemp(actionBean.getActionName(), actionBean.getActionTimes()));
            }
        }
        this.sdkDisplayInfo.setFitActionRecords(GsonUtil.e(arrayList));
    }

    public List<StageBean> getActions() {
        return this.actions;
    }

    public String getAdvice() {
        return this.advice;
    }

    public List<String> getBodyParts() {
        return this.bodyParts;
    }

    public String getBodyReaction() {
        return this.bodyReaction;
    }

    public int getCalorie() {
        return this.calorie;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public String getCourseImage() {
        return this.courseImage;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public int getDuration() {
        return this.duration;
    }

    public List<String> getEvaluationItems() {
        return this.evaluationItems;
    }

    public float getFatBurningFemale() {
        return this.fatBurningFemale;
    }

    public float getFatBurningMale() {
        return this.fatBurningMale;
    }

    public String getFee() {
        return this.fee;
    }

    public String getIntroduce() {
        return this.introduce;
    }

    public int getJoinState() {
        if (TextUtils.isEmpty(this.videoUrl)) {
            return this.joinState;
        }
        return 1;
    }

    public String getLevel() {
        return this.level;
    }

    public String getLevelName() {
        return this.levelName;
    }

    public String getName() {
        return this.name;
    }

    public String getNeedAttention() {
        return this.needAttention;
    }

    public SdkDisplayInfoBean getSdkDisplayInfo() {
        if (this.sdkDisplayInfo == null) {
            this.sdkDisplayInfo = new SdkDisplayInfoBean();
        }
        inflateFitActionForkeep();
        return this.sdkDisplayInfo;
    }

    public List<StageBean> getStages() {
        return this.actions;
    }

    public String getState() {
        return this.state;
    }

    public String getSuitableCrowd() {
        return this.suitableCrowd;
    }

    public String getTabooCrowd() {
        return this.tabooCrowd;
    }

    public List<String> getTarget() {
        return this.target;
    }

    public List<Integer> getTrainParts() {
        return this.trainParts;
    }

    public List<Integer> getTrainTargets() {
        return this.trainTargets;
    }

    public String getType() {
        return this.type;
    }

    public float getVideoSize() {
        return this.videoSize;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public void setActions(List<StageBean> list) {
        this.actions = list;
    }

    public void setAdvice(String str) {
        this.advice = str;
    }

    public void setBodyParts(List<String> list) {
        this.bodyParts = list;
    }

    public void setBodyReaction(String str) {
        this.bodyReaction = str;
    }

    public void setCalorie(int i) {
        this.calorie = i;
    }

    public void setCourseCode(String str) {
        this.courseCode = str;
    }

    public void setCourseImage(String str) {
        this.courseImage = str;
    }

    public void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEvaluationItems(List<String> list) {
        this.evaluationItems = list;
    }

    public void setFatBurningFemale(float f) {
        this.fatBurningFemale = f;
    }

    public void setFatBurningMale(float f) {
        this.fatBurningMale = f;
    }

    public void setFee(String str) {
        this.fee = str;
    }

    public void setIntroduce(String str) {
        this.introduce = str;
    }

    public void setJoinState(int i) {
        this.joinState = i;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setLevelName(String str) {
        this.levelName = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNeedAttention(String str) {
        this.needAttention = str;
    }

    public void setSdkDisplayInfo(SdkDisplayInfoBean sdkDisplayInfoBean) {
        this.sdkDisplayInfo = sdkDisplayInfoBean;
    }

    public void setStages(List<StageBean> list) {
        this.actions = list;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setSuitableCrowd(String str) {
        this.suitableCrowd = str;
    }

    public void setTabooCrowd(String str) {
        this.tabooCrowd = str;
    }

    public void setTarget(List<String> list) {
        this.target = list;
    }

    public void setTrainParts(List<Integer> list) {
        this.trainParts = list;
    }

    public void setTrainTargets(List<Integer> list) {
        this.trainTargets = list;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVideoSize(float f) {
        this.videoSize = f;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public String toString() {
        return "MiaoCourseDetailBean{advice='" + this.advice + "', bodyReaction='" + this.bodyReaction + "', duration=" + this.duration + ", calorie=" + this.calorie + ", levelName='" + this.levelName + "', name='" + this.name + "', needAttention='" + this.needAttention + "', state='" + this.state + "', suitableCrowd='" + this.suitableCrowd + "', tabooCrowd='" + this.tabooCrowd + "', type='" + this.type + "', videoSize=" + this.videoSize + ", fee='" + this.fee + "', bodyParts=" + this.bodyParts + ", trainParts=" + this.trainParts + ", evaluationItems=" + this.evaluationItems + ", target=" + this.target + ", trainTargets=" + this.trainTargets + ", stages=" + this.actions + '}';
    }
}
