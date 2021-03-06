package co.com.choucair.winappdriver.flightgui.utils;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.logging.Logger;
/**
 * <h1>Open WinAppDriver</h1>
 * <p>Esta clase fue diseñada para abrir un ejecutable (WinAppDriver.exe)</p>
 * @version: 1.0
 * @author: bquevedof (Brandon Quevedo Funez)
 * @version: 1.0
 * @since: 10/12/2019
 */


public class WinAppDriver {
    private static final String KILL = "taskkill /F /IM ";
    private static final String TASK_LIST = "tasklist";
    private static final String EXECUTABLE = "WinAppDriver";

    private WinAppDriver() {
    }

    public static void open() {
        if (isProcessRunning(EXECUTABLE)) {
            killProcess(EXECUTABLE);
        }

        try {
            Properties properties = new Properties();
            File fileDir = new File(System.getProperty("user.dir"));
            System.out.println(fileDir);
            String filePath = fileDir.getAbsolutePath();
            properties.load(new FileReader(filePath + "\\winappdriver.properties"));
            System.out.println(filePath + "\\winappdriver.properties");
            String path = properties.getProperty("win.rutaDriver");
            System.out.println(path);
            Desktop desktop;
            desktop = Desktop.getDesktop();
            File pathWinAppDriver = new File(path);
            System.out.println(pathWinAppDriver);
            desktop.open(pathWinAppDriver);
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }

    }

    public static void killProcess(String serviceName) {
        try {
            Runtime.getRuntime().exec(KILL + serviceName);
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }

    }

    public static boolean isProcessRunning(String serviceName) {

        try {
            Process process = Runtime.getRuntime().exec(TASK_LIST);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(serviceName)) {
                    return true;
                }
            }
        } catch (Exception e) {
            Logger.getLogger(e.getMessage());
        }


        return false;
    }

}
