package lr8.example1;

import java.io.*;

public class example1_6
{
    public static void main(String[] args) throws IOException
    {
        Reader in = null;
        Writer out = null;
        try
        {
            in = new FileReader("C:\\Users\\GlassySky\\Desktop\\lr8\\ex6\\MyFile1.txt");
            out = new FileWriter("C:\\Users\\GlassySky\\Desktop\\lr8\\ex6\\MyFile2.txt", true);

            int oneByte;
            while ((oneByte = in.read()) != -1)
            {

                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
        }
        catch (IOException e)
        {
            System.out.println("Ошибка!!!! ");
        } finally {
            in.close();
            out.close();
        }
    }
}