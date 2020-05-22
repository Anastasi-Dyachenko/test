package lesson12;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class MainJackson {
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();


        private static void writeUser()  throws IOException{
        User user = User.builder()
                .name("test")
                .surname("testovich")
                .age(30)
                .salary(3007)
                .build();

        }


    }

