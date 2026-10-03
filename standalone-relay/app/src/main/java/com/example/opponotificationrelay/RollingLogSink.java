package com.example.opponotificationrelay;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;

/** Two bounded UTF-8 files; one-shot flush only while data is pending. */
public final class RollingLogSink implements Closeable {
    private final File file, backup;
    private final long maxBytes;
    private final int batchBytes, maxLineChars;
    private final long flushMillis;
    private final ScheduledThreadPoolExecutor timer;
    private BufferedOutputStream output;
    private long size;
    private int pending;
    private boolean closed;
    private ScheduledFuture<?> flushTask;
    public RollingLogSink(File file,long maxBytes,int batchBytes,long flushMillis) throws IOException {
        if(maxBytes<128 || batchBytes<1 || flushMillis<1) throw new IllegalArgumentException("log limits");
        this.file=file;backup=new File(file.getPath()+".1");this.maxBytes=maxBytes;
        this.batchBytes=batchBytes;this.flushMillis=flushMillis;
        maxLineChars=(int)Math.min(2048,(maxBytes-32)/4);
        timer=new ScheduledThreadPoolExecutor(1,r -> {Thread t=new Thread(r,"OAF-log-flush");t.setDaemon(true);return t;});
        timer.setRemoveOnCancelPolicy(true);
        timer.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        try {
            if(backup.length()>maxBytes && !backup.delete()) throw new IOException("Oversized log backup");
            open();if(size>maxBytes) rotate();
        }
        catch(IOException e) {timer.shutdownNow();if(output!=null)output.close();throw e;}
    }
    private void open() throws IOException {
        output=new BufferedOutputStream(new FileOutputStream(file,true),4096);size=file.length();pending=0;
    }
    private void rotate() throws IOException {
        output.close();output=null;
        // Only these two owned files are touched. If removal fails, preserve the original log.
        if(backup.exists() && !backup.delete()) throw new IOException("Cannot rotate log backup");
        if(size>maxBytes) {
            // A pre-upgrade unbounded log must not become an unbounded backup.
            if(!file.delete()) throw new IOException("Cannot replace oversized log");
        } else if(file.exists() && !file.renameTo(backup)) throw new IOException("Cannot rotate log");
        open();
    }
    public synchronized void write(String line,boolean urgent) throws IOException {
        if(closed) return;
        if(output==null) throw new IOException("Log sink unavailable");
        if(line.length()>maxLineChars) {
            int end=maxLineChars;
            if(Character.isHighSurrogate(line.charAt(end-1))) end--;
            line=line.substring(0,end)+" [truncated]";
        }
        byte[] bytes=(line+"\n").getBytes(StandardCharsets.UTF_8);
        if(size+bytes.length>maxBytes) rotate();
        output.write(bytes);size+=bytes.length;pending+=bytes.length;
        if(urgent || pending>=batchBytes) flush();
        else if(flushTask==null) flushTask=timer.schedule(() -> {
            synchronized(RollingLogSink.this) {
                flushTask=null;
                try {flush();} catch(IOException ignored) { }
            }
        },flushMillis,TimeUnit.MILLISECONDS);
    }
    public synchronized void flush() throws IOException {
        if(flushTask!=null) {flushTask.cancel(false);flushTask=null;}
        if(output!=null && pending>0) {output.flush();pending=0;}
    }
    @Override public synchronized void close() throws IOException {
        closed=true;timer.shutdownNow();
        try {if(output!=null) output.close();} finally {output=null;pending=0;}
    }
}
