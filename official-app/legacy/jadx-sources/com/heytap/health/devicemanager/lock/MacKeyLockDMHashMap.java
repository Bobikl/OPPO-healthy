package com.heytap.health.devicemanager.lock;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.kam;
import io.netty.util.internal.StringUtil;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/devicemanager/lock/MacKeyLockDMHashMap;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "", "()V", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MacKeyLockDMHashMap<V> extends LockDMHashMap<String, V> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ V get(Object obj) {
        if (obj instanceof String) {
            return (V) get((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ V remove(Object obj) {
        if (obj instanceof String) {
            return (V) remove((String) obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (Map.Entry<String, V> entry : entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry, "i.next()");
            Map.Entry<String, V> entry2 = entry;
            String key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "e.key");
            V value = entry2.getValue();
            sb.append(gdb.a(key));
            sb.append(kam.h);
            sb.append(value);
            sb.append(StringUtil.COMMA);
            sb.append(StringUtil.SPACE);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.append('}').toString()");
        return string;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj instanceof String) {
            return remove((String) obj, obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }
}
