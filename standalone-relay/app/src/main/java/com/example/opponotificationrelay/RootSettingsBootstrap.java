package com.example.opponotificationrelay;

import android.system.Os;
import java.io.*;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.*;
import java.util.concurrent.*;
import java.util.zip.*;
import org.json.JSONObject;

/** 为一次有界操作准备自有 DEX 和已安装官方 SQLCipher；活动写回前检查停用状态。 */
public final class RootSettingsBootstrap {
    private static final String OFFICIAL_SHA256="d8163ec849de6ee121171d1d1312b05f1500c8d4ec225c19f949042ae185aeaf";
    private static final Object LOCK=new Object();
    private static Process child;private static File scratch;private static boolean cancelled;
    private static void cleanup() {
        synchronized(LOCK) {
            cancelled=true;
            if(child!=null) {
                try{child.getOutputStream().close();}catch(Exception ignored){}
                child.destroy();child=null;
            }
            if(scratch!=null) {
                removeHistory(new File(scratch,"export"));
                new File(scratch,"reader.jar").delete();new File(scratch,"libsqlcipher.so").delete();
                if(scratch.delete())scratch=null;
            }
        }
    }
    private static void removeHistory(File f){
        if(f.isDirectory()){File[] children=f.listFiles();if(children!=null)for(File child:children)removeHistory(child);}f.delete();
    }
    private static void publishHistory(JSONObject request)throws Exception {
        File destination=new File(request.getString("destination"));String base="/data/user/0/com.example.opponotificationrelay/files/official-history/";
        if(!destination.getPath().matches(java.util.regex.Pattern.quote(base)+"stage-[0-9a-f-]{36}")||!destination.getCanonicalPath().equals(destination.getPath())||!destination.isDirectory())throw new IOException("HISTORY_DESTINATION");
        int owner=Os.stat("/data/user/0/com.example.opponotificationrelay").st_uid;if(Os.stat(destination.getPath()).st_uid!=owner)throw new IOException("HISTORY_OWNER");
        copyHistory(new File(scratch,"export"),destination,owner);
        Process label=new ProcessBuilder("/system/bin/restorecon","-RF",destination.getPath()).start();if(label.waitFor()!=0)throw new IOException("HISTORY_LABEL");
    }
    private static void copyHistory(File from,File to,int owner)throws Exception {
        if(from.isDirectory()){if(!to.exists()&&!to.mkdir())throw new IOException("HISTORY_DIRECTORY");Os.chown(to.getPath(),owner,owner);Os.chmod(to.getPath(),0700);File[] children=from.listFiles();if(children==null)throw new IOException("HISTORY_LIST");for(File f:children)copyHistory(f,new File(to,f.getName()),owner);}
        else {try(InputStream in=new FileInputStream(from);FileOutputStream out=new FileOutputStream(to)){byte[] b=new byte[65536];int n;while((n=in.read(b))!=-1)out.write(b,0,n);out.getFD().sync();}Os.chown(to.getPath(),owner,owner);Os.chmod(to.getPath(),0600);}
    }
    private static void abort() {cleanup();System.exit(2);}
    static void fileFromZip(String apk,String name,File out,int max) throws Exception {
        try(ZipFile zip=new ZipFile(apk)) {
            ZipEntry entry=zip.getEntry(name);
            if(entry==null || entry.getSize()<1 || entry.getSize()>max)throw new IOException("ASSET_BOUNDS");
            try(InputStream in=zip.getInputStream(entry);OutputStream dest=new FileOutputStream(out)) {
                byte[] b=new byte[32768];int n,total=0;
                while((n=in.read(b))!=-1){if((total+=n)>max)throw new IOException("ASSET_LIMIT");dest.write(b,0,n);}
                if(total!=entry.getSize())throw new IOException("ASSET_CHANGED");
            }
            Os.chmod(out.getPath(),0444);
        }
    }
    static void approvedApk(String path) throws Exception {
        File file=new File(path);
        if(!file.getCanonicalPath().equals(path) || !path.startsWith("/data/app/") || !path.endsWith(".apk") ||
           file.length()<1 || file.length()>400L*1024*1024)throw new IOException("APK_PATH");
        MessageDigest digest=MessageDigest.getInstance("SHA-256");
        try(InputStream in=new FileInputStream(file)){byte[] b=new byte[65536];int n;while((n=in.read(b))!=-1)digest.update(b,0,n);}
        StringBuilder hex=new StringBuilder();for(byte b:digest.digest())hex.append(String.format(Locale.ROOT,"%02x",b&255));
        if(!OFFICIAL_SHA256.equals(hex.toString()))throw new IOException("OFFICIAL_BUILD_UNSUPPORTED");
    }
    public static void main(String[] args) {
        Thread parent=new Thread(()->{try{while(System.in.read()!=-1){}}catch(IOException ignored){}abort();},"settings-parent");
        parent.setDaemon(true);parent.start();
        Thread deadline=new Thread(()->{try{Thread.sleep(210000);}catch(InterruptedException ignored){return;}abort();},"settings-deadline");
        deadline.setDaemon(true);deadline.start();
        String result=null;
        try {
            if(android.os.Process.myUid()!=0 || (args.length!=4 && args.length!=5))throw new IOException("ROOT_ARGUMENT");
            String own=args[0],official=args[1];int uid=Integer.parseInt(args[2]);
            if(uid<10000 || uid>=100000 || !("global".equals(args[3])||"plain".equals(args[3])))
                throw new IOException("USER_UNSUPPORTED");
            if(Os.stat("/data/user/0/com.heytap.health").st_uid!=uid)throw new IOException("OWNER_MISMATCH");
            approvedApk(official);
            if(args.length==5 && (args[4].length()>32768 || !args[4].matches("[A-Za-z0-9+/=]+")))throw new IOException("WRITE_ARGUMENT");
            if(args.length==5) {
                JSONObject request=new JSONObject(new String(android.util.Base64.decode(args[4],android.util.Base64.NO_WRAP),java.nio.charset.StandardCharsets.UTF_8));
                if("syncActivity".equals(request.optString("operation")))RootActivityBridge.offline(uid);
            }
            String command;
            synchronized(LOCK) {
                if(cancelled)throw new IOException("CANCELLED");
                scratch=Files.createTempDirectory(new File("/data/local/tmp").toPath(),"oppo-settings-preview-").toFile();
                Os.chmod(scratch.getPath(),0700);
                fileFromZip(own,"assets/settings-reader.jar",new File(scratch,"reader.jar"),256*1024);
                fileFromZip(official,"lib/arm64-v8a/libsqlcipher.so",new File(scratch,"libsqlcipher.so"),16*1024*1024);
                File export=new File(scratch,"export");if(!export.mkdir())throw new IOException("HISTORY_DIRECTORY");Os.chown(export.getPath(),uid,uid);Os.chmod(export.getPath(),0700);
                Os.chmod(scratch.getPath(),0711);
                command="exec env CLASSPATH="+SettingsPreviewProtocol.quote(new File(scratch,"reader.jar")+":"+official)+
                    " /system/bin/app_process /system/bin com.example.opponotificationrelay.RootOfficialSettingsReader "+
                    uid+" "+SettingsPreviewProtocol.quote(scratch.getPath())+(args.length==5?" "+SettingsPreviewProtocol.quote(args[4]):"");
                List<String> launch=new ArrayList<>();launch.add("su");if("global".equals(args[3]))launch.add("--mount-master");
                launch.add(Integer.toString(uid));launch.add("-c");launch.add(command);
                child=new ProcessBuilder(launch).redirectErrorStream(true).start();
            }
            final Process running=child;
            FutureTask<String> read=new FutureTask<>(()->SettingsPreviewProtocol.read(running.getInputStream()));
            Thread reader=new Thread(read,"settings-pipe");reader.setDaemon(true);reader.start();
            result=read.get(190,TimeUnit.SECONDS);
            if(args.length==5){JSONObject request=new JSONObject(new String(android.util.Base64.decode(args[4],android.util.Base64.NO_WRAP),java.nio.charset.StandardCharsets.UTF_8));
                if("exportHistory".equals(request.optString("operation")) && "OK".equals(new JSONObject(result).optString("status")))publishHistory(request);
            }
            // Result is published only after our two temporary files and directory have been removed.
        } catch(Throwable failure) {
            String code=failure instanceof IOException?failure.getMessage():null;
            if(code==null || !code.matches("[A-Z_]{1,64}"))code="BOOTSTRAP_FAILED";
            try{result=new JSONObject().put("schema",1).put("status","ERROR").put("code",code).toString();}catch(Exception ignored){}
        } finally {
            cleanup();
            if(scratch!=null)result="{\"schema\":1,\"status\":\"ERROR\",\"code\":\"CLEANUP_FAILED\"}";
            if(result!=null){System.out.println(SettingsPreviewProtocol.PREFIX+result);System.out.println(SettingsPreviewProtocol.END);System.out.flush();}
            System.exit(0);
        }
    }
}
