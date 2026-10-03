package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new MutabilityOracle() { // from class: com.google.crypto.tink.shaded.protobuf.MutabilityOracle.1
        @Override // com.google.crypto.tink.shaded.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
