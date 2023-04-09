try (FileReader reader = new FileReader("names.txt")) {
    int character = reader.read();
    while (character != -1) {
        System.out.print((char) character);
        character = reader.read();
    }
} catch (IOException e) {
    e.printStackTrace();
}
