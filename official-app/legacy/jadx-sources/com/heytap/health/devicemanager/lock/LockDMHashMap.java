package com.heytap.health.devicemanager.lock;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.jo4;
import com.oplus.aiunit.vision.ll4;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\t\u0010\b\u001a\u00020\u0006H\u0096\u0001J\t\u0010\t\u001a\u00020\u0006H\u0096\u0001J\t\u0010\n\u001a\u00020\u0006H\u0096\u0001¨\u0006\r"}, d2 = {"Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Lcom/oplus/aiunit/vision/ll4;", "", "readLock", "readUnLock", "writeLock", "writeUnLock", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public class LockDMHashMap<K, V> extends HashMap<K, V> implements ll4 {
    private final /* synthetic */ jo4 $$delegate_0 = new jo4();

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void readLock() {
        this.$$delegate_0.readLock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void readUnLock() {
        this.$$delegate_0.readUnLock();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeLock() {
        this.$$delegate_0.writeLock();
    }

    @Override // com.oplus.aiunit.vision.ll4
    public void writeUnLock() {
        this.$$delegate_0.writeUnLock();
    }
}
