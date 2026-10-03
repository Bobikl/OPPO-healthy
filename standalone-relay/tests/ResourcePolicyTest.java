package com.example.opponotificationrelay;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;

public final class ResourcePolicyTest {
    static int checks;
    static void check(boolean value) {checks++;if(!value)throw new AssertionError("check "+checks);}
    static String read(File f) throws Exception {return new String(Files.readAllBytes(f.toPath()),StandardCharsets.UTF_8);}
    public static void main(String[] args) throws Exception {
        ReconnectPolicy policy=new ReconnectPolicy();
        for(long delay:new long[]{3000,6000,12000,24000,60000,120000,300000,300000}) check(policy.failed(0)==delay);
        check(policy.failed(59999)==300000);check(policy.failed(60000)==3000);
        check(policy.failed(0)==6000);policy.reset();check(policy.failed(0)==3000);
        RetrySignal signal=new RetrySignal();long first=signal.checkpoint();signal.signal();
        check(signal.await(first,0));check(!signal.await(signal.checkpoint(),20));
        ExecutorService executor=Executors.newSingleThreadExecutor();
        try {
            long token=signal.checkpoint();
            Future<Boolean> f=executor.submit(()->signal.await(token,0));
            Thread.sleep(50);check(!f.isDone());signal.signal();check(f.get(1,TimeUnit.SECONDS));
            long second=signal.checkpoint();f=executor.submit(()->signal.await(second,0));
            check(f.cancel(true));check(executor.submit(()->1).get(1,TimeUnit.SECONDS)==1);
        } finally {executor.shutdownNow();}
        Map<String,Integer> packages=new LinkedHashMap<>();packages.put("com.heytap.health",10577);
        String compact=ObserverLaunch.command("/data/local/中文'a.jar",packages,true);
        check(compact.contains("-XX:LowMemoryMode"));check(compact.contains("--compact"));
        check(compact.contains("中文'\\''a.jar"));check(!compact.contains("setprop"));
        String compatible=ObserverLaunch.command("/data/base.apk",packages,false);
        check(!compatible.contains("--compact") && !compatible.contains("-XX:"));
        packages.put("invalid;id",12345);boolean rejected=false;
        try {ObserverLaunch.command("/data/base.apk",packages,true);} catch(IllegalArgumentException e) {rejected=true;}
        check(rejected);
        File directory=Files.createTempDirectory("oaf-log-test").toFile();
        File log=new File(directory,"relay.log"),backup=new File(directory,"relay.log.1");
        try {
            try(RollingLogSink sink=new RollingLogSink(log,256,128,100)) {
                sink.write("中文消息",false);check(log.length()==0);
                Thread.sleep(250);check(read(log).contains("中文消息"));
                sink.write("立即保存错误",true);check(read(log).contains("立即保存错误"));
                for(int i=0;i<40;i++) sink.write("轮转测试 "+i+" 你好世界",false);
                sink.flush();check(log.length()<=256);check(backup.length()<=256);check(backup.exists());
                check(!read(log).contains("\ufffd") && !read(backup).contains("\ufffd"));
                char[] big=new char[4000];Arrays.fill(big,'中');
                sink.write(new String(big),true);check(log.length()<=256);check(read(log).contains("[truncated]"));
            }
            try(FileOutputStream out=new FileOutputStream(log)) {out.write(new byte[512]);}
            try(RollingLogSink sink=new RollingLogSink(log,256,64,100)) {sink.write("恢复有界日志",true);}
            check(log.length()<=256 && backup.length()<=256);check(read(log).contains("恢复有界日志"));
        } finally {Files.deleteIfExists(log.toPath());Files.deleteIfExists(backup.toPath());Files.deleteIfExists(directory.toPath());}
        System.out.println("Resource policy checks passed: "+checks);
    }
}
