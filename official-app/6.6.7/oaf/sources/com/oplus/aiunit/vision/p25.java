package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQueryBuilder;
import com.heytap.baselib.database.ITapDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J9\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J,\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J>\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ4\u0010\u001d\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u0004J4\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJH\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0002JD\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0002J \u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0014H\u0002J$\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u00122\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u0002J*\u0010-\u001a\u0004\u0018\u00010\u00012\u0006\u0010%\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010\u00122\f\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010H\u0002¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/p25;", "", "Lcom/oplus/aiunit/vision/hq9;", "parser", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "entityList", "Lcom/heytap/baselib/database/ITapDatabase$InsertType;", "insertType", "", "", "g", "(Lcom/oplus/aiunit/vision/hq9;Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/util/List;Lcom/heytap/baselib/database/ITapDatabase$InsertType;)[Ljava/lang/Long;", "Landroid/content/ContentValues;", "values", "Ljava/lang/Class;", "classType", "", "whereClause", "", "k", "dbClass", "a", "T", "type", "Lcom/oplus/aiunit/vision/v8f;", "param", "d", "j", "b", "queryParam", "sql", "e", "c", "contentValues", "Landroid/database/Cursor;", "cursor", "index", "", "h", "columnName", "value", "i", "columnType", "f", "<init>", "()V", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public final class p25 {
    public static final p25 INSTANCE = new p25();

    public final int a(@NotNull hq9 parser, @NotNull Class<?> dbClass, @NotNull SupportSQLiteDatabase db, @Nullable String whereClause) {
        Intrinsics.checkParameterIsNotNull(parser, "parser");
        Intrinsics.checkParameterIsNotNull(dbClass, "dbClass");
        Intrinsics.checkParameterIsNotNull(db, "db");
        String strE = parser.e(dbClass);
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        return db.delete(strE, whereClause, (Object[]) null);
    }

    @Nullable
    public final List<ContentValues> b(@NotNull hq9 parser, @NotNull Class<?> type, @NotNull SupportSQLiteDatabase db, @Nullable v8f param) {
        Intrinsics.checkParameterIsNotNull(parser, "parser");
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(db, "db");
        return c(parser, type, db, param == null ? new v8f(false, null, null, null, null, null, null, null, 255, null) : param, null);
    }

    public final List<ContentValues> c(hq9 parser, Class<?> type, SupportSQLiteDatabase db, v8f queryParam, String sql) throws Throwable {
        Exception exc;
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            if (queryParam == null) {
                cursorQuery = db.query(sql);
            } else {
                if (parser == null) {
                    Intrinsics.throwNpe();
                }
                if (type == null) {
                    Intrinsics.throwNpe();
                }
                SupportSQLiteQueryBuilder supportSQLiteQueryBuilderBuilder = SupportSQLiteQueryBuilder.builder(parser.e(type));
                if (queryParam.getA()) {
                    supportSQLiteQueryBuilderBuilder.distinct();
                }
                supportSQLiteQueryBuilderBuilder.columns(queryParam.getB());
                supportSQLiteQueryBuilderBuilder.selection(queryParam.getC(), queryParam.getD());
                supportSQLiteQueryBuilderBuilder.groupBy(queryParam.getE());
                supportSQLiteQueryBuilderBuilder.having(queryParam.getF());
                supportSQLiteQueryBuilderBuilder.orderBy(queryParam.getG());
                supportSQLiteQueryBuilderBuilder.limit(queryParam.getH());
                cursorQuery = db.query(supportSQLiteQueryBuilderBuilder.create());
            }
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            ArrayList arrayList = new ArrayList();
                            do {
                                ContentValues contentValues = new ContentValues();
                                int columnCount = cursorQuery.getColumnCount();
                                for (int i = 0; i < columnCount; i++) {
                                    h(contentValues, cursorQuery, i);
                                }
                                arrayList.add(contentValues);
                            } while (cursorQuery.moveToNext());
                            cursorQuery.close();
                            return arrayList;
                        }
                    } catch (Exception e) {
                        exc = e;
                        ypj.b(ypj.INSTANCE, null, null, exc, 3, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                }
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Exception e2) {
            exc = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Nullable
    public final <T> List<T> d(@Nullable hq9 parser, @NotNull Class<T> type, @NotNull SupportSQLiteDatabase db, @Nullable v8f param) {
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(db, "db");
        if (parser == null) {
            return null;
        }
        return e(parser, type, db, param == null ? new v8f(false, null, null, null, null, null, null, null, 255, null) : param, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final <T> List<T> e(hq9 parser, Class<T> type, SupportSQLiteDatabase db, v8f queryParam, String sql) throws Throwable {
        Exception exc;
        Cursor cursorQuery;
        Object objF;
        Map<String, h25> mapC = parser.c(type);
        ?? r2 = 0;
        if (mapC == null) {
            return null;
        }
        try {
            try {
                if (queryParam == null) {
                    cursorQuery = db.query(sql);
                } else {
                    SupportSQLiteQueryBuilder supportSQLiteQueryBuilderBuilder = SupportSQLiteQueryBuilder.builder(parser.e(type));
                    if (queryParam.getA()) {
                        supportSQLiteQueryBuilderBuilder.distinct();
                    }
                    supportSQLiteQueryBuilderBuilder.columns(queryParam.getB());
                    supportSQLiteQueryBuilderBuilder.selection(queryParam.getC(), queryParam.getD());
                    supportSQLiteQueryBuilderBuilder.groupBy(queryParam.getE());
                    supportSQLiteQueryBuilderBuilder.having(queryParam.getF());
                    supportSQLiteQueryBuilderBuilder.orderBy(queryParam.getG());
                    supportSQLiteQueryBuilderBuilder.limit(queryParam.getH());
                    cursorQuery = db.query(supportSQLiteQueryBuilderBuilder.create());
                }
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            Set<Map.Entry<String, h25>> setEntrySet = mapC.entrySet();
                            ArrayList arrayList = new ArrayList();
                            do {
                                qnf qnfVar = qnf.INSTANCE;
                                Object objE = qnfVar.e(type);
                                if (objE != null && (objF = f(cursorQuery, "_id", Long.TYPE)) != null) {
                                    if (type == null) {
                                        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
                                    }
                                    qnfVar.f(type, "_id", objE, objF);
                                    for (Map.Entry<String, h25> entry : setEntrySet) {
                                        String key = entry.getKey();
                                        h25 value = entry.getValue();
                                        Object objF2 = f(cursorQuery, value.getB(), value.c());
                                        if (objF2 != null) {
                                            qnf.INSTANCE.f(type, key, objE, objF2);
                                        }
                                    }
                                    arrayList.add(objE);
                                }
                            } while (cursorQuery.moveToNext());
                            cursorQuery.close();
                            return arrayList;
                        }
                    } catch (Exception e) {
                        exc = e;
                        ypj.b(ypj.INSTANCE, null, null, exc, 3, null);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                r2 = parser;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.TypeCastException */
    public final Object f(Cursor cursor, String columnName, Class<?> columnType) throws TypeCastException {
        List listEmptyList;
        try {
            int columnIndex = cursor.getColumnIndex(columnName);
            Class cls = Integer.TYPE;
            if (!Intrinsics.areEqual(cls, columnType) && !Intrinsics.areEqual(cls, columnType)) {
                Class cls2 = Long.TYPE;
                if (!Intrinsics.areEqual(cls2, columnType) && !Intrinsics.areEqual(cls2, columnType)) {
                    if (!Intrinsics.areEqual(Double.TYPE, columnType) && !Intrinsics.areEqual(Double.TYPE, columnType)) {
                        Class cls3 = Float.TYPE;
                        if (!Intrinsics.areEqual(cls3, columnType) && !Intrinsics.areEqual(cls3, columnType)) {
                            if (Intrinsics.areEqual(String.class, columnType)) {
                                return cursor.getString(columnIndex);
                            }
                            Class cls4 = Boolean.TYPE;
                            if (!Intrinsics.areEqual(cls4, columnType) && !Intrinsics.areEqual(cls4, columnType)) {
                                if (Intrinsics.areEqual(byte[].class, columnType)) {
                                    return cursor.getBlob(columnIndex);
                                }
                                if (Intrinsics.areEqual(List.class, columnType)) {
                                    String string = cursor.getString(columnIndex);
                                    if (TextUtils.isEmpty(string)) {
                                        return null;
                                    }
                                    Intrinsics.checkExpressionValueIsNotNull(string, "data");
                                    List listSplit = new Regex(";").split(string, 0);
                                    if (!listSplit.isEmpty()) {
                                        ListIterator listIterator = listSplit.listIterator(listSplit.size());
                                        while (true) {
                                            if (!listIterator.hasPrevious()) {
                                                listEmptyList = CollectionsKt.emptyList();
                                                break;
                                            }
                                            if (!(((String) listIterator.previous()).length() == 0)) {
                                                listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                                break;
                                            }
                                        }
                                    } else {
                                        listEmptyList = CollectionsKt.emptyList();
                                        break;
                                    }
                                    Object[] array = listEmptyList.toArray(new String[0]);
                                    if (array == null) {
                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                    }
                                    String[] strArr = (String[]) array;
                                    return CollectionsKt.listOf((String[]) Arrays.copyOf(strArr, strArr.length));
                                }
                                return null;
                            }
                            return Boolean.valueOf(cursor.getInt(columnIndex) == 1);
                        }
                        return Float.valueOf(cursor.getFloat(columnIndex));
                    }
                    return Double.valueOf(cursor.getDouble(columnIndex));
                }
                return Long.valueOf(cursor.getLong(columnIndex));
            }
            return Integer.valueOf(cursor.getInt(columnIndex));
        } catch (Exception e) {
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Nullable
    public final Long[] g(@NotNull hq9 parser, @NotNull SupportSQLiteDatabase db, @NotNull List<?> entityList, @NotNull ITapDatabase.InsertType insertType) throws NoWhenBranchMatchedException {
        long jInsert;
        Intrinsics.checkParameterIsNotNull(parser, "parser");
        Intrinsics.checkParameterIsNotNull(db, "db");
        Intrinsics.checkParameterIsNotNull(entityList, "entityList");
        Intrinsics.checkParameterIsNotNull(insertType, "insertType");
        if (entityList.isEmpty()) {
            return null;
        }
        int i = 0;
        Object obj = entityList.get(0);
        if (obj != null) {
            Class<?> cls = obj.getClass();
            Map<String, h25> mapC = parser.c(cls);
            String strE = parser.e(cls);
            if (mapC != null && !TextUtils.isEmpty(strE)) {
                Set<Map.Entry<String, h25>> setEntrySet = mapC.entrySet();
                int size = entityList.size();
                Long[] lArr = new Long[size];
                for (int i2 = 0; i2 < size; i2++) {
                    lArr[i2] = -1L;
                }
                try {
                    for (Object obj2 : entityList) {
                        ContentValues contentValues = new ContentValues();
                        for (Map.Entry<String, h25> entry : setEntrySet) {
                            if (obj2 != null) {
                                String key = entry.getKey();
                                i(contentValues, entry.getValue().getB(), qnf.INSTANCE.c(cls, key, obj2));
                            }
                        }
                        int i3 = o25.$EnumSwitchMapping$0[insertType.ordinal()];
                        if (i3 == 1) {
                            jInsert = db.insert(strE, 4, contentValues);
                        } else {
                            if (i3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jInsert = db.insert(strE, 5, contentValues);
                        }
                        lArr[i] = Long.valueOf(jInsert);
                        i++;
                    }
                } catch (Exception e) {
                    ypj.b(ypj.INSTANCE, null, null, e, 3, null);
                }
                return lArr;
            }
        }
        return null;
    }

    public final void h(ContentValues contentValues, Cursor cursor, int index) {
        int type = cursor.getType(index);
        String columnName = cursor.getColumnName(index);
        if (TextUtils.isEmpty(columnName)) {
            return;
        }
        if (type == 1) {
            contentValues.put(columnName, Long.valueOf(cursor.getLong(index)));
            return;
        }
        if (type == 2) {
            contentValues.put(columnName, Double.valueOf(cursor.getDouble(index)));
        } else if (type == 3) {
            contentValues.put(columnName, cursor.getString(index));
        } else {
            if (type != 4) {
                return;
            }
            contentValues.put(columnName, cursor.getBlob(index));
        }
    }

    public final void i(ContentValues contentValues, String columnName, Object value) {
        if (value == null) {
            return;
        }
        try {
            if (value instanceof Long) {
                contentValues.put(columnName, (Long) value);
                return;
            }
            if (value instanceof Integer) {
                contentValues.put(columnName, (Integer) value);
                return;
            }
            if (value instanceof Double) {
                contentValues.put(columnName, (Double) value);
                return;
            }
            if (value instanceof Float) {
                contentValues.put(columnName, (Float) value);
                return;
            }
            if (value instanceof String) {
                contentValues.put(columnName, (String) value);
                return;
            }
            if (value instanceof Boolean) {
                contentValues.put(columnName, (Boolean) value);
                return;
            }
            if (value instanceof byte[]) {
                contentValues.put(columnName, (byte[]) value);
                return;
            }
            if (value instanceof List) {
                List list = (List) value;
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i++;
                    sb.append(it.next());
                    if (i < size) {
                        sb.append(";");
                    }
                }
                contentValues.put(columnName, sb.toString());
            }
        } catch (Exception e) {
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
        }
    }

    public final <T> int j(@NotNull hq9 parser, @NotNull Class<T> type, @Nullable String whereClause, @NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkParameterIsNotNull(parser, "parser");
        Intrinsics.checkParameterIsNotNull(type, "type");
        Intrinsics.checkParameterIsNotNull(db, "db");
        String str = "select count(*) from " + parser.e(type) + " where " + whereClause;
        Cursor cursorQuery = null;
        int i = -1;
        try {
            cursorQuery = db.query(str);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                i = cursorQuery.getInt(0);
            }
        } catch (Exception e) {
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return i;
    }

    public final int k(@NotNull hq9 parser, @NotNull SupportSQLiteDatabase db, @NotNull ContentValues values, @NotNull Class<?> classType, @Nullable String whereClause) {
        Intrinsics.checkParameterIsNotNull(parser, "parser");
        Intrinsics.checkParameterIsNotNull(db, "db");
        Intrinsics.checkParameterIsNotNull(values, "values");
        Intrinsics.checkParameterIsNotNull(classType, "classType");
        String strE = parser.e(classType);
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            db.update(strE, 5, values, whereClause, (Object[]) null);
        } catch (Exception e) {
            ypj.b(ypj.INSTANCE, null, null, e, 3, null);
        }
        return 0;
    }
}
