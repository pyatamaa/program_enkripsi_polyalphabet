public class polialphabet {
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan plaintext: ");
        String plainteks = input.nextLine().toLowerCase();
        System.out.print("Masukkan kunci: ");
        String kunci = input.nextLine().toLowerCase();

        String abjad = "abcdefghijklmnopqrstuvwxyz";
        String hasil = kunci + abjad;
        String key = hasil.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        String cleanedPlaintext = plainteks.replace(" ", "");
        String hasil_enkripsi = polyalphabetCipherEncrypt(cleanedPlaintext, key);

        System.out.println("Abjad: " + abjad);
        System.out.println("Plainteks: " + plainteks);
        System.out.println("Kunci: " + kunci);
        System.out.println("Hasil Enkripsi: " + hasil_enkripsi);
    }

    public static String polyalphabetCipherEncrypt(String plaintext, String key) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder encryptedText = new StringBuilder();

        for (char c : plaintext.toCharArray()) {
            if (alphabet.contains(String.valueOf(c))) {
                int charIndex = alphabet.indexOf(c);
                char keyChar = key.charAt(charIndex);
                encryptedText.append(keyChar);
            } else {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }
}

//woi
