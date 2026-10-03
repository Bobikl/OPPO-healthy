package com.example.opponotificationrelay;

import java.lang.reflect.*;

/** Capability selection; an invocation failure must not register a second observer. */
public final class ObserverRegistration {
    private ObserverRegistration() { }
    public static boolean register(Object manager,Class<?> api,Class<?> observerType,Object observer,int flags,int cutpoint,int[] uids)throws ReflectiveOperationException {
        Method selected;
        try {selected=api.getMethod("registerUidObserverForUids",observerType,int.class,int.class,String.class,int[].class);}
        catch(NoSuchMethodException oldPlatform) {
            api.getMethod("registerUidObserver",observerType,int.class,int.class,String.class).invoke(manager,observer,flags,cutpoint,"com.android.shell");
            return false; // Caller filters callback UIDs before scheduling any work.
        }
        Object token=selected.invoke(manager,observer,flags,cutpoint,"com.android.shell",uids);
        if(token==null)throw new IllegalStateException("missing registration token");
        return true;
    }
    public static String failure(Throwable error) {
        while(error instanceof InvocationTargetException && error.getCause()!=null)error=error.getCause();
        return error instanceof NoSuchMethodException || error instanceof NoSuchFieldException || error instanceof ClassNotFoundException || error instanceof LinkageError ? "API_UNSUPPORTED" : "INIT_FAILED";
    }
    public static boolean retryable(String reason) {return !"API_UNSUPPORTED".equals(reason);}
}
