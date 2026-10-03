package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.commonmark.ext.gfm.tables.TableCell;

/* JADX INFO: loaded from: classes11.dex */
public class kmj extends w5 {
    public final jmj a;
    public final List<CharSequence> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<TableCell.Alignment> f13357c;
    public final List<String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13358e;

    public static class b extends x5 {
        @Override // com.oplus.aiunit.vision.xh1
        public di1 a(l8e l8eVar, hhb hhbVar) {
            List listM;
            CharSequence charSequenceB = l8eVar.b();
            CharSequence charSequenceB2 = hhbVar.b();
            if (charSequenceB2 != null && charSequenceB2.toString().contains("|") && !charSequenceB2.toString().contains(Weather.SEPARATOR) && (listM = kmj.m(charSequenceB.subSequence(l8eVar.getIndex(), charSequenceB.length()))) != null && !listM.isEmpty()) {
                List listN = kmj.n(charSequenceB2);
                if (listM.size() >= listN.size()) {
                    return di1.d(new kmj(listM, listN)).b(l8eVar.getIndex()).e();
                }
            }
            return di1.c();
        }
    }

    public static TableCell.Alignment k(boolean z, boolean z2) {
        if (z && z2) {
            return TableCell.Alignment.CENTER;
        }
        if (z) {
            return TableCell.Alignment.LEFT;
        }
        if (z2) {
            return TableCell.Alignment.RIGHT;
        }
        return null;
    }

    public static List<TableCell.Alignment> m(CharSequence charSequence) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\t' || cCharAt == ' ') {
                i++;
            } else {
                boolean z3 = true;
                if (cCharAt == '-' || cCharAt == ':') {
                    if (i2 == 0 && !arrayList.isEmpty()) {
                        return null;
                    }
                    if (cCharAt == ':') {
                        i++;
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z4 = false;
                    while (i < charSequence.length() && charSequence.charAt(i) == '-') {
                        i++;
                        z4 = true;
                    }
                    if (!z4) {
                        return null;
                    }
                    if (i >= charSequence.length() || charSequence.charAt(i) != ':') {
                        z3 = false;
                    } else {
                        i++;
                    }
                    arrayList.add(k(z, z3));
                    i2 = 0;
                } else {
                    if (cCharAt != '|') {
                        return null;
                    }
                    i++;
                    i2++;
                    if (i2 > 1) {
                        return null;
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            return arrayList;
        }
        return null;
    }

    public static List<String> n(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        if (strTrim.startsWith("|")) {
            strTrim = strTrim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strTrim.length()) {
            char cCharAt = strTrim.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (i2 >= strTrim.length() || strTrim.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    i = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public boolean c() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.wh1
    public qh1 d() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void e(CharSequence charSequence) {
        if (this.f13358e) {
            this.f13358e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override // com.oplus.aiunit.vision.w5, com.oplus.aiunit.vision.wh1
    public void f(h8a h8aVar) {
        int size = this.d.size();
        umj umjVar = new umj();
        this.a.b(umjVar);
        wmj wmjVar = new wmj();
        umjVar.b(wmjVar);
        for (int i = 0; i < size; i++) {
            TableCell tableCellL = l(this.d.get(i), i, h8aVar);
            tableCellL.p(true);
            wmjVar.b(tableCellL);
        }
        Iterator<CharSequence> it = this.b.iterator();
        lmj lmjVar = null;
        while (it.hasNext()) {
            List<String> listN = n(it.next());
            wmj wmjVar2 = new wmj();
            int i2 = 0;
            while (i2 < size) {
                wmjVar2.b(l(i2 < listN.size() ? listN.get(i2) : "", i2, h8aVar));
                i2++;
            }
            if (lmjVar == null) {
                lmjVar = new lmj();
                this.a.b(lmjVar);
            }
            lmjVar.b(wmjVar2);
        }
    }

    @Override // com.oplus.aiunit.vision.wh1
    public th1 h(l8e l8eVar) {
        return l8eVar.b().toString().contains("|") ? th1.b(l8eVar.getIndex()) : th1.d();
    }

    public final TableCell l(String str, int i, h8a h8aVar) {
        TableCell tableCell = new TableCell();
        if (i < this.f13357c.size()) {
            tableCell.o(this.f13357c.get(i));
        }
        h8aVar.e(str.trim(), tableCell);
        return tableCell;
    }

    public kmj(List<TableCell.Alignment> list, List<String> list2) {
        this.a = new jmj();
        this.b = new ArrayList();
        this.f13358e = true;
        this.f13357c = list;
        this.d = list2;
    }
}
