package com.heytap.health.backup;

import androidx.annotation.Keep;
import com.heytap.health.base.text.GsonUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/backup/SPDataItem;", "", "spName", "", "(Ljava/lang/String;)V", "boolData", "", "", "getBoolData", "()Ljava/util/Map;", "floatData", "", "getFloatData", "intData", "", "getIntData", "longData", "", "getLongData", "getSpName", "()Ljava/lang/String;", "stringData", "getStringData", "toString", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SPDataItem {

    @NotNull
    private final Map<String, Boolean> boolData;

    @NotNull
    private final Map<String, Float> floatData;

    @NotNull
    private final Map<String, Integer> intData;

    @NotNull
    private final Map<String, Long> longData;

    @NotNull
    private final String spName;

    @NotNull
    private final Map<String, String> stringData;

    public SPDataItem(@NotNull String spName) {
        Intrinsics.checkNotNullParameter(spName, "spName");
        this.spName = spName;
        this.stringData = new LinkedHashMap();
        this.boolData = new LinkedHashMap();
        this.intData = new LinkedHashMap();
        this.longData = new LinkedHashMap();
        this.floatData = new LinkedHashMap();
    }

    @NotNull
    public final Map<String, Boolean> getBoolData() {
        return this.boolData;
    }

    @NotNull
    public final Map<String, Float> getFloatData() {
        return this.floatData;
    }

    @NotNull
    public final Map<String, Integer> getIntData() {
        return this.intData;
    }

    @NotNull
    public final Map<String, Long> getLongData() {
        return this.longData;
    }

    @NotNull
    public final String getSpName() {
        return this.spName;
    }

    @NotNull
    public final Map<String, String> getStringData() {
        return this.stringData;
    }

    @NotNull
    public String toString() {
        String strE = GsonUtil.e(this);
        Intrinsics.checkNotNullExpressionValue(strE, "toJson(this)");
        return strE;
    }
}
