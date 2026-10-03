package com.oplus.aiunit.vision;

import com.oplus.pantanal.seedling.convertor.WidgetCodeToSeedlingCardConvertor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class s6h {
    public static final String APP_KEY = "2033";
    public static final String APP_SECRET = "jr00flze1roe1gbvn1nyz56vo7u55ahf";

    public static String b(Object obj, String str) {
        return c(obj) + "&key=" + str;
    }

    public static String c(Object obj) {
        List<Field> listD = d(obj);
        StringBuilder sb = new StringBuilder();
        for (Field field : listD) {
            try {
                Object obj2 = field.get(obj);
                if (obj2 != null && !"".equals(obj2)) {
                    sb.append(field.getName());
                    sb.append("=");
                    if (field.isAnnotationPresent(goc.class)) {
                        sb.append("[");
                        sb.append(c(obj2));
                        sb.append("]");
                    } else {
                        sb.append(obj2);
                    }
                    sb.append(WidgetCodeToSeedlingCardConvertor.CARD_SPLIT);
                }
            } catch (IllegalAccessException | IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static List<Field> d(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (!(Modifier.isTransient(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || field.isAnnotationPresent(wuc.class))) {
                    field.setAccessible(true);
                    arrayList.add(field);
                }
            }
        }
        g(arrayList, new Comparator() { // from class: com.oplus.aiunit.vision.q6h
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return s6h.e((Field) obj2, (Field) obj3);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int e(Field field, Field field2) {
        return field.getName().compareToIgnoreCase(field2.getName());
    }

    public static String f(Object obj) {
        return brb.b(b(obj, "jr00flze1roe1gbvn1nyz56vo7u55ahf"));
    }

    public static void g(List<Field> list, Comparator<? super Field> comparator) {
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator<Field> listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set((Field) obj);
        }
    }
}
