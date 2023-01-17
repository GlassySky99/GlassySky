package lr8.example1;

import java.io.*;

public class example1_7
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = null;
        BufferedWriter out = null;

        try
        {
            br = new BufferedReader(
                    new FileReader("C://Users//GlassySky//Desktop//lr8//ex1//ex7//MyFile1.txt"), 1024);
            out = new BufferedWriter(
                    new FileWriter("C://Users//GlassySky//Desktop//lr8//ex1//ex7//MyFile2.txt"));

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null)
            {
                lineCount++;
                System.out.println(lineCount + ":" + s);
                out.write(s);
                out.newLine();
            }

        }
        catch (IOException e)
        {
            System.out.println("Ошибка !!!!!!!!");
        }
        finally
        {
            br.close();
            out.flush();
            out.close();
        }
    }
}