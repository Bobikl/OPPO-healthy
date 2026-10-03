package com.oplus.aiunit.vision;

import com.heytap.weather.constant.BusinessConstants$RequestMethodEnum;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class pa2 {
    public BusinessConstants$RequestMethodEnum a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15282c;

    public pa2 a(int i) {
        this.f15282c = i;
        return this;
    }

    public pa2 b(BusinessConstants$RequestMethodEnum businessConstants$RequestMethodEnum) {
        this.a = businessConstants$RequestMethodEnum;
        return this;
    }

    public pa2 c(String str) {
        this.b = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pa2 pa2Var = (pa2) obj;
        return this.f15282c == pa2Var.f15282c && Objects.equals(this.a.getValue(), pa2Var.a.getValue()) && Objects.equals(this.b, pa2Var.b);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.f15282c));
    }
}
