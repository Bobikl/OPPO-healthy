package com.example.opponotificationrelay;
import java.io.*;
/** PCM16 mono 8 kHz. Header is checkpointed so a killed recording remains recoverable. */
public final class SnoreWavWriter implements AutoCloseable {
    public static final int RATE=8000,HEADER=44;
    private final RandomAccessFile out;private final File part,finished;
    private final byte[] bytes=new byte[2048];private long samples;private boolean closed;
    public SnoreWavWriter(File part,File finished)throws IOException {
        this.part=part;this.finished=finished;
        if(part.exists()||finished.exists())throw new IOException("SNORE_FILE_EXISTS");
        out=new RandomAccessFile(part,"rw");try{header(out,0);}catch(IOException e){out.close();throw e;}
    }
    private static void le16(RandomAccessFile f,int n)throws IOException{f.write(n&255);f.write((n>>>8)&255);}
    private static void le32(RandomAccessFile f,long n)throws IOException{for(int i=0;i<4;i++)f.write((int)(n>>>(i*8))&255);}
    private static void header(RandomAccessFile f,long length)throws IOException {
        if(length<0||length>0xfffffff0L-36||(length&1)!=0)throw new IOException("SNORE_WAV_SIZE");
        f.seek(0);f.writeBytes("RIFF");le32(f,length+36);f.writeBytes("WAVEfmt ");le32(f,16);le16(f,1);le16(f,1);le32(f,RATE);le32(f,RATE*2);le16(f,2);le16(f,16);f.writeBytes("data");le32(f,length);
    }
    public void write(short[] frame,int length)throws IOException {
        if(closed||frame==null||length<0||length>frame.length||length>bytes.length/2)throw new IOException("SNORE_WAV_INPUT");
        for(int i=0;i<length;i++){bytes[2*i]=(byte)frame[i];bytes[2*i+1]=(byte)(frame[i]>>>8);}
        out.write(bytes,0,length*2);samples+=length;
    }
    public long samples(){return samples;}
    public void checkpoint()throws IOException{if(closed)throw new IOException("SNORE_WAV_CLOSED");header(out,samples*2);out.seek(HEADER+samples*2);out.getFD().sync();}
    @Override public void close()throws IOException {
        if(closed)return;
        try{checkpoint();}finally{closed=true;out.close();}
        if(!part.renameTo(finished))throw new IOException("SNORE_WAV_RENAME");
    }
    public static long recover(File part,File finished)throws IOException {
        File file=finished.isFile()?finished:part;
        if(!file.isFile())return 0;
        long length;
        try(RandomAccessFile f=new RandomAccessFile(file,"rw")){
            if(f.length()<HEADER)throw new IOException("SNORE_WAV_TRUNCATED");
            if(f.readInt()!=0x52494646)throw new IOException("SNORE_WAV_FORMAT");
            f.seek(8);if(f.readInt()!=0x57415645)throw new IOException("SNORE_WAV_FORMAT");
            length=(f.length()-HEADER)&~1L;f.setLength(HEADER+length);header(f,length);f.getFD().sync();
        }
        if(file.equals(part)&&!part.renameTo(finished))throw new IOException("SNORE_WAV_RENAME");
        return length/2;
    }
}
