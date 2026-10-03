package com.heytap.health.operation.medal.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MedalUserActList {
    private String averageIncome;
    private int complianceCount;
    private List<HistoryListBean> historyList;
    private String incomeRate;
    private List<JoinListBean> joinList;
    private String totalComplianceBonus;

    @Keep
    public static class HistoryListBean {
        private int joinCount;
        private String year;

        public int getJoinCount() {
            return this.joinCount;
        }

        public String getYear() {
            return this.year;
        }

        public void setJoinCount(int i) {
            this.joinCount = i;
        }

        public void setYear(String str) {
            this.year = str;
        }
    }

    @Keep
    public static class JoinListBean {
        private String actId;
        private Object compliance;
        private String complianceBonus;
        private int periodNum;

        public String getActId() {
            return this.actId;
        }

        public Object getCompliance() {
            return this.compliance;
        }

        public String getComplianceBonus() {
            return this.complianceBonus;
        }

        public int getPeriodNum() {
            return this.periodNum;
        }

        public void setActId(String str) {
            this.actId = str;
        }

        public void setCompliance(Object obj) {
            this.compliance = obj;
        }

        public void setComplianceBonus(String str) {
            this.complianceBonus = str;
        }

        public void setPeriodNum(int i) {
            this.periodNum = i;
        }
    }

    public String getAverageIncome() {
        return this.averageIncome;
    }

    public int getComplianceCount() {
        return this.complianceCount;
    }

    public List<HistoryListBean> getHistoryList() {
        return this.historyList;
    }

    public String getIncomeRate() {
        return this.incomeRate;
    }

    public List<JoinListBean> getJoinList() {
        return this.joinList;
    }

    public String getTotalComplianceBonus() {
        return this.totalComplianceBonus;
    }

    public void setAverageIncome(String str) {
        this.averageIncome = str;
    }

    public void setComplianceCount(int i) {
        this.complianceCount = i;
    }

    public void setHistoryList(List<HistoryListBean> list) {
        this.historyList = list;
    }

    public void setIncomeRate(String str) {
        this.incomeRate = str;
    }

    public void setJoinList(List<JoinListBean> list) {
        this.joinList = list;
    }

    public void setTotalComplianceBonus(String str) {
        this.totalComplianceBonus = str;
    }
}
