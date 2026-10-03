package com.oplus.aiunit.vision;

import com.garmin.fit.FitRuntimeException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public class fxb {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11556c;
    public ArrayList<ea7> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<u95> f11557e;

    public fxb() {
        this.a = ixb.INVALID;
        this.b = 0;
        this.f11556c = 1;
        this.d = new ArrayList<>();
        this.f11557e = new ArrayList<>();
    }

    public final u95 a(short s, int i) {
        for (u95 u95Var : this.f11557e) {
            if (u95Var.e() == i && u95Var.c() == s) {
                return u95Var;
            }
        }
        return null;
    }

    public int b() {
        Iterator<u95> it = this.f11557e.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += it.next().a();
        }
        return iA;
    }

    public ea7 c(int i) {
        for (ea7 ea7Var : this.d) {
            if (ea7Var.a == i) {
                return ea7Var;
            }
        }
        return null;
    }

    public ArrayList<ea7> d() {
        return this.d;
    }

    public boolean e(bxb bxbVar) {
        return f(new fxb(bxbVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxb)) {
            return false;
        }
        fxb fxbVar = (fxb) obj;
        if (this.a != fxbVar.a || this.b != fxbVar.b || this.d.size() != fxbVar.d.size()) {
            return false;
        }
        for (int i = 0; i < this.d.size(); i++) {
            if (!this.d.get(i).equals(fxbVar.d.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean f(fxb fxbVar) {
        if (fxbVar == null || this.a != fxbVar.a || this.b != fxbVar.b) {
            return false;
        }
        for (ea7 ea7Var : fxbVar.d) {
            ea7 ea7VarC = c(ea7Var.a);
            if (ea7VarC == null || ea7Var.b > ea7VarC.b) {
                return false;
            }
        }
        for (u95 u95Var : fxbVar.f11557e) {
            u95 u95VarA = a(u95Var.c(), u95Var.e());
            if (u95VarA == null || u95Var.a() > u95VarA.a()) {
                return false;
            }
        }
        return true;
    }

    public void g(OutputStream outputStream) {
        try {
            int i = (this.b & 15) | 64;
            if (!this.f11557e.isEmpty()) {
                i |= 32;
            }
            outputStream.write(i);
            outputStream.write(0);
            outputStream.write(1);
            outputStream.write(this.a >> 8);
            outputStream.write(this.a);
            outputStream.write(this.d.size());
            Iterator<ea7> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().c(outputStream);
            }
            if (this.f11557e.isEmpty()) {
                return;
            }
            outputStream.write(this.f11557e.size());
            Iterator<u95> it2 = this.f11557e.iterator();
            while (it2.hasNext()) {
                it2.next().o(outputStream);
            }
        } catch (IOException e2) {
            throw new FitRuntimeException(e2);
        }
    }

    public int hashCode() {
        return ((((31 + new Integer(this.a).hashCode()) * 47) + new Integer(this.b).hashCode()) * 19) + this.d.hashCode();
    }

    public fxb(bxb bxbVar) {
        this.a = bxbVar.b;
        int i = bxbVar.f9882c;
        this.b = i;
        this.f11556c = 1;
        if (i < 16) {
            this.d = new ArrayList<>();
            this.f11557e = new ArrayList<>();
            Iterator<w97> it = bxbVar.d.iterator();
            while (it.hasNext()) {
                this.d.add(new ea7(it.next()));
            }
            Iterator<t95> it2 = bxbVar.f9883e.iterator();
            while (it2.hasNext()) {
                this.f11557e.add(new u95(it2.next()));
            }
            return;
        }
        throw new FitRuntimeException("Invalid local message number " + this.b + ".  Local message number must be < 16.");
    }
}
