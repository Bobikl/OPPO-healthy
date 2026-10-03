package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.f4j;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
enum SingleInternalHelper$NoSuchElementSupplier implements f4j<NoSuchElementException> {
    INSTANCE;

    @Override // com.oplus.aiunit.vision.f4j
    public NoSuchElementException get() {
        return new NoSuchElementException();
    }
}
