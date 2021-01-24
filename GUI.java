
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Owner
 */
public class GUI implements ActionListener {

    private static Map<String, ClassInfo> map;
    private static boolean load = false;
    private static DefaultMutableTreeNode root;
    private static JFrame frame;
    private static JPanel panel_btn;
    private static JScrollPane scrollP;
    private static JLabel pre_output_file = new JLabel("no file selected");
    private static JLabel post_output_file = new JLabel("no file selected");

    private static String preFileName = "";
    private static String postFileName = "";
    private static String postWriteFileName = "";

    private static Map<String, String> names_map = new HashMap<>();

    private static void storeData(String filename, ClassInfo classInfo) {
        try {
            FileWriter myWriter = new FileWriter(filename);

            myWriter.write(classInfo.getName() + "\n");
            if (!classInfo.getPlus().equals("")) {
                myWriter.write("1\n" + classInfo.getPlus() + "\n");
            } else {
                myWriter.write("0\n");
            }
            myWriter.write(classInfo.getDataMembers().size() + "\n");
            for (String dm : classInfo.getDataMembers()) {
                myWriter.write(dm + "\n");
            }
            myWriter.write(classInfo.getMethods().size() + "\n");
            for (MethodInfo method : classInfo.getMethods()) {
                myWriter.write(method.getModifiers().size() + "\n");
                for (String modifier : method.getModifiers()) {
                    myWriter.write(modifier + "\n");
                }
                myWriter.write(method.getReturnType() + "\n" + method.getName() + "\n" + method.getParameters().size() + "\n");
                for (String parameter : method.getParameters()) {
                    myWriter.write(parameter + "\n");
                }
                myWriter.write(method.getLocals().size() + "\n");
                for (String local : method.getLocals()) {
                    myWriter.write(local + "\n");
                }
            }
            myWriter.write(classInfo.getAggregates().size() + "\n");
            for (String aggregate : classInfo.getAggregates()) {
                myWriter.write(aggregate + "\n");
            }
            myWriter.write(classInfo.getAssociations().size() + "\n");
            for (String association : classInfo.getAssociations()) {
                myWriter.write(association + "\n");
            }
            myWriter.write(classInfo.getFormalParameters().size() + "\n");
            for (String formal : classInfo.getFormalParameters()) {
                myWriter.write(formal + "\n");
            }
            myWriter.write(classInfo.getLocalVariables().size() + "\n");
            for (String local : classInfo.getLocalVariables()) {
                myWriter.write(local + "\n");
            }
            myWriter.write(classInfo.getAncestors().size() + "\n");
            for (String ancestor : classInfo.getAncestors()) {
                myWriter.write(ancestor + "\n");
            }
            myWriter.write(classInfo.getDescendants().size() + "\n");
            for (String des : classInfo.getDescendants()) {
                myWriter.write(des + "\n");
            }
            myWriter.write(classInfo.getMethodCalls().size() + "\n");
            for (String mc : classInfo.getMethodCalls()) {
                myWriter.write(mc + "\n");
            }
            myWriter.write(classInfo.getAllMethodCalls().size() + "\n");
            for (List<String> amc : classInfo.getAllMethodCalls()) {
                myWriter.write(amc.size() + "\n");
                for (String s : amc) {
                    myWriter.write(s + "\n");
                }
            }
            myWriter.write(classInfo.getHeaderInfo().size() + "\n");
            for (String hi : classInfo.getHeaderInfo()) {
                myWriter.write(hi + "\n");
            }

            myWriter.close();
            System.out.println("Data stored in file " + filename);
        } catch (IOException e) {
            System.out.println("Failed storing data: ");
            e.printStackTrace();
        }
    }

    private static ClassInfo loadData(String filename) {
        ClassInfo classInfo = new ClassInfo();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);

            // class name
            classInfo.setName(myReader.nextLine());
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

    private static void printData(String prpo) {
        for (String className : map.keySet()) {
            ClassInfo classInfo = map.get(className);

            // Output class name followed with "extends/implements"
            DefaultMutableTreeNode class_node = new DefaultMutableTreeNode("\n" + className + classInfo.getPlus());
            root.add(class_node);
            System.out.println("\n" + className + classInfo.getPlus());

            // Output ancestor classes if # more than 1
            if (classInfo.getAncestors().size() >= 2) {
                DefaultMutableTreeNode ancestor_node = new DefaultMutableTreeNode("Ancestors");
                class_node.add(ancestor_node);
                System.out.println("     Ancestors:");
                for (String ancestor : classInfo.getAncestors()) {
                    ancestor_node.add(new DefaultMutableTreeNode(ancestor));
                    System.out.println("          " + ancestor);
                }
            }

            // Output descendant classes / no descendants
            if (classInfo.getDescendants().size() >= 1) {
                DefaultMutableTreeNode descendant_node = new DefaultMutableTreeNode("Descendant classes");
                class_node.add(descendant_node);
                System.out.println("     Descendant classes:");
                for (String descendant : classInfo.getDescendants()) {
                    descendant_node.add(new DefaultMutableTreeNode(descendant));
                    System.out.println("          " + descendant);
                }
            } else {
                class_node.add(new DefaultMutableTreeNode("No descendants"));
                System.out.println("     No descendants");
            }

            List<String> headerInformation = classInfo.getHeaderInfo();
            for (int i = 0; i < headerInformation.size(); i++) {
                class_node.add(new DefaultMutableTreeNode("is " + headerInformation.get(i)));
                System.out.println("     is " + headerInformation.get(i));
            }

            DefaultMutableTreeNode data_member_node = new DefaultMutableTreeNode("Data Members");
            class_node.add(data_member_node);
            System.out.println("     Data Members:");
            List<String> dataMembers = classInfo.getDataMembers();

            for (String dataMember : dataMembers) {
                data_member_node.add(new DefaultMutableTreeNode(dataMember));
                System.out.println("          " + dataMember);
                if (!load) {
                    // check if data member is a class, if it is then add it as an aggregate
                    String names[] = dataMember.split(" ");
                    for (int i = 0; i < names.length; ++i) {
                        if (map.containsKey(names[i])) {
                            classInfo.addAggregate(names[i]);
                        }
                    }
                }
            }

            DefaultMutableTreeNode method_member_node = new DefaultMutableTreeNode("Method Members");
            class_node.add(method_member_node);
            System.out.println("     Method Members:");
            List<MethodInfo> methods = classInfo.getMethods();

            for (MethodInfo method : methods) {
                String name = method.getName();
                String returnType = method.getReturnType();
                Set<String> modifiers = method.getModifiers();
                List<String> parameters = method.getParameters();
                List<String> locals = method.getLocals();
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(" returns ");
                sb.append(returnType);
                sb.append(" is ");

                for (String modifier : modifiers) {
                    sb.append(modifier + " ");
                }

                DefaultMutableTreeNode n1 = new DefaultMutableTreeNode(sb.toString());
                method_member_node.add(n1);
                System.out.println("          " + sb.toString());

                // get parameters
                sb = new StringBuilder();
                for (int i = 0; i < parameters.size(); ++i) {
                    String parameter = parameters.get(i);
                    if (parameter != "") {
                        sb.append(parameter);
                        if (i != parameters.size() - 1) {
                            sb.append(", ");
                        }
                    }
                }

                if (parameters.size() != 0) {
                    n1.add(new DefaultMutableTreeNode("Parameters: " + sb.toString()));
                    System.out.println("               Parameters: " + sb.toString());
                }

                sb = new StringBuilder();
                for (int i = 0; i < locals.size(); ++i) {
                    String local = locals.get(i);
                    if (local != "") {
                        sb.append(local);
                        if (i != locals.size() - 1) {
                            sb.append(", ");
                        }
                    }
                }

                if (locals.size() != 0) {
                    n1.add(new DefaultMutableTreeNode("Local vars: " + sb.toString()));
                    System.out.println("               Local vars: " + sb.toString());
                }

                //Method Calls
                for (List<String> methodsLists : classInfo.getAllMethodCalls()) {
                    if (methodsLists.size() > 1) {
                        if (methodsLists.get(0).equals(name)) {
                            for (int i = 1; i < methodsLists.size(); i++) {
                                n1.add(new DefaultMutableTreeNode("Calls method " + methodsLists.get(i)));
                                System.out.println("               Calls method " + methodsLists.get(i));
                            }
                        }
                    }
                }
            }

            DefaultMutableTreeNode aggregate_node = new DefaultMutableTreeNode("Aggregates");
            class_node.add(aggregate_node);
            System.out.println("     Aggregates:");
            Set<String> aggregates = classInfo.getAggregates();

            for (String aggregate : aggregates) {
                aggregate_node.add(new DefaultMutableTreeNode(aggregate));
                System.out.println("          " + aggregate);
            }

            if (aggregates.size() == 0) {
                aggregate_node.add(new DefaultMutableTreeNode("NONE"));
                System.out.println("          NONE");
            }

            DefaultMutableTreeNode associate_node = new DefaultMutableTreeNode("Associations");
            class_node.add(associate_node);
            System.out.println("     Associations:");
            List<String> associations = classInfo.getAssociations();

            if (!load) {
                // search formalParameters for a formal parameter that is a class, if found add the class as an association	
                for (String parameters : classInfo.getFormalParameters()) {

                    // -- updated --
                    for (String name : map.keySet()) {
                        String[] words = parameters.split(" ");
                        for (String word : words) {
                            if (name.equals(words)) {
                                classInfo.addAssociation(name);
                            }
                        }

                    }
                }

                List<String> localVariables = classInfo.getLocalVariables();
                // search localVariables for a local variable that is a class, if found add the class as an association
                // -- updated --
                for (String locals : localVariables) {

                    // -- updated --
                    for (String name : map.keySet()) {
                        String[] words = locals.split(" ");

                        for (String word : words) {
                            if (name.equals(word)) {
                                classInfo.addAssociation(name);
                            }
                        }

                    }
                }
            }

            for (String association : associations) {
                associate_node.add(new DefaultMutableTreeNode(association));
                System.out.println("          " + association);
            }

            if (associations.size() == 0) {
                associate_node.add(new DefaultMutableTreeNode("NONE"));
                System.out.println("          NONE");
            }

            // Store in external file
            if (!load) {
                storeData(prpo + "_" + className + ".out", classInfo);
            }
        }
    }

    private static Set<String> checkAnce(Set<String> set) {
        Set<String> q = new HashSet<>(set);
        while (!q.isEmpty()) {
            String ance = "";
            for (String a : q) {
                ance = a;
                q.remove(a);
                break;
            }
            if (map.get(ance) != null) {
                for (String a : map.get(ance).getAncestors()) {
                    set.add(a);
                }
            }
        }
        return set;
    }

    public static void main(String args[]) {
        JButton pre_source_btn = new JButton("pre source file");
        JButton post_source_btn = new JButton("post source file");
        JButton pre_output_btn = new JButton("pre output file");
        JButton post_output_btn = new JButton("post output file");
        JButton compare_btn = new JButton("Compare");

        pre_output_file.setHorizontalAlignment(SwingConstants.CENTER);
        pre_output_file.setFont(new Font("Serif", Font.PLAIN, 12));
        post_output_file.setHorizontalAlignment(SwingConstants.CENTER);
        post_output_file.setFont(new Font("Serif", Font.PLAIN, 12));

        GUI obj = new GUI();
        pre_source_btn.addActionListener(obj);
        post_source_btn.addActionListener(obj);
        pre_output_btn.addActionListener(obj);
        post_output_btn.addActionListener(obj);
        compare_btn.addActionListener(obj);

        panel_btn = new JPanel(new GridLayout(4, 2));
        panel_btn.add(pre_source_btn);
        panel_btn.add(post_source_btn);
        panel_btn.add(pre_output_btn);
        panel_btn.add(post_output_btn);
        panel_btn.add(pre_output_file);
        panel_btn.add(post_output_file);
        panel_btn.add(compare_btn);

        root = new DefaultMutableTreeNode("Classes");
        DefaultTreeModel dTree = new DefaultTreeModel(root);
        JTree tree = new JTree(dTree);
        scrollP = new JScrollPane(tree);
        scrollP.setBorder(BorderFactory.createEmptyBorder());
        scrollP.setPreferredSize(new Dimension(350, 400));

        frame = new JFrame("OOPIES");
        frame.setSize(400, 575);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(panel_btn);
        frame.add(scrollP);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String com = e.getActionCommand();

        if (com.equals("Compare")) {
            if(!(preFileName.equals("") || postFileName.equals(""))) {
                System.out.println(preFileName + postFileName + postWriteFileName);
                compare comparer = new compare(preFileName, postFileName, postWriteFileName);
                try {
                    comparer.start();
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            map = new HashMap<>();
            boolean isPre = true;
            JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            fc.setAcceptAllFileFilterUsed(false);

            if (com.equals("pre source file") || com.equals("post source file")) {
                if (com.equals("post source file")) {
                    isPre = false;
                }
                load = false;
                fc.setDialogTitle("Select a .java file");
                fc.setMultiSelectionEnabled(true);
                FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .java files", "java");
                fc.addChoosableFileFilter(restrict);

                if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    for (File file : fc.getSelectedFiles()) {
                        try {
                            JavaLexer lexer = new JavaLexer(new ANTLRFileStream(file.getAbsolutePath()));
                            CommonTokenStream tokens = new CommonTokenStream(lexer);
                            JavaParser parser = new JavaParser(tokens);
                            parser.compilationUnit();
                            ClassInfo classInfo = parser.getClassInfo();
                            map.put(classInfo.getName(), classInfo);
                            if (isPre) {
                                names_map.put("pre_" + classInfo.getName() + ".out", file.getAbsolutePath());
                            } else {
                                names_map.put("post_" + classInfo.getName() + ".out", file.getAbsolutePath());
                            }
                        } catch (FileNotFoundException nf) {
                            System.out.printf("ERROR: File named %s cannot be found\n", file);
                            break;
                        } catch (IOException | RecognitionException ex) {
                            System.out.println("error");
                        }
                    }
                    // Prepare Ancestors and Descendants
                    for (String className : map.keySet()) {
                        map.get(className).setAncestors(checkAnce(map.get(className).getAncestors()));
                        for (String anc : map.get(className).getAncestors()) {
                            if (map.get(anc) != null) {
                                map.get(anc).addDescendant(className);
                            }
                        }
                    }
                }
            } else {
                load = true;
                fc.setDialogTitle("Select a .out file");
                FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .out files", "out");
                fc.addChoosableFileFilter(restrict);
                fc.setMultiSelectionEnabled(false);

                if (com.equals("pre output file")) {
                    if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                        File file = fc.getSelectedFile();
                        pre_output_file.setText(file.getName());
                        preFileName = file.getName();
                        ClassInfo classInfo = loadData(file.getName());
                        map.put(classInfo.getName(), classInfo);
                    }
                } else {
                    if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                        File file = fc.getSelectedFile();
                        post_output_file.setText(file.getName());
                        postFileName = file.getName();
                        postWriteFileName = names_map.get(file.getName());
                        ClassInfo classInfo = loadData(file.getName());
                        map.put(classInfo.getName(), classInfo);
                    }
                }
            }
            frame.getContentPane().remove(scrollP);
            root = new DefaultMutableTreeNode("Classes");
            if (!load && isPre) {
                printData("pre");
            } else if (!load && !isPre) {
                printData("post");
            } else {
                printData("");
            }
            DefaultTreeModel dTree = new DefaultTreeModel(root);
            JTree tree = new JTree(dTree);
            scrollP = new JScrollPane(tree);
            scrollP.setBorder(BorderFactory.createEmptyBorder());
            scrollP.setPreferredSize(new Dimension(350, 300));
            frame.add(scrollP);
            frame.revalidate();
            frame.repaint();
        }
    }

}
