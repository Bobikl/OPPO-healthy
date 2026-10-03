package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class pij extends f9g {
    public pij(ContentProvider contentProvider) {
        super(contentProvider);
    }

    @Override // com.oplus.aiunit.vision.f74
    public int b(@Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.f74
    public boolean e(@Nullable ContentValues contentValues) {
        return false;
    }

    @Override // com.oplus.aiunit.vision.f74
    public Cursor f(@Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        String strE = v9g.x("privacy_sync_data_state").E("privacy_data_sync_state", "1");
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"syncState"}, 1);
        matrixCursor.addRow(new Object[]{strE});
        return matrixCursor;
    }

    @Override // com.oplus.aiunit.vision.f74
    public int h(@Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
