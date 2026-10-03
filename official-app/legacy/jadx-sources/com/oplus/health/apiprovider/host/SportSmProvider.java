package com.oplus.health.apiprovider.host;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.heytap.health.annotation.ProcessName;
import com.oplus.aiunit.vision.v8g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public class SportSmProvider extends v8g {
    public SportSmProvider() {
        super(ProcessName.SPORT_DAEMON_SERVICE);
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider
    public /* bridge */ /* synthetic */ int delete(Uri uri, String str, String[] strArr) {
        return super.delete(uri, str, strArr);
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider
    public /* bridge */ /* synthetic */ void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider
    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return super.getType(uri);
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider
    public /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return super.insert(uri, contentValues);
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider
    public /* bridge */ /* synthetic */ boolean onCreate() {
        return super.onCreate();
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider, android.content.ComponentCallbacks2
    public /* bridge */ /* synthetic */ void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider
    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // com.oplus.aiunit.vision.v8g, android.content.ContentProvider
    public /* bridge */ /* synthetic */ int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return super.update(uri, contentValues, str, strArr);
    }
}
