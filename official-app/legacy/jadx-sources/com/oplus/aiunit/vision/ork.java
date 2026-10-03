package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J=\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/ork;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", ParserTag.TAG_URI, "", MapSchema.FIELD_NAME_ENTRY, "Ljava/io/File;", "base", "child", b2n.f, "", "b", "selection", "", "selectionArgs", "a", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "f", "c", "d", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class ork {
    public static final ork INSTANCE = new ork();

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    public final String a(Context context, Uri uri, String selection, String[] selectionArgs) {
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
    public final String b(Context context, Uri uri) {
        String strA = null;
        if ((!DocumentsContract.isDocumentUri(context, uri) || (!f(uri) && !c(uri) && !d(uri))) && StringsKt__StringsJVMKt.equals("content", uri.getScheme(), true)) {
            strA = a(context, uri, null, null);
        }
        q7b.c("utils", "getRealPathFromUriAboveApi19 filePath: %s", strA);
        return strA;
    }

    public final boolean c(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    public final boolean d(Uri uri) {
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    public final boolean e(@NotNull Context context, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (uri == null) {
            return false;
        }
        if (TextUtils.equals(uri.getScheme(), Const.Scheme.SCHEME_FILE)) {
            File file = new File(uri.getPath());
            File dataDirectory = Environment.getDataDirectory();
            Intrinsics.checkNotNullExpressionValue(dataDirectory, "Environment.getDataDirectory()");
            return g(dataDirectory, file);
        }
        String strB = b(context, uri);
        if (strB == null) {
            return false;
        }
        ork orkVar = INSTANCE;
        File dataDirectory2 = Environment.getDataDirectory();
        Intrinsics.checkNotNullExpressionValue(dataDirectory2, "Environment.getDataDirectory()");
        return orkVar.g(dataDirectory2, new File(strB));
    }

    public final boolean f(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    public final boolean g(File base, File child) {
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
        } catch (IOException e2) {
            q7b.f("utils", "isSameOrSubDirectory error while accessing file", e2);
        }
        return false;
    }
}
