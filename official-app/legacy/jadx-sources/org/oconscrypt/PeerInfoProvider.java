package org.oconscrypt;

/* JADX INFO: loaded from: classes11.dex */
abstract class PeerInfoProvider {
    private static final PeerInfoProvider NULL_PEER_INFO_PROVIDER = new PeerInfoProvider() { // from class: org.oconscrypt.PeerInfoProvider.1
        @Override // org.oconscrypt.PeerInfoProvider
        public String getHostname() {
            return null;
        }

        @Override // org.oconscrypt.PeerInfoProvider
        public String getHostnameOrIP() {
            return null;
        }

        @Override // org.oconscrypt.PeerInfoProvider
        public int getPort() {
            return -1;
        }
    };

    public static PeerInfoProvider forHostAndPort(final String str, final int i) {
        return new PeerInfoProvider() { // from class: org.oconscrypt.PeerInfoProvider.2
            @Override // org.oconscrypt.PeerInfoProvider
            public String getHostname() {
                return str;
            }

            @Override // org.oconscrypt.PeerInfoProvider
            public String getHostnameOrIP() {
                return str;
            }

            @Override // org.oconscrypt.PeerInfoProvider
            public int getPort() {
                return i;
            }
        };
    }

    public static PeerInfoProvider nullProvider() {
        return NULL_PEER_INFO_PROVIDER;
    }

    public abstract String getHostname();

    public abstract String getHostnameOrIP();

    public abstract int getPort();
}
