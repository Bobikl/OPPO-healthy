package com.example.opponotificationrelay;
import java.util.*;
public final class ActivityBridgePolicyTest {
 static int count;static void check(boolean b,String m){count++;if(!b)throw new AssertionError(m);}
 public static void main(String[] args)throws Exception {
  long[] old={196,42000,0,1,5000,100000,10,10},next={548,81000,2,2,5000,100000,10,10};
  check(Arrays.equals(ActivityBridgePolicy.merge(old,next),next),"new totals replace stale totals without summing");
  check(Arrays.equals(ActivityBridgePolicy.merge(next,old),next),"stale source cannot lower official totals");
  check(Arrays.equals(ActivityBridgePolicy.merge(next,next),next),"repeat is idempotent");
  long[] targets=next.clone();targets[4]=8000;check(ActivityBridgePolicy.merge(old,targets)[4]==5000,"known historical goal is preserved");
  long[] missing=old.clone();missing[4]=0;check(ActivityBridgePolicy.merge(missing,targets)[4]==8000,"missing goal can be filled");
  check(Arrays.equals(ActivityBridgePolicy.completed(new long[]{2281,205000,4,7,5000,100000,10,10}),new int[]{0,1,0,0,0}),"historical goal flags");
  check(Arrays.equals(ActivityBridgePolicy.completed(new long[]{9072,497000,21,12,5000,100000,10,10}),new int[]{1,1,1,1,1}),"all goal flags");
  int date=Integer.parseInt(java.time.LocalDate.now().toString().replace("-",""));ActivityBridgePolicy.valid(date,next);count++;
  for(int d:new int[]{20260230,20140101,20991231})try{ActivityBridgePolicy.valid(d,next);throw new AssertionError("date accepted");}catch(java.io.IOException e){count++;}
  for(int i=0;i<8;i++){long[] bad=next.clone();bad[i]=-1;try{ActivityBridgePolicy.valid(date,bad);throw new AssertionError("negative accepted");}catch(java.io.IOException e){count++;}}
  Random r=new Random(3);for(int n=0;n<400;n++){long[] a=next.clone(),b=old.clone();for(int i=0;i<4;i++){a[i]=r.nextInt(100000);b[i]=r.nextInt(100000);}long[] m=ActivityBridgePolicy.merge(a,b);for(int i=0;i<4;i++)check(m[i]>=a[i]&&m[i]>=b[i]&&m[i]<=Math.max(a[i],b[i]),"cumulative merge cannot sum or drop values");check(Arrays.equals(m,ActivityBridgePolicy.merge(m,b)),"idempotent random merge");}
  System.out.println("Activity bridge policy checks passed: "+count);
 }
}
