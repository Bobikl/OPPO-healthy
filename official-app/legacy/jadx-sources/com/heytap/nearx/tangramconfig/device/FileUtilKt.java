package com.heytap.nearx.tangramconfig.device;

import com.heytap.nearx.tangramconfig.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.io.FilesKt__FileReadWriteKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0005\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"getFolderName", "", "filePath", "makeDirs", "", "readFile", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "charsetName", "writeFile", "content", "append", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class FileUtilKt {
    private static final String getFolderName(String str) {
        if (str.length() == 0) {
            return str;
        }
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, separator, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return "";
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private static final boolean makeDirs(String str) {
        String folderName = getFolderName(str);
        if (folderName.length() == 0) {
            return false;
        }
        File file = new File(folderName);
        return file.exists() || file.mkdirs();
    }

    @Nullable
    public static final StringBuilder readFile(@NotNull String filePath, @NotNull String charsetName) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(charsetName, "charsetName");
        File file = new File(filePath);
        StringBuilder sb = new StringBuilder("");
        if (!file.isFile()) {
            return null;
        }
        Charset charsetForName = Charset.forName(charsetName);
        Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
        Iterator it = FilesKt__FileReadWriteKt.readLines(file, charsetForName).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append("\r\n");
        }
        return sb;
    }

    public static final boolean writeFile(@NotNull String filePath, @NotNull String content, boolean z) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(content, "content");
        if (content.length() == 0) {
            return false;
        }
        try {
            makeDirs(filePath);
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FilesKt__FileReadWriteKt.writeText$default(file, content, null, 2, null);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
