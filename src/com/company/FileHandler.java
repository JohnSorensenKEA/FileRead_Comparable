package com.company;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileHandler
{

    public int numberOfLines(String fileLocation)
    {
        int count = 0;
        try
        {
            File file = new File(fileLocation);
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNextLine())
            {
                fileReader.nextLine();
                count++;
            }
        }
        catch(FileNotFoundException e)
        {
            return -1;
        }
        return count;
    }
}
