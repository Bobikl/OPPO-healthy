package com.heytap.baselib.database;

import android.content.ContentValues;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.j6f;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u001aJ,\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\u001e\u0010\u0016\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H&J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0012H&¨\u0006\u001b"}, d2 = {"Lcom/heytap/baselib/database/ITapDatabase;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/j6f;", "queryParam", "Ljava/lang/Class;", "classType", "", "a", "entityList", "Lcom/heytap/baselib/database/ITapDatabase$InsertType;", "insertType", "", "", MapSchema.FIELD_NAME_ENTRY, "(Ljava/util/List;Lcom/heytap/baselib/database/ITapDatabase$InsertType;)[Ljava/lang/Long;", "Landroid/content/ContentValues;", "values", "", "whereClause", "", "c", "b", "sql", "", "d", "InsertType", "TapDatabase"}, k = 1, mv = {1, 4, 0})
public interface ITapDatabase {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/baselib/database/ITapDatabase$InsertType;", "", "(Ljava/lang/String;I)V", "TYPE_INSERT_IGNORE_ON_CONFLICT", "TYPE_INSERT_REPLACE_ON_CONFLICT", "TapDatabase"}, k = 1, mv = {1, 1, 16})
    public enum InsertType {
        TYPE_INSERT_IGNORE_ON_CONFLICT,
        TYPE_INSERT_REPLACE_ON_CONFLICT
    }

    @Nullable
    <T> List<T> a(@NotNull j6f queryParam, @NotNull Class<T> classType);

    int b(@Nullable String whereClause, @NotNull Class<?> classType);

    int c(@NotNull ContentValues values, @Nullable String whereClause, @NotNull Class<?> classType);

    void d(@NotNull String sql);

    @Nullable
    Long[] e(@NotNull List<? extends Object> entityList, @NotNull InsertType insertType);
}
