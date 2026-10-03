package com.example.opponotificationrelay;
import android.content.Context;
import java.io.*;
/** Bundled native executable; launched only through su, never as the app UID. */
public final class NativeObserver {
    private NativeObserver() { }
    public static boolean supported() {
        if(android.os.Build.VERSION.SDK_INT<33)return false;
        for(String abi:android.os.Build.SUPPORTED_ABIS)if("arm64-v8a".equals(abi))return true;
        return false;
    }
    public static synchronized String path(Context c) throws Exception {
        if(!supported())throw new IOException("native platform");
        long version=c.getPackageManager().getPackageInfo(c.getPackageName(),0).lastUpdateTime;
        File directory=new File(c.getCodeCacheDir(),"observer-native");
        if(!directory.isDirectory()&&!directory.mkdirs())throw new IOException("native directory");
        File destination=new File(directory,"observer-"+version);
        if(destination.isFile()&&destination.length()>0)return destination.getAbsolutePath();
        File temp=File.createTempFile("observer-",".tmp",directory);
        try {
            try(InputStream in=c.getAssets().open("root-observer-arm64");FileOutputStream out=new FileOutputStream(temp)) {
                if(!temp.setReadOnly()||!temp.setExecutable(true,true))throw new IOException("native permissions");
                byte[] buffer=new byte[8192];int total=0,n;
                while((n=in.read(buffer))!=-1){total+=n;if(total>1024*1024)throw new IOException("native size");out.write(buffer,0,n);}
                if(total==0)throw new IOException("native empty");out.getFD().sync();
            }
            if(!temp.renameTo(destination))throw new IOException("native publish");
            File[] old=directory.listFiles();
            if(old!=null)for(File f:old)if(!f.equals(destination)&&f.getName().matches("observer-[0-9]+"))f.delete();
            return destination.getAbsolutePath();
        } finally {if(temp.exists())temp.delete();}
    }
}
