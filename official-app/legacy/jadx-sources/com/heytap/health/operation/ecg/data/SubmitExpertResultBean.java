package com.heytap.health.operation.ecg.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class SubmitExpertResultBean {
    public long auditDate;
    public String core;
    public String doctorAcademicTitle;
    public String doctorHospital;
    public String doctorName;
    public int ecgLevel;
    public String hospitalGrade;
    public String imageUrl;
    public String interpretationResults;
    public String pdfUrlAfter;
    public String serviceApplyId;
    public String suggestions;

    public boolean isGoodResult() {
        return this.ecgLevel == 0;
    }

    public String toString() {
        return "SubmitExpertResultBean{suggestions='" + this.suggestions + "', core='" + this.core + "', interpretationResults='" + this.interpretationResults + "', doctorName='" + this.doctorName + "', doctorHospital='" + this.doctorHospital + "', hospitalGrade='" + this.hospitalGrade + "', auditDate='" + this.auditDate + "', doctorAcademicTitle='" + this.doctorAcademicTitle + "', pdfUrlAfter='" + this.pdfUrlAfter + "', ecgLevel=" + this.ecgLevel + '}';
    }
}
