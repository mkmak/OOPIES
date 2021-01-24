
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

public class compare {

    static String className;
    static String preFileName;
    static String postFileName;
    static String postWriteFileName;
    
    public compare(String prfn, String pofn, String pwfn) {
        preFileName = prfn;
        postFileName = pofn;
        postWriteFileName = pwfn;
    }

    private static ClassInfo loadData(String filename) {
        ClassInfo classInfo = new ClassInfo();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            // class name
            className = myReader.nextLine();
            classInfo.setName(className);
            // class name plus
            if (Integer.parseInt(myReader.nextLine()) == 1) {
                classInfo.setPlus(myReader.nextLine());
            }
            // data members
            String data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addDataMember(myReader.nextLine());
            }
            // methods
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                MethodInfo mi = new MethodInfo();
                // method modifiers
                String d = myReader.nextLine();
                for (int j = 0; j < Integer.parseInt(d); j++) {
                    mi.addModifier(myReader.nextLine());
                }
                // method name
                mi.setReturnType(myReader.nextLine());
                // method return type
                mi.setName(myReader.nextLine());
                // method parameters
                d = myReader.nextLine();
                for (int j = 0; j < Integer.parseInt(d); j++) {
                    mi.addParameter(myReader.nextLine());
                }
                // method locals
                d = myReader.nextLine();
                for (int j = 0; j < Integer.parseInt(d); j++) {
                    mi.addLocal(myReader.nextLine());
                }
                classInfo.addMethod(mi);
            }
            // aggregates
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addAggregate(myReader.nextLine());
            }
            // accociations
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addAssociation(myReader.nextLine());
            }
            // formal parameters
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addFormalParameters(myReader.nextLine());
            }
            // local variables
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addLocalVariable(myReader.nextLine());
            }
            // ancestors
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addAncestor(myReader.nextLine());
            }
            // descendants
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addDescendant(myReader.nextLine());
            }
            // method calls
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addMethodCall(myReader.nextLine());
            }
            // all method calls
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                String d = myReader.nextLine();
                List<String> mc = new ArrayList<>();
                for (int j = 0; j < Integer.parseInt(d); j++) {
                    mc.add(myReader.nextLine());
                }
                classInfo.addToAllMethodCalls(mc);
            }
            // header information
            data = myReader.nextLine();
            for (int i = 0; i < Integer.parseInt(data); i++) {
                classInfo.addHeaderInfo(myReader.nextLine());
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed reading data file: ");
            e.printStackTrace();
        }
        return classInfo;
    }

    private static String createHTMLString(LinkedList<DiffMatchPatch.Diff> diffs) {
        StringBuilder sb = new StringBuilder();

        for (DiffMatchPatch.Diff diff : diffs) {

            diff.text = diff.text.replace("\n", "<br>");
            diff.text = diff.text.replace("     ", "<span class='plain'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>");
            int count = 0;

            if (diff.operation == DiffMatchPatch.Operation.DELETE) {
                sb.append("<span class='del'>");

                sb.append(diff.text);
                sb.append("</span>");
                count += 1;
            } else if (diff.operation == DiffMatchPatch.Operation.INSERT) {
                sb.append("<span class='add'>");

                sb.append(diff.text);

                sb.append("</span>");
            } else {

                sb.append(diff.text);
            }

        }

        return sb.toString();

    }

    private static String classInfoToString(ClassInfo classInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + classInfo.getName() + classInfo.getPlus());

        if (classInfo.getAncestors().size() >= 2) {
            sb.append("     Ancestors:\n");
            for (String ancestor : classInfo.getAncestors()) {
                sb.append("          " + ancestor + "\n");
            }
        }

        // Output descendant classes / no descendants
        if (classInfo.getDescendants().size() >= 1) {
            sb.append("     Descendant classes:\n");
            for (String descendant : classInfo.getDescendants()) {
                sb.append("          " + descendant + "\n");
            }
        } else {
            sb.append("\n     No descendants\n");
        }

        List<String> headerInformation = classInfo.getHeaderInfo();
        for (int i = 0; i < headerInformation.size(); i++) {
            sb.append("     is " + headerInformation.get(i) + "\n");
        }

        sb.append("     Data Members:\n");
        List<String> dataMembers = classInfo.getDataMembers();

        for (String dataMember : dataMembers) {
            sb.append("          " + dataMember + "\n");
        }

        sb.append("     Method Members:\n");
        List<MethodInfo> methods = classInfo.getMethods();

        for (MethodInfo method : methods) {
            String name = method.getName();
            String returnType = method.getReturnType();
            Set<String> modifiers = method.getModifiers();
            List<String> parameters = method.getParameters();
            List<String> locals = method.getLocals();
            StringBuilder sb1 = new StringBuilder();
            sb1.append(name);
            sb1.append(" returns ");
            sb1.append(returnType);
            sb1.append(" is ");

            for (String modifier : modifiers) {
                sb1.append(modifier + " ");
            }

            sb.append("          " + sb1.toString() + "\n");

            // get parameters
            sb1 = new StringBuilder();
            for (int i = 0; i < parameters.size(); ++i) {
                String parameter = parameters.get(i);
                if (parameter != "") {
                    sb1.append(parameter);
                    if (i != parameters.size() - 1) {
                        sb1.append(", ");
                    }
                }
            }

            if (parameters.size() != 0) {
                sb.append("               Parameters: " + sb1.toString() + "\n");
            }

            sb1 = new StringBuilder();
            for (int i = 0; i < locals.size(); ++i) {
                String local = locals.get(i);
                if (local != "") {
                    sb1.append(local);
                    if (i != locals.size() - 1) {
                        sb1.append(", ");
                    }
                }
            }

            if (locals.size() != 0) {
                sb.append("               Local vars: " + sb1.toString() + "\n");
            }

            //Method Calls
            for (List<String> methodsLists : classInfo.getAllMethodCalls()) {
                if (methodsLists.size() > 1) {
                    if (methodsLists.get(0).equals(name)) {
                        for (int i = 1; i < methodsLists.size(); i++) {
                            sb.append("               Calls method " + methodsLists.get(i) + "\n");
                        }
                    }
                }

            }
        }

        sb.append("     Aggregates:\n");
        Set<String> aggregates = classInfo.getAggregates();

        for (String aggregate : aggregates) {
            sb.append("          " + aggregate + "\n");
        }

        if (aggregates.size() == 0) {
            sb.append("          NONE\n");
        }

        sb.append("     Associations:\n");
        List<String> associations = classInfo.getAssociations();

        for (String association : associations) {
            sb.append("          " + association + "\n");
        }

        if (associations.size() == 0) {
            sb.append("          NONE\n");
        }

        return sb.toString();
    }

    public static ArrayList<String> dataMembersDiff(ArrayList dataMembers) {
        return new ArrayList<String>();
    }

    public static int whitespace(String str) {
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            } else {
                return spaceCount;
            }
        }
        return spaceCount;
    }

    public static ArrayList<String> searchMethod(String method, ArrayList<String> method_members) {
        ArrayList<String> returnList = new ArrayList<String>();
        for (int i = 0; i < method_members.size(); i++) {
            String[] names = method_members.get(i).split(" ");
            if (names[0].equals(method)) {
                returnList.add(Integer.toString(i));
                returnList.add(names[0]);
                returnList.add(names[2]);
                returnList.add(names[4]);
                return returnList;
            }

        }
        return returnList;
    }

    public static ArrayList<String> searchMember(String member, ArrayList<String> data_members) {
        ArrayList<String> returnList = new ArrayList<String>();
        for (int i = 0; i < data_members.size(); i++) {
            String[] names = data_members.get(i).split(" ");
            int listSize = names.length;
            if (names[listSize - 1].equals(member)) {
                returnList.add(Integer.toString(i));
                returnList.add(names[listSize - 1]);
                returnList.add(names[listSize - 2]);
                returnList.add(names[listSize - 3]);
                return returnList;
            }

        }
        return returnList;
    }

    public static void replaceFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(postWriteFileName));

        try {
            File myObj = new File("temp");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                writer.write(data + "\n");

            }
            myReader.close();
            myObj.delete();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        writer.close();

    }

    public static void start() throws IOException {

        ClassInfo pre = loadData(preFileName);
        ClassInfo post = loadData(postFileName);

        String preInfo = classInfoToString(pre);
        String postInfo = classInfoToString(post);

        System.out.println("PRE:");
        System.out.println(preInfo);
        System.out.println("POST:");
        System.out.println(postInfo);

        DiffMatchPatch dmp = new DiffMatchPatch();
        LinkedList<DiffMatchPatch.Diff> diff = dmp.diff_main(preInfo, postInfo, true);
        dmp.diff_cleanupSemantic(diff);

        int detectMethods = 10;
        int detectMethodCalls = 15;

        int tracker = 0;
        int flag = 0;
        ArrayList<String> preDataMembers = new ArrayList<String>();
        ArrayList<String> preMethodMembers = new ArrayList<String>();

        for (String w : preInfo.split("\n")) {

            if (w.contains("Data Members:")) {
                tracker = 1;
                continue;
            } else if (w.contains("Method Members:")) {
                tracker = 2;
                continue;
            } else if (w.contains("Aggregates:")) {
                tracker = 0;
            };

            if (tracker == 1) {
                preDataMembers.add(w.trim());
            }
            if (tracker == 2) {

                if (whitespace(w) == detectMethods) {
                    preMethodMembers.add(w.trim());
                }

            }

        }

        tracker = 0;
        ArrayList<String> postDataMembers = new ArrayList<String>();
        ArrayList<String> postMethodMembers = new ArrayList<String>();

        for (String w : postInfo.split("\n")) {

            if (w.contains("Data Members:")) {
                tracker = 1;
                continue;
            } else if (w.contains("Method Members:")) {
                tracker = 2;
                continue;
            } else if (w.contains("Aggregates:")) {
                tracker = 0;
            }
            if (tracker == 1) {
                postDataMembers.add(w.trim());
            }
            if (tracker == 2) {

                if (whitespace(w) == detectMethods) {
                    postMethodMembers.add(w.trim());
                }

            }

        }

        preMethodMembers.remove(new ArrayList<String>());
        postMethodMembers.remove(new ArrayList<String>());

        //INSERTION AND DELETION OF DATA MEMBERS
        ArrayList<String> InsertedDataMembers = new ArrayList<String>(postDataMembers);
        ArrayList<String> DeletedDataMembers = new ArrayList<String>(preDataMembers);

        InsertedDataMembers.removeAll(preDataMembers);
        DeletedDataMembers.removeAll(postDataMembers);

        //CHANGED TYPE AND ACCESS OF METHOD MEMBERS
        ArrayList<List> TypeChangeDataMembers = new ArrayList<List>();
        ArrayList<List> AccessChangeDataMembers = new ArrayList<List>();
        ArrayList<String> InsertiontoDelete = new ArrayList<String>();
        ArrayList<String> DeletedtoDelete = new ArrayList<String>();

        int insertIndex = -1;

        for (String members : new ArrayList<String>(InsertedDataMembers)) {
            int flagged = 0;

            insertIndex += 1;
            String[] member_name = members.split(" ");
            int listSize = members.split(" ").length;
            ArrayList<String> membersInfo = searchMember(member_name[2], DeletedDataMembers);

            if (!membersInfo.isEmpty()) {

                if (member_name[listSize - 1].equals(membersInfo.get(1)) && !(member_name[listSize - 2].equals(membersInfo.get(2)))) {
                    flagged = 1;
                    ArrayList<String> newList = new ArrayList<String>();
                    newList.add(member_name[listSize - 1]);
                    newList.add(membersInfo.get(2));
                    newList.add(member_name[listSize - 2]);
                    TypeChangeDataMembers.add(newList);
                }
                if (member_name[listSize - 1].equals(membersInfo.get(1)) && !(member_name[listSize - 3].equals(membersInfo.get(3)))) {
                    flagged = 1;
                    ArrayList<String> newList = new ArrayList<String>();
                    newList.add(member_name[listSize - 1]);
                    newList.add(membersInfo.get(3));
                    newList.add(member_name[listSize - 3]);
                    AccessChangeDataMembers.add(newList);

                }

                if (flagged == 1) {

                    InsertiontoDelete.add(InsertedDataMembers.get(insertIndex));
                    DeletedtoDelete.add(DeletedDataMembers.get(Integer.parseInt(membersInfo.get(0))));

                }

            }

        }

        InsertedDataMembers.removeAll(InsertiontoDelete);
        DeletedDataMembers.removeAll(DeletedtoDelete);

        //INSERTION AND DELETION OF METHOD MEMBERS
        ArrayList<String> InsertedMethodMembers = new ArrayList<String>(postMethodMembers);
        ArrayList<String> DeletedMethodMembers = new ArrayList<String>(preMethodMembers);

        InsertedMethodMembers.removeAll(preMethodMembers);
        DeletedMethodMembers.removeAll(postMethodMembers);

        //CHANGED TYPE AND ACCESS OF METHOD MEMBERS
        ArrayList<List> TypeChangeMethodMembers = new ArrayList<List>();
        ArrayList<List> AccessChangeMethodMembers = new ArrayList<List>();
        ArrayList<String> Insertion2toDelete = new ArrayList<String>();
        ArrayList<String> Deleted2toDelete = new ArrayList<String>();

        insertIndex = -1;

        for (String methods : new ArrayList<String>(InsertedMethodMembers)) {
            int flagged = 0;
            insertIndex += 1;
            String[] method_name = methods.split(" ");
            ArrayList<String> methodInfo = searchMethod(method_name[0], DeletedMethodMembers);

            if (!methodInfo.isEmpty()) {

                if (method_name[0].equals(methodInfo.get(1)) && !(method_name[2].equals(methodInfo.get(2)))) {
                    flagged = 1;
                    ArrayList<String> newList = new ArrayList<String>();
                    newList.add(method_name[0]);
                    newList.add(methodInfo.get(2));
                    newList.add(method_name[2]);
                    TypeChangeMethodMembers.add(newList);
                }
                if (method_name[0].equals(methodInfo.get(1)) && !(method_name[4].equals(methodInfo.get(3)))) {
                    flagged = 1;
                    ArrayList<String> newList = new ArrayList<String>();
                    newList.add(method_name[0]);
                    newList.add(methodInfo.get(3));
                    newList.add(method_name[4]);
                    AccessChangeMethodMembers.add(newList);

                }

                if (flagged == 1) {

                    Insertion2toDelete.add(InsertedMethodMembers.get(insertIndex));
                    Deleted2toDelete.add(DeletedMethodMembers.get(Integer.parseInt(methodInfo.get(0))));

                }

            }

        }

        InsertedMethodMembers.removeAll(Insertion2toDelete);
        DeletedMethodMembers.removeAll(Deleted2toDelete);

        //OPEN POST MANTAINENCE FILE AND WRITE COMMENTS
        BufferedWriter writer = new BufferedWriter(new FileWriter("temp"));
        writer.write(' ');
        writer.write("//************AUTODOC Commentary************\n");
        writer.write("//class " + className + " were automatically noted by AutoDoc\n");

        //COMMENT ON DATA MEMBERS
        if (!DeletedDataMembers.isEmpty()) {
            writer.write("//\tDeleted class data member(s):  \n");
            for (String a_data_member : DeletedDataMembers) {
                writer.write("//\t\t" + a_data_member + "\n");
            }
        }

        if (!InsertedDataMembers.isEmpty()) {
            writer.write("//\tAdded class data member(s):  \n");
            for (String a_data_member : InsertedDataMembers) {
                writer.write("//\t\t" + a_data_member + "\n");
            }
        }

        if (!TypeChangeDataMembers.isEmpty()) {
            writer.write("//\tChanged Type class data member(s):  \n");
            for (int i = 0; i < TypeChangeDataMembers.size(); i++) {
                writer.write("//\t\t" + "Data Member: " + TypeChangeDataMembers.get(i).get(0) + "\n");
                writer.write("//\t\t\t" + "Type changed: " + TypeChangeDataMembers.get(i).get(1) + " --> " + TypeChangeDataMembers.get(i).get(2) + "\n");
            }

        }

        if (!AccessChangeDataMembers.isEmpty()) {
            writer.write("//\tChanged Access class data member(s):  \n");
            for (int i = 0; i < AccessChangeDataMembers.size(); i++) {
                writer.write("//\t\t" + "Data Member: " + AccessChangeDataMembers.get(i).get(0) + "\n");
                writer.write("//\t\t\t" + "Access changed: " + AccessChangeDataMembers.get(i).get(1) + " --> " + AccessChangeDataMembers.get(i).get(2) + "\n");
            }

        }

        //COMMENT ON METHOD MEMBERS
        if (!DeletedMethodMembers.isEmpty()) {
            writer.write("//\tDeleted class method member(s):  \n");
            for (int i = 0; i < DeletedMethodMembers.size(); i++) {
                writer.write("//\t\t" + DeletedMethodMembers.get(i) + "\n");
            }

        }

        if (!InsertedMethodMembers.isEmpty()) {
            writer.write("//\tAdded class method member(s):  \n");
            for (int i = 0; i < InsertedMethodMembers.size(); i++) {
                writer.write("//\t\t" + InsertedMethodMembers.get(i) + "\n");

            }

        }

        if (!TypeChangeMethodMembers.isEmpty()) {
            writer.write("//\tChanged Type class method member(s):  \n");
            for (int i = 0; i < TypeChangeMethodMembers.size(); i++) {
                writer.write("//\t\t" + "Method Member: " + TypeChangeMethodMembers.get(i).get(0) + "\n");
                writer.write("//\t\t\t" + "Type changed: " + TypeChangeMethodMembers.get(i).get(1) + " --> " + TypeChangeMethodMembers.get(i).get(2) + "\n");
            }

        }

        if (!AccessChangeMethodMembers.isEmpty()) {
            writer.write("//\tChanged Access class method member(s):  \n");
            for (int i = 0; i < AccessChangeMethodMembers.size(); i++) {
                writer.write("//\t\t" + "Method Member: " + AccessChangeMethodMembers.get(i).get(0) + "\n");
                writer.write("//\t\t\t" + "Access changed: " + AccessChangeMethodMembers.get(i).get(1) + " --> " + AccessChangeMethodMembers.get(i).get(2) + "\n");
            }

        }

        writer.write("//*****END AUTODOC Commentary for class " + className + "\n\n");

        try {
            File myObj = new File(postWriteFileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (!data.contains("//")) {
                    writer.append(data + "\n");
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        writer.close();

        replaceFile();

        String htmlString = createHTMLString(diff);

        JFrame frame = new JFrame("AutoDoc");

        // create a JEditorPane
        JEditorPane jEditorPane = new JEditorPane();

        // make it read-only
        jEditorPane.setEditable(false);

        // add a HTMLEditorKit to the editor pane
        HTMLEditorKit kit = new HTMLEditorKit();
        jEditorPane.setEditorKit(kit);

        // now add it to a scroll pane
        JScrollPane scrollPane = new JScrollPane(jEditorPane);

        StyleSheet styleSheet = kit.getStyleSheet();
        styleSheet.addRule(".del {background:#ffe6e6;}");
        styleSheet.addRule(".add {background:#e6ffe6;}");

        // create a document, set it on the jeditorpane, then add the html
        Document doc = kit.createDefaultDocument();
        jEditorPane.setDocument(doc);
        jEditorPane.setText(htmlString);

        frame.add(scrollPane);
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

}
