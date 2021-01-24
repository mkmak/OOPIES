import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MethodInfo {
	
	private Set<String> modifiers;
	private String returnType;
	private String name;
	private List<String> parameters;
	private List<String> locals;
	
	public MethodInfo() {
		modifiers = new HashSet<>();
		returnType = "";
		name = "";
		parameters = new ArrayList<>();
		locals = new ArrayList<>();
	}
	
	public void addModifier(String modifier) {
		modifiers.add(modifier);
	}
	
	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addParameter(String param) {
		parameters.add(param);
	}
	
	public void addLocal(String local) {
		locals.add(local);
	}
	
	public Set<String> getModifiers() {
		return modifiers;
	}
	
	public String getReturnType() {
		return returnType;
	}
	
	public String getName() {
		return name;
	}
	
	public List<String> getParameters() {
		return parameters;
	}
	
	public List<String> getLocals() {
		return locals;
	}
	
}
