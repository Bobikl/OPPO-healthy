import com.android.tools.smali.dexlib2.*;
import com.android.tools.smali.dexlib2.iface.*;
import com.android.tools.smali.dexlib2.iface.reference.*;
import com.android.tools.smali.dexlib2.iface.instruction.*;
import com.android.tools.smali.dexlib2.iface.value.*;
import com.android.tools.smali.dexlib2.writer.pool.*;
import com.android.tools.smali.dexlib2.writer.io.*;
import java.util.*;import java.nio.file.*;import java.nio.charset.StandardCharsets;import java.io.*;
public class RuntimeClosure {
 static Map<String,ClassDef> all=new TreeMap<>();static Set<String> deps=new TreeSet<>();
 static void type(String s){if(s==null)return;while(s.startsWith("["))s=s.substring(1);if(s.startsWith("L"))deps.add(s);}
 static void ref(Reference r){
  if(r instanceof TypeReference)type(((TypeReference)r).getType());
  if(r instanceof FieldReference){FieldReference f=(FieldReference)r;type(f.getDefiningClass());type(f.getType());}
  if(r instanceof MethodReference){MethodReference m=(MethodReference)r;type(m.getDefiningClass());type(m.getReturnType());for(CharSequence p:m.getParameterTypes())type(p.toString());}
  if(r instanceof MethodProtoReference){MethodProtoReference m=(MethodProtoReference)r;type(m.getReturnType());for(CharSequence p:m.getParameterTypes())type(p.toString());}
 }
 static void value(EncodedValue v){if(v==null)return;if(v instanceof TypeEncodedValue)type(((TypeEncodedValue)v).getValue());else if(v instanceof FieldEncodedValue)ref(((FieldEncodedValue)v).getValue());else if(v instanceof EnumEncodedValue)ref(((EnumEncodedValue)v).getValue());else if(v instanceof MethodEncodedValue)ref(((MethodEncodedValue)v).getValue());else if(v instanceof ArrayEncodedValue)for(EncodedValue x:((ArrayEncodedValue)v).getValue())value(x);else if(v instanceof AnnotationEncodedValue){type(((AnnotationEncodedValue)v).getType());for(AnnotationElement x:((AnnotationEncodedValue)v).getElements())value(x.getValue());}}
 static void annotations(Set<? extends Annotation> a){for(Annotation n:a){type(n.getType());for(AnnotationElement e:n.getElements())value(e.getValue());}}
 static Set<String> references(ClassDef c){deps=new TreeSet<>();type(c.getSuperclass());for(String i:c.getInterfaces())type(i);annotations(c.getAnnotations());for(Field f:c.getFields()){type(f.getType());value(f.getInitialValue());annotations(f.getAnnotations());}for(Method m:c.getMethods()){ref(m);annotations(m.getAnnotations());for(MethodParameter p:m.getParameters())annotations(p.getAnnotations());MethodImplementation impl=m.getImplementation();if(impl!=null){for(Instruction i:impl.getInstructions()){if(i instanceof ReferenceInstruction)ref(((ReferenceInstruction)i).getReference());if(i instanceof DualReferenceInstruction)ref(((DualReferenceInstruction)i).getReference2());}for(TryBlock<? extends ExceptionHandler> t:impl.getTryBlocks())for(ExceptionHandler e:t.getExceptionHandlers())type(e.getExceptionType());}}return deps;}
 public static void main(String[] args)throws Exception{
  var container=DexFileFactory.loadDexContainer(new File(args[0]),Opcodes.getDefault());for(String n:container.getDexEntryNames())for(ClassDef c:container.getEntry(n).getDexFile().getClasses())all.put(c.getType(),c);
  if(args.length>3)for(ClassDef c:DexFileFactory.loadDexFile(new File(args[3]),Opcodes.getDefault()).getClasses())all.put(c.getType(),c);
  Set<String> keep=new TreeSet<>();ArrayDeque<String> todo=new ArrayDeque<>();for(String s:Files.readAllLines(Paths.get(args[1]),StandardCharsets.UTF_8)){s=s.trim();if(s.isEmpty()||s.startsWith("#"))continue;if(s.endsWith("*")){String prefix="L"+s.substring(0,s.length()-1).replace('.','/');for(String n:all.keySet())if(n.startsWith(prefix))todo.add(n);}else todo.add("L"+s.replace('.','/')+";");}
  Set<String> missing=new TreeSet<>();while(!todo.isEmpty()){String n=todo.remove();if(keep.contains(n))continue;ClassDef c=all.get(n);if(c==null){missing.add(n);continue;}keep.add(n);for(String d:references(c))if(!keep.contains(d))todo.add(d);if(keep.size()%5000==0)System.out.println("closure "+keep.size());}
  Path out=Paths.get(args[2]);Files.createDirectories(out);Files.write(out.resolve("classes.txt"),keep,StandardCharsets.UTF_8);Files.write(out.resolve("external-types.txt"),missing,StandardCharsets.UTF_8);System.out.println("KEEP "+keep.size()+" / "+all.size());
  // DEX 039 retains interface default/static method semantics used by Compose.
  int index=1;for(String name:container.getDexEntryNames()){DexPool pool=new DexPool(Opcodes.forDexVersion(39));int count=0;for(ClassDef c:container.getEntry(name).getDexFile().getClasses())if(keep.contains(c.getType())){pool.internClass(all.get(c.getType()));count++;}if(count==0)continue;FileDataStore ds=new FileDataStore(out.resolve("classes"+(index==1?"":index)+".dex").toFile());try{pool.writeTo(ds);}finally{ds.close();}System.out.println("DEX "+index+" classes "+count);index++;}
 }
}
