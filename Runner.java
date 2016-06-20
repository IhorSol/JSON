package XML.HomeWork.Task1.task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * @author Ihor Solohub.
 */
public class Runner {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Programming_Java\\JavaPRO\\src\\XML\\JSONSample\\json.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                stringBuilder = stringBuilder.append(line);
            }
            String result = stringBuilder.toString();

            Gson gson = new GsonBuilder().create();
            PersonalInfo json = (PersonalInfo) gson.fromJson(result, PersonalInfo.class);

            System.out.println("Name: " + json.name);
            System.out.println("Surname: " + json.surname);
            System.out.println("Phones: " + json.phones);
            System.out.println("Sites: " + json.sites);
            System.out.println("Address: " + json.address);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
