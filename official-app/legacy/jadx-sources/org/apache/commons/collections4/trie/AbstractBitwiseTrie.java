package org.apache.commons.collections4.trie;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import org.apache.commons.collections4.Trie;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractBitwiseTrie<K, V> extends AbstractMap<K, V> implements Trie<K, V>, Serializable {
    private static final long serialVersionUID = 5826987063535505652L;
    private final KeyAnalyzer<? super K> keyAnalyzer;

    public AbstractBitwiseTrie(KeyAnalyzer<? super K> keyAnalyzer) {
        if (keyAnalyzer == null) {
            throw new NullPointerException("keyAnalyzer");
        }
        this.keyAnalyzer = keyAnalyzer;
    }

    public static boolean compare(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final int bitIndex(K k, K k2) {
        return this.keyAnalyzer.bitIndex(k, 0, lengthInBits(k), k2, 0, lengthInBits(k2));
    }

    public final int bitsPerElement() {
        return this.keyAnalyzer.bitsPerElement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final K castKey(Object obj) {
        return obj;
    }

    public final boolean compareKeys(K k, K k2) {
        if (k == null) {
            return k2 == null;
        }
        return k2 != null && this.keyAnalyzer.compare(k, k2) == 0;
    }

    public KeyAnalyzer<? super K> getKeyAnalyzer() {
        return this.keyAnalyzer;
    }

    public final boolean isBitSet(K k, int i, int i2) {
        if (k == null) {
            return false;
        }
        return this.keyAnalyzer.isBitSet(k, i, i2);
    }

    public final int lengthInBits(K k) {
        if (k == null) {
            return 0;
        }
        return this.keyAnalyzer.lengthInBits(k);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trie[");
        sb.append(size());
        sb.append("]={\n");
        for (Map.Entry<K, V> entry : entrySet()) {
            sb.append("  ");
            sb.append(entry);
            sb.append(Weather.SEPARATOR);
        }
        sb.append("}\n");
        return sb.toString();
    }

    public static abstract class BasicEntry<K, V> implements Map.Entry<K, V>, Serializable {
        private static final long serialVersionUID = -944364551314110330L;
        protected K key;
        protected V value;

        public BasicEntry(K k) {
            this.key = k;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractBitwiseTrie.compare(this.key, entry.getKey()) && AbstractBitwiseTrie.compare(this.value, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        public V setKeyValue(K k, V v) {
            this.key = k;
            return setValue(v);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.value;
            this.value = v;
            return v2;
        }

        public String toString() {
            return this.key + HttpUtils.EQUAL_SIGN + this.value;
        }

        public BasicEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }
    }
}
