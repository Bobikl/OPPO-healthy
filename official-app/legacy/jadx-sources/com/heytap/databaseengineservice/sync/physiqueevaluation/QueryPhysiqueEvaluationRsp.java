package com.heytap.databaseengineservice.sync.physiqueevaluation;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class QueryPhysiqueEvaluationRsp {

    @SerializedName("userPhysiqueEvaluation")
    private UserPhysiqueEvaluationBean userPhysiqueEvaluation;

    @SerializedName("userPhysiqueEvaluationDetailList")
    private List<UserPhysiqueEvaluationDetailListBean> userPhysiqueEvaluationDetailList;

    @Keep
    public static class UserPhysiqueEvaluationBean {
        private int ageRange;
        private String appraisement;
        private int completeCount;
        private long createTime;
        private int lastScore;
        private int level;
        private long modifiedTimestamp;
        private double ranking;
        private int score;
        private int sex;
        private String ssoid;

        public int getAgeRange() {
            return this.ageRange;
        }

        public String getAppraisement() {
            return this.appraisement;
        }

        public int getCompleteCount() {
            return this.completeCount;
        }

        public long getCreateTime() {
            return this.createTime;
        }

        public int getLastScore() {
            return this.lastScore;
        }

        public int getLevel() {
            return this.level;
        }

        public long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public double getRanking() {
            return this.ranking;
        }

        public int getScore() {
            return this.score;
        }

        public int getSex() {
            return this.sex;
        }

        public String getSsoid() {
            return this.ssoid;
        }

        public void setAgeRange(int i) {
            this.ageRange = i;
        }

        public void setAppraisement(String str) {
            this.appraisement = str;
        }

        public void setCompleteCount(int i) {
            this.completeCount = i;
        }

        public void setCreateTime(long j2) {
            this.createTime = j2;
        }

        public void setLastScore(int i) {
            this.lastScore = i;
        }

        public void setLevel(int i) {
            this.level = i;
        }

        public void setModifiedTimestamp(long j2) {
            this.modifiedTimestamp = j2;
        }

        public void setRanking(double d) {
            this.ranking = d;
        }

        public void setScore(int i) {
            this.score = i;
        }

        public void setSex(int i) {
            this.sex = i;
        }

        public void setSsoid(String str) {
            this.ssoid = str;
        }
    }

    @Keep
    public static class UserPhysiqueEvaluationDetailListBean {
        private int ageRange;
        private String appraisement;
        private long createTime;
        private String evaluationName;
        private String evaluationResult;
        private int evaluationType;
        private String extension;
        private int lastScore;
        private int level;
        private long modifiedTimestamp;
        private double ranking;
        private int score;
        private int sex;
        private String ssoid;

        public int getAgeRange() {
            return this.ageRange;
        }

        public String getAppraisement() {
            return this.appraisement;
        }

        public long getCreateTime() {
            return this.createTime;
        }

        public String getEvaluationName() {
            return this.evaluationName;
        }

        public String getEvaluationResult() {
            return this.evaluationResult;
        }

        public int getEvaluationType() {
            return this.evaluationType;
        }

        public String getExtension() {
            return this.extension;
        }

        public int getLastScore() {
            return this.lastScore;
        }

        public int getLevel() {
            return this.level;
        }

        public long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public double getRanking() {
            return this.ranking;
        }

        public int getScore() {
            return this.score;
        }

        public int getSex() {
            return this.sex;
        }

        public String getSsoid() {
            return this.ssoid;
        }

        public void setAgeRange(int i) {
            this.ageRange = i;
        }

        public void setAppraisement(String str) {
            this.appraisement = str;
        }

        public void setCreateTime(long j2) {
            this.createTime = j2;
        }

        public void setEvaluationName(String str) {
            this.evaluationName = str;
        }

        public void setEvaluationResult(String str) {
            this.evaluationResult = str;
        }

        public void setEvaluationType(int i) {
            this.evaluationType = i;
        }

        public void setExtension(String str) {
            this.extension = str;
        }

        public void setLastScore(int i) {
            this.lastScore = i;
        }

        public void setLevel(int i) {
            this.level = i;
        }

        public void setModifiedTimestamp(long j2) {
            this.modifiedTimestamp = j2;
        }

        public void setRanking(double d) {
            this.ranking = d;
        }

        public void setScore(int i) {
            this.score = i;
        }

        public void setSex(int i) {
            this.sex = i;
        }

        public void setSsoid(String str) {
            this.ssoid = str;
        }
    }

    public UserPhysiqueEvaluationBean getUserPhysiqueEvaluation() {
        return this.userPhysiqueEvaluation;
    }

    public List<UserPhysiqueEvaluationDetailListBean> getUserPhysiqueEvaluationDetailList() {
        return this.userPhysiqueEvaluationDetailList;
    }

    public void setUserPhysiqueEvaluation(UserPhysiqueEvaluationBean userPhysiqueEvaluationBean) {
        this.userPhysiqueEvaluation = userPhysiqueEvaluationBean;
    }

    public void setUserPhysiqueEvaluationDetailList(List<UserPhysiqueEvaluationDetailListBean> list) {
        this.userPhysiqueEvaluationDetailList = list;
    }
}
