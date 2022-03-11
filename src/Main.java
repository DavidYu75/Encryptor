public class Main {
    public static void main(String[] args) {
        Encryptor encryptor = new Encryptor(3, 4);
        System.out.println(encryptor.encryptMessage("Don’t decrypt this message"));
    }
}
