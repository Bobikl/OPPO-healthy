package com.oplus.aiunit.vision;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class goa {
    public static final goa COMPOSITION = new goa("COMPOSITION");
    public final List<String> a;

    @Nullable
    public ioa b;

    public goa(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public goa a(String str) {
        goa goaVar = new goa(this);
        goaVar.a.add(str);
        return goaVar;
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
    public ioa d() {
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
        goa goaVar = (goa) obj;
        if (!this.a.equals(goaVar.a)) {
            return false;
        }
        ioa ioaVar = this.b;
        if (ioaVar != null) {
            return ioaVar.equals(goaVar.b);
        }
        return goaVar.b == null;
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
        ioa ioaVar = this.b;
        return iHashCode + (ioaVar != null ? ioaVar.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public goa i(ioa ioaVar) {
        goa goaVar = new goa(this);
        goaVar.b = ioaVar;
        return goaVar;
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

    public goa(goa goaVar) {
        this.a = new ArrayList(goaVar.a);
        this.b = goaVar.b;
    }
}
