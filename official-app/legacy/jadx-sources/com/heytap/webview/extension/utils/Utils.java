package com.heytap.webview.extension.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¨\u0006\u001a"}, d2 = {"Lcom/heytap/webview/extension/utils/Utils;", "", "()V", "getDataColumn", "", "context", "Landroid/content/Context;", ParserTag.TAG_URI, "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getMessageFromThrowable", "throwable", "", "getRealPathFromUriAboveApi19", "isDownloadsDocument", "", "isExternalStorageDocument", "isInPrivateDir", "isMediaDocument", "isSameOrSubDirectory", "base", "Ljava/io/File;", "child", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/heytap/webview/extension/utils/Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    private final String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) {
        Cursor cursorQuery;
        String[] strArr = {"_data"};
        if (uri != null) {
            try {
                cursorQuery = context.getContentResolver().query(uri, strArr, selection, selectionArgs, null);
            } catch (Exception unused) {
                cursorQuery = null;
                if (cursorQuery != null) {
                    return null;
                }
                cursorQuery.close();
                return null;
            }
        } else {
            cursorQuery = null;
        }
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strArr[0]));
            }
            return null;
        } catch (Exception unused2) {
            if (cursorQuery != null) {
                return null;
            }
            cursorQuery.close();
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    private final String getRealPathFromUriAboveApi19(Context context, Uri uri) {
        String dataColumn = null;
        if ((!DocumentsContract.isDocumentUri(context, uri) || (!isMediaDocument(uri) && !isDownloadsDocument(uri) && !isExternalStorageDocument(uri))) && StringsKt__StringsJVMKt.equals("content", uri.getScheme(), true)) {
            dataColumn = getDataColumn(context, uri, null, null);
        }
        Log.d("utils", "filePath:" + dataColumn);
        return dataColumn;
    }

    private final boolean isDownloadsDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    private final boolean isExternalStorageDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    private final boolean isMediaDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    private final boolean isSameOrSubDirectory(File base, File child) {
        try {
            File canonicalFile = base.getCanonicalFile();
            Intrinsics.checkNotNullExpressionValue(canonicalFile, "base.canonicalFile");
            File canonicalFile2 = child.getCanonicalFile();
            Intrinsics.checkNotNullExpressionValue(canonicalFile2, "child.canonicalFile");
            while (canonicalFile2 != null) {
                if (canonicalFile.equals(canonicalFile2)) {
                    return true;
                }
                canonicalFile2 = canonicalFile2.getParentFile();
            }
            return false;
        } catch (IOException e2) {
            Log.e("utils", "Error while accessing file", e2);
            return false;
        }
    }

    @Nullable
    public final String getMessageFromThrowable(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        Closer closer = Closer.INSTANCE;
        closer.close(printWriter);
        String string = stringWriter.toString();
        closer.close(stringWriter);
        return string;
    }

    public final boolean isInPrivateDir(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return false;
        }
        if (TextUtils.equals(uri.getScheme(), Const.Scheme.SCHEME_FILE)) {
            File file = new File(uri.getPath());
            File dataDirectory = Environment.getDataDirectory();
            Intrinsics.checkNotNullExpressionValue(dataDirectory, "getDataDirectory()");
            return isSameOrSubDirectory(dataDirectory, file);
        }
        String realPathFromUriAboveApi19 = getRealPathFromUriAboveApi19(context, uri);
        if (realPathFromUriAboveApi19 == null) {
            return false;
        }
        Utils utils = INSTANCE;
        File dataDirectory2 = Environment.getDataDirectory();
        Intrinsics.checkNotNullExpressionValue(dataDirectory2, "getDataDirectory()");
        return utils.isSameOrSubDirectory(dataDirectory2, new File(realPathFromUriAboveApi19));
    }
}
