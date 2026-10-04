package builder;

import java.io.IOException;

public class Client {
     static void main() throws Exception {
         Student s = Student.getBuilder()
                 .setAddress("House Number 1041")
                 .setPsp(87.0)
                 .setName("naman")
                 .setGender("Male").setAge(23)
                 .build();

         Student s2 = Student.getBuilder()
                 .setAge(41)
                 .setPsp(81.0)
                 .build();
    }
}
