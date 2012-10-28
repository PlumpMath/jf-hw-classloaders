package org.zeroturnaround.jf2012.hw7;

import org.zeroturnaround.jf2012.hw7.local.LocalPluginManager;
import org.zeroturnaround.jf2012.hw7.remote.RemotePluginManager;

/**
 * Iterates through all local plugins and prints them out. First
 * iterates through local plugins and then through remote plugins.
 */
public class Main {
  
  public static void main(String[] args) {
    System.out.println("Find all plugins from local plugin folder");
    System.out.println();

    String[] allPluginNames = LocalPluginManager.findAllPlugins();
    for (int i = 0; i < allPluginNames.length; i++) {
      System.out.print(allPluginNames[i]+"\t- ");
      Plugin plugin = LocalPluginManager.getPluginInstance(allPluginNames[i]);
      System.out.println(plugin);
    }
    
    System.out.println("Find all remote plugins from the interwebs");
    System.out.println();
    
    allPluginNames = RemotePluginManager.findAllPlugins();
    for (int i = 0; i < allPluginNames.length; i++) {
      System.out.print(allPluginNames[i]+"\t- ");
      Plugin plugin = RemotePluginManager.getPluginInstance(allPluginNames[i]);
      System.out.println(plugin);
    }
  }
}
