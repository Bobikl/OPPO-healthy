package com.heytap.store.base.core.util;

import com.oplus.smartenginehelper.ParserTag;
import io.netty.util.internal.StringUtil;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/base/core/util/Acache;", "", "()V", "SEPARATOR", "", "TIME_DAY", "", "TIME_HOUR", "TIME_MINUTE", "map", "", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "createDateValue", "value", "saveTime", ParserTag.TAG_GET, "key", "put", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Acache {

    @NotNull
    private static final String SEPARATOR = " ";
    public static final int TIME_DAY = 86400000;
    public static final int TIME_HOUR = 3600000;
    public static final int TIME_MINUTE = 60000;

    @NotNull
    public static final Acache INSTANCE = new Acache();

    @NotNull
    private static Map<String, String> map = new LinkedHashMap();

    private Acache() {
    }

    private final String createDateValue(String value, int saveTime) {
        return (System.currentTimeMillis() + ((long) saveTime)) + StringUtil.SPACE + value;
    }

    @NotNull
    public final String get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (map.containsKey(key)) {
            String str = map.get(key);
            Intrinsics.checkNotNull(str);
            return str;
        }
        String value = SpUtil.getString(key, "");
        if (value == null || value.length() == 0) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(value, "value");
        if (!StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) SEPARATOR, false, 2, (Object) null)) {
            return "";
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) value, new String[]{SEPARATOR}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2 || System.currentTimeMillis() > Long.parseLong((String) listSplit$default.get(0))) {
            return "";
        }
        map.put(key, (String) listSplit$default.get(1));
        return (String) listSplit$default.get(1);
    }

    @NotNull
    public final Map<String, String> getMap() {
        return map;
    }

    public final void put(@NotNull String key, @NotNull String value, int saveTime) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        map.put(key, value);
        SpUtil.putStringOnBackground(key, createDateValue(value, saveTime));
    }

    public final void setMap(@NotNull Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(map2, "<set-?>");
        map = map2;
    }

    public final void put(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        map.put(key, value);
        SpUtil.putStringOnBackground(key, value);
    }
}
