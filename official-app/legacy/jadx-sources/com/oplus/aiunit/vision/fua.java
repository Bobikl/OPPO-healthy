package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.oplus.utrace.lib.PackageNames;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public class fua extends f9g {
    public static final String READ_SCOPE = "READ_APP_LAUNCHED";
    public static final boolean SUPPORT_QUICK_APP = true;

    public fua(ContentProvider contentProvider) {
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
        boolean zO = o();
        a7b.f("LaunchedAdapter", "query:" + zO + "/true");
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"hasLaunched", "supportQuickApp"}, 1);
        matrixCursor.addRow(new Object[]{Integer.valueOf(zO ? 1 : 0), 1});
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

    public final boolean o() {
        if (TextUtils.equals(d().getCallingPackage(), "com.coloros.assistantscreen") || TextUtils.equals(d().getCallingPackage(), PackageNames.METIS) || TextUtils.equals(d().getCallingPackage(), "com.android.systemui")) {
            return !g3k.I();
        }
        return true;
    }
}
