import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                // display our weather app gui
                new WeatherWizGUI().setVisible(true);

//                System.out.println(WeatherApp.getLocationData("Chennai"));

//                System.out.println(WeatherApp.getCurrentTime());

            }
        });
    }
}
