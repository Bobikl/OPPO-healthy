package com.example.opponotificationrelay;

import android.system.Os;
import org.json.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;

/** Complete backups are published atomically; retention runs only after a successful write. */
final class ActivityBackupStore {
    interface Source { File resolve(String name)throws Exception; }
    private static final String[] NAMES={"database.db","database.db-wal","database.db-shm"};
    private static final long FILE_LIMIT=256L*1024*1024,TOTAL_LIMIT=300L*1024*1024;
    private static boolean direct(File file,File parent)throws IOException {
        return file.getCanonicalFile().equals(new File(parent.getCanonicalFile(),file.getName()));
    }
    static String create(File dir,Source source)throws Exception {
        String id=UUID.randomUUID().toString();
        File pending=new File(dir,".pending-"+id),target=new File(dir,"before-"+System.currentTimeMillis()+"-"+id);
        if(!pending.mkdir())throw new IOException("ACTIVITY_BACKUP");
        boolean published=false;
        try {
            Os.chmod(pending.getPath(),0700);JSONObject manifest=new JSONObject();long total=0;
            for(String name:NAMES) {
                File src=source.resolve(name);if(src==null){if(name.equals("database.db"))throw new IOException("ACTIVITY_BACKUP_MISSING");continue;}
                long size=src.length();if(size>FILE_LIMIT||total+size>TOTAL_LIMIT)throw new IOException("ACTIVITY_BACKUP_SIZE");
                File dest=new File(pending,name);MessageDigest md=MessageDigest.getInstance("SHA-256");long n=0;
                try(InputStream in=new FileInputStream(src);FileOutputStream out=new FileOutputStream(dest)) {
                    byte[] b=new byte[65536];int k;
                    while((k=in.read(b))!=-1){n+=k;if(n>FILE_LIMIT||total+n>TOTAL_LIMIT)throw new IOException("ACTIVITY_BACKUP_SIZE");out.write(b,0,k);md.update(b,0,k);}out.getFD().sync();
                }
                Os.chmod(dest.getPath(),0600);if(n!=size||n!=src.length()||n!=dest.length())throw new IOException("ACTIVITY_BACKUP_CHANGED");
                byte[] expected=md.digest();md.reset();
                try(InputStream in=new FileInputStream(dest)){byte[] b=new byte[65536];int k;while((k=in.read(b))!=-1)md.update(b,0,k);}
                if(!Arrays.equals(expected,md.digest()))throw new IOException("ACTIVITY_BACKUP_VERIFY");
                StringBuilder hash=new StringBuilder();for(byte b:expected)hash.append(String.format(Locale.ROOT,"%02x",b&255));
                manifest.put(name,new JSONObject().put("bytes",n).put("sha256",hash.toString()));total+=n;
            }
            File record=new File(pending,"manifest.json");
            try(FileOutputStream out=new FileOutputStream(record)){out.write(manifest.toString().getBytes(StandardCharsets.UTF_8));out.getFD().sync();}Os.chmod(record.getPath(),0600);
            if(target.exists()||!pending.renameTo(target))throw new IOException("ACTIVITY_BACKUP_PUBLISH");published=true;return target.getName();
        }finally{if(!published)removeKnown(pending,dir);}
    }
    private static boolean known(File folder,File parent)throws IOException {
        if(!direct(folder,parent)||!folder.isDirectory())return false;File[] files=folder.listFiles();if(files==null)return false;
        for(File f:files)if(!direct(f,folder)||!f.isFile()||!(f.getName().equals("manifest.json")||Arrays.asList(NAMES).contains(f.getName())))return false;
        return true;
    }
    private static boolean removeKnown(File folder,File parent) {
        try{if(!known(folder,parent))return false;File[] files=folder.listFiles();if(files==null)return false;for(File f:files)if(!f.delete())return false;return folder.delete();}catch(Exception e){return false;}
    }
    private static boolean complete(File folder,File parent) {
        try {
            if(!folder.getName().matches("before-[0-9]{1,19}-[0-9a-f]{8}(-[0-9a-f]{4}){3}-[0-9a-f]{12}")||!known(folder,parent))return false;
            File record=new File(folder,"manifest.json");if(!record.isFile()||record.length()>16384)return false;
            byte[] bytes=new byte[(int)record.length()];try(DataInputStream in=new DataInputStream(new FileInputStream(record))){in.readFully(bytes);if(in.read()!=-1)return false;}
            JSONObject manifest=new JSONObject(new String(bytes,StandardCharsets.UTF_8));if(!manifest.has("database.db"))return false;
            File[] files=folder.listFiles();if(files==null||files.length!=manifest.length()+1)return false;
            for(Iterator<String> it=manifest.keys();it.hasNext();) {
                String name=it.next();if(!Arrays.asList(NAMES).contains(name))return false;JSONObject entry=manifest.getJSONObject(name);File file=new File(folder,name);
                if(!file.isFile()||entry.getLong("bytes")!=file.length()||!entry.getString("sha256").matches("[0-9a-f]{64}"))return false;
            }return true;
        }catch(Exception e){return false;}
    }
    /** Unknown folders and incomplete legacy copies are retained for manual inspection. */
    static boolean prune(File dir,String protect) {
        try {
            File[] files=dir.listFiles();if(files==null)return false;List<File> complete=new ArrayList<>();
            for(File f:files)if(complete(f,dir))complete.add(f);
            complete.sort(Comparator.comparingLong(f->Long.parseLong(f.getName().split("-")[1])));
            int excess=complete.size()-20;boolean ok=true;
            for(File f:complete){if(excess<=0)break;if(f.getName().equals(protect))continue;if(removeKnown(f,dir))excess--;else ok=false;}
            return ok&&excess<=0;
        }catch(Exception e){return false;}
    }
}