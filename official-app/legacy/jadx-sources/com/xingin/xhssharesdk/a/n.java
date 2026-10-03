package com.xingin.xhssharesdk.a;

import com.oplus.aiunit.vision.a9n;
import com.oplus.aiunit.vision.e9n;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.weatherservicesdk.data.Weather;
import io.netty.util.internal.StringUtil;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:73:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2  */
    public static void a(l lVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : lVar.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith(ParserTag.TAG_GET)) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String strReplaceFirst = ((String) it.next()).replaceFirst(ParserTag.TAG_GET, "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList")) {
                String str = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(ParserTag.TAG_GET.concat(strReplaceFirst));
                if (method2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        char cCharAt = str.charAt(i2);
                        if (Character.isUpperCase(cCharAt)) {
                            sb2.append("_");
                        }
                        sb2.append(Character.toLowerCase(cCharAt));
                    }
                    b(sb, i, sb2.toString(), k.d(method2, lVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strReplaceFirst))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey(ParserTag.TAG_GET + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method3 = (Method) map.get(ParserTag.TAG_GET.concat(strReplaceFirst));
                Method method4 = (Method) map.get("has".concat(strReplaceFirst));
                if (method3 != null) {
                    Object objD = k.d(method3, lVar, new Object[0]);
                    if (method4 == null) {
                        if (objD instanceof Boolean) {
                            zEquals = !((Boolean) objD).booleanValue();
                        } else if (objD instanceof Integer) {
                            if (((Integer) objD).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objD instanceof Float) {
                            if (((Float) objD).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objD instanceof Double) {
                            if (((Double) objD).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objD instanceof String) {
                            zEquals = objD.equals("");
                        } else if (objD instanceof e) {
                            zEquals = objD.equals(e.b);
                        } else if (!(objD instanceof l) ? !((objD instanceof Enum) && ((Enum) objD).ordinal() == 0) : objD != ((l) objD).c()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) k.d(method4, lVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        StringBuilder sb3 = new StringBuilder();
                        for (int i3 = 0; i3 < str2.length(); i3++) {
                            char cCharAt2 = str2.charAt(i3);
                            if (Character.isUpperCase(cCharAt2)) {
                                sb3.append("_");
                            }
                            sb3.append(Character.toLowerCase(cCharAt2));
                        }
                        b(sb, i, sb3.toString(), objD);
                    }
                }
            }
        }
        if (lVar instanceof k.d) {
            d<k.e> dVar = ((k.d) lVar).f20428l;
            Iterator bVar = dVar.f20419c ? new h.b(((p.d) dVar.a.entrySet()).iterator()) : ((p.d) dVar.a.entrySet()).iterator();
            while (bVar.hasNext()) {
                Map.Entry entry = (Map.Entry) bVar.next();
                ((k.e) entry.getKey()).getClass();
                b(sb, i, "[0]", entry.getValue());
            }
        }
        e9n e9nVar = ((k) lVar).f20426j;
        if (e9nVar != null) {
            for (int i4 = 0; i4 < e9nVar.a; i4++) {
                b(sb, i, String.valueOf(e9nVar.b[i4] >>> 3), e9nVar.f10834c[i4]);
            }
        }
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        String string;
        String strA;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        sb.append('\n');
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(StringUtil.SPACE);
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            strA = a9n.a(e.a((String) obj));
        } else {
            if (!(obj instanceof e)) {
                if (obj instanceof k) {
                    sb.append(" {");
                    a((k) obj, sb, i + 2);
                    sb.append(Weather.SEPARATOR);
                    for (int i3 = 0; i3 < i; i3++) {
                        sb.append(StringUtil.SPACE);
                    }
                    string = "}";
                } else {
                    sb.append(": ");
                    string = obj.toString();
                }
                sb.append(string);
                return;
            }
            sb.append(": \"");
            strA = a9n.a((e) obj);
        }
        sb.append(strA);
        sb.append('\"');
    }
}
