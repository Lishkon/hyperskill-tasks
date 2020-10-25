public class Main {

    public static void main(String[] args) {
        Secret[] enumArrayed = Secret.values();
        int count = 0;
        for (Secret secret : enumArrayed) {
            if (secret.name().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

/* At least two constants start with STAR*/
enum Secret {
    STAR, CRASH, START, TEST, STARRIOR
}

