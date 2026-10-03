package com.heytap.health.healthecg.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ECGVerifyDataBean {
    private a heartRate;
    private b hrv;
    private c index;
    private d report;

    @SerializedName("uuid")
    private String uuId;

    public static class a {

        @SerializedName("heartbeat_rate")
        private int a;

        @SerializedName("normal_rate")
        private int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("slow_rate")
        private int f4617c;
    }

    public static class b {

        @SerializedName("fatigue_value")
        private int a;

        @SerializedName("hdrisk")
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("hdrisk_value")
        private int f4618c;

        @SerializedName("hrv_value")
        private int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("mental_pressure")
        private String f4619e;

        @SerializedName("mental_value")
        private int f;
    }

    public static class c {

        @SerializedName("heart_rate")
        private int a;

        @SerializedName("p_h")
        private float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("p_s")
        private int f4620c;

        @SerializedName("pr_s")
        private int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @SerializedName("q_h")
        private float f4621e;

        @SerializedName("qrs_h")
        private float f;

        @SerializedName("qrs_s")
        private int g;

        @SerializedName("qt")
        private int h;

        @SerializedName("r_h")
        private float i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @SerializedName("sttg_h")
        private float f4622j;

        @SerializedName("t_h")
        private float k;
    }

    public static class d {

        @SerializedName("abnor_analysis")
        private String a;

        @SerializedName("ecg_result")
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("ecg_result_tz")
        private String f4623c;
    }

    public a getHeartRate() {
        return this.heartRate;
    }

    public b getHrv() {
        return this.hrv;
    }

    public c getIndex() {
        return this.index;
    }

    public d getReport() {
        return this.report;
    }

    public String getUuId() {
        return this.uuId;
    }

    public void setHeartRate(a aVar) {
        this.heartRate = aVar;
    }

    public void setHrv(b bVar) {
        this.hrv = bVar;
    }

    public void setIndex(c cVar) {
        this.index = cVar;
    }

    public void setReport(d dVar) {
        this.report = dVar;
    }

    public void setUuId(String str) {
        this.uuId = str;
    }
}
