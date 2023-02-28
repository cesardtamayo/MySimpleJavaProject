/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysimplejavaproject;

import java.security.Security;
import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.*;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.bouncycastle.jce.provider.BouncyCastleProvider;


/**
 *
 * @author ctamayo
 */
public class MySimpleJavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TEST EXECUTION:        
        Security.addProvider(new BouncyCastleProvider());
        TestNG testSuite = new TestNG();
        TestListenerAdapter TLA = new TestListenerAdapter();
        testSuite.addListener(TLA);
        List<String> suitefiles = new ArrayList<String>();
        suitefiles.add("testng.xml");
        testSuite.setTestSuites(suitefiles);
        testSuite.setVerbose(1);
        testSuite.run();
    }
    
}
