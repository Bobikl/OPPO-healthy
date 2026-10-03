package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.HeartRateDataStat;
import com.heytap.databaseengine.model.HeartRateWarning;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class c49 {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9947c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9948e;
    public int f;
    public int g;
    public List<HeartRateWarning> h = new ArrayList();
    public List<HeartRateWarning> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<HeartRateWarning> f9949j = new ArrayList();
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9950l;
    public int m;

    public c49() {
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.f;
    }

    public List<HeartRateWarning> c() {
        return this.f9949j;
    }

    public List<HeartRateWarning> d() {
        return this.h;
    }

    public List<HeartRateWarning> e() {
        return this.i;
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return this.m;
    }

    public int i() {
        return this.f9950l;
    }

    public int j() {
        return this.d;
    }

    public long k() {
        return this.f9948e;
    }

    public int l() {
        return this.k;
    }

    public void m(int i) {
        this.g = i;
    }

    public void n(int i) {
        this.k = i;
    }

    public String toString() {
        return "HeartRateDataStatusBean{maxHeartRate=" + this.a + ", minHeartRate=" + this.b + ", averageWalkHeartRate=" + this.f + ", averageSleepHeartRate=" + this.g + ", timestamp=" + ((Object) DateFormat.format("yyyy/MM/dd:HH:mm:ss", this.f9948e)) + ", averageHeartRate=" + this.f9947c + ", restHeartRate=" + this.d + ", quietHRMin=" + this.f9950l + ", quietHRMax=" + this.m + ", warnCount=" + this.k + '}';
    }

    public c49(@NonNull HeartRateDataStat heartRateDataStat) {
        this.a = heartRateDataStat.getMaxHeartRate();
        this.b = heartRateDataStat.getMinHeartRate();
        this.f9947c = heartRateDataStat.getAverageHeartRate();
        this.d = heartRateDataStat.getRestHeartRate();
        this.f9948e = v05.a(heartRateDataStat.getDate());
        this.f = heartRateDataStat.getWalkAvgHeartRate();
        this.g = heartRateDataStat.getSleepBaseHeartRate();
        String metadata = heartRateDataStat.getMetadata();
        if (TextUtils.isEmpty(metadata)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(metadata);
            if (jSONObject.has(HeartRateDataStat.QUIET_HR_MIN)) {
                this.f9950l = jSONObject.getInt(HeartRateDataStat.QUIET_HR_MIN);
            }
            if (jSONObject.has(HeartRateDataStat.QUIET_HR_MAX)) {
                this.m = jSONObject.getInt(HeartRateDataStat.QUIET_HR_MAX);
            }
        } catch (Exception e2) {
            a7b.b("HeartRateDataStatusBean", e2.toString());
        }
    }
}
