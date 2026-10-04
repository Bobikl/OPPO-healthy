package com.example.opponotificationrelay;
import java.io.*;import java.util.Arrays;import java.util.function.BooleanSupplier;
import com.heytap.health.osahssdkself.bean.*;
/** Worker-only capture engine. The same pipeline accepts bounded synthetic test sources. */
public final class SnoreCaptureSession {
    public interface Source extends AutoCloseable {
        int audioSource();void start()throws IOException;int read(short[] data,int offset,int count)throws IOException;
        void check()throws IOException;void requestStop();void close();
    }
    public interface Listener {void started(String id);void progress(String id,long samples);}
    private static String safe(Throwable e){String s=e.getMessage();return s!=null&&s.matches("[A-Z_]{1,64}")?s:"SNORE_RECORDING_FAILED";}
    public static String run(SnoreSessionStore store,Source source,String device,BooleanSupplier stopped,Listener listener)throws Exception {
        if(store.freeBytes()<64L*1024*1024)throw new IOException("SNORE_STORAGE_LOW");
        String id=store.create(device,source.audioSource(),System.currentTimeMillis());listener.started(id);
        long count=0,frames=0,lastCheckpoint=0,minute=0;int[] noise=new int[256];int offset=0,emptyReads=0;short[] frame=new short[1024];
        OsaSummaryBean summary=null;String state="FAILED",reason="SNORE_RECORDING_FAILED";
        try(SnoreWavWriter wav=new SnoreWavWriter(store.file(id,true),store.file(id,false));OsaNativeAdapter algorithm=OsaNativeAdapter.begin(source.audioSource()==9)) {
            if(stopped.getAsBoolean())throw new IOException("SNORE_CANCELLED");
            source.start();store.progress(id,"RECORDING",0);
            while(!stopped.getAsBoolean()&&count<SnoreSessionStore.MAX_SAMPLES){
                int read;try{read=source.read(frame,offset,frame.length-offset);}catch(IOException stoppedRead){if(stopped.getAsBoolean())break;throw stoppedRead;}
                if(stopped.getAsBoolean())break;
                if(read<0){if(read==-1)break;throw new IOException("SNORE_AUDIO_READ");}
                if(read>frame.length-offset)throw new IOException("SNORE_AUDIO_READ");
                if(read==0){if(++emptyReads>4)throw new IOException("SNORE_AUDIO_STALLED");continue;}
                emptyReads=0;offset+=read;if(offset<frame.length)continue;offset=0;
                SnoreInfoBean info=algorithm.process(frame);wav.write(frame,frame.length);count+=frame.length;
                store.features(id,frames++,info);noise[info.environmentNoise&255]++;
                if(count/480000>minute){store.noise(id,minute,noise);Arrays.fill(noise,0);minute=count/480000;}
                if(count-lastCheckpoint>=8000){source.check();lastCheckpoint=count;listener.progress(id,count);}
                if(frames%128==0){if(store.freeBytes()<16L*1024*1024)throw new IOException("SNORE_STORAGE_LOW");wav.checkpoint();store.progress(id,"RECORDING",count);}
            }
            source.requestStop();store.progress(id,"FINALIZING",count);
            if(frames>0)store.noise(id,minute,noise);
            summary=algorithm.finish();state=count<SnoreSessionStore.MIN_SAMPLES?"TOO_SHORT":"WAITING_DATA";
            reason=count>=SnoreSessionStore.MAX_SAMPLES?"TIME_LIMIT":"USER_STOP";
        }catch(Exception|LinkageError e){reason=safe(e);state=count>0?"INTERRUPTED":"FAILED";summary=null;}
        finally{source.close();}
        store.finish(id,state,reason,count,summary);listener.progress(id,count);return id;
    }
}
