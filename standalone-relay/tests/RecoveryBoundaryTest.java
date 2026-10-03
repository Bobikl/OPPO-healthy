package com.example.opponotificationrelay;

import java.lang.reflect.*;
import java.util.*;

public final class RecoveryBoundaryTest {
    private static int checks;
    private static void check(boolean value,String why){checks++;if(!value)throw new AssertionError(why);}
    public interface Observer { }
    public static class Legacy {
        int calls;Object watcher;
        public void registerUidObserver(Observer o,int flags,int cut,String caller){calls++;watcher=o;check(flags==3&&cut==19&&caller.equals("com.android.shell"),"legacy arguments preserved");}
    }
    public static class Modern extends Legacy {
        int targeted;int[] selected;
        public Object registerUidObserverForUids(Observer o,int flags,int cut,String caller,int[] ids){targeted++;selected=ids;return new Object();}
    }
    public static class Denied extends Legacy {
        public Object registerUidObserverForUids(Observer o,int flags,int cut,String caller,int[] ids){throw new SecurityException("denied");}
    }
    public static class NoToken extends Legacy {
        public Object registerUidObserverForUids(Observer o,int flags,int cut,String caller,int[] ids){return null;}
    }
    public static void main(String[] args)throws Exception {
        for(int bits=0;bits<32;bits++){
            boolean enabled=(bits&1)!=0,automatic=(bits&2)!=0,nullIntent=(bits&4)!=0,stop=(bits&8)!=0,permission=(bits&16)!=0;
            boolean actual=StartupPolicy.serviceAllowed(enabled,automatic,nullIntent,stop,permission);
            if(!enabled||stop||!permission||nullIntent&&!automatic)check(!actual,"blocked recovery must not start");
            else check(actual,"eligible service can start");
        }
        for(int sdk:new int[]{29,30,31,33,34,35,36}){
            check(StartupPolicy.bluetoothReady(sdk,true),"granted connect permits startup");
            check(StartupPolicy.bluetoothReady(sdk,false)==(sdk<31),"permission API boundary");
        }
        check(StartupPolicy.restore(true,true),"saved intent remains recoverable after regrant");
        check(!StartupPolicy.restore(true,false),"explicit stop wins");
        Observer watcher=new Observer(){};int[] ids={10577,10578};
        Legacy old=new Legacy();check(!ObserverRegistration.register(old,Legacy.class,Observer.class,watcher,3,19,ids),"old API fallback");check(old.calls==1&&old.watcher==watcher,"register legacy once");
        Modern modern=new Modern();check(ObserverRegistration.register(modern,Modern.class,Observer.class,watcher,3,19,ids),"prefer selected UID API");check(modern.targeted==1&&modern.calls==0&&Arrays.equals(ids,modern.selected),"no duplicate registration");
        Denied denied=new Denied();boolean failed=false;try{ObserverRegistration.register(denied,Denied.class,Observer.class,watcher,3,19,ids);}catch(InvocationTargetException e){failed=e.getCause() instanceof SecurityException;}check(failed&&denied.calls==0,"invocation denial never falls back");
        NoToken noToken=new NoToken();failed=false;try{ObserverRegistration.register(noToken,NoToken.class,Observer.class,watcher,3,19,ids);}catch(IllegalStateException e){failed=true;}check(failed&&noToken.calls==0,"missing token is failure");
        failed=false;try{ObserverRegistration.register(new Object(),Object.class,Observer.class,watcher,3,19,ids);}catch(NoSuchMethodException e){failed=!ObserverRegistration.retryable(ObserverRegistration.failure(e));}check(failed,"missing both APIs stops retries");
        for(Throwable e:new Throwable[]{new NoSuchFieldException(),new ClassNotFoundException(),new NoSuchMethodError(),new InvocationTargetException(new NoSuchMethodException())})check(!ObserverRegistration.retryable(ObserverRegistration.failure(e)),"permanent capability failure");
        for(Throwable e:new Throwable[]{new SecurityException(),new IllegalStateException(),new java.io.IOException()})check(ObserverRegistration.retryable(ObserverRegistration.failure(e)),"transient failure can retry");
        String[] launch=PairingImportLaunch.command("/data/app/a'b/base.apk","com.heytap.health",10577,"AA:BB:CC:DD:EE:FF");
        check(launch.length==4&&launch[0].equals("su")&&launch[1].equals("10577")&&launch[2].equals("-c"),"UID applied before starting ART");
        check(launch[3].contains("a'\\''b")&&launch[3].endsWith("com.heytap.health 10577 AA:BB:CC:DD:EE:FF"),"shell quoting and fixed target");
        for(String path:new String[]{null,"relative","/tmp/a\ncommand","/tmp/a\rcommand","/tmp/a\0command"}){failed=false;try{PairingImportLaunch.command(path,"com.heytap.health",10577,"AA:BB:CC:DD:EE:FF");}catch(IllegalArgumentException e){failed=true;}check(failed,"reject invalid classpath");}
        for(String pkg:new String[]{"other", "com.heytap.health;id",null}){failed=false;try{PairingImportLaunch.command("/base.apk",pkg,10577,"AA:BB:CC:DD:EE:FF");}catch(IllegalArgumentException e){failed=true;}check(failed,"reject nonofficial target");}
        failed=false;try{PairingImportLaunch.command("/base.apk","com.heytap.health",0,"AA:BB:CC:DD:EE:FF");}catch(IllegalArgumentException e){failed=true;}check(failed,"never read pairing as root");
        failed=false;try{PairingImportLaunch.command("/base.apk","com.heytap.health",10577,"AA:BB:CC:DD:EE:FF;id");}catch(IllegalArgumentException e){failed=true;}check(failed,"reject MAC injection");
        System.out.println("RecoveryBoundaryTest: "+checks+" checks passed");
    }
}
