//package lol.zeroday.whitelight.discordrpc;
//
//import net.arikia.dev.drpc.DiscordEventHandlers;
//import net.arikia.dev.drpc.DiscordRPC;
//import net.arikia.dev.drpc.DiscordRichPresence;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.Scanner;
//
//public class DRPC {
//    private static boolean ready = false;
//    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//
//        JFrame frame = new JFrame("Test");
//        JLabel text = new JLabel("Now goto Discord and set your active game to: '" + frame.getTitle() + "'");
//        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
//        int width = gd.getDisplayMode().getWidth();
//        int height = gd.getDisplayMode().getHeight();
//
//        frame.getContentPane().setLayout(new FlowLayout());
//        frame.getContentPane().setBackground(new Color(114, 137, 218));
//        frame.getContentPane().add(text, SwingConstants.CENTER);
//
//        frame.setResizable(true);
//        frame.setSize(width/4, height/4);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        frame.setVisible(true);
//
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            System.out.println("Closing Discord hook.");
//            DiscordRPC.discordShutdown();
//        }));
//
//        initDiscord();
//
//        int score = 0;
//        System.out.println("Running callbacks...");
//
//        while (true) {
//            DiscordRPC.discordRunCallbacks();
//
//            if(!ready)
//                continue;
//
//            System.out.print("> ");
//            Scanner in = new Scanner(System.in);
//            String input = in.nextLine();
//
//            if (!input.equalsIgnoreCase("shutdown")) {
//                if (input.equalsIgnoreCase("test")) {
//                    score++;
//                    DiscordRichPresence.Builder presence = new DiscordRichPresence.Builder("Developing White Light Client | Stay Tuned for more updates...");
//                    presence.setDetails("Made By: PHOENIX#2000 & HellSec#6666");
//                    DiscordRPC.discordUpdatePresence(presence.build());
//                } else {
//                    System.out.println("Unknown Command: " +
//                            "\n\nAvailable Commands:" +
//                            "\ntest - Test.\nshutdown - End this test peacefully.");
//                }
//            } else {
//                frame.dispose();
//                System.exit(0);
//            }
//        }
//    }
//
//    private static void initDiscord() {
//        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().setReadyEventHandler((user) -> {
//            System.out.println("Welcome " + user.username + "#" + user.discriminator + ".");
//            DiscordRichPresence.Builder presence = new DiscordRichPresence.Builder("Developing White Light Client | Stay Tuned for more updates...");
//            presence.setDetails("Made By: PHOENIX#2000 & HellSec#6666");
//            presence.setBigImage("large", "Our Discord: https://discord.gg/kvURTWwKCV");
//            presence.setSmallImage("small", "Join our Discord for development updates :)");
//            DiscordRPC.discordUpdatePresence(presence.build());
//        }).build();
//        DiscordRPC.discordInitialize("884756279439007774", handlers, false);
//        DiscordRPC.discordRegister("884756279439007774", "");
//    }
//}
