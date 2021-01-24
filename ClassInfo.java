import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class ClassInfo implements java.io.Serializable{
	
	private String className;
	private String className_plus;
	private List<String> dataMembers;
	private List<MethodInfo> methods;
	private Set<String> aggregates;
	private List<String> associations;
	private List<String> formalParameters;
	private List<String> localVariables;
	private Set<String> ancestors;
	private Set<String> descendants;
	private ArrayList<String> method_calls;
	private ArrayList<List<String>> all_method_calls;
	private List<String> headerInformation;

	
	public ClassInfo() {
		this.className = "";
		this.className_plus = "";
		dataMembers = new ArrayList<>();
		methods = new ArrayList<>();
		aggregates = new HashSet<>();
		associations = new ArrayList<>();
		formalParameters = new ArrayList<>();
		localVariables = new ArrayList<>();
		ancestors = new HashSet<>();
		descendants = new HashSet<>();
		method_calls = new ArrayList<String>();
		all_method_calls = new ArrayList<List<String>>();
		headerInformation = new ArrayList<>();
		
	}
	
	// written by Ann M
	public String getName() {
		return className;
	}
	public String getPlus() {
		return className_plus;
	}
	// written by Ann M
	public List<String> getDataMembers() {
		return dataMembers;
	}
	// written by Ann M
	public List<MethodInfo> getMethods() {
		return methods;
	}
	
	//written by Ann M
	public Set<String> getAggregates() {
		return aggregates;
	}
	
	//written by Ann M
	public List<String> getAssociations() {
		return associations;
	}
	
	//written by Ann M
	public List<String> getFormalParameters() {
		return formalParameters;
	}
	
	//written by Ann M
	public List<String> getLocalVariables() {
		return localVariables;
	}

	//written by Mike M
	public Set<String> getAncestors() {
		return ancestors;
	}

	//written by Mike M
	public Set<String> getDescendants() {
		return descendants;
	}
	
	
	//written by Amish M
	public List<String> getHeaderInfo() {
		return headerInformation;
	}
	
	
	// written by Amish M
		public List<String> getMethodCalls() {
			return method_calls;
		}
		
		public ArrayList<List<String>> getAllMethodCalls() {
			return all_method_calls;
		}
		
	// written by Ann M
	public void setName(String name) {
		className = name;
	}
	public void setPlus(String plus) {
		className_plus = plus;
	}
	// written by Ann M
	public void addDataMember(String data) {
		dataMembers.add(data);
	}
	// written by Ann M
	public void addMethod(MethodInfo method) {
		methods.add(method);
	}
	// written by Ann M
	public void addAggregate(String aggregate) {
		aggregates.add(aggregate);
	}
	
	// written by Ann M
	public void addAssociation(String association) {
		associations.add(association);
	}
	
	// written by Ann M
	public void addFormalParameters(String fp) {
		formalParameters.add(fp);
	}
	
	// written by Ann M
	public void addLocalVariable(String local) {
		localVariables.add(local);
	}

	//written by Mike M
	public void addAncestor(String ances) {
		ancestors.add(ances);
	}

	//written by Mike M
	public void setAncestors(Set<String> ances) {
		ancestors = ances;
	}

	//written by Mike M
	public void addDescendant(String descendant) {
		descendants.add(descendant);
	}
	
	
	// written by Amish M
		public void addToAllMethodCalls(List<String> methods) {
			if(methods.size() > 1)
				all_method_calls.add(methods);
		}
		
		// written by Amish M
		public void emptyMethodCalls() {
			method_calls = new ArrayList<String>();
		}
		
		// written by Amish M
		public void addMethodCall(String method) {
			method_calls.add(method);
			
		}

		public void addHeaderInfo(String info) {
			headerInformation.add(info);
		}
		
		// written by Amish M
		public void headerInfo(String info) {
			if(info.length()>0)
			{
				String[] splitted = info.split(" ");
				if(!splitted[0].equals("public")){
					headerInformation.add(splitted[0]);
				}
				for(int i = 1; i < splitted.length; i++)
					headerInformation.add(splitted[i]);
			}
		}
	
		
	
	
		
}
