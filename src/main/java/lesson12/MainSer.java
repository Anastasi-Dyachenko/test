package lesson12;

import java.io.*;

public class MainSer  {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = User.builder()
                .age(20)
                .name("Aid")

                .build();
        FileOutputStream fileOutputStream = new FileOutputStream("user.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(user);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("user.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object object = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        User userFromFile = (User) object;
        System.out.println(userFromFile);



    }
}
