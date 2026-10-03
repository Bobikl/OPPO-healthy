package okhttp3.internal.publicsuffix;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.MutablePropertyReference0Impl;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends MutablePropertyReference0Impl {
    public PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase, PublicSuffixDatabase.class, "publicSuffixListBytes", "getPublicSuffixListBytes()[B", 0);
    }

    @Override // p010kotlin.jvm.internal.MutablePropertyReference0Impl, p010kotlin.reflect.KProperty0
    @Nullable
    public Object get() {
        return PublicSuffixDatabase.b((PublicSuffixDatabase) this.receiver);
    }

    @Override // p010kotlin.jvm.internal.MutablePropertyReference0Impl, p010kotlin.reflect.KMutableProperty0
    public void set(@Nullable Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}
