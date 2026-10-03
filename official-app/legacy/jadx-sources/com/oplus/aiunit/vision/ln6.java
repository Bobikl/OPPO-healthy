package com.oplus.aiunit.vision;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ln6 {
    public static final a a = new a();

    public static final class a implements Comparator<jl6> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(jl6 jl6Var, jl6 jl6Var2) {
            if (jl6Var.getStart() == jl6Var2.getStart()) {
                if (jl6Var.size() < jl6Var2.size()) {
                    return 1;
                }
                return jl6Var.size() == jl6Var2.size() ? 0 : -1;
            }
            if (jl6Var.getStart() < jl6Var2.getStart()) {
                return -1;
            }
            return jl6Var.getStart() == jl6Var2.getStart() ? 0 : 1;
        }
    }

    public static String[] a(String str, List<pke> list) {
        if (list != null) {
            for (pke pkeVar : list) {
                if (pkeVar != null && pkeVar.a() != null && pkeVar.a().contains(str)) {
                    return pkeVar.b(str);
                }
            }
        }
        throw new IllegalArgumentException("No pinyin dict contains word: " + str);
    }

    public static String b(String str, jck jckVar, List<pke> list, String str2, qrg qrgVar) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (jckVar == null || qrgVar == null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                stringBuffer.append(kke.f(str.charAt(i)));
                if (i != str.length() - 1) {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        }
        List<jl6> listA = qrgVar.a(jckVar.h(str));
        Collections.sort(listA, a);
        StringBuffer stringBuffer2 = new StringBuffer();
        int size = 0;
        int i2 = 0;
        while (size < str.length()) {
            if (i2 >= listA.size() || size != listA.get(i2).getStart()) {
                stringBuffer2.append(kke.f(str.charAt(size)));
                size++;
            } else {
                String[] strArrA = a(listA.get(i2).d(), list);
                for (int i3 = 0; i3 < strArrA.length; i3++) {
                    stringBuffer2.append(strArrA[i3].toUpperCase());
                    if (i3 != strArrA.length - 1) {
                        stringBuffer2.append(str2);
                    }
                }
                size += listA.get(i2).size();
                i2++;
            }
            if (size != str.length()) {
                stringBuffer2.append(str2);
            }
        }
        return stringBuffer2.toString();
    }
}
