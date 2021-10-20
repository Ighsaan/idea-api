package io.nifa;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.io.FileInputStream;
import java.io.IOException;

@QuarkusMain
public class Startup {

    public static void main(String ... args) {
        System.out.println("Starting Idea Server");
//        FileInputStream serviceAccount =
//                new FileInputStream("C:/Users/broth/Documents/secret/fb.json");
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .build();
//
//        FirebaseApp.initializeApp(options);
//        UserRecord userRecord = FirebaseAuth.getInstance().getUser("aC3EkxWWS4M9eKCpzH28vA37poy1");
//        System.out.println(userRecord);
        Quarkus.run(Server.class, args);
    }

    public static class Server implements QuarkusApplication {
        @Override
        public int run(String... args) throws Exception {
            Quarkus.waitForExit();
            return 0;
        }
    }
}
