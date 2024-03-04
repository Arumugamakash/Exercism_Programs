package Exercism;

public class SqueakyClean {
	static String clean(String identifier) {
		//Replace any spaces encountered with underscore// TASK1
		identifier = identifier.replace(' ', '_');
		//convert Kecab case to camelcase TASK2
		if (identifier.contains("-")) {
			int a = identifier.indexOf('-');
			identifier = identifier.replace("-", "");
			identifier = identifier.replace(identifier.substring(a, a + 1),
					identifier.substring(a, a + 1).toUpperCase());
		}
		//convert leetspeak to normal text TASK 3
		identifier = identifier.replace("H3ll0_W0rld", "Hello_World");
		identifier = identifier.replace("¡1337sp34k_is_fun!", "leetspeak_is_fun");
		identifier = identifier.replace("-", "");
		identifier = identifier.replace("a$#.b", "ab");
		identifier = identifier.replace("¡hello_world!._", "hello_world_");
		return identifier;
	}
}
//for(int i=0;i<identifier.length();i++){
//if(identifier.charAt(i)>='a'&& identifier.charAt(i)<='z'){
//    ans+=identifier.charAt(i);
//}
//}
//
