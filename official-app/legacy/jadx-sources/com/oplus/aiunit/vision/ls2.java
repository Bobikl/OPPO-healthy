package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes16.dex */
public class ls2 extends f9g {
    public ls2(ContentProvider contentProvider) {
        super(contentProvider);
    }

    public static void o(Context context, boolean z) {
        if (context != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("updateState: ");
            sb.append(z);
            v9g.w().W("key_callforwar", z);
            ContentValues contentValues = new ContentValues();
            contentValues.put("forwardState", Boolean.valueOf(z));
            try {
                context.getApplicationContext().getContentResolver().update(Uri.parse("content://com.heytap.health.sporthealthprovider/telecom/forward"), contentValues, null, null);
            } catch (Exception e2) {
                a7b.b("CallForwardAdapter", "updateState Exception : " + e2.getMessage());
            }
        }
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
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"forwardState"}, 1);
        matrixCursor.addRow(new Object[]{Integer.valueOf(v9g.w().r("key_callforwar", false) ? 1 : 0)});
        return matrixCursor;
    }

    @Override // com.oplus.aiunit.vision.f74
    public String g() {
        return "READ_CALL_FORWARD_STATE";
    }

    @Override // com.oplus.aiunit.vision.f74
    public int h(@Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 1;
    }
}
