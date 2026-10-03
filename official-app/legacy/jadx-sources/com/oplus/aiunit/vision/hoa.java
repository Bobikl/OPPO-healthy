package com.oplus.aiunit.vision;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class hoa {
    public static final hoa COMPOSITION = new hoa("COMPOSITION");
    public final List<String> a;

    @Nullable
    public joa b;

    public hoa(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public hoa a(String str) {
        hoa hoaVar = new hoa(this);
        hoaVar.a.add(str);
        return hoaVar;
    }

    public final boolean b() {
        List<String> list = this.a;
        return list.get(list.size() - 1).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = this.a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.a.get(i + 1).equals(str)) {
            return i == this.a.size() + (-2) || (i == this.a.size() + (-3) && b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.a.size() - 1) {
            return false;
        }
        return this.a.get(i2).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public joa d() {
        return this.b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i) {
        if (f(str)) {
            return 0;
        }
        if (this.a.get(i).equals("**")) {
            return (i != this.a.size() - 1 && this.a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hoa hoaVar = (hoa) obj;
        if (!this.a.equals(hoaVar.a)) {
            return false;
        }
        joa joaVar = this.b;
        if (joaVar != null) {
            return joaVar.equals(hoaVar.b);
        }
        return hoaVar.b == null;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean g(String str, int i) {
        if (f(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        return this.a.get(i).equals(str) || this.a.get(i).equals("**") || this.a.get(i).equals("*");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h(String str, int i) {
        return "__container".equals(str) || i < this.a.size() - 1 || this.a.get(i).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        joa joaVar = this.b;
        return iHashCode + (joaVar != null ? joaVar.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public hoa i(joa joaVar) {
        hoa hoaVar = new hoa(this);
        hoaVar.b = joaVar;
        return hoaVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        sb.append(this.b != null);
        sb.append('}');
        return sb.toString();
    }

    public hoa(hoa hoaVar) {
        this.a = new ArrayList(hoaVar.a);
        this.b = hoaVar.b;
    }
}
