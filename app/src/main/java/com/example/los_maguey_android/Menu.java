package com.example.los_maguey_android;
import java.io.*;
import java.util.*;

public class Menu
{
    static List<MenuItem> menu;
    BufferedReader reader;
    File file = new File("C:\\Users\\Dirty_Diaper-00-\\Documents\\Programming\\personal-projects\\los-maguey\\src\\com\\example\\mypackage\\MenuItems.text");
    public Menu()
    {
        menu = new ArrayList<>();
        try{
            reader = new BufferedReader(new FileReader(file));
            String line;

            while((line = reader.readLine()) != null) {
                String[] details = line.split(" ");
                MenuItem newItem = new MenuItem(details[0], details[1], Double.parseDouble(details[2]));
                menu.add(newItem);
            }
        } catch (FileNotFoundException e) {
            System.out.println(file.getPath() + " not found");
        } catch (IOException e) {
            System.out.println("IOException thrown");
        }
    }

    public void removeItem(String itemName)
    {
        for(int i = 0; i < menu.size(); i++)
        {
            if(menu.get(i).name.equals(itemName))
            {
                menu.remove(i);
            }
        }
    }

    public int itemIndex(String itemName)
    {
        for(int index = 0; index < menu.size(); index++)
        {
            if(menu.get(index).name.equals(itemName))
            {
                return index;
            }
        }

        return -1;
    }

    public void printMenu()
    {
        if(menu.isEmpty())
        {
            System.out.println("No menu items have yet been added\n");
        }

        for(int i = 0; i < menu.size(); i++)
        {
            System.out.println(menu.get(i).name);
        }
    }
}