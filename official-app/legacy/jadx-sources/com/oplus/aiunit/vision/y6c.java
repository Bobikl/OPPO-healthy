package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes13.dex */
public class y6c {
    public wg0<ModelMaterial> a = new wg0<>();

    public static class a {
        public String a = "default";
        public mk3 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public mk3 f18890c;
        public mk3 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f18891e;
        public float f;
        public String g;
        public String h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f18892j;
        public String k;

        public a() {
            c();
        }

        public final void a(ModelMaterial modelMaterial, String str, int i) {
            if (str != null) {
                w2c w2cVar = new w2c();
                w2cVar.f18091e = i;
                w2cVar.b = str;
                if (modelMaterial.i == null) {
                    modelMaterial.i = new wg0<>(1);
                }
                modelMaterial.i.a(w2cVar);
            }
        }

        public ModelMaterial b() {
            ModelMaterial modelMaterial = new ModelMaterial();
            modelMaterial.a = this.a;
            modelMaterial.b = this.b == null ? null : new mk3(this.b);
            modelMaterial.f1232c = new mk3(this.f18890c);
            modelMaterial.d = new mk3(this.d);
            modelMaterial.h = this.f18891e;
            modelMaterial.g = this.f;
            a(modelMaterial, this.g, 9);
            a(modelMaterial, this.h, 4);
            a(modelMaterial, this.i, 2);
            a(modelMaterial, this.k, 5);
            a(modelMaterial, this.f18892j, 6);
            return modelMaterial;
        }

        public void c() {
            this.b = null;
            mk3 mk3Var = mk3.WHITE;
            this.f18890c = mk3Var;
            this.d = mk3Var;
            this.f18891e = 1.0f;
            this.f = 0.0f;
            this.g = null;
            this.h = null;
            this.i = null;
            this.f18892j = null;
            this.k = null;
        }
    }

    public ModelMaterial a(String str) {
        wg0.b<ModelMaterial> it = this.a.iterator();
        while (it.hasNext()) {
            ModelMaterial next = it.next();
            if (next.a.equals(str)) {
                return next;
            }
        }
        ModelMaterial modelMaterial = new ModelMaterial();
        modelMaterial.a = str;
        modelMaterial.f1232c = new mk3(mk3.WHITE);
        this.a.a(modelMaterial);
        return modelMaterial;
    }

    public void b(kb7 kb7Var) {
        a aVar = new a();
        if (kb7Var == null || !kb7Var.c()) {
            return;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(kb7Var.m()), 4096);
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    this.a.a(aVar.b());
                    return;
                }
                if (line.length() > 0 && line.charAt(0) == '\t') {
                    line = line.substring(1).trim();
                }
                String[] strArrSplit = line.split("\\s+");
                if (strArrSplit[0].length() != 0 && strArrSplit[0].charAt(0) != '#') {
                    String lowerCase = strArrSplit[0].toLowerCase();
                    if (lowerCase.equals("newmtl")) {
                        this.a.a(aVar.b());
                        if (strArrSplit.length > 1) {
                            String str = strArrSplit[1];
                            aVar.a = str;
                            aVar.a = str.replace('.', '_');
                        } else {
                            aVar.a = "default";
                        }
                        aVar.c();
                    } else if (lowerCase.equals("ka")) {
                        aVar.b = c(strArrSplit);
                    } else if (lowerCase.equals("kd")) {
                        aVar.f18890c = c(strArrSplit);
                    } else if (lowerCase.equals("ks")) {
                        aVar.d = c(strArrSplit);
                    } else if (lowerCase.equals("tr") || lowerCase.equals("d")) {
                        aVar.f18891e = Float.parseFloat(strArrSplit[1]);
                    } else if (lowerCase.equals("ns")) {
                        aVar.f = Float.parseFloat(strArrSplit[1]);
                    } else if (lowerCase.equals("map_d")) {
                        aVar.g = kb7Var.i().a(strArrSplit[1]).j();
                    } else if (lowerCase.equals("map_ka")) {
                        aVar.h = kb7Var.i().a(strArrSplit[1]).j();
                    } else if (lowerCase.equals("map_kd")) {
                        aVar.i = kb7Var.i().a(strArrSplit[1]).j();
                    } else if (lowerCase.equals("map_ks")) {
                        aVar.k = kb7Var.i().a(strArrSplit[1]).j();
                    } else if (lowerCase.equals("map_ns")) {
                        aVar.f18892j = kb7Var.i().a(strArrSplit[1]).j();
                    }
                }
            } catch (IOException unused) {
                return;
            }
        }
    }

    public final mk3 c(String[] strArr) {
        return new mk3(Float.parseFloat(strArr[1]), Float.parseFloat(strArr[2]), Float.parseFloat(strArr[3]), strArr.length > 4 ? Float.parseFloat(strArr[4]) : 1.0f);
    }
}
