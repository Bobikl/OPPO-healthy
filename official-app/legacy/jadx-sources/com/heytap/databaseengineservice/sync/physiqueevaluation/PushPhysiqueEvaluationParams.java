package com.heytap.databaseengineservice.sync.physiqueevaluation;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PushPhysiqueEvaluationParams {
    private List<UserPhysiqueEvaluationListBean> userPhysiqueEvaluationList;

    @Keep
    public static class UserPhysiqueEvaluationListBean {
        private String appraisement;
        private int completeCount;
        private long dataCreatedTimestamp;
        private String evaluationResult;
        private int evaluationType;
        private String extension;
        private int lastScore;
        private int level;
        private int score;
        private int sex;

        public String getAppraisement() {
            return this.appraisement;
        }

        public int getCompleteCount() {
            return this.completeCount;
        }

        public long getDataCreatedTimestamp() {
            return this.dataCreatedTimestamp;
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

        public int getScore() {
            return this.score;
        }

        public int getSex() {
            return this.sex;
        }

        public void setAppraisement(String str) {
            this.appraisement = str;
        }

        public void setCompleteCount(int i) {
            this.completeCount = i;
        }

        public void setDataCreatedTimestamp(long j2) {
            this.dataCreatedTimestamp = j2;
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

        public void setScore(int i) {
            this.score = i;
        }

        public void setSex(int i) {
            this.sex = i;
        }
    }

    public PushPhysiqueEvaluationParams(List<UserPhysiqueEvaluationListBean> list) {
        this.userPhysiqueEvaluationList = list;
    }

    public List<UserPhysiqueEvaluationListBean> getUserPhysiqueEvaluationList() {
        return this.userPhysiqueEvaluationList;
    }

    public void setUserPhysiqueEvaluationList(List<UserPhysiqueEvaluationListBean> list) {
        this.userPhysiqueEvaluationList = list;
    }
}
