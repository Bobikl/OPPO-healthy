package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import io.protostuff.MapSchema;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\n\u001a\u00020\t2\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J5\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/s8b;", "Lcom/oplus/aiunit/vision/f9g;", "Ljava/util/Objects;", "", "", "projection", "selection", "selectionArgs", "sortOrde", "Landroid/database/Cursor;", "f", "([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "", MapSchema.FIELD_NAME_ENTRY, "", b2n.g, "(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "b", "(Ljava/lang/String;[Ljava/lang/String;)I", "a", "Landroid/content/ContentProvider;", "contentProvider", "<init>", "(Landroid/content/ContentProvider;)V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class s8b extends f9g<Objects> {
    public s8b(@Nullable ContentProvider contentProvider) {
        super(contentProvider);
    }

    @Override // com.oplus.aiunit.vision.f74
    public boolean a() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.f74
    public int b(@Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.f74
    public boolean e(@Nullable ContentValues values) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.f74
    @NotNull
    public Cursor f(@Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrde) {
        int i = (v9g.w().r("has_launched", false) && (g3k.x() ^ true)) ? 1 : 0;
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"hasLaunched"}, 1);
        matrixCursor.addRow(new Object[]{Integer.valueOf(i)});
        return matrixCursor;
    }

    @Override // com.oplus.aiunit.vision.f74
    public int h(@Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
