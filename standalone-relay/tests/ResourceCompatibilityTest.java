package com.example.opponotificationrelay;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.AssetManager;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.concurrent.*;

/** API-level trap: constructing an API 30 loader on the API 29 path fails immediately. */
public final class ResourceCompatibilityTest {
    private static int checks;
    private static void check(boolean value,String message){checks++;if(!value)throw new AssertionError(message);}
    public static void main(String[] args)throws Exception {
        Build.VERSION.SDK_INT=Integer.parseInt(args[0]);Context.directory=new File(args[1]);
        File dir=new File(Context.directory,"official-ui");if(!dir.isDirectory()&&!dir.mkdirs())throw new AssertionError("fixture directory");
        Context context=new Context();Field hash=OfficialUiResources.class.getDeclaredField("HASH");hash.setAccessible(true);String expected=(String)hash.get(null);
        File cached=new File(dir,expected+".apk");Files.write(cached.toPath(),new byte[]{1});
        context.getSharedPreferences("official_ui_verified",0).edit().putString("hash",expected).putLong("size",cached.length()).putLong("modified",cached.lastModified()).commit();
        try{
            OfficialUiResources.ensureReady(context);check(OfficialUiResources.ready(),"synchronous preparation completes");
            check(ResourcesLoader.created==(Build.VERSION.SDK_INT<30?0:1),"only modern API constructs loader");
            Field prepared=OfficialUiResources.class.getDeclaredField("prepared");prepared.setAccessible(true);prepared.set(null,false);
            CountDownLatch callback=new CountDownLatch(1);OfficialUiResources.prepare(context,callback::countDown);
            check(callback.await(2,TimeUnit.SECONDS)&&OfficialUiResources.ready(),"asynchronous preparation completes");
            AccountVisualAssets.install(context,new Resources());AccountVisualAssets.install(context,new Resources());
            check(Build.VERSION.SDK_INT<30?AssetManager.added==2:ResourcesLoader.created==2,"account assets use legacy paths or shared modern loader");
            System.out.println("RESOURCE_COMPATIBILITY_PASS api="+Build.VERSION.SDK_INT+" checks="+checks+" isolated_platform=true");
        }finally{
            Field worker=OfficialUiResources.class.getDeclaredField("worker");worker.setAccessible(true);((ExecutorService)worker.get(null)).shutdownNow();
        }
    }
}
