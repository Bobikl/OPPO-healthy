package io.netty.handler.ssl;

import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.SuppressJava6Requirement;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

/* JADX INFO: loaded from: classes10.dex */
@SuppressJava6Requirement(reason = "Usage guarded by java version check")
final class BouncyCastleAlpnSslUtils {
    private static final Class BC_APPLICATION_PROTOCOL_SELECTOR;
    private static final Method BC_APPLICATION_PROTOCOL_SELECTOR_SELECT;
    private static final Class BC_SSL_PARAMETERS;
    private static final Method GET_APPLICATION_PROTOCOL;
    private static final Method GET_HANDSHAKE_APPLICATION_PROTOCOL;
    private static final Method GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR;
    private static final Method SET_APPLICATION_PROTOCOLS;
    private static final Method SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR;
    private static final Method SET_PARAMETERS;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) BouncyCastleAlpnSslUtils.class);

    static {
        final Class<?> cls;
        Method method;
        Method method2;
        final Class<?> cls2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        try {
            final Class<?> cls3 = Class.forName("org.bouncycastle.jsse.BCSSLEngine");
            cls = Class.forName("org.bouncycastle.jsse.BCSSLParameters");
            Object objNewInstance = cls.newInstance();
            cls2 = Class.forName("org.bouncycastle.jsse.BCApplicationProtocolSelector");
            method3 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.1
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return cls2.getMethod("select", Object.class, List.class);
                }
            });
            SSLEngine sSLEngineCreateSSLEngine = SslUtils.getSSLContext("BCJSSE").createSSLEngine();
            method4 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.2
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return cls3.getMethod("setParameters", cls);
                }
            });
            method4.invoke(sSLEngineCreateSSLEngine, objNewInstance);
            method5 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.3
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return cls.getMethod("setApplicationProtocols", String[].class);
                }
            });
            method5.invoke(objNewInstance, EmptyArrays.EMPTY_STRINGS);
            method2 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.4
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return cls3.getMethod("getApplicationProtocol", new Class[0]);
                }
            });
            method2.invoke(sSLEngineCreateSSLEngine, new Object[0]);
            method6 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.5
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return cls3.getMethod("getHandshakeApplicationProtocol", new Class[0]);
                }
            });
            method6.invoke(sSLEngineCreateSSLEngine, new Object[0]);
            method7 = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.6
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return cls3.getMethod("setBCHandshakeApplicationProtocolSelector", cls2);
                }
            });
            method = (Method) AccessController.doPrivileged(new PrivilegedExceptionAction<Method>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.7
                @Override // java.security.PrivilegedExceptionAction
                public Method run() throws Exception {
                    return cls3.getMethod("getBCHandshakeApplicationProtocolSelector", new Class[0]);
                }
            });
            method.invoke(sSLEngineCreateSSLEngine, new Object[0]);
        } catch (Throwable th) {
            logger.error("Unable to initialize BouncyCastleAlpnSslUtils.", th);
            cls = null;
            method = null;
            method2 = null;
            cls2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
            method6 = null;
            method7 = null;
        }
        BC_SSL_PARAMETERS = cls;
        SET_PARAMETERS = method4;
        SET_APPLICATION_PROTOCOLS = method5;
        GET_APPLICATION_PROTOCOL = method2;
        GET_HANDSHAKE_APPLICATION_PROTOCOL = method6;
        SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = method7;
        GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR = method;
        BC_APPLICATION_PROTOCOL_SELECTOR_SELECT = method3;
        BC_APPLICATION_PROTOCOL_SELECTOR = cls2;
    }

    private BouncyCastleAlpnSslUtils() {
    }

    public static String getApplicationProtocol(SSLEngine sSLEngine) {
        try {
            return (String) GET_APPLICATION_PROTOCOL.invoke(sSLEngine, new Object[0]);
        } catch (UnsupportedOperationException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static String getHandshakeApplicationProtocol(SSLEngine sSLEngine) {
        try {
            return (String) GET_HANDSHAKE_APPLICATION_PROTOCOL.invoke(sSLEngine, new Object[0]);
        } catch (UnsupportedOperationException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static BiFunction<SSLEngine, List<String>, String> getHandshakeApplicationProtocolSelector(SSLEngine sSLEngine) {
        try {
            final Object objInvoke = GET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR.invoke(sSLEngine, new Object[0]);
            return new BiFunction<SSLEngine, List<String>, String>() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.9
                @Override // java.util.function.BiFunction
                public String apply(SSLEngine sSLEngine2, List<String> list) {
                    try {
                        return (String) BouncyCastleAlpnSslUtils.BC_APPLICATION_PROTOCOL_SELECTOR_SELECT.invoke(objInvoke, sSLEngine2, list);
                    } catch (Exception e2) {
                        throw new RuntimeException("Could not call getHandshakeApplicationProtocolSelector", e2);
                    }
                }
            };
        } catch (UnsupportedOperationException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static void setApplicationProtocols(SSLEngine sSLEngine, List<String> list) {
        SSLParameters sSLParameters = sSLEngine.getSSLParameters();
        String[] strArr = (String[]) list.toArray(EmptyArrays.EMPTY_STRINGS);
        try {
            Object objNewInstance = BC_SSL_PARAMETERS.newInstance();
            SET_APPLICATION_PROTOCOLS.invoke(objNewInstance, strArr);
            SET_PARAMETERS.invoke(sSLEngine, objNewInstance);
            sSLEngine.setSSLParameters(sSLParameters);
        } catch (UnsupportedOperationException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static void setHandshakeApplicationProtocolSelector(SSLEngine sSLEngine, final BiFunction<SSLEngine, List<String>, String> biFunction) {
        try {
            SET_HANDSHAKE_APPLICATION_PROTOCOL_SELECTOR.invoke(sSLEngine, Proxy.newProxyInstance(BouncyCastleAlpnSslUtils.class.getClassLoader(), new Class[]{BC_APPLICATION_PROTOCOL_SELECTOR}, new InvocationHandler() { // from class: io.netty.handler.ssl.BouncyCastleAlpnSslUtils.8
                @Override // java.lang.reflect.InvocationHandler
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    if (!method.getName().equals("select")) {
                        throw new UnsupportedOperationException(String.format("Method '%s' not supported.", method.getName()));
                    }
                    try {
                        return biFunction.apply((SSLEngine) objArr[0], (List) objArr[1]);
                    } catch (ClassCastException e2) {
                        throw new RuntimeException("BCApplicationProtocolSelector select method parameter of invalid type.", e2);
                    }
                }
            }));
        } catch (UnsupportedOperationException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }
}
