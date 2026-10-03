package com.example.opponotificationrelay;
import android.content.*;
import android.content.res.*;
import android.content.res.loader.*;
import android.os.*;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import java.io.*;
import java.security.MessageDigest;
/** Original compiled UI resources stay isolated from the independent application's R IDs. */
final class OfficialUiResources {
    private static final String HASH="7be105bf95fac6f86b203626284e62dee419542f1903b1c7a12a611cdcd89246";
    private static File archive;private static Context global;
    // APK parsing is process-wide; Resources, themes and window contexts remain per wrapper.
    private static ResourcesLoader sharedLoader;
    static synchronized Context wrap(Context base){
        try{
            if(archive==null)archive=extract(base.getApplicationContext());
            if(global==null){global=new UiContext(base.getApplicationContext(),archive);com.oplus.aiunit.vision.e88.d(global);}
            return new UiContext(base,archive);
        }catch(Exception e){throw new IllegalStateException("Official UI resources could not be loaded",e);}
    }
    static Context panel(android.app.Activity activity){wrap(activity);try{return new PanelContext(activity,archive);}catch(Exception e){throw new IllegalStateException("Official panel resources",e);}}
    // Window services remain bound to the host. Context traversal stops at the isolated
    // application context so COUI does not resolve original R IDs against the host Activity.
    static final class PanelContext extends UiContext {
        PanelContext(Context host,File file)throws Exception{super(host,file);}
        @Override public Context getBaseContext(){return global;}
    }
    private static File extract(Context c)throws Exception{
        File dir=new File(c.getFilesDir(),"official-ui");if(!dir.isDirectory()&&!dir.mkdirs())throw new IOException("UI_DIRECTORY");
        File target=new File(dir,HASH+".apk");if(target.isFile()&&hash(target).equals(HASH))return target;
        File pending=new File(dir,HASH+".pending");try(InputStream in=c.getAssets().open("official-ui-resources.apk");OutputStream out=new BufferedOutputStream(new FileOutputStream(pending))){byte[] buffer=new byte[65536];int n;while((n=in.read(buffer))>0)out.write(buffer,0,n);}
        if(!hash(pending).equals(HASH))throw new IOException("UI_RESOURCE_HASH");
        if(target.exists()&&!target.delete())throw new IOException("UI_RESOURCE_REPLACE");if(!pending.renameTo(target))throw new IOException("UI_RESOURCE_RENAME");target.setReadOnly();return target;
    }
    private static String hash(File f)throws Exception{MessageDigest digest=MessageDigest.getInstance("SHA-256");try(InputStream in=new FileInputStream(f)){byte[] b=new byte[65536];int n;while((n=in.read(b))>0)digest.update(b,0,n);}StringBuilder s=new StringBuilder();for(byte b:digest.digest())s.append(String.format(java.util.Locale.ROOT,"%02x",b&255));return s.toString();}
    private static synchronized ResourcesLoader loader(File file)throws IOException{
        if(sharedLoader==null){
            ResourcesLoader created=new ResourcesLoader();
            try(ParcelFileDescriptor p=ParcelFileDescriptor.open(file,ParcelFileDescriptor.MODE_READ_ONLY)){
                ResourcesProvider provider=ResourcesProvider.loadFromApk(p);
                try{created.addProvider(provider);}catch(RuntimeException e){provider.close();throw e;}
            }
            // Immutable after publication. It holds APK assets, not an Activity or a Resources.Theme.
            sharedLoader=created;
        }
        return sharedLoader;
    }
    static int id(Context c,String type,String name){int id=c.getResources().getIdentifier(name,type,"com.heytap.health");if(id==0)throw new IllegalArgumentException(type+"/"+name);return id;}
    static class UiContext extends ContextWrapper{
        final Resources resources;final Resources.Theme theme;
        UiContext(Context base,File file)throws Exception{
            super(base);Configuration config=new Configuration(base.getResources().getConfiguration());
            float density=OfficialUiScale.density(base);DisplayMetrics dm=new DisplayMetrics();dm.setTo(base.getResources().getDisplayMetrics());dm.density=density;dm.densityDpi=Math.round(density*160);dm.scaledDensity=density*config.fontScale;
            config.densityDpi=dm.densityDpi;config.uiMode=(config.uiMode&~Configuration.UI_MODE_NIGHT_MASK)|Configuration.UI_MODE_NIGHT_YES;config.screenWidthDp=Math.round(dm.widthPixels/density);config.screenHeightDp=Math.round(dm.heightPixels/density);config.smallestScreenWidthDp=Math.min(config.screenWidthDp,config.screenHeightDp);
            AssetManager manager=AssetManager.class.getConstructor().newInstance();
            if(Build.VERSION.SDK_INT<30)AssetManager.class.getMethod("addAssetPath",String.class).invoke(manager,file.getPath());
            resources=new Resources(manager,dm,config);
            if(Build.VERSION.SDK_INT>=30)resources.addLoaders(loader(file));
            theme=resources.newTheme();theme.applyStyle(0x7f160648,true);
        }
        @Override public Resources getResources(){return resources;}@Override public AssetManager getAssets(){return resources.getAssets();}@Override public Resources.Theme getTheme(){return theme;}@Override public void setTheme(int id){if(theme!=null)theme.applyStyle(id,true);}
        @Override public Context createConfigurationContext(Configuration configuration){try{return new UiContext(super.createConfigurationContext(configuration),archive);}catch(Exception e){throw new IllegalStateException("Official UI configuration",e);}}
        @Override public Context getApplicationContext(){return global==null?this:global;}
        @Override public Object getSystemService(String name){return LAYOUT_INFLATER_SERVICE.equals(name)?LayoutInflater.from(super.getBaseContext()).cloneInContext(this):super.getSystemService(name);}
    }
}
