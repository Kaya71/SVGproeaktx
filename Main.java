import x.SVGFile;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter filename: ");
        String filename = scanner.nextLine();

        SVGFile file = null;
        file.load();

        while (true) {
            System.out.println("\nEnter a command (type 'help' for a list of commands):");
            String command = scanner.nextLine();

            if (command.equals("help")) {
                System.out.println("Available commands:");
                System.out.println("- print");
                System.out.println("- create <shape> [<args>]");
                System.out.println("- erase <n>");
                System.out.println("- translate [<n>] <dx> <dy>");
                System.out.println("- within <option>");
                System.out.println("- open <filename>");
                System.out.println("- close");
                System.out.println("- save");
                System.out.println("- save as <filename>");
                System.out.println("- exit");
            } else if (command.equals("print")) {
                ArrayList<Shape> shapes;
            
            } else if (command.startsWith("create")) {
                String[] parts = command.split("\\s+");
                if (parts.length < 2) {
                    System.out.println("Invalid command. Usage: create <shape> [<args>]");
                    continue;
                }
                String shapeType = parts[1];
                Shape shape = null;
                if (shapeType.equals("circle")) {
                    if (parts.length < 4) {
                        System.out.println("Invalid command. Usage: create circle <cx> <cy> <r>");
                        continue;
                    }
                    int cx = Integer.parseInt(parts[2]);
                    int cy = Integer.parseInt(parts[3]);
                    int r = Integer.parseInt(parts[4]);
                    shape = new Circle(cx, cy, r);
                } else if (shapeType.equals("rectangle")) {
                    if (parts.length < 5) {
                        System.out.println("Invalid command. Usage: create rectangle <x> <y> <width> <height>");
                        continue;
                    }
                    int x = Integer.parseInt(parts[2]);
                    int y = Integer.parseInt(parts[3]);
                    int width = Integer.parseInt(parts[4]);
                    int height = Integer.parseInt(parts[5]);
                    shape = new Rectangle(x, y, width, height);
                } else if (shapeType.equals("line")) {
                    if (parts.length < 5) {
                        System.out.println("Invalid command. Usage: create line <x1> <y1> <x2> <y2>");
                        continue;
                    }
                    int x1 = Integer.parseInt(parts[2]);
                    int y1 = Integer.parseInt(parts[3]);
                    int x2 = Integer.parseInt(parts[4]);
                    int y2 = Integer.parseInt(parts[5]);

                }
            }
        }
                }
            }
        
                    
                    