package com.heytap.health.wallet.autoswitch;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import com.heytap.health.wallet.model.db.DatabaseCard;
import com.oplus.aiunit.vision.o6l;

/* JADX INFO: loaded from: classes18.dex */
public class CardContentProvider extends ContentProvider {
    private static final int CARD_QUERY_ALL = 1000;
    private static final String TAG = "CardContentProvider";
    private UriMatcher matcher;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.matcher = uriMatcher;
        uriMatcher.addURI(getContext().getPackageName(), "card/installed", 1000);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.matcher.match(uri);
        Log.w(TAG, "matchCode=" + iMatch);
        if (iMatch != 1000) {
            return new MatrixCursor(new String[0]);
        }
        try {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"AID", "DISPLAY_NAME", "CARD_TYPE", "CARD_CITY_CODE", "CARD_EXT_DATA"});
            for (DatabaseCard databaseCard : o6l.t()) {
                if (databaseCard.getStatus().equals("SUC")) {
                    matrixCursor.addRow(new Object[]{databaseCard.getAid(), databaseCard.getDisplayName(), databaseCard.getCardType(), databaseCard.getAppCode(), null});
                }
            }
            return matrixCursor;
        } catch (Throwable th) {
            Log.w(TAG, "Query failed: " + th.getMessage());
            return new MatrixCursor(new String[0]);
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
