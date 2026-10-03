package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class uii extends f9g {
    public static final String READ_SCOPE = "MATCH_SPORT_STATE";

    public uii(ContentProvider contentProvider) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("selection: ");
        sb.append(str);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"sportState"}, 1);
        matrixCursor.addRow(new Object[]{Integer.valueOf(v9g.x("preference_sport").q("is_in_movement") ? 1 : 0)});
        return matrixCursor;
    }

    @Override // com.oplus.aiunit.vision.f74
    public String g() {
        return READ_SCOPE;
    }

    @Override // com.oplus.aiunit.vision.f74
    public int h(@Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
