package com.oplus.aiunit.vision;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class n1d {
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f14292c;
    public double[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[] f14293e;
    public double[][] f;
    public double[][] g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14294j;
    public double[] k;

    public n1d() {
        this.a = 0;
        this.b = "";
        this.f14292c = new double[0];
        this.d = new double[0];
        this.f14293e = new double[0];
        this.f = new double[0][];
        this.g = new double[0][];
        this.h = -1;
        this.i = 1;
        this.f14294j = 0;
        this.k = new double[0];
    }

    public JSONArray a(double[] dArr) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < dArr.length; i += 2) {
            jSONArray.put(c(dArr[i], dArr[i + 1]));
        }
        return jSONArray;
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("angle", this.a);
        jSONObject.put("text", this.b);
        jSONObject.put("item_id", this.h);
        jSONObject.put("is_end_of_line", this.i);
        jSONObject.put("rect", a(this.f14293e));
        jSONObject.put("polygon", a(this.d));
        JSONArray jSONArray = new JSONArray();
        for (double[] dArr : this.f) {
            jSONArray.put(a(dArr));
        }
        jSONObject.put("char_boxes", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (double[] dArr2 : this.g) {
            jSONArray2.put(a(dArr2));
        }
        jSONObject.put("char_boxes_rect", jSONArray2);
        if (this.f14292c != null) {
            JSONArray jSONArray3 = new JSONArray();
            for (double d : this.f14292c) {
                jSONArray3.put(d);
            }
            jSONObject.put("probabilities", jSONArray3);
        }
        return jSONObject;
    }

    public JSONObject c(double d, double d2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", d);
        jSONObject.put("y", d2);
        return jSONObject;
    }

    public n1d(JSONObject jSONObject) throws JSONException {
        this.a = 0;
        this.b = "";
        this.f14292c = new double[0];
        this.d = new double[0];
        this.f14293e = new double[0];
        this.f = new double[0][];
        this.g = new double[0][];
        this.h = -1;
        this.i = 1;
        this.f14294j = 0;
        this.k = new double[0];
        this.a = jSONObject.getInt("angle");
        this.b = jSONObject.getString("text");
        this.h = jSONObject.getInt("item_id");
        try {
            this.i = jSONObject.getInt("is_end_of_line");
        } catch (JSONException unused) {
            this.i = 1;
        }
        if (this.b.isEmpty()) {
            this.f14292c = null;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("probabilities");
            this.f14292c = new double[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f14292c[i] = jSONArray.getDouble(i);
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("polygon");
        this.d = new double[jSONArray2.length() * 2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < jSONArray2.length()) {
            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
            int i4 = i3 + 1;
            this.d[i3] = jSONObject2.getDouble("x");
            this.d[i4] = jSONObject2.getDouble("y");
            i2++;
            i3 = i4 + 1;
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("rect");
        this.f14293e = new double[jSONArray3.length() * 2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < jSONArray3.length()) {
            JSONObject jSONObject3 = jSONArray3.getJSONObject(i5);
            int i7 = i6 + 1;
            this.f14293e[i6] = jSONObject3.getDouble("x");
            this.f14293e[i7] = jSONObject3.getDouble("y");
            i5++;
            i6 = i7 + 1;
        }
        JSONArray jSONArray4 = jSONObject.getJSONArray("char_boxes");
        this.f = new double[jSONArray4.length()][];
        for (int i8 = 0; i8 < jSONArray4.length(); i8++) {
            JSONArray jSONArray5 = jSONArray4.getJSONArray(i8);
            double[] dArr = new double[jSONArray5.length() * 2];
            int i9 = 0;
            for (int i10 = 0; i10 < jSONArray5.length(); i10++) {
                JSONObject jSONObject4 = jSONArray5.getJSONObject(i10);
                int i11 = i9 + 1;
                dArr[i9] = jSONObject4.getDouble("x");
                i9 = i11 + 1;
                dArr[i11] = jSONObject4.getDouble("y");
            }
            this.f[i8] = dArr;
        }
        JSONArray jSONArray6 = jSONObject.getJSONArray("char_boxes_rect");
        this.g = new double[jSONArray6.length()][];
        for (int i12 = 0; i12 < jSONArray6.length(); i12++) {
            JSONArray jSONArray7 = jSONArray6.getJSONArray(i12);
            double[] dArr2 = new double[jSONArray7.length() * 2];
            int i13 = 0;
            for (int i14 = 0; i14 < jSONArray7.length(); i14++) {
                JSONObject jSONObject5 = jSONArray7.getJSONObject(i14);
                int i15 = i13 + 1;
                dArr2[i13] = jSONObject5.getDouble("x");
                i13 = i15 + 1;
                dArr2[i15] = jSONObject5.getDouble("y");
            }
            this.g[i12] = dArr2;
        }
    }
}
