package com.example.opponotificationrelay;
import android.content.Context;
import android.content.res.loader.*;
import android.os.ParcelFileDescriptor;
import java.io.*;
import java.nio.file.Files;
import java.util.zip.*;

/** Asset-only provider: adds account animations without changing existing resource IDs. */
final class AccountVisualAssets {
    static void install(Context context,android.content.res.Resources resources)throws Exception {
        if(android.os.Build.VERSION.SDK_INT>=30)Api30.install(context,resources);
        else android.content.res.AssetManager.class.getMethod("addAssetPath",String.class).invoke(resources.getAssets(),archive(context).getPath());
    }
    private static File archive;
    private static synchronized File archive(Context context)throws IOException {
        if(archive!=null)return archive;
        File file=new File(context.getCodeCacheDir(),"account-visual-assets-v1.apk");
        if(file.exists()&&!file.delete())throw new IOException("ACCOUNT_ASSET_REPLACE");
        try(ZipOutputStream out=new ZipOutputStream(new FileOutputStream(file))){
            for(String name:new String[]{"nx_no_content_dark.json","nx_no_content_light.json","nx_no_network_dark.json","nx_no_network_light.json"}){
                out.putNextEntry(new ZipEntry("assets/"+name));
                try(InputStream in=context.getApplicationContext().getAssets().open(name)){byte[] bytes=new byte[8192];int n;while((n=in.read(bytes))!=-1)out.write(bytes,0,n);}
                out.closeEntry();
            }
        }
        if(!file.setReadOnly())throw new IOException("ACCOUNT_ASSET_READ_ONLY");
        archive=file;return file;
    }
    private static final class Api30 {
    private static ResourcesLoader loader;
    static synchronized void install(Context context,android.content.res.Resources resources)throws IOException {
        if(loader!=null){resources.addLoaders(loader);return;}
        File file=archive(context);
        ResourcesLoader created=new ResourcesLoader();
        try(ParcelFileDescriptor descriptor=ParcelFileDescriptor.open(file,ParcelFileDescriptor.MODE_READ_ONLY)){
            created.addProvider(ResourcesProvider.loadFromApk(descriptor));
        }
        loader=created;resources.addLoaders(loader);
    }
    }
}
