import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
 class hackfunc1{
	 private String hack_str;
	 public hackfunc1() {
		 hack_str="HackerEarth";
	 }
	 private void hack_method() {
		 System.out.println("Hello HackerEarth");
	 }
 }
 public class Demo
 {
	 public static void main(String[] args) {
		 hackfunc1 hack_obj= new hackfunc1();
		 Class hack_class= hack_obj.getClass();
		 Constructor hack_const=hack_class.getConstructor();
		 Method[] methods=hack_class.getMethods();
		 for(Method method:methods)
			 System.out.println(method.getName());
		 Method hack_call = hack_class.getDeclaredMethod("hack_method");
		 hack_call.setAccessible(true);
		 hack_call.invoke(hack_obj);

			 
	 }
 }
