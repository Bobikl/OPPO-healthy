package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b*\u0010+J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\b2\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0002J\"\u0010\"\u001a\u0004\u0018\u00010!2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\b\u0010 \u001a\u0004\u0018\u00010\bH\u0002J&\u0010$\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010#2\f\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\fH\u0002R$\u0010'\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00150%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R0\u0010)\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130(0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&¨\u0006-"}, d2 = {"Lcom/oplus/aiunit/vision/e25;", "Lcom/oplus/aiunit/vision/hq9;", "", "Ljava/lang/Class;", "dbEntityClasses", "", "a", "([Ljava/lang/Class;)V", "", "f", "()[Ljava/lang/String;", "d", "", "oldVersion", "b", "(I)[Ljava/lang/String;", "clazz", "e", "", "Lcom/oplus/aiunit/vision/h25;", "c", "Lcom/oplus/aiunit/vision/w25;", "l", "Ljava/lang/reflect/Field;", "field", "m", "fieldName", "g", "dbClass", "j", "columnType", "i", "defaultValue", "", "h", "", "k", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "mDbTableMap", "", "mDbColumnMap", "<init>", "()V", "Companion", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class e25 implements hq9 {
    public final HashMap<Class<?>, w25> a = new HashMap<>();
    public final HashMap<Class<?>, Map<String, h25>> b = new HashMap<>();

    @Override // com.oplus.aiunit.vision.hq9
    public void a(@NotNull Class<?>[] dbEntityClasses) {
        h25 h25VarM;
        Intrinsics.checkParameterIsNotNull(dbEntityClasses, "dbEntityClasses");
        for (Class<?> cls : dbEntityClasses) {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkExpressionValueIsNotNull(declaredFields, "dbEntity.declaredFields");
            w25 w25VarL = l(cls);
            if (w25VarL != null) {
                this.a.put(cls, w25VarL);
                for (Field field : declaredFields) {
                    if (field != null && (h25VarM = m(field)) != null) {
                        Map<String, h25> map = this.b.get(cls);
                        if (map == null) {
                            map = new HashMap<>();
                            this.b.put(cls, map);
                        }
                        String name = field.getName();
                        Intrinsics.checkExpressionValueIsNotNull(name, "dbField.name");
                        map.put(name, h25VarM);
                    }
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.TypeCastException */
    @Override // com.oplus.aiunit.vision.hq9
    @Nullable
    public String[] b(int oldVersion) throws TypeCastException {
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<Class<?>, w25>> setEntrySet = this.a.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(setEntrySet, "mDbTableMap.entries");
        for (Map.Entry<Class<?>, w25> entry : setEntrySet) {
            Class<?> key = entry.getKey();
            if (entry.getValue().getA() > oldVersion) {
                String strJ = j(key);
                if (strJ != null) {
                    arrayList.add(strJ);
                }
            } else {
                List<String> listK = k(key, oldVersion);
                if (listK != null && !listK.isEmpty()) {
                    arrayList.addAll(listK);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // com.oplus.aiunit.vision.hq9
    @Nullable
    public Map<String, h25> c(@NotNull Class<?> clazz) {
        Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        return this.b.get(clazz);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.TypeCastException */
    @Override // com.oplus.aiunit.vision.hq9
    @Nullable
    public String[] d() throws TypeCastException {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Class<?>, w25>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            w25 value = it.next().getValue();
            String b = value.getB();
            if (b != null) {
                p7a[] c = value.getC();
                if (!(c.length == 0)) {
                    for (p7a p7aVar : c) {
                        ArrayList arrayList2 = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        sb.append("index_" + b);
                        Intrinsics.checkExpressionValueIsNotNull(sb, "StringBuilder()\n        …end(\"index_${tableName}\")");
                        for (String str : p7aVar.value()) {
                            sb.append('_' + str);
                            arrayList2.add(str);
                        }
                        soi.Companion companion = soi.INSTANCE;
                        String string = sb.toString();
                        Intrinsics.checkExpressionValueIsNotNull(string, "indexNameBuilder.toString()");
                        String strA = companion.a(string, b, arrayList2);
                        if (strA != null) {
                            arrayList.add(strA);
                        }
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // com.oplus.aiunit.vision.hq9
    @Nullable
    public String e(@NotNull Class<?> clazz) {
        Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        w25 w25Var = this.a.get(clazz);
        if (w25Var == null) {
            return null;
        }
        Intrinsics.checkExpressionValueIsNotNull(w25Var, "mDbTableMap[clazz] ?: return null");
        return w25Var.getB();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.TypeCastException */
    @Override // com.oplus.aiunit.vision.hq9
    @NotNull
    public String[] f() throws TypeCastException {
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<Class<?>, w25>> setEntrySet = this.a.entrySet();
        Intrinsics.checkExpressionValueIsNotNull(setEntrySet, "mDbTableMap.entries");
        Iterator<Map.Entry<Class<?>, w25>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            String strJ = j(it.next().getKey());
            if (strJ != null) {
                arrayList.add(strJ);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final String g(String fieldName) {
        StringBuilder sb = new StringBuilder();
        int length = fieldName.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = fieldName.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "sb.toString()");
        return string;
    }

    public final Object h(Class<?> columnType, String defaultValue) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        if (columnType == null || defaultValue == null) {
            return null;
        }
        if ((defaultValue.length() == 0) || StringsKt.isBlank(defaultValue)) {
            return null;
        }
        Class cls = Integer.TYPE;
        if (Intrinsics.areEqual(cls, columnType) || Intrinsics.areEqual(cls, columnType)) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.constructor-impl(Integer.valueOf(Integer.parseInt(defaultValue)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            if (Result.isFailure-impl(obj)) {
                return null;
            }
            return obj;
        }
        Class cls2 = Long.TYPE;
        if (Intrinsics.areEqual(cls2, columnType) || Intrinsics.areEqual(cls2, columnType)) {
            try {
                Result.Companion companion3 = Result.Companion;
                obj2 = Result.constructor-impl(Long.valueOf(Long.parseLong(defaultValue)));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
            }
            if (Result.isFailure-impl(obj2)) {
                return null;
            }
            return obj2;
        }
        if (Intrinsics.areEqual(Double.TYPE, columnType) || Intrinsics.areEqual(Double.TYPE, columnType)) {
            try {
                Result.Companion companion5 = Result.Companion;
                obj3 = Result.constructor-impl(Double.valueOf(Double.parseDouble(defaultValue)));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.Companion;
                obj3 = Result.constructor-impl(ResultKt.createFailure(th3));
            }
            if (Result.isFailure-impl(obj3)) {
                return null;
            }
            return obj3;
        }
        Class cls3 = Float.TYPE;
        if (Intrinsics.areEqual(cls3, columnType) || Intrinsics.areEqual(cls3, columnType)) {
            try {
                Result.Companion companion7 = Result.Companion;
                obj4 = Result.constructor-impl(Float.valueOf(Float.parseFloat(defaultValue)));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.Companion;
                obj4 = Result.constructor-impl(ResultKt.createFailure(th4));
            }
            if (Result.isFailure-impl(obj4)) {
                return null;
            }
            return obj4;
        }
        Class cls4 = Boolean.TYPE;
        if (!Intrinsics.areEqual(cls4, columnType) && !Intrinsics.areEqual(cls4, columnType)) {
            return defaultValue;
        }
        try {
            Result.Companion companion9 = Result.Companion;
            obj5 = Result.constructor-impl(Integer.valueOf(Integer.parseInt(defaultValue)));
        } catch (Throwable th5) {
            Result.Companion companion10 = Result.Companion;
            obj5 = Result.constructor-impl(ResultKt.createFailure(th5));
        }
        if (Result.isFailure-impl(obj5)) {
            return null;
        }
        return obj5;
    }

    public final String i(Class<?> columnType) {
        if (columnType == null) {
            return null;
        }
        Class cls = Integer.TYPE;
        if (!Intrinsics.areEqual(cls, columnType) && !Intrinsics.areEqual(cls, columnType)) {
            Class cls2 = Long.TYPE;
            if (!Intrinsics.areEqual(cls2, columnType) && !Intrinsics.areEqual(cls2, columnType)) {
                if (!Intrinsics.areEqual(Double.TYPE, columnType) && !Intrinsics.areEqual(Double.TYPE, columnType)) {
                    Class cls3 = Float.TYPE;
                    if (!Intrinsics.areEqual(cls3, columnType) && !Intrinsics.areEqual(cls3, columnType)) {
                        if (Intrinsics.areEqual(String.class, columnType)) {
                            return "text";
                        }
                        Class cls4 = Boolean.TYPE;
                        if (Intrinsics.areEqual(cls4, columnType) || Intrinsics.areEqual(cls4, columnType)) {
                            return "integer";
                        }
                        if (Intrinsics.areEqual(byte[].class, columnType)) {
                            return "blob";
                        }
                        if (Intrinsics.areEqual(List.class, columnType)) {
                            return "text";
                        }
                        return null;
                    }
                }
                return "real";
            }
        }
        return "integer";
    }

    public final String j(Class<?> dbClass) {
        w25 w25Var;
        Map<String, h25> map;
        if (dbClass != null && (w25Var = this.a.get(dbClass)) != null) {
            Intrinsics.checkExpressionValueIsNotNull(w25Var, "mDbTableMap[dbClass] ?: return null");
            String b = w25Var.getB();
            if (!TextUtils.isEmpty(b) && (map = this.b.get(dbClass)) != null) {
                Intrinsics.checkExpressionValueIsNotNull(map, "mDbColumnMap[dbClass] ?: return null");
                StringBuilder sb = new StringBuilder();
                sb.append("create table ");
                sb.append(b);
                sb.append(" ( _id integer primary key autoincrement, ");
                Set<Map.Entry<String, h25>> setEntrySet = map.entrySet();
                int size = setEntrySet.size();
                int i = 0;
                for (Map.Entry<String, h25> entry : setEntrySet) {
                    i++;
                    String key = entry.getKey();
                    h25 value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String b2 = value.getB();
                        String strI = i(value.c());
                        Object objH = h(value.c(), value.getE());
                        sb.append(b2);
                        sb.append(" ");
                        sb.append(strI);
                        if (value.getD()) {
                            sb.append(" not null unique");
                        }
                        if (objH != null) {
                            sb.append(" default ");
                            sb.append(objH);
                        }
                        if (i == size) {
                            sb.append(")");
                        } else {
                            sb.append(", ");
                        }
                    }
                }
                return sb.toString();
            }
        }
        return null;
    }

    public final List<String> k(Class<?> dbClass, int oldVersion) {
        ArrayList arrayList = null;
        if (dbClass == null) {
            return null;
        }
        w25 w25Var = this.a.get(dbClass);
        if (w25Var != null) {
            Intrinsics.checkExpressionValueIsNotNull(w25Var, "mDbTableMap[dbClass] ?: return null");
            String b = w25Var.getB();
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            Map<String, h25> map = this.b.get(dbClass);
            if (map != null) {
                Intrinsics.checkExpressionValueIsNotNull(map, "mDbColumnMap[dbClass] ?: return null");
                arrayList = new ArrayList();
                for (Map.Entry<String, h25> entry : map.entrySet()) {
                    String key = entry.getKey();
                    h25 value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && value.getA() > oldVersion) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("alter table ");
                        sb.append(b);
                        sb.append(" add column ");
                        sb.append(value.getB());
                        sb.append(" ");
                        sb.append(i(value.c()));
                        if (value.getD()) {
                            sb.append(" not null unique");
                        }
                        Object objH = h(value.c(), value.getE());
                        if (objH != null) {
                            sb.append(" default ");
                            sb.append(objH);
                        }
                        arrayList.add(sb.toString());
                    }
                }
            }
        }
        return arrayList;
    }

    public final w25 l(Class<?> clazz) {
        try {
            l25 l25Var = (l25) clazz.getAnnotation(l25.class);
            if (l25Var == null) {
                return null;
            }
            Intrinsics.checkExpressionValueIsNotNull(l25Var, "clazz.getAnnotation(DbEn…lass.java) ?: return null");
            w25 w25Var = new w25();
            w25Var.d(l25Var.addedVersion());
            w25Var.f(l25Var.tableName());
            w25Var.e(l25Var.indices());
            return w25Var;
        } catch (Exception e) {
            ypj.b(ypj.INSTANCE, "DbAnnotationParser", null, e, 2, null);
            return null;
        }
    }

    public final h25 m(Field field) {
        boolean z = true;
        try {
            field.setAccessible(true);
            m25 m25Var = (m25) field.getAnnotation(m25.class);
            if (m25Var == null) {
                return null;
            }
            h25 h25Var = new h25();
            if (m25Var.dbColumnName().length() != 0) {
                z = false;
            }
            if (z) {
                String name = field.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "field.name");
                h25Var.g(g(name));
            } else {
                h25Var.g(m25Var.dbColumnName());
            }
            h25Var.f(m25Var.addedVersion());
            h25Var.h(field.getType());
            h25Var.j(m25Var.isUnique());
            h25Var.i(m25Var.defaultValue());
            return h25Var;
        } catch (Exception e) {
            ypj.b(ypj.INSTANCE, "DbAnnotationParser", null, e, 2, null);
            return null;
        }
    }
}
