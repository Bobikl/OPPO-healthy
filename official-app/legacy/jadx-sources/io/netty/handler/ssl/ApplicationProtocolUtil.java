package io.netty.handler.ssl;

import com.heytap.log.formatter.LogFieldKey;
import io.netty.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
final class ApplicationProtocolUtil {
    private static final int DEFAULT_LIST_SIZE = 2;

    private ApplicationProtocolUtil() {
    }

    public static List<String> toList(Iterable<String> iterable) {
        return toList(2, iterable);
    }

    public static List<String> toList(int i, Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(ObjectUtil.checkNonEmpty(it.next(), LogFieldKey.PROCESS_NAME_KEY));
        }
        return (List) ObjectUtil.checkNonEmpty(arrayList, "result");
    }

    public static List<String> toList(String... strArr) {
        return toList(2, strArr);
    }

    public static List<String> toList(int i, String... strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        for (String str : strArr) {
            arrayList.add(ObjectUtil.checkNonEmpty(str, LogFieldKey.PROCESS_NAME_KEY));
        }
        return (List) ObjectUtil.checkNonEmpty(arrayList, "result");
    }
}
