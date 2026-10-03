package com.example.opponotificationrelay;

import android.content.Context;
import java.io.*;

/** Extract the bundled, minimal helper dex once per installed package version. */
public final class ObserverDex {
    private ObserverDex() { }
    public static synchronized String path(Context c) throws Exception {
        long version=c.getPackageManager().getPackageInfo(c.getPackageName(),0).lastUpdateTime;
        File directory=new File(c.getCodeCacheDir(),"observer");
        if(!directory.isDirectory() && !directory.mkdirs()) throw new IOException("observer directory");
        File destination=new File(directory,"observer-"+version+".jar");
        if(destination.isFile() && destination.length()>0) return destination.getAbsolutePath();
        File temp=File.createTempFile("observer-",".tmp",directory);
        try {
            try(InputStream in=c.getAssets().open("root-observer.jar");FileOutputStream out=new FileOutputStream(temp)) {
                // Open the descriptor first, then make dynamically loaded code read-only before writing.
                if(!temp.setReadOnly()) throw new IOException("observer permissions");
                byte[] buffer=new byte[8192];int n,total=0;
                while((n=in.read(buffer))!=-1) {
                    total+=n;if(total>256*1024) throw new IOException("observer size");
                    out.write(buffer,0,n);
                }
                if(total==0) throw new IOException("observer empty");
                out.getFD().sync();
            }
            if(!temp.renameTo(destination)) throw new IOException("observer publish");
            // Scoped to our own helper cache; never remove the APK or another application's files.
            File[] old=directory.listFiles();
            if(old!=null) for(File f:old) if(!f.equals(destination) && f.getName().matches("observer-[0-9]+\\.jar")) f.delete();
            return destination.getAbsolutePath();
        } finally {if(temp.exists())temp.delete();}
    }
}
