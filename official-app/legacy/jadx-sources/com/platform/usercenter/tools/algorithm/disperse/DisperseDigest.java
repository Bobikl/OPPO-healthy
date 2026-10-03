package com.platform.usercenter.tools.algorithm.disperse;

/* JADX INFO: loaded from: classes9.dex */
public class DisperseDigest {

    public static class DisperseProxy implements IDisperseSpi {
        IDisperseSpi disperseSpi;

        public DisperseProxy(IDisperseSpi iDisperseSpi) {
            this.disperseSpi = iDisperseSpi;
        }

        @Override // com.platform.usercenter.tools.algorithm.disperse.IDisperseSpi
        public DisperseResponse disperse(IDisperseSpi.DisperseParam disperseParam) {
            return this.disperseSpi.disperse(disperseParam);
        }
    }

    public static DisperseProxy getInstance(String str) {
        IDisperseSpi iDisperseSpiCreateDisperseSpi = DisperseImplFactory.createDisperseSpi(str);
        if (iDisperseSpiCreateDisperseSpi != null) {
            return new DisperseProxy(iDisperseSpiCreateDisperseSpi);
        }
        throw new RuntimeException("no such algorithm implement");
    }
}
