package com.example.opponotificationrelay;
import java.io.*;import java.util.concurrent.*;import java.util.concurrent.atomic.*;
public final class HealthChannelLockTest {
 static int checks;static void check(boolean value,String text){checks++;if(!value)throw new AssertionError(text);}
 static final class Output extends OutputStream {
  final ByteArrayOutputStream bytes=new ByteArrayOutputStream();final CountDownLatch entered=new CountDownLatch(1),release=new CountDownLatch(1);volatile boolean block,fail;
  public void write(int value)throws IOException{write(new byte[]{(byte)value},0,1);}
  public void write(byte[] data,int offset,int length)throws IOException{if(block){entered.countDown();try{if(!release.await(3,TimeUnit.SECONDS))throw new IOException("blocked fixture timeout");}catch(InterruptedException e){Thread.currentThread().interrupt();throw new IOException(e);}}if(fail)throw new IOException("injected send failure");bytes.write(data,offset,length);}
 }
 static OafHealthChannel channel(Output output)throws Exception {
  OafHealthChannel channel=new OafHealthChannel(new OafWire(new ByteArrayInputStream(new byte[0]),output),new OafHealthChannel.Events(){public long now(){return 100;}public void changed(){}public void status(String s){}});
  channel.refresh();channel.peer(17,OafHealthChannel.PROFILE);channel.start();int sid=channel.reserved();channel.control(HealthSettingsTest.control(2,17,OafCrypto.concat(new byte[]{0},OafWire.be16(1),OafWire.be16(sid))),HealthSettingsTest.end());channel.pump();channel.receive(OafCrypto.concat(new byte[]{0,(byte)197},HealthSettingsTest.fixture()));return channel;
 }
 public static void main(String[] args)throws Exception {
  Output output=new Output();OafHealthChannel channel=channel(output);AtomicInteger callbacks=new AtomicInteger();HealthSyncProtocol.Request request=HealthSyncProtocol.range(HealthSyncProtocol.Kind.HEART,1790910000,1790913600);
  check(channel.history(request,(ok,data,message)->callbacks.incrementAndGet()),"history queued");output.block=true;AtomicReference<Throwable> failure=new AtomicReference<>();Thread sender=new Thread(()->{try{channel.pump();}catch(Throwable e){failure.set(e);}},"blocked-health-send");sender.start();ExecutorService ui=Executors.newSingleThreadExecutor();
  try{check(output.entered.await(1,TimeUnit.SECONDS),"write is actually blocked");Future<Boolean> state=ui.submit(()->{check(channel.snapshot().busy,"busy state available during write");check(!channel.change(HealthSetting.STEP,9000,channel.snapshot().revision),"concurrent write rejected without waiting for socket");channel.close();return !channel.snapshot().connected;});check(state.get(300,TimeUnit.MILLISECONDS),"UI snapshot and close do not await socket");check(callbacks.get()==1,"close callback once");}
  finally{output.release.countDown();sender.join(2000);ui.shutdownNow();}
  check(!sender.isAlive()&&failure.get()==null,"in-flight send can finish after state closes");check(callbacks.get()==1,"completion cannot duplicate closed callback");
  Output failed=new Output();OafHealthChannel second=channel(failed);AtomicInteger rejected=new AtomicInteger();check(second.history(request,(ok,data,message)->{if(!ok)rejected.incrementAndGet();}),"failure history queued");failed.fail=true;try{second.pump();throw new AssertionError("send failure swallowed");}catch(IOException expected){checks++;}check(rejected.get()==1&&!second.snapshot().busy,"send failure clears operation exactly once");int count=failed.bytes.size();failed.fail=false;second.pump();second.pump();check(failed.bytes.size()==count,"failed write is never replayed");second.close();check(rejected.get()==1,"close does not repeat failed callback");
  Output disconnected=new Output();OafHealthChannel third=channel(disconnected);int before=disconnected.bytes.size();third.control(HealthSettingsTest.control(3,17,new byte[0]),HealthSettingsTest.end());check(disconnected.bytes.size()>before&&!third.snapshot().connected,"peer disconnect acknowledgement survives operation cleanup");third.close();
  System.out.println("HealthChannelLockTest: "+checks+" checks passed");
 }
}
