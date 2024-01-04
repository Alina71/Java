package Class13;

public class Task7 {
    /*
    Create a method createEmail(). Based on values
    of users firstName, lastName and email type,
    your method should return complete email Address. Example:
    createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String createEmail(String firstName,String lastName,String domain){
        String credentials=firstName+lastName+domain;
        System.out.println(credentials);
        return credentials;
    }
}
