package com.example.opponotificationrelay;
import java.io.*;import java.nio.file.*;import java.util.*;
public final class SnoreWavTest {
 static int checks;static void check(boolean ok,String why){checks++;if(!ok)throw new AssertionError(why);}
 static long le(byte[] b,int p){return(b[p]&255L)|((b[p+1]&255L)<<8)|((b[p+2]&255L)<<16)|((b[p+3]&255L)<<24);}
 public static void main(String[] args)throws Exception {
  Path dir=Files.createTempDirectory("snore-wav-test-");List<Path> made=new ArrayList<>();
  try{
   File part=dir.resolve("record.wav.part").toFile(),done=dir.resolve("record.wav").toFile();made.add(part.toPath());made.add(done.toPath());
   SnoreWavWriter w=new SnoreWavWriter(part,done);short[] pcm=new short[]{0,1,-1,32767,-32768};w.write(pcm,pcm.length);
   byte[] unfinished=Files.readAllBytes(part.toPath());check(le(unfinished,40)==0,"uncheckpointed header remains identifiable");
   File crash=dir.resolve("crash.wav.part").toFile(),fixed=dir.resolve("crash.wav").toFile();made.add(crash.toPath());made.add(fixed.toPath());Files.write(crash.toPath(),unfinished);
   w.checkpoint();check(w.samples()==5,"sample count");w.write(pcm,pcm.length);w.close();w.close();check(!part.exists()&&done.isFile(),"atomic name change");
   byte[] data=Files.readAllBytes(done.toPath());check(data.length==64&&le(data,4)==56&&le(data,40)==20,"RIFF lengths");check(le(data,24)==8000&&le(data,28)==16000,"sample rate and byte rate");check(data[46]==1&&data[47]==0&&data[48]==-1&&data[49]==-1&&data[52]==0&&data[53]==-128,"signed PCM little endian");
   check(SnoreWavWriter.recover(crash,fixed)==5,"crash recovery counts physical samples");check(le(Files.readAllBytes(fixed.toPath()),40)==10,"crash header repaired");check(SnoreWavWriter.recover(crash,fixed)==5,"recovery idempotent");
   try{w.write(pcm,1);throw new AssertionError("write after close");}catch(IOException expected){check(true,"closed writer rejects data");}
   try{new SnoreWavWriter(part,done);throw new AssertionError("overwrite");}catch(IOException expected){check(true,"existing recording preserved");}
   File bad=dir.resolve("bad.wav.part").toFile();made.add(bad.toPath());Files.write(bad.toPath(),new byte[44]);try{SnoreWavWriter.recover(bad,dir.resolve("bad.wav").toFile());throw new AssertionError("bad header");}catch(IOException expected){check(true,"foreign file rejected");}
   System.out.println("Snore WAV tests passed: "+checks);
  }finally{for(Path p:made)Files.deleteIfExists(p);Files.deleteIfExists(dir);}
 }
}
